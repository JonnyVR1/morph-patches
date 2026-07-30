package p149l;

import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class xvc0 {

    /* JADX INFO: renamed from: a */
    private final List<String> f194593a = new ArrayList();

    /* JADX INFO: renamed from: b */
    private final Map<String, List<C21229a<?, ?>>> f194594b = new HashMap();

    /* JADX INFO: renamed from: l.xvc0$a */
    public static class C21229a<T, R> {

        /* JADX INFO: renamed from: a */
        private final Class<T> f194595a;

        /* JADX INFO: renamed from: b */
        final Class<R> f194596b;

        /* JADX INFO: renamed from: c */
        final wvc0<T, R> f194597c;

        public C21229a(@NonNull Class<T> cls, @NonNull Class<R> cls2, wvc0<T, R> wvc0Var) {
            this.f194595a = cls;
            this.f194596b = cls2;
            this.f194597c = wvc0Var;
        }

        /* JADX INFO: renamed from: a */
        public boolean m211255a(@NonNull Class<?> cls, @NonNull Class<?> cls2) {
            return this.f194595a.isAssignableFrom(cls) && cls2.isAssignableFrom(this.f194596b);
        }
    }

    @NonNull
    /* JADX INFO: renamed from: c */
    private synchronized List<C21229a<?, ?>> m211250c(@NonNull String str) {
        List<C21229a<?, ?>> arrayList;
        try {
            if (!this.f194593a.contains(str)) {
                this.f194593a.add(str);
            }
            arrayList = this.f194594b.get(str);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                this.f194594b.put(str, arrayList);
            }
        } catch (Throwable th) {
            throw th;
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: a */
    public synchronized <T, R> void m211251a(@NonNull String str, @NonNull wvc0<T, R> wvc0Var, @NonNull Class<T> cls, @NonNull Class<R> cls2) {
        m211250c(str).add(new C21229a<>(cls, cls2, wvc0Var));
    }

    @NonNull
    /* JADX INFO: renamed from: b */
    public synchronized <T, R> List<wvc0<T, R>> m211252b(@NonNull Class<T> cls, @NonNull Class<R> cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator<String> it = this.f194593a.iterator();
        while (it.hasNext()) {
            List<C21229a<?, ?>> list = this.f194594b.get(it.next());
            if (list != null) {
                for (C21229a<?, ?> c21229a : list) {
                    if (c21229a.m211255a(cls, cls2)) {
                        arrayList.add(c21229a.f194597c);
                    }
                }
            }
        }
        return arrayList;
    }

    @NonNull
    /* JADX INFO: renamed from: d */
    public synchronized <T, R> List<Class<R>> m211253d(@NonNull Class<T> cls, @NonNull Class<R> cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator<String> it = this.f194593a.iterator();
        while (it.hasNext()) {
            List<C21229a<?, ?>> list = this.f194594b.get(it.next());
            if (list != null) {
                for (C21229a<?, ?> c21229a : list) {
                    if (c21229a.m211255a(cls, cls2) && !arrayList.contains(c21229a.f194596b)) {
                        arrayList.add(c21229a.f194596b);
                    }
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: e */
    public synchronized void m211254e(@NonNull List<String> list) {
        try {
            ArrayList<String> arrayList = new ArrayList(this.f194593a);
            this.f194593a.clear();
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                this.f194593a.add(it.next());
            }
            for (String str : arrayList) {
                if (!list.contains(str)) {
                    this.f194593a.add(str);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
