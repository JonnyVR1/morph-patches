package p153l;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes11.dex */
public class t660 {

    /* JADX INFO: renamed from: a */
    public static final String f172294a = "l.t660";

    /* JADX INFO: renamed from: b */
    public static ExecutorService f172295b = Executors.newSingleThreadExecutor();

    /* JADX INFO: renamed from: c */
    public static ExecutorService f172296c = Executors.newSingleThreadExecutor();

    /* JADX INFO: renamed from: d */
    public static vpl f172297d = i1c.m138088e();

    /* JADX INFO: renamed from: e */
    public static List<Future> f172298e = new ArrayList();

    /* JADX INFO: renamed from: f */
    public static long f172299f = 500;

    /* JADX INFO: renamed from: l.t660$a */
    public class RunnableC20242a implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f172300a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f172301b;

        public RunnableC20242a(String str, int i) {
            this.f172300a = str;
            this.f172301b = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            t660.m189510r(this.f172300a, this.f172301b);
        }
    }

    /* JADX INFO: renamed from: l.t660$b */
    public class RunnableC20243b implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f172302a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f172303b;

        public RunnableC20243b(String str, int i) {
            this.f172302a = str;
            this.f172303b = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            t660.m189510r(this.f172302a, this.f172303b);
        }
    }

    /* JADX INFO: renamed from: l.t660$c */
    public class RunnableC20244c implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f172304a;

        public RunnableC20244c(int i) {
            this.f172304a = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            String str = "at_once_logs";
            List<v4f> listMo138089a = t660.f172297d.mo138089a("at_once_logs", this.f172304a);
            if (te5.m190683a(listMo138089a)) {
                str = "normal_logs";
                listMo138089a = t660.f172297d.mo138089a("normal_logs", this.f172304a);
            }
            if (te5.m190683a(listMo138089a)) {
                t660.m189506n();
                return;
            }
            if (!d3k0.m113834b("https://report.tantanapp.com/v1/online/android", d3k0.m113833a(listMo138089a), listMo138089a.size())) {
                wu80.m207937a(t660.f172294a, "test network upload fail");
                t660.m189505m();
            } else {
                wu80.m207937a(t660.f172294a, "test network upload success");
                t660.f172297d.mo138092d(listMo138089a, str);
                t660.m189506n();
            }
        }
    }

    /* JADX INFO: renamed from: l.t660$d */
    public class RunnableC20245d implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Runnable f172305a;

        public RunnableC20245d(Runnable runnable) {
            this.f172305a = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f172305a.run();
            } catch (Exception e) {
                wu80.m207938b(e);
            }
        }
    }

    /* JADX INFO: renamed from: l.t660$e */
    public class RunnableC20246e implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Runnable f172306a;

        public RunnableC20246e(Runnable runnable) {
            this.f172306a = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f172306a.run();
            } catch (Exception e) {
                wu80.m207938b(e);
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public static Runnable m189498f(String str, int i) {
        return new RunnableC20243b(str, i);
    }

    /* JADX INFO: renamed from: g */
    public static Runnable m189499g(String str, int i) {
        return new RunnableC20242a(str, i);
    }

    /* JADX INFO: renamed from: h */
    public static Runnable m189500h(int i) {
        return new RunnableC20244c(i);
    }

    /* JADX INFO: renamed from: i */
    public static void m189501i() {
        v11.m198967c();
        Iterator<Future> it = f172298e.iterator();
        while (it.hasNext()) {
            if (it.next().isDone()) {
                it.remove();
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public static void m189502j(Runnable runnable) {
        f172298e.add(f172296c.submit(new RunnableC20246e(runnable)));
    }

    /* JADX INFO: renamed from: k */
    public static void m189503k(Runnable runnable) {
        f172298e.add(f172295b.submit(new RunnableC20245d(runnable)));
    }

    /* JADX INFO: renamed from: l */
    public static void m189504l() {
        v11.m198967c();
        long j = f172299f;
        if (j >= 32000) {
            m189506n();
            return;
        }
        f172299f = j * 2;
        m189507o();
        m189502j(m189500h(50));
    }

    /* JADX INFO: renamed from: m */
    public static void m189505m() {
        r660.m179993e().m179999i(f172299f);
    }

    /* JADX INFO: renamed from: n */
    public static void m189506n() {
        r660.m179993e().m180000j();
        f172299f = 500L;
    }

    /* JADX INFO: renamed from: o */
    public static void m189507o() {
        Iterator<Future> it = f172298e.iterator();
        while (it.hasNext()) {
            Future next = it.next();
            if (!next.isDone()) {
                next.cancel(false);
            }
            it.remove();
        }
    }

    /* JADX INFO: renamed from: p */
    public static void m189508p(int i) {
        v11.m198967c();
        m189502j(m189498f("at_once_logs", i));
    }

    /* JADX INFO: renamed from: q */
    public static void m189509q(int i) {
        v11.m198967c();
        m189503k(m189499g("normal_logs", i));
    }

    /* JADX INFO: renamed from: r */
    public static void m189510r(String str, int i) {
        int iM145009c = jj5.m145009c(f172297d, str);
        int i2 = 0;
        while (i2 <= iM145009c) {
            List<v4f> listMo138089a = f172297d.mo138089a(str, i);
            if (!te5.m190683a(listMo138089a)) {
                if (!d3k0.m113834b("https://report.tantanapp.com/v1/online/android", d3k0.m113833a(listMo138089a), listMo138089a.size())) {
                    wu80.m207937a(f172294a, "upload fail");
                    m189505m();
                    return;
                } else {
                    wu80.m207937a(f172294a, "upload success" + str);
                    f172297d.mo138092d(listMo138089a, str);
                }
            }
            i2 += i;
        }
    }
}
