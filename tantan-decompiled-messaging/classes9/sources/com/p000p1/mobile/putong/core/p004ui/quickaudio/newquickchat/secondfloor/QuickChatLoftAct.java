package com.p000p1.mobile.putong.core.p004ui.quickaudio.newquickchat.secondfloor;

import android.animation.Animator;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import com.p000p1.mobile.putong.app.PutongAct;
import com.p000p1.mobile.putong.app.PutongMvpAct;
import com.p000p1.mobile.putong.core.p004ui.quickaudio.newquickchat.secondfloor.QuickChatLoftAct;
import com.p1.mobile.android.app.Act;
import kotlin.Metadata;
import l.e51;
import l.i30;
import l.j760;
import l.sub0;
import l.vwb;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p006l.owb0;
import p006l.wvb0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 &2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001'B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\u0006J\u0017\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0014¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0011\u0010\u0006J\u0019\u0010\u0013\u001a\u00020\u000b2\b\u0010\u0012\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0013\u0010\u0010J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u0017\u0010\u0006J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001e\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u001f\u0010\u0006J\u000f\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u000bH\u0016¢\u0006\u0004\b#\u0010\u0006J\r\u0010$\u001a\u00020\u0003¢\u0006\u0004\b$\u0010\nJ\u000f\u0010%\u001a\u00020 H\u0016¢\u0006\u0004\b%\u0010\"¨\u0006("}, d2 = {"Lcom/p1/mobile/putong/core/ui/quickaudio/newquickchat/secondfloor/QuickChatLoftAct;", "Lcom/p1/mobile/putong/app/PutongMvpAct;", "Ll/wvb0;", "Ll/owb0;", "Ll/sub0;", "<init>", "()V", "a2", "()Ll/wvb0;", "b2", "()Ll/owb0;", "", "setTransparentStatusBar", "Landroid/os/Bundle;", "savedInstanceState", "onRestoreInstanceState", "(Landroid/os/Bundle;)V", "onAttachedToWindow", "sis", "preCreateView", "", "shouldSwitchToTransparentStatus", "()Z", "initPageHelper", "", "pageId", "()Ljava/lang/String;", "Landroid/view/View;", "C", "()Landroid/view/View;", "p", "stop", "Landroid/animation/Animator;", "B", "()Landroid/animation/Animator;", "w", "Z1", "exitAnimation", "Companion", "a", "b_core_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class QuickChatLoftAct extends PutongMvpAct<wvb0, owb0> implements sub0 {
    /* JADX INFO: renamed from: Y1 */
    public static void m7840Y1(QuickChatLoftAct quickChatLoftAct) {
        ((owb0) quickChatLoftAct.f1162d).m20903m0();
    }

    @NotNull
    /* JADX INFO: renamed from: B */
    public Animator m7841B() {
        if (TextUtils.equals(((Act) this).act.getIntent().getStringExtra("action"), "videoTips")) {
            e51.H(((Act) this).act, new Runnable() { // from class: l.tub0
                @Override // java.lang.Runnable
                public final void run() {
                    QuickChatLoftAct.m7840Y1(this.f22281a);
                }
            }, 500L);
        }
        return ((owb0) this.f1162d).m20869C();
    }

    @NotNull
    /* JADX INFO: renamed from: C */
    public View m7842C() {
        return ((owb0) this.f1162d).m20878L();
    }

    @NotNull
    /* JADX INFO: renamed from: Z1 */
    public final owb0 m7843Z1() {
        v v = this.f1162d;
        v.getClass();
        return (owb0) v;
    }

    @Override // com.p000p1.mobile.putong.app.PutongMvpAct
    @NotNull
    /* JADX INFO: renamed from: a2, reason: merged with bridge method [inline-methods] */
    public wvb0 mo571V1() {
        return new wvb0(this);
    }

    @Override // com.p000p1.mobile.putong.app.PutongMvpAct
    @NotNull
    /* JADX INFO: renamed from: b2, reason: merged with bridge method [inline-methods] */
    public owb0 mo572X1() {
        return new owb0(this);
    }

    @NotNull
    public Animator exitAnimation() {
        return ((owb0) this.f1162d).exitAnimation();
    }

    @Override // com.p000p1.mobile.putong.app.PutongAct
    public void initPageHelper() {
        super.initPageHelper();
        String stringExtra = ((Act) this).act.getIntent().getStringExtra("from");
        if (TextUtils.isEmpty(stringExtra)) {
            stringExtra = "messages_view";
        }
        this.pageHelper.p(new j760[]{vwb.Y("quickchat_from", stringExtra)});
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onAttachedToWindow() {
        super/*android.app.Activity*/.onAttachedToWindow();
        getWindow().getDecorView().setSystemUiVisibility(1792);
        getWindow().setNavigationBarColor(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onRestoreInstanceState(@NotNull Bundle savedInstanceState) {
        savedInstanceState.getClass();
        super/*android.app.Activity*/.onRestoreInstanceState(savedInstanceState);
        ((owb0) this.f1162d).m20901j0(savedInstanceState);
    }

    @NotNull
    /* JADX INFO: renamed from: p */
    public View m7846p() {
        return ((owb0) this.f1162d).m20878L();
    }

    @Override // com.p000p1.mobile.putong.app.PutongAct
    @NotNull
    public String pageId() {
        return "p_quickchat";
    }

    @Override // com.p000p1.mobile.putong.app.PutongAct
    public void preCreateView(@Nullable Bundle sis) {
        setSwipeBackEnable(false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p000p1.mobile.putong.app.PutongAct
    public void setTransparentStatusBar() {
        PutongAct.setLightStatusBar(((Act) this).act.getWindow(), 1024);
        getWindow().addFlags(Integer.MIN_VALUE);
        getWindow().clearFlags(67108864);
        getWindow().setStatusBarColor(0);
        setStatusBarColor(0);
        i30 supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.A(0.0f);
        }
    }

    @Override // com.p000p1.mobile.putong.app.PutongAct
    public boolean shouldSwitchToTransparentStatus() {
        return true;
    }

    public void stop() {
    }

    /* JADX INFO: renamed from: w */
    public void m7847w() {
        ((owb0) this.f1162d).m20867A(false);
    }
}
