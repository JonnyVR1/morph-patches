package p153l;

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
import androidx.core.os.C0255a;
import com.clevertap.android.sdk.Constants;
import com.google.android.exoplayer2.PlaybackException;
import com.p051p1.mobile.putong.core.data.Trigger;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.tencent.open.SocialConstants;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.C15514c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b&\u0018\u0000 \u001c2\u00020\u0001:\u0002\u0007\u001aB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H¦@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ%\u0010\r\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH§@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\tH§@ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u001b\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0012H§@ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u001b\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0016H§@ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u0013\u0010\u001a\u001a\u00020\u0019H§@ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001d"}, m88121d2 = {"Ll/qox;", "", "<init>", "()V", "Ll/ivd;", "deletionRequest", "", "a", "(Ll/ivd;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroid/net/Uri;", "attributionSource", "Landroid/view/InputEvent;", "inputEvent", "c", "(Landroid/net/Uri;Landroid/view/InputEvent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", Trigger.TYPE, Constants.INAPP_DATA_TAG, "(Landroid/net/Uri;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ll/gtp0;", SocialConstants.TYPE_REQUEST, "e", "(Ll/gtp0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ll/ltp0;", "f", "(Ll/ltp0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "b", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "ads-adservices_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
public abstract class qox {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    /* JADX INFO: renamed from: a */
    public abstract Object mo177375a(@NotNull ivd ivdVar, @NotNull Continuation<? super Unit> continuation);

    @RequiresPermission("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")
    @Nullable
    /* JADX INFO: renamed from: b */
    public abstract Object mo177376b(@NotNull Continuation<? super Integer> continuation);

    @RequiresPermission("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")
    @Nullable
    /* JADX INFO: renamed from: c */
    public abstract Object mo177377c(@NotNull Uri uri, @Nullable InputEvent inputEvent, @NotNull Continuation<? super Unit> continuation);

    @RequiresPermission("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")
    @Nullable
    /* JADX INFO: renamed from: d */
    public abstract Object mo177378d(@NotNull Uri uri, @NotNull Continuation<? super Unit> continuation);

    @RequiresPermission("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")
    @Nullable
    /* JADX INFO: renamed from: e */
    public abstract Object mo177379e(@NotNull gtp0 gtp0Var, @NotNull Continuation<? super Unit> continuation);

    @RequiresPermission("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")
    @Nullable
    /* JADX INFO: renamed from: f */
    public abstract Object mo177380f(@NotNull ltp0 ltp0Var, @NotNull Continuation<? super Unit> continuation);

    /* JADX INFO: renamed from: l.qox$b, reason: from kotlin metadata */
    @Metadata(m88120d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u000b¨\u0006\r"}, m88121d2 = {"Ll/qox$b;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Ll/qox;", "a", "(Landroid/content/Context;)Ll/qox;", "", "MEASUREMENT_API_STATE_DISABLED", "I", "MEASUREMENT_API_STATE_ENABLED", "ads-adservices_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @SuppressLint({"NewApi", "ClassVerificationFailure"})
        @Nullable
        /* JADX INFO: renamed from: a */
        public final qox m177388a(@NotNull Context context) {
            context.getClass();
            v70 v70Var = v70.INSTANCE;
            v70Var.m200163a();
            if (v70Var.m200163a() >= 5) {
                return new C19617a(context);
            }
            return null;
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: l.qox$a */
    @Metadata(m88120d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\bJ\u001b\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0097@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ%\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0097@ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u001b\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u000eH\u0097@ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u001b\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u0017H\u0097@ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\u001b\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u001bH\u0097@ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ\u0013\u0010\u001f\u001a\u00020\u001eH\u0097@ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010\"\u001a\u00020!2\u0006\u0010\u0018\u001a\u00020\tH\u0002¢\u0006\u0004\b\"\u0010#J\u0017\u0010%\u001a\u00020$2\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b%\u0010&J\u0017\u0010(\u001a\u00020'2\u0006\u0010\u0018\u001a\u00020\u001bH\u0002¢\u0006\u0004\b(\u0010)R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010*\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006+"}, m88121d2 = {"Ll/qox$a;", "Ll/qox;", "Landroid/adservices/measurement/MeasurementManager;", "mMeasurementManager", "<init>", "(Landroid/adservices/measurement/MeasurementManager;)V", "Landroid/content/Context;", "context", "(Landroid/content/Context;)V", "Ll/ivd;", "deletionRequest", "", "a", "(Ll/ivd;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroid/net/Uri;", "attributionSource", "Landroid/view/InputEvent;", "inputEvent", "c", "(Landroid/net/Uri;Landroid/view/InputEvent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", Trigger.TYPE, Constants.INAPP_DATA_TAG, "(Landroid/net/Uri;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ll/gtp0;", SocialConstants.TYPE_REQUEST, "e", "(Ll/gtp0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ll/ltp0;", "f", "(Ll/ltp0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "b", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroid/adservices/measurement/DeletionRequest;", "k", "(Ll/ivd;)Landroid/adservices/measurement/DeletionRequest;", "Landroid/adservices/measurement/WebSourceRegistrationRequest;", BLiveStormDanmakuGiftResourceType.f45292l, "(Ll/gtp0;)Landroid/adservices/measurement/WebSourceRegistrationRequest;", "Landroid/adservices/measurement/WebTriggerRegistrationRequest;", "m", "(Ll/ltp0;)Landroid/adservices/measurement/WebTriggerRegistrationRequest;", "Landroid/adservices/measurement/MeasurementManager;", "ads-adservices_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
    @SuppressLint({"NewApi", "ClassVerificationFailure"})
    @RequiresExtension(extension = PlaybackException.CUSTOM_ERROR_CODE_BASE, version = 5)
    @SourceDebugExtension
    public static final class C19617a extends qox {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final MeasurementManager mMeasurementManager;

        /* JADX WARN: Illegal instructions before constructor call */
        public C19617a(@NotNull Context context) {
            context.getClass();
            Object systemService = context.getSystemService((Class<Object>) iox.m141358a());
            systemService.getClass();
            this(jox.m146483a(systemService));
        }

        @Override // p153l.qox
        @DoNotInline
        @Nullable
        /* JADX INFO: renamed from: a */
        public Object mo177375a(@NotNull ivd ivdVar, @NotNull Continuation<? super Unit> continuation) {
            C15514c c15514c = new C15514c(IntrinsicsKt__IntrinsicsJvmKt.m88257c(continuation), 1);
            c15514c.m94637G();
            this.mMeasurementManager.deleteRegistrations(m177385k(ivdVar), new pox(), C0255a.m1328a(c15514c));
            Object objM94670v = c15514c.m94670v();
            if (objM94670v == uyp.m198688e()) {
                DebugProbesKt.m88272c(continuation);
            }
            return objM94670v == uyp.m198688e() ? objM94670v : Unit.INSTANCE;
        }

        @Override // p153l.qox
        @RequiresPermission("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")
        @DoNotInline
        @Nullable
        /* JADX INFO: renamed from: b */
        public Object mo177376b(@NotNull Continuation<? super Integer> continuation) {
            C15514c c15514c = new C15514c(IntrinsicsKt__IntrinsicsJvmKt.m88257c(continuation), 1);
            c15514c.m94637G();
            this.mMeasurementManager.getMeasurementApiStatus(new pox(), C0255a.m1328a(c15514c));
            Object objM94670v = c15514c.m94670v();
            if (objM94670v == uyp.m198688e()) {
                DebugProbesKt.m88272c(continuation);
            }
            return objM94670v;
        }

        @Override // p153l.qox
        @RequiresPermission("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")
        @DoNotInline
        @Nullable
        /* JADX INFO: renamed from: c */
        public Object mo177377c(@NotNull Uri uri, @Nullable InputEvent inputEvent, @NotNull Continuation<? super Unit> continuation) {
            C15514c c15514c = new C15514c(IntrinsicsKt__IntrinsicsJvmKt.m88257c(continuation), 1);
            c15514c.m94637G();
            this.mMeasurementManager.registerSource(uri, inputEvent, new pox(), C0255a.m1328a(c15514c));
            Object objM94670v = c15514c.m94670v();
            if (objM94670v == uyp.m198688e()) {
                DebugProbesKt.m88272c(continuation);
            }
            return objM94670v == uyp.m198688e() ? objM94670v : Unit.INSTANCE;
        }

        @Override // p153l.qox
        @RequiresPermission("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")
        @DoNotInline
        @Nullable
        /* JADX INFO: renamed from: d */
        public Object mo177378d(@NotNull Uri uri, @NotNull Continuation<? super Unit> continuation) {
            C15514c c15514c = new C15514c(IntrinsicsKt__IntrinsicsJvmKt.m88257c(continuation), 1);
            c15514c.m94637G();
            this.mMeasurementManager.registerTrigger(uri, new pox(), C0255a.m1328a(c15514c));
            Object objM94670v = c15514c.m94670v();
            if (objM94670v == uyp.m198688e()) {
                DebugProbesKt.m88272c(continuation);
            }
            return objM94670v == uyp.m198688e() ? objM94670v : Unit.INSTANCE;
        }

        @Override // p153l.qox
        @RequiresPermission("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")
        @DoNotInline
        @Nullable
        /* JADX INFO: renamed from: e */
        public Object mo177379e(@NotNull gtp0 gtp0Var, @NotNull Continuation<? super Unit> continuation) {
            C15514c c15514c = new C15514c(IntrinsicsKt__IntrinsicsJvmKt.m88257c(continuation), 1);
            c15514c.m94637G();
            this.mMeasurementManager.registerWebSource(m177386l(gtp0Var), new pox(), C0255a.m1328a(c15514c));
            Object objM94670v = c15514c.m94670v();
            if (objM94670v == uyp.m198688e()) {
                DebugProbesKt.m88272c(continuation);
            }
            return objM94670v == uyp.m198688e() ? objM94670v : Unit.INSTANCE;
        }

        @Override // p153l.qox
        @RequiresPermission("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")
        @DoNotInline
        @Nullable
        /* JADX INFO: renamed from: f */
        public Object mo177380f(@NotNull ltp0 ltp0Var, @NotNull Continuation<? super Unit> continuation) {
            C15514c c15514c = new C15514c(IntrinsicsKt__IntrinsicsJvmKt.m88257c(continuation), 1);
            c15514c.m94637G();
            this.mMeasurementManager.registerWebTrigger(m177387m(ltp0Var), new pox(), C0255a.m1328a(c15514c));
            Object objM94670v = c15514c.m94670v();
            if (objM94670v == uyp.m198688e()) {
                DebugProbesKt.m88272c(continuation);
            }
            return objM94670v == uyp.m198688e() ? objM94670v : Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: k */
        public final DeletionRequest m177385k(ivd request) {
            nox.m164206a();
            throw null;
        }

        /* JADX INFO: renamed from: l */
        public final WebSourceRegistrationRequest m177386l(gtp0 request) {
            oox.m168601a();
            throw null;
        }

        /* JADX INFO: renamed from: m */
        public final WebTriggerRegistrationRequest m177387m(ltp0 request) {
            fox.m126500a();
            throw null;
        }

        public C19617a(@NotNull MeasurementManager measurementManager) {
            measurementManager.getClass();
            this.mMeasurementManager = measurementManager;
        }
    }
}
