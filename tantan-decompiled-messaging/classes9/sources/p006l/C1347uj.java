package p006l;

import android.annotation.SuppressLint;
import android.content.SharedPreferences;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.account.data.CameraSticker;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import l.fpd0;
import l.kpd0;
import l.tpd0;

/* JADX INFO: renamed from: l.uj */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class C1347uj {

    /* JADX INFO: renamed from: i */
    public static volatile C1347uj f23560i;

    /* JADX INFO: renamed from: e */
    public CameraSticker f23565e;

    /* JADX INFO: renamed from: h */
    public CameraSticker f23568h;

    /* JADX INFO: renamed from: b */
    public a f23562b = new a("account_sp_sticker_click_state");

    /* JADX INFO: renamed from: a */
    public HashMap<String, Integer> f23561a = new HashMap<>();

    /* JADX INFO: renamed from: g */
    public Map<String, CameraSticker> f23567g = new HashMap();

    /* JADX INFO: renamed from: d */
    public rx.subjects.a<Boolean> f23564d = rx.subjects.a.b();

    /* JADX INFO: renamed from: f */
    public rx.subjects.a<CameraSticker> f23566f = rx.subjects.a.b();

    /* JADX INFO: renamed from: c */
    public kpd0 f23563c = new kpd0("account_sp_sticker_max_create_time", 0.0d);

    /* JADX INFO: renamed from: l.uj$a */
    @SuppressLint({"SavedBaseConstructorError"})
    public class a extends tpd0 {

        /* JADX INFO: renamed from: a */
        public SharedPreferences f23569a;

        public a(String str) {
            super("default_key", -1, false, str);
            this.f23569a = pref();
        }

        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Integer retrieveValue() {
            return Integer.valueOf(this.f23569a.getInt(((fpd0) this).id, ((Integer) ((fpd0) this).defaultValue).intValue()));
        }

        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public SharedPreferences.Editor saveValue(Integer num) {
            return this.f23569a.edit().putInt(((fpd0) this).id, num.intValue());
        }

        /* JADX INFO: renamed from: d */
        public int m25247d(String str, int i) {
            return this.f23569a.getInt(str, i);
        }

        /* JADX INFO: renamed from: e */
        public void m25248e(String str, int i) {
            this.f23569a.edit().putInt(str, i).apply();
        }
    }

    /* JADX INFO: renamed from: c */
    public static C1347uj m25232c() {
        if (f23560i == null) {
            synchronized (C1347uj.class) {
                try {
                    if (f23560i == null) {
                        f23560i = new C1347uj();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f23560i;
    }

    /* JADX INFO: renamed from: a */
    public void m25233a(@NonNull CameraSticker cameraSticker) {
        m25242k(cameraSticker.f333id);
    }

    /* JADX INFO: renamed from: b */
    public CameraSticker m25234b() {
        return this.f23568h;
    }

    /* JADX INFO: renamed from: d */
    public Map<String, CameraSticker> m25235d() {
        return this.f23567g;
    }

    @Nullable
    /* JADX INFO: renamed from: e */
    public CameraSticker m25236e() {
        return this.f23565e;
    }

    /* JADX INFO: renamed from: f */
    public void m25237f(List<CameraSticker> list) {
        if (NullChecker.a(list)) {
            for (CameraSticker cameraSticker : list) {
                if (cameraSticker != null) {
                    HashMap<String, Integer> map = this.f23561a;
                    String str = cameraSticker.f333id;
                    map.put(str, Integer.valueOf(this.f23562b.m25247d(str, map.get(str) == null ? 0 : this.f23561a.get(cameraSticker.f333id).intValue())));
                }
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public boolean m25238g(CameraSticker cameraSticker) {
        return NullChecker.a(cameraSticker) && NullChecker.a(this.f23561a.get(cameraSticker.f333id)) && this.f23561a.get(cameraSticker.f333id).intValue() == 1;
    }

    /* JADX INFO: renamed from: h */
    public boolean m25239h(CameraSticker cameraSticker, CameraSticker cameraSticker2) {
        return (cameraSticker == null || m25238g(cameraSticker) || cameraSticker.hasModelFile || !m25240i(cameraSticker.updateTime)) ? false : true;
    }

    /* JADX INFO: renamed from: i */
    public boolean m25240i(double d) {
        return ((double) System.currentTimeMillis()) - d < 6.048E8d;
    }

    /* JADX INFO: renamed from: j */
    public void m25241j(CameraSticker cameraSticker) {
        if (NullChecker.b(cameraSticker)) {
            m25242k(cameraSticker.f333id);
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m25242k(@Nullable String str) {
        if (NullChecker.b(this.f23561a) && NullChecker.a(str)) {
            this.f23561a.put(str, 1);
            this.f23562b.m25248e(str, 1);
        }
    }

    /* JADX INFO: renamed from: l */
    public void m25243l(CameraSticker cameraSticker) {
        this.f23568h = cameraSticker;
    }

    /* JADX INFO: renamed from: m */
    public void m25244m(CameraSticker cameraSticker) {
        this.f23565e = cameraSticker;
    }
}
