package p149l;

import android.util.Pair;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.C4728a;
import com.p046p1.mobile.putong.core.api.C4732c;
import com.p046p1.mobile.putong.core.data.CoreData;
import com.p046p1.mobile.putong.core.data.LikeUser;
import com.p046p1.mobile.putong.data.CommonData;
import com.p046p1.mobile.putong.data.Envelope;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p133rx.C22306c;
import p133rx.subjects.C22392a;

/* JADX INFO: loaded from: classes9.dex */
public class i69 {

    /* JADX INFO: renamed from: a */
    public final C4732c f111686a;

    /* JADX INFO: renamed from: b */
    public final Map<String, LikeUser> f111687b = new HashMap();

    /* JADX INFO: renamed from: c */
    public final Set<String> f111688c = new HashSet();

    /* JADX INFO: renamed from: d */
    public final C22392a<Pair<List<LikeUser>, Boolean>> f111689d = C22392a.m221512b();

    public i69(C4732c c4732c) {
        this.f111686a = c4732c;
    }

    /* JADX INFO: renamed from: A */
    public void m134575A(final String str) {
        Pair<List<LikeUser>, Boolean> pairM221515e = this.f111689d.m221515e();
        if (NullChecker.m81303a(pairM221515e) && !vwb.m200296J((Collection) pairM221515e.first)) {
            vwb.m200322e0((List) pairM221515e.first, new w9j() { // from class: l.d69
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(((LikeUser) obj).userId.equals(str));
                }
            });
        }
        this.f111688c.remove(str);
    }

    /* JADX INFO: renamed from: j */
    public void m134576j() {
        this.f111688c.clear();
    }

    /* JADX INFO: renamed from: k */
    public void m134577k() {
        this.f111686a.clearRequests("intl_ilike_" + CoreModule.m29931H().userId(), 0);
    }

    /* JADX INFO: renamed from: l */
    public C22306c<Pair<List<LikeUser>, Boolean>> m134578l() {
        return this.f111689d.asObservable();
    }

    /* JADX INFO: renamed from: m */
    public LikeUser m134579m(String str) {
        return this.f111687b.get(str);
    }

    /* JADX INFO: renamed from: n */
    public LikeUser m134580n(final String str) {
        Pair<List<LikeUser>, Boolean> pairM221515e = this.f111689d.m221515e();
        if (!NullChecker.m81303a(pairM221515e) || vwb.m200296J((Collection) pairM221515e.first)) {
            return null;
        }
        return (LikeUser) vwb.m200346r((Collection) pairM221515e.first, new w9j() { // from class: l.g69
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((LikeUser) obj).userId.equals(str));
            }
        });
    }

    /* JADX INFO: renamed from: o */
    public final List<LikeUser> m134581o(List<LikeUser> list) {
        this.f111688c.clear();
        if (!vwb.m200296J(list)) {
            this.f111688c.addAll(vwb.m200303Q(list, new w9j() { // from class: l.h69
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((LikeUser) obj).userId;
                }
            }));
        }
        return list != null ? list : new ArrayList();
    }

    /* JADX INFO: renamed from: p */
    public final boolean m134582p(List<LikeUser> list) {
        return vwb.m200296J(list);
    }

    /* JADX INFO: renamed from: q */
    public final boolean m134583q() {
        return NullChecker.m81303a(this.f111689d.m221515e()) && !this.f111688c.isEmpty();
    }

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ stc0 m134584r(String str) {
        return C4728a.f19494P.auth().m185898q(C4728a.m31316k0(CoreModule.m29931H().userId(), str)).m185883b();
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ Envelope m134585s(Envelope envelope) {
        if (!vwb.m200296J(((CommonData) envelope.getModuleData(CommonData.class)).users)) {
            this.f111686a.m31492w3(envelope, null);
        }
        return envelope;
    }

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ roj0 m134586t(int i, Envelope envelope) {
        m134592z(envelope, i);
        return roj0.f160388a;
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ C22306c m134587u(final String str, final int i) {
        return ia20.m135121e(new v9j() { // from class: l.a69
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f67748a.m134584r(str);
            }
        }).map(new w9j() { // from class: l.b69
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f73760a.m134585s((Envelope) obj);
            }
        }).observeOn(jo0.m142408a()).map(new w9j() { // from class: l.c69
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f79446a.m134586t(i, (Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ void m134588v(List list, LikeUser likeUser) {
        if (this.f111688c.contains(likeUser.userId)) {
            return;
        }
        this.f111688c.add(likeUser.userId);
        list.add(likeUser);
    }

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ void m134589w(LikeUser likeUser) {
        this.f111687b.put(likeUser.userId, likeUser);
    }

    /* JADX INFO: renamed from: x */
    public void m134590x(final int i, int i2) {
        final String str = "cursorIdx=" + i + "&limit=" + i2;
        this.f111686a.scheduled("intl_ilike_" + CoreModule.m29931H().userId(), 0, new v9j() { // from class: l.z59
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f201785a.m134587u(str, i);
            }
        });
    }

    /* JADX INFO: renamed from: y */
    public final List<LikeUser> m134591y(List<LikeUser> list, int i) {
        if (vwb.m200296J(list)) {
            return null;
        }
        List<LikeUser> list2 = (List) this.f111689d.m221515e().first;
        final ArrayList arrayList = new ArrayList();
        vwb.m200354z(list, new e30() { // from class: l.f69
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f95239a.m134588v(arrayList, (LikeUser) obj);
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
    public final void m134592z(Envelope envelope, int i) {
        List<LikeUser> arrayList;
        List<LikeUser> list = ((CoreData) envelope.getModuleData(CoreData.class)).likeUsers;
        Boolean boolValueOf = Boolean.valueOf(((CoreData) envelope.getModuleData(CoreData.class)).next);
        if (!vwb.m200296J(list)) {
            vwb.m200354z(list, new e30() { // from class: l.e69
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f89512a.m134589w((LikeUser) obj);
                }
            });
        }
        if (m134583q()) {
            arrayList = m134591y(list, i);
        } else {
            arrayList = m134582p(list) ? new ArrayList<>() : m134581o(list);
        }
        if (arrayList != null) {
            this.f111689d.m132487l(new Pair<>(arrayList, boolValueOf));
        }
    }
}
