package p149l;

import java.util.concurrent.Executor;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes7.dex */
public final class q5f {

    /* JADX INFO: renamed from: c */
    public static final Logger f152755c = Logger.getLogger(q5f.class.getName());

    /* JADX INFO: renamed from: a */
    public C19429a f152756a;

    /* JADX INFO: renamed from: b */
    public boolean f152757b;

    /* JADX INFO: renamed from: l.q5f$a */
    public static final class C19429a {

        /* JADX INFO: renamed from: a */
        public final Runnable f152758a;

        /* JADX INFO: renamed from: b */
        public final Executor f152759b;

        /* JADX INFO: renamed from: c */
        public C19429a f152760c;

        public C19429a(Runnable runnable, Executor executor, C19429a c19429a) {
            this.f152758a = runnable;
            this.f152759b = executor;
            this.f152760c = c19429a;
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m173003c(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            Logger logger = f152755c;
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
    public void m173004a(Runnable runnable, Executor executor) {
        sf80.m183895q(runnable, "Runnable was null.");
        sf80.m183895q(executor, "Executor was null.");
        synchronized (this) {
            try {
                if (this.f152757b) {
                    m173003c(runnable, executor);
                } else {
                    this.f152756a = new C19429a(runnable, executor, this.f152756a);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public void m173005b() {
        synchronized (this) {
            try {
                if (this.f152757b) {
                    return;
                }
                this.f152757b = true;
                C19429a c19429a = this.f152756a;
                C19429a c19429a2 = null;
                this.f152756a = null;
                while (c19429a != null) {
                    C19429a c19429a3 = c19429a.f152760c;
                    c19429a.f152760c = c19429a2;
                    c19429a2 = c19429a;
                    c19429a = c19429a3;
                }
                while (c19429a2 != null) {
                    m173003c(c19429a2.f152758a, c19429a2.f152759b);
                    c19429a2 = c19429a2.f152760c;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
