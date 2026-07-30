package p153l;

import android.util.Pair;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.C4879a;
import com.p051p1.mobile.putong.core.api.C4883c;
import com.p051p1.mobile.putong.core.data.CoreData;
import com.p051p1.mobile.putong.core.data.LikeUser;
import com.p051p1.mobile.putong.data.CommonData;
import com.p051p1.mobile.putong.data.Envelope;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p137rx.C22421c;
import p137rx.subjects.C22507a;

/* JADX INFO: loaded from: classes9.dex */
public class r79 {

    /* JADX INFO: renamed from: a */
    public final C4883c f161590a;

    /* JADX INFO: renamed from: b */
    public final Map<String, LikeUser> f161591b = new HashMap();

    /* JADX INFO: renamed from: c */
    public final Set<String> f161592c = new HashSet();

    /* JADX INFO: renamed from: d */
    public final C22507a<Pair<List<LikeUser>, Boolean>> f161593d = C22507a.m222758b();

    public r79(C4883c c4883c) {
        this.f161590a = c4883c;
    }

    /* JADX INFO: renamed from: A */
    public void m180094A(final String str) {
        Pair<List<LikeUser>, Boolean> pairM222761e = this.f161593d.m222761e();
        if (NullChecker.m82486a(pairM222761e) && !jyb.m147479J((Collection) pairM222761e.first)) {
            jyb.m147505e0((List) pairM222761e.first, new qcj() { // from class: l.m79
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf(((LikeUser) obj).userId.equals(str));
                }
            });
        }
        this.f161592c.remove(str);
    }

    /* JADX INFO: renamed from: j */
    public void m180095j() {
        this.f161592c.clear();
    }

    /* JADX INFO: renamed from: k */
    public void m180096k() {
        this.f161590a.clearRequests("intl_ilike_" + CoreModule.m30929H().userId(), 0);
    }

    /* JADX INFO: renamed from: l */
    public C22421c<Pair<List<LikeUser>, Boolean>> m180097l() {
        return this.f161593d.asObservable();
    }

    /* JADX INFO: renamed from: m */
    public LikeUser m180098m(String str) {
        return this.f161591b.get(str);
    }

    /* JADX INFO: renamed from: n */
    public LikeUser m180099n(final String str) {
        Pair<List<LikeUser>, Boolean> pairM222761e = this.f161593d.m222761e();
        if (!NullChecker.m82486a(pairM222761e) || jyb.m147479J((Collection) pairM222761e.first)) {
            return null;
        }
        return (LikeUser) jyb.m147529r((Collection) pairM222761e.first, new qcj() { // from class: l.p79
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((LikeUser) obj).userId.equals(str));
            }
        });
    }

    /* JADX INFO: renamed from: o */
    public final List<LikeUser> m180100o(List<LikeUser> list) {
        this.f161592c.clear();
        if (!jyb.m147479J(list)) {
            this.f161592c.addAll(jyb.m147486Q(list, new qcj() { // from class: l.q79
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((LikeUser) obj).userId;
                }
            }));
        }
        return list != null ? list : new ArrayList();
    }

    /* JADX INFO: renamed from: p */
    public final boolean m180101p(List<LikeUser> list) {
        return jyb.m147479J(list);
    }

    /* JADX INFO: renamed from: q */
    public final boolean m180102q() {
        return NullChecker.m82486a(this.f161593d.m222761e()) && !this.f161592c.isEmpty();
    }

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ x1d0 m180103r(String str) {
        return C4879a.f20236P.auth().m209043q(C4879a.m32319k0(CoreModule.m30929H().userId(), str)).m209028b();
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ Envelope m180104s(Envelope envelope) {
        if (!jyb.m147479J(((CommonData) envelope.getModuleData(CommonData.class)).users)) {
            this.f161590a.m32495w3(envelope, null);
        }
        return envelope;
    }

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ uxj0 m180105t(int i, Envelope envelope) {
        m180111z(envelope, i);
        return uxj0.f181467a;
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ C22421c m180106u(final String str, final int i) {
        return qi20.m176658e(new pcj() { // from class: l.j79
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f118654a.m180103r(str);
            }
        }).map(new qcj() { // from class: l.k79
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f124253a.m180104s((Envelope) obj);
            }
        }).observeOn(fo0.m126432a()).map(new qcj() { // from class: l.l79
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f130330a.m180105t(i, (Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ void m180107v(List list, LikeUser likeUser) {
        if (this.f161592c.contains(likeUser.userId)) {
            return;
        }
        this.f161592c.add(likeUser.userId);
        list.add(likeUser);
    }

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ void m180108w(LikeUser likeUser) {
        this.f161591b.put(likeUser.userId, likeUser);
    }

    /* JADX INFO: renamed from: x */
    public void m180109x(final int i, int i2) {
        final String str = "cursorIdx=" + i + "&limit=" + i2;
        this.f161590a.scheduled("intl_ilike_" + CoreModule.m30929H().userId(), 0, new pcj() { // from class: l.i79
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f113244a.m180106u(str, i);
            }
        });
    }

    /* JADX INFO: renamed from: y */
    public final List<LikeUser> m180110y(List<LikeUser> list, int i) {
        if (jyb.m147479J(list)) {
            return null;
        }
        List<LikeUser> list2 = (List) this.f161593d.m222761e().first;
        final ArrayList arrayList = new ArrayList();
        jyb.m147537z(list, new y20() { // from class: l.o79
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f145244a.m180107v(arrayList, (LikeUser) obj);
            }
        });
        if (arrayList.isEmpty()) {
            return null;
        }
        if (i > 1) {
            list2.addAll(arrayList);
            return list2;
        }
        list2.addAll(0, arrayList);
        return list2;
    }

    /* JADX INFO: renamed from: z */
    public final void m180111z(Envelope envelope, int i) {
        List<LikeUser> arrayList;
        List<LikeUser> list = ((CoreData) envelope.getModuleData(CoreData.class)).likeUsers;
        Boolean boolValueOf = Boolean.valueOf(((CoreData) envelope.getModuleData(CoreData.class)).next);
        if (!jyb.m147479J(list)) {
            jyb.m147537z(list, new y20() { // from class: l.n79
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f140583a.m180108w((LikeUser) obj);
                }
            });
        }
        if (m180102q()) {
            arrayList = m180110y(list, i);
        } else {
            arrayList = m180101p(list) ? new ArrayList<>() : m180100o(list);
        }
        if (arrayList != null) {
            this.f161593d.m137019l(new Pair<>(arrayList, boolValueOf));
        }
    }
}
