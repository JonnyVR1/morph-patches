package p153l;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 \u00182\u00020\u0001:\u0001\rB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\bJ\u000f\u0010\n\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\bJ\u000f\u0010\u000b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\bR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, m88121d2 = {"Ll/vll0;", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "Landroid/app/Activity;", "activity", "<init>", "(Landroid/app/Activity;)V", "", "onGlobalLayout", "()V", "f", "g", "e", "Ljava/lang/ref/WeakReference;", "a", "Ljava/lang/ref/WeakReference;", "activityWeakReference", "Landroid/os/Handler;", "b", "Landroid/os/Handler;", "uiThreadHandler", "Ljava/util/concurrent/atomic/AtomicBoolean;", "c", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isTracking", "Companion", "facebook-core_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
public final class vll0 implements ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: d */
    @NotNull
    public static final Map<Integer, vll0> f184611d = new HashMap();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final WeakReference<Activity> activityWeakReference;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final Handler uiThreadHandler;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final AtomicBoolean isTracking;

    public vll0(Activity activity) {
        this.activityWeakReference = new WeakReference<>(activity);
        this.uiThreadHandler = new Handler(Looper.getMainLooper());
        this.isTracking = new AtomicBoolean(false);
    }

    /* JADX INFO: renamed from: a */
    public static void m201642a(vll0 vll0Var) {
        if (ztb.m221490d(vll0.class)) {
            return;
        }
        try {
            vll0Var.getClass();
            try {
                View viewM198220d = uv0.m198220d(vll0Var.activityWeakReference.get());
                Activity activity = vll0Var.activityWeakReference.get();
                if (viewM198220d != null && activity != null) {
                    for (View view : g2h0.m128622a(viewM198220d)) {
                        if (!zpe0.m220836g(view)) {
                            String strM128624d = g2h0.m128624d(view);
                            if (strM128624d.length() > 0 && strM128624d.length() <= 300) {
                                yll0.Companion companion = yll0.INSTANCE;
                                String localClassName = activity.getLocalClassName();
                                localClassName.getClass();
                                companion.m216609d(view, viewM198220d, localClassName);
                            }
                        }
                    }
                }
            } catch (Exception unused) {
            }
        } catch (Throwable th) {
            ztb.m221488b(th, vll0.class);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ Map m201643b() {
        if (ztb.m221490d(vll0.class)) {
            return null;
        }
        try {
            return f184611d;
        } catch (Throwable th) {
            ztb.m221488b(th, vll0.class);
            return null;
        }
    }

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ void m201644c(vll0 vll0Var) {
        if (ztb.m221490d(vll0.class)) {
            return;
        }
        try {
            vll0Var.m201647f();
        } catch (Throwable th) {
            ztb.m221488b(th, vll0.class);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ void m201645d(vll0 vll0Var) {
        if (ztb.m221490d(vll0.class)) {
            return;
        }
        try {
            vll0Var.m201648g();
        } catch (Throwable th) {
            ztb.m221488b(th, vll0.class);
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m201646e() {
        if (ztb.m221490d(this)) {
            return;
        }
        try {
            Runnable runnable = new Runnable() { // from class: l.ull0
                @Override // java.lang.Runnable
                public final void run() {
                    vll0.m201642a(this.f179519a);
                }
            };
            if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                runnable.run();
            } else {
                this.uiThreadHandler.post(runnable);
            }
        } catch (Throwable th) {
            ztb.m221488b(th, this);
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m201647f() {
        View viewM198220d;
        if (ztb.m221490d(this)) {
            return;
        }
        try {
            if (!this.isTracking.getAndSet(true) && (viewM198220d = uv0.m198220d(this.activityWeakReference.get())) != null) {
                ViewTreeObserver viewTreeObserver = viewM198220d.getViewTreeObserver();
                if (viewTreeObserver.isAlive()) {
                    viewTreeObserver.addOnGlobalLayoutListener(this);
                    m201646e();
                }
            }
        } catch (Throwable th) {
            ztb.m221488b(th, this);
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m201648g() {
        View viewM198220d;
        if (ztb.m221490d(this)) {
            return;
        }
        try {
            if (this.isTracking.getAndSet(false) && (viewM198220d = uv0.m198220d(this.activityWeakReference.get())) != null) {
                ViewTreeObserver viewTreeObserver = viewM198220d.getViewTreeObserver();
                if (viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnGlobalLayoutListener(this);
                }
            }
        } catch (Throwable th) {
            ztb.m221488b(th, this);
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        if (ztb.m221490d(this)) {
            return;
        }
        try {
            m201646e();
        } catch (Throwable th) {
            ztb.m221488b(th, this);
        }
    }

    /* JADX INFO: renamed from: l.vll0$a, reason: from kotlin metadata */
    @Metadata(m88120d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\t\u0010\bR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\fR \u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000e0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m88121d2 = {"Ll/vll0$a;", "", "<init>", "()V", "Landroid/app/Activity;", "activity", "", "a", "(Landroid/app/Activity;)V", "b", "", "MAX_TEXT_LENGTH", "I", "", "Ll/vll0;", "observers", "Ljava/util/Map;", "facebook-core_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* JADX INFO: renamed from: a */
        public final void m201649a(@NotNull Activity activity) {
            activity.getClass();
            int iHashCode = activity.hashCode();
            Map mapM201643b = vll0.m201643b();
            Integer numValueOf = Integer.valueOf(iHashCode);
            Object vll0Var = mapM201643b.get(numValueOf);
            if (vll0Var == null) {
                vll0Var = new vll0(activity, null);
                mapM201643b.put(numValueOf, vll0Var);
            }
            vll0.m201644c((vll0) vll0Var);
        }

        @JvmStatic
        /* JADX INFO: renamed from: b */
        public final void m201650b(@NotNull Activity activity) {
            activity.getClass();
            vll0 vll0Var = (vll0) vll0.m201643b().remove(Integer.valueOf(activity.hashCode()));
            if (vll0Var != null) {
                vll0.m201645d(vll0Var);
            }
        }

        public Companion() {
        }
    }

    public /* synthetic */ vll0(Activity activity, DefaultConstructorMarker defaultConstructorMarker) {
        this(activity);
    }
}
