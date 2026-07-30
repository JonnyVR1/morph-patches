package com.google.android.gms.ads.mediation;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p149l.ezx;
import p149l.xyx;
import p149l.yyx;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public interface MediationInterstitialAdapter extends yyx {
    /* synthetic */ void onDestroy();

    /* synthetic */ void onPause();

    /* synthetic */ void onResume();

    void requestInterstitialAd(@NonNull Context context, @NonNull ezx ezxVar, @NonNull Bundle bundle, @NonNull xyx xyxVar, @Nullable Bundle bundle2);

    void showInterstitial();
}
