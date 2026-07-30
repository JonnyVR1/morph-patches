package com.facebook.imagepipeline.producers;

import androidx.annotation.VisibleForTesting;
import com.facebook.common.internal.ImmutableMap;
import com.facebook.imagepipeline.request.ImageRequest;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import p153l.a7h0;
import p153l.by3;
import p153l.cl90;
import p153l.cy3;
import p153l.er2;
import p153l.g4e;
import p153l.ini0;
import p153l.mh3;
import p153l.n0f;
import p153l.u26;
import p153l.wk90;
import p153l.yk90;
import p153l.z06;

/* JADX INFO: renamed from: com.facebook.imagepipeline.producers.b */
/* JADX INFO: loaded from: classes.dex */
public class C1651b implements wk90<n0f> {

    /* JADX INFO: renamed from: a */
    public final a7h0<g4e> f6552a;

    /* JADX INFO: renamed from: b */
    public final cy3 f6553b;

    /* JADX INFO: renamed from: c */
    public final wk90<n0f> f6554c;

    /* JADX INFO: renamed from: com.facebook.imagepipeline.producers.b$a */
    public class a implements u26<n0f, Void> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ cl90 f6555a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ yk90 f6556b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ z06 f6557c;

        public a(cl90 cl90Var, yk90 yk90Var, z06 z06Var) {
            this.f6555a = cl90Var;
            this.f6556b = yk90Var;
            this.f6557c = z06Var;
        }

        @Override // p153l.u26
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Void mo8592a(ini0<n0f> ini0Var) throws Exception {
            if (C1651b.m8588f(ini0Var)) {
                this.f6555a.mo110443a(this.f6556b, "DiskCacheProducer", null);
                this.f6557c.mo144953a();
            } else if (ini0Var.m141145n()) {
                this.f6555a.mo110447i(this.f6556b, "DiskCacheProducer", ini0Var.m141141i(), null);
                C1651b.this.f6554c.mo8539b(this.f6557c, this.f6556b);
            } else {
                n0f n0fVarM141142j = ini0Var.m141142j();
                cl90 cl90Var = this.f6555a;
                if (n0fVarM141142j != null) {
                    yk90 yk90Var = this.f6556b;
                    cl90Var.mo110446f(yk90Var, "DiskCacheProducer", C1651b.m8587e(cl90Var, yk90Var, true, n0fVarM141142j.m160965M()));
                    this.f6555a.mo110445e(this.f6556b, "DiskCacheProducer", true);
                    this.f6556b.mo117664B("disk");
                    this.f6557c.mo144955c(1.0f);
                    this.f6557c.mo144954b(n0fVarM141142j, 1);
                    n0fVarM141142j.close();
                } else {
                    yk90 yk90Var2 = this.f6556b;
                    cl90Var.mo110446f(yk90Var2, "DiskCacheProducer", C1651b.m8587e(cl90Var, yk90Var2, false, 0));
                    C1651b.this.f6554c.mo8539b(this.f6557c, this.f6556b);
                }
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: com.facebook.imagepipeline.producers.b$b */
    public class b extends er2 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ AtomicBoolean f6559a;

        public b(AtomicBoolean atomicBoolean) {
            this.f6559a = atomicBoolean;
        }

        @Override // p153l.er2, p153l.zk90
        /* JADX INFO: renamed from: b */
        public void mo8551b() {
            this.f6559a.set(true);
        }
    }

    public C1651b(a7h0<g4e> a7h0Var, cy3 cy3Var, wk90<n0f> wk90Var) {
        this.f6552a = a7h0Var;
        this.f6553b = cy3Var;
        this.f6554c = wk90Var;
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: e */
    public static Map<String, String> m8587e(cl90 cl90Var, yk90 yk90Var, boolean z, int i) {
        if (cl90Var.mo110449k(yk90Var, "DiskCacheProducer")) {
            return z ? ImmutableMap.m8203of("cached_value_found", String.valueOf(z), "encodedImageSize", String.valueOf(i)) : ImmutableMap.m8202of("cached_value_found", String.valueOf(z));
        }
        return null;
    }

    /* JADX INFO: renamed from: f */
    public static boolean m8588f(ini0<?> ini0Var) {
        if (ini0Var.m141143l()) {
            return true;
        }
        return ini0Var.m141145n() && (ini0Var.m141141i() instanceof CancellationException);
    }

    @Override // p153l.wk90
    /* JADX INFO: renamed from: b */
    public void mo8539b(z06<n0f> z06Var, yk90 yk90Var) {
        ImageRequest imageRequestMo117678t = yk90Var.mo117678t();
        if (!yk90Var.mo117678t().m8641z(16)) {
            m8589g(z06Var, yk90Var);
            return;
        }
        yk90Var.mo117675n().mo110444d(yk90Var, "DiskCacheProducer");
        by3 by3VarMo113093b = this.f6553b.mo113093b(imageRequestMo117678t, yk90Var.mo117672k());
        g4e g4eVar = this.f6552a.get();
        mh3 mh3VarM8522a = DiskCacheDecision.m8522a(imageRequestMo117678t, g4eVar.mo128866b(), g4eVar.mo128867c(), g4eVar.mo128868d());
        if (mh3VarM8522a != null) {
            AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            mh3VarM8522a.m158404g(by3VarMo113093b, atomicBoolean).m141139e(m8590h(z06Var, yk90Var));
            m8591i(atomicBoolean, yk90Var);
        } else {
            yk90Var.mo117675n().mo110447i(yk90Var, "DiskCacheProducer", new DiskCacheDecision.DiskCacheDecisionNoDiskCacheChosenException("Got no disk cache for CacheChoice: " + Integer.valueOf(imageRequestMo117678t.m8620d().ordinal()).toString()), null);
            m8589g(z06Var, yk90Var);
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m8589g(z06<n0f> z06Var, yk90 yk90Var) {
        if (yk90Var.mo117667I().getValue() < ImageRequest.RequestLevel.DISK_CACHE.getValue()) {
            this.f6554c.mo8539b(z06Var, yk90Var);
        } else {
            yk90Var.mo117679u("disk", "nil-result_read");
            z06Var.mo144954b(null, 1);
        }
    }

    /* JADX INFO: renamed from: h */
    public final u26<n0f, Void> m8590h(z06<n0f> z06Var, yk90 yk90Var) {
        return new a(yk90Var.mo117675n(), yk90Var, z06Var);
    }

    /* JADX INFO: renamed from: i */
    public final void m8591i(AtomicBoolean atomicBoolean, yk90 yk90Var) {
        yk90Var.mo117677q(new b(atomicBoolean));
    }
}
