package p149l;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.json.JSONException;

/* JADX INFO: loaded from: classes13.dex */
public class mtc0 {

    /* JADX INFO: renamed from: a */
    public static ExecutorService f135569a = Executors.newSingleThreadExecutor();

    /* JADX INFO: renamed from: b */
    public static knl f135570b = uzb.m196397e();

    /* JADX INFO: renamed from: l.mtc0$a */
    public class RunnableC18551a implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ l3f f135571a;

        public RunnableC18551a(l3f l3fVar) {
            this.f135571a = l3fVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            mtc0.m156194d();
            try {
                mtc0.f135570b.mo146572c(ntc0.m161375g(this.f135571a).toString(), ntc0.m161376h(this.f135571a).toString(), this.f135571a.f125891j, "normal_logs");
            } catch (JSONException e) {
                sm80.m184942b(e);
            }
        }
    }

    /* JADX INFO: renamed from: l.mtc0$b */
    public class RunnableC18552b implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ l3f f135572a;

        public RunnableC18552b(l3f l3fVar) {
            this.f135572a = l3fVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            mtc0.m156194d();
            try {
                mtc0.f135570b.mo146572c(ntc0.m161375g(this.f135572a).toString(), ntc0.m161376h(this.f135572a).toString(), this.f135572a.f125891j, "at_once_logs");
            } catch (JSONException e) {
                sm80.m184942b(e);
            }
        }
    }

    /* JADX INFO: renamed from: l.mtc0$c */
    public class RunnableC18553c implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ l3f f135573a;

        public RunnableC18553c(l3f l3fVar) {
            this.f135573a = l3fVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            mtc0.m156194d();
            try {
                mtc0.f135570b.mo146572c(pkd0.m170021b(this.f135573a).toString(), pkd0.m170022c(this.f135573a).toString(), this.f135573a.f125891j, "sc_logs");
            } catch (JSONException e) {
                sm80.m184942b(e);
            }
        }
    }

    /* JADX INFO: renamed from: l.mtc0$d */
    public class RunnableC18554d implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Runnable f135574a;

        public RunnableC18554d(Runnable runnable) {
            this.f135574a = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f135574a.run();
            } catch (Exception e) {
                sm80.m184942b(e);
            }
        }
    }

    /* JADX INFO: renamed from: l.mtc0$e */
    public class RunnableC18555e implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Runnable f135575a;

        public RunnableC18555e(Runnable runnable) {
            this.f135575a = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f135575a.run();
            } catch (Exception e) {
                sm80.m184942b(e);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m156193c(Runnable runnable) {
        f135569a.execute(new RunnableC18555e(runnable));
    }

    /* JADX INFO: renamed from: d */
    public static void m156194d() {
        gwe0.m128399d(dwf0.m113869f().m113874e().get());
    }

    /* JADX INFO: renamed from: e */
    public static void m156195e(Runnable runnable) {
        f135569a.execute(new RunnableC18554d(runnable));
    }

    /* JADX INFO: renamed from: f */
    public static void m156196f(l3f l3fVar) {
        m156195e(new RunnableC18552b(l3fVar));
    }

    /* JADX INFO: renamed from: g */
    public static void m156197g(l3f l3fVar) {
        m156195e(new RunnableC18551a(l3fVar));
    }

    /* JADX INFO: renamed from: h */
    public static void m156198h(l3f l3fVar) {
        m156195e(new RunnableC18553c(l3fVar));
    }
}
