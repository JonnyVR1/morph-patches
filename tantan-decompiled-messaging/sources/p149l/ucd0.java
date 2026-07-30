package p149l;

import android.view.View;
import android.widget.TextView;
import com.p046p1.mobile.android.app.C4319c;
import com.p046p1.mobile.android.app.Dialog;
import com.p046p1.mobile.putong.live.base.data.BLiveCall;
import com.p046p1.mobile.putong.live.base.webview.LiveWebViewAct;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.p046p1.mobile.putong.live.livingroom.archi.dialogcenter.DialogC12611a;
import com.p046p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveCallMessage;
import com.p046p1.mobile.putong.live.livingroom.archi.sdk.motion.base.C12714b;
import com.p046p1.mobile.putong.live.livingroom.archi.sdk.motion.base.MotionParams;
import com.p046p1.mobile.putong.p065ui.permission.PermissionHelper;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes5.dex */
public class ucd0 extends h4t<ho2, rbd0> {

    /* JADX INFO: renamed from: i */
    public final xu2 f175814i;

    /* JADX INFO: renamed from: j */
    public boolean f175815j;

    /* JADX INFO: renamed from: k */
    public c4g0 f175816k;

    /* JADX INFO: renamed from: l */
    public DialogC12611a f175817l;

    /* JADX INFO: renamed from: m */
    public w6d0 f175818m;

    /* JADX INFO: renamed from: n */
    public Dialog f175819n;

    /* JADX INFO: renamed from: o */
    public boolean f175820o;

    /* JADX INFO: renamed from: p */
    public Dialog f175821p;

    public ucd0(bsm bsmVar, w6d0 w6d0Var) {
        super(bsmVar);
        this.f175818m = w6d0Var;
        this.f175814i = w6d0Var.f184830l;
        mo51532C(new rbd0());
    }

    /* JADX INFO: renamed from: N3 */
    public static /* synthetic */ void m193013N3() {
    }

    /* JADX INFO: renamed from: R3 */
    public static /* synthetic */ void m193016R3(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V4 */
    public void m193021V4(LiveCallMessage liveCallMessage) {
        if (liveCallMessage.m71823is(12)) {
            m193066b5(liveCallMessage.getCallId());
        } else if (liveCallMessage.m71823is(13)) {
            m193070n4(liveCallMessage.getCallId());
            m193078v4();
        }
    }

    /* JADX INFO: renamed from: m4 */
    private void m193038m4(final String str) {
        duringCreated(LivingNormalApiProvider.m71615x3(str)).subscribe(ffw.m121194e(new e30() { // from class: l.vbd0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f180836a.m193080y4(str, (List) obj);
            }
        }, new e30() { // from class: l.wbd0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f185570a.m193081z4((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x4 */
    public void m193039x4(C4319c c4319c) {
        if (c4319c == C4319c.f15548i) {
            m193059T4();
        } else if (c4319c == C4319c.f15550k) {
            m193060U4();
        }
    }

    /* JADX INFO: renamed from: A4 */
    public final /* synthetic */ void m193040A4() {
        ((rbd0) this.viewModel).m178584e();
        m193077u4();
        m193074r4();
    }

    /* JADX INFO: renamed from: B4 */
    public final /* synthetic */ void m193041B4(BLiveCall bLiveCall) {
        this.f175818m.mo162543m4(bLiveCall);
    }

    /* JADX INFO: renamed from: C4 */
    public final /* synthetic */ void m193042C4(Throwable th) {
        this.f175818m.m162527V3(th);
    }

    /* JADX INFO: renamed from: D4 */
    public final /* synthetic */ void m193043D4(Boolean bool) {
        if (bool.booleanValue()) {
            return;
        }
        m193064Z4();
    }

    /* JADX INFO: renamed from: E4 */
    public final /* synthetic */ void m193044E4(String str) {
        m193073q4(str);
        m193078v4();
    }

    /* JADX INFO: renamed from: F4 */
    public final /* synthetic */ void m193045F4(String str, Boolean bool) {
        if (!bool.booleanValue()) {
            m193064Z4();
        } else {
            this.f175820o = true;
            m193068d5(str);
        }
    }

    /* JADX INFO: renamed from: G4 */
    public final /* synthetic */ void m193046G4(List list) {
        this.f175818m.mo162543m4((BLiveCall) list.get(0));
    }

    /* JADX INFO: renamed from: H4 */
    public final /* synthetic */ void m193047H4(Throwable th) {
        this.f175818m.m162527V3(th);
    }

    /* JADX INFO: renamed from: I4 */
    public final /* synthetic */ void m193048I4(BLiveCall bLiveCall) {
        this.f175818m.mo162543m4(bLiveCall);
    }

    /* JADX INFO: renamed from: J4 */
    public final /* synthetic */ void m193049J4(Throwable th) {
        this.f175818m.m162527V3(th);
    }

    /* JADX INFO: renamed from: K4 */
    public final /* synthetic */ void m193050K4(e30 e30Var, Boolean bool) {
        if (e30Var != null) {
            e30Var.call(bool);
        }
        this.f175820o = bool.booleanValue();
    }

    /* JADX INFO: renamed from: N4 */
    public final /* synthetic */ void m193053N4(String str, View view) {
        this.f175817l.dismiss();
        m193038m4(str);
    }

    /* JADX INFO: renamed from: O4 */
    public final /* synthetic */ void m193054O4(String str, View view) {
        this.f175817l.dismiss();
        m193061W4(str);
    }

    /* JADX INFO: renamed from: P4 */
    public final /* synthetic */ void m193055P4(String str, TextView textView, Long l2) {
        long jLongValue = 30 - l2.longValue();
        if (jLongValue > 0) {
            textView.setText(String.format(this.f188513f.getString(R$string.f47041Wb), Long.valueOf(jLongValue)));
        } else {
            m193061W4(str);
            this.f175817l.dismiss();
        }
    }

    /* JADX INFO: renamed from: Q4 */
    public final /* synthetic */ void m193056Q4(final String str, String str2, View view) {
        ((TextView) view.findViewById(g5c0.f100666D0)).setText(R$string.f47009V0);
        TextView textView = (TextView) view.findViewById(g5c0.f100872a);
        textView.setText(R$string.f46946S0);
        textView.setOnClickListener(new View.OnClickListener() { // from class: l.tcd0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f169435a.m193053N4(str, view2);
            }
        });
        final TextView textView2 = (TextView) view.findViewById(g5c0.f100923f0);
        textView2.setText(str2);
        textView2.setOnClickListener(new View.OnClickListener() { // from class: l.tbd0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f169249a.m193054O4(str, view2);
            }
        });
        m193067c5(new e30() { // from class: l.ubd0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f175680a.m193055P4(str, textView2, (Long) obj);
            }
        });
    }

    /* JADX INFO: renamed from: R4 */
    public final /* synthetic */ void m193057R4(BLiveCall bLiveCall) {
        m193078v4();
    }

    /* JADX INFO: renamed from: S4 */
    public final /* synthetic */ void m193058S4(iqv iqvVar) {
        m193078v4();
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: T */
    public void mo70198T() {
        super.mo70198T();
        lifecycle().subscribe(ffw.m121193d(new e30() { // from class: l.sbd0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f163518a.m193039x4((C4319c) obj);
            }
        }));
        m193063Y4(null);
    }

    /* JADX INFO: renamed from: T4 */
    public void m193059T4() {
        if (this.f175815j) {
            return;
        }
        this.f175815j = true;
        m206028F2().MomoSdkEvent.sdkActionEvent().mo172463j(2);
    }

    /* JADX INFO: renamed from: U4 */
    public void m193060U4() {
        this.f175815j = false;
        if (act().isFinishing()) {
            return;
        }
        m206028F2().MomoSdkEvent.sdkActionEvent().mo172463j(1);
    }

    /* JADX INFO: renamed from: W4 */
    public final void m193061W4(String str) {
        lsi0.m151593w(R$string.f46821M1);
        mkd0.m154992z(this.f175816k);
        duringCreated(LivingNormalApiProvider.m71348T6(str)).subscribe(ffw.m121194e(new e30() { // from class: l.xbd0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f191942a.m193046G4((List) obj);
            }
        }, new e30() { // from class: l.ybd0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f197327a.m193047H4((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: X4 */
    public void m193062X4(String str) {
        duringCreated(LivingNormalApiProvider.m71394Y7(str)).subscribe(ffw.m121194e(new e30() { // from class: l.icd0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f112450a.m193048I4((BLiveCall) obj);
            }
        }, new e30() { // from class: l.jcd0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f117287a.m193049J4((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: Y4 */
    public void m193063Y4(final e30<Boolean> e30Var) {
        duringCreated(LivingNormalApiProvider.m71619x7()).subscribe(ffw.m121194e(new e30() { // from class: l.rcd0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f158762a.m193050K4(e30Var, (Boolean) obj);
            }
        }, new e30() { // from class: l.scd0
            @Override // p149l.e30
            public final void call(Object obj) {
                ucd0.m193016R3((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: Z4 */
    public final void m193064Z4() {
        this.f175819n = this.f188513f.dialog().m20507G0(this.f188513f.getString(R$string.f46602C1)).m20504F(this.f188513f.getString(R$string.f47030W0)).m20560v0(this.f188513f.getString(R$string.f47668z5), new Runnable() { // from class: l.gcd0
            @Override // java.lang.Runnable
            public final void run() {
                this.f102003a.m193051L4();
            }
        }).m20544n0(this.f188513f.getString(R$string.f46842N1), new Runnable() { // from class: l.hcd0
            @Override // java.lang.Runnable
            public final void run() {
                this.f107039a.m193052M4();
            }
        }).m20568z0();
    }

    /* JADX INFO: renamed from: a5 */
    public final void m193065a5(String str) {
        ((rbd0) this.viewModel).m178594s(str);
        if (!PermissionHelper.m79881b("android.permission.CAMERA")) {
            m193071o4();
            return;
        }
        ((rbd0) this.viewModel).m178584e();
        m193074r4();
        m193077u4();
    }

    /* JADX INFO: renamed from: b5 */
    public final void m193066b5(final String str) {
        final String str2 = String.format(this.f188513f.getString(R$string.f47041Wb), 30L);
        DialogC12611a dialogC12611a = new DialogC12611a(this.f175818m, t6c0.f168178S2, j2g0.m139459f());
        this.f175817l = dialogC12611a;
        dialogC12611a.setCancelable(false);
        this.f175817l.m71776h0(new e30() { // from class: l.qcd0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f153741a.m193056Q4(str, str2, (View) obj);
            }
        });
        this.f175817l.show();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.ho2] */
    /* JADX INFO: renamed from: c5 */
    public final void m193067c5(final e30<Long> e30Var) {
        this.f175816k = m129299H3(m206027E2().m132139i2(TimeUnit.SECONDS)).subscribe(ffw.m121193d(new e30() { // from class: l.zbd0
            @Override // p149l.e30
            public final void call(Object obj) {
                e30Var.call((Long) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: d5 */
    public void m193068d5(String str) {
        lsi0.m151593w(R$string.f46646E1);
        m193062X4(str);
        if (((oxl) m129297F3(new rv00(4400))).mo133471a().m71900c1(MotionParams.PusherMotionEnum.MOTION_CALL_AUDIENCE)) {
            m193078v4();
            m206028F2().CallEvent.delayStartVideoPreview().m172467p();
        }
    }

    /* JADX INFO: renamed from: e5 */
    public void m193069e5() {
        ((zwl) m129297F3(new tt00(4400))).mo185824f();
    }

    @Override // p149l.h4t, p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: n */
    public void mo69117n() {
        super.mo69117n();
        m193078v4();
    }

    /* JADX INFO: renamed from: n4 */
    public final void m193070n4(String str) {
        uep0.m193327n(this.f175817l);
    }

    /* JADX INFO: renamed from: o4 */
    public void m193071o4() {
        PermissionHelper.m79882c().m79900r("android.permission.CAMERA").m79905w(false).m79903u(true).m79892j(false).m79897o(new d30() { // from class: l.acd0
            @Override // p149l.d30
            public final void call() {
                this.f68790a.m193040A4();
            }
        }).m79891i(this.f188513f);
    }

    /* JADX INFO: renamed from: p4, reason: merged with bridge method [inline-methods] */
    public final void m193052M4() {
        uep0.m193327n(this.f175819n);
    }

    /* JADX INFO: renamed from: q4 */
    public final void m193073q4(String str) {
        duringCreated(LivingNormalApiProvider.m71376W7(str)).subscribe(ffw.m121194e(new e30() { // from class: l.kcd0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f122313a.m193041B4((BLiveCall) obj);
            }
        }, new e30() { // from class: l.lcd0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f127396a.m193042C4((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: r4 */
    public void m193074r4() {
        if (this.f175820o) {
            return;
        }
        m193063Y4(new e30() { // from class: l.bcd0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f74915a.m193043D4((Boolean) obj);
            }
        });
    }

    /* JADX INFO: renamed from: s4 */
    public void m193075s4(final String str) {
        this.f175821p = act().dialog().m20500D(R$string.f47115a1).m20556t0(R$string.f46884P1, new Runnable() { // from class: l.ecd0
            @Override // java.lang.Runnable
            public final void run() {
                this.f90492a.m193044E4(str);
            }
        }).m20542l0(R$string.f47598w1, new Runnable() { // from class: l.fcd0
            @Override // java.lang.Runnable
            public final void run() {
                ucd0.m193013N3();
            }
        }).m20568z0();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r0v8, types: [l.ho2, l.lh20] */
    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        duringCreated(m206027E2().m132160q1().m189101f()).subscribe(new e30() { // from class: l.dcd0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f85395a.m193021V4((LiveCallMessage) obj);
            }
        });
        duringCreated(this.f175818m.m201768O4()).filter(new w9j() { // from class: l.mcd0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(v44.m196938f((BLiveCall) obj));
            }
        }).subscribe(ffw.m121193d(new e30() { // from class: l.ncd0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f138148a.m193057R4((BLiveCall) obj);
            }
        }));
        duringCreated(m206027E2().m149815l()).filter(new w9j() { // from class: l.ocd0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((iqv) obj).m137796c());
            }
        }).subscribe(ffw.m121193d(new e30() { // from class: l.pcd0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f148167a.m193058S4((iqv) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: t4 */
    public void m193076t4(final String str) {
        if (!PermissionHelper.m79881b("android.permission.CAMERA")) {
            m193071o4();
        } else if (this.f175820o) {
            m193068d5(str);
        } else {
            m193063Y4(new e30() { // from class: l.ccd0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f80226a.m193045F4(str, (Boolean) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: u4 */
    public final void m193077u4() {
        ((rbd0) this.viewModel).m178589l().removeAllViews();
        C12714b c12714bMo133471a = ((oxl) m129297F3(new rv00(4400))).mo133471a();
        if (c12714bMo133471a.m71900c1(MotionParams.PusherMotionEnum.MOTION_CALL_AUDIENCE)) {
            ((w04) c12714bMo133471a).m200826t1(act(), ((rbd0) this.viewModel).m178589l());
        }
    }

    /* JADX INFO: renamed from: v4 */
    public void m193078v4() {
        zwl zwlVar = (zwl) m129297F3(new tt00(4400));
        if (zwlVar != null) {
            zwlVar.mo185819a();
        }
        ((rbd0) this.viewModel).m178588k();
        uep0.m193327n(this.f175819n);
        uep0.m193327n(this.f175821p);
    }

    /* JADX INFO: renamed from: w4, reason: merged with bridge method [inline-methods] */
    public final void m193051L4() {
        this.f188513f.startActivity(LiveWebViewAct.m68884d2(this.f188513f, ddv.f85662l, LiveWebViewAct.f44848m));
    }

    /* JADX INFO: renamed from: y4 */
    public final /* synthetic */ void m193080y4(String str, List list) {
        mkd0.m154992z(this.f175816k);
        this.f175818m.mo162543m4((BLiveCall) list.get(0));
        m193065a5(str);
    }

    /* JADX INFO: renamed from: z4 */
    public final /* synthetic */ void m193081z4(Throwable th) {
        this.f175818m.m162527V3(th);
    }
}
