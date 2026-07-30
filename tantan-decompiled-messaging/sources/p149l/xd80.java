package p149l;

import com.facebook.common.internal.ImmutableMap;
import com.facebook.imagepipeline.request.ImageRequest;

/* JADX INFO: loaded from: classes.dex */
public class xd80 implements sc90<fa5<da5>> {

    /* JADX INFO: renamed from: a */
    public final pgy<cx3, da5> f192365a;

    /* JADX INFO: renamed from: b */
    public final dx3 f192366b;

    /* JADX INFO: renamed from: c */
    public final sc90<fa5<da5>> f192367c;

    /* JADX INFO: renamed from: l.xd80$a */
    public static class C21097a extends btd<fa5<da5>, fa5<da5>> {

        /* JADX INFO: renamed from: c */
        public final cx3 f192368c;

        /* JADX INFO: renamed from: d */
        public final boolean f192369d;

        /* JADX INFO: renamed from: e */
        public final pgy<cx3, da5> f192370e;

        /* JADX INFO: renamed from: f */
        public final boolean f192371f;

        public C21097a(uz5<fa5<da5>> uz5Var, cx3 cx3Var, boolean z, pgy<cx3, da5> pgyVar, boolean z2) {
            super(uz5Var);
            this.f192368c = cx3Var;
            this.f192369d = z;
            this.f192370e = pgyVar;
            this.f192371f = z2;
        }

        @Override // p149l.ci2
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public void mo8523h(fa5<da5> fa5Var, int i) {
            if (fa5Var == null) {
                if (ci2.m107028d(i)) {
                    m103812o().mo107035b(null, i);
                }
            } else if (!ci2.m107029e(i) || this.f192369d) {
                fa5<da5> fa5VarMo101592b = this.f192371f ? this.f192370e.mo101592b(this.f192368c, fa5Var) : null;
                try {
                    m103812o().mo107036c(1.0f);
                    uz5<fa5<da5>> uz5VarM103812o = m103812o();
                    if (fa5VarMo101592b != null) {
                        fa5Var = fa5VarMo101592b;
                    }
                    uz5VarM103812o.mo107035b(fa5Var, i);
                } finally {
                    fa5.m120154v(fa5VarMo101592b);
                }
            }
        }
    }

    public xd80(pgy<cx3, da5> pgyVar, dx3 dx3Var, sc90<fa5<da5>> sc90Var) {
        this.f192365a = pgyVar;
        this.f192366b = dx3Var;
        this.f192367c = sc90Var;
    }

    @Override // p149l.sc90
    /* JADX INFO: renamed from: b */
    public void mo8485b(uz5<fa5<da5>> uz5Var, uc90 uc90Var) {
        yc90 yc90VarMo155870n = uc90Var.mo155870n();
        ImageRequest imageRequestMo155873t = uc90Var.mo155873t();
        Object objMo155867k = uc90Var.mo155867k();
        yd80 yd80VarM8575m = imageRequestMo155873t.m8575m();
        if (yd80VarM8575m == null || yd80VarM8575m.mo102087a() == null) {
            this.f192367c.mo8485b(uz5Var, uc90Var);
            return;
        }
        yc90VarMo155870n.mo104754d(uc90Var, m208277c());
        cx3 cx3VarMo113967a = this.f192366b.mo113967a(imageRequestMo155873t, objMo155867k);
        fa5<da5> fa5Var = uc90Var.mo155873t().m8587z(1) ? this.f192365a.get(cx3VarMo113967a) : null;
        if (fa5Var == null) {
            C21097a c21097a = new C21097a(uz5Var, cx3VarMo113967a, yd80VarM8575m instanceof csc0, this.f192365a, uc90Var.mo155873t().m8587z(2));
            yc90VarMo155870n.mo104756f(uc90Var, m208277c(), yc90VarMo155870n.mo104759k(uc90Var, m208277c()) ? ImmutableMap.m8148of("cached_value_found", "false") : null);
            this.f192367c.mo8485b(c21097a, uc90Var);
        } else {
            yc90VarMo155870n.mo104756f(uc90Var, m208277c(), yc90VarMo155870n.mo104759k(uc90Var, m208277c()) ? ImmutableMap.m8148of("cached_value_found", "true") : null);
            yc90VarMo155870n.mo104755e(uc90Var, "PostprocessedBitmapMemoryCacheProducer", true);
            uc90Var.mo155874u("memory_bitmap", "postprocessed");
            uz5Var.mo107036c(1.0f);
            uz5Var.mo107035b(fa5Var, 1);
            fa5Var.close();
        }
    }

    /* JADX INFO: renamed from: c */
    public String m208277c() {
        return "PostprocessedBitmapMemoryCacheProducer";
    }
}
