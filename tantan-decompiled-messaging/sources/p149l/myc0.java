package p149l;

import com.p046p1.mobile.putong.core.CoreModule;
import java.util.HashSet;
import java.util.Set;
import p133rx.subjects.C22393b;

/* JADX INFO: loaded from: classes9.dex */
public class myc0 extends ogl0 {

    /* JADX INFO: renamed from: q */
    public static myc0 f136276q;

    /* JADX INFO: renamed from: g */
    public boolean f136282g;

    /* JADX INFO: renamed from: h */
    public boolean f136283h;

    /* JADX INFO: renamed from: i */
    public boolean f136284i;

    /* JADX INFO: renamed from: b */
    public int f136277b = -1;

    /* JADX INFO: renamed from: c */
    public final zpd0 f136278c = new zpd0("last_show_profile_tip_time" + CoreModule.m29931H().userId(), 0L);

    /* JADX INFO: renamed from: d */
    public final tpd0 f136279d = new tpd0("profile_tip_show_count" + CoreModule.m29931H().userId(), 0);

    /* JADX INFO: renamed from: e */
    public final zpd0 f136280e = new zpd0("last_show_boost_tip_time" + CoreModule.m29931H().userId(), 0L);

    /* JADX INFO: renamed from: f */
    public final zpd0 f136281f = new zpd0("last_show_new_superlike_remaining" + CoreModule.m29931H().userId(), 0L);

    /* JADX INFO: renamed from: j */
    public Set<String> f136285j = new HashSet();

    /* JADX INFO: renamed from: k */
    public final zpd0 f136286k = new zpd0("last_show_sl_tip_time_" + CoreModule.m29931H().userId(), 0L);

    /* JADX INFO: renamed from: l */
    public final tpd0 f136287l = new tpd0("last_show_sl_tip_count_" + CoreModule.m29931H().userId(), 0);

    /* JADX INFO: renamed from: m */
    public Set<String> f136288m = new HashSet();

    /* JADX INFO: renamed from: n */
    public final zpd0 f136289n = new zpd0("last_show_sl_tip_time_for_card_expand" + CoreModule.m29931H().userId(), 0L);

    /* JADX INFO: renamed from: o */
    public final tpd0 f136290o = new tpd0("last_show_sl_tip_count_for_card_expand" + CoreModule.m29931H().userId(), 0);

    /* JADX INFO: renamed from: p */
    public C22393b<roj0> f136291p = C22393b.m221521b();

    /* JADX INFO: renamed from: d0 */
    public static myc0 m157001d0() {
        if (f136276q == null) {
            synchronized (myc0.class) {
                try {
                    if (f136276q == null) {
                        f136276q = new myc0();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f136276q;
    }

    /* JADX INFO: renamed from: i0 */
    public static void m157002i0() {
        f136276q = null;
    }

    /* JADX INFO: renamed from: c0 */
    public void m157003c0() {
        this.f136281f.put(0L);
    }

    /* JADX INFO: renamed from: e0 */
    public boolean m157004e0() {
        return mqi0.m155929D(this.f136280e.get().longValue());
    }

    /* JADX INFO: renamed from: f0 */
    public boolean m157005f0() {
        int i;
        if (!mqi0.m155929D(this.f136286k.get().longValue())) {
            this.f136287l.put(0);
        }
        if (lqa.m150977o()) {
            i = lqa.m150967e() == null ? 3 : lqa.m150967e().superlike_day_limit;
        } else {
            i = 10;
        }
        return this.f136287l.get().intValue() < i;
    }

    /* JADX INFO: renamed from: g0 */
    public boolean m157006g0() {
        int i;
        if (!mqi0.m155929D(this.f136289n.get().longValue())) {
            this.f136290o.put(0);
        }
        if (lqa.m150977o()) {
            i = lqa.m150967e() == null ? 3 : lqa.m150967e().superlike_day_limit;
        } else {
            i = 10;
        }
        return this.f136290o.get().intValue() < i;
    }

    /* JADX INFO: renamed from: h0 */
    public void m157007h0() {
        this.f136291p.onNext(roj0.f160388a);
    }

    /* JADX INFO: renamed from: j0 */
    public void m157008j0() {
        this.f136280e.put(Long.valueOf(mqi0.m155944o()));
    }

    /* JADX INFO: renamed from: k0 */
    public void m157009k0() {
        this.f136281f.put(Long.valueOf(mqi0.m155944o()));
    }

    /* JADX INFO: renamed from: l0 */
    public void m157010l0() {
        this.f136286k.put(Long.valueOf(mqi0.m155944o()));
        tpd0 tpd0Var = this.f136287l;
        tpd0Var.put(Integer.valueOf(tpd0Var.get().intValue() + 1));
    }

    /* JADX INFO: renamed from: m0 */
    public void m157011m0() {
        this.f136289n.put(Long.valueOf(mqi0.m155944o()));
        tpd0 tpd0Var = this.f136290o;
        tpd0Var.put(Integer.valueOf(tpd0Var.get().intValue() + 1));
    }
}
