package com.p046p1.mobile.putong.core.p053ui;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.os.Bundle;
import android.view.View;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.app.PutongMvpAct;
import io.agora.rtc2.internal.AudioRoutingController;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.b2s;
import p149l.i30;
import p149l.nn3;
import p149l.sub0;
import p149l.vwb;
import p149l.zn3;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m87231d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\rJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0006J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0015\u0010\u0006J\u000f\u0010\u0016\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0016\u0010\u0006J\u000f\u0010\u0017\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0017\u0010\u0006J\u0019\u0010\u001a\u001a\u00020\u000f2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u000fH\u0014¢\u0006\u0004\b\"\u0010\u0006J\u000f\u0010#\u001a\u00020\u001cH\u0014¢\u0006\u0004\b#\u0010\u001e¨\u0006$"}, m87232d2 = {"Lcom/p1/mobile/putong/core/ui/BuzzComboAct;", "Lcom/p1/mobile/putong/app/PutongMvpAct;", "Ll/nn3;", "Ll/zn3;", "Ll/sub0;", "<init>", "()V", "Y1", "()Ll/nn3;", "Z1", "()Ll/zn3;", "Landroid/view/View;", b2s.C_ZONE, "()Landroid/view/View;", "p", "", "stop", "Landroid/animation/Animator;", "B", "()Landroid/animation/Animator;", "exitAnimation", "w", "setTransparentStatusBar", "onAttachedToWindow", "Landroid/os/Bundle;", "sis", "preCreateView", "(Landroid/os/Bundle;)V", "", "shouldSwitchToTransparentStatus", "()Z", "", "pageId", "()Ljava/lang/String;", "initPageHelper", "needBindBillingService", "buzz_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class BuzzComboAct extends PutongMvpAct<nn3, zn3> implements sub0 {
    @Override // p149l.sub0
    @NotNull
    /* JADX INFO: renamed from: B */
    public Animator mo41784B() {
        return new AnimatorSet();
    }

    @Override // p149l.sub0
    @NotNull
    /* JADX INFO: renamed from: C */
    public View mo41785C() {
        return ((zn3) this.f17173d).m219424J();
    }

    @Override // com.p046p1.mobile.putong.app.PutongMvpAct
    @NotNull
    /* JADX INFO: renamed from: Y1, reason: merged with bridge method [inline-methods] */
    public nn3 mo28672V1() {
        return new nn3(this);
    }

    @Override // com.p046p1.mobile.putong.app.PutongMvpAct
    @NotNull
    /* JADX INFO: renamed from: Z1, reason: merged with bridge method [inline-methods] */
    public zn3 mo28673X1() {
        return new zn3(this);
    }

    @Override // com.p046p1.mobile.android.app.Act
    @NotNull
    public Animator exitAnimation() {
        return new AnimatorSet();
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct
    public void initPageHelper() {
        super.initPageHelper();
        this.pageHelper.m109040p(vwb.m200311Y("buzz_entrance", "text"));
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct
    public boolean needBindBillingService() {
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        getWindow().getDecorView().setSystemUiVisibility(1792);
        getWindow().setNavigationBarColor(0);
    }

    @Override // p149l.sub0
    @NotNull
    /* JADX INFO: renamed from: p */
    public View mo41786p() {
        return ((zn3) this.f17173d).m219424J();
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act, p149l.n3m
    @NotNull
    public String pageId() {
        return "p_buzz_sum";
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void preCreateView(@Nullable Bundle sis) {
        setSwipeBackEnable(false);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct
    public void setTransparentStatusBar() {
        PutongAct.setLightStatusBar(this.act.getWindow(), 1024);
        getWindow().addFlags(Integer.MIN_VALUE);
        getWindow().clearFlags(AudioRoutingController.DEVICE_OUT_USB_HEADSET);
        getWindow().setStatusBarColor(0);
        setStatusBarColor(0);
        i30 supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.mo134111A(0.0f);
        }
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct
    public boolean shouldSwitchToTransparentStatus() {
        return true;
    }

    @Override // p149l.sub0
    public void stop() {
    }

    @Override // p149l.sub0
    /* JADX INFO: renamed from: w */
    public void mo41787w() {
    }
}
