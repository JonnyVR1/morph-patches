package p149l;

import android.text.TextUtils;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.ConvReportData;
import com.p046p1.mobile.putong.core.data.Conversation;
import com.p046p1.mobile.putong.core.data.CoreData;
import com.p046p1.mobile.putong.data.DbLinks;
import com.p046p1.mobile.putong.data.Envelope;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.media.ttmediautils.tinker.ShareConstants;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes11.dex */
public class wf6 {

    /* JADX INFO: renamed from: a */
    public static ExecutorService f186017a = Executors.newSingleThreadExecutor();

    /* JADX INFO: renamed from: b */
    public static int f186018b = 0;

    /* JADX INFO: renamed from: c */
    public static hpd0 f186019c;

    /* JADX INFO: renamed from: d */
    public static hpd0 f186020d;

    /* JADX INFO: renamed from: e */
    public static AtomicInteger f186021e;

    /* JADX INFO: renamed from: f */
    public static long[] f186022f;

    /* JADX INFO: renamed from: g */
    public static uqd0 f186023g;

    /* JADX INFO: renamed from: h */
    public static ConvReportData f186024h;

    /* JADX INFO: renamed from: l.wf6$a */
    public static class RunnableC20865a implements Runnable {

        /* JADX INFO: renamed from: a */
        public DbLinks f186025a;

        /* JADX INFO: renamed from: b */
        public Envelope f186026b;

        /* JADX INFO: renamed from: c */
        public int f186027c;

        /* JADX INFO: renamed from: d */
        public int f186028d;

        /* JADX INFO: renamed from: e */
        public String f186029e = qib0.f154714c0.userId();

        public RunnableC20865a(DbLinks dbLinks, Envelope envelope, int i) {
            this.f186028d = 0;
            this.f186025a = dbLinks.mo223809clone();
            this.f186026b = envelope;
            this.f186027c = i;
            this.f186028d = wf6.f186021e.get();
            du2.m113670a("loadSpeedOpt", "init action: " + this.f186027c + " | " + this.f186028d + " | " + this.f186029e);
        }

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ void m202957b() {
            du2.m113670a("loadSpeedOpt", "db trans run: " + this.f186027c + " | " + this.f186028d + " | " + this.f186029e + " | " + qib0.f154714c0.userId() + " | " + wf6.f186021e.get());
            if (this.f186028d == wf6.f186021e.get() && !TextUtils.isEmpty(qib0.f154714c0.userId()) && qib0.f154714c0.userId().equals(this.f186029e) && f8c.m119878o().m119893q() != null) {
                qib0.f154722k0.f176630c.upsert(this.f186025a);
                CoreModule.f17545c.f19642f0.m33130tf(this.f186026b);
                CoreModule.f17545c.f19642f0.m33217zq(((CoreData) this.f186026b.getModuleData(CoreData.class)).conversations);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            du2.m113670a("loadSpeedOpt", "do action: " + this.f186027c + " | " + this.f186028d + " | " + this.f186029e + " | " + qib0.f154714c0.userId() + " | " + wf6.f186021e.get());
            try {
                if (this.f186028d == wf6.f186021e.get() && !TextUtils.isEmpty(qib0.f154714c0.userId()) && qib0.f154714c0.userId().equals(this.f186029e)) {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    CoreModule.f17545c.m31492w3(this.f186026b, new d30() { // from class: l.vf6
                        @Override // p149l.d30
                        public final void call() {
                            this.f181249a.m202957b();
                        }
                    });
                    wf6.f186022f[this.f186027c % 3] = System.currentTimeMillis() - jCurrentTimeMillis;
                    du2.m113670a("loadSpeedOpt", "db trans finish: " + this.f186027c + " | " + this.f186028d + " | " + this.f186029e + " | " + qib0.f154714c0.userId() + " | " + wf6.f186021e.get());
                }
            } catch (Exception e) {
                du2.m113670a("loadSpeedOpt", "db trans error: " + this.f186027c + " | " + this.f186028d + " | " + this.f186029e + " | " + qib0.f154714c0.userId() + " | " + wf6.f186021e.get());
                CrashHelper.m81296c(e);
            }
        }
    }

    static {
        Boolean bool = Boolean.FALSE;
        f186019c = new hpd0("user_opt_load_conversation", bool);
        f186020d = new hpd0("user_local_sync_conversation", bool);
        f186021e = new AtomicInteger(0);
        f186022f = new long[]{150, 150, 150};
        f186023g = new uqd0("conv_request_track_list", "");
    }

    /* JADX INFO: renamed from: b */
    public static void m202947b(Envelope envelope, String str, boolean z) {
        if (m202951f()) {
            if (f186024h == null) {
                f186024h = ConvReportData.new_();
                String str2 = f186023g.get();
                if (!TextUtils.isEmpty(str2)) {
                    try {
                        f186024h = ConvReportData.JSON_ADAPTER.parse(str2);
                    } catch (Exception e) {
                        CrashHelper.m81296c(e);
                    }
                }
            }
            if (f186024h.requestCount >= 200) {
                return;
            }
            StringBuilder sb = new StringBuilder("index:");
            sb.append(f186024h.requestCount);
            sb.append("|localTime");
            sb.append(mqi0.m155944o());
            sb.append("|url:");
            sb.append(str);
            sb.append("|type:");
            sb.append(z ? "all" : ShareConstants.NEW_VERSION);
            sb.append("|ids:");
            List<Conversation> list = ((CoreData) envelope.getModuleData(CoreData.class)).conversations;
            if (!vwb.m200296J(list)) {
                Iterator<Conversation> it = list.iterator();
                while (it.hasNext()) {
                    sb.append(it.next().f56011id);
                    sb.append(Constants.SEPARATOR_COMMA);
                }
            }
            f186024h.requestList.add(sb.toString());
            ConvReportData convReportData = f186024h;
            convReportData.requestCount++;
            f186023g.put(convReportData.toJson());
        }
    }

    /* JADX INFO: renamed from: c */
    public static String m202948c() {
        return f186023g.get();
    }

    /* JADX INFO: renamed from: d */
    public static void m202949d(DbLinks dbLinks, Envelope envelope) {
        f186018b++;
        f186017a.submit(new RunnableC20865a(dbLinks.mo223809clone(), envelope, f186018b));
    }

    /* JADX INFO: renamed from: e */
    public static boolean m202950e() {
        return ura.m195053e().m195057d().mo33868k8();
    }

    /* JADX INFO: renamed from: f */
    public static boolean m202951f() {
        return ura.m195053e().m195057d().mo33815df();
    }

    /* JADX INFO: renamed from: g */
    public static void m202952g() {
        f186018b = 0;
        f186021e.incrementAndGet();
        f186017a.shutdownNow();
        f186017a = Executors.newSingleThreadExecutor();
        f186024h = ConvReportData.new_();
        f186023g.put("");
        CoreModule.f17545c.f19639e0.f149494w1.put(0L);
        CoreModule.f17545c.f19639e0.f149501x1.put(0L);
        du2.m113670a("loadSpeedOpt", "switch account " + f186021e.get());
    }

    /* JADX INFO: renamed from: h */
    public static long m202953h() {
        long[] jArr = f186022f;
        return Math.min(500L, Math.max((((jArr[0] + jArr[1]) + jArr[2]) / 3) - 150, 20L));
    }

    /* JADX INFO: renamed from: i */
    public static void m202954i(boolean z) {
        f186019c.put(Boolean.valueOf(z));
    }

    /* JADX INFO: renamed from: j */
    public static void m202955j(boolean z) {
        f186020d.put(Boolean.valueOf(z));
    }
}
