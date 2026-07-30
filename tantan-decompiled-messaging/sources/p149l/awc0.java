package p149l;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class awc0 {

    /* JADX INFO: renamed from: a */
    private final List<C15738a<?>> f72030a = new ArrayList();

    /* JADX INFO: renamed from: l.awc0$a */
    public static final class C15738a<T> {

        /* JADX INFO: renamed from: a */
        private final Class<T> f72031a;

        /* JADX INFO: renamed from: b */
        final zvc0<T> f72032b;

        public C15738a(@NonNull Class<T> cls, @NonNull zvc0<T> zvc0Var) {
            this.f72031a = cls;
            this.f72032b = zvc0Var;
        }

        /* JADX INFO: renamed from: a */
        public boolean m99264a(@NonNull Class<?> cls) {
            return this.f72031a.isAssignableFrom(cls);
        }
    }

    /* JADX INFO: renamed from: a */
    public synchronized <Z> void m99262a(@NonNull Class<Z> cls, @NonNull zvc0<Z> zvc0Var) {
        this.f72030a.add(new C15738a<>(cls, zvc0Var));
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public synchronized <Z> zvc0<Z> m99263b(@NonNull Class<Z> cls) {
        int size = this.f72030a.size();
        for (int i = 0; i < size; i++) {
            C15738a<?> c15738a = this.f72030a.get(i);
            if (c15738a.m99264a(cls)) {
                return (zvc0<Z>) c15738a.f72032b;
            }
        }
        return null;
    }
}
