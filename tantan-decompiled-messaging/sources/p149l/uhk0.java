package p149l;

import android.content.DialogInterface;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.Dialog;
import com.p046p1.mobile.putong.api.api.TantanException;
import com.p046p1.mobile.putong.core.data.GameIdentity;
import com.p046p1.mobile.putong.data.RelationshipStatus;
import com.p046p1.mobile.putong.data.Settings;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.UserSource;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p046p1.mobile.putong.live.base.data.BLiveVoice;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceCall;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.voice.call.api.VCallApiProvider;
import com.p046p1.mobile.putong.p065ui.permission.PermissionHelper;

/* JADX INFO: loaded from: classes5.dex */
public class uhk0 extends pat<fhm0> {

    /* JADX INFO: renamed from: i */
    public int f176558i;

    /* JADX INFO: renamed from: j */
    public BLiveVoiceCall f176559j;

    /* JADX INFO: renamed from: k */
    public String f176560k;

    /* JADX INFO: renamed from: l */
    public boolean f176561l;

    /* JADX INFO: renamed from: m */
    public int f176562m;

    /* JADX INFO: renamed from: n */
    public String f176563n;

    /* JADX INFO: renamed from: o */
    public xpm0 f176564o;

    /* JADX INFO: renamed from: p */
    public Dialog f176565p;

    /* JADX INFO: renamed from: q */
    public final Runnable f176566q;

    /* JADX INFO: renamed from: r */
    public final Runnable f176567r;

    public uhk0(bsm bsmVar) {
        super(bsmVar);
        this.f176558i = 1;
        this.f176560k = "";
        this.f176561l = false;
        this.f176562m = 0;
        this.f176563n = "apply";
        this.f176566q = new Runnable() { // from class: l.chk0
            @Override // java.lang.Runnable
            public final void run() {
                this.f80942a.m193772p4();
            }
        };
        this.f176567r = new Runnable() { // from class: l.lhk0
            @Override // java.lang.Runnable
            public final void run() {
                this.f128116a.m193764h4();
            }
        };
    }

    /* JADX INFO: renamed from: B4 */
    private void m193739B4(final Act act) {
        act.dialog().m20556t0(R$string.f46711H0, new Runnable() { // from class: l.fhk0
            @Override // java.lang.Runnable
            public final void run() {
                this.f97508a.m193780r4(act);
            }
        }).m20500D(R$string.f47021Vc).m20541k0(R$string.f47113a).m20496B(false).m20568z0();
    }

    /* JADX INFO: renamed from: C4 */
    private void m193740C4(final cmn0 cmn0Var) {
        new xh0.C21150a(act()).m208731j(w8u.m202217t(R$string.f47348kf)).m208738q(R$string.f47239ff).m208736o(new View.OnClickListener() { // from class: l.rhk0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f159371a.m193781s4(cmn0Var, view);
            }
        }).m208726e(R$string.f47261gf).m208729h(false).m208724c(new View.OnClickListener() { // from class: l.shk0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f164595a.m193782t4(view);
            }
        }).m208722a().m208721g();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: D4 */
    private void m193741D4(final cmn0 cmn0Var) {
        Dialog dialogM20567z = act().dialog().m20504F(cmn0Var.m107684l() ? w8u.m202219v(R$string.f46921Qh, this.f188513f.getString(R$string.f47384m7), cmn0Var.m107681i()) : w8u.m202218u(R$string.f46728Hh, ((fhm0) m206027E2()).m132146l0().name)).m20556t0(R$string.f47524sf, new Runnable() { // from class: l.ghk0
            @Override // java.lang.Runnable
            public final void run() {
                this.f102664a.m193784v4(cmn0Var);
            }
        }).m20539i0(new DialogInterface.OnKeyListener() { // from class: l.hhk0
            @Override // android.content.DialogInterface.OnKeyListener
            public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
                return this.f107728a.m193783u4(dialogInterface, i, keyEvent);
            }
        }).m20542l0(R$string.f47613wg, this.f176566q).m20567z();
        this.f176565p = dialogM20567z;
        dialogM20567z.setCanceledOnTouchOutside(false);
        this.f176565p.show();
    }

    /* JADX INFO: renamed from: J3 */
    public static /* synthetic */ void m193742J3(Runnable runnable) {
        if (runnable != null) {
            runnable.run();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: c4 */
    private void m193760c4(xpm0 xpm0Var, Runnable runnable, Runnable runnable2) {
        this.f176564o = xpm0Var;
        if (this.f176558i == 1 || !"invite".equals(xpm0Var.f193944h)) {
            this.f176562m = xpm0Var.f193939c;
            this.f176563n = xpm0Var.f193944h;
            m193777E4(runnable, runnable2);
        } else if (this.f176558i == 6) {
            BLiveVoiceCall bLiveVoiceCallM102063l = ((fhm0) m206027E2()).m160249P2().m102063l(ypv.f199493a.m199309D0());
            if (alk0.m97309h(bLiveVoiceCallM102063l)) {
                u4n0.m191752k(this, bLiveVoiceCallM102063l.anchor, bLiveVoiceCallM102063l.user);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: d4 */
    public void m193761d4() {
        if (((fhm0) m206027E2()).mo149813j() == null || TextUtils.isEmpty(((fhm0) m206027E2()).m149814k())) {
            return;
        }
        BLiveVoiceCall bLiveVoiceCallNewInstance = BLiveVoiceCall.newInstance(((fhm0) m206027E2()).m149814k(), this.f176560k, this.f176563n, this.f176562m, GameIdentity.player);
        if (this.f176561l) {
            bLiveVoiceCallNewInstance.inAction = "simplechat-freeCall";
        }
        duringCreated(VCallApiProvider.applyCallInvite(bLiveVoiceCallNewInstance)).subscribe(ffw.m121194e(new e30() { // from class: l.dhk0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f86307a.m193762e4((BLiveVoiceCall) obj);
            }
        }, new e30() { // from class: l.ehk0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f91338a.m193770n4((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: e4 */
    public void m193762e4(BLiveVoiceCall bLiveVoiceCall) {
        if (this.f176564o.f193940d == 21000) {
            m206028F2().VoiceChatEvent.dismissInviteSpanEvent().mo172463j(bLiveVoiceCall.inviteId);
        }
        this.f176559j = bLiveVoiceCall;
        this.f176560k = "";
        this.f176562m = 1;
        if (this.f176561l) {
            this.f176561l = false;
        } else if (!"invite".equals(this.f176563n) && !alk0.m97313l(bLiveVoiceCall)) {
            if (x4s.m207012b(((fhm0) m206027E2()).mo149813j().liveMode)) {
                lsi0.m151593w(R$string.f47436of);
            } else {
                lsi0.m151593w(R$string.f47308ij);
            }
        }
        u4n0.m191758q(this, bLiveVoiceCall);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: f4 */
    public void m193763f4(BLiveVoice bLiveVoice) {
        if (!((fhm0) m206027E2()).m121380a4() || bLiveVoice.callInfo.onVoiceCalls.size() >= 6) {
            return;
        }
        this.f176561l = true;
        m193778g4("apply", 0, null, this.f176567r);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h4 */
    public void m193764h4() {
        gkh0.m126627j("[voice][call]", "checkAndBindPhone");
        if (m193769m4()) {
            m193739B4(this.f188513f);
        } else {
            m193761d4();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i4, reason: merged with bridge method [inline-methods] */
    public void m193773w4(Runnable runnable, final Runnable runnable2) {
        gkh0.m126627j("CallConstant", "checkAndRequestPermission");
        PermissionHelper.m79882c().m79900r("android.permission.RECORD_AUDIO").m79905w(false).m79903u(true).m79892j(true).m79902t(new C20432c(runnable)).m79904v(new C20431b(runnable)).m79898p(new C20430a(runnable)).m79897o(new d30() { // from class: l.ihk0
            @Override // p149l.d30
            public final void call() {
                uhk0.m193742J3(runnable2);
            }
        }).m79891i(this.f188513f);
    }

    /* JADX INFO: renamed from: j4 */
    private String m193766j4(int i) {
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
    public void m193767k4(BLiveVoiceCall bLiveVoiceCall) {
        int i;
        this.f176559j = bLiveVoiceCall;
        if (alk0.m97309h(bLiveVoiceCall)) {
            i = 6;
        } else if (alk0.m97307f(bLiveVoiceCall)) {
            this.f176560k = "";
            i = 1;
        } else if (alk0.m97314m(bLiveVoiceCall)) {
            i = 2;
        } else {
            i = alk0.m97313l(bLiveVoiceCall) ? 3 : 0;
        }
        if (this.f176558i != i) {
            m193776A4(i);
        }
    }

    /* JADX INFO: renamed from: l4 */
    private boolean m193768l4(Throwable th) {
        TantanException.Client.CoreService coreService = (TantanException.Client.CoreService) th;
        if (coreService.code != 43022 || TextUtils.isEmpty(coreService.metaMessage)) {
            return false;
        }
        this.f188513f.dialog().m20504F(coreService.metaMessage).m20496B(false).m20543m0(ypv.f199497e.getString(R$string.f47423o2)).m20568z0();
        return true;
    }

    /* JADX INFO: renamed from: m4 */
    private boolean m193769m4() {
        Settings settings;
        User userMe_ = qib0.f154713b0.f139231b.me_();
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
    public /* synthetic */ void m193770n4(Throwable th) {
        this.f176560k = "";
        if (!(th instanceof TantanException.Client.CoreService) || m193768l4(th)) {
            return;
        }
        s25.m182058c(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o4 */
    public /* synthetic */ void m193771o4(BLiveEnvelope bLiveEnvelope) {
        this.f176560k = "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p4 */
    public /* synthetic */ void m193772p4() {
        duringCreated(hrv.m132730M(this.f176560k)).subscribe(ffw.m121197h(new e30() { // from class: l.thk0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f170261a.m193771o4((BLiveEnvelope) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x4 */
    public /* synthetic */ void m193774x4(xpm0 xpm0Var) {
        m193760c4(xpm0Var, null, this.f176567r);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: z4 */
    public void m193775z4(cmn0 cmn0Var) {
        if (!cmn0Var.m107683k(0)) {
            if (cmn0Var.m107683k(1)) {
                u4n0.m191758q(this, cmn0Var.m107677e());
                return;
            }
            return;
        }
        this.f176560k = cmn0Var.m107680h();
        Dialog dialog = this.f176565p;
        if (dialog != null && dialog.isShowing()) {
            this.f176565p.dismiss();
        }
        if (x4s.m207012b(((fhm0) m206027E2()).mo149813j().liveMode)) {
            m193740C4(cmn0Var);
        } else {
            m193741D4(cmn0Var);
        }
    }

    /* JADX INFO: renamed from: A4 */
    public void m193776A4(int i) {
        gkh0.m126627j("[voice][call]", "setStatus: " + m193766j4(i));
        this.f176558i = i;
    }

    /* JADX INFO: renamed from: E4 */
    public void m193777E4(final Runnable runnable, final Runnable runnable2) {
        gkh0.m126627j("[voice][call]", "start apply");
        vet.m198233q(this.f188513f, hgt.INSTANCE.m130912S(), R$string.f47265gj, new d30() { // from class: l.qhk0
            @Override // p149l.d30
            public final void call() {
                this.f154473a.m193773w4(runnable, runnable2);
            }
        });
    }

    /* JADX INFO: renamed from: g4 */
    public final void m193778g4(String str, int i, Runnable runnable, Runnable runnable2) {
        m193760c4(new xpm0().m210510d(str).m210513g(i), runnable, runnable2);
    }

    /* JADX INFO: renamed from: q4 */
    public final /* synthetic */ void m193779q4() {
        lsi0.m151595y(w8u.m202217t(R$string.f47414nf));
        this.f176567r.run();
    }

    /* JADX INFO: renamed from: r4 */
    public final /* synthetic */ void m193780r4(Act act) {
        qib0.f154713b0.f139231b.showBindPhoneDialog(act, new d30() { // from class: l.jhk0
            @Override // p149l.d30
            public final void call() {
                this.f117954a.m193761d4();
            }
        });
    }

    /* JADX INFO: renamed from: s4 */
    public final /* synthetic */ void m193781s4(cmn0 cmn0Var, View view) {
        m193784v4(cmn0Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        duringCreated(m206028F2().VoiceCallEvent.callApplyEvent().m172460g()).subscribe(ffw.m121193d(new e30() { // from class: l.mhk0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f133827a.m193774x4((xpm0) obj);
            }
        }));
        duringCreated(((fhm0) m206027E2()).m160262Z2()).subscribe(ffw.m121193d(new e30() { // from class: l.nhk0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f139002a.m193767k4((BLiveVoiceCall) obj);
            }
        }));
        duringCreated(((fhm0) m206027E2()).m132160q1().m189155x0()).subscribe(new e30() { // from class: l.ohk0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f144007a.m193775z4((cmn0) obj);
            }
        });
        duringCreated(((fhm0) m206027E2()).m160247O2().m165466d()).take(1).subscribe(ffw.m121193d(new e30() { // from class: l.phk0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f148938a.m193763f4((BLiveVoice) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: t4 */
    public final /* synthetic */ void m193782t4(View view) {
        this.f176566q.run();
    }

    /* JADX INFO: renamed from: u4 */
    public final /* synthetic */ boolean m193783u4(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        if (i != 4) {
            return false;
        }
        this.f176566q.run();
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: y4, reason: merged with bridge method [inline-methods] */
    public final void m193784v4(cmn0 cmn0Var) {
        rsm0.m180693a(((fhm0) m206027E2()).m132146l0().f56011id, ((fhm0) m206027E2()).m149814k());
        m193778g4("invite", cmn0Var.m107677e().intendPosition, this.f176566q, new Runnable() { // from class: l.khk0
            @Override // java.lang.Runnable
            public final void run() {
                this.f123174a.m193779q4();
            }
        });
    }

    /* JADX INFO: renamed from: l.uhk0$a */
    public class C20430a implements v4e {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Runnable f176568a;

        public C20430a(Runnable runnable) {
            this.f176568a = runnable;
        }

        @Override // p149l.v4e
        /* JADX INFO: renamed from: b */
        public void mo37394b(boolean z) {
            Runnable runnable = this.f176568a;
            if (runnable != null) {
                runnable.run();
            }
        }

        @Override // p149l.v4e
        /* JADX INFO: renamed from: a */
        public void mo37393a() {
        }

        @Override // p149l.v4e
        /* JADX INFO: renamed from: c */
        public void mo37395c() {
        }
    }

    /* JADX INFO: renamed from: l.uhk0$b */
    public class C20431b implements x4e {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Runnable f176570a;

        public C20431b(Runnable runnable) {
            this.f176570a = runnable;
        }

        @Override // p149l.x4e
        /* JADX INFO: renamed from: b */
        public void mo37402b() {
            Runnable runnable = this.f176570a;
            if (runnable != null) {
                runnable.run();
            }
        }

        @Override // p149l.x4e
        /* JADX INFO: renamed from: a */
        public void mo37401a() {
        }

        @Override // p149l.x4e
        /* JADX INFO: renamed from: c */
        public void mo37403c() {
        }
    }

    /* JADX INFO: renamed from: l.uhk0$c */
    public class C20432c implements w4e {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Runnable f176572a;

        public C20432c(Runnable runnable) {
            this.f176572a = runnable;
        }

        @Override // p149l.w4e
        /* JADX INFO: renamed from: b */
        public void mo37391b() {
            Runnable runnable = this.f176572a;
            if (runnable != null) {
                runnable.run();
            }
        }

        @Override // p149l.w4e
        /* JADX INFO: renamed from: a */
        public void mo37390a() {
        }

        @Override // p149l.w4e
        /* JADX INFO: renamed from: c */
        public void mo37392c() {
        }
    }
}
