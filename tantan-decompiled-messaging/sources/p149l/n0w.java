package p149l;

import com.p046p1.mobile.putong.data.Followship;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.live.base.data.BLiveAbsData;
import com.p046p1.mobile.putong.live.base.data.BLiveTemplate;
import com.tantanapp.common.utils.CrashHelper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import p133rx.subjects.C22392a;

/* JADX INFO: loaded from: classes4.dex */
public class n0w {

    /* JADX INFO: renamed from: d */
    public final ho2 f136592d;

    /* JADX INFO: renamed from: a */
    public C22392a<User> f136589a = C22392a.m221512b();

    /* JADX INFO: renamed from: b */
    public final C22392a<Followship> f136590b = C22392a.m221512b();

    /* JADX INFO: renamed from: c */
    public final C22392a<ArrayList<String>> f136591c = C22392a.m221513c(new ArrayList());

    /* JADX INFO: renamed from: e */
    public final ti1 f136593e = new ti1();

    /* JADX INFO: renamed from: f */
    public final HashMap<Integer, BLiveTemplate> f136594f = new HashMap<>();

    public n0w(ho2 ho2Var) {
        this.f136592d = ho2Var;
    }

    /* JADX INFO: renamed from: b */
    public void m157289b() {
        this.f136594f.clear();
    }

    /* JADX INFO: renamed from: c */
    public C22392a<User> m157290c() {
        return this.f136589a;
    }

    /* JADX INFO: renamed from: d */
    public ti1 m157291d() {
        return this.f136593e;
    }

    /* JADX INFO: renamed from: e */
    public ho2 m157292e() {
        return this.f136592d;
    }

    /* JADX INFO: renamed from: f */
    public C22392a<Followship> m157293f() {
        return this.f136590b;
    }

    /* JADX INFO: renamed from: g */
    public BLiveAbsData m157294g() {
        return this.f136592d.mo149813j();
    }

    /* JADX INFO: renamed from: h */
    public C22392a<ArrayList<String>> m157295h() {
        return this.f136591c;
    }

    /* JADX INFO: renamed from: i */
    public HashMap<Integer, BLiveTemplate> m157296i() {
        return this.f136594f;
    }

    /* JADX INFO: renamed from: j */
    public void m157297j(boolean z) {
        List<BLiveTemplate> listM195729S5 = z ? ypv.m215672k().m195729S5() : ypv.m215672k().m195672L4();
        if (!vdt.m198092b(2) && ypv.m215672k().m195996z4() != null) {
            List<BLiveTemplate> listM149465b = ldp.m149464a().m149465b();
            if (vwb.m200296J(listM149465b)) {
                CrashHelper.m81296c(new IllegalStateException("Message template not exit"));
            } else {
                listM195729S5 = listM149465b;
            }
        }
        if (vwb.m200296J(listM195729S5)) {
            return;
        }
        vwb.m200354z(listM195729S5, new e30() { // from class: l.m0w
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f130777a.m157298k((BLiveTemplate) obj);
            }
        });
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m157298k(BLiveTemplate bLiveTemplate) {
        this.f136594f.put(Integer.valueOf(bLiveTemplate.f44457id), bLiveTemplate);
    }

    /* JADX INFO: renamed from: l */
    public void m157299l(C22392a<User> c22392a) {
        this.f136589a = c22392a;
    }
}
