package p149l;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes13.dex */
public class oy50 {

    /* JADX INFO: renamed from: a */
    public static final String f146279a = "l.oy50";

    /* JADX INFO: renamed from: b */
    public static ExecutorService f146280b = Executors.newSingleThreadExecutor();

    /* JADX INFO: renamed from: c */
    public static ExecutorService f146281c = Executors.newSingleThreadExecutor();

    /* JADX INFO: renamed from: d */
    public static knl f146282d = uzb.m196397e();

    /* JADX INFO: renamed from: e */
    public static List<Future> f146283e = new ArrayList();

    /* JADX INFO: renamed from: f */
    public static long f146284f = 500;

    /* JADX INFO: renamed from: l.oy50$a */
    public class RunnableC19073a implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f146285a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f146286b;

        public RunnableC19073a(String str, int i) {
            this.f146285a = str;
            this.f146286b = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            oy50.m166626r(this.f146285a, this.f146286b);
        }
    }

    /* JADX INFO: renamed from: l.oy50$b */
    public class RunnableC19074b implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f146287a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f146288b;

        public RunnableC19074b(String str, int i) {
            this.f146287a = str;
            this.f146288b = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            oy50.m166626r(this.f146287a, this.f146288b);
        }
    }

    /* JADX INFO: renamed from: l.oy50$c */
    public class RunnableC19075c implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f146289a;

        public RunnableC19075c(int i) {
            this.f146289a = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            String str = "at_once_logs";
            List<r3f> listMo146570a = oy50.f146282d.mo146570a("at_once_logs", this.f146289a);
            if (td5.m188065a(listMo146570a)) {
                str = "normal_logs";
                listMo146570a = oy50.f146282d.mo146570a("normal_logs", this.f146289a);
            }
            if (td5.m188065a(listMo146570a)) {
                oy50.m166622n();
                return;
            }
            if (!auj0.m98996b("https://report.tantanapp.com/v1/online/android", auj0.m98995a(listMo146570a), listMo146570a.size())) {
                sm80.m184941a(oy50.f146279a, "test network upload fail");
                oy50.m166621m();
            } else {
                sm80.m184941a(oy50.f146279a, "test network upload success");
                oy50.f146282d.mo146573d(listMo146570a, str);
                oy50.m166622n();
            }
        }
    }

    /* JADX INFO: renamed from: l.oy50$d */
    public class RunnableC19076d implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Runnable f146290a;

        public RunnableC19076d(Runnable runnable) {
            this.f146290a = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f146290a.run();
            } catch (Exception e) {
                sm80.m184942b(e);
            }
        }
    }

    /* JADX INFO: renamed from: l.oy50$e */
    public class RunnableC19077e implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Runnable f146291a;

        public RunnableC19077e(Runnable runnable) {
            this.f146291a = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f146291a.run();
            } catch (Exception e) {
                sm80.m184942b(e);
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public static Runnable m166614f(String str, int i) {
        return new RunnableC19074b(str, i);
    }

    /* JADX INFO: renamed from: g */
    public static Runnable m166615g(String str, int i) {
        return new RunnableC19073a(str, i);
    }

    /* JADX INFO: renamed from: h */
    public static Runnable m166616h(int i) {
        return new RunnableC19075c(i);
    }

    /* JADX INFO: renamed from: i */
    public static void m166617i() {
        o11.m162221c();
        Iterator<Future> it = f146283e.iterator();
        while (it.hasNext()) {
            if (it.next().isDone()) {
                it.remove();
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public static void m166618j(Runnable runnable) {
        f146283e.add(f146281c.submit(new RunnableC19077e(runnable)));
    }

    /* JADX INFO: renamed from: k */
    public static void m166619k(Runnable runnable) {
        f146283e.add(f146280b.submit(new RunnableC19076d(runnable)));
    }

    /* JADX INFO: renamed from: l */
    public static void m166620l() {
        o11.m162221c();
        long j = f146284f;
        if (j >= 32000) {
            m166622n();
            return;
        }
        f146284f = j * 2;
        m166623o();
        m166618j(m166616h(50));
    }

    /* JADX INFO: renamed from: m */
    public static void m166621m() {
        my50.m156954e().m156960i(f146284f);
    }

    /* JADX INFO: renamed from: n */
    public static void m166622n() {
        my50.m156954e().m156961j();
        f146284f = 500L;
    }

    /* JADX INFO: renamed from: o */
    public static void m166623o() {
        Iterator<Future> it = f146283e.iterator();
        while (it.hasNext()) {
            Future next = it.next();
            if (!next.isDone()) {
                next.cancel(false);
            }
            it.remove();
        }
    }

    /* JADX INFO: renamed from: p */
    public static void m166624p(int i) {
        o11.m162221c();
        m166618j(m166614f("at_once_logs", i));
    }

    /* JADX INFO: renamed from: q */
    public static void m166625q(int i) {
        o11.m162221c();
        m166619k(m166615g("normal_logs", i));
    }

    /* JADX INFO: renamed from: r */
    public static void m166626r(String str, int i) {
        int iM136333c = ii5.m136333c(f146282d, str);
        int i2 = 0;
        while (i2 <= iM136333c) {
            List<r3f> listMo146570a = f146282d.mo146570a(str, i);
            if (!td5.m188065a(listMo146570a)) {
                if (!auj0.m98996b("https://report.tantanapp.com/v1/online/android", auj0.m98995a(listMo146570a), listMo146570a.size())) {
                    sm80.m184941a(f146279a, "upload fail");
                    m166621m();
                    return;
                } else {
                    sm80.m184941a(f146279a, "upload success" + str);
                    f146282d.mo146573d(listMo146570a, str);
                }
            }
            i2 += i;
        }
    }
}
