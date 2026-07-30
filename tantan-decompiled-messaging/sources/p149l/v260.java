package p149l;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.inapp.images.FileResourceProvider;
import com.clevertap.android.sdk.inapp.pipsdk.C1265a;
import com.clevertap.android.sdk.inapp.pipsdk.internal.lifecycle.PIPLifecycleObserver;
import com.clevertap.android.sdk.inapp.pipsdk.internal.view.PIPRootContainer;
import com.immomo.momomediaext.sei.BaseSei;
import com.p046p1.mobile.putong.core.data.Reason;
import com.p046p1.mobile.putong.data.ResourceDirection;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.lang.ref.WeakReference;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000k\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\b\u0005*\u0001E\b\u0000\u0018\u00002\u00020\u0001:\u0001)B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J)\u0010\u000e\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ#\u0010\u0014\u001a\u00020\r2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001a\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001c\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010 \u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b \u0010\u0019J\u000f\u0010!\u001a\u00020\rH\u0002¢\u0006\u0004\b!\u0010\u001fJ\u001d\u0010#\u001a\u00020\r2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\r0\u0002H\u0002¢\u0006\u0004\b#\u0010\u0006J\u000f\u0010%\u001a\u00020$H\u0002¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\rH\u0002¢\u0006\u0004\b'\u0010\u001fJ)\u0010(\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b(\u0010\u000fR\u001b\u0010-\u001a\u00020\u00038BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u0018\u00100\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u00104\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0016\u00107\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106R\u0018\u0010;\u001a\u0004\u0018\u0001088\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010:R\u0016\u0010=\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u00106R\u0018\u0010A\u001a\u0004\u0018\u00010>8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010@R\u0018\u0010D\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010CR\u0014\u0010H\u001a\u00020E8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010G¨\u0006I"}, m87232d2 = {"Ll/v260;", "", "Lkotlin/Function0;", "Lcom/clevertap/android/sdk/inapp/images/FileResourceProvider;", "fileResourceProvider", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "Landroid/app/Activity;", "activity", "Lcom/clevertap/android/sdk/inapp/pipsdk/a;", Constants.KEY_CONFIG, "Ll/jcr;", "lifecycleOwner", "", "G", "(Landroid/app/Activity;Lcom/clevertap/android/sdk/inapp/pipsdk/a;Ll/jcr;)V", "Ll/v260$a;", Reason.TYPE, "", "animate", BaseSei.f13930X, "(Ll/v260$a;Z)V", "Ll/y360;", BLiveStormDanmakuGiftResourceType.f44446s, "B", "(Ll/y360;)V", "w", "(Ll/y360;Landroid/app/Activity;)V", b2s.C_ZONE, "(Landroid/app/Activity;Ll/y360;)V", ResourceDirection.f38808v, "()V", "D", "I", "block", "E", "Ljava/util/concurrent/ExecutorService;", BaseSei.f13932Z, "()Ljava/util/concurrent/ExecutorService;", "H", "F", "a", "Lkotlin/Lazy;", "A", "()Lcom/clevertap/android/sdk/inapp/images/FileResourceProvider;", "resourceProvider", "b", "Ll/y360;", "session", "Landroid/os/Handler;", "c", "Landroid/os/Handler;", "mainHandler", Constants.INAPP_DATA_TAG, "Z", "callbacksRegistered", "Landroid/app/Application;", "e", "Landroid/app/Application;", "applicationRef", "f", "pendingRotationReattach", "", "g", "Ljava/lang/String;", "pendingReattachClassName", "h", "Ljava/util/concurrent/ExecutorService;", "mediaExecutor", "l/v260$b", RXScreenCaptureService.KEY_INDEX, "Ll/v260$b;", "lifecycleCallbacks", "clevertap-core_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
@SourceDebugExtension
public final class v260 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Lazy resourceProvider;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private volatile y360 session;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Handler mainHandler;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private boolean callbacksRegistered;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    private Application applicationRef;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private volatile boolean pendingRotationReattach;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @Nullable
    private volatile String pendingReattachClassName;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @Nullable
    private ExecutorService mediaExecutor;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    private final C20564b lifecycleCallbacks;

    /* JADX INFO: renamed from: l.v260$a */
    @Metadata(m87231d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\br\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, m87232d2 = {"Ll/v260$a;", "", Constants.INAPP_DATA_TAG, "c", "b", "a", "Ll/v260$a$a;", "Ll/v260$a$b;", "Ll/v260$a$c;", "Ll/v260$a$d;", "clevertap-core_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
    public interface InterfaceC20563a {

        /* JADX INFO: renamed from: l.v260$a$a */
        @Metadata(m87231d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m87232d2 = {"Ll/v260$a$a;", "Ll/v260$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "clevertap-core_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
        public static final /* data */ class a implements InterfaceC20563a {

            @NotNull
            public static final a INSTANCE = new a();

            private a() {
            }

            public boolean equals(@Nullable Object other) {
                return this == other || (other instanceof a);
            }

            public int hashCode() {
                return -1010278175;
            }

            @NotNull
            public String toString() {
                return "Replaced";
            }
        }

        /* JADX INFO: renamed from: l.v260$a$b */
        @Metadata(m87231d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m87232d2 = {"Ll/v260$a$b;", "Ll/v260$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "clevertap-core_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
        public static final /* data */ class b implements InterfaceC20563a {

            @NotNull
            public static final b INSTANCE = new b();

            private b() {
            }

            public boolean equals(@Nullable Object other) {
                return this == other || (other instanceof b);
            }

            public int hashCode() {
                return -699127009;
            }

            @NotNull
            public String toString() {
                return "SessionCleanup";
            }
        }

        /* JADX INFO: renamed from: l.v260$a$c */
        @Metadata(m87231d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m87232d2 = {"Ll/v260$a$c;", "Ll/v260$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "clevertap-core_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
        public static final /* data */ class c implements InterfaceC20563a {

            @NotNull
            public static final c INSTANCE = new c();

            private c() {
            }

            public boolean equals(@Nullable Object other) {
                return this == other || (other instanceof c);
            }

            public int hashCode() {
                return 1411431947;
            }

            @NotNull
            public String toString() {
                return "ShowFailed";
            }
        }

        /* JADX INFO: renamed from: l.v260$a$d */
        @Metadata(m87231d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m87232d2 = {"Ll/v260$a$d;", "Ll/v260$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "clevertap-core_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
        public static final /* data */ class d implements InterfaceC20563a {

            @NotNull
            public static final d INSTANCE = new d();

            private d() {
            }

            public boolean equals(@Nullable Object other) {
                return this == other || (other instanceof d);
            }

            public int hashCode() {
                return -484998564;
            }

            @NotNull
            public String toString() {
                return "UserClose";
            }
        }
    }

    /* JADX INFO: renamed from: l.v260$b */
    @Metadata(m87231d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\u0006J!\u0010\f\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u0006J\u0017\u0010\u000f\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0006J\u001f\u0010\u0010\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0010\u0010\r¨\u0006\u0011"}, m87232d2 = {"l/v260$b", "Landroid/app/Application$ActivityLifecycleCallbacks;", "Landroid/app/Activity;", "activity", "", "onActivityStarted", "(Landroid/app/Activity;)V", "onActivityStopped", "onActivityDestroyed", "a", "Landroid/os/Bundle;", "b", "onActivityCreated", "(Landroid/app/Activity;Landroid/os/Bundle;)V", "onActivityResumed", "onActivityPaused", "onActivitySaveInstanceState", "clevertap-core_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
    public static final class C20564b implements Application.ActivityLifecycleCallbacks {
        public C20564b() {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity a, Bundle b) {
            a.getClass();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            activity.getClass();
            y360 y360Var = v260.this.session;
            if (y360Var != null && Intrinsics.m87488d(y360Var.m212774a().get(), activity)) {
                boolean zIsChangingConfigurations = activity.isChangingConfigurations();
                v260 v260Var = v260.this;
                if (zIsChangingConfigurations) {
                    v260Var.m196741w(y360Var, activity);
                } else if (v260Var.session != null) {
                    v260.this.m196740v();
                }
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity a) {
            a.getClass();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity a) {
            a.getClass();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity a, Bundle b) {
            a.getClass();
            b.getClass();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            activity.getClass();
            y360 y360Var = v260.this.session;
            if (y360Var == null) {
                return;
            }
            if (v260.this.pendingRotationReattach && Intrinsics.m87488d(activity.getClass().getName(), v260.this.pendingReattachClassName)) {
                v260.this.pendingRotationReattach = false;
                v260.this.pendingReattachClassName = null;
                v260.this.m196713C(activity, y360Var);
            }
            if (Intrinsics.m87488d(y360Var.m212774a().get(), activity) && y360Var.getPausedByBackground()) {
                a460 videoPlayerWrapper = y360Var.getVideoPlayerWrapper();
                if (videoPlayerWrapper != null) {
                    videoPlayerWrapper.m94819i();
                }
                y360Var.m212791r(false);
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            activity.getClass();
            y360 y360Var = v260.this.session;
            if (y360Var == null || !Intrinsics.m87488d(y360Var.m212774a().get(), activity) || activity.isChangingConfigurations() || !y360Var.getIsPlaying() || y360Var.getVideoPlayerWrapper() == null) {
                return;
            }
            a460 videoPlayerWrapper = y360Var.getVideoPlayerWrapper();
            if (videoPlayerWrapper != null) {
                videoPlayerWrapper.m94826r();
            }
            y360Var.m212791r(true);
        }
    }

    public v260(@NotNull Function0<FileResourceProvider> function0) {
        function0.getClass();
        this.resourceProvider = LazyKt__LazyJVMKt.m87229b(function0);
        this.mainHandler = new Handler(Looper.getMainLooper());
        this.lifecycleCallbacks = new C20564b();
    }

    /* JADX INFO: renamed from: A */
    private final FileResourceProvider m196711A() {
        return (FileResourceProvider) this.resourceProvider.getValue();
    }

    /* JADX INFO: renamed from: B */
    private final void m196712B(y360 s) {
        PIPRootContainer pipRootContainer = s.getPipRootContainer();
        if (pipRootContainer != null) {
            pipRootContainer.m6655z(true);
            ViewParent parent = pipRootContainer.getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.removeView(pipRootContainer);
            }
        } else {
            a460 videoPlayerWrapper = s.getVideoPlayerWrapper();
            if (videoPlayerWrapper != null) {
                videoPlayerWrapper.m94821m();
            }
        }
        s.m212795v(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public final void m196713C(Activity activity, y360 s) {
        s.m212785l(new WeakReference<>(activity));
        PIPRootContainer pIPRootContainer = new PIPRootContainer(activity);
        pIPRootContainer.setOnDismissRequested(new Function0() { // from class: l.i260
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return v260.m196721c(this.f110537a);
            }
        });
        pIPRootContainer.setOnShowFailed(new Function0() { // from class: l.m260
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return v260.m196725g(this.f130888a);
            }
        });
        pIPRootContainer.setupBackPressCallback(activity);
        s.m212792s(pIPRootContainer);
        w260.m201020b(activity).addView(pIPRootContainer, new FrameLayout.LayoutParams(-1, -1));
        pIPRootContainer.m6654v(s, true, m196711A(), m196744z());
    }

    /* JADX INFO: renamed from: D */
    private final void m196714D(y360 s) {
        Lifecycle lifecycle;
        LifecycleEventObserver lifecycleObserver = s.getLifecycleObserver();
        if (lifecycleObserver == null) {
            return;
        }
        jcr lifecycleOwner = s.getLifecycleOwner();
        if (lifecycleOwner != null && (lifecycle = lifecycleOwner.getLifecycle()) != null) {
            lifecycle.mo2969d(lifecycleObserver);
        }
        s.m212788o(null);
        s.m212789p(null);
    }

    /* JADX INFO: renamed from: E */
    private final void m196715E(final Function0<Unit> block) {
        if (Intrinsics.m87488d(Looper.myLooper(), Looper.getMainLooper())) {
            block.invoke();
        } else {
            this.mainHandler.post(new Runnable() { // from class: l.q260
                @Override // java.lang.Runnable
                public final void run() {
                    v260.m196731m(block);
                }
            });
        }
    }

    /* JADX INFO: renamed from: G */
    private final void m196716G(Activity activity, C1265a config, jcr lifecycleOwner) {
        m196742x(InterfaceC20563a.a.INSTANCE, false);
        this.pendingRotationReattach = false;
        this.pendingReattachClassName = null;
        y360 y360Var = new y360(config, config.getInitialPosition(), activity);
        this.session = y360Var;
        if (!this.callbacksRegistered) {
            activity.getApplication().registerActivityLifecycleCallbacks(this.lifecycleCallbacks);
            this.applicationRef = activity.getApplication();
            this.callbacksRegistered = true;
        }
        if (lifecycleOwner != null) {
            PIPLifecycleObserver pIPLifecycleObserver = new PIPLifecycleObserver(new Function0() { // from class: l.s260
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return v260.m196724f(this.f161960a);
                }
            });
            y360Var.m212789p(lifecycleOwner);
            y360Var.m212788o(pIPLifecycleObserver);
            lifecycleOwner.getLifecycle().mo2966a(pIPLifecycleObserver);
        }
        PIPRootContainer pIPRootContainer = new PIPRootContainer(activity);
        pIPRootContainer.setOnDismissRequested(new Function0() { // from class: l.t260
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return v260.m196719a(this.f167442a);
            }
        });
        pIPRootContainer.setOnShowFailed(new Function0() { // from class: l.u260
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return v260.m196728j(this.f173076a);
            }
        });
        y360Var.m212792s(pIPRootContainer);
        pIPRootContainer.setupBackPressCallback(activity);
        w260.m201020b(activity).addView(pIPRootContainer, new FrameLayout.LayoutParams(-1, -1));
        pIPRootContainer.m6654v(y360Var, false, m196711A(), m196744z());
    }

    /* JADX INFO: renamed from: H */
    private final void m196717H() {
        ExecutorService executorService = this.mediaExecutor;
        if (executorService != null) {
            executorService.shutdown();
        }
        this.mediaExecutor = null;
    }

    /* JADX INFO: renamed from: I */
    private final void m196718I() {
        Application application = this.applicationRef;
        if (application != null) {
            application.unregisterActivityLifecycleCallbacks(this.lifecycleCallbacks);
        }
        this.applicationRef = null;
        this.callbacksRegistered = false;
    }

    /* JADX INFO: renamed from: a */
    public static Unit m196719a(final v260 v260Var) {
        v260Var.getClass();
        v260Var.m196715E(new Function0() { // from class: l.j260
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return v260.m196722d(this.f115883a);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: b */
    public static Unit m196720b(v260 v260Var, Activity activity, C1265a c1265a, jcr jcrVar) {
        v260Var.getClass();
        activity.getClass();
        c1265a.getClass();
        v260Var.m196716G(activity, c1265a, jcrVar);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: c */
    public static Unit m196721c(final v260 v260Var) {
        v260Var.getClass();
        v260Var.m196715E(new Function0() { // from class: l.p260
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return v260.m196730l(this.f146816a);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: d */
    public static Unit m196722d(v260 v260Var) {
        v260Var.getClass();
        m196743y(v260Var, null, false, 3, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: e */
    public static Unit m196723e(v260 v260Var, y360 y360Var, InterfaceC20563a interfaceC20563a) {
        v260Var.getClass();
        y360Var.getClass();
        interfaceC20563a.getClass();
        v260Var.m196712B(y360Var);
        if (Intrinsics.m87488d(interfaceC20563a, InterfaceC20563a.d.INSTANCE) || Intrinsics.m87488d(interfaceC20563a, InterfaceC20563a.b.INSTANCE)) {
            h160 callbacks = y360Var.getCom.clevertap.android.sdk.Constants.KEY_CONFIG java.lang.String().getCallbacks();
            if (callbacks != null) {
                callbacks.onClose();
            }
        } else if (Intrinsics.m87488d(interfaceC20563a, InterfaceC20563a.c.INSTANCE)) {
            h160 callbacks2 = y360Var.getCom.clevertap.android.sdk.Constants.KEY_CONFIG java.lang.String().getCallbacks();
            if (callbacks2 != null) {
                callbacks2.mo6314c();
            }
        } else if (!Intrinsics.m87488d(interfaceC20563a, InterfaceC20563a.a.INSTANCE)) {
            l9r.m149037a();
            return null;
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: f */
    public static Unit m196724f(final v260 v260Var) {
        v260Var.getClass();
        v260Var.m196715E(new Function0() { // from class: l.l260
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return v260.m196727i(this.f125747a);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: g */
    public static Unit m196725g(final v260 v260Var) {
        v260Var.getClass();
        v260Var.m196715E(new Function0() { // from class: l.o260
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return v260.m196726h(this.f141508a);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: h */
    public static Unit m196726h(v260 v260Var) {
        v260Var.getClass();
        v260Var.m196742x(InterfaceC20563a.c.INSTANCE, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: i */
    public static Unit m196727i(v260 v260Var) {
        v260Var.getClass();
        v260Var.m196740v();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: j */
    public static Unit m196728j(final v260 v260Var) {
        v260Var.getClass();
        v260Var.m196715E(new Function0() { // from class: l.k260
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return v260.m196729k(this.f120692a);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: k */
    public static Unit m196729k(v260 v260Var) {
        v260Var.getClass();
        v260Var.m196742x(InterfaceC20563a.c.INSTANCE, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: l */
    public static Unit m196730l(v260 v260Var) {
        v260Var.getClass();
        m196743y(v260Var, null, false, 3, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: m */
    public static void m196731m(Function0 function0) {
        function0.getClass();
        function0.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public final void m196740v() {
        m196742x(InterfaceC20563a.b.INSTANCE, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public final void m196741w(y360 s, Activity activity) {
        a460 videoPlayerWrapper = s.getVideoPlayerWrapper();
        if (videoPlayerWrapper != null) {
            videoPlayerWrapper.m94812b();
        }
        PIPRootContainer pipRootContainer = s.getPipRootContainer();
        if (pipRootContainer != null) {
            PIPRootContainer.m6624A(pipRootContainer, false, 1, null);
            ViewParent parent = pipRootContainer.getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.removeView(pipRootContainer);
            }
        }
        s.m212792s(null);
        this.pendingRotationReattach = true;
        this.pendingReattachClassName = activity.getClass().getName();
    }

    /* JADX INFO: renamed from: x */
    private final void m196742x(final InterfaceC20563a reason, boolean animate) {
        final y360 y360Var = this.session;
        if (y360Var == null) {
            return;
        }
        this.session = null;
        m196714D(y360Var);
        Function0<Unit> function0 = new Function0() { // from class: l.n260
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return v260.m196723e(this.f136766a, y360Var, reason);
            }
        };
        PIPRootContainer pipRootContainer = y360Var.getPipRootContainer();
        if (!animate || pipRootContainer == null) {
            function0.invoke();
        } else {
            pipRootContainer.m6653B(function0);
        }
        m196717H();
        m196718I();
    }

    /* JADX INFO: renamed from: y */
    public static /* synthetic */ void m196743y(v260 v260Var, InterfaceC20563a interfaceC20563a, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            interfaceC20563a = InterfaceC20563a.d.INSTANCE;
        }
        if ((i & 2) != 0) {
            z = true;
        }
        v260Var.m196742x(interfaceC20563a, z);
    }

    /* JADX INFO: renamed from: z */
    private final ExecutorService m196744z() {
        ExecutorService executorService = this.mediaExecutor;
        if (executorService != null) {
            return executorService;
        }
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
        this.mediaExecutor = executorServiceNewSingleThreadExecutor;
        executorServiceNewSingleThreadExecutor.getClass();
        return executorServiceNewSingleThreadExecutor;
    }

    /* JADX INFO: renamed from: F */
    public final void m196745F(@NotNull final Activity activity, @NotNull final C1265a config, @Nullable final jcr lifecycleOwner) {
        activity.getClass();
        config.getClass();
        m196715E(new Function0() { // from class: l.r260
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return v260.m196720b(this.f157382a, activity, config, lifecycleOwner);
            }
        });
    }
}
