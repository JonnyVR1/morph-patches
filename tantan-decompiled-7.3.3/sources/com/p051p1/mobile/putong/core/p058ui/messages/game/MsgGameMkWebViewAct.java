package com.p051p1.mobile.putong.core.p058ui.messages.game;

import android.text.TextUtils;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.CoreInnerPush;
import com.p051p1.mobile.putong.core.api.RunnableC4884c0;
import com.p051p1.mobile.putong.p070ui.webview.p073mk.MkWebViewAct;
import p153l.ovb0;
import p153l.psd0;
import p153l.qcj;
import p153l.rv4;
import p153l.y20;

/* JADX INFO: loaded from: classes3.dex */
public class MsgGameMkWebViewAct extends MkWebViewAct implements RunnableC4884c0.c {

    /* JADX INFO: renamed from: j */
    public static String f32635j = "";

    /* JADX INFO: renamed from: h */
    public String f32637h;

    /* JADX INFO: renamed from: g */
    public String f32636g = "game_auto_play";

    /* JADX INFO: renamed from: i */
    public int f32638i = 0;

    @Override // com.p051p1.mobile.putong.core.api.RunnableC4884c0.c
    /* JADX INFO: renamed from: M0 */
    public void mo32529M0(String str) {
        this.f32638i--;
        rv4.m183258h();
        if (this.f32638i <= 0) {
            this.f32638i = 0;
            CoreModule.f18264c.f20427t1.m32518t(this);
        }
    }

    @Override // com.p051p1.mobile.android.app.Act, android.app.Activity
    /* JADX INFO: renamed from: finish */
    public void m68056e2() {
        super.m68056e2();
    }

    @Override // com.p051p1.mobile.putong.p070ui.webview.p073mk.MkWebViewAct, com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initDataOnCreate() {
        super.initDataOnCreate();
        this.f32637h = getIntent().getStringExtra("game_conv_id");
        this.f32636g += this.f32637h;
        f32635j = this.f32637h;
    }

    @Override // com.p051p1.mobile.putong.p070ui.webview.p073mk.MkWebViewAct, com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        m50275q2();
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void onDestroyLifecycle() {
        super.onDestroyLifecycle();
        CoreModule.f18264c.f20427t1.m32518t(this);
        f32635j = "";
    }

    /* JADX INFO: renamed from: q2 */
    public final void m50275q2() {
        duringCreated(CoreModule.f18264c.f20397j1.m31125d().filter(new qcj() { // from class: l.r710
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((CoreInnerPush.C4867a) obj).f19923h == CoreInnerPush.InnerPushType.NEW_MSG);
            }
        })).subscribe(psd0.m173596G(new y20() { // from class: l.s710
            @Override // p153l.y20
            public final void call(Object obj) {
                CoreModule.m30933P().m143412i().mo180443b2((CoreInnerPush.C4867a) obj);
            }
        }));
        duringCreated(CoreModule.f18264c.f20384f0.f20684h2).subscribe(psd0.m173596G(new y20() { // from class: l.t710
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f172390a.m50276r2((ovb0) obj);
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: r2 */
    public final /* synthetic */ void m50276r2(ovb0 ovb0Var) {
        if (TextUtils.equals(this.f32637h, (CharSequence) ovb0Var.f149248a)) {
            if (((Integer) ovb0Var.f149249b).intValue() > 0) {
                m50277s2(((Integer) ovb0Var.f149249b).intValue());
            }
            CoreModule.m30933P().m143412i().mo180552w1(ovb0Var);
        }
    }

    /* JADX INFO: renamed from: s2 */
    public final void m50277s2(int i) {
        int i2 = this.f32638i;
        if (i2 > 0) {
            this.f32638i = i2 + i;
            return;
        }
        int i3 = i2 + i;
        this.f32638i = i3;
        this.f32638i = Math.min(3, i3);
        RunnableC4884c0.a aVar = new RunnableC4884c0.a();
        aVar.m32520a(false).m32523d(this).m32526g(this.f32636g).m32527h(1L).m32521b(true).m32528i(Constants.ONE_MIN_IN_MILLIS);
        CoreModule.f18264c.f20427t1.m32516r(aVar);
    }
}
