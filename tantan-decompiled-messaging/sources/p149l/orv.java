package p149l;

import androidx.annotation.Nullable;
import com.bumptech.glide.load.engine.C1070g;
import com.bumptech.glide.load.engine.C1078o;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public class orv {

    /* JADX INFO: renamed from: c */
    private static final C1078o<?, ?, ?> f145356c = new C1078o<>(Object.class, Object.class, Object.class, Collections.singletonList(new C1070g(Object.class, Object.class, Object.class, Collections.EMPTY_LIST, new woj0(), null)), null);

    /* JADX INFO: renamed from: a */
    private final e01<cj10, C1078o<?, ?, ?>> f145357a = new e01<>();

    /* JADX INFO: renamed from: b */
    private final AtomicReference<cj10> f145358b = new AtomicReference<>();

    /* JADX INFO: renamed from: b */
    private cj10 m165679b(Class<?> cls, Class<?> cls2, Class<?> cls3) {
        cj10 andSet = this.f145358b.getAndSet(null);
        if (andSet == null) {
            andSet = new cj10();
        }
        andSet.m107105a(cls, cls2, cls3);
        return andSet;
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    public <Data, TResource, Transcode> C1078o<Data, TResource, Transcode> m165680a(Class<Data> cls, Class<TResource> cls2, Class<Transcode> cls3) {
        C1078o<Data, TResource, Transcode> c1078o;
        cj10 cj10VarM165679b = m165679b(cls, cls2, cls3);
        synchronized (this.f145357a) {
            c1078o = (C1078o) this.f145357a.get(cj10VarM165679b);
        }
        this.f145358b.set(cj10VarM165679b);
        return c1078o;
    }

    /* JADX INFO: renamed from: c */
    public boolean m165681c(@Nullable C1078o<?, ?, ?> c1078o) {
        return f145356c.equals(c1078o);
    }

    /* JADX INFO: renamed from: d */
    public void m165682d(Class<?> cls, Class<?> cls2, Class<?> cls3, @Nullable C1078o<?, ?, ?> c1078o) {
        synchronized (this.f145357a) {
            e01<cj10, C1078o<?, ?, ?>> e01Var = this.f145357a;
            cj10 cj10Var = new cj10(cls, cls2, cls3);
            if (c1078o == null) {
                c1078o = f145356c;
            }
            e01Var.put(cj10Var, c1078o);
        }
    }
}
