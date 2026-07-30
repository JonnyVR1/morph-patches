package p153l;

import android.content.Context;
import android.text.TextUtils;
import android.webkit.CookieManager;
import com.p051p1.mobile.putong.live.base.data.BLiveResOperation;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class jtt0 implements fst0 {

    /* JADX INFO: renamed from: a */
    public final CookieManager f122623a;

    public jtt0(Context context) {
        this.f122623a = bxy0.m106935s().mo109050a(context);
    }

    @Override // p153l.fst0
    /* JADX INFO: renamed from: a */
    public final void mo100273a(Map map) {
        if (this.f122623a == null) {
            return;
        }
        if (((String) map.get(BLiveResOperation.clear)) == null) {
            String str = (String) map.get("cookie");
            if (TextUtils.isEmpty(str)) {
                return;
            }
            this.f122623a.setCookie((String) jas0.m144075c().m176505a(sgs0.f168072N0), str);
            return;
        }
        String str2 = (String) jas0.m144075c().m176505a(sgs0.f168072N0);
        String cookie = this.f122623a.getCookie(str2);
        if (cookie != null) {
            List listM117430f = dpw0.m117427c(bow0.m105711b(';')).m117430f(cookie);
            for (int i = 0; i < listM117430f.size(); i++) {
                CookieManager cookieManager = this.f122623a;
                Iterator it = dpw0.m117427c(bow0.m105711b('=')).m117429d((String) listM117430f.get(i)).iterator();
                it.getClass();
                if (!it.hasNext()) {
                    bqg0.m105918a("position (0) must be less than the number of elements that remained (", 0, ")");
                    return;
                }
                cookieManager.setCookie(str2, String.valueOf((String) it.next()).concat(String.valueOf((String) jas0.m144075c().m176505a(sgs0.f168522x0))));
            }
        }
    }
}
