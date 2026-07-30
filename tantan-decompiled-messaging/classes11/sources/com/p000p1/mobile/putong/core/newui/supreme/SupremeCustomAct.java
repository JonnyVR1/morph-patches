package com.p000p1.mobile.putong.core.newui.supreme;

import android.content.Context;
import android.content.Intent;
import com.p000p1.mobile.putong.miniwidget.MiniWidgetProvider;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.app.PutongMvpAct;
import com.tantanapp.common.utils.NullChecker;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import l.i30;
import org.jetbrains.annotations.NotNull;
import p009l.e0h0;
import p009l.m1h0;
import p009l.ri2;
import p009l.rw40;
import p009l.wq80;
import p009l.wzg0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u0000 \u00122\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0013B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0005¨\u0006\u0014"}, d2 = {"Lcom/p1/mobile/putong/core/newui/supreme/SupremeCustomAct;", "Lcom/p1/mobile/putong/app/PutongMvpAct;", "Ll/ri2;", "Ll/e0h0;", "<init>", "()V", "Y1", "()Ll/ri2;", "Z1", "()Ll/e0h0;", "", "pageId", "()Ljava/lang/String;", "", "shouldSwitchToTransparentStatus", "()Z", "", "setTransparentStatusBar", "Companion", "a", "member_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SupremeCustomAct extends PutongMvpAct<ri2, e0h0> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.supreme.SupremeCustomAct$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u000f¨\u0006\u0011"}, d2 = {"Lcom/p1/mobile/putong/core/newui/supreme/SupremeCustomAct$a;", "", "<init>", "()V", "Lcom/p1/mobile/android/app/Act;", "act", "", MiniWidgetProvider.KEY_TYPE, "Landroid/content/Intent;", "b", "(Lcom/p1/mobile/android/app/Act;I)Landroid/content/Intent;", "", "CUSTOM_TYPE", "Ljava/lang/String;", "TYPE_SUPREME", "I", "TYPE_ODIAMOND", "member_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: c */
        public static /* synthetic */ Intent m7850c(Companion companion, Act act, int i, int i2, Object obj) {
            if ((i2 & 2) != 0) {
                i = 1;
            }
            return companion.m7852b(act, i);
        }

        @JvmOverloads
        @NotNull
        /* JADX INFO: renamed from: a */
        public final Intent m7851a(@NotNull Act act) {
            act.getClass();
            return m7850c(this, act, 0, 2, null);
        }

        @JvmOverloads
        @NotNull
        /* JADX INFO: renamed from: b */
        public final Intent m7852b(@NotNull Act act, int type) {
            act.getClass();
            Intent intent = new Intent((Context) act, (Class<?>) SupremeCustomAct.class);
            intent.putExtra("custom_type", type);
            return intent;
        }

        public Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    /* JADX INFO: renamed from: Y1, reason: merged with bridge method [inline-methods] */
    public ri2 m7846V1() {
        return getIntent().getIntExtra("custom_type", 1) == 2 ? new wq80(this) : new wzg0(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    /* JADX INFO: renamed from: Z1, reason: merged with bridge method [inline-methods] */
    public e0h0 m7847X1() {
        e0h0 e0h0Var = new e0h0(this);
        if (getIntent().getIntExtra("custom_type", 1) == 2) {
            e0h0Var.m13597k(new rw40(e0h0Var));
            return e0h0Var;
        }
        e0h0Var.m13597k(new m1h0(e0h0Var));
        return e0h0Var;
    }

    @NotNull
    public String pageId() {
        return "p_custom_set_pop";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setTransparentStatusBar() {
        i30 supportActionBar;
        getWindow().getDecorView().setSystemUiVisibility(1280);
        getWindow().addFlags(Integer.MIN_VALUE);
        getWindow().clearFlags(67108864);
        getWindow().setStatusBarColor(0);
        setStatusBarColor(0);
        if (!NullChecker.a(getSupportActionBar()) || (supportActionBar = getSupportActionBar()) == null) {
            return;
        }
        supportActionBar.A(0.0f);
    }

    public boolean shouldSwitchToTransparentStatus() {
        return true;
    }
}
