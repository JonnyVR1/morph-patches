package p149l;

import android.os.SystemClock;
import androidx.annotation.VisibleForTesting;
import com.facebook.common.memory.PooledByteBuffer;
import java.io.InputStream;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class lb20 implements sc90<jze> {

    /* JADX INFO: renamed from: a */
    public final za80 f127265a;

    /* JADX INFO: renamed from: b */
    public final wp3 f127266b;

    /* JADX INFO: renamed from: c */
    public final mb20 f127267c;

    /* JADX INFO: renamed from: l.lb20$a */
    public class C18184a implements mb20.InterfaceC18431a {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ zei f127268a;

        public C18184a(zei zeiVar) {
            this.f127268a = zeiVar;
        }

        @Override // p149l.mb20.InterfaceC18431a
        /* JADX INFO: renamed from: a */
        public void mo149197a() {
            lb20.this.m149193k(this.f127268a);
        }

        @Override // p149l.mb20.InterfaceC18431a
        /* JADX INFO: renamed from: b */
        public void mo149198b(InputStream inputStream, int i) throws Throwable {
            if (o6j.m162852d()) {
                o6j.m162850a("NetworkFetcher->onResponse");
            }
            lb20.this.m149195m(this.f127268a, inputStream, i);
            if (o6j.m162852d()) {
                o6j.m162851b();
            }
        }

        @Override // p149l.mb20.InterfaceC18431a
        public void onFailure(Throwable th) {
            lb20.this.m149194l(this.f127268a, th);
        }
    }

    public lb20(za80 za80Var, wp3 wp3Var, mb20 mb20Var) {
        this.f127265a = za80Var;
        this.f127266b = wp3Var;
        this.f127267c = mb20Var;
    }

    /* JADX INFO: renamed from: e */
    public static float m149187e(int i, int i2) {
        return i2 > 0 ? i / i2 : 1.0f - ((float) Math.exp(((double) (-i)) / 50000.0d));
    }

    /* JADX INFO: renamed from: j */
    public static void m149188j(bb80 bb80Var, int i, wq3 wq3Var, uz5<jze> uz5Var, uc90 uc90Var) throws Throwable {
        fa5 fa5VarM120145S = fa5.m120145S(bb80Var.mo8431k());
        jze jzeVar = null;
        try {
            jze jzeVar2 = new jze((fa5<PooledByteBuffer>) fa5VarM120145S);
            try {
                jzeVar2.m143913j0(wq3Var);
                jzeVar2.m143909d0();
                uz5Var.mo107035b(jzeVar2, i);
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

    @Override // p149l.sc90
    /* JADX INFO: renamed from: b */
    public void mo8485b(uz5<jze> uz5Var, uc90 uc90Var) {
        uc90Var.mo155870n().mo104754d(uc90Var, "NetworkFetchProducer");
        zei zeiVarMo112392d = this.f127267c.mo112392d(uz5Var, uc90Var);
        this.f127267c.mo112390a(zeiVarMo112392d, new C18184a(zeiVarMo112392d));
    }

    /* JADX INFO: renamed from: f */
    public final Map<String, String> m149189f(zei zeiVar, int i) {
        if (zeiVar.m218337d().mo104759k(zeiVar.m218335b(), "NetworkFetchProducer")) {
            return this.f127267c.mo112391c(zeiVar, i);
        }
        return null;
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: g */
    public long m149190g() {
        return SystemClock.uptimeMillis();
    }

    /* JADX INFO: renamed from: h */
    public void m149191h(bb80 bb80Var, zei zeiVar) throws Throwable {
        Map<String, String> mapM149189f = m149189f(zeiVar, bb80Var.getCount());
        yc90 yc90VarM218337d = zeiVar.m218337d();
        yc90VarM218337d.mo104756f(zeiVar.m218335b(), "NetworkFetchProducer", mapM149189f);
        yc90VarM218337d.mo104755e(zeiVar.m218335b(), "NetworkFetchProducer", true);
        zeiVar.m218335b().mo155857B("network");
        m149188j(bb80Var, zeiVar.m218338e() | 1, zeiVar.m218339f(), zeiVar.m218334a(), zeiVar.m218335b());
    }

    /* JADX INFO: renamed from: i */
    public void m149192i(bb80 bb80Var, zei zeiVar) throws Throwable {
        if (m149196n(zeiVar, zeiVar.m218335b())) {
            long jM149190g = m149190g();
            if (jM149190g - zeiVar.m218336c() >= 100) {
                zeiVar.m218341h(jM149190g);
                zeiVar.m218337d().mo104758j(zeiVar.m218335b(), "NetworkFetchProducer", "intermediate_result");
                m149188j(bb80Var, zeiVar.m218338e(), zeiVar.m218339f(), zeiVar.m218334a(), zeiVar.m218335b());
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m149193k(zei zeiVar) {
        zeiVar.m218337d().mo104753a(zeiVar.m218335b(), "NetworkFetchProducer", null);
        zeiVar.m218334a().mo107034a();
    }

    /* JADX INFO: renamed from: l */
    public final void m149194l(zei zeiVar, Throwable th) {
        zeiVar.m218337d().mo104757i(zeiVar.m218335b(), "NetworkFetchProducer", th, null);
        zeiVar.m218337d().mo104755e(zeiVar.m218335b(), "NetworkFetchProducer", false);
        zeiVar.m218335b().mo155857B("network");
        zeiVar.m218334a().onFailure(th);
    }

    /* JADX INFO: renamed from: m */
    public void m149195m(zei zeiVar, InputStream inputStream, int i) throws Throwable {
        za80 za80Var = this.f127265a;
        bb80 bb80VarMo111848d = i > 0 ? za80Var.mo111848d(i) : za80Var.mo111846b();
        byte[] bArr = this.f127266b.get(16384);
        while (true) {
            try {
                int i2 = inputStream.read(bArr);
                if (i2 < 0) {
                    this.f127267c.mo112393e(zeiVar, bb80VarMo111848d.getCount());
                    m149191h(bb80VarMo111848d, zeiVar);
                    this.f127266b.release(bArr);
                    bb80VarMo111848d.close();
                    return;
                }
                if (i2 > 0) {
                    bb80VarMo111848d.write(bArr, 0, i2);
                    m149192i(bb80VarMo111848d, zeiVar);
                    zeiVar.m218334a().mo107036c(m149187e(bb80VarMo111848d.getCount(), i));
                }
            } catch (Throwable th) {
                this.f127266b.release(bArr);
                bb80VarMo111848d.close();
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public final boolean m149196n(zei zeiVar, uc90 uc90Var) {
        pwa0 progressiveJpegConfig = uc90Var.mo155869m().getProgressiveJpegConfig();
        if (progressiveJpegConfig != null && progressiveJpegConfig.mo106864c() && zeiVar.m218335b().mo155858F()) {
            return this.f127267c.mo153860b(zeiVar);
        }
        return false;
    }
}
