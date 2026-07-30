package p153l;

import android.text.TextUtils;
import android.util.LruCache;
import android.util.Pair;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.IPRegion;
import com.p051p1.mobile.putong.core.data.RealFeelInfo;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import p137rx.subjects.C22508b;

/* JADX INFO: loaded from: classes11.dex */
public class c760 {

    /* JADX INFO: renamed from: d */
    public static volatile c760 f80084d;

    /* JADX INFO: renamed from: a */
    public Set<String> f80085a = new HashSet();

    /* JADX INFO: renamed from: b */
    public LruCache<String, RealFeelInfo> f80086b = new LruCache<>(100);

    /* JADX INFO: renamed from: c */
    public C22508b<Pair<String, RealFeelInfo>> f80087c = C22508b.m222767b();

    /* JADX INFO: renamed from: d */
    public static c760 m108287d() {
        if (f80084d == null) {
            synchronized (c760.class) {
                try {
                    if (f80084d == null) {
                        f80084d = new c760();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f80084d;
    }

    /* JADX INFO: renamed from: c */
    public void m108288c(String str, HashMap<String, String> map, HashMap<String, IPRegion> map2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (map == null && map2 == null) {
            return;
        }
        RealFeelInfo realFeelInfoNew_ = RealFeelInfo.new_();
        realFeelInfoNew_.userID = str;
        if (NullChecker.m82486a(map)) {
            realFeelInfoNew_.deviceModel = map.get(str);
        }
        if (NullChecker.m82486a(map2) && NullChecker.m82486a(map2.get(str))) {
            realFeelInfoNew_.netLocation.province = map2.get(str).province;
        }
        if (TextUtils.isEmpty(realFeelInfoNew_.deviceModel) && TextUtils.isEmpty(realFeelInfoNew_.netLocation.province)) {
            this.f80085a.add(str);
        } else {
            this.f80086b.put(str, realFeelInfoNew_);
        }
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m108289e(String str, RealFeelInfo realFeelInfo) {
        if (realFeelInfo != null) {
            this.f80086b.put(str, realFeelInfo);
            this.f80087c.m137019l(Pair.create(str, realFeelInfo));
        }
        this.f80085a.remove(str);
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m108290f(String str, Throwable th) {
        this.f80085a.remove(str);
    }

    /* JADX INFO: renamed from: g */
    public void m108291g(String str) {
        if (TextUtils.isEmpty(str) || str.startsWith("-") || !gra.m131606N3() || this.f80085a.contains(str) || NullChecker.m82486a(this.f80086b.get(str))) {
            return;
        }
        this.f80085a.add(str);
        m108292h(str);
    }

    /* JADX INFO: renamed from: h */
    public final void m108292h(final String str) {
        CoreModule.f18264c.f20381e0.m116456E7(str).subscribe(psd0.m173597H(new y20() { // from class: l.a760
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f68793a.m108289e(str, (RealFeelInfo) obj);
            }
        }, new y20() { // from class: l.b760
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f75254a.m108290f(str, (Throwable) obj);
            }
        }));
    }
}
