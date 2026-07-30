package p149l;

import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class i7j0 {

    /* JADX INFO: renamed from: a */
    private final List<C17505a<?, ?>> f111920a = new ArrayList();

    /* JADX INFO: renamed from: l.i7j0$a */
    public static final class C17505a<Z, R> {

        /* JADX INFO: renamed from: a */
        private final Class<Z> f111921a;

        /* JADX INFO: renamed from: b */
        private final Class<R> f111922b;

        /* JADX INFO: renamed from: c */
        final uwc0<Z, R> f111923c;

        public C17505a(@NonNull Class<Z> cls, @NonNull Class<R> cls2, @NonNull uwc0<Z, R> uwc0Var) {
            this.f111921a = cls;
            this.f111922b = cls2;
            this.f111923c = uwc0Var;
        }

        /* JADX INFO: renamed from: a */
        public boolean m134914a(@NonNull Class<?> cls, @NonNull Class<?> cls2) {
            return this.f111921a.isAssignableFrom(cls) && cls2.isAssignableFrom(this.f111922b);
        }
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    public synchronized <Z, R> uwc0<Z, R> m134911a(@NonNull Class<Z> cls, @NonNull Class<R> cls2) {
        if (cls2.isAssignableFrom(cls)) {
            return woj0.m204819b();
        }
        for (C17505a<?, ?> c17505a : this.f111920a) {
            if (c17505a.m134914a(cls, cls2)) {
                return (uwc0<Z, R>) c17505a.f111923c;
            }
        }
        throw new IllegalArgumentException("No transcoder registered to transcode from " + cls + " to " + cls2);
    }

    @NonNull
    /* JADX INFO: renamed from: b */
    public synchronized <Z, R> List<Class<R>> m134912b(@NonNull Class<Z> cls, @NonNull Class<R> cls2) {
        ArrayList arrayList = new ArrayList();
        if (cls2.isAssignableFrom(cls)) {
            arrayList.add(cls2);
            return arrayList;
        }
        Iterator<C17505a<?, ?>> it = this.f111920a.iterator();
        while (it.hasNext()) {
            if (it.next().m134914a(cls, cls2)) {
                arrayList.add(cls2);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: c */
    public synchronized <Z, R> void m134913c(@NonNull Class<Z> cls, @NonNull Class<R> cls2, @NonNull uwc0<Z, R> uwc0Var) {
        this.f111920a.add(new C17505a<>(cls, cls2, uwc0Var));
    }
}
