package p007l;

import android.annotation.SuppressLint;
import android.content.SharedPreferences;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.feed.data.CameraSticker;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import l.fpd0;
import l.kpd0;
import l.tpd0;
import rx.subjects.a;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class yb4 {

    /* JADX INFO: renamed from: i */
    public static volatile yb4 f15381i;

    /* JADX INFO: renamed from: e */
    public CameraSticker f15386e;

    /* JADX INFO: renamed from: h */
    public CameraSticker f15389h;

    /* JADX INFO: renamed from: b */
    public C2540a f15383b = new C2540a("sp_sticker_click_state");

    /* JADX INFO: renamed from: a */
    public HashMap<String, Integer> f15382a = new HashMap<>();

    /* JADX INFO: renamed from: g */
    public Map<String, CameraSticker> f15388g = new HashMap();

    /* JADX INFO: renamed from: d */
    public a<Boolean> f15385d = a.b();

    /* JADX INFO: renamed from: f */
    public a<CameraSticker> f15387f = a.b();

    /* JADX INFO: renamed from: c */
    public kpd0 f15384c = new kpd0("sp_sticker_max_create_time", 0.0d);

    /* JADX INFO: renamed from: l.yb4$a */
    @SuppressLint({"SavedBaseConstructorError"})
    public class C2540a extends tpd0 {

        /* JADX INFO: renamed from: a */
        public SharedPreferences f15390a;

        public C2540a(String str) {
            super("default_key", -1, false, str);
            this.f15390a = pref();
        }

        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Integer retrieveValue() {
            return Integer.valueOf(this.f15390a.getInt(((fpd0) this).id, ((Integer) ((fpd0) this).defaultValue).intValue()));
        }

        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public SharedPreferences.Editor saveValue(Integer num) {
            return this.f15390a.edit().putInt(((fpd0) this).id, num.intValue());
        }

        /* JADX INFO: renamed from: d */
        public int m17117d(String str, int i) {
            return this.f15390a.getInt(str, i);
        }

        /* JADX INFO: renamed from: e */
        public void m17118e(String str, int i) {
            this.f15390a.edit().putInt(str, i).apply();
        }
    }

    /* JADX INFO: renamed from: c */
    public static yb4 m17102c() {
        if (f15381i == null) {
            synchronized (yb4.class) {
                try {
                    if (f15381i == null) {
                        f15381i = new yb4();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f15381i;
    }

    /* JADX INFO: renamed from: a */
    public void m17103a(@NonNull CameraSticker cameraSticker) {
        m17112k(cameraSticker.f680id);
    }

    /* JADX INFO: renamed from: b */
    public CameraSticker m17104b() {
        return this.f15389h;
    }

    /* JADX INFO: renamed from: d */
    public Map<String, CameraSticker> m17105d() {
        return this.f15388g;
    }

    @Nullable
    /* JADX INFO: renamed from: e */
    public CameraSticker m17106e() {
        return this.f15386e;
    }

    /* JADX INFO: renamed from: f */
    public void m17107f(List<CameraSticker> list) {
        if (NullChecker.a(list)) {
            for (CameraSticker cameraSticker : list) {
                if (cameraSticker != null) {
                    HashMap<String, Integer> map = this.f15382a;
                    String str = cameraSticker.f680id;
                    map.put(str, Integer.valueOf(this.f15383b.m17117d(str, map.get(str) == null ? 0 : this.f15382a.get(cameraSticker.f680id).intValue())));
                }
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public boolean m17108g(CameraSticker cameraSticker) {
        return NullChecker.a(cameraSticker) && NullChecker.a(this.f15382a.get(cameraSticker.f680id)) && this.f15382a.get(cameraSticker.f680id).intValue() == 1;
    }

    /* JADX INFO: renamed from: h */
    public boolean m17109h(CameraSticker cameraSticker, CameraSticker cameraSticker2) {
        return (cameraSticker == null || m17108g(cameraSticker) || cameraSticker.hasModelFile || !m17110i(cameraSticker.updateTime)) ? false : true;
    }

    /* JADX INFO: renamed from: i */
    public boolean m17110i(double d) {
        return ((double) System.currentTimeMillis()) - d < 6.048E8d;
    }

    /* JADX INFO: renamed from: j */
    public void m17111j(CameraSticker cameraSticker) {
        if (NullChecker.b(cameraSticker)) {
            m17112k(cameraSticker.f680id);
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m17112k(@Nullable String str) {
        if (NullChecker.b(this.f15382a) && NullChecker.a(str)) {
            this.f15382a.put(str, 1);
            this.f15383b.m17118e(str, 1);
        }
    }

    /* JADX INFO: renamed from: l */
    public void m17113l(CameraSticker cameraSticker) {
        this.f15389h = cameraSticker;
    }

    /* JADX INFO: renamed from: m */
    public void m17114m(CameraSticker cameraSticker) {
        this.f15386e = cameraSticker;
    }
}
