package p153l;

import android.content.Context;
import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p137rx.subjects.C22507a;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m88120d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u000b\u0018\u0000 \u00152\u00020\u0001:\u0001\rB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tR8\u0010\u000f\u001a&\u0012\f\u0012\n \f*\u0004\u0018\u00010\u000b0\u000b \f*\u0012\u0012\f\u0012\n \f*\u0004\u0018\u00010\u000b0\u000b\u0018\u00010\n0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\u0013¨\u0006\u0016"}, m88121d2 = {"Ll/rsh0;", "", "<init>", "()V", "Ll/tsh0;", Constants.INAPP_DATA_TAG, "()Ll/tsh0;", "Ll/ssh0;", "c", "()Ll/ssh0;", "Lrx/subjects/a;", "", "kotlin.jvm.PlatformType", "a", "Lrx/subjects/a;", "screenShoot", "b", "Ll/tsh0;", "splashHelper", "Ll/ssh0;", "rewardHelper", "Companion", "putong-common_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public final class rsh0 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: d */
    @Nullable
    public static volatile rsh0 f164670d;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final C22507a<Unit> screenShoot;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public tsh0 splashHelper;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    public ssh0 rewardHelper;

    public rsh0() {
        this.screenShoot = C22507a.m222758b();
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: e */
    public static final rsh0 m182974e() {
        return INSTANCE.m182979a();
    }

    @JvmStatic
    /* JADX INFO: renamed from: f */
    public static final void m182975f(@NotNull Context context) {
        INSTANCE.m182980b(context);
    }

    @JvmStatic
    /* JADX INFO: renamed from: g */
    public static final void m182976g() {
        INSTANCE.m182981c();
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final ssh0 m182977c() {
        ssh0 ssh0Var = this.rewardHelper;
        if (ssh0Var != null) {
            return ssh0Var;
        }
        ssh0 ssh0Var2 = new ssh0("");
        this.rewardHelper = ssh0Var2;
        return ssh0Var2;
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final tsh0 m182978d() {
        tsh0 tsh0Var = this.splashHelper;
        if (tsh0Var != null) {
            return tsh0Var;
        }
        tsh0 tsh0Var2 = new tsh0("");
        this.splashHelper = tsh0Var2;
        return tsh0Var2;
    }

    /* JADX INFO: renamed from: l.rsh0$a, reason: from kotlin metadata */
    @Metadata(m88120d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0007¢\u0006\u0004\b\f\u0010\u0003R\u0018\u0010\r\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m88121d2 = {"Ll/rsh0$a;", "", "<init>", "()V", "Ll/rsh0;", "a", "()Ll/rsh0;", "Landroid/content/Context;", "context", "", "b", "(Landroid/content/Context;)V", "c", "instance", "Ll/rsh0;", "putong-common_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        /* JADX INFO: renamed from: a */
        public final rsh0 m182979a() {
            rsh0 rsh0Var;
            rsh0 rsh0Var2 = rsh0.f164670d;
            if (rsh0Var2 != null) {
                return rsh0Var2;
            }
            synchronized (this) {
                rsh0Var = rsh0.f164670d;
                if (rsh0Var == null) {
                    rsh0Var = new rsh0(null);
                    rsh0.f164670d = rsh0Var;
                }
            }
            return rsh0Var;
        }

        @JvmStatic
        /* JADX INFO: renamed from: b */
        public final void m182980b(@NotNull Context context) {
            context.getClass();
        }

        @JvmStatic
        /* JADX INFO: renamed from: c */
        public final void m182981c() {
            rsh0.f164670d = null;
        }

        public Companion() {
        }
    }

    public /* synthetic */ rsh0(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
