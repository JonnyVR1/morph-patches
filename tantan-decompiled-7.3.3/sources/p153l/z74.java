package p153l;

import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import com.p051p1.mobile.putong.live.base.data.BLiveCall;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.p051p1.mobile.putong.live.livingroom.archi.dialogcenter.LiveDialogEnum;
import com.p051p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveCallMessage;
import com.p051p1.mobile.putong.live.livingroom.common.usercard.bean.UserCardData;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class z74 extends i6t<oo2, o24> {

    /* JADX INFO: renamed from: i */
    public r2s f203217i;

    /* JADX INFO: renamed from: j */
    public HashMap<String, BLiveCall> f203218j;

    public z74(dum dumVar, FrameLayout frameLayout, r2s r2sVar) {
        super(dumVar);
        this.f203218j = new HashMap<>();
        this.f203217i = r2sVar;
        o24 o24Var = new o24();
        mo52715C(o24Var);
        m218845f4(frameLayout, o24Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A4 */
    public /* synthetic */ void m218814A4(h1e h1eVar) {
        m218854o4();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r6v0, types: [l.oo2] */
    /* JADX WARN: Type inference failed for: r6v13, types: [l.oo2] */
    /* JADX WARN: Type inference failed for: r6v4, types: [l.oo2] */
    /* JADX WARN: Type inference failed for: r6v9, types: [l.oo2] */
    /* JADX INFO: renamed from: D4 */
    public void m218815D4(String str) {
        BLiveCall bLiveCallM178263f = this.f203217i.m161648Z3().m178263f(str);
        if (u54.m194525e(bLiveCallM178263f)) {
            m213811F2().OpenUserCardDialogEvent.show().mo199273j(UserCardData.builder(4400).userId(str).giftSource(u54.m194528h(bLiveCallM178263f) ? "callVideoVice" : "callVoiceVice").setFromIdentity(csq.m112227a(this, m213810E2().m168532l0().f56859id, str, 4400)).setTo(csq.m112230d(this, m213810E2().m168532l0().f56859id, str, 4400)).setSource("live").setScene("call").trackFrom("liveRoom").build());
        } else {
            m213811F2().OpenUserCardDialogEvent.show().mo199273j(UserCardData.builder(4400).userId(str).setFromIdentity(csq.m112227a(this, m213810E2().m168532l0().f56859id, str, 4400)).setTo(csq.m112230d(this, m213810E2().m168532l0().f56859id, str, 4400)).setSource("live").setScene("call").trackFrom("liveRoom").build());
        }
    }

    /* JADX INFO: renamed from: G4 */
    private void m218816G4(List<d3q<?>> list) {
        ((o24) this.viewModel).m165699k(list);
    }

    /* JADX INFO: renamed from: I4 */
    private void m218817I4() {
        m213811F2().CallEvent.updateCallNum().mo199274m(Integer.valueOf(jyb.m147522n(this.f203218j.values(), new qcj() { // from class: l.w74
            @Override // p153l.qcj
            public final Object call(Object obj) {
                BLiveCall bLiveCall = (BLiveCall) obj;
                return Boolean.valueOf((u54.m194528h(bLiveCall) || u54.m194529i(bLiveCall)) ? false : true);
            }
        }).size()));
    }

    /* JADX INFO: renamed from: O3 */
    public static /* synthetic */ Boolean m218823O3(BLiveCall bLiveCall, d3q d3qVar) {
        return d3qVar instanceof qop0 ? Boolean.valueOf(TextUtils.equals(((qop0) d3qVar).f158745a, bLiveCall.f45190id)) : Boolean.FALSE;
    }

    private boolean isShowing() {
        return m213814K2().m189699f(LiveDialogEnum.CALL_ANCHOR_CHECK_DIALOG);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r4 */
    public void m218836r4(qvd qvdVar) {
        int i = qvdVar.f159736e;
        if (i == 3) {
            if (qvdVar.m178272o()) {
                m218839E4(qvdVar.f159735d);
            }
        } else if (i == 4 && qvdVar.m178272o()) {
            m218844e4(qvdVar.f159735d);
        }
    }

    /* JADX INFO: renamed from: B4 */
    public final /* synthetic */ Boolean m218837B4(b45 b45Var) {
        return Boolean.valueOf(m218855p4() > 0);
    }

    /* JADX INFO: renamed from: C4 */
    public final void m218838C4(BLiveCall bLiveCall, h64 h64Var, qop0 qop0Var) {
        m218841H4(bLiveCall, qop0Var);
        this.f203217i.m179565z4(new y34(bLiveCall, h64Var));
    }

    /* JADX INFO: renamed from: E4 */
    public void m218839E4(BLiveCall bLiveCall) {
        this.f203218j.remove(bLiveCall.f45190id);
        m218817I4();
        if (isShowing()) {
            ((o24) this.viewModel).m165698j(m218852m4(bLiveCall));
        }
    }

    /* JADX INFO: renamed from: F4 */
    public final void m218840F4(j2s j2sVar) {
        this.f203218j.clear();
        jyb.m147537z(j2sVar.m143253m(), new y20() { // from class: l.m74
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f135055a.m218864z4((BLiveCall) obj);
            }
        });
        m218817I4();
        this.f203217i.m219456e5(m218851l4(j2sVar));
        m218816G4(m218847h4(j2sVar));
    }

    /* JADX INFO: renamed from: H4 */
    public final void m218841H4(BLiveCall bLiveCall, qop0 qop0Var) {
        qop0Var.m177319S(bLiveCall);
        ((o24) this.viewModel).m165697i(qop0Var);
    }

    /* JADX INFO: renamed from: c4 */
    public final void m218842c4(BLiveCall bLiveCall, h64 h64Var) {
        this.f203218j.put(bLiveCall.f45190id, bLiveCall);
        m218817I4();
        if (isShowing()) {
            List<d3q<?>> listM165695d = ((o24) this.viewModel).m165695d();
            int i = 0;
            int i2 = 0;
            for (int i3 = 0; i3 < listM165695d.size(); i3++) {
                if (listM165695d.get(i3) instanceof qop0) {
                    if (!u54.m194525e(((qop0) listM165695d.get(i3)).m177313J())) {
                        if (i3 != 0) {
                            i = i3 - 1;
                        }
                        m218816G4(new ArrayList(m218843d4(bLiveCall, h64Var, i)));
                    } else if (i3 == listM165695d.size() - 2) {
                        i2 = i3 + 1;
                    }
                }
            }
            i = i2;
            m218816G4(new ArrayList(m218843d4(bLiveCall, h64Var, i)));
        }
    }

    /* JADX INFO: renamed from: d4 */
    public final List<d3q<?>> m218843d4(BLiveCall bLiveCall, h64 h64Var, int i) {
        List<d3q<?>> listM165695d = ((o24) this.viewModel).m165695d();
        listM165695d.add(i, m218850k4(bLiveCall, h64Var));
        return listM165695d;
    }

    /* JADX INFO: renamed from: e4 */
    public final void m218844e4(BLiveCall bLiveCall) {
        this.f203218j.put(bLiveCall.f45190id, bLiveCall);
        m218817I4();
        if (isShowing()) {
            m218848i4();
            List<BLiveCall> listM178269l = this.f203217i.m161648Z3().m178269l();
            for (int i = 0; i < listM178269l.size(); i++) {
                List<d3q<?>> listM218843d4 = m218843d4(listM178269l.get(i), this.f203217i.m161648Z3().m178270m().m143251k(listM178269l.get(i).user), i);
                if (i == listM178269l.size() - 1) {
                    m218816G4(new ArrayList(listM218843d4));
                }
            }
        }
    }

    /* JADX INFO: renamed from: f4 */
    public final void m218845f4(FrameLayout frameLayout, o24 o24Var) {
        View viewM165696e = o24Var.m165696e();
        int i = bnl0.f77544e;
        frameLayout.addView(viewM165696e, new FrameLayout.LayoutParams(i, i));
    }

    /* JADX INFO: renamed from: g4 */
    public void m218846g4(final qop0 qop0Var) {
        duringCreated(LivingNormalApiProvider.m72366B3(qop0Var.m177313J().f45190id)).subscribe(dhw.m115826e(new y20() { // from class: l.o74
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f145233a.m218859u4(qop0Var, (BLiveCall) obj);
            }
        }, new y20() { // from class: l.p74
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f150896a.m218858t4((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: h4 */
    public final List<d3q<?>> m218847h4(final j2s j2sVar) {
        return jyb.m147486Q(j2sVar.m143253m(), new qcj() { // from class: l.n74
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f140573a.m218860v4(j2sVar, (BLiveCall) obj);
            }
        });
    }

    /* JADX INFO: renamed from: i4 */
    public final void m218848i4() {
        List<d3q<?>> listM165695d = ((o24) this.viewModel).m165695d();
        ArrayList arrayList = new ArrayList(listM165695d);
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i) instanceof qop0) {
                qop0 qop0Var = (qop0) arrayList.get(i);
                if (this.f203217i.m161648Z3().m178262e(qop0Var.m177313J().f45190id) != null) {
                    listM165695d.remove(qop0Var);
                }
            }
        }
    }

    /* JADX INFO: renamed from: j4 */
    public void m218849j4(final qop0 qop0Var) {
        new th0.C20312a(act()).m191151j(this.f196919f.getString(R$string.f48007c1, qop0Var.m177314K().f107998b)).m191157p(n9c0.f140855p0).m191158q(R$string.f47985b1).m191156o(new View.OnClickListener() { // from class: l.k74
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f124237a.m218861w4(qop0Var, view);
            }
        }).m191145d(n9c0.f140804X0).m191146e(R$string.f47690N1).m191142a().m191141g();
    }

    /* JADX INFO: renamed from: k4 */
    public final qop0 m218850k4(BLiveCall bLiveCall, h64 h64Var) {
        return new qop0(bLiveCall, h64Var).m177316P(new y20() { // from class: l.x74
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f192668a.m218849j4((qop0) obj);
            }
        }).m177318R(new y20() { // from class: l.y74
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f197739a.m218853n4((qop0) obj);
            }
        }).m177317Q(new y20() { // from class: l.g74
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f102507a.m218815D4((String) obj);
            }
        });
    }

    /* JADX INFO: renamed from: l4 */
    public final j2s m218851l4(j2s j2sVar) {
        return new j2s(j2sVar, "on-video", "on-voice");
    }

    /* JADX INFO: renamed from: m4 */
    public final qop0 m218852m4(final BLiveCall bLiveCall) {
        return (qop0) jyb.m147529r(((o24) this.viewModel).m165695d(), new qcj() { // from class: l.j74
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return z74.m218823O3(bLiveCall, (d3q) obj);
            }
        });
    }

    @Override // p153l.i6t, p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: n */
    public void mo70300n() {
        super.mo70300n();
        this.f203218j.clear();
        m213811F2().CallEvent.updateCallNum().mo199274m(0);
    }

    /* JADX INFO: renamed from: n4 */
    public final void m218853n4(final qop0 qop0Var) {
        new th0.C20312a(act()).m191151j(this.f196919f.getString(R$string.f48337r2, qop0Var.m177314K().f107998b)).m191157p(n9c0.f140855p0).m191158q(R$string.f48271o2).m191156o(new View.OnClickListener() { // from class: l.l74
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f130319a.m218862x4(qop0Var, view);
            }
        }).m191145d(n9c0.f140804X0).m191146e(R$string.f47690N1).m191142a().m191141g();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.oo2, l.vp20] */
    /* JADX INFO: renamed from: o4 */
    public final void m218854o4() {
        duringCreated(LivingNormalApiProvider.m72456L3(m213810E2().m202191k())).subscribe(dhw.m115826e(new y20() { // from class: l.h74
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f108090a.m218840F4((j2s) obj);
            }
        }, new y20() { // from class: l.i74
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f113234a.m218863y4((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: p4 */
    public int m218855p4() {
        return this.f203218j.size();
    }

    /* JADX INFO: renamed from: q4 */
    public final void m218856q4(LiveCallMessage liveCallMessage) {
        int type = liveCallMessage.getType();
        if (type == 3) {
            m218842c4(liveCallMessage.getCall(), liveCallMessage.getCallUser());
            return;
        }
        if (type == 4) {
            m218839E4(liveCallMessage.getCall());
        } else if (type == 30 && q24.f155280f.equals(liveCallMessage.getCall())) {
            o1j0.m165649w(R$string.f48139i1);
            m218839E4(liveCallMessage.getCall());
        }
    }

    /* JADX INFO: renamed from: s4 */
    public void m218857s4() {
        m213814K2().m189706m(LiveDialogEnum.CALL_ANCHOR_CHECK_DIALOG);
        m213811F2().CallEvent.anchorInviteAudience().m199277p();
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [l.oo2] */
    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        m218854o4();
        duringCreated(m213811F2().DialogCenterEvent.changeVisibility().m199270g()).filter(new qcj() { // from class: l.f74
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((h1e) obj).f107441a == LiveDialogEnum.CALL_ANCHOR_CHECK_DIALOG);
            }
        }).filter(new qcj() { // from class: l.q74
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((h1e) obj).f107443c);
            }
        }).subscribe(dhw.m115825d(new y20() { // from class: l.r74
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f161578a.m218814A4((h1e) obj);
            }
        }));
        duringCreated(m213810E2().m168545q1().m98283f()).subscribe(dhw.m115825d(new y20() { // from class: l.s74
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f166635a.m218856q4((LiveCallMessage) obj);
            }
        }));
        duringCreated(this.f203217i.m161649a4()).subscribe(dhw.m115825d(new y20() { // from class: l.t74
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f172393a.m218836r4((qvd) obj);
            }
        }));
        m138860d3(b45.class, new qcj() { // from class: l.u74
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f177878a.m218837B4((b45) obj);
            }
        });
        duringCreated(m213811F2().CallEvent.removeCallCheck().m199270g()).subscribe(dhw.m115825d(new y20() { // from class: l.v74
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f182718a.m218839E4((BLiveCall) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: t4 */
    public final /* synthetic */ void m218858t4(Throwable th) {
        this.f203217i.m161644V3(th);
    }

    /* JADX INFO: renamed from: u4 */
    public final /* synthetic */ void m218859u4(qop0 qop0Var, BLiveCall bLiveCall) {
        m218838C4(bLiveCall, qop0Var.m177314K(), qop0Var);
    }

    /* JADX INFO: renamed from: v4 */
    public final /* synthetic */ d3q m218860v4(j2s j2sVar, BLiveCall bLiveCall) {
        return m218850k4(bLiveCall, j2sVar.m143251k(bLiveCall.user));
    }

    /* JADX INFO: renamed from: w4 */
    public final /* synthetic */ void m218861w4(qop0 qop0Var, View view) {
        m218846g4(qop0Var);
    }

    /* JADX INFO: renamed from: x4 */
    public final /* synthetic */ void m218862x4(qop0 qop0Var, View view) {
        this.f203217i.m161645W3(qop0Var.m177313J());
    }

    /* JADX INFO: renamed from: y4 */
    public final /* synthetic */ void m218863y4(Throwable th) {
        this.f203217i.m161644V3(th);
    }

    /* JADX INFO: renamed from: z4 */
    public final /* synthetic */ void m218864z4(BLiveCall bLiveCall) {
        this.f203218j.put(bLiveCall.f45190id, bLiveCall);
    }
}
