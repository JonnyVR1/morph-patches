package p149l;

import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.UserStrategy;
import com.p046p1.mobile.putong.core.data.UserStrategyConfiguration;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes10.dex */
public class wh5 {

    /* JADX INFO: renamed from: h */
    public static volatile wh5 f186359h;

    /* JADX INFO: renamed from: a */
    public UserStrategyConfiguration f186360a;

    /* JADX INFO: renamed from: b */
    public boolean f186361b = true;

    /* JADX INFO: renamed from: c */
    public zpd0 f186362c = new zpd0("commercial_card_last_show" + CoreModule.m29931H().userId(), 0L);

    /* JADX INFO: renamed from: d */
    public tpd0 f186363d = new tpd0("commercial_card_doday_show_count" + CoreModule.m29931H().userId(), 0);

    /* JADX INFO: renamed from: e */
    public int f186364e = -99;

    /* JADX INFO: renamed from: f */
    public Set<String> f186365f = new HashSet();

    /* JADX INFO: renamed from: g */
    public HashMap<String, Boolean> f186366g = new HashMap<>();

    /* JADX INFO: renamed from: d */
    public static wh5 m203106d() {
        if (f186359h == null) {
            synchronized (wh5.class) {
                try {
                    if (f186359h == null) {
                        f186359h = new wh5();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f186359h;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m203107c() {
        return NullChecker.m81303a(this.f186360a);
    }

    /* JADX INFO: renamed from: e */
    public boolean m203108e() {
        return m203107c() && vwb.m200337m(this.f186360a.userStrategyMap, new w9j() { // from class: l.uh5
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((UserStrategy) obj).strategyID == 2);
            }
        });
    }

    /* JADX INFO: renamed from: f */
    public boolean m203109f() {
        return m203107c() && vwb.m200337m(this.f186360a.userStrategyMap, new w9j() { // from class: l.vh5
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((UserStrategy) obj).strategyID == 7);
            }
        });
    }
}
