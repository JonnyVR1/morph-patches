package com.google.android.gms.ads.mediation.customevent;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p149l.qxb;
import p149l.sxb;
import p149l.xyx;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public interface CustomEventInterstitial extends qxb {
    /* synthetic */ void onDestroy();

    /* synthetic */ void onPause();

    /* synthetic */ void onResume();

    void requestInterstitialAd(@NonNull Context context, @NonNull sxb sxbVar, @Nullable String str, @NonNull xyx xyxVar, @Nullable Bundle bundle);

    void showInterstitial();
}
