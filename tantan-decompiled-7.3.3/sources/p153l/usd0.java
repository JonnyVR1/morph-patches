package p153l;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes11.dex */
public class usd0 {

    /* JADX INFO: renamed from: a */
    public static final String f180765a = "l.usd0";

    /* JADX INFO: renamed from: b */
    public static ExecutorService f180766b = Executors.newSingleThreadExecutor();

    /* JADX INFO: renamed from: c */
    public static vpl f180767c = i1c.m138088e();

    /* JADX INFO: renamed from: d */
    public static List<Future> f180768d = new ArrayList();

    /* JADX INFO: renamed from: e */
    public static long f180769e = 500;

    /* JADX INFO: renamed from: l.usd0$a */
    public class RunnableC20653a implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f180770a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f180771b;

        public RunnableC20653a(String str, int i) {
            this.f180770a = str;
            this.f180771b = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            usd0.m197875o(this.f180770a, this.f180771b);
        }
    }

    /* JADX INFO: renamed from: l.usd0$b */
    public class RunnableC20654b implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f180772a;

        public RunnableC20654b(int i) {
            this.f180772a = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            List<v4f> listMo138089a = usd0.f180767c.mo138089a("sc_logs", this.f180772a);
            if (te5.m190683a(listMo138089a)) {
                usd0.m197872l();
                return;
            }
            if (!d3k0.m113834b("https://sc-report.tantanapp.com/v1/online/android", d3k0.m113833a(listMo138089a), listMo138089a.size())) {
                wu80.m207937a(usd0.f180765a, "sc test network upload fail");
                usd0.m197871k();
            } else {
                wu80.m207937a(usd0.f180765a, "sc test network upload success");
                usd0.f180767c.mo138092d(listMo138089a, "sc_logs");
                usd0.m197872l();
            }
        }
    }

    /* JADX INFO: renamed from: l.usd0$c */
    public class RunnableC20655c implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Runnable f180773a;

        public RunnableC20655c(Runnable runnable) {
            this.f180773a = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f180773a.run();
            } catch (Exception e) {
                wu80.m207938b(e);
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public static Runnable m197866f(String str, int i) {
        return new RunnableC20653a(str, i);
    }

    /* JADX INFO: renamed from: g */
    public static Runnable m197867g(int i) {
        return new RunnableC20654b(i);
    }

    /* JADX INFO: renamed from: h */
    public static void m197868h() {
        v11.m198966b();
        Iterator<Future> it = f180768d.iterator();
        while (it.hasNext()) {
            if (it.next().isDone()) {
                it.remove();
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public static void m197869i(Runnable runnable) {
        f180768d.add(f180766b.submit(new RunnableC20655c(runnable)));
    }

    /* JADX INFO: renamed from: j */
    public static void m197870j() {
        v11.m198966b();
        long j = f180769e;
        if (j >= 32000) {
            m197872l();
            return;
        }
        f180769e = j * 2;
        m197873m();
        m197869i(m197867g(50));
    }

    /* JADX INFO: renamed from: k */
    public static void m197871k() {
        tsd0.m192578e().m192584i(f180769e);
    }

    /* JADX INFO: renamed from: l */
    public static void m197872l() {
        tsd0.m192578e().m192585j();
        f180769e = 500L;
    }

    /* JADX INFO: renamed from: m */
    public static void m197873m() {
        Iterator<Future> it = f180768d.iterator();
        while (it.hasNext()) {
            Future next = it.next();
            if (!next.isDone()) {
                next.cancel(false);
            }
            it.remove();
        }
    }

    /* JADX INFO: renamed from: n */
    public static void m197874n(int i) {
        v11.m198966b();
        m197869i(m197866f("sc_logs", i));
    }

    /* JADX INFO: renamed from: o */
    public static void m197875o(String str, int i) {
        int iM145009c = jj5.m145009c(f180767c, str);
        int i2 = 0;
        while (i2 <= iM145009c) {
            List<v4f> listMo138089a = f180767c.mo138089a(str, i);
            if (!te5.m190683a(listMo138089a)) {
                if (!d3k0.m113834b("https://sc-report.tantanapp.com/v1/online/android", d3k0.m113833a(listMo138089a), listMo138089a.size())) {
                    wu80.m207937a(f180765a, "sc upload fail");
                    m197871k();
                    return;
                } else {
                    wu80.m207937a(f180765a, "sc upload success" + str);
                    f180767c.mo138092d(listMo138089a, str);
                }
            }
            i2 += i;
        }
    }
}
