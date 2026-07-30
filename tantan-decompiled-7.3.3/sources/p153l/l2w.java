package p153l;

import com.p051p1.mobile.putong.data.Followship;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.live.base.data.BLiveAbsData;
import com.p051p1.mobile.putong.live.base.data.BLiveTemplate;
import com.tantanapp.common.utils.CrashHelper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import p137rx.subjects.C22507a;

/* JADX INFO: loaded from: classes4.dex */
public class l2w {

    /* JADX INFO: renamed from: d */
    public final oo2 f129812d;

    /* JADX INFO: renamed from: a */
    public C22507a<User> f129809a = C22507a.m222758b();

    /* JADX INFO: renamed from: b */
    public final C22507a<Followship> f129810b = C22507a.m222758b();

    /* JADX INFO: renamed from: c */
    public final C22507a<ArrayList<String>> f129811c = C22507a.m222759c(new ArrayList());

    /* JADX INFO: renamed from: e */
    public final aj1 f129813e = new aj1();

    /* JADX INFO: renamed from: f */
    public final HashMap<Integer, BLiveTemplate> f129814f = new HashMap<>();

    public l2w(oo2 oo2Var) {
        this.f129812d = oo2Var;
    }

    /* JADX INFO: renamed from: b */
    public void m152638b() {
        this.f129814f.clear();
    }

    /* JADX INFO: renamed from: c */
    public C22507a<User> m152639c() {
        return this.f129809a;
    }

    /* JADX INFO: renamed from: d */
    public aj1 m152640d() {
        return this.f129813e;
    }

    /* JADX INFO: renamed from: e */
    public oo2 m152641e() {
        return this.f129812d;
    }

    /* JADX INFO: renamed from: f */
    public C22507a<Followship> m152642f() {
        return this.f129810b;
    }

    /* JADX INFO: renamed from: g */
    public BLiveAbsData m152643g() {
        return this.f129812d.mo183435j();
    }

    /* JADX INFO: renamed from: h */
    public C22507a<ArrayList<String>> m152644h() {
        return this.f129811c;
    }

    /* JADX INFO: renamed from: i */
    public HashMap<Integer, BLiveTemplate> m152645i() {
        return this.f129814f;
    }

    /* JADX INFO: renamed from: j */
    public void m152646j(boolean z) {
        List<BLiveTemplate> listM203516S5 = z ? zrv.m221193k().m203516S5() : zrv.m221193k().m203459L4();
        if (!wft.m206159b(2) && zrv.m221193k().m203783z4() != null) {
            List<BLiveTemplate> listM154032b = lfp.m154031a().m154032b();
            if (jyb.m147479J(listM154032b)) {
                CrashHelper.m82479c(new IllegalStateException("Message template not exit"));
            } else {
                listM203516S5 = listM154032b;
            }
        }
        if (jyb.m147479J(listM203516S5)) {
            return;
        }
        jyb.m147537z(listM203516S5, new y20() { // from class: l.k2w
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f123655a.m152647k((BLiveTemplate) obj);
            }
        });
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m152647k(BLiveTemplate bLiveTemplate) {
        this.f129814f.put(Integer.valueOf(bLiveTemplate.f45305id), bLiveTemplate);
    }

    /* JADX INFO: renamed from: l */
    public void m152648l(C22507a<User> c22507a) {
        this.f129809a = c22507a;
    }
}
