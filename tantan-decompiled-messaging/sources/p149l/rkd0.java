package p149l;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes13.dex */
public class rkd0 {

    /* JADX INFO: renamed from: a */
    public static final String f159815a = "l.rkd0";

    /* JADX INFO: renamed from: b */
    public static ExecutorService f159816b = Executors.newSingleThreadExecutor();

    /* JADX INFO: renamed from: c */
    public static knl f159817c = uzb.m196397e();

    /* JADX INFO: renamed from: d */
    public static List<Future> f159818d = new ArrayList();

    /* JADX INFO: renamed from: e */
    public static long f159819e = 500;

    /* JADX INFO: renamed from: l.rkd0$a */
    public class RunnableC19722a implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f159820a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f159821b;

        public RunnableC19722a(String str, int i) {
            this.f159820a = str;
            this.f159821b = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            rkd0.m179726o(this.f159820a, this.f159821b);
        }
    }

    /* JADX INFO: renamed from: l.rkd0$b */
    public class RunnableC19723b implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f159822a;

        public RunnableC19723b(int i) {
            this.f159822a = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            List<r3f> listMo146570a = rkd0.f159817c.mo146570a("sc_logs", this.f159822a);
            if (td5.m188065a(listMo146570a)) {
                rkd0.m179723l();
                return;
            }
            if (!auj0.m98996b("https://sc-report.tantanapp.com/v1/online/android", auj0.m98995a(listMo146570a), listMo146570a.size())) {
                sm80.m184941a(rkd0.f159815a, "sc test network upload fail");
                rkd0.m179722k();
            } else {
                sm80.m184941a(rkd0.f159815a, "sc test network upload success");
                rkd0.f159817c.mo146573d(listMo146570a, "sc_logs");
                rkd0.m179723l();
            }
        }
    }

    /* JADX INFO: renamed from: l.rkd0$c */
    public class RunnableC19724c implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Runnable f159823a;

        public RunnableC19724c(Runnable runnable) {
            this.f159823a = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f159823a.run();
            } catch (Exception e) {
                sm80.m184942b(e);
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public static Runnable m179717f(String str, int i) {
        return new RunnableC19722a(str, i);
    }

    /* JADX INFO: renamed from: g */
    public static Runnable m179718g(int i) {
        return new RunnableC19723b(i);
    }

    /* JADX INFO: renamed from: h */
    public static void m179719h() {
        o11.m162220b();
        Iterator<Future> it = f159818d.iterator();
        while (it.hasNext()) {
            if (it.next().isDone()) {
                it.remove();
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public static void m179720i(Runnable runnable) {
        f159818d.add(f159816b.submit(new RunnableC19724c(runnable)));
    }

    /* JADX INFO: renamed from: j */
    public static void m179721j() {
        o11.m162220b();
        long j = f159819e;
        if (j >= 32000) {
            m179723l();
            return;
        }
        f159819e = j * 2;
        m179724m();
        m179720i(m179718g(50));
    }

    /* JADX INFO: renamed from: k */
    public static void m179722k() {
        qkd0.m175359e().m175365i(f159819e);
    }

    /* JADX INFO: renamed from: l */
    public static void m179723l() {
        qkd0.m175359e().m175366j();
        f159819e = 500L;
    }

    /* JADX INFO: renamed from: m */
    public static void m179724m() {
        Iterator<Future> it = f159818d.iterator();
        while (it.hasNext()) {
            Future next = it.next();
            if (!next.isDone()) {
                next.cancel(false);
            }
            it.remove();
        }
    }

    /* JADX INFO: renamed from: n */
    public static void m179725n(int i) {
        o11.m162220b();
        m179720i(m179717f("sc_logs", i));
    }

    /* JADX INFO: renamed from: o */
    public static void m179726o(String str, int i) {
        int iM136333c = ii5.m136333c(f159817c, str);
        int i2 = 0;
        while (i2 <= iM136333c) {
            List<r3f> listMo146570a = f159817c.mo146570a(str, i);
            if (!td5.m188065a(listMo146570a)) {
                if (!auj0.m98996b("https://sc-report.tantanapp.com/v1/online/android", auj0.m98995a(listMo146570a), listMo146570a.size())) {
                    sm80.m184941a(f159815a, "sc upload fail");
                    m179722k();
                    return;
                } else {
                    sm80.m184941a(f159815a, "sc upload success" + str);
                    f159817c.mo146573d(listMo146570a, str);
                }
            }
            i2 += i;
        }
    }
}
