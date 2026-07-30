package p009l;

import android.text.TextUtils;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.ConvReportData;
import com.p1.mobile.putong.core.data.Conversation;
import com.p1.mobile.putong.core.data.CoreData;
import com.p1.mobile.putong.data.DbLinks;
import com.p1.mobile.putong.data.Envelope;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.CrashHelper;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;
import l.d30;
import l.du2;
import l.f8c;
import l.hpd0;
import l.qib0;
import l.uqd0;
import l.ura;
import l.vwb;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class wf6 {

    /* JADX INFO: renamed from: a */
    public static ExecutorService f22077a = Executors.newSingleThreadExecutor();

    /* JADX INFO: renamed from: b */
    public static int f22078b = 0;

    /* JADX INFO: renamed from: c */
    public static hpd0 f22079c;

    /* JADX INFO: renamed from: d */
    public static hpd0 f22080d;

    /* JADX INFO: renamed from: e */
    public static AtomicInteger f22081e;

    /* JADX INFO: renamed from: f */
    public static long[] f22082f;

    /* JADX INFO: renamed from: g */
    public static uqd0 f22083g;

    /* JADX INFO: renamed from: h */
    public static ConvReportData f22084h;

    /* JADX INFO: renamed from: l.wf6$a */
    public static class RunnableC1291a implements Runnable {

        /* JADX INFO: renamed from: a */
        public DbLinks f22085a;

        /* JADX INFO: renamed from: b */
        public Envelope f22086b;

        /* JADX INFO: renamed from: c */
        public int f22087c;

        /* JADX INFO: renamed from: d */
        public int f22088d;

        /* JADX INFO: renamed from: e */
        public String f22089e = qib0.c0.userId();

        public RunnableC1291a(DbLinks dbLinks, Envelope envelope, int i) {
            this.f22088d = 0;
            this.f22085a = dbLinks.clone();
            this.f22086b = envelope;
            this.f22087c = i;
            this.f22088d = wf6.f22081e.get();
            du2.a("loadSpeedOpt", "init action: " + this.f22087c + " | " + this.f22088d + " | " + this.f22089e);
        }

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ void m24200b() {
            du2.a("loadSpeedOpt", "db trans run: " + this.f22087c + " | " + this.f22088d + " | " + this.f22089e + " | " + qib0.c0.userId() + " | " + wf6.f22081e.get());
            if (this.f22088d == wf6.f22081e.get() && !TextUtils.isEmpty(qib0.c0.userId()) && qib0.c0.userId().equals(this.f22089e) && f8c.o().q() != null) {
                qib0.k0.c.upsert(this.f22085a);
                CoreModule.c.f0.tf(this.f22086b);
                CoreModule.c.f0.zq(this.f22086b.getModuleData(CoreData.class).conversations);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            du2.a("loadSpeedOpt", "do action: " + this.f22087c + " | " + this.f22088d + " | " + this.f22089e + " | " + qib0.c0.userId() + " | " + wf6.f22081e.get());
            try {
                if (this.f22088d == wf6.f22081e.get() && !TextUtils.isEmpty(qib0.c0.userId()) && qib0.c0.userId().equals(this.f22089e)) {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    CoreModule.c.w3(this.f22086b, new d30() { // from class: l.vf6
                        public final void call() {
                            this.f21561a.m24200b();
                        }
                    });
                    wf6.f22082f[this.f22087c % 3] = System.currentTimeMillis() - jCurrentTimeMillis;
                    du2.a("loadSpeedOpt", "db trans finish: " + this.f22087c + " | " + this.f22088d + " | " + this.f22089e + " | " + qib0.c0.userId() + " | " + wf6.f22081e.get());
                }
            } catch (Exception e) {
                du2.a("loadSpeedOpt", "db trans error: " + this.f22087c + " | " + this.f22088d + " | " + this.f22089e + " | " + qib0.c0.userId() + " | " + wf6.f22081e.get());
                CrashHelper.c(e);
            }
        }
    }

    static {
        Boolean bool = Boolean.FALSE;
        f22079c = new hpd0("user_opt_load_conversation", bool);
        f22080d = new hpd0("user_local_sync_conversation", bool);
        f22081e = new AtomicInteger(0);
        f22082f = new long[]{150, 150, 150};
        f22083g = new uqd0("conv_request_track_list", "");
    }

    /* JADX INFO: renamed from: b */
    public static void m24190b(Envelope envelope, String str, boolean z) {
        if (m24194f()) {
            if (f22084h == null) {
                f22084h = ConvReportData.new_();
                String str2 = (String) f22083g.get();
                if (!TextUtils.isEmpty(str2)) {
                    try {
                        f22084h = (ConvReportData) ConvReportData.JSON_ADAPTER.parse(str2);
                    } catch (Exception e) {
                        CrashHelper.c(e);
                    }
                }
            }
            if (f22084h.requestCount >= 200) {
                return;
            }
            StringBuilder sb = new StringBuilder("index:");
            sb.append(f22084h.requestCount);
            sb.append("|localTime");
            sb.append(mqi0.m18550o());
            sb.append("|url:");
            sb.append(str);
            sb.append("|type:");
            sb.append(z ? "all" : "new");
            sb.append("|ids:");
            List list = envelope.getModuleData(CoreData.class).conversations;
            if (!vwb.J(list)) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    sb.append(((DbObject) ((Conversation) it.next())).id);
                    sb.append(",");
                }
            }
            f22084h.requestList.add(sb.toString());
            ConvReportData convReportData = f22084h;
            convReportData.requestCount++;
            f22083g.put(convReportData.toJson());
        }
    }

    /* JADX INFO: renamed from: c */
    public static String m24191c() {
        return (String) f22083g.get();
    }

    /* JADX INFO: renamed from: d */
    public static void m24192d(DbLinks dbLinks, Envelope envelope) {
        f22078b++;
        f22077a.submit(new RunnableC1291a(dbLinks.clone(), envelope, f22078b));
    }

    /* JADX INFO: renamed from: e */
    public static boolean m24193e() {
        return ura.e().d().k8();
    }

    /* JADX INFO: renamed from: f */
    public static boolean m24194f() {
        return ura.e().d().df();
    }

    /* JADX INFO: renamed from: g */
    public static void m24195g() {
        f22078b = 0;
        f22081e.incrementAndGet();
        f22077a.shutdownNow();
        f22077a = Executors.newSingleThreadExecutor();
        f22084h = ConvReportData.new_();
        f22083g.put("");
        CoreModule.c.e0.w1.put(0L);
        CoreModule.c.e0.x1.put(0L);
        du2.a("loadSpeedOpt", "switch account " + f22081e.get());
    }

    /* JADX INFO: renamed from: h */
    public static long m24196h() {
        long[] jArr = f22082f;
        return Math.min(500L, Math.max((((jArr[0] + jArr[1]) + jArr[2]) / 3) - 150, 20L));
    }

    /* JADX INFO: renamed from: i */
    public static void m24197i(boolean z) {
        f22079c.put(Boolean.valueOf(z));
    }

    /* JADX INFO: renamed from: j */
    public static void m24198j(boolean z) {
        f22080d.put(Boolean.valueOf(z));
    }
}
