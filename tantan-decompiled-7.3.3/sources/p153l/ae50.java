package p153l;

import android.text.TextUtils;
import android.view.View;
import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.android.app.Dialog;
import com.p051p1.mobile.putong.api.api.TantanException;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.live.base.data.BLive;
import com.p051p1.mobile.putong.live.base.data.BLiveAnchor;
import com.p051p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p051p1.mobile.putong.live.base.data.BLiveOfficialShowCurrentAnchorInfo;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.p051p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveControlMessage;
import java.util.Objects;
import p137rx.C22421c;
import p137rx.Notification;

/* JADX INFO: loaded from: classes5.dex */
public class ae50 extends qct<mc50> {

    /* JADX INFO: renamed from: i */
    public boolean f70766i;

    /* JADX INFO: renamed from: j */
    public int f70767j;

    /* JADX INFO: renamed from: k */
    public kcg0 f70768k;

    public ae50(dum dumVar) {
        super(dumVar);
        this.f70767j = 4;
    }

    /* JADX INFO: renamed from: D4 */
    private void m97175D4(v9s v9sVar) {
        if (this.f70767j == 5) {
            return;
        }
        this.f70767j = 5;
    }

    /* JADX INFO: renamed from: I4 */
    private void m97176I4(Throwable th, boolean z) {
        if (z && yvr.m217556b(41000, th)) {
            m213811F2().LivePusherEvent.notifyRecoverLiveStopped().m199277p();
        }
    }

    /* JADX INFO: renamed from: J4 */
    private void m97178J4(String str, String str2, int i, x20 x20Var) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        Dialog.C4460e c4460eM21495B = act().dialog().m21503F(str).m21495B(false);
        Objects.requireNonNull(x20Var);
        c4460eM21495B.m21543n0(str2, new bri0(x20Var)).m21567z0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K4 */
    public C22421c<pf60<User, BLive>> m97180K4(final BLive bLive) {
        return LivingNormalApiProvider.m72757s7(zrv.f205799a.m207631D0(), bLive.f45171id).materialize().take(1).flatMap(new qcj() { // from class: l.kd50
            @Override // p153l.qcj
            public final Object call(Object obj) {
                Notification notification = (Notification) obj;
                return C22421c.just(jyb.m147494Y(notification.m222545j() ? zrv.f205799a.m207651V() : (User) notification.m222541f(), bLive));
            }
        });
    }

    /* JADX INFO: renamed from: L4 */
    private void m97182L4() {
        duringCreated(LivingNormalApiProvider.m72772u4(zrv.f205799a.m207631D0())).subscribe(dhw.m115826e(new y20() { // from class: l.pd50
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f151714a.m97228u4((BLiveAnchor) obj);
            }
        }, new y20() { // from class: l.qd50
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f156659a.m97229v4((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: T3 */
    public static /* synthetic */ void m97189T3(x20 x20Var) {
        if (x20Var != null) {
            x20Var.call();
        }
    }

    /* JADX INFO: renamed from: W3 */
    public static /* synthetic */ void m97192W3(Throwable th) {
    }

    /* JADX INFO: renamed from: b4 */
    public static /* synthetic */ void m97197b4() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: h4 */
    private void m97203h4(boolean z, String str, boolean z2) {
        if (!z) {
            if (((mc50) m213810E2()).m202193m().m146877c()) {
                return;
            }
            ((mc50) m213810E2()).mo160116h(v9s.f183031e);
        } else {
            h0m h0mVar = (h0m) m138856F3(new z310(2600));
            if (h0mVar != null) {
                h0mVar.mo133183b();
            }
            if (((mc50) m213810E2()).m202193m().m146877c()) {
                return;
            }
            ((mc50) m213810E2()).mo160116h(new v9s(str, z2));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: i4 */
    private void m97204i4(int i, C4470c c4470c) {
        if (c4470c == C4470c.f16267i && i == 2) {
            m97217N4(true, ((mc50) m213810E2()).m202191k(), "manual");
        } else if (c4470c == C4470c.f16269k && i == 4) {
            m97220Q4(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3, types: [l.oo2] */
    /* JADX INFO: renamed from: k4 */
    public void m97205k4(LiveControlMessage liveControlMessage) {
        String str = liveControlMessage.type;
        str.getClass();
        switch (str) {
            case "add_manager":
            case "delete_manager":
                ((mc50) m213810E2()).mo118370K1(((mc50) m213810E2()).m202194o());
                break;
            case "system":
                m97178J4(liveControlMessage.content, act().getString(R$string.f48494y5), liveControlMessage.templateId, new x20() { // from class: l.yd50
                    @Override // p153l.x20
                    public final void call() {
                        ae50.m97197b4();
                    }
                });
                break;
            case "re_request_room_gift_list":
                muj.m160221w(false);
                if (m213810E2() != 0 && ((mc50) m213810E2()).m157913S2() != null) {
                    ((mc50) m213810E2()).m168445A1(new uxj.C20693a(((mc50) m213810E2()).m202194o(), mc50.m157912R2(m213810E2(), ((mc50) m213810E2()).m168526j0()), "live").m198494f(), null);
                    break;
                }
                break;
            case "stop":
                m97203h4(true, act().getString(R$string.f48078f6), true);
                break;
            case "force_stop":
                m97203h4(true, liveControlMessage.content, true);
                break;
            case "forbidden_multidevice":
                if (!liveControlMessage.isAnchor) {
                    duringCreated(LivingNormalApiProvider.m72460L7(((mc50) m213810E2()).m202191k(), false)).subscribe(dhw.m115826e(new y20() { // from class: l.zd50
                        @Override // p153l.y20
                        public final void call(Object obj) {
                            this.f203859a.m97224q4((BLive) obj);
                        }
                    }, new y20() { // from class: l.dd50
                        @Override // p153l.y20
                        public final void call(Object obj) {
                            ae50.m97192W3((Throwable) obj);
                        }
                    }));
                    break;
                } else {
                    m97203h4(true, act().getString(R$string.f47820T5), false);
                    break;
                }
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: l4 */
    private boolean m97206l4() {
        return ((mc50) m213810E2()).m202193m().m146881g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m4 */
    public /* synthetic */ void m97207m4(vxj0 vxj0Var) {
        m97215H4();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n4 */
    public /* synthetic */ void m97208n4(vxj0 vxj0Var) {
        m97221j4();
    }

    /* JADX INFO: renamed from: A4 */
    public final /* synthetic */ void m97209A4(Throwable th) {
        this.f196919f.m68056e2();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: B4 */
    public final /* synthetic */ void m97210B4(boolean z, BLive bLive) {
        ((mc50) m213810E2()).mo183431g(bLive);
        ((mc50) m213810E2()).mo160116h(qcu.f156623b);
        h0m h0mVar = (h0m) m138856F3(new z310(2600));
        if (h0mVar != null) {
            h0mVar.mo133183b();
        }
        this.f70767j = 2;
        if (z) {
            m97204i4(2, m213812H2().lifecycle_());
        }
    }

    /* JADX INFO: renamed from: C4 */
    public final /* synthetic */ void m97211C4(Throwable th) {
        this.f70767j = -2;
    }

    /* JADX INFO: renamed from: E4 */
    public void m97212E4(Throwable th, boolean z) {
        String string;
        if (th instanceof TantanException.Client.CoreService) {
            TantanException.Client.CoreService coreService = (TantanException.Client.CoreService) th;
            int i = coreService.code;
            final x20 x20Var = null;
            if (i == 41008 || i == 41020) {
                string = coreService.metaMessage;
            } else if (i == 41000 || i == 41002) {
                string = act().getString(R$string.f48078f6);
                if (m97206l4()) {
                    x20Var = new x20() { // from class: l.ld50
                        @Override // p153l.x20
                        public final void call() {
                            this.f131415a.m97225r4();
                        }
                    };
                }
            } else {
                if (i == 41010) {
                    m97182L4();
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
                    x20Var = new x20() { // from class: l.md50
                        @Override // p153l.x20
                        public final void call() {
                            this.f135866a.m97226s4();
                        }
                    };
                } else {
                    string = "";
                }
            }
            if (!TextUtils.isEmpty(string)) {
                act().dialog().m21503F(string).m21495B(false).m21559v0(act().getString(R$string.f48271o2), new Runnable() { // from class: l.od50
                    @Override // java.lang.Runnable
                    public final void run() {
                        ae50.m97189T3(x20Var);
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
    /* JADX INFO: renamed from: F4 */
    public void m97213F4() {
        if (((mc50) m213810E2()).m202193m().m146877c() || this.f70766i) {
            return;
        }
        this.f70766i = true;
        m213811F2().MomoSdkEvent.sdkActionEvent().mo199273j(2);
        boolean zM97206l4 = m97206l4();
        nsh0.m164608j(v2t.f182112b, "onResume:" + this.f70767j + ":" + zM97206l4);
        int i = this.f70767j;
        if (i == -2 || i == 2 || zM97206l4) {
            this.f70767j = 3;
            m97217N4(true, ((mc50) m213810E2()).m202191k(), "manual");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: G4 */
    public void m97214G4() {
        this.f70766i = false;
        if (!act().isFinishing()) {
            m213811F2().MomoSdkEvent.sdkActionEvent().mo199273j(1);
        }
        if (((mc50) m213810E2()).m202193m().m146878d()) {
            int i = this.f70767j;
            if (i == 4 || i == -3) {
                m97220Q4(true);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: H4 */
    public void m97215H4() {
        if (((mc50) m213810E2()).m202193m().m146877c()) {
            return;
        }
        this.f70767j = 3;
        m97217N4(true, ((mc50) m213810E2()).m202191k(), "manual");
    }

    /* JADX INFO: renamed from: M4 */
    public void m97216M4(String str, String str2) {
        new th0.C20312a(this.f196919f).m191151j(str).m191159r(str2).m191156o(new View.OnClickListener() { // from class: l.ed50
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f93140a.m97230w4(view);
            }
        }).m191157p(n9c0.f140818d).m191147f(act().getString(R$string.f48510z)).m191142a().m191141g();
    }

    /* JADX INFO: renamed from: N4 */
    public void m97217N4(final boolean z, String str, final String str2) {
        C22421c<BLive> c22421cM72459L6 = LivingNormalApiProvider.m72459L6(str, str2);
        lej0.INSTANCE.m153909c("create_live_room", "createLive");
        duringCreated((C22421c) c22421cM72459L6.flatMap(new qcj() { // from class: l.fd50
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f98320a.m97180K4((BLive) obj);
            }
        })).subscribe(dhw.m115826e(new y20() { // from class: l.gd50
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f103627a.m97232y4(str2, (pf60) obj);
            }
        }, new y20() { // from class: l.hd50
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f108787a.m97231x4(z, (Throwable) obj);
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: O4, reason: merged with bridge method [inline-methods] */
    public final void m97232y4(String str, pf60<User, BLive> pf60Var) {
        this.f70767j = 4;
        m97204i4(4, m213812H2().lifecycle_());
        BLive bLive = pf60Var.f152157b;
        User user = pf60Var.f152156a;
        ((mc50) m213810E2()).mo183431g(bLive);
        lej0.INSTANCE.m153907a("create_live_room", "startLiveSuccess");
        ((mc50) m213810E2()).mo160116h(j2t.f118089c);
    }

    /* JADX INFO: renamed from: P4 */
    public final void m97219P4(String str) {
        duringCreated(LivingNormalApiProvider.m72441J6(str)).subscribe(dhw.m115826e(new y20() { // from class: l.id50
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f114473a.m97233z4((BLiveEnvelope) obj);
            }
        }, new y20() { // from class: l.jd50
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f120112a.m97209A4((Throwable) obj);
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: Q4 */
    public void m97220Q4(final boolean z) {
        if (((mc50) m213810E2()).m202193m().m146877c()) {
            return;
        }
        this.f70767j = 1;
        LivingNormalApiProvider.m72460L7(((mc50) m213810E2()).m202191k(), false).subscribe(dhw.m115826e(new y20() { // from class: l.wd50
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f188529a.m97210B4(z, (BLive) obj);
            }
        }, new y20() { // from class: l.xd50
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f193513a.m97211C4((Throwable) obj);
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: T */
    public void mo71381T() {
        super.mo71381T();
        duringCreated(m213811F2().LivePusherEvent.recoverLive().m199270g()).subscribe(dhw.m115825d(new y20() { // from class: l.cd50
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f81105a.m97207m4((vxj0) obj);
            }
        }));
        duringCreated(m213811F2().LivePusherEvent.suspendLive().m199270g()).subscribe(dhw.m115825d(new y20() { // from class: l.nd50
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f141451a.m97220Q4(((Boolean) obj).booleanValue());
            }
        }));
        duringCreated(m213811F2().LivePusherEvent.closeLive().m199270g()).subscribe(dhw.m115825d(new y20() { // from class: l.sd50
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f167378a.m97208n4((vxj0) obj);
            }
        }));
        m213812H2().lifecycle().subscribe(dhw.m115825d(new y20() { // from class: l.td50
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f173309a.m97222o4((C4470c) obj);
            }
        }));
        duringCreated(((mc50) m213810E2()).m202192l()).subscribe(dhw.m115825d(new y20() { // from class: l.ud50
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f178506a.m97223p4((jsv) obj);
            }
        }));
        this.f70768k = ((mc50) m213810E2()).m168541o1(this.f196919f).subscribe(dhw.m115825d(new y20() { // from class: l.vd50
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f183540a.m97205k4((LiveControlMessage) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: j4 */
    public void m97221j4() {
        m97216M4("是否结束公演", act().getString(R$string.f47983b));
    }

    @Override // p153l.i6t, p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: n */
    public void mo70300n() {
        super.mo70300n();
        psd0.m173633z(this.f70768k);
    }

    /* JADX INFO: renamed from: o4 */
    public final /* synthetic */ void m97222o4(C4470c c4470c) {
        if (c4470c == C4470c.f16267i) {
            m97213F4();
        } else if (c4470c == C4470c.f16269k) {
            m97214G4();
        }
    }

    /* JADX INFO: renamed from: p4 */
    public final /* synthetic */ void m97223p4(jsv jsvVar) {
        if (jsvVar.m146875a() == 4) {
            m97175D4((v9s) jsvVar);
        }
    }

    /* JADX INFO: renamed from: q4 */
    public final /* synthetic */ void m97224q4(BLive bLive) {
        m97203h4(true, act().getString(R$string.f47778R5), false);
    }

    /* JADX INFO: renamed from: r4 */
    public final /* synthetic */ void m97225r4() {
        m97203h4(false, null, true);
    }

    /* JADX INFO: renamed from: s4 */
    public final /* synthetic */ void m97226s4() {
        act().m68056e2();
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        vdu vduVar = new vdu();
        vduVar.f183659a = 0;
        vduVar.f183662d = "已开启公演准备好才艺吧";
        vduVar.f183663e = "知道了";
        m213811F2().LiveTipEvent.showTip().mo199273j(vduVar);
    }

    /* JADX INFO: renamed from: t4 */
    public final /* synthetic */ void m97227t4() {
        act().m68056e2();
    }

    /* JADX INFO: renamed from: u4 */
    public final /* synthetic */ void m97228u4(BLiveAnchor bLiveAnchor) {
        if (TEnum.equals(bLiveAnchor.status, "jailed")) {
            act().dialog().m21503F(act().getString(R$string.f48061eb, pzi0.m174455p(bLiveAnchor.availableTime))).m21495B(false).m21559v0(act().getString(R$string.f48271o2), new Runnable() { // from class: l.rd50
                @Override // java.lang.Runnable
                public final void run() {
                    this.f162285a.m97227t4();
                }
            }).m21567z0();
        }
    }

    /* JADX INFO: renamed from: v4 */
    public final /* synthetic */ void m97229v4(Throwable th) {
        m97212E4(th, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: w4 */
    public final /* synthetic */ void m97230w4(View view) {
        BLiveOfficialShowCurrentAnchorInfo bLiveOfficialShowCurrentAnchorInfoM157913S2 = ((mc50) m213810E2()).m157913S2();
        if (bLiveOfficialShowCurrentAnchorInfoM157913S2 != null) {
            m97219P4(bLiveOfficialShowCurrentAnchorInfoM157913S2.programId);
        } else {
            this.f196919f.m68056e2();
        }
    }

    /* JADX INFO: renamed from: x4 */
    public final /* synthetic */ void m97231x4(boolean z, Throwable th) {
        this.f70767j = -3;
        m97212E4(th, true);
        m97176I4(th, z);
    }

    /* JADX INFO: renamed from: z4 */
    public final /* synthetic */ void m97233z4(BLiveEnvelope bLiveEnvelope) {
        m213811F2().OfficialShowEvent.switchOffAnchor().m199277p();
    }
}
