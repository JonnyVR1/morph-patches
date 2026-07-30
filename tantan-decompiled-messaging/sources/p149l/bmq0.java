package p149l;

import android.app.NotificationChannel;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.text.TextUtils;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.live.base.data.BLiveOperationTitleShowType;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.xiaomi.mipush.sdk.MiPushClient;
import com.xiaomi.push.C14744gj;
import com.xiaomi.push.service.C14829a;
import com.xiaomi.push.service.C14835af;
import com.xiaomi.push.service.C14855az;
import com.xiaomi.push.service.C14857ba;
import com.xiaomi.push.service.C14864f;
import com.xiaomi.push.service.C14875q;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
public class bmq0 implements Runnable {

    /* JADX INFO: renamed from: l.bmq0$a */
    public class CallableC15908a implements Callable<String> {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Context f76301a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ String f76302b;

        public CallableC15908a(Context context, String str) {
            this.f76301a = context;
            this.f76302b = str;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public String call() {
            return String.valueOf(C14829a.m86373a(this.f76301a, this.f76302b));
        }
    }

    /* JADX INFO: renamed from: l.bmq0$b */
    public class CallableC15909b implements Callable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Context f76304a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ String f76305b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ NotificationChannel f76306c;

        public CallableC15909b(Context context, String str, NotificationChannel notificationChannel) {
            this.f76304a = context;
            this.f76305b = str;
            this.f76306c = notificationChannel;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public String call() {
            return String.valueOf(C14864f.m86639a(this.f76304a, this.f76305b, this.f76306c));
        }
    }

    /* JADX INFO: renamed from: l.bmq0$c */
    public static class C15910c {

        /* JADX INFO: renamed from: a */
        private final String f76308a = "dc_job_result_time_26";

        /* JADX INFO: renamed from: b */
        public SharedPreferences f76309b;

        public C15910c(Context context) {
            SharedPreferences sharedPreferences = context.getSharedPreferences(MiPushClient.PREF_EXTRA, 0);
            this.f76309b = sharedPreferences;
            long j = sharedPreferences.getLong("dc_job_result_time_26", 0L);
            if (j <= 0 || j - System.currentTimeMillis() > 259200000) {
                this.f76309b.edit().putLong("dc_job_result_time_26", m102666a()).apply();
            }
        }

        /* JADX INFO: renamed from: a */
        private long m102666a() {
            long jCurrentTimeMillis = System.currentTimeMillis();
            Random random = new Random(jCurrentTimeMillis);
            return (((jCurrentTimeMillis / 86400000) + 1) * 86400000) + ((long) (random.nextInt(3) * 86400000)) + ((long) random.nextInt(46800000));
        }

        /* JADX INFO: renamed from: b */
        public void m102667b() {
            long j = this.f76309b.getLong("dc_job_result_time_26", 0L);
            long jCurrentTimeMillis = System.currentTimeMillis() - j;
            if (jCurrentTimeMillis >= 0) {
                this.f76309b.edit().putLong("dc_job_result_time_26", j + (((jCurrentTimeMillis / 259200000) + 1) * 259200000)).apply();
            }
        }

        /* JADX INFO: renamed from: c */
        public boolean m102668c() {
            return System.currentTimeMillis() - this.f76309b.getLong("dc_job_result_time_26", 0L) > 0;
        }
    }

    private bmq0() {
    }

    /* JADX INFO: renamed from: a */
    public static void m102661a(Context context) {
        if (context == null || !"com.xiaomi.xmsf".equals(context.getPackageName())) {
            return;
        }
        C15910c c15910c = new C15910c(context);
        if (c15910c.m102668c()) {
            new Thread(new bmq0()).start();
            c15910c.m102667b();
        }
    }

    /* JADX INFO: renamed from: b */
    private void m102662b(Context context, amq0 amq0Var, xlq0 xlq0Var) {
        C14744gj c14744gj = new C14744gj();
        c14744gj.m85632d("category_app_channel_info");
        c14744gj.m85628c("app_channel_info");
        c14744gj.m85624b(amq0Var.toString());
        c14744gj.m85615a(false);
        c14744gj.m85612a(1L);
        c14744gj.m85613a("xmsf_channel");
        c14744gj.m85623b(System.currentTimeMillis());
        c14744gj.m85640g("com.xiaomi.xmsf");
        c14744gj.m85635e("com.xiaomi.xmsf");
        c14744gj.m85638f(C14855az.m86599a());
        C14857ba.m86611a(context, c14744gj);
    }

    /* JADX INFO: renamed from: c */
    private void m102663c(xlq0 xlq0Var, wlq0 wlq0Var, Exception exc) {
        HashMap map = new HashMap();
        String strM86767a = C14875q.m86767a(nwq0.m161879b());
        if (!TextUtils.isEmpty(strM86767a)) {
            map.put("uuid", strM86767a);
        }
        map.put("appCount", Long.valueOf(xlq0Var.m209960b()));
        map.put("channels", Long.valueOf(xlq0Var.m209963e()));
        map.put("packCount", Long.valueOf(xlq0Var.m209965g()));
        map.put("totalSize", Long.valueOf(xlq0Var.m209967i()));
        map.put("isBatch", Integer.valueOf(xlq0Var.m209959a()));
        map.put("maxCallTime", Long.valueOf(wlq0Var.m203874a()));
        map.put("minCallTime", Long.valueOf(wlq0Var.m203876c()));
        map.put("callAvg", Long.valueOf(wlq0Var.m203877d()));
        map.put(BLiveOperationTitleShowType.duration, Long.valueOf(wlq0Var.m203878e()));
        if (exc != null) {
            map.put("exception", exc.toString());
        }
        nrq0.m160745b().mo151503a("app_switch_upload", map);
    }

    /* JADX WARN: Code duplicated, block: B:50:0x0195  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v10, types: [l.amq0] */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v15 */
    /* JADX WARN: Type inference failed for: r10v16 */
    /* JADX WARN: Type inference failed for: r10v17 */
    /* JADX WARN: Type inference failed for: r10v18 */
    /* JADX WARN: Type inference failed for: r10v7, types: [l.amq0] */
    /* JADX WARN: Type inference failed for: r10v8, types: [l.amq0] */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v13 */
    /* JADX WARN: Type inference failed for: r11v14 */
    /* JADX WARN: Type inference failed for: r11v16 */
    /* JADX WARN: Type inference failed for: r11v17 */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* JADX WARN: Type inference failed for: r11v19 */
    /* JADX WARN: Type inference failed for: r11v20 */
    /* JADX WARN: Type inference failed for: r11v21 */
    /* JADX WARN: Type inference failed for: r11v22 */
    /* JADX WARN: Type inference failed for: r11v4, types: [org.json.JSONArray] */
    /* JADX WARN: Type inference failed for: r11v5, types: [java.lang.Object, l.zlq0] */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r15v3, types: [java.lang.Object, l.amq0] */
    /* JADX WARN: Type inference failed for: r19v0 */
    /* JADX WARN: Type inference failed for: r19v2 */
    /* JADX WARN: Type inference failed for: r19v3 */
    /* JADX WARN: Type inference failed for: r19v4 */
    /* JADX WARN: Type inference failed for: r23v0, types: [l.bmq0] */
    @Override // java.lang.Runnable
    public void run() {
        xlq0 xlq0Var;
        xlq0 xlq0Var2;
        String str;
        xlq0 xlq0Var3;
        ?? r11;
        List<NotificationChannel> listM86444a;
        String str2;
        ?? r19;
        ?? zlq0Var;
        ?? r10;
        String str3 = "mipush_";
        String str4 = "com.xiaomi.xmsf";
        Context contextM161879b = nwq0.m161879b();
        if (contextM161879b != null) {
            xlq0 xlq0Var4 = new xlq0();
            wlq0 wlq0Var = new wlq0(50L, 1000L);
            try {
                Map<String, ?> all = nwq0.m161879b().getSharedPreferences("pref_registered_pkg_names", 0).getAll();
                if (all == null || all.isEmpty()) {
                    xlq0Var = xlq0Var4;
                } else {
                    Set<String> setKeySet = all.keySet();
                    xlq0Var4.m209962d(setKeySet.contains("com.xiaomi.xmsf") ? setKeySet.size() - 1 : setKeySet.size());
                    amq0 amq0Var = new amq0();
                    amq0Var.put("c", xlq0Var4.m209960b());
                    Set<Map.Entry<String, ?>> setEntrySet = all.entrySet();
                    zlq0 zlq0Var2 = new zlq0();
                    Iterator<Map.Entry<String, ?>> it = setEntrySet.iterator();
                    ?? r12 = amq0Var;
                    ?? r13 = zlq0Var2;
                    while (it.hasNext()) {
                        Map.Entry<String, ?> next = it.next();
                        String key = next.getKey();
                        String str5 = (String) next.getValue();
                        if (TextUtils.isEmpty(key)) {
                            str = str3;
                            str4 = str4;
                            xlq0Var3 = xlq0Var4;
                            it = it;
                            r10 = r12;
                            zlq0Var = r13;
                        } else {
                            try {
                                if (str4.equals(key) || TextUtils.isEmpty(str5)) {
                                    str = str3;
                                    str4 = str4;
                                    xlq0Var3 = xlq0Var4;
                                    it = it;
                                    r10 = r12;
                                    zlq0Var = r13;
                                } else {
                                    ?? amq0Var2 = new amq0();
                                    amq0Var2.put("a", str5);
                                    amq0Var2.put(BLiveStormDanmakuGiftResourceType.f44446s, (String) wlq0Var.m203875b(new CallableC15908a(contextM161879b, key)));
                                    if (Build.VERSION.SDK_INT < 26 || (listM86444a = C14835af.m86428a(contextM161879b, key).m86444a()) == null || listM86444a.isEmpty()) {
                                        str = str3;
                                        xlq0Var3 = xlq0Var4;
                                        r11 = r13;
                                    } else {
                                        zlq0 zlq0Var3 = new zlq0();
                                        xlq0Var4.m209964f(listM86444a.size());
                                        Iterator<NotificationChannel> it2 = listM86444a.iterator();
                                        ?? r14 = r13;
                                        while (it2.hasNext()) {
                                            NotificationChannel notificationChannelM106215a = cdb0.m106215a(it2.next());
                                            String id = notificationChannelM106215a.getId();
                                            amq0 amq0Var3 = new amq0();
                                            Iterator<NotificationChannel> it3 = it2;
                                            xlq0Var2 = xlq0Var4;
                                            if (id.startsWith(str3)) {
                                                r19 = r14;
                                                try {
                                                    StringBuilder sb = new StringBuilder();
                                                    sb.append(str3);
                                                    sb.append(key);
                                                    str2 = str3;
                                                    sb.append("_");
                                                    String strReplace = id.replace(sb.toString(), "");
                                                    amq0Var3.put(Constants.KEY_T, 1);
                                                    amq0Var3.put("c", strReplace);
                                                } catch (Exception e) {
                                                    e = e;
                                                    xlq0Var = xlq0Var2;
                                                    m102663c(xlq0Var, wlq0Var, e);
                                                }
                                            } else {
                                                str2 = str3;
                                                r19 = r14;
                                                if (id.startsWith("mipush|")) {
                                                    String strReplace2 = id.replace("mipush|" + key + "|", "");
                                                    amq0Var3.put(Constants.KEY_T, 2);
                                                    amq0Var3.put("c", strReplace2);
                                                }
                                            }
                                            amq0Var3.put(BLiveStormDanmakuGiftResourceType.f44446s, (String) wlq0Var.m203875b(new CallableC15909b(contextM161879b, key, notificationChannelM106215a)));
                                            zlq0Var3.put(amq0Var3);
                                            r14 = r19;
                                            it2 = it3;
                                            xlq0Var4 = xlq0Var2;
                                            str3 = str2;
                                        }
                                        str = str3;
                                        xlq0Var3 = xlq0Var4;
                                        amq0Var2.put("c", zlq0Var3);
                                        r11 = r14;
                                    }
                                    r11.put(amq0Var2);
                                    ?? r15 = r12;
                                    r15.put(Constants.INAPP_DATA_TAG, r11);
                                    r10 = r15;
                                    zlq0Var = r11;
                                }
                            } catch (Exception e2) {
                                e = e2;
                                xlq0Var2 = xlq0Var4;
                            }
                        }
                        if (r10.mo97683a() > 30720) {
                            xlq0Var3.m209961c();
                            xlq0Var = xlq0Var3;
                            try {
                                xlq0Var.m209966h(r10.mo97683a());
                                m102662b(contextM161879b, r10, xlq0Var);
                                amq0 amq0Var4 = new amq0();
                                amq0Var4.put("c", xlq0Var.m209960b());
                                r10 = amq0Var4;
                                zlq0Var = new zlq0();
                            } catch (Exception e3) {
                                e = e3;
                            }
                        } else {
                            xlq0Var = xlq0Var3;
                        }
                        xlq0Var4 = xlq0Var;
                        str4 = str4;
                        it = it;
                        str3 = str;
                        r12 = r10;
                        r13 = zlq0Var;
                    }
                    xlq0Var = xlq0Var4;
                    if (r13.length() > 0) {
                        xlq0Var.m209961c();
                        xlq0Var.m209966h(r12.mo97683a());
                        m102662b(contextM161879b, r12, xlq0Var);
                    }
                }
                e = null;
            } catch (Exception e4) {
                e = e4;
                xlq0Var = xlq0Var4;
            }
            m102663c(xlq0Var, wlq0Var, e);
        }
    }
}
