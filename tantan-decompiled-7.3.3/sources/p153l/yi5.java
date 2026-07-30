package p153l;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m88120d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \u00172\u00020\u0001:\u0001\u0014B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\r\u0010\fJ\u0017\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\fJ\u0017\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000f\u0010\fJ\u001f\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0011\u0010\nJ\u0017\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0012\u0010\fR\u0016\u0010\u0016\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0018"}, m88121d2 = {"Ll/yi5;", "Landroid/app/Application$ActivityLifecycleCallbacks;", "<init>", "()V", "Landroid/app/Activity;", "activity", "Landroid/os/Bundle;", "savedInstanceState", "", "onActivityCreated", "(Landroid/app/Activity;Landroid/os/Bundle;)V", "onActivityStarted", "(Landroid/app/Activity;)V", "onActivityResumed", "onActivityPaused", "onActivityStopped", "outState", "onActivitySaveInstanceState", "onActivityDestroyed", "", "a", "I", "startCount", "Companion", "HelloFoundation_release"}, m88122k = 1, m88123mv = {1, 4, 0})
public final class yi5 implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: b */
    private static boolean f200013b = true;

    /* JADX INFO: renamed from: c */
    private static AtomicBoolean f200014c = new AtomicBoolean(false);

    /* JADX INFO: renamed from: d */
    @NotNull
    private static final List<Activity> f200015d = new ArrayList();

    /* JADX INFO: renamed from: e */
    private static final List<ul5> f200016e = new ArrayList();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private int startCount;

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(@NotNull Activity activity, @Nullable Bundle savedInstanceState) {
        activity.getClass();
        f200015d.add(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(@NotNull Activity activity) {
        activity.getClass();
        f200015d.remove(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(@NotNull Activity activity) {
        activity.getClass();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(@NotNull Activity activity) {
        activity.getClass();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(@NotNull Activity activity, @NotNull Bundle outState) {
        activity.getClass();
        outState.getClass();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(@NotNull Activity activity) {
        activity.getClass();
        this.startCount++;
        jzv.m147732e("AppStatusLifecycle", "startCount:" + this.startCount);
        if (this.startCount == 1) {
            f200013b = false;
            jzv.m147732e("MKAppStatusLifecycle", "onFront");
            Iterator<T> it = f200016e.iterator();
            while (it.hasNext()) {
                ((ul5) it.next()).onFront();
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(@NotNull Activity activity) {
        activity.getClass();
        this.startCount--;
        jzv.m147732e("AppStatusLifecycle", "stopCount:" + this.startCount);
        if (this.startCount == 0) {
            f200013b = true;
            jzv.m147732e("MKAppStatusLifecycle", "onBack");
            Iterator<T> it = f200016e.iterator();
            while (it.hasNext()) {
                ((ul5) it.next()).onBack();
            }
        }
    }

    /* JADX INFO: renamed from: l.yi5$a, reason: from kotlin metadata */
    @Metadata(m88120d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\t2\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0010\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0013\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00070\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m88121d2 = {"Ll/yi5$a;", "", "<init>", "()V", "", "a", "()Z", "Ll/ul5;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", "c", "(Ll/ul5;)V", "Landroid/app/Application;", "app", "b", "(Landroid/app/Application;)V", "IS_BACKGROUND", "Z", "Ljava/util/concurrent/atomic/AtomicBoolean;", "sRegistered", "Ljava/util/concurrent/atomic/AtomicBoolean;", "", "statusListener", "Ljava/util/List;", "HelloFoundation_release"}, m88122k = 1, m88123mv = {1, 4, 0})
    public static final class Companion {
        private Companion() {
        }

        @JvmStatic
        /* JADX INFO: renamed from: a */
        public final boolean m216011a() {
            return yi5.f200013b;
        }

        /* JADX INFO: renamed from: b */
        public final void m216012b(@Nullable Application app) {
            if (app == null || yi5.f200014c.get()) {
                return;
            }
            app.registerActivityLifecycleCallbacks(new yi5());
            yi5.f200014c.set(true);
        }

        /* JADX INFO: renamed from: c */
        public final void m216013c(@NotNull ul5 listener) {
            listener.getClass();
            yi5.f200016e.add(listener);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
