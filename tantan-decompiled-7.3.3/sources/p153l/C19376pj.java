package p153l;

import android.annotation.SuppressLint;
import android.content.SharedPreferences;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.p051p1.mobile.putong.account.data.CameraSticker;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p137rx.subjects.C22507a;

/* JADX INFO: renamed from: l.pj */
/* JADX INFO: loaded from: classes9.dex */
public class C19376pj {

    /* JADX INFO: renamed from: i */
    public static volatile C19376pj f152632i;

    /* JADX INFO: renamed from: e */
    public CameraSticker f152637e;

    /* JADX INFO: renamed from: h */
    public CameraSticker f152640h;

    /* JADX INFO: renamed from: b */
    public a f152634b = new a("account_sp_sticker_click_state");

    /* JADX INFO: renamed from: a */
    public HashMap<String, Integer> f152633a = new HashMap<>();

    /* JADX INFO: renamed from: g */
    public Map<String, CameraSticker> f152639g = new HashMap();

    /* JADX INFO: renamed from: d */
    public C22507a<Boolean> f152636d = C22507a.m222758b();

    /* JADX INFO: renamed from: f */
    public C22507a<CameraSticker> f152638f = C22507a.m222758b();

    /* JADX INFO: renamed from: c */
    public mxd0 f152635c = new mxd0("account_sp_sticker_max_create_time", FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE);

    /* JADX INFO: renamed from: l.pj$a */
    @SuppressLint({"SavedBaseConstructorError"})
    public class a extends vxd0 {

        /* JADX INFO: renamed from: a */
        public SharedPreferences f152641a;

        public a(String str) {
            super("default_key", -1, false, str);
            this.f152641a = pref();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p153l.vxd0, p153l.azd0, p153l.hxd0
        /* JADX INFO: renamed from: b */
        public Integer retrieveValue() {
            return Integer.valueOf(this.f152641a.getInt(this.f111993id, ((Integer) this.defaultValue).intValue()));
        }

        @Override // p153l.vxd0, p153l.azd0, p153l.hxd0
        /* JADX INFO: renamed from: c */
        public SharedPreferences.Editor saveValue(Integer num) {
            return this.f152641a.edit().putInt(this.f111993id, num.intValue());
        }

        /* JADX INFO: renamed from: d */
        public int m172480d(String str, int i) {
            return this.f152641a.getInt(str, i);
        }

        /* JADX INFO: renamed from: e */
        public void m172481e(String str, int i) {
            this.f152641a.edit().putInt(str, i).apply();
        }
    }

    /* JADX INFO: renamed from: c */
    public static C19376pj m172465c() {
        if (f152632i == null) {
            synchronized (C19376pj.class) {
                try {
                    if (f152632i == null) {
                        f152632i = new C19376pj();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f152632i;
    }

    /* JADX INFO: renamed from: a */
    public void m172466a(@NonNull CameraSticker cameraSticker) {
        m172475k(cameraSticker.f17063id);
    }

    /* JADX INFO: renamed from: b */
    public CameraSticker m172467b() {
        return this.f152640h;
    }

    /* JADX INFO: renamed from: d */
    public Map<String, CameraSticker> m172468d() {
        return this.f152639g;
    }

    @Nullable
    /* JADX INFO: renamed from: e */
    public CameraSticker m172469e() {
        return this.f152637e;
    }

    /* JADX INFO: renamed from: f */
    public void m172470f(List<CameraSticker> list) {
        if (NullChecker.m82486a(list)) {
            for (CameraSticker cameraSticker : list) {
                if (cameraSticker != null) {
                    HashMap<String, Integer> map = this.f152633a;
                    String str = cameraSticker.f17063id;
                    map.put(str, Integer.valueOf(this.f152634b.m172480d(str, map.get(str) == null ? 0 : this.f152633a.get(cameraSticker.f17063id).intValue())));
                }
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public boolean m172471g(CameraSticker cameraSticker) {
        return NullChecker.m82486a(cameraSticker) && NullChecker.m82486a(this.f152633a.get(cameraSticker.f17063id)) && this.f152633a.get(cameraSticker.f17063id).intValue() == 1;
    }

    /* JADX INFO: renamed from: h */
    public boolean m172472h(CameraSticker cameraSticker, CameraSticker cameraSticker2) {
        return (cameraSticker == null || m172471g(cameraSticker) || cameraSticker.hasModelFile || !m172473i(cameraSticker.updateTime)) ? false : true;
    }

    /* JADX INFO: renamed from: i */
    public boolean m172473i(double d) {
        return ((double) System.currentTimeMillis()) - d < 6.048E8d;
    }

    /* JADX INFO: renamed from: j */
    public void m172474j(CameraSticker cameraSticker) {
        if (NullChecker.m82487b(cameraSticker)) {
            m172475k(cameraSticker.f17063id);
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m172475k(@Nullable String str) {
        if (NullChecker.m82487b(this.f152633a) && NullChecker.m82486a(str)) {
            this.f152633a.put(str, 1);
            this.f152634b.m172481e(str, 1);
        }
    }

    /* JADX INFO: renamed from: l */
    public void m172476l(CameraSticker cameraSticker) {
        this.f152640h = cameraSticker;
    }

    /* JADX INFO: renamed from: m */
    public void m172477m(CameraSticker cameraSticker) {
        this.f152637e = cameraSticker;
    }
}
