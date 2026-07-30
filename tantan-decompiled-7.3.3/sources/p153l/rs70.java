package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.putong.live.base.data.BLive;
import com.p051p1.mobile.putong.live.base.data.BLivePkFirstKillGift;
import com.p051p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.p051p1.mobile.putong.live.livingroom.archi.longlink.bean.LivePkMessage;
import com.p051p1.mobile.putong.live.livingroom.archi.motion.MotionType;
import com.p051p1.mobile.putong.live.livingroom.recreation.p067pk.PkView;
import com.p051p1.mobile.putong.live.livingroom.recreation.p067pk.bean.PkLaunchData;
import com.p051p1.mobile.putong.live.livingroom.recreation.p067pk.internal.PkViewInternal;
import com.tantanapp.common.utils.ConnectivityReceiver;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import p137rx.C22421c;
import p137rx.subjects.C22508b;

/* JADX INFO: loaded from: classes5.dex */
public class rs70 extends qct<ou40> implements c6m {

    /* JADX INFO: renamed from: i */
    public final PkView f164640i;

    /* JADX INFO: renamed from: j */
    public final PkViewInternal f164641j;

    /* JADX INFO: renamed from: k */
    public BLivePkFirstKillGift f164642k;

    /* JADX INFO: renamed from: l */
    public kcg0 f164643l;

    /* JADX INFO: renamed from: m */
    public final C22508b<String> f164644m;

    /* JADX INFO: renamed from: n */
    public String f164645n;

    public rs70(dum dumVar, PkView pkView, PkViewInternal pkViewInternal) {
        super(dumVar);
        this.f164644m = C22508b.m222767b();
        this.f164640i = pkView;
        this.f164641j = pkViewInternal;
        m153103z2(new du70(dumVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H4 */
    public void m182855H4(jsv jsvVar) {
        if (jsvVar.m146877c()) {
            m182898M4(false, null);
        }
    }

    /* JADX INFO: renamed from: O3 */
    public static /* synthetic */ BLive m182861O3(ugd0 ugd0Var) {
        return (BLive) ugd0Var.f138293c;
    }

    /* JADX INFO: renamed from: P3 */
    public static /* synthetic */ fyb m182862P3(String str, fyb fybVar) {
        return (fyb) n180.m161092i("ctyp changed to " + fybVar.f101357a + " from " + str, fybVar);
    }

    /* JADX INFO: renamed from: R3 */
    public static /* synthetic */ Boolean m182863R3(Boolean bool) {
        return (Boolean) n180.m161092i("enterRoom current ctyp:" + bool, bool);
    }

    /* JADX INFO: renamed from: S3 */
    public static /* synthetic */ String m182864S3(String str) {
        return (String) n180.m161092i("checkPkData ongoing id:" + str, str);
    }

    /* JADX INFO: renamed from: U3 */
    public static /* synthetic */ void m182866U3(Integer num, MotionType motionType) {
    }

    /* JADX INFO: renamed from: Y3 */
    public static /* synthetic */ String m182870Y3(String str) {
        return (String) n180.m161092i("pk pkCheckerObs:" + str, str);
    }

    /* JADX INFO: renamed from: a4 */
    public static /* synthetic */ String m182872a4(String str) {
        return (String) n180.m161092i("getPkOngoingObs ongoing id:" + str, str);
    }

    /* JADX INFO: renamed from: c4 */
    public static /* synthetic */ void m182874c4(Integer num, MotionType motionType) {
    }

    /* JADX INFO: renamed from: e4 */
    public static /* synthetic */ String m182876e4(Object obj, String str) {
        return str;
    }

    /* JADX INFO: renamed from: l4 */
    public static /* synthetic */ LivePkMessage m182883l4(LivePkMessage livePkMessage) {
        return (LivePkMessage) n180.m161092i("getPkMessageObs message:" + livePkMessage.toString(), livePkMessage);
    }

    /* JADX INFO: renamed from: A4 */
    public final /* synthetic */ void m182887A4(Object obj) {
        m182895J4(-1L);
    }

    /* JADX INFO: renamed from: B4 */
    public final /* synthetic */ void m182888B4(String str) {
        psd0.m173633z(this.f164643l);
    }

    /* JADX INFO: renamed from: C4 */
    public final /* synthetic */ void m182889C4(String str) {
        m182898M4(m182907x4(), str);
    }

    /* JADX INFO: renamed from: D4 */
    public final /* synthetic */ void m182890D4(vxj0 vxj0Var) {
        m182898M4(false, null);
    }

    /* JADX INFO: renamed from: E4 */
    public final /* synthetic */ void m182891E4(String str) {
        this.f164645n = str;
    }

    /* JADX INFO: renamed from: F4 */
    public final /* synthetic */ void m182892F4(BLivePkFirstKillGift bLivePkFirstKillGift) {
        this.f164642k = bLivePkFirstKillGift;
    }

    /* JADX INFO: renamed from: G4 */
    public final /* synthetic */ String m182893G4(uu70 uu70Var) {
        BLivePkFirstKillGift bLivePkFirstKillGift = this.f164642k;
        return bLivePkFirstKillGift == null ? "" : bLivePkFirstKillGift.giftId;
    }

    /* JADX INFO: renamed from: I4 */
    public final C22421c<String> m182894I4() {
        return C22421c.merge(m182906w4(), m182905v4(), this.f164644m.map(new qcj() { // from class: l.ps70
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return rs70.m182870Y3((String) obj);
            }
        })).distinctUntilChanged();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: J4 */
    public final void m182895J4(final Long l2) {
        C22421c c22421cDoOnNext = duringCreated(LivingNormalApiProvider.m72656h5(((ou40) m213810E2()).m202191k())).map(new qcj() { // from class: l.xr70
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return rs70.m182861O3((ugd0) obj);
            }
        }).compose(new tr70(this)).doOnNext(new y20() { // from class: l.yr70
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f201287a.m182888B4((String) obj);
            }
        });
        final C22508b<String> c22508b = this.f164644m;
        Objects.requireNonNull(c22508b);
        c22421cDoOnNext.subscribe(dhw.m115826e(new y20() { // from class: l.zr70
            @Override // p153l.y20
            public final void call(Object obj) {
                c22508b.m137019l((String) obj);
            }
        }, new y20() { // from class: l.as70
            @Override // p153l.y20
            public final void call(Object obj) {
                n180.m161092i("requestCheck " + l2, "");
            }
        }));
    }

    /* JADX INFO: renamed from: K4 */
    public final boolean m182896K4(String str, String str2) {
        return this.f196918e.f90824j.m209549M3() == MotionType.pk && !TextUtils.equals(str2, str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: L4 */
    public final void m182897L4(boolean z) {
        psd0.m173633z(this.f164643l);
        if (z) {
            n180.m161092i("start pk timer", "");
            this.f164643l = ((ou40) m213810E2()).m168521h2(5, TimeUnit.SECONDS).take(24).subscribe(dhw.m115825d(new y20() { // from class: l.wr70
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f190487a.m182895J4((Long) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: M4 */
    public final void m182898M4(boolean z, String str) {
        psd0.m173633z(this.f164643l);
        if (z && m182896K4(str, this.f164645n)) {
            n180.m161093j("pk motion close current first");
            m182898M4(false, "");
            n180.m161093j("pk motion start next");
            m182898M4(true, str);
        }
        n180.m161093j("pk motion switch ,isAnchor:false,motion:" + z);
        t610 t610Var = new t610(z, MotionType.pk);
        if (z) {
            if (wft.m206159b(2)) {
                t610Var.m189492b(new PkLaunchData(this.f164641j, str)).m189491a(new z20() { // from class: l.lr70
                    @Override // p153l.z20
                    public final void call(Object obj, Object obj2) {
                        rs70.m182866U3((Integer) obj, (MotionType) obj2);
                    }
                });
            } else {
                t610Var.m189492b(new PkLaunchData(this.f164640i, str)).m189491a(new z20() { // from class: l.qs70
                    @Override // p153l.z20
                    public final void call(Object obj, Object obj2) {
                        rs70.m182874c4((Integer) obj, (MotionType) obj2);
                    }
                });
            }
        }
        m213811F2().MotionEvent.motionSwitch().mo199273j(t610Var);
    }

    /* JADX INFO: renamed from: p4 */
    public final void m182899p4() {
        duringCreated(m182902s4("checker")).subscribe(dhw.m115825d(new y20() { // from class: l.mr70
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f138305a.m182908y4((fyb) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: q4 */
    public final void m182900q4() {
        duringCreated(C22421c.merge(ConnectivityReceiver.m82473m().skip(1).filter(new qcj() { // from class: l.pr70
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(ConnectivityReceiver.m82467g());
            }
        }), lifecycle().filter(new qcj() { // from class: l.qr70
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((C4470c) obj) == C4470c.f16267i);
            }
        }))).filter(new qcj() { // from class: l.rr70
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f164559a.m182909z4(obj);
            }
        }).subscribe(dhw.m115825d(new y20() { // from class: l.sr70
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f170310a.m182887A4(obj);
            }
        }));
    }

    /* JADX INFO: renamed from: r4 */
    public final C22421c<String> m182901r4(C22421c<BLive> c22421c) {
        return c22421c.filter(new qcj() { // from class: l.fs70
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((BLive) obj).pkInfo != null);
            }
        }).map(new qcj() { // from class: l.hs70
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((BLive) obj).pkInfo.ongoingId;
            }
        }).filter(new qcj() { // from class: l.is70
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(!TextUtils.isEmpty((String) obj));
            }
        }).map(new qcj() { // from class: l.js70
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return rs70.m182864S3((String) obj);
            }
        });
    }

    /* JADX INFO: renamed from: s4 */
    public final C22421c<fyb> m182902s4(final String str) {
        return duringCreated(m213811F2().PlayerEvent.ctypChanged().m199270g()).map(new qcj() { // from class: l.nr70
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return rs70.m182862P3(str, (fyb) obj);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        duringCreated(((ou40) m213810E2()).m202192l()).subscribe(dhw.m115825d(new y20() { // from class: l.kr70
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f128427a.m182855H4((jsv) obj);
            }
        }));
        m182900q4();
        m182899p4();
        duringCreated(C22421c.combineLatest(m182903t4(), m182894I4(), new rcj() { // from class: l.vr70
            @Override // p153l.rcj
            public final Object call(Object obj, Object obj2) {
                return rs70.m182876e4(obj, (String) obj2);
            }
        })).subscribe(dhw.m115826e(new y20() { // from class: l.gs70
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f106240a.m182889C4((String) obj);
            }
        }, new y20() { // from class: l.ks70
            @Override // p153l.y20
            public final void call(Object obj) {
                Throwable th = (Throwable) obj;
                n180.m161092i("pk obs error:" + th.toString(), th);
            }
        }));
        duringCreated(m213811F2().LivePkEvent.pkEndEvent().m199270g()).subscribe(dhw.m115825d(new y20() { // from class: l.ls70
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f133407a.m182890D4((vxj0) obj);
            }
        }));
        duringCreated(m213811F2().LivePkEvent.updateCurrentPk().m199270g()).subscribe(dhw.m115825d(new y20() { // from class: l.ms70
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f138457a.m182891E4((String) obj);
            }
        }));
        duringCreated(m213811F2().LivePkEvent.updateFirstGift().m199270g()).subscribe(dhw.m115825d(new y20() { // from class: l.ns70
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f143473a.m182892F4((BLivePkFirstKillGift) obj);
            }
        }));
        m138860d3(uu70.class, new qcj() { // from class: l.os70
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f148791a.m182893G4((uu70) obj);
            }
        });
    }

    /* JADX INFO: renamed from: t4 */
    public final C22421c<Object> m182903t4() {
        return C22421c.merge(m182904u4(), m182902s4("fixed"));
    }

    /* JADX INFO: renamed from: u4 */
    public final C22421c<Boolean> m182904u4() {
        return C22421c.just(Boolean.valueOf(m182907x4())).map(new qcj() { // from class: l.or70
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return rs70.m182863R3((Boolean) obj);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: v4 */
    public final C22421c<String> m182905v4() {
        return ((ou40) m213810E2()).m168545q1().m98256U().filter(new qcj() { // from class: l.bs70
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((LivePkMessage) obj).isPkCreateMessage());
            }
        }).filter(new qcj() { // from class: l.cs70
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(!TextUtils.isEmpty(((LivePkMessage) obj).f48600id));
            }
        }).map(new qcj() { // from class: l.ds70
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return rs70.m182883l4((LivePkMessage) obj);
            }
        }).map(new qcj() { // from class: l.es70
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((LivePkMessage) obj).f48600id;
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: w4 */
    public final C22421c<String> m182906w4() {
        return C22421c.just(((ou40) m213810E2()).m118363A2().mo122892l()).compose(new tr70(this)).map(new qcj() { // from class: l.ur70
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return rs70.m182872a4((String) obj);
            }
        });
    }

    /* JADX INFO: renamed from: x4 */
    public final boolean m182907x4() {
        return ((fyb) m138856F3(new iu70(600))).f101357a == 1;
    }

    /* JADX INFO: renamed from: y4 */
    public final /* synthetic */ void m182908y4(fyb fybVar) {
        m182897L4(m182907x4());
    }

    /* JADX INFO: renamed from: z4 */
    public final /* synthetic */ Boolean m182909z4(Object obj) {
        return Boolean.valueOf(lifecycle_() == C4470c.f16267i);
    }
}
