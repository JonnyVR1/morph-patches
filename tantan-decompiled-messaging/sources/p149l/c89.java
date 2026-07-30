package p149l;

import android.text.TextUtils;
import com.google.common.base.Optional;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.C4728a;
import com.p046p1.mobile.putong.core.api.C4732c;
import com.p046p1.mobile.putong.core.data.CoreData;
import com.p046p1.mobile.putong.core.data.SuperlikeByCount;
import com.p046p1.mobile.putong.data.CommonData;
import com.p046p1.mobile.putong.data.Converter;
import com.p046p1.mobile.putong.data.DbLinks;
import com.p046p1.mobile.putong.data.Envelope;
import com.p046p1.mobile.putong.data.Pagination;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.common.utils.ConnectivityReceiver;
import com.tencent.connect.common.Constants;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import p133rx.C22306c;
import p133rx.subjects.C22392a;

/* JADX INFO: loaded from: classes9.dex */
public class c89 extends ax6 {

    /* JADX INFO: renamed from: R */
    public final C22392a<Optional<q860<User>>> f79718R;

    /* JADX INFO: renamed from: S */
    public final C22392a<Optional<q860<User>>> f79719S;

    /* JADX INFO: renamed from: T */
    public final C22392a<Optional<q860<User>>> f79720T;

    /* JADX INFO: renamed from: U */
    public final HashSet<String> f79721U;

    /* JADX INFO: renamed from: V */
    public final HashSet<String> f79722V;

    /* JADX INFO: renamed from: W */
    public List<SuperlikeByCount> f79723W;

    /* JADX INFO: renamed from: X */
    public long f79724X;

    public c89(C4732c c4732c) {
        super(c4732c);
        this.f79718R = C22392a.m221513c(Optional.absent());
        this.f79719S = C22392a.m221513c(Optional.absent());
        this.f79720T = C22392a.m221513c(Optional.absent());
        this.f79721U = new HashSet<>();
        this.f79722V = new HashSet<>();
        this.f79723W = new ArrayList();
        this.f79724X = 0L;
    }

    /* JADX INFO: renamed from: h3 */
    public static /* synthetic */ void m105753h3(HashSet hashSet, List list, User user) {
        if (hashSet.contains(user.f56011id)) {
            return;
        }
        hashSet.add(user.f56011id);
        list.add(user);
    }

    /* JADX INFO: renamed from: A3 */
    public C22306c<roj0> m105757A3(long j) {
        return m105758B3(j, null);
    }

    /* JADX INFO: renamed from: B3 */
    public C22306c<roj0> m105758B3(long j, String str) {
        return m105774x3(m105769s3(j, true, "", str), "loadMeetNewLikersData", this.f79718R, this.f79721U, true);
    }

    /* JADX INFO: renamed from: C3 */
    public C22306c<roj0> m105759C3(String str, long j, String str2) {
        boolean zIsEmpty = TextUtils.isEmpty(str);
        if (TextUtils.isEmpty(str2)) {
            return m105774x3(m105770t3(j, str, null), "loadFullLikersData", this.f79719S, this.f79721U, zIsEmpty);
        }
        C22306c<roj0> c22306cM105774x3 = m105774x3(m105770t3(j, str, str2), "loadFilteredLikersData", this.f79720T, this.f79722V, zIsEmpty);
        return ((this.f79719S.m221515e() == null || !this.f79719S.m221515e().isPresent()) && zIsEmpty) ? C22306c.zip(c22306cM105774x3, m105774x3(m105770t3(j, "", null), "loadFullLikersData", this.f79719S, this.f79721U, true), new x9j() { // from class: l.r79
            @Override // p149l.x9j
            public final Object call(Object obj, Object obj2) {
                return roj0.f160388a;
            }
        }) : c22306cM105774x3;
    }

    /* JADX INFO: renamed from: D3 */
    public final void m105760D3(C22392a<Optional<q860<User>>> c22392a, HashSet<String> hashSet, String str) {
        if (c22392a.m221519i() && c22392a.m221515e().isPresent()) {
            q860<User> q860Var = c22392a.m221515e().get();
            Iterator<User> it = q860Var.f153135a.iterator();
            while (it.hasNext()) {
                User next = it.next();
                if (str.equals(next.f56011id)) {
                    it.remove();
                    DbLinks dbLinks = q860Var.f153136b;
                    if (dbLinks != null) {
                        dbLinks.total--;
                    }
                    hashSet.remove(next.f56011id);
                    c22392a.m132487l(Optional.m15413of(q860Var));
                    return;
                }
            }
        }
    }

    /* JADX INFO: renamed from: E3 */
    public void m105761E3(boolean z, String str) {
        this.f79724X = mqi0.m155944o();
        if (z) {
            m105760D3(this.f79718R, this.f79721U, str);
        } else {
            m105760D3(this.f79719S, this.f79721U, str);
            m105760D3(this.f79720T, this.f79722V, str);
        }
    }

    /* JADX INFO: renamed from: l3 */
    public void m105762l3() {
        if (this.f79720T.m221519i()) {
            Optional<q860<User>> optionalM221515e = this.f79720T.m221515e();
            if (optionalM221515e.isPresent()) {
                q860<User> q860Var = optionalM221515e.get();
                for (int i = 0; i < q860Var.f153135a.size(); i++) {
                    this.f79722V.remove(q860Var.f153135a.get(i).f56011id);
                }
            }
        }
        this.f79720T.m132487l(Optional.absent());
        if (ura.m195053e().m195057d().mo33735Oq()) {
            this.f79723W.clear();
        }
    }

    /* JADX INFO: renamed from: m3 */
    public void m105763m3() {
        if (this.f79719S.m221519i()) {
            Optional<q860<User>> optionalM221515e = this.f79719S.m221515e();
            if (optionalM221515e.isPresent()) {
                q860<User> q860Var = optionalM221515e.get();
                for (int i = 0; i < q860Var.f153135a.size(); i++) {
                    this.f79721U.remove(q860Var.f153135a.get(i).f56011id);
                }
            }
        }
        this.f79719S.m132487l(Optional.absent());
        if (ura.m195053e().m195057d().mo33735Oq()) {
            this.f79723W.clear();
        }
    }

    /* JADX INFO: renamed from: n3 */
    public void m105764n3() {
        if (this.f79718R.m221519i()) {
            Optional<q860<User>> optionalM221515e = this.f79718R.m221515e();
            if (optionalM221515e.isPresent()) {
                q860<User> q860Var = optionalM221515e.get();
                for (int i = 0; i < q860Var.f153135a.size(); i++) {
                    this.f79721U.remove(q860Var.f153135a.get(i).f56011id);
                }
            }
        }
        this.f79718R.m132487l(Optional.absent());
    }

    /* JADX INFO: renamed from: o3 */
    public C22306c<Optional<q860<User>>> m105765o3() {
        return this.f79720T.asObservable();
    }

    /* JADX INFO: renamed from: p3 */
    public C22306c<Optional<q860<User>>> m105766p3() {
        return this.f79719S.asObservable();
    }

    /* JADX INFO: renamed from: q3 */
    public C22306c<Optional<q860<User>>> m105767q3() {
        return this.f79718R.asObservable();
    }

    /* JADX INFO: renamed from: r3 */
    public boolean m105768r3() {
        return mqi0.m155944o() - this.f79724X < 500;
    }

    /* JADX INFO: renamed from: s3 */
    public final String m105769s3(long j, boolean z, String str, String str2) {
        StringBuilder sb = new StringBuilder("scene=whoimeet");
        sb.append(z ? "&datafrom=new" : "&datafrom=mix");
        String strDateToApiTimeString = j != 0 ? Converter.dateToApiTimeString(j) : null;
        if (!TextUtils.isEmpty(strDateToApiTimeString)) {
            sb.append("&read_until_time=");
            sb.append(URLEncoder.encode(strDateToApiTimeString));
        }
        sb.append("&verified=true&limit=");
        sb.append(z ? Constants.VIA_REPORT_TYPE_SHARE_TO_QQ : "50");
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
    public final String m105770t3(long j, String str, String str2) {
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
    public final /* synthetic */ C22306c m105771u3(final String str, final boolean z, final HashSet hashSet, final C22392a c22392a) {
        return new la20(new v9j() { // from class: l.u79
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4728a.f19494P.auth().m185898q(str).m185883b();
            }
        }).map(new w9j() { // from class: l.v79
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f180316a.m105772v3((Envelope) obj);
            }
        }).compose(mkd0.m154951C()).map(new w9j() { // from class: l.w79
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f185030a.m105773w3(z, hashSet, c22392a, (Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: v3 */
    public final /* synthetic */ Envelope m105772v3(final Envelope envelope) {
        this.f72126Q.f19609U.m109085a(new d30() { // from class: l.b89
            @Override // p149l.d30
            public final void call() {
                CoreModule.m29934N().mo60314Rf(vwb.m200303Q(((CommonData) envelope.getModuleData(CommonData.class)).users, new w9j() { // from class: l.s79
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return ((User) obj).f56011id;
                    }
                }));
            }
        });
        this.f72126Q.m31493x3(envelope, null, true);
        return envelope;
    }

    /* JADX INFO: renamed from: w3 */
    public final /* synthetic */ roj0 m105773w3(boolean z, final HashSet hashSet, C22392a c22392a, Envelope envelope) {
        q860 q860Var;
        DbLinks dbLinks = new DbLinks();
        Pagination pagination = envelope.pagination;
        dbLinks.total = pagination.total;
        dbLinks.links = pagination.links;
        List<User> list = ((CommonData) envelope.getModuleData(CommonData.class)).users;
        if (z) {
            hashSet.clear();
            hashSet.addAll(vwb.m200303Q(list, new w9j() { // from class: l.x79
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((User) obj).f56011id;
                }
            }));
            q860Var = new q860(list, dbLinks);
        } else if (c22392a.m221515e() == null || hashSet.isEmpty()) {
            hashSet.addAll(vwb.m200303Q(list, new w9j() { // from class: l.y79
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((User) obj).f56011id;
                }
            }));
            q860Var = new q860(list, dbLinks);
        } else {
            final ArrayList arrayList = new ArrayList();
            if (c22392a.m221519i() && ((Optional) c22392a.m221515e()).isPresent()) {
                arrayList.addAll(((q860) ((Optional) c22392a.m221515e()).get()).f153135a);
            }
            vwb.m200354z(list, new e30() { // from class: l.z79
                @Override // p149l.e30
                public final void call(Object obj) {
                    c89.m105753h3(hashSet, arrayList, (User) obj);
                }
            });
            q860 q860Var2 = new q860(arrayList, dbLinks);
            if (ConnectivityReceiver.m81286i()) {
                vwb.m200354z(vwb.m200291E(list), new e30() { // from class: l.a89
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        qib0.f154691G.m102379z0(((User) obj).m60124fp().profileMiddle());
                    }
                });
            }
            q860Var = q860Var2;
        }
        if (ura.m195053e().m195057d().mo33735Oq()) {
            if (vwb.m200296J(((CoreData) envelope.getModuleData(CoreData.class)).superlikeByCounts)) {
                this.f79723W.clear();
            } else {
                this.f79723W = ((CoreData) envelope.getModuleData(CoreData.class)).superlikeByCounts;
            }
        }
        if (!CoreModule.f17545c.f19690v0.m105768r3()) {
            c22392a.m132487l(Optional.m15413of(q860Var));
        }
        return roj0.f160388a;
    }

    /* JADX INFO: renamed from: x3 */
    public final C22306c<roj0> m105774x3(String str, String str2, final C22392a<Optional<q860<User>>> c22392a, final HashSet<String> hashSet, final boolean z) {
        final String strM31177A0 = C4728a.m31177A0(str);
        return this.f72126Q.scheduled(str2, 0, new v9j() { // from class: l.t79
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f168674a.m105771u3(strM31177A0, z, hashSet, c22392a);
            }
        });
    }

    /* JADX INFO: renamed from: y3 */
    public C22306c<roj0> m105775y3(String str, long j) {
        return m105776z3(str, j, null);
    }

    /* JADX INFO: renamed from: z3 */
    public C22306c<roj0> m105776z3(String str, long j, String str2) {
        return m105774x3(m105769s3(j, false, str, str2), "loadMeetLikersData", this.f79719S, this.f79721U, TextUtils.isEmpty(str));
    }
}
