package com.example.dennis.testapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;


public class ConsoleListAdapter extends BaseAdapter {


    Context context;
    ArrayList<String[]> data;
    private static LayoutInflater inflater = null;

    public ConsoleListAdapter(Context context, ArrayList<String[]> data) {
        this.context = context;
        this.data = data;
        inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        // TODO Auto-generated method stub
        return data.size();
    }

    @Override
    public Object getItem(int position) {
        // TODO Auto-generated method stub
        return data.get(position);
    }

    @Override
    public long getItemId(int position) {
        // TODO Auto-generated method stub
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // TODO Auto-generated method stub
        View vi = convertView;
        if (vi == null)
            vi = inflater.inflate(R.layout.console_row_item, null);

        TextView gameName = (TextView) vi.findViewById(R.id.game_name);
        TextView pcName = (TextView) vi.findViewById(R.id.pc_name);
        TextView playerCount = (TextView) vi.findViewById(R.id.player_count);

        String gameNameStr = data.get(position)[4];
        String pcNameStr = data.get(position)[2];
        String playerCountStr = data.get(position)[3];

        if (gameNameStr.equals("#no_game"))
        {
            gameName.setText("No game");
            playerCount.setText("Offline");
        }
        else if (gameNameStr.equals("#selecting"))
        {
            gameName.setText("Selecting game...");

            if (playerCountStr == "1")
                playerCount.setText(playerCountStr + " Player Waiting");
            else
                playerCount.setText(playerCountStr + " Players Waiting");
        }
        else
        {
            gameName.setText(gameNameStr);

            if (playerCountStr == "1")
                playerCount.setText(playerCountStr + " Player");
            else
                playerCount.setText(playerCountStr + " Players");
        }

        pcName.setText(pcNameStr);

        return vi;
    }

}
