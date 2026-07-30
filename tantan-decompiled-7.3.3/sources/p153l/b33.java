package p153l;

import com.facebook.common.memory.PooledByteBuffer;
import com.facebook.imagepipeline.request.ImageRequest;

/* JADX INFO: loaded from: classes.dex */
public class b33 implements wk90<fb5<db5>> {

    /* JADX INFO: renamed from: a */
    public final mpy<by3, PooledByteBuffer> f74697a;

    /* JADX INFO: renamed from: b */
    public final a7h0<g4e> f74698b;

    /* JADX INFO: renamed from: c */
    public final cy3 f74699c;

    /* JADX INFO: renamed from: d */
    public final wk90<fb5<db5>> f74700d;

    /* JADX INFO: renamed from: e */
    public final ye3<by3> f74701e;

    /* JADX INFO: renamed from: f */
    public final ye3<by3> f74702f;

    /* JADX INFO: renamed from: l.b33$a */
    public static class C15909a extends pud<fb5<db5>, fb5<db5>> {

        /* JADX INFO: renamed from: c */
        public final yk90 f74703c;

        /* JADX INFO: renamed from: d */
        public final mpy<by3, PooledByteBuffer> f74704d;

        /* JADX INFO: renamed from: e */
        public final a7h0<g4e> f74705e;

        /* JADX INFO: renamed from: f */
        public final cy3 f74706f;

        /* JADX INFO: renamed from: g */
        public final ye3<by3> f74707g;

        /* JADX INFO: renamed from: h */
        public final ye3<by3> f74708h;

        public C15909a(z06<fb5<db5>> z06Var, yk90 yk90Var, mpy<by3, PooledByteBuffer> mpyVar, a7h0<g4e> a7h0Var, cy3 cy3Var, ye3<by3> ye3Var, ye3<by3> ye3Var2) {
            super(z06Var);
            this.f74703c = yk90Var;
            this.f74704d = mpyVar;
            this.f74705e = a7h0Var;
            this.f74706f = cy3Var;
            this.f74707g = ye3Var;
            this.f74708h = ye3Var2;
        }

        @Override // p153l.ji2
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public void mo8577h(fb5<db5> fb5Var, int i) {
            boolean zM139099d;
            try {
                if (i9j.m139099d()) {
                    i9j.m139097a("BitmapProbeProducer#onNewResultImpl");
                }
                if (!ji2.m144948e(i) && fb5Var != null && !ji2.m144950l(i, 8)) {
                    ImageRequest imageRequestMo117678t = this.f74703c.mo117678t();
                    by3 by3VarMo113093b = this.f74706f.mo113093b(imageRequestMo117678t, this.f74703c.mo117672k());
                    String str = (String) this.f74703c.mo117668e("origin");
                    if (str != null && str.equals("memory_bitmap")) {
                        if (this.f74703c.mo117674m().getExperiments().getIsEncodedMemoryCacheProbingEnabled() && !this.f74707g.m215394b(by3VarMo113093b)) {
                            this.f74704d.mo137755a(by3VarMo113093b);
                            this.f74707g.m215393a(by3VarMo113093b);
                        }
                        if (this.f74703c.mo117674m().getExperiments().getIsDiskCacheProbingEnabled() && !this.f74708h.m215394b(by3VarMo113093b)) {
                            boolean z = imageRequestMo117678t.m8620d() == ImageRequest.CacheChoice.SMALL;
                            g4e g4eVar = this.f74705e.get();
                            (z ? g4eVar.mo128866b() : g4eVar.mo128867c()).m158402e(by3VarMo113093b);
                            this.f74708h.m215393a(by3VarMo113093b);
                        }
                    }
                    m173861o().mo144954b(fb5Var, i);
                    if (zM139099d) {
                        return;
                    } else {
                        return;
                    }
                }
                m173861o().mo144954b(fb5Var, i);
            } finally {
                if (i9j.m139099d()) {
                    i9j.m139098b();
                }
            }
        }
    }

    public b33(mpy<by3, PooledByteBuffer> mpyVar, a7h0<g4e> a7h0Var, cy3 cy3Var, ye3<by3> ye3Var, ye3<by3> ye3Var2, wk90<fb5<db5>> wk90Var) {
        this.f74697a = mpyVar;
        this.f74698b = a7h0Var;
        this.f74699c = cy3Var;
        this.f74701e = ye3Var;
        this.f74702f = ye3Var2;
        this.f74700d = wk90Var;
    }

    @Override // p153l.wk90
    /* JADX INFO: renamed from: b */
    public void mo8539b(z06<fb5<db5>> z06Var, yk90 yk90Var) {
        try {
            if (i9j.m139099d()) {
                i9j.m139097a("BitmapProbeProducer#produceResults");
            }
            cl90 cl90VarMo117675n = yk90Var.mo117675n();
            cl90VarMo117675n.mo110444d(yk90Var, m102267c());
            C15909a c15909a = new C15909a(z06Var, yk90Var, this.f74697a, this.f74698b, this.f74699c, this.f74701e, this.f74702f);
            cl90VarMo117675n.mo110446f(yk90Var, "BitmapProbeProducer", null);
            if (i9j.m139099d()) {
                i9j.m139097a("mInputProducer.produceResult");
            }
            this.f74700d.mo8539b(c15909a, yk90Var);
            if (i9j.m139099d()) {
                i9j.m139098b();
            }
        } finally {
            if (i9j.m139099d()) {
                i9j.m139098b();
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public String m102267c() {
        return "BitmapProbeProducer";
    }
}
