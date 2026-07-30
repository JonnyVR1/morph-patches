package p153l;

import android.net.NetworkInfo;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.android.app.Dialog;
import com.p051p1.mobile.putong.api.api.TantanException;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.live.LiveDialogAct;
import com.p051p1.mobile.putong.live.base.data.BLive;
import com.p051p1.mobile.putong.live.base.data.BLiveAnchor;
import com.p051p1.mobile.putong.live.base.data.BLiveMultiCallAsset;
import com.p051p1.mobile.putong.live.base.data.BLiveRoom;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.p051p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveControlMessage;
import com.p051p1.mobile.putong.live.livingroom.archi.motion.MotionType;
import com.p051p1.mobile.putong.live.livingroom.archi.sdk.motion.base.C12877b;
import com.p051p1.mobile.putong.live.livingroom.other.liveend.IntlLiveEndAct;
import com.p051p1.mobile.putong.live.livingroom.other.liveend.LiveEndAct;
import com.tantanapp.common.utils.ConnectivityReceiver;
import java.util.Objects;
import p137rx.C22421c;
import p137rx.Notification;

/* JADX INFO: loaded from: classes4.dex */
public class bft extends qct<mu40> {

    /* JADX INFO: renamed from: i */
    public boolean f76534i;

    /* JADX INFO: renamed from: j */
    public boolean f76535j;

    /* JADX INFO: renamed from: k */
    public boolean f76536k;

    /* JADX INFO: renamed from: l */
    public int f76537l;

    /* JADX INFO: renamed from: m */
    public kcg0 f76538m;

    public bft(dum dumVar) {
        super(dumVar);
        this.f76537l = -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A4 */
    public /* synthetic */ void m103984A4(vxj0 vxj0Var) {
        m104064u4();
    }

    /* JADX INFO: renamed from: X3 */
    public static /* synthetic */ void m103998X3(BLiveRoom bLiveRoom) {
    }

    /* JADX INFO: renamed from: b4 */
    public static /* synthetic */ void m104002b4() {
    }

    /* JADX INFO: renamed from: i4 */
    public static /* synthetic */ void m104009i4(x20 x20Var) {
        if (x20Var != null) {
            x20Var.call();
        }
    }

    /* JADX INFO: renamed from: i5 */
    private boolean m104010i5() {
        return ((Boolean) m138856F3(new vs80(3300))).booleanValue();
    }

    /* JADX INFO: renamed from: n4 */
    public static /* synthetic */ void m104015n4(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z4 */
    public /* synthetic */ void m104020z4(vxj0 vxj0Var) {
        m104048c5();
    }

    /* JADX INFO: renamed from: B4 */
    public final /* synthetic */ void m104021B4(dft dftVar) {
        m104057m5(true, dftVar.f88217a, dftVar.f88218b, dftVar.f88219c);
    }

    /* JADX INFO: renamed from: C4 */
    public final /* synthetic */ void m104022C4(C4470c c4470c) {
        if (c4470c == C4470c.f16267i) {
            m104044Y4();
        } else if (c4470c == C4470c.f16269k) {
            m104045Z4();
        }
    }

    /* JADX INFO: renamed from: D4 */
    public final /* synthetic */ void m104023D4(jsv jsvVar) {
        if (jsvVar.m146875a() == 4 && this.f76537l != 5) {
            this.f76537l = 5;
            m104042W4((v9s) jsvVar);
        }
    }

    /* JADX INFO: renamed from: E4 */
    public final /* synthetic */ void m104024E4(BLive bLive) {
        m104062s4(true, act().getString(R$string.f47778R5), false);
    }

    /* JADX INFO: renamed from: F4 */
    public final /* synthetic */ void m104025F4() {
        m104062s4(false, null, true);
    }

    /* JADX INFO: renamed from: G4 */
    public final /* synthetic */ void m104026G4() {
        act().m68056e2();
    }

    /* JADX INFO: renamed from: H4 */
    public final /* synthetic */ void m104027H4(BLiveAnchor bLiveAnchor) {
        m213811F2().CallEvent.anchorCall().mo199273j(Boolean.FALSE);
    }

    /* JADX INFO: renamed from: I4 */
    public final /* synthetic */ void m104028I4(boolean z, String str, pf60 pf60Var, BLiveMultiCallAsset bLiveMultiCallAsset) {
        m104058n5(z, str, pf60Var);
        m213811F2().MultiCallEvent.startLiveMultiCall().mo199273j(new ep10(cd10.f81076d, bLiveMultiCallAsset.multiCallOrder, bf10.m103844u(bLiveMultiCallAsset.maxCallNum, false), -1));
    }

    /* JADX INFO: renamed from: J4 */
    public final /* synthetic */ void m104029J4() {
        act().m68056e2();
    }

    /* JADX INFO: renamed from: K4 */
    public final /* synthetic */ void m104030K4(BLiveAnchor bLiveAnchor) {
        if (TEnum.equals(bLiveAnchor.status, "jailed")) {
            act().dialog().m21503F(act().getString(R$string.f48061eb, pzi0.m174455p(bLiveAnchor.availableTime))).m21495B(false).m21559v0(act().getString(R$string.f48271o2), new Runnable() { // from class: l.tet
                @Override // java.lang.Runnable
                public final void run() {
                    this.f173894a.m104029J4();
                }
            }).m21567z0();
        }
    }

    /* JADX INFO: renamed from: L4 */
    public final /* synthetic */ void m104031L4(Throwable th) {
        m104043X4(th, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: M4 */
    public final /* synthetic */ void m104032M4(View view) {
        fgt.m125530b(this, "anchor_stop_live_confirm", null);
        m104059o5(((mu40) m213810E2()).m202191k());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: N4 */
    public final /* synthetic */ void m104033N4() {
        fgt.m125530b(this, "anchor_stop_live_confirm", null);
        m104059o5(((mu40) m213810E2()).m202191k());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: O4 */
    public final /* synthetic */ C22421c m104034O4(String str, BLiveRoom bLiveRoom) {
        return LivingNormalApiProvider.m72637f4(bLiveRoom.f45172id, m104010i5(), ((mu40) m213810E2()).m160106K2(), str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: P4 */
    public final /* synthetic */ void m104035P4(boolean z, String str, pf60 pf60Var) {
        S s = pf60Var.f152157b;
        if (s == 0 || !"friends".equals(((BLive) s).liveMode)) {
            m104058n5(z, str, pf60Var);
        } else {
            m104046a5(z, str, pf60Var);
        }
    }

    /* JADX INFO: renamed from: Q4 */
    public final /* synthetic */ void m104036Q4(boolean z, Throwable th) {
        this.f76537l = -3;
        act().progressDismiss();
        m104043X4(th, true);
        m104049d5(th, z);
    }

    /* JADX INFO: renamed from: R4 */
    public final /* synthetic */ void m104037R4(BLive bLive) {
        m104062s4(false, null, true);
    }

    /* JADX INFO: renamed from: S4 */
    public final /* synthetic */ void m104038S4(Throwable th) {
        m104062s4(false, null, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: T */
    public void mo71381T() {
        super.mo71381T();
        m104060p5();
        duringCreated(m213811F2().LivePusherEvent.recoverLive().m199270g()).subscribe(dhw.m115825d(new y20() { // from class: l.rdt
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f162358a.m104020z4((vxj0) obj);
            }
        }));
        duringCreated(m213811F2().LivePusherEvent.stopLive().m199270g()).subscribe(dhw.m115825d(new y20() { // from class: l.cet
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f81414a.m104059o5((String) obj);
            }
        }));
        duringCreated(m213811F2().LivePusherEvent.suspendLive().m199270g()).subscribe(dhw.m115825d(new y20() { // from class: l.net
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f141684a.m104061q5(((Boolean) obj).booleanValue());
            }
        }));
        duringCreated(m213811F2().LivePusherEvent.closeLive().m199270g()).subscribe(dhw.m115825d(new y20() { // from class: l.uet
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f178690a.m103984A4((vxj0) obj);
            }
        }));
        duringCreated(m213811F2().LivePusherEvent.startLive().m199270g()).subscribe(dhw.m115825d(new y20() { // from class: l.vet
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f183844a.m104021B4((dft) obj);
            }
        }));
        m213812H2().lifecycle().subscribe(dhw.m115825d(new y20() { // from class: l.wet
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f188722a.m104022C4((C4470c) obj);
            }
        }));
        duringCreated(((mu40) m213810E2()).m202192l()).subscribe(dhw.m115825d(new y20() { // from class: l.xet
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f193977a.m104023D4((jsv) obj);
            }
        }));
        this.f76538m = ((mu40) m213810E2()).m168541o1(this.f196919f).subscribe(dhw.m115825d(new y20() { // from class: l.yet
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f199396a.m104067x4((LiveControlMessage) obj);
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: T4 */
    public final /* synthetic */ void m104039T4(NetworkInfo networkInfo) {
        if (networkInfo != null && networkInfo.isConnected() && ((mu40) m213810E2()).m118364B2()) {
            duringCreated(((mu40) m213810E2()).m160113R2()).subscribe(dhw.m115826e(new y20() { // from class: l.get
                @Override // p153l.y20
                public final void call(Object obj) {
                    bft.m103998X3((BLiveRoom) obj);
                }
            }, new y20() { // from class: l.het
                @Override // p153l.y20
                public final void call(Object obj) {
                    o1j0.m165634h(R$string.f47502E9);
                }
            }));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: U4 */
    public final /* synthetic */ void m104040U4(boolean z, BLive bLive) {
        ((mu40) m213810E2()).mo183431g(bLive);
        ((mu40) m213810E2()).mo160116h(qcu.f156623b);
        m104050e5();
        h0m h0mVar = (h0m) m138856F3(new z310(2600));
        if (h0mVar != null) {
            h0mVar.mo133183b();
        }
        this.f76537l = 2;
        if (z) {
            m104063t4(2, m213812H2().lifecycle_());
        }
    }

    /* JADX INFO: renamed from: V4 */
    public final /* synthetic */ void m104041V4(Throwable th) {
        this.f76537l = -2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: W4 */
    public final void m104042W4(v9s v9sVar) {
        String strM200457l = v9sVar.m200457l();
        m213811F2().ChatEvent.dismissDialog().m199277p();
        if (!v9sVar.m200459n()) {
            LiveDialogAct.m68360h2(act(), "", strM200457l);
        } else if (wft.m206159b(2)) {
            act().startActivity(LiveEndAct.m76661X1(act(), ((mu40) m213810E2()).m118363A2().mo122892l(), ((mu40) m213810E2()).m168532l0(), strM200457l, ((mu40) m213810E2()).m160105J2(), ((mu40) m213810E2()).m202200x()));
        } else {
            act().startActivity(IntlLiveEndAct.m76659X1(act(), ((mu40) m213810E2()).m118363A2().mo122892l(), ((mu40) m213810E2()).m168532l0(), strM200457l, ((mu40) m213810E2()).m160105J2(), ((mu40) m213810E2()).m202200x()));
        }
        act().m68056e2();
    }

    /* JADX INFO: renamed from: X4 */
    public void m104043X4(Throwable th, boolean z) {
        String string;
        act().progressDismiss();
        if (th instanceof TantanException.Client.CoreService) {
            TantanException.Client.CoreService coreService = (TantanException.Client.CoreService) th;
            int i = coreService.code;
            final x20 x20Var = null;
            if (i == 41008 || i == 41020) {
                string = coreService.metaMessage;
            } else if (i == 41000 || i == 41002) {
                string = act().getString(R$string.f48078f6);
                if (m104068y4()) {
                    x20Var = new x20() { // from class: l.jet
                        @Override // p153l.x20
                        public final void call() {
                            this.f120522a.m104025F4();
                        }
                    };
                }
            } else {
                if (i == 41010) {
                    m104053h5();
                    return;
                }
                if (i == 41005) {
                    string = act().getString(R$string.f47561H2);
                } else if (i == 41014 || i == 41017 || i == 41018) {
                    string = act().getString(R$string.f48466x);
                } else if (i == 41015) {
                    string = act().getString(R$string.f48017cb);
                } else if (i == 41009) {
                    string = act().getString(R$string.f47730P);
                } else if (i == 41042) {
                    string = act().getString(R$string.f47539G2);
                    x20Var = new x20() { // from class: l.ket
                        @Override // p153l.x20
                        public final void call() {
                            this.f126215a.m104026G4();
                        }
                    };
                } else {
                    string = "";
                }
            }
            if (!TextUtils.isEmpty(string)) {
                act().dialog().m21503F(string).m21495B(false).m21559v0(act().getString(R$string.f48271o2), new Runnable() { // from class: l.let
                    @Override // java.lang.Runnable
                    public final void run() {
                        bft.m104009i4(x20Var);
                    }
                }).m21567z0();
                return;
            }
        }
        if (z) {
            o1j0.m165634h(R$string.f47502E9);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: Y4 */
    public void m104044Y4() {
        if (this.f76534i) {
            return;
        }
        this.f76534i = true;
        m213811F2().MomoSdkEvent.sdkActionEvent().mo199273j(2);
        boolean zM104068y4 = m104068y4();
        nsh0.m164608j(v2t.f182112b, "onResume:" + this.f76536k + ":" + this.f76535j + ":" + this.f76537l + ":" + zM104068y4);
        if (this.f76536k || this.f76535j) {
            return;
        }
        int i = this.f76537l;
        if (i == -2 || i == 2 || zM104068y4) {
            this.f76537l = 3;
            m104056l5(true, ((mu40) m213810E2()).m202191k(), "manual");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: Z4 */
    public void m104045Z4() {
        this.f76534i = false;
        if (!act().isFinishing()) {
            m213811F2().MomoSdkEvent.sdkActionEvent().mo199273j(1);
        }
        if (((mu40) m213810E2()).m202193m().m146878d()) {
            int i = this.f76537l;
            if (i == 4 || i == -3) {
                m104061q5(true);
            }
        }
    }

    /* JADX INFO: renamed from: a5 */
    public final void m104046a5(final boolean z, final String str, final pf60<User, BLive> pf60Var) {
        duringCreated((C22421c) LivingNormalApiProvider.m72487O7(false).doOnNext(new y20() { // from class: l.met
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f136563a.m104027H4((BLiveAnchor) obj);
            }
        }).flatMap(new qcj() { // from class: l.oet
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return LivingNormalApiProvider.m72810y6(((BLive) pf60Var.f152157b).f45171id);
            }
        })).subscribe(dhw.m115826e(new y20() { // from class: l.pet
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f152121a.m104028I4(z, str, pf60Var, (BLiveMultiCallAsset) obj);
            }
        }, new y20() { // from class: l.qet
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f157210a.m104047b5((Throwable) obj);
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b5 */
    public final void m104047b5(Throwable th) {
        LivingNormalApiProvider.m72460L7(((mu40) m213810E2()).m202191k(), true);
        bf10.m103834j(th);
        this.f76537l = -3;
        act().progressDismiss();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: c5 */
    public void m104048c5() {
        if (this.f76536k || this.f76535j) {
            return;
        }
        this.f76537l = 3;
        m104056l5(true, ((mu40) m213810E2()).m202191k(), "manual");
    }

    /* JADX INFO: renamed from: d5 */
    public final void m104049d5(Throwable th, boolean z) {
        if (z && yvr.m217556b(41000, th)) {
            m213811F2().LivePusherEvent.notifyRecoverLiveStopped().m199277p();
        }
    }

    /* JADX INFO: renamed from: e5 */
    public final void m104050e5() {
        C12877b c12877bMo133182a;
        if (wft.m206159b(2) || (c12877bMo133182a = ((h0m) m138856F3(new z310(2600))).mo133182a()) == null) {
            return;
        }
        c12877bMo133182a.m73090k1();
    }

    /* JADX INFO: renamed from: f5 */
    public final void m104051f5(String str, String str2, int i, x20 x20Var) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (wft.m206159b(2)) {
            Dialog.C4460e c4460eM21495B = act().dialog().m21503F(str).m21495B(false);
            Objects.requireNonNull(x20Var);
            c4460eM21495B.m21543n0(str2, new bri0(x20Var)).m21567z0();
        } else {
            jl80.C17971a c17971aM146021P = act().newDialog().m146056y0(m104065v4(i)).m146051t0(m104066w4(str, n9c0.f140789Q)).m146021P(false);
            Objects.requireNonNull(x20Var);
            c17971aM146021P.m146034c0(str2, new bri0(x20Var)).m146049r0();
        }
    }

    /* JADX INFO: renamed from: g5 */
    public final C22421c<pf60<User, BLive>> m104052g5(final BLive bLive) {
        return LivingNormalApiProvider.m72757s7(zrv.f205799a.m207631D0(), bLive.f45171id).materialize().take(1).flatMap(new qcj() { // from class: l.iet
            @Override // p153l.qcj
            public final Object call(Object obj) {
                Notification notification = (Notification) obj;
                return C22421c.just(jyb.m147494Y(notification.m222545j() ? zrv.f205799a.m207651V() : (User) notification.m222541f(), bLive));
            }
        });
    }

    /* JADX INFO: renamed from: h5 */
    public final void m104053h5() {
        duringCreated(LivingNormalApiProvider.m72772u4(zrv.f205799a.m207631D0())).subscribe(dhw.m115826e(new y20() { // from class: l.ret
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f162688a.m104030K4((BLiveAnchor) obj);
            }
        }, new y20() { // from class: l.set
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f167643a.m104031L4((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: j5 */
    public void m104054j5(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str)) {
            new th0.C20312a(this.f196919f).m191151j(str2).m191159r(str3).m191156o(new View.OnClickListener() { // from class: l.aet
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f70824a.m104032M4(view);
                }
            }).m191157p(n9c0.f140818d).m191147f(act().getString(R$string.f48510z)).m191142a().m191141g();
        } else {
            act().dialog().m21506G0(str).m21503F(str2).m21559v0(str3, new Runnable() { // from class: l.bet
                @Override // java.lang.Runnable
                public final void run() {
                    this.f76416a.m104033N4();
                }
            }).m21542m0(act().getString(R$string.f48510z)).m21567z0();
        }
    }

    /* JADX INFO: renamed from: k5 */
    public void m104055k5() {
        pfu pfuVar = new pfu();
        if (pfuVar.m172152j()) {
            pfuVar.m172154l(m213812H2().act(), null, new Runnable() { // from class: l.fet
                @Override // java.lang.Runnable
                public final void run() {
                    o1j0.m165634h(R$string.f47502E9);
                }
            });
        }
    }

    /* JADX INFO: renamed from: l5 */
    public void m104056l5(boolean z, String str, String str2) {
        m104057m5(false, z, str, str2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: m5 */
    public void m104057m5(final boolean z, final boolean z2, String str, final String str2) {
        C22421c<BLive> c22421cFlatMap;
        act().progress(R$string.f47951Za);
        if (z2) {
            c22421cFlatMap = LivingNormalApiProvider.m72459L6(str, str2);
        } else {
            c22421cFlatMap = ((mu40) m213810E2()).m118364B2() ? ((mu40) m213810E2()).m160113R2().flatMap(new qcj() { // from class: l.aft
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return this.f71050a.m104034O4(str2, (BLiveRoom) obj);
                }
            }) : LivingNormalApiProvider.m72637f4(((mu40) m213810E2()).m202194o(), m104010i5(), ((mu40) m213810E2()).m160106K2(), str2);
        }
        lej0.INSTANCE.m153909c("create_live_room", "createLive");
        duringCreated((C22421c) c22421cFlatMap.flatMap(new qcj() { // from class: l.sdt
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f167462a.m104052g5((BLive) obj);
            }
        })).subscribe(dhw.m115826e(new y20() { // from class: l.tdt
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f173383a.m104035P4(z, str2, (pf60) obj);
            }
        }, new y20() { // from class: l.udt
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f178589a.m104036Q4(z2, (Throwable) obj);
            }
        }));
    }

    @Override // p153l.i6t, p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: n */
    public void mo70300n() {
        super.mo70300n();
        psd0.m173633z(this.f76538m);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: n5 */
    public final void m104058n5(boolean z, String str, pf60<User, BLive> pf60Var) {
        act().progressDismiss();
        this.f76537l = 4;
        m104063t4(4, m213812H2().lifecycle_());
        BLive bLive = pf60Var.f152157b;
        User user = pf60Var.f152156a;
        ((mu40) m213810E2()).mo183431g(bLive);
        ((mu40) m213810E2()).m168473R(user);
        if (z) {
            fgt.m125530b(this, "anchor_live_started", null);
        }
        lej0.INSTANCE.m153907a("create_live_room", "startLiveSuccess");
        m104055k5();
        if (((mu40) m213810E2()).m160110O2()) {
            m213811F2().ObsPreviewEvent.onObsLiveStart().mo199273j(new fa50(pf60Var.f152156a, pf60Var.f152157b));
        } else {
            ((mu40) m213810E2()).mo160116h(j2t.f118089c);
        }
    }

    /* JADX INFO: renamed from: o5 */
    public void m104059o5(String str) {
        this.f76536k = true;
        m104050e5();
        ((h0m) m138856F3(new z310(2600))).mo133183b();
        m213811F2().LivePkEvent.liveEndEvent().m199277p();
        bf10.m103802H(this);
        act().progress(R$string.f47901X2);
        duringCreated(LivingNormalApiProvider.m72460L7(str, true)).subscribe(dhw.m115826e(new y20() { // from class: l.det
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f88083a.m104037R4((BLive) obj);
            }
        }, new y20() { // from class: l.eet
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f93669a.m104038S4((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: p5 */
    public final void m104060p5() {
        duringCreated(ConnectivityReceiver.m82473m()).skip(1).distinctUntilChanged().subscribe(dhw.m115825d(new y20() { // from class: l.zet
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f204045a.m104039T4((NetworkInfo) obj);
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: q5 */
    public void m104061q5(final boolean z) {
        if ((z && (((Boolean) m138856F3(new qc80(3300))).booleanValue() || ((Boolean) m138856F3(new ml50(3300))).booleanValue() || this.f196918e.f90824j.m209548L3(MotionType.multi_call))) || this.f76535j || this.f76536k) {
            return;
        }
        this.f76537l = 1;
        LivingNormalApiProvider.m72460L7(((mu40) m213810E2()).m202191k(), false).subscribe(dhw.m115826e(new y20() { // from class: l.vdt
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f183656a.m104040U4(z, (BLive) obj);
            }
        }, new y20() { // from class: l.wdt
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f188634a.m104041V4((Throwable) obj);
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: s4 */
    public final void m104062s4(boolean z, String str, boolean z2) {
        if (!z) {
            act().progressDismiss();
            if (((mu40) m213810E2()).m202193m().m146877c()) {
                return;
            }
            ((mu40) m213810E2()).mo160116h(v9s.f183031e);
            return;
        }
        h0m h0mVar = (h0m) m138856F3(new z310(2600));
        m104050e5();
        if (h0mVar != null) {
            h0mVar.mo133183b();
        }
        if (this.f76536k) {
            return;
        }
        this.f76535j = true;
        if (((mu40) m213810E2()).m202193m().m146877c()) {
            return;
        }
        ((mu40) m213810E2()).mo160116h(new v9s(str, z2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: t4 */
    public final void m104063t4(int i, C4470c c4470c) {
        if (c4470c == C4470c.f16267i && i == 2) {
            m104056l5(true, ((mu40) m213810E2()).m202191k(), "manual");
        } else if (c4470c == C4470c.f16269k && i == 4) {
            m104061q5(true);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: u4 */
    public void m104064u4() {
        if (((mu40) m213810E2()).m202193m().m146880f()) {
            act().m68056e2();
            return;
        }
        if (((Boolean) m138856F3(new h880(3300))).booleanValue()) {
            m104054j5(act().getString(R$string.f48433va), (String) m138856F3(new gu70(600)), act().getString(R$string.f48271o2));
            return;
        }
        if (bu10.m106416a(this, zrv.f205799a.m207631D0())) {
            m104054j5("", act().getString(R$string.f48278o9), act().getString(R$string.f48271o2));
        } else if (bf10.m103810P(this)) {
            m104054j5("", act().getString(R$string.f47610J7), act().getString(R$string.f48271o2));
        } else {
            m104054j5("", ((mu40) m213810E2()).m160110O2() ? act().getString(R$string.f47848Uc) : act().getString(R$string.f47750Pj), ((mu40) m213810E2()).m160110O2() ? act().getString(R$string.f47983b) : act().getString(R$string.f47943Z2));
        }
    }

    /* JADX INFO: renamed from: v4 */
    public final CharSequence m104065v4(int i) {
        if (i != 259) {
            return "";
        }
        String string = act().getString(R$string.f47757Q5);
        return !TextUtils.isEmpty(string) ? m104066w4(string, n9c0.f140881y0) : "";
    }

    /* JADX INFO: renamed from: w4 */
    public final SpannableString m104066w4(String str, int i) {
        SpannableString spannableString = new SpannableString(str);
        spannableString.setSpan(new ForegroundColorSpan(n3d0.m161277a(i)), 0, str.length(), 33);
        return spannableString;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: x4 */
    public final void m104067x4(LiveControlMessage liveControlMessage) {
        String str = liveControlMessage.type;
        str.getClass();
        switch (str) {
            case "add_manager":
            case "delete_manager":
                ((mu40) m213810E2()).mo118370K1(((mu40) m213810E2()).m202194o());
                break;
            case "system":
                m104051f5(liveControlMessage.content, !wft.m206159b(2) ? act().getString(R$string.f48271o2) : act().getString(R$string.f48494y5), liveControlMessage.templateId, new x20() { // from class: l.xdt
                    @Override // p153l.x20
                    public final void call() {
                        bft.m104002b4();
                    }
                });
                break;
            case "re_request_room_gift_list":
                muj.m160221w(false);
                ((mu40) m213810E2()).m168445A1(new uxj.C20693a(((mu40) m213810E2()).m202194o(), ((mu40) m213810E2()).m168532l0().f56859id, "live").m198494f(), null);
                break;
            case "stop":
                m104062s4(true, act().getString(R$string.f48078f6), true);
                break;
            case "force_stop":
                m104062s4(true, liveControlMessage.content, true);
                break;
            case "forbidden_multidevice":
                if (!liveControlMessage.isAnchor) {
                    duringCreated(LivingNormalApiProvider.m72460L7(((mu40) m213810E2()).m202191k(), false)).subscribe(dhw.m115826e(new y20() { // from class: l.ydt
                        @Override // p153l.y20
                        public final void call(Object obj) {
                            this.f198625a.m104024E4((BLive) obj);
                        }
                    }, new y20() { // from class: l.zdt
                        @Override // p153l.y20
                        public final void call(Object obj) {
                            bft.m104015n4((Throwable) obj);
                        }
                    }));
                    break;
                } else {
                    m104062s4(true, act().getString(R$string.f47820T5), false);
                    break;
                }
                break;
        }
        if (wft.m206159b(2)) {
            return;
        }
        nsh0.m164609k(liveControlMessage.toString(), "[live]", "[passivity_exit]");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: y4 */
    public final boolean m104068y4() {
        return ((mu40) m213810E2()).m202193m().m146881g();
    }
}
