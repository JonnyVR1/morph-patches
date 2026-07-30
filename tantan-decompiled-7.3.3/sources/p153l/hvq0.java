package p153l;

import android.app.NotificationChannel;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.text.TextUtils;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.live.base.data.BLiveOperationTitleShowType;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.xiaomi.mipush.sdk.MiPushClient;
import com.xiaomi.push.C14892gj;
import com.xiaomi.push.service.C14977a;
import com.xiaomi.push.service.C14983af;
import com.xiaomi.push.service.C15003az;
import com.xiaomi.push.service.C15005ba;
import com.xiaomi.push.service.C15012f;
import com.xiaomi.push.service.C15023q;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
public class hvq0 implements Runnable {

    /* JADX INFO: renamed from: l.hvq0$a */
    public class CallableC17582a implements Callable<String> {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Context f111797a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ String f111798b;

        public CallableC17582a(Context context, String str) {
            this.f111797a = context;
            this.f111798b = str;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public String call() {
            return String.valueOf(C14977a.m87544a(this.f111797a, this.f111798b));
        }
    }

    /* JADX INFO: renamed from: l.hvq0$b */
    public class CallableC17583b implements Callable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Context f111800a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ String f111801b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ NotificationChannel f111802c;

        public CallableC17583b(Context context, String str, NotificationChannel notificationChannel) {
            this.f111800a = context;
            this.f111801b = str;
            this.f111802c = notificationChannel;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public String call() {
            return String.valueOf(C15012f.m87810a(this.f111800a, this.f111801b, this.f111802c));
        }
    }

    /* JADX INFO: renamed from: l.hvq0$c */
    public static class C17584c {

        /* JADX INFO: renamed from: a */
        private final String f111804a = "dc_job_result_time_26";

        /* JADX INFO: renamed from: b */
        public SharedPreferences f111805b;

        public C17584c(Context context) {
            SharedPreferences sharedPreferences = context.getSharedPreferences(MiPushClient.PREF_EXTRA, 0);
            this.f111805b = sharedPreferences;
            long j = sharedPreferences.getLong("dc_job_result_time_26", 0L);
            if (j <= 0 || j - System.currentTimeMillis() > 259200000) {
                this.f111805b.edit().putLong("dc_job_result_time_26", m137391a()).apply();
            }
        }

        /* JADX INFO: renamed from: a */
        private long m137391a() {
            long jCurrentTimeMillis = System.currentTimeMillis();
            Random random = new Random(jCurrentTimeMillis);
            return (((jCurrentTimeMillis / 86400000) + 1) * 86400000) + ((long) (random.nextInt(3) * 86400000)) + ((long) random.nextInt(46800000));
        }

        /* JADX INFO: renamed from: b */
        public void m137392b() {
            long j = this.f111805b.getLong("dc_job_result_time_26", 0L);
            long jCurrentTimeMillis = System.currentTimeMillis() - j;
            if (jCurrentTimeMillis >= 0) {
                this.f111805b.edit().putLong("dc_job_result_time_26", j + (((jCurrentTimeMillis / 259200000) + 1) * 259200000)).apply();
            }
        }

        /* JADX INFO: renamed from: c */
        public boolean m137393c() {
            return System.currentTimeMillis() - this.f111805b.getLong("dc_job_result_time_26", 0L) > 0;
        }
    }

    private hvq0() {
    }

    /* JADX INFO: renamed from: a */
    public static void m137386a(Context context) {
        if (context == null || !"com.xiaomi.xmsf".equals(context.getPackageName())) {
            return;
        }
        C17584c c17584c = new C17584c(context);
        if (c17584c.m137393c()) {
            new Thread(new hvq0()).start();
            c17584c.m137392b();
        }
    }

    /* JADX INFO: renamed from: b */
    private void m137387b(Context context, gvq0 gvq0Var, dvq0 dvq0Var) {
        C14892gj c14892gj = new C14892gj();
        c14892gj.m86803d("category_app_channel_info");
        c14892gj.m86799c("app_channel_info");
        c14892gj.m86795b(gvq0Var.toString());
        c14892gj.m86786a(false);
        c14892gj.m86783a(1L);
        c14892gj.m86784a("xmsf_channel");
        c14892gj.m86794b(System.currentTimeMillis());
        c14892gj.m86811g("com.xiaomi.xmsf");
        c14892gj.m86806e("com.xiaomi.xmsf");
        c14892gj.m86809f(C15003az.m87770a());
        C15005ba.m87782a(context, c14892gj);
    }

    /* JADX INFO: renamed from: c */
    private void m137388c(dvq0 dvq0Var, cvq0 cvq0Var, Exception exc) {
        HashMap map = new HashMap();
        String strM87938a = C15023q.m87938a(t5r0.m189418b());
        if (!TextUtils.isEmpty(strM87938a)) {
            map.put("uuid", strM87938a);
        }
        map.put("appCount", Long.valueOf(dvq0Var.m118304b()));
        map.put("channels", Long.valueOf(dvq0Var.m118307e()));
        map.put("packCount", Long.valueOf(dvq0Var.m118309g()));
        map.put("totalSize", Long.valueOf(dvq0Var.m118311i()));
        map.put("isBatch", Integer.valueOf(dvq0Var.m118303a()));
        map.put("maxCallTime", Long.valueOf(cvq0Var.m112857a()));
        map.put("minCallTime", Long.valueOf(cvq0Var.m112859c()));
        map.put("callAvg", Long.valueOf(cvq0Var.m112860d()));
        map.put(BLiveOperationTitleShowType.duration, Long.valueOf(cvq0Var.m112861e()));
        if (exc != null) {
            map.put("exception", exc.toString());
        }
        t0r0.m188825b().mo179241a("app_switch_upload", map);
    }

    /* JADX WARN: Code duplicated, block: B:50:0x0195  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v10, types: [l.gvq0] */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v15 */
    /* JADX WARN: Type inference failed for: r10v16 */
    /* JADX WARN: Type inference failed for: r10v17 */
    /* JADX WARN: Type inference failed for: r10v18 */
    /* JADX WARN: Type inference failed for: r10v7, types: [l.gvq0] */
    /* JADX WARN: Type inference failed for: r10v8, types: [l.gvq0] */
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
    /* JADX WARN: Type inference failed for: r11v5, types: [java.lang.Object, l.fvq0] */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r15v3, types: [java.lang.Object, l.gvq0] */
    /* JADX WARN: Type inference failed for: r19v0 */
    /* JADX WARN: Type inference failed for: r19v2 */
    /* JADX WARN: Type inference failed for: r19v3 */
    /* JADX WARN: Type inference failed for: r19v4 */
    /* JADX WARN: Type inference failed for: r23v0, types: [l.hvq0] */
    @Override // java.lang.Runnable
    public void run() {
        dvq0 dvq0Var;
        dvq0 dvq0Var2;
        String str;
        dvq0 dvq0Var3;
        ?? r11;
        List<NotificationChannel> listM87615a;
        String str2;
        ?? r19;
        ?? fvq0Var;
        ?? r10;
        String str3 = "mipush_";
        String str4 = "com.xiaomi.xmsf";
        Context contextM189418b = t5r0.m189418b();
        if (contextM189418b != null) {
            dvq0 dvq0Var4 = new dvq0();
            cvq0 cvq0Var = new cvq0(50L, 1000L);
            try {
                Map<String, ?> all = t5r0.m189418b().getSharedPreferences("pref_registered_pkg_names", 0).getAll();
                if (all == null || all.isEmpty()) {
                    dvq0Var = dvq0Var4;
                } else {
                    Set<String> setKeySet = all.keySet();
                    dvq0Var4.m118306d(setKeySet.contains("com.xiaomi.xmsf") ? setKeySet.size() - 1 : setKeySet.size());
                    gvq0 gvq0Var = new gvq0();
                    gvq0Var.put("c", dvq0Var4.m118304b());
                    Set<Map.Entry<String, ?>> setEntrySet = all.entrySet();
                    fvq0 fvq0Var2 = new fvq0();
                    Iterator<Map.Entry<String, ?>> it = setEntrySet.iterator();
                    ?? r12 = gvq0Var;
                    ?? r13 = fvq0Var2;
                    while (it.hasNext()) {
                        Map.Entry<String, ?> next = it.next();
                        String key = next.getKey();
                        String str5 = (String) next.getValue();
                        if (TextUtils.isEmpty(key)) {
                            str = str3;
                            str4 = str4;
                            dvq0Var3 = dvq0Var4;
                            it = it;
                            r10 = r12;
                            fvq0Var = r13;
                        } else {
                            try {
                                if (str4.equals(key) || TextUtils.isEmpty(str5)) {
                                    str = str3;
                                    str4 = str4;
                                    dvq0Var3 = dvq0Var4;
                                    it = it;
                                    r10 = r12;
                                    fvq0Var = r13;
                                } else {
                                    ?? gvq0Var2 = new gvq0();
                                    gvq0Var2.put("a", str5);
                                    gvq0Var2.put(BLiveStormDanmakuGiftResourceType.f45294s, (String) cvq0Var.m112858b(new CallableC17582a(contextM189418b, key)));
                                    if (Build.VERSION.SDK_INT < 26 || (listM87615a = C14983af.m87599a(contextM189418b, key).m87615a()) == null || listM87615a.isEmpty()) {
                                        str = str3;
                                        dvq0Var3 = dvq0Var4;
                                        r11 = r13;
                                    } else {
                                        fvq0 fvq0Var3 = new fvq0();
                                        dvq0Var4.m118308f(listM87615a.size());
                                        Iterator<NotificationChannel> it2 = listM87615a.iterator();
                                        ?? r14 = r13;
                                        while (it2.hasNext()) {
                                            NotificationChannel notificationChannelM130641a = glb0.m130641a(it2.next());
                                            String id = notificationChannelM130641a.getId();
                                            gvq0 gvq0Var3 = new gvq0();
                                            Iterator<NotificationChannel> it3 = it2;
                                            dvq0Var2 = dvq0Var4;
                                            if (id.startsWith(str3)) {
                                                r19 = r14;
                                                try {
                                                    StringBuilder sb = new StringBuilder();
                                                    sb.append(str3);
                                                    sb.append(key);
                                                    str2 = str3;
                                                    sb.append("_");
                                                    String strReplace = id.replace(sb.toString(), "");
                                                    gvq0Var3.put(Constants.KEY_T, 1);
                                                    gvq0Var3.put("c", strReplace);
                                                } catch (Exception e) {
                                                    e = e;
                                                    dvq0Var = dvq0Var2;
                                                    m137388c(dvq0Var, cvq0Var, e);
                                                }
                                            } else {
                                                str2 = str3;
                                                r19 = r14;
                                                if (id.startsWith("mipush|")) {
                                                    String strReplace2 = id.replace("mipush|" + key + "|", "");
                                                    gvq0Var3.put(Constants.KEY_T, 2);
                                                    gvq0Var3.put("c", strReplace2);
                                                }
                                            }
                                            gvq0Var3.put(BLiveStormDanmakuGiftResourceType.f45294s, (String) cvq0Var.m112858b(new CallableC17583b(contextM189418b, key, notificationChannelM130641a)));
                                            fvq0Var3.put(gvq0Var3);
                                            r14 = r19;
                                            it2 = it3;
                                            dvq0Var4 = dvq0Var2;
                                            str3 = str2;
                                        }
                                        str = str3;
                                        dvq0Var3 = dvq0Var4;
                                        gvq0Var2.put("c", fvq0Var3);
                                        r11 = r14;
                                    }
                                    r11.put(gvq0Var2);
                                    ?? r15 = r12;
                                    r15.put(Constants.INAPP_DATA_TAG, r11);
                                    r10 = r15;
                                    fvq0Var = r11;
                                }
                            } catch (Exception e2) {
                                e = e2;
                                dvq0Var2 = dvq0Var4;
                            }
                        }
                        if (r10.mo122813a() > 30720) {
                            dvq0Var3.m118305c();
                            dvq0Var = dvq0Var3;
                            try {
                                dvq0Var.m118310h(r10.mo122813a());
                                m137387b(contextM189418b, r10, dvq0Var);
                                gvq0 gvq0Var4 = new gvq0();
                                gvq0Var4.put("c", dvq0Var.m118304b());
                                r10 = gvq0Var4;
                                fvq0Var = new fvq0();
                            } catch (Exception e3) {
                                e = e3;
                            }
                        } else {
                            dvq0Var = dvq0Var3;
                        }
                        dvq0Var4 = dvq0Var;
                        str4 = str4;
                        it = it;
                        str3 = str;
                        r12 = r10;
                        r13 = fvq0Var;
                    }
                    dvq0Var = dvq0Var4;
                    if (r13.length() > 0) {
                        dvq0Var.m118305c();
                        dvq0Var.m118310h(r12.mo122813a());
                        m137387b(contextM189418b, r12, dvq0Var);
                    }
                }
                e = null;
            } catch (Exception e4) {
                e = e4;
                dvq0Var = dvq0Var4;
            }
            m137388c(dvq0Var, cvq0Var, e);
        }
    }
}
