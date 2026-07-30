package p002l;

import android.text.TextUtils;
import android.view.View;
import com.p000p1.mobile.putong.live.livingroom.R$string;
import com.p000p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.p000p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveControlMessage;
import com.p1.mobile.android.app.Dialog;
import com.p1.mobile.putong.api.api.TantanException;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.p1.mobile.putong.live.base.data.BLive;
import com.p1.mobile.putong.live.base.data.BLiveAbsData;
import com.p1.mobile.putong.live.base.data.BLiveAnchor;
import com.p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p1.mobile.putong.live.base.data.BLiveOfficialShowCurrentAnchorInfo;
import java.util.Objects;
import l.bii0;
import l.c4g0;
import l.d30;
import l.e30;
import l.ffw;
import l.gkh0;
import l.h5j0;
import l.j760;
import l.lsi0;
import l.mkd0;
import l.mqi0;
import l.soj0;
import l.u0t;
import l.vwb;
import l.w9j;
import l.xh0;
import l.xtr;
import l.ypv;
import rx.Notification;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class l550 extends pat<x350> {

    /* JADX INFO: renamed from: i */
    public boolean f14672i;

    /* JADX INFO: renamed from: j */
    public int f14673j;

    /* JADX INFO: renamed from: k */
    public c4g0 f14674k;

    public l550(bsm bsmVar) {
        super(bsmVar);
        this.f14673j = 4;
    }

    /* JADX INFO: renamed from: D4 */
    private void m16946D4(u7s u7sVar) {
        if (this.f14673j == 5) {
            return;
        }
        this.f14673j = 5;
    }

    /* JADX INFO: renamed from: I4 */
    private void m16947I4(Throwable th, boolean z) {
        if (z && xtr.b(41000, th)) {
            m25548F2().LivePusherEvent.notifyRecoverLiveStopped().p();
        }
    }

    /* JADX INFO: renamed from: J4 */
    private void m16949J4(String str, String str2, int i, d30 d30Var) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        Dialog.e eVarB = act().dialog().F(str).B(false);
        Objects.requireNonNull(d30Var);
        eVarB.n0(str2, new bii0(d30Var)).z0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K4 */
    public c<j760<User, BLive>> m16951K4(final BLive bLive) {
        return LivingNormalApiProvider.m4940s7(ypv.a.D0(), ((BLiveAbsData) bLive).id).materialize().take(1).flatMap(new w9j() { // from class: l.v450
            public final Object call(Object obj) {
                Notification notification = (Notification) obj;
                return c.just(vwb.Y(notification.j() ? ypv.a.V() : (User) notification.f(), bLive));
            }
        });
    }

    /* JADX INFO: renamed from: L4 */
    private void m16953L4() {
        duringCreated(LivingNormalApiProvider.m4955u4(ypv.a.D0())).subscribe(ffw.e(new e30() { // from class: l.a550
            public final void call(Object obj) {
                this.f7401a.m17001u4((BLiveAnchor) obj);
            }
        }, new e30() { // from class: l.b550
            public final void call(Object obj) {
                this.f7986a.m17002v4((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: T3 */
    public static /* synthetic */ void m16960T3(d30 d30Var) {
        if (d30Var != null) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: W3 */
    public static /* synthetic */ void m16963W3(Throwable th) {
    }

    /* JADX INFO: renamed from: b4 */
    public static /* synthetic */ void m16968b4() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: h4 */
    private void m16974h4(boolean z, String str, boolean z2) {
        if (!z) {
            if (((x350) m25547E2()).m17237m().m15300c()) {
                return;
            }
            ((x350) m25547E2()).mo17233h(u7s.f20528e);
        } else {
            oxl oxlVar = (oxl) m14184F3(new rv00(2600));
            if (oxlVar != null) {
                oxlVar.mo14925b();
            }
            if (((x350) m25547E2()).m17237m().m15300c()) {
                return;
            }
            ((x350) m25547E2()).mo17233h(new u7s(str, z2));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: i4 */
    private void m16975i4(int i, com.p1.mobile.android.app.c cVar) {
        if (cVar == com.p1.mobile.android.app.c.i && i == 2) {
            m16988N4(true, ((x350) m25547E2()).m17235k(), "manual");
        } else if (cVar == com.p1.mobile.android.app.c.k && i == 4) {
            m16991Q4(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3, types: [l.ho2] */
    /* JADX INFO: renamed from: k4 */
    public void m16976k4(LiveControlMessage liveControlMessage) {
        String str = liveControlMessage.type;
        str.getClass();
        switch (str) {
            case "add_manager":
            case "delete_manager":
                ((x350) m25547E2()).mo14510K1(((x350) m25547E2()).m17239o());
                break;
            case "system":
                m16949J4(liveControlMessage.content, act().getString(R$string.f3688y5), liveControlMessage.templateId, new d30() { // from class: l.j550
                    public final void call() {
                        l550.m16968b4();
                    }
                });
                break;
            case "re_request_room_gift_list":
                wrj.m25429w(false);
                if (m25547E2() != 0 && ((x350) m25547E2()).m25674S2() != null) {
                    ((x350) m25547E2()).m14490A1(new evj.C0549a(((x350) m25547E2()).m17239o(), x350.m25673R2(m25547E2(), ((x350) m25547E2()).m14576j0()), "live").m12717f(), null);
                    break;
                }
                break;
            case "stop":
                m16974h4(true, act().getString(R$string.f3272f6), true);
                break;
            case "force_stop":
                m16974h4(true, liveControlMessage.content, true);
                break;
            case "forbidden_multidevice":
                if (!liveControlMessage.isAnchor) {
                    duringCreated(LivingNormalApiProvider.m4643L7(((x350) m25547E2()).m17235k(), false)).subscribe(ffw.e(new e30() { // from class: l.k550
                        public final void call(Object obj) {
                            this.f14202a.m16996q4((BLive) obj);
                        }
                    }, new e30() { // from class: l.o450
                        public final void call(Object obj) {
                            l550.m16963W3((Throwable) obj);
                        }
                    }));
                    break;
                } else {
                    m16974h4(true, act().getString(R$string.f3014T5), false);
                    break;
                }
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: l4 */
    private boolean m16977l4() {
        return ((x350) m25547E2()).m17237m().m15304g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m4 */
    public /* synthetic */ void m16978m4(soj0 soj0Var) {
        m16986H4();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n4 */
    public /* synthetic */ void m16979n4(soj0 soj0Var) {
        m16993j4();
    }

    /* JADX INFO: renamed from: A4 */
    public final /* synthetic */ void m16980A4(Throwable th) {
        this.f22037f.finish();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: B4 */
    public final /* synthetic */ void m16981B4(boolean z, BLive bLive) {
        ((x350) m25547E2()).m17232g(bLive);
        ((x350) m25547E2()).mo17233h(pau.f17177b);
        oxl oxlVar = (oxl) m14184F3(new rv00(2600));
        if (oxlVar != null) {
            oxlVar.mo14925b();
        }
        this.f14673j = 2;
        if (z) {
            m16975i4(2, m25549H2().lifecycle_());
        }
    }

    /* JADX INFO: renamed from: C4 */
    public final /* synthetic */ void m16982C4(Throwable th) {
        this.f14673j = -2;
    }

    /* JADX INFO: renamed from: E4 */
    public void m16983E4(Throwable th, boolean z) {
        String string;
        if (th instanceof TantanException.Client.CoreService) {
            TantanException.Client.CoreService coreService = (TantanException.Client.CoreService) th;
            int i = coreService.code;
            final d30 d30Var = null;
            if (i == 41008 || i == 41020) {
                string = coreService.metaMessage;
            } else if (i == 41000 || i == 41002) {
                string = act().getString(R$string.f3272f6);
                if (m16977l4()) {
                    d30Var = new d30() { // from class: l.w450
                        public final void call() {
                            this.f21435a.m16997r4();
                        }
                    };
                }
            } else {
                if (i == 41010) {
                    m16953L4();
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
                    d30Var = new d30() { // from class: l.x450
                        public final void call() {
                            this.f22106a.m16998s4();
                        }
                    };
                } else {
                    string = "";
                }
            }
            if (!TextUtils.isEmpty(string)) {
                act().dialog().F(string).B(false).v0(act().getString(R$string.f3465o2), new Runnable() { // from class: l.z450
                    @Override // java.lang.Runnable
                    public final void run() {
                        l550.m16960T3(d30Var);
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
    /* JADX INFO: renamed from: F4 */
    public void m16984F4() {
        if (((x350) m25547E2()).m17237m().m15300c() || this.f14672i) {
            return;
        }
        this.f14672i = true;
        m25548F2().MomoSdkEvent.sdkActionEvent().j(2);
        boolean zM16977l4 = m16977l4();
        gkh0.j(u0t.b, "onResume:" + this.f14673j + ":" + zM16977l4);
        int i = this.f14673j;
        if (i == -2 || i == 2 || zM16977l4) {
            this.f14673j = 3;
            m16988N4(true, ((x350) m25547E2()).m17235k(), "manual");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: G4 */
    public void m16985G4() {
        this.f14672i = false;
        if (!act().isFinishing()) {
            m25548F2().MomoSdkEvent.sdkActionEvent().j(1);
        }
        if (((x350) m25547E2()).m17237m().m15301d()) {
            int i = this.f14673j;
            if (i == 4 || i == -3) {
                m16991Q4(true);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: H4 */
    public void m16986H4() {
        if (((x350) m25547E2()).m17237m().m15300c()) {
            return;
        }
        this.f14673j = 3;
        m16988N4(true, ((x350) m25547E2()).m17235k(), "manual");
    }

    /* JADX INFO: renamed from: M4 */
    public void m16987M4(String str, String str2) {
        new xh0.a(this.f22037f).j(str).r(str2).o(new View.OnClickListener() { // from class: l.p450
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f16997a.m17003w4(view);
            }
        }).p(h1c0.f11777d).f(act().getString(R$string.f3704z)).a().g();
    }

    /* JADX INFO: renamed from: N4 */
    public void m16988N4(final boolean z, String str, final String str2) {
        c<BLive> cVarM4642L6 = LivingNormalApiProvider.m4642L6(str, str2);
        h5j0.INSTANCE.c("create_live_room", "createLive");
        duringCreated(cVarM4642L6.flatMap(new w9j() { // from class: l.q450
            public final Object call(Object obj) {
                return this.f17807a.m16951K4((BLive) obj);
            }
        })).subscribe(ffw.e(new e30() { // from class: l.r450
            public final void call(Object obj) {
                this.f18357a.m17005y4(str2, (j760) obj);
            }
        }, new e30() { // from class: l.s450
            public final void call(Object obj) {
                this.f18779a.m17004x4(z, (Throwable) obj);
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: O4, reason: merged with bridge method [inline-methods] */
    public final void m17005y4(String str, j760<User, BLive> j760Var) {
        this.f14673j = 4;
        m16975i4(4, m25549H2().lifecycle_());
        BLiveAbsData bLiveAbsData = (BLive) j760Var.b;
        ((x350) m25547E2()).m17232g(bLiveAbsData);
        h5j0.INSTANCE.a("create_live_room", "startLiveSuccess");
        ((x350) m25547E2()).mo17233h(i0t.f12387c);
    }

    /* JADX INFO: renamed from: P4 */
    public final void m16990P4(String str) {
        duringCreated(LivingNormalApiProvider.m4624J6(str)).subscribe(ffw.e(new e30() { // from class: l.t450
            public final void call(Object obj) {
                this.f19414a.m17006z4((BLiveEnvelope) obj);
            }
        }, new e30() { // from class: l.u450
            public final void call(Object obj) {
                this.f20480a.m16980A4((Throwable) obj);
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: Q4 */
    public void m16991Q4(final boolean z) {
        if (((x350) m25547E2()).m17237m().m15300c()) {
            return;
        }
        this.f14673j = 1;
        LivingNormalApiProvider.m4643L7(((x350) m25547E2()).m17235k(), false).subscribe(ffw.e(new e30() { // from class: l.h550
            public final void call(Object obj) {
                this.f11878a.m16981B4(z, (BLive) obj);
            }
        }, new e30() { // from class: l.i550
            public final void call(Object obj) {
                this.f13048a.m16982C4((Throwable) obj);
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: T */
    public void m16992T() {
        super.T();
        duringCreated((c) m25548F2().LivePusherEvent.recoverLive().g()).subscribe(ffw.d(new e30() { // from class: l.n450
            public final void call(Object obj) {
                this.f15820a.m16978m4((soj0) obj);
            }
        }));
        duringCreated((c) m25548F2().LivePusherEvent.suspendLive().g()).subscribe(ffw.d(new e30() { // from class: l.y450
            public final void call(Object obj) {
                this.f22647a.m16991Q4(((Boolean) obj).booleanValue());
            }
        }));
        duringCreated((c) m25548F2().LivePusherEvent.closeLive().g()).subscribe(ffw.d(new e30() { // from class: l.d550
            public final void call(Object obj) {
                this.f9060a.m16979n4((soj0) obj);
            }
        }));
        m25549H2().lifecycle().subscribe(ffw.d(new e30() { // from class: l.e550
            public final void call(Object obj) {
                this.f9577a.m16994o4((com.p1.mobile.android.app.c) obj);
            }
        }));
        duringCreated(((x350) m25547E2()).m17236l()).subscribe(ffw.d(new e30() { // from class: l.f550
            public final void call(Object obj) {
                this.f10124a.m16995p4((iqv) obj);
            }
        }));
        this.f14674k = ((x350) m25547E2()).m14592o1(this.f22037f).subscribe(ffw.d(new e30() { // from class: l.g550
            public final void call(Object obj) {
                this.f10778a.m16976k4((LiveControlMessage) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: j4 */
    public void m16993j4() {
        m16987M4("是否结束公演", act().getString(R$string.f3177b));
    }

    @Override // p002l.h4t
    /* JADX INFO: renamed from: n */
    public void mo5949n() {
        super.mo5949n();
        mkd0.z(this.f14674k);
    }

    /* JADX INFO: renamed from: o4 */
    public final /* synthetic */ void m16994o4(com.p1.mobile.android.app.c cVar) {
        if (cVar == com.p1.mobile.android.app.c.i) {
            m16984F4();
        } else if (cVar == com.p1.mobile.android.app.c.k) {
            m16985G4();
        }
    }

    /* JADX INFO: renamed from: p4 */
    public final /* synthetic */ void m16995p4(iqv iqvVar) {
        if (iqvVar.m15298a() == 4) {
            m16946D4((u7s) iqvVar);
        }
    }

    /* JADX INFO: renamed from: q4 */
    public final /* synthetic */ void m16996q4(BLive bLive) {
        m16974h4(true, act().getString(R$string.f2972R5), false);
    }

    /* JADX INFO: renamed from: r4 */
    public final /* synthetic */ void m16997r4() {
        m16974h4(false, null, true);
    }

    /* JADX INFO: renamed from: s4 */
    public final /* synthetic */ void m16998s4() {
        act().finish();
    }

    /* JADX INFO: renamed from: t */
    public void m16999t() {
        super.t();
        ubu ubuVar = new ubu();
        ubuVar.f20575a = 0;
        ubuVar.f20578d = "已开启公演准备好才艺吧";
        ubuVar.f20579e = "知道了";
        m25548F2().LiveTipEvent.showTip().j(ubuVar);
    }

    /* JADX INFO: renamed from: t4 */
    public final /* synthetic */ void m17000t4() {
        act().finish();
    }

    /* JADX INFO: renamed from: u4 */
    public final /* synthetic */ void m17001u4(BLiveAnchor bLiveAnchor) {
        if (TEnum.equals(bLiveAnchor.status, "jailed")) {
            act().dialog().F(act().getString(R$string.f3255eb, mqi0.p(bLiveAnchor.availableTime))).B(false).v0(act().getString(R$string.f3465o2), new Runnable() { // from class: l.c550
                @Override // java.lang.Runnable
                public final void run() {
                    this.f8486a.m17000t4();
                }
            }).z0();
        }
    }

    /* JADX INFO: renamed from: v4 */
    public final /* synthetic */ void m17002v4(Throwable th) {
        m16983E4(th, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: w4 */
    public final /* synthetic */ void m17003w4(View view) {
        BLiveOfficialShowCurrentAnchorInfo bLiveOfficialShowCurrentAnchorInfoM25674S2 = ((x350) m25547E2()).m25674S2();
        if (bLiveOfficialShowCurrentAnchorInfoM25674S2 != null) {
            m16990P4(bLiveOfficialShowCurrentAnchorInfoM25674S2.programId);
        } else {
            this.f22037f.finish();
        }
    }

    /* JADX INFO: renamed from: x4 */
    public final /* synthetic */ void m17004x4(boolean z, Throwable th) {
        this.f14673j = -3;
        m16983E4(th, true);
        m16947I4(th, z);
    }

    /* JADX INFO: renamed from: z4 */
    public final /* synthetic */ void m17006z4(BLiveEnvelope bLiveEnvelope) {
        m25548F2().OfficialShowEvent.switchOffAnchor().p();
    }
}
