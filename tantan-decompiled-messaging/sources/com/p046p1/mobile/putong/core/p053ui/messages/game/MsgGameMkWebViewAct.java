package com.p046p1.mobile.putong.core.p053ui.messages.game;

import android.text.TextUtils;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.CoreInnerPush;
import com.p046p1.mobile.putong.core.api.RunnableC4733c0;
import com.p046p1.mobile.putong.p065ui.webview.p068mk.MkWebViewAct;
import p149l.e30;
import p149l.knb0;
import p149l.mkd0;
import p149l.su4;
import p149l.w9j;

/* JADX INFO: loaded from: classes3.dex */
public class MsgGameMkWebViewAct extends MkWebViewAct implements RunnableC4733c0.c {

    /* JADX INFO: renamed from: j */
    public static String f31787j = "";

    /* JADX INFO: renamed from: h */
    public String f31789h;

    /* JADX INFO: renamed from: g */
    public String f31788g = "game_auto_play";

    /* JADX INFO: renamed from: i */
    public int f31790i = 0;

    @Override // com.p046p1.mobile.putong.core.api.RunnableC4733c0.c
    /* JADX INFO: renamed from: M0 */
    public void mo31526M0(String str) {
        this.f31790i--;
        su4.m185998h();
        if (this.f31790i <= 0) {
            this.f31790i = 0;
            CoreModule.f17545c.f19685t1.m31515t(this);
        }
    }

    @Override // com.p046p1.mobile.android.app.Act, android.app.Activity
    /* JADX INFO: renamed from: finish */
    public void m66873d2() {
        super.m66873d2();
    }

    @Override // com.p046p1.mobile.putong.p065ui.webview.p068mk.MkWebViewAct, com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initDataOnCreate() {
        super.initDataOnCreate();
        this.f31789h = getIntent().getStringExtra("game_conv_id");
        this.f31788g += this.f31789h;
        f31787j = this.f31789h;
    }

    @Override // com.p046p1.mobile.putong.p065ui.webview.p068mk.MkWebViewAct, com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        m49092p2();
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void onDestroyLifecycle() {
        super.onDestroyLifecycle();
        CoreModule.f17545c.f19685t1.m31515t(this);
        f31787j = "";
    }

    /* JADX INFO: renamed from: p2 */
    public final void m49092p2() {
        duringCreated(CoreModule.f17545c.f19655j1.m30127d().filter(new w9j() { // from class: l.hz00
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((CoreInnerPush.C4716a) obj).f19182h == CoreInnerPush.InnerPushType.NEW_MSG);
            }
        })).subscribe(mkd0.m154955G(new e30() { // from class: l.iz00
            @Override // p149l.e30
            public final void call(Object obj) {
                CoreModule.m29935P().m94658i().mo158351b2((CoreInnerPush.C4716a) obj);
            }
        }));
        duringCreated(CoreModule.f17545c.f19642f0.f19942h2).subscribe(mkd0.m154955G(new e30() { // from class: l.jz00
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f120347a.m49093q2((knb0) obj);
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: q2 */
    public final /* synthetic */ void m49093q2(knb0 knb0Var) {
        if (TextUtils.equals(this.f31789h, (CharSequence) knb0Var.f123873a)) {
            if (((Integer) knb0Var.f123874b).intValue() > 0) {
                m49094r2(((Integer) knb0Var.f123874b).intValue());
            }
            CoreModule.m29935P().m94658i().mo158460w1(knb0Var);
        }
    }

    /* JADX INFO: renamed from: r2 */
    public final void m49094r2(int i) {
        int i2 = this.f31790i;
        if (i2 > 0) {
            this.f31790i = i2 + i;
            return;
        }
        int i3 = i2 + i;
        this.f31790i = i3;
        this.f31790i = Math.min(3, i3);
        RunnableC4733c0.a aVar = new RunnableC4733c0.a();
        aVar.m31517a(false).m31520d(this).m31523g(this.f31788g).m31524h(1L).m31518b(true).m31525i(Constants.ONE_MIN_IN_MILLIS);
        CoreModule.f17545c.f19685t1.m31513r(aVar);
    }
}
