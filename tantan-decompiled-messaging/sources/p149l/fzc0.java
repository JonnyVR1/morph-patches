package p149l;

import com.p046p1.mobile.putong.core.CoreModule;

/* JADX INFO: loaded from: classes9.dex */
public class fzc0 {

    /* JADX INFO: renamed from: g */
    public static fzc0 f99948g;

    /* JADX INFO: renamed from: a */
    public hpd0 f99949a;

    /* JADX INFO: renamed from: b */
    public hpd0 f99950b;

    /* JADX INFO: renamed from: c */
    public zpd0 f99951c;

    /* JADX INFO: renamed from: d */
    public hpd0 f99952d;

    /* JADX INFO: renamed from: e */
    public hpd0 f99953e;

    /* JADX INFO: renamed from: f */
    public hpd0 f99954f;

    public fzc0() {
        String str = "rev_target_user_defined_" + CoreModule.m29931H().userId();
        Boolean bool = Boolean.FALSE;
        this.f99949a = new hpd0(str, bool);
        this.f99950b = new hpd0("rev_target_user_flag_" + CoreModule.m29931H().userId(), bool);
        this.f99951c = new zpd0("rev_user_first_start_app_time" + CoreModule.m29931H().userId(), 0L);
        this.f99952d = new hpd0("has_shown_vip_expired_alert_24h" + CoreModule.m29931H().userId(), bool);
        this.f99953e = new hpd0("has_shown_vip_expired_alert_48h" + CoreModule.m29931H().userId(), bool);
        this.f99954f = new hpd0("has_show_vip_expired_alert" + CoreModule.m29931H().userId(), bool);
    }

    /* JADX INFO: renamed from: b */
    public static fzc0 m123824b() {
        if (f99948g == null) {
            synchronized (fzc0.class) {
                try {
                    if (f99948g == null) {
                        f99948g = new fzc0();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f99948g;
    }

    /* JADX INFO: renamed from: c */
    public static void m123825c() {
        f99948g = null;
    }

    /* JADX INFO: renamed from: a */
    public boolean m123826a() {
        return this.f99952d.get().booleanValue() || this.f99953e.get().booleanValue() || this.f99954f.get().booleanValue();
    }
}
