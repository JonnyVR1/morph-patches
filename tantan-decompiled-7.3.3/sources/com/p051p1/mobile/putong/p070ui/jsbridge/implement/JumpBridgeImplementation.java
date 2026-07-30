package com.p051p1.mobile.putong.p070ui.jsbridge.implement;

import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.p051p1.mobile.putong.p070ui.jsbridge.implement.JumpBridgeImplementation;
import com.tantanapp.common.utils.CrashHelper;
import p153l.aqq;
import p153l.lf2;
import p153l.lkq;
import p153l.nae0;
import p153l.z20;

/* JADX INFO: loaded from: classes10.dex */
public class JumpBridgeImplementation extends lf2 {
    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m80960c(aqq aqqVar, String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        aqqVar.mo99544d().mo97004b(str, str2);
    }

    @lkq(key = "action")
    public void action(@NonNull final aqq aqqVar, String str) {
        nae0.m162084n(aqqVar.mo99543c(), Uri.parse(str), new z20() { // from class: l.esq
            @Override // p153l.z20
            public final void call(Object obj, Object obj2) {
                JumpBridgeImplementation.m80960c(aqqVar, (String) obj, (String) obj2);
            }
        });
    }

    @lkq(key = "jumpBrowser")
    public void jumpBrowser(@NonNull aqq aqqVar, String str) {
        try {
            Intent intent = new Intent();
            intent.setAction("android.intent.action.VIEW");
            intent.setData(Uri.parse(str));
            aqqVar.mo99543c().startActivity(intent);
        } catch (Exception e) {
            CrashHelper.m82479c(e);
        }
    }
}
