package com.immomo.medialog;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import androidx.core.app.NotificationCompat;
import com.alibaba.sdk.android.oss.signer.SignParameters;
import com.clevertap.android.sdk.Constants;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.momo.mcamera.mask.BigEyeFilter;
import java.lang.ref.WeakReference;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Enumeration;
import p149l.hjx;
import p149l.ii5;
import p149l.xxx;

/* JADX INFO: loaded from: classes7.dex */
public final class BatteryMetrics extends BroadcastReceiver {
    private static final String TAG = "BatteryMetrics";
    private static volatile BatteryMetrics instance;
    private WeakReference<Context> mContextRef;
    private int mPhoneSignalLevel = 0;
    private int batteryRemin = 0;
    private double thermalOfBattery = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
    private int batteryStatus = 0;

    private BatteryMetrics() {
    }

    private void getEXTRA_HEALTH(int i) {
    }

    private void getEXTRA_PLUGGED(int i) {
    }

    private void getEXTRA_STATUS(int i) {
        if (i == 2) {
            this.batteryStatus = 1;
            return;
        }
        if (i == 3) {
            this.batteryStatus = 0;
        } else if (i == 4) {
            this.batteryStatus = 0;
        } else {
            if (i != 5) {
                return;
            }
            this.batteryStatus = 2;
        }
    }

    private IntentFilter getFilter() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.BATTERY_CHANGED");
        intentFilter.addAction("android.intent.action.BATTERY_LOW");
        intentFilter.addAction("android.intent.action.BATTERY_OKAY");
        intentFilter.addAction("android.net.wifi.WIFI_STATE_CHANGED");
        intentFilter.addAction("android.net.wifi.RSSI_CHANGED");
        return intentFilter;
    }

    public static BatteryMetrics getInstance() {
        if (instance == null) {
            synchronized (BatteryMetrics.class) {
                try {
                    if (instance == null) {
                        instance = new BatteryMetrics();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return instance;
    }

    private void getWifiInfo(Context context) {
        WifiManager wifiManager = (WifiManager) context.getApplicationContext().getSystemService("wifi");
        WifiInfo connectionInfo = wifiManager != null ? wifiManager.getConnectionInfo() : null;
        if (connectionInfo == null || connectionInfo.getBSSID() == null) {
            xxx.m211572F().m211629p0(this.mPhoneSignalLevel);
            xxx.m211572F().m211633r0("other");
            hjx.m131418a("NetUtils", "wifi down.");
            return;
        }
        String ssid = connectionInfo.getSSID();
        int rssi = connectionInfo.getRssi();
        int iCalculateSignalLevel = WifiManager.calculateSignalLevel(rssi, 5);
        int linkSpeed = connectionInfo.getLinkSpeed();
        xxx.m211572F().m211629p0(iCalculateSignalLevel);
        xxx.m211572F().m211633r0("wifi");
        hjx.m131418a("NetUtils", "ssid " + ssid + " level " + iCalculateSignalLevel + ",speed " + linkSpeed + ",rssi " + rssi);
    }

    private void setThermalOfBattery(int i) {
        this.thermalOfBattery = ((double) i) / 10.0d;
    }

    public String getBatteryInfo() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(this.batteryRemin);
        sb.append(Constants.SEPARATOR_COMMA);
        int i = this.batteryStatus;
        if (i == 0) {
            str = "uncharged";
        } else {
            str = i == 1 ? "charging" : "full";
        }
        sb.append(str);
        return sb.toString();
    }

    public int getBatteryRemin() {
        return this.batteryRemin;
    }

    public String getBatteryStatus() {
        int i = this.batteryStatus;
        if (i == 0) {
            return "uncharged";
        }
        return i == 1 ? "charging" : "full";
    }

    public String getIpAddr() {
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            while (networkInterfaces.hasMoreElements()) {
                Enumeration<InetAddress> inetAddresses = networkInterfaces.nextElement().getInetAddresses();
                while (inetAddresses.hasMoreElements()) {
                    InetAddress inetAddressNextElement = inetAddresses.nextElement();
                    if (!inetAddressNextElement.isLoopbackAddress() && (inetAddressNextElement instanceof Inet4Address)) {
                        return inetAddressNextElement.getHostAddress();
                    }
                }
            }
            return "";
        } catch (NullPointerException e) {
            e.printStackTrace();
            return "";
        } catch (SocketException e2) {
            e2.printStackTrace();
            return "";
        }
    }

    public int getThermalOfBattery() {
        return (int) this.thermalOfBattery;
    }

    public synchronized void init(Context context) {
        hjx.m131421d(TAG, " context " + context + " | " + this.mContextRef);
        if (this.mContextRef == null) {
            WeakReference<Context> weakReference = new WeakReference<>(context.getApplicationContext());
            this.mContextRef = weakReference;
            if (weakReference.get() != null) {
                ii5.m136342l(this.mContextRef.get(), this, getFilter());
            }
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (intent != null && ("android.net.wifi.WIFI_STATE_CHANGED".equalsIgnoreCase(intent.getAction()) || "android.net.wifi.RSSI_CHANGED".equalsIgnoreCase(intent.getAction()))) {
            getWifiInfo(context);
            return;
        }
        StringBuilder sb = new StringBuilder();
        if (intent != null && "android.intent.action.BATTERY_CHANGED".equalsIgnoreCase(intent.getAction())) {
            this.batteryRemin = intent.getIntExtra(FirebaseAnalytics.Param.LEVEL, -1);
            sb.append("当前电量：" + this.batteryRemin + SignParameters.NEW_LINE);
            sb.append("最大电量：" + intent.getIntExtra(BigEyeFilter.UNIFORM_SCALE, -1) + SignParameters.NEW_LINE);
            int intExtra = intent.getIntExtra("voltage", -1);
            sb.append("当前电压：" + intExtra + SignParameters.NEW_LINE);
            getEXTRA_HEALTH(intent.getIntExtra(PlaceTypes.HEALTH, -1));
            getEXTRA_STATUS(intent.getIntExtra(NotificationCompat.CATEGORY_STATUS, -1));
            getEXTRA_PLUGGED(intent.getIntExtra("plugged", -1));
            String stringExtra = intent.getStringExtra("technology");
            int intExtra2 = intent.getIntExtra("temperature", -1);
            setThermalOfBattery(intExtra2);
            StringBuilder sb2 = new StringBuilder("电压：");
            sb2.append(intExtra);
            sb2.append(" 电池：");
            sb2.append(stringExtra);
            sb2.append(" 温度：");
            sb2.append(intExtra2 / 10.0f);
            sb2.append(SignParameters.NEW_LINE);
            sb.append(sb2.toString());
        } else if (intent != null && "android.intent.action.BATTERY_LOW".equalsIgnoreCase(intent.getAction())) {
            sb.append("\t\t电量低\n");
        } else if (intent != null && "android.intent.action.BATTERY_OKAY".equalsIgnoreCase(intent.getAction())) {
            sb.append("\t\t电量正常\n");
        }
        hjx.m131418a(TAG, "get update: ".concat(sb.toString()));
    }

    public synchronized void uninit() {
        hjx.m131421d(TAG, "context " + this.mContextRef);
        try {
            try {
                WeakReference<Context> weakReference = this.mContextRef;
                if (weakReference != null) {
                    if (weakReference.get() != null) {
                        this.mContextRef.get().unregisterReceiver(this);
                    }
                    this.mContextRef.clear();
                }
            } catch (IllegalArgumentException e) {
                if (!e.getMessage().contains("Receiver not registered")) {
                    throw e;
                }
            }
            this.mContextRef = null;
        } catch (Throwable th) {
            this.mContextRef = null;
            throw th;
        }
    }
}
