package p006l;

import com.p000p1.mobile.putong.core.CoreModule;
import com.p1.mobile.android.app.Act;
import l.e30;
import l.hpd0;
import l.lsi0;
import l.mkd0;
import l.tpd0;
import l.zpd0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class sbe0 {

    /* JADX INFO: renamed from: k */
    public static volatile sbe0 f21237k;

    /* JADX INFO: renamed from: a */
    public int f21238a = 1;

    /* JADX INFO: renamed from: b */
    public final tpd0 f21239b = new tpd0("insert_see_less_than_six_" + CoreModule.m1850H().userId(), 0);

    /* JADX INFO: renamed from: c */
    public final tpd0 f21240c = new tpd0("insert_see_less_than_ten_" + CoreModule.m1850H().userId(), 0);

    /* JADX INFO: renamed from: d */
    public final tpd0 f21241d = new tpd0("insert_see_upgrade_svip_day_" + CoreModule.m1850H().userId(), 0);

    /* JADX INFO: renamed from: e */
    public final tpd0 f21242e = new tpd0("insert_see_upgrade_svip_week_" + CoreModule.m1850H().userId(), 0);

    /* JADX INFO: renamed from: f */
    public final zpd0 f21243f = new zpd0("insert_see_upgrade_time_less_than_ten_" + CoreModule.m1850H().userId(), 0L);

    /* JADX INFO: renamed from: g */
    public final zpd0 f21244g = new zpd0("insert_see_upgrade_time_svip_week_" + CoreModule.m1850H().userId(), 0L);

    /* JADX INFO: renamed from: h */
    public int f21245h = 0;

    /* JADX INFO: renamed from: i */
    public final hpd0 f21246i = new hpd0("has_inserted_see_upgrade_" + CoreModule.m1850H().userId(), Boolean.FALSE);

    /* JADX INFO: renamed from: j */
    public boolean f21247j = false;

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m23687b(Boolean bool) {
        if (bool.booleanValue()) {
            lsi0.y("插入成功");
        } else {
            lsi0.y("后端找不到新用户，建议换个账号");
        }
    }

    /* JADX INFO: renamed from: d */
    public static sbe0 m23688d() {
        if (f21237k == null) {
            synchronized (sbe0.class) {
                try {
                    if (f21237k == null) {
                        f21237k = new sbe0();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f21237k;
    }

    /* JADX INFO: renamed from: e */
    public static void m23689e() {
        f21237k = null;
    }

    /* JADX INFO: renamed from: c */
    public void m23690c(Act act) {
        act.duringCreated(CoreModule.f1534c.f3652m0.m3081v6()).subscribe(mkd0.H(new e30() { // from class: l.qbe0
            public final void call(Object obj) {
                sbe0.m23687b((Boolean) obj);
            }
        }, new e30() { // from class: l.rbe0
            public final void call(Object obj) {
                lsi0.y("插入失败，抓接口排查一下原因");
            }
        }));
    }
}
