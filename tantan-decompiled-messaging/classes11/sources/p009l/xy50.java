package p009l;

import android.text.TextUtils;
import android.util.LruCache;
import android.util.Pair;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.IPRegion;
import com.p1.mobile.putong.core.data.RealFeelInfo;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import l.e30;
import l.mkd0;
import l.upa;
import rx.subjects.b;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class xy50 {

    /* JADX INFO: renamed from: d */
    public static volatile xy50 f22805d;

    /* JADX INFO: renamed from: a */
    public Set<String> f22806a = new HashSet();

    /* JADX INFO: renamed from: b */
    public LruCache<String, RealFeelInfo> f22807b = new LruCache<>(100);

    /* JADX INFO: renamed from: c */
    public b<Pair<String, RealFeelInfo>> f22808c = b.b();

    /* JADX INFO: renamed from: d */
    public static xy50 m25067d() {
        if (f22805d == null) {
            synchronized (xy50.class) {
                try {
                    if (f22805d == null) {
                        f22805d = new xy50();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f22805d;
    }

    /* JADX INFO: renamed from: c */
    public void m25068c(String str, HashMap<String, String> map, HashMap<String, IPRegion> map2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (map == null && map2 == null) {
            return;
        }
        RealFeelInfo realFeelInfoNew_ = RealFeelInfo.new_();
        realFeelInfoNew_.userID = str;
        if (NullChecker.a(map)) {
            realFeelInfoNew_.deviceModel = map.get(str);
        }
        if (NullChecker.a(map2) && NullChecker.a(map2.get(str))) {
            realFeelInfoNew_.netLocation.province = map2.get(str).province;
        }
        if (TextUtils.isEmpty(realFeelInfoNew_.deviceModel) && TextUtils.isEmpty(realFeelInfoNew_.netLocation.province)) {
            this.f22806a.add(str);
        } else {
            this.f22807b.put(str, realFeelInfoNew_);
        }
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m25069e(String str, RealFeelInfo realFeelInfo) {
        if (realFeelInfo != null) {
            this.f22807b.put(str, realFeelInfo);
            this.f22808c.onNext(Pair.create(str, realFeelInfo));
        }
        this.f22806a.remove(str);
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m25070f(String str, Throwable th) {
        this.f22806a.remove(str);
    }

    /* JADX INFO: renamed from: g */
    public void m25071g(String str) {
        if (TextUtils.isEmpty(str) || str.startsWith("-") || !upa.N3() || this.f22806a.contains(str) || NullChecker.a(this.f22807b.get(str))) {
            return;
        }
        this.f22806a.add(str);
        m25072h(str);
    }

    /* JADX INFO: renamed from: h */
    public final void m25072h(final String str) {
        CoreModule.c.e0.E7(str).subscribe(mkd0.H(new e30() { // from class: l.vy50
            public final void call(Object obj) {
                this.f21819a.m25069e(str, (RealFeelInfo) obj);
            }
        }, new e30() { // from class: l.wy50
            public final void call(Object obj) {
                this.f22366a.m25070f(str, (Throwable) obj);
            }
        }));
    }
}
