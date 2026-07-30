package com.p000p1.mobile.putong.api;

import android.os.Bundle;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.app.PutongAct;
import com.p1.mobile.android.app.c;
import l.e30;
import l.mkd0;
import p006l.k3m;
import p006l.k70;
import p006l.kkh0;
import p006l.qzb0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class HotLauncherAct extends PutongAct {

    /* JADX INFO: renamed from: c */
    public boolean f1088c = false;

    /* JADX INFO: renamed from: com.p1.mobile.putong.api.HotLauncherAct$a */
    public class C0109a extends k3m {
        public C0109a() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a2 */
    public /* synthetic */ void m1313a2(c cVar) {
        if (cVar != c.i) {
            if (cVar == c.j) {
                this.f1088c = false;
            }
        } else {
            if (this.f1088c) {
                m1314Y1();
            }
            this.f1088c = true;
            m1317c2();
        }
    }

    /* JADX INFO: renamed from: Y1 */
    public final void m1314Y1() {
        if (this.f1088c) {
            m1315Z1();
        } else {
            this.f1088c = true;
        }
    }

    /* JADX INFO: renamed from: Z1 */
    public final void m1315Z1() {
        finish();
        overridePendingTransition(qzb0.f20175b, qzb0.f20176c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b2 */
    public final /* synthetic */ void m1316b2() {
        if (kkh0.m18152e().m18156d().m19275a((ViewGroup) getWindow().getDecorView(), "AD_SPLASH_HOT_START", "active", new C0109a())) {
            return;
        }
        m1315Z1();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: c2 */
    public final void m1317c2() {
        getWindow().getDecorView().post(new Runnable() { // from class: l.yel
            @Override // java.lang.Runnable
            public final void run() {
                this.f28183a.m1316b2();
            }
        });
    }

    @Override // com.p000p1.mobile.putong.app.PutongAct
    public void initSubscription() {
        super.initSubscription();
        k70.INSTANCE.m17987a("hotlanch");
        lifecycle().subscribe(mkd0.G(new e30() { // from class: l.xel
            public final void call(Object obj) {
                this.f27487a.m1313a2((c) obj);
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p000p1.mobile.putong.app.PutongAct
    public void preCreateView(Bundle bundle) {
        getWindow().getDecorView().setSystemUiVisibility(5894);
    }

    @Override // com.p000p1.mobile.putong.app.PutongAct
    public void setTheme() {
    }
}
