package p153l;

import android.annotation.SuppressLint;
import android.content.SharedPreferences;
import androidx.annotation.Nullable;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.p051p1.mobile.putong.feed.data.CameraCategory;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import com.tencent.mmkv.MMKV;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p137rx.subjects.C22507a;

/* JADX INFO: loaded from: classes13.dex */
public class l94 {

    /* JADX INFO: renamed from: j */
    public static volatile l94 f130540j;

    /* JADX INFO: renamed from: a */
    public Map<String, Double> f130541a;

    /* JADX INFO: renamed from: b */
    public C18368a f130542b;

    /* JADX INFO: renamed from: c */
    public C18368a f130543c = new C18368a("IS_FIRST_GET_CATEGORY_STATE_SP_NAME");

    /* JADX INFO: renamed from: d */
    public C18368a f130544d = new C18368a("sp_first_camera_category_state");

    /* JADX INFO: renamed from: e */
    @Deprecated
    public C22507a<Boolean> f130545e;

    /* JADX INFO: renamed from: f */
    public C22507a<Boolean> f130546f;

    /* JADX INFO: renamed from: g */
    public C22507a<Boolean> f130547g;

    /* JADX INFO: renamed from: h */
    public boolean f130548h;

    /* JADX INFO: renamed from: i */
    public double f130549i;

    /* JADX INFO: renamed from: l.l94$a */
    @SuppressLint({"SavedBaseConstructorError"})
    public class C18368a extends byd0 {

        /* JADX INFO: renamed from: a */
        public SharedPreferences f130550a;

        public C18368a(String str) {
            super("default_key", 0L, false, str);
            this.f130550a = pref();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: d */
        public double m153324d(String str) {
            try {
                String string = this.f130550a.getString(str, null);
                return NullChecker.m82486a(string) ? Double.valueOf(string).doubleValue() : FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
            } catch (NumberFormatException e) {
                CrashHelper.m82479c(e);
                return FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p153l.byd0, p153l.azd0, p153l.hxd0
        /* JADX INFO: renamed from: a */
        public Long retrieveValue() {
            return Long.valueOf(this.f130550a.getLong(this.f111993id, ((Long) this.defaultValue).longValue()));
        }

        @Override // p153l.byd0, p153l.azd0, p153l.hxd0
        /* JADX INFO: renamed from: b */
        public SharedPreferences.Editor saveValue(Long l2) {
            return this.f130550a.edit().putLong(this.f111993id, l2.longValue());
        }

        /* JADX INFO: renamed from: e */
        public Map<String, Double> m153325e() {
            String[] strArrAllKeys;
            HashMap map = new HashMap();
            SharedPreferences sharedPreferences = this.f130550a;
            if ((sharedPreferences instanceof MMKV) && (strArrAllKeys = ((MMKV) sharedPreferences).allKeys()) != null && strArrAllKeys.length != 0) {
                for (String str : strArrAllKeys) {
                    String string = this.f130550a.getString(str, null);
                    if (NullChecker.m82487b(str) && NullChecker.m82486a(string)) {
                        map.put(str, Double.valueOf(string));
                    }
                }
            }
            return map;
        }

        /* JADX INFO: renamed from: f */
        public void m153326f(String str, double d) {
            this.f130550a.edit().putString(str, String.valueOf(d)).apply();
        }
    }

    public l94() {
        this.f130541a = new HashMap();
        C18368a c18368a = new C18368a("click_camera_category_state_sp_name");
        this.f130542b = c18368a;
        this.f130541a = c18368a.m153325e();
        this.f130545e = C22507a.m222759c(Boolean.FALSE);
        this.f130546f = C22507a.m222758b();
        this.f130547g = C22507a.m222758b();
    }

    /* JADX INFO: renamed from: e */
    public static l94 m153309e() {
        if (f130540j == null) {
            synchronized (xc4.class) {
                try {
                    if (f130540j == null) {
                        f130540j = new l94();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f130540j;
    }

    /* JADX INFO: renamed from: a */
    public boolean m153310a(@Nullable CameraCategory cameraCategory) {
        if (!NullChecker.m82486a(cameraCategory) || !NullChecker.m82487b(this.f130541a)) {
            return false;
        }
        Double d = this.f130541a.get(cameraCategory.f40065id);
        return NullChecker.m82486a(d) && m153311b(cameraCategory.f40065id, 1) && cameraCategory.cameraUpdateTime > d.doubleValue() && xc4.m210114c().m210122i(cameraCategory.cameraUpdateTime);
    }

    /* JADX INFO: renamed from: b */
    public boolean m153311b(String str, int i) {
        return this.f130543c.m153324d(str) == ((double) i);
    }

    /* JADX INFO: renamed from: c */
    public void m153312c(String str) {
        this.f130543c.m153326f(str, 1.0d);
    }

    /* JADX INFO: renamed from: d */
    public final boolean m153313d(boolean z, int i, double d) {
        return z && this.f130544d.m153324d(String.valueOf(i)) < d;
    }

    /* JADX INFO: renamed from: f */
    public final double m153314f(String str) {
        Double d = this.f130541a.get(str);
        return NullChecker.m82486a(d) ? d.doubleValue() : FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
    }

    /* JADX INFO: renamed from: g */
    public final CameraCategory m153315g(List<CameraCategory> list) {
        double d = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
        CameraCategory cameraCategory = null;
        for (CameraCategory cameraCategory2 : list) {
            if (NullChecker.m82487b(cameraCategory2)) {
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
    public final boolean m153316h(double d) {
        double dM153324d = this.f130544d.m153324d(String.valueOf(2));
        if (NullChecker.m82487b(Double.valueOf(dM153324d)) && dM153324d != FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            return dM153324d < d;
        }
        m153321m(2, d);
        return false;
    }

    /* JADX INFO: renamed from: i */
    public void m153317i(String str, double d) {
        this.f130542b.m153326f(str, d);
        this.f130541a.put(str, Double.valueOf(d));
    }

    /* JADX INFO: renamed from: j */
    public void m153318j() {
        if (this.f130548h) {
            this.f130548h = false;
            this.f130545e.onNext(false);
            m153321m(0, this.f130549i);
        }
    }

    /* JADX INFO: renamed from: k */
    public void m153319k() {
        this.f130547g.onNext(Boolean.FALSE);
        m153321m(1, this.f130549i);
    }

    /* JADX INFO: renamed from: l */
    public void m153320l() {
        this.f130546f.onNext(Boolean.FALSE);
        m153321m(2, this.f130549i);
    }

    /* JADX INFO: renamed from: m */
    public final void m153321m(int i, double d) {
        this.f130544d.m153326f(String.valueOf(i), d);
    }

    /* JADX INFO: renamed from: n */
    public boolean m153322n(@Nullable List<CameraCategory> list) {
        if (list == null) {
            return false;
        }
        CameraCategory cameraCategoryM153315g = m153315g(list);
        if (NullChecker.m82486a(cameraCategoryM153315g) && m153314f(cameraCategoryM153315g.f40065id) != FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE && xc4.m210114c().m210122i(cameraCategoryM153315g.cameraUpdateTime)) {
            double d = cameraCategoryM153315g.cameraUpdateTime;
            this.f130549i = d;
            boolean zM153316h = m153316h(d);
            this.f130548h = zM153316h;
            this.f130545e.onNext(Boolean.valueOf(m153313d(zM153316h, 0, this.f130549i)));
            this.f130547g.onNext(Boolean.valueOf(m153313d(this.f130548h, 1, this.f130549i)));
            this.f130546f.onNext(Boolean.valueOf(this.f130548h));
        } else {
            this.f130545e.onNext(Boolean.FALSE);
        }
        return this.f130548h;
    }
}
