package p149l;

import com.facebook.imagepipeline.request.ImageRequest;

/* JADX INFO: loaded from: classes.dex */
public class re3 implements sc90<jze> {

    /* JADX INFO: renamed from: a */
    public final sc90<jze> f159024a;

    /* JADX INFO: renamed from: b */
    public final sc90<jze> f159025b;

    /* JADX INFO: renamed from: l.re3$a */
    public class C19684a extends btd<jze, jze> {

        /* JADX INFO: renamed from: c */
        public uc90 f159026c;

        public C19684a(uz5<jze> uz5Var, uc90 uc90Var) {
            super(uz5Var);
            this.f159026c = uc90Var;
        }

        @Override // p149l.btd, p149l.ci2
        /* JADX INFO: renamed from: g */
        public void mo8522g(Throwable th) {
            re3.this.f159025b.mo8485b(m103812o(), this.f159026c);
        }

        @Override // p149l.ci2
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public void mo8523h(jze jzeVar, int i) {
            ImageRequest imageRequestMo155873t = this.f159026c.mo155873t();
            boolean zM107028d = ci2.m107028d(i);
            boolean zM219675c = zpi0.m219675c(jzeVar, imageRequestMo155873t.m8581s());
            if (jzeVar != null && (zM219675c || imageRequestMo155873t.m8573k())) {
                if (zM107028d && zM219675c) {
                    m103812o().mo107035b(jzeVar, i);
                } else {
                    m103812o().mo107035b(jzeVar, ci2.m107033n(i, 1));
                }
            }
            if (!zM107028d || zM219675c || imageRequestMo155873t.m8572j()) {
                return;
            }
            jze.m143896n(jzeVar);
            re3.this.f159025b.mo8485b(m103812o(), this.f159026c);
        }
    }

    public re3(sc90<jze> sc90Var, sc90<jze> sc90Var2) {
        this.f159024a = sc90Var;
        this.f159025b = sc90Var2;
    }

    @Override // p149l.sc90
    /* JADX INFO: renamed from: b */
    public void mo8485b(uz5<jze> uz5Var, uc90 uc90Var) {
        this.f159024a.mo8485b(new C19684a(uz5Var, uc90Var), uc90Var);
    }
}
