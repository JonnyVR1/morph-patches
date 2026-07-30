package p149l;

import com.facebook.common.internal.ImmutableMap;
import com.facebook.common.memory.PooledByteBuffer;
import com.facebook.imagepipeline.request.ImageRequest;

/* JADX INFO: loaded from: classes.dex */
public class mze implements sc90<jze> {

    /* JADX INFO: renamed from: a */
    public final pgy<cx3, PooledByteBuffer> f136370a;

    /* JADX INFO: renamed from: b */
    public final dx3 f136371b;

    /* JADX INFO: renamed from: c */
    public final sc90<jze> f136372c;

    /* JADX INFO: renamed from: l.mze$a */
    public static class C18594a extends btd<jze, jze> {

        /* JADX INFO: renamed from: c */
        public final pgy<cx3, PooledByteBuffer> f136373c;

        /* JADX INFO: renamed from: d */
        public final cx3 f136374d;

        /* JADX INFO: renamed from: e */
        public final boolean f136375e;

        /* JADX INFO: renamed from: f */
        public final boolean f136376f;

        public C18594a(uz5<jze> uz5Var, pgy<cx3, PooledByteBuffer> pgyVar, cx3 cx3Var, boolean z, boolean z2) {
            super(uz5Var);
            this.f136373c = pgyVar;
            this.f136374d = cx3Var;
            this.f136375e = z;
            this.f136376f = z2;
        }

        @Override // p149l.ci2
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public void mo8523h(jze jzeVar, int i) {
            try {
                if (o6j.m162852d()) {
                    o6j.m162850a("EncodedMemoryCacheProducer#onNewResultImpl");
                }
                if (!ci2.m107029e(i) && jzeVar != null && !ci2.m107031l(i, 10) && jzeVar.m143898F() != egm.f90961c) {
                    fa5<PooledByteBuffer> fa5VarM143923t = jzeVar.m143923t();
                    if (fa5VarM143923t != null) {
                        try {
                            fa5<PooledByteBuffer> fa5VarMo101592b = (this.f136376f && this.f136375e) ? this.f136373c.mo101592b(this.f136374d, fa5VarM143923t) : null;
                            fa5.m120154v(fa5VarM143923t);
                            if (fa5VarMo101592b != null) {
                                try {
                                    jze jzeVar2 = new jze(fa5VarMo101592b);
                                    jzeVar2.m143921q(jzeVar);
                                    fa5.m120154v(fa5VarMo101592b);
                                    try {
                                        m103812o().mo107036c(1.0f);
                                        m103812o().mo107035b(jzeVar2, i);
                                        jze.m143896n(jzeVar2);
                                        if (o6j.m162852d()) {
                                            o6j.m162851b();
                                            return;
                                        }
                                        return;
                                    } catch (Throwable th) {
                                        jze.m143896n(jzeVar2);
                                        throw th;
                                    }
                                } catch (Throwable th2) {
                                    fa5.m120154v(fa5VarMo101592b);
                                    throw th2;
                                }
                            }
                        } catch (Throwable th3) {
                            fa5.m120154v(fa5VarM143923t);
                            throw th3;
                        }
                    }
                    m103812o().mo107035b(jzeVar, i);
                    if (o6j.m162852d()) {
                        o6j.m162851b();
                        return;
                    }
                    return;
                }
                m103812o().mo107035b(jzeVar, i);
                if (o6j.m162852d()) {
                    o6j.m162851b();
                }
            } catch (Throwable th4) {
                if (o6j.m162852d()) {
                    o6j.m162851b();
                }
                throw th4;
            }
        }
    }

    public mze(pgy<cx3, PooledByteBuffer> pgyVar, dx3 dx3Var, sc90<jze> sc90Var) {
        this.f136370a = pgyVar;
        this.f136371b = dx3Var;
        this.f136372c = sc90Var;
    }

    @Override // p149l.sc90
    /* JADX INFO: renamed from: b */
    public void mo8485b(uz5<jze> uz5Var, uc90 uc90Var) {
        try {
            if (o6j.m162852d()) {
                o6j.m162850a("EncodedMemoryCacheProducer#produceResults");
            }
            yc90 yc90VarMo155870n = uc90Var.mo155870n();
            yc90VarMo155870n.mo104754d(uc90Var, "EncodedMemoryCacheProducer");
            cx3 cx3VarMo113968b = this.f136371b.mo113968b(uc90Var.mo155873t(), uc90Var.mo155867k());
            fa5<PooledByteBuffer> fa5Var = uc90Var.mo155873t().m8587z(4) ? this.f136370a.get(cx3VarMo113968b) : null;
            try {
                if (fa5Var != null) {
                    jze jzeVar = new jze(fa5Var);
                    try {
                        yc90VarMo155870n.mo104756f(uc90Var, "EncodedMemoryCacheProducer", yc90VarMo155870n.mo104759k(uc90Var, "EncodedMemoryCacheProducer") ? ImmutableMap.m8148of("cached_value_found", "true") : null);
                        yc90VarMo155870n.mo104755e(uc90Var, "EncodedMemoryCacheProducer", true);
                        uc90Var.mo155857B("memory_encoded");
                        uz5Var.mo107036c(1.0f);
                        uz5Var.mo107035b(jzeVar, 1);
                        jze.m143896n(jzeVar);
                        fa5.m120154v(fa5Var);
                        if (o6j.m162852d()) {
                            o6j.m162851b();
                            return;
                        }
                        return;
                    } catch (Throwable th) {
                        jze.m143896n(jzeVar);
                        throw th;
                    }
                }
                if (uc90Var.mo155860I().getValue() < ImageRequest.RequestLevel.ENCODED_MEMORY_CACHE.getValue()) {
                    C18594a c18594a = new C18594a(uz5Var, this.f136370a, cx3VarMo113968b, uc90Var.mo155873t().m8587z(8), uc90Var.mo155869m().getExperiments().getIsEncodedCacheEnabled());
                    yc90VarMo155870n.mo104756f(uc90Var, "EncodedMemoryCacheProducer", yc90VarMo155870n.mo104759k(uc90Var, "EncodedMemoryCacheProducer") ? ImmutableMap.m8148of("cached_value_found", "false") : null);
                    this.f136372c.mo8485b(c18594a, uc90Var);
                    fa5.m120154v(fa5Var);
                    if (o6j.m162852d()) {
                        o6j.m162851b();
                        return;
                    }
                    return;
                }
                yc90VarMo155870n.mo104756f(uc90Var, "EncodedMemoryCacheProducer", yc90VarMo155870n.mo104759k(uc90Var, "EncodedMemoryCacheProducer") ? ImmutableMap.m8148of("cached_value_found", "false") : null);
                yc90VarMo155870n.mo104755e(uc90Var, "EncodedMemoryCacheProducer", false);
                uc90Var.mo155874u("memory_encoded", "nil-result");
                uz5Var.mo107035b(null, 1);
                fa5.m120154v(fa5Var);
                if (o6j.m162852d()) {
                    o6j.m162851b();
                }
            } catch (Throwable th2) {
                fa5.m120154v(fa5Var);
                throw th2;
            }
        } catch (Throwable th3) {
            if (!o6j.m162852d()) {
                throw th3;
            }
            o6j.m162851b();
            throw th3;
        }
    }
}
