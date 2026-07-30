package com.clevertap.android.sdk.pushnotification.fcm;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import p149l.drl;
import p149l.ekg;
import p149l.ggb0;
import p149l.yv3;
import p149l.zv3;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"unused"})
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class FcmPushProvider implements yv3 {
    private drl handler;

    @SuppressLint({"unused"})
    public FcmPushProvider(zv3 zv3Var, Context context, CleverTapInstanceConfig cleverTapInstanceConfig) {
        this.handler = new ekg(zv3Var, context, cleverTapInstanceConfig);
    }

    @Override // p149l.yv3
    @NonNull
    public ggb0 getPushType() {
        return this.handler.getPushType();
    }

    @Override // p149l.yv3
    public boolean isAvailable() {
        return this.handler.isAvailable();
    }

    @Override // p149l.yv3
    public boolean isSupported() {
        return this.handler.isSupported();
    }

    @Override // p149l.yv3
    public int minSDKSupportVersionCode() {
        return 0;
    }

    @Override // p149l.yv3
    public void requestToken() {
        this.handler.requestToken();
    }

    public void setHandler(drl drlVar) {
        this.handler = drlVar;
    }
}
