package p153l;

import com.facebook.common.internal.ImmutableMap;
import com.facebook.imagepipeline.request.ImageRequest;

/* JADX INFO: loaded from: classes.dex */
public class em80 implements wk90<fb5<db5>> {

    /* JADX INFO: renamed from: a */
    public final mpy<by3, db5> f94633a;

    /* JADX INFO: renamed from: b */
    public final cy3 f94634b;

    /* JADX INFO: renamed from: c */
    public final wk90<fb5<db5>> f94635c;

    /* JADX INFO: renamed from: l.em80$a */
    public static class C16796a extends pud<fb5<db5>, fb5<db5>> {

        /* JADX INFO: renamed from: c */
        public final by3 f94636c;

        /* JADX INFO: renamed from: d */
        public final boolean f94637d;

        /* JADX INFO: renamed from: e */
        public final mpy<by3, db5> f94638e;

        /* JADX INFO: renamed from: f */
        public final boolean f94639f;

        public C16796a(z06<fb5<db5>> z06Var, by3 by3Var, boolean z, mpy<by3, db5> mpyVar, boolean z2) {
            super(z06Var);
            this.f94636c = by3Var;
            this.f94637d = z;
            this.f94638e = mpyVar;
            this.f94639f = z2;
        }

        @Override // p153l.ji2
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public void mo8577h(fb5<db5> fb5Var, int i) {
            if (fb5Var == null) {
                if (ji2.m144947d(i)) {
                    m173861o().mo144954b(null, i);
                }
            } else if (!ji2.m144948e(i) || this.f94637d) {
                fb5<db5> fb5VarMo137756b = this.f94639f ? this.f94638e.mo137756b(this.f94636c, fb5Var) : null;
                try {
                    m173861o().mo144955c(1.0f);
                    z06<fb5<db5>> z06VarM173861o = m173861o();
                    if (fb5VarMo137756b != null) {
                        fb5Var = fb5VarMo137756b;
                    }
                    z06VarM173861o.mo144954b(fb5Var, i);
                } finally {
                    fb5.m124874v(fb5VarMo137756b);
                }
            }
        }
    }

    public em80(mpy<by3, db5> mpyVar, cy3 cy3Var, wk90<fb5<db5>> wk90Var) {
        this.f94633a = mpyVar;
        this.f94634b = cy3Var;
        this.f94635c = wk90Var;
    }

    @Override // p153l.wk90
    /* JADX INFO: renamed from: b */
    public void mo8539b(z06<fb5<db5>> z06Var, yk90 yk90Var) {
        cl90 cl90VarMo117675n = yk90Var.mo117675n();
        ImageRequest imageRequestMo117678t = yk90Var.mo117678t();
        Object objMo117672k = yk90Var.mo117672k();
        fm80 fm80VarM8629m = imageRequestMo117678t.m8629m();
        if (fm80VarM8629m == null || fm80VarM8629m.mo104840a() == null) {
            this.f94635c.mo8539b(z06Var, yk90Var);
            return;
        }
        cl90VarMo117675n.mo110444d(yk90Var, m121334c());
        by3 by3VarMo113092a = this.f94634b.mo113092a(imageRequestMo117678t, objMo117672k);
        fb5<db5> fb5Var = yk90Var.mo117678t().m8641z(1) ? this.f94633a.get(by3VarMo113092a) : null;
        if (fb5Var == null) {
            C16796a c16796a = new C16796a(z06Var, by3VarMo113092a, fm80VarM8629m instanceof h0d0, this.f94633a, yk90Var.mo117678t().m8641z(2));
            cl90VarMo117675n.mo110446f(yk90Var, m121334c(), cl90VarMo117675n.mo110449k(yk90Var, m121334c()) ? ImmutableMap.m8202of("cached_value_found", "false") : null);
            this.f94635c.mo8539b(c16796a, yk90Var);
        } else {
            cl90VarMo117675n.mo110446f(yk90Var, m121334c(), cl90VarMo117675n.mo110449k(yk90Var, m121334c()) ? ImmutableMap.m8202of("cached_value_found", "true") : null);
            cl90VarMo117675n.mo110445e(yk90Var, "PostprocessedBitmapMemoryCacheProducer", true);
            yk90Var.mo117679u("memory_bitmap", "postprocessed");
            z06Var.mo144955c(1.0f);
            z06Var.mo144954b(fb5Var, 1);
            fb5Var.close();
        }
    }

    /* JADX INFO: renamed from: c */
    public String m121334c() {
        return "PostprocessedBitmapMemoryCacheProducer";
    }
}
