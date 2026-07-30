package p006l;

import android.text.TextUtils;
import com.google.common.base.Optional;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.api.C0154a;
import com.p000p1.mobile.putong.core.api.C0158c;
import com.p1.mobile.putong.core.data.CoreData;
import com.p1.mobile.putong.core.data.SuperlikeByCount;
import com.p1.mobile.putong.data.CommonData;
import com.p1.mobile.putong.data.Converter;
import com.p1.mobile.putong.data.DbLinks;
import com.p1.mobile.putong.data.Envelope;
import com.p1.mobile.putong.data.Pagination;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.ConnectivityReceiver;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import l.d30;
import l.e30;
import l.mkd0;
import l.mqi0;
import l.q860;
import l.roj0;
import l.v9j;
import l.vwb;
import l.w9j;
import l.x9j;
import rx.c;
import rx.subjects.a;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class c89 extends ax6 {

    /* JADX INFO: renamed from: R */
    public final a<Optional<q860<User>>> f9480R;

    /* JADX INFO: renamed from: S */
    public final a<Optional<q860<User>>> f9481S;

    /* JADX INFO: renamed from: T */
    public final a<Optional<q860<User>>> f9482T;

    /* JADX INFO: renamed from: U */
    public final HashSet<String> f9483U;

    /* JADX INFO: renamed from: V */
    public final HashSet<String> f9484V;

    /* JADX INFO: renamed from: W */
    public List<SuperlikeByCount> f9485W;

    /* JADX INFO: renamed from: X */
    public long f9486X;

    public c89(C0158c c0158c) {
        super(c0158c);
        this.f9480R = a.c(Optional.absent());
        this.f9481S = a.c(Optional.absent());
        this.f9482T = a.c(Optional.absent());
        this.f9483U = new HashSet<>();
        this.f9484V = new HashSet<>();
        this.f9485W = new ArrayList();
        this.f9486X = 0L;
    }

    /* JADX INFO: renamed from: h3 */
    public static /* synthetic */ void m13286h3(HashSet hashSet, List list, User user) {
        if (hashSet.contains(((DbObject) user).id)) {
            return;
        }
        hashSet.add(((DbObject) user).id);
        list.add(user);
    }

    /* JADX INFO: renamed from: A3 */
    public c<roj0> m13290A3(long j) {
        return m13291B3(j, null);
    }

    /* JADX INFO: renamed from: B3 */
    public c<roj0> m13291B3(long j, String str) {
        return m13307x3(m13302s3(j, true, "", str), "loadMeetNewLikersData", this.f9480R, this.f9483U, true);
    }

    /* JADX INFO: renamed from: C3 */
    public c<roj0> m13292C3(String str, long j, String str2) {
        boolean zIsEmpty = TextUtils.isEmpty(str);
        if (TextUtils.isEmpty(str2)) {
            return m13307x3(m13303t3(j, str, null), "loadFullLikersData", this.f9481S, this.f9483U, zIsEmpty);
        }
        c<roj0> cVarM13307x3 = m13307x3(m13303t3(j, str, str2), "loadFilteredLikersData", this.f9482T, this.f9484V, zIsEmpty);
        return ((this.f9481S.e() == null || !((Optional) this.f9481S.e()).isPresent()) && zIsEmpty) ? c.zip(cVarM13307x3, m13307x3(m13303t3(j, "", null), "loadFullLikersData", this.f9481S, this.f9483U, true), new x9j() { // from class: l.r79
            public final Object call(Object obj, Object obj2) {
                return roj0.a;
            }
        }) : cVarM13307x3;
    }

    /* JADX INFO: renamed from: D3 */
    public final void m13293D3(a<Optional<q860<User>>> aVar, HashSet<String> hashSet, String str) {
        if (aVar.i() && ((Optional) aVar.e()).isPresent()) {
            q860 q860Var = (q860) ((Optional) aVar.e()).get();
            Iterator it = q860Var.a.iterator();
            while (it.hasNext()) {
                User user = (User) it.next();
                if (str.equals(((DbObject) user).id)) {
                    it.remove();
                    DbLinks dbLinks = q860Var.b;
                    if (dbLinks != null) {
                        dbLinks.total--;
                    }
                    hashSet.remove(((DbObject) user).id);
                    aVar.onNext(Optional.of(q860Var));
                    return;
                }
            }
        }
    }

    /* JADX INFO: renamed from: E3 */
    public void m13294E3(boolean z, String str) {
        this.f9486X = mqi0.o();
        if (z) {
            m13293D3(this.f9480R, this.f9483U, str);
        } else {
            m13293D3(this.f9481S, this.f9483U, str);
            m13293D3(this.f9482T, this.f9484V, str);
        }
    }

    /* JADX INFO: renamed from: l3 */
    public void m13295l3() {
        if (this.f9482T.i()) {
            Optional optional = (Optional) this.f9482T.e();
            if (optional.isPresent()) {
                q860 q860Var = (q860) optional.get();
                for (int i = 0; i < q860Var.a.size(); i++) {
                    this.f9484V.remove(((DbObject) ((User) q860Var.a.get(i))).id);
                }
            }
        }
        this.f9482T.onNext(Optional.absent());
        if (ura.m25555e().m25559d().m5672Oq()) {
            this.f9485W.clear();
        }
    }

    /* JADX INFO: renamed from: m3 */
    public void m13296m3() {
        if (this.f9481S.i()) {
            Optional optional = (Optional) this.f9481S.e();
            if (optional.isPresent()) {
                q860 q860Var = (q860) optional.get();
                for (int i = 0; i < q860Var.a.size(); i++) {
                    this.f9483U.remove(((DbObject) ((User) q860Var.a.get(i))).id);
                }
            }
        }
        this.f9481S.onNext(Optional.absent());
        if (ura.m25555e().m25559d().m5672Oq()) {
            this.f9485W.clear();
        }
    }

    /* JADX INFO: renamed from: n3 */
    public void m13297n3() {
        if (this.f9480R.i()) {
            Optional optional = (Optional) this.f9480R.e();
            if (optional.isPresent()) {
                q860 q860Var = (q860) optional.get();
                for (int i = 0; i < q860Var.a.size(); i++) {
                    this.f9483U.remove(((DbObject) ((User) q860Var.a.get(i))).id);
                }
            }
        }
        this.f9480R.onNext(Optional.absent());
    }

    /* JADX INFO: renamed from: o3 */
    public c<Optional<q860<User>>> m13298o3() {
        return this.f9482T.asObservable();
    }

    /* JADX INFO: renamed from: p3 */
    public c<Optional<q860<User>>> m13299p3() {
        return this.f9481S.asObservable();
    }

    /* JADX INFO: renamed from: q3 */
    public c<Optional<q860<User>>> m13300q3() {
        return this.f9480R.asObservable();
    }

    /* JADX INFO: renamed from: r3 */
    public boolean m13301r3() {
        return mqi0.o() - this.f9486X < 500;
    }

    /* JADX INFO: renamed from: s3 */
    public final String m13302s3(long j, boolean z, String str, String str2) {
        StringBuilder sb = new StringBuilder("scene=whoimeet");
        sb.append(z ? "&datafrom=new" : "&datafrom=mix");
        String strDateToApiTimeString = j != 0 ? Converter.dateToApiTimeString(j) : null;
        if (!TextUtils.isEmpty(strDateToApiTimeString)) {
            sb.append("&read_until_time=");
            sb.append(URLEncoder.encode(strDateToApiTimeString));
        }
        sb.append("&verified=true&limit=");
        sb.append(z ? "10" : "50");
        if (!z) {
            sb.append("&trim_head=10");
        }
        if (!TextUtils.isEmpty(str)) {
            sb.append("&");
            sb.append(str);
        }
        if (!TextUtils.isEmpty(str2)) {
            sb.append("&filter_type=");
            sb.append(str2);
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: t3 */
    public final String m13303t3(long j, String str, String str2) {
        StringBuilder sb = new StringBuilder();
        String strDateToApiTimeString = j != 0 ? Converter.dateToApiTimeString(j) : null;
        if (!TextUtils.isEmpty(strDateToApiTimeString)) {
            sb.append("last_read_time=");
            sb.append(URLEncoder.encode(strDateToApiTimeString));
            sb.append("&");
        }
        sb.append("verified=true&limit=50");
        if (!TextUtils.isEmpty(str)) {
            sb.append("&");
            sb.append(str);
        }
        if (!TextUtils.isEmpty(str2)) {
            sb.append("&filter_type=");
            sb.append(str2);
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: u3 */
    public final /* synthetic */ c m13304u3(final String str, final boolean z, final HashSet hashSet, final a aVar) {
        return new la20(new v9j() { // from class: l.u79
            public final Object call() {
                return C0154a.f3483P.auth().q(str).b();
            }
        }).map(new w9j() { // from class: l.v79
            public final Object call(Object obj) {
                return this.f24172a.m13305v3((Envelope) obj);
            }
        }).compose(mkd0.C()).map(new w9j() { // from class: l.w79
            public final Object call(Object obj) {
                return this.f25012a.m13306w3(z, hashSet, aVar, (Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: v3 */
    public final /* synthetic */ Envelope m13305v3(final Envelope envelope) {
        this.f8580Q.f3598U.m13685a(new d30() { // from class: l.b89
            public final void call() {
                CoreModule.m1853N().Rf(vwb.Q(envelope.getModuleData(CommonData.class).users, new w9j() { // from class: l.s79
                    public final Object call(Object obj) {
                        return ((DbObject) ((User) obj)).id;
                    }
                }));
            }
        });
        this.f8580Q.m3423x3(envelope, null, true);
        return envelope;
    }

    /* JADX INFO: renamed from: w3 */
    public final /* synthetic */ roj0 m13306w3(boolean z, final HashSet hashSet, a aVar, Envelope envelope) {
        q860 q860Var;
        DbLinks dbLinks = new DbLinks();
        Pagination pagination = envelope.pagination;
        dbLinks.total = pagination.total;
        dbLinks.links = pagination.links;
        List list = envelope.getModuleData(CommonData.class).users;
        if (z) {
            hashSet.clear();
            hashSet.addAll(vwb.Q(list, new w9j() { // from class: l.x79
                public final Object call(Object obj) {
                    return ((DbObject) ((User) obj)).id;
                }
            }));
            q860Var = new q860(list, dbLinks);
        } else if (aVar.e() == null || hashSet.isEmpty()) {
            hashSet.addAll(vwb.Q(list, new w9j() { // from class: l.y79
                public final Object call(Object obj) {
                    return ((DbObject) ((User) obj)).id;
                }
            }));
            q860Var = new q860(list, dbLinks);
        } else {
            final ArrayList arrayList = new ArrayList();
            if (aVar.i() && ((Optional) aVar.e()).isPresent()) {
                arrayList.addAll(((q860) ((Optional) aVar.e()).get()).a);
            }
            vwb.z(list, new e30() { // from class: l.z79
                public final void call(Object obj) {
                    c89.m13286h3(hashSet, arrayList, (User) obj);
                }
            });
            q860 q860Var2 = new q860(arrayList, dbLinks);
            if (ConnectivityReceiver.i()) {
                vwb.z(vwb.E(list), new e30() { // from class: l.a89
                    public final void call(Object obj) {
                        qib0.f19782G.m12792z0(((User) obj).fp().profileMiddle());
                    }
                });
            }
            q860Var = q860Var2;
        }
        if (ura.m25555e().m25559d().m5672Oq()) {
            if (vwb.J(envelope.getModuleData(CoreData.class).superlikeByCounts)) {
                this.f9485W.clear();
            } else {
                this.f9485W = envelope.getModuleData(CoreData.class).superlikeByCounts;
            }
        }
        if (!CoreModule.f1534c.f3679v0.m13301r3()) {
            aVar.onNext(Optional.of(q860Var));
        }
        return roj0.a;
    }

    /* JADX INFO: renamed from: x3 */
    public final c<roj0> m13307x3(String str, String str2, final a<Optional<q860<User>>> aVar, final HashSet<String> hashSet, final boolean z) {
        final String strM3107A0 = C0154a.m3107A0(str);
        return this.f8580Q.scheduled(str2, 0, new v9j() { // from class: l.t79
            public final Object call() {
                return this.f21922a.m13304u3(strM3107A0, z, hashSet, aVar);
            }
        });
    }

    /* JADX INFO: renamed from: y3 */
    public c<roj0> m13308y3(String str, long j) {
        return m13309z3(str, j, null);
    }

    /* JADX INFO: renamed from: z3 */
    public c<roj0> m13309z3(String str, long j, String str2) {
        return m13307x3(m13302s3(j, false, str, str2), "loadMeetLikersData", this.f9481S, this.f9483U, TextUtils.isEmpty(str));
    }
}
