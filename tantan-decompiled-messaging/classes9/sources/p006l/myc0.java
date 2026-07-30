package p006l;

import com.p000p1.mobile.putong.core.CoreModule;
import java.util.HashSet;
import java.util.Set;
import l.lqa;
import l.mqi0;
import l.roj0;
import l.tpd0;
import l.zpd0;
import rx.subjects.b;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class myc0 extends ogl0 {

    /* JADX INFO: renamed from: q */
    public static myc0 f17369q;

    /* JADX INFO: renamed from: g */
    public boolean f17375g;

    /* JADX INFO: renamed from: h */
    public boolean f17376h;

    /* JADX INFO: renamed from: i */
    public boolean f17377i;

    /* JADX INFO: renamed from: b */
    public int f17370b = -1;

    /* JADX INFO: renamed from: c */
    public final zpd0 f17371c = new zpd0("last_show_profile_tip_time" + CoreModule.m1850H().userId(), 0L);

    /* JADX INFO: renamed from: d */
    public final tpd0 f17372d = new tpd0("profile_tip_show_count" + CoreModule.m1850H().userId(), 0);

    /* JADX INFO: renamed from: e */
    public final zpd0 f17373e = new zpd0("last_show_boost_tip_time" + CoreModule.m1850H().userId(), 0L);

    /* JADX INFO: renamed from: f */
    public final zpd0 f17374f = new zpd0("last_show_new_superlike_remaining" + CoreModule.m1850H().userId(), 0L);

    /* JADX INFO: renamed from: j */
    public Set<String> f17378j = new HashSet();

    /* JADX INFO: renamed from: k */
    public final zpd0 f17379k = new zpd0("last_show_sl_tip_time_" + CoreModule.m1850H().userId(), 0L);

    /* JADX INFO: renamed from: l */
    public final tpd0 f17380l = new tpd0("last_show_sl_tip_count_" + CoreModule.m1850H().userId(), 0);

    /* JADX INFO: renamed from: m */
    public Set<String> f17381m = new HashSet();

    /* JADX INFO: renamed from: n */
    public final zpd0 f17382n = new zpd0("last_show_sl_tip_time_for_card_expand" + CoreModule.m1850H().userId(), 0L);

    /* JADX INFO: renamed from: o */
    public final tpd0 f17383o = new tpd0("last_show_sl_tip_count_for_card_expand" + CoreModule.m1850H().userId(), 0);

    /* JADX INFO: renamed from: p */
    public b<roj0> f17384p = b.b();

    /* JADX INFO: renamed from: d0 */
    public static myc0 m19573d0() {
        if (f17369q == null) {
            synchronized (myc0.class) {
                try {
                    if (f17369q == null) {
                        f17369q = new myc0();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f17369q;
    }

    /* JADX INFO: renamed from: i0 */
    public static void m19574i0() {
        f17369q = null;
    }

    /* JADX INFO: renamed from: c0 */
    public void m19575c0() {
        this.f17374f.put(0L);
    }

    /* JADX INFO: renamed from: e0 */
    public boolean m19576e0() {
        return mqi0.D(((Long) this.f17373e.get()).longValue());
    }

    /* JADX INFO: renamed from: f0 */
    public boolean m19577f0() {
        int i;
        if (!mqi0.D(((Long) this.f17379k.get()).longValue())) {
            this.f17380l.put(0);
        }
        if (lqa.o()) {
            i = lqa.e() == null ? 3 : lqa.e().superlike_day_limit;
        } else {
            i = 10;
        }
        return ((Integer) this.f17380l.get()).intValue() < i;
    }

    /* JADX INFO: renamed from: g0 */
    public boolean m19578g0() {
        int i;
        if (!mqi0.D(((Long) this.f17382n.get()).longValue())) {
            this.f17383o.put(0);
        }
        if (lqa.o()) {
            i = lqa.e() == null ? 3 : lqa.e().superlike_day_limit;
        } else {
            i = 10;
        }
        return ((Integer) this.f17383o.get()).intValue() < i;
    }

    /* JADX INFO: renamed from: h0 */
    public void m19579h0() {
        this.f17384p.onNext(roj0.a);
    }

    /* JADX INFO: renamed from: j0 */
    public void m19580j0() {
        this.f17373e.put(Long.valueOf(mqi0.o()));
    }

    /* JADX INFO: renamed from: k0 */
    public void m19581k0() {
        this.f17374f.put(Long.valueOf(mqi0.o()));
    }

    /* JADX INFO: renamed from: l0 */
    public void m19582l0() {
        this.f17379k.put(Long.valueOf(mqi0.o()));
        tpd0 tpd0Var = this.f17380l;
        tpd0Var.put(Integer.valueOf(((Integer) tpd0Var.get()).intValue() + 1));
    }

    /* JADX INFO: renamed from: m0 */
    public void m19583m0() {
        this.f17382n.put(Long.valueOf(mqi0.o()));
        tpd0 tpd0Var = this.f17383o;
        tpd0Var.put(Integer.valueOf(((Integer) tpd0Var.get()).intValue() + 1));
    }
}
