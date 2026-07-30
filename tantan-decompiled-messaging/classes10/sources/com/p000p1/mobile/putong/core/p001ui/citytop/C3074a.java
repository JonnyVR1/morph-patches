package com.p000p1.mobile.putong.core.p001ui.citytop;

import android.net.NetworkInfo;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import androidx.recyclerview.widget.k;
import com.p000p1.mobile.putong.core.data.Greeting;
import com.p000p1.mobile.putong.core.p001ui.citytop.C3074a;
import com.p000p1.mobile.putong.core.p001ui.greet.C3135d;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.data.LikeExtraData;
import com.p1.mobile.putong.data.Relationship;
import com.tantanapp.common.utils.ConnectivityReceiver;
import l.d30;
import l.e30;
import l.j760;
import l.jq2;
import l.mcr;
import l.mkd0;
import l.mqi0;
import l.q860;
import l.qer;
import l.r65;
import l.s7m;
import l.t0g0;
import l.vwb;
import l.w9j;
import l.x9j;
import l.zvf0;
import p003l.d75;
import v.VImage;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.citytop.a */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class C3074a extends jq2<d75> implements C3075b.a<Greeting> {

    /* JADX INFO: renamed from: a */
    public boolean f1108a;

    /* JADX INFO: renamed from: b */
    public final CityTopLikersAct f1109b;

    /* JADX INFO: renamed from: c */
    public C3075b<Greeting> f1110c;

    /* JADX INFO: renamed from: d */
    public int f1111d;

    /* JADX INFO: renamed from: e */
    public long f1112e;

    public C3074a(mcr mcrVar) {
        super(mcrVar);
        this.f1108a = false;
        this.f1109b = (CityTopLikersAct) mcrVar;
    }

    /* JADX INFO: renamed from: g0 */
    public static /* synthetic */ void m1894g0(Relationship relationship) {
    }

    /* JADX INFO: renamed from: i0 */
    public static /* synthetic */ void m1896i0(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o0 */
    public /* synthetic */ void m1900o0(Bundle bundle) {
        ((d75) ((jq2) this).viewModel).m6084d();
        ((d75) ((jq2) this).viewModel).m6083c(true, false);
        ((d75) ((jq2) this).viewModel).m6086f("城市封面好友申请");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p0 */
    public /* synthetic */ void m1901p0() {
        if (this.f1112e > 0) {
            r65.l().b.put(Long.valueOf(this.f1112e));
            r65.l().o();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q0 */
    public /* synthetic */ void m1902q0(NetworkInfo networkInfo) {
        if (CoreModule.c.Z0.H3()) {
            return;
        }
        if (CoreModule.c.Z0.W3() == 0) {
            CoreModule.c.Z0.a4().subscribe(mkd0.B());
        } else {
            m1909t0();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r0 */
    public /* synthetic */ void m1903r0(q860 q860Var) {
        if (this.f1112e == 0) {
            this.f1112e = mqi0.o();
        }
    }

    /* JADX INFO: renamed from: Z */
    public void m1904Z() {
        super.Z();
        CoreModule.c.h2.B3();
        m1909t0();
    }

    /* JADX INFO: renamed from: a0 */
    public void m1905a0() {
        super.a0();
        creates(new e30() { // from class: l.v65
            public final void call(Object obj) {
                this.f7897a.m1900o0((Bundle) obj);
            }
        }, new d30() { // from class: l.w65
            public final void call() {
                this.f8126a.m1901p0();
            }
        });
        duringCreated(ConnectivityReceiver.m()).skip(1).filter(new w9j() { // from class: l.x65
            public final Object call(Object obj) {
                return Boolean.valueOf(ConnectivityReceiver.g());
            }
        }).subscribe(mkd0.G(new e30() { // from class: l.y65
            public final void call(Object obj) {
                this.f8999a.m1902q0((NetworkInfo) obj);
            }
        }));
        duringCreated(CoreModule.c.h2.T).doOnNext(new e30() { // from class: l.z65
            public final void call(Object obj) {
                this.f9191a.m1903r0((q860) obj);
            }
        }).subscribe(mkd0.G(new e30() { // from class: l.a75
            public final void call(Object obj) {
                this.f2738a.m1908s0((q860) obj);
            }
        }));
    }

    public void destroy() {
    }

    /* JADX INFO: renamed from: m0 */
    public k.e m1906m0() {
        if (this.f1110c == null) {
            this.f1110c = new C3075b<>(this);
        }
        return this.f1110c;
    }

    /* JADX INFO: renamed from: n0 */
    public final boolean m1907n0(Greeting greeting) {
        return CoreModule.c.h2.F3(greeting.f63id) == null;
    }

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ void m1908s0(q860 q860Var) {
        if (q860Var != null && vwb.J(q860Var.a) && !TextUtils.isEmpty(q860Var.b.links.next)) {
            this.f1108a = false;
            return;
        }
        int iD = q860Var == null ? 0 : q860Var.d();
        this.f1111d = iD;
        if (iD > 0) {
            this.f1108a = !TextUtils.isEmpty(q860Var.b.links.next);
        }
        if (((q860Var == null || vwb.J(q860Var.a)) ? 0 : q860Var.a.size()) >= this.f1111d) {
            this.f1108a = false;
        }
        ((d75) ((jq2) this).viewModel).m6085e(q860Var);
    }

    /* JADX INFO: renamed from: t0 */
    public void m1909t0() {
        CoreModule.c.h2.E3(false, ((Long) r65.l().b.get()).longValue(), this.f1109b.m1889Z1().m7687M());
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.citytop.C3075b.a
    /* JADX INFO: renamed from: u0, reason: merged with bridge method [inline-methods] */
    public void mo1914z(Greeting greeting, boolean z) {
        if (m1907n0(greeting)) {
            return;
        }
        zvf0.w("e_city_cover_received_like_user_card", act().pageId(), new j760[]{vwb.Y("cityc_greet_list_action_type", z ? "like" : "dislike")});
        if (qer.n(this.f1109b, CoreModule.c.e0.Pa(greeting.f63id), z, false, false, "p_city_cover", (x9j) null, new e30() { // from class: l.b75
            public final void call(Object obj) {
                C3074a.m1894g0((Relationship) obj);
            }
        }, new e30() { // from class: l.c75
            public final void call(Object obj) {
                C3074a.m1896i0((Throwable) obj);
            }
        }, this.f1109b.pageId(), (LikeExtraData) null, "", "")) {
            m1912x0(greeting);
        } else {
            this.f1109b.m1889Z1().notifyDataSetChanged();
        }
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.citytop.C3075b.a
    /* JADX INFO: renamed from: x */
    public void mo1911x(View view, float f) {
        if (view instanceof CityTopItemView) {
            CityTopItemView cityTopItemView = (CityTopItemView) view;
            if (f > 0.0f) {
                cityTopItemView.f1098e.setAlpha(f);
                cityTopItemView.f1098e.setVisibility(0);
                cityTopItemView.f1097d.setVisibility(4);
                return;
            }
            VImage vImage = cityTopItemView.f1098e;
            if (f >= 0.0f) {
                vImage.setVisibility(4);
                cityTopItemView.f1097d.setVisibility(4);
            } else {
                vImage.setVisibility(4);
                cityTopItemView.f1097d.setVisibility(0);
                cityTopItemView.f1097d.setAlpha(-f);
            }
        }
    }

    /* JADX INFO: renamed from: x0 */
    public void m1912x0(Greeting greeting) {
        if (this.f1109b.m1889Z1().m7695U(greeting)) {
            CoreModule.c.h2.V3(greeting.f63id);
            this.f1111d--;
            if (this.f1109b.m1889Z1().m7694T() <= 0) {
                ((d75) ((jq2) this).viewModel).m6083c(false, this.f1109b.m1889Z1().m7694T() <= 0);
            }
        }
        int i = this.f1111d;
        s7m s7mVar = ((jq2) this).viewModel;
        if (i > 0) {
            ((d75) s7mVar).m6086f(String.format("城市封面好友申请（%s）", t0g0.a(i, 99L)));
        } else {
            ((d75) s7mVar).m6086f("城市封面好友申请");
        }
    }

    /* JADX INFO: renamed from: y0 */
    public void m1913y0(Greeting greeting) {
        C3135d.m3246i(this.f1109b, greeting, "from_city_centre_received_like");
    }
}
