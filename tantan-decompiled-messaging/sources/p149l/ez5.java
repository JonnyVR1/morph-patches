package p149l;

import android.content.Context;
import androidx.annotation.RestrictTo;
import com.clevertap.android.sdk.Constants;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.aspectj.lang.JoinPoint;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\t\b'\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0019\b\u0004\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\f\u001a\u00020\u000b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u000e\u001a\u00020\u000b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t¢\u0006\u0004\b\u000e\u0010\rJ\u000f\u0010\u000f\u001a\u00028\u0000H&¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000bH&¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u000bH&¢\u0006\u0004\b\u0013\u0010\u0012R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0019\u001a\u00020\u00038\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\f\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u001aR \u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\t0\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u001dR\u0018\u0010\u001f\u001a\u0004\u0018\u00018\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u001aR$\u0010$\u001a\u00028\u00002\u0006\u0010 \u001a\u00028\u00008F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b!\u0010\u0010\"\u0004\b\"\u0010#¨\u0006%"}, m87232d2 = {"Ll/ez5;", j6f.GPS_DIRECTION_TRUE, "", "Landroid/content/Context;", "context", "Ll/zei0;", "taskExecutor", "<init>", "(Landroid/content/Context;Ll/zei0;)V", "Ll/cz5;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", "b", "(Ll/cz5;)V", "e", Constants.INAPP_DATA_TAG, "()Ljava/lang/Object;", "g", "()V", "h", "a", "Ll/zei0;", "Landroid/content/Context;", "c", "()Landroid/content/Context;", "appContext", "Ljava/lang/Object;", JoinPoint.SYNCHRONIZATION_LOCK, "Ljava/util/LinkedHashSet;", "Ljava/util/LinkedHashSet;", "listeners", "currentState", "newState", "getState", "f", "(Ljava/lang/Object;)V", "state", "work-runtime_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
@SourceDebugExtension
public abstract class ez5<T> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final zei0 taskExecutor;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final Context appContext;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final Object lock;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final LinkedHashSet<cz5<T>> listeners;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    public T currentState;

    public ez5(@NotNull Context context, @NotNull zei0 zei0Var) {
        context.getClass();
        zei0Var.getClass();
        this.taskExecutor = zei0Var;
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        this.appContext = applicationContext;
        this.lock = new Object();
        this.listeners = new LinkedHashSet<>();
    }

    /* JADX INFO: renamed from: a */
    public static void m118840a(List list, ez5 ez5Var) {
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            ((cz5) it.next()).mo4588a(ez5Var.currentState);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m118841b(@NotNull cz5<T> listener) {
        listener.getClass();
        synchronized (this.lock) {
            try {
                if (this.listeners.add(listener)) {
                    if (this.listeners.size() == 1) {
                        this.currentState = mo118843d();
                        txv.m190976e().mo190979a(fz5.f99934a, getClass().getSimpleName() + ": initial state = " + this.currentState);
                        mo4589g();
                    }
                    listener.mo4588a(this.currentState);
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @NotNull
    /* JADX INFO: renamed from: c, reason: from getter */
    public final Context getAppContext() {
        return this.appContext;
    }

    /* JADX INFO: renamed from: d */
    public abstract T mo118843d();

    /* JADX INFO: renamed from: e */
    public final void m118844e(@NotNull cz5<T> listener) {
        listener.getClass();
        synchronized (this.lock) {
            try {
                if (this.listeners.remove(listener) && this.listeners.isEmpty()) {
                    mo4590h();
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m118845f(T t) {
        synchronized (this.lock) {
            T t2 = this.currentState;
            if (t2 == null || !Intrinsics.m87488d(t2, t)) {
                this.currentState = t;
                final List list = CollectionsKt.toList(this.listeners);
                this.taskExecutor.mo187637c().execute(new Runnable() { // from class: l.dz5
                    @Override // java.lang.Runnable
                    public final void run() {
                        ez5.m118840a(list, this);
                    }
                });
                Unit unit = Unit.INSTANCE;
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public abstract void mo4589g();

    /* JADX INFO: renamed from: h */
    public abstract void mo4590h();
}
