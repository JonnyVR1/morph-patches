package p153l;

import android.content.DialogInterface;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.Dialog;
import com.p051p1.mobile.putong.api.api.TantanException;
import com.p051p1.mobile.putong.core.data.GameIdentity;
import com.p051p1.mobile.putong.data.Owner;
import com.p051p1.mobile.putong.data.RelationshipStatus;
import com.p051p1.mobile.putong.data.Settings;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.UserSource;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p051p1.mobile.putong.live.base.data.BLiveVoice;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceCall;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.voice.call.api.VCallApiProvider;
import com.p051p1.mobile.putong.p070ui.permission.PermissionHelper;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes5.dex */
public class hqk0 extends qct<rwn0> {

    /* JADX INFO: renamed from: i */
    public int f111139i;

    /* JADX INFO: renamed from: j */
    public BLiveVoiceCall f111140j;

    /* JADX INFO: renamed from: k */
    public String f111141k;

    /* JADX INFO: renamed from: l */
    public boolean f111142l;

    /* JADX INFO: renamed from: m */
    public int f111143m;

    /* JADX INFO: renamed from: n */
    public String f111144n;

    /* JADX INFO: renamed from: o */
    public bzm0 f111145o;

    /* JADX INFO: renamed from: p */
    public Dialog f111146p;

    /* JADX INFO: renamed from: q */
    public final Runnable f111147q;

    /* JADX INFO: renamed from: r */
    public final Runnable f111148r;

    public hqk0(dum dumVar) {
        super(dumVar);
        this.f111139i = 1;
        this.f111141k = "";
        this.f111142l = false;
        this.f111143m = 0;
        this.f111144n = "apply";
        this.f111147q = new Runnable() { // from class: l.npk0
            @Override // java.lang.Runnable
            public final void run() {
                this.f143107a.m136676t4();
            }
        };
        this.f111148r = new Runnable() { // from class: l.ypk0
            @Override // java.lang.Runnable
            public final void run() {
                this.f201071a.m136667j4();
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: D4 */
    public void m136632D4(gvn0 gvn0Var) {
        if (!gvn0Var.m132570k(0)) {
            if (gvn0Var.m132570k(1)) {
                ydn0.m215264q(this, gvn0Var.m132564e());
                return;
            }
            return;
        }
        this.f111141k = gvn0Var.m132567h();
        Dialog dialog = this.f111146p;
        if (dialog != null && dialog.isShowing()) {
            this.f111146p.dismiss();
        }
        if (y6s.m214494b(((rwn0) m213810E2()).mo183435j().liveMode)) {
            m136659G4(gvn0Var);
        } else {
            m136660H4(gvn0Var);
        }
    }

    /* JADX INFO: renamed from: Y3 */
    public static /* synthetic */ void m136647Y3(Runnable runnable) {
        if (runnable != null) {
            runnable.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m4 */
    public void m136653m4(BLiveVoiceCall bLiveVoiceCall) {
        int i;
        this.f111140j = bLiveVoiceCall;
        if (guk0.m132329h(bLiveVoiceCall)) {
            i = 6;
        } else if (guk0.m132327f(bLiveVoiceCall)) {
            this.f111141k = "";
            i = 1;
        } else if (guk0.m132334m(bLiveVoiceCall)) {
            i = 2;
        } else {
            i = guk0.m132333l(bLiveVoiceCall) ? 3 : 0;
        }
        if (this.f111139i != i) {
            m136657E4(i);
        }
    }

    /* JADX INFO: renamed from: B4 */
    public final /* synthetic */ void m136655B4(bzm0 bzm0Var) {
        m136662e4(bzm0Var, null, this.f111148r);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: C4, reason: merged with bridge method [inline-methods] */
    public final void m136681y4() {
        v1n0.m199023a(((rwn0) m213810E2()).m168532l0().f56859id, ((rwn0) m213810E2()).m202191k());
        m136666i4("invite", this.f111147q, new Runnable() { // from class: l.xpk0
            @Override // java.lang.Runnable
            public final void run() {
                this.f195715a.m136677u4();
            }
        });
    }

    /* JADX INFO: renamed from: E4 */
    public void m136657E4(int i) {
        nsh0.m164608j("[voice][call]", "setStatus: " + m136669l4(i));
        this.f111139i = i;
    }

    /* JADX INFO: renamed from: F4 */
    public final void m136658F4(final Act act) {
        act.dialog().m21555t0(R$string.f47559H0, new Runnable() { // from class: l.ppk0
            @Override // java.lang.Runnable
            public final void run() {
                this.f153566a.m136678v4(act);
            }
        }).m21499D(R$string.f47869Vc).m21540k0(R$string.f47961a).m21495B(false).m21567z0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: G4 */
    public final void m136659G4(gvn0 gvn0Var) {
        String strM209910t = xau.m209910t(R$string.f48196kf);
        if (y6s.m214495c(((rwn0) m213810E2()).mo183435j().liveMode)) {
            strM209910t = "主持邀请你上麦参与挑战";
        }
        String strM209910t2 = xau.m209910t(R$string.f48109gf);
        if (y6s.m214495c(((rwn0) m213810E2()).mo183435j().liveMode)) {
            strM209910t2 = "暂不参与";
        }
        String strM209910t3 = xau.m209910t(R$string.f48087ff);
        if (y6s.m214495c(((rwn0) m213810E2()).mo183435j().liveMode)) {
            strM209910t3 = "接受";
        }
        new th0.C20312a(act()).m191151j(strM209910t).m191159r(strM209910t3).m191156o(new View.OnClickListener() { // from class: l.eqk0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f95348a.m136680x4(view);
            }
        }).m191147f(strM209910t2).m191149h(false).m191144c(new View.OnClickListener() { // from class: l.fqk0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f100309a.m136679w4(view);
            }
        }).m191142a().m191141g();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: H4 */
    public final void m136660H4(gvn0 gvn0Var) {
        Dialog dialogM21566z = act().dialog().m21503F(gvn0Var.m132571l() ? xau.m209912v(R$string.f47769Qh, this.f196919f.getString(R$string.f48232m7), gvn0Var.m132568i()) : xau.m209911u(R$string.f47576Hh, ((rwn0) m213810E2()).m168532l0().name)).m21555t0(R$string.f48372sf, new Runnable() { // from class: l.gqk0
            @Override // java.lang.Runnable
            public final void run() {
                this.f105688a.m136681y4();
            }
        }).m21538i0(new DialogInterface.OnKeyListener() { // from class: l.opk0
            @Override // android.content.DialogInterface.OnKeyListener
            public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
                return this.f148467a.m136682z4(dialogInterface, i, keyEvent);
            }
        }).m21541l0(R$string.f48461wg, this.f111147q).m21566z();
        this.f111146p = dialogM21566z;
        dialogM21566z.setCanceledOnTouchOutside(false);
        this.f111146p.show();
    }

    /* JADX INFO: renamed from: I4 */
    public void m136661I4(final Runnable runnable, final Runnable runnable2) {
        nsh0.m164608j("[voice][call]", "start apply");
        wgt.m206250q(this.f196919f, iit.INSTANCE.m140133S(), R$string.f48113gj, new x20() { // from class: l.dqk0
            @Override // p153l.x20
            public final void call() {
                this.f90258a.m136654A4(runnable, runnable2);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: e4 */
    public final void m136662e4(bzm0 bzm0Var, Runnable runnable, Runnable runnable2) {
        this.f111145o = bzm0Var;
        if (this.f111139i == 1 || !"invite".equals(bzm0Var.f79154h)) {
            this.f111143m = bzm0Var.f79149c;
            this.f111144n = bzm0Var.f79154h;
            m136661I4(runnable, runnable2);
        } else if (this.f111139i == 6) {
            BLiveVoiceCall bLiveVoiceCallM136873l = ((rwn0) m213810E2()).m183411P2().m136873l(zrv.f205799a.m207631D0());
            if (guk0.m132329h(bLiveVoiceCallM136873l)) {
                ydn0.m215258k(this, bLiveVoiceCallM136873l.anchor, bLiveVoiceCallM136873l.user);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: f4 */
    public final void m136663f4() {
        if (((rwn0) m213810E2()).mo183435j() == null || TextUtils.isEmpty(((rwn0) m213810E2()).m202191k())) {
            return;
        }
        final BLiveVoiceCall bLiveVoiceCallNewInstance = BLiveVoiceCall.newInstance(((rwn0) m213810E2()).m202191k(), this.f111141k, this.f111144n, this.f111143m, ((rwn0) m213810E2()).mo118373p() ? Owner.TYPE : GameIdentity.player);
        bLiveVoiceCallNewInstance.isHost = this.f111145o.f79155i;
        if (((rwn0) m213810E2()).m202195r()) {
            duringCreated(VCallApiProvider.applyCallInvite(bLiveVoiceCallNewInstance)).subscribe(dhw.m115826e(new y20() { // from class: l.rpk0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f164376a.m136664g4((BLiveVoiceCall) obj);
                }
            }, new y20() { // from class: l.spk0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f170058a.m136672p4((Throwable) obj);
                }
            }));
        } else {
            duringCreated((C22421c) itv.m142117t(((rwn0) m213810E2()).m202194o(), false, ((rwn0) m213810E2()).mo168468O0(), ((rwn0) m213810E2()).mo183435j().liveMode, "", "").flatMap(new qcj() { // from class: l.tpk0
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return this.f175611a.m136673q4(bLiveVoiceCallNewInstance, (BLiveVoice) obj);
                }
            })).subscribe(dhw.m115826e(new y20() { // from class: l.rpk0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f164376a.m136664g4((BLiveVoiceCall) obj);
                }
            }, new y20() { // from class: l.upk0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f180282a.m136674r4((Throwable) obj);
                }
            }));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: g4 */
    public final void m136664g4(BLiveVoiceCall bLiveVoiceCall) {
        int i = this.f111145o.f79150d;
        if (i == 21000) {
            m213811F2().VoiceChatEvent.dismissInviteSpanEvent().mo199273j(bLiveVoiceCall.inviteId);
        } else if (i == 21100) {
            m213811F2().VoiceVirtualLiveEvent.refreshHeatTasks().mo199273j(Boolean.TRUE);
        }
        this.f111140j = bLiveVoiceCall;
        this.f111141k = "";
        this.f111143m = 1;
        x20 x20Var = this.f111145o.f79156j;
        if (x20Var != null) {
            x20Var.call();
        }
        if (this.f111142l) {
            this.f111142l = false;
        } else if (!"invite".equals(this.f111144n) && !guk0.m132333l(bLiveVoiceCall)) {
            if (y6s.m214494b(((rwn0) m213810E2()).mo183435j().liveMode)) {
                o1j0.m165649w(R$string.f48284of);
            } else {
                o1j0.m165649w(R$string.f48156ij);
            }
        }
        ydn0.m215264q(this, bLiveVoiceCall);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: h4 */
    public final void m136665h4(BLiveVoice bLiveVoice) {
        if ((m213810E2() instanceof jqm0) && ((jqm0) m213810E2()).m146607a4() && bLiveVoice.callInfo.onVoiceCalls.size() < 6) {
            this.f111142l = true;
            m136666i4("apply", null, this.f111148r);
        }
    }

    /* JADX INFO: renamed from: i4 */
    public final void m136666i4(String str, Runnable runnable, Runnable runnable2) {
        m136662e4(new bzm0().m107183d(str), runnable, runnable2);
    }

    /* JADX INFO: renamed from: j4 */
    public final void m136667j4() {
        nsh0.m164608j("[voice][call]", "checkAndBindPhone");
        if (m136671o4()) {
            m136658F4(this.f196919f);
        } else {
            m136663f4();
        }
    }

    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public final void m136654A4(Runnable runnable, final Runnable runnable2) {
        nsh0.m164608j("CallConstant", "checkAndRequestPermission");
        PermissionHelper.m81065c().m81083r("android.permission.RECORD_AUDIO").m81088w(false).m81086u(true).m81075j(true).m81085t(new C17541c(runnable)).m81087v(new C17540b(runnable)).m81081p(new C17539a(runnable)).m81080o(new x20() { // from class: l.wpk0
            @Override // p153l.x20
            public final void call() {
                hqk0.m136647Y3(runnable2);
            }
        }).m81074i(this.f196919f);
    }

    /* JADX INFO: renamed from: l4 */
    public final String m136669l4(int i) {
        if (i == 1) {
            return RelationshipStatus.DEFAULT;
        }
        if (i == 2) {
            return "APPLY_HAS_SEND";
        }
        if (i == 3) {
            return "CALL_CONNECTING";
        }
        if (i == 4) {
            return "APPLY_FAIL";
        }
        if (i == 5) {
            return "DOWNLOADING";
        }
        return i == 6 ? "SUCCESS" : "NULL";
    }

    /* JADX INFO: renamed from: n4 */
    public final boolean m136670n4(Throwable th) {
        TantanException.Client.CoreService coreService = (TantanException.Client.CoreService) th;
        if (coreService.code != 43022 || TextUtils.isEmpty(coreService.metaMessage)) {
            return false;
        }
        this.f196919f.dialog().m21503F(coreService.metaMessage).m21495B(false).m21542m0(zrv.f205803e.getString(R$string.f48271o2)).m21567z0();
        return true;
    }

    /* JADX INFO: renamed from: o4 */
    public final boolean m136671o4() {
        Settings settings;
        User userMe_ = uqb0.f180396b0.f170325b.me_();
        if (userMe_ == null || (settings = userMe_.settings) == null) {
            return true;
        }
        if (TextUtils.isEmpty(settings.linkedPhoneNumber.number) && TextUtils.isEmpty(userMe_.settings.phoneNumber.number)) {
            return TEnum.equals(userMe_.source, "wechat") || TEnum.equals(userMe_.source, "qq") || TEnum.equals(userMe_.source, UserSource.network_security);
        }
        return false;
    }

    /* JADX INFO: renamed from: p4 */
    public final /* synthetic */ void m136672p4(Throwable th) {
        this.f111141k = "";
        if (!(th instanceof TantanException.Client.CoreService) || m136670n4(th)) {
            return;
        }
        yvr.m217557c(th);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: q4 */
    public final /* synthetic */ C22421c m136673q4(BLiveVoiceCall bLiveVoiceCall, BLiveVoice bLiveVoice) {
        ((rwn0) m213810E2()).mo183431g(bLiveVoice);
        bLiveVoiceCall.voiceLiveId = bLiveVoice.f45171id;
        return VCallApiProvider.applyCallInvite(bLiveVoiceCall);
    }

    /* JADX INFO: renamed from: r4 */
    public final /* synthetic */ void m136674r4(Throwable th) {
        this.f111141k = "";
        if (!(th instanceof TantanException.Client.CoreService) || m136670n4(th)) {
            return;
        }
        yvr.m217557c(th);
    }

    /* JADX INFO: renamed from: s4 */
    public final /* synthetic */ void m136675s4(BLiveEnvelope bLiveEnvelope) {
        this.f111141k = "";
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        duringCreated(m213811F2().VoiceCallEvent.callApplyEvent().m199270g()).subscribe(dhw.m115825d(new y20() { // from class: l.zpk0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f205477a.m136655B4((bzm0) obj);
            }
        }));
        duringCreated(((rwn0) m213810E2()).m183424Z2()).subscribe(dhw.m115825d(new y20() { // from class: l.aqk0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f72820a.m136653m4((BLiveVoiceCall) obj);
            }
        }));
        duringCreated(((rwn0) m213810E2()).m168545q1().m98337x0()).subscribe(new y20() { // from class: l.bqk0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f77905a.m136632D4((gvn0) obj);
            }
        });
        duringCreated(((rwn0) m213810E2()).m183409O2().m188658d()).take(1).subscribe(dhw.m115825d(new y20() { // from class: l.cqk0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f83101a.m136665h4((BLiveVoice) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: t4 */
    public final /* synthetic */ void m136676t4() {
        duringCreated(itv.m142089M(this.f111141k)).subscribe(dhw.m115829h(new y20() { // from class: l.qpk0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f158877a.m136675s4((BLiveEnvelope) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: u4 */
    public final /* synthetic */ void m136677u4() {
        o1j0.m165651y(xau.m209910t(R$string.f48262nf));
        this.f111148r.run();
    }

    /* JADX INFO: renamed from: v4 */
    public final /* synthetic */ void m136678v4(Act act) {
        uqb0.f180396b0.f170325b.showBindPhoneDialog(act, new x20() { // from class: l.vpk0
            @Override // p153l.x20
            public final void call() {
                this.f185268a.m136663f4();
            }
        });
    }

    /* JADX INFO: renamed from: w4 */
    public final /* synthetic */ void m136679w4(View view) {
        this.f111147q.run();
    }

    /* JADX INFO: renamed from: x4 */
    public final /* synthetic */ void m136680x4(View view) {
        m136681y4();
    }

    /* JADX INFO: renamed from: z4 */
    public final /* synthetic */ boolean m136682z4(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        if (i != 4) {
            return false;
        }
        this.f111147q.run();
        return false;
    }

    /* JADX INFO: renamed from: l.hqk0$a */
    public class C17539a implements j6e {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Runnable f111149a;

        public C17539a(Runnable runnable) {
            this.f111149a = runnable;
        }

        @Override // p153l.j6e
        /* JADX INFO: renamed from: b */
        public void mo38397b(boolean z) {
            Runnable runnable = this.f111149a;
            if (runnable != null) {
                runnable.run();
            }
        }

        @Override // p153l.j6e
        /* JADX INFO: renamed from: a */
        public void mo38396a() {
        }

        @Override // p153l.j6e
        /* JADX INFO: renamed from: c */
        public void mo38398c() {
        }
    }

    /* JADX INFO: renamed from: l.hqk0$b */
    public class C17540b implements l6e {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Runnable f111151a;

        public C17540b(Runnable runnable) {
            this.f111151a = runnable;
        }

        @Override // p153l.l6e
        /* JADX INFO: renamed from: b */
        public void mo38405b() {
            Runnable runnable = this.f111151a;
            if (runnable != null) {
                runnable.run();
            }
        }

        @Override // p153l.l6e
        /* JADX INFO: renamed from: a */
        public void mo38404a() {
        }

        @Override // p153l.l6e
        /* JADX INFO: renamed from: c */
        public void mo38406c() {
        }
    }

    /* JADX INFO: renamed from: l.hqk0$c */
    public class C17541c implements k6e {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Runnable f111153a;

        public C17541c(Runnable runnable) {
            this.f111153a = runnable;
        }

        @Override // p153l.k6e
        /* JADX INFO: renamed from: b */
        public void mo38394b() {
            Runnable runnable = this.f111153a;
            if (runnable != null) {
                runnable.run();
            }
        }

        @Override // p153l.k6e
        /* JADX INFO: renamed from: a */
        public void mo38393a() {
        }

        @Override // p153l.k6e
        /* JADX INFO: renamed from: c */
        public void mo38395c() {
        }
    }
}
