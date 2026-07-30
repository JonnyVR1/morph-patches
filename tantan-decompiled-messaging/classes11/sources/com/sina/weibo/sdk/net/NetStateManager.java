package com.sina.weibo.sdk.net;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.util.Pair;
import com.sina.weibo.sdk.utils.LogUtil;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class NetStateManager {
    public static NetState CUR_NETSTATE = NetState.Mobile;
    private static Context mContext;

    public enum NetState {
        Mobile,
        WIFI,
        NOWAY
    }

    public class NetStateReceive extends BroadcastReceiver {
        public NetStateReceive() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            Context unused = NetStateManager.mContext = context;
            if ("android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
                WifiManager wifiManager = (WifiManager) context.getSystemService("wifi");
                WifiInfo connectionInfo = wifiManager.getConnectionInfo();
                if (!wifiManager.isWifiEnabled() || -1 == connectionInfo.getNetworkId()) {
                    NetStateManager.CUR_NETSTATE = NetState.Mobile;
                }
            }
        }
    }

    public static Pair<String, Integer> getAPN() {
        Uri uri = Uri.parse("content://telephony/carriers/preferapn");
        Context context = mContext;
        Pair<String, Integer> pair = null;
        Cursor cursorQuery = context != null ? context.getContentResolver().query(uri, null, null, null, null) : null;
        if (cursorQuery != null && cursorQuery.moveToFirst()) {
            String string = cursorQuery.getString(cursorQuery.getColumnIndex("proxy"));
            if (string != null && string.trim().length() > 0) {
                pair = new Pair<>(string, 80);
            }
            cursorQuery.close();
        }
        return pair;
    }

    public static boolean isNetworkConnected(Context context) {
        NetworkInfo activeNetworkInfo;
        if (context == null) {
            LogUtil.m10830e("Weibosdk", "unexpected null context in isNetworkConnected");
            return false;
        }
        if (context.getPackageManager().checkPermission("android.permission.ACCESS_NETWORK_STATE", context.getPackageName()) != 0) {
            return false;
        }
        try {
            activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        } catch (NullPointerException unused) {
            activeNetworkInfo = null;
        }
        return activeNetworkInfo != null && activeNetworkInfo.isAvailable();
    }
}
