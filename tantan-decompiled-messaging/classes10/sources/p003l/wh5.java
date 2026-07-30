package p003l;

import com.p000p1.mobile.putong.core.data.UserStrategy;
import com.p000p1.mobile.putong.core.data.UserStrategyConfiguration;
import com.p1.mobile.putong.core.CoreModule;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import l.tpd0;
import l.vwb;
import l.w9j;
import l.zpd0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class wh5 {

    /* JADX INFO: renamed from: h */
    public static volatile wh5 f8181h;

    /* JADX INFO: renamed from: a */
    public UserStrategyConfiguration f8182a;

    /* JADX INFO: renamed from: b */
    public boolean f8183b = true;

    /* JADX INFO: renamed from: c */
    public zpd0 f8184c = new zpd0("commercial_card_last_show" + CoreModule.H().userId(), 0L);

    /* JADX INFO: renamed from: d */
    public tpd0 f8185d = new tpd0("commercial_card_doday_show_count" + CoreModule.H().userId(), 0);

    /* JADX INFO: renamed from: e */
    public int f8186e = -99;

    /* JADX INFO: renamed from: f */
    public Set<String> f8187f = new HashSet();

    /* JADX INFO: renamed from: g */
    public HashMap<String, Boolean> f8188g = new HashMap<>();

    /* JADX INFO: renamed from: d */
    public static wh5 m10500d() {
        if (f8181h == null) {
            synchronized (wh5.class) {
                try {
                    if (f8181h == null) {
                        f8181h = new wh5();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f8181h;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m10501c() {
        return NullChecker.a(this.f8182a);
    }

    /* JADX INFO: renamed from: e */
    public boolean m10502e() {
        return m10501c() && vwb.m(this.f8182a.userStrategyMap, new w9j() { // from class: l.uh5
            public final Object call(Object obj) {
                return Boolean.valueOf(((UserStrategy) obj).strategyID == 2);
            }
        });
    }

    /* JADX INFO: renamed from: f */
    public boolean m10503f() {
        return m10501c() && vwb.m(this.f8182a.userStrategyMap, new w9j() { // from class: l.vh5
            public final Object call(Object obj) {
                return Boolean.valueOf(((UserStrategy) obj).strategyID == 7);
            }
        });
    }
}
