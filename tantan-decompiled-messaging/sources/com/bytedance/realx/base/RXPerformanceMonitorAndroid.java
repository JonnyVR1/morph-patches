package com.bytedance.realx.base;

import android.app.ActivityManager;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.os.PowerManager;
import android.os.Process;
import android.p005os.PowerManager$OnThermalStatusChangedListener;
import java.io.File;
import java.io.FileFilter;

/* JADX INFO: loaded from: classes.dex */
public class RXPerformanceMonitorAndroid implements ComponentCallbacks2 {
    private static final float ERROR_RESULT = 0.0f;
    private static final FileFilter CPU_IDLE_STATE_FILTER = new FileFilter() { // from class: com.bytedance.realx.base.RXPerformanceMonitorAndroid.1
        @Override // java.io.FileFilter
        public boolean accept(File file) {
            String name = file.getName();
            if (!name.startsWith("state")) {
                return false;
            }
            for (int i = 5; i < name.length(); i++) {
                if (name.charAt(i) < '0' || name.charAt(i) > '9') {
                    return false;
                }
            }
            return true;
        }
    };
    private static int mCpuCoreCount = -1;
    private static int mCpuIdleStateCount = -1;
    private static int mThermalState = -1;
    private static int mMemoryState = 0;
    private static boolean mMemoryStateRegisterd = false;
    private static RXPerformanceMonitorAndroid mPerformanceMonitor = new RXPerformanceMonitorAndroid();

    /* JADX INFO: Access modifiers changed from: private */
    public static int convertThermalState(int i) {
        switch (i) {
            case 0:
            case 1:
                return 0;
            case 2:
                return 1;
            case 3:
            case 4:
                return 2;
            case 5:
            case 6:
                return 3;
            default:
                return 4;
        }
    }

    private static int getCpuIdleStateCount() {
        try {
            File[] fileArrListFiles = new File("/sys/devices/system/cpu/cpu0/cpuidle/").listFiles(CPU_IDLE_STATE_FILTER);
            if (fileArrListFiles != null) {
                return fileArrListFiles.length;
            }
            return 0;
        } catch (Exception unused) {
            return 0;
        }
    }

    public static int getCurrentPidMemorySize() {
        Context applicationContext = ContextUtils.getApplicationContext();
        if (applicationContext == null) {
            return 0;
        }
        try {
            ActivityManager activityManager = (ActivityManager) applicationContext.getSystemService("activity");
            if (activityManager == null) {
                return 0;
            }
            return activityManager.getProcessMemoryInfo(new int[]{Process.myPid()})[0].getTotalPss();
        } catch (Exception unused) {
            return 0;
        }
    }

    public static boolean getIfRoomsDevice() {
        return "a3382".equals(Build.MODEL.toLowerCase());
    }

    public static int getJavaAppMemoryUsage() {
        Context applicationContext = ContextUtils.getApplicationContext();
        if (applicationContext == null) {
            return 0;
        }
        try {
            ActivityManager activityManager = (ActivityManager) applicationContext.getSystemService("activity");
            if (activityManager == null) {
                return 0;
            }
            return activityManager.getProcessMemoryInfo(new int[]{Process.myPid()})[0].dalvikPss;
        } catch (Exception unused) {
            return 0;
        }
    }

    public static int getMemoryState() {
        Context applicationContext = ContextUtils.getApplicationContext();
        if (applicationContext == null) {
            return -1;
        }
        if (!mMemoryStateRegisterd) {
            applicationContext.registerComponentCallbacks(mPerformanceMonitor);
            mMemoryStateRegisterd = true;
        }
        return mMemoryState;
    }

    public static int getThermalState() {
        if (Build.VERSION.SDK_INT >= 29 && mThermalState == -1) {
            PowerManager$OnThermalStatusChangedListener powerManager$OnThermalStatusChangedListener = new PowerManager$OnThermalStatusChangedListener() { // from class: com.bytedance.realx.base.RXPerformanceMonitorAndroid.2
                public void onThermalStatusChanged(int i) {
                    int unused = RXPerformanceMonitorAndroid.mThermalState = RXPerformanceMonitorAndroid.convertThermalState(i);
                }
            };
            mThermalState = 4;
            PowerManager powerManager = (PowerManager) ContextUtils.getApplicationContext().getSystemService("power");
            if (powerManager != null) {
                try {
                    int currentThermalStatus = powerManager.getCurrentThermalStatus();
                    mThermalState = currentThermalStatus;
                    mThermalState = convertThermalState(currentThermalStatus);
                    powerManager.addThermalStatusListener(powerManager$OnThermalStatusChangedListener);
                } catch (Exception unused) {
                    return mThermalState;
                }
            }
        } else if (mThermalState == -1) {
            mThermalState = 4;
        }
        return mThermalState;
    }

    public static int getThreadCount() {
        return Thread.activeCount();
    }

    public static void setThermalState(int i) {
        mThermalState = i;
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
    }

    @Override // android.content.ComponentCallbacks2
    public void onTrimMemory(int i) {
        if (i == 5) {
            mMemoryState = 1;
            return;
        }
        if (i == 10) {
            mMemoryState = 2;
            return;
        }
        if (i == 15) {
            mMemoryState = 3;
            return;
        }
        if (i == 20) {
            mMemoryState = 4;
            return;
        }
        if (i == 40) {
            mMemoryState = 5;
        } else if (i == 60) {
            mMemoryState = 6;
        } else {
            if (i != 80) {
                return;
            }
            mMemoryState = 7;
        }
    }
}
