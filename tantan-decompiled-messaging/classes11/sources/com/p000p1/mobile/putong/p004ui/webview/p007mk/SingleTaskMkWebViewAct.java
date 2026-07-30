package com.p000p1.mobile.putong.p004ui.webview.p007mk;

import android.content.Intent;
import android.os.Bundle;
import com.p1.mobile.putong.facertification.a;
import l.lsi0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class SingleTaskMkWebViewAct extends AccessTokenMkWebViewAct {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: D2 */
    public final /* synthetic */ void m10597D2() {
        if (!isDestroyed() && !isFinishing()) {
            finish();
        }
        lsi0.y("已提交审核");
    }

    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        if (a.e(intent)) {
            a.f(this, intent, new Runnable() { // from class: l.lif0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f16176a.m10597D2();
                }
            }, new Runnable() { // from class: l.mif0
                @Override // java.lang.Runnable
                public final void run() {
                    lsi0.y("请稍后再试");
                }
            });
        } else {
            finish();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p000p1.mobile.putong.p004ui.webview.p007mk.AccessTokenMkWebViewAct, com.p000p1.mobile.putong.p004ui.webview.p007mk.MkWebViewAct
    public void preCreateView(Bundle bundle) {
        String stringExtra = getIntent().getStringExtra("url");
        if (stringExtra == null || !(stringExtra.startsWith("https://m.staging2.p1staff.com") || stringExtra.startsWith("https://m.tantanapp.com"))) {
            finish();
        } else {
            super.preCreateView(bundle);
        }
    }
}
