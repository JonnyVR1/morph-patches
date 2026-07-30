package p149l;

import com.google.android.exoplayer2.PlaybackException;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.C4319c;
import com.p046p1.mobile.longlink.msg.liveroom.LongLinkLiveMessage;
import com.p046p1.mobile.putong.live.base.data.BLiveMultiCall;
import com.p046p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.p046p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveInfoMessage;
import com.p046p1.mobile.putong.live.livingroom.archi.sdk.motion.base.C12714b;
import com.p046p1.mobile.putong.live.livingroom.archi.sdk.motion.base.MotionParams;
import com.tantanapp.common.utils.ConnectivityReceiver;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import p133rx.C22306c;
import p149l.ho2;

/* JADX INFO: loaded from: classes5.dex */
public class j510<D extends ho2> extends pat<D> {

    /* JADX INFO: renamed from: i */
    public final b610 f116258i;

    /* JADX INFO: renamed from: j */
    public final b610.C15814a f116259j;

    /* JADX INFO: renamed from: k */
    public final cg10<D> f116260k;

    /* JADX INFO: renamed from: l */
    public ue10<D> f116261l;

    public j510(bsm<D> bsmVar, ta10 ta10Var) {
        super(bsmVar);
        b610.C15814a c15814a = new b610.C15814a();
        this.f116259j = c15814a;
        this.f116258i = new b610(c15814a, ta10Var.m187693a(), ta10Var.m187695c());
        m144512z2(new sa10(bsmVar, this));
        this.f116260k = (cg10) m144512z2(new cg10(bsmVar));
        m144512z2(new pc10(bsmVar, this));
        m144512z2(new jh10(bsmVar, this));
        m144512z2(new z810(bsmVar, this));
        m144512z2(new k810(bsmVar, this));
    }

    /* JADX INFO: renamed from: Z3 */
    public void m139798Z3(BLiveMultiCall bLiveMultiCall) {
        this.f116260k.m106645L3(bLiveMultiCall);
        this.f116259j.m100382b(bLiveMultiCall);
    }

    /* JADX INFO: renamed from: a4 */
    public void m139799a4(String str) {
        yi10.m214879a("closeMultiCallMotion ,reason=" + str);
        r610.m178006k(this);
    }

    /* JADX INFO: renamed from: b4 */
    public b610 m139800b4() {
        return this.f116258i;
    }

    /* JADX INFO: renamed from: c4 */
    public C22306c<b610> m139801c4() {
        return this.f116258i.m100370p();
    }

    /* JADX INFO: renamed from: d4 */
    public String m139802d4() {
        return this.f116258i.m100377w();
    }

    /* JADX INFO: renamed from: e4 */
    public BLiveMultiCall m139803e4() {
        return this.f116260k.m106646M3();
    }

    /* JADX INFO: renamed from: f4 */
    public C22306c<BLiveMultiCall> m139804f4() {
        return this.f116260k.m106647N3().filter(new w9j() { // from class: l.x410
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f190935a.m139809k4((BLiveMultiCall) obj);
            }
        });
    }

    /* JADX INFO: renamed from: g4 */
    public final void m139805g4(boolean z) {
        BLiveMultiCall bLiveMultiCallM106646M3 = this.f116260k.m106646M3();
        if (NullChecker.m81303a(bLiveMultiCallM106646M3)) {
            yi10.m214879a("Act front is " + z);
            if (z) {
                LivingNormalApiProvider.m71436d4(bLiveMultiCallM106646M3.f44400id);
                if (ve10.m198132f(bLiveMultiCallM106646M3)) {
                    return;
                }
                LivingNormalApiProvider.m71276L6(bLiveMultiCallM106646M3.liveId, "");
                return;
            }
            LivingNormalApiProvider.m71429c6(bLiveMultiCallM106646M3.f44400id);
            if (ve10.m198132f(bLiveMultiCallM106646M3)) {
                return;
            }
            LivingNormalApiProvider.m71277L7(bLiveMultiCallM106646M3.liveId, false);
        }
    }

    /* JADX INFO: renamed from: h4 */
    public final void m139806h4(Boolean bool) {
        if (bool.booleanValue()) {
            duringCreated(LivingNormalApiProvider.m71427c4(m206027E2().m149814k())).subscribe(ffw.m121194e(new e30() { // from class: l.v410
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f179875a.m139810l4((Boolean) obj);
                }
            }, new e30() { // from class: l.w410
                @Override // p149l.e30
                public final void call(Object obj) {
                    yi10.m214879a("request close multi call fail , msg:" + ((Throwable) obj).getMessage());
                }
            }));
        } else {
            this.f116261l.mo144992k4();
        }
    }

    /* JADX INFO: renamed from: i4 */
    public final void m139807i4(C4319c c4319c) {
        if (c4319c == C4319c.f15548i) {
            m139819u4();
        }
    }

    /* JADX INFO: renamed from: j4 */
    public boolean m139808j4(BLiveMultiCall bLiveMultiCall) {
        return bLiveMultiCall.ownerMultiCallOrder.equals(m139802d4());
    }

    /* JADX INFO: renamed from: k4 */
    public final /* synthetic */ Boolean m139809k4(BLiveMultiCall bLiveMultiCall) {
        if (bLiveMultiCall.ownerMultiCallOrder.equals(m139802d4())) {
            return Boolean.TRUE;
        }
        yi10.m214879a("filter self info :" + bLiveMultiCall.toJson());
        return Boolean.FALSE;
    }

    /* JADX INFO: renamed from: l4 */
    public final /* synthetic */ void m139810l4(Boolean bool) {
        this.f116261l.mo144992k4();
    }

    /* JADX INFO: renamed from: m4 */
    public final /* synthetic */ void m139811m4(LongLinkLiveMessage.CallRewardPoint callRewardPoint) {
        BLiveMultiCall bLiveMultiCallM100373s = this.f116258i.m100373s(callRewardPoint.getUserId());
        if (bLiveMultiCallM100373s != null) {
            bLiveMultiCallM100373s.receivedRewardPoint = callRewardPoint.getRewardPoint();
            m139822x4(bLiveMultiCallM100373s);
        }
    }

    @Override // p149l.h4t, p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: n */
    public void mo69117n() {
        super.mo69117n();
    }

    /* JADX INFO: renamed from: n4 */
    public final /* synthetic */ void m139812n4(List list) {
        BLiveMultiCall bLiveMultiCallM177967B;
        m139821w4(list);
        String strM177969D = r610.m177969D(this);
        if ((ve10.m198137k(strM177969D) || ve10.m198129c(strM177969D) || ve10.m198133g(strM177969D)) && (bLiveMultiCallM177967B = r610.m177967B(this)) != null) {
            duringCreated(LivingNormalApiProvider.m71275L5(bLiveMultiCallM177967B.isLeadRole ? "big" : "small", this.f116258i.m100375u())).subscribe(ffw.m121197h(new e30() { // from class: l.z410
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f201435a.m139813o4((Integer) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: o4 */
    public final /* synthetic */ void m139813o4(Integer num) {
        C12714b c12714bMo133471a = ((oxl) m129297F3(new rv00(PlaybackException.ERROR_CODE_DRM_UNSPECIFIED))).mo133471a();
        if (c12714bMo133471a != null && c12714bMo133471a.m71900c1(MotionParams.PusherMotionEnum.MOTION_MULTI_CALL_ANCHOR)) {
            ((f110) c12714bMo133471a).m119088J1(num);
        } else {
            if (c12714bMo133471a == null || !c12714bMo133471a.m71900c1(MotionParams.PusherMotionEnum.MOTION_MULTI_CALL_AUDIENCE)) {
                return;
            }
            ((q210) c12714bMo133471a).m172425A1(num);
        }
    }

    /* JADX INFO: renamed from: p4 */
    public final /* synthetic */ List m139814p4(ckj ckjVar) {
        return this.f116258i.m100378x();
    }

    /* JADX INFO: renamed from: q4 */
    public final /* synthetic */ String m139815q4(qc10 qc10Var) {
        return m139802d4();
    }

    /* JADX INFO: renamed from: r4 */
    public final /* synthetic */ void m139816r4(Boolean bool) {
        m139819u4();
    }

    /* JADX INFO: renamed from: s4 */
    public final void m139817s4(LiveInfoMessage liveInfoMessage) {
        List<LongLinkLiveMessage.CallRewardPoint> list = liveInfoMessage.multiCallRewardPoint;
        if (vwb.m200296J(list)) {
            return;
        }
        vwb.m200354z(list, new e30() { // from class: l.i510
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f111497a.m139811m4((LongLinkLiveMessage.CallRewardPoint) obj);
            }
        });
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        m129301d3(ckj.class, new w9j() { // from class: l.t410
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f167681a.m139814p4((ckj) obj);
            }
        });
        m129301d3(qc10.class, new w9j() { // from class: l.a510
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f67624a.m139815q4((qc10) obj);
            }
        });
        duringCreated((C22306c) m206028F2().MultiCallEvent.prepareCloseMultiCall().m172460g()).subscribe(ffw.m121197h(new e30() { // from class: l.b510
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f73430a.m139806h4((Boolean) obj);
            }
        }));
        duringCreated(Act.front()).subscribe(ffw.m121197h(new e30() { // from class: l.c510
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f79315a.m139805g4(((Boolean) obj).booleanValue());
            }
        }));
        duringCreated(m206027E2().m132160q1().m189038C()).filter(new w9j() { // from class: l.d510
            @Override // p149l.w9j
            public final Object call(Object obj) {
                LiveInfoMessage liveInfoMessage = (LiveInfoMessage) obj;
                return Boolean.valueOf(liveInfoMessage.isRewardChange() || liveInfoMessage.isAllChange());
            }
        }).subscribe(new e30() { // from class: l.e510
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f89344a.m139817s4((LiveInfoMessage) obj);
            }
        });
        lifecycle().subscribe(ffw.m121197h(new e30() { // from class: l.f510
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f94954a.m139807i4((C4319c) obj);
            }
        }));
        duringCreated(ConnectivityReceiver.m81290m().observeOn(jo0.m142408a()).map(new w9j() { // from class: l.g510
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(ConnectivityReceiver.m81284g());
            }
        }).distinctUntilChanged().skip(1)).subscribe(ffw.m121197h(new e30() { // from class: l.h510
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f105905a.m139816r4((Boolean) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: t4 */
    public void m139818t4() {
        BLiveMultiCall bLiveMultiCallM178019z = r610.m178019z(this);
        if (bLiveMultiCallM178019z != null) {
            duringCreated(LivingNormalApiProvider.m71185B5(bLiveMultiCallM178019z.ownerLiveId)).subscribe(ffw.m121197h(new e30() { // from class: l.y410
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f195888a.m139812n4((List) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: u4 */
    public final void m139819u4() {
        BLiveMultiCall bLiveMultiCallM178019z = r610.m178019z(this);
        if (NullChecker.m81303a(bLiveMultiCallM178019z)) {
            duringCreated(LivingNormalApiProvider.m71185B5(bLiveMultiCallM178019z.ownerLiveId)).subscribe(ffw.m121197h(new e30() { // from class: l.u410
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f173680a.m139821w4((List) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: v4 */
    public void m139820v4(BLiveMultiCall bLiveMultiCall) {
        this.f116260k.m106648O3(bLiveMultiCall);
        this.f116259j.m100383c(bLiveMultiCall);
    }

    /* JADX INFO: renamed from: w4 */
    public void m139821w4(List<BLiveMultiCall> list) {
        this.f116260k.m106651S3(list);
        this.f116259j.m100384d(list);
    }

    /* JADX INFO: renamed from: x4 */
    public void m139822x4(BLiveMultiCall bLiveMultiCall) {
        this.f116260k.m106650R3(bLiveMultiCall);
        this.f116259j.m100385e(bLiveMultiCall);
    }
}
