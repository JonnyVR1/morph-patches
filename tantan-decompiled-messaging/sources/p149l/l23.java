package p149l;

import com.facebook.common.memory.PooledByteBuffer;
import com.facebook.imagepipeline.request.ImageRequest;

/* JADX INFO: loaded from: classes.dex */
public class l23 implements sc90<fa5<da5>> {

    /* JADX INFO: renamed from: a */
    public final pgy<cx3, PooledByteBuffer> f125731a;

    /* JADX INFO: renamed from: b */
    public final syg0<s2e> f125732b;

    /* JADX INFO: renamed from: c */
    public final dx3 f125733c;

    /* JADX INFO: renamed from: d */
    public final sc90<fa5<da5>> f125734d;

    /* JADX INFO: renamed from: e */
    public final je3<cx3> f125735e;

    /* JADX INFO: renamed from: f */
    public final je3<cx3> f125736f;

    /* JADX INFO: renamed from: l.l23$a */
    public static class C18138a extends btd<fa5<da5>, fa5<da5>> {

        /* JADX INFO: renamed from: c */
        public final uc90 f125737c;

        /* JADX INFO: renamed from: d */
        public final pgy<cx3, PooledByteBuffer> f125738d;

        /* JADX INFO: renamed from: e */
        public final syg0<s2e> f125739e;

        /* JADX INFO: renamed from: f */
        public final dx3 f125740f;

        /* JADX INFO: renamed from: g */
        public final je3<cx3> f125741g;

        /* JADX INFO: renamed from: h */
        public final je3<cx3> f125742h;

        public C18138a(uz5<fa5<da5>> uz5Var, uc90 uc90Var, pgy<cx3, PooledByteBuffer> pgyVar, syg0<s2e> syg0Var, dx3 dx3Var, je3<cx3> je3Var, je3<cx3> je3Var2) {
            super(uz5Var);
            this.f125737c = uc90Var;
            this.f125738d = pgyVar;
            this.f125739e = syg0Var;
            this.f125740f = dx3Var;
            this.f125741g = je3Var;
            this.f125742h = je3Var2;
        }

        @Override // p149l.ci2
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public void mo8523h(fa5<da5> fa5Var, int i) {
            boolean zM162852d;
            try {
                if (o6j.m162852d()) {
                    o6j.m162850a("BitmapProbeProducer#onNewResultImpl");
                }
                if (!ci2.m107029e(i) && fa5Var != null && !ci2.m107031l(i, 8)) {
                    ImageRequest imageRequestMo155873t = this.f125737c.mo155873t();
                    cx3 cx3VarMo113968b = this.f125740f.mo113968b(imageRequestMo155873t, this.f125737c.mo155867k());
                    String str = (String) this.f125737c.mo155863e("origin");
                    if (str != null && str.equals("memory_bitmap")) {
                        if (this.f125737c.mo155869m().getExperiments().getIsEncodedMemoryCacheProbingEnabled() && !this.f125741g.m141100b(cx3VarMo113968b)) {
                            this.f125738d.mo101591a(cx3VarMo113968b);
                            this.f125741g.m141099a(cx3VarMo113968b);
                        }
                        if (this.f125737c.mo155869m().getExperiments().getIsDiskCacheProbingEnabled() && !this.f125742h.m141100b(cx3VarMo113968b)) {
                            boolean z = imageRequestMo155873t.m8566d() == ImageRequest.CacheChoice.SMALL;
                            s2e s2eVar = this.f125739e.get();
                            (z ? s2eVar.mo94680b() : s2eVar.mo94681c()).m214604e(cx3VarMo113968b);
                            this.f125742h.m141099a(cx3VarMo113968b);
                        }
                    }
                    m103812o().mo107035b(fa5Var, i);
                    if (zM162852d) {
                        return;
                    } else {
                        return;
                    }
                }
                m103812o().mo107035b(fa5Var, i);
            } finally {
                if (o6j.m162852d()) {
                    o6j.m162851b();
                }
            }
        }
    }

    public l23(pgy<cx3, PooledByteBuffer> pgyVar, syg0<s2e> syg0Var, dx3 dx3Var, je3<cx3> je3Var, je3<cx3> je3Var2, sc90<fa5<da5>> sc90Var) {
        this.f125731a = pgyVar;
        this.f125732b = syg0Var;
        this.f125733c = dx3Var;
        this.f125735e = je3Var;
        this.f125736f = je3Var2;
        this.f125734d = sc90Var;
    }

    @Override // p149l.sc90
    /* JADX INFO: renamed from: b */
    public void mo8485b(uz5<fa5<da5>> uz5Var, uc90 uc90Var) {
        try {
            if (o6j.m162852d()) {
                o6j.m162850a("BitmapProbeProducer#produceResults");
            }
            yc90 yc90VarMo155870n = uc90Var.mo155870n();
            yc90VarMo155870n.mo104754d(uc90Var, m148269c());
            C18138a c18138a = new C18138a(uz5Var, uc90Var, this.f125731a, this.f125732b, this.f125733c, this.f125735e, this.f125736f);
            yc90VarMo155870n.mo104756f(uc90Var, "BitmapProbeProducer", null);
            if (o6j.m162852d()) {
                o6j.m162850a("mInputProducer.produceResult");
            }
            this.f125734d.mo8485b(c18138a, uc90Var);
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
    public String m148269c() {
        return "BitmapProbeProducer";
    }
}
