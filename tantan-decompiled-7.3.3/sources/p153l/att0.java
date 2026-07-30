package p153l;

import android.text.TextUtils;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class att0 implements fst0 {
    @Override // p153l.fst0
    /* JADX INFO: renamed from: a */
    public final void mo100273a(Map map) {
        if (!((Boolean) jas0.m144075c().m176505a(sgs0.f168165U9)).booleanValue() || map.isEmpty()) {
            return;
        }
        String str = (String) map.get("is_topics_ad_personalization_allowed");
        if (TextUtils.isEmpty(str)) {
            return;
        }
        bxy0.m106933q().m120264i().mo131900j(Boolean.parseBoolean(str));
    }
}
