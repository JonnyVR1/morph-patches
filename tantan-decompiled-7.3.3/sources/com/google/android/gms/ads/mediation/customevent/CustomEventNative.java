package com.google.android.gms.ads.mediation.customevent;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p153l.ezb;
import p153l.hzb;
import p153l.te20;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public interface CustomEventNative extends ezb {
    /* synthetic */ void onDestroy();

    /* synthetic */ void onPause();

    /* synthetic */ void onResume();

    void requestNativeAd(@NonNull Context context, @NonNull hzb hzbVar, @Nullable String str, @NonNull te20 te20Var, @Nullable Bundle bundle);
}
