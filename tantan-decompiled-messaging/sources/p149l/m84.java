package p149l;

import android.annotation.SuppressLint;
import android.content.SharedPreferences;
import androidx.annotation.Nullable;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.p046p1.mobile.putong.feed.data.CameraCategory;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import com.tencent.mmkv.MMKV;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p133rx.subjects.C22392a;

/* JADX INFO: loaded from: classes12.dex */
public class m84 {

    /* JADX INFO: renamed from: j */
    public static volatile m84 f132509j;

    /* JADX INFO: renamed from: a */
    public Map<String, Double> f132510a;

    /* JADX INFO: renamed from: b */
    public C18415a f132511b;

    /* JADX INFO: renamed from: c */
    public C18415a f132512c = new C18415a("IS_FIRST_GET_CATEGORY_STATE_SP_NAME");

    /* JADX INFO: renamed from: d */
    public C18415a f132513d = new C18415a("sp_first_camera_category_state");

    /* JADX INFO: renamed from: e */
    @Deprecated
    public C22392a<Boolean> f132514e;

    /* JADX INFO: renamed from: f */
    public C22392a<Boolean> f132515f;

    /* JADX INFO: renamed from: g */
    public C22392a<Boolean> f132516g;

    /* JADX INFO: renamed from: h */
    public boolean f132517h;

    /* JADX INFO: renamed from: i */
    public double f132518i;

    /* JADX INFO: renamed from: l.m84$a */
    @SuppressLint({"SavedBaseConstructorError"})
    public class C18415a extends zpd0 {

        /* JADX INFO: renamed from: a */
        public SharedPreferences f132519a;

        public C18415a(String str) {
            super("default_key", 0L, false, str);
            this.f132519a = pref();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: d */
        public double m153444d(String str) {
            try {
                String string = this.f132519a.getString(str, null);
                return NullChecker.m81303a(string) ? Double.valueOf(string).doubleValue() : FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
            } catch (NumberFormatException e) {
                CrashHelper.m81296c(e);
                return FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p149l.zpd0, p149l.yqd0, p149l.fpd0
        /* JADX INFO: renamed from: a */
        public Long retrieveValue() {
            return Long.valueOf(this.f132519a.getLong(this.f98687id, ((Long) this.defaultValue).longValue()));
        }

        @Override // p149l.zpd0, p149l.yqd0, p149l.fpd0
        /* JADX INFO: renamed from: b */
        public SharedPreferences.Editor saveValue(Long l2) {
            return this.f132519a.edit().putLong(this.f98687id, l2.longValue());
        }

        /* JADX INFO: renamed from: e */
        public Map<String, Double> m153447e() {
            String[] strArrAllKeys;
            HashMap map = new HashMap();
            SharedPreferences sharedPreferences = this.f132519a;
            if ((sharedPreferences instanceof MMKV) && (strArrAllKeys = ((MMKV) sharedPreferences).allKeys()) != null && strArrAllKeys.length != 0) {
                for (String str : strArrAllKeys) {
                    String string = this.f132519a.getString(str, null);
                    if (NullChecker.m81304b(str) && NullChecker.m81303a(string)) {
                        map.put(str, Double.valueOf(string));
                    }
                }
            }
            return map;
        }

        /* JADX INFO: renamed from: f */
        public void m153448f(String str, double d) {
            this.f132519a.edit().putString(str, String.valueOf(d)).apply();
        }
    }

    public m84() {
        this.f132510a = new HashMap();
        C18415a c18415a = new C18415a("click_camera_category_state_sp_name");
        this.f132511b = c18415a;
        this.f132510a = c18415a.m153447e();
        this.f132514e = C22392a.m221513c(Boolean.FALSE);
        this.f132515f = C22392a.m221512b();
        this.f132516g = C22392a.m221512b();
    }

    /* JADX INFO: renamed from: e */
    public static m84 m153429e() {
        if (f132509j == null) {
            synchronized (yb4.class) {
                try {
                    if (f132509j == null) {
                        f132509j = new m84();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f132509j;
    }

    /* JADX INFO: renamed from: a */
    public boolean m153430a(@Nullable CameraCategory cameraCategory) {
        if (!NullChecker.m81303a(cameraCategory) || !NullChecker.m81304b(this.f132510a)) {
            return false;
        }
        Double d = this.f132510a.get(cameraCategory.f39217id);
        return NullChecker.m81303a(d) && m153431b(cameraCategory.f39217id, 1) && cameraCategory.cameraUpdateTime > d.doubleValue() && yb4.m213936c().m213944i(cameraCategory.cameraUpdateTime);
    }

    /* JADX INFO: renamed from: b */
    public boolean m153431b(String str, int i) {
        return this.f132512c.m153444d(str) == ((double) i);
    }

    /* JADX INFO: renamed from: c */
    public void m153432c(String str) {
        this.f132512c.m153448f(str, 1.0d);
    }

    /* JADX INFO: renamed from: d */
    public final boolean m153433d(boolean z, int i, double d) {
        return z && this.f132513d.m153444d(String.valueOf(i)) < d;
    }

    /* JADX INFO: renamed from: f */
    public final double m153434f(String str) {
        Double d = this.f132510a.get(str);
        return NullChecker.m81303a(d) ? d.doubleValue() : FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
    }

    /* JADX INFO: renamed from: g */
    public final CameraCategory m153435g(List<CameraCategory> list) {
        double d = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
        CameraCategory cameraCategory = null;
        for (CameraCategory cameraCategory2 : list) {
            if (NullChecker.m81304b(cameraCategory2)) {
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
    public final boolean m153436h(double d) {
        double dM153444d = this.f132513d.m153444d(String.valueOf(2));
        if (NullChecker.m81304b(Double.valueOf(dM153444d)) && dM153444d != FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            return dM153444d < d;
        }
        m153441m(2, d);
        return false;
    }

    /* JADX INFO: renamed from: i */
    public void m153437i(String str, double d) {
        this.f132511b.m153448f(str, d);
        this.f132510a.put(str, Double.valueOf(d));
    }

    /* JADX INFO: renamed from: j */
    public void m153438j() {
        if (this.f132517h) {
            this.f132517h = false;
            this.f132514e.onNext(false);
            m153441m(0, this.f132518i);
        }
    }

    /* JADX INFO: renamed from: k */
    public void m153439k() {
        this.f132516g.onNext(Boolean.FALSE);
        m153441m(1, this.f132518i);
    }

    /* JADX INFO: renamed from: l */
    public void m153440l() {
        this.f132515f.onNext(Boolean.FALSE);
        m153441m(2, this.f132518i);
    }

    /* JADX INFO: renamed from: m */
    public final void m153441m(int i, double d) {
        this.f132513d.m153448f(String.valueOf(i), d);
    }

    /* JADX INFO: renamed from: n */
    public boolean m153442n(@Nullable List<CameraCategory> list) {
        if (list == null) {
            return false;
        }
        CameraCategory cameraCategoryM153435g = m153435g(list);
        if (NullChecker.m81303a(cameraCategoryM153435g) && m153434f(cameraCategoryM153435g.f39217id) != FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE && yb4.m213936c().m213944i(cameraCategoryM153435g.cameraUpdateTime)) {
            double d = cameraCategoryM153435g.cameraUpdateTime;
            this.f132518i = d;
            boolean zM153436h = m153436h(d);
            this.f132517h = zM153436h;
            this.f132514e.onNext(Boolean.valueOf(m153433d(zM153436h, 0, this.f132518i)));
            this.f132516g.onNext(Boolean.valueOf(m153433d(this.f132517h, 1, this.f132518i)));
            this.f132515f.onNext(Boolean.valueOf(this.f132517h));
        } else {
            this.f132514e.onNext(Boolean.FALSE);
        }
        return this.f132517h;
    }
}
