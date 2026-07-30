package p153l;

import com.facebook.imagepipeline.request.ImageRequest;

/* JADX INFO: loaded from: classes.dex */
public class gf3 implements wk90<n0f> {

    /* JADX INFO: renamed from: a */
    public final wk90<n0f> f103875a;

    /* JADX INFO: renamed from: b */
    public final wk90<n0f> f103876b;

    /* JADX INFO: renamed from: l.gf3$a */
    public class C17203a extends pud<n0f, n0f> {

        /* JADX INFO: renamed from: c */
        public yk90 f103877c;

        public C17203a(z06<n0f> z06Var, yk90 yk90Var) {
            super(z06Var);
            this.f103877c = yk90Var;
        }

        @Override // p153l.pud, p153l.ji2
        /* JADX INFO: renamed from: g */
        public void mo8576g(Throwable th) {
            gf3.this.f103876b.mo8539b(m173861o(), this.f103877c);
        }

        @Override // p153l.ji2
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public void mo8577h(n0f n0fVar, int i) {
            ImageRequest imageRequestMo117678t = this.f103877c.mo117678t();
            boolean zM144947d = ji2.m144947d(i);
            boolean zM113343c = czi0.m113343c(n0fVar, imageRequestMo117678t.m8635s());
            if (n0fVar != null && (zM113343c || imageRequestMo117678t.m8627k())) {
                if (zM144947d && zM113343c) {
                    m173861o().mo144954b(n0fVar, i);
                } else {
                    m173861o().mo144954b(n0fVar, ji2.m144952n(i, 1));
                }
            }
            if (!zM144947d || zM113343c || imageRequestMo117678t.m8626j()) {
                return;
            }
            n0f.m160959n(n0fVar);
            gf3.this.f103876b.mo8539b(m173861o(), this.f103877c);
        }
    }

    public gf3(wk90<n0f> wk90Var, wk90<n0f> wk90Var2) {
        this.f103875a = wk90Var;
        this.f103876b = wk90Var2;
    }

    @Override // p153l.wk90
    /* JADX INFO: renamed from: b */
    public void mo8539b(z06<n0f> z06Var, yk90 yk90Var) {
        this.f103875a.mo8539b(new C17203a(z06Var, yk90Var), yk90Var);
    }
}
