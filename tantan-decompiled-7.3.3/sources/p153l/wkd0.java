package p153l;

import android.view.View;
import android.widget.TextView;
import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.android.app.Dialog;
import com.p051p1.mobile.putong.live.base.data.BLiveCall;
import com.p051p1.mobile.putong.live.base.webview.LiveWebViewAct;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.p051p1.mobile.putong.live.livingroom.archi.dialogcenter.DialogC12774a;
import com.p051p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveCallMessage;
import com.p051p1.mobile.putong.live.livingroom.archi.sdk.motion.base.C12877b;
import com.p051p1.mobile.putong.live.livingroom.archi.sdk.motion.base.MotionParams;
import com.p051p1.mobile.putong.p070ui.permission.PermissionHelper;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes5.dex */
public class wkd0 extends i6t<oo2, tjd0> {

    /* JADX INFO: renamed from: i */
    public final nv2 f189537i;

    /* JADX INFO: renamed from: j */
    public boolean f189538j;

    /* JADX INFO: renamed from: k */
    public kcg0 f189539k;

    /* JADX INFO: renamed from: l */
    public DialogC12774a f189540l;

    /* JADX INFO: renamed from: m */
    public zed0 f189541m;

    /* JADX INFO: renamed from: n */
    public Dialog f189542n;

    /* JADX INFO: renamed from: o */
    public boolean f189543o;

    /* JADX INFO: renamed from: p */
    public Dialog f189544p;

    public wkd0(dum dumVar, zed0 zed0Var) {
        super(dumVar);
        this.f189541m = zed0Var;
        this.f189537i = zed0Var.f203992l;
        mo52715C(new tjd0());
    }

    /* JADX INFO: renamed from: N3 */
    public static /* synthetic */ void m206746N3() {
    }

    /* JADX INFO: renamed from: R3 */
    public static /* synthetic */ void m206749R3(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V4 */
    public void m206754V4(LiveCallMessage liveCallMessage) {
        if (liveCallMessage.m73006is(12)) {
            m206799b5(liveCallMessage.getCallId());
        } else if (liveCallMessage.m73006is(13)) {
            m206803n4(liveCallMessage.getCallId());
            m206811v4();
        }
    }

    /* JADX INFO: renamed from: m4 */
    private void m206771m4(final String str) {
        duringCreated(LivingNormalApiProvider.m72798x3(str)).subscribe(dhw.m115826e(new y20() { // from class: l.xjd0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f194551a.m206813y4(str, (List) obj);
            }
        }, new y20() { // from class: l.yjd0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f200289a.m206814z4((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x4 */
    public void m206772x4(C4470c c4470c) {
        if (c4470c == C4470c.f16267i) {
            m206792T4();
        } else if (c4470c == C4470c.f16269k) {
            m206793U4();
        }
    }

    /* JADX INFO: renamed from: A4 */
    public final /* synthetic */ void m206773A4() {
        ((tjd0) this.viewModel).m191414e();
        m206810u4();
        m206807r4();
    }

    /* JADX INFO: renamed from: B4 */
    public final /* synthetic */ void m206774B4(BLiveCall bLiveCall) {
        this.f189541m.mo161660m4(bLiveCall);
    }

    /* JADX INFO: renamed from: C4 */
    public final /* synthetic */ void m206775C4(Throwable th) {
        this.f189541m.m161644V3(th);
    }

    /* JADX INFO: renamed from: D4 */
    public final /* synthetic */ void m206776D4(Boolean bool) {
        if (bool.booleanValue()) {
            return;
        }
        m206797Z4();
    }

    /* JADX INFO: renamed from: E4 */
    public final /* synthetic */ void m206777E4(String str) {
        m206806q4(str);
        m206811v4();
    }

    /* JADX INFO: renamed from: F4 */
    public final /* synthetic */ void m206778F4(String str, Boolean bool) {
        if (!bool.booleanValue()) {
            m206797Z4();
        } else {
            this.f189543o = true;
            m206801d5(str);
        }
    }

    /* JADX INFO: renamed from: G4 */
    public final /* synthetic */ void m206779G4(List list) {
        this.f189541m.mo161660m4((BLiveCall) list.get(0));
    }

    /* JADX INFO: renamed from: H4 */
    public final /* synthetic */ void m206780H4(Throwable th) {
        this.f189541m.m161644V3(th);
    }

    /* JADX INFO: renamed from: I4 */
    public final /* synthetic */ void m206781I4(BLiveCall bLiveCall) {
        this.f189541m.mo161660m4(bLiveCall);
    }

    /* JADX INFO: renamed from: J4 */
    public final /* synthetic */ void m206782J4(Throwable th) {
        this.f189541m.m161644V3(th);
    }

    /* JADX INFO: renamed from: K4 */
    public final /* synthetic */ void m206783K4(y20 y20Var, Boolean bool) {
        if (y20Var != null) {
            y20Var.call(bool);
        }
        this.f189543o = bool.booleanValue();
    }

    /* JADX INFO: renamed from: N4 */
    public final /* synthetic */ void m206786N4(String str, View view) {
        this.f189540l.dismiss();
        m206771m4(str);
    }

    /* JADX INFO: renamed from: O4 */
    public final /* synthetic */ void m206787O4(String str, View view) {
        this.f189540l.dismiss();
        m206794W4(str);
    }

    /* JADX INFO: renamed from: P4 */
    public final /* synthetic */ void m206788P4(String str, TextView textView, Long l2) {
        long jLongValue = 30 - l2.longValue();
        if (jLongValue > 0) {
            textView.setText(String.format(this.f196919f.getString(R$string.f47889Wb), Long.valueOf(jLongValue)));
        } else {
            m206794W4(str);
            this.f189540l.dismiss();
        }
    }

    /* JADX INFO: renamed from: Q4 */
    public final /* synthetic */ void m206789Q4(final String str, String str2, View view) {
        ((TextView) view.findViewById(mdc0.f135911D0)).setText(R$string.f47857V0);
        TextView textView = (TextView) view.findViewById(mdc0.f136117a);
        textView.setText(R$string.f47794S0);
        textView.setOnClickListener(new View.OnClickListener() { // from class: l.vkd0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f184475a.m206786N4(str, view2);
            }
        });
        final TextView textView2 = (TextView) view.findViewById(mdc0.f136168f0);
        textView2.setText(str2);
        textView2.setOnClickListener(new View.OnClickListener() { // from class: l.vjd0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f184374a.m206787O4(str, view2);
            }
        });
        m206800c5(new y20() { // from class: l.wjd0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f189433a.m206788P4(str, textView2, (Long) obj);
            }
        });
    }

    /* JADX INFO: renamed from: R4 */
    public final /* synthetic */ void m206790R4(BLiveCall bLiveCall) {
        m206811v4();
    }

    /* JADX INFO: renamed from: S4 */
    public final /* synthetic */ void m206791S4(jsv jsvVar) {
        m206811v4();
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: T */
    public void mo71381T() {
        super.mo71381T();
        lifecycle().subscribe(dhw.m115825d(new y20() { // from class: l.ujd0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f179204a.m206772x4((C4470c) obj);
            }
        }));
        m206796Y4(null);
    }

    /* JADX INFO: renamed from: T4 */
    public void m206792T4() {
        if (this.f189538j) {
            return;
        }
        this.f189538j = true;
        m213811F2().MomoSdkEvent.sdkActionEvent().mo199273j(2);
    }

    /* JADX INFO: renamed from: U4 */
    public void m206793U4() {
        this.f189538j = false;
        if (act().isFinishing()) {
            return;
        }
        m213811F2().MomoSdkEvent.sdkActionEvent().mo199273j(1);
    }

    /* JADX INFO: renamed from: W4 */
    public final void m206794W4(String str) {
        o1j0.m165649w(R$string.f47669M1);
        psd0.m173633z(this.f189539k);
        duringCreated(LivingNormalApiProvider.m72531T6(str)).subscribe(dhw.m115826e(new y20() { // from class: l.zjd0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f204658a.m206779G4((List) obj);
            }
        }, new y20() { // from class: l.akd0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f71985a.m206780H4((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: X4 */
    public void m206795X4(String str) {
        duringCreated(LivingNormalApiProvider.m72577Y7(str)).subscribe(dhw.m115826e(new y20() { // from class: l.kkd0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f127184a.m206781I4((BLiveCall) obj);
            }
        }, new y20() { // from class: l.lkd0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f132460a.m206782J4((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: Y4 */
    public void m206796Y4(final y20<Boolean> y20Var) {
        duringCreated(LivingNormalApiProvider.m72802x7()).subscribe(dhw.m115826e(new y20() { // from class: l.tkd0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f174705a.m206783K4(y20Var, (Boolean) obj);
            }
        }, new y20() { // from class: l.ukd0
            @Override // p153l.y20
            public final void call(Object obj) {
                wkd0.m206749R3((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: Z4 */
    public final void m206797Z4() {
        this.f189542n = this.f196919f.dialog().m21506G0(this.f196919f.getString(R$string.f47450C1)).m21503F(this.f196919f.getString(R$string.f47878W0)).m21559v0(this.f196919f.getString(R$string.f48516z5), new Runnable() { // from class: l.ikd0
            @Override // java.lang.Runnable
            public final void run() {
                this.f115353a.m206784L4();
            }
        }).m21543n0(this.f196919f.getString(R$string.f47690N1), new Runnable() { // from class: l.jkd0
            @Override // java.lang.Runnable
            public final void run() {
                this.f121398a.m206785M4();
            }
        }).m21567z0();
    }

    /* JADX INFO: renamed from: a5 */
    public final void m206798a5(String str) {
        ((tjd0) this.viewModel).m191424s(str);
        if (!PermissionHelper.m81064b("android.permission.CAMERA")) {
            m206804o4();
            return;
        }
        ((tjd0) this.viewModel).m191414e();
        m206807r4();
        m206810u4();
    }

    /* JADX INFO: renamed from: b5 */
    public final void m206799b5(final String str) {
        final String str2 = String.format(this.f196919f.getString(R$string.f47889Wb), 30L);
        DialogC12774a dialogC12774a = new DialogC12774a(this.f189541m, yec0.f198910S2, qag0.m175925f());
        this.f189540l = dialogC12774a;
        dialogC12774a.setCancelable(false);
        this.f189540l.m72959h0(new y20() { // from class: l.skd0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f169247a.m206789Q4(str, str2, (View) obj);
            }
        });
        this.f189540l.show();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.oo2] */
    /* JADX INFO: renamed from: c5 */
    public final void m206800c5(final y20<Long> y20Var) {
        this.f189539k = m138858H3(m213810E2().m168525i2(TimeUnit.SECONDS)).subscribe(dhw.m115825d(new y20() { // from class: l.bkd0
            @Override // p153l.y20
            public final void call(Object obj) {
                y20Var.call((Long) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: d5 */
    public void m206801d5(String str) {
        o1j0.m165649w(R$string.f47494E1);
        m206795X4(str);
        if (((h0m) m138856F3(new z310(4400))).mo133182a().m73083c1(MotionParams.PusherMotionEnum.MOTION_CALL_AUDIENCE)) {
            m206811v4();
            m213811F2().CallEvent.delayStartVideoPreview().m199277p();
        }
    }

    /* JADX INFO: renamed from: e5 */
    public void m206802e5() {
        ((szl) m138856F3(new c210(4400))).mo101587f();
    }

    @Override // p153l.i6t, p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: n */
    public void mo70300n() {
        super.mo70300n();
        m206811v4();
    }

    /* JADX INFO: renamed from: n4 */
    public final void m206803n4(String str) {
        ynp0.m216937n(this.f189540l);
    }

    /* JADX INFO: renamed from: o4 */
    public void m206804o4() {
        PermissionHelper.m81065c().m81083r("android.permission.CAMERA").m81088w(false).m81086u(true).m81075j(false).m81080o(new x20() { // from class: l.ckd0
            @Override // p153l.x20
            public final void call() {
                this.f82279a.m206773A4();
            }
        }).m81074i(this.f196919f);
    }

    /* JADX INFO: renamed from: p4, reason: merged with bridge method [inline-methods] */
    public final void m206785M4() {
        ynp0.m216937n(this.f189542n);
    }

    /* JADX INFO: renamed from: q4 */
    public final void m206806q4(String str) {
        duringCreated(LivingNormalApiProvider.m72559W7(str)).subscribe(dhw.m115826e(new y20() { // from class: l.mkd0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f137281a.m206774B4((BLiveCall) obj);
            }
        }, new y20() { // from class: l.nkd0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f142448a.m206775C4((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: r4 */
    public void m206807r4() {
        if (this.f189543o) {
            return;
        }
        m206796Y4(new y20() { // from class: l.dkd0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f89400a.m206776D4((Boolean) obj);
            }
        });
    }

    /* JADX INFO: renamed from: s4 */
    public void m206808s4(final String str) {
        this.f189544p = act().dialog().m21499D(R$string.f47963a1).m21555t0(R$string.f47732P1, new Runnable() { // from class: l.gkd0
            @Override // java.lang.Runnable
            public final void run() {
                this.f104726a.m206777E4(str);
            }
        }).m21541l0(R$string.f48446w1, new Runnable() { // from class: l.hkd0
            @Override // java.lang.Runnable
            public final void run() {
                wkd0.m206746N3();
            }
        }).m21567z0();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.oo2] */
    /* JADX WARN: Type inference failed for: r0v8, types: [l.oo2, l.vp20] */
    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        duringCreated(m213810E2().m168545q1().m98283f()).subscribe(new y20() { // from class: l.fkd0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f99500a.m206754V4((LiveCallMessage) obj);
            }
        });
        duringCreated(this.f189541m.m219441O4()).filter(new qcj() { // from class: l.okd0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(u54.m194526f((BLiveCall) obj));
            }
        }).subscribe(dhw.m115825d(new y20() { // from class: l.pkd0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f152826a.m206790R4((BLiveCall) obj);
            }
        }));
        duringCreated(m213810E2().m202192l()).filter(new qcj() { // from class: l.qkd0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((jsv) obj).m146877c());
            }
        }).subscribe(dhw.m115825d(new y20() { // from class: l.rkd0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f163559a.m206791S4((jsv) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: t4 */
    public void m206809t4(final String str) {
        if (!PermissionHelper.m81064b("android.permission.CAMERA")) {
            m206804o4();
        } else if (this.f189543o) {
            m206801d5(str);
        } else {
            m206796Y4(new y20() { // from class: l.ekd0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f94358a.m206778F4(str, (Boolean) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: u4 */
    public final void m206810u4() {
        ((tjd0) this.viewModel).m191419l().removeAllViews();
        C12877b c12877bMo133182a = ((h0m) m138856F3(new z310(4400))).mo133182a();
        if (c12877bMo133182a.m73083c1(MotionParams.PusherMotionEnum.MOTION_CALL_AUDIENCE)) {
            ((v14) c12877bMo133182a).m198973t1(act(), ((tjd0) this.viewModel).m191419l());
        }
    }

    /* JADX INFO: renamed from: v4 */
    public void m206811v4() {
        szl szlVar = (szl) m138856F3(new c210(4400));
        if (szlVar != null) {
            szlVar.mo101582a();
        }
        ((tjd0) this.viewModel).m191418k();
        ynp0.m216937n(this.f189542n);
        ynp0.m216937n(this.f189544p);
    }

    /* JADX INFO: renamed from: w4, reason: merged with bridge method [inline-methods] */
    public final void m206784L4() {
        this.f196919f.startActivity(LiveWebViewAct.m70067e2(this.f196919f, efv.f93855l, LiveWebViewAct.f45696m));
    }

    /* JADX INFO: renamed from: y4 */
    public final /* synthetic */ void m206813y4(String str, List list) {
        psd0.m173633z(this.f189539k);
        this.f189541m.mo161660m4((BLiveCall) list.get(0));
        m206798a5(str);
    }

    /* JADX INFO: renamed from: z4 */
    public final /* synthetic */ void m206814z4(Throwable th) {
        this.f189541m.m161644V3(th);
    }
}
