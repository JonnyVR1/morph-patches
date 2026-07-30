package p153l;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.bumptech.glide.Registry;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class qs10 {

    /* JADX INFO: renamed from: e */
    private static final C19643c f159231e = new C19643c();

    /* JADX INFO: renamed from: f */
    private static final re00<Object, Object> f159232f = new C19641a();

    /* JADX INFO: renamed from: a */
    private final List<C19642b<?, ?>> f159233a;

    /* JADX INFO: renamed from: b */
    private final C19643c f159234b;

    /* JADX INFO: renamed from: c */
    private final Set<C19642b<?, ?>> f159235c;

    /* JADX INFO: renamed from: d */
    private final nj80<List<Throwable>> f159236d;

    /* JADX INFO: renamed from: l.qs10$a */
    public static class C19641a implements re00<Object, Object> {
        @Override // p153l.re00
        @Nullable
        /* JADX INFO: renamed from: a */
        public re00.C19812a<Object> mo101565a(@NonNull Object obj, int i, int i2, @NonNull u560 u560Var) {
            return null;
        }

        @Override // p153l.re00
        /* JADX INFO: renamed from: b */
        public boolean mo101566b(@NonNull Object obj) {
            return false;
        }
    }

    /* JADX INFO: renamed from: l.qs10$b */
    public static class C19642b<Model, Data> {

        /* JADX INFO: renamed from: a */
        private final Class<Model> f159237a;

        /* JADX INFO: renamed from: b */
        final Class<Data> f159238b;

        /* JADX INFO: renamed from: c */
        final se00<? extends Model, ? extends Data> f159239c;

        public C19642b(@NonNull Class<Model> cls, @NonNull Class<Data> cls2, @NonNull se00<? extends Model, ? extends Data> se00Var) {
            this.f159237a = cls;
            this.f159238b = cls2;
            this.f159239c = se00Var;
        }

        /* JADX INFO: renamed from: a */
        public boolean m177718a(@NonNull Class<?> cls) {
            return this.f159237a.isAssignableFrom(cls);
        }

        /* JADX INFO: renamed from: b */
        public boolean m177719b(@NonNull Class<?> cls, @NonNull Class<?> cls2) {
            return m177718a(cls) && this.f159238b.isAssignableFrom(cls2);
        }
    }

    /* JADX INFO: renamed from: l.qs10$c */
    public static class C19643c {
        @NonNull
        /* JADX INFO: renamed from: a */
        public <Model, Data> ps10<Model, Data> m177720a(@NonNull List<re00<Model, Data>> list, @NonNull nj80<List<Throwable>> nj80Var) {
            return new ps10<>(list, nj80Var);
        }
    }

    @VisibleForTesting
    public qs10(@NonNull nj80<List<Throwable>> nj80Var, @NonNull C19643c c19643c) {
        this.f159233a = new ArrayList();
        this.f159235c = new HashSet();
        this.f159236d = nj80Var;
        this.f159234b = c19643c;
    }

    /* JADX INFO: renamed from: a */
    private <Model, Data> void m177711a(@NonNull Class<Model> cls, @NonNull Class<Data> cls2, @NonNull se00<? extends Model, ? extends Data> se00Var, boolean z) {
        C19642b<?, ?> c19642b = new C19642b<>(cls, cls2, se00Var);
        List<C19642b<?, ?>> list = this.f159233a;
        list.add(z ? list.size() : 0, c19642b);
    }

    @NonNull
    /* JADX INFO: renamed from: e */
    private <Model, Data> re00<Model, Data> m177712e(@NonNull C19642b<?, ?> c19642b) {
        return (re00) vn80.m201944d(c19642b.f159239c.mo101570b(this));
    }

    @NonNull
    /* JADX INFO: renamed from: f */
    private static <Model, Data> re00<Model, Data> m177713f() {
        return (re00<Model, Data>) f159232f;
    }

    /* JADX INFO: renamed from: b */
    public synchronized <Model, Data> void m177714b(@NonNull Class<Model> cls, @NonNull Class<Data> cls2, @NonNull se00<? extends Model, ? extends Data> se00Var) {
        m177711a(cls, cls2, se00Var, true);
    }

    @NonNull
    /* JADX INFO: renamed from: c */
    public synchronized <Model> List<re00<Model, ?>> m177715c(@NonNull Class<Model> cls) {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            for (C19642b<?, ?> c19642b : this.f159233a) {
                if (!this.f159235c.contains(c19642b) && c19642b.m177718a(cls)) {
                    this.f159235c.add(c19642b);
                    arrayList.add(m177712e(c19642b));
                    this.f159235c.remove(c19642b);
                }
            }
        } catch (Throwable th) {
            this.f159235c.clear();
            throw th;
        }
        return arrayList;
    }

    @NonNull
    /* JADX INFO: renamed from: d */
    public synchronized <Model, Data> re00<Model, Data> m177716d(@NonNull Class<Model> cls, @NonNull Class<Data> cls2) {
        try {
            ArrayList arrayList = new ArrayList();
            boolean z = false;
            for (C19642b<?, ?> c19642b : this.f159233a) {
                if (this.f159235c.contains(c19642b)) {
                    z = true;
                } else if (c19642b.m177719b(cls, cls2)) {
                    this.f159235c.add(c19642b);
                    arrayList.add(m177712e(c19642b));
                    this.f159235c.remove(c19642b);
                }
            }
            if (arrayList.size() > 1) {
                return this.f159234b.m177720a(arrayList, this.f159236d);
            }
            if (arrayList.size() == 1) {
                return (re00) arrayList.get(0);
            }
            if (!z) {
                throw new Registry.NoModelLoaderAvailableException((Class<?>) cls, (Class<?>) cls2);
            }
            return m177713f();
        } catch (Throwable th) {
            this.f159235c.clear();
            throw th;
        }
    }

    @NonNull
    /* JADX INFO: renamed from: g */
    public synchronized List<Class<?>> m177717g(@NonNull Class<?> cls) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (C19642b<?, ?> c19642b : this.f159233a) {
            if (!arrayList.contains(c19642b.f159238b) && c19642b.m177718a(cls)) {
                arrayList.add(c19642b.f159238b);
            }
        }
        return arrayList;
    }

    public qs10(@NonNull nj80<List<Throwable>> nj80Var) {
        this(nj80Var, f159231e);
    }
}
