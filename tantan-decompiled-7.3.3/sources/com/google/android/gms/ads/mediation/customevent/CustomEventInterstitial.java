package com.google.android.gms.ads.mediation.customevent;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p153l.ezb;
import p153l.gzb;
import p153l.u7y;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public interface CustomEventInterstitial extends ezb {
    /* synthetic */ void onDestroy();

    /* synthetic */ void onPause();

    /* synthetic */ void onResume();

    void requestInterstitialAd(@NonNull Context context, @NonNull gzb gzbVar, @Nullable String str, @NonNull u7y u7yVar, @Nullable Bundle bundle);

    void showInterstitial();
}
