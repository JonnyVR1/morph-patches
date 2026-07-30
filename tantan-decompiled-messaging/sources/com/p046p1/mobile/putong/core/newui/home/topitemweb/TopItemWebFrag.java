package com.p046p1.mobile.putong.core.newui.home.topitemweb;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.newui.home.topitemweb.TopItemWebFrag;
import com.p046p1.mobile.putong.core.newui.main.NewMainContextFrag;
import com.tantanapp.common.utils.NullChecker;
import p149l.e30;
import p149l.j760;
import p149l.mkd0;
import p149l.roj0;
import p149l.rvi0;
import p149l.upa;
import p149l.vvi0;
import p149l.wvi0;
import p149l.xdl0;

/* JADX INFO: loaded from: classes11.dex */
public class TopItemWebFrag extends NewMainContextFrag {

    /* JADX INFO: renamed from: B */
    public vvi0 f23372B;

    /* JADX INFO: renamed from: C */
    public wvi0 f23373C;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.topitemweb.TopItemWebFrag$a */
    public class C8041a implements e30<roj0> {
        public C8041a() {
        }

        @Override // p149l.e30
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(roj0 roj0Var) {
            xdl0.m208344M(TopItemWebFrag.this.f23373C.f188256c, !rvi0.m181293d());
        }
    }

    /* JADX INFO: renamed from: X4 */
    public static /* synthetic */ void m38873X4(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z4 */
    public /* synthetic */ void m38875Z4(roj0 roj0Var) {
        if (NullChecker.m81303a(this.f23373C) && NullChecker.m81303a(this.f23373C.f188260g)) {
            this.f23373C.f188260g.m43908S4("newOneOutofFourRefreshData");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a5 */
    public /* synthetic */ void m38876a5(Boolean bool) {
        if (!bool.booleanValue()) {
            mo29638J4().m109035k();
        } else {
            this.f23373C.m205745d();
            mo29638J4().m109036l();
        }
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: d4 */
    public void mo20583d4() {
        super.mo20583d4();
        this.f23372B = new vvi0(this);
        wvi0 wvi0Var = new wvi0(this);
        this.f23373C = wvi0Var;
        wvi0Var.mo21065i1(this.f23372B);
        this.f23372B.mo51532C(this.f23373C);
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: f4 */
    public void mo20585f4() {
        super.mo20585f4();
        this.f23372B.mo39470a0();
        duringCreated(CoreModule.f17545c.f19639e0.f149162E0).subscribe(mkd0.m154955G(new C8041a()));
        duringCreated(CoreModule.f17545c.f19639e0.f149169F0).subscribe(mkd0.m154956H(new e30() { // from class: l.svi0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f166577a.m38875Z4((roj0) obj);
            }
        }, new e30() { // from class: l.tvi0
            @Override // p149l.e30
            public final void call(Object obj) {
                TopItemWebFrag.m38873X4((Throwable) obj);
            }
        }));
    }

    @Override // com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: g4 */
    public void mo20586g4(Bundle bundle) {
        super.mo20586g4(bundle);
        this.f23373C.m205746r();
        m29640L4().subscribe(mkd0.m154955G(new e30() { // from class: l.uvi0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f178536a.m38876a5((Boolean) obj);
            }
        }));
    }

    @Override // com.p046p1.mobile.android.app.Frag
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f23373C.inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: n4 */
    public void mo20594n4(Bundle bundle) {
        this.pageHelper.m109040p(j760.m140076a("source", "homepage"), j760.m140076a("title_name", upa.m194758h0().title), j760.m140076a("enter_by_default", rvi0.m181292c() ? "1" : "0"));
        super.mo20594n4(bundle);
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean z) {
        super.onHiddenChanged(z);
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag, p149l.n3m
    public String pageId() {
        return "p_choose";
    }
}
