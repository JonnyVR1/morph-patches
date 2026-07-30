package com.p051p1.mobile.putong.core.p058ui.quickaudio.newquickchat.searchingPage;

import android.os.Bundle;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.app.PutongMvpAct;
import com.p051p1.mobile.putong.core.data.Active;
import io.agora.rtc2.internal.AudioRoutingController;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.c30;
import p153l.g6c0;
import p153l.z5c0;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(m88120d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0007\u0010\u0005J\u000f\u0010\b\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\f\u0010\u0005J\u000f\u0010\r\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\r\u0010\u0005J\r\u0010\u000e\u001a\u00020\u0006¢\u0006\u0004\b\u000e\u0010\u0005J\u0019\u0010\u0011\u001a\u00020\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0019\u0010\u0005J\u0015\u0010\u001b\u001a\n \u001a*\u0004\u0018\u00010\u00030\u0003¢\u0006\u0004\b\u001b\u0010\u000bR\"\u0010!\u001a\u00020\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u0018\"\u0004\b\u001f\u0010 ¨\u0006\""}, m88121d2 = {"Lcom/p1/mobile/putong/core/ui/quickaudio/newquickchat/searchingPage/QuickChatSearchingAct;", "Lcom/p1/mobile/putong/app/PutongMvpAct;", "Ll/z5c0;", "Ll/g6c0;", "<init>", "()V", "", "initDataOnCreate", "c2", "()Ll/z5c0;", "d2", "()Ll/g6c0;", "setTransparentStatusBar", "onAttachedToWindow", "Z1", "Landroid/os/Bundle;", "sis", "preCreateView", "(Landroid/os/Bundle;)V", "", "shouldSwitchToTransparentStatus", "()Z", "", "pageId", "()Ljava/lang/String;", "onBackPressed", "kotlin.jvm.PlatformType", "b2", "e", "Ljava/lang/String;", "a2", "setActive", "(Ljava/lang/String;)V", Active.TYPE, "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public final class QuickChatSearchingAct extends PutongMvpAct<z5c0, g6c0> {

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public String active = "text_quick_chat";

    /* JADX INFO: renamed from: Z1 */
    public final void m55679Z1() {
        getWindow().getDecorView().setSystemUiVisibility(1792);
        getWindow().setNavigationBarColor(0);
    }

    @NotNull
    /* JADX INFO: renamed from: a2, reason: from getter */
    public final String getActive() {
        return this.active;
    }

    /* JADX INFO: renamed from: b2 */
    public final g6c0 m55681b2() {
        return (g6c0) this.f17892d;
    }

    @Override // com.p051p1.mobile.putong.app.PutongMvpAct
    @NotNull
    /* JADX INFO: renamed from: c2, reason: merged with bridge method [inline-methods] */
    public z5c0 mo29671X1() {
        return new z5c0(this);
    }

    @Override // com.p051p1.mobile.putong.app.PutongMvpAct
    @NotNull
    /* JADX INFO: renamed from: d2, reason: merged with bridge method [inline-methods] */
    public g6c0 mo29672Y1() {
        return new g6c0(this);
    }

    @Override // com.p051p1.mobile.putong.app.PutongMvpAct, com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initDataOnCreate() {
        super.initDataOnCreate();
        String stringExtra = this.act.getIntent().getStringExtra(Active.TYPE);
        if (stringExtra != null) {
            this.active = stringExtra;
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        m55679Z1();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        ((g6c0) this.f17892d).m129227B();
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
}
