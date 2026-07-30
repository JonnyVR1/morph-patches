package p149l;

import android.content.Context;
import com.tencent.youtu.sdkkitframework.common.WeJson;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import tech.sud.gip.core.ISudFSMMG;

/* JADX INFO: loaded from: classes3.dex */
public final class oqg0 implements kdg0 {

    /* JADX INFO: renamed from: n */
    public static final String f145137n = "SudGIP ".concat(oqg0.class.getSimpleName());

    /* JADX INFO: renamed from: b */
    public final Context f145139b;

    /* JADX INFO: renamed from: c */
    public WeakReference f145140c;

    /* JADX INFO: renamed from: m */
    public t6g0 f145150m;

    /* JADX INFO: renamed from: a */
    public final HashMap f145138a = new HashMap();

    /* JADX INFO: renamed from: d */
    public String f145141d = "";

    /* JADX INFO: renamed from: e */
    public String f145142e = "";

    /* JADX INFO: renamed from: f */
    public String f145143f = "";

    /* JADX INFO: renamed from: g */
    public long f145144g = 0;

    /* JADX INFO: renamed from: h */
    public String f145145h = WeJson.EMPTY_MAP;

    /* JADX INFO: renamed from: i */
    public String f145146i = WeJson.EMPTY_MAP;

    /* JADX INFO: renamed from: j */
    public final HashMap f145147j = new HashMap();

    /* JADX INFO: renamed from: k */
    public final HashMap f145148k = new HashMap();

    /* JADX INFO: renamed from: l */
    public final HashMap f145149l = new HashMap();

    public oqg0(Context context) {
        this.f145139b = context;
    }

    /* JADX INFO: renamed from: a */
    public final void m165427a(String str, String str2, String str3, String str4, y6g0 y6g0Var) {
        if (str.equals("game")) {
            this.f145147j.put(str3, str4);
            ISudFSMMG iSudFSMMG = (ISudFSMMG) this.f145140c.get();
            if (iSudFSMMG != null) {
                iSudFSMMG.onGameStateChange(y6g0Var, str3, str4);
                return;
            }
            return;
        }
        Map map = (Map) this.f145148k.get(str2);
        if (map == null) {
            map = new HashMap();
            this.f145148k.put(str2, map);
        }
        map.put(str3, str4);
        ISudFSMMG iSudFSMMG2 = (ISudFSMMG) this.f145140c.get();
        if (iSudFSMMG2 != null) {
            iSudFSMMG2.onPlayerStateChange(y6g0Var, str2, str3, str4);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m165428b(tjg0 tjg0Var) {
        t6g0 t6g0Var = this.f145150m;
        if (t6g0Var != null) {
            amg0 amg0Var = t6g0Var.f168615b.f180521w;
            if (amg0Var.f70612m.contains(tjg0Var)) {
                return;
            }
            amg0Var.f70612m.add(tjg0Var);
        }
    }
}
