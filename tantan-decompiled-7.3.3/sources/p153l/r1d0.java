package p153l;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.json.JSONException;

/* JADX INFO: loaded from: classes11.dex */
public class r1d0 {

    /* JADX INFO: renamed from: a */
    public static ExecutorService f160804a = Executors.newSingleThreadExecutor();

    /* JADX INFO: renamed from: b */
    public static vpl f160805b = i1c.m138088e();

    /* JADX INFO: renamed from: l.r1d0$a */
    public class RunnableC19728a implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ q4f f160806a;

        public RunnableC19728a(q4f q4fVar) {
            this.f160806a = q4fVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            r1d0.m179401d();
            try {
                r1d0.f160805b.mo138091c(s1d0.m184032g(this.f160806a).toString(), s1d0.m184033h(this.f160806a).toString(), this.f160806a.f155572j, "normal_logs");
            } catch (JSONException e) {
                wu80.m207938b(e);
            }
        }
    }

    /* JADX INFO: renamed from: l.r1d0$b */
    public class RunnableC19729b implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ q4f f160807a;

        public RunnableC19729b(q4f q4fVar) {
            this.f160807a = q4fVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            r1d0.m179401d();
            try {
                r1d0.f160805b.mo138091c(s1d0.m184032g(this.f160807a).toString(), s1d0.m184033h(this.f160807a).toString(), this.f160807a.f155572j, "at_once_logs");
            } catch (JSONException e) {
                wu80.m207938b(e);
            }
        }
    }

    /* JADX INFO: renamed from: l.r1d0$c */
    public class RunnableC19730c implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ q4f f160808a;

        public RunnableC19730c(q4f q4fVar) {
            this.f160808a = q4fVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            r1d0.m179401d();
            try {
                r1d0.f160805b.mo138091c(ssd0.m187699b(this.f160808a).toString(), ssd0.m187700c(this.f160808a).toString(), this.f160808a.f155572j, "sc_logs");
            } catch (JSONException e) {
                wu80.m207938b(e);
            }
        }
    }

    /* JADX INFO: renamed from: l.r1d0$d */
    public class RunnableC19731d implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Runnable f160809a;

        public RunnableC19731d(Runnable runnable) {
            this.f160809a = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f160809a.run();
            } catch (Exception e) {
                wu80.m207938b(e);
            }
        }
    }

    /* JADX INFO: renamed from: l.r1d0$e */
    public class RunnableC19732e implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Runnable f160810a;

        public RunnableC19732e(Runnable runnable) {
            this.f160810a = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f160810a.run();
            } catch (Exception e) {
                wu80.m207938b(e);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m179400c(Runnable runnable) {
        f160804a.execute(new RunnableC19732e(runnable));
    }

    /* JADX INFO: renamed from: d */
    public static void m179401d() {
        n4f0.m161561d(m4g0.m157014f().m157019e().get());
    }

    /* JADX INFO: renamed from: e */
    public static void m179402e(Runnable runnable) {
        f160804a.execute(new RunnableC19731d(runnable));
    }

    /* JADX INFO: renamed from: f */
    public static void m179403f(q4f q4fVar) {
        m179402e(new RunnableC19729b(q4fVar));
    }

    /* JADX INFO: renamed from: g */
    public static void m179404g(q4f q4fVar) {
        m179402e(new RunnableC19728a(q4fVar));
    }

    /* JADX INFO: renamed from: h */
    public static void m179405h(q4f q4fVar) {
        m179402e(new RunnableC19730c(q4fVar));
    }
}
