package p006l;

import android.text.TextUtils;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.api.C0154a;
import com.p000p1.mobile.putong.core.api.C0158c;
import com.p1.mobile.putong.core.data.CoreData;
import com.p1.mobile.putong.core.data.LikedUser;
import com.p1.mobile.putong.core.data.LikedUserFilterSettings;
import com.p1.mobile.putong.data.CommonData;
import com.p1.mobile.putong.data.DbLinks;
import com.p1.mobile.putong.data.Envelope;
import com.p1.mobile.putong.data.Pagination;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import l.e30;
import l.jo0;
import l.q860;
import l.roj0;
import l.v9j;
import l.vwb;
import l.w9j;
import rx.c;
import rx.subjects.a;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class oe9 extends ax6 {

    /* JADX INFO: renamed from: R */
    public String f18174R;

    /* JADX INFO: renamed from: S */
    public a<q860<LikedUser>> f18175S;

    /* JADX INFO: renamed from: T */
    public HashSet<String> f18176T;

    /* JADX INFO: renamed from: U */
    public HashMap<String, LikedUser> f18177U;

    /* JADX INFO: renamed from: V */
    public cpd0 f18178V;

    /* JADX INFO: renamed from: W */
    public a<q860<LikedUser>> f18179W;

    public oe9(C0158c c0158c) {
        super(c0158c);
        this.f18174R = "";
        this.f18175S = a.b();
        this.f18176T = new HashSet<>();
        this.f18177U = new HashMap<>();
        this.f18178V = new cpd0("liked_user_filter_settings_" + CoreModule.m1850H().userId(), true, "putongPref");
        this.f18179W = a.b();
    }

    /* JADX INFO: renamed from: b3 */
    public static /* synthetic */ Boolean m20536b3(int i, Envelope envelope) {
        boolean z = true;
        if (vwb.J(envelope.getModuleData(CommonData.class).users) && i > 1) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    /* JADX INFO: renamed from: p3 */
    public static /* synthetic */ void m20550p3(List list, int i, List list2, LikedUser likedUser) {
        if (vwb.Q(list, new w9j() { // from class: l.zd9
            public final Object call(Object obj) {
                return ((LikedUser) obj).id;
            }
        }).contains(likedUser.id)) {
            return;
        }
        if (i > 1) {
            list.add(likedUser);
        } else {
            list2.add(likedUser);
        }
    }

    /* JADX INFO: renamed from: A3 */
    public void m20558A3() {
        this.f18179W.onNext((Object) null);
    }

    /* JADX INFO: renamed from: B3 */
    public String m20559B3() {
        return this.f18174R;
    }

    /* JADX INFO: renamed from: C3 */
    public LikedUser m20560C3(String str) {
        return this.f18177U.get(str);
    }

    /* JADX INFO: renamed from: D3 */
    public c<q860<LikedUser>> m20561D3() {
        return this.f18179W.asObservable();
    }

    /* JADX INFO: renamed from: E3 */
    public q860<LikedUser> m20562E3() {
        return (q860) this.f18179W.e();
    }

    /* JADX INFO: renamed from: F3 */
    public LikedUser m20563F3(final String str) {
        q860 q860Var = (q860) this.f18175S.e();
        if (!NullChecker.a(q860Var) || vwb.J(q860Var.a)) {
            return null;
        }
        return (LikedUser) vwb.r(q860Var.a, new w9j() { // from class: l.ae9
            public final Object call(Object obj) {
                return Boolean.valueOf(((LikedUser) obj).id.equals(str));
            }
        });
    }

    /* JADX INFO: renamed from: G3 */
    public LikedUser m20564G3(final String str) {
        q860 q860Var = (q860) this.f18179W.e();
        if (!NullChecker.a(q860Var) || vwb.J(q860Var.a)) {
            return null;
        }
        return (LikedUser) vwb.r(q860Var.a, new w9j() { // from class: l.be9
            public final Object call(Object obj) {
                return Boolean.valueOf(((LikedUser) obj).id.equals(str));
            }
        });
    }

    /* JADX INFO: renamed from: H3 */
    public boolean m20565H3() {
        return NullChecker.a(this.f18175S.e()) && !vwb.J(((q860) this.f18175S.e()).a);
    }

    /* JADX INFO: renamed from: I3 */
    public final String m20566I3(int i, int i2, boolean z) {
        return m20567J3(i, i2, z, null, null);
    }

    /* JADX INFO: renamed from: J3 */
    public final String m20567J3(int i, int i2, boolean z, LikedUserFilterSettings likedUserFilterSettings, String str) {
        StringBuilder sb = new StringBuilder(z ? "search=count" : "search=list&with=users");
        if (!z) {
            sb.append("&cursorIdx=");
            sb.append(i2);
            if (i > 0) {
                sb.append("&limit=");
                sb.append(i);
            }
        }
        if (NullChecker.a(likedUserFilterSettings)) {
            sb.append("&filter=");
            sb.append(likedUserFilterSettings.filter);
            sb.append("&distance=");
            sb.append(likedUserFilterSettings.distance);
            sb.append("&age=");
            sb.append(likedUserFilterSettings.minAge);
            sb.append(",");
            sb.append(likedUserFilterSettings.maxAge);
            sb.append("&sortBy=");
            sb.append(likedUserFilterSettings.sort);
        }
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: K3 */
    public final /* synthetic */ Envelope m20568K3(Envelope envelope) {
        if (!vwb.J(envelope.getModuleData(CommonData.class).users)) {
            this.f8580Q.m3422w3(envelope, null);
        }
        return envelope;
    }

    /* JADX INFO: renamed from: L3 */
    public final /* synthetic */ void m20569L3(LikedUser likedUser) {
        this.f18177U.put(likedUser.id, likedUser);
    }

    /* JADX INFO: renamed from: M3 */
    public final /* synthetic */ void m20570M3(int i, List list, List list2, LikedUser likedUser) {
        if (this.f18176T.contains(likedUser.id)) {
            return;
        }
        this.f18176T.add(likedUser.id);
        if (i > 1) {
            list.add(likedUser);
        } else {
            list2.add(likedUser);
        }
    }

    /* JADX INFO: renamed from: N3 */
    public final /* synthetic */ roj0 m20571N3(boolean z, final int i, Envelope envelope) {
        q860 q860Var;
        DbLinks dbLinks = new DbLinks();
        Pagination pagination = envelope.pagination;
        dbLinks.links = pagination.links;
        if (z) {
            dbLinks.total = pagination.total;
            q860Var = new q860(NullChecker.a(this.f18175S.e()) ? ((q860) this.f18175S.e()).a : new ArrayList(0), dbLinks);
        } else {
            if (NullChecker.a(envelope.getModuleData(CoreData.class).likedUsers)) {
                vwb.z(envelope.getModuleData(CoreData.class).likedUsers, new e30() { // from class: l.sd9
                    public final void call(Object obj) {
                        this.f21264a.m20569L3((LikedUser) obj);
                    }
                });
            }
            if (NullChecker.a(this.f18175S.e()) && !this.f18176T.isEmpty() && !vwb.J(envelope.getModuleData(CoreData.class).likedUsers)) {
                final List list = ((q860) this.f18175S.e()).a;
                dbLinks.total = envelope.pagination.total;
                final ArrayList arrayList = new ArrayList();
                vwb.z(envelope.getModuleData(CoreData.class).likedUsers, new e30() { // from class: l.td9
                    public final void call(Object obj) {
                        this.f22043a.m20570M3(i, list, arrayList, (LikedUser) obj);
                    }
                });
                if (arrayList.size() > 0) {
                    list.addAll(0, arrayList);
                }
                q860Var = new q860(list, dbLinks);
            } else {
                if (NullChecker.a(this.f18175S.e()) && !this.f18176T.isEmpty() && vwb.J(envelope.getModuleData(CommonData.class).users)) {
                    return roj0.a;
                }
                if (this.f18175S.e() == null && this.f18176T.isEmpty() && vwb.J(envelope.getModuleData(CoreData.class).likedUsers)) {
                    q860Var = q860.b();
                } else {
                    dbLinks.total = envelope.pagination.total;
                    this.f18176T.addAll(vwb.Q(envelope.getModuleData(CoreData.class).likedUsers, new w9j() { // from class: l.ud9
                        public final Object call(Object obj) {
                            return ((LikedUser) obj).id;
                        }
                    }));
                    q860Var = new q860(envelope.getModuleData(CoreData.class).likedUsers, dbLinks);
                }
            }
        }
        this.f18175S.onNext(q860Var);
        return roj0.a;
    }

    /* JADX INFO: renamed from: O3 */
    public final /* synthetic */ c m20572O3(final String str, final boolean z, final int i) {
        return ia20.m16571e(new v9j() { // from class: l.le9
            public final Object call() {
                return C0154a.f3483P.auth().q(C0154a.m3306z0(str)).b();
            }
        }).map(new w9j() { // from class: l.me9
            public final Object call(Object obj) {
                return this.f16941a.m20568K3((Envelope) obj);
            }
        }).observeOn(jo0.a()).map(new w9j() { // from class: l.ne9
            public final Object call(Object obj) {
                return this.f17626a.m20571N3(z, i, (Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: P3 */
    public final /* synthetic */ c m20573P3(LikedUserFilterSettings likedUserFilterSettings, roj0 roj0Var) {
        return m20583Z3(1, ura.m25555e().m25559d().m5715Wk(), false, likedUserFilterSettings, null);
    }

    /* JADX INFO: renamed from: Q3 */
    public final /* synthetic */ Envelope m20574Q3(Envelope envelope) {
        if (!vwb.J(envelope.getModuleData(CommonData.class).users)) {
            this.f8580Q.m3422w3(envelope, null);
        }
        return envelope;
    }

    /* JADX INFO: renamed from: R3 */
    public final /* synthetic */ void m20575R3(LikedUser likedUser) {
        this.f18177U.put(likedUser.id, likedUser);
    }

    /* JADX INFO: renamed from: S3 */
    public final /* synthetic */ roj0 m20576S3(final int i, Envelope envelope) {
        List list = envelope.getModuleData(CoreData.class).likedUsers;
        DbLinks dbLinks = new DbLinks();
        dbLinks.links = envelope.pagination.links;
        q860 q860VarB = q860.b();
        if (!vwb.J(list)) {
            vwb.z(list, new e30() { // from class: l.xd9
                public final void call(Object obj) {
                    this.f27457a.m20575R3((LikedUser) obj);
                }
            });
            final List arrayList = NullChecker.a(this.f18179W.e()) ? ((q860) this.f18179W.e()).a : new ArrayList();
            dbLinks.total = envelope.pagination.total;
            final ArrayList arrayList2 = new ArrayList();
            vwb.z(list, new e30() { // from class: l.yd9
                public final void call(Object obj) {
                    oe9.m20550p3(arrayList, i, arrayList2, (LikedUser) obj);
                }
            });
            if (arrayList2.size() > 0) {
                arrayList.addAll(0, arrayList2);
            }
            q860VarB = new q860(arrayList, dbLinks);
        }
        this.f18179W.onNext(q860VarB);
        return roj0.a;
    }

    /* JADX INFO: renamed from: T3 */
    public final /* synthetic */ c m20577T3(final String str, final int i) {
        return ia20.m16571e(new v9j() { // from class: l.he9
            public final Object call() {
                return C0154a.f3483P.auth().q(C0154a.m3306z0(str)).b();
            }
        }).map(new w9j() { // from class: l.ie9
            public final Object call(Object obj) {
                return this.f14391a.m20574Q3((Envelope) obj);
            }
        }).observeOn(jo0.a()).filter(new w9j() { // from class: l.je9
            public final Object call(Object obj) {
                return oe9.m20536b3(i, (Envelope) obj);
            }
        }).map(new w9j() { // from class: l.ke9
            public final Object call(Object obj) {
                return this.f15785a.m20576S3(i, (Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: U3 */
    public final /* synthetic */ Envelope m20578U3(Envelope envelope) {
        if (!vwb.J(envelope.getModuleData(CommonData.class).users)) {
            this.f8580Q.m3422w3(envelope, null);
        }
        return envelope;
    }

    /* JADX INFO: renamed from: V3 */
    public final /* synthetic */ c m20579V3(final StringBuilder sb) {
        return ia20.m16571e(new v9j() { // from class: l.ee9
            public final Object call() {
                return C0154a.f3483P.auth().q(sb.toString()).b();
            }
        }).map(new w9j() { // from class: l.fe9
            public final Object call(Object obj) {
                return this.f12673a.m20578U3((Envelope) obj);
            }
        }).observeOn(jo0.a());
    }

    /* JADX INFO: renamed from: W3 */
    public int m20580W3() {
        if (this.f18175S.e() == null) {
            return 0;
        }
        return ((q860) this.f18175S.e()).d();
    }

    /* JADX INFO: renamed from: X3 */
    public c<q860<LikedUser>> m20581X3() {
        return this.f18175S.asObservable();
    }

    /* JADX INFO: renamed from: Y3 */
    public c<roj0> m20582Y3(int i, int i2, boolean z) {
        return m20583Z3(i, i2, z, null, null);
    }

    /* JADX INFO: renamed from: Z3 */
    public c<roj0> m20583Z3(final int i, int i2, final boolean z, LikedUserFilterSettings likedUserFilterSettings, String str) {
        final String strM20567J3 = m20567J3(i2, i, z, likedUserFilterSettings, str);
        return this.f8580Q.scheduled("likedUser", 0, new v9j() { // from class: l.rd9
            public final Object call() {
                return this.f20520a.m20572O3(strM20567J3, z, i);
            }
        });
    }

    /* JADX INFO: renamed from: a4 */
    public c<roj0> m20584a4() {
        final LikedUserFilterSettings likedUserFilterSettings = (LikedUserFilterSettings) this.f18178V.get();
        return m20583Z3(1, ura.m25555e().m25559d().m5715Wk(), true, likedUserFilterSettings, null).switchMap(new w9j() { // from class: l.ge9
            public final Object call(Object obj) {
                return this.f13230a.m20573P3(likedUserFilterSettings, (roj0) obj);
            }
        });
    }

    /* JADX INFO: renamed from: b4 */
    public c<roj0> m20585b4(final int i, int i2) {
        final String strM20566I3 = m20566I3(i2, i, false);
        return this.f8580Q.scheduled("likedUserForMyTab", 0, new v9j() { // from class: l.ce9
            public final Object call() {
                return this.f9607a.m20577T3(strM20566I3, i);
            }
        });
    }

    /* JADX INFO: renamed from: c4 */
    public c<Envelope> m20586c4(String str) {
        final StringBuilder sb = new StringBuilder(C0154a.m3130G("/live-activities?source=live-activities-liked&with=users"));
        if (TextUtils.isEmpty(str)) {
            sb.append("&until=0&limit=30");
        } else {
            sb.append("&");
            sb.append(str);
        }
        return this.f8580Q.scheduled("loadLiveActivitiesLiked", 0, new v9j() { // from class: l.de9
            public final Object call() {
                return this.f10348a.m20579V3(sb);
            }
        });
    }

    /* JADX INFO: renamed from: d4 */
    public void m20587d4(final String str) {
        if (NullChecker.a(this.f18175S.e()) && vwb.e0(((q860) this.f18175S.e()).a, new w9j() { // from class: l.vd9
            public final Object call(Object obj) {
                return Boolean.valueOf(((LikedUser) obj).id.equals(str));
            }
        })) {
            ((q860) this.f18175S.e()).b.total--;
        }
        this.f8580Q.f3677u1.m25553b3(str);
    }

    /* JADX INFO: renamed from: e4 */
    public void m20588e4(final String str) {
        if (NullChecker.a(this.f18179W.e()) && vwb.e0(((q860) this.f18179W.e()).a, new w9j() { // from class: l.wd9
            public final Object call(Object obj) {
                return Boolean.valueOf(((LikedUser) obj).id.equals(str));
            }
        })) {
            ((q860) this.f18179W.e()).b.total--;
        }
        this.f8580Q.f3677u1.m25553b3(str);
    }

    /* JADX INFO: renamed from: f4 */
    public void m20589f4(String str) {
        this.f18174R = str;
    }

    /* JADX INFO: renamed from: x3 */
    public void m20590x3() {
        this.f8580Q.clearRequests("likedUserForMyTab", 0);
    }

    /* JADX INFO: renamed from: y3 */
    public void m20591y3() {
        this.f18176T.clear();
    }

    /* JADX INFO: renamed from: z3 */
    public void m20592z3() {
        this.f8580Q.clearRequests("likedUser", 0);
    }
}
