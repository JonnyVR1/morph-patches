package com.p000p1.mobile.putong.p004ui.jsbridge.implement;

import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.p000p1.mobile.putong.p004ui.jsbridge.implement.JumpBridgeImplementation;
import com.tantanapp.common.utils.CrashHelper;
import l.f30;
import l.j2e0;
import p009l.boq;
import p009l.ef2;
import p009l.liq;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class JumpBridgeImplementation extends ef2 {
    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m10100c(boq boqVar, String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        boqVar.mo12185d().mo15130b(str, str2);
    }

    @liq(key = "action")
    public void action(@NonNull final boq boqVar, String str) {
        j2e0.n(boqVar.mo12184c(), Uri.parse(str), new f30() { // from class: l.dqq
            public final void call(Object obj, Object obj2) {
                JumpBridgeImplementation.m10100c(boqVar, (String) obj, (String) obj2);
            }
        });
    }

    @liq(key = "jumpBrowser")
    public void jumpBrowser(@NonNull boq boqVar, String str) {
        try {
            Intent intent = new Intent();
            intent.setAction("android.intent.action.VIEW");
            intent.setData(Uri.parse(str));
            boqVar.mo12184c().startActivity(intent);
        } catch (Exception e) {
            CrashHelper.c(e);
        }
    }
}
