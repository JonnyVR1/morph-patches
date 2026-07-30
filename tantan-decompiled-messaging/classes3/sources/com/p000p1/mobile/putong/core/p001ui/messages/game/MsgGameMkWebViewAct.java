package com.p000p1.mobile.putong.core.p001ui.messages.game;

import android.text.TextUtils;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.api.CoreInnerPush;
import com.p1.mobile.putong.core.api.c0;
import com.p1.mobile.putong.ui.webview.mk.MkWebViewAct;
import l.knb0;
import l.mkd0;
import p003l.e30;
import p003l.m250;
import p003l.su4;
import p003l.w9j;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class MsgGameMkWebViewAct extends MkWebViewAct implements c0.c {

    /* JADX INFO: renamed from: j */
    public static String f1678j = "";

    /* JADX INFO: renamed from: h */
    public String f1680h;

    /* JADX INFO: renamed from: g */
    public String f1679g = "game_auto_play";

    /* JADX INFO: renamed from: i */
    public int f1681i = 0;

    /* JADX INFO: renamed from: M0 */
    public void m2190M0(String str) {
        this.f1681i--;
        su4.m7639h();
        if (this.f1681i <= 0) {
            this.f1681i = 0;
            CoreModule.c.t1.t(this);
        }
    }

    public void finish() {
        super/*com.p1.mobile.android.app.Act*/.finish();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void initDataOnCreate() {
        super.initDataOnCreate();
        this.f1680h = getIntent().getStringExtra("game_conv_id");
        this.f1679g += this.f1680h;
        f1678j = this.f1680h;
    }

    public void initSubscription() {
        super.initSubscription();
        m2191p2();
    }

    public void onDestroyLifecycle() {
        super/*com.p1.mobile.putong.app.PutongAct*/.onDestroyLifecycle();
        CoreModule.c.t1.t(this);
        f1678j = "";
    }

    /* JADX INFO: renamed from: p2 */
    public final void m2191p2() {
        duringCreated(CoreModule.c.j1.d().filter(new w9j() { // from class: l.hz00
            @Override // p003l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((CoreInnerPush.a) obj).h == CoreInnerPush.InnerPushType.NEW_MSG);
            }
        })).subscribe((m250) mkd0.G(new e30() { // from class: l.iz00
            @Override // p003l.e30
            public final void call(Object obj) {
                CoreModule.P().i().b2((CoreInnerPush.a) obj);
            }
        }));
        duringCreated(CoreModule.c.f0.h2).subscribe((m250) mkd0.G(new e30() { // from class: l.jz00
            @Override // p003l.e30
            public final void call(Object obj) {
                this.f4764a.m2192q2((knb0) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: q2 */
    public final /* synthetic */ void m2192q2(knb0 knb0Var) {
        if (TextUtils.equals(this.f1680h, (CharSequence) knb0Var.a)) {
            if (((Integer) knb0Var.b).intValue() > 0) {
                m2193r2(((Integer) knb0Var.b).intValue());
            }
            CoreModule.P().i().w1(knb0Var);
        }
    }

    /* JADX INFO: renamed from: r2 */
    public final void m2193r2(int i) {
        int i2 = this.f1681i;
        if (i2 > 0) {
            this.f1681i = i2 + i;
            return;
        }
        int i3 = i2 + i;
        this.f1681i = i3;
        this.f1681i = Math.min(3, i3);
        c0.a aVar = new c0.a();
        aVar.a(false).d(this).g(this.f1679g).h(1L).b(true).i(60000L);
        CoreModule.c.t1.r(aVar);
    }
}
