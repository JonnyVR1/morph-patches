package p009l;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p1.mobile.android.rx.rxthread.FastIoScheduler;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.Callable;
import l.bud0;
import l.jfd0;
import rx.b;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public final class sfi0 {

    /* JADX INFO: renamed from: a */
    public static bud0 f20223a;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static <TResult> jei0<TResult> m22135a(@NonNull Callable<TResult> callable) {
        return m22136b(m22140f(), callable);
    }

    @NonNull
    /* JADX INFO: renamed from: b */
    public static <TResult> jei0<TResult> m22136b(bud0 bud0Var, @NonNull Callable<TResult> callable) {
        m22137c(callable, "Callback must not be null");
        xec0 xec0Var = new xec0();
        xec0Var.m24849x(c.fromCallable(callable));
        bud0Var.createWorker().b(new tec0(xec0Var));
        return xec0Var;
    }

    /* JADX INFO: renamed from: c */
    public static <T> T m22137c(T t, Object obj) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    @NonNull
    /* JADX INFO: renamed from: d */
    public static <TResult> jei0<TResult> m22138d(@NonNull Exception exc) {
        xec0 xec0Var = new xec0();
        xec0Var.m24847v(exc);
        return xec0Var;
    }

    @NonNull
    /* JADX INFO: renamed from: e */
    public static <TResult> jei0<TResult> m22139e(TResult tresult) {
        xec0 xec0Var = new xec0();
        xec0Var.m24848w(tresult);
        return xec0Var;
    }

    /* JADX INFO: renamed from: f */
    public static bud0 m22140f() {
        if (f20223a == null) {
            f20223a = FastIoScheduler.b;
        }
        return f20223a;
    }

    @NonNull
    /* JADX INFO: renamed from: g */
    public static jei0<Void> m22141g(bud0 bud0Var, @Nullable Collection<? extends jei0<?>> collection) {
        if (collection == null || collection.isEmpty()) {
            return m22139e(null);
        }
        Iterator<? extends jei0<?>> it = collection.iterator();
        while (it.hasNext()) {
            if (it.next() == null) {
                jfd0.a("null tasks are not accepted");
                return null;
            }
        }
        xec0 xec0Var = new xec0();
        ArrayList arrayList = new ArrayList(collection.size());
        for (final jei0<?> jei0Var : collection) {
            Objects.requireNonNull(jei0Var);
            arrayList.add(b.e(new Callable() { // from class: l.rfi0
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return jei0Var.mo16962g();
                }
            }));
        }
        arrayList.size();
        xec0Var.m24849x(b.g(arrayList).b(c.just((Object) null)));
        bud0Var.createWorker().b(new tec0(xec0Var));
        return xec0Var;
    }

    @NonNull
    /* JADX INFO: renamed from: h */
    public static jei0<Void> m22142h(bud0 bud0Var, @Nullable Collection<? extends jei0<?>> collection) {
        return (collection == null || collection.isEmpty()) ? m22139e(null) : m22141g(bud0Var, collection);
    }

    @NonNull
    /* JADX INFO: renamed from: i */
    public static jei0<Void> m22143i(bud0 bud0Var, @Nullable jei0<?>... jei0VarArr) {
        return (jei0VarArr == null || jei0VarArr.length == 0) ? m22139e(null) : m22142h(bud0Var, Arrays.asList(jei0VarArr));
    }
}
