package com.p051p1.mobile.putong.api;

import android.os.Bundle;
import android.view.ViewGroup;
import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.core.data.Active;
import p153l.b6m;
import p153l.g70;
import p153l.psd0;
import p153l.rsh0;
import p153l.w7c0;
import p153l.y20;

/* JADX INFO: loaded from: classes9.dex */
public class HotLauncherAct extends PutongAct {

    /* JADX INFO: renamed from: c */
    public boolean f17818c = false;

    /* JADX INFO: renamed from: com.p1.mobile.putong.api.HotLauncherAct$a */
    public class C4834a extends b6m {
        public C4834a() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b2 */
    public /* synthetic */ void m30405b2(C4470c c4470c) {
        if (c4470c != C4470c.f16267i) {
            if (c4470c == C4470c.f16268j) {
                this.f17818c = false;
            }
        } else {
            if (this.f17818c) {
                m30406Z1();
            }
            this.f17818c = true;
            m30409d2();
        }
    }

    /* JADX INFO: renamed from: Z1 */
    public final void m30406Z1() {
        if (this.f17818c) {
            m30407a2();
        } else {
            this.f17818c = true;
        }
    }

    /* JADX INFO: renamed from: a2 */
    public final void m30407a2() {
        m68056e2();
        overridePendingTransition(w7c0.f187732b, w7c0.f187733c);
    }

    /* JADX INFO: renamed from: c2 */
    public final /* synthetic */ void m30408c2() {
        if (rsh0.m182974e().m182978d().m192608a((ViewGroup) getWindow().getDecorView(), "AD_SPLASH_HOT_START", Active.TYPE, new C4834a())) {
            return;
        }
        m30407a2();
    }

    /* JADX INFO: renamed from: d2 */
    public final void m30409d2() {
        getWindow().getDecorView().post(new Runnable() { // from class: l.phl
            @Override // java.lang.Runnable
            public final void run() {
                this.f152445a.m30408c2();
            }
        });
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        g70.INSTANCE.m129306a("hotlanch");
        lifecycle().subscribe(psd0.m173596G(new y20() { // from class: l.ohl
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f147457a.m30405b2((C4470c) obj);
            }
        }));
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        getWindow().getDecorView().setSystemUiVisibility(5894);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void setTheme() {
    }
}
