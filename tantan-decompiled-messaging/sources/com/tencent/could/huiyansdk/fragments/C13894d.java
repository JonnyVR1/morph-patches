package com.tencent.could.huiyansdk.fragments;

import com.tencent.could.aicamare.callback.CameraLoggerCallBack;
import com.tencent.could.huiyansdk.manager.C13905e;

/* JADX INFO: renamed from: com.tencent.could.huiyansdk.fragments.d */
/* JADX INFO: loaded from: classes2.dex */
public class C13894d implements CameraLoggerCallBack {
    public C13894d(AuthingFragment authingFragment) {
    }

    @Override // com.tencent.could.aicamare.callback.CameraLoggerCallBack
    public void logger(String str, String str2) {
        C13905e.a.f57445a.m82337a(1, str, str2);
    }
}
