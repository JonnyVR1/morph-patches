package com.p046p1.mobile.putong.api;

import android.os.Bundle;
import android.view.ViewGroup;
import com.p046p1.mobile.android.app.C4319c;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.core.data.Active;
import p149l.e30;
import p149l.k3m;
import p149l.k70;
import p149l.kkh0;
import p149l.mkd0;
import p149l.qzb0;

/* JADX INFO: loaded from: classes9.dex */
public class HotLauncherAct extends PutongAct {

    /* JADX INFO: renamed from: c */
    public boolean f17099c = false;

    /* JADX INFO: renamed from: com.p1.mobile.putong.api.HotLauncherAct$a */
    public class C4683a extends k3m {
        public C4683a() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a2 */
    public /* synthetic */ void m29407a2(C4319c c4319c) {
        if (c4319c != C4319c.f15548i) {
            if (c4319c == C4319c.f15549j) {
                this.f17099c = false;
            }
        } else {
            if (this.f17099c) {
                m29408Y1();
            }
            this.f17099c = true;
            m29411c2();
        }
    }

    /* JADX INFO: renamed from: Y1 */
    public final void m29408Y1() {
        if (this.f17099c) {
            m29409Z1();
        } else {
            this.f17099c = true;
        }
    }

    /* JADX INFO: renamed from: Z1 */
    public final void m29409Z1() {
        m66873d2();
        overridePendingTransition(qzb0.f157021b, qzb0.f157022c);
    }

    /* JADX INFO: renamed from: b2 */
    public final /* synthetic */ void m29410b2() {
        if (kkh0.m146325e().m146329d().m155017a((ViewGroup) getWindow().getDecorView(), "AD_SPLASH_HOT_START", Active.TYPE, new C4683a())) {
            return;
        }
        m29409Z1();
    }

    /* JADX INFO: renamed from: c2 */
    public final void m29411c2() {
        getWindow().getDecorView().post(new Runnable() { // from class: l.yel
            @Override // java.lang.Runnable
            public final void run() {
                this.f197695a.m29410b2();
            }
        });
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        k70.INSTANCE.m144644a("hotlanch");
        lifecycle().subscribe(mkd0.m154955G(new e30() { // from class: l.xel
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f192604a.m29407a2((C4319c) obj);
            }
        }));
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        getWindow().getDecorView().setSystemUiVisibility(5894);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void setTheme() {
    }
}
