package com.facebook.imagepipeline.producers;

import com.facebook.imagepipeline.request.ImageRequest;
import p149l.btd;
import p149l.ci2;
import p149l.cx3;
import p149l.dx3;
import p149l.egm;
import p149l.jze;
import p149l.s2e;
import p149l.sc90;
import p149l.syg0;
import p149l.uc90;
import p149l.uz5;
import p149l.yg3;

/* JADX INFO: renamed from: com.facebook.imagepipeline.producers.c */
/* JADX INFO: loaded from: classes.dex */
public class C1629c implements sc90<jze> {

    /* JADX INFO: renamed from: a */
    public final syg0<s2e> f6524a;

    /* JADX INFO: renamed from: b */
    public final dx3 f6525b;

    /* JADX INFO: renamed from: c */
    public final sc90<jze> f6526c;

    /* JADX INFO: renamed from: com.facebook.imagepipeline.producers.c$a */
    public static class a extends btd<jze, jze> {

        /* JADX INFO: renamed from: c */
        public final uc90 f6527c;

        /* JADX INFO: renamed from: d */
        public final syg0<s2e> f6528d;

        /* JADX INFO: renamed from: e */
        public final dx3 f6529e;

        public a(uz5<jze> uz5Var, uc90 uc90Var, syg0<s2e> syg0Var, dx3 dx3Var) {
            super(uz5Var);
            this.f6527c = uc90Var;
            this.f6528d = syg0Var;
            this.f6529e = dx3Var;
        }

        @Override // p149l.ci2
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public void mo8523h(jze jzeVar, int i) {
            this.f6527c.mo155870n().mo104754d(this.f6527c, "DiskCacheWriteProducer");
            if (ci2.m107029e(i) || jzeVar == null || ci2.m107031l(i, 10) || jzeVar.m143898F() == egm.f90961c) {
                this.f6527c.mo155870n().mo104756f(this.f6527c, "DiskCacheWriteProducer", null);
                m103812o().mo107035b(jzeVar, i);
                return;
            }
            ImageRequest imageRequestMo155873t = this.f6527c.mo155873t();
            cx3 cx3VarMo113968b = this.f6529e.mo113968b(imageRequestMo155873t, this.f6527c.mo155867k());
            s2e s2eVar = this.f6528d.get();
            yg3 yg3VarM8468a = DiskCacheDecision.m8468a(imageRequestMo155873t, s2eVar.mo94680b(), s2eVar.mo94681c(), s2eVar.mo94682d());
            if (yg3VarM8468a != null) {
                yg3VarM8468a.m214608i(cx3VarMo113968b, jzeVar);
                this.f6527c.mo155870n().mo104756f(this.f6527c, "DiskCacheWriteProducer", null);
                m103812o().mo107035b(jzeVar, i);
            } else {
                this.f6527c.mo155870n().mo104757i(this.f6527c, "DiskCacheWriteProducer", new DiskCacheDecision.DiskCacheDecisionNoDiskCacheChosenException("Got no disk cache for CacheChoice: " + Integer.valueOf(imageRequestMo155873t.m8566d().ordinal()).toString()), null);
                m103812o().mo107035b(jzeVar, i);
            }
        }
    }

    public C1629c(syg0<s2e> syg0Var, dx3 dx3Var, sc90<jze> sc90Var) {
        this.f6524a = syg0Var;
        this.f6525b = dx3Var;
        this.f6526c = sc90Var;
    }

    /* JADX INFO: renamed from: c */
    private void m8540c(uz5<jze> uz5Var, uc90 uc90Var) {
        uc90 uc90Var2;
        if (uc90Var.mo155860I().getValue() >= ImageRequest.RequestLevel.DISK_CACHE.getValue()) {
            uc90Var.mo155874u("disk", "nil-result_write");
            uz5Var.mo107035b(null, 1);
            return;
        }
        if (uc90Var.mo155873t().m8587z(32)) {
            uc90Var2 = uc90Var;
            uz5Var = new a(uz5Var, uc90Var2, this.f6524a, this.f6525b);
        } else {
            uc90Var2 = uc90Var;
        }
        this.f6526c.mo8485b(uz5Var, uc90Var2);
    }

    @Override // p149l.sc90
    /* JADX INFO: renamed from: b */
    public void mo8485b(uz5<jze> uz5Var, uc90 uc90Var) {
        m8540c(uz5Var, uc90Var);
    }
}
