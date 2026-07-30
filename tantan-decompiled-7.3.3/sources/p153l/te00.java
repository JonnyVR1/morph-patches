package p153l;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.Registry;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class te00 {

    /* JADX INFO: renamed from: a */
    private final qs10 f173417a;

    /* JADX INFO: renamed from: b */
    private final C20294a f173418b;

    /* JADX INFO: renamed from: l.te00$a */
    public static class C20294a {

        /* JADX INFO: renamed from: a */
        private final Map<Class<?>, a<?>> f173419a = new HashMap();

        /* JADX INFO: renamed from: l.te00$a$a */
        public static class a<Model> {

            /* JADX INFO: renamed from: a */
            final List<re00<Model, ?>> f173420a;

            public a(List<re00<Model, ?>> list) {
                this.f173420a = list;
            }
        }

        /* JADX INFO: renamed from: a */
        public void m190672a() {
            this.f173419a.clear();
        }

        @Nullable
        /* JADX INFO: renamed from: b */
        public <Model> List<re00<Model, ?>> m190673b(Class<Model> cls) {
            a<?> aVar = this.f173419a.get(cls);
            if (aVar == null) {
                return null;
            }
            return (List<re00<Model, ?>>) aVar.f173420a;
        }

        /* JADX INFO: renamed from: c */
        public <Model> void m190674c(Class<Model> cls, List<re00<Model, ?>> list) {
            if (this.f173419a.put(cls, new a<>(list)) == null) {
                return;
            }
            xtq0.m213103a("Already cached loaders for model: ", cls);
        }
    }

    private te00(@NonNull qs10 qs10Var) {
        this.f173418b = new C20294a();
        this.f173417a = qs10Var;
    }

    @NonNull
    /* JADX INFO: renamed from: b */
    private static <A> Class<A> m190667b(@NonNull A a) {
        return (Class<A>) a.getClass();
    }

    @NonNull
    /* JADX INFO: renamed from: e */
    private synchronized <A> List<re00<A, ?>> m190668e(@NonNull Class<A> cls) {
        List<re00<A, ?>> listM190673b;
        listM190673b = this.f173418b.m190673b(cls);
        if (listM190673b == null) {
            listM190673b = Collections.unmodifiableList(this.f173417a.m177715c(cls));
            this.f173418b.m190674c(cls, listM190673b);
        }
        return listM190673b;
    }

    /* JADX INFO: renamed from: a */
    public synchronized <Model, Data> void m190669a(@NonNull Class<Model> cls, @NonNull Class<Data> cls2, @NonNull se00<? extends Model, ? extends Data> se00Var) {
        this.f173417a.m177714b(cls, cls2, se00Var);
        this.f173418b.m190672a();
    }

    @NonNull
    /* JADX INFO: renamed from: c */
    public synchronized List<Class<?>> m190670c(@NonNull Class<?> cls) {
        return this.f173417a.m177717g(cls);
    }

    @NonNull
    /* JADX INFO: renamed from: d */
    public <A> List<re00<A, ?>> m190671d(@NonNull A a) {
        List<re00<A, ?>> listM190668e = m190668e(m190667b(a));
        if (listM190668e.isEmpty()) {
            throw new Registry.NoModelLoaderAvailableException(a);
        }
        int size = listM190668e.size();
        List<re00<A, ?>> arrayList = Collections.EMPTY_LIST;
        boolean z = true;
        for (int i = 0; i < size; i++) {
            re00<A, ?> re00Var = listM190668e.get(i);
            if (re00Var.mo101566b(a)) {
                if (z) {
                    arrayList = new ArrayList<>(size - i);
                    z = false;
                }
                arrayList.add(re00Var);
            }
        }
        if (arrayList.isEmpty()) {
            throw new Registry.NoModelLoaderAvailableException(a, listM190668e);
        }
        return arrayList;
    }

    public te00(@NonNull nj80<List<Throwable>> nj80Var) {
        this(new qs10(nj80Var));
    }
}
