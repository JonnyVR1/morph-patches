package p149l;

import android.net.NetworkInfo;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import com.p046p1.mobile.android.app.C4319c;
import com.p046p1.mobile.android.app.Dialog;
import com.p046p1.mobile.putong.api.api.TantanException;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.live.LiveDialogAct;
import com.p046p1.mobile.putong.live.base.data.BLive;
import com.p046p1.mobile.putong.live.base.data.BLiveAnchor;
import com.p046p1.mobile.putong.live.base.data.BLiveMultiCallAsset;
import com.p046p1.mobile.putong.live.base.data.BLiveRoom;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.p046p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveControlMessage;
import com.p046p1.mobile.putong.live.livingroom.archi.motion.MotionType;
import com.p046p1.mobile.putong.live.livingroom.archi.sdk.motion.base.C12714b;
import com.p046p1.mobile.putong.live.livingroom.other.liveend.IntlLiveEndAct;
import com.p046p1.mobile.putong.live.livingroom.other.liveend.LiveEndAct;
import com.tantanapp.common.utils.ConnectivityReceiver;
import java.util.Objects;
import p133rx.C22306c;
import p133rx.Notification;

/* JADX INFO: loaded from: classes4.dex */
public class adt extends pat<yl40> {

    /* JADX INFO: renamed from: i */
    public boolean f68962i;

    /* JADX INFO: renamed from: j */
    public boolean f68963j;

    /* JADX INFO: renamed from: k */
    public boolean f68964k;

    /* JADX INFO: renamed from: l */
    public int f68965l;

    /* JADX INFO: renamed from: m */
    public c4g0 f68966m;

    public adt(bsm bsmVar) {
        super(bsmVar);
        this.f68965l = -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A4 */
    public /* synthetic */ void m95919A4(soj0 soj0Var) {
        m95999u4();
    }

    /* JADX INFO: renamed from: X3 */
    public static /* synthetic */ void m95933X3(BLiveRoom bLiveRoom) {
    }

    /* JADX INFO: renamed from: b4 */
    public static /* synthetic */ void m95937b4() {
    }

    /* JADX INFO: renamed from: i4 */
    public static /* synthetic */ void m95944i4(d30 d30Var) {
        if (d30Var != null) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: i5 */
    private boolean m95945i5() {
        return ((Boolean) m129297F3(new rk80(3300))).booleanValue();
    }

    /* JADX INFO: renamed from: n4 */
    public static /* synthetic */ void m95950n4(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z4 */
    public /* synthetic */ void m95955z4(soj0 soj0Var) {
        m95983c5();
    }

    /* JADX INFO: renamed from: B4 */
    public final /* synthetic */ void m95956B4(cdt cdtVar) {
        m95992m5(true, cdtVar.f80406a, cdtVar.f80407b, cdtVar.f80408c);
    }

    /* JADX INFO: renamed from: C4 */
    public final /* synthetic */ void m95957C4(C4319c c4319c) {
        if (c4319c == C4319c.f15548i) {
            m95979Y4();
        } else if (c4319c == C4319c.f15550k) {
            m95980Z4();
        }
    }

    /* JADX INFO: renamed from: D4 */
    public final /* synthetic */ void m95958D4(iqv iqvVar) {
        if (iqvVar.m137794a() == 4 && this.f68965l != 5) {
            this.f68965l = 5;
            m95977W4((u7s) iqvVar);
        }
    }

    /* JADX INFO: renamed from: E4 */
    public final /* synthetic */ void m95959E4(BLive bLive) {
        m95997s4(true, act().getString(R$string.f46930R5), false);
    }

    /* JADX INFO: renamed from: F4 */
    public final /* synthetic */ void m95960F4() {
        m95997s4(false, null, true);
    }

    /* JADX INFO: renamed from: G4 */
    public final /* synthetic */ void m95961G4() {
        act().m66873d2();
    }

    /* JADX INFO: renamed from: H4 */
    public final /* synthetic */ void m95962H4(BLiveAnchor bLiveAnchor) {
        m206028F2().CallEvent.anchorCall().mo172463j(Boolean.FALSE);
    }

    /* JADX INFO: renamed from: I4 */
    public final /* synthetic */ void m95963I4(boolean z, String str, j760 j760Var, BLiveMultiCallAsset bLiveMultiCallAsset) {
        m95993n5(z, str, j760Var);
        m206028F2().MultiCallEvent.startLiveMultiCall().mo172463j(new ug10(s410.f162238d, bLiveMultiCallAsset.multiCallOrder, r610.m178015u(bLiveMultiCallAsset.maxCallNum, false), -1));
    }

    /* JADX INFO: renamed from: J4 */
    public final /* synthetic */ void m95964J4() {
        act().m66873d2();
    }

    /* JADX INFO: renamed from: K4 */
    public final /* synthetic */ void m95965K4(BLiveAnchor bLiveAnchor) {
        if (TEnum.equals(bLiveAnchor.status, "jailed")) {
            act().dialog().m20504F(act().getString(R$string.f47213eb, mqi0.m155945p(bLiveAnchor.availableTime))).m20496B(false).m20560v0(act().getString(R$string.f47423o2), new Runnable() { // from class: l.sct
                @Override // java.lang.Runnable
                public final void run() {
                    this.f163767a.m95964J4();
                }
            }).m20568z0();
        }
    }

    /* JADX INFO: renamed from: L4 */
    public final /* synthetic */ void m95966L4(Throwable th) {
        m95978X4(th, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: M4 */
    public final /* synthetic */ void m95967M4(View view) {
        eet.m116003b(this, "anchor_stop_live_confirm", null);
        m95994o5(((yl40) m206027E2()).m149814k());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: N4 */
    public final /* synthetic */ void m95968N4() {
        eet.m116003b(this, "anchor_stop_live_confirm", null);
        m95994o5(((yl40) m206027E2()).m149814k());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: O4 */
    public final /* synthetic */ C22306c m95969O4(String str, BLiveRoom bLiveRoom) {
        return LivingNormalApiProvider.m71454f4(bLiveRoom.f44324id, m95945i5(), ((yl40) m206027E2()).m215217K2(), str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: P4 */
    public final /* synthetic */ void m95970P4(boolean z, String str, j760 j760Var) {
        S s = j760Var.f116565b;
        if (s == 0 || !"friends".equals(((BLive) s).liveMode)) {
            m95993n5(z, str, j760Var);
        } else {
            m95981a5(z, str, j760Var);
        }
    }

    /* JADX INFO: renamed from: Q4 */
    public final /* synthetic */ void m95971Q4(boolean z, Throwable th) {
        this.f68965l = -3;
        act().progressDismiss();
        m95978X4(th, true);
        m95984d5(th, z);
    }

    /* JADX INFO: renamed from: R4 */
    public final /* synthetic */ void m95972R4(BLive bLive) {
        m95997s4(false, null, true);
    }

    /* JADX INFO: renamed from: S4 */
    public final /* synthetic */ void m95973S4(Throwable th) {
        m95997s4(false, null, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: T */
    public void mo70198T() {
        super.mo70198T();
        m95995p5();
        duringCreated(m206028F2().LivePusherEvent.recoverLive().m172460g()).subscribe(ffw.m121193d(new e30() { // from class: l.qbt
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f153696a.m95955z4((soj0) obj);
            }
        }));
        duringCreated(m206028F2().LivePusherEvent.stopLive().m172460g()).subscribe(ffw.m121193d(new e30() { // from class: l.bct
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f74963a.m95994o5((String) obj);
            }
        }));
        duringCreated(m206028F2().LivePusherEvent.suspendLive().m172460g()).subscribe(ffw.m121193d(new e30() { // from class: l.mct
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f133184a.m95996q5(((Boolean) obj).booleanValue());
            }
        }));
        duringCreated(m206028F2().LivePusherEvent.closeLive().m172460g()).subscribe(ffw.m121193d(new e30() { // from class: l.tct
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f169474a.m95919A4((soj0) obj);
            }
        }));
        duringCreated(m206028F2().LivePusherEvent.startLive().m172460g()).subscribe(ffw.m121193d(new e30() { // from class: l.uct
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f175862a.m95956B4((cdt) obj);
            }
        }));
        m206029H2().lifecycle().subscribe(ffw.m121193d(new e30() { // from class: l.vct
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f180984a.m95957C4((C4319c) obj);
            }
        }));
        duringCreated(((yl40) m206027E2()).m149815l()).subscribe(ffw.m121193d(new e30() { // from class: l.wct
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f185713a.m95958D4((iqv) obj);
            }
        }));
        this.f68966m = ((yl40) m206027E2()).m132156o1(this.f188513f).subscribe(ffw.m121193d(new e30() { // from class: l.xct
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f192256a.m96002x4((LiveControlMessage) obj);
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: T4 */
    public final /* synthetic */ void m95974T4(NetworkInfo networkInfo) {
        if (networkInfo != null && networkInfo.isConnected() && ((yl40) m206027E2()).m170394B2()) {
            duringCreated(((yl40) m206027E2()).m215224R2()).subscribe(ffw.m121194e(new e30() { // from class: l.fct
                @Override // p149l.e30
                public final void call(Object obj) {
                    adt.m95933X3((BLiveRoom) obj);
                }
            }, new e30() { // from class: l.gct
                @Override // p149l.e30
                public final void call(Object obj) {
                    lsi0.m151578h(R$string.f46654E9);
                }
            }));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: U4 */
    public final /* synthetic */ void m95975U4(boolean z, BLive bLive) {
        ((yl40) m206027E2()).mo149811g(bLive);
        ((yl40) m206027E2()).mo149812h(pau.f148011b);
        m95985e5();
        oxl oxlVar = (oxl) m129297F3(new rv00(2600));
        if (oxlVar != null) {
            oxlVar.mo133472b();
        }
        this.f68965l = 2;
        if (z) {
            m95998t4(2, m206029H2().lifecycle_());
        }
    }

    /* JADX INFO: renamed from: V4 */
    public final /* synthetic */ void m95976V4(Throwable th) {
        this.f68965l = -2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: W4 */
    public final void m95977W4(u7s u7sVar) {
        String strM192152l = u7sVar.m192152l();
        m206028F2().ChatEvent.dismissDialog().m172467p();
        if (!u7sVar.m192154n()) {
            LiveDialogAct.m67177g2(act(), "", strM192152l);
        } else if (vdt.m198092b(2)) {
            act().startActivity(LiveEndAct.m75478V1(act(), ((yl40) m206027E2()).m170393A2().mo165470l(), ((yl40) m206027E2()).m132146l0(), strM192152l, ((yl40) m206027E2()).m215216J2(), ((yl40) m206027E2()).m149826x()));
        } else {
            act().startActivity(IntlLiveEndAct.m75476V1(act(), ((yl40) m206027E2()).m170393A2().mo165470l(), ((yl40) m206027E2()).m132146l0(), strM192152l, ((yl40) m206027E2()).m215216J2(), ((yl40) m206027E2()).m149826x()));
        }
        act().m66873d2();
    }

    /* JADX INFO: renamed from: X4 */
    public void m95978X4(Throwable th, boolean z) {
        String string;
        act().progressDismiss();
        if (th instanceof TantanException.Client.CoreService) {
            TantanException.Client.CoreService coreService = (TantanException.Client.CoreService) th;
            int i = coreService.code;
            final d30 d30Var = null;
            if (i == 41008 || i == 41020) {
                string = coreService.metaMessage;
            } else if (i == 41000 || i == 41002) {
                string = act().getString(R$string.f47230f6);
                if (m96003y4()) {
                    d30Var = new d30() { // from class: l.ict
                        @Override // p149l.d30
                        public final void call() {
                            this.f112486a.m95960F4();
                        }
                    };
                }
            } else {
                if (i == 41010) {
                    m95988h5();
                    return;
                }
                if (i == 41005) {
                    string = act().getString(R$string.f46713H2);
                } else if (i == 41014 || i == 41017 || i == 41018) {
                    string = act().getString(R$string.f47618x);
                } else if (i == 41015) {
                    string = act().getString(R$string.f47169cb);
                } else if (i == 41009) {
                    string = act().getString(R$string.f46882P);
                } else if (i == 41042) {
                    string = act().getString(R$string.f46691G2);
                    d30Var = new d30() { // from class: l.jct
                        @Override // p149l.d30
                        public final void call() {
                            this.f117345a.m95961G4();
                        }
                    };
                } else {
                    string = "";
                }
            }
            if (!TextUtils.isEmpty(string)) {
                act().dialog().m20504F(string).m20496B(false).m20560v0(act().getString(R$string.f47423o2), new Runnable() { // from class: l.kct
                    @Override // java.lang.Runnable
                    public final void run() {
                        adt.m95944i4(d30Var);
                    }
                }).m20568z0();
                return;
            }
        }
        if (z) {
            lsi0.m151578h(R$string.f46654E9);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: Y4 */
    public void m95979Y4() {
        if (this.f68962i) {
            return;
        }
        this.f68962i = true;
        m206028F2().MomoSdkEvent.sdkActionEvent().mo172463j(2);
        boolean zM96003y4 = m96003y4();
        gkh0.m126627j(u0t.f172943b, "onResume:" + this.f68964k + ":" + this.f68963j + ":" + this.f68965l + ":" + zM96003y4);
        if (this.f68964k || this.f68963j) {
            return;
        }
        int i = this.f68965l;
        if (i == -2 || i == 2 || zM96003y4) {
            this.f68965l = 3;
            m95991l5(true, ((yl40) m206027E2()).m149814k(), "manual");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: Z4 */
    public void m95980Z4() {
        this.f68962i = false;
        if (!act().isFinishing()) {
            m206028F2().MomoSdkEvent.sdkActionEvent().mo172463j(1);
        }
        if (((yl40) m206027E2()).m149816m().m137797d()) {
            int i = this.f68965l;
            if (i == 4 || i == -3) {
                m95996q5(true);
            }
        }
    }

    /* JADX INFO: renamed from: a5 */
    public final void m95981a5(final boolean z, final String str, final j760<User, BLive> j760Var) {
        duringCreated((C22306c) LivingNormalApiProvider.m71304O7(false).doOnNext(new e30() { // from class: l.lct
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f127465a.m95962H4((BLiveAnchor) obj);
            }
        }).flatMap(new w9j() { // from class: l.nct
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return LivingNormalApiProvider.m71627y6(((BLive) j760Var.f116565b).f44323id);
            }
        })).subscribe(ffw.m121194e(new e30() { // from class: l.oct
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f143097a.m95963I4(z, str, j760Var, (BLiveMultiCallAsset) obj);
            }
        }, new e30() { // from class: l.pct
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f148230a.m95982b5((Throwable) obj);
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b5 */
    public final void m95982b5(Throwable th) {
        LivingNormalApiProvider.m71277L7(((yl40) m206027E2()).m149814k(), true);
        r610.m178005j(th);
        this.f68965l = -3;
        act().progressDismiss();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: c5 */
    public void m95983c5() {
        if (this.f68964k || this.f68963j) {
            return;
        }
        this.f68965l = 3;
        m95991l5(true, ((yl40) m206027E2()).m149814k(), "manual");
    }

    /* JADX INFO: renamed from: d5 */
    public final void m95984d5(Throwable th, boolean z) {
        if (z && xtr.m211022b(41000, th)) {
            m206028F2().LivePusherEvent.notifyRecoverLiveStopped().m172467p();
        }
    }

    /* JADX INFO: renamed from: e5 */
    public final void m95985e5() {
        C12714b c12714bMo133471a;
        if (vdt.m198092b(2) || (c12714bMo133471a = ((oxl) m129297F3(new rv00(2600))).mo133471a()) == null) {
            return;
        }
        c12714bMo133471a.m71907k1();
    }

    /* JADX INFO: renamed from: f5 */
    public final void m95986f5(String str, String str2, int i, d30 d30Var) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (vdt.m198092b(2)) {
            Dialog.C4309e c4309eM20496B = act().dialog().m20504F(str).m20496B(false);
            Objects.requireNonNull(d30Var);
            c4309eM20496B.m20544n0(str2, new bii0(d30Var)).m20568z0();
        } else {
            dd80.C16336a c16336aM110961P = act().newDialog().m110996y0(m96000v4(i)).m110991t0(m96001w4(str, h1c0.f105328Q)).m110961P(false);
            Objects.requireNonNull(d30Var);
            c16336aM110961P.m110974c0(str2, new bii0(d30Var)).m110989r0();
        }
    }

    /* JADX INFO: renamed from: g5 */
    public final C22306c<j760<User, BLive>> m95987g5(final BLive bLive) {
        return LivingNormalApiProvider.m71574s7(ypv.f199493a.m199309D0(), bLive.f44323id).materialize().take(1).flatMap(new w9j() { // from class: l.hct
            @Override // p149l.w9j
            public final Object call(Object obj) {
                Notification notification = (Notification) obj;
                return C22306c.just(vwb.m200311Y(notification.m221299j() ? ypv.f199493a.m199329V() : (User) notification.m221295f(), bLive));
            }
        });
    }

    /* JADX INFO: renamed from: h5 */
    public final void m95988h5() {
        duringCreated(LivingNormalApiProvider.m71589u4(ypv.f199493a.m199309D0())).subscribe(ffw.m121194e(new e30() { // from class: l.qct
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f153818a.m95965K4((BLiveAnchor) obj);
            }
        }, new e30() { // from class: l.rct
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f158817a.m95966L4((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: j5 */
    public void m95989j5(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str)) {
            new xh0.C21150a(this.f188513f).m208731j(str2).m208739r(str3).m208736o(new View.OnClickListener() { // from class: l.zbt
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f202489a.m95967M4(view);
                }
            }).m208737p(h1c0.f105357d).m208727f(act().getString(R$string.f47662z)).m208722a().m208721g();
        } else {
            act().dialog().m20507G0(str).m20504F(str2).m20560v0(str3, new Runnable() { // from class: l.act
                @Override // java.lang.Runnable
                public final void run() {
                    this.f68876a.m95968N4();
                }
            }).m20543m0(act().getString(R$string.f47662z)).m20568z0();
        }
    }

    /* JADX INFO: renamed from: k5 */
    public void m95990k5() {
        odu oduVar = new odu();
        if (oduVar.m163723j()) {
            oduVar.m163725l(m206029H2().act(), null, new Runnable() { // from class: l.ect
                @Override // java.lang.Runnable
                public final void run() {
                    lsi0.m151578h(R$string.f46654E9);
                }
            });
        }
    }

    /* JADX INFO: renamed from: l5 */
    public void m95991l5(boolean z, String str, String str2) {
        m95992m5(false, z, str, str2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: m5 */
    public void m95992m5(final boolean z, final boolean z2, String str, final String str2) {
        C22306c<BLive> c22306cFlatMap;
        act().progress(R$string.f47103Za);
        if (z2) {
            c22306cFlatMap = LivingNormalApiProvider.m71276L6(str, str2);
        } else {
            c22306cFlatMap = ((yl40) m206027E2()).m170394B2() ? ((yl40) m206027E2()).m215224R2().flatMap(new w9j() { // from class: l.zct
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return this.f202577a.m95969O4(str2, (BLiveRoom) obj);
                }
            }) : LivingNormalApiProvider.m71454f4(((yl40) m206027E2()).m149818o(), m95945i5(), ((yl40) m206027E2()).m215217K2(), str2);
        }
        h5j0.INSTANCE.m129404c("create_live_room", "createLive");
        duringCreated((C22306c) c22306cFlatMap.flatMap(new w9j() { // from class: l.rbt
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f158680a.m95987g5((BLive) obj);
            }
        })).subscribe(ffw.m121194e(new e30() { // from class: l.sbt
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f163631a.m95970P4(z, str2, (j760) obj);
            }
        }, new e30() { // from class: l.tbt
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f169354a.m95971Q4(z2, (Throwable) obj);
            }
        }));
    }

    @Override // p149l.h4t, p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: n */
    public void mo69117n() {
        super.mo69117n();
        mkd0.m154992z(this.f68966m);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: n5 */
    public final void m95993n5(boolean z, String str, j760<User, BLive> j760Var) {
        act().progressDismiss();
        this.f68965l = 4;
        m95998t4(4, m206029H2().lifecycle_());
        BLive bLive = j760Var.f116565b;
        User user = j760Var.f116564a;
        ((yl40) m206027E2()).mo149811g(bLive);
        ((yl40) m206027E2()).m132087R(user);
        if (z) {
            eet.m116003b(this, "anchor_live_started", null);
        }
        h5j0.INSTANCE.m129402a("create_live_room", "startLiveSuccess");
        m95990k5();
        if (((yl40) m206027E2()).m215221O2()) {
            m206028F2().ObsPreviewEvent.onObsLiveStart().mo172463j(new q150(j760Var.f116564a, j760Var.f116565b));
        } else {
            ((yl40) m206027E2()).mo149812h(i0t.f110377c);
        }
    }

    /* JADX INFO: renamed from: o5 */
    public void m95994o5(String str) {
        this.f68964k = true;
        m95985e5();
        ((oxl) m129297F3(new rv00(2600))).mo133472b();
        m206028F2().LivePkEvent.liveEndEvent().m172467p();
        r610.m177973H(this);
        act().progress(R$string.f47053X2);
        duringCreated(LivingNormalApiProvider.m71277L7(str, true)).subscribe(ffw.m121194e(new e30() { // from class: l.cct
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f80300a.m95972R4((BLive) obj);
            }
        }, new e30() { // from class: l.dct
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f85488a.m95973S4((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: p5 */
    public final void m95995p5() {
        duringCreated(ConnectivityReceiver.m81290m()).skip(1).distinctUntilChanged().subscribe(ffw.m121193d(new e30() { // from class: l.yct
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f197482a.m95974T4((NetworkInfo) obj);
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: q5 */
    public void m95996q5(final boolean z) {
        if ((z && (((Boolean) m129297F3(new k480(3300))).booleanValue() || ((Boolean) m129297F3(new fd50(3300))).booleanValue() || this.f188512e.f77104j.m201577L3(MotionType.multi_call))) || this.f68963j || this.f68964k) {
            return;
        }
        this.f68965l = 1;
        LivingNormalApiProvider.m71277L7(((yl40) m206027E2()).m149814k(), false).subscribe(ffw.m121194e(new e30() { // from class: l.ubt
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f175751a.m95975U4(z, (BLive) obj);
            }
        }, new e30() { // from class: l.vbt
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f180881a.m95976V4((Throwable) obj);
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: s4 */
    public final void m95997s4(boolean z, String str, boolean z2) {
        if (!z) {
            act().progressDismiss();
            if (((yl40) m206027E2()).m149816m().m137796c()) {
                return;
            }
            ((yl40) m206027E2()).mo149812h(u7s.f175055e);
            return;
        }
        oxl oxlVar = (oxl) m129297F3(new rv00(2600));
        m95985e5();
        if (oxlVar != null) {
            oxlVar.mo133472b();
        }
        if (this.f68964k) {
            return;
        }
        this.f68963j = true;
        if (((yl40) m206027E2()).m149816m().m137796c()) {
            return;
        }
        ((yl40) m206027E2()).mo149812h(new u7s(str, z2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: t4 */
    public final void m95998t4(int i, C4319c c4319c) {
        if (c4319c == C4319c.f15548i && i == 2) {
            m95991l5(true, ((yl40) m206027E2()).m149814k(), "manual");
        } else if (c4319c == C4319c.f15550k && i == 4) {
            m95996q5(true);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: u4 */
    public void m95999u4() {
        if (((yl40) m206027E2()).m149816m().m137799f()) {
            act().m66873d2();
            return;
        }
        if (((Boolean) m129297F3(new b080(3300))).booleanValue()) {
            m95989j5(act().getString(R$string.f47585va), (String) m129297F3(new am70(600)), act().getString(R$string.f47423o2));
            return;
        }
        if (rl10.m179774a(this, ypv.f199493a.m199309D0())) {
            m95989j5("", act().getString(R$string.f47430o9), act().getString(R$string.f47423o2));
        } else if (r610.m177981P(this)) {
            m95989j5("", act().getString(R$string.f46762J7), act().getString(R$string.f47423o2));
        } else {
            m95989j5("", ((yl40) m206027E2()).m215221O2() ? act().getString(R$string.f47000Uc) : act().getString(R$string.f46902Pj), ((yl40) m206027E2()).m215221O2() ? act().getString(R$string.f47135b) : act().getString(R$string.f47095Z2));
        }
    }

    /* JADX INFO: renamed from: v4 */
    public final CharSequence m96000v4(int i) {
        if (i != 259) {
            return "";
        }
        String string = act().getString(R$string.f46909Q5);
        return !TextUtils.isEmpty(string) ? m96001w4(string, h1c0.f105420y0) : "";
    }

    /* JADX INFO: renamed from: w4 */
    public final SpannableString m96001w4(String str, int i) {
        SpannableString spannableString = new SpannableString(str);
        spannableString.setSpan(new ForegroundColorSpan(kvc0.m147352a(i)), 0, str.length(), 33);
        return spannableString;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: x4 */
    public final void m96002x4(LiveControlMessage liveControlMessage) {
        String str = liveControlMessage.type;
        str.getClass();
        switch (str) {
            case "add_manager":
            case "delete_manager":
                ((yl40) m206027E2()).mo132074K1(((yl40) m206027E2()).m149818o());
                break;
            case "system":
                m95986f5(liveControlMessage.content, !vdt.m198092b(2) ? act().getString(R$string.f47423o2) : act().getString(R$string.f47646y5), liveControlMessage.templateId, new d30() { // from class: l.wbt
                    @Override // p149l.d30
                    public final void call() {
                        adt.m95937b4();
                    }
                });
                break;
            case "re_request_room_gift_list":
                wrj.m205257w(false);
                ((yl40) m206027E2()).m132055A1(new evj.C16689a(((yl40) m206027E2()).m149818o(), ((yl40) m206027E2()).m132146l0().f56011id, "live").m118277f(), null);
                break;
            case "stop":
                m95997s4(true, act().getString(R$string.f47230f6), true);
                break;
            case "force_stop":
                m95997s4(true, liveControlMessage.content, true);
                break;
            case "forbidden_multidevice":
                if (!liveControlMessage.isAnchor) {
                    duringCreated(LivingNormalApiProvider.m71277L7(((yl40) m206027E2()).m149814k(), false)).subscribe(ffw.m121194e(new e30() { // from class: l.xbt
                        @Override // p149l.e30
                        public final void call(Object obj) {
                            this.f191963a.m95959E4((BLive) obj);
                        }
                    }, new e30() { // from class: l.ybt
                        @Override // p149l.e30
                        public final void call(Object obj) {
                            adt.m95950n4((Throwable) obj);
                        }
                    }));
                    break;
                } else {
                    m95997s4(true, act().getString(R$string.f46972T5), false);
                    break;
                }
                break;
        }
        if (vdt.m198092b(2)) {
            return;
        }
        gkh0.m126628k(liveControlMessage.toString(), "[live]", "[passivity_exit]");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: y4 */
    public final boolean m96003y4() {
        return ((yl40) m206027E2()).m149816m().m137800g();
    }
}
