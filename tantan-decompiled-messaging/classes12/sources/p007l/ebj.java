package p007l;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.p006ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001dB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\r\u0010\fJ\u0017\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\fJ\u0017\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000f\u0010\fJ\u0017\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0010\u0010\fJ\u001f\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0012\u0010\nJ\u000f\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0016\u0010\fR\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00180\u00178BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001e"}, d2 = {"Ll/ebj;", "Landroid/app/Application$ActivityLifecycleCallbacks;", "<init>", "()V", "Landroid/app/Activity;", RXScreenCaptureService.KEY_LAUNCH_ACTIVITY, "Landroid/os/Bundle;", "savedInstanceState", "", "onActivityCreated", "(Landroid/app/Activity;Landroid/os/Bundle;)V", "onActivityStarted", "(Landroid/app/Activity;)V", "onActivityResumed", "onActivityPaused", "onActivityStopped", "onActivityDestroyed", "outState", "onActivitySaveInstanceState", "", "d", "()Z", "e", "", "Ll/xaj;", "c", "()Ljava/util/Collection;", "fxList", "Companion", "a", "putong-common_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ebj implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a */
    @Nullable
    public static WeakReference<Activity> f7277a;

    /* JADX INFO: renamed from: c */
    public final Collection<xaj> m9694c() {
        return cri.INSTANCE.m9231e().values();
    }

    /* JADX INFO: renamed from: d */
    public final boolean m9695d() {
        return m9694c().isEmpty();
    }

    /* JADX INFO: renamed from: e */
    public final void m9696e(Activity activity) {
        WeakReference<Activity> weakReference = f7277a;
        if (Intrinsics.d(weakReference != null ? weakReference.get() : null, activity)) {
            return;
        }
        f7277a = new WeakReference<>(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(@NotNull Activity activity, @Nullable Bundle savedInstanceState) {
        activity.getClass();
        if (m9695d()) {
            return;
        }
        Iterator<xaj> it = m9694c().iterator();
        while (it.hasNext()) {
            it.next().onActivityCreated(activity, savedInstanceState);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(@NotNull Activity activity) {
        activity.getClass();
        if (m9695d()) {
            return;
        }
        Iterator<xaj> it = m9694c().iterator();
        while (it.hasNext()) {
            it.next().onActivityDestroyed(activity);
        }
        WeakReference<Activity> weakReference = f7277a;
        if ((weakReference != null ? weakReference.get() : null) == activity) {
            WeakReference<Activity> weakReference2 = f7277a;
            if (weakReference2 != null) {
                weakReference2.clear();
            }
            f7277a = null;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(@NotNull Activity activity) {
        activity.getClass();
        if (m9695d()) {
            return;
        }
        Iterator<xaj> it = m9694c().iterator();
        while (it.hasNext()) {
            it.next().onActivityPaused(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(@NotNull Activity activity) {
        activity.getClass();
        m9696e(activity);
        if (m9695d()) {
            return;
        }
        Iterator<xaj> it = m9694c().iterator();
        while (it.hasNext()) {
            it.next().onActivityResumed(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(@NotNull Activity activity, @NotNull Bundle outState) {
        activity.getClass();
        outState.getClass();
        if (m9695d()) {
            return;
        }
        Iterator<xaj> it = m9694c().iterator();
        while (it.hasNext()) {
            it.next().onActivitySaveInstanceState(activity, outState);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(@NotNull Activity activity) {
        activity.getClass();
        if (m9695d()) {
            return;
        }
        Iterator<xaj> it = m9694c().iterator();
        while (it.hasNext()) {
            it.next().onActivityStarted(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(@NotNull Activity activity) {
        activity.getClass();
        if (m9695d()) {
            return;
        }
        Iterator<xaj> it = m9694c().iterator();
        while (it.hasNext()) {
            it.next().onActivityStopped(activity);
        }
    }

    /* JADX INFO: renamed from: l.ebj$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\t\u0010\u0003R*\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\n8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Ll/ebj$a;", "", "<init>", "()V", "Landroid/app/Activity;", RXScreenCaptureService.KEY_LAUNCH_ACTIVITY, "", "d", "(Landroid/app/Activity;)V", "b", "Ljava/lang/ref/WeakReference;", "topActivity", "Ljava/lang/ref/WeakReference;", "a", "()Ljava/lang/ref/WeakReference;", "c", "(Ljava/lang/ref/WeakReference;)V", "putong-common_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        /* JADX INFO: renamed from: a */
        public final WeakReference<Activity> m9697a() {
            return ebj.f7277a;
        }

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ void m9698b() {
            WeakReference<Activity> weakReferenceM9697a = m9697a();
            if (weakReferenceM9697a != null) {
                weakReferenceM9697a.clear();
            }
            m9699c(null);
        }

        /* JADX INFO: renamed from: c */
        public final void m9699c(@Nullable WeakReference<Activity> weakReference) {
            ebj.f7277a = weakReference;
        }

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ void m9700d(Activity activity) {
            if (activity == null) {
                return;
            }
            m9699c(new WeakReference<>(activity));
        }

        public Companion() {
        }
    }
}
