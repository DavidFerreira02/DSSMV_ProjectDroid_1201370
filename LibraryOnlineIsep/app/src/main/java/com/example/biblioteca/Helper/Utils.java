package com.example.biblioteca.Helper;

import android.content.Context;
import android.content.SharedPreferences;

public class Utils {
    private static final String WS_NAME = "v1/";
    public static String isbn = "";
    public static String userId = "";

    public static final String BIBLIOTECAID = "1bbb3c13-e83f-4ea8-886e-5dd7c5feb187";

    public static final String MYSHPREFS="MySharedPreferences";

    public static final String IP1="IP1";
    public static final String IP2="IP2";
    public static final String IP3="IP3";
    public static final String IP4="IP4";


    public static String getWSAddress(Context context){
        SharedPreferences settings = context.getSharedPreferences(MYSHPREFS, Context.MODE_PRIVATE);
        int ip1 = settings.getInt(IP1, 193);
        int ip2 = settings.getInt(IP2, 136);
        int ip3 = settings.getInt(IP3, 62);
        int ip4 = settings.getInt(IP4, 24);

        return "http://"+ip1+"."+ip2+"."+ip3+"."+ip4+"/"+WS_NAME;
    }
    public static void setWSAddress(Context context, int ip1,int ip2,int ip3,int ip4 ){
        SharedPreferences settings = context.getSharedPreferences(MYSHPREFS,Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = settings.edit();
        editor.putInt(IP1, ip1);
        editor.putInt(IP2, ip2);
        editor.putInt(IP3, ip3);
        editor.putInt(IP4, ip4);
        editor.commit();
    }

}