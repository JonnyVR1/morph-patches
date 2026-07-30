package p149l;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class e8s0 {

    /* JADX INFO: renamed from: a */
    public final List f89860a = new LinkedList();

    /* JADX INFO: renamed from: b */
    public final Map f89861b;

    /* JADX INFO: renamed from: c */
    public final Object f89862c;

    public e8s0(boolean z, String str, String str2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f89861b = linkedHashMap;
        this.f89862c = new Object();
        linkedHashMap.put("action", "make_wv");
        linkedHashMap.put(FirebaseAnalytics.Param.AD_FORMAT, str2);
    }

    /* JADX INFO: renamed from: f */
    public static final b8s0 m115278f() {
        return new b8s0(vny0.m199064b().elapsedRealtime(), null, null);
    }

    /* JADX INFO: renamed from: a */
    public final d8s0 m115279a() {
        d8s0 d8s0Var;
        boolean zBooleanValue = ((Boolean) d1s0.m109677c().m144697a(m7s0.f132038Q1)).booleanValue();
        StringBuilder sb = new StringBuilder();
        HashMap map = new HashMap();
        synchronized (this.f89862c) {
            try {
                for (b8s0 b8s0Var : this.f89860a) {
                    long jM100789a = b8s0Var.m100789a();
                    String strM100791c = b8s0Var.m100791c();
                    b8s0 b8s0VarM100790b = b8s0Var.m100790b();
                    if (b8s0VarM100790b != null && jM100789a > 0) {
                        long jM100789a2 = jM100789a - b8s0VarM100790b.m100789a();
                        sb.append(strM100791c);
                        sb.append('.');
                        sb.append(jM100789a2);
                        sb.append(',');
                        if (zBooleanValue) {
                            if (map.containsKey(Long.valueOf(b8s0VarM100790b.m100789a()))) {
                                StringBuilder sb2 = (StringBuilder) map.get(Long.valueOf(b8s0VarM100790b.m100789a()));
                                sb2.append('+');
                                sb2.append(strM100791c);
                            } else {
                                map.put(Long.valueOf(b8s0VarM100790b.m100789a()), new StringBuilder(strM100791c));
                            }
                        }
                    }
                }
                this.f89860a.clear();
                String string = null;
                if (!TextUtils.isEmpty(null)) {
                    sb.append((String) null);
                } else if (sb.length() > 0) {
                    sb.setLength(sb.length() - 1);
                }
                StringBuilder sb3 = new StringBuilder();
                if (zBooleanValue) {
                    for (Map.Entry entry : map.entrySet()) {
                        sb3.append((CharSequence) entry.getValue());
                        sb3.append('.');
                        sb3.append(vny0.m199064b().currentTimeMillis() + (((Long) entry.getKey()).longValue() - vny0.m199064b().elapsedRealtime()));
                        sb3.append(',');
                    }
                    if (sb3.length() > 0) {
                        sb3.setLength(sb3.length() - 1);
                    }
                    string = sb3.toString();
                }
                d8s0Var = new d8s0(sb.toString(), string);
            } catch (Throwable th) {
                throw th;
            }
        }
        return d8s0Var;
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: b */
    public final Map m115280b() {
        Map map;
        synchronized (this.f89862c) {
            vny0.m199079q().m212277g();
            map = this.f89861b;
        }
        return map;
    }

    /* JADX INFO: renamed from: c */
    public final void m115281c(@Nullable e8s0 e8s0Var) {
        synchronized (this.f89862c) {
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m115282d(String str, String str2) {
        u7s0 u7s0VarM212277g;
        if (TextUtils.isEmpty(str2) || (u7s0VarM212277g = vny0.m199079q().m212277g()) == null) {
            return;
        }
        synchronized (this.f89862c) {
            a8s0 a8s0VarM192158a = u7s0VarM212277g.m192158a(str);
            Map map = this.f89861b;
            map.put(str, a8s0VarM192158a.mo95361a((String) map.get(str), str2));
        }
    }

    /* JADX INFO: renamed from: e */
    public final boolean m115283e(b8s0 b8s0Var, long j, String... strArr) {
        synchronized (this.f89862c) {
            for (int i = 0; i <= 0; i++) {
                try {
                    this.f89860a.add(new b8s0(j, strArr[i], b8s0Var));
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return true;
    }
}
