package com.p046p1.mobile.putong.core.p053ui.quickaudio.newquickchat.searchingPage;

import android.os.Bundle;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.app.PutongMvpAct;
import com.p046p1.mobile.putong.core.data.Active;
import io.agora.rtc2.internal.AudioRoutingController;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.cyb0;
import p149l.i30;
import p149l.vxb0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m87231d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0007\u0010\u0005J\u000f\u0010\b\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\f\u0010\u0005J\u000f\u0010\r\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\r\u0010\u0005J\r\u0010\u000e\u001a\u00020\u0006¢\u0006\u0004\b\u000e\u0010\u0005J\u0019\u0010\u0011\u001a\u00020\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0019\u0010\u0005J\u0015\u0010\u001b\u001a\n \u001a*\u0004\u0018\u00010\u00030\u0003¢\u0006\u0004\b\u001b\u0010\u000bR\"\u0010!\u001a\u00020\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u0018\"\u0004\b\u001f\u0010 ¨\u0006\""}, m87232d2 = {"Lcom/p1/mobile/putong/core/ui/quickaudio/newquickchat/searchingPage/QuickChatSearchingAct;", "Lcom/p1/mobile/putong/app/PutongMvpAct;", "Ll/vxb0;", "Ll/cyb0;", "<init>", "()V", "", "initDataOnCreate", "b2", "()Ll/vxb0;", "c2", "()Ll/cyb0;", "setTransparentStatusBar", "onAttachedToWindow", "Y1", "Landroid/os/Bundle;", "sis", "preCreateView", "(Landroid/os/Bundle;)V", "", "shouldSwitchToTransparentStatus", "()Z", "", "pageId", "()Ljava/lang/String;", "onBackPressed", "kotlin.jvm.PlatformType", "a2", "e", "Ljava/lang/String;", "Z1", "setActive", "(Ljava/lang/String;)V", Active.TYPE, "b_core_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
@SourceDebugExtension
public final class QuickChatSearchingAct extends PutongMvpAct<vxb0, cyb0> {

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public String active = "text_quick_chat";

    /* JADX INFO: renamed from: Y1 */
    public final void m54496Y1() {
        getWindow().getDecorView().setSystemUiVisibility(1792);
        getWindow().setNavigationBarColor(0);
    }

    @NotNull
    /* JADX INFO: renamed from: Z1, reason: from getter */
    public final String getActive() {
        return this.active;
    }

    /* JADX INFO: renamed from: a2 */
    public final cyb0 m54498a2() {
        return (cyb0) this.f17173d;
    }

    @Override // com.p046p1.mobile.putong.app.PutongMvpAct
    @NotNull
    /* JADX INFO: renamed from: b2, reason: merged with bridge method [inline-methods] */
    public vxb0 mo28672V1() {
        return new vxb0(this);
    }

    @Override // com.p046p1.mobile.putong.app.PutongMvpAct
    @NotNull
    /* JADX INFO: renamed from: c2, reason: merged with bridge method [inline-methods] */
    public cyb0 mo28673X1() {
        return new cyb0(this);
    }

    @Override // com.p046p1.mobile.putong.app.PutongMvpAct, com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
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
        m54496Y1();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        ((cyb0) this.f17173d).m109257B();
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act, p149l.n3m
    @NotNull
    public String pageId() {
        return "p_quickchat";
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
}
