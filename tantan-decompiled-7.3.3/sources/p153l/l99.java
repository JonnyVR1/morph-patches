package p153l;

import android.text.TextUtils;
import com.google.common.base.Optional;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.C4879a;
import com.p051p1.mobile.putong.core.api.C4883c;
import com.p051p1.mobile.putong.core.data.CoreData;
import com.p051p1.mobile.putong.core.data.SuperlikeByCount;
import com.p051p1.mobile.putong.data.CommonData;
import com.p051p1.mobile.putong.data.Converter;
import com.p051p1.mobile.putong.data.DbLinks;
import com.p051p1.mobile.putong.data.Envelope;
import com.p051p1.mobile.putong.data.Pagination;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.common.utils.ConnectivityReceiver;
import com.tencent.connect.common.Constants;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import p137rx.C22421c;
import p137rx.subjects.C22507a;

/* JADX INFO: loaded from: classes9.dex */
public class l99 extends dy6 {

    /* JADX INFO: renamed from: R */
    public final C22507a<Optional<vg60<User>>> f130569R;

    /* JADX INFO: renamed from: S */
    public final C22507a<Optional<vg60<User>>> f130570S;

    /* JADX INFO: renamed from: T */
    public final C22507a<Long> f130571T;

    /* JADX INFO: renamed from: U */
    public final C22507a<Optional<vg60<User>>> f130572U;

    /* JADX INFO: renamed from: V */
    public final HashSet<String> f130573V;

    /* JADX INFO: renamed from: W */
    public final HashSet<String> f130574W;

    /* JADX INFO: renamed from: X */
    public List<SuperlikeByCount> f130575X;

    /* JADX INFO: renamed from: Y */
    public long f130576Y;

    public l99(C4883c c4883c) {
        super(c4883c);
        this.f130569R = C22507a.m222759c(Optional.absent());
        this.f130570S = C22507a.m222759c(Optional.absent());
        this.f130571T = C22507a.m222759c(0L);
        this.f130572U = C22507a.m222759c(Optional.absent());
        this.f130573V = new HashSet<>();
        this.f130574W = new HashSet<>();
        this.f130575X = new ArrayList();
        this.f130576Y = 0L;
    }

    /* JADX INFO: renamed from: i3 */
    public static /* synthetic */ void m153366i3(HashSet hashSet, List list, User user) {
        if (hashSet.contains(user.f56859id)) {
            return;
        }
        hashSet.add(user.f56859id);
        list.add(user);
    }

    /* JADX INFO: renamed from: A3 */
    public C22421c<uxj0> m153369A3(long j) {
        return m153370B3(j, null);
    }

    /* JADX INFO: renamed from: B3 */
    public C22421c<uxj0> m153370B3(long j, String str) {
        return m153387x3(m153382s3(j, true, "", str), "loadMeetNewLikersData", this.f130569R, this.f130573V, true);
    }

    /* JADX INFO: renamed from: C3 */
    public C22421c<uxj0> m153371C3(String str, long j, String str2) {
        boolean zIsEmpty = TextUtils.isEmpty(str);
        if (TextUtils.isEmpty(str2)) {
            return m153387x3(m153383t3(j, str, null), "loadFullLikersData", this.f130570S, this.f130573V, zIsEmpty);
        }
        C22421c<uxj0> c22421cM153387x3 = m153387x3(m153383t3(j, str, str2), "loadFilteredLikersData", this.f130572U, this.f130574W, zIsEmpty);
        return ((this.f130570S.m222761e() == null || !this.f130570S.m222761e().isPresent()) && zIsEmpty) ? C22421c.zip(c22421cM153387x3, m153387x3(m153383t3(j, "", null), "loadFullLikersData", this.f130570S, this.f130573V, true), new rcj() { // from class: l.a99
            @Override // p153l.rcj
            public final Object call(Object obj, Object obj2) {
                return uxj0.f181467a;
            }
        }) : c22421cM153387x3;
    }

    /* JADX INFO: renamed from: D3 */
    public C22421c<Long> m153372D3() {
        return this.f130571T.asObservable();
    }

    /* JADX INFO: renamed from: E3 */
    public final void m153373E3(C22507a<Optional<vg60<User>>> c22507a, HashSet<String> hashSet, String str) {
        if (c22507a.m222765i() && c22507a.m222761e().isPresent()) {
            vg60<User> vg60Var = c22507a.m222761e().get();
            Iterator<User> it = vg60Var.f184001a.iterator();
            while (it.hasNext()) {
                User next = it.next();
                if (str.equals(next.f56859id)) {
                    it.remove();
                    DbLinks dbLinks = vg60Var.f184002b;
                    if (dbLinks != null) {
                        dbLinks.total--;
                    }
                    hashSet.remove(next.f56859id);
                    c22507a.m137019l(Optional.m15467of(vg60Var));
                    return;
                }
            }
        }
    }

    /* JADX INFO: renamed from: F3 */
    public void m153374F3(boolean z, String str) {
        this.f130576Y = pzi0.m174454o();
        if (z) {
            m153373E3(this.f130569R, this.f130573V, str);
        } else {
            m153373E3(this.f130570S, this.f130573V, str);
            m153373E3(this.f130572U, this.f130574W, str);
        }
    }

    /* JADX INFO: renamed from: l3 */
    public void m153375l3() {
        if (this.f130572U.m222765i()) {
            Optional<vg60<User>> optionalM222761e = this.f130572U.m222761e();
            if (optionalM222761e.isPresent()) {
                vg60<User> vg60Var = optionalM222761e.get();
                for (int i = 0; i < vg60Var.f184001a.size(); i++) {
                    this.f130574W.remove(vg60Var.f184001a.get(i).f56859id);
                }
            }
        }
        this.f130572U.m137019l(Optional.absent());
        if (gta.m132210e().m132214d().mo34738Oq()) {
            this.f130575X.clear();
        }
    }

    /* JADX INFO: renamed from: m3 */
    public void m153376m3() {
        if (this.f130570S.m222765i()) {
            Optional<vg60<User>> optionalM222761e = this.f130570S.m222761e();
            if (optionalM222761e.isPresent()) {
                vg60<User> vg60Var = optionalM222761e.get();
                for (int i = 0; i < vg60Var.f184001a.size(); i++) {
                    this.f130573V.remove(vg60Var.f184001a.get(i).f56859id);
                }
            }
        }
        this.f130570S.m137019l(Optional.absent());
        if (gta.m132210e().m132214d().mo34738Oq()) {
            this.f130575X.clear();
        }
    }

    /* JADX INFO: renamed from: n3 */
    public void m153377n3() {
        if (this.f130569R.m222765i()) {
            Optional<vg60<User>> optionalM222761e = this.f130569R.m222761e();
            if (optionalM222761e.isPresent()) {
                vg60<User> vg60Var = optionalM222761e.get();
                for (int i = 0; i < vg60Var.f184001a.size(); i++) {
                    this.f130573V.remove(vg60Var.f184001a.get(i).f56859id);
                }
            }
        }
        this.f130569R.m137019l(Optional.absent());
    }

    /* JADX INFO: renamed from: o3 */
    public C22421c<Optional<vg60<User>>> m153378o3() {
        return this.f130572U.asObservable();
    }

    /* JADX INFO: renamed from: p3 */
    public C22421c<Optional<vg60<User>>> m153379p3() {
        return this.f130570S.asObservable();
    }

    /* JADX INFO: renamed from: q3 */
    public C22421c<Optional<vg60<User>>> m153380q3() {
        return this.f130569R.asObservable();
    }

    /* JADX INFO: renamed from: r3 */
    public boolean m153381r3() {
        return pzi0.m174454o() - this.f130576Y < 500;
    }

    /* JADX INFO: renamed from: s3 */
    public final String m153382s3(long j, boolean z, String str, String str2) {
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
    public final String m153383t3(long j, String str, String str2) {
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
    public final /* synthetic */ C22421c m153384u3(final String str, final boolean z, final HashSet hashSet, final C22507a c22507a, final String str2) {
        return new ti20(new pcj() { // from class: l.d99
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4879a.f20236P.auth().m209043q(str).m209028b();
            }
        }).map(new qcj() { // from class: l.e99
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f92603a.m153385v3((Envelope) obj);
            }
        }).compose(psd0.m173592C()).map(new qcj() { // from class: l.f99
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f97840a.m153386w3(z, hashSet, c22507a, str2, (Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: v3 */
    public final /* synthetic */ Envelope m153385v3(final Envelope envelope) {
        this.f91137Q.f20351U.m128074a(new x20() { // from class: l.k99
            @Override // p153l.x20
            public final void call() {
                CoreModule.m30932N().mo61498Rf(jyb.m147486Q(((CommonData) envelope.getModuleData(CommonData.class)).users, new qcj() { // from class: l.b99
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return ((User) obj).f56859id;
                    }
                }));
            }
        });
        this.f91137Q.m32496x3(envelope, null, true);
        return envelope;
    }

    /* JADX INFO: renamed from: w3 */
    public final /* synthetic */ uxj0 m153386w3(boolean z, final HashSet hashSet, C22507a c22507a, String str, Envelope envelope) {
        vg60 vg60Var;
        int i;
        DbLinks dbLinks = new DbLinks();
        Pagination pagination = envelope.pagination;
        dbLinks.total = pagination.total;
        dbLinks.links = pagination.links;
        List<User> list = ((CommonData) envelope.getModuleData(CommonData.class)).users;
        if (z) {
            hashSet.clear();
            hashSet.addAll(jyb.m147486Q(list, new qcj() { // from class: l.g99
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((User) obj).f56859id;
                }
            }));
            vg60Var = new vg60(list, dbLinks);
        } else if (c22507a.m222761e() == null || hashSet.isEmpty()) {
            hashSet.addAll(jyb.m147486Q(list, new qcj() { // from class: l.h99
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((User) obj).f56859id;
                }
            }));
            vg60Var = new vg60(list, dbLinks);
        } else {
            final ArrayList arrayList = new ArrayList();
            if (c22507a.m222765i() && ((Optional) c22507a.m222761e()).isPresent()) {
                arrayList.addAll(((vg60) ((Optional) c22507a.m222761e()).get()).f184001a);
            }
            jyb.m147537z(list, new y20() { // from class: l.i99
                @Override // p153l.y20
                public final void call(Object obj) {
                    l99.m153366i3(hashSet, arrayList, (User) obj);
                }
            });
            vg60 vg60Var2 = new vg60(arrayList, dbLinks);
            if (ConnectivityReceiver.m82469i()) {
                jyb.m147537z(jyb.m147474E(list), new y20() { // from class: l.j99
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        uqb0.f180374G.m127162z0(((User) obj).m61308fp().profileMiddle());
                    }
                });
            }
            vg60Var = vg60Var2;
        }
        if (gta.m132210e().m132214d().mo34738Oq()) {
            if (jyb.m147479J(((CoreData) envelope.getModuleData(CoreData.class)).superlikeByCounts)) {
                this.f130575X.clear();
            } else {
                this.f130575X = ((CoreData) envelope.getModuleData(CoreData.class)).superlikeByCounts;
            }
        }
        if (!CoreModule.f18264c.f20432v0.m153381r3()) {
            c22507a.m137019l(Optional.m15467of(vg60Var));
        }
        if ("loadFullLikersData".equals(str) && (i = dbLinks.total) >= 0) {
            this.f130571T.m137019l(Long.valueOf(i));
        }
        return uxj0.f181467a;
    }

    /* JADX INFO: renamed from: x3 */
    public final C22421c<uxj0> m153387x3(String str, final String str2, final C22507a<Optional<vg60<User>>> c22507a, final HashSet<String> hashSet, final boolean z) {
        final String strM32180A0 = C4879a.m32180A0(str);
        return this.f91137Q.scheduled(str2, 0, new pcj() { // from class: l.c99
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f80308a.m153384u3(strM32180A0, z, hashSet, c22507a, str2);
            }
        });
    }

    /* JADX INFO: renamed from: y3 */
    public C22421c<uxj0> m153388y3(String str, long j) {
        return m153389z3(str, j, null);
    }

    /* JADX INFO: renamed from: z3 */
    public C22421c<uxj0> m153389z3(String str, long j, String str2) {
        return m153387x3(m153382s3(j, false, str, str2), "loadMeetLikersData", this.f130570S, this.f130573V, TextUtils.isEmpty(str));
    }
}
