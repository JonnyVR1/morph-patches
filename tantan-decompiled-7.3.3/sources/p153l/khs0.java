package p153l;

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
public final class khs0 {

    /* JADX INFO: renamed from: a */
    public final List f126905a = new LinkedList();

    /* JADX INFO: renamed from: b */
    public final Map f126906b;

    /* JADX INFO: renamed from: c */
    public final Object f126907c;

    public khs0(boolean z, String str, String str2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f126906b = linkedHashMap;
        this.f126907c = new Object();
        linkedHashMap.put("action", "make_wv");
        linkedHashMap.put(FirebaseAnalytics.Param.AD_FORMAT, str2);
    }

    /* JADX INFO: renamed from: f */
    public static final hhs0 m149817f() {
        return new hhs0(bxy0.m106918b().elapsedRealtime(), null, null);
    }

    /* JADX INFO: renamed from: a */
    public final jhs0 m149818a() {
        jhs0 jhs0Var;
        boolean zBooleanValue = ((Boolean) jas0.m144075c().m176505a(sgs0.f168109Q1)).booleanValue();
        StringBuilder sb = new StringBuilder();
        HashMap map = new HashMap();
        synchronized (this.f126907c) {
            try {
                for (hhs0 hhs0Var : this.f126905a) {
                    long jM135075a = hhs0Var.m135075a();
                    String strM135077c = hhs0Var.m135077c();
                    hhs0 hhs0VarM135076b = hhs0Var.m135076b();
                    if (hhs0VarM135076b != null && jM135075a > 0) {
                        long jM135075a2 = jM135075a - hhs0VarM135076b.m135075a();
                        sb.append(strM135077c);
                        sb.append('.');
                        sb.append(jM135075a2);
                        sb.append(',');
                        if (zBooleanValue) {
                            if (map.containsKey(Long.valueOf(hhs0VarM135076b.m135075a()))) {
                                StringBuilder sb2 = (StringBuilder) map.get(Long.valueOf(hhs0VarM135076b.m135075a()));
                                sb2.append('+');
                                sb2.append(strM135077c);
                            } else {
                                map.put(Long.valueOf(hhs0VarM135076b.m135075a()), new StringBuilder(strM135077c));
                            }
                        }
                    }
                }
                this.f126905a.clear();
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
                        sb3.append(bxy0.m106918b().currentTimeMillis() + (((Long) entry.getKey()).longValue() - bxy0.m106918b().elapsedRealtime()));
                        sb3.append(',');
                    }
                    if (sb3.length() > 0) {
                        sb3.setLength(sb3.length() - 1);
                    }
                    string = sb3.toString();
                }
                jhs0Var = new jhs0(sb.toString(), string);
            } catch (Throwable th) {
                throw th;
            }
        }
        return jhs0Var;
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: b */
    public final Map m149819b() {
        Map map;
        synchronized (this.f126907c) {
            bxy0.m106933q().m120262g();
            map = this.f126906b;
        }
        return map;
    }

    /* JADX INFO: renamed from: c */
    public final void m149820c(@Nullable khs0 khs0Var) {
        synchronized (this.f126907c) {
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m149821d(String str, String str2) {
        ahs0 ahs0VarM120262g;
        if (TextUtils.isEmpty(str2) || (ahs0VarM120262g = bxy0.m106933q().m120262g()) == null) {
            return;
        }
        synchronized (this.f126907c) {
            ghs0 ghs0VarM97912a = ahs0VarM120262g.m97912a(str);
            Map map = this.f126906b;
            map.put(str, ghs0VarM97912a.mo115811a((String) map.get(str), str2));
        }
    }

    /* JADX INFO: renamed from: e */
    public final boolean m149822e(hhs0 hhs0Var, long j, String... strArr) {
        synchronized (this.f126907c) {
            for (int i = 0; i <= 0; i++) {
                try {
                    this.f126905a.add(new hhs0(j, strArr[i], hhs0Var));
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return true;
    }
}
