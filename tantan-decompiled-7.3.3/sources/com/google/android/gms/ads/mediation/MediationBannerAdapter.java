package com.google.android.gms.ads.mediation;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p153l.u7y;
import p153l.v7y;
import p153l.w70;
import p153l.y7y;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public interface MediationBannerAdapter extends v7y {
    @NonNull
    View getBannerView();

    @Override // p153l.v7y, com.google.android.gms.ads.mediation.MediationInterstitialAdapter, com.google.android.gms.ads.mediation.MediationNativeAdapter
    /* synthetic */ void onDestroy();

    @Override // p153l.v7y, com.google.android.gms.ads.mediation.MediationInterstitialAdapter, com.google.android.gms.ads.mediation.MediationNativeAdapter
    /* synthetic */ void onPause();

    @Override // p153l.v7y, com.google.android.gms.ads.mediation.MediationInterstitialAdapter, com.google.android.gms.ads.mediation.MediationNativeAdapter
    /* synthetic */ void onResume();

    void requestBannerAd(@NonNull Context context, @NonNull y7y y7yVar, @NonNull Bundle bundle, @NonNull w70 w70Var, @NonNull u7y u7yVar, @Nullable Bundle bundle2);
}
