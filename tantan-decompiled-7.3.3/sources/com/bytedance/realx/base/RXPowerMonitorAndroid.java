package com.bytedance.realx.base;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.BatteryManager;
import android.os.Build;
import android.os.PowerManager;
import android.provider.Settings;
import androidx.core.app.NotificationCompat;
import com.cosmos.photon.push.thirdparty.ThirdPushManager;
import com.google.firebase.analytics.FirebaseAnalytics;
import p153l.jj5;

/* JADX INFO: loaded from: classes.dex */
public class RXPowerMonitorAndroid {
    private static String TAG = "RXPowerMonitorAndroid";
    private static Intent batteryStatus;
    private static IntentFilter ifilter;
    private static PowerManager powerManager;
    private static Context context = ContextUtils.getApplicationContext();
    private static float batteryVolt = -1.0f;
    private static BroadcastReceiver mBroadcastReceiver = new BroadcastReceiver() { // from class: com.bytedance.realx.base.RXPowerMonitorAndroid.1
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context2, Intent intent) {
            int unused = RXPowerMonitorAndroid.mChargeStatus = intent.getIntExtra(NotificationCompat.CATEGORY_STATUS, -1);
            int unused2 = RXPowerMonitorAndroid.mBatteryTemperature = intent.getIntExtra("temperature", -1);
            int unused3 = RXPowerMonitorAndroid.mBatteryLevel = intent.getIntExtra(FirebaseAnalytics.Param.LEVEL, -1);
        }
    };
    private static BroadcastReceiver batterySaverReceiver = new BroadcastReceiver() { // from class: com.bytedance.realx.base.RXPowerMonitorAndroid.2
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context2, Intent intent) {
            if (Build.MANUFACTURER.equalsIgnoreCase(ThirdPushManager.VENDOR_TYPE_XIAOMI)) {
                try {
                    int unused = RXPowerMonitorAndroid.mBatterySaveMode = Settings.System.getInt(context2.getContentResolver(), "POWER_SAVE_MODE_OPEN");
                } catch (Exception unused2) {
                }
            } else if ("android.os.action.POWER_SAVE_MODE_CHANGED".equals(intent.getAction())) {
                int unused3 = RXPowerMonitorAndroid.mBatterySaveMode = RXPowerMonitorAndroid.powerManager.isPowerSaveMode() ? 1 : 0;
            }
        }
    };
    private static int mCpuCoreCount = -1;
    private static int mChargeStatus = -1;
    private static int mBatteryLevel = -1;
    private static int mBatteryTemperature = -1;
    private static int mBatterySaveMode = -1;
    private static BatteryManager batteryManager = (BatteryManager) context.getSystemService("batterymanager");

    static {
        IntentFilter intentFilter = new IntentFilter("android.intent.action.BATTERY_CHANGED");
        ifilter = intentFilter;
        batteryStatus = jj5.m145018l(context, mBroadcastReceiver, intentFilter);
        powerManager = (PowerManager) context.getSystemService("power");
    }

    public static int getBatteryCurrentCapacity() {
        int longProperty;
        try {
            BatteryManager batteryManager2 = batteryManager;
            longProperty = batteryManager2 != null ? ((int) batteryManager2.getLongProperty(1)) / 1000 : -1;
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (longProperty < 0) {
            return -1;
        }
        return longProperty;
    }

    public static int getBatteryDesignCapacity() {
        try {
            return (int) Math.round(((Double) Class.forName("com.android.internal.os.PowerProfile").getMethod("getBatteryCapacity", null).invoke(Class.forName("com.android.internal.os.PowerProfile").getConstructor(Context.class).newInstance(context), null)).doubleValue());
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    public static int getBatteryLevel() {
        try {
            BatteryManager batteryManager2 = batteryManager;
            if (batteryManager2 != null && mBatteryLevel == -1) {
                mBatteryLevel = batteryManager2.getIntProperty(4);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return mBatteryLevel;
    }

    public static int getBatteryMaxCapacity() {
        return 0;
    }

    public static int getBatterySaveStatus() {
        try {
            String str = Build.MANUFACTURER;
            if (str.equalsIgnoreCase(ThirdPushManager.VENDOR_TYPE_XIAOMI) && powerManager != null && mBatterySaveMode == -1) {
                mBatterySaveMode = Settings.System.getInt(context.getContentResolver(), "POWER_SAVE_MODE_OPEN");
                jj5.m145018l(context, batterySaverReceiver, new IntentFilter("miui.intent.action.POWER_SAVE_MODE_CHANGED"));
            } else if (str.equalsIgnoreCase(ThirdPushManager.VENDOR_TYPE_HUAWEI)) {
                if (Settings.System.getInt(context.getContentResolver(), "SmartModeStatus") == 4) {
                    mBatterySaveMode = 1;
                } else {
                    mBatterySaveMode = 0;
                }
            } else if (powerManager != null && mBatterySaveMode == -1) {
                jj5.m145018l(context, batterySaverReceiver, new IntentFilter("android.os.action.POWER_SAVE_MODE_CHANGED"));
                mBatterySaveMode = powerManager.isPowerSaveMode() ? 1 : 0;
            }
        } catch (Exception e) {
            mBatterySaveMode = -1;
            e.printStackTrace();
        }
        return mBatterySaveMode;
    }

    public static int getBatteryTemperature() {
        return mBatteryTemperature / 10;
    }

    public static int getChargeStatus() {
        BatteryManager batteryManager2;
        try {
            if (Build.VERSION.SDK_INT >= 26 && (batteryManager2 = batteryManager) != null && mChargeStatus == -1) {
                mChargeStatus = batteryManager2.getIntProperty(6);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        int i = mChargeStatus;
        return (i == 5 || i == 2) ? 1 : 0;
    }

    public static int getScreenBrightness() {
        if (Build.MANUFACTURER.equalsIgnoreCase(ThirdPushManager.VENDOR_TYPE_XIAOMI)) {
            return -1;
        }
        return (int) ((((double) Settings.System.getInt(context.getContentResolver(), "screen_brightness", -1)) / 255.0d) * 100.0d);
    }

    public static int getVoltage() {
        return -1;
    }
}
