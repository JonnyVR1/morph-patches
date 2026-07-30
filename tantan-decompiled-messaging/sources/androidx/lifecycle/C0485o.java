package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import androidx.annotation.RequiresApi;
import androidx.lifecycle.C0485o;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.clevertap.android.sdk.Constants;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.jcr;
import p149l.pye;

/* JADX INFO: renamed from: androidx.lifecycle.o */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 *2\u00020\u0001:\u0002\u0013\u0010B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0006\u0010\u0003J\u000f\u0010\u0007\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\u0003J\u000f\u0010\b\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\b\u0010\u0003J\u000f\u0010\t\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\t\u0010\u0003J\u000f\u0010\n\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\n\u0010\u0003J\u0017\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\r\u0010\u000eR\u0016\u0010\u0012\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0014\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0011R\u0016\u0010\u0018\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0019\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u0017R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u001bR\u0014\u0010\u001f\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001eR\u0014\u0010\"\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010!R\u0014\u0010%\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010$R\u0014\u0010)\u001a\u00020&8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(¨\u0006+"}, m87232d2 = {"Landroidx/lifecycle/o;", "Ll/jcr;", "<init>", "()V", "", "f", "e", Constants.INAPP_DATA_TAG, "g", RXScreenCaptureService.KEY_INDEX, "j", "Landroid/content/Context;", "context", "h", "(Landroid/content/Context;)V", "", "a", "I", "startedCounter", "b", "resumedCounter", "", "c", "Z", "pauseSent", "stopSent", "Landroid/os/Handler;", "Landroid/os/Handler;", "handler", "Landroidx/lifecycle/k;", "Landroidx/lifecycle/k;", "registry", "Ljava/lang/Runnable;", "Ljava/lang/Runnable;", "delayedPauseRunnable", "Landroidx/lifecycle/ReportFragment$a;", "Landroidx/lifecycle/ReportFragment$a;", "initializationListener", "Landroidx/lifecycle/Lifecycle;", "getLifecycle", "()Landroidx/lifecycle/Lifecycle;", RequestParameters.SUBRESOURCE_LIFECYCLE, "Companion", "lifecycle-process_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
public final class C0485o implements jcr {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: i */
    @NotNull
    public static final C0485o f2315i = new C0485o();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public int startedCounter;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public int resumedCounter;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    public Handler handler;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public boolean pauseSent = true;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public boolean stopSent = true;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public final C0481k registry = new C0481k(this);

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public final Runnable delayedPauseRunnable = new Runnable() { // from class: l.ic90
        @Override // java.lang.Runnable
        public final void run() {
            C0485o.m3046a(this.f112445a);
        }
    };

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    public final ReportFragment.InterfaceC0467a initializationListener = new d();

    /* JADX INFO: renamed from: androidx.lifecycle.o$a */
    @RequiresApi(29)
    @Metadata(m87231d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m87232d2 = {"Landroidx/lifecycle/o$a;", "", "<init>", "()V", "Landroid/app/Activity;", "activity", "Landroid/app/Application$ActivityLifecycleCallbacks;", "callback", "", "a", "(Landroid/app/Activity;Landroid/app/Application$ActivityLifecycleCallbacks;)V", "lifecycle-process_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
    public static final class a {

        @NotNull
        public static final a INSTANCE = new a();

        @JvmStatic
        /* JADX INFO: renamed from: a */
        public static final void m3056a(@NotNull Activity activity, @NotNull Application.ActivityLifecycleCallbacks callback) {
            activity.getClass();
            callback.getClass();
            activity.registerActivityLifecycleCallbacks(callback);
        }
    }

    /* JADX INFO: renamed from: androidx.lifecycle.o$b, reason: from kotlin metadata */
    @Metadata(m87231d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0001¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m87232d2 = {"Landroidx/lifecycle/o$b;", "", "<init>", "()V", "Ll/jcr;", "a", "()Ll/jcr;", "Landroid/content/Context;", "context", "", "b", "(Landroid/content/Context;)V", "Landroidx/lifecycle/o;", "newInstance", "Landroidx/lifecycle/o;", "lifecycle-process_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        /* JADX INFO: renamed from: a */
        public final jcr m3057a() {
            return C0485o.f2315i;
        }

        @JvmStatic
        /* JADX INFO: renamed from: b */
        public final void m3058b(@NotNull Context context) {
            context.getClass();
            C0485o.f2315i.m3053h(context);
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: androidx.lifecycle.o$c */
    @Metadata(m87231d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J!\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0017¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\t\u0010\bJ\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\u000b¨\u0006\r"}, m87232d2 = {"androidx/lifecycle/o$c", "Ll/pye;", "Landroid/app/Activity;", "activity", "Landroid/os/Bundle;", "savedInstanceState", "", "onActivityPreCreated", "(Landroid/app/Activity;Landroid/os/Bundle;)V", "onActivityCreated", "onActivityPaused", "(Landroid/app/Activity;)V", "onActivityStopped", "lifecycle-process_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
    public static final class c extends pye {

        /* JADX INFO: renamed from: androidx.lifecycle.o$c$a */
        @Metadata(m87231d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006¨\u0006\b"}, m87232d2 = {"androidx/lifecycle/o$c$a", "Ll/pye;", "Landroid/app/Activity;", "activity", "", "onActivityPostStarted", "(Landroid/app/Activity;)V", "onActivityPostResumed", "lifecycle-process_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
        public static final class a extends pye {
            final /* synthetic */ C0485o this$0;

            public a(C0485o c0485o) {
                this.this$0 = c0485o;
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityPostResumed(Activity activity) {
                activity.getClass();
                this.this$0.m3050e();
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityPostStarted(Activity activity) {
                activity.getClass();
                this.this$0.m3051f();
            }
        }

        public c() {
        }

        @Override // p149l.pye, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle savedInstanceState) {
            activity.getClass();
            if (Build.VERSION.SDK_INT < 29) {
                ReportFragment.INSTANCE.m3007b(activity).m3004f(C0485o.this.initializationListener);
            }
        }

        @Override // p149l.pye, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            activity.getClass();
            C0485o.this.m3049d();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        @RequiresApi(29)
        public void onActivityPreCreated(Activity activity, Bundle savedInstanceState) {
            activity.getClass();
            a.m3056a(activity, new a(C0485o.this));
        }

        @Override // p149l.pye, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            activity.getClass();
            C0485o.this.m3052g();
        }
    }

    /* JADX INFO: renamed from: androidx.lifecycle.o$d */
    @Metadata(m87231d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0004¨\u0006\u0007"}, m87232d2 = {"androidx/lifecycle/o$d", "Landroidx/lifecycle/ReportFragment$a;", "", "a", "()V", "onStart", "onResume", "lifecycle-process_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
    public static final class d implements ReportFragment.InterfaceC0467a {
        public d() {
        }

        @Override // androidx.lifecycle.ReportFragment.InterfaceC0467a
        /* JADX INFO: renamed from: a */
        public void mo3005a() {
        }

        @Override // androidx.lifecycle.ReportFragment.InterfaceC0467a
        public void onResume() {
            C0485o.this.m3050e();
        }

        @Override // androidx.lifecycle.ReportFragment.InterfaceC0467a
        public void onStart() {
            C0485o.this.m3051f();
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m3046a(C0485o c0485o) {
        c0485o.m3054i();
        c0485o.m3055j();
    }

    /* JADX INFO: renamed from: d */
    public final void m3049d() {
        int i = this.resumedCounter - 1;
        this.resumedCounter = i;
        if (i == 0) {
            Handler handler = this.handler;
            handler.getClass();
            handler.postDelayed(this.delayedPauseRunnable, 700L);
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m3050e() {
        int i = this.resumedCounter + 1;
        this.resumedCounter = i;
        if (i == 1) {
            if (this.pauseSent) {
                this.registry.m3028i(Lifecycle.Event.ON_RESUME);
                this.pauseSent = false;
            } else {
                Handler handler = this.handler;
                handler.getClass();
                handler.removeCallbacks(this.delayedPauseRunnable);
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m3051f() {
        int i = this.startedCounter + 1;
        this.startedCounter = i;
        if (i == 1 && this.stopSent) {
            this.registry.m3028i(Lifecycle.Event.ON_START);
            this.stopSent = false;
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m3052g() {
        this.startedCounter--;
        m3055j();
    }

    @Override // p149l.jcr
    @NotNull
    public Lifecycle getLifecycle() {
        return this.registry;
    }

    /* JADX INFO: renamed from: h */
    public final void m3053h(@NotNull Context context) {
        context.getClass();
        this.handler = new Handler();
        this.registry.m3028i(Lifecycle.Event.ON_CREATE);
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        ((Application) applicationContext).registerActivityLifecycleCallbacks(new c());
    }

    /* JADX INFO: renamed from: i */
    public final void m3054i() {
        if (this.resumedCounter == 0) {
            this.pauseSent = true;
            this.registry.m3028i(Lifecycle.Event.ON_PAUSE);
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m3055j() {
        if (this.startedCounter == 0 && this.pauseSent) {
            this.registry.m3028i(Lifecycle.Event.ON_STOP);
            this.stopSent = true;
        }
    }
}
