package com.facebook.imagepipeline.producers;

import com.facebook.imagepipeline.request.ImageRequest;
import p153l.a7h0;
import p153l.by3;
import p153l.cy3;
import p153l.g4e;
import p153l.him;
import p153l.ji2;
import p153l.mh3;
import p153l.n0f;
import p153l.pud;
import p153l.wk90;
import p153l.yk90;
import p153l.z06;

/* JADX INFO: renamed from: com.facebook.imagepipeline.producers.c */
/* JADX INFO: loaded from: classes.dex */
public class C1652c implements wk90<n0f> {

    /* JADX INFO: renamed from: a */
    public final a7h0<g4e> f6561a;

    /* JADX INFO: renamed from: b */
    public final cy3 f6562b;

    /* JADX INFO: renamed from: c */
    public final wk90<n0f> f6563c;

    /* JADX INFO: renamed from: com.facebook.imagepipeline.producers.c$a */
    public static class a extends pud<n0f, n0f> {

        /* JADX INFO: renamed from: c */
        public final yk90 f6564c;

        /* JADX INFO: renamed from: d */
        public final a7h0<g4e> f6565d;

        /* JADX INFO: renamed from: e */
        public final cy3 f6566e;

        public a(z06<n0f> z06Var, yk90 yk90Var, a7h0<g4e> a7h0Var, cy3 cy3Var) {
            super(z06Var);
            this.f6564c = yk90Var;
            this.f6565d = a7h0Var;
            this.f6566e = cy3Var;
        }

        @Override // p153l.ji2
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public void mo8577h(n0f n0fVar, int i) {
            this.f6564c.mo117675n().mo110444d(this.f6564c, "DiskCacheWriteProducer");
            if (ji2.m144948e(i) || n0fVar == null || ji2.m144950l(i, 10) || n0fVar.m160961F() == him.f110036c) {
                this.f6564c.mo117675n().mo110446f(this.f6564c, "DiskCacheWriteProducer", null);
                m173861o().mo144954b(n0fVar, i);
                return;
            }
            ImageRequest imageRequestMo117678t = this.f6564c.mo117678t();
            by3 by3VarMo113093b = this.f6566e.mo113093b(imageRequestMo117678t, this.f6564c.mo117672k());
            g4e g4eVar = this.f6565d.get();
            mh3 mh3VarM8522a = DiskCacheDecision.m8522a(imageRequestMo117678t, g4eVar.mo128866b(), g4eVar.mo128867c(), g4eVar.mo128868d());
            if (mh3VarM8522a != null) {
                mh3VarM8522a.m158406i(by3VarMo113093b, n0fVar);
                this.f6564c.mo117675n().mo110446f(this.f6564c, "DiskCacheWriteProducer", null);
                m173861o().mo144954b(n0fVar, i);
            } else {
                this.f6564c.mo117675n().mo110447i(this.f6564c, "DiskCacheWriteProducer", new DiskCacheDecision.DiskCacheDecisionNoDiskCacheChosenException("Got no disk cache for CacheChoice: " + Integer.valueOf(imageRequestMo117678t.m8620d().ordinal()).toString()), null);
                m173861o().mo144954b(n0fVar, i);
            }
        }
    }

    public C1652c(a7h0<g4e> a7h0Var, cy3 cy3Var, wk90<n0f> wk90Var) {
        this.f6561a = a7h0Var;
        this.f6562b = cy3Var;
        this.f6563c = wk90Var;
    }

    /* JADX INFO: renamed from: c */
    private void m8594c(z06<n0f> z06Var, yk90 yk90Var) {
        yk90 yk90Var2;
        if (yk90Var.mo117667I().getValue() >= ImageRequest.RequestLevel.DISK_CACHE.getValue()) {
            yk90Var.mo117679u("disk", "nil-result_write");
            z06Var.mo144954b(null, 1);
            return;
        }
        if (yk90Var.mo117678t().m8641z(32)) {
            yk90Var2 = yk90Var;
            z06Var = new a(z06Var, yk90Var2, this.f6561a, this.f6562b);
        } else {
            yk90Var2 = yk90Var;
        }
        this.f6563c.mo8539b(z06Var, yk90Var2);
    }

    @Override // p153l.wk90
    /* JADX INFO: renamed from: b */
    public void mo8539b(z06<n0f> z06Var, yk90 yk90Var) {
        m8594c(z06Var, yk90Var);
    }
}
