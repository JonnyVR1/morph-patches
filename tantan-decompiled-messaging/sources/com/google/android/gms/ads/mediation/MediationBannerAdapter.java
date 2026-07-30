package com.google.android.gms.ads.mediation;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p149l.a80;
import p149l.bzx;
import p149l.xyx;
import p149l.yyx;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public interface MediationBannerAdapter extends yyx {
    @NonNull
    View getBannerView();

    @Override // p149l.yyx, com.google.android.gms.ads.mediation.MediationInterstitialAdapter, com.google.android.gms.ads.mediation.MediationNativeAdapter
    /* synthetic */ void onDestroy();

    @Override // p149l.yyx, com.google.android.gms.ads.mediation.MediationInterstitialAdapter, com.google.android.gms.ads.mediation.MediationNativeAdapter
    /* synthetic */ void onPause();

    @Override // p149l.yyx, com.google.android.gms.ads.mediation.MediationInterstitialAdapter, com.google.android.gms.ads.mediation.MediationNativeAdapter
    /* synthetic */ void onResume();

    void requestBannerAd(@NonNull Context context, @NonNull bzx bzxVar, @NonNull Bundle bundle, @NonNull a80 a80Var, @NonNull xyx xyxVar, @Nullable Bundle bundle2);
}
