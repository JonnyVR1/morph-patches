package p153l;

import android.text.TextUtils;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.ConvReportData;
import com.p051p1.mobile.putong.core.data.Conversation;
import com.p051p1.mobile.putong.core.data.CoreData;
import com.p051p1.mobile.putong.data.DbLinks;
import com.p051p1.mobile.putong.data.Envelope;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.media.ttmediautils.tinker.ShareConstants;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes11.dex */
public class zg6 {

    /* JADX INFO: renamed from: a */
    public static ExecutorService f204262a = Executors.newSingleThreadExecutor();

    /* JADX INFO: renamed from: b */
    public static int f204263b = 0;

    /* JADX INFO: renamed from: c */
    public static jxd0 f204264c;

    /* JADX INFO: renamed from: d */
    public static jxd0 f204265d;

    /* JADX INFO: renamed from: e */
    public static AtomicInteger f204266e;

    /* JADX INFO: renamed from: f */
    public static long[] f204267f;

    /* JADX INFO: renamed from: g */
    public static wyd0 f204268g;

    /* JADX INFO: renamed from: h */
    public static ConvReportData f204269h;

    /* JADX INFO: renamed from: l.zg6$a */
    public static class RunnableC21803a implements Runnable {

        /* JADX INFO: renamed from: a */
        public DbLinks f204270a;

        /* JADX INFO: renamed from: b */
        public Envelope f204271b;

        /* JADX INFO: renamed from: c */
        public int f204272c;

        /* JADX INFO: renamed from: d */
        public int f204273d;

        /* JADX INFO: renamed from: e */
        public String f204274e = uqb0.f180397c0.userId();

        public RunnableC21803a(DbLinks dbLinks, Envelope envelope, int i) {
            this.f204273d = 0;
            this.f204270a = dbLinks.mo225055clone();
            this.f204271b = envelope;
            this.f204272c = i;
            this.f204273d = zg6.f204266e.get();
            tu2.m192703a("loadSpeedOpt", "init action: " + this.f204272c + " | " + this.f204273d + " | " + this.f204274e);
        }

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ void m219601b() {
            tu2.m192703a("loadSpeedOpt", "db trans run: " + this.f204272c + " | " + this.f204273d + " | " + this.f204274e + " | " + uqb0.f180397c0.userId() + " | " + zg6.f204266e.get());
            if (this.f204273d == zg6.f204266e.get() && !TextUtils.isEmpty(uqb0.f180397c0.userId()) && uqb0.f180397c0.userId().equals(this.f204274e) && l9c.m153394o().m153409q() != null) {
                uqb0.f180405k0.f184354c.upsert(this.f204270a);
                CoreModule.f18264c.f20384f0.m34133tf(this.f204271b);
                CoreModule.f18264c.f20384f0.m34220zq(((CoreData) this.f204271b.getModuleData(CoreData.class)).conversations);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            tu2.m192703a("loadSpeedOpt", "do action: " + this.f204272c + " | " + this.f204273d + " | " + this.f204274e + " | " + uqb0.f180397c0.userId() + " | " + zg6.f204266e.get());
            try {
                if (this.f204273d == zg6.f204266e.get() && !TextUtils.isEmpty(uqb0.f180397c0.userId()) && uqb0.f180397c0.userId().equals(this.f204274e)) {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    CoreModule.f18264c.m32495w3(this.f204271b, new x20() { // from class: l.yg6
                        @Override // p153l.x20
                        public final void call() {
                            this.f199733a.m219601b();
                        }
                    });
                    zg6.f204267f[this.f204272c % 3] = System.currentTimeMillis() - jCurrentTimeMillis;
                    tu2.m192703a("loadSpeedOpt", "db trans finish: " + this.f204272c + " | " + this.f204273d + " | " + this.f204274e + " | " + uqb0.f180397c0.userId() + " | " + zg6.f204266e.get());
                }
            } catch (Exception e) {
                tu2.m192703a("loadSpeedOpt", "db trans error: " + this.f204272c + " | " + this.f204273d + " | " + this.f204274e + " | " + uqb0.f180397c0.userId() + " | " + zg6.f204266e.get());
                CrashHelper.m82479c(e);
            }
        }
    }

    static {
        Boolean bool = Boolean.FALSE;
        f204264c = new jxd0("user_opt_load_conversation", bool);
        f204265d = new jxd0("user_local_sync_conversation", bool);
        f204266e = new AtomicInteger(0);
        f204267f = new long[]{150, 150, 150};
        f204268g = new wyd0("conv_request_track_list", "");
    }

    /* JADX INFO: renamed from: b */
    public static void m219591b(Envelope envelope, String str, boolean z) {
        if (m219595f()) {
            if (f204269h == null) {
                f204269h = ConvReportData.new_();
                String str2 = f204268g.get();
                if (!TextUtils.isEmpty(str2)) {
                    try {
                        f204269h = ConvReportData.JSON_ADAPTER.parse(str2);
                    } catch (Exception e) {
                        CrashHelper.m82479c(e);
                    }
                }
            }
            if (f204269h.requestCount >= 200) {
                return;
            }
            StringBuilder sb = new StringBuilder("index:");
            sb.append(f204269h.requestCount);
            sb.append("|localTime");
            sb.append(pzi0.m174454o());
            sb.append("|url:");
            sb.append(str);
            sb.append("|type:");
            sb.append(z ? "all" : ShareConstants.NEW_VERSION);
            sb.append("|ids:");
            List<Conversation> list = ((CoreData) envelope.getModuleData(CoreData.class)).conversations;
            if (!jyb.m147479J(list)) {
                Iterator<Conversation> it = list.iterator();
                while (it.hasNext()) {
                    sb.append(it.next().f56859id);
                    sb.append(Constants.SEPARATOR_COMMA);
                }
            }
            f204269h.requestList.add(sb.toString());
            ConvReportData convReportData = f204269h;
            convReportData.requestCount++;
            f204268g.put(convReportData.toJson());
        }
    }

    /* JADX INFO: renamed from: c */
    public static String m219592c() {
        return f204268g.get();
    }

    /* JADX INFO: renamed from: d */
    public static void m219593d(DbLinks dbLinks, Envelope envelope) {
        f204263b++;
        f204262a.submit(new RunnableC21803a(dbLinks.mo225055clone(), envelope, f204263b));
    }

    /* JADX INFO: renamed from: e */
    public static boolean m219594e() {
        return gta.m132210e().m132214d().mo34871k8();
    }

    /* JADX INFO: renamed from: f */
    public static boolean m219595f() {
        return gta.m132210e().m132214d().mo34818df();
    }

    /* JADX INFO: renamed from: g */
    public static void m219596g() {
        f204263b = 0;
        f204266e.incrementAndGet();
        f204262a.shutdownNow();
        f204262a = Executors.newSingleThreadExecutor();
        f204269h = ConvReportData.new_();
        f204268g.put("");
        CoreModule.f18264c.f20381e0.f89351w1.put(0L);
        CoreModule.f18264c.f20381e0.f89358x1.put(0L);
        tu2.m192703a("loadSpeedOpt", "switch account " + f204266e.get());
    }

    /* JADX INFO: renamed from: h */
    public static long m219597h() {
        long[] jArr = f204267f;
        return Math.min(500L, Math.max((((jArr[0] + jArr[1]) + jArr[2]) / 3) - 150, 20L));
    }

    /* JADX INFO: renamed from: i */
    public static void m219598i(boolean z) {
        f204264c.put(Boolean.valueOf(z));
    }

    /* JADX INFO: renamed from: j */
    public static void m219599j(boolean z) {
        f204265d.put(Boolean.valueOf(z));
    }
}
