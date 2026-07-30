package p006l;

import android.annotation.SuppressLint;
import android.content.SharedPreferences;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.account.data.CameraCategory;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import com.tencent.mmkv.MMKV;
import java.util.HashMap;
import java.util.Map;
import l.fpd0;
import l.zpd0;

/* JADX INFO: renamed from: l.zh */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class C1521zh {

    /* JADX INFO: renamed from: h */
    public static volatile C1521zh f28744h;

    /* JADX INFO: renamed from: a */
    public Map<String, Double> f28745a;

    /* JADX INFO: renamed from: b */
    public a f28746b;

    /* JADX INFO: renamed from: c */
    public a f28747c = new a("account_is_first_get_category_state_sp_name");

    /* JADX INFO: renamed from: d */
    public a f28748d = new a("account_sp_first_camera_category_state");

    /* JADX INFO: renamed from: e */
    @Deprecated
    public rx.subjects.a<Boolean> f28749e;

    /* JADX INFO: renamed from: f */
    public rx.subjects.a<Boolean> f28750f;

    /* JADX INFO: renamed from: g */
    public rx.subjects.a<Boolean> f28751g;

    /* JADX INFO: renamed from: l.zh$a */
    @SuppressLint({"SavedBaseConstructorError"})
    public class a extends zpd0 {

        /* JADX INFO: renamed from: a */
        public SharedPreferences f28752a;

        public a(String str) {
            super("default_key", 0L, false, str);
            this.f28752a = pref();
        }

        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Long retrieveValue() {
            return Long.valueOf(this.f28752a.getLong(((fpd0) this).id, ((Long) ((fpd0) this).defaultValue).longValue()));
        }

        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public SharedPreferences.Editor saveValue(Long l2) {
            return this.f28752a.edit().putLong(((fpd0) this).id, l2.longValue());
        }

        /* JADX INFO: renamed from: d */
        public final double m28710d(String str) {
            try {
                String string = this.f28752a.getString(str, null);
                if (NullChecker.a(string)) {
                    return Double.valueOf(string).doubleValue();
                }
                return 0.0d;
            } catch (NumberFormatException e) {
                CrashHelper.c(e);
                return 0.0d;
            }
        }

        /* JADX INFO: renamed from: e */
        public Map<String, Double> m28711e() {
            String[] strArrAllKeys;
            HashMap map = new HashMap();
            MMKV mmkv = this.f28752a;
            if ((mmkv instanceof MMKV) && (strArrAllKeys = mmkv.allKeys()) != null && strArrAllKeys.length != 0) {
                for (String str : strArrAllKeys) {
                    String string = this.f28752a.getString(str, null);
                    if (NullChecker.b(str) && NullChecker.a(string)) {
                        map.put(str, Double.valueOf(string));
                    }
                }
            }
            return map;
        }

        /* JADX INFO: renamed from: f */
        public void m28712f(String str, double d) {
            this.f28752a.edit().putString(str, String.valueOf(d)).apply();
        }
    }

    public C1521zh() {
        this.f28745a = new HashMap();
        a aVar = new a("account_click_camera_category_state_sp_name");
        this.f28746b = aVar;
        this.f28745a = aVar.m28711e();
        this.f28749e = rx.subjects.a.c(Boolean.FALSE);
        this.f28750f = rx.subjects.a.b();
        this.f28751g = rx.subjects.a.b();
    }

    /* JADX INFO: renamed from: d */
    public static C1521zh m28702d() {
        if (f28744h == null) {
            synchronized (C1347uj.class) {
                try {
                    if (f28744h == null) {
                        f28744h = new C1521zh();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f28744h;
    }

    /* JADX INFO: renamed from: a */
    public boolean m28703a(@Nullable CameraCategory cameraCategory) {
        if (!NullChecker.a(cameraCategory) || !NullChecker.b(this.f28745a)) {
            return false;
        }
        Double d = this.f28745a.get(cameraCategory.f331id);
        return NullChecker.a(d) && m28704b(cameraCategory.f331id, 1) && cameraCategory.cameraUpdateTime > d.doubleValue() && C1347uj.m25232c().m25240i(cameraCategory.cameraUpdateTime);
    }

    /* JADX INFO: renamed from: b */
    public boolean m28704b(String str, int i) {
        return this.f28747c.m28710d(str) == ((double) i);
    }

    /* JADX INFO: renamed from: c */
    public void m28705c(String str) {
        this.f28747c.m28712f(str, 1.0d);
    }

    /* JADX INFO: renamed from: e */
    public void m28706e(String str, double d) {
        this.f28746b.m28712f(str, d);
        this.f28745a.put(str, Double.valueOf(d));
    }
}
