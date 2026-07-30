package p153l;

import android.text.TextUtils;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.C4879a;
import com.p051p1.mobile.putong.core.api.C4883c;
import com.p051p1.mobile.putong.core.data.CoreData;
import com.p051p1.mobile.putong.core.data.LikedUser;
import com.p051p1.mobile.putong.core.data.LikedUserFilterSettings;
import com.p051p1.mobile.putong.data.CommonData;
import com.p051p1.mobile.putong.data.DbLinks;
import com.p051p1.mobile.putong.data.Envelope;
import com.p051p1.mobile.putong.data.Pagination;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import p137rx.C22421c;
import p137rx.subjects.C22507a;

/* JADX INFO: loaded from: classes9.dex */
public class xf9 extends dy6 {

    /* JADX INFO: renamed from: R */
    public String f194011R;

    /* JADX INFO: renamed from: S */
    public C22507a<vg60<LikedUser>> f194012S;

    /* JADX INFO: renamed from: T */
    public HashSet<String> f194013T;

    /* JADX INFO: renamed from: U */
    public HashMap<String, LikedUser> f194014U;

    /* JADX INFO: renamed from: V */
    public exd0 f194015V;

    /* JADX INFO: renamed from: W */
    public C22507a<vg60<LikedUser>> f194016W;

    public xf9(C4883c c4883c) {
        super(c4883c);
        this.f194011R = "";
        this.f194012S = C22507a.m222758b();
        this.f194013T = new HashSet<>();
        this.f194014U = new HashMap<>();
        this.f194015V = new exd0("liked_user_filter_settings_" + CoreModule.m30929H().userId(), true, "putongPref");
        this.f194016W = C22507a.m222758b();
    }

    /* JADX INFO: renamed from: b3 */
    public static /* synthetic */ Boolean m210736b3(int i, Envelope envelope) {
        boolean z = true;
        if (jyb.m147479J(((CommonData) envelope.getModuleData(CommonData.class)).users) && i > 1) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    /* JADX INFO: renamed from: p3 */
    public static /* synthetic */ void m210750p3(List list, int i, List list2, LikedUser likedUser) {
        if (jyb.m147486Q(list, new qcj() { // from class: l.if9
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((LikedUser) obj).f21174id;
            }
        }).contains(likedUser.f21174id)) {
            return;
        }
        if (i > 1) {
            list.add(likedUser);
        } else {
            list2.add(likedUser);
        }
    }

    /* JADX INFO: renamed from: A3 */
    public void m210758A3() {
        this.f194016W.m137019l(null);
    }

    /* JADX INFO: renamed from: B3 */
    public String m210759B3() {
        return this.f194011R;
    }

    /* JADX INFO: renamed from: C3 */
    public LikedUser m210760C3(String str) {
        return this.f194014U.get(str);
    }

    /* JADX INFO: renamed from: D3 */
    public C22421c<vg60<LikedUser>> m210761D3() {
        return this.f194016W.asObservable();
    }

    /* JADX INFO: renamed from: E3 */
    public vg60<LikedUser> m210762E3() {
        return this.f194016W.m222761e();
    }

    /* JADX INFO: renamed from: F3 */
    public LikedUser m210763F3(final String str) {
        vg60<LikedUser> vg60VarM222761e = this.f194012S.m222761e();
        if (!NullChecker.m82486a(vg60VarM222761e) || jyb.m147479J(vg60VarM222761e.f184001a)) {
            return null;
        }
        return (LikedUser) jyb.m147529r(vg60VarM222761e.f184001a, new qcj() { // from class: l.jf9
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((LikedUser) obj).f21174id.equals(str));
            }
        });
    }

    /* JADX INFO: renamed from: G3 */
    public LikedUser m210764G3(final String str) {
        vg60<LikedUser> vg60VarM222761e = this.f194016W.m222761e();
        if (!NullChecker.m82486a(vg60VarM222761e) || jyb.m147479J(vg60VarM222761e.f184001a)) {
            return null;
        }
        return (LikedUser) jyb.m147529r(vg60VarM222761e.f184001a, new qcj() { // from class: l.kf9
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((LikedUser) obj).f21174id.equals(str));
            }
        });
    }

    /* JADX INFO: renamed from: H3 */
    public boolean m210765H3() {
        return NullChecker.m82486a(this.f194012S.m222761e()) && !jyb.m147479J(this.f194012S.m222761e().f184001a);
    }

    /* JADX INFO: renamed from: I3 */
    public final String m210766I3(int i, int i2, boolean z) {
        return m210767J3(i, i2, z, null, null);
    }

    /* JADX INFO: renamed from: J3 */
    public final String m210767J3(int i, int i2, boolean z, LikedUserFilterSettings likedUserFilterSettings, String str) {
        StringBuilder sb = new StringBuilder(z ? "search=count" : "search=list&with=users");
        if (!z) {
            sb.append("&cursorIdx=");
            sb.append(i2);
            if (i > 0) {
                sb.append("&limit=");
                sb.append(i);
            }
        }
        if (NullChecker.m82486a(likedUserFilterSettings)) {
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
    public final /* synthetic */ Envelope m210768K3(Envelope envelope) {
        if (!jyb.m147479J(((CommonData) envelope.getModuleData(CommonData.class)).users)) {
            this.f91137Q.m32495w3(envelope, null);
        }
        return envelope;
    }

    /* JADX INFO: renamed from: L3 */
    public final /* synthetic */ void m210769L3(LikedUser likedUser) {
        this.f194014U.put(likedUser.f21174id, likedUser);
    }

    /* JADX INFO: renamed from: M3 */
    public final /* synthetic */ void m210770M3(int i, List list, List list2, LikedUser likedUser) {
        if (this.f194013T.contains(likedUser.f21174id)) {
            return;
        }
        this.f194013T.add(likedUser.f21174id);
        if (i > 1) {
            list.add(likedUser);
        } else {
            list2.add(likedUser);
        }
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /* JADX INFO: renamed from: N3 */
    public final /* synthetic */ uxj0 m210771N3(boolean z, final int i, Envelope envelope) {
        vg60<LikedUser> vg60Var;
        DbLinks dbLinks = new DbLinks();
        Pagination pagination = envelope.pagination;
        dbLinks.links = pagination.links;
        if (z) {
            dbLinks.total = pagination.total;
            vg60Var = new vg60<>(NullChecker.m82486a(this.f194012S.m222761e()) ? this.f194012S.m222761e().f184001a : new ArrayList(0), dbLinks);
        } else {
            if (NullChecker.m82486a(((CoreData) envelope.getModuleData(CoreData.class)).likedUsers)) {
                jyb.m147537z(((CoreData) envelope.getModuleData(CoreData.class)).likedUsers, new y20() { // from class: l.bf9
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        this.f76470a.m210769L3((LikedUser) obj);
                    }
                });
            }
            if (NullChecker.m82486a(this.f194012S.m222761e()) && !this.f194013T.isEmpty() && !jyb.m147479J(((CoreData) envelope.getModuleData(CoreData.class)).likedUsers)) {
                final List<T> list = this.f194012S.m222761e().f184001a;
                dbLinks.total = envelope.pagination.total;
                final ArrayList arrayList = new ArrayList();
                jyb.m147537z(((CoreData) envelope.getModuleData(CoreData.class)).likedUsers, new y20() { // from class: l.cf9
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        this.f81489a.m210770M3(i, list, arrayList, (LikedUser) obj);
                    }
                });
                if (arrayList.size() > 0) {
                    list.addAll(0, arrayList);
                }
                vg60Var = new vg60<>(list, dbLinks);
            } else {
                if (NullChecker.m82486a(this.f194012S.m222761e()) && !this.f194013T.isEmpty() && jyb.m147479J(((CommonData) envelope.getModuleData(CommonData.class)).users)) {
                    return uxj0.f181467a;
                }
                if (this.f194012S.m222761e() == null && this.f194013T.isEmpty() && jyb.m147479J(((CoreData) envelope.getModuleData(CoreData.class)).likedUsers)) {
                    vg60Var = vg60.m201220b();
                } else {
                    dbLinks.total = envelope.pagination.total;
                    this.f194013T.addAll(jyb.m147486Q(((CoreData) envelope.getModuleData(CoreData.class)).likedUsers, new qcj() { // from class: l.df9
                        @Override // p153l.qcj
                        public final Object call(Object obj) {
                            return ((LikedUser) obj).f21174id;
                        }
                    }));
                    vg60Var = new vg60<>(((CoreData) envelope.getModuleData(CoreData.class)).likedUsers, dbLinks);
                }
            }
        }
        this.f194012S.m137019l(vg60Var);
        return uxj0.f181467a;
    }

    /* JADX INFO: renamed from: O3 */
    public final /* synthetic */ C22421c m210772O3(final String str, final boolean z, final int i) {
        return qi20.m176658e(new pcj() { // from class: l.uf9
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4879a.f20236P.auth().m209043q(C4879a.m32379z0(str)).m209028b();
            }
        }).map(new qcj() { // from class: l.vf9
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f183886a.m210768K3((Envelope) obj);
            }
        }).observeOn(fo0.m126432a()).map(new qcj() { // from class: l.wf9
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f188773a.m210771N3(z, i, (Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: P3 */
    public final /* synthetic */ C22421c m210773P3(LikedUserFilterSettings likedUserFilterSettings, uxj0 uxj0Var) {
        return m210783Z3(1, gta.m132210e().m132214d().mo34781Wk(), false, likedUserFilterSettings, null);
    }

    /* JADX INFO: renamed from: Q3 */
    public final /* synthetic */ Envelope m210774Q3(Envelope envelope) {
        if (!jyb.m147479J(((CommonData) envelope.getModuleData(CommonData.class)).users)) {
            this.f91137Q.m32495w3(envelope, null);
        }
        return envelope;
    }

    /* JADX INFO: renamed from: R3 */
    public final /* synthetic */ void m210775R3(LikedUser likedUser) {
        this.f194014U.put(likedUser.f21174id, likedUser);
    }

    /* JADX INFO: renamed from: S3 */
    public final /* synthetic */ uxj0 m210776S3(final int i, Envelope envelope) {
        List<LikedUser> list = ((CoreData) envelope.getModuleData(CoreData.class)).likedUsers;
        DbLinks dbLinks = new DbLinks();
        dbLinks.links = envelope.pagination.links;
        vg60<LikedUser> vg60VarM201220b = vg60.m201220b();
        if (!jyb.m147479J(list)) {
            jyb.m147537z(list, new y20() { // from class: l.gf9
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f103890a.m210775R3((LikedUser) obj);
                }
            });
            final List arrayList = NullChecker.m82486a(this.f194016W.m222761e()) ? this.f194016W.m222761e().f184001a : new ArrayList();
            dbLinks.total = envelope.pagination.total;
            final ArrayList arrayList2 = new ArrayList();
            jyb.m147537z(list, new y20() { // from class: l.hf9
                @Override // p153l.y20
                public final void call(Object obj) {
                    xf9.m210750p3(arrayList, i, arrayList2, (LikedUser) obj);
                }
            });
            if (arrayList2.size() > 0) {
                arrayList.addAll(0, arrayList2);
            }
            vg60VarM201220b = new vg60<>(arrayList, dbLinks);
        }
        this.f194016W.m137019l(vg60VarM201220b);
        return uxj0.f181467a;
    }

    /* JADX INFO: renamed from: T3 */
    public final /* synthetic */ C22421c m210777T3(final String str, final int i) {
        return qi20.m176658e(new pcj() { // from class: l.qf9
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4879a.f20236P.auth().m209043q(C4879a.m32379z0(str)).m209028b();
            }
        }).map(new qcj() { // from class: l.rf9
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f162768a.m210774Q3((Envelope) obj);
            }
        }).observeOn(fo0.m126432a()).filter(new qcj() { // from class: l.sf9
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return xf9.m210736b3(i, (Envelope) obj);
            }
        }).map(new qcj() { // from class: l.tf9
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f173932a.m210776S3(i, (Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: U3 */
    public final /* synthetic */ Envelope m210778U3(Envelope envelope) {
        if (!jyb.m147479J(((CommonData) envelope.getModuleData(CommonData.class)).users)) {
            this.f91137Q.m32495w3(envelope, null);
        }
        return envelope;
    }

    /* JADX INFO: renamed from: V3 */
    public final /* synthetic */ C22421c m210779V3(final StringBuilder sb) {
        return qi20.m176658e(new pcj() { // from class: l.nf9
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4879a.f20236P.auth().m209043q(sb.toString()).m209028b();
            }
        }).map(new qcj() { // from class: l.of9
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f147056a.m210778U3((Envelope) obj);
            }
        }).observeOn(fo0.m126432a());
    }

    /* JADX INFO: renamed from: W3 */
    public int m210780W3() {
        if (this.f194012S.m222761e() == null) {
            return 0;
        }
        return this.f194012S.m222761e().m201222d();
    }

    /* JADX INFO: renamed from: X3 */
    public C22421c<vg60<LikedUser>> m210781X3() {
        return this.f194012S.asObservable();
    }

    /* JADX INFO: renamed from: Y3 */
    public C22421c<uxj0> m210782Y3(int i, int i2, boolean z) {
        return m210783Z3(i, i2, z, null, null);
    }

    /* JADX INFO: renamed from: Z3 */
    public C22421c<uxj0> m210783Z3(final int i, int i2, final boolean z, LikedUserFilterSettings likedUserFilterSettings, String str) {
        final String strM210767J3 = m210767J3(i2, i, z, likedUserFilterSettings, str);
        return this.f91137Q.scheduled("likedUser", 0, new pcj() { // from class: l.af9
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f70880a.m210772O3(strM210767J3, z, i);
            }
        });
    }

    /* JADX INFO: renamed from: a4 */
    public C22421c<uxj0> m210784a4() {
        final LikedUserFilterSettings likedUserFilterSettings = this.f194015V.get();
        return m210783Z3(1, gta.m132210e().m132214d().mo34781Wk(), true, likedUserFilterSettings, null).switchMap(new qcj() { // from class: l.pf9
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f152161a.m210773P3(likedUserFilterSettings, (uxj0) obj);
            }
        });
    }

    /* JADX INFO: renamed from: b4 */
    public C22421c<uxj0> m210785b4(final int i, int i2) {
        final String strM210766I3 = m210766I3(i2, i, false);
        return this.f91137Q.scheduled("likedUserForMyTab", 0, new pcj() { // from class: l.lf9
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f131830a.m210777T3(strM210766I3, i);
            }
        });
    }

    /* JADX INFO: renamed from: c4 */
    public C22421c<Envelope> m210786c4(String str) {
        final StringBuilder sb = new StringBuilder(C4879a.m32203G("/live-activities?source=live-activities-liked&with=users"));
        if (TextUtils.isEmpty(str)) {
            sb.append("&until=0&limit=30");
        } else {
            sb.append("&");
            sb.append(str);
        }
        return this.f91137Q.scheduled("loadLiveActivitiesLiked", 0, new pcj() { // from class: l.mf9
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f136619a.m210779V3(sb);
            }
        });
    }

    /* JADX INFO: renamed from: d4 */
    public void m210787d4(final String str) {
        if (NullChecker.m82486a(this.f194012S.m222761e()) && jyb.m147505e0(this.f194012S.m222761e().f184001a, new qcj() { // from class: l.ef9
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((LikedUser) obj).f21174id.equals(str));
            }
        })) {
            this.f194012S.m222761e().f184002b.total--;
        }
        this.f91137Q.f20430u1.m127303b3(str);
    }

    /* JADX INFO: renamed from: e4 */
    public void m210788e4(final String str) {
        if (NullChecker.m82486a(this.f194016W.m222761e()) && jyb.m147505e0(this.f194016W.m222761e().f184001a, new qcj() { // from class: l.ff9
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((LikedUser) obj).f21174id.equals(str));
            }
        })) {
            this.f194016W.m222761e().f184002b.total--;
        }
        this.f91137Q.f20430u1.m127303b3(str);
    }

    /* JADX INFO: renamed from: f4 */
    public void m210789f4(String str) {
        this.f194011R = str;
    }

    /* JADX INFO: renamed from: x3 */
    public void m210790x3() {
        this.f91137Q.clearRequests("likedUserForMyTab", 0);
    }

    /* JADX INFO: renamed from: y3 */
    public void m210791y3() {
        this.f194013T.clear();
    }

    /* JADX INFO: renamed from: z3 */
    public void m210792z3() {
        this.f91137Q.clearRequests("likedUser", 0);
    }
}
