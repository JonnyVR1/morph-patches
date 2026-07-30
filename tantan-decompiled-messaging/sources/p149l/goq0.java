package p149l;

import android.content.Context;
import com.xiaomi.push.service.C14875q;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public class goq0 {

    /* JADX INFO: renamed from: a */
    private final String f103705a = "power_consumption_stats";

    /* JADX INFO: renamed from: b */
    private final String f103706b = "off_up_ct";

    /* JADX INFO: renamed from: c */
    private final String f103707c = "off_dn_ct";

    /* JADX INFO: renamed from: d */
    private final String f103708d = "off_ping_ct";

    /* JADX INFO: renamed from: e */
    private final String f103709e = "off_pong_ct";

    /* JADX INFO: renamed from: f */
    private final String f103710f = "off_dur";

    /* JADX INFO: renamed from: g */
    private final String f103711g = "on_up_ct";

    /* JADX INFO: renamed from: h */
    private final String f103712h = "on_dn_ct";

    /* JADX INFO: renamed from: i */
    private final String f103713i = "on_ping_ct";

    /* JADX INFO: renamed from: j */
    private final String f103714j = "on_pong_ct";

    /* JADX INFO: renamed from: k */
    private final String f103715k = "on_dur";

    /* JADX INFO: renamed from: l */
    private final String f103716l = "start_time";

    /* JADX INFO: renamed from: m */
    private final String f103717m = "end_time";

    /* JADX INFO: renamed from: n */
    private final String f103718n = "xmsf_vc";

    /* JADX INFO: renamed from: o */
    private final String f103719o = "android_vc";

    /* JADX INFO: renamed from: p */
    private final String f103720p = "uuid";

    /* JADX INFO: renamed from: a */
    public void m127287a(Context context, foq0 foq0Var) {
        if (foq0Var == null) {
            return;
        }
        HashMap map = new HashMap();
        map.put("off_up_ct", Integer.valueOf(foq0Var.m122490a()));
        map.put("off_dn_ct", Integer.valueOf(foq0Var.m122494e()));
        map.put("off_ping_ct", Integer.valueOf(foq0Var.m122498i()));
        map.put("off_pong_ct", Integer.valueOf(foq0Var.m122502m()));
        map.put("off_dur", Long.valueOf(foq0Var.m122491b()));
        map.put("on_up_ct", Integer.valueOf(foq0Var.m122506q()));
        map.put("on_dn_ct", Integer.valueOf(foq0Var.m122508s()));
        map.put("on_ping_ct", Integer.valueOf(foq0Var.m122510u()));
        map.put("on_pong_ct", Integer.valueOf(foq0Var.m122512w()));
        map.put("on_dur", Long.valueOf(foq0Var.m122495f()));
        map.put("start_time", Long.valueOf(foq0Var.m122499j()));
        map.put("end_time", Long.valueOf(foq0Var.m122503n()));
        map.put("xmsf_vc", Integer.valueOf(foq0Var.m122514y()));
        map.put("android_vc", Integer.valueOf(foq0Var.m122488A()));
        map.put("uuid", C14875q.m86767a(context));
        nrq0.m160745b().mo151503a("power_consumption_stats", map);
    }
}
