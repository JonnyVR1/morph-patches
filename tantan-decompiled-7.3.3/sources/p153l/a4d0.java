package p153l;

import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class a4d0 {

    /* JADX INFO: renamed from: a */
    private final List<String> f68378a = new ArrayList();

    /* JADX INFO: renamed from: b */
    private final Map<String, List<C15634a<?, ?>>> f68379b = new HashMap();

    /* JADX INFO: renamed from: l.a4d0$a */
    public static class C15634a<T, R> {

        /* JADX INFO: renamed from: a */
        private final Class<T> f68380a;

        /* JADX INFO: renamed from: b */
        final Class<R> f68381b;

        /* JADX INFO: renamed from: c */
        final z3d0<T, R> f68382c;

        public C15634a(@NonNull Class<T> cls, @NonNull Class<R> cls2, z3d0<T, R> z3d0Var) {
            this.f68380a = cls;
            this.f68381b = cls2;
            this.f68382c = z3d0Var;
        }

        /* JADX INFO: renamed from: a */
        public boolean m95913a(@NonNull Class<?> cls, @NonNull Class<?> cls2) {
            return this.f68380a.isAssignableFrom(cls) && cls2.isAssignableFrom(this.f68381b);
        }
    }

    @NonNull
    /* JADX INFO: renamed from: c */
    private synchronized List<C15634a<?, ?>> m95908c(@NonNull String str) {
        List<C15634a<?, ?>> arrayList;
        try {
            if (!this.f68378a.contains(str)) {
                this.f68378a.add(str);
            }
            arrayList = this.f68379b.get(str);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                this.f68379b.put(str, arrayList);
            }
        } catch (Throwable th) {
            throw th;
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: a */
    public synchronized <T, R> void m95909a(@NonNull String str, @NonNull z3d0<T, R> z3d0Var, @NonNull Class<T> cls, @NonNull Class<R> cls2) {
        m95908c(str).add(new C15634a<>(cls, cls2, z3d0Var));
    }

    @NonNull
    /* JADX INFO: renamed from: b */
    public synchronized <T, R> List<z3d0<T, R>> m95910b(@NonNull Class<T> cls, @NonNull Class<R> cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator<String> it = this.f68378a.iterator();
        while (it.hasNext()) {
            List<C15634a<?, ?>> list = this.f68379b.get(it.next());
            if (list != null) {
                for (C15634a<?, ?> c15634a : list) {
                    if (c15634a.m95913a(cls, cls2)) {
                        arrayList.add(c15634a.f68382c);
                    }
                }
            }
        }
        return arrayList;
    }

    @NonNull
    /* JADX INFO: renamed from: d */
    public synchronized <T, R> List<Class<R>> m95911d(@NonNull Class<T> cls, @NonNull Class<R> cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator<String> it = this.f68378a.iterator();
        while (it.hasNext()) {
            List<C15634a<?, ?>> list = this.f68379b.get(it.next());
            if (list != null) {
                for (C15634a<?, ?> c15634a : list) {
                    if (c15634a.m95913a(cls, cls2) && !arrayList.contains(c15634a.f68381b)) {
                        arrayList.add(c15634a.f68381b);
                    }
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: e */
    public synchronized void m95912e(@NonNull List<String> list) {
        try {
            ArrayList<String> arrayList = new ArrayList(this.f68378a);
            this.f68378a.clear();
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                this.f68378a.add(it.next());
            }
            for (String str : arrayList) {
                if (!list.contains(str)) {
                    this.f68378a.add(str);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
