package com.p051p1.mobile.putong.core.newui.home.topitemweb;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.newui.home.topitemweb.TopItemWebFrag;
import com.p051p1.mobile.putong.core.newui.main.NewMainContextFrag;
import com.tantanapp.common.utils.NullChecker;
import p153l.a5j0;
import p153l.bnl0;
import p153l.gra;
import p153l.pf60;
import p153l.psd0;
import p153l.uxj0;
import p153l.v4j0;
import p153l.y20;
import p153l.z4j0;

/* JADX INFO: loaded from: classes11.dex */
public class TopItemWebFrag extends NewMainContextFrag {

    /* JADX INFO: renamed from: B */
    public z4j0 f24114B;

    /* JADX INFO: renamed from: C */
    public a5j0 f24115C;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.topitemweb.TopItemWebFrag$a */
    public class C8192a implements y20<uxj0> {
        public C8192a() {
        }

        @Override // p153l.y20
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(uxj0 uxj0Var) {
            bnl0.m105524M(TopItemWebFrag.this.f24115C.f68616c, !v4j0.m199706d());
        }
    }

    /* JADX INFO: renamed from: X4 */
    public static /* synthetic */ void m39876X4(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z4 */
    public /* synthetic */ void m39878Z4(uxj0 uxj0Var) {
        if (NullChecker.m82486a(this.f24115C) && NullChecker.m82486a(this.f24115C.f68620g)) {
            this.f24115C.f68620g.m45094S4("newOneOutofFourRefreshData");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a5 */
    public /* synthetic */ void m39879a5(Boolean bool) {
        if (!bool.booleanValue()) {
            mo30636J4().m152776k();
        } else {
            this.f24115C.m96232d();
            mo30636J4().m152777l();
        }
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: d4 */
    public void mo21582d4() {
        super.mo21582d4();
        this.f24114B = new z4j0(this);
        a5j0 a5j0Var = new a5j0(this);
        this.f24115C = a5j0Var;
        a5j0Var.mo22064i1(this.f24114B);
        this.f24114B.mo52715C(this.f24115C);
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: f4 */
    public void mo21584f4() {
        super.mo21584f4();
        this.f24114B.mo40473a0();
        duringCreated(CoreModule.f18264c.f20381e0.f89019E0).subscribe(psd0.m173596G(new C8192a()));
        duringCreated(CoreModule.f18264c.f20381e0.f89026F0).subscribe(psd0.m173597H(new y20() { // from class: l.w4j0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f187414a.m39878Z4((uxj0) obj);
            }
        }, new y20() { // from class: l.x4j0
            @Override // p153l.y20
            public final void call(Object obj) {
                TopItemWebFrag.m39876X4((Throwable) obj);
            }
        }));
    }

    @Override // com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: g4 */
    public void mo21585g4(Bundle bundle) {
        super.mo21585g4(bundle);
        this.f24115C.m96233r();
        m30638L4().subscribe(psd0.m173596G(new y20() { // from class: l.y4j0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f197473a.m39879a5((Boolean) obj);
            }
        }));
    }

    @Override // com.p051p1.mobile.android.app.Frag
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f24115C.inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: n4 */
    public void mo21593n4(Bundle bundle) {
        this.pageHelper.m152781p(pf60.m172085a("source", "homepage"), pf60.m172085a("title_name", gra.m131689h0().title), pf60.m172085a("enter_by_default", v4j0.m199705c() ? "1" : "0"));
        super.mo21593n4(bundle);
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean z) {
        super.onHiddenChanged(z);
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag, p153l.e6m
    public String pageId() {
        return "p_choose";
    }
}
