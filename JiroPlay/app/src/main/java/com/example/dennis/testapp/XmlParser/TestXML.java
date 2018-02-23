package com.example.dennis.testapp.XmlParser;

/**
 * Created by Dennis on 09/02/2018.
 */

public class TestXML {

    public static final String PLAYBALL = "<controller id=\"game\">    <row span=\"1\">        <text size=\"12\" weight=\"3\">Play Ball</text>    </row>    <row>        <col>            <row>                <row span=\"5\">                    <col button_id=\"upbut\" padding=\"4\" bgcolor=\"#BBBBBB\">                        <img src=\"upbut.png\"></img>                    </col>                    <col button_id=\"downbut\" padding=\"4\" bgcolor=\"#343434\">                        <img src=\"downbut.png\"></img>                    </col>                </row>                <row></row>            </row>            <row>                <img src=\"circle.png\"></img>            </row>            <row>                <img src=\"triangle.png\"></img>            </row>        </col>        <col>            <img src=\"temp1.png\" binding=\"temp_img\"></img>        </col>        <col>            <row>                <row span=\"5\">                    <col button_id=\"upbut\" padding=\"4\" bgcolor=\"#BBBBBB\">                        <img src=\"upbut.png\"></img>                    </col>                    <col button_id=\"downbut\" padding=\"4\" bgcolor=\"#343434\">                        <img src=\"downbut.png\"></img>                    </col>                </row>                <row></row>            </row>            <row>                <img src=\"circle.png\"></img>            </row>            <row>                <img src=\"triangle.png\"></img>            </row>        </col>    </row></controller>";

    public static final String TEST = "<controller id = \"test\">  <row></row> <row span=\"4\"><col></col><col></col></row></controller>  ";

    public static final String TEST2 = "<controller id=\"player1\"><row bordersize=\"8\" bordercolor=\"#858585\" bgcolor=\"#cecece\"><text color=\"#404040\" size=\"24\" weight=\"condensed\">Trying to center red and green circle within grey rectangles</text></row><row span=\"4\"><col span=\"2\" padding=\"20\" button_id=\"main_but\"><img scale=\"1\" src=\"http://www.clker.com/cliparts/2/9/b/8/1194984775760075334button-green_benji_park_01.svg.hi.png\" ></img></col><col padding=\"50\" span=\"3\"><row bgcolor=\"#000F80\"></row><row bgcolor=\"#5569FF\"></row><row bgcolor=\"#000F80\"></row></col><col padding=\"20\" button_id=\"main_but\" span=\"2\"><img src=\"http://www.clker.com/cliparts/9/1/5/2/119498475589498995button-red_benji_park_01.svg.hi.png\" scale=\"0.6\" ></img></col></row></controller>  ";

    public static final String TEST3 = "<controller id=\"gay\"><col span=\"4\"></col><col span=\"2\" bgcolor=\"#edfedf\"><row><text>BDFGDFGFDG</text>      </row>     <row span=\"1\" padding=\"20\" bordersize=\"5\" bordercolor=\"#000000\" button_id=\"morelikegay\">        <text> fdsfdsfsdf </text>    </row>  </col></controller>";

    public static final String TEST4 = "<controller id=\"gay\"><row bgcolor=\"#333333\" clickid=\"greg\"><img scale=\"0.5\" src=\"https://images-na.ssl-images-amazon.com/images/M/MV5BMjA0ODc0NTE2NF5BMl5BanBnXkFtZTYwNjYyMjQ2._V1_UX214_CR0,0,214,317_AL_.jpg\"></img></row><row></row></controller>";

    public static final String TEST5 = "<controller>  <col bordersize=\"3\" bordercolor=\"#cccccc\" span=\"2\">      <row bordersize=\"3\" bordercolor=\"#cccccc\" span=\"3\" >          <img src=\"http://www.iconhot.com/icon/png/ose-png/256/arrow-up-1.png\" scale=\"0.8\"></img>    </row>    <row bgcolor=\"#CED3F4\" bordersize=\"3\" bordercolor=\"#cccccc\" >    <text size=\"28\" weight=\"regular\">Up</text>        </row>  </col>  <col bordersize=\"3\" bordercolor=\"#cccccc\"  span=\"3\">      <row span=\"3\">          <img src=\"http://pngimg.com/uploads/manchester_united/manchester_united_PNG15.png\" scale=\"0.8\"></img>    </row>    <row span=\"2\"><button text=\"Die Yourself\"></button></row>    </col>  <col bordersize=\"3\" bordercolor=\"#cccccc\"  span=\"2\">    <row bordersize=\"3\" bordercolor=\"#cccccc\"  span=\"3\">          <img src=\"http://www.iconhot.com/icon/png/ose-png/256/arrow-down-1.png\" scale=\"0.8\"></img>    </row>    <row bordersize=\"3\" bgcolor=\"#CED3F4\" bordercolor=\"#cccccc\" >    <text size=\"28\" weight=\"regular\">Down</text>        </row>    </col></controller>";

    public static final String TEST6 = "<controller id=\"atesting\"> <row> </row> <row bordersize=\"4\" bordercolor=\"#cccccc\" bgcolor=\"#222004\"> </row> <row span=\"1\" padding=\"10\"> <text> Hello, World! </text> </row> <row span=\"2\" padding=\"0 20 20 20\"> <col span=\"2\"> <img scale=\"0.5\" src=\"https://www.w3schools.com/w3css/img_lights.jpg\"></img> </col> <col span=\"3\"> <row clickid=\"hi\"> Tap me! </row> <row clickid=\"anotherbutton\"> The image on the left is a button! The images on the right aren't. </row> </col> <col span=\"2\"> <row> <img src=\"https://beebom-redkapmedia.netdna-ssl.com/wp-content/uploads/2016/01/Reverse-Image-Search-Engines-Apps-And-Its-Uses-2016.jpg\"></img> </row> <row span=\"1\" bordersize=\"3\"> <text size=\"24\" weight=\"bold\" color=\"#efd048\">Beautiful text</text> </row> <row span=\"3\"> <img src=\"https://beebom-redkapmedia.netdna-ssl.com/wp-content/uploads/2016/01/Reverse-Image-Search-Engines-Apps-And-Its-Uses-2016.jpg\"></img> </row> </col> </row> </controller>";

}
