package p153l;

import java.io.File;
import java.util.Iterator;

/* JADX INFO: loaded from: classes13.dex */
public abstract class xwl {

    /* JADX INFO: renamed from: a */
    public int f196506a = 0;

    /* JADX INFO: renamed from: b */
    public final lzv f196507b = new nzv();

    /* JADX INFO: renamed from: c */
    public osh0 f196508c;

    /* JADX INFO: renamed from: d */
    public String f196509d;

    /* JADX INFO: renamed from: e */
    public final String f196510e;

    /* JADX INFO: renamed from: f */
    public long f196511f;

    public xwl(osh0 osh0Var) {
        this.f196508c = osh0Var;
        String str = osh0Var.m169004n() ? ".txt" : ".trace";
        this.f196510e = str;
        this.f196509d = mo144568d() + "_" + System.currentTimeMillis() + str;
        this.f196511f = System.currentTimeMillis();
    }

    /* JADX INFO: renamed from: b */
    public final boolean m213361b() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - this.f196511f >= 10000) {
            this.f196511f = jCurrentTimeMillis;
            if (nki.m163626i(new File(msh0.m159786a() + File.separator + this.f196509d)) >= msh0.m159787b()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: c */
    public nyv m213362c(nyv nyvVar) {
        Iterator<z0j0> it = this.f196508c.m168992b().iterator();
        while (it.hasNext()) {
            it.next().mo142978a(nyvVar);
        }
        return nyvVar;
    }

    /* JADX INFO: renamed from: d */
    public abstract String mo144568d();

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m213363e(String str) {
        synchronized (this.f196507b) {
            try {
                if (this.f196506a >= this.f196508c.m169000j() || m213361b()) {
                    this.f196507b.mo156499a(this.f196509d);
                    nsh0.m164606h();
                    this.f196509d = System.currentTimeMillis() + this.f196510e;
                    this.f196506a = 0;
                }
                this.f196507b.write(this.f196509d, str);
                this.f196506a++;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public void m213364f(final String str) {
        Runnable runnable = new Runnable() { // from class: l.wwl
            @Override // java.lang.Runnable
            public final void run() {
                this.f191306a.m213363e(str);
            }
        };
        if (msh0.m159791f() == null) {
            u21.m194238b(runnable);
        } else {
            msh0.m159791f().execute(runnable);
        }
    }
}
