package p153l;

import com.p051p1.mobile.putong.live.base.data.BLiveAbsData;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class rvk {

    /* JADX INFO: renamed from: a */
    public boolean f165022a;

    /* JADX INFO: renamed from: b */
    public int f165023b = 2;

    /* JADX INFO: renamed from: c */
    public List<Integer> f165024c = new ArrayList();

    /* JADX INFO: renamed from: d */
    public int f165025d = 3;

    /* JADX INFO: renamed from: e */
    public vxd0 f165026e = new vxd0("interval_coordinate" + zrv.f205799a.m207631D0(), 0);

    /* JADX INFO: renamed from: f */
    public vxd0 f165027f = new vxd0("total_watch_day" + zrv.f205799a.m207631D0(), 0);

    /* JADX INFO: renamed from: g */
    public vxd0 f165028g = new vxd0("id_show_time" + zrv.f205799a.m207631D0(), 0);

    /* JADX INFO: renamed from: h */
    public byd0 f165029h = new byd0("last_time" + zrv.f205799a.m207631D0(), 0L);

    /* JADX INFO: renamed from: i */
    public jxd0 f165030i = new jxd0("first_enter_room" + zrv.f205799a.m207631D0(), Boolean.TRUE);

    public rvk() {
        m183271d();
    }

    /* JADX INFO: renamed from: a */
    public final void m183268a() {
        vxd0 vxd0Var = this.f165028g;
        vxd0Var.put(Integer.valueOf(vxd0Var.get().intValue() + 1));
    }

    /* JADX INFO: renamed from: b */
    public final boolean m183269b(int i) {
        return i >= this.f165024c.size() || this.f165027f.get().intValue() >= this.f165024c.get(i).intValue();
    }

    /* JADX INFO: renamed from: c */
    public void m183270c() {
        this.f165030i.put(Boolean.FALSE);
        this.f165029h.put(Long.valueOf(System.currentTimeMillis()));
    }

    /* JADX INFO: renamed from: d */
    public final void m183271d() {
        if (!pzi0.m174439D(this.f165029h.get().longValue())) {
            vxd0 vxd0Var = this.f165027f;
            vxd0Var.put(Integer.valueOf(vxd0Var.get().intValue() + 1));
        }
        this.f165023b = zrv.m221193k().m203490P3();
        this.f165025d = zrv.m221193k().m203443J4();
        this.f165024c.addAll(zrv.m221193k().m203734t4());
    }

    /* JADX INFO: renamed from: e */
    public boolean m183272e(BLiveAbsData bLiveAbsData) {
        if (this.f165022a) {
            return false;
        }
        int iIntValue = this.f165026e.get().intValue();
        if (this.f165030i.get().booleanValue()) {
            this.f165030i.put(Boolean.FALSE);
            m183268a();
            return true;
        }
        if (!m183269b(iIntValue) || this.f165028g.get().intValue() >= this.f165025d) {
            return false;
        }
        this.f165027f.put(0);
        this.f165026e.put(Integer.valueOf(iIntValue + 1));
        if (this.f165026e.get().intValue() > this.f165024c.size() - 1) {
            this.f165026e.put(0);
        }
        m183268a();
        return true;
    }
}
