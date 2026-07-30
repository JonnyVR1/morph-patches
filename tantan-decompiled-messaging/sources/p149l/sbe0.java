package p149l;

import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;

/* JADX INFO: loaded from: classes9.dex */
public class sbe0 {

    /* JADX INFO: renamed from: k */
    public static volatile sbe0 f163520k;

    /* JADX INFO: renamed from: a */
    public int f163521a = 1;

    /* JADX INFO: renamed from: b */
    public final tpd0 f163522b = new tpd0("insert_see_less_than_six_" + CoreModule.m29931H().userId(), 0);

    /* JADX INFO: renamed from: c */
    public final tpd0 f163523c = new tpd0("insert_see_less_than_ten_" + CoreModule.m29931H().userId(), 0);

    /* JADX INFO: renamed from: d */
    public final tpd0 f163524d = new tpd0("insert_see_upgrade_svip_day_" + CoreModule.m29931H().userId(), 0);

    /* JADX INFO: renamed from: e */
    public final tpd0 f163525e = new tpd0("insert_see_upgrade_svip_week_" + CoreModule.m29931H().userId(), 0);

    /* JADX INFO: renamed from: f */
    public final zpd0 f163526f = new zpd0("insert_see_upgrade_time_less_than_ten_" + CoreModule.m29931H().userId(), 0L);

    /* JADX INFO: renamed from: g */
    public final zpd0 f163527g = new zpd0("insert_see_upgrade_time_svip_week_" + CoreModule.m29931H().userId(), 0L);

    /* JADX INFO: renamed from: h */
    public int f163528h = 0;

    /* JADX INFO: renamed from: i */
    public final hpd0 f163529i = new hpd0("has_inserted_see_upgrade_" + CoreModule.m29931H().userId(), Boolean.FALSE);

    /* JADX INFO: renamed from: j */
    public boolean f163530j = false;

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m183217b(Boolean bool) {
        if (bool.booleanValue()) {
            lsi0.m151595y("插入成功");
        } else {
            lsi0.m151595y("后端找不到新用户，建议换个账号");
        }
    }

    /* JADX INFO: renamed from: d */
    public static sbe0 m183218d() {
        if (f163520k == null) {
            synchronized (sbe0.class) {
                try {
                    if (f163520k == null) {
                        f163520k = new sbe0();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f163520k;
    }

    /* JADX INFO: renamed from: e */
    public static void m183219e() {
        f163520k = null;
    }

    /* JADX INFO: renamed from: c */
    public void m183220c(Act act) {
        act.duringCreated(CoreModule.f17545c.f19663m0.m31151v6()).subscribe(mkd0.m154956H(new e30() { // from class: l.qbe0
            @Override // p149l.e30
            public final void call(Object obj) {
                sbe0.m183217b((Boolean) obj);
            }
        }, new e30() { // from class: l.rbe0
            @Override // p149l.e30
            public final void call(Object obj) {
                lsi0.m151595y("插入失败，抓接口排查一下原因");
            }
        }));
    }
}
