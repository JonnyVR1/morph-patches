package p153l;

import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class mgj0 {

    /* JADX INFO: renamed from: a */
    private final List<C18613a<?, ?>> f136754a = new ArrayList();

    /* JADX INFO: renamed from: l.mgj0$a */
    public static final class C18613a<Z, R> {

        /* JADX INFO: renamed from: a */
        final Class<Z> f136755a;

        /* JADX INFO: renamed from: b */
        final Class<R> f136756b;

        /* JADX INFO: renamed from: c */
        final y4d0<Z, R> f136757c;

        public C18613a(@NonNull Class<Z> cls, @NonNull Class<R> cls2, @NonNull y4d0<Z, R> y4d0Var) {
            this.f136755a = cls;
            this.f136756b = cls2;
            this.f136757c = y4d0Var;
        }

        /* JADX INFO: renamed from: a */
        public boolean m158349a(@NonNull Class<?> cls, @NonNull Class<?> cls2) {
            return this.f136755a.isAssignableFrom(cls) && cls2.isAssignableFrom(this.f136756b);
        }
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    public synchronized <Z, R> y4d0<Z, R> m158346a(@NonNull Class<Z> cls, @NonNull Class<R> cls2) {
        if (cls2.isAssignableFrom(cls)) {
            return zxj0.m222004b();
        }
        for (C18613a<?, ?> c18613a : this.f136754a) {
            if (c18613a.m158349a(cls, cls2)) {
                return (y4d0<Z, R>) c18613a.f136757c;
            }
        }
        throw new IllegalArgumentException("No transcoder registered to transcode from " + cls + " to " + cls2);
    }

    @NonNull
    /* JADX INFO: renamed from: b */
    public synchronized <Z, R> List<Class<R>> m158347b(@NonNull Class<Z> cls, @NonNull Class<R> cls2) {
        ArrayList arrayList = new ArrayList();
        if (cls2.isAssignableFrom(cls)) {
            arrayList.add(cls2);
            return arrayList;
        }
        for (C18613a<?, ?> c18613a : this.f136754a) {
            if (c18613a.m158349a(cls, cls2) && !arrayList.contains(c18613a.f136756b)) {
                arrayList.add(c18613a.f136756b);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: c */
    public synchronized <Z, R> void m158348c(@NonNull Class<Z> cls, @NonNull Class<R> cls2, @NonNull y4d0<Z, R> y4d0Var) {
        this.f136754a.add(new C18613a<>(cls, cls2, y4d0Var));
    }
}
