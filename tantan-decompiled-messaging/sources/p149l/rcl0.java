package p149l;

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
@Metadata(m87231d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 \u00182\u00020\u0001:\u0001\rB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\bJ\u000f\u0010\n\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\bJ\u000f\u0010\u000b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\bR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, m87232d2 = {"Ll/rcl0;", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "Landroid/app/Activity;", "activity", "<init>", "(Landroid/app/Activity;)V", "", "onGlobalLayout", "()V", "f", "g", "e", "Ljava/lang/ref/WeakReference;", "a", "Ljava/lang/ref/WeakReference;", "activityWeakReference", "Landroid/os/Handler;", "b", "Landroid/os/Handler;", "uiThreadHandler", "Ljava/util/concurrent/atomic/AtomicBoolean;", "c", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isTracking", "Companion", "facebook-core_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
public final class rcl0 implements ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: d */
    @NotNull
    public static final Map<Integer, rcl0> f158782d = new HashMap();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final WeakReference<Activity> activityWeakReference;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final Handler uiThreadHandler;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final AtomicBoolean isTracking;

    public rcl0(Activity activity) {
        this.activityWeakReference = new WeakReference<>(activity);
        this.uiThreadHandler = new Handler(Looper.getMainLooper());
        this.isTracking = new AtomicBoolean(false);
    }

    /* JADX INFO: renamed from: a */
    public static void m178800a(rcl0 rcl0Var) {
        if (lsb.m151554d(rcl0.class)) {
            return;
        }
        try {
            rcl0Var.getClass();
            try {
                View viewM161521d = nv0.m161521d(rcl0Var.activityWeakReference.get());
                Activity activity = rcl0Var.activityWeakReference.get();
                if (viewM161521d != null && activity != null) {
                    for (View view : ytg0.m216010a(viewM161521d)) {
                        if (!uhe0.m193706g(view)) {
                            String strM216012d = ytg0.m216012d(view);
                            if (strM216012d.length() > 0 && strM216012d.length() <= 300) {
                                ucl0.Companion companion = ucl0.INSTANCE;
                                String localClassName = activity.getLocalClassName();
                                localClassName.getClass();
                                companion.m193093d(view, viewM161521d, localClassName);
                            }
                        }
                    }
                }
            } catch (Exception unused) {
            }
        } catch (Throwable th) {
            lsb.m151552b(th, rcl0.class);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ Map m178801b() {
        if (lsb.m151554d(rcl0.class)) {
            return null;
        }
        try {
            return f158782d;
        } catch (Throwable th) {
            lsb.m151552b(th, rcl0.class);
            return null;
        }
    }

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ void m178802c(rcl0 rcl0Var) {
        if (lsb.m151554d(rcl0.class)) {
            return;
        }
        try {
            rcl0Var.m178805f();
        } catch (Throwable th) {
            lsb.m151552b(th, rcl0.class);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ void m178803d(rcl0 rcl0Var) {
        if (lsb.m151554d(rcl0.class)) {
            return;
        }
        try {
            rcl0Var.m178806g();
        } catch (Throwable th) {
            lsb.m151552b(th, rcl0.class);
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m178804e() {
        if (lsb.m151554d(this)) {
            return;
        }
        try {
            Runnable runnable = new Runnable() { // from class: l.qcl0
                @Override // java.lang.Runnable
                public final void run() {
                    rcl0.m178800a(this.f153764a);
                }
            };
            if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                runnable.run();
            } else {
                this.uiThreadHandler.post(runnable);
            }
        } catch (Throwable th) {
            lsb.m151552b(th, this);
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m178805f() {
        View viewM161521d;
        if (lsb.m151554d(this)) {
            return;
        }
        try {
            if (!this.isTracking.getAndSet(true) && (viewM161521d = nv0.m161521d(this.activityWeakReference.get())) != null) {
                ViewTreeObserver viewTreeObserver = viewM161521d.getViewTreeObserver();
                if (viewTreeObserver.isAlive()) {
                    viewTreeObserver.addOnGlobalLayoutListener(this);
                    m178804e();
                }
            }
        } catch (Throwable th) {
            lsb.m151552b(th, this);
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m178806g() {
        View viewM161521d;
        if (lsb.m151554d(this)) {
            return;
        }
        try {
            if (this.isTracking.getAndSet(false) && (viewM161521d = nv0.m161521d(this.activityWeakReference.get())) != null) {
                ViewTreeObserver viewTreeObserver = viewM161521d.getViewTreeObserver();
                if (viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnGlobalLayoutListener(this);
                }
            }
        } catch (Throwable th) {
            lsb.m151552b(th, this);
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        if (lsb.m151554d(this)) {
            return;
        }
        try {
            m178804e();
        } catch (Throwable th) {
            lsb.m151552b(th, this);
        }
    }

    /* JADX INFO: renamed from: l.rcl0$a, reason: from kotlin metadata */
    @Metadata(m87231d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\t\u0010\bR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\fR \u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000e0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m87232d2 = {"Ll/rcl0$a;", "", "<init>", "()V", "Landroid/app/Activity;", "activity", "", "a", "(Landroid/app/Activity;)V", "b", "", "MAX_TEXT_LENGTH", "I", "", "Ll/rcl0;", "observers", "Ljava/util/Map;", "facebook-core_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* JADX INFO: renamed from: a */
        public final void m178807a(@NotNull Activity activity) {
            activity.getClass();
            int iHashCode = activity.hashCode();
            Map mapM178801b = rcl0.m178801b();
            Integer numValueOf = Integer.valueOf(iHashCode);
            Object rcl0Var = mapM178801b.get(numValueOf);
            if (rcl0Var == null) {
                rcl0Var = new rcl0(activity, null);
                mapM178801b.put(numValueOf, rcl0Var);
            }
            rcl0.m178802c((rcl0) rcl0Var);
        }

        @JvmStatic
        /* JADX INFO: renamed from: b */
        public final void m178808b(@NotNull Activity activity) {
            activity.getClass();
            rcl0 rcl0Var = (rcl0) rcl0.m178801b().remove(Integer.valueOf(activity.hashCode()));
            if (rcl0Var != null) {
                rcl0.m178803d(rcl0Var);
            }
        }

        public Companion() {
        }
    }

    public /* synthetic */ rcl0(Activity activity, DefaultConstructorMarker defaultConstructorMarker) {
        this(activity);
    }
}
