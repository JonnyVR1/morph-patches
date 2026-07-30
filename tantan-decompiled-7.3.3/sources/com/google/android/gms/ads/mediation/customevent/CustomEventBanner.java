package com.google.android.gms.ads.mediation.customevent;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p153l.ezb;
import p153l.fzb;
import p153l.u7y;
import p153l.w70;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public interface CustomEventBanner extends ezb {
    /* synthetic */ void onDestroy();

    /* synthetic */ void onPause();

    /* synthetic */ void onResume();

    void requestBannerAd(@NonNull Context context, @NonNull fzb fzbVar, @Nullable String str, @NonNull w70 w70Var, @NonNull u7y u7yVar, @Nullable Bundle bundle);
}
