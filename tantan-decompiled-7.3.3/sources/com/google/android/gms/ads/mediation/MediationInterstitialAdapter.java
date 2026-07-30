package com.google.android.gms.ads.mediation;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p153l.b8y;
import p153l.u7y;
import p153l.v7y;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public interface MediationInterstitialAdapter extends v7y {
    /* synthetic */ void onDestroy();

    /* synthetic */ void onPause();

    /* synthetic */ void onResume();

    void requestInterstitialAd(@NonNull Context context, @NonNull b8y b8yVar, @NonNull Bundle bundle, @NonNull u7y u7yVar, @Nullable Bundle bundle2);

    void showInterstitial();
}
