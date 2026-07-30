package com.google.android.gms.ads.mediation;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p153l.d8y;
import p153l.te20;
import p153l.v7y;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public interface MediationNativeAdapter extends v7y {
    /* synthetic */ void onDestroy();

    /* synthetic */ void onPause();

    /* synthetic */ void onResume();

    void requestNativeAd(@NonNull Context context, @NonNull d8y d8yVar, @NonNull Bundle bundle, @NonNull te20 te20Var, @Nullable Bundle bundle2);
}
