package p007l;

import android.annotation.SuppressLint;
import android.content.SharedPreferences;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.feed.data.CameraCategory;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import com.tencent.mmkv.MMKV;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import l.fpd0;
import l.zpd0;
import rx.subjects.a;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class m84 {

    /* JADX INFO: renamed from: j */
    public static volatile m84 f10254j;

    /* JADX INFO: renamed from: a */
    public Map<String, Double> f10255a;

    /* JADX INFO: renamed from: b */
    public C2425a f10256b;

    /* JADX INFO: renamed from: c */
    public C2425a f10257c = new C2425a("IS_FIRST_GET_CATEGORY_STATE_SP_NAME");

    /* JADX INFO: renamed from: d */
    public C2425a f10258d = new C2425a("sp_first_camera_category_state");

    /* JADX INFO: renamed from: e */
    @Deprecated
    public a<Boolean> f10259e;

    /* JADX INFO: renamed from: f */
    public a<Boolean> f10260f;

    /* JADX INFO: renamed from: g */
    public a<Boolean> f10261g;

    /* JADX INFO: renamed from: h */
    public boolean f10262h;

    /* JADX INFO: renamed from: i */
    public double f10263i;

    /* JADX INFO: renamed from: l.m84$a */
    @SuppressLint({"SavedBaseConstructorError"})
    public class C2425a extends zpd0 {

        /* JADX INFO: renamed from: a */
        public SharedPreferences f10264a;

        public C2425a(String str) {
            super("default_key", 0L, false, str);
            this.f10264a = pref();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: d */
        public double m11859d(String str) {
            try {
                String string = this.f10264a.getString(str, null);
                if (NullChecker.a(string)) {
                    return Double.valueOf(string).doubleValue();
                }
                return 0.0d;
            } catch (NumberFormatException e) {
                CrashHelper.c(e);
                return 0.0d;
            }
        }

        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Long retrieveValue() {
            return Long.valueOf(this.f10264a.getLong(((fpd0) this).id, ((Long) ((fpd0) this).defaultValue).longValue()));
        }

        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public SharedPreferences.Editor saveValue(Long l2) {
            return this.f10264a.edit().putLong(((fpd0) this).id, l2.longValue());
        }

        /* JADX INFO: renamed from: e */
        public Map<String, Double> m11862e() {
            String[] strArrAllKeys;
            HashMap map = new HashMap();
            MMKV mmkv = this.f10264a;
            if ((mmkv instanceof MMKV) && (strArrAllKeys = mmkv.allKeys()) != null && strArrAllKeys.length != 0) {
                for (String str : strArrAllKeys) {
                    String string = this.f10264a.getString(str, null);
                    if (NullChecker.b(str) && NullChecker.a(string)) {
                        map.put(str, Double.valueOf(string));
                    }
                }
            }
            return map;
        }

        /* JADX INFO: renamed from: f */
        public void m11863f(String str, double d) {
            this.f10264a.edit().putString(str, String.valueOf(d)).apply();
        }
    }

    public m84() {
        this.f10255a = new HashMap();
        C2425a c2425a = new C2425a("click_camera_category_state_sp_name");
        this.f10256b = c2425a;
        this.f10255a = c2425a.m11862e();
        this.f10259e = a.c(Boolean.FALSE);
        this.f10260f = a.b();
        this.f10261g = a.b();
    }

    /* JADX INFO: renamed from: e */
    public static m84 m11844e() {
        if (f10254j == null) {
            synchronized (yb4.class) {
                try {
                    if (f10254j == null) {
                        f10254j = new m84();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f10254j;
    }

    /* JADX INFO: renamed from: a */
    public boolean m11845a(@Nullable CameraCategory cameraCategory) {
        if (!NullChecker.a(cameraCategory) || !NullChecker.b(this.f10255a)) {
            return false;
        }
        Double d = this.f10255a.get(cameraCategory.f678id);
        return NullChecker.a(d) && m11846b(cameraCategory.f678id, 1) && cameraCategory.cameraUpdateTime > d.doubleValue() && yb4.m17102c().m17110i(cameraCategory.cameraUpdateTime);
    }

    /* JADX INFO: renamed from: b */
    public boolean m11846b(String str, int i) {
        return this.f10257c.m11859d(str) == ((double) i);
    }

    /* JADX INFO: renamed from: c */
    public void m11847c(String str) {
        this.f10257c.m11863f(str, 1.0d);
    }

    /* JADX INFO: renamed from: d */
    public final boolean m11848d(boolean z, int i, double d) {
        return z && this.f10258d.m11859d(String.valueOf(i)) < d;
    }

    /* JADX INFO: renamed from: f */
    public final double m11849f(String str) {
        Double d = this.f10255a.get(str);
        if (NullChecker.a(d)) {
            return d.doubleValue();
        }
        return 0.0d;
    }

    /* JADX INFO: renamed from: g */
    public final CameraCategory m11850g(List<CameraCategory> list) {
        double d = 0.0d;
        CameraCategory cameraCategory = null;
        for (CameraCategory cameraCategory2 : list) {
            if (NullChecker.b(cameraCategory2)) {
                double d2 = cameraCategory2.cameraUpdateTime;
                if (d2 > d) {
                    cameraCategory = cameraCategory2;
                    d = d2;
                }
            }
        }
        return cameraCategory;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m11851h(double d) {
        double dM11859d = this.f10258d.m11859d(String.valueOf(2));
        if (NullChecker.b(Double.valueOf(dM11859d)) && dM11859d != 0.0d) {
            return dM11859d < d;
        }
        m11856m(2, d);
        return false;
    }

    /* JADX INFO: renamed from: i */
    public void m11852i(String str, double d) {
        this.f10256b.m11863f(str, d);
        this.f10255a.put(str, Double.valueOf(d));
    }

    /* JADX INFO: renamed from: j */
    public void m11853j() {
        if (this.f10262h) {
            this.f10262h = false;
            this.f10259e.onNext(false);
            m11856m(0, this.f10263i);
        }
    }

    /* JADX INFO: renamed from: k */
    public void m11854k() {
        this.f10261g.onNext(Boolean.FALSE);
        m11856m(1, this.f10263i);
    }

    /* JADX INFO: renamed from: l */
    public void m11855l() {
        this.f10260f.onNext(Boolean.FALSE);
        m11856m(2, this.f10263i);
    }

    /* JADX INFO: renamed from: m */
    public final void m11856m(int i, double d) {
        this.f10258d.m11863f(String.valueOf(i), d);
    }

    /* JADX INFO: renamed from: n */
    public boolean m11857n(@Nullable List<CameraCategory> list) {
        if (list == null) {
            return false;
        }
        CameraCategory cameraCategoryM11850g = m11850g(list);
        if (NullChecker.a(cameraCategoryM11850g) && m11849f(cameraCategoryM11850g.f678id) != 0.0d && yb4.m17102c().m17110i(cameraCategoryM11850g.cameraUpdateTime)) {
            double d = cameraCategoryM11850g.cameraUpdateTime;
            this.f10263i = d;
            boolean zM11851h = m11851h(d);
            this.f10262h = zM11851h;
            this.f10259e.onNext(Boolean.valueOf(m11848d(zM11851h, 0, this.f10263i)));
            this.f10261g.onNext(Boolean.valueOf(m11848d(this.f10262h, 1, this.f10263i)));
            this.f10260f.onNext(Boolean.valueOf(this.f10262h));
        } else {
            this.f10259e.onNext(Boolean.FALSE);
        }
        return this.f10262h;
    }
}
