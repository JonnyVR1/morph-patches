package p149l;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.Registry;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class k600 {

    /* JADX INFO: renamed from: a */
    private final gk10 f121256a;

    /* JADX INFO: renamed from: b */
    private final C17932a f121257b;

    /* JADX INFO: renamed from: l.k600$a */
    public static class C17932a {

        /* JADX INFO: renamed from: a */
        private final Map<Class<?>, a<?>> f121258a = new HashMap();

        /* JADX INFO: renamed from: l.k600$a$a */
        public static class a<Model> {

            /* JADX INFO: renamed from: a */
            final List<i600<Model, ?>> f121259a;

            public a(List<i600<Model, ?>> list) {
                this.f121259a = list;
            }
        }

        /* JADX INFO: renamed from: a */
        public void m144568a() {
            this.f121258a.clear();
        }

        @Nullable
        /* JADX INFO: renamed from: b */
        public <Model> List<i600<Model, ?>> m144569b(Class<Model> cls) {
            a<?> aVar = this.f121258a.get(cls);
            if (aVar == null) {
                return null;
            }
            return (List<i600<Model, ?>>) aVar.f121259a;
        }

        /* JADX INFO: renamed from: c */
        public <Model> void m144570c(Class<Model> cls, List<i600<Model, ?>> list) {
            if (this.f121258a.put(cls, new a<>(list)) == null) {
                return;
            }
            rkq0.m179764a("Already cached loaders for model: ", cls);
        }
    }

    private k600(@NonNull gk10 gk10Var) {
        this.f121257b = new C17932a();
        this.f121256a = gk10Var;
    }

    @NonNull
    /* JADX INFO: renamed from: b */
    private static <A> Class<A> m144563b(@NonNull A a) {
        return (Class<A>) a.getClass();
    }

    @NonNull
    /* JADX INFO: renamed from: e */
    private synchronized <A> List<i600<A, ?>> m144564e(@NonNull Class<A> cls) {
        List<i600<A, ?>> listM144569b;
        listM144569b = this.f121257b.m144569b(cls);
        if (listM144569b == null) {
            listM144569b = Collections.unmodifiableList(this.f121256a.m126583c(cls));
            this.f121257b.m144570c(cls, listM144569b);
        }
        return listM144569b;
    }

    /* JADX INFO: renamed from: a */
    public synchronized <Model, Data> void m144565a(@NonNull Class<Model> cls, @NonNull Class<Data> cls2, @NonNull j600<? extends Model, ? extends Data> j600Var) {
        this.f121256a.m126582b(cls, cls2, j600Var);
        this.f121257b.m144568a();
    }

    @NonNull
    /* JADX INFO: renamed from: c */
    public synchronized List<Class<?>> m144566c(@NonNull Class<?> cls) {
        return this.f121256a.m126585g(cls);
    }

    @NonNull
    /* JADX INFO: renamed from: d */
    public <A> List<i600<A, ?>> m144567d(@NonNull A a) {
        List<i600<A, ?>> listM144564e = m144564e(m144563b(a));
        if (listM144564e.isEmpty()) {
            throw new Registry.NoModelLoaderAvailableException(a);
        }
        int size = listM144564e.size();
        List<i600<A, ?>> arrayList = Collections.EMPTY_LIST;
        boolean z = true;
        for (int i = 0; i < size; i++) {
            i600<A, ?> i600Var = listM144564e.get(i);
            if (i600Var.mo103353b(a)) {
                if (z) {
                    arrayList = new ArrayList<>(size - i);
                    z = false;
                }
                arrayList.add(i600Var);
            }
        }
        if (arrayList.isEmpty()) {
            throw new Registry.NoModelLoaderAvailableException(a, listM144564e);
        }
        return arrayList;
    }

    public k600(@NonNull hb80<List<Throwable>> hb80Var) {
        this(new gk10(hb80Var));
    }
}
