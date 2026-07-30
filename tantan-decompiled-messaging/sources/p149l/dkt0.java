package p149l;

import android.content.Context;
import android.text.TextUtils;
import android.webkit.CookieManager;
import com.p046p1.mobile.putong.live.base.data.BLiveResOperation;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class dkt0 implements zit0 {

    /* JADX INFO: renamed from: a */
    public final CookieManager f86707a;

    public dkt0(Context context) {
        this.f86707a = vny0.m199081s().mo112967a(context);
    }

    @Override // p149l.zit0
    /* JADX INFO: renamed from: a */
    public final void mo102229a(Map map) {
        if (this.f86707a == null) {
            return;
        }
        if (((String) map.get(BLiveResOperation.clear)) == null) {
            String str = (String) map.get("cookie");
            if (TextUtils.isEmpty(str)) {
                return;
            }
            this.f86707a.setCookie((String) d1s0.m109677c().m144697a(m7s0.f132001N0), str);
            return;
        }
        String str2 = (String) d1s0.m109677c().m144697a(m7s0.f132001N0);
        String cookie = this.f86707a.getCookie(str2);
        if (cookie != null) {
            List listM208619f = xfw0.m208616c(vew0.m198261b(';')).m208619f(cookie);
            for (int i = 0; i < listM208619f.size(); i++) {
                CookieManager cookieManager = this.f86707a;
                Iterator it = xfw0.m208616c(vew0.m198261b('=')).m208618d((String) listM208619f.get(i)).iterator();
                it.getClass();
                if (!it.hasNext()) {
                    thg0.m188906a("position (0) must be less than the number of elements that remained (", 0, ")");
                    return;
                }
                cookieManager.setCookie(str2, String.valueOf((String) it.next()).concat(String.valueOf((String) d1s0.m109677c().m144697a(m7s0.f132451x0))));
            }
        }
    }
}
