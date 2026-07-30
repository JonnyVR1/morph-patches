package com.p046p1.mobile.putong.p065ui.webview.p068mk;

import android.content.Intent;
import android.os.Bundle;
import com.p046p1.mobile.putong.facertification.C10732a;
import p149l.lsi0;

/* JADX INFO: loaded from: classes11.dex */
public class SingleTaskMkWebViewAct extends AccessTokenMkWebViewAct {
    /* JADX INFO: renamed from: D2 */
    public final /* synthetic */ void m80246D2() {
        if (!isDestroyed() && !isFinishing()) {
            lambda$debugItems$19();
        }
        lsi0.m151595y("已提交审核");
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        if (C10732a.m60218e(intent)) {
            C10732a.m60219f(this, intent, new Runnable() { // from class: l.lif0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f128189a.m80246D2();
                }
            }, new Runnable() { // from class: l.mif0
                @Override // java.lang.Runnable
                public final void run() {
                    lsi0.m151595y("请稍后再试");
                }
            });
        } else {
            lambda$debugItems$19();
        }
    }

    @Override // com.p046p1.mobile.putong.p065ui.webview.p068mk.AccessTokenMkWebViewAct, com.p046p1.mobile.putong.p065ui.webview.p068mk.MkWebViewAct, com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        String stringExtra = getIntent().getStringExtra("url");
        if (stringExtra == null || !(stringExtra.startsWith("https://m.staging2.p1staff.com") || stringExtra.startsWith("https://m.tantanapp.com"))) {
            lambda$debugItems$19();
        } else {
            super.preCreateView(bundle);
        }
    }
}
