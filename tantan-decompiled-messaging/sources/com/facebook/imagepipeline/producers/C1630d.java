package com.facebook.imagepipeline.producers;

import com.facebook.common.internal.ImmutableMap;
import com.facebook.common.memory.PooledByteBuffer;
import com.facebook.common.util.TriState;
import com.facebook.imagepipeline.request.ImageRequest;
import com.immomo.momomediaext.sei.BaseSei;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import p149l.bb80;
import p149l.btd;
import p149l.ci2;
import p149l.egm;
import p149l.fa5;
import p149l.jze;
import p149l.kod;
import p149l.nq2;
import p149l.nvc0;
import p149l.oed0;
import p149l.rf80;
import p149l.sc90;
import p149l.sim;
import p149l.tim;
import p149l.uc90;
import p149l.uim;
import p149l.uz5;
import p149l.xnq;
import p149l.za80;

/* JADX INFO: renamed from: com.facebook.imagepipeline.producers.d */
/* JADX INFO: loaded from: classes.dex */
public class C1630d implements sc90<jze> {

    /* JADX INFO: renamed from: a */
    public final Executor f6530a;

    /* JADX INFO: renamed from: b */
    public final za80 f6531b;

    /* JADX INFO: renamed from: c */
    public final sc90<jze> f6532c;

    /* JADX INFO: renamed from: d */
    public final boolean f6533d;

    /* JADX INFO: renamed from: e */
    public final uim f6534e;

    /* JADX INFO: renamed from: com.facebook.imagepipeline.producers.d$a */
    public class a extends btd<jze, jze> {

        /* JADX INFO: renamed from: c */
        public final boolean f6535c;

        /* JADX INFO: renamed from: d */
        public final uim f6536d;

        /* JADX INFO: renamed from: e */
        public final uc90 f6537e;

        /* JADX INFO: renamed from: f */
        public boolean f6538f;

        /* JADX INFO: renamed from: g */
        public final JobScheduler f6539g;

        /* JADX INFO: renamed from: com.facebook.imagepipeline.producers.d$a$a, reason: collision with other inner class name */
        public class C22671a implements JobScheduler.InterfaceC1623d {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ C1630d f6541a;

            public C22671a(C1630d c1630d) {
                this.f6541a = c1630d;
            }

            @Override // com.facebook.imagepipeline.producers.JobScheduler.InterfaceC1623d
            /* JADX INFO: renamed from: a */
            public void mo8480a(jze jzeVar, int i) throws Throwable {
                a aVar = a.this;
                if (jzeVar != null) {
                    aVar.m8556v(jzeVar, i, (tim) rf80.m179116g(aVar.f6536d.createImageTranscoder(jzeVar.m143898F(), a.this.f6535c)));
                } else {
                    aVar.m103812o().mo107035b(null, i);
                }
            }
        }

        /* JADX INFO: renamed from: com.facebook.imagepipeline.producers.d$a$b */
        public class b extends nq2 {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ C1630d f6543a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ uz5 f6544b;

            public b(C1630d c1630d, uz5 uz5Var) {
                this.f6543a = c1630d;
                this.f6544b = uz5Var;
            }

            @Override // p149l.nq2, p149l.vc90
            /* JADX INFO: renamed from: a */
            public void mo8530a() {
                if (a.this.f6537e.mo155858F()) {
                    a.this.f6539g.m8477h();
                }
            }

            @Override // p149l.nq2, p149l.vc90
            /* JADX INFO: renamed from: b */
            public void mo8497b() {
                a.this.f6539g.m8472c();
                a.this.f6538f = true;
                this.f6544b.mo107034a();
            }
        }

        public a(uz5<jze> uz5Var, uc90 uc90Var, boolean z, uim uimVar) {
            super(uz5Var);
            this.f6538f = false;
            this.f6537e = uc90Var;
            Boolean boolM8582t = uc90Var.mo155873t().m8582t();
            this.f6535c = boolM8582t != null ? boolM8582t.booleanValue() : z;
            this.f6536d = uimVar;
            this.f6539g = new JobScheduler(C1630d.this.f6530a, new C22671a(C1630d.this), 100);
            uc90Var.mo155872q(new b(C1630d.this, uz5Var));
        }

        /* JADX INFO: renamed from: A */
        public final jze m8554A(jze jzeVar) {
            return (this.f6537e.mo155873t().m8583u().getDeferUntilRendered() || jzeVar.m143907U() == 0 || jzeVar.m143907U() == -1) ? jzeVar : m8558x(jzeVar, 0);
        }

        @Override // p149l.ci2
        /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
        public void mo8523h(jze jzeVar, int i) {
            if (this.f6538f) {
                return;
            }
            boolean zM107028d = ci2.m107028d(i);
            if (jzeVar == null) {
                if (zM107028d) {
                    m103812o().mo107035b(null, 1);
                    return;
                }
                return;
            }
            egm egmVarM143898F = jzeVar.m143898F();
            TriState triStateM8547h = C1630d.m8547h(this.f6537e.mo155873t(), jzeVar, (tim) rf80.m179116g(this.f6536d.createImageTranscoder(egmVarM143898F, this.f6535c)));
            if (zM107028d || triStateM8547h != TriState.UNSET) {
                if (triStateM8547h != TriState.YES) {
                    m8557w(jzeVar, i, egmVarM143898F);
                } else if (this.f6539g.m8479k(jzeVar, i)) {
                    if (zM107028d || this.f6537e.mo155858F()) {
                        this.f6539g.m8477h();
                    }
                }
            }
        }

        /* JADX INFO: renamed from: v */
        public final void m8556v(jze jzeVar, int i, tim timVar) throws Throwable {
            this.f6537e.mo155870n().mo104754d(this.f6537e, "ResizeAndRotateProducer");
            ImageRequest imageRequestMo155873t = this.f6537e.mo155873t();
            bb80 bb80VarMo111846b = C1630d.this.f6531b.mo111846b();
            try {
                try {
                    sim simVarMo8460a = timVar.mo8460a(jzeVar, bb80VarMo111846b, imageRequestMo155873t.m8583u(), imageRequestMo155873t.m8581s(), null, 85, jzeVar.m143925v());
                    if (simVarMo8460a.getTranscodeStatus() == 2) {
                        throw new RuntimeException("Error while transcoding the image");
                    }
                    Map<String, String> mapM8559y = m8559y(jzeVar, imageRequestMo155873t.m8581s(), simVarMo8460a, timVar.getIdentifier());
                    fa5 fa5VarM120145S = fa5.m120145S(bb80VarMo111846b.mo8431k());
                    try {
                        jze jzeVar2 = new jze((fa5<PooledByteBuffer>) fa5VarM120145S);
                        jzeVar2.m143917m0(kod.JPEG);
                        try {
                            jzeVar2.m143909d0();
                            this.f6537e.mo155870n().mo104756f(this.f6537e, "ResizeAndRotateProducer", mapM8559y);
                            if (simVarMo8460a.getTranscodeStatus() != 1) {
                                i |= 16;
                            }
                            m103812o().mo107035b(jzeVar2, i);
                            jze.m143896n(jzeVar2);
                            fa5.m120154v(fa5VarM120145S);
                            bb80VarMo111846b.close();
                        } catch (Throwable th) {
                            jze.m143896n(jzeVar2);
                            throw th;
                        }
                    } catch (Throwable th2) {
                        fa5.m120154v(fa5VarM120145S);
                        throw th2;
                    }
                } catch (Exception e) {
                    this.f6537e.mo155870n().mo104757i(this.f6537e, "ResizeAndRotateProducer", e, null);
                    if (ci2.m107028d(i)) {
                        m103812o().onFailure(e);
                    }
                    bb80VarMo111846b.close();
                }
            } catch (Throwable th3) {
                bb80VarMo111846b.close();
                throw th3;
            }
        }

        /* JADX INFO: renamed from: w */
        public final void m8557w(jze jzeVar, int i, egm egmVar) {
            m103812o().mo107035b((egmVar == kod.JPEG || egmVar == kod.HEIF) ? m8554A(jzeVar) : m8560z(jzeVar), i);
        }

        /* JADX INFO: renamed from: x */
        public final jze m8558x(jze jzeVar, int i) {
            jze jzeVarM143895m = jze.m143895m(jzeVar);
            if (jzeVarM143895m != null) {
                jzeVarM143895m.m143918n0(i);
            }
            return jzeVarM143895m;
        }

        /* JADX INFO: renamed from: y */
        public final Map<String, String> m8559y(jze jzeVar, nvc0 nvc0Var, sim simVar, String str) {
            String str2;
            if (!this.f6537e.mo155870n().mo104759k(this.f6537e, "ResizeAndRotateProducer")) {
                return null;
            }
            String str3 = jzeVar.getWidth() + BaseSei.f13930X + jzeVar.getHeight();
            if (nvc0Var != null) {
                str2 = nvc0Var.width + BaseSei.f13930X + nvc0Var.height;
            } else {
                str2 = "Unspecified";
            }
            HashMap map = new HashMap();
            map.put("Image format", String.valueOf(jzeVar.m143898F()));
            map.put("Original size", str3);
            map.put("Requested size", str2);
            map.put("queueTime", String.valueOf(this.f6539g.m8475f()));
            map.put("Transcoder id", str);
            map.put("Transcoding result", String.valueOf(simVar));
            return ImmutableMap.copyOf((Map) map);
        }

        /* JADX INFO: renamed from: z */
        public final jze m8560z(jze jzeVar) {
            oed0 oed0VarM8583u = this.f6537e.mo155873t().m8583u();
            return (oed0VarM8583u.m163946j() || !oed0VarM8583u.m163945i()) ? jzeVar : m8558x(jzeVar, oed0VarM8583u.m163944h());
        }
    }

    public C1630d(Executor executor, za80 za80Var, sc90<jze> sc90Var, boolean z, uim uimVar) {
        this.f6530a = (Executor) rf80.m179116g(executor);
        this.f6531b = (za80) rf80.m179116g(za80Var);
        this.f6532c = (sc90) rf80.m179116g(sc90Var);
        this.f6534e = (uim) rf80.m179116g(uimVar);
        this.f6533d = z;
    }

    /* JADX INFO: renamed from: f */
    public static boolean m8545f(oed0 oed0Var, jze jzeVar) {
        if (oed0Var.getDeferUntilRendered()) {
            return false;
        }
        return xnq.m210192e(oed0Var, jzeVar) != 0 || m8546g(oed0Var, jzeVar);
    }

    /* JADX INFO: renamed from: g */
    public static boolean m8546g(oed0 oed0Var, jze jzeVar) {
        if (oed0Var.m163945i() && !oed0Var.getDeferUntilRendered()) {
            return xnq.INVERTED_EXIF_ORIENTATIONS.contains(Integer.valueOf(jzeVar.m143926x()));
        }
        jzeVar.m143915k0(0);
        return false;
    }

    /* JADX INFO: renamed from: h */
    public static TriState m8547h(ImageRequest imageRequest, jze jzeVar, tim timVar) {
        if (jzeVar == null || jzeVar.m143898F() == egm.f90961c) {
            return TriState.UNSET;
        }
        if (timVar.mo8462c(jzeVar.m143898F())) {
            return TriState.valueOf(m8545f(imageRequest.m8583u(), jzeVar) || timVar.mo8461b(jzeVar, imageRequest.m8583u(), imageRequest.m8581s()));
        }
        return TriState.NO;
    }

    @Override // p149l.sc90
    /* JADX INFO: renamed from: b */
    public void mo8485b(uz5<jze> uz5Var, uc90 uc90Var) {
        this.f6532c.mo8485b(new a(uz5Var, uc90Var, this.f6533d, this.f6534e), uc90Var);
    }
}
