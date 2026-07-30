package p149l;

import android.net.Uri;
import androidx.annotation.VisibleForTesting;
import com.facebook.common.internal.ImmutableMap;
import com.facebook.common.memory.PooledByteBuffer;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public class m860 implements sc90<jze> {

    /* JADX INFO: renamed from: a */
    public final syg0<s2e> f132527a;

    /* JADX INFO: renamed from: b */
    public final dx3 f132528b;

    /* JADX INFO: renamed from: c */
    public final za80 f132529c;

    /* JADX INFO: renamed from: d */
    public final wp3 f132530d;

    /* JADX INFO: renamed from: e */
    public final sc90<jze> f132531e;

    /* JADX INFO: renamed from: l.m860$a */
    public class C18416a implements p16<jze, Void> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ yc90 f132532a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ uc90 f132533b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ uz5 f132534c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ cx3 f132535d;

        public C18416a(yc90 yc90Var, uc90 uc90Var, uz5 uz5Var, cx3 cx3Var) {
            this.f132532a = yc90Var;
            this.f132533b = uc90Var;
            this.f132534c = uz5Var;
            this.f132535d = cx3Var;
        }

        @Override // p149l.p16
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Void mo8538a(iei0<jze> iei0Var) throws Exception {
            if (m860.m153467g(iei0Var)) {
                this.f132532a.mo104753a(this.f132533b, "PartialDiskCacheProducer", null);
                this.f132534c.mo107034a();
            } else if (iei0Var.m135703n()) {
                this.f132532a.mo104757i(this.f132533b, "PartialDiskCacheProducer", iei0Var.m135699i(), null);
                m860.this.m153470i(this.f132534c, this.f132533b, this.f132535d, null);
            } else {
                jze jzeVarM135700j = iei0Var.m135700j();
                yc90 yc90Var = this.f132532a;
                if (jzeVarM135700j != null) {
                    uc90 uc90Var = this.f132533b;
                    yc90Var.mo104756f(uc90Var, "PartialDiskCacheProducer", m860.m153466f(yc90Var, uc90Var, true, jzeVarM135700j.m143902M()));
                    wq3 wq3VarM205007d = wq3.m205007d(jzeVarM135700j.m143902M() - 1);
                    jzeVarM135700j.m143913j0(wq3VarM205007d);
                    int iM143902M = jzeVarM135700j.m143902M();
                    ImageRequest imageRequestMo155873t = this.f132533b.mo155873t();
                    if (wq3VarM205007d.m205008b(imageRequestMo155873t.m8565c())) {
                        this.f132533b.mo155874u("disk", "partial");
                        this.f132532a.mo104755e(this.f132533b, "PartialDiskCacheProducer", true);
                        this.f132534c.mo107035b(jzeVarM135700j, 9);
                    } else {
                        this.f132534c.mo107035b(jzeVarM135700j, 8);
                        m860.this.m153470i(this.f132534c, new xme0(ImageRequestBuilder.m8589b(imageRequestMo155873t).m8593A(wq3.m205006c(iM143902M - 1)).m8614a(), this.f132533b), this.f132535d, jzeVarM135700j);
                    }
                } else {
                    uc90 uc90Var2 = this.f132533b;
                    yc90Var.mo104756f(uc90Var2, "PartialDiskCacheProducer", m860.m153466f(yc90Var, uc90Var2, false, 0));
                    m860.this.m153470i(this.f132534c, this.f132533b, this.f132535d, jzeVarM135700j);
                }
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: l.m860$b */
    public class C18417b extends nq2 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ AtomicBoolean f132537a;

        public C18417b(AtomicBoolean atomicBoolean) {
            this.f132537a = atomicBoolean;
        }

        @Override // p149l.nq2, p149l.vc90
        /* JADX INFO: renamed from: b */
        public void mo8497b() {
            this.f132537a.set(true);
        }
    }

    /* JADX INFO: renamed from: l.m860$c */
    public static class C18418c extends btd<jze, jze> {

        /* JADX INFO: renamed from: c */
        public final syg0<s2e> f132539c;

        /* JADX INFO: renamed from: d */
        public final cx3 f132540d;

        /* JADX INFO: renamed from: e */
        public final za80 f132541e;

        /* JADX INFO: renamed from: f */
        public final wp3 f132542f;

        /* JADX INFO: renamed from: g */
        public final jze f132543g;

        /* JADX INFO: renamed from: h */
        public final boolean f132544h;

        public C18418c(uz5<jze> uz5Var, syg0<s2e> syg0Var, cx3 cx3Var, za80 za80Var, wp3 wp3Var, jze jzeVar, boolean z) {
            super(uz5Var);
            this.f132539c = syg0Var;
            this.f132540d = cx3Var;
            this.f132541e = za80Var;
            this.f132542f = wp3Var;
            this.f132543g = jzeVar;
            this.f132544h = z;
        }

        /* JADX INFO: renamed from: p */
        public final void m153472p(InputStream inputStream, OutputStream outputStream, int i) throws IOException {
            byte[] bArr = this.f132542f.get(16384);
            int i2 = i;
            while (i2 > 0) {
                try {
                    int i3 = inputStream.read(bArr, 0, Math.min(16384, i2));
                    if (i3 < 0) {
                        break;
                    } else if (i3 > 0) {
                        outputStream.write(bArr, 0, i3);
                        i2 -= i3;
                    }
                } catch (Throwable th) {
                    this.f132542f.release(bArr);
                    throw th;
                }
            }
            this.f132542f.release(bArr);
            if (i2 <= 0) {
                return;
            }
            rhg0.m179353a(String.format(null, "Failed to read %d bytes - finished %d short", Integer.valueOf(i), Integer.valueOf(i2)));
        }

        /* JADX INFO: renamed from: q */
        public final bb80 m153473q(jze jzeVar, jze jzeVar2) throws IOException {
            int i = ((wq3) rf80.m179116g(jzeVar2.m143924u())).from;
            bb80 bb80VarMo111848d = this.f132541e.mo111848d(jzeVar2.m143902M() + i);
            m153472p(jzeVar.m143900I(), bb80VarMo111848d, i);
            m153472p(jzeVar2.m143900I(), bb80VarMo111848d, jzeVar2.m143902M());
            return bb80VarMo111848d;
        }

        @Override // p149l.ci2
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public void mo8523h(jze jzeVar, int i) {
            if (ci2.m107029e(i)) {
                return;
            }
            if (this.f132543g == null || jzeVar == null || jzeVar.m143924u() == null) {
                if (!this.f132544h || !ci2.m107032m(i, 8) || !ci2.m107028d(i) || jzeVar == null || jzeVar.m143898F() == egm.f90961c) {
                    m103812o().mo107035b(jzeVar, i);
                    return;
                } else {
                    this.f132539c.get().mo94681c().m214608i(this.f132540d, jzeVar);
                    m103812o().mo107035b(jzeVar, i);
                    return;
                }
            }
            try {
                try {
                    m153475s(m153473q(this.f132543g, jzeVar));
                } catch (IOException e) {
                    tsf.m190543i("PartialDiskCacheProducer", "Error while merging image data", e);
                    m103812o().onFailure(e);
                }
                jzeVar.close();
                this.f132543g.close();
                this.f132539c.get().mo94681c().m214610k(this.f132540d);
            } catch (Throwable th) {
                jzeVar.close();
                this.f132543g.close();
                throw th;
            }
        }

        /* JADX INFO: renamed from: s */
        public final void m153475s(bb80 bb80Var) throws Throwable {
            fa5 fa5VarM120145S = fa5.m120145S(bb80Var.mo8431k());
            jze jzeVar = null;
            try {
                jze jzeVar2 = new jze((fa5<PooledByteBuffer>) fa5VarM120145S);
                try {
                    jzeVar2.m143909d0();
                    m103812o().mo107035b(jzeVar2, 1);
                    jze.m143896n(jzeVar2);
                    fa5.m120154v(fa5VarM120145S);
                } catch (Throwable th) {
                    th = th;
                    jzeVar = jzeVar2;
                    jze.m143896n(jzeVar);
                    fa5.m120154v(fa5VarM120145S);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    public m860(syg0<s2e> syg0Var, dx3 dx3Var, za80 za80Var, wp3 wp3Var, sc90<jze> sc90Var) {
        this.f132527a = syg0Var;
        this.f132528b = dx3Var;
        this.f132529c = za80Var;
        this.f132530d = wp3Var;
        this.f132531e = sc90Var;
    }

    /* JADX INFO: renamed from: e */
    public static Uri m153465e(ImageRequest imageRequest) {
        return imageRequest.m8585w().buildUpon().appendQueryParameter("fresco_partial", "true").build();
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: f */
    public static Map<String, String> m153466f(yc90 yc90Var, uc90 uc90Var, boolean z, int i) {
        if (yc90Var.mo104759k(uc90Var, "PartialDiskCacheProducer")) {
            return z ? ImmutableMap.m8149of("cached_value_found", String.valueOf(z), "encodedImageSize", String.valueOf(i)) : ImmutableMap.m8148of("cached_value_found", String.valueOf(z));
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static boolean m153467g(iei0<?> iei0Var) {
        if (iei0Var.m135701l()) {
            return true;
        }
        return iei0Var.m135703n() && (iei0Var.m135699i() instanceof CancellationException);
    }

    /* JADX INFO: renamed from: j */
    private void m153468j(AtomicBoolean atomicBoolean, uc90 uc90Var) {
        uc90Var.mo155872q(new C18417b(atomicBoolean));
    }

    @Override // p149l.sc90
    /* JADX INFO: renamed from: b */
    public void mo8485b(uz5<jze> uz5Var, uc90 uc90Var) {
        ImageRequest imageRequestMo155873t = uc90Var.mo155873t();
        boolean zM8587z = uc90Var.mo155873t().m8587z(16);
        boolean zM8587z2 = uc90Var.mo155873t().m8587z(32);
        if (!zM8587z && !zM8587z2) {
            this.f132531e.mo8485b(uz5Var, uc90Var);
            return;
        }
        yc90 yc90VarMo155870n = uc90Var.mo155870n();
        yc90VarMo155870n.mo104754d(uc90Var, "PartialDiskCacheProducer");
        cx3 cx3VarMo113970d = this.f132528b.mo113970d(imageRequestMo155873t, m153465e(imageRequestMo155873t), uc90Var.mo155867k());
        if (!zM8587z) {
            yc90VarMo155870n.mo104756f(uc90Var, "PartialDiskCacheProducer", m153466f(yc90VarMo155870n, uc90Var, false, 0));
            m153470i(uz5Var, uc90Var, cx3VarMo113970d, null);
        } else {
            AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            this.f132527a.get().mo94681c().m214606g(cx3VarMo113970d, atomicBoolean).m135697e(m153469h(uz5Var, uc90Var, cx3VarMo113970d));
            m153468j(atomicBoolean, uc90Var);
        }
    }

    /* JADX INFO: renamed from: h */
    public final p16<jze, Void> m153469h(uz5<jze> uz5Var, uc90 uc90Var, cx3 cx3Var) {
        return new C18416a(uc90Var.mo155870n(), uc90Var, uz5Var, cx3Var);
    }

    /* JADX INFO: renamed from: i */
    public final void m153470i(uz5<jze> uz5Var, uc90 uc90Var, cx3 cx3Var, jze jzeVar) {
        this.f132531e.mo8485b(new C18418c(uz5Var, this.f132527a, cx3Var, this.f132529c, this.f132530d, jzeVar, uc90Var.mo155873t().m8587z(32)), uc90Var);
    }
}
