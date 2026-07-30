package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.C4879a;
import com.p051p1.mobile.putong.core.api.C4883c;
import com.p051p1.mobile.putong.core.data.CoreData;
import com.p051p1.mobile.putong.data.CommonData;
import com.p051p1.mobile.putong.data.DbLinks;
import com.p051p1.mobile.putong.data.Envelope;
import com.p051p1.mobile.putong.data.Links;
import com.p051p1.mobile.putong.data.Pagination;
import com.p051p1.mobile.putong.data.Relationship;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.common.utils.ConnectivityReceiver;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.Nullable;
import p137rx.C22421c;
import p137rx.subjects.C22507a;
import p137rx.subjects.C22508b;

/* JADX INFO: loaded from: classes9.dex */
public class f4a extends dy6 {

    /* JADX INFO: renamed from: R */
    public final C22507a<vg60<User>> f97085R;

    /* JADX INFO: renamed from: S */
    public final C22507a<vg60<User>> f97086S;

    /* JADX INFO: renamed from: T */
    public final C22507a<Integer> f97087T;

    /* JADX INFO: renamed from: U */
    public final C22508b<Throwable> f97088U;

    /* JADX INFO: renamed from: V */
    public final C22508b<Throwable> f97089V;

    /* JADX INFO: renamed from: W */
    public byd0 f97090W;

    /* JADX INFO: renamed from: X */
    public final HashSet<String> f97091X;

    public f4a(C4883c c4883c) {
        super(c4883c);
        this.f97085R = C22507a.m222758b();
        this.f97086S = C22507a.m222758b();
        this.f97087T = C22507a.m222759c(0);
        this.f97088U = C22508b.m222767b();
        this.f97089V = C22508b.m222767b();
        this.f97090W = new byd0("show_near_by_red_point_time_" + CoreModule.m30929H().userId(), 0L);
        this.f97091X = new HashSet<>();
    }

    /* JADX INFO: renamed from: c3 */
    public static /* synthetic */ void m123936c3(List list, final User user) {
        Relationship relationship = (Relationship) jyb.m147529r(list, new qcj() { // from class: l.v3a
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(user.f56859id, ((Relationship) obj).f39654id));
            }
        });
        if (NullChecker.m82486a(relationship)) {
            user.localRelationship = relationship;
        }
    }

    /* JADX INFO: renamed from: j3 */
    public static /* synthetic */ void m123943j3(ArrayList arrayList, List list, final User user) {
        if (!arrayList.contains(user.f56859id)) {
            list.add(user);
            return;
        }
        int iM147476G = jyb.m147476G(list, new qcj() { // from class: l.u3a
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(user.f56859id.equals(((User) obj).f56859id));
            }
        });
        if (iM147476G != -1) {
            list.set(iM147476G, user);
        }
    }

    /* JADX INFO: renamed from: v3 */
    public static String m123950v3(int i, String str, boolean z, String str2) {
        StringBuilder sb = new StringBuilder();
        if (z) {
            sb.append("limit=");
            sb.append(i);
            sb.append("&refresh=true");
        }
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
        }
        if (!TextUtils.isEmpty(str2)) {
            sb.append("&type=");
            sb.append(str2);
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: A3 */
    public final /* synthetic */ uxj0 m123951A3(Envelope envelope) {
        this.f97087T.m137019l(Integer.valueOf(envelope.pagination.total));
        return uxj0.f181467a;
    }

    /* JADX INFO: renamed from: B3 */
    public final /* synthetic */ C22421c m123952B3() {
        return new ti20(new pcj() { // from class: l.c4a
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4879a.f20236P.auth().m209043q(C4879a.m32280a1()).m209028b();
            }
        }).compose(psd0.m173592C()).map(new qcj() { // from class: l.d4a
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f85016a.m123951A3((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: C3 */
    public final /* synthetic */ vg60 m123953C3(Object obj) {
        return NullChecker.m82486a(this.f97085R.m222761e()) ? this.f97085R.m222761e() : vg60.m201220b();
    }

    /* JADX INFO: renamed from: D3 */
    public C22421c<uxj0> m123954D3(@Nullable Links links, int i, boolean z) {
        return m123955E3(links, i, z, "");
    }

    /* JADX INFO: renamed from: E3 */
    public C22421c<uxj0> m123955E3(@Nullable final Links links, final int i, final boolean z, final String str) {
        return this.f91137Q.scheduled("core_nearby_request", 0, new pcj() { // from class: l.p3a
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f150391a.m123971x3(i, links, z, str);
            }
        });
    }

    /* JADX INFO: renamed from: F3 */
    public C22421c<uxj0> m123956F3() {
        return this.f91137Q.scheduled("core_nearby_count_request", 0, new pcj() { // from class: l.a4a
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f68368a.m123952B3();
            }
        });
    }

    /* JADX INFO: renamed from: G3 */
    public C22421c<Throwable> m123957G3() {
        return this.f97088U;
    }

    /* JADX INFO: renamed from: H3 */
    public C22421c<Integer> m123958H3() {
        return this.f97087T;
    }

    /* JADX INFO: renamed from: I3 */
    public int m123959I3() {
        return this.f97087T.m222761e().intValue();
    }

    /* JADX INFO: renamed from: J3 */
    public C22421c<vg60<User>> m123960J3() {
        return this.f97085R;
    }

    /* JADX INFO: renamed from: K3 */
    public C22421c<vg60<User>> m123961K3() {
        return CoreModule.m30933P().m143410g().mo36007D9() ? C22421c.merge(C22421c.just(uxj0.f181467a), this.f97085R, this.f97088U).map(new qcj() { // from class: l.b4a
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f74889a.m123953C3(obj);
            }
        }) : C22421c.just(vg60.m201220b());
    }

    /* JADX INFO: renamed from: L3 */
    public C22421c<vg60<User>> m123962L3() {
        return this.f97086S;
    }

    /* JADX INFO: renamed from: M3 */
    public C22421c<Throwable> m123963M3() {
        return this.f97089V;
    }

    /* JADX INFO: renamed from: N3 */
    public void m123964N3() {
        this.f97090W.put(Long.valueOf(pzi0.m174453n()));
    }

    /* JADX INFO: renamed from: q3 */
    public boolean m123965q3() {
        return pzi0.m174453n() > this.f97090W.get().longValue();
    }

    /* JADX INFO: renamed from: r3 */
    public void m123966r3(User user) {
        if (NullChecker.m82486a(this.f97086S.m222761e())) {
            Iterator<User> it = this.f97086S.m222761e().f184001a.iterator();
            while (it.hasNext()) {
                if (user.f56859id.equals(it.next().f56859id)) {
                    it.remove();
                }
            }
        }
    }

    /* JADX INFO: renamed from: s3 */
    public void m123967s3(User user) {
        if (NullChecker.m82486a(this.f97085R.m222761e())) {
            Iterator<User> it = this.f97085R.m222761e().f184001a.iterator();
            while (it.hasNext()) {
                if (user.f56859id.equals(it.next().f56859id)) {
                    it.remove();
                }
            }
        }
    }

    /* JADX INFO: renamed from: t3 */
    public final C22507a<vg60<User>> m123968t3(String str) {
        return TextUtils.equals("online", str) ? this.f97086S : this.f97085R;
    }

    /* JADX INFO: renamed from: u3 */
    public final C22508b<Throwable> m123969u3(String str) {
        return TextUtils.equals("online", str) ? this.f97089V : this.f97088U;
    }

    /* JADX INFO: renamed from: w3 */
    public final /* synthetic */ uxj0 m123970w3(String str, Links links, Envelope envelope) {
        vg60<User> vg60Var;
        DbLinks dbLinks = new DbLinks();
        Pagination pagination = envelope.pagination;
        dbLinks.total = pagination.total;
        dbLinks.links = pagination.links;
        List<User> list = ((CommonData) envelope.getModuleData(CommonData.class)).users;
        final List<Relationship> list2 = ((CoreData) envelope.getModuleData(CoreData.class)).relationships;
        jyb.m147537z(list, new y20() { // from class: l.e4a
            @Override // p153l.y20
            public final void call(Object obj) {
                f4a.m123936c3(list2, (User) obj);
            }
        });
        if (m123968t3(str).m222761e() == null) {
            vg60Var = new vg60<>(list, dbLinks);
        } else {
            final List<User> list3 = m123968t3(str).m222761e().f184001a;
            if (NullChecker.m82486a(links)) {
                final ArrayList arrayListM147486Q = jyb.m147486Q(list3, new qcj() { // from class: l.q3a
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return ((User) obj).f56859id;
                    }
                });
                jyb.m147537z(list, new y20() { // from class: l.r3a
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        f4a.m123943j3(arrayListM147486Q, list3, (User) obj);
                    }
                });
            } else {
                list3.clear();
                jyb.m147537z(list, new y20() { // from class: l.s3a
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        list3.add((User) obj);
                    }
                });
            }
            if (ConnectivityReceiver.m82469i()) {
                jyb.m147537z(jyb.m147474E(list), new y20() { // from class: l.t3a
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        uqb0.f180374G.m127162z0(((User) obj).m61308fp().profileMiddle());
                    }
                });
            }
            vg60Var = new vg60<>(list3, dbLinks);
        }
        m123968t3(str).m137019l(vg60Var);
        return uxj0.f181467a;
    }

    /* JADX INFO: renamed from: x3 */
    public final /* synthetic */ C22421c m123971x3(final int i, final Links links, final boolean z, final String str) {
        return new ti20(new pcj() { // from class: l.w3a
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                int i2 = i;
                Links links2 = links;
                return C4879a.f20236P.auth().m209043q(C4879a.m32276Z0(f4a.m123950v3(i2, links2 == null ? null : links2.next, z, str))).m209028b();
            }
        }).map(new qcj() { // from class: l.x3a
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f192238a.m123972y3((Envelope) obj);
            }
        }).compose(psd0.m173592C()).doOnError(new y20() { // from class: l.y3a
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f197333a.m123973z3(str, (Throwable) obj);
            }
        }).map(new qcj() { // from class: l.z3a
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f202809a.m123970w3(str, links, (Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: y3 */
    public final /* synthetic */ Envelope m123972y3(Envelope envelope) {
        this.f91137Q.m32496x3(envelope, null, true);
        return envelope;
    }

    /* JADX INFO: renamed from: z3 */
    public final /* synthetic */ void m123973z3(String str, Throwable th) {
        m123969u3(str).m137019l(th);
    }
}
