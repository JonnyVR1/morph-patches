package p149l;

import android.text.TextUtils;
import android.view.View;
import com.p046p1.mobile.android.app.C4319c;
import com.p046p1.mobile.android.app.Dialog;
import com.p046p1.mobile.putong.api.api.TantanException;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.live.base.data.BLive;
import com.p046p1.mobile.putong.live.base.data.BLiveAnchor;
import com.p046p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p046p1.mobile.putong.live.base.data.BLiveOfficialShowCurrentAnchorInfo;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.p046p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveControlMessage;
import java.util.Objects;
import p133rx.C22306c;
import p133rx.Notification;

/* JADX INFO: loaded from: classes4.dex */
public class l550 extends pat<x350> {

    /* JADX INFO: renamed from: i */
    public boolean f126085i;

    /* JADX INFO: renamed from: j */
    public int f126086j;

    /* JADX INFO: renamed from: k */
    public c4g0 f126087k;

    public l550(bsm bsmVar) {
        super(bsmVar);
        this.f126086j = 4;
    }

    /* JADX INFO: renamed from: D4 */
    private void m148519D4(u7s u7sVar) {
        if (this.f126086j == 5) {
            return;
        }
        this.f126086j = 5;
    }

    /* JADX INFO: renamed from: I4 */
    private void m148520I4(Throwable th, boolean z) {
        if (z && xtr.m211022b(41000, th)) {
            m206028F2().LivePusherEvent.notifyRecoverLiveStopped().m172467p();
        }
    }

    /* JADX INFO: renamed from: J4 */
    private void m148522J4(String str, String str2, int i, d30 d30Var) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        Dialog.C4309e c4309eM20496B = act().dialog().m20504F(str).m20496B(false);
        Objects.requireNonNull(d30Var);
        c4309eM20496B.m20544n0(str2, new bii0(d30Var)).m20568z0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K4 */
    public C22306c<j760<User, BLive>> m148524K4(final BLive bLive) {
        return LivingNormalApiProvider.m71574s7(ypv.f199493a.m199309D0(), bLive.f44323id).materialize().take(1).flatMap(new w9j() { // from class: l.v450
            @Override // p149l.w9j
            public final Object call(Object obj) {
                Notification notification = (Notification) obj;
                return C22306c.just(vwb.m200311Y(notification.m221299j() ? ypv.f199493a.m199329V() : (User) notification.m221295f(), bLive));
            }
        });
    }

    /* JADX INFO: renamed from: L4 */
    private void m148526L4() {
        duringCreated(LivingNormalApiProvider.m71589u4(ypv.f199493a.m199309D0())).subscribe(ffw.m121194e(new e30() { // from class: l.a550
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f67631a.m148572u4((BLiveAnchor) obj);
            }
        }, new e30() { // from class: l.b550
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f73441a.m148573v4((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: T3 */
    public static /* synthetic */ void m148533T3(d30 d30Var) {
        if (d30Var != null) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: W3 */
    public static /* synthetic */ void m148536W3(Throwable th) {
    }

    /* JADX INFO: renamed from: b4 */
    public static /* synthetic */ void m148541b4() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: h4 */
    private void m148547h4(boolean z, String str, boolean z2) {
        if (!z) {
            if (((x350) m206027E2()).m149816m().m137796c()) {
                return;
            }
            ((x350) m206027E2()).mo149812h(u7s.f175055e);
        } else {
            oxl oxlVar = (oxl) m129297F3(new rv00(2600));
            if (oxlVar != null) {
                oxlVar.mo133472b();
            }
            if (((x350) m206027E2()).m149816m().m137796c()) {
                return;
            }
            ((x350) m206027E2()).mo149812h(new u7s(str, z2));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: i4 */
    private void m148548i4(int i, C4319c c4319c) {
        if (c4319c == C4319c.f15548i && i == 2) {
            m148561N4(true, ((x350) m206027E2()).m149814k(), "manual");
        } else if (c4319c == C4319c.f15550k && i == 4) {
            m148564Q4(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3, types: [l.ho2] */
    /* JADX INFO: renamed from: k4 */
    public void m148549k4(LiveControlMessage liveControlMessage) {
        String str = liveControlMessage.type;
        str.getClass();
        switch (str) {
            case "add_manager":
            case "delete_manager":
                ((x350) m206027E2()).mo132074K1(((x350) m206027E2()).m149818o());
                break;
            case "system":
                m148522J4(liveControlMessage.content, act().getString(R$string.f47646y5), liveControlMessage.templateId, new d30() { // from class: l.j550
                    @Override // p149l.d30
                    public final void call() {
                        l550.m148541b4();
                    }
                });
                break;
            case "re_request_room_gift_list":
                wrj.m205257w(false);
                if (m206027E2() != 0 && ((x350) m206027E2()).m206897S2() != null) {
                    ((x350) m206027E2()).m132055A1(new evj.C16689a(((x350) m206027E2()).m149818o(), x350.m206896R2(m206027E2(), ((x350) m206027E2()).m132140j0()), "live").m118277f(), null);
                    break;
                }
                break;
            case "stop":
                m148547h4(true, act().getString(R$string.f47230f6), true);
                break;
            case "force_stop":
                m148547h4(true, liveControlMessage.content, true);
                break;
            case "forbidden_multidevice":
                if (!liveControlMessage.isAnchor) {
                    duringCreated(LivingNormalApiProvider.m71277L7(((x350) m206027E2()).m149814k(), false)).subscribe(ffw.m121194e(new e30() { // from class: l.k550
                        @Override // p149l.e30
                        public final void call(Object obj) {
                            this.f121145a.m148568q4((BLive) obj);
                        }
                    }, new e30() { // from class: l.o450
                        @Override // p149l.e30
                        public final void call(Object obj) {
                            l550.m148536W3((Throwable) obj);
                        }
                    }));
                    break;
                } else {
                    m148547h4(true, act().getString(R$string.f46972T5), false);
                    break;
                }
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: l4 */
    private boolean m148550l4() {
        return ((x350) m206027E2()).m149816m().m137800g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m4 */
    public /* synthetic */ void m148551m4(soj0 soj0Var) {
        m148559H4();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n4 */
    public /* synthetic */ void m148552n4(soj0 soj0Var) {
        m148565j4();
    }

    /* JADX INFO: renamed from: A4 */
    public final /* synthetic */ void m148553A4(Throwable th) {
        this.f188513f.m66873d2();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: B4 */
    public final /* synthetic */ void m148554B4(boolean z, BLive bLive) {
        ((x350) m206027E2()).mo149811g(bLive);
        ((x350) m206027E2()).mo149812h(pau.f148011b);
        oxl oxlVar = (oxl) m129297F3(new rv00(2600));
        if (oxlVar != null) {
            oxlVar.mo133472b();
        }
        this.f126086j = 2;
        if (z) {
            m148548i4(2, m206029H2().lifecycle_());
        }
    }

    /* JADX INFO: renamed from: C4 */
    public final /* synthetic */ void m148555C4(Throwable th) {
        this.f126086j = -2;
    }

    /* JADX INFO: renamed from: E4 */
    public void m148556E4(Throwable th, boolean z) {
        String string;
        if (th instanceof TantanException.Client.CoreService) {
            TantanException.Client.CoreService coreService = (TantanException.Client.CoreService) th;
            int i = coreService.code;
            final d30 d30Var = null;
            if (i == 41008 || i == 41020) {
                string = coreService.metaMessage;
            } else if (i == 41000 || i == 41002) {
                string = act().getString(R$string.f47230f6);
                if (m148550l4()) {
                    d30Var = new d30() { // from class: l.w450
                        @Override // p149l.d30
                        public final void call() {
                            this.f184474a.m148569r4();
                        }
                    };
                }
            } else {
                if (i == 41010) {
                    m148526L4();
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
                    d30Var = new d30() { // from class: l.x450
                        @Override // p149l.d30
                        public final void call() {
                            this.f190941a.m148570s4();
                        }
                    };
                } else {
                    string = "";
                }
            }
            if (!TextUtils.isEmpty(string)) {
                act().dialog().m20504F(string).m20496B(false).m20560v0(act().getString(R$string.f47423o2), new Runnable() { // from class: l.z450
                    @Override // java.lang.Runnable
                    public final void run() {
                        l550.m148533T3(d30Var);
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
    /* JADX INFO: renamed from: F4 */
    public void m148557F4() {
        if (((x350) m206027E2()).m149816m().m137796c() || this.f126085i) {
            return;
        }
        this.f126085i = true;
        m206028F2().MomoSdkEvent.sdkActionEvent().mo172463j(2);
        boolean zM148550l4 = m148550l4();
        gkh0.m126627j(u0t.f172943b, "onResume:" + this.f126086j + ":" + zM148550l4);
        int i = this.f126086j;
        if (i == -2 || i == 2 || zM148550l4) {
            this.f126086j = 3;
            m148561N4(true, ((x350) m206027E2()).m149814k(), "manual");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: G4 */
    public void m148558G4() {
        this.f126085i = false;
        if (!act().isFinishing()) {
            m206028F2().MomoSdkEvent.sdkActionEvent().mo172463j(1);
        }
        if (((x350) m206027E2()).m149816m().m137797d()) {
            int i = this.f126086j;
            if (i == 4 || i == -3) {
                m148564Q4(true);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: H4 */
    public void m148559H4() {
        if (((x350) m206027E2()).m149816m().m137796c()) {
            return;
        }
        this.f126086j = 3;
        m148561N4(true, ((x350) m206027E2()).m149814k(), "manual");
    }

    /* JADX INFO: renamed from: M4 */
    public void m148560M4(String str, String str2) {
        new xh0.C21150a(this.f188513f).m208731j(str).m208739r(str2).m208736o(new View.OnClickListener() { // from class: l.p450
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f147035a.m148574w4(view);
            }
        }).m208737p(h1c0.f105357d).m208727f(act().getString(R$string.f47662z)).m208722a().m208721g();
    }

    /* JADX INFO: renamed from: N4 */
    public void m148561N4(final boolean z, String str, final String str2) {
        C22306c<BLive> c22306cM71276L6 = LivingNormalApiProvider.m71276L6(str, str2);
        h5j0.INSTANCE.m129404c("create_live_room", "createLive");
        duringCreated((C22306c) c22306cM71276L6.flatMap(new w9j() { // from class: l.q450
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f152544a.m148524K4((BLive) obj);
            }
        })).subscribe(ffw.m121194e(new e30() { // from class: l.r450
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f157636a.m148576y4(str2, (j760) obj);
            }
        }, new e30() { // from class: l.s450
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f162267a.m148575x4(z, (Throwable) obj);
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: O4, reason: merged with bridge method [inline-methods] */
    public final void m148576y4(String str, j760<User, BLive> j760Var) {
        this.f126086j = 4;
        m148548i4(4, m206029H2().lifecycle_());
        BLive bLive = j760Var.f116565b;
        User user = j760Var.f116564a;
        ((x350) m206027E2()).mo149811g(bLive);
        h5j0.INSTANCE.m129402a("create_live_room", "startLiveSuccess");
        ((x350) m206027E2()).mo149812h(i0t.f110377c);
    }

    /* JADX INFO: renamed from: P4 */
    public final void m148563P4(String str) {
        duringCreated(LivingNormalApiProvider.m71258J6(str)).subscribe(ffw.m121194e(new e30() { // from class: l.t450
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f167688a.m148577z4((BLiveEnvelope) obj);
            }
        }, new e30() { // from class: l.u450
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f173693a.m148553A4((Throwable) obj);
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: Q4 */
    public void m148564Q4(final boolean z) {
        if (((x350) m206027E2()).m149816m().m137796c()) {
            return;
        }
        this.f126086j = 1;
        LivingNormalApiProvider.m71277L7(((x350) m206027E2()).m149814k(), false).subscribe(ffw.m121194e(new e30() { // from class: l.h550
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f105926a.m148554B4(z, (BLive) obj);
            }
        }, new e30() { // from class: l.i550
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f111527a.m148555C4((Throwable) obj);
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: T */
    public void mo70198T() {
        super.mo70198T();
        duringCreated(m206028F2().LivePusherEvent.recoverLive().m172460g()).subscribe(ffw.m121193d(new e30() { // from class: l.n450
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f137039a.m148551m4((soj0) obj);
            }
        }));
        duringCreated(m206028F2().LivePusherEvent.suspendLive().m172460g()).subscribe(ffw.m121193d(new e30() { // from class: l.y450
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f195897a.m148564Q4(((Boolean) obj).booleanValue());
            }
        }));
        duringCreated(m206028F2().LivePusherEvent.closeLive().m172460g()).subscribe(ffw.m121193d(new e30() { // from class: l.d550
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f84375a.m148552n4((soj0) obj);
            }
        }));
        m206029H2().lifecycle().subscribe(ffw.m121193d(new e30() { // from class: l.e550
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f89348a.m148566o4((C4319c) obj);
            }
        }));
        duringCreated(((x350) m206027E2()).m149815l()).subscribe(ffw.m121193d(new e30() { // from class: l.f550
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f94961a.m148567p4((iqv) obj);
            }
        }));
        this.f126087k = ((x350) m206027E2()).m132156o1(this.f188513f).subscribe(ffw.m121193d(new e30() { // from class: l.g550
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f100623a.m148549k4((LiveControlMessage) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: j4 */
    public void m148565j4() {
        m148560M4("是否结束公演", act().getString(R$string.f47135b));
    }

    @Override // p149l.h4t, p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: n */
    public void mo69117n() {
        super.mo69117n();
        mkd0.m154992z(this.f126087k);
    }

    /* JADX INFO: renamed from: o4 */
    public final /* synthetic */ void m148566o4(C4319c c4319c) {
        if (c4319c == C4319c.f15548i) {
            m148557F4();
        } else if (c4319c == C4319c.f15550k) {
            m148558G4();
        }
    }

    /* JADX INFO: renamed from: p4 */
    public final /* synthetic */ void m148567p4(iqv iqvVar) {
        if (iqvVar.m137794a() == 4) {
            m148519D4((u7s) iqvVar);
        }
    }

    /* JADX INFO: renamed from: q4 */
    public final /* synthetic */ void m148568q4(BLive bLive) {
        m148547h4(true, act().getString(R$string.f46930R5), false);
    }

    /* JADX INFO: renamed from: r4 */
    public final /* synthetic */ void m148569r4() {
        m148547h4(false, null, true);
    }

    /* JADX INFO: renamed from: s4 */
    public final /* synthetic */ void m148570s4() {
        act().m66873d2();
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        ubu ubuVar = new ubu();
        ubuVar.f175753a = 0;
        ubuVar.f175756d = "已开启公演准备好才艺吧";
        ubuVar.f175757e = "知道了";
        m206028F2().LiveTipEvent.showTip().mo172463j(ubuVar);
    }

    /* JADX INFO: renamed from: t4 */
    public final /* synthetic */ void m148571t4() {
        act().m66873d2();
    }

    /* JADX INFO: renamed from: u4 */
    public final /* synthetic */ void m148572u4(BLiveAnchor bLiveAnchor) {
        if (TEnum.equals(bLiveAnchor.status, "jailed")) {
            act().dialog().m20504F(act().getString(R$string.f47213eb, mqi0.m155945p(bLiveAnchor.availableTime))).m20496B(false).m20560v0(act().getString(R$string.f47423o2), new Runnable() { // from class: l.c550
                @Override // java.lang.Runnable
                public final void run() {
                    this.f79338a.m148571t4();
                }
            }).m20568z0();
        }
    }

    /* JADX INFO: renamed from: v4 */
    public final /* synthetic */ void m148573v4(Throwable th) {
        m148556E4(th, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: w4 */
    public final /* synthetic */ void m148574w4(View view) {
        BLiveOfficialShowCurrentAnchorInfo bLiveOfficialShowCurrentAnchorInfoM206897S2 = ((x350) m206027E2()).m206897S2();
        if (bLiveOfficialShowCurrentAnchorInfoM206897S2 != null) {
            m148563P4(bLiveOfficialShowCurrentAnchorInfoM206897S2.programId);
        } else {
            this.f188513f.m66873d2();
        }
    }

    /* JADX INFO: renamed from: x4 */
    public final /* synthetic */ void m148575x4(boolean z, Throwable th) {
        this.f126086j = -3;
        m148556E4(th, true);
        m148520I4(th, z);
    }

    /* JADX INFO: renamed from: z4 */
    public final /* synthetic */ void m148577z4(BLiveEnvelope bLiveEnvelope) {
        m206028F2().OfficialShowEvent.switchOffAnchor().m172467p();
    }
}
