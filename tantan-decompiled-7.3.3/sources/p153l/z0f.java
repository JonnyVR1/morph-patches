package p153l;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class z0f {

    /* JADX INFO: renamed from: a */
    private final List<C21727a<?>> f202302a = new ArrayList();

    /* JADX INFO: renamed from: l.z0f$a */
    public static final class C21727a<T> {

        /* JADX INFO: renamed from: a */
        private final Class<T> f202303a;

        /* JADX INFO: renamed from: b */
        final v0f<T> f202304b;

        public C21727a(@NonNull Class<T> cls, @NonNull v0f<T> v0fVar) {
            this.f202303a = cls;
            this.f202304b = v0fVar;
        }

        /* JADX INFO: renamed from: a */
        public boolean m218110a(@NonNull Class<?> cls) {
            return this.f202303a.isAssignableFrom(cls);
        }
    }

    /* JADX INFO: renamed from: a */
    public synchronized <T> void m218108a(@NonNull Class<T> cls, @NonNull v0f<T> v0fVar) {
        this.f202302a.add(new C21727a<>(cls, v0fVar));
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public synchronized <T> v0f<T> m218109b(@NonNull Class<T> cls) {
        for (C21727a<?> c21727a : this.f202302a) {
            if (c21727a.m218110a(cls)) {
                return (v0f<T>) c21727a.f202304b;
            }
        }
        return null;
    }
}
