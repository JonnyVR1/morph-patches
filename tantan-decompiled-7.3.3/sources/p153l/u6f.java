package p153l;

import java.util.concurrent.Executor;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes7.dex */
public final class u6f {

    /* JADX INFO: renamed from: c */
    public static final Logger f177762c = Logger.getLogger(u6f.class.getName());

    /* JADX INFO: renamed from: a */
    public C20506a f177763a;

    /* JADX INFO: renamed from: b */
    public boolean f177764b;

    /* JADX INFO: renamed from: l.u6f$a */
    public static final class C20506a {

        /* JADX INFO: renamed from: a */
        public final Runnable f177765a;

        /* JADX INFO: renamed from: b */
        public final Executor f177766b;

        /* JADX INFO: renamed from: c */
        public C20506a f177767c;

        public C20506a(Runnable runnable, Executor executor, C20506a c20506a) {
            this.f177765a = runnable;
            this.f177766b = executor;
            this.f177767c = c20506a;
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m194682c(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            Logger logger = f177762c;
            Level level = Level.SEVERE;
            String strValueOf = String.valueOf(runnable);
            String strValueOf2 = String.valueOf(executor);
            StringBuilder sb = new StringBuilder(strValueOf.length() + 57 + strValueOf2.length());
            sb.append("RuntimeException while executing runnable ");
            sb.append(strValueOf);
            sb.append(" with executor ");
            sb.append(strValueOf2);
            logger.log(level, sb.toString(), (Throwable) e);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m194683a(Runnable runnable, Executor executor) {
        xn80.m212112q(runnable, "Runnable was null.");
        xn80.m212112q(executor, "Executor was null.");
        synchronized (this) {
            try {
                if (this.f177764b) {
                    m194682c(runnable, executor);
                } else {
                    this.f177763a = new C20506a(runnable, executor, this.f177763a);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public void m194684b() {
        synchronized (this) {
            try {
                if (this.f177764b) {
                    return;
                }
                this.f177764b = true;
                C20506a c20506a = this.f177763a;
                C20506a c20506a2 = null;
                this.f177763a = null;
                while (c20506a != null) {
                    C20506a c20506a3 = c20506a.f177767c;
                    c20506a.f177767c = c20506a2;
                    c20506a2 = c20506a;
                    c20506a = c20506a3;
                }
                while (c20506a2 != null) {
                    m194682c(c20506a2.f177765a, c20506a2.f177766b);
                    c20506a2 = c20506a2.f177767c;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
