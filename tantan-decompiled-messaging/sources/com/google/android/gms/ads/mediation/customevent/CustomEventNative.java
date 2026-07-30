package com.google.android.gms.ads.mediation.customevent;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p149l.l620;
import p149l.qxb;
import p149l.txb;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public interface CustomEventNative extends qxb {
    /* synthetic */ void onDestroy();

    /* synthetic */ void onPause();

    /* synthetic */ void onResume();

    void requestNativeAd(@NonNull Context context, @NonNull txb txbVar, @Nullable String str, @NonNull l620 l620Var, @Nullable Bundle bundle);
}
