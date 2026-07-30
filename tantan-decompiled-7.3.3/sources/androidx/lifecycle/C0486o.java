package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import androidx.annotation.RequiresApi;
import androidx.lifecycle.C0486o;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.clevertap.android.sdk.Constants;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.ker;
import p153l.tze;

/* JADX INFO: renamed from: androidx.lifecycle.o */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 *2\u00020\u0001:\u0002\u0013\u0010B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0006\u0010\u0003J\u000f\u0010\u0007\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\u0003J\u000f\u0010\b\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\b\u0010\u0003J\u000f\u0010\t\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\t\u0010\u0003J\u000f\u0010\n\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\n\u0010\u0003J\u0017\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\r\u0010\u000eR\u0016\u0010\u0012\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0014\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0011R\u0016\u0010\u0018\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0019\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u0017R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u001bR\u0014\u0010\u001f\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001eR\u0014\u0010\"\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010!R\u0014\u0010%\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010$R\u0014\u0010)\u001a\u00020&8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(¨\u0006+"}, m88121d2 = {"Landroidx/lifecycle/o;", "Ll/ker;", "<init>", "()V", "", "f", "e", Constants.INAPP_DATA_TAG, "g", RXScreenCaptureService.KEY_INDEX, "j", "Landroid/content/Context;", "context", "h", "(Landroid/content/Context;)V", "", "a", "I", "startedCounter", "b", "resumedCounter", "", "c", "Z", "pauseSent", "stopSent", "Landroid/os/Handler;", "Landroid/os/Handler;", "handler", "Landroidx/lifecycle/k;", "Landroidx/lifecycle/k;", "registry", "Ljava/lang/Runnable;", "Ljava/lang/Runnable;", "delayedPauseRunnable", "Landroidx/lifecycle/ReportFragment$a;", "Landroidx/lifecycle/ReportFragment$a;", "initializationListener", "Landroidx/lifecycle/Lifecycle;", "getLifecycle", "()Landroidx/lifecycle/Lifecycle;", RequestParameters.SUBRESOURCE_LIFECYCLE, "Companion", "lifecycle-process_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
public final class C0486o implements ker {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: i */
    @NotNull
    public static final C0486o f2315i = new C0486o();

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
    public final C0482k registry = new C0482k(this);

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public final Runnable delayedPauseRunnable = new Runnable() { // from class: l.mk90
        @Override // java.lang.Runnable
        public final void run() {
            C0486o.m3047a(this.f137273a);
        }
    };

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    public final ReportFragment.InterfaceC0468a initializationListener = new d();

    /* JADX INFO: renamed from: androidx.lifecycle.o$a */
    @RequiresApi(29)
    @Metadata(m88120d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m88121d2 = {"Landroidx/lifecycle/o$a;", "", "<init>", "()V", "Landroid/app/Activity;", "activity", "Landroid/app/Application$ActivityLifecycleCallbacks;", "callback", "", "a", "(Landroid/app/Activity;Landroid/app/Application$ActivityLifecycleCallbacks;)V", "lifecycle-process_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
    public static final class a {

        @NotNull
        public static final a INSTANCE = new a();

        @JvmStatic
        /* JADX INFO: renamed from: a */
        public static final void m3057a(@NotNull Activity activity, @NotNull Application.ActivityLifecycleCallbacks callback) {
            activity.getClass();
            callback.getClass();
            activity.registerActivityLifecycleCallbacks(callback);
        }
    }

    /* JADX INFO: renamed from: androidx.lifecycle.o$b, reason: from kotlin metadata */
    @Metadata(m88120d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0001¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m88121d2 = {"Landroidx/lifecycle/o$b;", "", "<init>", "()V", "Ll/ker;", "a", "()Ll/ker;", "Landroid/content/Context;", "context", "", "b", "(Landroid/content/Context;)V", "Landroidx/lifecycle/o;", "newInstance", "Landroidx/lifecycle/o;", "lifecycle-process_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        /* JADX INFO: renamed from: a */
        public final ker m3058a() {
            return C0486o.f2315i;
        }

        @JvmStatic
        /* JADX INFO: renamed from: b */
        public final void m3059b(@NotNull Context context) {
            context.getClass();
            C0486o.f2315i.m3054h(context);
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: androidx.lifecycle.o$c */
    @Metadata(m88120d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J!\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0017¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\t\u0010\bJ\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\u000b¨\u0006\r"}, m88121d2 = {"androidx/lifecycle/o$c", "Ll/tze;", "Landroid/app/Activity;", "activity", "Landroid/os/Bundle;", "savedInstanceState", "", "onActivityPreCreated", "(Landroid/app/Activity;Landroid/os/Bundle;)V", "onActivityCreated", "onActivityPaused", "(Landroid/app/Activity;)V", "onActivityStopped", "lifecycle-process_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
    public static final class c extends tze {

        /* JADX INFO: renamed from: androidx.lifecycle.o$c$a */
        @Metadata(m88120d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006¨\u0006\b"}, m88121d2 = {"androidx/lifecycle/o$c$a", "Ll/tze;", "Landroid/app/Activity;", "activity", "", "onActivityPostStarted", "(Landroid/app/Activity;)V", "onActivityPostResumed", "lifecycle-process_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
        public static final class a extends tze {
            final /* synthetic */ C0486o this$0;

            public a(C0486o c0486o) {
                this.this$0 = c0486o;
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityPostResumed(Activity activity) {
                activity.getClass();
                this.this$0.m3051e();
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityPostStarted(Activity activity) {
                activity.getClass();
                this.this$0.m3052f();
            }
        }

        public c() {
        }

        @Override // p153l.tze, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle savedInstanceState) {
            activity.getClass();
            if (Build.VERSION.SDK_INT < 29) {
                ReportFragment.INSTANCE.m3008b(activity).m3005f(C0486o.this.initializationListener);
            }
        }

        @Override // p153l.tze, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            activity.getClass();
            C0486o.this.m3050d();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        @RequiresApi(29)
        public void onActivityPreCreated(Activity activity, Bundle savedInstanceState) {
            activity.getClass();
            a.m3057a(activity, new a(C0486o.this));
        }

        @Override // p153l.tze, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            activity.getClass();
            C0486o.this.m3053g();
        }
    }

    /* JADX INFO: renamed from: androidx.lifecycle.o$d */
    @Metadata(m88120d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0004¨\u0006\u0007"}, m88121d2 = {"androidx/lifecycle/o$d", "Landroidx/lifecycle/ReportFragment$a;", "", "a", "()V", "onStart", "onResume", "lifecycle-process_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
    public static final class d implements ReportFragment.InterfaceC0468a {
        public d() {
        }

        @Override // androidx.lifecycle.ReportFragment.InterfaceC0468a
        /* JADX INFO: renamed from: a */
        public void mo3006a() {
        }

        @Override // androidx.lifecycle.ReportFragment.InterfaceC0468a
        public void onResume() {
            C0486o.this.m3051e();
        }

        @Override // androidx.lifecycle.ReportFragment.InterfaceC0468a
        public void onStart() {
            C0486o.this.m3052f();
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m3047a(C0486o c0486o) {
        c0486o.m3055i();
        c0486o.m3056j();
    }

    /* JADX INFO: renamed from: d */
    public final void m3050d() {
        int i = this.resumedCounter - 1;
        this.resumedCounter = i;
        if (i == 0) {
            Handler handler = this.handler;
            handler.getClass();
            handler.postDelayed(this.delayedPauseRunnable, 700L);
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m3051e() {
        int i = this.resumedCounter + 1;
        this.resumedCounter = i;
        if (i == 1) {
            if (this.pauseSent) {
                this.registry.m3029i(Lifecycle.Event.ON_RESUME);
                this.pauseSent = false;
            } else {
                Handler handler = this.handler;
                handler.getClass();
                handler.removeCallbacks(this.delayedPauseRunnable);
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m3052f() {
        int i = this.startedCounter + 1;
        this.startedCounter = i;
        if (i == 1 && this.stopSent) {
            this.registry.m3029i(Lifecycle.Event.ON_START);
            this.stopSent = false;
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m3053g() {
        this.startedCounter--;
        m3056j();
    }

    @Override // p153l.ker
    @NotNull
    public Lifecycle getLifecycle() {
        return this.registry;
    }

    /* JADX INFO: renamed from: h */
    public final void m3054h(@NotNull Context context) {
        context.getClass();
        this.handler = new Handler();
        this.registry.m3029i(Lifecycle.Event.ON_CREATE);
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        ((Application) applicationContext).registerActivityLifecycleCallbacks(new c());
    }

    /* JADX INFO: renamed from: i */
    public final void m3055i() {
        if (this.resumedCounter == 0) {
            this.pauseSent = true;
            this.registry.m3029i(Lifecycle.Event.ON_PAUSE);
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m3056j() {
        if (this.startedCounter == 0 && this.pauseSent) {
            this.registry.m3029i(Lifecycle.Event.ON_STOP);
            this.stopSent = true;
        }
    }
}
