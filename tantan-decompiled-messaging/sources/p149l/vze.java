package p149l;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class vze {

    /* JADX INFO: renamed from: a */
    private final List<C20773a<?>> f183620a = new ArrayList();

    /* JADX INFO: renamed from: l.vze$a */
    public static final class C20773a<T> {

        /* JADX INFO: renamed from: a */
        private final Class<T> f183621a;

        /* JADX INFO: renamed from: b */
        final rze<T> f183622b;

        public C20773a(@NonNull Class<T> cls, @NonNull rze<T> rzeVar) {
            this.f183621a = cls;
            this.f183622b = rzeVar;
        }

        /* JADX INFO: renamed from: a */
        public boolean m200754a(@NonNull Class<?> cls) {
            return this.f183621a.isAssignableFrom(cls);
        }
    }

    /* JADX INFO: renamed from: a */
    public synchronized <T> void m200752a(@NonNull Class<T> cls, @NonNull rze<T> rzeVar) {
        this.f183620a.add(new C20773a<>(cls, rzeVar));
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public synchronized <T> rze<T> m200753b(@NonNull Class<T> cls) {
        for (C20773a<?> c20773a : this.f183620a) {
            if (c20773a.m200754a(cls)) {
                return (rze<T>) c20773a.f183622b;
            }
        }
        return null;
    }
}
