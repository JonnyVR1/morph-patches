package p149l;

import android.annotation.SuppressLint;
import android.content.SharedPreferences;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.p046p1.mobile.putong.account.data.CameraSticker;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p133rx.subjects.C22392a;

/* JADX INFO: renamed from: l.uj */
/* JADX INFO: loaded from: classes9.dex */
public class C20443uj {

    /* JADX INFO: renamed from: i */
    public static volatile C20443uj f176709i;

    /* JADX INFO: renamed from: e */
    public CameraSticker f176714e;

    /* JADX INFO: renamed from: h */
    public CameraSticker f176717h;

    /* JADX INFO: renamed from: b */
    public a f176711b = new a("account_sp_sticker_click_state");

    /* JADX INFO: renamed from: a */
    public HashMap<String, Integer> f176710a = new HashMap<>();

    /* JADX INFO: renamed from: g */
    public Map<String, CameraSticker> f176716g = new HashMap();

    /* JADX INFO: renamed from: d */
    public C22392a<Boolean> f176713d = C22392a.m221512b();

    /* JADX INFO: renamed from: f */
    public C22392a<CameraSticker> f176715f = C22392a.m221512b();

    /* JADX INFO: renamed from: c */
    public kpd0 f176712c = new kpd0("account_sp_sticker_max_create_time", FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE);

    /* JADX INFO: renamed from: l.uj$a */
    @SuppressLint({"SavedBaseConstructorError"})
    public class a extends tpd0 {

        /* JADX INFO: renamed from: a */
        public SharedPreferences f176718a;

        public a(String str) {
            super("default_key", -1, false, str);
            this.f176718a = pref();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p149l.tpd0, p149l.yqd0, p149l.fpd0
        /* JADX INFO: renamed from: b */
        public Integer retrieveValue() {
            return Integer.valueOf(this.f176718a.getInt(this.f98687id, ((Integer) this.defaultValue).intValue()));
        }

        @Override // p149l.tpd0, p149l.yqd0, p149l.fpd0
        /* JADX INFO: renamed from: c */
        public SharedPreferences.Editor saveValue(Integer num) {
            return this.f176718a.edit().putInt(this.f98687id, num.intValue());
        }

        /* JADX INFO: renamed from: d */
        public int m193983d(String str, int i) {
            return this.f176718a.getInt(str, i);
        }

        /* JADX INFO: renamed from: e */
        public void m193984e(String str, int i) {
            this.f176718a.edit().putInt(str, i).apply();
        }
    }

    /* JADX INFO: renamed from: c */
    public static C20443uj m193970c() {
        if (f176709i == null) {
            synchronized (C20443uj.class) {
                try {
                    if (f176709i == null) {
                        f176709i = new C20443uj();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f176709i;
    }

    /* JADX INFO: renamed from: a */
    public void m193971a(@NonNull CameraSticker cameraSticker) {
        m193980k(cameraSticker.f16344id);
    }

    /* JADX INFO: renamed from: b */
    public CameraSticker m193972b() {
        return this.f176717h;
    }

    /* JADX INFO: renamed from: d */
    public Map<String, CameraSticker> m193973d() {
        return this.f176716g;
    }

    @Nullable
    /* JADX INFO: renamed from: e */
    public CameraSticker m193974e() {
        return this.f176714e;
    }

    /* JADX INFO: renamed from: f */
    public void m193975f(List<CameraSticker> list) {
        if (NullChecker.m81303a(list)) {
            for (CameraSticker cameraSticker : list) {
                if (cameraSticker != null) {
                    HashMap<String, Integer> map = this.f176710a;
                    String str = cameraSticker.f16344id;
                    map.put(str, Integer.valueOf(this.f176711b.m193983d(str, map.get(str) == null ? 0 : this.f176710a.get(cameraSticker.f16344id).intValue())));
                }
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public boolean m193976g(CameraSticker cameraSticker) {
        return NullChecker.m81303a(cameraSticker) && NullChecker.m81303a(this.f176710a.get(cameraSticker.f16344id)) && this.f176710a.get(cameraSticker.f16344id).intValue() == 1;
    }

    /* JADX INFO: renamed from: h */
    public boolean m193977h(CameraSticker cameraSticker, CameraSticker cameraSticker2) {
        return (cameraSticker == null || m193976g(cameraSticker) || cameraSticker.hasModelFile || !m193978i(cameraSticker.updateTime)) ? false : true;
    }

    /* JADX INFO: renamed from: i */
    public boolean m193978i(double d) {
        return ((double) System.currentTimeMillis()) - d < 6.048E8d;
    }

    /* JADX INFO: renamed from: j */
    public void m193979j(CameraSticker cameraSticker) {
        if (NullChecker.m81304b(cameraSticker)) {
            m193980k(cameraSticker.f16344id);
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m193980k(@Nullable String str) {
        if (NullChecker.m81304b(this.f176710a) && NullChecker.m81303a(str)) {
            this.f176710a.put(str, 1);
            this.f176711b.m193984e(str, 1);
        }
    }

    /* JADX INFO: renamed from: l */
    public void m193981l(CameraSticker cameraSticker) {
        this.f176717h = cameraSticker;
    }

    /* JADX INFO: renamed from: m */
    public void m193982m(CameraSticker cameraSticker) {
        this.f176714e = cameraSticker;
    }
}
