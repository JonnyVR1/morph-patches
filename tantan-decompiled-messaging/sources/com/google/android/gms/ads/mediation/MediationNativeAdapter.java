package com.google.android.gms.ads.mediation;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p149l.gzx;
import p149l.l620;
import p149l.yyx;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public interface MediationNativeAdapter extends yyx {
    /* synthetic */ void onDestroy();

    /* synthetic */ void onPause();

    /* synthetic */ void onResume();

    void requestNativeAd(@NonNull Context context, @NonNull gzx gzxVar, @NonNull Bundle bundle, @NonNull l620 l620Var, @Nullable Bundle bundle2);
}
