package com.p051p1.mobile.putong.p070ui.webview.p073mk;

import android.content.Intent;
import android.os.Bundle;
import com.p051p1.mobile.putong.facertification.C10895a;
import p153l.lhl;
import p153l.o1j0;

/* JADX INFO: loaded from: classes10.dex */
public class SingleTaskMkWebViewAct extends AccessTokenMkWebViewAct {
    /* JADX INFO: renamed from: E2 */
    public final /* synthetic */ void m81429E2() {
        if (!isDestroyed() && !isFinishing()) {
            m68056e2();
        }
        o1j0.m165651y("已提交审核");
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        if (C10895a.m61402e(intent)) {
            C10895a.m61403f(this, intent, new Runnable() { // from class: l.uqf0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f180451a.m81429E2();
                }
            }, new Runnable() { // from class: l.vqf0
                @Override // java.lang.Runnable
                public final void run() {
                    o1j0.m165651y("请稍后再试");
                }
            });
        } else {
            m68056e2();
        }
    }

    @Override // com.p051p1.mobile.putong.p070ui.webview.p073mk.AccessTokenMkWebViewAct, com.p051p1.mobile.putong.p070ui.webview.p073mk.MkWebViewAct, com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        String stringExtra = getIntent().getStringExtra("url");
        if (stringExtra == null || !(stringExtra.startsWith("https://m.staging2.p1staff.com") || stringExtra.startsWith("https://m.tantanapp.com") || stringExtra.startsWith(lhl.INSTANCE.m154220m("https://m.tantanapp.com")))) {
            m68056e2();
        } else {
            super.preCreateView(bundle);
        }
    }
}
