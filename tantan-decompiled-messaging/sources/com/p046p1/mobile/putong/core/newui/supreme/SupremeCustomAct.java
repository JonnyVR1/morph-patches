package com.p046p1.mobile.putong.core.newui.supreme;

import android.content.Intent;
import com.effectsar.labcv.effectsdk.EffectsSDKEffectConstants;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.app.PutongMvpAct;
import com.tantanapp.common.utils.NullChecker;
import com.tencent.open.SocialConstants;
import io.agora.rtc2.internal.AudioRoutingController;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import p149l.e0h0;
import p149l.i30;
import p149l.m1h0;
import p149l.ri2;
import p149l.rw40;
import p149l.wq80;
import p149l.wzg0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m87231d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u0000 \u00122\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0013B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0005¨\u0006\u0014"}, m87232d2 = {"Lcom/p1/mobile/putong/core/newui/supreme/SupremeCustomAct;", "Lcom/p1/mobile/putong/app/PutongMvpAct;", "Ll/ri2;", "Ll/e0h0;", "<init>", "()V", "Y1", "()Ll/ri2;", "Z1", "()Ll/e0h0;", "", "pageId", "()Ljava/lang/String;", "", "shouldSwitchToTransparentStatus", "()Z", "", "setTransparentStatusBar", "Companion", "a", "member_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class SupremeCustomAct extends PutongMvpAct<ri2, e0h0> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.supreme.SupremeCustomAct$a, reason: from kotlin metadata */
    @Metadata(m87231d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u000f¨\u0006\u0011"}, m87232d2 = {"Lcom/p1/mobile/putong/core/newui/supreme/SupremeCustomAct$a;", "", "<init>", "()V", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "", "type", "Landroid/content/Intent;", "b", "(Lcom/p1/mobile/android/app/Act;I)Landroid/content/Intent;", "", "CUSTOM_TYPE", "Ljava/lang/String;", "TYPE_SUPREME", "I", "TYPE_ODIAMOND", "member_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: c */
        public static /* synthetic */ Intent m43600c(Companion companion, Act act, int i, int i2, Object obj) {
            if ((i2 & 2) != 0) {
                i = 1;
            }
            return companion.m43602b(act, i);
        }

        @JvmOverloads
        @NotNull
        /* JADX INFO: renamed from: a */
        public final Intent m43601a(@NotNull Act act) {
            act.getClass();
            return m43600c(this, act, 0, 2, null);
        }

        @JvmOverloads
        @NotNull
        /* JADX INFO: renamed from: b */
        public final Intent m43602b(@NotNull Act act, int type) {
            act.getClass();
            Intent intent = new Intent(act, (Class<?>) SupremeCustomAct.class);
            intent.putExtra("custom_type", type);
            return intent;
        }

        public Companion() {
        }
    }

    @Override // com.p046p1.mobile.putong.app.PutongMvpAct
    @NotNull
    /* JADX INFO: renamed from: Y1, reason: merged with bridge method [inline-methods] */
    public ri2 mo28672V1() {
        return getIntent().getIntExtra("custom_type", 1) == 2 ? new wq80(this) : new wzg0(this);
    }

    @Override // com.p046p1.mobile.putong.app.PutongMvpAct
    @NotNull
    /* JADX INFO: renamed from: Z1, reason: merged with bridge method [inline-methods] */
    public e0h0 mo28673X1() {
        e0h0 e0h0Var = new e0h0(this);
        if (getIntent().getIntExtra("custom_type", 1) == 2) {
            e0h0Var.m114224k(new rw40(e0h0Var));
            return e0h0Var;
        }
        e0h0Var.m114224k(new m1h0(e0h0Var));
        return e0h0Var;
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act, p149l.n3m
    @NotNull
    public String pageId() {
        return "p_custom_set_pop";
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct
    public void setTransparentStatusBar() {
        i30 supportActionBar;
        getWindow().getDecorView().setSystemUiVisibility(EffectsSDKEffectConstants.FaceSegmentConfig.BEFF_MOBILE_FACE_REST_MASK);
        getWindow().addFlags(Integer.MIN_VALUE);
        getWindow().clearFlags(AudioRoutingController.DEVICE_OUT_USB_HEADSET);
        getWindow().setStatusBarColor(0);
        setStatusBarColor(0);
        if (!NullChecker.m81303a(getSupportActionBar()) || (supportActionBar = getSupportActionBar()) == null) {
            return;
        }
        supportActionBar.mo134111A(0.0f);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct
    public boolean shouldSwitchToTransparentStatus() {
        return true;
    }
}
