package p153l;

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
@Metadata(m88120d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\t\b'\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0019\b\u0004\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\f\u001a\u00020\u000b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u000e\u001a\u00020\u000b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t¢\u0006\u0004\b\u000e\u0010\rJ\u000f\u0010\u000f\u001a\u00028\u0000H&¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000bH&¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u000bH&¢\u0006\u0004\b\u0013\u0010\u0012R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0019\u001a\u00020\u00038\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\f\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u001aR \u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\t0\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u001dR\u0018\u0010\u001f\u001a\u0004\u0018\u00018\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u001aR$\u0010$\u001a\u00028\u00002\u0006\u0010 \u001a\u00028\u00008F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b!\u0010\u0010\"\u0004\b\"\u0010#¨\u0006%"}, m88121d2 = {"Ll/j06;", p7f.GPS_DIRECTION_TRUE, "", "Landroid/content/Context;", "context", "Ll/zni0;", "taskExecutor", "<init>", "(Landroid/content/Context;Ll/zni0;)V", "Ll/h06;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", "b", "(Ll/h06;)V", "e", Constants.INAPP_DATA_TAG, "()Ljava/lang/Object;", "g", "()V", "h", "a", "Ll/zni0;", "Landroid/content/Context;", "c", "()Landroid/content/Context;", "appContext", "Ljava/lang/Object;", JoinPoint.SYNCHRONIZATION_LOCK, "Ljava/util/LinkedHashSet;", "Ljava/util/LinkedHashSet;", "listeners", "currentState", "newState", "getState", "f", "(Ljava/lang/Object;)V", "state", "work-runtime_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
@SourceDebugExtension
public abstract class j06<T> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final zni0 taskExecutor;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final Context appContext;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final Object lock;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final LinkedHashSet<h06<T>> listeners;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    public T currentState;

    public j06(@NotNull Context context, @NotNull zni0 zni0Var) {
        context.getClass();
        zni0Var.getClass();
        this.taskExecutor = zni0Var;
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        this.appContext = applicationContext;
        this.lock = new Object();
        this.listeners = new LinkedHashSet<>();
    }

    /* JADX INFO: renamed from: a */
    public static void m142906a(List list, j06 j06Var) {
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            ((h06) it.next()).mo4590a(j06Var.currentState);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m142907b(@NotNull h06<T> listener) {
        listener.getClass();
        synchronized (this.lock) {
            try {
                if (this.listeners.add(listener)) {
                    if (this.listeners.size() == 1) {
                        this.currentState = mo100316d();
                        qzv.m178829e().mo178832a(k06.f123368a, getClass().getSimpleName() + ": initial state = " + this.currentState);
                        mo4591g();
                    }
                    listener.mo4590a(this.currentState);
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
    public abstract T mo100316d();

    /* JADX INFO: renamed from: e */
    public final void m142909e(@NotNull h06<T> listener) {
        listener.getClass();
        synchronized (this.lock) {
            try {
                if (this.listeners.remove(listener) && this.listeners.isEmpty()) {
                    mo4592h();
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m142910f(T t) {
        synchronized (this.lock) {
            T t2 = this.currentState;
            if (t2 == null || !Intrinsics.m88377d(t2, t)) {
                this.currentState = t;
                final List list = CollectionsKt.toList(this.listeners);
                this.taskExecutor.mo216345c().execute(new Runnable() { // from class: l.i06
                    @Override // java.lang.Runnable
                    public final void run() {
                        j06.m142906a(list, this);
                    }
                });
                Unit unit = Unit.INSTANCE;
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public abstract void mo4591g();

    /* JADX INFO: renamed from: h */
    public abstract void mo4592h();
}
