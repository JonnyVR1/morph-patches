package p149l;

import android.content.DialogInterface;
import android.text.TextUtils;
import android.view.View;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.live.base.data.BLiveCall;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.p046p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveCallMessage;
import java.util.List;
import p133rx.C22306c;
import p133rx.subjects.C22392a;

/* JADX INFO: loaded from: classes5.dex */
public class w6d0 extends o44 {

    /* JADX INFO: renamed from: l */
    public final xu2 f184830l;

    /* JADX INFO: renamed from: m */
    public C22392a<BLiveCall> f184831m;

    /* JADX INFO: renamed from: n */
    public c4g0 f184832n;

    public w6d0(bsm bsmVar, a34 a34Var) {
        super(bsmVar, a34Var);
        this.f184831m = C22392a.m221513c(BLiveCall.new_());
        this.f141737k.onNext(Boolean.FALSE);
        this.f184830l = (xu2) m144512z2(new xu2(bsmVar));
        m144512z2(new h91(bsmVar, this));
        m144512z2(new e14(bsmVar, a34Var.f67325b, this));
        m144512z2(new n04(bsmVar, this, a34Var.f67327d));
        m144512z2(new u04(bsmVar, this));
    }

    /* JADX INFO: renamed from: C4 */
    public static /* synthetic */ void m201743C4(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c5 */
    public /* synthetic */ void m201751c5(Boolean bool) {
        m162529X3(m201767N4(), r14.f157232c);
    }

    /* JADX INFO: renamed from: r4 */
    public static /* synthetic */ void m201755r4(Throwable th) {
    }

    /* JADX INFO: renamed from: w4 */
    public static /* synthetic */ void m201760w4(List list) {
    }

    /* JADX INFO: renamed from: K4 */
    public void m201764K4(String str) {
        duringCreated(LivingNormalApiProvider.m71345T3(str)).subscribe(ffw.m121194e(new e30() { // from class: l.m6d0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f131673a.m201771R4((List) obj);
            }
        }, new e30() { // from class: l.n6d0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f137392a.m201772S4((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: L4 */
    public void m201765L4() {
        rwb rwbVar;
        if (v44.m196937e(m201767N4()) || (rwbVar = (rwb) m129297F3(new swb(4400))) == null) {
            return;
        }
        h54.m129377d("checkCtypChanged newCtyp is  " + rwbVar.f161324a);
        if (rwbVar.f161324a != 2 || rwbVar.f161326c <= 1.0f) {
            this.f141737k.onNext(Boolean.FALSE);
        } else {
            this.f141737k.onNext(Boolean.TRUE);
        }
    }

    /* JADX INFO: renamed from: M4 */
    public final void m201766M4() {
        BLiveCall bLiveCallMo223809clone = m201767N4().mo223809clone();
        bLiveCallMo223809clone.state = "hung-up";
        m201788j5(bLiveCallMo223809clone);
    }

    /* JADX INFO: renamed from: N4 */
    public BLiveCall m201767N4() {
        return this.f184831m.m221515e();
    }

    /* JADX INFO: renamed from: O4 */
    public C22306c<BLiveCall> m201768O4() {
        return this.f184831m.asObservable().onBackpressureLatest();
    }

    /* JADX INFO: renamed from: P4 */
    public final void m201769P4(BLiveCall bLiveCall) {
        if (v44.m196938f(bLiveCall)) {
            this.f188513f.setSwipeBackEnable(true);
            m201787i5(bLiveCall);
        } else if (v44.m196948p(bLiveCall)) {
            this.f188513f.setSwipeBackEnable(false);
        } else if (v44.m196937e(bLiveCall)) {
            this.f188513f.setSwipeBackEnable(false);
        }
    }

    /* JADX INFO: renamed from: Q4, reason: merged with bridge method [inline-methods] */
    public final Boolean m201780a5(w14 w14Var) {
        h54.m129377d("handleBackEvent " + w14Var.getAction());
        BLiveCall bLiveCallM201767N4 = m201767N4();
        if (v44.m196938f(bLiveCallM201767N4)) {
            return Boolean.FALSE;
        }
        if (w14Var.m200912d()) {
            return Boolean.valueOf(v44.m196936d(bLiveCallM201767N4));
        }
        if (v44.m196948p(bLiveCallM201767N4)) {
            m201789k5(w14Var, bLiveCallM201767N4);
            return Boolean.TRUE;
        }
        if (!v44.m196937e(bLiveCallM201767N4)) {
            return Boolean.FALSE;
        }
        if (w14Var.m200914f()) {
            m201789k5(w14Var, bLiveCallM201767N4);
        } else {
            lsi0.m151593w(v44.m196934b(bLiveCallM201767N4, w14Var));
        }
        return Boolean.TRUE;
    }

    /* JADX INFO: renamed from: R4 */
    public final /* synthetic */ void m201771R4(List list) {
        m201788j5((BLiveCall) list.get(0));
    }

    /* JADX INFO: renamed from: S4 */
    public final /* synthetic */ void m201772S4(Throwable th) {
        m162527V3(th);
    }

    @Override // p149l.o44, p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: T */
    public void mo70198T() {
        super.mo70198T();
        m201784f5();
        m206028F2().CallEvent.roomCall().mo172464m(Boolean.TRUE);
    }

    /* JADX INFO: renamed from: T4 */
    public final /* synthetic */ Boolean m201773T4(Boolean bool) {
        return Boolean.valueOf(!TextUtils.isEmpty(m201767N4().f44342id));
    }

    @Override // p149l.o44
    /* JADX INFO: renamed from: U3 */
    public void mo162526U3(z24 z24Var) {
        m201788j5(z24Var.f201156a);
        super.mo162526U3(z24Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: U4 */
    public final /* synthetic */ Boolean m201774U4(Boolean bool) {
        return Boolean.valueOf(((pn40) m206027E2()).mo149813j() != null);
    }

    /* JADX INFO: renamed from: V4 */
    public final /* synthetic */ void m201775V4(Boolean bool) {
        m201785g5(bool.booleanValue());
    }

    /* JADX INFO: renamed from: W4 */
    public final /* synthetic */ void m201776W4(i0s i0sVar) {
        m201783e5(i0sVar);
        m201790l5(i0sVar.m133916j(ypv.f199493a.m199309D0()));
    }

    /* JADX INFO: renamed from: X4 */
    public final /* synthetic */ void m201777X4(List list) {
        mo162543m4((BLiveCall) list.get(0));
    }

    /* JADX INFO: renamed from: Y4 */
    public final /* synthetic */ void m201778Y4(DialogInterface dialogInterface) {
        m201764K4(m201767N4().f44342id);
    }

    /* JADX INFO: renamed from: Z4 */
    public final /* synthetic */ void m201779Z4(View view) {
        m162528W3(m201767N4());
    }

    /* JADX INFO: renamed from: b5 */
    public final /* synthetic */ void m201781b5(Object obj) {
        m201765L4();
    }

    /* JADX INFO: renamed from: d5 */
    public final /* synthetic */ void m201782d5(cud cudVar) {
        this.f141737k.onNext(Boolean.valueOf(this.f141736j.m108755h() != null));
    }

    /* JADX INFO: renamed from: f5 */
    public final void m201784f5() {
        this.f184832n = Act.foreground().map(new w9j() { // from class: l.a6d0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((Act.C4299r) obj) != null);
            }
        }).distinctUntilChanged().filter(new w9j() { // from class: l.l6d0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f126614a.m201773T4((Boolean) obj);
            }
        }).filter(new w9j() { // from class: l.o6d0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f142338a.m201774U4((Boolean) obj);
            }
        }).subscribe(ffw.m121193d(new e30() { // from class: l.p6d0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f147397a.m201775V4((Boolean) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: g5 */
    public final void m201785g5(boolean z) {
        BLiveCall bLiveCallM201767N4 = m201767N4();
        if (z) {
            m162530Y3(new e30() { // from class: l.e6d0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f89568a.m201776W4((i0s) obj);
                }
            });
        } else {
            duringCreated(LivingNormalApiProvider.m71499k4(bLiveCallM201767N4.f44342id)).subscribe(ffw.m121194e(new e30() { // from class: l.f6d0
                @Override // p149l.e30
                public final void call(Object obj) {
                    w6d0.m201760w4((List) obj);
                }
            }, new e30() { // from class: l.g6d0
                @Override // p149l.e30
                public final void call(Object obj) {
                    w6d0.m201743C4((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: h5 */
    public final void m201786h5(String str) {
        duringCreated(LivingNormalApiProvider.m71508l4(str)).subscribe(ffw.m121194e(new e30() { // from class: l.j6d0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f116440a.m201777X4((List) obj);
            }
        }, new e30() { // from class: l.k6d0
            @Override // p149l.e30
            public final void call(Object obj) {
                w6d0.m201755r4((Throwable) obj);
            }
        }));
    }

    @Override // p149l.o44
    /* JADX INFO: renamed from: i4 */
    public void mo162540i4(LiveCallMessage liveCallMessage) {
        super.mo162540i4(liveCallMessage);
        if (liveCallMessage.m71823is(5)) {
            m201788j5(liveCallMessage.getCall());
            return;
        }
        if (liveCallMessage.m71823is(13)) {
            mo162543m4(liveCallMessage.getCall());
            lsi0.m151593w(R$string.f47114a0);
            return;
        }
        if (liveCallMessage.m71823is(1)) {
            if (v44.m196937e(m201767N4())) {
                lsi0.m151593w(R$string.f47466q1);
                m201766M4();
                return;
            }
            return;
        }
        if (liveCallMessage.m71823is(25) && v44.m196943k(liveCallMessage.getCall())) {
            lsi0.m151595y(this.f188513f.getString(R$string.f46580B1, liveCallMessage.getCall().userName));
            mo162543m4(liveCallMessage.getCall());
        } else if (liveCallMessage.m71823is(21) && v44.m196943k(liveCallMessage.getCall())) {
            lsi0.m151593w(R$string.f47008V);
        } else if (liveCallMessage.m71823is(30) && r14.f157231b.equals(liveCallMessage.getCall().hangupReason) && v44.m196943k(liveCallMessage.getCall())) {
            m201788j5(liveCallMessage.getCall());
            lsi0.m151593w(R$string.f47291i1);
        }
    }

    /* JADX INFO: renamed from: i5 */
    public final void m201787i5(BLiveCall bLiveCall) {
        if (!v44.m196938f(bLiveCall) || v44.m196951s(bLiveCall)) {
            return;
        }
        m206028F2().CallEvent.callSummary().mo172463j(m201767N4().f44342id);
    }

    /* JADX INFO: renamed from: j5 */
    public void m201788j5(BLiveCall bLiveCall) {
        if (bLiveCall == null) {
            m201766M4();
            return;
        }
        if (v44.m196943k(bLiveCall)) {
            if (TextUtils.equals(bLiveCall.opState, m201767N4().opState) && TextUtils.equals(bLiveCall.state, m201767N4().state) && TextUtils.equals(bLiveCall.f44342id, m201767N4().f44342id) && bLiveCall.mutedByUser == m201767N4().mutedByUser && bLiveCall.mutedByAnchor == m201767N4().mutedByAnchor) {
                return;
            }
            h54.m129377d("send self call state: id " + bLiveCall.f44342id);
            this.f184831m.onNext(bLiveCall);
        }
    }

    @Override // p149l.o44
    /* JADX INFO: renamed from: k4 */
    public void mo162541k4(BLiveCall bLiveCall) {
        m201788j5(bLiveCall);
        super.mo162541k4(bLiveCall);
    }

    /* JADX INFO: renamed from: k5 */
    public final void m201789k5(w14 w14Var, BLiveCall bLiveCall) {
        xh0.C21150a c21150aM208738q = new xh0.C21150a(act()).m208730i(v44.m196934b(bLiveCall, w14Var)).m208737p(h1c0.f105394p0).m208738q(R$string.f47646y5);
        if (v44.m196948p(m201767N4())) {
            c21150aM208738q.m208726e(R$string.f46863O1).m208733l(new DialogInterface.OnCancelListener() { // from class: l.h6d0
                @Override // android.content.DialogInterface.OnCancelListener
                public final void onCancel(DialogInterface dialogInterface) {
                    this.f106050a.m201778Y4(dialogInterface);
                }
            });
        } else {
            c21150aM208738q.m208726e(R$string.f47356l1).m208724c(new View.OnClickListener() { // from class: l.i6d0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f111732a.m201779Z4(view);
                }
            });
        }
        c21150aM208738q.m208722a().m208721g();
    }

    /* JADX INFO: renamed from: l5 */
    public final void m201790l5(BLiveCall bLiveCall) {
        if (bLiveCall != null && !v44.m196938f(bLiveCall)) {
            m201786h5(bLiveCall.f44342id);
        } else if (v44.m196937e(m201767N4())) {
            m201766M4();
        }
    }

    @Override // p149l.o44
    /* JADX INFO: renamed from: m4 */
    public void mo162543m4(BLiveCall bLiveCall) {
        m201788j5(bLiveCall);
        super.mo162543m4(bLiveCall);
    }

    @Override // p149l.h4t, p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: n */
    public void mo69117n() {
        super.mo69117n();
        if (v44.m196937e(m201767N4())) {
            m206028F2().CallEvent.callSummary().mo172463j(m201767N4().f44342id);
        }
        this.f188513f.setSwipeBackEnable(true);
        m201766M4();
        mkd0.m154992z(this.f184832n);
    }

    @Override // p149l.o44
    /* JADX INFO: renamed from: n4, reason: merged with bridge method [inline-methods] */
    public void m201783e5(i0s i0sVar) {
        BLiveCall bLiveCallM133916j = i0sVar.m133916j(ypv.f199493a.m199309D0());
        if (bLiveCallM133916j == null && v44.m196937e(m201767N4())) {
            m201766M4();
        } else if (bLiveCallM133916j != null) {
            m201788j5(bLiveCallM133916j);
        }
        super.m201783e5(i0sVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p149l.o44, p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        m129301d3(w14.class, new w9j() { // from class: l.q6d0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f152903a.m201780a5((w14) obj);
            }
        });
        duringCreated(m201768O4()).filter(new w9j() { // from class: l.r6d0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(v44.m196943k((BLiveCall) obj));
            }
        }).subscribe(ffw.m121193d(new e30() { // from class: l.s6d0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f162817a.m201769P4((BLiveCall) obj);
            }
        }));
        duringCreated(C22306c.merge(m206028F2().PlayerEvent.ctypChanged().m172460g(), m206028F2().PlayerEvent.videoSizeChanged().m172460g())).subscribe(ffw.m121193d(new e30() { // from class: l.t6d0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f168608a.m201781b5(obj);
            }
        }));
        duringCreated(m206028F2().CallEvent.roomCall().m172460g()).filter(new w9j() { // from class: l.u6d0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(!((Boolean) obj).booleanValue());
            }
        }).subscribe(ffw.m121193d(new e30() { // from class: l.v6d0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f180186a.m201751c5((Boolean) obj);
            }
        }));
        duringCreated(m162532a4()).filter(new w9j() { // from class: l.b6d0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((cud) obj).m108753f(ypv.f199493a.m199309D0()) != null);
            }
        }).subscribe(ffw.m121193d(new e30() { // from class: l.c6d0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f79529a.m201782d5((cud) obj);
            }
        }));
        if (!vwb.m200296J(((pn40) m206027E2()).m170393A2().mo165470l().callInfo.onVoiceCallIds)) {
            m162530Y3(new e30() { // from class: l.d6d0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f84619a.m201783e5((i0s) obj);
                }
            });
        }
        m201765L4();
    }
}
