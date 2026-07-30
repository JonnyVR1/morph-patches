package p002l;

import com.p1.mobile.putong.data.Followship;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.live.base.data.BLiveAbsData;
import com.p1.mobile.putong.live.base.data.BLiveTemplate;
import com.tantanapp.common.utils.CrashHelper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import l.e30;
import l.ti1;
import l.vdt;
import l.vwb;
import l.ypv;
import rx.subjects.a;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class n0w {

    /* JADX INFO: renamed from: d */
    public final ho2 f15776d;

    /* JADX INFO: renamed from: a */
    public a<User> f15773a = a.b();

    /* JADX INFO: renamed from: b */
    public final a<Followship> f15774b = a.b();

    /* JADX INFO: renamed from: c */
    public final a<ArrayList<String>> f15775c = a.c(new ArrayList());

    /* JADX INFO: renamed from: e */
    public final ti1 f15777e = new ti1();

    /* JADX INFO: renamed from: f */
    public final HashMap<Integer, BLiveTemplate> f15778f = new HashMap<>();

    public n0w(ho2 ho2Var) {
        this.f15776d = ho2Var;
    }

    /* JADX INFO: renamed from: b */
    public void m18351b() {
        this.f15778f.clear();
    }

    /* JADX INFO: renamed from: c */
    public a<User> m18352c() {
        return this.f15773a;
    }

    /* JADX INFO: renamed from: d */
    public ti1 m18353d() {
        return this.f15777e;
    }

    /* JADX INFO: renamed from: e */
    public ho2 m18354e() {
        return this.f15776d;
    }

    /* JADX INFO: renamed from: f */
    public a<Followship> m18355f() {
        return this.f15774b;
    }

    /* JADX INFO: renamed from: g */
    public BLiveAbsData m18356g() {
        return this.f15776d.m17234j();
    }

    /* JADX INFO: renamed from: h */
    public a<ArrayList<String>> m18357h() {
        return this.f15775c;
    }

    /* JADX INFO: renamed from: i */
    public HashMap<Integer, BLiveTemplate> m18358i() {
        return this.f15778f;
    }

    /* JADX INFO: renamed from: j */
    public void m18359j(boolean z) {
        List<BLiveTemplate> listS5 = z ? ypv.k().S5() : ypv.k().L4();
        if (!vdt.b(2) && ypv.k().z4() != null) {
            List<BLiveTemplate> listM17142b = ldp.m17141a().m17142b();
            if (vwb.J(listM17142b)) {
                CrashHelper.c(new IllegalStateException("Message template not exit"));
            } else {
                listS5 = listM17142b;
            }
        }
        if (vwb.J(listS5)) {
            return;
        }
        vwb.z(listS5, new e30() { // from class: l.m0w
            public final void call(Object obj) {
                this.f15197a.m18360k((BLiveTemplate) obj);
            }
        });
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m18360k(BLiveTemplate bLiveTemplate) {
        this.f15778f.put(Integer.valueOf(bLiveTemplate.id), bLiveTemplate);
    }

    /* JADX INFO: renamed from: l */
    public void m18361l(a<User> aVar) {
        this.f15773a = aVar;
    }
}
