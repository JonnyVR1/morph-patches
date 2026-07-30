package com.xiaomi.push.service;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.data.BannerFrequencyType;
import com.xiaomi.push.C14739g;
import com.xiaomi.push.C14744gj;
import com.xiaomi.push.EnumC14745gk;
import com.xiaomi.push.EnumC14789n;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;
import p149l.fvq0;
import p149l.hkq0;
import p149l.ilq0;
import p149l.kvq0;
import p149l.ttq0;
import p149l.usq0;

/* JADX INFO: renamed from: com.xiaomi.push.service.m */
/* JADX INFO: loaded from: classes2.dex */
public class C14871m {

    /* JADX INFO: renamed from: a */
    @SuppressLint({"StaticFieldLeak"})
    private static volatile C14871m f63047a;

    /* JADX INFO: renamed from: a */
    private long f63049a;

    /* JADX INFO: renamed from: a */
    private final Context f63050a;

    /* JADX INFO: renamed from: a */
    private final SharedPreferences f63051a;

    /* JADX INFO: renamed from: b */
    private final boolean f63058b;

    /* JADX INFO: renamed from: c */
    private final boolean f63060c;

    /* JADX INFO: renamed from: a */
    private final AtomicInteger f63053a = new AtomicInteger(0);

    /* JADX INFO: renamed from: a */
    private String f63052a = null;

    /* JADX INFO: renamed from: a */
    private volatile boolean f63054a = false;

    /* JADX INFO: renamed from: b */
    private String f63056b = null;

    /* JADX INFO: renamed from: b */
    private final AtomicInteger f63057b = new AtomicInteger(0);

    /* JADX INFO: renamed from: c */
    private final AtomicInteger f63059c = new AtomicInteger(0);

    /* JADX INFO: renamed from: a */
    private int f63048a = -1;

    /* JADX INFO: renamed from: b */
    private long f63055b = -1;

    /* JADX INFO: renamed from: d */
    private final boolean f63061d = m86699g();

    private C14871m(Context context) {
        this.f63050a = context;
        this.f63060c = fvq0.m123356j(context);
        this.f63058b = C14837ah.m86477a(context).m86489a(EnumC14745gk.IntelligentHeartbeatSwitchBoolean.m85646a(), true);
        SharedPreferences sharedPreferences = context.getSharedPreferences("hb_record", 0);
        this.f63051a = sharedPreferences;
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (sharedPreferences.getLong(a.m86713c(), -1L) == -1) {
            sharedPreferences.edit().putLong(a.m86713c(), jCurrentTimeMillis).apply();
        }
        long j = sharedPreferences.getLong(a.m86719i(), -1L);
        this.f63049a = j;
        if (j == -1) {
            this.f63049a = jCurrentTimeMillis;
            sharedPreferences.edit().putLong(a.m86719i(), jCurrentTimeMillis).apply();
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0058  */
    /* JADX INFO: renamed from: a */
    private void m86682a(String str, String str2, Map<String, String> map) {
        String str3;
        C14744gj c14744gj = new C14744gj();
        c14744gj.m85632d(str);
        c14744gj.m85628c("hb_name");
        c14744gj.m85613a("hb_channel");
        c14744gj.m85612a(1L);
        c14744gj.m85624b(str2);
        c14744gj.m85615a(false);
        c14744gj.m85623b(System.currentTimeMillis());
        c14744gj.m85640g(this.f63050a.getPackageName());
        c14744gj.m85635e("com.xiaomi.xmsf");
        if (map == null) {
            map = new HashMap<>();
        }
        C14874p c14874pM86765a = C14875q.m86765a(this.f63050a);
        if (c14874pM86765a == null || TextUtils.isEmpty(c14874pM86765a.f63091a)) {
            str3 = null;
        } else {
            String[] strArrSplit = c14874pM86765a.f63091a.split("@");
            if (strArrSplit.length > 0) {
                str3 = strArrSplit[0];
            } else {
                str3 = null;
            }
        }
        map.put("uuid", str3);
        map.put("model", kvq0.m147391a());
        Context context = this.f63050a;
        map.put("avc", String.valueOf(C14739g.m85582b(context, context.getPackageName())));
        map.put("pvc", String.valueOf(50909));
        map.put("cvc", String.valueOf(48));
        c14744gj.m85614a(map);
        ttq0 ttq0VarM190616b = ttq0.m190616b(this.f63050a);
        if (ttq0VarM190616b != null) {
            ttq0VarM190616b.m190620e(c14744gj, this.f63050a.getPackageName());
        }
    }

    /* JADX INFO: renamed from: b */
    private void m86686b(String str) {
        if ("WIFI-ID-UNKNOWN".equals(str)) {
            String str2 = this.f63052a;
            if (str2 == null || !str2.startsWith("W-")) {
                if (this.f63061d) {
                    this.f63052a = "W-NETWORK_ID_WIFI_DEFAULT";
                } else {
                    this.f63052a = null;
                }
            }
        } else {
            this.f63052a = str;
        }
        int i = this.f63051a.getInt(a.m86710a(this.f63052a), -1);
        long j = this.f63051a.getLong(a.m86712b(this.f63052a), -1L);
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (i != -1) {
            if (j == -1) {
                this.f63051a.edit().putLong(a.m86712b(this.f63052a), jCurrentTimeMillis + m86691d()).apply();
            } else if (jCurrentTimeMillis > j) {
                this.f63051a.edit().remove(a.m86710a(this.f63052a)).remove(a.m86712b(this.f63052a)).apply();
            }
        }
        this.f63053a.getAndSet(0);
        if (TextUtils.isEmpty(this.f63052a) || m86680a() != -1) {
            this.f63054a = false;
        } else {
            this.f63054a = true;
        }
        ilq0.m137040m(String.format("[HB] network changed, netid:%s, %s", this.f63052a, Boolean.valueOf(this.f63054a)));
    }

    /* JADX INFO: renamed from: c */
    private void m86689c(String str) {
        if (m86685a(str)) {
            this.f63051a.edit().putInt(a.m86710a(str), 235000).apply();
            this.f63051a.edit().putLong(a.m86712b(this.f63052a), System.currentTimeMillis() + m86691d()).apply();
        }
    }

    /* JADX INFO: renamed from: d */
    private void m86692d(String str) {
        String str2;
        String string;
        if (m86690c() && !TextUtils.isEmpty(str)) {
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
            String string2 = this.f63051a.getString(a.m86716f(), null);
            if (TextUtils.isEmpty(string2)) {
                string = sb.toString();
            } else {
                string = string2 + "###" + sb.toString();
            }
            this.f63051a.edit().putString(a.m86716f(), string).apply();
        }
    }

    /* JADX INFO: renamed from: e */
    private boolean m86695e() {
        long j = this.f63051a.getLong(a.m86713c(), -1L);
        if (j == -1) {
            return false;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        return j > jCurrentTimeMillis || jCurrentTimeMillis - j >= 259200000;
    }

    /* JADX INFO: renamed from: f */
    private void m86696f() {
        String strM86717g;
        int i = this.f63048a;
        if (i != 0) {
            strM86717g = i != 1 ? null : a.m86718h();
        } else {
            strM86717g = a.m86717g();
        }
        if (TextUtils.isEmpty(strM86717g)) {
            return;
        }
        if (this.f63051a.getLong(a.m86719i(), -1L) == -1) {
            this.f63049a = System.currentTimeMillis();
            this.f63051a.edit().putLong(a.m86719i(), this.f63049a).apply();
        }
        this.f63051a.edit().putInt(strM86717g, this.f63051a.getInt(strM86717g, 0) + 1).apply();
    }

    /* JADX INFO: renamed from: g */
    private void m86698g() {
        int i;
        String[] strArrSplit;
        String[] strArrSplit2;
        if (m86690c()) {
            String string = this.f63051a.getString(a.m86716f(), null);
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
                        map.put("model", kvq0.m147391a());
                        map.put("net_type", str2);
                        map.put("net_name", str);
                        map.put(BannerFrequencyType.interval, str3);
                        map.put("timestamp", str4);
                        m86682a("category_hb_change", null, map);
                        ilq0.m137040m("[HB] report hb changed events.");
                    }
                    i2++;
                    c = 0;
                }
                this.f63051a.edit().remove(a.m86716f()).apply();
            }
            if (this.f63051a.getBoolean(a.m86709a(), false)) {
                long j = this.f63051a.getLong(a.m86711b(), 0L);
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (jCurrentTimeMillis - j > 1296000000) {
                    HashMap map2 = new HashMap();
                    map2.put(NotificationCompat.CATEGORY_EVENT, "support");
                    map2.put("model", kvq0.m147391a());
                    map2.put("timestamp", String.valueOf(System.currentTimeMillis() / 1000));
                    m86682a("category_hb_change", null, map2);
                    ilq0.m137040m("[HB] report support wifi digest events.");
                    this.f63051a.edit().putLong(a.m86711b(), jCurrentTimeMillis).apply();
                }
            }
            if (m86695e()) {
                int i3 = this.f63051a.getInt(a.m86714d(), 0);
                int i4 = this.f63051a.getInt(a.m86715e(), 0);
                if (i3 > 0 || i4 > 0) {
                    long j2 = this.f63051a.getLong(a.m86713c(), -1L);
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
                        m86682a("category_hb_count", string2, map3);
                        ilq0.m137040m("[HB] report short/long hb count events.");
                    } catch (Throwable unused) {
                    }
                }
                this.f63051a.edit().putInt(a.m86714d(), 0).putInt(a.m86715e(), 0).putLong(a.m86713c(), System.currentTimeMillis()).apply();
            }
            if (m86697f()) {
                String strValueOf4 = String.valueOf(this.f63049a);
                String strValueOf5 = String.valueOf(System.currentTimeMillis());
                int i5 = this.f63051a.getInt(a.m86717g(), 0);
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
                        m86682a("category_lc_ptc", string3, map4);
                        ilq0.m137040m("[HB] report ping timeout count events of mobile network.");
                        this.f63051a.edit().putInt(a.m86717g(), 0).apply();
                    } catch (Throwable unused2) {
                        i = 0;
                        this.f63051a.edit().putInt(a.m86717g(), 0).apply();
                    }
                }
                i = 0;
                int i6 = this.f63051a.getInt(a.m86718h(), i);
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
                        m86682a("category_lc_ptc", string4, map5);
                        ilq0.m137040m("[HB] report ping timeout count events of wifi network.");
                    } catch (Throwable unused3) {
                    }
                    this.f63051a.edit().putInt(a.m86718h(), 0).apply();
                }
                this.f63049a = System.currentTimeMillis();
                this.f63051a.edit().putLong(a.m86719i(), this.f63049a).apply();
            }
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.push.service.m$a */
    public static class a {
        /* JADX INFO: renamed from: a */
        public static String m86710a(String str) {
            return String.format("HB_%s", str);
        }

        /* JADX INFO: renamed from: b */
        public static String m86712b(String str) {
            return String.format("HB_dead_time_%s", str);
        }

        /* JADX INFO: renamed from: c */
        public static String m86713c() {
            return "record_hb_count_start";
        }

        /* JADX INFO: renamed from: d */
        public static String m86714d() {
            return "record_short_hb_count";
        }

        /* JADX INFO: renamed from: e */
        public static String m86715e() {
            return "record_long_hb_count";
        }

        /* JADX INFO: renamed from: f */
        public static String m86716f() {
            return "record_hb_change";
        }

        /* JADX INFO: renamed from: g */
        public static String m86717g() {
            return "record_mobile_ptc";
        }

        /* JADX INFO: renamed from: h */
        public static String m86718h() {
            return "record_wifi_ptc";
        }

        /* JADX INFO: renamed from: i */
        public static String m86719i() {
            return "record_ptc_start";
        }

        /* JADX INFO: renamed from: j */
        public static String m86720j() {
            return "keep_short_hb_effective_time";
        }

        /* JADX INFO: renamed from: a */
        public static String m86709a() {
            return "support_wifi_digest";
        }

        /* JADX INFO: renamed from: b */
        public static String m86711b() {
            return "record_support_wifi_digest_reported_time";
        }
    }

    /* JADX INFO: renamed from: e */
    private void m86694e() {
        if (this.f63051a.getBoolean(a.m86709a(), false)) {
            return;
        }
        this.f63051a.edit().putBoolean(a.m86709a(), true).apply();
    }

    /* JADX INFO: renamed from: c */
    private long m86688c() {
        return this.f63051a.getLong(a.m86720j(), -1L);
    }

    /* JADX INFO: renamed from: c */
    public void m86707c() {
        if (m86693d()) {
            this.f63056b = this.f63052a;
        }
    }

    /* JADX INFO: renamed from: c */
    private boolean m86690c() {
        return m86693d() && C14837ah.m86477a(this.f63050a).m86489a(EnumC14745gk.IntelligentHeartbeatDataCollectSwitchBoolean.m85646a(), true) && EnumC14789n.China.name().equals(C14856b.m86604a(this.f63050a).m86607a());
    }

    /* JADX INFO: renamed from: f */
    private boolean m86697f() {
        if (this.f63049a == -1) {
            return false;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j = this.f63049a;
        return j > jCurrentTimeMillis || jCurrentTimeMillis - j >= 259200000;
    }

    /* JADX INFO: renamed from: d */
    private long m86691d() {
        return C14837ah.m86477a(this.f63050a).m86483a(EnumC14745gk.ShortHeartbeatEffectivePeriodMsLong.m85646a(), 7776000000L);
    }

    /* JADX INFO: renamed from: d */
    public void m86708d() {
        if (m86693d()) {
            m86698g();
            if (this.f63054a) {
                this.f63053a.getAndSet(0);
            }
        }
    }

    /* JADX INFO: renamed from: d */
    private boolean m86693d() {
        return this.f63060c && (this.f63058b || this.f63061d || ((m86688c() > System.currentTimeMillis() ? 1 : (m86688c() == System.currentTimeMillis() ? 0 : -1)) >= 0));
    }

    /* JADX INFO: renamed from: a */
    public static C14871m m86681a(Context context) {
        if (f63047a == null) {
            synchronized (C14871m.class) {
                try {
                    if (f63047a == null) {
                        f63047a = new C14871m(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f63047a;
    }

    /* JADX INFO: renamed from: a */
    public synchronized void m86704a(hkq0 hkq0Var) {
        try {
            if (m86693d()) {
                String str = null;
                if (hkq0Var != null) {
                    if (hkq0Var.m131578a() == 0) {
                        String strM131584h = hkq0Var.m131584h();
                        if (!TextUtils.isEmpty(strM131584h) && !"UNKNOWN".equalsIgnoreCase(strM131584h)) {
                            str = "M-" + strM131584h;
                        }
                        m86686b(str);
                        this.f63048a = 0;
                    } else if (hkq0Var.m131578a() != 1 && hkq0Var.m131578a() != 6) {
                        m86686b(null);
                        this.f63048a = -1;
                    } else {
                        m86686b("WIFI-ID-UNKNOWN");
                        this.f63048a = 1;
                    }
                } else {
                    m86686b(null);
                    this.f63048a = -1;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: b */
    public void m86706b() {
        if (m86693d()) {
            m86696f();
            if (this.f63054a && !TextUtils.isEmpty(this.f63052a) && this.f63052a.equals(this.f63056b)) {
                this.f63053a.getAndIncrement();
                ilq0.m137040m("[HB] ping timeout count:" + this.f63053a);
                if (m86684a()) {
                    ilq0.m137040m("[HB] change hb interval for net:" + this.f63052a);
                    m86689c(this.f63052a);
                    this.f63054a = false;
                    this.f63053a.getAndSet(0);
                    m86692d(this.f63052a);
                }
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public synchronized void m86703a(String str) {
        try {
            if (!TextUtils.isEmpty(str)) {
                m86694e();
            }
            if (m86693d() && !TextUtils.isEmpty(str)) {
                m86686b("W-" + str);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: b */
    public long m86705b() {
        return this.f63055b;
    }

    /* JADX INFO: renamed from: b */
    private boolean m86687b() {
        if (!TextUtils.isEmpty(this.f63052a)) {
            if (this.f63052a.startsWith("M-")) {
                if (!C14837ah.m86477a(this.f63050a).m86489a(EnumC14745gk.IntelligentHeartbeatUseInMobileNetworkBoolean.m85646a(), false)) {
                    return true;
                }
            } else if (this.f63052a.equals("W-NETWORK_ID_WIFI_DEFAULT") && !m86699g()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: a */
    public void m86702a(int i) {
        this.f63051a.edit().putLong(a.m86720j(), System.currentTimeMillis() + ((long) (i * 1000))).apply();
    }

    /* JADX INFO: renamed from: a */
    private boolean m86684a() {
        return this.f63053a.get() >= Math.max(C14837ah.m86477a(this.f63050a).m86481a(EnumC14745gk.IntelligentHeartbeatNATCountInt.m85646a(), 3), 3);
    }

    /* JADX INFO: renamed from: a */
    public long m86700a() {
        int iM86680a;
        long jM195232f = usq0.m195232f();
        if (this.f63060c && !m86687b() && ((C14837ah.m86477a(this.f63050a).m86489a(EnumC14745gk.IntelligentHeartbeatSwitchBoolean.m85646a(), true) || m86688c() >= System.currentTimeMillis()) && (iM86680a = m86680a()) != -1)) {
            jM195232f = iM86680a;
        }
        if (!TextUtils.isEmpty(this.f63052a) && !"WIFI-ID-UNKNOWN".equals(this.f63052a) && this.f63048a == 1) {
            m86683a(jM195232f < Constants.INBOX_V2_THROTTLE_WINDOW_MS);
        }
        this.f63055b = jM195232f;
        ilq0.m137040m("[HB] ping interval:" + jM195232f);
        return jM195232f;
    }

    /* JADX INFO: renamed from: a */
    private int m86680a() {
        if (!TextUtils.isEmpty(this.f63052a)) {
            try {
                return this.f63051a.getInt(a.m86710a(this.f63052a), -1);
            } catch (Throwable unused) {
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: a */
    private boolean m86685a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.startsWith("W-") || str.startsWith("M-");
    }

    /* JADX INFO: renamed from: a */
    private void m86683a(boolean z) {
        String strM86715e;
        if (m86690c()) {
            int iIncrementAndGet = (z ? this.f63057b : this.f63059c).incrementAndGet();
            String str = com.meituan.robust.Constants.LONG;
            ilq0.m137050w(String.format("[HB] %s ping interval count: %s", z ? com.meituan.robust.Constants.SHORT : com.meituan.robust.Constants.LONG, Integer.valueOf(iIncrementAndGet)));
            if (iIncrementAndGet >= 5) {
                if (z) {
                    strM86715e = a.m86714d();
                } else {
                    strM86715e = a.m86715e();
                }
                int i = this.f63051a.getInt(strM86715e, 0) + iIncrementAndGet;
                this.f63051a.edit().putInt(strM86715e, i).apply();
                if (z) {
                    str = com.meituan.robust.Constants.SHORT;
                }
                ilq0.m137040m(String.format("[HB] accumulate %s hb count(%s) and write to file. ", str, Integer.valueOf(i)));
                if (z) {
                    this.f63057b.set(0);
                } else {
                    this.f63059c.set(0);
                }
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public void m86701a() {
    }

    /* JADX INFO: renamed from: g */
    private boolean m86699g() {
        return C14837ah.m86477a(this.f63050a).m86489a(EnumC14745gk.IntelligentHeartbeatForUnsupportWifiDigestBoolean.m85646a(), true);
    }
}
