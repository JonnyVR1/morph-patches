package com.p000p1.mobile.putong.core.newui.home.topitemweb;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.core.newui.home.topitemweb.TopItemWebFrag;
import com.p000p1.mobile.putong.core.newui.main.NewMainContextFrag;
import com.p1.mobile.putong.app.PutongFrag;
import com.p1.mobile.putong.core.CoreModule;
import com.tantanapp.common.utils.NullChecker;
import l.e30;
import l.j760;
import l.mkd0;
import l.roj0;
import l.upa;
import l.xdl0;
import p009l.rvi0;
import p009l.vvi0;
import p009l.wvi0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class TopItemWebFrag extends NewMainContextFrag {

    /* JADX INFO: renamed from: B */
    public vvi0 f2150B;

    /* JADX INFO: renamed from: C */
    public wvi0 f2151C;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.topitemweb.TopItemWebFrag$a */
    public class C0205a implements e30<roj0> {
        public C0205a() {
        }

        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(roj0 roj0Var) {
            xdl0.M(TopItemWebFrag.this.f2151C.f22339c, !rvi0.m21823d());
        }
    }

    /* JADX INFO: renamed from: X4 */
    public static /* synthetic */ void m2876X4(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z4 */
    public /* synthetic */ void m2878Z4(roj0 roj0Var) {
        if (NullChecker.a(this.f2151C) && NullChecker.a(this.f2151C.f22343g)) {
            this.f2151C.f22343g.S4("newOneOutofFourRefreshData");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a5 */
    public /* synthetic */ void m2879a5(Boolean bool) {
        if (!bool.booleanValue()) {
            J4().k();
        } else {
            this.f2151C.m24578d();
            J4().l();
        }
    }

    /* JADX INFO: renamed from: d4 */
    public void m2880d4() {
        super/*com.p1.mobile.putong.app.PutongFrag*/.d4();
        this.f2150B = new vvi0(this);
        wvi0 wvi0Var = new wvi0(this);
        this.f2151C = wvi0Var;
        wvi0Var.m24579i1(this.f2150B);
        this.f2150B.C(this.f2151C);
    }

    /* JADX INFO: renamed from: f4 */
    public void m2881f4() {
        super/*com.p1.mobile.putong.app.PutongFrag*/.f4();
        this.f2150B.a0();
        duringCreated(CoreModule.c.e0.E0).subscribe(mkd0.G(new C0205a()));
        duringCreated(CoreModule.c.e0.F0).subscribe(mkd0.H(new e30() { // from class: l.svi0
            public final void call(Object obj) {
                this.f20483a.m2878Z4((roj0) obj);
            }
        }, new e30() { // from class: l.tvi0
            public final void call(Object obj) {
                TopItemWebFrag.m2876X4((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: g4 */
    public void m2882g4(Bundle bundle) {
        super/*com.p1.mobile.android.app.Frag*/.g4(bundle);
        this.f2151C.m24580r();
        L4().subscribe(mkd0.G(new e30() { // from class: l.uvi0
            public final void call(Object obj) {
                this.f21351a.m2879a5((Boolean) obj);
            }
        }));
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f2151C.inflateView(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: n4 */
    public void m2883n4(Bundle bundle) {
        ((PutongFrag) this).pageHelper.p(new j760[]{j760.a("source", "homepage"), j760.a("title_name", upa.h0().title), j760.a("enter_by_default", rvi0.m21822c() ? "1" : "0")});
        super/*com.p1.mobile.android.app.Frag*/.n4(bundle);
    }

    public void onHiddenChanged(boolean z) {
        super/*com.p1.mobile.putong.app.PutongFrag*/.onHiddenChanged(z);
    }

    public String pageId() {
        return "p_choose";
    }
}
