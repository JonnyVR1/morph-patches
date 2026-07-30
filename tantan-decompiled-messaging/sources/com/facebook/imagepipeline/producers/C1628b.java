package com.facebook.imagepipeline.producers;

import androidx.annotation.VisibleForTesting;
import com.facebook.common.internal.ImmutableMap;
import com.facebook.imagepipeline.request.ImageRequest;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import p149l.cx3;
import p149l.dx3;
import p149l.iei0;
import p149l.jze;
import p149l.nq2;
import p149l.p16;
import p149l.s2e;
import p149l.sc90;
import p149l.syg0;
import p149l.uc90;
import p149l.uz5;
import p149l.yc90;
import p149l.yg3;

/* JADX INFO: renamed from: com.facebook.imagepipeline.producers.b */
/* JADX INFO: loaded from: classes.dex */
public class C1628b implements sc90<jze> {

    /* JADX INFO: renamed from: a */
    public final syg0<s2e> f6515a;

    /* JADX INFO: renamed from: b */
    public final dx3 f6516b;

    /* JADX INFO: renamed from: c */
    public final sc90<jze> f6517c;

    /* JADX INFO: renamed from: com.facebook.imagepipeline.producers.b$a */
    public class a implements p16<jze, Void> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ yc90 f6518a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ uc90 f6519b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ uz5 f6520c;

        public a(yc90 yc90Var, uc90 uc90Var, uz5 uz5Var) {
            this.f6518a = yc90Var;
            this.f6519b = uc90Var;
            this.f6520c = uz5Var;
        }

        @Override // p149l.p16
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Void mo8538a(iei0<jze> iei0Var) throws Exception {
            if (C1628b.m8534f(iei0Var)) {
                this.f6518a.mo104753a(this.f6519b, "DiskCacheProducer", null);
                this.f6520c.mo107034a();
            } else if (iei0Var.m135703n()) {
                this.f6518a.mo104757i(this.f6519b, "DiskCacheProducer", iei0Var.m135699i(), null);
                C1628b.this.f6517c.mo8485b(this.f6520c, this.f6519b);
            } else {
                jze jzeVarM135700j = iei0Var.m135700j();
                yc90 yc90Var = this.f6518a;
                if (jzeVarM135700j != null) {
                    uc90 uc90Var = this.f6519b;
                    yc90Var.mo104756f(uc90Var, "DiskCacheProducer", C1628b.m8533e(yc90Var, uc90Var, true, jzeVarM135700j.m143902M()));
                    this.f6518a.mo104755e(this.f6519b, "DiskCacheProducer", true);
                    this.f6519b.mo155857B("disk");
                    this.f6520c.mo107036c(1.0f);
                    this.f6520c.mo107035b(jzeVarM135700j, 1);
                    jzeVarM135700j.close();
                } else {
                    uc90 uc90Var2 = this.f6519b;
                    yc90Var.mo104756f(uc90Var2, "DiskCacheProducer", C1628b.m8533e(yc90Var, uc90Var2, false, 0));
                    C1628b.this.f6517c.mo8485b(this.f6520c, this.f6519b);
                }
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: com.facebook.imagepipeline.producers.b$b */
    public class b extends nq2 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ AtomicBoolean f6522a;

        public b(AtomicBoolean atomicBoolean) {
            this.f6522a = atomicBoolean;
        }

        @Override // p149l.nq2, p149l.vc90
        /* JADX INFO: renamed from: b */
        public void mo8497b() {
            this.f6522a.set(true);
        }
    }

    public C1628b(syg0<s2e> syg0Var, dx3 dx3Var, sc90<jze> sc90Var) {
        this.f6515a = syg0Var;
        this.f6516b = dx3Var;
        this.f6517c = sc90Var;
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: e */
    public static Map<String, String> m8533e(yc90 yc90Var, uc90 uc90Var, boolean z, int i) {
        if (yc90Var.mo104759k(uc90Var, "DiskCacheProducer")) {
            return z ? ImmutableMap.m8149of("cached_value_found", String.valueOf(z), "encodedImageSize", String.valueOf(i)) : ImmutableMap.m8148of("cached_value_found", String.valueOf(z));
        }
        return null;
    }

    /* JADX INFO: renamed from: f */
    public static boolean m8534f(iei0<?> iei0Var) {
        if (iei0Var.m135701l()) {
            return true;
        }
        return iei0Var.m135703n() && (iei0Var.m135699i() instanceof CancellationException);
    }

    @Override // p149l.sc90
    /* JADX INFO: renamed from: b */
    public void mo8485b(uz5<jze> uz5Var, uc90 uc90Var) {
        ImageRequest imageRequestMo155873t = uc90Var.mo155873t();
        if (!uc90Var.mo155873t().m8587z(16)) {
            m8535g(uz5Var, uc90Var);
            return;
        }
        uc90Var.mo155870n().mo104754d(uc90Var, "DiskCacheProducer");
        cx3 cx3VarMo113968b = this.f6516b.mo113968b(imageRequestMo155873t, uc90Var.mo155867k());
        s2e s2eVar = this.f6515a.get();
        yg3 yg3VarM8468a = DiskCacheDecision.m8468a(imageRequestMo155873t, s2eVar.mo94680b(), s2eVar.mo94681c(), s2eVar.mo94682d());
        if (yg3VarM8468a != null) {
            AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            yg3VarM8468a.m214606g(cx3VarMo113968b, atomicBoolean).m135697e(m8536h(uz5Var, uc90Var));
            m8537i(atomicBoolean, uc90Var);
        } else {
            uc90Var.mo155870n().mo104757i(uc90Var, "DiskCacheProducer", new DiskCacheDecision.DiskCacheDecisionNoDiskCacheChosenException("Got no disk cache for CacheChoice: " + Integer.valueOf(imageRequestMo155873t.m8566d().ordinal()).toString()), null);
            m8535g(uz5Var, uc90Var);
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m8535g(uz5<jze> uz5Var, uc90 uc90Var) {
        if (uc90Var.mo155860I().getValue() < ImageRequest.RequestLevel.DISK_CACHE.getValue()) {
            this.f6517c.mo8485b(uz5Var, uc90Var);
        } else {
            uc90Var.mo155874u("disk", "nil-result_read");
            uz5Var.mo107035b(null, 1);
        }
    }

    /* JADX INFO: renamed from: h */
    public final p16<jze, Void> m8536h(uz5<jze> uz5Var, uc90 uc90Var) {
        return new a(uc90Var.mo155870n(), uc90Var, uz5Var);
    }

    /* JADX INFO: renamed from: i */
    public final void m8537i(AtomicBoolean atomicBoolean, uc90 uc90Var) {
        uc90Var.mo155872q(new b(atomicBoolean));
    }
}
