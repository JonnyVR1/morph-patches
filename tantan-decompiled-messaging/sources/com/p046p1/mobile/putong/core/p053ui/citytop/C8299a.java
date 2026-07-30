package com.p046p1.mobile.putong.core.p053ui.citytop;

import android.net.NetworkInfo;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import androidx.recyclerview.widget.C0605k;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Greeting;
import com.p046p1.mobile.putong.core.p053ui.citytop.C8299a;
import com.p046p1.mobile.putong.core.p053ui.greet.C8360d;
import com.p046p1.mobile.putong.data.Relationship;
import com.tantanapp.common.utils.ConnectivityReceiver;
import p147v.VImage;
import p149l.d30;
import p149l.d75;
import p149l.e30;
import p149l.jq2;
import p149l.mcr;
import p149l.mkd0;
import p149l.mqi0;
import p149l.q860;
import p149l.qer;
import p149l.r65;
import p149l.t0g0;
import p149l.vwb;
import p149l.w9j;
import p149l.zvf0;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.citytop.a */
/* JADX INFO: loaded from: classes10.dex */
public class C8299a extends jq2<d75> implements C8300b.a<Greeting> {

    /* JADX INFO: renamed from: a */
    public boolean f28714a;

    /* JADX INFO: renamed from: b */
    public final CityTopLikersAct f28715b;

    /* JADX INFO: renamed from: c */
    public C8300b<Greeting> f28716c;

    /* JADX INFO: renamed from: d */
    public int f28717d;

    /* JADX INFO: renamed from: e */
    public long f28718e;

    public C8299a(mcr mcrVar) {
        super(mcrVar);
        this.f28714a = false;
        this.f28715b = (CityTopLikersAct) mcrVar;
    }

    /* JADX INFO: renamed from: g0 */
    public static /* synthetic */ void m44590g0(Relationship relationship) {
    }

    /* JADX INFO: renamed from: i0 */
    public static /* synthetic */ void m44592i0(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o0 */
    public /* synthetic */ void m44596o0(Bundle bundle) {
        ((d75) this.viewModel).m110221d();
        ((d75) this.viewModel).m110220c(true, false);
        ((d75) this.viewModel).m110223f("城市封面好友申请");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p0 */
    public /* synthetic */ void m44597p0() {
        if (this.f28718e > 0) {
            r65.m178034l().f157895b.put(Long.valueOf(this.f28718e));
            r65.m178034l().m178041o();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q0 */
    public /* synthetic */ void m44598q0(NetworkInfo networkInfo) {
        if (CoreModule.f17545c.f19625Z0.m163907H3()) {
            return;
        }
        if (CoreModule.f17545c.f19625Z0.m163922W3() == 0) {
            CoreModule.f17545c.f19625Z0.m163926a4().subscribe(mkd0.m154950B());
        } else {
            m44603t0();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r0 */
    public /* synthetic */ void m44599r0(q860 q860Var) {
        if (this.f28718e == 0) {
            this.f28718e = mqi0.m155944o();
        }
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: Z */
    public void mo39469Z() {
        super.mo39469Z();
        CoreModule.f17545c.f19650h2.m142335B3();
        m44603t0();
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: a0 */
    public void mo39470a0() {
        super.mo39470a0();
        creates(new e30() { // from class: l.v65
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f180155a.m44596o0((Bundle) obj);
            }
        }, new d30() { // from class: l.w65
            @Override // p149l.d30
            public final void call() {
                this.f184809a.m44597p0();
            }
        });
        duringCreated(ConnectivityReceiver.m81290m()).skip(1).filter(new w9j() { // from class: l.x65
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(ConnectivityReceiver.m81284g());
            }
        }).subscribe(mkd0.m154955G(new e30() { // from class: l.y65
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f196523a.m44598q0((NetworkInfo) obj);
            }
        }));
        duringCreated(CoreModule.f17545c.f19650h2.f118816T).doOnNext(new e30() { // from class: l.z65
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f201886a.m44599r0((q860) obj);
            }
        }).subscribe(mkd0.m154955G(new e30() { // from class: l.a75
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f67839a.m44602s0((q860) obj);
            }
        }));
    }

    @Override // p149l.q0m
    public void destroy() {
    }

    /* JADX INFO: renamed from: m0 */
    public C0605k.e m44600m0() {
        if (this.f28716c == null) {
            this.f28716c = new C8300b<>(this);
        }
        return this.f28716c;
    }

    /* JADX INFO: renamed from: n0 */
    public final boolean m44601n0(Greeting greeting) {
        return CoreModule.f17545c.f19650h2.m142339F3(greeting.f20401id) == null;
    }

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ void m44602s0(q860 q860Var) {
        if (q860Var != null && vwb.m200296J(q860Var.f153135a) && !TextUtils.isEmpty(q860Var.f153136b.links.next)) {
            this.f28714a = false;
            return;
        }
        int iM173344d = q860Var == null ? 0 : q860Var.m173344d();
        this.f28717d = iM173344d;
        if (iM173344d > 0) {
            this.f28714a = !TextUtils.isEmpty(q860Var.f153136b.links.next);
        }
        if (((q860Var == null || vwb.m200296J(q860Var.f153135a)) ? 0 : q860Var.f153135a.size()) >= this.f28717d) {
            this.f28714a = false;
        }
        ((d75) this.viewModel).m110222e(q860Var);
    }

    /* JADX INFO: renamed from: t0 */
    public void m44603t0() {
        CoreModule.f17545c.f19650h2.m142338E3(false, r65.m178034l().f157895b.get().longValue(), this.f28715b.m44585Z1().m148509M());
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.citytop.C8300b.a
    /* JADX INFO: renamed from: u0, reason: merged with bridge method [inline-methods] */
    public void mo44608z(Greeting greeting, boolean z) {
        if (m44601n0(greeting)) {
            return;
        }
        zvf0.m220401w("e_city_cover_received_like_user_card", act().pageId(), vwb.m200311Y("cityc_greet_list_action_type", z ? "like" : "dislike"));
        if (qer.m174243n(this.f28715b, CoreModule.f17545c.f19639e0.m169430Pa(greeting.f20401id), z, false, false, "p_city_cover", null, new e30() { // from class: l.b75
            @Override // p149l.e30
            public final void call(Object obj) {
                C8299a.m44590g0((Relationship) obj);
            }
        }, new e30() { // from class: l.c75
            @Override // p149l.e30
            public final void call(Object obj) {
                C8299a.m44592i0((Throwable) obj);
            }
        }, this.f28715b.pageId(), null, "", "")) {
            m44606x0(greeting);
        } else {
            this.f28715b.m44585Z1().notifyDataSetChanged();
        }
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.citytop.C8300b.a
    /* JADX INFO: renamed from: x */
    public void mo44605x(View view, float f) {
        if (view instanceof CityTopItemView) {
            CityTopItemView cityTopItemView = (CityTopItemView) view;
            if (f > 0.0f) {
                cityTopItemView.f28704e.setAlpha(f);
                cityTopItemView.f28704e.setVisibility(0);
                cityTopItemView.f28703d.setVisibility(4);
                return;
            }
            VImage vImage = cityTopItemView.f28704e;
            if (f >= 0.0f) {
                vImage.setVisibility(4);
                cityTopItemView.f28703d.setVisibility(4);
            } else {
                vImage.setVisibility(4);
                cityTopItemView.f28703d.setVisibility(0);
                cityTopItemView.f28703d.setAlpha(-f);
            }
        }
    }

    /* JADX INFO: renamed from: x0 */
    public void m44606x0(Greeting greeting) {
        if (this.f28715b.m44585Z1().m148517U(greeting)) {
            CoreModule.f17545c.f19650h2.m142355V3(greeting.f20401id);
            this.f28717d--;
            if (this.f28715b.m44585Z1().m148516T() <= 0) {
                ((d75) this.viewModel).m110220c(false, this.f28715b.m44585Z1().m148516T() <= 0);
            }
        }
        int i = this.f28717d;
        V v2 = this.viewModel;
        if (i > 0) {
            ((d75) v2).m110223f(String.format("城市封面好友申请（%s）", t0g0.m186860a(i, 99L)));
        } else {
            ((d75) v2).m110223f("城市封面好友申请");
        }
    }

    /* JADX INFO: renamed from: y0 */
    public void m44607y0(Greeting greeting) {
        C8360d.m45900i(this.f28715b, greeting, "from_city_centre_received_like");
    }
}
