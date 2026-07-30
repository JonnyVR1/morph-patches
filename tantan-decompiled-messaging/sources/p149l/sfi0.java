package p149l;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p046p1.mobile.android.p047rx.rxthread.FastIoScheduler;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.Callable;
import p133rx.C22305b;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes11.dex */
public final class sfi0 {

    /* JADX INFO: renamed from: a */
    public static bud0 f164295a;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static <TResult> jei0<TResult> m183929a(@NonNull Callable<TResult> callable) {
        return m183930b(m183934f(), callable);
    }

    @NonNull
    /* JADX INFO: renamed from: b */
    public static <TResult> jei0<TResult> m183930b(bud0 bud0Var, @NonNull Callable<TResult> callable) {
        m183931c(callable, "Callback must not be null");
        xec0 xec0Var = new xec0();
        xec0Var.m208538x(C22306c.fromCallable(callable));
        bud0Var.createWorker().mo99201b(new tec0(xec0Var));
        return xec0Var;
    }

    /* JADX INFO: renamed from: c */
    public static <T> T m183931c(T t, Object obj) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    @NonNull
    /* JADX INFO: renamed from: d */
    public static <TResult> jei0<TResult> m183932d(@NonNull Exception exc) {
        xec0 xec0Var = new xec0();
        xec0Var.m208536v(exc);
        return xec0Var;
    }

    @NonNull
    /* JADX INFO: renamed from: e */
    public static <TResult> jei0<TResult> m183933e(TResult tresult) {
        xec0 xec0Var = new xec0();
        xec0Var.m208537w(tresult);
        return xec0Var;
    }

    /* JADX INFO: renamed from: f */
    public static bud0 m183934f() {
        if (f164295a == null) {
            f164295a = FastIoScheduler.f15630b;
        }
        return f164295a;
    }

    @NonNull
    /* JADX INFO: renamed from: g */
    public static jei0<Void> m183935g(bud0 bud0Var, @Nullable Collection<? extends jei0<?>> collection) {
        if (collection == null || collection.isEmpty()) {
            return m183933e(null);
        }
        Iterator<? extends jei0<?>> it = collection.iterator();
        while (it.hasNext()) {
            if (it.next() == null) {
                jfd0.m141176a("null tasks are not accepted");
                return null;
            }
        }
        xec0 xec0Var = new xec0();
        ArrayList arrayList = new ArrayList(collection.size());
        for (final jei0<?> jei0Var : collection) {
            Objects.requireNonNull(jei0Var);
            arrayList.add(C22305b.m221305e(new Callable() { // from class: l.rfi0
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return jei0Var.mo141142g();
                }
            }));
        }
        arrayList.size();
        xec0Var.m208538x(C22305b.m221307g(arrayList).m221310b(C22306c.just(null)));
        bud0Var.createWorker().mo99201b(new tec0(xec0Var));
        return xec0Var;
    }

    @NonNull
    /* JADX INFO: renamed from: h */
    public static jei0<Void> m183936h(bud0 bud0Var, @Nullable Collection<? extends jei0<?>> collection) {
        return (collection == null || collection.isEmpty()) ? m183933e(null) : m183935g(bud0Var, collection);
    }

    @NonNull
    /* JADX INFO: renamed from: i */
    public static jei0<Void> m183937i(bud0 bud0Var, @Nullable jei0<?>... jei0VarArr) {
        return (jei0VarArr == null || jei0VarArr.length == 0) ? m183933e(null) : m183936h(bud0Var, Arrays.asList(jei0VarArr));
    }
}
