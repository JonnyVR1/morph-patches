package p149l;

import android.adservices.measurement.DeletionRequest;
import android.adservices.measurement.MeasurementManager;
import android.adservices.measurement.WebSourceRegistrationRequest;
import android.adservices.measurement.WebTriggerRegistrationRequest;
import android.annotation.SuppressLint;
import android.content.Context;
import android.net.Uri;
import android.view.InputEvent;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresExtension;
import androidx.annotation.RequiresPermission;
import androidx.core.os.C0254a;
import com.clevertap.android.sdk.Constants;
import com.google.android.exoplayer2.PlaybackException;
import com.p046p1.mobile.putong.core.data.Trigger;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.tencent.open.SocialConstants;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.C15407c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b&\u0018\u0000 \u001c2\u00020\u0001:\u0002\u0007\u001aB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H¦@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ%\u0010\r\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH§@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\tH§@ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u001b\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0012H§@ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u001b\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0016H§@ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u0013\u0010\u001a\u001a\u00020\u0019H§@ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001d"}, m87232d2 = {"Ll/sfx;", "", "<init>", "()V", "Ll/utd;", "deletionRequest", "", "a", "(Ll/utd;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroid/net/Uri;", "attributionSource", "Landroid/view/InputEvent;", "inputEvent", "c", "(Landroid/net/Uri;Landroid/view/InputEvent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", Trigger.TYPE, Constants.INAPP_DATA_TAG, "(Landroid/net/Uri;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ll/ckp0;", SocialConstants.TYPE_REQUEST, "e", "(Ll/ckp0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ll/hkp0;", "f", "(Ll/hkp0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "b", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "ads-adservices_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
public abstract class sfx {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    /* JADX INFO: renamed from: a */
    public abstract Object mo183998a(@NotNull utd utdVar, @NotNull Continuation<? super Unit> continuation);

    @RequiresPermission("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")
    @Nullable
    /* JADX INFO: renamed from: b */
    public abstract Object mo183999b(@NotNull Continuation<? super Integer> continuation);

    @RequiresPermission("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")
    @Nullable
    /* JADX INFO: renamed from: c */
    public abstract Object mo184000c(@NotNull Uri uri, @Nullable InputEvent inputEvent, @NotNull Continuation<? super Unit> continuation);

    @RequiresPermission("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")
    @Nullable
    /* JADX INFO: renamed from: d */
    public abstract Object mo184001d(@NotNull Uri uri, @NotNull Continuation<? super Unit> continuation);

    @RequiresPermission("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")
    @Nullable
    /* JADX INFO: renamed from: e */
    public abstract Object mo184002e(@NotNull ckp0 ckp0Var, @NotNull Continuation<? super Unit> continuation);

    @RequiresPermission("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")
    @Nullable
    /* JADX INFO: renamed from: f */
    public abstract Object mo184003f(@NotNull hkp0 hkp0Var, @NotNull Continuation<? super Unit> continuation);

    /* JADX INFO: renamed from: l.sfx$b, reason: from kotlin metadata */
    @Metadata(m87231d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u000b¨\u0006\r"}, m87232d2 = {"Ll/sfx$b;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Ll/sfx;", "a", "(Landroid/content/Context;)Ll/sfx;", "", "MEASUREMENT_API_STATE_DISABLED", "I", "MEASUREMENT_API_STATE_ENABLED", "ads-adservices_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @SuppressLint({"NewApi", "ClassVerificationFailure"})
        @Nullable
        /* JADX INFO: renamed from: a */
        public final sfx m184011a(@NotNull Context context) {
            context.getClass();
            z70 z70Var = z70.INSTANCE;
            z70Var.m217427a();
            if (z70Var.m217427a() >= 5) {
                return new C19937a(context);
            }
            return null;
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: l.sfx$a */
    @Metadata(m87231d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\bJ\u001b\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0097@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ%\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0097@ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u001b\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u000eH\u0097@ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u001b\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u0017H\u0097@ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\u001b\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u001bH\u0097@ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ\u0013\u0010\u001f\u001a\u00020\u001eH\u0097@ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010\"\u001a\u00020!2\u0006\u0010\u0018\u001a\u00020\tH\u0002¢\u0006\u0004\b\"\u0010#J\u0017\u0010%\u001a\u00020$2\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b%\u0010&J\u0017\u0010(\u001a\u00020'2\u0006\u0010\u0018\u001a\u00020\u001bH\u0002¢\u0006\u0004\b(\u0010)R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010*\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006+"}, m87232d2 = {"Ll/sfx$a;", "Ll/sfx;", "Landroid/adservices/measurement/MeasurementManager;", "mMeasurementManager", "<init>", "(Landroid/adservices/measurement/MeasurementManager;)V", "Landroid/content/Context;", "context", "(Landroid/content/Context;)V", "Ll/utd;", "deletionRequest", "", "a", "(Ll/utd;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroid/net/Uri;", "attributionSource", "Landroid/view/InputEvent;", "inputEvent", "c", "(Landroid/net/Uri;Landroid/view/InputEvent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", Trigger.TYPE, Constants.INAPP_DATA_TAG, "(Landroid/net/Uri;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ll/ckp0;", SocialConstants.TYPE_REQUEST, "e", "(Ll/ckp0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ll/hkp0;", "f", "(Ll/hkp0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "b", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroid/adservices/measurement/DeletionRequest;", "k", "(Ll/utd;)Landroid/adservices/measurement/DeletionRequest;", "Landroid/adservices/measurement/WebSourceRegistrationRequest;", BLiveStormDanmakuGiftResourceType.f44444l, "(Ll/ckp0;)Landroid/adservices/measurement/WebSourceRegistrationRequest;", "Landroid/adservices/measurement/WebTriggerRegistrationRequest;", "m", "(Ll/hkp0;)Landroid/adservices/measurement/WebTriggerRegistrationRequest;", "Landroid/adservices/measurement/MeasurementManager;", "ads-adservices_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
    @SuppressLint({"NewApi", "ClassVerificationFailure"})
    @RequiresExtension(extension = PlaybackException.CUSTOM_ERROR_CODE_BASE, version = 5)
    @SourceDebugExtension
    public static final class C19937a extends sfx {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final MeasurementManager mMeasurementManager;

        /* JADX WARN: Illegal instructions before constructor call */
        public C19937a(@NotNull Context context) {
            context.getClass();
            Object systemService = context.getSystemService((Class<Object>) kfx.m145877a());
            systemService.getClass();
            this(lfx.m149749a(systemService));
        }

        @Override // p149l.sfx
        @DoNotInline
        @Nullable
        /* JADX INFO: renamed from: a */
        public Object mo183998a(@NotNull utd utdVar, @NotNull Continuation<? super Unit> continuation) {
            C15407c c15407c = new C15407c(IntrinsicsKt__IntrinsicsJvmKt.m87368c(continuation), 1);
            c15407c.m93745G();
            this.mMeasurementManager.deleteRegistrations(m184008k(utdVar), new rfx(), C0254a.m1327a(c15407c));
            Object objM93778v = c15407c.m93778v();
            if (objM93778v == uwp.m196133e()) {
                DebugProbesKt.m87383c(continuation);
            }
            return objM93778v == uwp.m196133e() ? objM93778v : Unit.INSTANCE;
        }

        @Override // p149l.sfx
        @RequiresPermission("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")
        @DoNotInline
        @Nullable
        /* JADX INFO: renamed from: b */
        public Object mo183999b(@NotNull Continuation<? super Integer> continuation) {
            C15407c c15407c = new C15407c(IntrinsicsKt__IntrinsicsJvmKt.m87368c(continuation), 1);
            c15407c.m93745G();
            this.mMeasurementManager.getMeasurementApiStatus(new rfx(), C0254a.m1327a(c15407c));
            Object objM93778v = c15407c.m93778v();
            if (objM93778v == uwp.m196133e()) {
                DebugProbesKt.m87383c(continuation);
            }
            return objM93778v;
        }

        @Override // p149l.sfx
        @RequiresPermission("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")
        @DoNotInline
        @Nullable
        /* JADX INFO: renamed from: c */
        public Object mo184000c(@NotNull Uri uri, @Nullable InputEvent inputEvent, @NotNull Continuation<? super Unit> continuation) {
            C15407c c15407c = new C15407c(IntrinsicsKt__IntrinsicsJvmKt.m87368c(continuation), 1);
            c15407c.m93745G();
            this.mMeasurementManager.registerSource(uri, inputEvent, new rfx(), C0254a.m1327a(c15407c));
            Object objM93778v = c15407c.m93778v();
            if (objM93778v == uwp.m196133e()) {
                DebugProbesKt.m87383c(continuation);
            }
            return objM93778v == uwp.m196133e() ? objM93778v : Unit.INSTANCE;
        }

        @Override // p149l.sfx
        @RequiresPermission("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")
        @DoNotInline
        @Nullable
        /* JADX INFO: renamed from: d */
        public Object mo184001d(@NotNull Uri uri, @NotNull Continuation<? super Unit> continuation) {
            C15407c c15407c = new C15407c(IntrinsicsKt__IntrinsicsJvmKt.m87368c(continuation), 1);
            c15407c.m93745G();
            this.mMeasurementManager.registerTrigger(uri, new rfx(), C0254a.m1327a(c15407c));
            Object objM93778v = c15407c.m93778v();
            if (objM93778v == uwp.m196133e()) {
                DebugProbesKt.m87383c(continuation);
            }
            return objM93778v == uwp.m196133e() ? objM93778v : Unit.INSTANCE;
        }

        @Override // p149l.sfx
        @RequiresPermission("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")
        @DoNotInline
        @Nullable
        /* JADX INFO: renamed from: e */
        public Object mo184002e(@NotNull ckp0 ckp0Var, @NotNull Continuation<? super Unit> continuation) {
            C15407c c15407c = new C15407c(IntrinsicsKt__IntrinsicsJvmKt.m87368c(continuation), 1);
            c15407c.m93745G();
            this.mMeasurementManager.registerWebSource(m184009l(ckp0Var), new rfx(), C0254a.m1327a(c15407c));
            Object objM93778v = c15407c.m93778v();
            if (objM93778v == uwp.m196133e()) {
                DebugProbesKt.m87383c(continuation);
            }
            return objM93778v == uwp.m196133e() ? objM93778v : Unit.INSTANCE;
        }

        @Override // p149l.sfx
        @RequiresPermission("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")
        @DoNotInline
        @Nullable
        /* JADX INFO: renamed from: f */
        public Object mo184003f(@NotNull hkp0 hkp0Var, @NotNull Continuation<? super Unit> continuation) {
            C15407c c15407c = new C15407c(IntrinsicsKt__IntrinsicsJvmKt.m87368c(continuation), 1);
            c15407c.m93745G();
            this.mMeasurementManager.registerWebTrigger(m184010m(hkp0Var), new rfx(), C0254a.m1327a(c15407c));
            Object objM93778v = c15407c.m93778v();
            if (objM93778v == uwp.m196133e()) {
                DebugProbesKt.m87383c(continuation);
            }
            return objM93778v == uwp.m196133e() ? objM93778v : Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: k */
        public final DeletionRequest m184008k(utd request) {
            pfx.m168657a();
            throw null;
        }

        /* JADX INFO: renamed from: l */
        public final WebSourceRegistrationRequest m184009l(ckp0 request) {
            qfx.m174376a();
            throw null;
        }

        /* JADX INFO: renamed from: m */
        public final WebTriggerRegistrationRequest m184010m(hkp0 request) {
            hfx.m130793a();
            throw null;
        }

        public C19937a(@NotNull MeasurementManager measurementManager) {
            measurementManager.getClass();
            this.mMeasurementManager = measurementManager;
        }
    }
}
