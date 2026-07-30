package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.C4728a;
import com.p046p1.mobile.putong.core.api.C4732c;
import com.p046p1.mobile.putong.core.data.CoreData;
import com.p046p1.mobile.putong.data.CommonData;
import com.p046p1.mobile.putong.data.DbLinks;
import com.p046p1.mobile.putong.data.Envelope;
import com.p046p1.mobile.putong.data.Links;
import com.p046p1.mobile.putong.data.Pagination;
import com.p046p1.mobile.putong.data.Relationship;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.common.utils.ConnectivityReceiver;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.Nullable;
import p133rx.C22306c;
import p133rx.subjects.C22392a;
import p133rx.subjects.C22393b;

/* JADX INFO: loaded from: classes9.dex */
public class u2a extends ax6 {

    /* JADX INFO: renamed from: R */
    public final C22392a<q860<User>> f173090R;

    /* JADX INFO: renamed from: S */
    public final C22392a<q860<User>> f173091S;

    /* JADX INFO: renamed from: T */
    public final C22392a<Integer> f173092T;

    /* JADX INFO: renamed from: U */
    public final C22393b<Throwable> f173093U;

    /* JADX INFO: renamed from: V */
    public final C22393b<Throwable> f173094V;

    /* JADX INFO: renamed from: W */
    public zpd0 f173095W;

    /* JADX INFO: renamed from: X */
    public final HashSet<String> f173096X;

    public u2a(C4732c c4732c) {
        super(c4732c);
        this.f173090R = C22392a.m221512b();
        this.f173091S = C22392a.m221512b();
        this.f173092T = C22392a.m221513c(0);
        this.f173093U = C22393b.m221521b();
        this.f173094V = C22393b.m221521b();
        this.f173095W = new zpd0("show_near_by_red_point_time_" + CoreModule.m29931H().userId(), 0L);
        this.f173096X = new HashSet<>();
    }

    /* JADX INFO: renamed from: c3 */
    public static /* synthetic */ void m191445c3(List list, final User user) {
        Relationship relationship = (Relationship) vwb.m200346r(list, new w9j() { // from class: l.k2a
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(user.f56011id, ((Relationship) obj).f38806id));
            }
        });
        if (NullChecker.m81303a(relationship)) {
            user.localRelationship = relationship;
        }
    }

    /* JADX INFO: renamed from: j3 */
    public static /* synthetic */ void m191452j3(ArrayList arrayList, List list, final User user) {
        if (!arrayList.contains(user.f56011id)) {
            list.add(user);
            return;
        }
        int iM200293G = vwb.m200293G(list, new w9j() { // from class: l.j2a
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(user.f56011id.equals(((User) obj).f56011id));
            }
        });
        if (iM200293G != -1) {
            list.set(iM200293G, user);
        }
    }

    /* JADX INFO: renamed from: v3 */
    public static String m191459v3(int i, String str, boolean z, String str2) {
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
    public final /* synthetic */ roj0 m191460A3(Envelope envelope) {
        this.f173092T.m132487l(Integer.valueOf(envelope.pagination.total));
        return roj0.f160388a;
    }

    /* JADX INFO: renamed from: B3 */
    public final /* synthetic */ C22306c m191461B3() {
        return new la20(new v9j() { // from class: l.r2a
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4728a.f19494P.auth().m185898q(C4728a.m31277a1()).m185883b();
            }
        }).compose(mkd0.m154951C()).map(new w9j() { // from class: l.s2a
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f161967a.m191460A3((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: C3 */
    public final /* synthetic */ q860 m191462C3(Object obj) {
        return NullChecker.m81303a(this.f173090R.m221515e()) ? this.f173090R.m221515e() : q860.m173342b();
    }

    /* JADX INFO: renamed from: D3 */
    public C22306c<roj0> m191463D3(@Nullable Links links, int i, boolean z) {
        return m191464E3(links, i, z, "");
    }

    /* JADX INFO: renamed from: E3 */
    public C22306c<roj0> m191464E3(@Nullable final Links links, final int i, final boolean z, final String str) {
        return this.f72126Q.scheduled("core_nearby_request", 0, new v9j() { // from class: l.e2a
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f88902a.m191480x3(i, links, z, str);
            }
        });
    }

    /* JADX INFO: renamed from: F3 */
    public C22306c<roj0> m191465F3() {
        return this.f72126Q.scheduled("core_nearby_count_request", 0, new v9j() { // from class: l.p2a
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f146825a.m191461B3();
            }
        });
    }

    /* JADX INFO: renamed from: G3 */
    public C22306c<Throwable> m191466G3() {
        return this.f173093U;
    }

    /* JADX INFO: renamed from: H3 */
    public C22306c<Integer> m191467H3() {
        return this.f173092T;
    }

    /* JADX INFO: renamed from: I3 */
    public int m191468I3() {
        return this.f173092T.m221515e().intValue();
    }

    /* JADX INFO: renamed from: J3 */
    public C22306c<q860<User>> m191469J3() {
        return this.f173090R;
    }

    /* JADX INFO: renamed from: K3 */
    public C22306c<q860<User>> m191470K3() {
        return CoreModule.m29935P().m94656g().mo35004D9() ? C22306c.merge(C22306c.just(roj0.f160388a), this.f173090R, this.f173093U).map(new w9j() { // from class: l.q2a
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f152214a.m191462C3(obj);
            }
        }) : C22306c.just(q860.m173342b());
    }

    /* JADX INFO: renamed from: L3 */
    public C22306c<q860<User>> m191471L3() {
        return this.f173091S;
    }

    /* JADX INFO: renamed from: M3 */
    public C22306c<Throwable> m191472M3() {
        return this.f173094V;
    }

    /* JADX INFO: renamed from: N3 */
    public void m191473N3() {
        this.f173095W.put(Long.valueOf(mqi0.m155943n()));
    }

    /* JADX INFO: renamed from: q3 */
    public boolean m191474q3() {
        return mqi0.m155943n() > this.f173095W.get().longValue();
    }

    /* JADX INFO: renamed from: r3 */
    public void m191475r3(User user) {
        if (NullChecker.m81303a(this.f173091S.m221515e())) {
            Iterator<User> it = this.f173091S.m221515e().f153135a.iterator();
            while (it.hasNext()) {
                if (user.f56011id.equals(it.next().f56011id)) {
                    it.remove();
                }
            }
        }
    }

    /* JADX INFO: renamed from: s3 */
    public void m191476s3(User user) {
        if (NullChecker.m81303a(this.f173090R.m221515e())) {
            Iterator<User> it = this.f173090R.m221515e().f153135a.iterator();
            while (it.hasNext()) {
                if (user.f56011id.equals(it.next().f56011id)) {
                    it.remove();
                }
            }
        }
    }

    /* JADX INFO: renamed from: t3 */
    public final C22392a<q860<User>> m191477t3(String str) {
        return TextUtils.equals("online", str) ? this.f173091S : this.f173090R;
    }

    /* JADX INFO: renamed from: u3 */
    public final C22393b<Throwable> m191478u3(String str) {
        return TextUtils.equals("online", str) ? this.f173094V : this.f173093U;
    }

    /* JADX INFO: renamed from: w3 */
    public final /* synthetic */ roj0 m191479w3(String str, Links links, Envelope envelope) {
        q860<User> q860Var;
        DbLinks dbLinks = new DbLinks();
        Pagination pagination = envelope.pagination;
        dbLinks.total = pagination.total;
        dbLinks.links = pagination.links;
        List<User> list = ((CommonData) envelope.getModuleData(CommonData.class)).users;
        final List<Relationship> list2 = ((CoreData) envelope.getModuleData(CoreData.class)).relationships;
        vwb.m200354z(list, new e30() { // from class: l.t2a
            @Override // p149l.e30
            public final void call(Object obj) {
                u2a.m191445c3(list2, (User) obj);
            }
        });
        if (m191477t3(str).m221515e() == null) {
            q860Var = new q860<>(list, dbLinks);
        } else {
            final List<User> list3 = m191477t3(str).m221515e().f153135a;
            if (NullChecker.m81303a(links)) {
                final ArrayList arrayListM200303Q = vwb.m200303Q(list3, new w9j() { // from class: l.f2a
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return ((User) obj).f56011id;
                    }
                });
                vwb.m200354z(list, new e30() { // from class: l.g2a
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        u2a.m191452j3(arrayListM200303Q, list3, (User) obj);
                    }
                });
            } else {
                list3.clear();
                vwb.m200354z(list, new e30() { // from class: l.h2a
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        list3.add((User) obj);
                    }
                });
            }
            if (ConnectivityReceiver.m81286i()) {
                vwb.m200354z(vwb.m200291E(list), new e30() { // from class: l.i2a
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        qib0.f154691G.m102379z0(((User) obj).m60124fp().profileMiddle());
                    }
                });
            }
            q860Var = new q860<>(list3, dbLinks);
        }
        m191477t3(str).m132487l(q860Var);
        return roj0.f160388a;
    }

    /* JADX INFO: renamed from: x3 */
    public final /* synthetic */ C22306c m191480x3(final int i, final Links links, final boolean z, final String str) {
        return new la20(new v9j() { // from class: l.l2a
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                int i2 = i;
                Links links2 = links;
                return C4728a.f19494P.auth().m185898q(C4728a.m31273Z0(u2a.m191459v3(i2, links2 == null ? null : links2.next, z, str))).m185883b();
            }
        }).map(new w9j() { // from class: l.m2a
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f130912a.m191481y3((Envelope) obj);
            }
        }).compose(mkd0.m154951C()).doOnError(new e30() { // from class: l.n2a
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f136778a.m191482z3(str, (Throwable) obj);
            }
        }).map(new w9j() { // from class: l.o2a
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f141514a.m191479w3(str, links, (Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: y3 */
    public final /* synthetic */ Envelope m191481y3(Envelope envelope) {
        this.f72126Q.m31493x3(envelope, null, true);
        return envelope;
    }

    /* JADX INFO: renamed from: z3 */
    public final /* synthetic */ void m191482z3(String str, Throwable th) {
        m191478u3(str).m132487l(th);
    }
}
