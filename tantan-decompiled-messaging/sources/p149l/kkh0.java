package p149l;

import android.content.Context;
import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p133rx.subjects.C22392a;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m87231d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u000b\u0018\u0000 \u00152\u00020\u0001:\u0001\rB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tR8\u0010\u000f\u001a&\u0012\f\u0012\n \f*\u0004\u0018\u00010\u000b0\u000b \f*\u0012\u0012\f\u0012\n \f*\u0004\u0018\u00010\u000b0\u000b\u0018\u00010\n0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\u0013¨\u0006\u0016"}, m87232d2 = {"Ll/kkh0;", "", "<init>", "()V", "Ll/mkh0;", Constants.INAPP_DATA_TAG, "()Ll/mkh0;", "Ll/lkh0;", "c", "()Ll/lkh0;", "Lrx/subjects/a;", "", "kotlin.jvm.PlatformType", "a", "Lrx/subjects/a;", "screenShoot", "b", "Ll/mkh0;", "splashHelper", "Ll/lkh0;", "rewardHelper", "Companion", "putong-common_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
@SourceDebugExtension
public final class kkh0 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: d */
    @Nullable
    public static volatile kkh0 f123557d;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final C22392a<Unit> screenShoot;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public mkh0 splashHelper;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    public lkh0 rewardHelper;

    public kkh0() {
        this.screenShoot = C22392a.m221512b();
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: e */
    public static final kkh0 m146325e() {
        return INSTANCE.m146330a();
    }

    @JvmStatic
    /* JADX INFO: renamed from: f */
    public static final void m146326f(@NotNull Context context) {
        INSTANCE.m146331b(context);
    }

    @JvmStatic
    /* JADX INFO: renamed from: g */
    public static final void m146327g() {
        INSTANCE.m146332c();
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final lkh0 m146328c() {
        lkh0 lkh0Var = this.rewardHelper;
        if (lkh0Var != null) {
            return lkh0Var;
        }
        lkh0 lkh0Var2 = new lkh0("");
        this.rewardHelper = lkh0Var2;
        return lkh0Var2;
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final mkh0 m146329d() {
        mkh0 mkh0Var = this.splashHelper;
        if (mkh0Var != null) {
            return mkh0Var;
        }
        mkh0 mkh0Var2 = new mkh0("");
        this.splashHelper = mkh0Var2;
        return mkh0Var2;
    }

    /* JADX INFO: renamed from: l.kkh0$a, reason: from kotlin metadata */
    @Metadata(m87231d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0007¢\u0006\u0004\b\f\u0010\u0003R\u0018\u0010\r\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m87232d2 = {"Ll/kkh0$a;", "", "<init>", "()V", "Ll/kkh0;", "a", "()Ll/kkh0;", "Landroid/content/Context;", "context", "", "b", "(Landroid/content/Context;)V", "c", "instance", "Ll/kkh0;", "putong-common_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        /* JADX INFO: renamed from: a */
        public final kkh0 m146330a() {
            kkh0 kkh0Var;
            kkh0 kkh0Var2 = kkh0.f123557d;
            if (kkh0Var2 != null) {
                return kkh0Var2;
            }
            synchronized (this) {
                kkh0Var = kkh0.f123557d;
                if (kkh0Var == null) {
                    kkh0Var = new kkh0(null);
                    kkh0.f123557d = kkh0Var;
                }
            }
            return kkh0Var;
        }

        @JvmStatic
        /* JADX INFO: renamed from: b */
        public final void m146331b(@NotNull Context context) {
            context.getClass();
        }

        @JvmStatic
        /* JADX INFO: renamed from: c */
        public final void m146332c() {
            kkh0.f123557d = null;
        }

        public Companion() {
        }
    }

    public /* synthetic */ kkh0(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
