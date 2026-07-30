package p149l;

import android.text.TextUtils;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.C4728a;
import com.p046p1.mobile.putong.core.api.C4732c;
import com.p046p1.mobile.putong.core.data.CoreData;
import com.p046p1.mobile.putong.core.data.LikedUser;
import com.p046p1.mobile.putong.core.data.LikedUserFilterSettings;
import com.p046p1.mobile.putong.data.CommonData;
import com.p046p1.mobile.putong.data.DbLinks;
import com.p046p1.mobile.putong.data.Envelope;
import com.p046p1.mobile.putong.data.Pagination;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import p133rx.C22306c;
import p133rx.subjects.C22392a;

/* JADX INFO: loaded from: classes9.dex */
public class oe9 extends ax6 {

    /* JADX INFO: renamed from: R */
    public String f143290R;

    /* JADX INFO: renamed from: S */
    public C22392a<q860<LikedUser>> f143291S;

    /* JADX INFO: renamed from: T */
    public HashSet<String> f143292T;

    /* JADX INFO: renamed from: U */
    public HashMap<String, LikedUser> f143293U;

    /* JADX INFO: renamed from: V */
    public cpd0 f143294V;

    /* JADX INFO: renamed from: W */
    public C22392a<q860<LikedUser>> f143295W;

    public oe9(C4732c c4732c) {
        super(c4732c);
        this.f143290R = "";
        this.f143291S = C22392a.m221512b();
        this.f143292T = new HashSet<>();
        this.f143293U = new HashMap<>();
        this.f143294V = new cpd0("liked_user_filter_settings_" + CoreModule.m29931H().userId(), true, "putongPref");
        this.f143295W = C22392a.m221512b();
    }

    /* JADX INFO: renamed from: b3 */
    public static /* synthetic */ Boolean m163878b3(int i, Envelope envelope) {
        boolean z = true;
        if (vwb.m200296J(((CommonData) envelope.getModuleData(CommonData.class)).users) && i > 1) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    /* JADX INFO: renamed from: p3 */
    public static /* synthetic */ void m163892p3(List list, int i, List list2, LikedUser likedUser) {
        if (vwb.m200303Q(list, new w9j() { // from class: l.zd9
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((LikedUser) obj).f20432id;
            }
        }).contains(likedUser.f20432id)) {
            return;
        }
        if (i > 1) {
            list.add(likedUser);
        } else {
            list2.add(likedUser);
        }
    }

    /* JADX INFO: renamed from: A3 */
    public void m163900A3() {
        this.f143295W.m132487l(null);
    }

    /* JADX INFO: renamed from: B3 */
    public String m163901B3() {
        return this.f143290R;
    }

    /* JADX INFO: renamed from: C3 */
    public LikedUser m163902C3(String str) {
        return this.f143293U.get(str);
    }

    /* JADX INFO: renamed from: D3 */
    public C22306c<q860<LikedUser>> m163903D3() {
        return this.f143295W.asObservable();
    }

    /* JADX INFO: renamed from: E3 */
    public q860<LikedUser> m163904E3() {
        return this.f143295W.m221515e();
    }

    /* JADX INFO: renamed from: F3 */
    public LikedUser m163905F3(final String str) {
        q860<LikedUser> q860VarM221515e = this.f143291S.m221515e();
        if (!NullChecker.m81303a(q860VarM221515e) || vwb.m200296J(q860VarM221515e.f153135a)) {
            return null;
        }
        return (LikedUser) vwb.m200346r(q860VarM221515e.f153135a, new w9j() { // from class: l.ae9
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((LikedUser) obj).f20432id.equals(str));
            }
        });
    }

    /* JADX INFO: renamed from: G3 */
    public LikedUser m163906G3(final String str) {
        q860<LikedUser> q860VarM221515e = this.f143295W.m221515e();
        if (!NullChecker.m81303a(q860VarM221515e) || vwb.m200296J(q860VarM221515e.f153135a)) {
            return null;
        }
        return (LikedUser) vwb.m200346r(q860VarM221515e.f153135a, new w9j() { // from class: l.be9
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((LikedUser) obj).f20432id.equals(str));
            }
        });
    }

    /* JADX INFO: renamed from: H3 */
    public boolean m163907H3() {
        return NullChecker.m81303a(this.f143291S.m221515e()) && !vwb.m200296J(this.f143291S.m221515e().f153135a);
    }

    /* JADX INFO: renamed from: I3 */
    public final String m163908I3(int i, int i2, boolean z) {
        return m163909J3(i, i2, z, null, null);
    }

    /* JADX INFO: renamed from: J3 */
    public final String m163909J3(int i, int i2, boolean z, LikedUserFilterSettings likedUserFilterSettings, String str) {
        StringBuilder sb = new StringBuilder(z ? "search=count" : "search=list&with=users");
        if (!z) {
            sb.append("&cursorIdx=");
            sb.append(i2);
            if (i > 0) {
                sb.append("&limit=");
                sb.append(i);
            }
        }
        if (NullChecker.m81303a(likedUserFilterSettings)) {
            sb.append("&filter=");
            sb.append(likedUserFilterSettings.filter);
            sb.append("&distance=");
            sb.append(likedUserFilterSettings.distance);
            sb.append("&age=");
            sb.append(likedUserFilterSettings.minAge);
            sb.append(Constants.SEPARATOR_COMMA);
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
    public final /* synthetic */ Envelope m163910K3(Envelope envelope) {
        if (!vwb.m200296J(((CommonData) envelope.getModuleData(CommonData.class)).users)) {
            this.f72126Q.m31492w3(envelope, null);
        }
        return envelope;
    }

    /* JADX INFO: renamed from: L3 */
    public final /* synthetic */ void m163911L3(LikedUser likedUser) {
        this.f143293U.put(likedUser.f20432id, likedUser);
    }

    /* JADX INFO: renamed from: M3 */
    public final /* synthetic */ void m163912M3(int i, List list, List list2, LikedUser likedUser) {
        if (this.f143292T.contains(likedUser.f20432id)) {
            return;
        }
        this.f143292T.add(likedUser.f20432id);
        if (i > 1) {
            list.add(likedUser);
        } else {
            list2.add(likedUser);
        }
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /* JADX INFO: renamed from: N3 */
    public final /* synthetic */ roj0 m163913N3(boolean z, final int i, Envelope envelope) {
        q860<LikedUser> q860Var;
        DbLinks dbLinks = new DbLinks();
        Pagination pagination = envelope.pagination;
        dbLinks.links = pagination.links;
        if (z) {
            dbLinks.total = pagination.total;
            q860Var = new q860<>(NullChecker.m81303a(this.f143291S.m221515e()) ? this.f143291S.m221515e().f153135a : new ArrayList(0), dbLinks);
        } else {
            if (NullChecker.m81303a(((CoreData) envelope.getModuleData(CoreData.class)).likedUsers)) {
                vwb.m200354z(((CoreData) envelope.getModuleData(CoreData.class)).likedUsers, new e30() { // from class: l.sd9
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        this.f163817a.m163911L3((LikedUser) obj);
                    }
                });
            }
            if (NullChecker.m81303a(this.f143291S.m221515e()) && !this.f143292T.isEmpty() && !vwb.m200296J(((CoreData) envelope.getModuleData(CoreData.class)).likedUsers)) {
                final List<T> list = this.f143291S.m221515e().f153135a;
                dbLinks.total = envelope.pagination.total;
                final ArrayList arrayList = new ArrayList();
                vwb.m200354z(((CoreData) envelope.getModuleData(CoreData.class)).likedUsers, new e30() { // from class: l.td9
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        this.f169503a.m163912M3(i, list, arrayList, (LikedUser) obj);
                    }
                });
                if (arrayList.size() > 0) {
                    list.addAll(0, arrayList);
                }
                q860Var = new q860<>(list, dbLinks);
            } else {
                if (NullChecker.m81303a(this.f143291S.m221515e()) && !this.f143292T.isEmpty() && vwb.m200296J(((CommonData) envelope.getModuleData(CommonData.class)).users)) {
                    return roj0.f160388a;
                }
                if (this.f143291S.m221515e() == null && this.f143292T.isEmpty() && vwb.m200296J(((CoreData) envelope.getModuleData(CoreData.class)).likedUsers)) {
                    q860Var = q860.m173342b();
                } else {
                    dbLinks.total = envelope.pagination.total;
                    this.f143292T.addAll(vwb.m200303Q(((CoreData) envelope.getModuleData(CoreData.class)).likedUsers, new w9j() { // from class: l.ud9
                        @Override // p149l.w9j
                        public final Object call(Object obj) {
                            return ((LikedUser) obj).f20432id;
                        }
                    }));
                    q860Var = new q860<>(((CoreData) envelope.getModuleData(CoreData.class)).likedUsers, dbLinks);
                }
            }
        }
        this.f143291S.m132487l(q860Var);
        return roj0.f160388a;
    }

    /* JADX INFO: renamed from: O3 */
    public final /* synthetic */ C22306c m163914O3(final String str, final boolean z, final int i) {
        return ia20.m135121e(new v9j() { // from class: l.le9
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4728a.f19494P.auth().m185898q(C4728a.m31376z0(str)).m185883b();
            }
        }).map(new w9j() { // from class: l.me9
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f133383a.m163910K3((Envelope) obj);
            }
        }).observeOn(jo0.m142408a()).map(new w9j() { // from class: l.ne9
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f138592a.m163913N3(z, i, (Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: P3 */
    public final /* synthetic */ C22306c m163915P3(LikedUserFilterSettings likedUserFilterSettings, roj0 roj0Var) {
        return m163925Z3(1, ura.m195053e().m195057d().mo33778Wk(), false, likedUserFilterSettings, null);
    }

    /* JADX INFO: renamed from: Q3 */
    public final /* synthetic */ Envelope m163916Q3(Envelope envelope) {
        if (!vwb.m200296J(((CommonData) envelope.getModuleData(CommonData.class)).users)) {
            this.f72126Q.m31492w3(envelope, null);
        }
        return envelope;
    }

    /* JADX INFO: renamed from: R3 */
    public final /* synthetic */ void m163917R3(LikedUser likedUser) {
        this.f143293U.put(likedUser.f20432id, likedUser);
    }

    /* JADX INFO: renamed from: S3 */
    public final /* synthetic */ roj0 m163918S3(final int i, Envelope envelope) {
        List<LikedUser> list = ((CoreData) envelope.getModuleData(CoreData.class)).likedUsers;
        DbLinks dbLinks = new DbLinks();
        dbLinks.links = envelope.pagination.links;
        q860<LikedUser> q860VarM173342b = q860.m173342b();
        if (!vwb.m200296J(list)) {
            vwb.m200354z(list, new e30() { // from class: l.xd9
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f192372a.m163917R3((LikedUser) obj);
                }
            });
            final List arrayList = NullChecker.m81303a(this.f143295W.m221515e()) ? this.f143295W.m221515e().f153135a : new ArrayList();
            dbLinks.total = envelope.pagination.total;
            final ArrayList arrayList2 = new ArrayList();
            vwb.m200354z(list, new e30() { // from class: l.yd9
                @Override // p149l.e30
                public final void call(Object obj) {
                    oe9.m163892p3(arrayList, i, arrayList2, (LikedUser) obj);
                }
            });
            if (arrayList2.size() > 0) {
                arrayList.addAll(0, arrayList2);
            }
            q860VarM173342b = new q860<>(arrayList, dbLinks);
        }
        this.f143295W.m132487l(q860VarM173342b);
        return roj0.f160388a;
    }

    /* JADX INFO: renamed from: T3 */
    public final /* synthetic */ C22306c m163919T3(final String str, final int i) {
        return ia20.m135121e(new v9j() { // from class: l.he9
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4728a.f19494P.auth().m185898q(C4728a.m31376z0(str)).m185883b();
            }
        }).map(new w9j() { // from class: l.ie9
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f112715a.m163916Q3((Envelope) obj);
            }
        }).observeOn(jo0.m142408a()).filter(new w9j() { // from class: l.je9
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return oe9.m163878b3(i, (Envelope) obj);
            }
        }).map(new w9j() { // from class: l.ke9
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f122683a.m163918S3(i, (Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: U3 */
    public final /* synthetic */ Envelope m163920U3(Envelope envelope) {
        if (!vwb.m200296J(((CommonData) envelope.getModuleData(CommonData.class)).users)) {
            this.f72126Q.m31492w3(envelope, null);
        }
        return envelope;
    }

    /* JADX INFO: renamed from: V3 */
    public final /* synthetic */ C22306c m163921V3(final StringBuilder sb) {
        return ia20.m135121e(new v9j() { // from class: l.ee9
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4728a.f19494P.auth().m185898q(sb.toString()).m185883b();
            }
        }).map(new w9j() { // from class: l.fe9
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f97106a.m163920U3((Envelope) obj);
            }
        }).observeOn(jo0.m142408a());
    }

    /* JADX INFO: renamed from: W3 */
    public int m163922W3() {
        if (this.f143291S.m221515e() == null) {
            return 0;
        }
        return this.f143291S.m221515e().m173344d();
    }

    /* JADX INFO: renamed from: X3 */
    public C22306c<q860<LikedUser>> m163923X3() {
        return this.f143291S.asObservable();
    }

    /* JADX INFO: renamed from: Y3 */
    public C22306c<roj0> m163924Y3(int i, int i2, boolean z) {
        return m163925Z3(i, i2, z, null, null);
    }

    /* JADX INFO: renamed from: Z3 */
    public C22306c<roj0> m163925Z3(final int i, int i2, final boolean z, LikedUserFilterSettings likedUserFilterSettings, String str) {
        final String strM163909J3 = m163909J3(i2, i, z, likedUserFilterSettings, str);
        return this.f72126Q.scheduled("likedUser", 0, new v9j() { // from class: l.rd9
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f158900a.m163914O3(strM163909J3, z, i);
            }
        });
    }

    /* JADX INFO: renamed from: a4 */
    public C22306c<roj0> m163926a4() {
        final LikedUserFilterSettings likedUserFilterSettings = this.f143294V.get();
        return m163925Z3(1, ura.m195053e().m195057d().mo33778Wk(), true, likedUserFilterSettings, null).switchMap(new w9j() { // from class: l.ge9
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f102167a.m163915P3(likedUserFilterSettings, (roj0) obj);
            }
        });
    }

    /* JADX INFO: renamed from: b4 */
    public C22306c<roj0> m163927b4(final int i, int i2) {
        final String strM163908I3 = m163908I3(i2, i, false);
        return this.f72126Q.scheduled("likedUserForMyTab", 0, new v9j() { // from class: l.ce9
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f80442a.m163919T3(strM163908I3, i);
            }
        });
    }

    /* JADX INFO: renamed from: c4 */
    public C22306c<Envelope> m163928c4(String str) {
        final StringBuilder sb = new StringBuilder(C4728a.m31200G("/live-activities?source=live-activities-liked&with=users"));
        if (TextUtils.isEmpty(str)) {
            sb.append("&until=0&limit=30");
        } else {
            sb.append("&");
            sb.append(str);
        }
        return this.f72126Q.scheduled("loadLiveActivitiesLiked", 0, new v9j() { // from class: l.de9
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f85765a.m163921V3(sb);
            }
        });
    }

    /* JADX INFO: renamed from: d4 */
    public void m163929d4(final String str) {
        if (NullChecker.m81303a(this.f143291S.m221515e()) && vwb.m200322e0(this.f143291S.m221515e().f153135a, new w9j() { // from class: l.vd9
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((LikedUser) obj).f20432id.equals(str));
            }
        })) {
            this.f143291S.m221515e().f153136b.total--;
        }
        this.f72126Q.f19688u1.m195051b3(str);
    }

    /* JADX INFO: renamed from: e4 */
    public void m163930e4(final String str) {
        if (NullChecker.m81303a(this.f143295W.m221515e()) && vwb.m200322e0(this.f143295W.m221515e().f153135a, new w9j() { // from class: l.wd9
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((LikedUser) obj).f20432id.equals(str));
            }
        })) {
            this.f143295W.m221515e().f153136b.total--;
        }
        this.f72126Q.f19688u1.m195051b3(str);
    }

    /* JADX INFO: renamed from: f4 */
    public void m163931f4(String str) {
        this.f143290R = str;
    }

    /* JADX INFO: renamed from: x3 */
    public void m163932x3() {
        this.f72126Q.clearRequests("likedUserForMyTab", 0);
    }

    /* JADX INFO: renamed from: y3 */
    public void m163933y3() {
        this.f143292T.clear();
    }

    /* JADX INFO: renamed from: z3 */
    public void m163934z3() {
        this.f72126Q.clearRequests("likedUser", 0);
    }
}
