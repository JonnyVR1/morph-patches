package p006l;

import android.text.TextUtils;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.api.C0154a;
import com.p000p1.mobile.putong.core.api.C0158c;
import com.p1.mobile.putong.core.data.CoreData;
import com.p1.mobile.putong.data.CommonData;
import com.p1.mobile.putong.data.DbLinks;
import com.p1.mobile.putong.data.Envelope;
import com.p1.mobile.putong.data.Links;
import com.p1.mobile.putong.data.Pagination;
import com.p1.mobile.putong.data.Relationship;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.ConnectivityReceiver;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import l.e30;
import l.mkd0;
import l.mqi0;
import l.q860;
import l.roj0;
import l.v9j;
import l.vwb;
import l.w9j;
import l.zpd0;
import org.jetbrains.annotations.Nullable;
import rx.c;
import rx.subjects.a;
import rx.subjects.b;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class u2a extends ax6 {

    /* JADX INFO: renamed from: R */
    public final a<q860<User>> f22435R;

    /* JADX INFO: renamed from: S */
    public final a<q860<User>> f22436S;

    /* JADX INFO: renamed from: T */
    public final a<Integer> f22437T;

    /* JADX INFO: renamed from: U */
    public final b<Throwable> f22438U;

    /* JADX INFO: renamed from: V */
    public final b<Throwable> f22439V;

    /* JADX INFO: renamed from: W */
    public zpd0 f22440W;

    /* JADX INFO: renamed from: X */
    public final HashSet<String> f22441X;

    public u2a(C0158c c0158c) {
        super(c0158c);
        this.f22435R = a.b();
        this.f22436S = a.b();
        this.f22437T = a.c(0);
        this.f22438U = b.b();
        this.f22439V = b.b();
        this.f22440W = new zpd0("show_near_by_red_point_time_" + CoreModule.m1850H().userId(), 0L);
        this.f22441X = new HashSet<>();
    }

    /* JADX INFO: renamed from: c3 */
    public static /* synthetic */ void m24903c3(List list, final User user) {
        Relationship relationship = (Relationship) vwb.r(list, new w9j() { // from class: l.k2a
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(((DbObject) user).id, ((Relationship) obj).id));
            }
        });
        if (NullChecker.a(relationship)) {
            user.localRelationship = relationship;
        }
    }

    /* JADX INFO: renamed from: j3 */
    public static /* synthetic */ void m24910j3(ArrayList arrayList, List list, final User user) {
        if (!arrayList.contains(((DbObject) user).id)) {
            list.add(user);
            return;
        }
        int iG = vwb.G(list, new w9j() { // from class: l.j2a
            public final Object call(Object obj) {
                return Boolean.valueOf(((DbObject) user).id.equals(((DbObject) ((User) obj)).id));
            }
        });
        if (iG != -1) {
            list.set(iG, user);
        }
    }

    /* JADX INFO: renamed from: v3 */
    public static String m24917v3(int i, String str, boolean z, String str2) {
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
    public final /* synthetic */ roj0 m24918A3(Envelope envelope) {
        this.f22437T.onNext(Integer.valueOf(envelope.pagination.total));
        return roj0.a;
    }

    /* JADX INFO: renamed from: B3 */
    public final /* synthetic */ c m24919B3() {
        return new la20(new v9j() { // from class: l.r2a
            public final Object call() {
                return C0154a.f3483P.auth().q(C0154a.m3207a1()).b();
            }
        }).compose(mkd0.C()).map(new w9j() { // from class: l.s2a
            public final Object call(Object obj) {
                return this.f20984a.m24918A3((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: C3 */
    public final /* synthetic */ q860 m24920C3(Object obj) {
        return NullChecker.a(this.f22435R.e()) ? (q860) this.f22435R.e() : q860.b();
    }

    /* JADX INFO: renamed from: D3 */
    public c<roj0> m24921D3(@Nullable Links links, int i, boolean z) {
        return m24922E3(links, i, z, "");
    }

    /* JADX INFO: renamed from: E3 */
    public c<roj0> m24922E3(@Nullable final Links links, final int i, final boolean z, final String str) {
        return this.f8580Q.scheduled("core_nearby_request", 0, new v9j() { // from class: l.e2a
            public final Object call() {
                return this.f10733a.m24938x3(i, links, z, str);
            }
        });
    }

    /* JADX INFO: renamed from: F3 */
    public c<roj0> m24923F3() {
        return this.f8580Q.scheduled("core_nearby_count_request", 0, new v9j() { // from class: l.p2a
            public final Object call() {
                return this.f18565a.m24919B3();
            }
        });
    }

    /* JADX INFO: renamed from: G3 */
    public c<Throwable> m24924G3() {
        return this.f22438U;
    }

    /* JADX INFO: renamed from: H3 */
    public c<Integer> m24925H3() {
        return this.f22437T;
    }

    /* JADX INFO: renamed from: I3 */
    public int m24926I3() {
        return ((Integer) this.f22437T.e()).intValue();
    }

    /* JADX INFO: renamed from: J3 */
    public c<q860<User>> m24927J3() {
        return this.f22435R;
    }

    /* JADX INFO: renamed from: K3 */
    public c<q860<User>> m24928K3() {
        return CoreModule.m1854P().m11711g().m6941D9() ? c.merge(c.just(roj0.a), this.f22435R, this.f22438U).map(new w9j() { // from class: l.q2a
            public final Object call(Object obj) {
                return this.f19537a.m24920C3(obj);
            }
        }) : c.just(q860.b());
    }

    /* JADX INFO: renamed from: L3 */
    public c<q860<User>> m24929L3() {
        return this.f22436S;
    }

    /* JADX INFO: renamed from: M3 */
    public c<Throwable> m24930M3() {
        return this.f22439V;
    }

    /* JADX INFO: renamed from: N3 */
    public void m24931N3() {
        this.f22440W.put(Long.valueOf(mqi0.n()));
    }

    /* JADX INFO: renamed from: q3 */
    public boolean m24932q3() {
        return mqi0.n() > ((Long) this.f22440W.get()).longValue();
    }

    /* JADX INFO: renamed from: r3 */
    public void m24933r3(User user) {
        if (NullChecker.a(this.f22436S.e())) {
            Iterator it = ((q860) this.f22436S.e()).a.iterator();
            while (it.hasNext()) {
                if (((DbObject) user).id.equals(((DbObject) ((User) it.next())).id)) {
                    it.remove();
                }
            }
        }
    }

    /* JADX INFO: renamed from: s3 */
    public void m24934s3(User user) {
        if (NullChecker.a(this.f22435R.e())) {
            Iterator it = ((q860) this.f22435R.e()).a.iterator();
            while (it.hasNext()) {
                if (((DbObject) user).id.equals(((DbObject) ((User) it.next())).id)) {
                    it.remove();
                }
            }
        }
    }

    /* JADX INFO: renamed from: t3 */
    public final a<q860<User>> m24935t3(String str) {
        return TextUtils.equals("online", str) ? this.f22436S : this.f22435R;
    }

    /* JADX INFO: renamed from: u3 */
    public final b<Throwable> m24936u3(String str) {
        return TextUtils.equals("online", str) ? this.f22439V : this.f22438U;
    }

    /* JADX INFO: renamed from: w3 */
    public final /* synthetic */ roj0 m24937w3(String str, Links links, Envelope envelope) {
        q860 q860Var;
        DbLinks dbLinks = new DbLinks();
        Pagination pagination = envelope.pagination;
        dbLinks.total = pagination.total;
        dbLinks.links = pagination.links;
        List list = envelope.getModuleData(CommonData.class).users;
        final List list2 = envelope.getModuleData(CoreData.class).relationships;
        vwb.z(list, new e30() { // from class: l.t2a
            public final void call(Object obj) {
                u2a.m24903c3(list2, (User) obj);
            }
        });
        if (m24935t3(str).e() == null) {
            q860Var = new q860(list, dbLinks);
        } else {
            final List list3 = ((q860) m24935t3(str).e()).a;
            if (NullChecker.a(links)) {
                final ArrayList arrayListQ = vwb.Q(list3, new w9j() { // from class: l.f2a
                    public final Object call(Object obj) {
                        return ((DbObject) ((User) obj)).id;
                    }
                });
                vwb.z(list, new e30() { // from class: l.g2a
                    public final void call(Object obj) {
                        u2a.m24910j3(arrayListQ, list3, (User) obj);
                    }
                });
            } else {
                list3.clear();
                vwb.z(list, new e30() { // from class: l.h2a
                    public final void call(Object obj) {
                        list3.add((User) obj);
                    }
                });
            }
            if (ConnectivityReceiver.i()) {
                vwb.z(vwb.E(list), new e30() { // from class: l.i2a
                    public final void call(Object obj) {
                        qib0.f19782G.m12792z0(((User) obj).fp().profileMiddle());
                    }
                });
            }
            q860Var = new q860(list3, dbLinks);
        }
        m24935t3(str).onNext(q860Var);
        return roj0.a;
    }

    /* JADX INFO: renamed from: x3 */
    public final /* synthetic */ c m24938x3(final int i, final Links links, final boolean z, final String str) {
        return new la20(new v9j() { // from class: l.l2a
            public final Object call() {
                int i2 = i;
                Links links2 = links;
                return C0154a.f3483P.auth().q(C0154a.m3203Z0(u2a.m24917v3(i2, links2 == null ? null : links2.next, z, str))).b();
            }
        }).map(new w9j() { // from class: l.m2a
            public final Object call(Object obj) {
                return this.f16768a.m24939y3((Envelope) obj);
            }
        }).compose(mkd0.C()).doOnError(new e30() { // from class: l.n2a
            public final void call(Object obj) {
                this.f17452a.m24940z3(str, (Throwable) obj);
            }
        }).map(new w9j() { // from class: l.o2a
            public final Object call(Object obj) {
                return this.f17984a.m24937w3(str, links, (Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: y3 */
    public final /* synthetic */ Envelope m24939y3(Envelope envelope) {
        this.f8580Q.m3423x3(envelope, null, true);
        return envelope;
    }

    /* JADX INFO: renamed from: z3 */
    public final /* synthetic */ void m24940z3(String str, Throwable th) {
        m24936u3(str).onNext(th);
    }
}
