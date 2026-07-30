package p149l;

import android.os.Handler;
import androidx.annotation.CheckResult;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes6.dex */
public final class fry0 {

    /* JADX INFO: renamed from: a */
    public final int f99019a;

    /* JADX INFO: renamed from: b */
    @Nullable
    public final eqy0 f99020b;

    /* JADX INFO: renamed from: c */
    public final CopyOnWriteArrayList f99021c;

    public fry0(CopyOnWriteArrayList copyOnWriteArrayList, int i, @Nullable eqy0 eqy0Var) {
        this.f99021c = copyOnWriteArrayList;
        this.f99019a = 0;
        this.f99020b = eqy0Var;
    }

    @CheckResult
    /* JADX INFO: renamed from: a */
    public final fry0 m122907a(int i, @Nullable eqy0 eqy0Var) {
        return new fry0(this.f99021c, 0, eqy0Var);
    }

    /* JADX INFO: renamed from: b */
    public final void m122908b(Handler handler, gry0 gry0Var) {
        this.f99021c.add(new mqy0(handler, gry0Var));
    }

    /* JADX INFO: renamed from: c */
    public final void m122909c(final aqy0 aqy0Var) {
        for (mqy0 mqy0Var : this.f99021c) {
            final gry0 gry0Var = mqy0Var.f135316b;
            ggw0.m126069k(mqy0Var.f135315a, new Runnable() { // from class: l.hqy0
                @Override // java.lang.Runnable
                public final void run() {
                    gry0Var.mo106378U(0, this.f109165a.f99020b, aqy0Var);
                }
            });
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m122910d(final vpy0 vpy0Var, final aqy0 aqy0Var) {
        for (mqy0 mqy0Var : this.f99021c) {
            final gry0 gry0Var = mqy0Var.f135316b;
            ggw0.m126069k(mqy0Var.f135315a, new Runnable() { // from class: l.lqy0
                @Override // java.lang.Runnable
                public final void run() {
                    gry0Var.mo106371N(0, this.f129449a.f99020b, vpy0Var, aqy0Var);
                }
            });
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m122911e(final vpy0 vpy0Var, final aqy0 aqy0Var) {
        for (mqy0 mqy0Var : this.f99021c) {
            final gry0 gry0Var = mqy0Var.f135316b;
            ggw0.m126069k(mqy0Var.f135315a, new Runnable() { // from class: l.jqy0
                @Override // java.lang.Runnable
                public final void run() {
                    gry0Var.mo106373P(0, this.f119336a.f99020b, vpy0Var, aqy0Var);
                }
            });
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m122912f(final vpy0 vpy0Var, final aqy0 aqy0Var, final IOException iOException, final boolean z) {
        for (mqy0 mqy0Var : this.f99021c) {
            final gry0 gry0Var = mqy0Var.f135316b;
            ggw0.m126069k(mqy0Var.f135315a, new Runnable() { // from class: l.kqy0
                @Override // java.lang.Runnable
                public final void run() {
                    gry0Var.mo106410w(0, this.f124309a.f99020b, vpy0Var, aqy0Var, iOException, z);
                }
            });
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m122913g(final vpy0 vpy0Var, final aqy0 aqy0Var) {
        for (mqy0 mqy0Var : this.f99021c) {
            final gry0 gry0Var = mqy0Var.f135316b;
            ggw0.m126069k(mqy0Var.f135315a, new Runnable() { // from class: l.iqy0
                @Override // java.lang.Runnable
                public final void run() {
                    gry0Var.mo106370M(0, this.f114568a.f99020b, vpy0Var, aqy0Var);
                }
            });
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m122914h(gry0 gry0Var) {
        for (mqy0 mqy0Var : this.f99021c) {
            if (mqy0Var.f135316b == gry0Var) {
                this.f99021c.remove(mqy0Var);
            }
        }
    }

    public fry0() {
        this(new CopyOnWriteArrayList(), 0, null);
    }
}
