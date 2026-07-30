package p153l;

import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.CoreLikers;
import com.p051p1.mobile.putong.core.newui.main.NewMainAct;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes9.dex */
public class j7d0 extends spl0 {

    /* JADX INFO: renamed from: h */
    public static j7d0 f118676h;

    /* JADX INFO: renamed from: b */
    public final byd0 f118677b;

    /* JADX INFO: renamed from: c */
    public final vxd0 f118678c;

    /* JADX INFO: renamed from: d */
    public final byd0 f118679d;

    /* JADX INFO: renamed from: e */
    public long f118680e;

    /* JADX INFO: renamed from: f */
    public boolean f118681f;

    /* JADX INFO: renamed from: g */
    public boolean f118682g;

    public j7d0() {
        byd0 byd0Var = new byd0("last_likers_req_time" + CoreModule.m30929H().userId(), 0L);
        this.f118677b = byd0Var;
        this.f118678c = new vxd0("offline_dialog_show_time" + CoreModule.m30929H().userId(), 0);
        this.f118679d = new byd0("offline_like_dialog_last_time" + CoreModule.m30929H().userId(), 0L);
        this.f118680e = byd0Var.get().longValue();
    }

    /* JADX INFO: renamed from: c0 */
    public static j7d0 m143774c0() {
        if (f118676h == null) {
            synchronized (j7d0.class) {
                try {
                    if (f118676h == null) {
                        f118676h = new j7d0();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f118676h;
    }

    /* JADX INFO: renamed from: d0 */
    public static boolean m143775d0(CoreLikers.LikersTriggerBy likersTriggerBy) {
        return false;
    }

    /* JADX INFO: renamed from: e0 */
    public static void m143776e0() {
        f118676h = null;
    }

    /* JADX INFO: renamed from: f0 */
    public static boolean m143777f0() {
        if (spl0.m187354F()) {
            return m143778g0();
        }
        m143774c0().f118681f = true;
        return false;
    }

    /* JADX INFO: renamed from: g0 */
    public static boolean m143778g0() {
        m143774c0().f118681f = true;
        return false;
    }

    /* JADX INFO: renamed from: h0 */
    public static void m143779h0(b240 b240Var) {
        CoreLikers.C4870a c4870aM31479t5 = CoreModule.f18264c.f20429u0.m31479t5();
        NewMainAct newMainActM101951T4 = b240Var.m101951T4();
        if (NullChecker.m82486a(newMainActM101951T4) && NullChecker.m82486a(c4870aM31479t5) && !jyb.m147479J(c4870aM31479t5.f20014d)) {
            m143774c0().f118681f = true;
            m143774c0().f118682g = true;
            b240.f74490X0 = false;
            b240Var.m102041l8();
            hl3.m135667J(newMainActM101951T4, c4870aM31479t5.f20013c, c4870aM31479t5);
            if (pzi0.m174439D(m143774c0().f118679d.get().longValue())) {
                m143774c0().f118678c.m203841a(1);
            } else {
                m143774c0().f118678c.put(1);
            }
            m143774c0().f118679d.put(Long.valueOf(pzi0.m174454o()));
        }
    }
}
