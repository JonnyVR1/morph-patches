package com.p051p1.mobile.putong.core.p058ui.quickaudio.newquickchat.secondfloor;

import android.animation.Animator;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.app.PutongMvpAct;
import com.p051p1.mobile.putong.core.p058ui.quickaudio.newquickchat.secondfloor.QuickChatLoftAct;
import io.agora.rtc2.internal.AudioRoutingController;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.a4c0;
import p153l.c30;
import p153l.c4s;
import p153l.jyb;
import p153l.l51;
import p153l.s4c0;
import p153l.w2c0;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(m88120d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 &2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001'B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\u0006J\u0017\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0014¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0011\u0010\u0006J\u0019\u0010\u0013\u001a\u00020\u000b2\b\u0010\u0012\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0013\u0010\u0010J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u0017\u0010\u0006J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001e\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u001f\u0010\u0006J\u000f\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u000bH\u0016¢\u0006\u0004\b#\u0010\u0006J\r\u0010$\u001a\u00020\u0003¢\u0006\u0004\b$\u0010\nJ\u000f\u0010%\u001a\u00020 H\u0016¢\u0006\u0004\b%\u0010\"¨\u0006("}, m88121d2 = {"Lcom/p1/mobile/putong/core/ui/quickaudio/newquickchat/secondfloor/QuickChatLoftAct;", "Lcom/p1/mobile/putong/app/PutongMvpAct;", "Ll/a4c0;", "Ll/s4c0;", "Ll/w2c0;", "<init>", "()V", "b2", "()Ll/a4c0;", "c2", "()Ll/s4c0;", "", "setTransparentStatusBar", "Landroid/os/Bundle;", "savedInstanceState", "onRestoreInstanceState", "(Landroid/os/Bundle;)V", "onAttachedToWindow", "sis", "preCreateView", "", "shouldSwitchToTransparentStatus", "()Z", "initPageHelper", "", "pageId", "()Ljava/lang/String;", "Landroid/view/View;", "E", "()Landroid/view/View;", "q", "stop", "Landroid/animation/Animator;", c4s.C_ZONE, "()Landroid/animation/Animator;", "w", "a2", "exitAnimation", "Companion", "a", "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class QuickChatLoftAct extends PutongMvpAct<a4c0, s4c0> implements w2c0 {
    /* JADX INFO: renamed from: Z1 */
    public static void m55684Z1(QuickChatLoftAct quickChatLoftAct) {
        ((s4c0) quickChatLoftAct.f17892d).m184513m0();
    }

    @Override // p153l.w2c0
    @NotNull
    /* JADX INFO: renamed from: C */
    public Animator mo42795C() {
        if (TextUtils.equals(this.act.getIntent().getStringExtra("action"), "videoTips")) {
            l51.m152888H(this.act, new Runnable() { // from class: l.x2c0
                @Override // java.lang.Runnable
                public final void run() {
                    QuickChatLoftAct.m55684Z1(this.f192138a);
                }
            }, 500L);
        }
        return ((s4c0) this.f17892d).m184481C();
    }

    @Override // p153l.w2c0
    @NotNull
    /* JADX INFO: renamed from: E */
    public View mo42796E() {
        return ((s4c0) this.f17892d).m184489L();
    }

    @NotNull
    /* JADX INFO: renamed from: a2 */
    public final s4c0 m55685a2() {
        v v2 = this.f17892d;
        v2.getClass();
        return (s4c0) v2;
    }

    @Override // com.p051p1.mobile.putong.app.PutongMvpAct
    @NotNull
    /* JADX INFO: renamed from: b2, reason: merged with bridge method [inline-methods] */
    public a4c0 mo29671X1() {
        return new a4c0(this);
    }

    @Override // com.p051p1.mobile.putong.app.PutongMvpAct
    @NotNull
    /* JADX INFO: renamed from: c2, reason: merged with bridge method [inline-methods] */
    public s4c0 mo29672Y1() {
        return new s4c0(this);
    }

    @Override // com.p051p1.mobile.android.app.Act
    @NotNull
    public Animator exitAnimation() {
        return ((s4c0) this.f17892d).exitAnimation();
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct
    public void initPageHelper() {
        super.initPageHelper();
        String stringExtra = this.act.getIntent().getStringExtra("from");
        if (TextUtils.isEmpty(stringExtra)) {
            stringExtra = "messages_view";
        }
        this.pageHelper.m152781p(jyb.m147494Y("quickchat_from", stringExtra));
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        getWindow().getDecorView().setSystemUiVisibility(1792);
        getWindow().setNavigationBarColor(0);
    }

    @Override // android.app.Activity
    public void onRestoreInstanceState(@NotNull Bundle savedInstanceState) {
        savedInstanceState.getClass();
        super.onRestoreInstanceState(savedInstanceState);
        ((s4c0) this.f17892d).m184511j0(savedInstanceState);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act, p153l.e6m
    @NotNull
    public String pageId() {
        return "p_quickchat";
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void preCreateView(@Nullable Bundle sis) {
        setSwipeBackEnable(false);
    }

    @Override // p153l.w2c0
    @NotNull
    /* JADX INFO: renamed from: q */
    public View mo42797q() {
        return ((s4c0) this.f17892d).m184489L();
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct
    public void setTransparentStatusBar() {
        PutongAct.setLightStatusBar(this.act.getWindow(), 1024);
        getWindow().addFlags(Integer.MIN_VALUE);
        getWindow().clearFlags(AudioRoutingController.DEVICE_OUT_USB_HEADSET);
        getWindow().setStatusBarColor(0);
        setStatusBarColor(0);
        c30 supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.mo102168A(0.0f);
        }
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct
    public boolean shouldSwitchToTransparentStatus() {
        return true;
    }

    @Override // p153l.w2c0
    public void stop() {
    }

    @Override // p153l.w2c0
    /* JADX INFO: renamed from: w */
    public void mo42798w() {
        ((s4c0) this.f17892d).m184479A(false);
    }
}
