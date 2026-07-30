package p153l;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class d4d0 {

    /* JADX INFO: renamed from: a */
    private final List<C16443a<?>> f85030a = new ArrayList();

    /* JADX INFO: renamed from: l.d4d0$a */
    public static final class C16443a<T> {

        /* JADX INFO: renamed from: a */
        private final Class<T> f85031a;

        /* JADX INFO: renamed from: b */
        final c4d0<T> f85032b;

        public C16443a(@NonNull Class<T> cls, @NonNull c4d0<T> c4d0Var) {
            this.f85031a = cls;
            this.f85032b = c4d0Var;
        }

        /* JADX INFO: renamed from: a */
        public boolean m114179a(@NonNull Class<?> cls) {
            return this.f85031a.isAssignableFrom(cls);
        }
    }

    /* JADX INFO: renamed from: a */
    public synchronized <Z> void m114177a(@NonNull Class<Z> cls, @NonNull c4d0<Z> c4d0Var) {
        this.f85030a.add(new C16443a<>(cls, c4d0Var));
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public synchronized <Z> c4d0<Z> m114178b(@NonNull Class<Z> cls) {
        int size = this.f85030a.size();
        for (int i = 0; i < size; i++) {
            C16443a<?> c16443a = this.f85030a.get(i);
            if (c16443a.m114179a(cls)) {
                return (c4d0<Z>) c16443a.f85032b;
            }
        }
        return null;
    }
}
