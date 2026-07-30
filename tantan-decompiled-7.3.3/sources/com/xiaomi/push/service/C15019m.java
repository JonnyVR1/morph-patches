package com.xiaomi.push.service;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.data.BannerFrequencyType;
import com.xiaomi.push.C14887g;
import com.xiaomi.push.C14892gj;
import com.xiaomi.push.EnumC14893gk;
import com.xiaomi.push.EnumC14937n;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;
import p153l.a2r0;
import p153l.l4r0;
import p153l.ntq0;
import p153l.ouq0;
import p153l.q4r0;
import p153l.z2r0;

/* JADX INFO: renamed from: com.xiaomi.push.service.m */
/* JADX INFO: loaded from: classes2.dex */
public class C15019m {

    /* JADX INFO: renamed from: a */
    @SuppressLint({"StaticFieldLeak"})
    private static volatile C15019m f63894a;

    /* JADX INFO: renamed from: a */
    private long f63896a;

    /* JADX INFO: renamed from: a */
    private final Context f63897a;

    /* JADX INFO: renamed from: a */
    private final SharedPreferences f63898a;

    /* JADX INFO: renamed from: b */
    private final boolean f63905b;

    /* JADX INFO: renamed from: c */
    private final boolean f63907c;

    /* JADX INFO: renamed from: a */
    private final AtomicInteger f63900a = new AtomicInteger(0);

    /* JADX INFO: renamed from: a */
    private String f63899a = null;

    /* JADX INFO: renamed from: a */
    private volatile boolean f63901a = false;

    /* JADX INFO: renamed from: b */
    private String f63903b = null;

    /* JADX INFO: renamed from: b */
    private final AtomicInteger f63904b = new AtomicInteger(0);

    /* JADX INFO: renamed from: c */
    private final AtomicInteger f63906c = new AtomicInteger(0);

    /* JADX INFO: renamed from: a */
    private int f63895a = -1;

    /* JADX INFO: renamed from: b */
    private long f63902b = -1;

    /* JADX INFO: renamed from: d */
    private final boolean f63908d = m87870g();

    private C15019m(Context context) {
        this.f63897a = context;
        this.f63907c = l4r0.m152825j(context);
        this.f63905b = C14985ah.m87648a(context).m87660a(EnumC14893gk.IntelligentHeartbeatSwitchBoolean.m86817a(), true);
        SharedPreferences sharedPreferences = context.getSharedPreferences("hb_record", 0);
        this.f63898a = sharedPreferences;
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (sharedPreferences.getLong(a.m87884c(), -1L) == -1) {
            sharedPreferences.edit().putLong(a.m87884c(), jCurrentTimeMillis).apply();
        }
        long j = sharedPreferences.getLong(a.m87890i(), -1L);
        this.f63896a = j;
        if (j == -1) {
            this.f63896a = jCurrentTimeMillis;
            sharedPreferences.edit().putLong(a.m87890i(), jCurrentTimeMillis).apply();
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0058  */
    /* JADX INFO: renamed from: a */
    private void m87853a(String str, String str2, Map<String, String> map) {
        String str3;
        C14892gj c14892gj = new C14892gj();
        c14892gj.m86803d(str);
        c14892gj.m86799c("hb_name");
        c14892gj.m86784a("hb_channel");
        c14892gj.m86783a(1L);
        c14892gj.m86795b(str2);
        c14892gj.m86786a(false);
        c14892gj.m86794b(System.currentTimeMillis());
        c14892gj.m86811g(this.f63897a.getPackageName());
        c14892gj.m86806e("com.xiaomi.xmsf");
        if (map == null) {
            map = new HashMap<>();
        }
        C15022p c15022pM87936a = C15023q.m87936a(this.f63897a);
        if (c15022pM87936a == null || TextUtils.isEmpty(c15022pM87936a.f63938a)) {
            str3 = null;
        } else {
            String[] strArrSplit = c15022pM87936a.f63938a.split("@");
            if (strArrSplit.length > 0) {
                str3 = strArrSplit[0];
            } else {
                str3 = null;
            }
        }
        map.put("uuid", str3);
        map.put("model", q4r0.m175256a());
        Context context = this.f63897a;
        map.put("avc", String.valueOf(C14887g.m86753b(context, context.getPackageName())));
        map.put("pvc", String.valueOf(50909));
        map.put("cvc", String.valueOf(48));
        c14892gj.m86785a(map);
        z2r0 z2r0VarM218456b = z2r0.m218456b(this.f63897a);
        if (z2r0VarM218456b != null) {
            z2r0VarM218456b.m218460e(c14892gj, this.f63897a.getPackageName());
        }
    }

    /* JADX INFO: renamed from: b */
    private void m87857b(String str) {
        if ("WIFI-ID-UNKNOWN".equals(str)) {
            String str2 = this.f63899a;
            if (str2 == null || !str2.startsWith("W-")) {
                if (this.f63908d) {
                    this.f63899a = "W-NETWORK_ID_WIFI_DEFAULT";
                } else {
                    this.f63899a = null;
                }
            }
        } else {
            this.f63899a = str;
        }
        int i = this.f63898a.getInt(a.m87881a(this.f63899a), -1);
        long j = this.f63898a.getLong(a.m87883b(this.f63899a), -1L);
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (i != -1) {
            if (j == -1) {
                this.f63898a.edit().putLong(a.m87883b(this.f63899a), jCurrentTimeMillis + m87862d()).apply();
            } else if (jCurrentTimeMillis > j) {
                this.f63898a.edit().remove(a.m87881a(this.f63899a)).remove(a.m87883b(this.f63899a)).apply();
            }
        }
        this.f63900a.getAndSet(0);
        if (TextUtils.isEmpty(this.f63899a) || m87851a() != -1) {
            this.f63901a = false;
        } else {
            this.f63901a = true;
        }
        ouq0.m169393m(String.format("[HB] network changed, netid:%s, %s", this.f63899a, Boolean.valueOf(this.f63901a)));
    }

    /* JADX INFO: renamed from: c */
    private void m87860c(String str) {
        if (m87856a(str)) {
            this.f63898a.edit().putInt(a.m87881a(str), 235000).apply();
            this.f63898a.edit().putLong(a.m87883b(this.f63899a), System.currentTimeMillis() + m87862d()).apply();
        }
    }

    /* JADX INFO: renamed from: d */
    private void m87863d(String str) {
        String str2;
        String string;
        if (m87861c() && !TextUtils.isEmpty(str)) {
            if (str.startsWith("W-")) {
                str2 = "W";
            } else if (!str.startsWith("M-")) {
                return;
            } else {
                str2 = "M";
            }
            String strValueOf = String.valueOf(235000);
            String strValueOf2 = String.valueOf(System.currentTimeMillis() / 1000);
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(":::");
            sb.append(str2);
            sb.append(":::");
            sb.append(strValueOf);
            sb.append(":::");
            sb.append(strValueOf2);
            String string2 = this.f63898a.getString(a.m87887f(), null);
            if (TextUtils.isEmpty(string2)) {
                string = sb.toString();
            } else {
                string = string2 + "###" + sb.toString();
            }
            this.f63898a.edit().putString(a.m87887f(), string).apply();
        }
    }

    /* JADX INFO: renamed from: e */
    private boolean m87866e() {
        long j = this.f63898a.getLong(a.m87884c(), -1L);
        if (j == -1) {
            return false;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        return j > jCurrentTimeMillis || jCurrentTimeMillis - j >= 259200000;
    }

    /* JADX INFO: renamed from: f */
    private void m87867f() {
        String strM87888g;
        int i = this.f63895a;
        if (i != 0) {
            strM87888g = i != 1 ? null : a.m87889h();
        } else {
            strM87888g = a.m87888g();
        }
        if (TextUtils.isEmpty(strM87888g)) {
            return;
        }
        if (this.f63898a.getLong(a.m87890i(), -1L) == -1) {
            this.f63896a = System.currentTimeMillis();
            this.f63898a.edit().putLong(a.m87890i(), this.f63896a).apply();
        }
        this.f63898a.edit().putInt(strM87888g, this.f63898a.getInt(strM87888g, 0) + 1).apply();
    }

    /* JADX INFO: renamed from: g */
    private void m87869g() {
        int i;
        String[] strArrSplit;
        String[] strArrSplit2;
        if (m87861c()) {
            String string = this.f63898a.getString(a.m87887f(), null);
            char c = 0;
            if (!TextUtils.isEmpty(string) && (strArrSplit = string.split("###")) != null) {
                int i2 = 0;
                while (i2 < strArrSplit.length) {
                    if (!TextUtils.isEmpty(strArrSplit[i2]) && (strArrSplit2 = strArrSplit[i2].split(":::")) != null && strArrSplit2.length >= 4) {
                        String str = strArrSplit2[c];
                        String str2 = strArrSplit2[1];
                        String str3 = strArrSplit2[2];
                        String str4 = strArrSplit2[3];
                        HashMap map = new HashMap();
                        map.put(NotificationCompat.CATEGORY_EVENT, "change");
                        map.put("model", q4r0.m175256a());
                        map.put("net_type", str2);
                        map.put("net_name", str);
                        map.put(BannerFrequencyType.interval, str3);
                        map.put("timestamp", str4);
                        m87853a("category_hb_change", null, map);
                        ouq0.m169393m("[HB] report hb changed events.");
                    }
                    i2++;
                    c = 0;
                }
                this.f63898a.edit().remove(a.m87887f()).apply();
            }
            if (this.f63898a.getBoolean(a.m87880a(), false)) {
                long j = this.f63898a.getLong(a.m87882b(), 0L);
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (jCurrentTimeMillis - j > 1296000000) {
                    HashMap map2 = new HashMap();
                    map2.put(NotificationCompat.CATEGORY_EVENT, "support");
                    map2.put("model", q4r0.m175256a());
                    map2.put("timestamp", String.valueOf(System.currentTimeMillis() / 1000));
                    m87853a("category_hb_change", null, map2);
                    ouq0.m169393m("[HB] report support wifi digest events.");
                    this.f63898a.edit().putLong(a.m87882b(), jCurrentTimeMillis).apply();
                }
            }
            if (m87866e()) {
                int i3 = this.f63898a.getInt(a.m87885d(), 0);
                int i4 = this.f63898a.getInt(a.m87886e(), 0);
                if (i3 > 0 || i4 > 0) {
                    long j2 = this.f63898a.getLong(a.m87884c(), -1L);
                    String strValueOf = String.valueOf(235000);
                    String strValueOf2 = String.valueOf(j2);
                    String strValueOf3 = String.valueOf(System.currentTimeMillis());
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put(BannerFrequencyType.interval, strValueOf);
                        jSONObject.put("c_short", String.valueOf(i3));
                        jSONObject.put("c_long", String.valueOf(i4));
                        jSONObject.put("count", String.valueOf(i3 + i4));
                        jSONObject.put("start_time", strValueOf2);
                        jSONObject.put("end_time", strValueOf3);
                        String string2 = jSONObject.toString();
                        HashMap map3 = new HashMap();
                        map3.put(NotificationCompat.CATEGORY_EVENT, "long_and_short_hb_count");
                        m87853a("category_hb_count", string2, map3);
                        ouq0.m169393m("[HB] report short/long hb count events.");
                    } catch (Throwable unused) {
                    }
                }
                this.f63898a.edit().putInt(a.m87885d(), 0).putInt(a.m87886e(), 0).putLong(a.m87884c(), System.currentTimeMillis()).apply();
            }
            if (m87868f()) {
                String strValueOf4 = String.valueOf(this.f63896a);
                String strValueOf5 = String.valueOf(System.currentTimeMillis());
                int i5 = this.f63898a.getInt(a.m87888g(), 0);
                if (i5 > 0) {
                    try {
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("net_type", "M");
                        jSONObject2.put("ptc", i5);
                        jSONObject2.put("start_time", strValueOf4);
                        jSONObject2.put("end_time", strValueOf5);
                        String string3 = jSONObject2.toString();
                        HashMap map4 = new HashMap();
                        map4.put(NotificationCompat.CATEGORY_EVENT, "ptc_event");
                        m87853a("category_lc_ptc", string3, map4);
                        ouq0.m169393m("[HB] report ping timeout count events of mobile network.");
                        this.f63898a.edit().putInt(a.m87888g(), 0).apply();
                    } catch (Throwable unused2) {
                        i = 0;
                        this.f63898a.edit().putInt(a.m87888g(), 0).apply();
                    }
                }
                i = 0;
                int i6 = this.f63898a.getInt(a.m87889h(), i);
                if (i6 > 0) {
                    try {
                        JSONObject jSONObject3 = new JSONObject();
                        jSONObject3.put("net_type", "W");
                        jSONObject3.put("ptc", i6);
                        jSONObject3.put("start_time", strValueOf4);
                        jSONObject3.put("end_time", strValueOf5);
                        String string4 = jSONObject3.toString();
                        HashMap map5 = new HashMap();
                        map5.put(NotificationCompat.CATEGORY_EVENT, "ptc_event");
                        m87853a("category_lc_ptc", string4, map5);
                        ouq0.m169393m("[HB] report ping timeout count events of wifi network.");
                    } catch (Throwable unused3) {
                    }
                    this.f63898a.edit().putInt(a.m87889h(), 0).apply();
                }
                this.f63896a = System.currentTimeMillis();
                this.f63898a.edit().putLong(a.m87890i(), this.f63896a).apply();
            }
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.push.service.m$a */
    public static class a {
        /* JADX INFO: renamed from: a */
        public static String m87881a(String str) {
            return String.format("HB_%s", str);
        }

        /* JADX INFO: renamed from: b */
        public static String m87883b(String str) {
            return String.format("HB_dead_time_%s", str);
        }

        /* JADX INFO: renamed from: c */
        public static String m87884c() {
            return "record_hb_count_start";
        }

        /* JADX INFO: renamed from: d */
        public static String m87885d() {
            return "record_short_hb_count";
        }

        /* JADX INFO: renamed from: e */
        public static String m87886e() {
            return "record_long_hb_count";
        }

        /* JADX INFO: renamed from: f */
        public static String m87887f() {
            return "record_hb_change";
        }

        /* JADX INFO: renamed from: g */
        public static String m87888g() {
            return "record_mobile_ptc";
        }

        /* JADX INFO: renamed from: h */
        public static String m87889h() {
            return "record_wifi_ptc";
        }

        /* JADX INFO: renamed from: i */
        public static String m87890i() {
            return "record_ptc_start";
        }

        /* JADX INFO: renamed from: j */
        public static String m87891j() {
            return "keep_short_hb_effective_time";
        }

        /* JADX INFO: renamed from: a */
        public static String m87880a() {
            return "support_wifi_digest";
        }

        /* JADX INFO: renamed from: b */
        public static String m87882b() {
            return "record_support_wifi_digest_reported_time";
        }
    }

    /* JADX INFO: renamed from: e */
    private void m87865e() {
        if (this.f63898a.getBoolean(a.m87880a(), false)) {
            return;
        }
        this.f63898a.edit().putBoolean(a.m87880a(), true).apply();
    }

    /* JADX INFO: renamed from: c */
    private long m87859c() {
        return this.f63898a.getLong(a.m87891j(), -1L);
    }

    /* JADX INFO: renamed from: c */
    public void m87878c() {
        if (m87864d()) {
            this.f63903b = this.f63899a;
        }
    }

    /* JADX INFO: renamed from: c */
    private boolean m87861c() {
        return m87864d() && C14985ah.m87648a(this.f63897a).m87660a(EnumC14893gk.IntelligentHeartbeatDataCollectSwitchBoolean.m86817a(), true) && EnumC14937n.China.name().equals(C15004b.m87775a(this.f63897a).m87778a());
    }

    /* JADX INFO: renamed from: f */
    private boolean m87868f() {
        if (this.f63896a == -1) {
            return false;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j = this.f63896a;
        return j > jCurrentTimeMillis || jCurrentTimeMillis - j >= 259200000;
    }

    /* JADX INFO: renamed from: d */
    private long m87862d() {
        return C14985ah.m87648a(this.f63897a).m87654a(EnumC14893gk.ShortHeartbeatEffectivePeriodMsLong.m86817a(), 7776000000L);
    }

    /* JADX INFO: renamed from: d */
    public void m87879d() {
        if (m87864d()) {
            m87869g();
            if (this.f63901a) {
                this.f63900a.getAndSet(0);
            }
        }
    }

    /* JADX INFO: renamed from: d */
    private boolean m87864d() {
        return this.f63907c && (this.f63905b || this.f63908d || ((m87859c() > System.currentTimeMillis() ? 1 : (m87859c() == System.currentTimeMillis() ? 0 : -1)) >= 0));
    }

    /* JADX INFO: renamed from: a */
    public static C15019m m87852a(Context context) {
        if (f63894a == null) {
            synchronized (C15019m.class) {
                try {
                    if (f63894a == null) {
                        f63894a = new C15019m(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f63894a;
    }

    /* JADX INFO: renamed from: a */
    public synchronized void m87875a(ntq0 ntq0Var) {
        try {
            if (m87864d()) {
                String str = null;
                if (ntq0Var != null) {
                    if (ntq0Var.m164750a() == 0) {
                        String strM164756h = ntq0Var.m164756h();
                        if (!TextUtils.isEmpty(strM164756h) && !"UNKNOWN".equalsIgnoreCase(strM164756h)) {
                            str = "M-" + strM164756h;
                        }
                        m87857b(str);
                        this.f63895a = 0;
                    } else if (ntq0Var.m164750a() != 1 && ntq0Var.m164750a() != 6) {
                        m87857b(null);
                        this.f63895a = -1;
                    } else {
                        m87857b("WIFI-ID-UNKNOWN");
                        this.f63895a = 1;
                    }
                } else {
                    m87857b(null);
                    this.f63895a = -1;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: b */
    public void m87877b() {
        if (m87864d()) {
            m87867f();
            if (this.f63901a && !TextUtils.isEmpty(this.f63899a) && this.f63899a.equals(this.f63903b)) {
                this.f63900a.getAndIncrement();
                ouq0.m169393m("[HB] ping timeout count:" + this.f63900a);
                if (m87855a()) {
                    ouq0.m169393m("[HB] change hb interval for net:" + this.f63899a);
                    m87860c(this.f63899a);
                    this.f63901a = false;
                    this.f63900a.getAndSet(0);
                    m87863d(this.f63899a);
                }
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public synchronized void m87874a(String str) {
        try {
            if (!TextUtils.isEmpty(str)) {
                m87865e();
            }
            if (m87864d() && !TextUtils.isEmpty(str)) {
                m87857b("W-" + str);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: b */
    public long m87876b() {
        return this.f63902b;
    }

    /* JADX INFO: renamed from: b */
    private boolean m87858b() {
        if (!TextUtils.isEmpty(this.f63899a)) {
            if (this.f63899a.startsWith("M-")) {
                if (!C14985ah.m87648a(this.f63897a).m87660a(EnumC14893gk.IntelligentHeartbeatUseInMobileNetworkBoolean.m86817a(), false)) {
                    return true;
                }
            } else if (this.f63899a.equals("W-NETWORK_ID_WIFI_DEFAULT") && !m87870g()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: a */
    public void m87873a(int i) {
        this.f63898a.edit().putLong(a.m87891j(), System.currentTimeMillis() + ((long) (i * 1000))).apply();
    }

    /* JADX INFO: renamed from: a */
    private boolean m87855a() {
        return this.f63900a.get() >= Math.max(C14985ah.m87648a(this.f63897a).m87652a(EnumC14893gk.IntelligentHeartbeatNATCountInt.m86817a(), 3), 3);
    }

    /* JADX INFO: renamed from: a */
    public long m87871a() {
        int iM87851a;
        long jM95731f = a2r0.m95731f();
        if (this.f63907c && !m87858b() && ((C14985ah.m87648a(this.f63897a).m87660a(EnumC14893gk.IntelligentHeartbeatSwitchBoolean.m86817a(), true) || m87859c() >= System.currentTimeMillis()) && (iM87851a = m87851a()) != -1)) {
            jM95731f = iM87851a;
        }
        if (!TextUtils.isEmpty(this.f63899a) && !"WIFI-ID-UNKNOWN".equals(this.f63899a) && this.f63895a == 1) {
            m87854a(jM95731f < Constants.INBOX_V2_THROTTLE_WINDOW_MS);
        }
        this.f63902b = jM95731f;
        ouq0.m169393m("[HB] ping interval:" + jM95731f);
        return jM95731f;
    }

    /* JADX INFO: renamed from: a */
    private int m87851a() {
        if (!TextUtils.isEmpty(this.f63899a)) {
            try {
                return this.f63898a.getInt(a.m87881a(this.f63899a), -1);
            } catch (Throwable unused) {
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: a */
    private boolean m87856a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.startsWith("W-") || str.startsWith("M-");
    }

    /* JADX INFO: renamed from: a */
    private void m87854a(boolean z) {
        String strM87886e;
        if (m87861c()) {
            int iIncrementAndGet = (z ? this.f63904b : this.f63906c).incrementAndGet();
            String str = com.meituan.robust.Constants.LONG;
            ouq0.m169403w(String.format("[HB] %s ping interval count: %s", z ? com.meituan.robust.Constants.SHORT : com.meituan.robust.Constants.LONG, Integer.valueOf(iIncrementAndGet)));
            if (iIncrementAndGet >= 5) {
                if (z) {
                    strM87886e = a.m87885d();
                } else {
                    strM87886e = a.m87886e();
                }
                int i = this.f63898a.getInt(strM87886e, 0) + iIncrementAndGet;
                this.f63898a.edit().putInt(strM87886e, i).apply();
                if (z) {
                    str = com.meituan.robust.Constants.SHORT;
                }
                ouq0.m169393m(String.format("[HB] accumulate %s hb count(%s) and write to file. ", str, Integer.valueOf(i)));
                if (z) {
                    this.f63904b.set(0);
                } else {
                    this.f63906c.set(0);
                }
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public void m87872a() {
    }

    /* JADX INFO: renamed from: g */
    private boolean m87870g() {
        return C14985ah.m87648a(this.f63897a).m87660a(EnumC14893gk.IntelligentHeartbeatForUnsupportWifiDigestBoolean.m86817a(), true);
    }
}
