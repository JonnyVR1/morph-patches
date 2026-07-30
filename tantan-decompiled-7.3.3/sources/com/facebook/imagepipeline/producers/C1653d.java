package com.facebook.imagepipeline.producers;

import com.facebook.common.internal.ImmutableMap;
import com.facebook.common.memory.PooledByteBuffer;
import com.facebook.common.util.TriState;
import com.facebook.imagepipeline.request.ImageRequest;
import com.immomo.momomediaext.sei.BaseSei;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import p153l.er2;
import p153l.fb5;
import p153l.fj80;
import p153l.him;
import p153l.hj80;
import p153l.ji2;
import p153l.n0f;
import p153l.ppd;
import p153l.pud;
import p153l.q3d0;
import p153l.qmd0;
import p153l.vkm;
import p153l.wk90;
import p153l.wkm;
import p153l.wn80;
import p153l.wpq;
import p153l.xkm;
import p153l.yk90;
import p153l.z06;

/* JADX INFO: renamed from: com.facebook.imagepipeline.producers.d */
/* JADX INFO: loaded from: classes.dex */
public class C1653d implements wk90<n0f> {

    /* JADX INFO: renamed from: a */
    public final Executor f6567a;

    /* JADX INFO: renamed from: b */
    public final fj80 f6568b;

    /* JADX INFO: renamed from: c */
    public final wk90<n0f> f6569c;

    /* JADX INFO: renamed from: d */
    public final boolean f6570d;

    /* JADX INFO: renamed from: e */
    public final xkm f6571e;

    /* JADX INFO: renamed from: com.facebook.imagepipeline.producers.d$a */
    public class a extends pud<n0f, n0f> {

        /* JADX INFO: renamed from: c */
        public final boolean f6572c;

        /* JADX INFO: renamed from: d */
        public final xkm f6573d;

        /* JADX INFO: renamed from: e */
        public final yk90 f6574e;

        /* JADX INFO: renamed from: f */
        public boolean f6575f;

        /* JADX INFO: renamed from: g */
        public final JobScheduler f6576g;

        /* JADX INFO: renamed from: com.facebook.imagepipeline.producers.d$a$a, reason: collision with other inner class name */
        public class C22787a implements JobScheduler.InterfaceC1646d {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ C1653d f6578a;

            public C22787a(C1653d c1653d) {
                this.f6578a = c1653d;
            }

            @Override // com.facebook.imagepipeline.producers.JobScheduler.InterfaceC1646d
            /* JADX INFO: renamed from: a */
            public void mo8534a(n0f n0fVar, int i) throws Throwable {
                a aVar = a.this;
                if (n0fVar != null) {
                    aVar.m8610v(n0fVar, i, (wkm) wn80.m207182g(aVar.f6573d.createImageTranscoder(n0fVar.m160961F(), a.this.f6572c)));
                } else {
                    aVar.m173861o().mo144954b(null, i);
                }
            }
        }

        /* JADX INFO: renamed from: com.facebook.imagepipeline.producers.d$a$b */
        public class b extends er2 {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ C1653d f6580a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ z06 f6581b;

            public b(C1653d c1653d, z06 z06Var) {
                this.f6580a = c1653d;
                this.f6581b = z06Var;
            }

            @Override // p153l.er2, p153l.zk90
            /* JADX INFO: renamed from: a */
            public void mo8584a() {
                if (a.this.f6574e.mo117665F()) {
                    a.this.f6576g.m8531h();
                }
            }

            @Override // p153l.er2, p153l.zk90
            /* JADX INFO: renamed from: b */
            public void mo8551b() {
                a.this.f6576g.m8526c();
                a.this.f6575f = true;
                this.f6581b.mo144953a();
            }
        }

        public a(z06<n0f> z06Var, yk90 yk90Var, boolean z, xkm xkmVar) {
            super(z06Var);
            this.f6575f = false;
            this.f6574e = yk90Var;
            Boolean boolM8636t = yk90Var.mo117678t().m8636t();
            this.f6572c = boolM8636t != null ? boolM8636t.booleanValue() : z;
            this.f6573d = xkmVar;
            this.f6576g = new JobScheduler(C1653d.this.f6567a, new C22787a(C1653d.this), 100);
            yk90Var.mo117677q(new b(C1653d.this, z06Var));
        }

        /* JADX INFO: renamed from: A */
        public final n0f m8608A(n0f n0fVar) {
            return (this.f6574e.mo117678t().m8637u().getDeferUntilRendered() || n0fVar.m160970V() == 0 || n0fVar.m160970V() == -1) ? n0fVar : m8612x(n0fVar, 0);
        }

        @Override // p153l.ji2
        /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
        public void mo8577h(n0f n0fVar, int i) {
            if (this.f6575f) {
                return;
            }
            boolean zM144947d = ji2.m144947d(i);
            if (n0fVar == null) {
                if (zM144947d) {
                    m173861o().mo144954b(null, 1);
                    return;
                }
                return;
            }
            him himVarM160961F = n0fVar.m160961F();
            TriState triStateM8601h = C1653d.m8601h(this.f6574e.mo117678t(), n0fVar, (wkm) wn80.m207182g(this.f6573d.createImageTranscoder(himVarM160961F, this.f6572c)));
            if (zM144947d || triStateM8601h != TriState.UNSET) {
                if (triStateM8601h != TriState.YES) {
                    m8611w(n0fVar, i, himVarM160961F);
                } else if (this.f6576g.m8533k(n0fVar, i)) {
                    if (zM144947d || this.f6574e.mo117665F()) {
                        this.f6576g.m8531h();
                    }
                }
            }
        }

        /* JADX INFO: renamed from: v */
        public final void m8610v(n0f n0fVar, int i, wkm wkmVar) throws Throwable {
            this.f6574e.mo117675n().mo110444d(this.f6574e, "ResizeAndRotateProducer");
            ImageRequest imageRequestMo117678t = this.f6574e.mo117678t();
            hj80 hj80VarMo99564b = C1653d.this.f6568b.mo99564b();
            try {
                try {
                    vkm vkmVarMo8514a = wkmVar.mo8514a(n0fVar, hj80VarMo99564b, imageRequestMo117678t.m8637u(), imageRequestMo117678t.m8635s(), null, 85, n0fVar.m160988v());
                    if (vkmVarMo8514a.getTranscodeStatus() == 2) {
                        throw new RuntimeException("Error while transcoding the image");
                    }
                    Map<String, String> mapM8613y = m8613y(n0fVar, imageRequestMo117678t.m8635s(), vkmVarMo8514a, wkmVar.getIdentifier());
                    fb5 fb5VarM124865S = fb5.m124865S(hj80VarMo99564b.mo8485k());
                    try {
                        n0f n0fVar2 = new n0f((fb5<PooledByteBuffer>) fb5VarM124865S);
                        n0fVar2.m160980n0(ppd.JPEG);
                        try {
                            n0fVar2.m160972e0();
                            this.f6574e.mo117675n().mo110446f(this.f6574e, "ResizeAndRotateProducer", mapM8613y);
                            if (vkmVarMo8514a.getTranscodeStatus() != 1) {
                                i |= 16;
                            }
                            m173861o().mo144954b(n0fVar2, i);
                            n0f.m160959n(n0fVar2);
                            fb5.m124874v(fb5VarM124865S);
                            hj80VarMo99564b.close();
                        } catch (Throwable th) {
                            n0f.m160959n(n0fVar2);
                            throw th;
                        }
                    } catch (Throwable th2) {
                        fb5.m124874v(fb5VarM124865S);
                        throw th2;
                    }
                } catch (Exception e) {
                    this.f6574e.mo117675n().mo110447i(this.f6574e, "ResizeAndRotateProducer", e, null);
                    if (ji2.m144947d(i)) {
                        m173861o().onFailure(e);
                    }
                    hj80VarMo99564b.close();
                }
            } catch (Throwable th3) {
                hj80VarMo99564b.close();
                throw th3;
            }
        }

        /* JADX INFO: renamed from: w */
        public final void m8611w(n0f n0fVar, int i, him himVar) {
            m173861o().mo144954b((himVar == ppd.JPEG || himVar == ppd.HEIF) ? m8608A(n0fVar) : m8614z(n0fVar), i);
        }

        /* JADX INFO: renamed from: x */
        public final n0f m8612x(n0f n0fVar, int i) {
            n0f n0fVarM160958m = n0f.m160958m(n0fVar);
            if (n0fVarM160958m != null) {
                n0fVarM160958m.m160981o0(i);
            }
            return n0fVarM160958m;
        }

        /* JADX INFO: renamed from: y */
        public final Map<String, String> m8613y(n0f n0fVar, q3d0 q3d0Var, vkm vkmVar, String str) {
            String str2;
            if (!this.f6574e.mo117675n().mo110449k(this.f6574e, "ResizeAndRotateProducer")) {
                return null;
            }
            String str3 = n0fVar.getWidth() + BaseSei.f14624X + n0fVar.getHeight();
            if (q3d0Var != null) {
                str2 = q3d0Var.width + BaseSei.f14624X + q3d0Var.height;
            } else {
                str2 = "Unspecified";
            }
            HashMap map = new HashMap();
            map.put("Image format", String.valueOf(n0fVar.m160961F()));
            map.put("Original size", str3);
            map.put("Requested size", str2);
            map.put("queueTime", String.valueOf(this.f6576g.m8529f()));
            map.put("Transcoder id", str);
            map.put("Transcoding result", String.valueOf(vkmVar));
            return ImmutableMap.copyOf((Map) map);
        }

        /* JADX INFO: renamed from: z */
        public final n0f m8614z(n0f n0fVar) {
            qmd0 qmd0VarM8637u = this.f6574e.mo117678t().m8637u();
            return (qmd0VarM8637u.m177104j() || !qmd0VarM8637u.m177103i()) ? n0fVar : m8612x(n0fVar, qmd0VarM8637u.m177102h());
        }
    }

    public C1653d(Executor executor, fj80 fj80Var, wk90<n0f> wk90Var, boolean z, xkm xkmVar) {
        this.f6567a = (Executor) wn80.m207182g(executor);
        this.f6568b = (fj80) wn80.m207182g(fj80Var);
        this.f6569c = (wk90) wn80.m207182g(wk90Var);
        this.f6571e = (xkm) wn80.m207182g(xkmVar);
        this.f6570d = z;
    }

    /* JADX INFO: renamed from: f */
    public static boolean m8599f(qmd0 qmd0Var, n0f n0fVar) {
        if (qmd0Var.getDeferUntilRendered()) {
            return false;
        }
        return wpq.m207481e(qmd0Var, n0fVar) != 0 || m8600g(qmd0Var, n0fVar);
    }

    /* JADX INFO: renamed from: g */
    public static boolean m8600g(qmd0 qmd0Var, n0f n0fVar) {
        if (qmd0Var.m177103i() && !qmd0Var.getDeferUntilRendered()) {
            return wpq.INVERTED_EXIF_ORIENTATIONS.contains(Integer.valueOf(n0fVar.m160989x()));
        }
        n0fVar.m160978l0(0);
        return false;
    }

    /* JADX INFO: renamed from: h */
    public static TriState m8601h(ImageRequest imageRequest, n0f n0fVar, wkm wkmVar) {
        if (n0fVar == null || n0fVar.m160961F() == him.f110036c) {
            return TriState.UNSET;
        }
        if (wkmVar.mo8516c(n0fVar.m160961F())) {
            return TriState.valueOf(m8599f(imageRequest.m8637u(), n0fVar) || wkmVar.mo8515b(n0fVar, imageRequest.m8637u(), imageRequest.m8635s()));
        }
        return TriState.NO;
    }

    @Override // p153l.wk90
    /* JADX INFO: renamed from: b */
    public void mo8539b(z06<n0f> z06Var, yk90 yk90Var) {
        this.f6569c.mo8539b(new a(z06Var, yk90Var, this.f6570d, this.f6571e), yk90Var);
    }
}
