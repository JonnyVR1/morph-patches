package p149l;

import android.annotation.SuppressLint;
import android.content.SharedPreferences;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.p046p1.mobile.putong.feed.data.CameraSticker;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p133rx.subjects.C22392a;

/* JADX INFO: loaded from: classes12.dex */
public class yb4 {

    /* JADX INFO: renamed from: i */
    public static volatile yb4 f197299i;

    /* JADX INFO: renamed from: e */
    public CameraSticker f197304e;

    /* JADX INFO: renamed from: h */
    public CameraSticker f197307h;

    /* JADX INFO: renamed from: b */
    public C21362a f197301b = new C21362a("sp_sticker_click_state");

    /* JADX INFO: renamed from: a */
    public HashMap<String, Integer> f197300a = new HashMap<>();

    /* JADX INFO: renamed from: g */
    public Map<String, CameraSticker> f197306g = new HashMap();

    /* JADX INFO: renamed from: d */
    public C22392a<Boolean> f197303d = C22392a.m221512b();

    /* JADX INFO: renamed from: f */
    public C22392a<CameraSticker> f197305f = C22392a.m221512b();

    /* JADX INFO: renamed from: c */
    public kpd0 f197302c = new kpd0("sp_sticker_max_create_time", FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE);

    /* JADX INFO: renamed from: l.yb4$a */
    @SuppressLint({"SavedBaseConstructorError"})
    public class C21362a extends tpd0 {

        /* JADX INFO: renamed from: a */
        public SharedPreferences f197308a;

        public C21362a(String str) {
            super("default_key", -1, false, str);
            this.f197308a = pref();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p149l.tpd0, p149l.yqd0, p149l.fpd0
        /* JADX INFO: renamed from: b */
        public Integer retrieveValue() {
            return Integer.valueOf(this.f197308a.getInt(this.f98687id, ((Integer) this.defaultValue).intValue()));
        }

        @Override // p149l.tpd0, p149l.yqd0, p149l.fpd0
        /* JADX INFO: renamed from: c */
        public SharedPreferences.Editor saveValue(Integer num) {
            return this.f197308a.edit().putInt(this.f98687id, num.intValue());
        }

        /* JADX INFO: renamed from: d */
        public int m213949d(String str, int i) {
            return this.f197308a.getInt(str, i);
        }

        /* JADX INFO: renamed from: e */
        public void m213950e(String str, int i) {
            this.f197308a.edit().putInt(str, i).apply();
        }
    }

    /* JADX INFO: renamed from: c */
    public static yb4 m213936c() {
        if (f197299i == null) {
            synchronized (yb4.class) {
                try {
                    if (f197299i == null) {
                        f197299i = new yb4();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f197299i;
    }

    /* JADX INFO: renamed from: a */
    public void m213937a(@NonNull CameraSticker cameraSticker) {
        m213946k(cameraSticker.f39219id);
    }

    /* JADX INFO: renamed from: b */
    public CameraSticker m213938b() {
        return this.f197307h;
    }

    /* JADX INFO: renamed from: d */
    public Map<String, CameraSticker> m213939d() {
        return this.f197306g;
    }

    @Nullable
    /* JADX INFO: renamed from: e */
    public CameraSticker m213940e() {
        return this.f197304e;
    }

    /* JADX INFO: renamed from: f */
    public void m213941f(List<CameraSticker> list) {
        if (NullChecker.m81303a(list)) {
            for (CameraSticker cameraSticker : list) {
                if (cameraSticker != null) {
                    HashMap<String, Integer> map = this.f197300a;
                    String str = cameraSticker.f39219id;
                    map.put(str, Integer.valueOf(this.f197301b.m213949d(str, map.get(str) == null ? 0 : this.f197300a.get(cameraSticker.f39219id).intValue())));
                }
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public boolean m213942g(CameraSticker cameraSticker) {
        return NullChecker.m81303a(cameraSticker) && NullChecker.m81303a(this.f197300a.get(cameraSticker.f39219id)) && this.f197300a.get(cameraSticker.f39219id).intValue() == 1;
    }

    /* JADX INFO: renamed from: h */
    public boolean m213943h(CameraSticker cameraSticker, CameraSticker cameraSticker2) {
        return (cameraSticker == null || m213942g(cameraSticker) || cameraSticker.hasModelFile || !m213944i(cameraSticker.updateTime)) ? false : true;
    }

    /* JADX INFO: renamed from: i */
    public boolean m213944i(double d) {
        return ((double) System.currentTimeMillis()) - d < 6.048E8d;
    }

    /* JADX INFO: renamed from: j */
    public void m213945j(CameraSticker cameraSticker) {
        if (NullChecker.m81304b(cameraSticker)) {
            m213946k(cameraSticker.f39219id);
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m213946k(@Nullable String str) {
        if (NullChecker.m81304b(this.f197300a) && NullChecker.m81303a(str)) {
            this.f197300a.put(str, 1);
            this.f197301b.m213950e(str, 1);
        }
    }

    /* JADX INFO: renamed from: l */
    public void m213947l(CameraSticker cameraSticker) {
        this.f197307h = cameraSticker;
    }

    /* JADX INFO: renamed from: m */
    public void m213948m(CameraSticker cameraSticker) {
        this.f197304e = cameraSticker;
    }
}
