package p153l;

import com.facebook.imagepipeline.request.ImageRequest;

/* JADX INFO: loaded from: classes.dex */
public class r0f implements wk90<n0f> {

    /* JADX INFO: renamed from: a */
    public final a7h0<g4e> f160617a;

    /* JADX INFO: renamed from: b */
    public final cy3 f160618b;

    /* JADX INFO: renamed from: c */
    public final wk90<n0f> f160619c;

    /* JADX INFO: renamed from: d */
    public final ye3<by3> f160620d;

    /* JADX INFO: renamed from: e */
    public final ye3<by3> f160621e;

    /* JADX INFO: renamed from: l.r0f$a */
    public static class C19714a extends pud<n0f, n0f> {

        /* JADX INFO: renamed from: c */
        public final yk90 f160622c;

        /* JADX INFO: renamed from: d */
        public final a7h0<g4e> f160623d;

        /* JADX INFO: renamed from: e */
        public final cy3 f160624e;

        /* JADX INFO: renamed from: f */
        public final ye3<by3> f160625f;

        /* JADX INFO: renamed from: g */
        public final ye3<by3> f160626g;

        public C19714a(z06<n0f> z06Var, yk90 yk90Var, a7h0<g4e> a7h0Var, cy3 cy3Var, ye3<by3> ye3Var, ye3<by3> ye3Var2) {
            super(z06Var);
            this.f160622c = yk90Var;
            this.f160623d = a7h0Var;
            this.f160624e = cy3Var;
            this.f160625f = ye3Var;
            this.f160626g = ye3Var2;
        }

        @Override // p153l.ji2
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public void mo8577h(n0f n0fVar, int i) {
            boolean zM139099d;
            try {
                if (i9j.m139099d()) {
                    i9j.m139097a("EncodedProbeProducer#onNewResultImpl");
                }
                if (!ji2.m144948e(i) && n0fVar != null && !ji2.m144950l(i, 10) && n0fVar.m160961F() != him.f110036c) {
                    ImageRequest imageRequestMo117678t = this.f160622c.mo117678t();
                    by3 by3VarMo113093b = this.f160624e.mo113093b(imageRequestMo117678t, this.f160622c.mo117672k());
                    this.f160625f.m215393a(by3VarMo113093b);
                    if ("memory_encoded".equals(this.f160622c.mo117668e("origin"))) {
                        if (!this.f160626g.m215394b(by3VarMo113093b)) {
                            boolean z = imageRequestMo117678t.m8620d() == ImageRequest.CacheChoice.SMALL;
                            g4e g4eVar = this.f160623d.get();
                            (z ? g4eVar.mo128866b() : g4eVar.mo128867c()).m158402e(by3VarMo113093b);
                            this.f160626g.m215393a(by3VarMo113093b);
                        }
                    } else if ("disk".equals(this.f160622c.mo117668e("origin"))) {
                        this.f160626g.m215393a(by3VarMo113093b);
                    }
                    m173861o().mo144954b(n0fVar, i);
                    if (zM139099d) {
                        return;
                    } else {
                        return;
                    }
                }
                m173861o().mo144954b(n0fVar, i);
            } finally {
                if (i9j.m139099d()) {
                    i9j.m139098b();
                }
            }
        }
    }

    public r0f(a7h0<g4e> a7h0Var, cy3 cy3Var, ye3 ye3Var, ye3 ye3Var2, wk90<n0f> wk90Var) {
        this.f160617a = a7h0Var;
        this.f160618b = cy3Var;
        this.f160620d = ye3Var;
        this.f160621e = ye3Var2;
        this.f160619c = wk90Var;
    }

    @Override // p153l.wk90
    /* JADX INFO: renamed from: b */
    public void mo8539b(z06<n0f> z06Var, yk90 yk90Var) {
        try {
            if (i9j.m139099d()) {
                i9j.m139097a("EncodedProbeProducer#produceResults");
            }
            cl90 cl90VarMo117675n = yk90Var.mo117675n();
            cl90VarMo117675n.mo110444d(yk90Var, m179217c());
            C19714a c19714a = new C19714a(z06Var, yk90Var, this.f160617a, this.f160618b, this.f160620d, this.f160621e);
            cl90VarMo117675n.mo110446f(yk90Var, "EncodedProbeProducer", null);
            if (i9j.m139099d()) {
                i9j.m139097a("mInputProducer.produceResult");
            }
            this.f160619c.mo8539b(c19714a, yk90Var);
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
    public String m179217c() {
        return "EncodedProbeProducer";
    }
}
