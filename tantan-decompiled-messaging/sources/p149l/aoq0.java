package p149l;

import android.content.Context;
import com.p046p1.mobile.putong.core.data.Reason;
import com.p046p1.mobile.putong.live.base.data.BLiveOperationTitleShowType;
import com.xiaomi.push.service.C14875q;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class aoq0 {

    /* JADX INFO: renamed from: a */
    private final String f70888a = "disconnection_event";

    /* JADX INFO: renamed from: b */
    private final String f70889b = "count";

    /* JADX INFO: renamed from: c */
    private final String f70890c = "host";

    /* JADX INFO: renamed from: d */
    private final String f70891d = "network_state";

    /* JADX INFO: renamed from: e */
    private final String f70892e = Reason.TYPE;

    /* JADX INFO: renamed from: f */
    private final String f70893f = "ping_interval";

    /* JADX INFO: renamed from: g */
    private final String f70894g = "network_type";

    /* JADX INFO: renamed from: h */
    private final String f70895h = "wifi_digest";

    /* JADX INFO: renamed from: i */
    private final String f70896i = BLiveOperationTitleShowType.duration;

    /* JADX INFO: renamed from: j */
    private final String f70897j = "disconnect_time";

    /* JADX INFO: renamed from: k */
    private final String f70898k = "connect_time";

    /* JADX INFO: renamed from: l */
    private final String f70899l = "xmsf_vc";

    /* JADX INFO: renamed from: m */
    private final String f70900m = "android_vc";

    /* JADX INFO: renamed from: n */
    private final String f70901n = "uuid";

    /* JADX INFO: renamed from: a */
    public void m97933a(Context context, List<znq0> list) {
        if (list == null || list.size() == 0) {
            return;
        }
        ynq0.m215434g("upload size = " + list.size());
        String strM86767a = C14875q.m86767a(context);
        for (znq0 znq0Var : list) {
            HashMap map = new HashMap();
            map.put("count", Integer.valueOf(znq0Var.m219461a()));
            map.put("host", znq0Var.m219463c());
            map.put("network_state", Integer.valueOf(znq0Var.m219467g()));
            map.put(Reason.TYPE, Integer.valueOf(znq0Var.m219473m()));
            map.put("ping_interval", Long.valueOf(znq0Var.m219462b()));
            map.put("network_type", Integer.valueOf(znq0Var.m219477q()));
            map.put("wifi_digest", znq0Var.m219469i());
            map.put("connected_network_type", Integer.valueOf(znq0Var.m219481u()));
            map.put(BLiveOperationTitleShowType.duration, Long.valueOf(znq0Var.m219468h()));
            map.put("disconnect_time", Long.valueOf(znq0Var.m219474n()));
            map.put("connect_time", Long.valueOf(znq0Var.m219478r()));
            map.put("xmsf_vc", Integer.valueOf(znq0Var.m219483w()));
            map.put("android_vc", Integer.valueOf(znq0Var.m219485y()));
            map.put("uuid", strM86767a);
            nrq0.m160745b().mo151503a("disconnection_event", map);
        }
    }
}
