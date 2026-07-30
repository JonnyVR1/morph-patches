package com.p051p1.mobile.putong.core.p058ui;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.os.Bundle;
import android.view.View;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.app.PutongMvpAct;
import io.agora.rtc2.internal.AudioRoutingController;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.c30;
import p153l.c4s;
import p153l.jyb;
import p153l.no3;
import p153l.w2c0;
import p153l.zo3;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m88120d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\rJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0006J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0015\u0010\u0006J\u000f\u0010\u0016\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0016\u0010\u0006J\u000f\u0010\u0017\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0017\u0010\u0006J\u0019\u0010\u001a\u001a\u00020\u000f2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u000fH\u0014¢\u0006\u0004\b\"\u0010\u0006J\u000f\u0010#\u001a\u00020\u001cH\u0014¢\u0006\u0004\b#\u0010\u001e¨\u0006$"}, m88121d2 = {"Lcom/p1/mobile/putong/core/ui/BuzzComboAct;", "Lcom/p1/mobile/putong/app/PutongMvpAct;", "Ll/no3;", "Ll/zo3;", "Ll/w2c0;", "<init>", "()V", "Z1", "()Ll/no3;", "a2", "()Ll/zo3;", "Landroid/view/View;", "E", "()Landroid/view/View;", "q", "", "stop", "Landroid/animation/Animator;", c4s.C_ZONE, "()Landroid/animation/Animator;", "exitAnimation", "w", "setTransparentStatusBar", "onAttachedToWindow", "Landroid/os/Bundle;", "sis", "preCreateView", "(Landroid/os/Bundle;)V", "", "shouldSwitchToTransparentStatus", "()Z", "", "pageId", "()Ljava/lang/String;", "initPageHelper", "needBindBillingService", "buzz_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class BuzzComboAct extends PutongMvpAct<no3, zo3> implements w2c0 {
    @Override // p153l.w2c0
    @NotNull
    /* JADX INFO: renamed from: C */
    public Animator mo42795C() {
        return new AnimatorSet();
    }

    @Override // p153l.w2c0
    @NotNull
    /* JADX INFO: renamed from: E */
    public View mo42796E() {
        return ((zo3) this.f17892d).m220710J();
    }

    @Override // com.p051p1.mobile.putong.app.PutongMvpAct
    @NotNull
    /* JADX INFO: renamed from: Z1, reason: merged with bridge method [inline-methods] */
    public no3 mo29671X1() {
        return new no3(this);
    }

    @Override // com.p051p1.mobile.putong.app.PutongMvpAct
    @NotNull
    /* JADX INFO: renamed from: a2, reason: merged with bridge method [inline-methods] */
    public zo3 mo29672Y1() {
        return new zo3(this);
    }

    @Override // com.p051p1.mobile.android.app.Act
    @NotNull
    public Animator exitAnimation() {
        return new AnimatorSet();
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct
    public void initPageHelper() {
        super.initPageHelper();
        this.pageHelper.m152781p(jyb.m147494Y("buzz_entrance", "text"));
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct
    public boolean needBindBillingService() {
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        getWindow().getDecorView().setSystemUiVisibility(1792);
        getWindow().setNavigationBarColor(0);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act, p153l.e6m
    @NotNull
    public String pageId() {
        return "p_buzz_sum";
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void preCreateView(@Nullable Bundle sis) {
        setSwipeBackEnable(false);
    }

    @Override // p153l.w2c0
    @NotNull
    /* JADX INFO: renamed from: q */
    public View mo42797q() {
        return ((zo3) this.f17892d).m220710J();
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
    }
}
