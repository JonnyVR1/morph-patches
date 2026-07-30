package p153l;

import com.facebook.common.internal.ImmutableMap;
import com.facebook.common.memory.PooledByteBuffer;
import com.facebook.imagepipeline.request.ImageRequest;

/* JADX INFO: loaded from: classes.dex */
public class q0f implements wk90<n0f> {

    /* JADX INFO: renamed from: a */
    public final mpy<by3, PooledByteBuffer> f155041a;

    /* JADX INFO: renamed from: b */
    public final cy3 f155042b;

    /* JADX INFO: renamed from: c */
    public final wk90<n0f> f155043c;

    /* JADX INFO: renamed from: l.q0f$a */
    public static class C19482a extends pud<n0f, n0f> {

        /* JADX INFO: renamed from: c */
        public final mpy<by3, PooledByteBuffer> f155044c;

        /* JADX INFO: renamed from: d */
        public final by3 f155045d;

        /* JADX INFO: renamed from: e */
        public final boolean f155046e;

        /* JADX INFO: renamed from: f */
        public final boolean f155047f;

        public C19482a(z06<n0f> z06Var, mpy<by3, PooledByteBuffer> mpyVar, by3 by3Var, boolean z, boolean z2) {
            super(z06Var);
            this.f155044c = mpyVar;
            this.f155045d = by3Var;
            this.f155046e = z;
            this.f155047f = z2;
        }

        @Override // p153l.ji2
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public void mo8577h(n0f n0fVar, int i) {
            try {
                if (i9j.m139099d()) {
                    i9j.m139097a("EncodedMemoryCacheProducer#onNewResultImpl");
                }
                if (!ji2.m144948e(i) && n0fVar != null && !ji2.m144950l(i, 10) && n0fVar.m160961F() != him.f110036c) {
                    fb5<PooledByteBuffer> fb5VarM160986t = n0fVar.m160986t();
                    if (fb5VarM160986t != null) {
                        try {
                            fb5<PooledByteBuffer> fb5VarMo137756b = (this.f155047f && this.f155046e) ? this.f155044c.mo137756b(this.f155045d, fb5VarM160986t) : null;
                            fb5.m124874v(fb5VarM160986t);
                            if (fb5VarMo137756b != null) {
                                try {
                                    n0f n0fVar2 = new n0f(fb5VarMo137756b);
                                    n0fVar2.m160983q(n0fVar);
                                    fb5.m124874v(fb5VarMo137756b);
                                    try {
                                        m173861o().mo144955c(1.0f);
                                        m173861o().mo144954b(n0fVar2, i);
                                        n0f.m160959n(n0fVar2);
                                        if (i9j.m139099d()) {
                                            i9j.m139098b();
                                            return;
                                        }
                                        return;
                                    } catch (Throwable th) {
                                        n0f.m160959n(n0fVar2);
                                        throw th;
                                    }
                                } catch (Throwable th2) {
                                    fb5.m124874v(fb5VarMo137756b);
                                    throw th2;
                                }
                            }
                        } catch (Throwable th3) {
                            fb5.m124874v(fb5VarM160986t);
                            throw th3;
                        }
                    }
                    m173861o().mo144954b(n0fVar, i);
                    if (i9j.m139099d()) {
                        i9j.m139098b();
                        return;
                    }
                    return;
                }
                m173861o().mo144954b(n0fVar, i);
                if (i9j.m139099d()) {
                    i9j.m139098b();
                }
            } catch (Throwable th4) {
                if (i9j.m139099d()) {
                    i9j.m139098b();
                }
                throw th4;
            }
        }
    }

    public q0f(mpy<by3, PooledByteBuffer> mpyVar, cy3 cy3Var, wk90<n0f> wk90Var) {
        this.f155041a = mpyVar;
        this.f155042b = cy3Var;
        this.f155043c = wk90Var;
    }

    @Override // p153l.wk90
    /* JADX INFO: renamed from: b */
    public void mo8539b(z06<n0f> z06Var, yk90 yk90Var) {
        try {
            if (i9j.m139099d()) {
                i9j.m139097a("EncodedMemoryCacheProducer#produceResults");
            }
            cl90 cl90VarMo117675n = yk90Var.mo117675n();
            cl90VarMo117675n.mo110444d(yk90Var, "EncodedMemoryCacheProducer");
            by3 by3VarMo113093b = this.f155042b.mo113093b(yk90Var.mo117678t(), yk90Var.mo117672k());
            fb5<PooledByteBuffer> fb5Var = yk90Var.mo117678t().m8641z(4) ? this.f155041a.get(by3VarMo113093b) : null;
            try {
                if (fb5Var != null) {
                    n0f n0fVar = new n0f(fb5Var);
                    try {
                        cl90VarMo117675n.mo110446f(yk90Var, "EncodedMemoryCacheProducer", cl90VarMo117675n.mo110449k(yk90Var, "EncodedMemoryCacheProducer") ? ImmutableMap.m8202of("cached_value_found", "true") : null);
                        cl90VarMo117675n.mo110445e(yk90Var, "EncodedMemoryCacheProducer", true);
                        yk90Var.mo117664B("memory_encoded");
                        z06Var.mo144955c(1.0f);
                        z06Var.mo144954b(n0fVar, 1);
                        n0f.m160959n(n0fVar);
                        fb5.m124874v(fb5Var);
                        if (i9j.m139099d()) {
                            i9j.m139098b();
                            return;
                        }
                        return;
                    } catch (Throwable th) {
                        n0f.m160959n(n0fVar);
                        throw th;
                    }
                }
                if (yk90Var.mo117667I().getValue() < ImageRequest.RequestLevel.ENCODED_MEMORY_CACHE.getValue()) {
                    C19482a c19482a = new C19482a(z06Var, this.f155041a, by3VarMo113093b, yk90Var.mo117678t().m8641z(8), yk90Var.mo117674m().getExperiments().getIsEncodedCacheEnabled());
                    cl90VarMo117675n.mo110446f(yk90Var, "EncodedMemoryCacheProducer", cl90VarMo117675n.mo110449k(yk90Var, "EncodedMemoryCacheProducer") ? ImmutableMap.m8202of("cached_value_found", "false") : null);
                    this.f155043c.mo8539b(c19482a, yk90Var);
                    fb5.m124874v(fb5Var);
                    if (i9j.m139099d()) {
                        i9j.m139098b();
                        return;
                    }
                    return;
                }
                cl90VarMo117675n.mo110446f(yk90Var, "EncodedMemoryCacheProducer", cl90VarMo117675n.mo110449k(yk90Var, "EncodedMemoryCacheProducer") ? ImmutableMap.m8202of("cached_value_found", "false") : null);
                cl90VarMo117675n.mo110445e(yk90Var, "EncodedMemoryCacheProducer", false);
                yk90Var.mo117679u("memory_encoded", "nil-result");
                z06Var.mo144954b(null, 1);
                fb5.m124874v(fb5Var);
                if (i9j.m139099d()) {
                    i9j.m139098b();
                }
            } catch (Throwable th2) {
                fb5.m124874v(fb5Var);
                throw th2;
            }
        } catch (Throwable th3) {
            if (!i9j.m139099d()) {
                throw th3;
            }
            i9j.m139098b();
            throw th3;
        }
    }
}
