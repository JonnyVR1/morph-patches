package p153l;

import androidx.annotation.Nullable;
import com.bumptech.glide.load.engine.C1080g;
import com.bumptech.glide.load.engine.C1088o;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public class ptv {

    /* JADX INFO: renamed from: c */
    private static final C1088o<?, ?, ?> f154112c = new C1088o<>(Object.class, Object.class, Object.class, Collections.singletonList(new C1080g(Object.class, Object.class, Object.class, Collections.EMPTY_LIST, new zxj0(), null)), null);

    /* JADX INFO: renamed from: a */
    private final l01<mr10, C1088o<?, ?, ?>> f154113a = new l01<>();

    /* JADX INFO: renamed from: b */
    private final AtomicReference<mr10> f154114b = new AtomicReference<>();

    /* JADX INFO: renamed from: b */
    private mr10 m173783b(Class<?> cls, Class<?> cls2, Class<?> cls3) {
        mr10 andSet = this.f154114b.getAndSet(null);
        if (andSet == null) {
            andSet = new mr10();
        }
        andSet.m159618a(cls, cls2, cls3);
        return andSet;
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    public <Data, TResource, Transcode> C1088o<Data, TResource, Transcode> m173784a(Class<Data> cls, Class<TResource> cls2, Class<Transcode> cls3) {
        C1088o<Data, TResource, Transcode> c1088o;
        mr10 mr10VarM173783b = m173783b(cls, cls2, cls3);
        synchronized (this.f154113a) {
            c1088o = (C1088o) this.f154113a.get(mr10VarM173783b);
        }
        this.f154114b.set(mr10VarM173783b);
        return c1088o;
    }

    /* JADX INFO: renamed from: c */
    public boolean m173785c(@Nullable C1088o<?, ?, ?> c1088o) {
        return f154112c.equals(c1088o);
    }

    /* JADX INFO: renamed from: d */
    public void m173786d(Class<?> cls, Class<?> cls2, Class<?> cls3, @Nullable C1088o<?, ?, ?> c1088o) {
        synchronized (this.f154113a) {
            l01<mr10, C1088o<?, ?, ?>> l01Var = this.f154113a;
            mr10 mr10Var = new mr10(cls, cls2, cls3);
            if (c1088o == null) {
                c1088o = f154112c;
            }
            l01Var.put(mr10Var, c1088o);
        }
    }
}
