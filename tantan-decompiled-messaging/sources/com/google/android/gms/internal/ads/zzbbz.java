package com.google.android.gms.internal.ads;

import p149l.r8x0;
import p149l.s8x0;

/* JADX INFO: loaded from: classes6.dex */
public enum zzbbz implements r8x0 {
    AD_INITIATER_UNSPECIFIED(0),
    BANNER(1),
    DFP_BANNER(2),
    INTERSTITIAL(3),
    DFP_INTERSTITIAL(4),
    NATIVE_EXPRESS(5),
    AD_LOADER(6),
    REWARD_BASED_VIDEO_AD(7),
    BANNER_SEARCH_ADS(8),
    GOOGLE_MOBILE_ADS_SDK_ADAPTER(9),
    APP_OPEN(10),
    REWARDED_INTERSTITIAL(11);

    private static final s8x0 zzm = new s8x0() { // from class: l.h3s0
    };
    private final int zzo;

    zzbbz(int i) {
        this.zzo = i;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.zzo);
    }

    public final int zza() {
        return this.zzo;
    }
}
