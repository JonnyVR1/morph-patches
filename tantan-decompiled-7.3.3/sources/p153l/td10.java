package p153l;

import com.google.android.exoplayer2.PlaybackException;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.longlink.msg.liveroom.LongLinkLiveMessage;
import com.p051p1.mobile.putong.live.base.data.BLiveMultiCall;
import com.p051p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.p051p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveInfoMessage;
import com.p051p1.mobile.putong.live.livingroom.archi.sdk.motion.base.C12877b;
import com.p051p1.mobile.putong.live.livingroom.archi.sdk.motion.base.MotionParams;
import com.tantanapp.common.utils.ConnectivityReceiver;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import p137rx.C22421c;
import p153l.oo2;

/* JADX INFO: loaded from: classes5.dex */
public class td10<D extends oo2> extends qct<D> {

    /* JADX INFO: renamed from: i */
    public final le10 f173294i;

    /* JADX INFO: renamed from: j */
    public final le10.C18382a f173295j;

    /* JADX INFO: renamed from: k */
    public final mo10<D> f173296k;

    /* JADX INFO: renamed from: l */
    public en10<D> f173297l;

    public td10(dum<D> dumVar, dj10 dj10Var) {
        super(dumVar);
        le10.C18382a c18382a = new le10.C18382a();
        this.f173295j = c18382a;
        this.f173294i = new le10(c18382a, dj10Var.m116013a(), dj10Var.m116015c());
        m153103z2(new cj10(dumVar, this));
        this.f173296k = (mo10) m153103z2(new mo10(dumVar));
        m153103z2(new zk10(dumVar, this));
        m153103z2(new tp10(dumVar, this));
        m153103z2(new jh10(dumVar, this));
        m153103z2(new ug10(dumVar, this));
    }

    /* JADX INFO: renamed from: Z3 */
    public void m190582Z3(BLiveMultiCall bLiveMultiCall) {
        this.f173296k.m159226L3(bLiveMultiCall);
        this.f173295j.m153860b(bLiveMultiCall);
    }

    /* JADX INFO: renamed from: a4 */
    public void m190583a4(String str) {
        ir10.m141746a("closeMultiCallMotion ,reason=" + str);
        bf10.m103835k(this);
    }

    /* JADX INFO: renamed from: b4 */
    public le10 m190584b4() {
        return this.f173294i;
    }

    /* JADX INFO: renamed from: c4 */
    public C22421c<le10> m190585c4() {
        return this.f173294i.m153848p();
    }

    /* JADX INFO: renamed from: d4 */
    public String m190586d4() {
        return this.f173294i.m153855w();
    }

    /* JADX INFO: renamed from: e4 */
    public BLiveMultiCall m190587e4() {
        return this.f173296k.m159227M3();
    }

    /* JADX INFO: renamed from: f4 */
    public C22421c<BLiveMultiCall> m190588f4() {
        return this.f173296k.m159228N3().filter(new qcj() { // from class: l.hd10
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f108772a.m190593k4((BLiveMultiCall) obj);
            }
        });
    }

    /* JADX INFO: renamed from: g4 */
    public final void m190589g4(boolean z) {
        BLiveMultiCall bLiveMultiCallM159227M3 = this.f173296k.m159227M3();
        if (NullChecker.m82486a(bLiveMultiCallM159227M3)) {
            ir10.m141746a("Act front is " + z);
            if (z) {
                LivingNormalApiProvider.m72619d4(bLiveMultiCallM159227M3.f45248id);
                if (fn10.m126338f(bLiveMultiCallM159227M3)) {
                    return;
                }
                LivingNormalApiProvider.m72459L6(bLiveMultiCallM159227M3.liveId, "");
                return;
            }
            LivingNormalApiProvider.m72612c6(bLiveMultiCallM159227M3.f45248id);
            if (fn10.m126338f(bLiveMultiCallM159227M3)) {
                return;
            }
            LivingNormalApiProvider.m72460L7(bLiveMultiCallM159227M3.liveId, false);
        }
    }

    /* JADX INFO: renamed from: h4 */
    public final void m190590h4(Boolean bool) {
        if (bool.booleanValue()) {
            duringCreated(LivingNormalApiProvider.m72610c4(m213810E2().m202191k())).subscribe(dhw.m115826e(new y20() { // from class: l.fd10
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f98307a.m190594l4((Boolean) obj);
                }
            }, new y20() { // from class: l.gd10
                @Override // p153l.y20
                public final void call(Object obj) {
                    ir10.m141746a("request close multi call fail , msg:" + ((Throwable) obj).getMessage());
                }
            }));
        } else {
            this.f173297l.mo121416k4();
        }
    }

    /* JADX INFO: renamed from: i4 */
    public final void m190591i4(C4470c c4470c) {
        if (c4470c == C4470c.f16267i) {
            m190603u4();
        }
    }

    /* JADX INFO: renamed from: j4 */
    public boolean m190592j4(BLiveMultiCall bLiveMultiCall) {
        return bLiveMultiCall.ownerMultiCallOrder.equals(m190586d4());
    }

    /* JADX INFO: renamed from: k4 */
    public final /* synthetic */ Boolean m190593k4(BLiveMultiCall bLiveMultiCall) {
        if (bLiveMultiCall.ownerMultiCallOrder.equals(m190586d4())) {
            return Boolean.TRUE;
        }
        ir10.m141746a("filter self info :" + bLiveMultiCall.toJson());
        return Boolean.FALSE;
    }

    /* JADX INFO: renamed from: l4 */
    public final /* synthetic */ void m190594l4(Boolean bool) {
        this.f173297l.mo121416k4();
    }

    /* JADX INFO: renamed from: m4 */
    public final /* synthetic */ void m190595m4(LongLinkLiveMessage.CallRewardPoint callRewardPoint) {
        BLiveMultiCall bLiveMultiCallM153851s = this.f173294i.m153851s(callRewardPoint.getUserId());
        if (bLiveMultiCallM153851s != null) {
            bLiveMultiCallM153851s.receivedRewardPoint = callRewardPoint.getRewardPoint();
            m190606x4(bLiveMultiCallM153851s);
        }
    }

    @Override // p153l.i6t, p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: n */
    public void mo70300n() {
        super.mo70300n();
    }

    /* JADX INFO: renamed from: n4 */
    public final /* synthetic */ void m190596n4(List list) {
        BLiveMultiCall bLiveMultiCallM103796B;
        m190605w4(list);
        String strM103798D = bf10.m103798D(this);
        if ((fn10.m126343k(strM103798D) || fn10.m126335c(strM103798D) || fn10.m126339g(strM103798D)) && (bLiveMultiCallM103796B = bf10.m103796B(this)) != null) {
            duringCreated(LivingNormalApiProvider.m72458L5(bLiveMultiCallM103796B.isLeadRole ? "big" : "small", this.f173294i.m153853u())).subscribe(dhw.m115829h(new y20() { // from class: l.jd10
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f120103a.m190597o4((Integer) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: o4 */
    public final /* synthetic */ void m190597o4(Integer num) {
        C12877b c12877bMo133182a = ((h0m) m138856F3(new z310(PlaybackException.ERROR_CODE_DRM_UNSPECIFIED))).mo133182a();
        if (c12877bMo133182a != null && c12877bMo133182a.m73083c1(MotionParams.PusherMotionEnum.MOTION_MULTI_CALL_ANCHOR)) {
            ((p910) c12877bMo133182a).m171313J1(num);
        } else {
            if (c12877bMo133182a == null || !c12877bMo133182a.m73083c1(MotionParams.PusherMotionEnum.MOTION_MULTI_CALL_AUDIENCE)) {
                return;
            }
            ((ab10) c12877bMo133182a).m96680A1(num);
        }
    }

    /* JADX INFO: renamed from: p4 */
    public final /* synthetic */ List m190598p4(smj smjVar) {
        return this.f173294i.m153856x();
    }

    /* JADX INFO: renamed from: q4 */
    public final /* synthetic */ String m190599q4(al10 al10Var) {
        return m190586d4();
    }

    /* JADX INFO: renamed from: r4 */
    public final /* synthetic */ void m190600r4(Boolean bool) {
        m190603u4();
    }

    /* JADX INFO: renamed from: s4 */
    public final void m190601s4(LiveInfoMessage liveInfoMessage) {
        List<LongLinkLiveMessage.CallRewardPoint> list = liveInfoMessage.multiCallRewardPoint;
        if (jyb.m147479J(list)) {
            return;
        }
        jyb.m147537z(list, new y20() { // from class: l.sd10
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f167370a.m190595m4((LongLinkLiveMessage.CallRewardPoint) obj);
            }
        });
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        m138860d3(smj.class, new qcj() { // from class: l.dd10
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f87850a.m190598p4((smj) obj);
            }
        });
        m138860d3(al10.class, new qcj() { // from class: l.kd10
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f125125a.m190599q4((al10) obj);
            }
        });
        duringCreated((C22421c) m213811F2().MultiCallEvent.prepareCloseMultiCall().m199270g()).subscribe(dhw.m115829h(new y20() { // from class: l.ld10
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f131395a.m190590h4((Boolean) obj);
            }
        }));
        duringCreated(Act.front()).subscribe(dhw.m115829h(new y20() { // from class: l.md10
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f135857a.m190589g4(((Boolean) obj).booleanValue());
            }
        }));
        duringCreated(m213810E2().m168545q1().m98220C()).filter(new qcj() { // from class: l.nd10
            @Override // p153l.qcj
            public final Object call(Object obj) {
                LiveInfoMessage liveInfoMessage = (LiveInfoMessage) obj;
                return Boolean.valueOf(liveInfoMessage.isRewardChange() || liveInfoMessage.isAllChange());
            }
        }).subscribe(new y20() { // from class: l.od10
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f146825a.m190601s4((LiveInfoMessage) obj);
            }
        });
        lifecycle().subscribe(dhw.m115829h(new y20() { // from class: l.pd10
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f151688a.m190591i4((C4470c) obj);
            }
        }));
        duringCreated(ConnectivityReceiver.m82473m().observeOn(fo0.m126432a()).map(new qcj() { // from class: l.qd10
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(ConnectivityReceiver.m82467g());
            }
        }).distinctUntilChanged().skip(1)).subscribe(dhw.m115829h(new y20() { // from class: l.rd10
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f162277a.m190600r4((Boolean) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: t4 */
    public void m190602t4() {
        BLiveMultiCall bLiveMultiCallM103848z = bf10.m103848z(this);
        if (bLiveMultiCallM103848z != null) {
            duringCreated(LivingNormalApiProvider.m72368B5(bLiveMultiCallM103848z.ownerLiveId)).subscribe(dhw.m115829h(new y20() { // from class: l.id10
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f114464a.m190596n4((List) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: u4 */
    public final void m190603u4() {
        BLiveMultiCall bLiveMultiCallM103848z = bf10.m103848z(this);
        if (NullChecker.m82486a(bLiveMultiCallM103848z)) {
            duringCreated(LivingNormalApiProvider.m72368B5(bLiveMultiCallM103848z.ownerLiveId)).subscribe(dhw.m115829h(new y20() { // from class: l.ed10
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f93134a.m190605w4((List) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: v4 */
    public void m190604v4(BLiveMultiCall bLiveMultiCall) {
        this.f173296k.m159229O3(bLiveMultiCall);
        this.f173295j.m153861c(bLiveMultiCall);
    }

    /* JADX INFO: renamed from: w4 */
    public void m190605w4(List<BLiveMultiCall> list) {
        this.f173296k.m159232S3(list);
        this.f173295j.m153862d(list);
    }

    /* JADX INFO: renamed from: x4 */
    public void m190606x4(BLiveMultiCall bLiveMultiCall) {
        this.f173296k.m159231R3(bLiveMultiCall);
        this.f173295j.m153863e(bLiveMultiCall);
    }
}
