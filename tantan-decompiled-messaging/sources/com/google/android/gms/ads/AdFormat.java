package com.google.android.gms.ads;

/* JADX INFO: loaded from: classes6.dex */
public enum AdFormat {
    BANNER(0),
    INTERSTITIAL(1),
    REWARDED(2),
    REWARDED_INTERSTITIAL(3),
    NATIVE(4),
    APP_OPEN_AD(6);

    private final int zzb;

    AdFormat(int i) {
        this.zzb = i;
    }

    public int getValue() {
        return this.zzb;
    }
}
