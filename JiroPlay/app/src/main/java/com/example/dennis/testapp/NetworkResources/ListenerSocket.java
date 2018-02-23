package com.example.dennis.testapp.NetworkResources;


import android.os.AsyncTask;
import android.util.Log;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.StandardSocketOptions;
import java.nio.charset.Charset;
import java.util.Arrays;

public class ListenerSocket extends AsyncTask<String, byte[], String>{

    DatagramSocket socket;

    public ListenerSocket(int port){
        try {

            this.socket = new DatagramSocket(null);
            this.socket.setReuseAddress(true);
            this.socket.bind(new InetSocketAddress(port));


        } catch (Exception e) {
            this.socket = null;
            e.printStackTrace();
        }
    }

    public ListenerSocket(int port, String ip){
        try {

            this.socket = new DatagramSocket(null);
            this.socket.setReuseAddress(true);
            this.socket.bind(new InetSocketAddress(InetAddress.getByName(ip), port));


        } catch (Exception e) {
            this.socket = null;
            e.printStackTrace();
        }
    }

    @Override
    protected String doInBackground(String... strings) {

        byte[] buffer;
        DatagramPacket packet;

        try
        {
            while (true)
            {
                buffer = new byte[512];
                packet = new DatagramPacket(buffer, buffer.length);

                try {
                    socket.receive(packet);
                }catch (Exception e){
                }
                if(socket.isClosed()){
                    break;
                }

                byte[] msg = packet.getData();

                /*int i = msg.length - 1;
                while (i >= 0 && msg[i] == 0)
                    --i;

                byte[] newMsg = Arrays.copyOf(msg, i + 1);*/
                publishProgress(msg);
            }
            return null;
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }


    @Override
    protected void onProgressUpdate(byte[]... values) {
        onMessage(values[0]);
    }

    protected void onMessage(byte[] message){

    }

    public void close(){
        this.socket.close();
        this.socket = null;
        this.cancel(true);
    }



}
