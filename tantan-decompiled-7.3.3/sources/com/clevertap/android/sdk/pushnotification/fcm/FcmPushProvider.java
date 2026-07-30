package com.clevertap.android.sdk.pushnotification.fcm;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import p153l.kob0;
import p153l.qtl;
import p153l.slg;
import p153l.xw3;
import p153l.yw3;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"unused"})
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class FcmPushProvider implements xw3 {
    private qtl handler;

    @SuppressLint({"unused"})
    public FcmPushProvider(yw3 yw3Var, Context context, CleverTapInstanceConfig cleverTapInstanceConfig) {
        this.handler = new slg(yw3Var, context, cleverTapInstanceConfig);
    }

    @Override // p153l.xw3
    @NonNull
    public kob0 getPushType() {
        return this.handler.getPushType();
    }

    @Override // p153l.xw3
    public boolean isAvailable() {
        return this.handler.isAvailable();
    }

    @Override // p153l.xw3
    public boolean isSupported() {
        return this.handler.isSupported();
    }

    @Override // p153l.xw3
    public int minSDKSupportVersionCode() {
        return 0;
    }

    @Override // p153l.xw3
    public void requestToken() {
        this.handler.requestToken();
    }

    public void setHandler(qtl qtlVar) {
        this.handler = qtlVar;
    }
}
