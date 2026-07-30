package p002l;

import android.net.NetworkInfo;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import com.p000p1.mobile.putong.live.livingroom.R$string;
import com.p000p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.p000p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveControlMessage;
import com.p000p1.mobile.putong.live.livingroom.archi.motion.MotionType;
import com.p000p1.mobile.putong.live.livingroom.archi.sdk.motion.base.C0303b;
import com.p000p1.mobile.putong.live.livingroom.other.liveend.IntlLiveEndAct;
import com.p000p1.mobile.putong.live.livingroom.other.liveend.LiveEndAct;
import com.p1.mobile.android.app.Dialog;
import com.p1.mobile.android.app.c;
import com.p1.mobile.putong.api.api.TantanException;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.p1.mobile.putong.live.LiveDialogAct;
import com.p1.mobile.putong.live.base.data.BLive;
import com.p1.mobile.putong.live.base.data.BLiveAbsData;
import com.p1.mobile.putong.live.base.data.BLiveAbsRoom;
import com.p1.mobile.putong.live.base.data.BLiveAnchor;
import com.p1.mobile.putong.live.base.data.BLiveMultiCallAsset;
import com.p1.mobile.putong.live.base.data.BLiveRoom;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.ConnectivityReceiver;
import java.util.Objects;
import l.am70;
import l.b080;
import l.bii0;
import l.c4g0;
import l.d30;
import l.dd80;
import l.e30;
import l.fd50;
import l.ffw;
import l.gkh0;
import l.h5j0;
import l.j760;
import l.k480;
import l.kvc0;
import l.lsi0;
import l.mkd0;
import l.mqi0;
import l.r610;
import l.rl10;
import l.s410;
import l.soj0;
import l.u0t;
import l.ug10;
import l.vdt;
import l.vwb;
import l.w9j;
import l.xh0;
import l.xtr;
import l.ypv;
import rx.Notification;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class adt extends pat<yl40> {

    /* JADX INFO: renamed from: i */
    public boolean f7512i;

    /* JADX INFO: renamed from: j */
    public boolean f7513j;

    /* JADX INFO: renamed from: k */
    public boolean f7514k;

    /* JADX INFO: renamed from: l */
    public int f7515l;

    /* JADX INFO: renamed from: m */
    public c4g0 f7516m;

    public adt(bsm bsmVar) {
        super(bsmVar);
        this.f7515l = -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A4 */
    public /* synthetic */ void m9517A4(soj0 soj0Var) {
        m9598u4();
    }

    /* JADX INFO: renamed from: X3 */
    public static /* synthetic */ void m9531X3(BLiveRoom bLiveRoom) {
    }

    /* JADX INFO: renamed from: b4 */
    public static /* synthetic */ void m9535b4() {
    }

    /* JADX INFO: renamed from: i4 */
    public static /* synthetic */ void m9542i4(d30 d30Var) {
        if (d30Var != null) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: i5 */
    private boolean m9543i5() {
        return ((Boolean) m14184F3(new rk80(3300))).booleanValue();
    }

    /* JADX INFO: renamed from: n4 */
    public static /* synthetic */ void m9548n4(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z4 */
    public /* synthetic */ void m9553z4(soj0 soj0Var) {
        m9582c5();
    }

    /* JADX INFO: renamed from: B4 */
    public final /* synthetic */ void m9554B4(cdt cdtVar) {
        m9591m5(true, cdtVar.f8606a, cdtVar.f8607b, cdtVar.f8608c);
    }

    /* JADX INFO: renamed from: C4 */
    public final /* synthetic */ void m9555C4(c cVar) {
        if (cVar == c.i) {
            m9578Y4();
        } else if (cVar == c.k) {
            m9579Z4();
        }
    }

    /* JADX INFO: renamed from: D4 */
    public final /* synthetic */ void m9556D4(iqv iqvVar) {
        if (iqvVar.m15298a() == 4 && this.f7515l != 5) {
            this.f7515l = 5;
            m9576W4((u7s) iqvVar);
        }
    }

    /* JADX INFO: renamed from: E4 */
    public final /* synthetic */ void m9557E4(BLive bLive) {
        m9596s4(true, act().getString(R$string.f2972R5), false);
    }

    /* JADX INFO: renamed from: F4 */
    public final /* synthetic */ void m9558F4() {
        m9596s4(false, null, true);
    }

    /* JADX INFO: renamed from: G4 */
    public final /* synthetic */ void m9559G4() {
        act().finish();
    }

    /* JADX INFO: renamed from: H4 */
    public final /* synthetic */ void m9560H4(BLiveAnchor bLiveAnchor) {
        m25548F2().CallEvent.anchorCall().j(Boolean.FALSE);
    }

    /* JADX INFO: renamed from: I4 */
    public final /* synthetic */ void m9561I4(boolean z, String str, j760 j760Var, BLiveMultiCallAsset bLiveMultiCallAsset) {
        m9592n5(z, str, j760Var);
        m25548F2().MultiCallEvent.startLiveMultiCall().j(new ug10(s410.d, bLiveMultiCallAsset.multiCallOrder, r610.u(bLiveMultiCallAsset.maxCallNum, false), -1));
    }

    /* JADX INFO: renamed from: J4 */
    public final /* synthetic */ void m9562J4() {
        act().finish();
    }

    /* JADX INFO: renamed from: K4 */
    public final /* synthetic */ void m9563K4(BLiveAnchor bLiveAnchor) {
        if (TEnum.equals(bLiveAnchor.status, "jailed")) {
            act().dialog().F(act().getString(R$string.f3255eb, mqi0.p(bLiveAnchor.availableTime))).B(false).v0(act().getString(R$string.f3465o2), new Runnable() { // from class: l.sct
                @Override // java.lang.Runnable
                public final void run() {
                    this.f18926a.m9562J4();
                }
            }).z0();
        }
    }

    /* JADX INFO: renamed from: L4 */
    public final /* synthetic */ void m9564L4(Throwable th) {
        m9577X4(th, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: M4 */
    public final /* synthetic */ void m9565M4(View view) {
        eet.m12448b(this, "anchor_stop_live_confirm", null);
        m9593o5(((yl40) m25547E2()).m17235k());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: N4 */
    public final /* synthetic */ void m9566N4() {
        eet.m12448b(this, "anchor_stop_live_confirm", null);
        m9593o5(((yl40) m25547E2()).m17235k());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: O4 */
    public final /* synthetic */ rx.c m9567O4(String str, BLiveRoom bLiveRoom) {
        return LivingNormalApiProvider.m4820f4(((BLiveAbsRoom) bLiveRoom).id, m9543i5(), ((yl40) m25547E2()).m26788K2(), str);
    }

    /* JADX INFO: renamed from: P4 */
    public final /* synthetic */ void m9568P4(boolean z, String str, j760 j760Var) {
        Object obj = j760Var.b;
        if (obj == null || !"friends".equals(((BLiveAbsData) ((BLive) obj)).liveMode)) {
            m9592n5(z, str, j760Var);
        } else {
            m9580a5(z, str, j760Var);
        }
    }

    /* JADX INFO: renamed from: Q4 */
    public final /* synthetic */ void m9569Q4(boolean z, Throwable th) {
        this.f7515l = -3;
        act().progressDismiss();
        m9577X4(th, true);
        m9583d5(th, z);
    }

    /* JADX INFO: renamed from: R4 */
    public final /* synthetic */ void m9570R4(BLive bLive) {
        m9596s4(false, null, true);
    }

    /* JADX INFO: renamed from: S4 */
    public final /* synthetic */ void m9571S4(Throwable th) {
        m9596s4(false, null, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: T */
    public void m9572T() {
        super.T();
        m9594p5();
        duringCreated((rx.c) m25548F2().LivePusherEvent.recoverLive().g()).subscribe(ffw.d(new e30() { // from class: l.qbt
            public final void call(Object obj) {
                this.f17894a.m9553z4((soj0) obj);
            }
        }));
        duringCreated((rx.c) m25548F2().LivePusherEvent.stopLive().g()).subscribe(ffw.d(new e30() { // from class: l.bct
            public final void call(Object obj) {
                this.f8071a.m9593o5((String) obj);
            }
        }));
        duringCreated((rx.c) m25548F2().LivePusherEvent.suspendLive().g()).subscribe(ffw.d(new e30() { // from class: l.mct
            public final void call(Object obj) {
                this.f15340a.m9595q5(((Boolean) obj).booleanValue());
            }
        }));
        duringCreated((rx.c) m25548F2().LivePusherEvent.closeLive().g()).subscribe(ffw.d(new e30() { // from class: l.tct
            public final void call(Object obj) {
                this.f20185a.m9517A4((soj0) obj);
            }
        }));
        duringCreated((rx.c) m25548F2().LivePusherEvent.startLive().g()).subscribe(ffw.d(new e30() { // from class: l.uct
            public final void call(Object obj) {
                this.f20588a.m9554B4((cdt) obj);
            }
        }));
        m25549H2().lifecycle().subscribe(ffw.d(new e30() { // from class: l.vct
            public final void call(Object obj) {
                this.f21073a.m9555C4((c) obj);
            }
        }));
        duringCreated(((yl40) m25547E2()).m17236l()).subscribe(ffw.d(new e30() { // from class: l.wct
            public final void call(Object obj) {
                this.f21640a.m9556D4((iqv) obj);
            }
        }));
        this.f7516m = ((yl40) m25547E2()).m14592o1(this.f22037f).subscribe(ffw.d(new e30() { // from class: l.xct
            public final void call(Object obj) {
                this.f22219a.m9601x4((LiveControlMessage) obj);
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: T4 */
    public final /* synthetic */ void m9573T4(NetworkInfo networkInfo) {
        if (networkInfo != null && networkInfo.isConnected() && ((yl40) m25547E2()).m20502B2()) {
            duringCreated(((yl40) m25547E2()).m26795R2()).subscribe(ffw.e(new e30() { // from class: l.fct
                public final void call(Object obj) {
                    adt.m9531X3((BLiveRoom) obj);
                }
            }, new e30() { // from class: l.gct
                public final void call(Object obj) {
                    lsi0.h(R$string.f2696E9);
                }
            }));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: U4 */
    public final /* synthetic */ void m9574U4(boolean z, BLive bLive) {
        ((yl40) m25547E2()).m17232g(bLive);
        ((yl40) m25547E2()).mo17233h(pau.f17177b);
        m9584e5();
        oxl oxlVar = (oxl) m14184F3(new rv00(2600));
        if (oxlVar != null) {
            oxlVar.mo14925b();
        }
        this.f7515l = 2;
        if (z) {
            m9597t4(2, m25549H2().lifecycle_());
        }
    }

    /* JADX INFO: renamed from: V4 */
    public final /* synthetic */ void m9575V4(Throwable th) {
        this.f7515l = -2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: W4 */
    public final void m9576W4(u7s u7sVar) {
        String strM23326l = u7sVar.m23326l();
        m25548F2().ChatEvent.dismissDialog().p();
        if (!u7sVar.m23328n()) {
            LiveDialogAct.g2(act(), "", strM23326l);
        } else if (vdt.b(2)) {
            act().startActivity(LiveEndAct.m9113V1(act(), ((yl40) m25547E2()).m20501A2().mo19690l(), ((yl40) m25547E2()).m14582l0(), strM23326l, ((yl40) m25547E2()).m26787J2(), ((yl40) m25547E2()).m17247x()));
        } else {
            act().startActivity(IntlLiveEndAct.m9111V1(act(), ((yl40) m25547E2()).m20501A2().mo19690l(), ((yl40) m25547E2()).m14582l0(), strM23326l, ((yl40) m25547E2()).m26787J2(), ((yl40) m25547E2()).m17247x()));
        }
        act().finish();
    }

    /* JADX INFO: renamed from: X4 */
    public void m9577X4(Throwable th, boolean z) {
        String string;
        act().progressDismiss();
        if (th instanceof TantanException.Client.CoreService) {
            TantanException.Client.CoreService coreService = (TantanException.Client.CoreService) th;
            int i = coreService.code;
            final d30 d30Var = null;
            if (i == 41008 || i == 41020) {
                string = coreService.metaMessage;
            } else if (i == 41000 || i == 41002) {
                string = act().getString(R$string.f3272f6);
                if (m9602y4()) {
                    d30Var = new d30() { // from class: l.ict
                        public final void call() {
                            this.f13150a.m9558F4();
                        }
                    };
                }
            } else {
                if (i == 41010) {
                    m9587h5();
                    return;
                }
                if (i == 41005) {
                    string = act().getString(R$string.f2755H2);
                } else if (i == 41014 || i == 41017 || i == 41018) {
                    string = act().getString(R$string.f3660x);
                } else if (i == 41015) {
                    string = act().getString(R$string.f3211cb);
                } else if (i == 41009) {
                    string = act().getString(R$string.f2924P);
                } else if (i == 41042) {
                    string = act().getString(R$string.f2733G2);
                    d30Var = new d30() { // from class: l.jct
                        public final void call() {
                            this.f13695a.m9559G4();
                        }
                    };
                } else {
                    string = "";
                }
            }
            if (!TextUtils.isEmpty(string)) {
                act().dialog().F(string).B(false).v0(act().getString(R$string.f3465o2), new Runnable() { // from class: l.kct
                    @Override // java.lang.Runnable
                    public final void run() {
                        adt.m9542i4(d30Var);
                    }
                }).z0();
                return;
            }
        }
        if (z) {
            lsi0.h(R$string.f2696E9);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: Y4 */
    public void m9578Y4() {
        if (this.f7512i) {
            return;
        }
        this.f7512i = true;
        m25548F2().MomoSdkEvent.sdkActionEvent().j(2);
        boolean zM9602y4 = m9602y4();
        gkh0.j(u0t.b, "onResume:" + this.f7514k + ":" + this.f7513j + ":" + this.f7515l + ":" + zM9602y4);
        if (this.f7514k || this.f7513j) {
            return;
        }
        int i = this.f7515l;
        if (i == -2 || i == 2 || zM9602y4) {
            this.f7515l = 3;
            m9590l5(true, ((yl40) m25547E2()).m17235k(), "manual");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: Z4 */
    public void m9579Z4() {
        this.f7512i = false;
        if (!act().isFinishing()) {
            m25548F2().MomoSdkEvent.sdkActionEvent().j(1);
        }
        if (((yl40) m25547E2()).m17237m().m15301d()) {
            int i = this.f7515l;
            if (i == 4 || i == -3) {
                m9595q5(true);
            }
        }
    }

    /* JADX INFO: renamed from: a5 */
    public final void m9580a5(final boolean z, final String str, final j760<User, BLive> j760Var) {
        duringCreated(LivingNormalApiProvider.m4670O7(false).doOnNext(new e30() { // from class: l.lct
            public final void call(Object obj) {
                this.f14769a.m9560H4((BLiveAnchor) obj);
            }
        }).flatMap(new w9j() { // from class: l.nct
            public final Object call(Object obj) {
                return LivingNormalApiProvider.m4993y6(((BLiveAbsData) ((BLive) j760Var.b)).id);
            }
        })).subscribe(ffw.e(new e30() { // from class: l.oct
            public final void call(Object obj) {
                this.f16526a.m9561I4(z, str, j760Var, (BLiveMultiCallAsset) obj);
            }
        }, new e30() { // from class: l.pct
            public final void call(Object obj) {
                this.f17199a.m9581b5((Throwable) obj);
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b5 */
    public final void m9581b5(Throwable th) {
        LivingNormalApiProvider.m4643L7(((yl40) m25547E2()).m17235k(), true);
        r610.j(th);
        this.f7515l = -3;
        act().progressDismiss();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: c5 */
    public void m9582c5() {
        if (this.f7514k || this.f7513j) {
            return;
        }
        this.f7515l = 3;
        m9590l5(true, ((yl40) m25547E2()).m17235k(), "manual");
    }

    /* JADX INFO: renamed from: d5 */
    public final void m9583d5(Throwable th, boolean z) {
        if (z && xtr.b(41000, th)) {
            m25548F2().LivePusherEvent.notifyRecoverLiveStopped().p();
        }
    }

    /* JADX INFO: renamed from: e5 */
    public final void m9584e5() {
        C0303b c0303bMo14924a;
        if (vdt.b(2) || (c0303bMo14924a = ((oxl) m14184F3(new rv00(2600))).mo14924a()) == null) {
            return;
        }
        c0303bMo14924a.m5286k1();
    }

    /* JADX INFO: renamed from: f5 */
    public final void m9585f5(String str, String str2, int i, d30 d30Var) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (vdt.b(2)) {
            Dialog.e eVarB = act().dialog().F(str).B(false);
            Objects.requireNonNull(d30Var);
            eVarB.n0(str2, new bii0(d30Var)).z0();
        } else {
            dd80.a aVarP = act().newDialog().y0(m9599v4(i)).t0(m9600w4(str, h1c0.f11748Q)).P(false);
            Objects.requireNonNull(d30Var);
            aVarP.c0(str2, new bii0(d30Var)).r0();
        }
    }

    /* JADX INFO: renamed from: g5 */
    public final rx.c<j760<User, BLive>> m9586g5(final BLive bLive) {
        return LivingNormalApiProvider.m4940s7(ypv.a.D0(), ((BLiveAbsData) bLive).id).materialize().take(1).flatMap(new w9j() { // from class: l.hct
            public final Object call(Object obj) {
                Notification notification = (Notification) obj;
                return rx.c.just(vwb.Y(notification.j() ? ypv.a.V() : (User) notification.f(), bLive));
            }
        });
    }

    /* JADX INFO: renamed from: h5 */
    public final void m9587h5() {
        duringCreated(LivingNormalApiProvider.m4955u4(ypv.a.D0())).subscribe(ffw.e(new e30() { // from class: l.qct
            public final void call(Object obj) {
                this.f17907a.m9563K4((BLiveAnchor) obj);
            }
        }, new e30() { // from class: l.rct
            public final void call(Object obj) {
                this.f18466a.m9564L4((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: j5 */
    public void m9588j5(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str)) {
            new xh0.a(this.f22037f).j(str2).r(str3).o(new View.OnClickListener() { // from class: l.zbt
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f23333a.m9565M4(view);
                }
            }).p(h1c0.f11777d).f(act().getString(R$string.f3704z)).a().g();
        } else {
            act().dialog().G0(str).F(str2).v0(str3, new Runnable() { // from class: l.act
                @Override // java.lang.Runnable
                public final void run() {
                    this.f7503a.m9566N4();
                }
            }).m0(act().getString(R$string.f3704z)).z0();
        }
    }

    /* JADX INFO: renamed from: k5 */
    public void m9589k5() {
        odu oduVar = new odu();
        if (oduVar.m19437j()) {
            oduVar.m19439l(m25549H2().act(), null, new Runnable() { // from class: l.ect
                @Override // java.lang.Runnable
                public final void run() {
                    lsi0.h(R$string.f2696E9);
                }
            });
        }
    }

    /* JADX INFO: renamed from: l5 */
    public void m9590l5(boolean z, String str, String str2) {
        m9591m5(false, z, str, str2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: m5 */
    public void m9591m5(final boolean z, final boolean z2, String str, final String str2) {
        rx.c<BLive> cVarFlatMap;
        act().progress(R$string.f3145Za);
        if (z2) {
            cVarFlatMap = LivingNormalApiProvider.m4642L6(str, str2);
        } else {
            cVarFlatMap = ((yl40) m25547E2()).m20502B2() ? ((yl40) m25547E2()).m26795R2().flatMap(new w9j() { // from class: l.zct
                public final Object call(Object obj) {
                    return this.f23344a.m9567O4(str2, (BLiveRoom) obj);
                }
            }) : LivingNormalApiProvider.m4820f4(((yl40) m25547E2()).m17239o(), m9543i5(), ((yl40) m25547E2()).m26788K2(), str2);
        }
        h5j0.INSTANCE.c("create_live_room", "createLive");
        duringCreated(cVarFlatMap.flatMap(new w9j() { // from class: l.rbt
            public final Object call(Object obj) {
                return this.f18455a.m9586g5((BLive) obj);
            }
        })).subscribe(ffw.e(new e30() { // from class: l.sbt
            public final void call(Object obj) {
                this.f18912a.m9568P4(z, str2, (j760) obj);
            }
        }, new e30() { // from class: l.tbt
            public final void call(Object obj) {
                this.f20170a.m9569Q4(z2, (Throwable) obj);
            }
        }));
    }

    @Override // p002l.h4t
    /* JADX INFO: renamed from: n */
    public void mo5949n() {
        super.mo5949n();
        mkd0.z(this.f7516m);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: n5 */
    public final void m9592n5(boolean z, String str, j760<User, BLive> j760Var) {
        act().progressDismiss();
        this.f7515l = 4;
        m9597t4(4, m25549H2().lifecycle_());
        BLiveAbsData bLiveAbsData = (BLive) j760Var.b;
        User user = (User) j760Var.a;
        ((yl40) m25547E2()).m17232g(bLiveAbsData);
        ((yl40) m25547E2()).m14523R(user);
        if (z) {
            eet.m12448b(this, "anchor_live_started", null);
        }
        h5j0.INSTANCE.a("create_live_room", "startLiveSuccess");
        m9589k5();
        if (((yl40) m25547E2()).m26792O2()) {
            m25548F2().ObsPreviewEvent.onObsLiveStart().j(new q150((User) j760Var.a, (BLive) j760Var.b));
        } else {
            ((yl40) m25547E2()).mo17233h(i0t.f12387c);
        }
    }

    /* JADX INFO: renamed from: o5 */
    public void m9593o5(String str) {
        this.f7514k = true;
        m9584e5();
        ((oxl) m14184F3(new rv00(2600))).mo14925b();
        m25548F2().LivePkEvent.liveEndEvent().p();
        r610.H(this);
        act().progress(R$string.f3095X2);
        duringCreated(LivingNormalApiProvider.m4643L7(str, true)).subscribe(ffw.e(new e30() { // from class: l.cct
            public final void call(Object obj) {
                this.f8596a.m9570R4((BLive) obj);
            }
        }, new e30() { // from class: l.dct
            public final void call(Object obj) {
                this.f9170a.m9571S4((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: p5 */
    public final void m9594p5() {
        duringCreated(ConnectivityReceiver.m()).skip(1).distinctUntilChanged().subscribe(ffw.d(new e30() { // from class: l.yct
            public final void call(Object obj) {
                this.f22807a.m9573T4((NetworkInfo) obj);
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: q5 */
    public void m9595q5(final boolean z) {
        if ((z && (((Boolean) m14184F3(new k480(3300))).booleanValue() || ((Boolean) m14184F3(new fd50(3300))).booleanValue() || this.f22036e.f8341j.m24319L3(MotionType.multi_call))) || this.f7513j || this.f7514k) {
            return;
        }
        this.f7515l = 1;
        LivingNormalApiProvider.m4643L7(((yl40) m25547E2()).m17235k(), false).subscribe(ffw.e(new e30() { // from class: l.ubt
            public final void call(Object obj) {
                this.f20573a.m9574U4(z, (BLive) obj);
            }
        }, new e30() { // from class: l.vbt
            public final void call(Object obj) {
                this.f21064a.m9575V4((Throwable) obj);
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: s4 */
    public final void m9596s4(boolean z, String str, boolean z2) {
        if (!z) {
            act().progressDismiss();
            if (((yl40) m25547E2()).m17237m().m15300c()) {
                return;
            }
            ((yl40) m25547E2()).mo17233h(u7s.f20528e);
            return;
        }
        oxl oxlVar = (oxl) m14184F3(new rv00(2600));
        m9584e5();
        if (oxlVar != null) {
            oxlVar.mo14925b();
        }
        if (this.f7514k) {
            return;
        }
        this.f7513j = true;
        if (((yl40) m25547E2()).m17237m().m15300c()) {
            return;
        }
        ((yl40) m25547E2()).mo17233h(new u7s(str, z2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: t4 */
    public final void m9597t4(int i, c cVar) {
        if (cVar == c.i && i == 2) {
            m9590l5(true, ((yl40) m25547E2()).m17235k(), "manual");
        } else if (cVar == c.k && i == 4) {
            m9595q5(true);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: u4 */
    public void m9598u4() {
        if (((yl40) m25547E2()).m17237m().m15303f()) {
            act().finish();
            return;
        }
        if (((Boolean) m14184F3(new b080(3300))).booleanValue()) {
            m9588j5(act().getString(R$string.f3627va), (String) m14184F3(new am70(600)), act().getString(R$string.f3465o2));
            return;
        }
        if (rl10.a(this, ypv.a.D0())) {
            m9588j5("", act().getString(R$string.f3472o9), act().getString(R$string.f3465o2));
        } else if (r610.P(this)) {
            m9588j5("", act().getString(R$string.f2804J7), act().getString(R$string.f3465o2));
        } else {
            m9588j5("", ((yl40) m25547E2()).m26792O2() ? act().getString(R$string.f3042Uc) : act().getString(R$string.f2944Pj), ((yl40) m25547E2()).m26792O2() ? act().getString(R$string.f3177b) : act().getString(R$string.f3137Z2));
        }
    }

    /* JADX INFO: renamed from: v4 */
    public final CharSequence m9599v4(int i) {
        if (i != 259) {
            return "";
        }
        String string = act().getString(R$string.f2951Q5);
        return !TextUtils.isEmpty(string) ? m9600w4(string, h1c0.f11840y0) : "";
    }

    /* JADX INFO: renamed from: w4 */
    public final SpannableString m9600w4(String str, int i) {
        SpannableString spannableString = new SpannableString(str);
        spannableString.setSpan(new ForegroundColorSpan(kvc0.a(i)), 0, str.length(), 33);
        return spannableString;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: x4 */
    public final void m9601x4(LiveControlMessage liveControlMessage) {
        String str = liveControlMessage.type;
        str.getClass();
        switch (str) {
            case "add_manager":
            case "delete_manager":
                ((yl40) m25547E2()).mo14510K1(((yl40) m25547E2()).m17239o());
                break;
            case "system":
                m9585f5(liveControlMessage.content, !vdt.b(2) ? act().getString(R$string.f3465o2) : act().getString(R$string.f3688y5), liveControlMessage.templateId, new d30() { // from class: l.wbt
                    public final void call() {
                        adt.m9535b4();
                    }
                });
                break;
            case "re_request_room_gift_list":
                wrj.m25429w(false);
                ((yl40) m25547E2()).m14490A1(new evj.C0549a(((yl40) m25547E2()).m17239o(), ((DbObject) ((yl40) m25547E2()).m14582l0()).id, "live").m12717f(), null);
                break;
            case "stop":
                m9596s4(true, act().getString(R$string.f3272f6), true);
                break;
            case "force_stop":
                m9596s4(true, liveControlMessage.content, true);
                break;
            case "forbidden_multidevice":
                if (!liveControlMessage.isAnchor) {
                    duringCreated(LivingNormalApiProvider.m4643L7(((yl40) m25547E2()).m17235k(), false)).subscribe(ffw.e(new e30() { // from class: l.xbt
                        public final void call(Object obj) {
                            this.f22211a.m9557E4((BLive) obj);
                        }
                    }, new e30() { // from class: l.ybt
                        public final void call(Object obj) {
                            adt.m9548n4((Throwable) obj);
                        }
                    }));
                    break;
                } else {
                    m9596s4(true, act().getString(R$string.f3014T5), false);
                    break;
                }
                break;
        }
        if (vdt.b(2)) {
            return;
        }
        gkh0.k(liveControlMessage.toString(), new String[]{"[live]", "[passivity_exit]"});
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: y4 */
    public final boolean m9602y4() {
        return ((yl40) m25547E2()).m17237m().m15304g();
    }
}
