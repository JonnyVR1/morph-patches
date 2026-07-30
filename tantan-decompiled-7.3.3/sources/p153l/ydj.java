package p153l;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.clevertap.android.sdk.Constants;
import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(m88120d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001dB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\r\u0010\fJ\u0017\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\fJ\u0017\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000f\u0010\fJ\u0017\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0010\u0010\fJ\u001f\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0012\u0010\nJ\u000f\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0016\u0010\fR\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00180\u00178BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001e"}, m88121d2 = {"Ll/ydj;", "Landroid/app/Application$ActivityLifecycleCallbacks;", "<init>", "()V", "Landroid/app/Activity;", "activity", "Landroid/os/Bundle;", "savedInstanceState", "", "onActivityCreated", "(Landroid/app/Activity;Landroid/os/Bundle;)V", "onActivityStarted", "(Landroid/app/Activity;)V", "onActivityResumed", "onActivityPaused", "onActivityStopped", "onActivityDestroyed", "outState", "onActivitySaveInstanceState", "", Constants.INAPP_DATA_TAG, "()Z", "e", "", "Ll/rdj;", "c", "()Ljava/util/Collection;", "fxList", "Companion", "a", "putong-common_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class ydj implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a */
    @Nullable
    public static WeakReference<Activity> f198609a;

    /* JADX INFO: renamed from: c */
    public final Collection<rdj> m215238c() {
        return yti.INSTANCE.m217318e().values();
    }

    /* JADX INFO: renamed from: d */
    public final boolean m215239d() {
        return m215238c().isEmpty();
    }

    /* JADX INFO: renamed from: e */
    public final void m215240e(Activity activity) {
        WeakReference<Activity> weakReference = f198609a;
        if (Intrinsics.m88377d(weakReference != null ? weakReference.get() : null, activity)) {
            return;
        }
        f198609a = new WeakReference<>(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(@NotNull Activity activity, @Nullable Bundle savedInstanceState) {
        activity.getClass();
        if (m215239d()) {
            return;
        }
        Iterator<rdj> it = m215238c().iterator();
        while (it.hasNext()) {
            it.next().onActivityCreated(activity, savedInstanceState);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(@NotNull Activity activity) {
        activity.getClass();
        if (m215239d()) {
            return;
        }
        Iterator<rdj> it = m215238c().iterator();
        while (it.hasNext()) {
            it.next().onActivityDestroyed(activity);
        }
        WeakReference<Activity> weakReference = f198609a;
        if ((weakReference != null ? weakReference.get() : null) == activity) {
            WeakReference<Activity> weakReference2 = f198609a;
            if (weakReference2 != null) {
                weakReference2.clear();
            }
            f198609a = null;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(@NotNull Activity activity) {
        activity.getClass();
        if (m215239d()) {
            return;
        }
        Iterator<rdj> it = m215238c().iterator();
        while (it.hasNext()) {
            it.next().onActivityPaused(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(@NotNull Activity activity) {
        activity.getClass();
        m215240e(activity);
        if (m215239d()) {
            return;
        }
        Iterator<rdj> it = m215238c().iterator();
        while (it.hasNext()) {
            it.next().onActivityResumed(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(@NotNull Activity activity, @NotNull Bundle outState) {
        activity.getClass();
        outState.getClass();
        if (m215239d()) {
            return;
        }
        Iterator<rdj> it = m215238c().iterator();
        while (it.hasNext()) {
            it.next().onActivitySaveInstanceState(activity, outState);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(@NotNull Activity activity) {
        activity.getClass();
        if (m215239d()) {
            return;
        }
        Iterator<rdj> it = m215238c().iterator();
        while (it.hasNext()) {
            it.next().onActivityStarted(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(@NotNull Activity activity) {
        activity.getClass();
        if (m215239d()) {
            return;
        }
        Iterator<rdj> it = m215238c().iterator();
        while (it.hasNext()) {
            it.next().onActivityStopped(activity);
        }
    }

    /* JADX INFO: renamed from: l.ydj$a, reason: from kotlin metadata */
    @Metadata(m88120d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\t\u0010\u0003R*\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\n8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m88121d2 = {"Ll/ydj$a;", "", "<init>", "()V", "Landroid/app/Activity;", "activity", "", Constants.INAPP_DATA_TAG, "(Landroid/app/Activity;)V", "b", "Ljava/lang/ref/WeakReference;", "topActivity", "Ljava/lang/ref/WeakReference;", "a", "()Ljava/lang/ref/WeakReference;", "c", "(Ljava/lang/ref/WeakReference;)V", "putong-common_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        /* JADX INFO: renamed from: a */
        public final WeakReference<Activity> m215241a() {
            return ydj.f198609a;
        }

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ void m215242b() {
            WeakReference<Activity> weakReferenceM215241a = m215241a();
            if (weakReferenceM215241a != null) {
                weakReferenceM215241a.clear();
            }
            m215243c(null);
        }

        /* JADX INFO: renamed from: c */
        public final void m215243c(@Nullable WeakReference<Activity> weakReference) {
            ydj.f198609a = weakReference;
        }

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ void m215244d(Activity activity) {
            if (activity == null) {
                return;
            }
            m215243c(new WeakReference<>(activity));
        }

        public Companion() {
        }
    }
}
