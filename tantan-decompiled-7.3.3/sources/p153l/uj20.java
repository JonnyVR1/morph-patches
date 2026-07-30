package p153l;

import android.os.SystemClock;
import androidx.annotation.VisibleForTesting;
import com.facebook.common.memory.PooledByteBuffer;
import java.io.InputStream;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class uj20 implements wk90<n0f> {

    /* JADX INFO: renamed from: a */
    public final fj80 f179173a;

    /* JADX INFO: renamed from: b */
    public final wq3 f179174b;

    /* JADX INFO: renamed from: c */
    public final vj20 f179175c;

    /* JADX INFO: renamed from: l.uj20$a */
    public class C20585a implements vj20.InterfaceC20847a {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ vhi f179176a;

        public C20585a(vhi vhiVar) {
            this.f179176a = vhiVar;
        }

        @Override // p153l.vj20.InterfaceC20847a
        /* JADX INFO: renamed from: a */
        public void mo196314a() {
            uj20.this.m196310k(this.f179176a);
        }

        @Override // p153l.vj20.InterfaceC20847a
        /* JADX INFO: renamed from: b */
        public void mo196315b(InputStream inputStream, int i) throws Throwable {
            if (i9j.m139099d()) {
                i9j.m139097a("NetworkFetcher->onResponse");
            }
            uj20.this.m196312m(this.f179176a, inputStream, i);
            if (i9j.m139099d()) {
                i9j.m139098b();
            }
        }

        @Override // p153l.vj20.InterfaceC20847a
        public void onFailure(Throwable th) {
            uj20.this.m196311l(this.f179176a, th);
        }
    }

    public uj20(fj80 fj80Var, wq3 wq3Var, vj20 vj20Var) {
        this.f179173a = fj80Var;
        this.f179174b = wq3Var;
        this.f179175c = vj20Var;
    }

    /* JADX INFO: renamed from: e */
    public static float m196304e(int i, int i2) {
        return i2 > 0 ? i / i2 : 1.0f - ((float) Math.exp(((double) (-i)) / 50000.0d));
    }

    /* JADX INFO: renamed from: j */
    public static void m196305j(hj80 hj80Var, int i, vr3 vr3Var, z06<n0f> z06Var, yk90 yk90Var) throws Throwable {
        fb5 fb5VarM124865S = fb5.m124865S(hj80Var.mo8485k());
        n0f n0fVar = null;
        try {
            n0f n0fVar2 = new n0f((fb5<PooledByteBuffer>) fb5VarM124865S);
            try {
                n0fVar2.m160977k0(vr3Var);
                n0fVar2.m160972e0();
                z06Var.mo144954b(n0fVar2, i);
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

    @Override // p153l.wk90
    /* JADX INFO: renamed from: b */
    public void mo8539b(z06<n0f> z06Var, yk90 yk90Var) {
        yk90Var.mo117675n().mo110444d(yk90Var, "NetworkFetchProducer");
        vhi vhiVarMo186972d = this.f179175c.mo186972d(z06Var, yk90Var);
        this.f179175c.mo186971a(vhiVarMo186972d, new C20585a(vhiVarMo186972d));
    }

    /* JADX INFO: renamed from: f */
    public final Map<String, String> m196306f(vhi vhiVar, int i) {
        if (vhiVar.m201292d().mo110449k(vhiVar.m201290b(), "NetworkFetchProducer")) {
            return this.f179175c.mo168785c(vhiVar, i);
        }
        return null;
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: g */
    public long m196307g() {
        return SystemClock.uptimeMillis();
    }

    /* JADX INFO: renamed from: h */
    public void m196308h(hj80 hj80Var, vhi vhiVar) throws Throwable {
        Map<String, String> mapM196306f = m196306f(vhiVar, hj80Var.getCount());
        cl90 cl90VarM201292d = vhiVar.m201292d();
        cl90VarM201292d.mo110446f(vhiVar.m201290b(), "NetworkFetchProducer", mapM196306f);
        cl90VarM201292d.mo110445e(vhiVar.m201290b(), "NetworkFetchProducer", true);
        vhiVar.m201290b().mo117664B("network");
        m196305j(hj80Var, vhiVar.m201293e() | 1, vhiVar.m201294f(), vhiVar.m201289a(), vhiVar.m201290b());
    }

    /* JADX INFO: renamed from: i */
    public void m196309i(hj80 hj80Var, vhi vhiVar) throws Throwable {
        if (m196313n(vhiVar, vhiVar.m201290b())) {
            long jM196307g = m196307g();
            if (jM196307g - vhiVar.m201291c() >= 100) {
                vhiVar.m201296h(jM196307g);
                vhiVar.m201292d().mo110448j(vhiVar.m201290b(), "NetworkFetchProducer", "intermediate_result");
                m196305j(hj80Var, vhiVar.m201293e(), vhiVar.m201294f(), vhiVar.m201289a(), vhiVar.m201290b());
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m196310k(vhi vhiVar) {
        vhiVar.m201292d().mo110443a(vhiVar.m201290b(), "NetworkFetchProducer", null);
        vhiVar.m201289a().mo144953a();
    }

    /* JADX INFO: renamed from: l */
    public final void m196311l(vhi vhiVar, Throwable th) {
        vhiVar.m201292d().mo110447i(vhiVar.m201290b(), "NetworkFetchProducer", th, null);
        vhiVar.m201292d().mo110445e(vhiVar.m201290b(), "NetworkFetchProducer", false);
        vhiVar.m201290b().mo117664B("network");
        vhiVar.m201289a().onFailure(th);
    }

    /* JADX INFO: renamed from: m */
    public void m196312m(vhi vhiVar, InputStream inputStream, int i) throws Throwable {
        fj80 fj80Var = this.f179173a;
        hj80 hj80VarMo99566d = i > 0 ? fj80Var.mo99566d(i) : fj80Var.mo99564b();
        byte[] bArr = this.f179174b.get(16384);
        while (true) {
            try {
                int i2 = inputStream.read(bArr);
                if (i2 < 0) {
                    this.f179175c.mo168786e(vhiVar, hj80VarMo99566d.getCount());
                    m196308h(hj80VarMo99566d, vhiVar);
                    this.f179174b.release(bArr);
                    hj80VarMo99566d.close();
                    return;
                }
                if (i2 > 0) {
                    hj80VarMo99566d.write(bArr, 0, i2);
                    m196309i(hj80VarMo99566d, vhiVar);
                    vhiVar.m201289a().mo144955c(m196304e(hj80VarMo99566d.getCount(), i));
                }
            } catch (Throwable th) {
                this.f179174b.release(bArr);
                hj80VarMo99566d.close();
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public final boolean m196313n(vhi vhiVar, yk90 yk90Var) {
        t4b0 progressiveJpegConfig = yk90Var.mo117674m().getProgressiveJpegConfig();
        if (progressiveJpegConfig != null && progressiveJpegConfig.mo150725c() && vhiVar.m201290b().mo117665F()) {
            return this.f179175c.mo168784b(vhiVar);
        }
        return false;
    }
}
