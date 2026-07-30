package com.google.android.gms.ads.mediation.rtb;

import androidx.annotation.NonNull;
import p153l.a8y;
import p153l.b70;
import p153l.b80;
import p153l.c8y;
import p153l.e8y;
import p153l.nxj0;
import p153l.t7y;
import p153l.umf0;
import p153l.w7y;
import p153l.wnd0;
import p153l.x7y;

/* JADX INFO: loaded from: classes6.dex */
public abstract class RtbAdapter extends b80 {
    public abstract void collectSignals(@NonNull wnd0 wnd0Var, @NonNull umf0 umf0Var);

    public void loadRtbAppOpenAd(@NonNull w7y w7yVar, @NonNull t7y<Object, Object> t7yVar) {
        loadAppOpenAd(w7yVar, t7yVar);
    }

    public void loadRtbBannerAd(@NonNull x7y x7yVar, @NonNull t7y<Object, Object> t7yVar) {
        loadBannerAd(x7yVar, t7yVar);
    }

    public void loadRtbInterscrollerAd(@NonNull x7y x7yVar, @NonNull t7y<Object, Object> t7yVar) {
        t7yVar.mo95420a(new b70(7, getClass().getSimpleName().concat(" does not support interscroller ads."), "com.google.android.gms.ads"));
    }

    public void loadRtbInterstitialAd(@NonNull a8y a8yVar, @NonNull t7y<Object, Object> t7yVar) {
        loadInterstitialAd(a8yVar, t7yVar);
    }

    public void loadRtbNativeAd(@NonNull c8y c8yVar, @NonNull t7y<nxj0, Object> t7yVar) {
        loadNativeAd(c8yVar, t7yVar);
    }

    public void loadRtbRewardedAd(@NonNull e8y e8yVar, @NonNull t7y<Object, Object> t7yVar) {
        loadRewardedAd(e8yVar, t7yVar);
    }

    public void loadRtbRewardedInterstitialAd(@NonNull e8y e8yVar, @NonNull t7y<Object, Object> t7yVar) {
        loadRewardedInterstitialAd(e8yVar, t7yVar);
    }
}
