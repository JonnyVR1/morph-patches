package p149l;

import com.p046p1.mobile.putong.live.base.data.BLiveAbsData;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class btk {

    /* JADX INFO: renamed from: a */
    public boolean f77234a;

    /* JADX INFO: renamed from: b */
    public int f77235b = 2;

    /* JADX INFO: renamed from: c */
    public List<Integer> f77236c = new ArrayList();

    /* JADX INFO: renamed from: d */
    public int f77237d = 3;

    /* JADX INFO: renamed from: e */
    public tpd0 f77238e = new tpd0("interval_coordinate" + ypv.f199493a.m199309D0(), 0);

    /* JADX INFO: renamed from: f */
    public tpd0 f77239f = new tpd0("total_watch_day" + ypv.f199493a.m199309D0(), 0);

    /* JADX INFO: renamed from: g */
    public tpd0 f77240g = new tpd0("id_show_time" + ypv.f199493a.m199309D0(), 0);

    /* JADX INFO: renamed from: h */
    public zpd0 f77241h = new zpd0("last_time" + ypv.f199493a.m199309D0(), 0L);

    /* JADX INFO: renamed from: i */
    public hpd0 f77242i = new hpd0("first_enter_room" + ypv.f199493a.m199309D0(), Boolean.TRUE);

    public btk() {
        m103858d();
    }

    /* JADX INFO: renamed from: a */
    public final void m103855a() {
        tpd0 tpd0Var = this.f77240g;
        tpd0Var.put(Integer.valueOf(tpd0Var.get().intValue() + 1));
    }

    /* JADX INFO: renamed from: b */
    public final boolean m103856b(int i) {
        return i >= this.f77236c.size() || this.f77239f.get().intValue() >= this.f77236c.get(i).intValue();
    }

    /* JADX INFO: renamed from: c */
    public void m103857c() {
        this.f77242i.put(Boolean.FALSE);
        this.f77241h.put(Long.valueOf(System.currentTimeMillis()));
    }

    /* JADX INFO: renamed from: d */
    public final void m103858d() {
        if (!mqi0.m155929D(this.f77241h.get().longValue())) {
            tpd0 tpd0Var = this.f77239f;
            tpd0Var.put(Integer.valueOf(tpd0Var.get().intValue() + 1));
        }
        this.f77235b = ypv.m215672k().m195703P3();
        this.f77237d = ypv.m215672k().m195656J4();
        this.f77236c.addAll(ypv.m215672k().m195947t4());
    }

    /* JADX INFO: renamed from: e */
    public boolean m103859e(BLiveAbsData bLiveAbsData) {
        if (this.f77234a) {
            return false;
        }
        int iIntValue = this.f77238e.get().intValue();
        if (this.f77242i.get().booleanValue()) {
            this.f77242i.put(Boolean.FALSE);
            m103855a();
            return true;
        }
        if (!m103856b(iIntValue) || this.f77240g.get().intValue() >= this.f77237d) {
            return false;
        }
        this.f77239f.put(0);
        this.f77238e.put(Integer.valueOf(iIntValue + 1));
        if (this.f77238e.get().intValue() > this.f77236c.size() - 1) {
            this.f77238e.put(0);
        }
        m103855a();
        return true;
    }
}
