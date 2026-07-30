package com.tantanapp.httpdns.net;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.text.TextUtils;
import p153l.jj5;
import p153l.vml;

/* JADX INFO: loaded from: classes11.dex */
public class NetworkStateReceiver extends BroadcastReceiver {
    public static NetworkInfo getActiveNetwork(Context context) {
        ConnectivityManager connectivityManager;
        if (context == null || (connectivityManager = (ConnectivityManager) context.getSystemService("connectivity")) == null) {
            return null;
        }
        return connectivityManager.getActiveNetworkInfo();
    }

    public static void register(Context context) {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        jj5.m145018l(context, new NetworkStateReceiver(), intentFilter);
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        NetworkInfo activeNetwork;
        if (!TextUtils.equals(intent.getAction(), "android.net.conn.CONNECTIVITY_CHANGE") || (activeNetwork = getActiveNetwork(context)) == null) {
            return;
        }
        vml.m201753c().m201759g(activeNetwork);
    }
}
