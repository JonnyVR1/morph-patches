package p149l;

import android.text.TextUtils;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class ujt0 implements zit0 {
    @Override // p149l.zit0
    /* JADX INFO: renamed from: a */
    public final void mo102229a(Map map) {
        if (!((Boolean) d1s0.m109677c().m144697a(m7s0.f132094U9)).booleanValue() || map.isEmpty()) {
            return;
        }
        String str = (String) map.get("is_topics_ad_personalization_allowed");
        if (TextUtils.isEmpty(str)) {
            return;
        }
        vny0.m199079q().m212279i().mo96951j(Boolean.parseBoolean(str));
    }
}
