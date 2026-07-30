package p149l;

import android.os.Environment;
import android.os.StatFs;
import com.tantanapp.beatles.file.diskusage.WarningLevel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class s3e {

    /* JADX INFO: renamed from: c */
    public static boolean f162120c = false;

    /* JADX INFO: renamed from: d */
    public static long f162121d = 1024;

    /* JADX INFO: renamed from: a */
    public C19842b f162122a;

    /* JADX INFO: renamed from: b */
    public Runnable f162123b;

    /* JADX INFO: renamed from: l.s3e$a */
    public class RunnableC19841a implements Runnable {
        public RunnableC19841a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            bgp0 bgp0Var = null;
            try {
                StatFs statFs = new StatFs(Environment.getDataDirectory().getAbsolutePath());
                long availableBlocksLong = (statFs.getAvailableBlocksLong() * statFs.getBlockSizeLong()) / s3e.f162121d;
                for (bgp0 bgp0Var2 : s3e.this.f162122a.f162129e) {
                    if (availableBlocksLong <= bgp0Var2.f75481a) {
                        bgp0Var = bgp0Var2;
                        break;
                    }
                }
                if (bgp0Var != null) {
                    Iterator<r3e> it = s3e.this.f162122a.f162130f.iterator();
                    while (it.hasNext()) {
                        it.next().mo174861a(availableBlocksLong, bgp0Var.f75483c);
                    }
                }
            } catch (Exception unused) {
            }
            if (bgp0Var == null) {
                bgp0Var = bgp0.f75478e;
            }
            n21.m157542c(this, bgp0Var.f75482b);
        }
    }

    /* JADX INFO: renamed from: l.s3e$b */
    public static class C19842b {

        /* JADX INFO: renamed from: a */
        public bgp0 f162125a;

        /* JADX INFO: renamed from: b */
        public bgp0 f162126b;

        /* JADX INFO: renamed from: c */
        public bgp0 f162127c;

        /* JADX INFO: renamed from: d */
        public bgp0 f162128d;

        /* JADX INFO: renamed from: e */
        public List<bgp0> f162129e = new ArrayList();

        /* JADX INFO: renamed from: f */
        public List<r3e> f162130f = new ArrayList();

        /* JADX INFO: renamed from: a */
        public C19842b m182147a(r3e r3eVar) {
            if (r3eVar != null) {
                this.f162130f.add(r3eVar);
            }
            return this;
        }

        /* JADX INFO: renamed from: b */
        public s3e m182148b() {
            if (this.f162125a == null) {
                this.f162125a = bgp0.f75477d;
            }
            if (this.f162126b == null) {
                this.f162126b = bgp0.f75478e;
            }
            if (this.f162127c == null) {
                this.f162127c = bgp0.f75479f;
            }
            if (this.f162128d == null) {
                this.f162128d = bgp0.f75480g;
            }
            this.f162129e.add(this.f162125a);
            this.f162129e.add(this.f162126b);
            this.f162129e.add(this.f162127c);
            this.f162129e.add(this.f162128d);
            Collections.sort(this.f162129e);
            return new s3e(this, null);
        }

        /* JADX INFO: renamed from: c */
        public C19842b m182149c(long j, long j2) {
            this.f162128d = new bgp0(j, j2, WarningLevel.URGENT_ALERT);
            return this;
        }
    }

    public s3e(C19842b c19842b) {
        this.f162123b = new RunnableC19841a();
        this.f162122a = c19842b;
    }

    /* JADX INFO: renamed from: c */
    public void m182146c() {
        if (f162120c) {
            return;
        }
        n21.m157541b(this.f162123b);
        f162120c = true;
    }

    public /* synthetic */ s3e(C19842b c19842b, RunnableC19841a runnableC19841a) {
        this(c19842b);
    }
}
