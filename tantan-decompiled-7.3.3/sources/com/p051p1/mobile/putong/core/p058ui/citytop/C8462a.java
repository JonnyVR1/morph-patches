package com.p051p1.mobile.putong.core.p058ui.citytop;

import android.net.NetworkInfo;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import androidx.recyclerview.widget.C0607k;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Greeting;
import com.p051p1.mobile.putong.core.p058ui.citytop.C8462a;
import com.p051p1.mobile.putong.core.p058ui.greet.C8523d;
import com.p051p1.mobile.putong.data.Relationship;
import com.tantanapp.common.utils.ConnectivityReceiver;
import p151v.VImage;
import p153l.a9g0;
import p153l.ar2;
import p153l.e85;
import p153l.i4g0;
import p153l.jyb;
import p153l.ner;
import p153l.psd0;
import p153l.pzi0;
import p153l.qcj;
import p153l.rgr;
import p153l.s75;
import p153l.vg60;
import p153l.x20;
import p153l.y20;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.citytop.a */
/* JADX INFO: loaded from: classes9.dex */
public class C8462a extends ar2<e85> implements C8463b.a<Greeting> {

    /* JADX INFO: renamed from: a */
    public boolean f29562a;

    /* JADX INFO: renamed from: b */
    public final CityTopLikersAct f29563b;

    /* JADX INFO: renamed from: c */
    public C8463b<Greeting> f29564c;

    /* JADX INFO: renamed from: d */
    public int f29565d;

    /* JADX INFO: renamed from: e */
    public long f29566e;

    public C8462a(ner nerVar) {
        super(nerVar);
        this.f29562a = false;
        this.f29563b = (CityTopLikersAct) nerVar;
    }

    /* JADX INFO: renamed from: g0 */
    public static /* synthetic */ void m45773g0(Relationship relationship) {
    }

    /* JADX INFO: renamed from: i0 */
    public static /* synthetic */ void m45775i0(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o0 */
    public /* synthetic */ void m45779o0(Bundle bundle) {
        ((e85) this.viewModel).m119802d();
        ((e85) this.viewModel).m119801c(true, false);
        ((e85) this.viewModel).m119804f("城市封面好友申请");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p0 */
    public /* synthetic */ void m45780p0() {
        if (this.f29566e > 0) {
            s75.m184964l().f166646b.put(Long.valueOf(this.f29566e));
            s75.m184964l().m184971o();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q0 */
    public /* synthetic */ void m45781q0(NetworkInfo networkInfo) {
        if (CoreModule.f18264c.f20367Z0.m210765H3()) {
            return;
        }
        if (CoreModule.f18264c.f20367Z0.m210780W3() == 0) {
            CoreModule.f18264c.f20367Z0.m210784a4().subscribe(psd0.m173591B());
        } else {
            m45786t0();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r0 */
    public /* synthetic */ void m45782r0(vg60 vg60Var) {
        if (this.f29566e == 0) {
            this.f29566e = pzi0.m174454o();
        }
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: Z */
    public void mo40472Z() {
        super.mo40472Z();
        CoreModule.f18264c.f20392h2.m164071B3();
        m45786t0();
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: a0 */
    public void mo40473a0() {
        super.mo40473a0();
        creates(new y20() { // from class: l.w75
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f187705a.m45779o0((Bundle) obj);
            }
        }, new x20() { // from class: l.x75
            @Override // p153l.x20
            public final void call() {
                this.f192670a.m45780p0();
            }
        });
        duringCreated(ConnectivityReceiver.m82473m()).skip(1).filter(new qcj() { // from class: l.y75
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(ConnectivityReceiver.m82467g());
            }
        }).subscribe(psd0.m173596G(new y20() { // from class: l.z75
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f203219a.m45781q0((NetworkInfo) obj);
            }
        }));
        duringCreated(CoreModule.f18264c.f20392h2.f142917T).doOnNext(new y20() { // from class: l.a85
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f68887a.m45782r0((vg60) obj);
            }
        }).subscribe(psd0.m173596G(new y20() { // from class: l.b85
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f75396a.m45785s0((vg60) obj);
            }
        }));
    }

    @Override // p153l.k3m
    public void destroy() {
    }

    /* JADX INFO: renamed from: m0 */
    public C0607k.e m45783m0() {
        if (this.f29564c == null) {
            this.f29564c = new C8463b<>(this);
        }
        return this.f29564c;
    }

    /* JADX INFO: renamed from: n0 */
    public final boolean m45784n0(Greeting greeting) {
        return CoreModule.f18264c.f20392h2.m164075F3(greeting.f21143id) == null;
    }

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ void m45785s0(vg60 vg60Var) {
        if (vg60Var != null && jyb.m147479J(vg60Var.f184001a) && !TextUtils.isEmpty(vg60Var.f184002b.links.next)) {
            this.f29562a = false;
            return;
        }
        int iM201222d = vg60Var == null ? 0 : vg60Var.m201222d();
        this.f29565d = iM201222d;
        if (iM201222d > 0) {
            this.f29562a = !TextUtils.isEmpty(vg60Var.f184002b.links.next);
        }
        if (((vg60Var == null || jyb.m147479J(vg60Var.f184001a)) ? 0 : vg60Var.f184001a.size()) >= this.f29565d) {
            this.f29562a = false;
        }
        ((e85) this.viewModel).m119803e(vg60Var);
    }

    /* JADX INFO: renamed from: t0 */
    public void m45786t0() {
        CoreModule.f18264c.f20392h2.m164074E3(false, s75.m184964l().f166646b.get().longValue(), this.f29563b.m45768a2().m157181M());
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.citytop.C8463b.a
    /* JADX INFO: renamed from: u0, reason: merged with bridge method [inline-methods] */
    public void mo45791z(Greeting greeting, boolean z) {
        if (m45784n0(greeting)) {
            return;
        }
        i4g0.m138525w("e_city_cover_received_like_user_card", act().pageId(), jyb.m147494Y("cityc_greet_list_action_type", z ? "like" : "dislike"));
        if (rgr.m181477n(this.f29563b, CoreModule.f18264c.f20381e0.m116503Pa(greeting.f21143id), z, false, false, "p_city_cover", null, new y20() { // from class: l.c85
            @Override // p153l.y20
            public final void call(Object obj) {
                C8462a.m45773g0((Relationship) obj);
            }
        }, new y20() { // from class: l.d85
            @Override // p153l.y20
            public final void call(Object obj) {
                C8462a.m45775i0((Throwable) obj);
            }
        }, this.f29563b.pageId(), null, "", "")) {
            m45789x0(greeting);
        } else {
            this.f29563b.m45768a2().notifyDataSetChanged();
        }
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.citytop.C8463b.a
    /* JADX INFO: renamed from: x */
    public void mo45788x(View view, float f) {
        if (view instanceof CityTopItemView) {
            CityTopItemView cityTopItemView = (CityTopItemView) view;
            if (f > 0.0f) {
                cityTopItemView.f29552e.setAlpha(f);
                cityTopItemView.f29552e.setVisibility(0);
                cityTopItemView.f29551d.setVisibility(4);
                return;
            }
            VImage vImage = cityTopItemView.f29552e;
            if (f >= 0.0f) {
                vImage.setVisibility(4);
                cityTopItemView.f29551d.setVisibility(4);
            } else {
                vImage.setVisibility(4);
                cityTopItemView.f29551d.setVisibility(0);
                cityTopItemView.f29551d.setAlpha(-f);
            }
        }
    }

    /* JADX INFO: renamed from: x0 */
    public void m45789x0(Greeting greeting) {
        if (this.f29563b.m45768a2().m157189U(greeting)) {
            CoreModule.f18264c.f20392h2.m164091V3(greeting.f21143id);
            this.f29565d--;
            if (this.f29563b.m45768a2().m157188T() <= 0) {
                ((e85) this.viewModel).m119801c(false, this.f29563b.m45768a2().m157188T() <= 0);
            }
        }
        int i = this.f29565d;
        V v2 = this.viewModel;
        if (i > 0) {
            ((e85) v2).m119804f(String.format("城市封面好友申请（%s）", a9g0.m96566a(i, 99L)));
        } else {
            ((e85) v2).m119804f("城市封面好友申请");
        }
    }

    /* JADX INFO: renamed from: y0 */
    public void m45790y0(Greeting greeting) {
        C8523d.m47083i(this.f29563b, greeting, "from_city_centre_received_like");
    }
}
