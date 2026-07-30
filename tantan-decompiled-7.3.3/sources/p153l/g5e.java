package p153l;

import android.os.Environment;
import android.os.StatFs;
import com.tantanapp.beatles.file.diskusage.WarningLevel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class g5e {

    /* JADX INFO: renamed from: c */
    public static boolean f102308c = false;

    /* JADX INFO: renamed from: d */
    public static long f102309d = 1024;

    /* JADX INFO: renamed from: a */
    public C17158b f102310a;

    /* JADX INFO: renamed from: b */
    public Runnable f102311b;

    /* JADX INFO: renamed from: l.g5e$a */
    public class RunnableC17157a implements Runnable {
        public RunnableC17157a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            fpp0 fpp0Var = null;
            try {
                StatFs statFs = new StatFs(Environment.getDataDirectory().getAbsolutePath());
                long availableBlocksLong = (statFs.getAvailableBlocksLong() * statFs.getBlockSizeLong()) / g5e.f102309d;
                for (fpp0 fpp0Var2 : g5e.this.f102310a.f102317e) {
                    if (availableBlocksLong <= fpp0Var2.f100213a) {
                        fpp0Var = fpp0Var2;
                        break;
                    }
                }
                if (fpp0Var != null) {
                    Iterator<f5e> it = g5e.this.f102310a.f102318f.iterator();
                    while (it.hasNext()) {
                        it.next().mo124121a(availableBlocksLong, fpp0Var.f100215c);
                    }
                }
            } catch (Exception unused) {
            }
            if (fpp0Var == null) {
                fpp0Var = fpp0.f100210e;
            }
            u21.m194239c(this, fpp0Var.f100214b);
        }
    }

    /* JADX INFO: renamed from: l.g5e$b */
    public static class C17158b {

        /* JADX INFO: renamed from: a */
        public fpp0 f102313a;

        /* JADX INFO: renamed from: b */
        public fpp0 f102314b;

        /* JADX INFO: renamed from: c */
        public fpp0 f102315c;

        /* JADX INFO: renamed from: d */
        public fpp0 f102316d;

        /* JADX INFO: renamed from: e */
        public List<fpp0> f102317e = new ArrayList();

        /* JADX INFO: renamed from: f */
        public List<f5e> f102318f = new ArrayList();

        /* JADX INFO: renamed from: a */
        public C17158b m129046a(f5e f5eVar) {
            if (f5eVar != null) {
                this.f102318f.add(f5eVar);
            }
            return this;
        }

        /* JADX INFO: renamed from: b */
        public g5e m129047b() {
            if (this.f102313a == null) {
                this.f102313a = fpp0.f100209d;
            }
            if (this.f102314b == null) {
                this.f102314b = fpp0.f100210e;
            }
            if (this.f102315c == null) {
                this.f102315c = fpp0.f100211f;
            }
            if (this.f102316d == null) {
                this.f102316d = fpp0.f100212g;
            }
            this.f102317e.add(this.f102313a);
            this.f102317e.add(this.f102314b);
            this.f102317e.add(this.f102315c);
            this.f102317e.add(this.f102316d);
            Collections.sort(this.f102317e);
            return new g5e(this, null);
        }

        /* JADX INFO: renamed from: c */
        public C17158b m129048c(long j, long j2) {
            this.f102316d = new fpp0(j, j2, WarningLevel.URGENT_ALERT);
            return this;
        }
    }

    public g5e(C17158b c17158b) {
        this.f102311b = new RunnableC17157a();
        this.f102310a = c17158b;
    }

    /* JADX INFO: renamed from: c */
    public void m129045c() {
        if (f102308c) {
            return;
        }
        u21.m194238b(this.f102311b);
        f102308c = true;
    }

    public /* synthetic */ g5e(C17158b c17158b, RunnableC17157a runnableC17157a) {
        this(c17158b);
    }
}
