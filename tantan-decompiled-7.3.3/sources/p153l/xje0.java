package p153l;

import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;

/* JADX INFO: loaded from: classes12.dex */
public class xje0 {

    /* JADX INFO: renamed from: k */
    public static volatile xje0 f194559k;

    /* JADX INFO: renamed from: a */
    public int f194560a = 1;

    /* JADX INFO: renamed from: b */
    public final vxd0 f194561b = new vxd0("insert_see_less_than_six_" + CoreModule.m30929H().userId(), 0);

    /* JADX INFO: renamed from: c */
    public final vxd0 f194562c = new vxd0("insert_see_less_than_ten_" + CoreModule.m30929H().userId(), 0);

    /* JADX INFO: renamed from: d */
    public final vxd0 f194563d = new vxd0("insert_see_upgrade_svip_day_" + CoreModule.m30929H().userId(), 0);

    /* JADX INFO: renamed from: e */
    public final vxd0 f194564e = new vxd0("insert_see_upgrade_svip_week_" + CoreModule.m30929H().userId(), 0);

    /* JADX INFO: renamed from: f */
    public final byd0 f194565f = new byd0("insert_see_upgrade_time_less_than_ten_" + CoreModule.m30929H().userId(), 0L);

    /* JADX INFO: renamed from: g */
    public final byd0 f194566g = new byd0("insert_see_upgrade_time_svip_week_" + CoreModule.m30929H().userId(), 0L);

    /* JADX INFO: renamed from: h */
    public int f194567h = 0;

    /* JADX INFO: renamed from: i */
    public final jxd0 f194568i = new jxd0("has_inserted_see_upgrade_" + CoreModule.m30929H().userId(), Boolean.FALSE);

    /* JADX INFO: renamed from: j */
    public boolean f194569j = false;

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m211211b(Boolean bool) {
        if (bool.booleanValue()) {
            o1j0.m165651y("插入成功");
        } else {
            o1j0.m165651y("后端找不到新用户，建议换个账号");
        }
    }

    /* JADX INFO: renamed from: d */
    public static xje0 m211212d() {
        if (f194559k == null) {
            synchronized (xje0.class) {
                try {
                    if (f194559k == null) {
                        f194559k = new xje0();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f194559k;
    }

    /* JADX INFO: renamed from: e */
    public static void m211213e() {
        f194559k = null;
    }

    /* JADX INFO: renamed from: c */
    public void m211214c(Act act) {
        act.duringCreated(CoreModule.f18264c.f20405m0.m32154v6()).subscribe(psd0.m173597H(new y20() { // from class: l.vje0
            @Override // p153l.y20
            public final void call(Object obj) {
                xje0.m211211b((Boolean) obj);
            }
        }, new y20() { // from class: l.wje0
            @Override // p153l.y20
            public final void call(Object obj) {
                o1j0.m165651y("插入失败，抓接口排查一下原因");
            }
        }));
    }
}
