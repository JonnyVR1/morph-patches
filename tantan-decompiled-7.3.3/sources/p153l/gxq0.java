package p153l;

import android.content.Context;
import com.p051p1.mobile.putong.core.data.Reason;
import com.p051p1.mobile.putong.live.base.data.BLiveOperationTitleShowType;
import com.xiaomi.push.service.C15023q;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class gxq0 {

    /* JADX INFO: renamed from: a */
    private final String f106982a = "disconnection_event";

    /* JADX INFO: renamed from: b */
    private final String f106983b = "count";

    /* JADX INFO: renamed from: c */
    private final String f106984c = "host";

    /* JADX INFO: renamed from: d */
    private final String f106985d = "network_state";

    /* JADX INFO: renamed from: e */
    private final String f106986e = Reason.TYPE;

    /* JADX INFO: renamed from: f */
    private final String f106987f = "ping_interval";

    /* JADX INFO: renamed from: g */
    private final String f106988g = "network_type";

    /* JADX INFO: renamed from: h */
    private final String f106989h = "wifi_digest";

    /* JADX INFO: renamed from: i */
    private final String f106990i = BLiveOperationTitleShowType.duration;

    /* JADX INFO: renamed from: j */
    private final String f106991j = "disconnect_time";

    /* JADX INFO: renamed from: k */
    private final String f106992k = "connect_time";

    /* JADX INFO: renamed from: l */
    private final String f106993l = "xmsf_vc";

    /* JADX INFO: renamed from: m */
    private final String f106994m = "android_vc";

    /* JADX INFO: renamed from: n */
    private final String f106995n = "uuid";

    /* JADX INFO: renamed from: a */
    public void m132922a(Context context, List<fxq0> list) {
        if (list == null || list.size() == 0) {
            return;
        }
        exq0.m123093g("upload size = " + list.size());
        String strM87938a = C15023q.m87938a(context);
        for (fxq0 fxq0Var : list) {
            HashMap map = new HashMap();
            map.put("count", Integer.valueOf(fxq0Var.m127996a()));
            map.put("host", fxq0Var.m127998c());
            map.put("network_state", Integer.valueOf(fxq0Var.m128002g()));
            map.put(Reason.TYPE, Integer.valueOf(fxq0Var.m128008m()));
            map.put("ping_interval", Long.valueOf(fxq0Var.m127997b()));
            map.put("network_type", Integer.valueOf(fxq0Var.m128012q()));
            map.put("wifi_digest", fxq0Var.m128004i());
            map.put("connected_network_type", Integer.valueOf(fxq0Var.m128016u()));
            map.put(BLiveOperationTitleShowType.duration, Long.valueOf(fxq0Var.m128003h()));
            map.put("disconnect_time", Long.valueOf(fxq0Var.m128009n()));
            map.put("connect_time", Long.valueOf(fxq0Var.m128013r()));
            map.put("xmsf_vc", Integer.valueOf(fxq0Var.m128018w()));
            map.put("android_vc", Integer.valueOf(fxq0Var.m128020y()));
            map.put("uuid", strM87938a);
            t0r0.m188825b().mo179241a("disconnection_event", map);
        }
    }
}
