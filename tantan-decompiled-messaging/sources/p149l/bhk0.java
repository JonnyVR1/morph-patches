package p149l;

import android.content.DialogInterface;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.Dialog;
import com.p046p1.mobile.putong.api.api.TantanException;
import com.p046p1.mobile.putong.core.data.GameIdentity;
import com.p046p1.mobile.putong.data.Owner;
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
import p133rx.C22306c;

/* JADX INFO: loaded from: classes5.dex */
public class bhk0 extends pat<nnn0> {

    /* JADX INFO: renamed from: i */
    public int f75619i;

    /* JADX INFO: renamed from: j */
    public BLiveVoiceCall f75620j;

    /* JADX INFO: renamed from: k */
    public String f75621k;

    /* JADX INFO: renamed from: l */
    public boolean f75622l;

    /* JADX INFO: renamed from: m */
    public int f75623m;

    /* JADX INFO: renamed from: n */
    public String f75624n;

    /* JADX INFO: renamed from: o */
    public xpm0 f75625o;

    /* JADX INFO: renamed from: p */
    public Dialog f75626p;

    /* JADX INFO: renamed from: q */
    public final Runnable f75627q;

    /* JADX INFO: renamed from: r */
    public final Runnable f75628r;

    public bhk0(bsm bsmVar) {
        super(bsmVar);
        this.f75619i = 1;
        this.f75621k = "";
        this.f75622l = false;
        this.f75623m = 0;
        this.f75624n = "apply";
        this.f75627q = new Runnable() { // from class: l.hgk0
            @Override // java.lang.Runnable
            public final void run() {
                this.f107605a.m101891t4();
            }
        };
        this.f75628r = new Runnable() { // from class: l.sgk0
            @Override // java.lang.Runnable
            public final void run() {
                this.f164449a.m101882j4();
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: D4 */
    public void m101847D4(cmn0 cmn0Var) {
        if (!cmn0Var.m107683k(0)) {
            if (cmn0Var.m107683k(1)) {
                u4n0.m191758q(this, cmn0Var.m107677e());
                return;
            }
            return;
        }
        this.f75621k = cmn0Var.m107680h();
        Dialog dialog = this.f75626p;
        if (dialog != null && dialog.isShowing()) {
            this.f75626p.dismiss();
        }
        if (x4s.m207012b(((nnn0) m206027E2()).mo149813j().liveMode)) {
            m101874G4(cmn0Var);
        } else {
            m101875H4(cmn0Var);
        }
    }

    /* JADX INFO: renamed from: Y3 */
    public static /* synthetic */ void m101862Y3(Runnable runnable) {
        if (runnable != null) {
            runnable.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m4 */
    public void m101868m4(BLiveVoiceCall bLiveVoiceCall) {
        int i;
        this.f75620j = bLiveVoiceCall;
        if (alk0.m97309h(bLiveVoiceCall)) {
            i = 6;
        } else if (alk0.m97307f(bLiveVoiceCall)) {
            this.f75621k = "";
            i = 1;
        } else if (alk0.m97314m(bLiveVoiceCall)) {
            i = 2;
        } else {
            i = alk0.m97313l(bLiveVoiceCall) ? 3 : 0;
        }
        if (this.f75619i != i) {
            m101872E4(i);
        }
    }

    /* JADX INFO: renamed from: B4 */
    public final /* synthetic */ void m101870B4(xpm0 xpm0Var) {
        m101877e4(xpm0Var, null, this.f75628r);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: C4, reason: merged with bridge method [inline-methods] */
    public final void m101896y4() {
        rsm0.m180693a(((nnn0) m206027E2()).m132146l0().f56011id, ((nnn0) m206027E2()).m149814k());
        m101881i4("invite", this.f75627q, new Runnable() { // from class: l.rgk0
            @Override // java.lang.Runnable
            public final void run() {
                this.f159265a.m101892u4();
            }
        });
    }

    /* JADX INFO: renamed from: E4 */
    public void m101872E4(int i) {
        gkh0.m126627j("[voice][call]", "setStatus: " + m101884l4(i));
        this.f75619i = i;
    }

    /* JADX INFO: renamed from: F4 */
    public final void m101873F4(final Act act) {
        act.dialog().m20556t0(R$string.f46711H0, new Runnable() { // from class: l.jgk0
            @Override // java.lang.Runnable
            public final void run() {
                this.f117800a.m101893v4(act);
            }
        }).m20500D(R$string.f47021Vc).m20541k0(R$string.f47113a).m20496B(false).m20568z0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: G4 */
    public final void m101874G4(cmn0 cmn0Var) {
        String strM202217t = w8u.m202217t(R$string.f47348kf);
        if (x4s.m207013c(((nnn0) m206027E2()).mo149813j().liveMode)) {
            strM202217t = "主持邀请你上麦参与挑战";
        }
        String strM202217t2 = w8u.m202217t(R$string.f47261gf);
        if (x4s.m207013c(((nnn0) m206027E2()).mo149813j().liveMode)) {
            strM202217t2 = "暂不参与";
        }
        String strM202217t3 = w8u.m202217t(R$string.f47239ff);
        if (x4s.m207013c(((nnn0) m206027E2()).mo149813j().liveMode)) {
            strM202217t3 = "接受";
        }
        new xh0.C21150a(act()).m208731j(strM202217t).m208739r(strM202217t3).m208736o(new View.OnClickListener() { // from class: l.ygk0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f198204a.m101895x4(view);
            }
        }).m208727f(strM202217t2).m208729h(false).m208724c(new View.OnClickListener() { // from class: l.zgk0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f203052a.m101894w4(view);
            }
        }).m208722a().m208721g();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: H4 */
    public final void m101875H4(cmn0 cmn0Var) {
        Dialog dialogM20567z = act().dialog().m20504F(cmn0Var.m107684l() ? w8u.m202219v(R$string.f46921Qh, this.f188513f.getString(R$string.f47384m7), cmn0Var.m107681i()) : w8u.m202218u(R$string.f46728Hh, ((nnn0) m206027E2()).m132146l0().name)).m20556t0(R$string.f47524sf, new Runnable() { // from class: l.ahk0
            @Override // java.lang.Runnable
            public final void run() {
                this.f69610a.m101896y4();
            }
        }).m20539i0(new DialogInterface.OnKeyListener() { // from class: l.igk0
            @Override // android.content.DialogInterface.OnKeyListener
            public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
                return this.f113131a.m101897z4(dialogInterface, i, keyEvent);
            }
        }).m20542l0(R$string.f47613wg, this.f75627q).m20567z();
        this.f75626p = dialogM20567z;
        dialogM20567z.setCanceledOnTouchOutside(false);
        this.f75626p.show();
    }

    /* JADX INFO: renamed from: I4 */
    public void m101876I4(final Runnable runnable, final Runnable runnable2) {
        gkh0.m126627j("[voice][call]", "start apply");
        vet.m198233q(this.f188513f, hgt.INSTANCE.m130912S(), R$string.f47265gj, new d30() { // from class: l.xgk0
            @Override // p149l.d30
            public final void call() {
                this.f192773a.m101869A4(runnable, runnable2);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: e4 */
    public final void m101877e4(xpm0 xpm0Var, Runnable runnable, Runnable runnable2) {
        this.f75625o = xpm0Var;
        if (this.f75619i == 1 || !"invite".equals(xpm0Var.f193944h)) {
            this.f75623m = xpm0Var.f193939c;
            this.f75624n = xpm0Var.f193944h;
            m101876I4(runnable, runnable2);
        } else if (this.f75619i == 6) {
            BLiveVoiceCall bLiveVoiceCallM102063l = ((nnn0) m206027E2()).m160249P2().m102063l(ypv.f199493a.m199309D0());
            if (alk0.m97309h(bLiveVoiceCallM102063l)) {
                u4n0.m191752k(this, bLiveVoiceCallM102063l.anchor, bLiveVoiceCallM102063l.user);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: f4 */
    public final void m101878f4() {
        if (((nnn0) m206027E2()).mo149813j() == null || TextUtils.isEmpty(((nnn0) m206027E2()).m149814k())) {
            return;
        }
        final BLiveVoiceCall bLiveVoiceCallNewInstance = BLiveVoiceCall.newInstance(((nnn0) m206027E2()).m149814k(), this.f75621k, this.f75624n, this.f75623m, ((nnn0) m206027E2()).mo97490p() ? Owner.TYPE : GameIdentity.player);
        bLiveVoiceCallNewInstance.isHost = this.f75625o.f193945i;
        if (((nnn0) m206027E2()).m149820r()) {
            duringCreated(VCallApiProvider.applyCallInvite(bLiveVoiceCallNewInstance)).subscribe(ffw.m121194e(new e30() { // from class: l.lgk0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f128000a.m101879g4((BLiveVoiceCall) obj);
                }
            }, new e30() { // from class: l.mgk0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f133700a.m101887p4((Throwable) obj);
                }
            }));
        } else {
            duringCreated((C22306c) hrv.m132758t(((nnn0) m206027E2()).m149818o(), false, ((nnn0) m206027E2()).mo132081O0(), ((nnn0) m206027E2()).mo149813j().liveMode, "", "").flatMap(new w9j() { // from class: l.ngk0
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return this.f138881a.m101888q4(bLiveVoiceCallNewInstance, (BLiveVoice) obj);
                }
            })).subscribe(ffw.m121194e(new e30() { // from class: l.lgk0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f128000a.m101879g4((BLiveVoiceCall) obj);
                }
            }, new e30() { // from class: l.ogk0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f143870a.m101889r4((Throwable) obj);
                }
            }));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: g4 */
    public final void m101879g4(BLiveVoiceCall bLiveVoiceCall) {
        int i = this.f75625o.f193940d;
        if (i == 21000) {
            m206028F2().VoiceChatEvent.dismissInviteSpanEvent().mo172463j(bLiveVoiceCall.inviteId);
        } else if (i == 21100) {
            m206028F2().VoiceVirtualLiveEvent.refreshHeatTasks().mo172463j(Boolean.TRUE);
        }
        this.f75620j = bLiveVoiceCall;
        this.f75621k = "";
        this.f75623m = 1;
        d30 d30Var = this.f75625o.f193946j;
        if (d30Var != null) {
            d30Var.call();
        }
        if (this.f75622l) {
            this.f75622l = false;
        } else if (!"invite".equals(this.f75624n) && !alk0.m97313l(bLiveVoiceCall)) {
            if (x4s.m207012b(((nnn0) m206027E2()).mo149813j().liveMode)) {
                lsi0.m151593w(R$string.f47436of);
            } else {
                lsi0.m151593w(R$string.f47308ij);
            }
        }
        u4n0.m191758q(this, bLiveVoiceCall);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: h4 */
    public final void m101880h4(BLiveVoice bLiveVoice) {
        if ((m206027E2() instanceof fhm0) && ((fhm0) m206027E2()).m121380a4() && bLiveVoice.callInfo.onVoiceCalls.size() < 6) {
            this.f75622l = true;
            m101881i4("apply", null, this.f75628r);
        }
    }

    /* JADX INFO: renamed from: i4 */
    public final void m101881i4(String str, Runnable runnable, Runnable runnable2) {
        m101877e4(new xpm0().m210510d(str), runnable, runnable2);
    }

    /* JADX INFO: renamed from: j4 */
    public final void m101882j4() {
        gkh0.m126627j("[voice][call]", "checkAndBindPhone");
        if (m101886o4()) {
            m101873F4(this.f188513f);
        } else {
            m101878f4();
        }
    }

    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public final void m101869A4(Runnable runnable, final Runnable runnable2) {
        gkh0.m126627j("CallConstant", "checkAndRequestPermission");
        PermissionHelper.m79882c().m79900r("android.permission.RECORD_AUDIO").m79905w(false).m79903u(true).m79892j(true).m79902t(new C15864c(runnable)).m79904v(new C15863b(runnable)).m79898p(new C15862a(runnable)).m79897o(new d30() { // from class: l.qgk0
            @Override // p149l.d30
            public final void call() {
                bhk0.m101862Y3(runnable2);
            }
        }).m79891i(this.f188513f);
    }

    /* JADX INFO: renamed from: l4 */
    public final String m101884l4(int i) {
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
    public final boolean m101885n4(Throwable th) {
        TantanException.Client.CoreService coreService = (TantanException.Client.CoreService) th;
        if (coreService.code != 43022 || TextUtils.isEmpty(coreService.metaMessage)) {
            return false;
        }
        this.f188513f.dialog().m20504F(coreService.metaMessage).m20496B(false).m20543m0(ypv.f199497e.getString(R$string.f47423o2)).m20568z0();
        return true;
    }

    /* JADX INFO: renamed from: o4 */
    public final boolean m101886o4() {
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

    /* JADX INFO: renamed from: p4 */
    public final /* synthetic */ void m101887p4(Throwable th) {
        this.f75621k = "";
        if (!(th instanceof TantanException.Client.CoreService) || m101885n4(th)) {
            return;
        }
        xtr.m211023c(th);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: q4 */
    public final /* synthetic */ C22306c m101888q4(BLiveVoiceCall bLiveVoiceCall, BLiveVoice bLiveVoice) {
        ((nnn0) m206027E2()).mo149811g(bLiveVoice);
        bLiveVoiceCall.voiceLiveId = bLiveVoice.f44323id;
        return VCallApiProvider.applyCallInvite(bLiveVoiceCall);
    }

    /* JADX INFO: renamed from: r4 */
    public final /* synthetic */ void m101889r4(Throwable th) {
        this.f75621k = "";
        if (!(th instanceof TantanException.Client.CoreService) || m101885n4(th)) {
            return;
        }
        xtr.m211023c(th);
    }

    /* JADX INFO: renamed from: s4 */
    public final /* synthetic */ void m101890s4(BLiveEnvelope bLiveEnvelope) {
        this.f75621k = "";
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        duringCreated(m206028F2().VoiceCallEvent.callApplyEvent().m172460g()).subscribe(ffw.m121193d(new e30() { // from class: l.tgk0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f170100a.m101870B4((xpm0) obj);
            }
        }));
        duringCreated(((nnn0) m206027E2()).m160262Z2()).subscribe(ffw.m121193d(new e30() { // from class: l.ugk0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f176399a.m101868m4((BLiveVoiceCall) obj);
            }
        }));
        duringCreated(((nnn0) m206027E2()).m132160q1().m189155x0()).subscribe(new e30() { // from class: l.vgk0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f181379a.m101847D4((cmn0) obj);
            }
        });
        duringCreated(((nnn0) m206027E2()).m160247O2().m165466d()).take(1).subscribe(ffw.m121193d(new e30() { // from class: l.wgk0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f186206a.m101880h4((BLiveVoice) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: t4 */
    public final /* synthetic */ void m101891t4() {
        duringCreated(hrv.m132730M(this.f75621k)).subscribe(ffw.m121197h(new e30() { // from class: l.kgk0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f123040a.m101890s4((BLiveEnvelope) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: u4 */
    public final /* synthetic */ void m101892u4() {
        lsi0.m151595y(w8u.m202217t(R$string.f47414nf));
        this.f75628r.run();
    }

    /* JADX INFO: renamed from: v4 */
    public final /* synthetic */ void m101893v4(Act act) {
        qib0.f154713b0.f139231b.showBindPhoneDialog(act, new d30() { // from class: l.pgk0
            @Override // p149l.d30
            public final void call() {
                this.f148724a.m101878f4();
            }
        });
    }

    /* JADX INFO: renamed from: w4 */
    public final /* synthetic */ void m101894w4(View view) {
        this.f75627q.run();
    }

    /* JADX INFO: renamed from: x4 */
    public final /* synthetic */ void m101895x4(View view) {
        m101896y4();
    }

    /* JADX INFO: renamed from: z4 */
    public final /* synthetic */ boolean m101897z4(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        if (i != 4) {
            return false;
        }
        this.f75627q.run();
        return false;
    }

    /* JADX INFO: renamed from: l.bhk0$a */
    public class C15862a implements v4e {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Runnable f75629a;

        public C15862a(Runnable runnable) {
            this.f75629a = runnable;
        }

        @Override // p149l.v4e
        /* JADX INFO: renamed from: b */
        public void mo37394b(boolean z) {
            Runnable runnable = this.f75629a;
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

    /* JADX INFO: renamed from: l.bhk0$b */
    public class C15863b implements x4e {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Runnable f75631a;

        public C15863b(Runnable runnable) {
            this.f75631a = runnable;
        }

        @Override // p149l.x4e
        /* JADX INFO: renamed from: b */
        public void mo37402b() {
            Runnable runnable = this.f75631a;
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

    /* JADX INFO: renamed from: l.bhk0$c */
    public class C15864c implements w4e {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Runnable f75633a;

        public C15864c(Runnable runnable) {
            this.f75633a = runnable;
        }

        @Override // p149l.w4e
        /* JADX INFO: renamed from: b */
        public void mo37391b() {
            Runnable runnable = this.f75633a;
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
