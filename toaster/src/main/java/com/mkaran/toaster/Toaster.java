package com.mkaran.toaster;

import android.content.Context;
import android.widget.Toast;

public class Toaster {
    public static void Toaster(Context context,String msg)
    {
        Toast.makeText(context, msg, Toast.LENGTH_SHORT).show();
    }
}
