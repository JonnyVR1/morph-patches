package p153l;

import android.content.Context;
import com.tencent.youtu.sdkkitframework.common.WeJson;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import tech.sud.gip.core.ISudFSMMG;

/* JADX INFO: loaded from: classes3.dex */
public final class wyg0 implements slg0 {

    /* JADX INFO: renamed from: n */
    public static final String f191639n = "SudGIP ".concat(wyg0.class.getSimpleName());

    /* JADX INFO: renamed from: b */
    public final Context f191641b;

    /* JADX INFO: renamed from: c */
    public WeakReference f191642c;

    /* JADX INFO: renamed from: m */
    public bfg0 f191652m;

    /* JADX INFO: renamed from: a */
    public final HashMap f191640a = new HashMap();

    /* JADX INFO: renamed from: d */
    public String f191643d = "";

    /* JADX INFO: renamed from: e */
    public String f191644e = "";

    /* JADX INFO: renamed from: f */
    public String f191645f = "";

    /* JADX INFO: renamed from: g */
    public long f191646g = 0;

    /* JADX INFO: renamed from: h */
    public String f191647h = WeJson.EMPTY_MAP;

    /* JADX INFO: renamed from: i */
    public String f191648i = WeJson.EMPTY_MAP;

    /* JADX INFO: renamed from: j */
    public final HashMap f191649j = new HashMap();

    /* JADX INFO: renamed from: k */
    public final HashMap f191650k = new HashMap();

    /* JADX INFO: renamed from: l */
    public final HashMap f191651l = new HashMap();

    public wyg0(Context context) {
        this.f191641b = context;
    }

    /* JADX INFO: renamed from: a */
    public final void m208616a(String str, String str2, String str3, String str4, gfg0 gfg0Var) {
        if (str.equals("game")) {
            this.f191649j.put(str3, str4);
            ISudFSMMG iSudFSMMG = (ISudFSMMG) this.f191642c.get();
            if (iSudFSMMG != null) {
                iSudFSMMG.onGameStateChange(gfg0Var, str3, str4);
                return;
            }
            return;
        }
        Map map = (Map) this.f191650k.get(str2);
        if (map == null) {
            map = new HashMap();
            this.f191650k.put(str2, map);
        }
        map.put(str3, str4);
        ISudFSMMG iSudFSMMG2 = (ISudFSMMG) this.f191642c.get();
        if (iSudFSMMG2 != null) {
            iSudFSMMG2.onPlayerStateChange(gfg0Var, str2, str3, str4);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m208617b(bsg0 bsg0Var) {
        bfg0 bfg0Var = this.f191652m;
        if (bfg0Var != null) {
            iug0 iug0Var = bfg0Var.f76491b.f88523w;
            if (iug0Var.f116942m.contains(bsg0Var)) {
                return;
            }
            iug0Var.f116942m.add(bsg0Var);
        }
    }
}
