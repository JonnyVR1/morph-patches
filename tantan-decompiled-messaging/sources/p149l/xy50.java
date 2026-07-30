package p149l;

import android.text.TextUtils;
import android.util.LruCache;
import android.util.Pair;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.IPRegion;
import com.p046p1.mobile.putong.core.data.RealFeelInfo;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import p133rx.subjects.C22393b;

/* JADX INFO: loaded from: classes11.dex */
public class xy50 {

    /* JADX INFO: renamed from: d */
    public static volatile xy50 f195023d;

    /* JADX INFO: renamed from: a */
    public Set<String> f195024a = new HashSet();

    /* JADX INFO: renamed from: b */
    public LruCache<String, RealFeelInfo> f195025b = new LruCache<>(100);

    /* JADX INFO: renamed from: c */
    public C22393b<Pair<String, RealFeelInfo>> f195026c = C22393b.m221521b();

    /* JADX INFO: renamed from: d */
    public static xy50 m211730d() {
        if (f195023d == null) {
            synchronized (xy50.class) {
                try {
                    if (f195023d == null) {
                        f195023d = new xy50();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f195023d;
    }

    /* JADX INFO: renamed from: c */
    public void m211731c(String str, HashMap<String, String> map, HashMap<String, IPRegion> map2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (map == null && map2 == null) {
            return;
        }
        RealFeelInfo realFeelInfoNew_ = RealFeelInfo.new_();
        realFeelInfoNew_.userID = str;
        if (NullChecker.m81303a(map)) {
            realFeelInfoNew_.deviceModel = map.get(str);
        }
        if (NullChecker.m81303a(map2) && NullChecker.m81303a(map2.get(str))) {
            realFeelInfoNew_.netLocation.province = map2.get(str).province;
        }
        if (TextUtils.isEmpty(realFeelInfoNew_.deviceModel) && TextUtils.isEmpty(realFeelInfoNew_.netLocation.province)) {
            this.f195024a.add(str);
        } else {
            this.f195025b.put(str, realFeelInfoNew_);
        }
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m211732e(String str, RealFeelInfo realFeelInfo) {
        if (realFeelInfo != null) {
            this.f195025b.put(str, realFeelInfo);
            this.f195026c.m132487l(Pair.create(str, realFeelInfo));
        }
        this.f195024a.remove(str);
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m211733f(String str, Throwable th) {
        this.f195024a.remove(str);
    }

    /* JADX INFO: renamed from: g */
    public void m211734g(String str) {
        if (TextUtils.isEmpty(str) || str.startsWith("-") || !upa.m194675N3() || this.f195024a.contains(str) || NullChecker.m81303a(this.f195025b.get(str))) {
            return;
        }
        this.f195024a.add(str);
        m211735h(str);
    }

    /* JADX INFO: renamed from: h */
    public final void m211735h(final String str) {
        CoreModule.f17545c.f19639e0.m169383E7(str).subscribe(mkd0.m154956H(new e30() { // from class: l.vy50
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f183495a.m211732e(str, (RealFeelInfo) obj);
            }
        }, new e30() { // from class: l.wy50
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f188543a.m211733f(str, (Throwable) obj);
            }
        }));
    }
}
