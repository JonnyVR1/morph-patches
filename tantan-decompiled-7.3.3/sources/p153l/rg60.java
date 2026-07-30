package p153l;

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
public class rg60 implements wk90<n0f> {

    /* JADX INFO: renamed from: a */
    public final a7h0<g4e> f162964a;

    /* JADX INFO: renamed from: b */
    public final cy3 f162965b;

    /* JADX INFO: renamed from: c */
    public final fj80 f162966c;

    /* JADX INFO: renamed from: d */
    public final wq3 f162967d;

    /* JADX INFO: renamed from: e */
    public final wk90<n0f> f162968e;

    /* JADX INFO: renamed from: l.rg60$a */
    public class C19838a implements u26<n0f, Void> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ cl90 f162969a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ yk90 f162970b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ z06 f162971c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ by3 f162972d;

        public C19838a(cl90 cl90Var, yk90 yk90Var, z06 z06Var, by3 by3Var) {
            this.f162969a = cl90Var;
            this.f162970b = yk90Var;
            this.f162971c = z06Var;
            this.f162972d = by3Var;
        }

        @Override // p153l.u26
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Void mo8592a(ini0<n0f> ini0Var) throws Exception {
            if (rg60.m181392g(ini0Var)) {
                this.f162969a.mo110443a(this.f162970b, "PartialDiskCacheProducer", null);
                this.f162971c.mo144953a();
            } else if (ini0Var.m141145n()) {
                this.f162969a.mo110447i(this.f162970b, "PartialDiskCacheProducer", ini0Var.m141141i(), null);
                rg60.this.m181395i(this.f162971c, this.f162970b, this.f162972d, null);
            } else {
                n0f n0fVarM141142j = ini0Var.m141142j();
                cl90 cl90Var = this.f162969a;
                if (n0fVarM141142j != null) {
                    yk90 yk90Var = this.f162970b;
                    cl90Var.mo110446f(yk90Var, "PartialDiskCacheProducer", rg60.m181391f(cl90Var, yk90Var, true, n0fVarM141142j.m160965M()));
                    vr3 vr3VarM202466d = vr3.m202466d(n0fVarM141142j.m160965M() - 1);
                    n0fVarM141142j.m160977k0(vr3VarM202466d);
                    int iM160965M = n0fVarM141142j.m160965M();
                    ImageRequest imageRequestMo117678t = this.f162970b.mo117678t();
                    if (vr3VarM202466d.m202467b(imageRequestMo117678t.m8619c())) {
                        this.f162970b.mo117679u("disk", "partial");
                        this.f162969a.mo110445e(this.f162970b, "PartialDiskCacheProducer", true);
                        this.f162971c.mo144954b(n0fVarM141142j, 9);
                    } else {
                        this.f162971c.mo144954b(n0fVarM141142j, 8);
                        rg60.this.m181395i(this.f162971c, new eve0(ImageRequestBuilder.m8643b(imageRequestMo117678t).m8647A(vr3.m202465c(iM160965M - 1)).m8668a(), this.f162970b), this.f162972d, n0fVarM141142j);
                    }
                } else {
                    yk90 yk90Var2 = this.f162970b;
                    cl90Var.mo110446f(yk90Var2, "PartialDiskCacheProducer", rg60.m181391f(cl90Var, yk90Var2, false, 0));
                    rg60.this.m181395i(this.f162971c, this.f162970b, this.f162972d, n0fVarM141142j);
                }
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: l.rg60$b */
    public class C19839b extends er2 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ AtomicBoolean f162974a;

        public C19839b(AtomicBoolean atomicBoolean) {
            this.f162974a = atomicBoolean;
        }

        @Override // p153l.er2, p153l.zk90
        /* JADX INFO: renamed from: b */
        public void mo8551b() {
            this.f162974a.set(true);
        }
    }

    /* JADX INFO: renamed from: l.rg60$c */
    public static class C19840c extends pud<n0f, n0f> {

        /* JADX INFO: renamed from: c */
        public final a7h0<g4e> f162976c;

        /* JADX INFO: renamed from: d */
        public final by3 f162977d;

        /* JADX INFO: renamed from: e */
        public final fj80 f162978e;

        /* JADX INFO: renamed from: f */
        public final wq3 f162979f;

        /* JADX INFO: renamed from: g */
        public final n0f f162980g;

        /* JADX INFO: renamed from: h */
        public final boolean f162981h;

        public C19840c(z06<n0f> z06Var, a7h0<g4e> a7h0Var, by3 by3Var, fj80 fj80Var, wq3 wq3Var, n0f n0fVar, boolean z) {
            super(z06Var);
            this.f162976c = a7h0Var;
            this.f162977d = by3Var;
            this.f162978e = fj80Var;
            this.f162979f = wq3Var;
            this.f162980g = n0fVar;
            this.f162981h = z;
        }

        /* JADX INFO: renamed from: p */
        public final void m181397p(InputStream inputStream, OutputStream outputStream, int i) throws IOException {
            byte[] bArr = this.f162979f.get(16384);
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
                    this.f162979f.release(bArr);
                    throw th;
                }
            }
            this.f162979f.release(bArr);
            if (i2 <= 0) {
                return;
            }
            zpg0.m220844a(String.format(null, "Failed to read %d bytes - finished %d short", Integer.valueOf(i), Integer.valueOf(i2)));
        }

        /* JADX INFO: renamed from: q */
        public final hj80 m181398q(n0f n0fVar, n0f n0fVar2) throws IOException {
            int i = ((vr3) wn80.m207182g(n0fVar2.m160987u())).from;
            hj80 hj80VarMo99566d = this.f162978e.mo99566d(n0fVar2.m160965M() + i);
            m181397p(n0fVar.m160963I(), hj80VarMo99566d, i);
            m181397p(n0fVar2.m160963I(), hj80VarMo99566d, n0fVar2.m160965M());
            return hj80VarMo99566d;
        }

        @Override // p153l.ji2
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public void mo8577h(n0f n0fVar, int i) {
            if (ji2.m144948e(i)) {
                return;
            }
            if (this.f162980g == null || n0fVar == null || n0fVar.m160987u() == null) {
                if (!this.f162981h || !ji2.m144951m(i, 8) || !ji2.m144947d(i) || n0fVar == null || n0fVar.m160961F() == him.f110036c) {
                    m173861o().mo144954b(n0fVar, i);
                    return;
                } else {
                    this.f162976c.get().mo128867c().m158406i(this.f162977d, n0fVar);
                    m173861o().mo144954b(n0fVar, i);
                    return;
                }
            }
            try {
                try {
                    m181400s(m181398q(this.f162980g, n0fVar));
                } catch (IOException e) {
                    huf.m137181i("PartialDiskCacheProducer", "Error while merging image data", e);
                    m173861o().onFailure(e);
                }
                n0fVar.close();
                this.f162980g.close();
                this.f162976c.get().mo128867c().m158408k(this.f162977d);
            } catch (Throwable th) {
                n0fVar.close();
                this.f162980g.close();
                throw th;
            }
        }

        /* JADX INFO: renamed from: s */
        public final void m181400s(hj80 hj80Var) throws Throwable {
            fb5 fb5VarM124865S = fb5.m124865S(hj80Var.mo8485k());
            n0f n0fVar = null;
            try {
                n0f n0fVar2 = new n0f((fb5<PooledByteBuffer>) fb5VarM124865S);
                try {
                    n0fVar2.m160972e0();
                    m173861o().mo144954b(n0fVar2, 1);
                    n0f.m160959n(n0fVar2);
                    fb5.m124874v(fb5VarM124865S);
                } catch (Throwable th) {
                    th = th;
                    n0fVar = n0fVar2;
                    n0f.m160959n(n0fVar);
                    fb5.m124874v(fb5VarM124865S);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    public rg60(a7h0<g4e> a7h0Var, cy3 cy3Var, fj80 fj80Var, wq3 wq3Var, wk90<n0f> wk90Var) {
        this.f162964a = a7h0Var;
        this.f162965b = cy3Var;
        this.f162966c = fj80Var;
        this.f162967d = wq3Var;
        this.f162968e = wk90Var;
    }

    /* JADX INFO: renamed from: e */
    public static Uri m181390e(ImageRequest imageRequest) {
        return imageRequest.m8639w().buildUpon().appendQueryParameter("fresco_partial", "true").build();
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: f */
    public static Map<String, String> m181391f(cl90 cl90Var, yk90 yk90Var, boolean z, int i) {
        if (cl90Var.mo110449k(yk90Var, "PartialDiskCacheProducer")) {
            return z ? ImmutableMap.m8203of("cached_value_found", String.valueOf(z), "encodedImageSize", String.valueOf(i)) : ImmutableMap.m8202of("cached_value_found", String.valueOf(z));
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static boolean m181392g(ini0<?> ini0Var) {
        if (ini0Var.m141143l()) {
            return true;
        }
        return ini0Var.m141145n() && (ini0Var.m141141i() instanceof CancellationException);
    }

    /* JADX INFO: renamed from: j */
    private void m181393j(AtomicBoolean atomicBoolean, yk90 yk90Var) {
        yk90Var.mo117677q(new C19839b(atomicBoolean));
    }

    @Override // p153l.wk90
    /* JADX INFO: renamed from: b */
    public void mo8539b(z06<n0f> z06Var, yk90 yk90Var) {
        ImageRequest imageRequestMo117678t = yk90Var.mo117678t();
        boolean zM8641z = yk90Var.mo117678t().m8641z(16);
        boolean zM8641z2 = yk90Var.mo117678t().m8641z(32);
        if (!zM8641z && !zM8641z2) {
            this.f162968e.mo8539b(z06Var, yk90Var);
            return;
        }
        cl90 cl90VarMo117675n = yk90Var.mo117675n();
        cl90VarMo117675n.mo110444d(yk90Var, "PartialDiskCacheProducer");
        by3 by3VarMo113095d = this.f162965b.mo113095d(imageRequestMo117678t, m181390e(imageRequestMo117678t), yk90Var.mo117672k());
        if (!zM8641z) {
            cl90VarMo117675n.mo110446f(yk90Var, "PartialDiskCacheProducer", m181391f(cl90VarMo117675n, yk90Var, false, 0));
            m181395i(z06Var, yk90Var, by3VarMo113095d, null);
        } else {
            AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            this.f162964a.get().mo128867c().m158404g(by3VarMo113095d, atomicBoolean).m141139e(m181394h(z06Var, yk90Var, by3VarMo113095d));
            m181393j(atomicBoolean, yk90Var);
        }
    }

    /* JADX INFO: renamed from: h */
    public final u26<n0f, Void> m181394h(z06<n0f> z06Var, yk90 yk90Var, by3 by3Var) {
        return new C19838a(yk90Var.mo117675n(), yk90Var, z06Var, by3Var);
    }

    /* JADX INFO: renamed from: i */
    public final void m181395i(z06<n0f> z06Var, yk90 yk90Var, by3 by3Var, n0f n0fVar) {
        this.f162968e.mo8539b(new C19840c(z06Var, this.f162964a, by3Var, this.f162966c, this.f162967d, n0fVar, yk90Var.mo117678t().m8641z(32)), yk90Var);
    }
}
