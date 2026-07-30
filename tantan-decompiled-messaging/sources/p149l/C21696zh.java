package p149l;

import android.annotation.SuppressLint;
import android.content.SharedPreferences;
import androidx.annotation.Nullable;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.p046p1.mobile.putong.account.data.CameraCategory;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import com.tencent.mmkv.MMKV;
import java.util.HashMap;
import java.util.Map;
import p133rx.subjects.C22392a;

/* JADX INFO: renamed from: l.zh */
/* JADX INFO: loaded from: classes9.dex */
public class C21696zh {

    /* JADX INFO: renamed from: h */
    public static volatile C21696zh f203111h;

    /* JADX INFO: renamed from: a */
    public Map<String, Double> f203112a;

    /* JADX INFO: renamed from: b */
    public a f203113b;

    /* JADX INFO: renamed from: c */
    public a f203114c = new a("account_is_first_get_category_state_sp_name");

    /* JADX INFO: renamed from: d */
    public a f203115d = new a("account_sp_first_camera_category_state");

    /* JADX INFO: renamed from: e */
    @Deprecated
    public C22392a<Boolean> f203116e;

    /* JADX INFO: renamed from: f */
    public C22392a<Boolean> f203117f;

    /* JADX INFO: renamed from: g */
    public C22392a<Boolean> f203118g;

    /* JADX INFO: renamed from: l.zh$a */
    @SuppressLint({"SavedBaseConstructorError"})
    public class a extends zpd0 {

        /* JADX INFO: renamed from: a */
        public SharedPreferences f203119a;

        public a(String str) {
            super("default_key", 0L, false, str);
            this.f203119a = pref();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p149l.zpd0, p149l.yqd0, p149l.fpd0
        /* JADX INFO: renamed from: a */
        public Long retrieveValue() {
            return Long.valueOf(this.f203119a.getLong(this.f98687id, ((Long) this.defaultValue).longValue()));
        }

        @Override // p149l.zpd0, p149l.yqd0, p149l.fpd0
        /* JADX INFO: renamed from: b */
        public SharedPreferences.Editor saveValue(Long l2) {
            return this.f203119a.edit().putLong(this.f98687id, l2.longValue());
        }

        /* JADX INFO: renamed from: d */
        public final double m218755d(String str) {
            try {
                String string = this.f203119a.getString(str, null);
                return NullChecker.m81303a(string) ? Double.valueOf(string).doubleValue() : FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
            } catch (NumberFormatException e) {
                CrashHelper.m81296c(e);
                return FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
            }
        }

        /* JADX INFO: renamed from: e */
        public Map<String, Double> m218756e() {
            String[] strArrAllKeys;
            HashMap map = new HashMap();
            SharedPreferences sharedPreferences = this.f203119a;
            if ((sharedPreferences instanceof MMKV) && (strArrAllKeys = ((MMKV) sharedPreferences).allKeys()) != null && strArrAllKeys.length != 0) {
                for (String str : strArrAllKeys) {
                    String string = this.f203119a.getString(str, null);
                    if (NullChecker.m81304b(str) && NullChecker.m81303a(string)) {
                        map.put(str, Double.valueOf(string));
                    }
                }
            }
            return map;
        }

        /* JADX INFO: renamed from: f */
        public void m218757f(String str, double d) {
            this.f203119a.edit().putString(str, String.valueOf(d)).apply();
        }
    }

    public C21696zh() {
        this.f203112a = new HashMap();
        a aVar = new a("account_click_camera_category_state_sp_name");
        this.f203113b = aVar;
        this.f203112a = aVar.m218756e();
        this.f203116e = C22392a.m221513c(Boolean.FALSE);
        this.f203117f = C22392a.m221512b();
        this.f203118g = C22392a.m221512b();
    }

    /* JADX INFO: renamed from: d */
    public static C21696zh m218749d() {
        if (f203111h == null) {
            synchronized (C20443uj.class) {
                try {
                    if (f203111h == null) {
                        f203111h = new C21696zh();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f203111h;
    }

    /* JADX INFO: renamed from: a */
    public boolean m218750a(@Nullable CameraCategory cameraCategory) {
        if (!NullChecker.m81303a(cameraCategory) || !NullChecker.m81304b(this.f203112a)) {
            return false;
        }
        Double d = this.f203112a.get(cameraCategory.f16342id);
        return NullChecker.m81303a(d) && m218751b(cameraCategory.f16342id, 1) && cameraCategory.cameraUpdateTime > d.doubleValue() && C20443uj.m193970c().m193978i(cameraCategory.cameraUpdateTime);
    }

    /* JADX INFO: renamed from: b */
    public boolean m218751b(String str, int i) {
        return this.f203114c.m218755d(str) == ((double) i);
    }

    /* JADX INFO: renamed from: c */
    public void m218752c(String str) {
        this.f203114c.m218757f(str, 1.0d);
    }

    /* JADX INFO: renamed from: e */
    public void m218753e(String str, double d) {
        this.f203113b.m218757f(str, d);
        this.f203112a.put(str, Double.valueOf(d));
    }
}
