package p153l;

import android.content.DialogInterface;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.Dialog;
import com.p051p1.mobile.putong.api.api.TantanException;
import com.p051p1.mobile.putong.core.data.GameIdentity;
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

/* JADX INFO: loaded from: classes5.dex */
public class ark0 extends qct<jqm0> {

    /* JADX INFO: renamed from: i */
    public int f72954i;

    /* JADX INFO: renamed from: j */
    public BLiveVoiceCall f72955j;

    /* JADX INFO: renamed from: k */
    public String f72956k;

    /* JADX INFO: renamed from: l */
    public boolean f72957l;

    /* JADX INFO: renamed from: m */
    public int f72958m;

    /* JADX INFO: renamed from: n */
    public String f72959n;

    /* JADX INFO: renamed from: o */
    public bzm0 f72960o;

    /* JADX INFO: renamed from: p */
    public Dialog f72961p;

    /* JADX INFO: renamed from: q */
    public final Runnable f72962q;

    /* JADX INFO: renamed from: r */
    public final Runnable f72963r;

    public ark0(dum dumVar) {
        super(dumVar);
        this.f72954i = 1;
        this.f72956k = "";
        this.f72957l = false;
        this.f72958m = 0;
        this.f72959n = "apply";
        this.f72962q = new Runnable() { // from class: l.iqk0
            @Override // java.lang.Runnable
            public final void run() {
                this.f116420a.m99739p4();
            }
        };
        this.f72963r = new Runnable() { // from class: l.rqk0
            @Override // java.lang.Runnable
            public final void run() {
                this.f164500a.m99731h4();
            }
        };
    }

    /* JADX INFO: renamed from: B4 */
    private void m99706B4(final Act act) {
        act.dialog().m21555t0(R$string.f47559H0, new Runnable() { // from class: l.lqk0
            @Override // java.lang.Runnable
            public final void run() {
                this.f133227a.m99747r4(act);
            }
        }).m21499D(R$string.f47869Vc).m21540k0(R$string.f47961a).m21495B(false).m21567z0();
    }

    /* JADX INFO: renamed from: C4 */
    private void m99707C4(final gvn0 gvn0Var) {
        new th0.C20312a(act()).m191151j(xau.m209910t(R$string.f48196kf)).m191158q(R$string.f48087ff).m191156o(new View.OnClickListener() { // from class: l.xqk0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f195809a.m99748s4(gvn0Var, view);
            }
        }).m191146e(R$string.f48109gf).m191149h(false).m191144c(new View.OnClickListener() { // from class: l.yqk0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f201224a.m99749t4(view);
            }
        }).m191142a().m191141g();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: D4 */
    private void m99708D4(final gvn0 gvn0Var) {
        Dialog dialogM21566z = act().dialog().m21503F(gvn0Var.m132571l() ? xau.m209912v(R$string.f47769Qh, this.f196919f.getString(R$string.f48232m7), gvn0Var.m132568i()) : xau.m209911u(R$string.f47576Hh, ((jqm0) m213810E2()).m168532l0().name)).m21555t0(R$string.f48372sf, new Runnable() { // from class: l.mqk0
            @Override // java.lang.Runnable
            public final void run() {
                this.f138072a.m99751v4(gvn0Var);
            }
        }).m21538i0(new DialogInterface.OnKeyListener() { // from class: l.nqk0
            @Override // android.content.DialogInterface.OnKeyListener
            public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
                return this.f143243a.m99750u4(dialogInterface, i, keyEvent);
            }
        }).m21541l0(R$string.f48461wg, this.f72962q).m21566z();
        this.f72961p = dialogM21566z;
        dialogM21566z.setCanceledOnTouchOutside(false);
        this.f72961p.show();
    }

    /* JADX INFO: renamed from: J3 */
    public static /* synthetic */ void m99709J3(Runnable runnable) {
        if (runnable != null) {
            runnable.run();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: c4 */
    private void m99727c4(bzm0 bzm0Var, Runnable runnable, Runnable runnable2) {
        this.f72960o = bzm0Var;
        if (this.f72954i == 1 || !"invite".equals(bzm0Var.f79154h)) {
            this.f72958m = bzm0Var.f79149c;
            this.f72959n = bzm0Var.f79154h;
            m99744E4(runnable, runnable2);
        } else if (this.f72954i == 6) {
            BLiveVoiceCall bLiveVoiceCallM136873l = ((jqm0) m213810E2()).m183411P2().m136873l(zrv.f205799a.m207631D0());
            if (guk0.m132329h(bLiveVoiceCallM136873l)) {
                ydn0.m215258k(this, bLiveVoiceCallM136873l.anchor, bLiveVoiceCallM136873l.user);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: d4 */
    public void m99728d4() {
        if (((jqm0) m213810E2()).mo183435j() == null || TextUtils.isEmpty(((jqm0) m213810E2()).m202191k())) {
            return;
        }
        BLiveVoiceCall bLiveVoiceCallNewInstance = BLiveVoiceCall.newInstance(((jqm0) m213810E2()).m202191k(), this.f72956k, this.f72959n, this.f72958m, GameIdentity.player);
        if (this.f72957l) {
            bLiveVoiceCallNewInstance.inAction = "simplechat-freeCall";
        }
        duringCreated(VCallApiProvider.applyCallInvite(bLiveVoiceCallNewInstance)).subscribe(dhw.m115826e(new y20() { // from class: l.jqk0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f122226a.m99729e4((BLiveVoiceCall) obj);
            }
        }, new y20() { // from class: l.kqk0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f128256a.m99737n4((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: e4 */
    public void m99729e4(BLiveVoiceCall bLiveVoiceCall) {
        if (this.f72960o.f79150d == 21000) {
            m213811F2().VoiceChatEvent.dismissInviteSpanEvent().mo199273j(bLiveVoiceCall.inviteId);
        }
        this.f72955j = bLiveVoiceCall;
        this.f72956k = "";
        this.f72958m = 1;
        if (this.f72957l) {
            this.f72957l = false;
        } else if (!"invite".equals(this.f72959n) && !guk0.m132333l(bLiveVoiceCall)) {
            if (y6s.m214494b(((jqm0) m213810E2()).mo183435j().liveMode)) {
                o1j0.m165649w(R$string.f48284of);
            } else {
                o1j0.m165649w(R$string.f48156ij);
            }
        }
        ydn0.m215264q(this, bLiveVoiceCall);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: f4 */
    public void m99730f4(BLiveVoice bLiveVoice) {
        if (!((jqm0) m213810E2()).m146607a4() || bLiveVoice.callInfo.onVoiceCalls.size() >= 6) {
            return;
        }
        this.f72957l = true;
        m99745g4("apply", 0, null, this.f72963r);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h4 */
    public void m99731h4() {
        nsh0.m164608j("[voice][call]", "checkAndBindPhone");
        if (m99736m4()) {
            m99706B4(this.f196919f);
        } else {
            m99728d4();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i4, reason: merged with bridge method [inline-methods] */
    public void m99740w4(Runnable runnable, final Runnable runnable2) {
        nsh0.m164608j("CallConstant", "checkAndRequestPermission");
        PermissionHelper.m81065c().m81083r("android.permission.RECORD_AUDIO").m81088w(false).m81086u(true).m81075j(true).m81085t(new C15808c(runnable)).m81087v(new C15807b(runnable)).m81081p(new C15806a(runnable)).m81080o(new x20() { // from class: l.oqk0
            @Override // p153l.x20
            public final void call() {
                ark0.m99709J3(runnable2);
            }
        }).m81074i(this.f196919f);
    }

    /* JADX INFO: renamed from: j4 */
    private String m99733j4(int i) {
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

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k4 */
    public void m99734k4(BLiveVoiceCall bLiveVoiceCall) {
        int i;
        this.f72955j = bLiveVoiceCall;
        if (guk0.m132329h(bLiveVoiceCall)) {
            i = 6;
        } else if (guk0.m132327f(bLiveVoiceCall)) {
            this.f72956k = "";
            i = 1;
        } else if (guk0.m132334m(bLiveVoiceCall)) {
            i = 2;
        } else {
            i = guk0.m132333l(bLiveVoiceCall) ? 3 : 0;
        }
        if (this.f72954i != i) {
            m99743A4(i);
        }
    }

    /* JADX INFO: renamed from: l4 */
    private boolean m99735l4(Throwable th) {
        TantanException.Client.CoreService coreService = (TantanException.Client.CoreService) th;
        if (coreService.code != 43022 || TextUtils.isEmpty(coreService.metaMessage)) {
            return false;
        }
        this.f196919f.dialog().m21503F(coreService.metaMessage).m21495B(false).m21542m0(zrv.f205803e.getString(R$string.f48271o2)).m21567z0();
        return true;
    }

    /* JADX INFO: renamed from: m4 */
    private boolean m99736m4() {
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

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n4 */
    public /* synthetic */ void m99737n4(Throwable th) {
        this.f72956k = "";
        if (!(th instanceof TantanException.Client.CoreService) || m99735l4(th)) {
            return;
        }
        r35.m179578c(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o4 */
    public /* synthetic */ void m99738o4(BLiveEnvelope bLiveEnvelope) {
        this.f72956k = "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p4 */
    public /* synthetic */ void m99739p4() {
        duringCreated(itv.m142089M(this.f72956k)).subscribe(dhw.m115829h(new y20() { // from class: l.zqk0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f205626a.m99738o4((BLiveEnvelope) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x4 */
    public /* synthetic */ void m99741x4(bzm0 bzm0Var) {
        m99727c4(bzm0Var, null, this.f72963r);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: z4 */
    public void m99742z4(gvn0 gvn0Var) {
        if (!gvn0Var.m132570k(0)) {
            if (gvn0Var.m132570k(1)) {
                ydn0.m215264q(this, gvn0Var.m132564e());
                return;
            }
            return;
        }
        this.f72956k = gvn0Var.m132567h();
        Dialog dialog = this.f72961p;
        if (dialog != null && dialog.isShowing()) {
            this.f72961p.dismiss();
        }
        if (y6s.m214494b(((jqm0) m213810E2()).mo183435j().liveMode)) {
            m99707C4(gvn0Var);
        } else {
            m99708D4(gvn0Var);
        }
    }

    /* JADX INFO: renamed from: A4 */
    public void m99743A4(int i) {
        nsh0.m164608j("[voice][call]", "setStatus: " + m99733j4(i));
        this.f72954i = i;
    }

    /* JADX INFO: renamed from: E4 */
    public void m99744E4(final Runnable runnable, final Runnable runnable2) {
        nsh0.m164608j("[voice][call]", "start apply");
        wgt.m206250q(this.f196919f, iit.INSTANCE.m140133S(), R$string.f48113gj, new x20() { // from class: l.wqk0
            @Override // p153l.x20
            public final void call() {
                this.f190416a.m99740w4(runnable, runnable2);
            }
        });
    }

    /* JADX INFO: renamed from: g4 */
    public final void m99745g4(String str, int i, Runnable runnable, Runnable runnable2) {
        m99727c4(new bzm0().m107183d(str).m107186g(i), runnable, runnable2);
    }

    /* JADX INFO: renamed from: q4 */
    public final /* synthetic */ void m99746q4() {
        o1j0.m165651y(xau.m209910t(R$string.f48262nf));
        this.f72963r.run();
    }

    /* JADX INFO: renamed from: r4 */
    public final /* synthetic */ void m99747r4(Act act) {
        uqb0.f180396b0.f170325b.showBindPhoneDialog(act, new x20() { // from class: l.pqk0
            @Override // p153l.x20
            public final void call() {
                this.f153679a.m99728d4();
            }
        });
    }

    /* JADX INFO: renamed from: s4 */
    public final /* synthetic */ void m99748s4(gvn0 gvn0Var, View view) {
        m99751v4(gvn0Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        duringCreated(m213811F2().VoiceCallEvent.callApplyEvent().m199270g()).subscribe(dhw.m115825d(new y20() { // from class: l.sqk0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f170182a.m99741x4((bzm0) obj);
            }
        }));
        duringCreated(((jqm0) m213810E2()).m183424Z2()).subscribe(dhw.m115825d(new y20() { // from class: l.tqk0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f175758a.m99734k4((BLiveVoiceCall) obj);
            }
        }));
        duringCreated(((jqm0) m213810E2()).m168545q1().m98337x0()).subscribe(new y20() { // from class: l.uqk0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f180487a.m99742z4((gvn0) obj);
            }
        });
        duringCreated(((jqm0) m213810E2()).m183409O2().m188658d()).take(1).subscribe(dhw.m115825d(new y20() { // from class: l.vqk0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f185363a.m99730f4((BLiveVoice) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: t4 */
    public final /* synthetic */ void m99749t4(View view) {
        this.f72962q.run();
    }

    /* JADX INFO: renamed from: u4 */
    public final /* synthetic */ boolean m99750u4(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        if (i != 4) {
            return false;
        }
        this.f72962q.run();
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: y4, reason: merged with bridge method [inline-methods] */
    public final void m99751v4(gvn0 gvn0Var) {
        v1n0.m199023a(((jqm0) m213810E2()).m168532l0().f56859id, ((jqm0) m213810E2()).m202191k());
        m99745g4("invite", gvn0Var.m132564e().intendPosition, this.f72962q, new Runnable() { // from class: l.qqk0
            @Override // java.lang.Runnable
            public final void run() {
                this.f159017a.m99746q4();
            }
        });
    }

    /* JADX INFO: renamed from: l.ark0$a */
    public class C15806a implements j6e {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Runnable f72964a;

        public C15806a(Runnable runnable) {
            this.f72964a = runnable;
        }

        @Override // p153l.j6e
        /* JADX INFO: renamed from: b */
        public void mo38397b(boolean z) {
            Runnable runnable = this.f72964a;
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

    /* JADX INFO: renamed from: l.ark0$b */
    public class C15807b implements l6e {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Runnable f72966a;

        public C15807b(Runnable runnable) {
            this.f72966a = runnable;
        }

        @Override // p153l.l6e
        /* JADX INFO: renamed from: b */
        public void mo38405b() {
            Runnable runnable = this.f72966a;
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

    /* JADX INFO: renamed from: l.ark0$c */
    public class C15808c implements k6e {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Runnable f72968a;

        public C15808c(Runnable runnable) {
            this.f72968a = runnable;
        }

        @Override // p153l.k6e
        /* JADX INFO: renamed from: b */
        public void mo38394b() {
            Runnable runnable = this.f72968a;
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
