package com.p046p1.mobile.putong.p065ui.jsbridge.implement;

import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.p046p1.mobile.putong.p065ui.jsbridge.implement.JumpBridgeImplementation;
import com.tantanapp.common.utils.CrashHelper;
import p149l.boq;
import p149l.ef2;
import p149l.f30;
import p149l.j2e0;
import p149l.liq;

/* JADX INFO: loaded from: classes11.dex */
public class JumpBridgeImplementation extends ef2 {
    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m79777c(boq boqVar, String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        boqVar.mo102962d().mo127285b(str, str2);
    }

    @liq(key = "action")
    public void action(@NonNull final boq boqVar, String str) {
        j2e0.m139447n(boqVar.mo102961c(), Uri.parse(str), new f30() { // from class: l.dqq
            @Override // p149l.f30
            public final void call(Object obj, Object obj2) {
                JumpBridgeImplementation.m79777c(boqVar, (String) obj, (String) obj2);
            }
        });
    }

    @liq(key = "jumpBrowser")
    public void jumpBrowser(@NonNull boq boqVar, String str) {
        try {
            Intent intent = new Intent();
            intent.setAction("android.intent.action.VIEW");
            intent.setData(Uri.parse(str));
            boqVar.mo102961c().startActivity(intent);
        } catch (Exception e) {
            CrashHelper.m81296c(e);
        }
    }
}
