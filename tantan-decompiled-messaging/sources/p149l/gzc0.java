package p149l;

import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.CoreLikers;
import com.p046p1.mobile.putong.core.newui.main.NewMainAct;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes9.dex */
public class gzc0 extends ogl0 {

    /* JADX INFO: renamed from: h */
    public static gzc0 f105117h;

    /* JADX INFO: renamed from: b */
    public final zpd0 f105118b;

    /* JADX INFO: renamed from: c */
    public final tpd0 f105119c;

    /* JADX INFO: renamed from: d */
    public final zpd0 f105120d;

    /* JADX INFO: renamed from: e */
    public long f105121e;

    /* JADX INFO: renamed from: f */
    public boolean f105122f;

    /* JADX INFO: renamed from: g */
    public boolean f105123g;

    public gzc0() {
        zpd0 zpd0Var = new zpd0("last_likers_req_time" + CoreModule.m29931H().userId(), 0L);
        this.f105118b = zpd0Var;
        this.f105119c = new tpd0("offline_dialog_show_time" + CoreModule.m29931H().userId(), 0);
        this.f105120d = new zpd0("offline_like_dialog_last_time" + CoreModule.m29931H().userId(), 0L);
        this.f105121e = zpd0Var.get().longValue();
    }

    /* JADX INFO: renamed from: c0 */
    public static gzc0 m128837c0() {
        if (f105117h == null) {
            synchronized (gzc0.class) {
                try {
                    if (f105117h == null) {
                        f105117h = new gzc0();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f105117h;
    }

    /* JADX INFO: renamed from: d0 */
    public static boolean m128838d0(CoreLikers.LikersTriggerBy likersTriggerBy) {
        return false;
    }

    /* JADX INFO: renamed from: e0 */
    public static void m128839e0() {
        f105117h = null;
    }

    /* JADX INFO: renamed from: f0 */
    public static boolean m128840f0() {
        if (ogl0.m164227F()) {
            return m128841g0();
        }
        m128837c0().f105122f = true;
        return false;
    }

    /* JADX INFO: renamed from: g0 */
    public static boolean m128841g0() {
        m128837c0().f105122f = true;
        return false;
    }

    /* JADX INFO: renamed from: h0 */
    public static void m128842h0(nt30 nt30Var) {
        CoreLikers.C4719a c4719aM30471r5 = CoreModule.f17545c.f19687u0.m30471r5();
        NewMainAct newMainActM161157T4 = nt30Var.m161157T4();
        if (NullChecker.m81303a(newMainActM161157T4) && NullChecker.m81303a(c4719aM30471r5) && !vwb.m200296J(c4719aM30471r5.f19272d)) {
            m128837c0().f105122f = true;
            m128837c0().f105123g = true;
            nt30.f140338X0 = false;
            nt30Var.m161247l8();
            ok3.m164811J(newMainActM161157T4, c4719aM30471r5.f19271c, c4719aM30471r5);
            if (mqi0.m155929D(m128837c0().f105120d.get().longValue())) {
                m128837c0().f105119c.m189988a(1);
            } else {
                m128837c0().f105119c.put(1);
            }
            m128837c0().f105120d.put(Long.valueOf(mqi0.m155944o()));
        }
    }
}
