package p153l;

import com.p051p1.mobile.putong.core.CoreModule;
import java.util.HashSet;
import java.util.Set;
import p137rx.subjects.C22508b;

/* JADX INFO: loaded from: classes9.dex */
public class p6d0 extends spl0 {

    /* JADX INFO: renamed from: q */
    public static p6d0 f150808q;

    /* JADX INFO: renamed from: g */
    public boolean f150814g;

    /* JADX INFO: renamed from: h */
    public boolean f150815h;

    /* JADX INFO: renamed from: i */
    public boolean f150816i;

    /* JADX INFO: renamed from: b */
    public int f150809b = -1;

    /* JADX INFO: renamed from: c */
    public final byd0 f150810c = new byd0("last_show_profile_tip_time" + CoreModule.m30929H().userId(), 0L);

    /* JADX INFO: renamed from: d */
    public final vxd0 f150811d = new vxd0("profile_tip_show_count" + CoreModule.m30929H().userId(), 0);

    /* JADX INFO: renamed from: e */
    public final byd0 f150812e = new byd0("last_show_boost_tip_time" + CoreModule.m30929H().userId(), 0L);

    /* JADX INFO: renamed from: f */
    public final byd0 f150813f = new byd0("last_show_new_superlike_remaining" + CoreModule.m30929H().userId(), 0L);

    /* JADX INFO: renamed from: j */
    public Set<String> f150817j = new HashSet();

    /* JADX INFO: renamed from: k */
    public final byd0 f150818k = new byd0("last_show_sl_tip_time_" + CoreModule.m30929H().userId(), 0L);

    /* JADX INFO: renamed from: l */
    public final vxd0 f150819l = new vxd0("last_show_sl_tip_count_" + CoreModule.m30929H().userId(), 0);

    /* JADX INFO: renamed from: m */
    public Set<String> f150820m = new HashSet();

    /* JADX INFO: renamed from: n */
    public final byd0 f150821n = new byd0("last_show_sl_tip_time_for_card_expand" + CoreModule.m30929H().userId(), 0L);

    /* JADX INFO: renamed from: o */
    public final vxd0 f150822o = new vxd0("last_show_sl_tip_count_for_card_expand" + CoreModule.m30929H().userId(), 0);

    /* JADX INFO: renamed from: p */
    public C22508b<uxj0> f150823p = C22508b.m222767b();

    /* JADX INFO: renamed from: d0 */
    public static p6d0 m170847d0() {
        if (f150808q == null) {
            synchronized (p6d0.class) {
                try {
                    if (f150808q == null) {
                        f150808q = new p6d0();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f150808q;
    }

    /* JADX INFO: renamed from: i0 */
    public static void m170848i0() {
        f150808q = null;
    }

    /* JADX INFO: renamed from: c0 */
    public void m170849c0() {
        this.f150813f.put(0L);
    }

    /* JADX INFO: renamed from: e0 */
    public boolean m170850e0() {
        return pzi0.m174439D(this.f150812e.get().longValue());
    }

    /* JADX INFO: renamed from: f0 */
    public boolean m170851f0() {
        int i;
        if (!pzi0.m174439D(this.f150818k.get().longValue())) {
            this.f150819l.put(0);
        }
        if (xra.m212796o()) {
            i = xra.m212786e() == null ? 3 : xra.m212786e().superlike_day_limit;
        } else {
            i = 10;
        }
        return this.f150819l.get().intValue() < i;
    }

    /* JADX INFO: renamed from: g0 */
    public boolean m170852g0() {
        int i;
        if (!pzi0.m174439D(this.f150821n.get().longValue())) {
            this.f150822o.put(0);
        }
        if (xra.m212796o()) {
            i = xra.m212786e() == null ? 3 : xra.m212786e().superlike_day_limit;
        } else {
            i = 10;
        }
        return this.f150822o.get().intValue() < i;
    }

    /* JADX INFO: renamed from: h0 */
    public void m170853h0() {
        this.f150823p.onNext(uxj0.f181467a);
    }

    /* JADX INFO: renamed from: j0 */
    public void m170854j0() {
        this.f150812e.put(Long.valueOf(pzi0.m174454o()));
    }

    /* JADX INFO: renamed from: k0 */
    public void m170855k0() {
        this.f150813f.put(Long.valueOf(pzi0.m174454o()));
    }

    /* JADX INFO: renamed from: l0 */
    public void m170856l0() {
        this.f150818k.put(Long.valueOf(pzi0.m174454o()));
        vxd0 vxd0Var = this.f150819l;
        vxd0Var.put(Integer.valueOf(vxd0Var.get().intValue() + 1));
    }

    /* JADX INFO: renamed from: m0 */
    public void m170857m0() {
        this.f150821n.put(Long.valueOf(pzi0.m174454o()));
        vxd0 vxd0Var = this.f150822o;
        vxd0Var.put(Integer.valueOf(vxd0Var.get().intValue() + 1));
    }
}
