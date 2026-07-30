package p006l;

import com.p000p1.mobile.putong.core.CoreModule;
import l.hpd0;
import l.zpd0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class fzc0 {

    /* JADX INFO: renamed from: g */
    public static fzc0 f12996g;

    /* JADX INFO: renamed from: a */
    public hpd0 f12997a;

    /* JADX INFO: renamed from: b */
    public hpd0 f12998b;

    /* JADX INFO: renamed from: c */
    public zpd0 f12999c;

    /* JADX INFO: renamed from: d */
    public hpd0 f13000d;

    /* JADX INFO: renamed from: e */
    public hpd0 f13001e;

    /* JADX INFO: renamed from: f */
    public hpd0 f13002f;

    public fzc0() {
        String str = "rev_target_user_defined_" + CoreModule.m1850H().userId();
        Boolean bool = Boolean.FALSE;
        this.f12997a = new hpd0(str, bool);
        this.f12998b = new hpd0("rev_target_user_flag_" + CoreModule.m1850H().userId(), bool);
        this.f12999c = new zpd0("rev_user_first_start_app_time" + CoreModule.m1850H().userId(), 0L);
        this.f13000d = new hpd0("has_shown_vip_expired_alert_24h" + CoreModule.m1850H().userId(), bool);
        this.f13001e = new hpd0("has_shown_vip_expired_alert_48h" + CoreModule.m1850H().userId(), bool);
        this.f13002f = new hpd0("has_show_vip_expired_alert" + CoreModule.m1850H().userId(), bool);
    }

    /* JADX INFO: renamed from: b */
    public static fzc0 m15534b() {
        if (f12996g == null) {
            synchronized (fzc0.class) {
                try {
                    if (f12996g == null) {
                        f12996g = new fzc0();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f12996g;
    }

    /* JADX INFO: renamed from: c */
    public static void m15535c() {
        f12996g = null;
    }

    /* JADX INFO: renamed from: a */
    public boolean m15536a() {
        return ((Boolean) this.f13000d.get()).booleanValue() || ((Boolean) this.f13001e.get()).booleanValue() || ((Boolean) this.f13002f.get()).booleanValue();
    }
}
