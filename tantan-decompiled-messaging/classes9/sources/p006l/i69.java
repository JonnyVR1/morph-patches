package p006l;

import android.util.Pair;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.api.C0154a;
import com.p000p1.mobile.putong.core.api.C0158c;
import com.p1.mobile.putong.core.data.CoreData;
import com.p1.mobile.putong.core.data.LikeUser;
import com.p1.mobile.putong.data.CommonData;
import com.p1.mobile.putong.data.Envelope;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import l.e30;
import l.jo0;
import l.roj0;
import l.stc0;
import l.v9j;
import l.vwb;
import l.w9j;
import rx.c;
import rx.subjects.a;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class i69 {

    /* JADX INFO: renamed from: a */
    public final C0158c f14234a;

    /* JADX INFO: renamed from: b */
    public final Map<String, LikeUser> f14235b = new HashMap();

    /* JADX INFO: renamed from: c */
    public final Set<String> f14236c = new HashSet();

    /* JADX INFO: renamed from: d */
    public final a<Pair<List<LikeUser>, Boolean>> f14237d = a.b();

    public i69(C0158c c0158c) {
        this.f14234a = c0158c;
    }

    /* JADX INFO: renamed from: A */
    public void m16471A(final String str) {
        Pair pair = (Pair) this.f14237d.e();
        if (NullChecker.a(pair) && !vwb.J((Collection) pair.first)) {
            vwb.e0((List) pair.first, new w9j() { // from class: l.d69
                public final Object call(Object obj) {
                    return Boolean.valueOf(((LikeUser) obj).userId.equals(str));
                }
            });
        }
        this.f14236c.remove(str);
    }

    /* JADX INFO: renamed from: j */
    public void m16472j() {
        this.f14236c.clear();
    }

    /* JADX INFO: renamed from: k */
    public void m16473k() {
        this.f14234a.clearRequests("intl_ilike_" + CoreModule.m1850H().userId(), 0);
    }

    /* JADX INFO: renamed from: l */
    public c<Pair<List<LikeUser>, Boolean>> m16474l() {
        return this.f14237d.asObservable();
    }

    /* JADX INFO: renamed from: m */
    public LikeUser m16475m(String str) {
        return this.f14235b.get(str);
    }

    /* JADX INFO: renamed from: n */
    public LikeUser m16476n(final String str) {
        Pair pair = (Pair) this.f14237d.e();
        if (!NullChecker.a(pair) || vwb.J((Collection) pair.first)) {
            return null;
        }
        return (LikeUser) vwb.r((Collection) pair.first, new w9j() { // from class: l.g69
            public final Object call(Object obj) {
                return Boolean.valueOf(((LikeUser) obj).userId.equals(str));
            }
        });
    }

    /* JADX INFO: renamed from: o */
    public final List<LikeUser> m16477o(List<LikeUser> list) {
        this.f14236c.clear();
        if (!vwb.J(list)) {
            this.f14236c.addAll(vwb.Q(list, new w9j() { // from class: l.h69
                public final Object call(Object obj) {
                    return ((LikeUser) obj).userId;
                }
            }));
        }
        return list != null ? list : new ArrayList();
    }

    /* JADX INFO: renamed from: p */
    public final boolean m16478p(List<LikeUser> list) {
        return vwb.J(list);
    }

    /* JADX INFO: renamed from: q */
    public final boolean m16479q() {
        return NullChecker.a(this.f14237d.e()) && !this.f14236c.isEmpty();
    }

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ stc0 m16480r(String str) {
        return C0154a.f3483P.auth().q(C0154a.m3246k0(CoreModule.m1850H().userId(), str)).b();
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ Envelope m16481s(Envelope envelope) {
        if (!vwb.J(envelope.getModuleData(CommonData.class).users)) {
            this.f14234a.m3422w3(envelope, null);
        }
        return envelope;
    }

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ roj0 m16482t(int i, Envelope envelope) {
        m16488z(envelope, i);
        return roj0.a;
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ c m16483u(final String str, final int i) {
        return ia20.m16571e(new v9j() { // from class: l.a69
            public final Object call() {
                return this.f8116a.m16480r(str);
            }
        }).map(new w9j() { // from class: l.b69
            public final Object call(Object obj) {
                return this.f8743a.m16481s((Envelope) obj);
            }
        }).observeOn(jo0.a()).map(new w9j() { // from class: l.c69
            public final Object call(Object obj) {
                return this.f9379a.m16482t(i, (Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ void m16484v(List list, LikeUser likeUser) {
        if (this.f14236c.contains(likeUser.userId)) {
            return;
        }
        this.f14236c.add(likeUser.userId);
        list.add(likeUser);
    }

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ void m16485w(LikeUser likeUser) {
        this.f14235b.put(likeUser.userId, likeUser);
    }

    /* JADX INFO: renamed from: x */
    public void m16486x(final int i, int i2) {
        final String str = "cursorIdx=" + i + "&limit=" + i2;
        this.f14234a.scheduled("intl_ilike_" + CoreModule.m1850H().userId(), 0, new v9j() { // from class: l.z59
            public final Object call() {
                return this.f28634a.m16483u(str, i);
            }
        });
    }

    /* JADX INFO: renamed from: y */
    public final List<LikeUser> m16487y(List<LikeUser> list, int i) {
        if (vwb.J(list)) {
            return null;
        }
        List<LikeUser> list2 = (List) ((Pair) this.f14237d.e()).first;
        final ArrayList arrayList = new ArrayList();
        vwb.z(list, new e30() { // from class: l.f69
            public final void call(Object obj) {
                this.f11675a.m16484v(arrayList, (LikeUser) obj);
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
    public final void m16488z(Envelope envelope, int i) {
        List<LikeUser> arrayList;
        List<LikeUser> list = envelope.getModuleData(CoreData.class).likeUsers;
        Boolean boolValueOf = Boolean.valueOf(envelope.getModuleData(CoreData.class).next);
        if (!vwb.J(list)) {
            vwb.z(list, new e30() { // from class: l.e69
                public final void call(Object obj) {
                    this.f10774a.m16485w((LikeUser) obj);
                }
            });
        }
        if (m16479q()) {
            arrayList = m16487y(list, i);
        } else {
            arrayList = m16478p(list) ? new ArrayList<>() : m16477o(list);
        }
        if (arrayList != null) {
            this.f14237d.onNext(new Pair(arrayList, boolValueOf));
        }
    }
}
