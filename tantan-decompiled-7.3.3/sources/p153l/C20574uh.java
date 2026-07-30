package p153l;

import android.annotation.SuppressLint;
import android.content.SharedPreferences;
import androidx.annotation.Nullable;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.p051p1.mobile.putong.account.data.CameraCategory;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import com.tencent.mmkv.MMKV;
import java.util.HashMap;
import java.util.Map;
import p137rx.subjects.C22507a;

/* JADX INFO: renamed from: l.uh */
/* JADX INFO: loaded from: classes9.dex */
public class C20574uh {

    /* JADX INFO: renamed from: h */
    public static volatile C20574uh f178973h;

    /* JADX INFO: renamed from: a */
    public Map<String, Double> f178974a;

    /* JADX INFO: renamed from: b */
    public a f178975b;

    /* JADX INFO: renamed from: c */
    public a f178976c = new a("account_is_first_get_category_state_sp_name");

    /* JADX INFO: renamed from: d */
    public a f178977d = new a("account_sp_first_camera_category_state");

    /* JADX INFO: renamed from: e */
    @Deprecated
    public C22507a<Boolean> f178978e;

    /* JADX INFO: renamed from: f */
    public C22507a<Boolean> f178979f;

    /* JADX INFO: renamed from: g */
    public C22507a<Boolean> f178980g;

    /* JADX INFO: renamed from: l.uh$a */
    @SuppressLint({"SavedBaseConstructorError"})
    public class a extends byd0 {

        /* JADX INFO: renamed from: a */
        public SharedPreferences f178981a;

        public a(String str) {
            super("default_key", 0L, false, str);
            this.f178981a = pref();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p153l.byd0, p153l.azd0, p153l.hxd0
        /* JADX INFO: renamed from: a */
        public Long retrieveValue() {
            return Long.valueOf(this.f178981a.getLong(this.f111993id, ((Long) this.defaultValue).longValue()));
        }

        @Override // p153l.byd0, p153l.azd0, p153l.hxd0
        /* JADX INFO: renamed from: b */
        public SharedPreferences.Editor saveValue(Long l2) {
            return this.f178981a.edit().putLong(this.f111993id, l2.longValue());
        }

        /* JADX INFO: renamed from: d */
        public final double m196011d(String str) {
            try {
                String string = this.f178981a.getString(str, null);
                return NullChecker.m82486a(string) ? Double.valueOf(string).doubleValue() : FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
            } catch (NumberFormatException e) {
                CrashHelper.m82479c(e);
                return FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
            }
        }

        /* JADX INFO: renamed from: e */
        public Map<String, Double> m196012e() {
            String[] strArrAllKeys;
            HashMap map = new HashMap();
            SharedPreferences sharedPreferences = this.f178981a;
            if ((sharedPreferences instanceof MMKV) && (strArrAllKeys = ((MMKV) sharedPreferences).allKeys()) != null && strArrAllKeys.length != 0) {
                for (String str : strArrAllKeys) {
                    String string = this.f178981a.getString(str, null);
                    if (NullChecker.m82487b(str) && NullChecker.m82486a(string)) {
                        map.put(str, Double.valueOf(string));
                    }
                }
            }
            return map;
        }

        /* JADX INFO: renamed from: f */
        public void m196013f(String str, double d) {
            this.f178981a.edit().putString(str, String.valueOf(d)).apply();
        }
    }

    public C20574uh() {
        this.f178974a = new HashMap();
        a aVar = new a("account_click_camera_category_state_sp_name");
        this.f178975b = aVar;
        this.f178974a = aVar.m196012e();
        this.f178978e = C22507a.m222759c(Boolean.FALSE);
        this.f178979f = C22507a.m222758b();
        this.f178980g = C22507a.m222758b();
    }

    /* JADX INFO: renamed from: d */
    public static C20574uh m196005d() {
        if (f178973h == null) {
            synchronized (C19376pj.class) {
                try {
                    if (f178973h == null) {
                        f178973h = new C20574uh();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f178973h;
    }

    /* JADX INFO: renamed from: a */
    public boolean m196006a(@Nullable CameraCategory cameraCategory) {
        if (!NullChecker.m82486a(cameraCategory) || !NullChecker.m82487b(this.f178974a)) {
            return false;
        }
        Double d = this.f178974a.get(cameraCategory.f17061id);
        return NullChecker.m82486a(d) && m196007b(cameraCategory.f17061id, 1) && cameraCategory.cameraUpdateTime > d.doubleValue() && C19376pj.m172465c().m172473i(cameraCategory.cameraUpdateTime);
    }

    /* JADX INFO: renamed from: b */
    public boolean m196007b(String str, int i) {
        return this.f178976c.m196011d(str) == ((double) i);
    }

    /* JADX INFO: renamed from: c */
    public void m196008c(String str) {
        this.f178976c.m196013f(str, 1.0d);
    }

    /* JADX INFO: renamed from: e */
    public void m196009e(String str, double d) {
        this.f178975b.m196013f(str, d);
        this.f178974a.put(str, Double.valueOf(d));
    }
}
