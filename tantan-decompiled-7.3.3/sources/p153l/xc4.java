package p153l;

import android.annotation.SuppressLint;
import android.content.SharedPreferences;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.p051p1.mobile.putong.feed.data.CameraSticker;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p137rx.subjects.C22507a;

/* JADX INFO: loaded from: classes13.dex */
public class xc4 {

    /* JADX INFO: renamed from: i */
    public static volatile xc4 f193257i;

    /* JADX INFO: renamed from: e */
    public CameraSticker f193262e;

    /* JADX INFO: renamed from: h */
    public CameraSticker f193265h;

    /* JADX INFO: renamed from: b */
    public C21277a f193259b = new C21277a("sp_sticker_click_state");

    /* JADX INFO: renamed from: a */
    public HashMap<String, Integer> f193258a = new HashMap<>();

    /* JADX INFO: renamed from: g */
    public Map<String, CameraSticker> f193264g = new HashMap();

    /* JADX INFO: renamed from: d */
    public C22507a<Boolean> f193261d = C22507a.m222758b();

    /* JADX INFO: renamed from: f */
    public C22507a<CameraSticker> f193263f = C22507a.m222758b();

    /* JADX INFO: renamed from: c */
    public mxd0 f193260c = new mxd0("sp_sticker_max_create_time", FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE);

    /* JADX INFO: renamed from: l.xc4$a */
    @SuppressLint({"SavedBaseConstructorError"})
    public class C21277a extends vxd0 {

        /* JADX INFO: renamed from: a */
        public SharedPreferences f193266a;

        public C21277a(String str) {
            super("default_key", -1, false, str);
            this.f193266a = pref();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p153l.vxd0, p153l.azd0, p153l.hxd0
        /* JADX INFO: renamed from: b */
        public Integer retrieveValue() {
            return Integer.valueOf(this.f193266a.getInt(this.f111993id, ((Integer) this.defaultValue).intValue()));
        }

        @Override // p153l.vxd0, p153l.azd0, p153l.hxd0
        /* JADX INFO: renamed from: c */
        public SharedPreferences.Editor saveValue(Integer num) {
            return this.f193266a.edit().putInt(this.f111993id, num.intValue());
        }

        /* JADX INFO: renamed from: d */
        public int m210127d(String str, int i) {
            return this.f193266a.getInt(str, i);
        }

        /* JADX INFO: renamed from: e */
        public void m210128e(String str, int i) {
            this.f193266a.edit().putInt(str, i).apply();
        }
    }

    /* JADX INFO: renamed from: c */
    public static xc4 m210114c() {
        if (f193257i == null) {
            synchronized (xc4.class) {
                try {
                    if (f193257i == null) {
                        f193257i = new xc4();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f193257i;
    }

    /* JADX INFO: renamed from: a */
    public void m210115a(@NonNull CameraSticker cameraSticker) {
        m210124k(cameraSticker.f40067id);
    }

    /* JADX INFO: renamed from: b */
    public CameraSticker m210116b() {
        return this.f193265h;
    }

    /* JADX INFO: renamed from: d */
    public Map<String, CameraSticker> m210117d() {
        return this.f193264g;
    }

    @Nullable
    /* JADX INFO: renamed from: e */
    public CameraSticker m210118e() {
        return this.f193262e;
    }

    /* JADX INFO: renamed from: f */
    public void m210119f(List<CameraSticker> list) {
        if (NullChecker.m82486a(list)) {
            for (CameraSticker cameraSticker : list) {
                if (cameraSticker != null) {
                    HashMap<String, Integer> map = this.f193258a;
                    String str = cameraSticker.f40067id;
                    map.put(str, Integer.valueOf(this.f193259b.m210127d(str, map.get(str) == null ? 0 : this.f193258a.get(cameraSticker.f40067id).intValue())));
                }
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public boolean m210120g(CameraSticker cameraSticker) {
        return NullChecker.m82486a(cameraSticker) && NullChecker.m82486a(this.f193258a.get(cameraSticker.f40067id)) && this.f193258a.get(cameraSticker.f40067id).intValue() == 1;
    }

    /* JADX INFO: renamed from: h */
    public boolean m210121h(CameraSticker cameraSticker, CameraSticker cameraSticker2) {
        return (cameraSticker == null || m210120g(cameraSticker) || cameraSticker.hasModelFile || !m210122i(cameraSticker.updateTime)) ? false : true;
    }

    /* JADX INFO: renamed from: i */
    public boolean m210122i(double d) {
        return ((double) System.currentTimeMillis()) - d < 6.048E8d;
    }

    /* JADX INFO: renamed from: j */
    public void m210123j(CameraSticker cameraSticker) {
        if (NullChecker.m82487b(cameraSticker)) {
            m210124k(cameraSticker.f40067id);
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m210124k(@Nullable String str) {
        if (NullChecker.m82487b(this.f193258a) && NullChecker.m82486a(str)) {
            this.f193258a.put(str, 1);
            this.f193259b.m210128e(str, 1);
        }
    }

    /* JADX INFO: renamed from: l */
    public void m210125l(CameraSticker cameraSticker) {
        this.f193265h = cameraSticker;
    }

    /* JADX INFO: renamed from: m */
    public void m210126m(CameraSticker cameraSticker) {
        this.f193262e = cameraSticker;
    }
}
