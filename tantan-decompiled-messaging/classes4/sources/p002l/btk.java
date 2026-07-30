package p002l;

import com.p1.mobile.putong.live.base.data.BLiveAbsData;
import java.util.ArrayList;
import java.util.List;
import l.hpd0;
import l.mqi0;
import l.tpd0;
import l.ypv;
import l.zpd0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class btk {

    /* JADX INFO: renamed from: a */
    public boolean f8349a;

    /* JADX INFO: renamed from: b */
    public int f8350b = 2;

    /* JADX INFO: renamed from: c */
    public List<Integer> f8351c = new ArrayList();

    /* JADX INFO: renamed from: d */
    public int f8352d = 3;

    /* JADX INFO: renamed from: e */
    public tpd0 f8353e = new tpd0("interval_coordinate" + ypv.a.D0(), 0);

    /* JADX INFO: renamed from: f */
    public tpd0 f8354f = new tpd0("total_watch_day" + ypv.a.D0(), 0);

    /* JADX INFO: renamed from: g */
    public tpd0 f8355g = new tpd0("id_show_time" + ypv.a.D0(), 0);

    /* JADX INFO: renamed from: h */
    public zpd0 f8356h = new zpd0("last_time" + ypv.a.D0(), 0L);

    /* JADX INFO: renamed from: i */
    public hpd0 f8357i = new hpd0("first_enter_room" + ypv.a.D0(), Boolean.TRUE);

    public btk() {
        m10617d();
    }

    /* JADX INFO: renamed from: a */
    public final void m10614a() {
        tpd0 tpd0Var = this.f8355g;
        tpd0Var.put(Integer.valueOf(((Integer) tpd0Var.get()).intValue() + 1));
    }

    /* JADX INFO: renamed from: b */
    public final boolean m10615b(int i) {
        return i >= this.f8351c.size() || ((Integer) this.f8354f.get()).intValue() >= this.f8351c.get(i).intValue();
    }

    /* JADX INFO: renamed from: c */
    public void m10616c() {
        this.f8357i.put(Boolean.FALSE);
        this.f8356h.put(Long.valueOf(System.currentTimeMillis()));
    }

    /* JADX INFO: renamed from: d */
    public final void m10617d() {
        if (!mqi0.D(((Long) this.f8356h.get()).longValue())) {
            tpd0 tpd0Var = this.f8354f;
            tpd0Var.put(Integer.valueOf(((Integer) tpd0Var.get()).intValue() + 1));
        }
        this.f8350b = ypv.k().P3();
        this.f8352d = ypv.k().J4();
        this.f8351c.addAll(ypv.k().t4());
    }

    /* JADX INFO: renamed from: e */
    public boolean m10618e(BLiveAbsData bLiveAbsData) {
        if (this.f8349a) {
            return false;
        }
        int iIntValue = ((Integer) this.f8353e.get()).intValue();
        if (((Boolean) this.f8357i.get()).booleanValue()) {
            this.f8357i.put(Boolean.FALSE);
            m10614a();
            return true;
        }
        if (!m10615b(iIntValue) || ((Integer) this.f8355g.get()).intValue() >= this.f8352d) {
            return false;
        }
        this.f8354f.put(0);
        this.f8353e.put(Integer.valueOf(iIntValue + 1));
        if (((Integer) this.f8353e.get()).intValue() > this.f8351c.size() - 1) {
            this.f8353e.put(0);
        }
        m10614a();
        return true;
    }
}
