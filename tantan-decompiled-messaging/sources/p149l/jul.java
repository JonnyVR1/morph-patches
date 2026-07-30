package p149l;

import java.io.File;
import java.util.Iterator;

/* JADX INFO: loaded from: classes13.dex */
public abstract class jul {

    /* JADX INFO: renamed from: a */
    public int f119793a = 0;

    /* JADX INFO: renamed from: b */
    public final oxv f119794b = new qxv();

    /* JADX INFO: renamed from: c */
    public hkh0 f119795c;

    /* JADX INFO: renamed from: d */
    public String f119796d;

    /* JADX INFO: renamed from: e */
    public final String f119797e;

    /* JADX INFO: renamed from: f */
    public long f119798f;

    public jul(hkh0 hkh0Var) {
        this.f119795c = hkh0Var;
        String str = hkh0Var.m131520n() ? ".txt" : ".trace";
        this.f119797e = str;
        this.f119796d = mo116913d() + "_" + System.currentTimeMillis() + str;
        this.f119798f = System.currentTimeMillis();
    }

    /* JADX INFO: renamed from: b */
    public final boolean m143331b() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - this.f119798f >= 10000) {
            this.f119798f = jCurrentTimeMillis;
            if (qhi.m174548i(new File(fkh0.m121855a() + File.separator + this.f119796d)) >= fkh0.m121856b()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: c */
    public nwv m143332c(nwv nwvVar) {
        Iterator<wri0> it = this.f119795c.m131508b().iterator();
        while (it.hasNext()) {
            it.next().mo127713a(nwvVar);
        }
        return nwvVar;
    }

    /* JADX INFO: renamed from: d */
    public abstract String mo116913d();

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m143333e(String str) {
        synchronized (this.f119794b) {
            try {
                if (this.f119793a >= this.f119795c.m131516j() || m143331b()) {
                    this.f119794b.mo166599a(this.f119796d);
                    gkh0.m126625h();
                    this.f119796d = System.currentTimeMillis() + this.f119797e;
                    this.f119793a = 0;
                }
                this.f119794b.write(this.f119796d, str);
                this.f119793a++;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public void m143334f(final String str) {
        Runnable runnable = new Runnable() { // from class: l.iul
            @Override // java.lang.Runnable
            public final void run() {
                this.f115029a.m143333e(str);
            }
        };
        if (fkh0.m121860f() == null) {
            n21.m157541b(runnable);
        } else {
            fkh0.m121860f().execute(runnable);
        }
    }
}
