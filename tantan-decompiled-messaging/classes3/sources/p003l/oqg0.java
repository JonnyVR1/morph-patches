package p003l;

import android.content.Context;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import l.amg0;
import l.t6g0;
import l.tjg0;
import l.y6g0;
import tech.sud.gip.core.ISudFSMMG;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public final class oqg0 implements kdg0 {

    /* JADX INFO: renamed from: n */
    public static final String f6203n = "SudGIP ".concat(oqg0.class.getSimpleName());

    /* JADX INFO: renamed from: b */
    public final Context f6205b;

    /* JADX INFO: renamed from: c */
    public WeakReference f6206c;

    /* JADX INFO: renamed from: m */
    public t6g0 f6216m;

    /* JADX INFO: renamed from: a */
    public final HashMap f6204a = new HashMap();

    /* JADX INFO: renamed from: d */
    public String f6207d = "";

    /* JADX INFO: renamed from: e */
    public String f6208e = "";

    /* JADX INFO: renamed from: f */
    public String f6209f = "";

    /* JADX INFO: renamed from: g */
    public long f6210g = 0;

    /* JADX INFO: renamed from: h */
    public String f6211h = "{}";

    /* JADX INFO: renamed from: i */
    public String f6212i = "{}";

    /* JADX INFO: renamed from: j */
    public final HashMap f6213j = new HashMap();

    /* JADX INFO: renamed from: k */
    public final HashMap f6214k = new HashMap();

    /* JADX INFO: renamed from: l */
    public final HashMap f6215l = new HashMap();

    public oqg0(Context context) {
        this.f6205b = context;
    }

    /* JADX INFO: renamed from: a */
    public final void m6726a(String str, String str2, String str3, String str4, y6g0 y6g0Var) {
        if (str.equals("game")) {
            this.f6213j.put(str3, str4);
            ISudFSMMG iSudFSMMG = (ISudFSMMG) this.f6206c.get();
            if (iSudFSMMG != null) {
                iSudFSMMG.onGameStateChange(y6g0Var, str3, str4);
                return;
            }
            return;
        }
        Map map = (Map) this.f6214k.get(str2);
        if (map == null) {
            map = new HashMap();
            this.f6214k.put(str2, map);
        }
        map.put(str3, str4);
        ISudFSMMG iSudFSMMG2 = (ISudFSMMG) this.f6206c.get();
        if (iSudFSMMG2 != null) {
            iSudFSMMG2.onPlayerStateChange(y6g0Var, str2, str3, str4);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m6727b(tjg0 tjg0Var) {
        t6g0 t6g0Var = this.f6216m;
        if (t6g0Var != null) {
            amg0 amg0Var = t6g0Var.b.w;
            if (amg0Var.m.contains(tjg0Var)) {
                return;
            }
            amg0Var.m.add(tjg0Var);
        }
    }
}
