package p153l;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.clevertap.android.sdk.Constants;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.hellogroup.p036mk.core.log.MKCoreLogManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m88120d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \u00172\u00020\u0001:\u0001\u0014B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\r\u0010\fJ\u0017\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\fJ\u0017\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000f\u0010\fJ\u001f\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0011\u0010\nJ\u0017\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0012\u0010\fR\u0016\u0010\u0016\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0018"}, m88121d2 = {"Ll/bjw;", "Landroid/app/Application$ActivityLifecycleCallbacks;", "<init>", "()V", "Landroid/app/Activity;", "activity", "Landroid/os/Bundle;", "savedInstanceState", "", "onActivityCreated", "(Landroid/app/Activity;Landroid/os/Bundle;)V", "onActivityStarted", "(Landroid/app/Activity;)V", "onActivityResumed", "onActivityPaused", "onActivityStopped", "outState", "onActivitySaveInstanceState", "onActivityDestroyed", "", "a", "I", "startCount", "Companion", "MKCore_release"}, m88122k = 1, m88123mv = {1, 4, 0})
public final class bjw implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: b */
    private static boolean f77027b = true;

    /* JADX INFO: renamed from: c */
    @NotNull
    private static final List<Activity> f77028c = new ArrayList();

    /* JADX INFO: renamed from: d */
    private static final List<ukw> f77029d = new ArrayList();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private int startCount;

    @JvmStatic
    /* JADX INFO: renamed from: c */
    public static final boolean m104780c() {
        return INSTANCE.m104782b();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(@NotNull Activity activity, @Nullable Bundle savedInstanceState) {
        activity.getClass();
        f77028c.add(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(@NotNull Activity activity) {
        activity.getClass();
        f77028c.remove(activity);
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
        int i = this.startCount + 1;
        this.startCount = i;
        if (i == 1) {
            f77027b = false;
            Iterator<T> it = f77029d.iterator();
            while (it.hasNext()) {
                ((ukw) it.next()).onFront();
                if (!sjw.m186319h()) {
                    MKCoreLogManager.m18429g();
                }
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(@NotNull Activity activity) {
        activity.getClass();
        int i = this.startCount - 1;
        this.startCount = i;
        if (i == 0) {
            f77027b = true;
            Iterator<T> it = f77029d.iterator();
            while (it.hasNext()) {
                ((ukw) it.next()).onBack();
                if (!sjw.m186319h()) {
                    MKCoreLogManager.m18430h();
                }
            }
        }
    }

    /* JADX INFO: renamed from: l.bjw$a, reason: from kotlin metadata */
    @Metadata(m88120d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010!\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\f\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\u000bR\"\u0010\r\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0006\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00070\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, m88121d2 = {"Ll/bjw$a;", "", "<init>", "()V", "", "b", "()Z", "Ll/ukw;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", "c", "(Ll/ukw;)V", Constants.INAPP_DATA_TAG, "IS_BACKGROUND", "Z", "a", "setIS_BACKGROUND", "(Z)V", "", "statusListener", "Ljava/util/List;", "MKCore_release"}, m88122k = 1, m88123mv = {1, 4, 0})
    public static final class Companion {
        private Companion() {
        }

        /* JADX INFO: renamed from: a */
        public final boolean m104781a() {
            return bjw.f77027b;
        }

        @JvmStatic
        /* JADX INFO: renamed from: b */
        public final boolean m104782b() {
            return m104781a();
        }

        /* JADX INFO: renamed from: c */
        public final void m104783c(@NotNull ukw listener) {
            listener.getClass();
            bjw.f77029d.add(listener);
        }

        /* JADX INFO: renamed from: d */
        public final void m104784d(@NotNull ukw listener) {
            listener.getClass();
            bjw.f77029d.remove(listener);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
