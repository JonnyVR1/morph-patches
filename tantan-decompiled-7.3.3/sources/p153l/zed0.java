package p153l;

import android.content.DialogInterface;
import android.text.TextUtils;
import android.view.View;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.live.base.data.BLiveCall;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.p051p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveCallMessage;
import java.util.List;
import p137rx.C22421c;
import p137rx.subjects.C22507a;

/* JADX INFO: loaded from: classes5.dex */
public class zed0 extends n54 {

    /* JADX INFO: renamed from: l */
    public final nv2 f203992l;

    /* JADX INFO: renamed from: m */
    public C22507a<BLiveCall> f203993m;

    /* JADX INFO: renamed from: n */
    public kcg0 f203994n;

    public zed0(dum dumVar, z34 z34Var) {
        super(dumVar, z34Var);
        this.f203993m = C22507a.m222759c(BLiveCall.new_());
        this.f140282k.onNext(Boolean.FALSE);
        this.f203992l = (nv2) m153103z2(new nv2(dumVar));
        m153103z2(new o91(dumVar, this));
        m153103z2(new d24(dumVar, z34Var.f202779b, this));
        m153103z2(new m14(dumVar, this, z34Var.f202781d));
        m153103z2(new t14(dumVar, this));
    }

    /* JADX INFO: renamed from: C4 */
    public static /* synthetic */ void m219416C4(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c5 */
    public /* synthetic */ void m219424c5(Boolean bool) {
        m161646X3(m219440N4(), q24.f155277c);
    }

    /* JADX INFO: renamed from: r4 */
    public static /* synthetic */ void m219428r4(Throwable th) {
    }

    /* JADX INFO: renamed from: w4 */
    public static /* synthetic */ void m219433w4(List list) {
    }

    /* JADX INFO: renamed from: K4 */
    public void m219437K4(String str) {
        duringCreated(LivingNormalApiProvider.m72528T3(str)).subscribe(dhw.m115826e(new y20() { // from class: l.ped0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f152061a.m219444R4((List) obj);
            }
        }, new y20() { // from class: l.qed0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f157169a.m219445S4((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: L4 */
    public void m219438L4() {
        fyb fybVar;
        if (u54.m194525e(m219440N4()) || (fybVar = (fyb) m138856F3(new gyb(4400))) == null) {
            return;
        }
        g64.m129083d("checkCtypChanged newCtyp is  " + fybVar.f101357a);
        if (fybVar.f101357a != 2 || fybVar.f101359c <= 1.0f) {
            this.f140282k.onNext(Boolean.FALSE);
        } else {
            this.f140282k.onNext(Boolean.TRUE);
        }
    }

    /* JADX INFO: renamed from: M4 */
    public final void m219439M4() {
        BLiveCall bLiveCallMo225055clone = m219440N4().mo225055clone();
        bLiveCallMo225055clone.state = "hung-up";
        m219461j5(bLiveCallMo225055clone);
    }

    /* JADX INFO: renamed from: N4 */
    public BLiveCall m219440N4() {
        return this.f203993m.m222761e();
    }

    /* JADX INFO: renamed from: O4 */
    public C22421c<BLiveCall> m219441O4() {
        return this.f203993m.asObservable().onBackpressureLatest();
    }

    /* JADX INFO: renamed from: P4 */
    public final void m219442P4(BLiveCall bLiveCall) {
        if (u54.m194526f(bLiveCall)) {
            this.f196919f.setSwipeBackEnable(true);
            m219460i5(bLiveCall);
        } else if (u54.m194536p(bLiveCall)) {
            this.f196919f.setSwipeBackEnable(false);
        } else if (u54.m194525e(bLiveCall)) {
            this.f196919f.setSwipeBackEnable(false);
        }
    }

    /* JADX INFO: renamed from: Q4, reason: merged with bridge method [inline-methods] */
    public final Boolean m219453a5(v24 v24Var) {
        g64.m129083d("handleBackEvent " + v24Var.getAction());
        BLiveCall bLiveCallM219440N4 = m219440N4();
        if (u54.m194526f(bLiveCallM219440N4)) {
            return Boolean.FALSE;
        }
        if (v24Var.m199115d()) {
            return Boolean.valueOf(u54.m194524d(bLiveCallM219440N4));
        }
        if (u54.m194536p(bLiveCallM219440N4)) {
            m219462k5(v24Var, bLiveCallM219440N4);
            return Boolean.TRUE;
        }
        if (!u54.m194525e(bLiveCallM219440N4)) {
            return Boolean.FALSE;
        }
        if (v24Var.m199117f()) {
            m219462k5(v24Var, bLiveCallM219440N4);
        } else {
            o1j0.m165649w(u54.m194522b(bLiveCallM219440N4, v24Var));
        }
        return Boolean.TRUE;
    }

    /* JADX INFO: renamed from: R4 */
    public final /* synthetic */ void m219444R4(List list) {
        m219461j5((BLiveCall) list.get(0));
    }

    /* JADX INFO: renamed from: S4 */
    public final /* synthetic */ void m219445S4(Throwable th) {
        m161644V3(th);
    }

    @Override // p153l.n54, p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: T */
    public void mo71381T() {
        super.mo71381T();
        m219457f5();
        m213811F2().CallEvent.roomCall().mo199274m(Boolean.TRUE);
    }

    /* JADX INFO: renamed from: T4 */
    public final /* synthetic */ Boolean m219446T4(Boolean bool) {
        return Boolean.valueOf(!TextUtils.isEmpty(m219440N4().f45190id));
    }

    @Override // p153l.n54
    /* JADX INFO: renamed from: U3 */
    public void mo161643U3(y34 y34Var) {
        m219461j5(y34Var.f197301a);
        super.mo161643U3(y34Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: U4 */
    public final /* synthetic */ Boolean m219447U4(Boolean bool) {
        return Boolean.valueOf(((dw40) m213810E2()).mo183435j() != null);
    }

    /* JADX INFO: renamed from: V4 */
    public final /* synthetic */ void m219448V4(Boolean bool) {
        m219458g5(bool.booleanValue());
    }

    /* JADX INFO: renamed from: W4 */
    public final /* synthetic */ void m219449W4(j2s j2sVar) {
        m219456e5(j2sVar);
        m219463l5(j2sVar.m143250j(zrv.f205799a.m207631D0()));
    }

    /* JADX INFO: renamed from: X4 */
    public final /* synthetic */ void m219450X4(List list) {
        mo161660m4((BLiveCall) list.get(0));
    }

    /* JADX INFO: renamed from: Y4 */
    public final /* synthetic */ void m219451Y4(DialogInterface dialogInterface) {
        m219437K4(m219440N4().f45190id);
    }

    /* JADX INFO: renamed from: Z4 */
    public final /* synthetic */ void m219452Z4(View view) {
        m161645W3(m219440N4());
    }

    /* JADX INFO: renamed from: b5 */
    public final /* synthetic */ void m219454b5(Object obj) {
        m219438L4();
    }

    /* JADX INFO: renamed from: d5 */
    public final /* synthetic */ void m219455d5(qvd qvdVar) {
        this.f140282k.onNext(Boolean.valueOf(this.f140281j.m178265h() != null));
    }

    /* JADX INFO: renamed from: f5 */
    public final void m219457f5() {
        this.f203994n = Act.foreground().map(new qcj() { // from class: l.ded0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((Act.C4450r) obj) != null);
            }
        }).distinctUntilChanged().filter(new qcj() { // from class: l.oed0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f146981a.m219446T4((Boolean) obj);
            }
        }).filter(new qcj() { // from class: l.red0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f162633a.m219447U4((Boolean) obj);
            }
        }).subscribe(dhw.m115825d(new y20() { // from class: l.sed0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f167606a.m219448V4((Boolean) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: g5 */
    public final void m219458g5(boolean z) {
        BLiveCall bLiveCallM219440N4 = m219440N4();
        if (z) {
            m161647Y3(new y20() { // from class: l.hed0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f109143a.m219449W4((j2s) obj);
                }
            });
        } else {
            duringCreated(LivingNormalApiProvider.m72682k4(bLiveCallM219440N4.f45190id)).subscribe(dhw.m115826e(new y20() { // from class: l.ied0
                @Override // p153l.y20
                public final void call(Object obj) {
                    zed0.m219433w4((List) obj);
                }
            }, new y20() { // from class: l.jed0
                @Override // p153l.y20
                public final void call(Object obj) {
                    zed0.m219416C4((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: h5 */
    public final void m219459h5(String str) {
        duringCreated(LivingNormalApiProvider.m72691l4(str)).subscribe(dhw.m115826e(new y20() { // from class: l.med0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f136493a.m219450X4((List) obj);
            }
        }, new y20() { // from class: l.ned0
            @Override // p153l.y20
            public final void call(Object obj) {
                zed0.m219428r4((Throwable) obj);
            }
        }));
    }

    @Override // p153l.n54
    /* JADX INFO: renamed from: i4 */
    public void mo161657i4(LiveCallMessage liveCallMessage) {
        super.mo161657i4(liveCallMessage);
        if (liveCallMessage.m73006is(5)) {
            m219461j5(liveCallMessage.getCall());
            return;
        }
        if (liveCallMessage.m73006is(13)) {
            mo161660m4(liveCallMessage.getCall());
            o1j0.m165649w(R$string.f47962a0);
            return;
        }
        if (liveCallMessage.m73006is(1)) {
            if (u54.m194525e(m219440N4())) {
                o1j0.m165649w(R$string.f48314q1);
                m219439M4();
                return;
            }
            return;
        }
        if (liveCallMessage.m73006is(25) && u54.m194531k(liveCallMessage.getCall())) {
            o1j0.m165651y(this.f196919f.getString(R$string.f47428B1, liveCallMessage.getCall().userName));
            mo161660m4(liveCallMessage.getCall());
        } else if (liveCallMessage.m73006is(21) && u54.m194531k(liveCallMessage.getCall())) {
            o1j0.m165649w(R$string.f47856V);
        } else if (liveCallMessage.m73006is(30) && q24.f155276b.equals(liveCallMessage.getCall().hangupReason) && u54.m194531k(liveCallMessage.getCall())) {
            m219461j5(liveCallMessage.getCall());
            o1j0.m165649w(R$string.f48139i1);
        }
    }

    /* JADX INFO: renamed from: i5 */
    public final void m219460i5(BLiveCall bLiveCall) {
        if (!u54.m194526f(bLiveCall) || u54.m194539s(bLiveCall)) {
            return;
        }
        m213811F2().CallEvent.callSummary().mo199273j(m219440N4().f45190id);
    }

    /* JADX INFO: renamed from: j5 */
    public void m219461j5(BLiveCall bLiveCall) {
        if (bLiveCall == null) {
            m219439M4();
            return;
        }
        if (u54.m194531k(bLiveCall)) {
            if (TextUtils.equals(bLiveCall.opState, m219440N4().opState) && TextUtils.equals(bLiveCall.state, m219440N4().state) && TextUtils.equals(bLiveCall.f45190id, m219440N4().f45190id) && bLiveCall.mutedByUser == m219440N4().mutedByUser && bLiveCall.mutedByAnchor == m219440N4().mutedByAnchor) {
                return;
            }
            g64.m129083d("send self call state: id " + bLiveCall.f45190id);
            this.f203993m.onNext(bLiveCall);
        }
    }

    @Override // p153l.n54
    /* JADX INFO: renamed from: k4 */
    public void mo161658k4(BLiveCall bLiveCall) {
        m219461j5(bLiveCall);
        super.mo161658k4(bLiveCall);
    }

    /* JADX INFO: renamed from: k5 */
    public final void m219462k5(v24 v24Var, BLiveCall bLiveCall) {
        th0.C20312a c20312aM191158q = new th0.C20312a(act()).m191150i(u54.m194522b(bLiveCall, v24Var)).m191157p(n9c0.f140855p0).m191158q(R$string.f48494y5);
        if (u54.m194536p(m219440N4())) {
            c20312aM191158q.m191146e(R$string.f47711O1).m191153l(new DialogInterface.OnCancelListener() { // from class: l.ked0
                @Override // android.content.DialogInterface.OnCancelListener
                public final void onCancel(DialogInterface dialogInterface) {
                    this.f126177a.m219451Y4(dialogInterface);
                }
            });
        } else {
            c20312aM191158q.m191146e(R$string.f48204l1).m191144c(new View.OnClickListener() { // from class: l.led0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f131728a.m219452Z4(view);
                }
            });
        }
        c20312aM191158q.m191142a().m191141g();
    }

    /* JADX INFO: renamed from: l5 */
    public final void m219463l5(BLiveCall bLiveCall) {
        if (bLiveCall != null && !u54.m194526f(bLiveCall)) {
            m219459h5(bLiveCall.f45190id);
        } else if (u54.m194525e(m219440N4())) {
            m219439M4();
        }
    }

    @Override // p153l.n54
    /* JADX INFO: renamed from: m4 */
    public void mo161660m4(BLiveCall bLiveCall) {
        m219461j5(bLiveCall);
        super.mo161660m4(bLiveCall);
    }

    @Override // p153l.i6t, p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: n */
    public void mo70300n() {
        super.mo70300n();
        if (u54.m194525e(m219440N4())) {
            m213811F2().CallEvent.callSummary().mo199273j(m219440N4().f45190id);
        }
        this.f196919f.setSwipeBackEnable(true);
        m219439M4();
        psd0.m173633z(this.f203994n);
    }

    @Override // p153l.n54
    /* JADX INFO: renamed from: n4, reason: merged with bridge method [inline-methods] */
    public void m219456e5(j2s j2sVar) {
        BLiveCall bLiveCallM143250j = j2sVar.m143250j(zrv.f205799a.m207631D0());
        if (bLiveCallM143250j == null && u54.m194525e(m219440N4())) {
            m219439M4();
        } else if (bLiveCallM143250j != null) {
            m219461j5(bLiveCallM143250j);
        }
        super.m219456e5(j2sVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p153l.n54, p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        m138860d3(v24.class, new qcj() { // from class: l.ted0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f173803a.m219453a5((v24) obj);
            }
        });
        duringCreated(m219441O4()).filter(new qcj() { // from class: l.ued0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(u54.m194531k((BLiveCall) obj));
            }
        }).subscribe(dhw.m115825d(new y20() { // from class: l.ved0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f183759a.m219442P4((BLiveCall) obj);
            }
        }));
        duringCreated(C22421c.merge(m213811F2().PlayerEvent.ctypChanged().m199270g(), m213811F2().PlayerEvent.videoSizeChanged().m199270g())).subscribe(dhw.m115825d(new y20() { // from class: l.wed0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f188688a.m219454b5(obj);
            }
        }));
        duringCreated(m213811F2().CallEvent.roomCall().m199270g()).filter(new qcj() { // from class: l.xed0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(!((Boolean) obj).booleanValue());
            }
        }).subscribe(dhw.m115825d(new y20() { // from class: l.yed0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f199340a.m219424c5((Boolean) obj);
            }
        }));
        duringCreated(m161649a4()).filter(new qcj() { // from class: l.eed0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((qvd) obj).m178263f(zrv.f205799a.m207631D0()) != null);
            }
        }).subscribe(dhw.m115825d(new y20() { // from class: l.fed0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f98655a.m219455d5((qvd) obj);
            }
        }));
        if (!jyb.m147479J(((dw40) m213810E2()).m118363A2().mo122892l().callInfo.onVoiceCallIds)) {
            m161647Y3(new y20() { // from class: l.ged0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f103815a.m219456e5((j2s) obj);
                }
            });
        }
        m219438L4();
    }
}
