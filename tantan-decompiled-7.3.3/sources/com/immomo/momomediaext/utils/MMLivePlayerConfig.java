package com.immomo.momomediaext.utils;

/* JADX INFO: loaded from: classes7.dex */
public class MMLivePlayerConfig {
    public static final int DEMAND_BROADCAST = 1;
    public static final int LIVE_BROADCAST = 0;
    public String url = "";
    public String mediaConfig = "";
    public MMLivePlayerMode mode = MMLivePlayerMode.MMLivePlayerModeLive;
    public int cdnType = 0;
    public int businessType = 0;
    public String ipv6Url = "";

    public enum MMLivePlayerMode {
        MMLivePlayerModeLive,
        MMLivePlayerModePlayback
    }

    public String toString() {
        return "MMLivePlayerConfig{url='" + this.url + "', mediaConfig='" + this.mediaConfig + "', mode=" + this.mode + ", cdnType=" + this.cdnType + ", businessType=" + this.businessType + ", ipv6Url='" + this.ipv6Url + "'}";
    }
}
