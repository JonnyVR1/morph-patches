package com.p074ss.bytertc.base.utils;

import androidx.annotation.RequiresApi;
import com.bytedance.realx.base.CalledByNative;

/* JADX INFO: loaded from: classes11.dex */
public final class WlanMonitor {

    public static class ConnectionInfo {
        private String ifName;
        private int noise;
        private int rssi;
        private int rxRate;
        private int txRate;

        public ConnectionInfo(String str, int i, int i2, int i3, int i4) {
            this.ifName = str;
            this.rssi = i;
            this.noise = i2;
            this.txRate = i3;
            this.rxRate = i4;
        }

        @CalledByNative("ConnectionInfo")
        public String getIfName() {
            return this.ifName;
        }

        @CalledByNative("ConnectionInfo")
        public int getNoise() {
            return this.noise;
        }

        @CalledByNative("ConnectionInfo")
        public int getRssi() {
            return this.rssi;
        }

        @CalledByNative("ConnectionInfo")
        public int getRxRate() {
            return this.rxRate;
        }

        @CalledByNative("ConnectionInfo")
        public int getTxRate() {
            return this.txRate;
        }
    }

    public static class InterfaceInfo {
        private int channelWidth;
        private int channleNum;
        private int frequency;
        private String ifName;
        private int phyMode;
        private boolean state;

        public InterfaceInfo(String str, boolean z, int i, int i2, int i3, int i4) {
            this.ifName = str;
            this.state = z;
            this.frequency = i;
            this.phyMode = i2;
            this.channleNum = i3;
            this.channelWidth = i4;
        }

        @CalledByNative("InterfaceInfo")
        public int getChannelWidth() {
            return this.channelWidth;
        }

        @CalledByNative("InterfaceInfo")
        public int getChannleNum() {
            return this.channleNum;
        }

        @CalledByNative("InterfaceInfo")
        public int getFrequency() {
            return this.frequency;
        }

        @CalledByNative("InterfaceInfo")
        public String getIfName() {
            return this.ifName;
        }

        @CalledByNative("InterfaceInfo")
        public int getPhyMode() {
            return this.phyMode;
        }

        @CalledByNative("InterfaceInfo")
        public boolean getState() {
            return this.state;
        }
    }

    public static class ScanResultInfo {
        private int channelWidth;
        private int channleNum;
        private int frequency;
        private int noise;
        private int rssi;

        public ScanResultInfo(int i, int i2, int i3, int i4, int i5) {
            this.frequency = i;
            this.channleNum = i2;
            this.channelWidth = i3;
            this.rssi = i4;
            this.noise = i5;
        }

        @CalledByNative("ScanResultInfo")
        public int getChannelWidth() {
            return this.channelWidth;
        }

        @CalledByNative("ScanResultInfo")
        public int getChannleNum() {
            return this.channleNum;
        }

        @CalledByNative("ScanResultInfo")
        public int getFrequency() {
            return this.frequency;
        }

        @CalledByNative("ScanResultInfo")
        public int getNoise() {
            return this.noise;
        }

        @CalledByNative("ScanResultInfo")
        public int getRssi() {
            return this.rssi;
        }
    }

    @CalledByNative
    @RequiresApi(api = 29)
    public static ConnectionInfo[] getConnectionInfos() {
        return null;
    }

    @CalledByNative
    @RequiresApi(api = 21)
    public static int getFrequency() {
        return 0;
    }

    @CalledByNative
    @RequiresApi(api = 30)
    public static InterfaceInfo[] getInterfaceInfos() {
        return null;
    }

    @CalledByNative
    @RequiresApi(api = 31)
    public static ScanResultInfo[] getScanResultInfos() {
        return null;
    }

    @CalledByNative
    public static int getSignalQuality() {
        return 0;
    }
}
