package p149l;

import com.facebook.imagepipeline.request.ImageRequest;

/* JADX INFO: loaded from: classes.dex */
public class nze implements sc90<jze> {

    /* JADX INFO: renamed from: a */
    public final syg0<s2e> f141203a;

    /* JADX INFO: renamed from: b */
    public final dx3 f141204b;

    /* JADX INFO: renamed from: c */
    public final sc90<jze> f141205c;

    /* JADX INFO: renamed from: d */
    public final je3<cx3> f141206d;

    /* JADX INFO: renamed from: e */
    public final je3<cx3> f141207e;

    /* JADX INFO: renamed from: l.nze$a */
    public static class C18804a extends btd<jze, jze> {

        /* JADX INFO: renamed from: c */
        public final uc90 f141208c;

        /* JADX INFO: renamed from: d */
        public final syg0<s2e> f141209d;

        /* JADX INFO: renamed from: e */
        public final dx3 f141210e;

        /* JADX INFO: renamed from: f */
        public final je3<cx3> f141211f;

        /* JADX INFO: renamed from: g */
        public final je3<cx3> f141212g;

        public C18804a(uz5<jze> uz5Var, uc90 uc90Var, syg0<s2e> syg0Var, dx3 dx3Var, je3<cx3> je3Var, je3<cx3> je3Var2) {
            super(uz5Var);
            this.f141208c = uc90Var;
            this.f141209d = syg0Var;
            this.f141210e = dx3Var;
            this.f141211f = je3Var;
            this.f141212g = je3Var2;
        }

        @Override // p149l.ci2
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public void mo8523h(jze jzeVar, int i) {
            boolean zM162852d;
            try {
                if (o6j.m162852d()) {
                    o6j.m162850a("EncodedProbeProducer#onNewResultImpl");
                }
                if (!ci2.m107029e(i) && jzeVar != null && !ci2.m107031l(i, 10) && jzeVar.m143898F() != egm.f90961c) {
                    ImageRequest imageRequestMo155873t = this.f141208c.mo155873t();
                    cx3 cx3VarMo113968b = this.f141210e.mo113968b(imageRequestMo155873t, this.f141208c.mo155867k());
                    this.f141211f.m141099a(cx3VarMo113968b);
                    if ("memory_encoded".equals(this.f141208c.mo155863e("origin"))) {
                        if (!this.f141212g.m141100b(cx3VarMo113968b)) {
                            boolean z = imageRequestMo155873t.m8566d() == ImageRequest.CacheChoice.SMALL;
                            s2e s2eVar = this.f141209d.get();
                            (z ? s2eVar.mo94680b() : s2eVar.mo94681c()).m214604e(cx3VarMo113968b);
                            this.f141212g.m141099a(cx3VarMo113968b);
                        }
                    } else if ("disk".equals(this.f141208c.mo155863e("origin"))) {
                        this.f141212g.m141099a(cx3VarMo113968b);
                    }
                    m103812o().mo107035b(jzeVar, i);
                    if (zM162852d) {
                        return;
                    } else {
                        return;
                    }
                }
                m103812o().mo107035b(jzeVar, i);
            } finally {
                if (o6j.m162852d()) {
                    o6j.m162851b();
                }
            }
        }
    }

    public nze(syg0<s2e> syg0Var, dx3 dx3Var, je3 je3Var, je3 je3Var2, sc90<jze> sc90Var) {
        this.f141203a = syg0Var;
        this.f141204b = dx3Var;
        this.f141206d = je3Var;
        this.f141207e = je3Var2;
        this.f141205c = sc90Var;
    }

    @Override // p149l.sc90
    /* JADX INFO: renamed from: b */
    public void mo8485b(uz5<jze> uz5Var, uc90 uc90Var) {
        try {
            if (o6j.m162852d()) {
                o6j.m162850a("EncodedProbeProducer#produceResults");
            }
            yc90 yc90VarMo155870n = uc90Var.mo155870n();
            yc90VarMo155870n.mo104754d(uc90Var, m162036c());
            C18804a c18804a = new C18804a(uz5Var, uc90Var, this.f141203a, this.f141204b, this.f141206d, this.f141207e);
            yc90VarMo155870n.mo104756f(uc90Var, "EncodedProbeProducer", null);
            if (o6j.m162852d()) {
                o6j.m162850a("mInputProducer.produceResult");
            }
            this.f141205c.mo8485b(c18804a, uc90Var);
            if (o6j.m162852d()) {
                o6j.m162851b();
            }
        } finally {
            if (o6j.m162852d()) {
                o6j.m162851b();
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public String m162036c() {
        return "EncodedProbeProducer";
    }
}
