package p153l;

import android.content.Context;
import com.xiaomi.push.service.C15023q;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public class mxq0 {

    /* JADX INFO: renamed from: a */
    private final String f139262a = "power_consumption_stats";

    /* JADX INFO: renamed from: b */
    private final String f139263b = "off_up_ct";

    /* JADX INFO: renamed from: c */
    private final String f139264c = "off_dn_ct";

    /* JADX INFO: renamed from: d */
    private final String f139265d = "off_ping_ct";

    /* JADX INFO: renamed from: e */
    private final String f139266e = "off_pong_ct";

    /* JADX INFO: renamed from: f */
    private final String f139267f = "off_dur";

    /* JADX INFO: renamed from: g */
    private final String f139268g = "on_up_ct";

    /* JADX INFO: renamed from: h */
    private final String f139269h = "on_dn_ct";

    /* JADX INFO: renamed from: i */
    private final String f139270i = "on_ping_ct";

    /* JADX INFO: renamed from: j */
    private final String f139271j = "on_pong_ct";

    /* JADX INFO: renamed from: k */
    private final String f139272k = "on_dur";

    /* JADX INFO: renamed from: l */
    private final String f139273l = "start_time";

    /* JADX INFO: renamed from: m */
    private final String f139274m = "end_time";

    /* JADX INFO: renamed from: n */
    private final String f139275n = "xmsf_vc";

    /* JADX INFO: renamed from: o */
    private final String f139276o = "android_vc";

    /* JADX INFO: renamed from: p */
    private final String f139277p = "uuid";

    /* JADX INFO: renamed from: a */
    public void m160695a(Context context, lxq0 lxq0Var) {
        if (lxq0Var == null) {
            return;
        }
        HashMap map = new HashMap();
        map.put("off_up_ct", Integer.valueOf(lxq0Var.m156209a()));
        map.put("off_dn_ct", Integer.valueOf(lxq0Var.m156213e()));
        map.put("off_ping_ct", Integer.valueOf(lxq0Var.m156217i()));
        map.put("off_pong_ct", Integer.valueOf(lxq0Var.m156221m()));
        map.put("off_dur", Long.valueOf(lxq0Var.m156210b()));
        map.put("on_up_ct", Integer.valueOf(lxq0Var.m156225q()));
        map.put("on_dn_ct", Integer.valueOf(lxq0Var.m156227s()));
        map.put("on_ping_ct", Integer.valueOf(lxq0Var.m156229u()));
        map.put("on_pong_ct", Integer.valueOf(lxq0Var.m156231w()));
        map.put("on_dur", Long.valueOf(lxq0Var.m156214f()));
        map.put("start_time", Long.valueOf(lxq0Var.m156218j()));
        map.put("end_time", Long.valueOf(lxq0Var.m156222n()));
        map.put("xmsf_vc", Integer.valueOf(lxq0Var.m156233y()));
        map.put("android_vc", Integer.valueOf(lxq0Var.m156207A()));
        map.put("uuid", C15023q.m87938a(context));
        t0r0.m188825b().mo179241a("power_consumption_stats", map);
    }
}
