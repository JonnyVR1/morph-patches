package com.google.android.gms.ads.mediation.rtb;

import androidx.annotation.NonNull;
import p149l.azx;
import p149l.dzx;
import p149l.f70;
import p149l.f80;
import p149l.fzx;
import p149l.hzx;
import p149l.koj0;
import p149l.nef0;
import p149l.tfd0;
import p149l.wyx;
import p149l.zyx;

/* JADX INFO: loaded from: classes6.dex */
public abstract class RtbAdapter extends f80 {
    public abstract void collectSignals(@NonNull tfd0 tfd0Var, @NonNull nef0 nef0Var);

    public void loadRtbAppOpenAd(@NonNull zyx zyxVar, @NonNull wyx<Object, Object> wyxVar) {
        loadAppOpenAd(zyxVar, wyxVar);
    }

    public void loadRtbBannerAd(@NonNull azx azxVar, @NonNull wyx<Object, Object> wyxVar) {
        loadBannerAd(azxVar, wyxVar);
    }

    public void loadRtbInterscrollerAd(@NonNull azx azxVar, @NonNull wyx<Object, Object> wyxVar) {
        wyxVar.mo127630a(new f70(7, getClass().getSimpleName().concat(" does not support interscroller ads."), "com.google.android.gms.ads"));
    }

    public void loadRtbInterstitialAd(@NonNull dzx dzxVar, @NonNull wyx<Object, Object> wyxVar) {
        loadInterstitialAd(dzxVar, wyxVar);
    }

    public void loadRtbNativeAd(@NonNull fzx fzxVar, @NonNull wyx<koj0, Object> wyxVar) {
        loadNativeAd(fzxVar, wyxVar);
    }

    public void loadRtbRewardedAd(@NonNull hzx hzxVar, @NonNull wyx<Object, Object> wyxVar) {
        loadRewardedAd(hzxVar, wyxVar);
    }

    public void loadRtbRewardedInterstitialAd(@NonNull hzx hzxVar, @NonNull wyx<Object, Object> wyxVar) {
        loadRewardedInterstitialAd(hzxVar, wyxVar);
    }
}
