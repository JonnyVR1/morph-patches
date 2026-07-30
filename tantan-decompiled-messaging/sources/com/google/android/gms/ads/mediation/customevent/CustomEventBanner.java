package com.google.android.gms.ads.mediation.customevent;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p149l.a80;
import p149l.qxb;
import p149l.rxb;
import p149l.xyx;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public interface CustomEventBanner extends qxb {
    /* synthetic */ void onDestroy();

    /* synthetic */ void onPause();

    /* synthetic */ void onResume();

    void requestBannerAd(@NonNull Context context, @NonNull rxb rxbVar, @Nullable String str, @NonNull a80 a80Var, @NonNull xyx xyxVar, @Nullable Bundle bundle);
}
