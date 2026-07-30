package p153l;

import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.UserStrategy;
import com.p051p1.mobile.putong.core.data.UserStrategyConfiguration;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes12.dex */
public class wi5 {

    /* JADX INFO: renamed from: h */
    public static volatile wi5 f189335h;

    /* JADX INFO: renamed from: a */
    public UserStrategyConfiguration f189336a;

    /* JADX INFO: renamed from: b */
    public boolean f189337b = true;

    /* JADX INFO: renamed from: c */
    public byd0 f189338c = new byd0("commercial_card_last_show" + CoreModule.m30929H().userId(), 0L);

    /* JADX INFO: renamed from: d */
    public vxd0 f189339d = new vxd0("commercial_card_doday_show_count" + CoreModule.m30929H().userId(), 0);

    /* JADX INFO: renamed from: e */
    public int f189340e = -99;

    /* JADX INFO: renamed from: f */
    public Set<String> f189341f = new HashSet();

    /* JADX INFO: renamed from: g */
    public HashMap<String, Boolean> f189342g = new HashMap<>();

    /* JADX INFO: renamed from: d */
    public static wi5 m206550d() {
        if (f189335h == null) {
            synchronized (wi5.class) {
                try {
                    if (f189335h == null) {
                        f189335h = new wi5();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f189335h;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m206551c() {
        return NullChecker.m82486a(this.f189336a);
    }

    /* JADX INFO: renamed from: e */
    public boolean m206552e() {
        return m206551c() && jyb.m147520m(this.f189336a.userStrategyMap, new qcj() { // from class: l.ui5
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((UserStrategy) obj).strategyID == 2);
            }
        });
    }

    /* JADX INFO: renamed from: f */
    public boolean m206553f() {
        return m206551c() && jyb.m147520m(this.f189336a.userStrategyMap, new qcj() { // from class: l.vi5
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((UserStrategy) obj).strategyID == 7);
            }
        });
    }
}
