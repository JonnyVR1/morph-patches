package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.android.app.C4319c;
import com.p046p1.mobile.putong.live.base.data.BLive;
import com.p046p1.mobile.putong.live.base.data.BLivePkFirstKillGift;
import com.p046p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.p046p1.mobile.putong.live.livingroom.archi.longlink.bean.LivePkMessage;
import com.p046p1.mobile.putong.live.livingroom.archi.motion.MotionType;
import com.p046p1.mobile.putong.live.livingroom.recreation.p062pk.PkView;
import com.p046p1.mobile.putong.live.livingroom.recreation.p062pk.bean.PkLaunchData;
import com.p046p1.mobile.putong.live.livingroom.recreation.p062pk.internal.PkViewInternal;
import com.tantanapp.common.utils.ConnectivityReceiver;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import p133rx.C22306c;
import p133rx.subjects.C22393b;

/* JADX INFO: loaded from: classes5.dex */
public class lk70 extends pat<am40> implements l3m {

    /* JADX INFO: renamed from: i */
    public final PkView f128451i;

    /* JADX INFO: renamed from: j */
    public final PkViewInternal f128452j;

    /* JADX INFO: renamed from: k */
    public BLivePkFirstKillGift f128453k;

    /* JADX INFO: renamed from: l */
    public c4g0 f128454l;

    /* JADX INFO: renamed from: m */
    public final C22393b<String> f128455m;

    /* JADX INFO: renamed from: n */
    public String f128456n;

    public lk70(bsm bsmVar, PkView pkView, PkViewInternal pkViewInternal) {
        super(bsmVar);
        this.f128455m = C22393b.m221521b();
        this.f128451i = pkView;
        this.f128452j = pkViewInternal;
        m144512z2(new xl70(bsmVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H4 */
    public void m150138H4(iqv iqvVar) {
        if (iqvVar.m137796c()) {
            m150181M4(false, null);
        }
    }

    /* JADX INFO: renamed from: O3 */
    public static /* synthetic */ BLive m150144O3(r8d0 r8d0Var) {
        return (BLive) r8d0Var.f187610c;
    }

    /* JADX INFO: renamed from: P3 */
    public static /* synthetic */ rwb m150145P3(String str, rwb rwbVar) {
        return (rwb) ht70.m132852i("ctyp changed to " + rwbVar.f161324a + " from " + str, rwbVar);
    }

    /* JADX INFO: renamed from: R3 */
    public static /* synthetic */ Boolean m150146R3(Boolean bool) {
        return (Boolean) ht70.m132852i("enterRoom current ctyp:" + bool, bool);
    }

    /* JADX INFO: renamed from: S3 */
    public static /* synthetic */ String m150147S3(String str) {
        return (String) ht70.m132852i("checkPkData ongoing id:" + str, str);
    }

    /* JADX INFO: renamed from: U3 */
    public static /* synthetic */ void m150149U3(Integer num, MotionType motionType) {
    }

    /* JADX INFO: renamed from: Y3 */
    public static /* synthetic */ String m150153Y3(String str) {
        return (String) ht70.m132852i("pk pkCheckerObs:" + str, str);
    }

    /* JADX INFO: renamed from: a4 */
    public static /* synthetic */ String m150155a4(String str) {
        return (String) ht70.m132852i("getPkOngoingObs ongoing id:" + str, str);
    }

    /* JADX INFO: renamed from: c4 */
    public static /* synthetic */ void m150157c4(Integer num, MotionType motionType) {
    }

    /* JADX INFO: renamed from: e4 */
    public static /* synthetic */ String m150159e4(Object obj, String str) {
        return str;
    }

    /* JADX INFO: renamed from: l4 */
    public static /* synthetic */ LivePkMessage m150166l4(LivePkMessage livePkMessage) {
        return (LivePkMessage) ht70.m132852i("getPkMessageObs message:" + livePkMessage.toString(), livePkMessage);
    }

    /* JADX INFO: renamed from: A4 */
    public final /* synthetic */ void m150170A4(Object obj) {
        m150178J4(-1L);
    }

    /* JADX INFO: renamed from: B4 */
    public final /* synthetic */ void m150171B4(String str) {
        mkd0.m154992z(this.f128454l);
    }

    /* JADX INFO: renamed from: C4 */
    public final /* synthetic */ void m150172C4(String str) {
        m150181M4(m150190x4(), str);
    }

    /* JADX INFO: renamed from: D4 */
    public final /* synthetic */ void m150173D4(soj0 soj0Var) {
        m150181M4(false, null);
    }

    /* JADX INFO: renamed from: E4 */
    public final /* synthetic */ void m150174E4(String str) {
        this.f128456n = str;
    }

    /* JADX INFO: renamed from: F4 */
    public final /* synthetic */ void m150175F4(BLivePkFirstKillGift bLivePkFirstKillGift) {
        this.f128453k = bLivePkFirstKillGift;
    }

    /* JADX INFO: renamed from: G4 */
    public final /* synthetic */ String m150176G4(om70 om70Var) {
        BLivePkFirstKillGift bLivePkFirstKillGift = this.f128453k;
        return bLivePkFirstKillGift == null ? "" : bLivePkFirstKillGift.giftId;
    }

    /* JADX INFO: renamed from: I4 */
    public final C22306c<String> m150177I4() {
        return C22306c.merge(m150189w4(), m150188v4(), this.f128455m.map(new w9j() { // from class: l.jk70
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return lk70.m150153Y3((String) obj);
            }
        })).distinctUntilChanged();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: J4 */
    public final void m150178J4(final Long l2) {
        C22306c c22306cDoOnNext = duringCreated(LivingNormalApiProvider.m71473h5(((am40) m206027E2()).m149814k())).map(new w9j() { // from class: l.rj70
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return lk70.m150144O3((r8d0) obj);
            }
        }).compose(new nj70(this)).doOnNext(new e30() { // from class: l.sj70
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f164812a.m150171B4((String) obj);
            }
        });
        final C22393b<String> c22393b = this.f128455m;
        Objects.requireNonNull(c22393b);
        c22306cDoOnNext.subscribe(ffw.m121194e(new e30() { // from class: l.tj70
            @Override // p149l.e30
            public final void call(Object obj) {
                c22393b.m132487l((String) obj);
            }
        }, new e30() { // from class: l.uj70
            @Override // p149l.e30
            public final void call(Object obj) {
                ht70.m132852i("requestCheck " + l2, "");
            }
        }));
    }

    /* JADX INFO: renamed from: K4 */
    public final boolean m150179K4(String str, String str2) {
        return this.f188512e.f77104j.m201578M3() == MotionType.pk && !TextUtils.equals(str2, str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: L4 */
    public final void m150180L4(boolean z) {
        mkd0.m154992z(this.f128454l);
        if (z) {
            ht70.m132852i("start pk timer", "");
            this.f128454l = ((am40) m206027E2()).m132135h2(5, TimeUnit.SECONDS).take(24).subscribe(ffw.m121193d(new e30() { // from class: l.qj70
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f154902a.m150178J4((Long) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: M4 */
    public final void m150181M4(boolean z, String str) {
        mkd0.m154992z(this.f128454l);
        if (z && m150179K4(str, this.f128456n)) {
            ht70.m132853j("pk motion close current first");
            m150181M4(false, "");
            ht70.m132853j("pk motion start next");
            m150181M4(true, str);
        }
        ht70.m132853j("pk motion switch ,isAnchor:false,motion:" + z);
        jy00 jy00Var = new jy00(z, MotionType.pk);
        if (z) {
            if (vdt.m198092b(2)) {
                jy00Var.m143840b(new PkLaunchData(this.f128452j, str)).m143839a(new f30() { // from class: l.fj70
                    @Override // p149l.f30
                    public final void call(Object obj, Object obj2) {
                        lk70.m150149U3((Integer) obj, (MotionType) obj2);
                    }
                });
            } else {
                jy00Var.m143840b(new PkLaunchData(this.f128451i, str)).m143839a(new f30() { // from class: l.kk70
                    @Override // p149l.f30
                    public final void call(Object obj, Object obj2) {
                        lk70.m150157c4((Integer) obj, (MotionType) obj2);
                    }
                });
            }
        }
        m206028F2().MotionEvent.motionSwitch().mo172463j(jy00Var);
    }

    /* JADX INFO: renamed from: p4 */
    public final void m150182p4() {
        duringCreated(m150185s4("checker")).subscribe(ffw.m121193d(new e30() { // from class: l.gj70
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f103015a.m150191y4((rwb) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: q4 */
    public final void m150183q4() {
        duringCreated(C22306c.merge(ConnectivityReceiver.m81290m().skip(1).filter(new w9j() { // from class: l.jj70
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(ConnectivityReceiver.m81284g());
            }
        }), lifecycle().filter(new w9j() { // from class: l.kj70
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((C4319c) obj) == C4319c.f15548i);
            }
        }))).filter(new w9j() { // from class: l.lj70
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f128290a.m150192z4(obj);
            }
        }).subscribe(ffw.m121193d(new e30() { // from class: l.mj70
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f134108a.m150170A4(obj);
            }
        }));
    }

    /* JADX INFO: renamed from: r4 */
    public final C22306c<String> m150184r4(C22306c<BLive> c22306c) {
        return c22306c.filter(new w9j() { // from class: l.zj70
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((BLive) obj).pkInfo != null);
            }
        }).map(new w9j() { // from class: l.bk70
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((BLive) obj).pkInfo.ongoingId;
            }
        }).filter(new w9j() { // from class: l.ck70
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(!TextUtils.isEmpty((String) obj));
            }
        }).map(new w9j() { // from class: l.dk70
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return lk70.m150147S3((String) obj);
            }
        });
    }

    /* JADX INFO: renamed from: s4 */
    public final C22306c<rwb> m150185s4(final String str) {
        return duringCreated(m206028F2().PlayerEvent.ctypChanged().m172460g()).map(new w9j() { // from class: l.hj70
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return lk70.m150145P3(str, (rwb) obj);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        duringCreated(((am40) m206027E2()).m149815l()).subscribe(ffw.m121193d(new e30() { // from class: l.ej70
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f91675a.m150138H4((iqv) obj);
            }
        }));
        m150183q4();
        m150182p4();
        duringCreated(C22306c.combineLatest(m150186t4(), m150177I4(), new x9j() { // from class: l.pj70
            @Override // p149l.x9j
            public final Object call(Object obj, Object obj2) {
                return lk70.m150159e4(obj, (String) obj2);
            }
        })).subscribe(ffw.m121194e(new e30() { // from class: l.ak70
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f70252a.m150172C4((String) obj);
            }
        }, new e30() { // from class: l.ek70
            @Override // p149l.e30
            public final void call(Object obj) {
                Throwable th = (Throwable) obj;
                ht70.m132852i("pk obs error:" + th.toString(), th);
            }
        }));
        duringCreated(m206028F2().LivePkEvent.pkEndEvent().m172460g()).subscribe(ffw.m121193d(new e30() { // from class: l.fk70
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f98044a.m150173D4((soj0) obj);
            }
        }));
        duringCreated(m206028F2().LivePkEvent.updateCurrentPk().m172460g()).subscribe(ffw.m121193d(new e30() { // from class: l.gk70
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f103157a.m150174E4((String) obj);
            }
        }));
        duringCreated(m206028F2().LivePkEvent.updateFirstGift().m172460g()).subscribe(ffw.m121193d(new e30() { // from class: l.hk70
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f108164a.m150175F4((BLivePkFirstKillGift) obj);
            }
        }));
        m129301d3(om70.class, new w9j() { // from class: l.ik70
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f113646a.m150176G4((om70) obj);
            }
        });
    }

    /* JADX INFO: renamed from: t4 */
    public final C22306c<Object> m150186t4() {
        return C22306c.merge(m150187u4(), m150185s4("fixed"));
    }

    /* JADX INFO: renamed from: u4 */
    public final C22306c<Boolean> m150187u4() {
        return C22306c.just(Boolean.valueOf(m150190x4())).map(new w9j() { // from class: l.ij70
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return lk70.m150146R3((Boolean) obj);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: v4 */
    public final C22306c<String> m150188v4() {
        return ((am40) m206027E2()).m132160q1().m189074U().filter(new w9j() { // from class: l.vj70
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((LivePkMessage) obj).isPkCreateMessage());
            }
        }).filter(new w9j() { // from class: l.wj70
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(!TextUtils.isEmpty(((LivePkMessage) obj).f47752id));
            }
        }).map(new w9j() { // from class: l.xj70
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return lk70.m150166l4((LivePkMessage) obj);
            }
        }).map(new w9j() { // from class: l.yj70
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((LivePkMessage) obj).f47752id;
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: w4 */
    public final C22306c<String> m150189w4() {
        return C22306c.just(((am40) m206027E2()).m170393A2().mo165470l()).compose(new nj70(this)).map(new w9j() { // from class: l.oj70
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return lk70.m150155a4((String) obj);
            }
        });
    }

    /* JADX INFO: renamed from: x4 */
    public final boolean m150190x4() {
        return ((rwb) m129297F3(new cm70(600))).f161324a == 1;
    }

    /* JADX INFO: renamed from: y4 */
    public final /* synthetic */ void m150191y4(rwb rwbVar) {
        m150180L4(m150190x4());
    }

    /* JADX INFO: renamed from: z4 */
    public final /* synthetic */ Boolean m150192z4(Object obj) {
        return Boolean.valueOf(lifecycle_() == C4319c.f15548i);
    }
}
