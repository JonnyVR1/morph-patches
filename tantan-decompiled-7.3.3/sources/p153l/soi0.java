package p153l;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p051p1.mobile.android.p052rx.rxthread.FastIoScheduler;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.Callable;
import p137rx.C22420b;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes10.dex */
public final class soi0 {

    /* JADX INFO: renamed from: a */
    public static f2e0 f169899a;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static <TResult> jni0<TResult> m187240a(@NonNull Callable<TResult> callable) {
        return m187241b(m187245f(), callable);
    }

    @NonNull
    /* JADX INFO: renamed from: b */
    public static <TResult> jni0<TResult> m187241b(f2e0 f2e0Var, @NonNull Callable<TResult> callable) {
        m187242c(callable, "Callback must not be null");
        enc0 enc0Var = new enc0();
        enc0Var.m121523x(C22421c.fromCallable(callable));
        f2e0Var.createWorker().mo102836b(new anc0(enc0Var));
        return enc0Var;
    }

    /* JADX INFO: renamed from: c */
    public static <T> T m187242c(T t, Object obj) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    @NonNull
    /* JADX INFO: renamed from: d */
    public static <TResult> jni0<TResult> m187243d(@NonNull Exception exc) {
        enc0 enc0Var = new enc0();
        enc0Var.m121521v(exc);
        return enc0Var;
    }

    @NonNull
    /* JADX INFO: renamed from: e */
    public static <TResult> jni0<TResult> m187244e(TResult tresult) {
        enc0 enc0Var = new enc0();
        enc0Var.m121522w(tresult);
        return enc0Var;
    }

    /* JADX INFO: renamed from: f */
    public static f2e0 m187245f() {
        if (f169899a == null) {
            f169899a = FastIoScheduler.f16349b;
        }
        return f169899a;
    }

    @NonNull
    /* JADX INFO: renamed from: g */
    public static jni0<Void> m187246g(f2e0 f2e0Var, @Nullable Collection<? extends jni0<?>> collection) {
        if (collection == null || collection.isEmpty()) {
            return m187244e(null);
        }
        Iterator<? extends jni0<?>> it = collection.iterator();
        while (it.hasNext()) {
            if (it.next() == null) {
                mnd0.m159157a("null tasks are not accepted");
                return null;
            }
        }
        enc0 enc0Var = new enc0();
        ArrayList arrayList = new ArrayList(collection.size());
        for (final jni0<?> jni0Var : collection) {
            Objects.requireNonNull(jni0Var);
            arrayList.add(C22420b.m222551e(new Callable() { // from class: l.roi0
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return jni0Var.mo121512g();
                }
            }));
        }
        arrayList.size();
        enc0Var.m121523x(C22420b.m222553g(arrayList).m222556b(C22421c.just(null)));
        f2e0Var.createWorker().mo102836b(new anc0(enc0Var));
        return enc0Var;
    }

    @NonNull
    /* JADX INFO: renamed from: h */
    public static jni0<Void> m187247h(f2e0 f2e0Var, @Nullable Collection<? extends jni0<?>> collection) {
        return (collection == null || collection.isEmpty()) ? m187244e(null) : m187246g(f2e0Var, collection);
    }

    @NonNull
    /* JADX INFO: renamed from: i */
    public static jni0<Void> m187248i(f2e0 f2e0Var, @Nullable jni0<?>... jni0VarArr) {
        return (jni0VarArr == null || jni0VarArr.length == 0) ? m187244e(null) : m187247h(f2e0Var, Arrays.asList(jni0VarArr));
    }
}
