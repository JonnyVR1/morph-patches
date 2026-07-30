package p153l;

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
import com.clevertap.android.sdk.inapp.pipsdk.C1288a;
import com.clevertap.android.sdk.inapp.pipsdk.internal.lifecycle.PIPLifecycleObserver;
import com.clevertap.android.sdk.inapp.pipsdk.internal.view.PIPRootContainer;
import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.putong.core.data.Reason;
import com.p051p1.mobile.putong.data.ResourceDirection;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
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
@Metadata(m88120d1 = {"\u0000k\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\b\u0005*\u0001E\b\u0000\u0018\u00002\u00020\u0001:\u0001)B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J)\u0010\u000e\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ#\u0010\u0014\u001a\u00020\r2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001a\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001c\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010 \u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b \u0010\u0019J\u000f\u0010!\u001a\u00020\rH\u0002¢\u0006\u0004\b!\u0010\u001fJ\u001d\u0010#\u001a\u00020\r2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\r0\u0002H\u0002¢\u0006\u0004\b#\u0010\u0006J\u000f\u0010%\u001a\u00020$H\u0002¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\rH\u0002¢\u0006\u0004\b'\u0010\u001fJ)\u0010(\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b(\u0010\u000fR\u001b\u0010-\u001a\u00020\u00038BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u0018\u00100\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u00104\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0016\u00107\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106R\u0018\u0010;\u001a\u0004\u0018\u0001088\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010:R\u0016\u0010=\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u00106R\u0018\u0010A\u001a\u0004\u0018\u00010>8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010@R\u0018\u0010D\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010CR\u0014\u0010H\u001a\u00020E8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010G¨\u0006I"}, m88121d2 = {"Ll/ab60;", "", "Lkotlin/Function0;", "Lcom/clevertap/android/sdk/inapp/images/FileResourceProvider;", "fileResourceProvider", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "Landroid/app/Activity;", "activity", "Lcom/clevertap/android/sdk/inapp/pipsdk/a;", Constants.KEY_CONFIG, "Ll/ker;", "lifecycleOwner", "", "G", "(Landroid/app/Activity;Lcom/clevertap/android/sdk/inapp/pipsdk/a;Ll/ker;)V", "Ll/ab60$a;", Reason.TYPE, "", "animate", BaseSei.f14624X, "(Ll/ab60$a;Z)V", "Ll/dc60;", BLiveStormDanmakuGiftResourceType.f45294s, "B", "(Ll/dc60;)V", "w", "(Ll/dc60;Landroid/app/Activity;)V", c4s.C_ZONE, "(Landroid/app/Activity;Ll/dc60;)V", ResourceDirection.f39656v, "()V", "D", "I", "block", "E", "Ljava/util/concurrent/ExecutorService;", BaseSei.f14626Z, "()Ljava/util/concurrent/ExecutorService;", "H", "F", "a", "Lkotlin/Lazy;", "A", "()Lcom/clevertap/android/sdk/inapp/images/FileResourceProvider;", "resourceProvider", "b", "Ll/dc60;", "session", "Landroid/os/Handler;", "c", "Landroid/os/Handler;", "mainHandler", Constants.INAPP_DATA_TAG, "Z", "callbacksRegistered", "Landroid/app/Application;", "e", "Landroid/app/Application;", "applicationRef", "f", "pendingRotationReattach", "", "g", "Ljava/lang/String;", "pendingReattachClassName", "h", "Ljava/util/concurrent/ExecutorService;", "mediaExecutor", "l/ab60$b", RXScreenCaptureService.KEY_INDEX, "Ll/ab60$b;", "lifecycleCallbacks", "clevertap-core_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
@SourceDebugExtension
public final class ab60 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Lazy resourceProvider;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private volatile dc60 session;

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
    private final C15680b lifecycleCallbacks;

    /* JADX INFO: renamed from: l.ab60$a */
    @Metadata(m88120d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\br\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, m88121d2 = {"Ll/ab60$a;", "", Constants.INAPP_DATA_TAG, "c", "b", "a", "Ll/ab60$a$a;", "Ll/ab60$a$b;", "Ll/ab60$a$c;", "Ll/ab60$a$d;", "clevertap-core_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
    public interface InterfaceC15679a {

        /* JADX INFO: renamed from: l.ab60$a$a */
        @Metadata(m88120d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m88121d2 = {"Ll/ab60$a$a;", "Ll/ab60$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "clevertap-core_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
        public static final /* data */ class a implements InterfaceC15679a {

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

        /* JADX INFO: renamed from: l.ab60$a$b */
        @Metadata(m88120d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m88121d2 = {"Ll/ab60$a$b;", "Ll/ab60$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "clevertap-core_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
        public static final /* data */ class b implements InterfaceC15679a {

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

        /* JADX INFO: renamed from: l.ab60$a$c */
        @Metadata(m88120d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m88121d2 = {"Ll/ab60$a$c;", "Ll/ab60$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "clevertap-core_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
        public static final /* data */ class c implements InterfaceC15679a {

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

        /* JADX INFO: renamed from: l.ab60$a$d */
        @Metadata(m88120d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m88121d2 = {"Ll/ab60$a$d;", "Ll/ab60$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "clevertap-core_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
        public static final /* data */ class d implements InterfaceC15679a {

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

    /* JADX INFO: renamed from: l.ab60$b */
    @Metadata(m88120d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\u0006J!\u0010\f\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u0006J\u0017\u0010\u000f\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0006J\u001f\u0010\u0010\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0010\u0010\r¨\u0006\u0011"}, m88121d2 = {"l/ab60$b", "Landroid/app/Application$ActivityLifecycleCallbacks;", "Landroid/app/Activity;", "activity", "", "onActivityStarted", "(Landroid/app/Activity;)V", "onActivityStopped", "onActivityDestroyed", "a", "Landroid/os/Bundle;", "b", "onActivityCreated", "(Landroid/app/Activity;Landroid/os/Bundle;)V", "onActivityResumed", "onActivityPaused", "onActivitySaveInstanceState", "clevertap-core_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
    public static final class C15680b implements Application.ActivityLifecycleCallbacks {
        public C15680b() {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity a, Bundle b) {
            a.getClass();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            activity.getClass();
            dc60 dc60Var = ab60.this.session;
            if (dc60Var != null && Intrinsics.m88377d(dc60Var.m115217a().get(), activity)) {
                boolean zIsChangingConfigurations = activity.isChangingConfigurations();
                ab60 ab60Var = ab60.this;
                if (zIsChangingConfigurations) {
                    ab60Var.m96728w(dc60Var, activity);
                } else if (ab60Var.session != null) {
                    ab60.this.m96727v();
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
            dc60 dc60Var = ab60.this.session;
            if (dc60Var == null) {
                return;
            }
            if (ab60.this.pendingRotationReattach && Intrinsics.m88377d(activity.getClass().getName(), ab60.this.pendingReattachClassName)) {
                ab60.this.pendingRotationReattach = false;
                ab60.this.pendingReattachClassName = null;
                ab60.this.m96700C(activity, dc60Var);
            }
            if (Intrinsics.m88377d(dc60Var.m115217a().get(), activity) && dc60Var.getPausedByBackground()) {
                fc60 videoPlayerWrapper = dc60Var.getVideoPlayerWrapper();
                if (videoPlayerWrapper != null) {
                    videoPlayerWrapper.m124996i();
                }
                dc60Var.m115234r(false);
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            activity.getClass();
            dc60 dc60Var = ab60.this.session;
            if (dc60Var == null || !Intrinsics.m88377d(dc60Var.m115217a().get(), activity) || activity.isChangingConfigurations() || !dc60Var.getIsPlaying() || dc60Var.getVideoPlayerWrapper() == null) {
                return;
            }
            fc60 videoPlayerWrapper = dc60Var.getVideoPlayerWrapper();
            if (videoPlayerWrapper != null) {
                videoPlayerWrapper.m125003r();
            }
            dc60Var.m115234r(true);
        }
    }

    public ab60(@NotNull Function0<FileResourceProvider> function0) {
        function0.getClass();
        this.resourceProvider = LazyKt__LazyJVMKt.m88118b(function0);
        this.mainHandler = new Handler(Looper.getMainLooper());
        this.lifecycleCallbacks = new C15680b();
    }

    /* JADX INFO: renamed from: A */
    private final FileResourceProvider m96698A() {
        return (FileResourceProvider) this.resourceProvider.getValue();
    }

    /* JADX INFO: renamed from: B */
    private final void m96699B(dc60 s) {
        PIPRootContainer pipRootContainer = s.getPipRootContainer();
        if (pipRootContainer != null) {
            pipRootContainer.m6709z(true);
            ViewParent parent = pipRootContainer.getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.removeView(pipRootContainer);
            }
        } else {
            fc60 videoPlayerWrapper = s.getVideoPlayerWrapper();
            if (videoPlayerWrapper != null) {
                videoPlayerWrapper.m124998m();
            }
        }
        s.m115238v(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public final void m96700C(Activity activity, dc60 s) {
        s.m115228l(new WeakReference<>(activity));
        PIPRootContainer pIPRootContainer = new PIPRootContainer(activity);
        pIPRootContainer.setOnDismissRequested(new Function0() { // from class: l.na60
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ab60.m96708c(this.f140981a);
            }
        });
        pIPRootContainer.setOnShowFailed(new Function0() { // from class: l.ra60
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ab60.m96712g(this.f161899a);
            }
        });
        pIPRootContainer.setupBackPressCallback(activity);
        s.m115235s(pIPRootContainer);
        bb60.m103255b(activity).addView(pIPRootContainer, new FrameLayout.LayoutParams(-1, -1));
        pIPRootContainer.m6708v(s, true, m96698A(), m96731z());
    }

    /* JADX INFO: renamed from: D */
    private final void m96701D(dc60 s) {
        Lifecycle lifecycle;
        LifecycleEventObserver lifecycleObserver = s.getLifecycleObserver();
        if (lifecycleObserver == null) {
            return;
        }
        ker lifecycleOwner = s.getLifecycleOwner();
        if (lifecycleOwner != null && (lifecycle = lifecycleOwner.getLifecycle()) != null) {
            lifecycle.mo2970d(lifecycleObserver);
        }
        s.m115231o(null);
        s.m115232p(null);
    }

    /* JADX INFO: renamed from: E */
    private final void m96702E(final Function0<Unit> block) {
        if (Intrinsics.m88377d(Looper.myLooper(), Looper.getMainLooper())) {
            block.invoke();
        } else {
            this.mainHandler.post(new Runnable() { // from class: l.va60
                @Override // java.lang.Runnable
                public final void run() {
                    ab60.m96718m(block);
                }
            });
        }
    }

    /* JADX INFO: renamed from: G */
    private final void m96703G(Activity activity, C1288a config, ker lifecycleOwner) {
        m96729x(InterfaceC15679a.a.INSTANCE, false);
        this.pendingRotationReattach = false;
        this.pendingReattachClassName = null;
        dc60 dc60Var = new dc60(config, config.getInitialPosition(), activity);
        this.session = dc60Var;
        if (!this.callbacksRegistered) {
            activity.getApplication().registerActivityLifecycleCallbacks(this.lifecycleCallbacks);
            this.applicationRef = activity.getApplication();
            this.callbacksRegistered = true;
        }
        if (lifecycleOwner != null) {
            PIPLifecycleObserver pIPLifecycleObserver = new PIPLifecycleObserver(new Function0() { // from class: l.xa60
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ab60.m96711f(this.f192992a);
                }
            });
            dc60Var.m115232p(lifecycleOwner);
            dc60Var.m115231o(pIPLifecycleObserver);
            lifecycleOwner.getLifecycle().mo2967a(pIPLifecycleObserver);
        }
        PIPRootContainer pIPRootContainer = new PIPRootContainer(activity);
        pIPRootContainer.setOnDismissRequested(new Function0() { // from class: l.ya60
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ab60.m96706a(this.f198153a);
            }
        });
        pIPRootContainer.setOnShowFailed(new Function0() { // from class: l.za60
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ab60.m96715j(this.f203541a);
            }
        });
        dc60Var.m115235s(pIPRootContainer);
        pIPRootContainer.setupBackPressCallback(activity);
        bb60.m103255b(activity).addView(pIPRootContainer, new FrameLayout.LayoutParams(-1, -1));
        pIPRootContainer.m6708v(dc60Var, false, m96698A(), m96731z());
    }

    /* JADX INFO: renamed from: H */
    private final void m96704H() {
        ExecutorService executorService = this.mediaExecutor;
        if (executorService != null) {
            executorService.shutdown();
        }
        this.mediaExecutor = null;
    }

    /* JADX INFO: renamed from: I */
    private final void m96705I() {
        Application application = this.applicationRef;
        if (application != null) {
            application.unregisterActivityLifecycleCallbacks(this.lifecycleCallbacks);
        }
        this.applicationRef = null;
        this.callbacksRegistered = false;
    }

    /* JADX INFO: renamed from: a */
    public static Unit m96706a(final ab60 ab60Var) {
        ab60Var.getClass();
        ab60Var.m96702E(new Function0() { // from class: l.oa60
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ab60.m96709d(this.f145664a);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: b */
    public static Unit m96707b(ab60 ab60Var, Activity activity, C1288a c1288a, ker kerVar) {
        ab60Var.getClass();
        activity.getClass();
        c1288a.getClass();
        ab60Var.m96703G(activity, c1288a, kerVar);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: c */
    public static Unit m96708c(final ab60 ab60Var) {
        ab60Var.getClass();
        ab60Var.m96702E(new Function0() { // from class: l.ua60
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ab60.m96717l(this.f178181a);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: d */
    public static Unit m96709d(ab60 ab60Var) {
        ab60Var.getClass();
        m96730y(ab60Var, null, false, 3, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: e */
    public static Unit m96710e(ab60 ab60Var, dc60 dc60Var, InterfaceC15679a interfaceC15679a) {
        ab60Var.getClass();
        dc60Var.getClass();
        interfaceC15679a.getClass();
        ab60Var.m96699B(dc60Var);
        if (Intrinsics.m88377d(interfaceC15679a, InterfaceC15679a.d.INSTANCE) || Intrinsics.m88377d(interfaceC15679a, InterfaceC15679a.b.INSTANCE)) {
            m960 callbacks = dc60Var.getCom.clevertap.android.sdk.Constants.KEY_CONFIG java.lang.String().getCallbacks();
            if (callbacks != null) {
                callbacks.onClose();
            }
        } else if (Intrinsics.m88377d(interfaceC15679a, InterfaceC15679a.c.INSTANCE)) {
            m960 callbacks2 = dc60Var.getCom.clevertap.android.sdk.Constants.KEY_CONFIG java.lang.String().getCallbacks();
            if (callbacks2 != null) {
                callbacks2.mo6368c();
            }
        } else if (!Intrinsics.m88377d(interfaceC15679a, InterfaceC15679a.a.INSTANCE)) {
            nbr.m162172a();
            return null;
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: f */
    public static Unit m96711f(final ab60 ab60Var) {
        ab60Var.getClass();
        ab60Var.m96702E(new Function0() { // from class: l.qa60
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ab60.m96714i(this.f156347a);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: g */
    public static Unit m96712g(final ab60 ab60Var) {
        ab60Var.getClass();
        ab60Var.m96702E(new Function0() { // from class: l.ta60
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ab60.m96713h(this.f172696a);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: h */
    public static Unit m96713h(ab60 ab60Var) {
        ab60Var.getClass();
        ab60Var.m96729x(InterfaceC15679a.c.INSTANCE, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: i */
    public static Unit m96714i(ab60 ab60Var) {
        ab60Var.getClass();
        ab60Var.m96727v();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: j */
    public static Unit m96715j(final ab60 ab60Var) {
        ab60Var.getClass();
        ab60Var.m96702E(new Function0() { // from class: l.pa60
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ab60.m96716k(this.f151245a);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: k */
    public static Unit m96716k(ab60 ab60Var) {
        ab60Var.getClass();
        ab60Var.m96729x(InterfaceC15679a.c.INSTANCE, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: l */
    public static Unit m96717l(ab60 ab60Var) {
        ab60Var.getClass();
        m96730y(ab60Var, null, false, 3, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: m */
    public static void m96718m(Function0 function0) {
        function0.getClass();
        function0.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public final void m96727v() {
        m96729x(InterfaceC15679a.b.INSTANCE, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public final void m96728w(dc60 s, Activity activity) {
        fc60 videoPlayerWrapper = s.getVideoPlayerWrapper();
        if (videoPlayerWrapper != null) {
            videoPlayerWrapper.m124989b();
        }
        PIPRootContainer pipRootContainer = s.getPipRootContainer();
        if (pipRootContainer != null) {
            PIPRootContainer.m6678A(pipRootContainer, false, 1, null);
            ViewParent parent = pipRootContainer.getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.removeView(pipRootContainer);
            }
        }
        s.m115235s(null);
        this.pendingRotationReattach = true;
        this.pendingReattachClassName = activity.getClass().getName();
    }

    /* JADX INFO: renamed from: x */
    private final void m96729x(final InterfaceC15679a reason, boolean animate) {
        final dc60 dc60Var = this.session;
        if (dc60Var == null) {
            return;
        }
        this.session = null;
        m96701D(dc60Var);
        Function0<Unit> function0 = new Function0() { // from class: l.sa60
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ab60.m96710e(this.f167007a, dc60Var, reason);
            }
        };
        PIPRootContainer pipRootContainer = dc60Var.getPipRootContainer();
        if (!animate || pipRootContainer == null) {
            function0.invoke();
        } else {
            pipRootContainer.m6707B(function0);
        }
        m96704H();
        m96705I();
    }

    /* JADX INFO: renamed from: y */
    public static /* synthetic */ void m96730y(ab60 ab60Var, InterfaceC15679a interfaceC15679a, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            interfaceC15679a = InterfaceC15679a.d.INSTANCE;
        }
        if ((i & 2) != 0) {
            z = true;
        }
        ab60Var.m96729x(interfaceC15679a, z);
    }

    /* JADX INFO: renamed from: z */
    private final ExecutorService m96731z() {
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
    public final void m96732F(@NotNull final Activity activity, @NotNull final C1288a config, @Nullable final ker lifecycleOwner) {
        activity.getClass();
        config.getClass();
        m96702E(new Function0() { // from class: l.wa60
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ab60.m96707b(this.f188088a, activity, config, lifecycleOwner);
            }
        });
    }
}
