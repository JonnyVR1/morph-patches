package p149l;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.bumptech.glide.Registry;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class gk10 {

    /* JADX INFO: renamed from: e */
    private static final C17098c f103136e = new C17098c();

    /* JADX INFO: renamed from: f */
    private static final i600<Object, Object> f103137f = new C17096a();

    /* JADX INFO: renamed from: a */
    private final List<C17097b<?, ?>> f103138a;

    /* JADX INFO: renamed from: b */
    private final C17098c f103139b;

    /* JADX INFO: renamed from: c */
    private final Set<C17097b<?, ?>> f103140c;

    /* JADX INFO: renamed from: d */
    private final hb80<List<Throwable>> f103141d;

    /* JADX INFO: renamed from: l.gk10$a */
    public static class C17096a implements i600<Object, Object> {
        @Override // p149l.i600
        @Nullable
        /* JADX INFO: renamed from: a */
        public i600.C17490a<Object> mo103352a(@NonNull Object obj, int i, int i2, @NonNull px50 px50Var) {
            return null;
        }

        @Override // p149l.i600
        /* JADX INFO: renamed from: b */
        public boolean mo103353b(@NonNull Object obj) {
            return false;
        }
    }

    /* JADX INFO: renamed from: l.gk10$b */
    public static class C17097b<Model, Data> {

        /* JADX INFO: renamed from: a */
        private final Class<Model> f103142a;

        /* JADX INFO: renamed from: b */
        final Class<Data> f103143b;

        /* JADX INFO: renamed from: c */
        final j600<? extends Model, ? extends Data> f103144c;

        public C17097b(@NonNull Class<Model> cls, @NonNull Class<Data> cls2, @NonNull j600<? extends Model, ? extends Data> j600Var) {
            this.f103142a = cls;
            this.f103143b = cls2;
            this.f103144c = j600Var;
        }

        /* JADX INFO: renamed from: a */
        public boolean m126586a(@NonNull Class<?> cls) {
            return this.f103142a.isAssignableFrom(cls);
        }

        /* JADX INFO: renamed from: b */
        public boolean m126587b(@NonNull Class<?> cls, @NonNull Class<?> cls2) {
            return m126586a(cls) && this.f103143b.isAssignableFrom(cls2);
        }
    }

    /* JADX INFO: renamed from: l.gk10$c */
    public static class C17098c {
        @NonNull
        /* JADX INFO: renamed from: a */
        public <Model, Data> fk10<Model, Data> m126588a(@NonNull List<i600<Model, Data>> list, @NonNull hb80<List<Throwable>> hb80Var) {
            return new fk10<>(list, hb80Var);
        }
    }

    @VisibleForTesting
    public gk10(@NonNull hb80<List<Throwable>> hb80Var, @NonNull C17098c c17098c) {
        this.f103138a = new ArrayList();
        this.f103140c = new HashSet();
        this.f103141d = hb80Var;
        this.f103139b = c17098c;
    }

    /* JADX INFO: renamed from: a */
    private <Model, Data> void m126579a(@NonNull Class<Model> cls, @NonNull Class<Data> cls2, @NonNull j600<? extends Model, ? extends Data> j600Var, boolean z) {
        C17097b<?, ?> c17097b = new C17097b<>(cls, cls2, j600Var);
        List<C17097b<?, ?>> list = this.f103138a;
        list.add(z ? list.size() : 0, c17097b);
    }

    @NonNull
    /* JADX INFO: renamed from: e */
    private <Model, Data> i600<Model, Data> m126580e(@NonNull C17097b<?, ?> c17097b) {
        return (i600) qf80.m174276d(c17097b.f103144c.mo103357b(this));
    }

    @NonNull
    /* JADX INFO: renamed from: f */
    private static <Model, Data> i600<Model, Data> m126581f() {
        return (i600<Model, Data>) f103137f;
    }

    /* JADX INFO: renamed from: b */
    public synchronized <Model, Data> void m126582b(@NonNull Class<Model> cls, @NonNull Class<Data> cls2, @NonNull j600<? extends Model, ? extends Data> j600Var) {
        m126579a(cls, cls2, j600Var, true);
    }

    @NonNull
    /* JADX INFO: renamed from: c */
    public synchronized <Model> List<i600<Model, ?>> m126583c(@NonNull Class<Model> cls) {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            for (C17097b<?, ?> c17097b : this.f103138a) {
                if (!this.f103140c.contains(c17097b) && c17097b.m126586a(cls)) {
                    this.f103140c.add(c17097b);
                    arrayList.add(m126580e(c17097b));
                    this.f103140c.remove(c17097b);
                }
            }
        } catch (Throwable th) {
            this.f103140c.clear();
            throw th;
        }
        return arrayList;
    }

    @NonNull
    /* JADX INFO: renamed from: d */
    public synchronized <Model, Data> i600<Model, Data> m126584d(@NonNull Class<Model> cls, @NonNull Class<Data> cls2) {
        try {
            ArrayList arrayList = new ArrayList();
            boolean z = false;
            for (C17097b<?, ?> c17097b : this.f103138a) {
                if (this.f103140c.contains(c17097b)) {
                    z = true;
                } else if (c17097b.m126587b(cls, cls2)) {
                    this.f103140c.add(c17097b);
                    arrayList.add(m126580e(c17097b));
                    this.f103140c.remove(c17097b);
                }
            }
            if (arrayList.size() > 1) {
                return this.f103139b.m126588a(arrayList, this.f103141d);
            }
            if (arrayList.size() == 1) {
                return (i600) arrayList.get(0);
            }
            if (!z) {
                throw new Registry.NoModelLoaderAvailableException((Class<?>) cls, (Class<?>) cls2);
            }
            return m126581f();
        } catch (Throwable th) {
            this.f103140c.clear();
            throw th;
        }
    }

    @NonNull
    /* JADX INFO: renamed from: g */
    public synchronized List<Class<?>> m126585g(@NonNull Class<?> cls) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (C17097b<?, ?> c17097b : this.f103138a) {
            if (!arrayList.contains(c17097b.f103143b) && c17097b.m126586a(cls)) {
                arrayList.add(c17097b.f103143b);
            }
        }
        return arrayList;
    }

    public gk10(@NonNull hb80<List<Throwable>> hb80Var) {
        this(hb80Var, f103136e);
    }
}
