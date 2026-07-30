package p006l;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.google.common.base.Optional;
import com.p000p1.mobile.putong.api.api.Network;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.api.C0154a;
import com.p000p1.mobile.putong.core.api.C0158c;
import com.p1.mobile.putong.core.data.CoreData;
import com.p1.mobile.putong.core.data.MyVisitorsShowType;
import com.p1.mobile.putong.core.data.VisitorFilterSettings;
import com.p1.mobile.putong.core.data.VisitorFilterType;
import com.p1.mobile.putong.core.data.VisitorSetting;
import com.p1.mobile.putong.core.data.VisitorSortType;
import com.p1.mobile.putong.core.data.VisitorsFilterSavedSettings;
import com.p1.mobile.putong.data.CommonData;
import com.p1.mobile.putong.data.Envelope;
import com.p1.mobile.putong.data.Links;
import com.p1.mobile.putong.data.ODiamondVisitorInfo;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.Visitor;
import com.p1.mobile.putong.data.VisitorInfo;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import l.hpd0;
import l.j760;
import l.jo0;
import l.roj0;
import l.tpd0;
import l.utc0;
import l.v9j;
import l.vwb;
import l.w5m0;
import l.w9j;
import l.zpd0;
import org.json.JSONException;
import org.json.JSONObject;
import rx.c;
import rx.subjects.a;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class qlb extends ax6 {

    /* JADX INFO: renamed from: R */
    public final VisitorsFilterSavedSettings f19888R;

    /* JADX INFO: renamed from: S */
    public a<VisitorSetting> f19889S;

    /* JADX INFO: renamed from: T */
    public final Map<String, User> f19890T;

    /* JADX INFO: renamed from: U */
    public a<j760<List<Visitor>, String>> f19891U;

    /* JADX INFO: renamed from: V */
    public a<j760<String, Boolean>> f19892V;

    /* JADX INFO: renamed from: W */
    public a<Boolean> f19893W;

    /* JADX INFO: renamed from: X */
    public MyVisitorsShowType f19894X;

    /* JADX INFO: renamed from: Y */
    public final hpd0 f19895Y;

    /* JADX INFO: renamed from: Z */
    public final hpd0 f19896Z;

    /* JADX INFO: renamed from: a0 */
    public zpd0 f19897a0;

    /* JADX INFO: renamed from: b0 */
    public tpd0 f19898b0;

    /* JADX INFO: renamed from: c0 */
    public final Set<String> f19899c0;

    public qlb(C0158c c0158c) {
        super(c0158c);
        this.f19888R = new VisitorsFilterSavedSettings("visitors_filter_settings_" + CoreModule.m1850H().userId(), true, "putongPref");
        this.f19889S = a.b();
        this.f19890T = new HashMap();
        this.f19891U = a.b();
        this.f19892V = a.b();
        this.f19893W = a.b();
        this.f19894X = MyVisitorsShowType.get("unknown_");
        String str = "my_visitor_recover_visitor_footprint_dialog_shown_" + CoreModule.m1850H().userId();
        Boolean bool = Boolean.FALSE;
        this.f19895Y = new hpd0(str, bool);
        this.f19896Z = new hpd0("my_visitor_recover_visitor_footprint_dialog_shown_checkbox_state_" + CoreModule.m1850H().userId(), bool);
        this.f19897a0 = new zpd0("my_visitor_message_hide_footprint_show_time_" + CoreModule.m1850H().userId(), 0L);
        this.f19898b0 = new tpd0("my_visitor_message_hide_footprint_show_count_" + CoreModule.m1850H().userId(), 0);
        this.f19899c0 = new HashSet();
    }

    /* JADX INFO: renamed from: A3 */
    public static String m22214A3(String str) {
        return C0154a.m3296w2("/" + str + "/moment-settings");
    }

    /* JADX INFO: renamed from: B3 */
    public static String m22215B3(String str, boolean z) {
        StringBuilder sb = new StringBuilder();
        if (TextUtils.isEmpty(str)) {
            sb.append("?updateLastVisitTime=");
            sb.append(z);
        } else {
            sb.append("?scenario=");
            sb.append(str);
            sb.append("&updateLastVisitTime=");
            sb.append(z);
        }
        return C0154a.m3143J0("/unprivileged-visitors" + ((Object) sb));
    }

    /* JADX INFO: renamed from: l3 */
    public static /* synthetic */ Optional m22227l3(Envelope envelope) {
        VisitorInfo visitorInfo = envelope.getModuleData(CommonData.class).visitorInfo;
        if (NullChecker.a(visitorInfo) && NullChecker.a(visitorInfo.myVisitors)) {
            List list = visitorInfo.myVisitors.visitors;
            if (!vwb.J(list)) {
                return Optional.of((Visitor) list.get(0));
            }
        }
        return Optional.absent();
    }

    /* JADX INFO: renamed from: z3 */
    public static String m22241z3(String str, String str2, String str3, boolean z) {
        StringBuilder sb = new StringBuilder();
        if (!TextUtils.isEmpty(str2)) {
            sb.append("&");
            sb.append(str2);
        }
        sb.append("&updateLastVisitTime=");
        sb.append(z);
        return C0154a.m3296w2("/" + str + "/moment-visitors?scene=" + str3 + "&with=" + C0154a.f3508y + ((Object) sb));
    }

    /* JADX INFO: renamed from: C3 */
    public void m22242C3(String str) {
        this.f8580Q.clearRequests("/moments/visitor/next" + str, 0);
    }

    /* JADX INFO: renamed from: D3 */
    public String m22243D3(@NonNull VisitorFilterSettings visitorFilterSettings) {
        StringBuilder sb = new StringBuilder();
        sb.append("limit=40&");
        if (visitorFilterSettings.distance >= w5m0.c() && visitorFilterSettings.distance <= w5m0.b()) {
            sb.append("filterDistance=");
            sb.append(visitorFilterSettings.distance);
            sb.append("&");
        }
        if (visitorFilterSettings.minAge >= w5m0.e() && visitorFilterSettings.minAge <= w5m0.d()) {
            sb.append("filterAgeMin=");
            sb.append(visitorFilterSettings.minAge);
            sb.append("&");
        }
        if (visitorFilterSettings.maxAge >= w5m0.e() && visitorFilterSettings.maxAge <= w5m0.d()) {
            int i = visitorFilterSettings.maxAge;
            if (i >= w5m0.d()) {
                i = 80;
            }
            sb.append("filterAgeMax=");
            sb.append(i);
            sb.append("&");
        }
        if (visitorFilterSettings.sort != VisitorSortType.get("unknown_") && visitorFilterSettings.sort != VisitorSortType.get("visitTime")) {
            sb.append("sort=");
            sb.append(visitorFilterSettings.sort.toString());
            sb.append("&");
        }
        if (visitorFilterSettings.filter == VisitorFilterType.get("match") || visitorFilterSettings.filter == VisitorFilterType.get("likeMe")) {
            sb.append("filter=");
            sb.append(visitorFilterSettings.filter.toString());
            sb.append("&");
        }
        return !TextUtils.isEmpty(sb) ? sb.substring(0, sb.length() - 1) : "";
    }

    /* JADX INFO: renamed from: E3 */
    public void m22244E3() {
        this.f19896Z.put(Boolean.TRUE);
        this.f19895Y.put(Boolean.FALSE);
    }

    /* JADX INFO: renamed from: F3 */
    public MyVisitorsShowType m22245F3() {
        return this.f19894X;
    }

    /* JADX INFO: renamed from: G3 */
    public c<ODiamondVisitorInfo> m22246G3(String str) {
        final String str2 = "/me/visitor-odiamond/" + str;
        return scheduled("o_diamond_visitors_message_info_" + str, 0, new v9j() { // from class: l.jlb
            public final Object call() {
                return ia20.m16567a(new v9j() { // from class: l.vkb
                    public final Object call() {
                        return C0154a.f3483P.auth().q(C0154a.m3296w2(str)).b();
                    }
                }).map(new w9j() { // from class: l.wkb
                    public final Object call(Object obj) {
                        return ((Envelope) obj).getModuleData(CommonData.class).visitorInfo.oDiamondVisitor;
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: H3 */
    public c<Optional<Visitor>> m22247H3(String str) {
        final String str2 = "/" + CoreModule.m1850H().userId() + "/my-visitors/other-info?otherUserId=" + str + "&scenes=chat";
        return scheduled("visitors_message_info_" + str, 0, new v9j() { // from class: l.ilb
            public final Object call() {
                return ia20.m16567a(new v9j() { // from class: l.tkb
                    public final Object call() {
                        return C0154a.f3483P.auth().q(C0154a.m3296w2(str)).b();
                    }
                }).map(new w9j() { // from class: l.ukb
                    public final Object call(Object obj) {
                        return qlb.m22227l3((Envelope) obj);
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: I3 */
    public User m22248I3(String str) {
        User userM21393Pa = this.f19890T.get(str);
        if (userM21393Pa == null) {
            userM21393Pa = CoreModule.f1534c.f3628e0.m21393Pa(str);
        }
        this.f19890T.put(str, userM21393Pa);
        return userM21393Pa;
    }

    /* JADX INFO: renamed from: J3 */
    public c<VisitorSetting> m22249J3(final String str) {
        return scheduled("/moments/visitor/setting" + str, 0, new v9j() { // from class: l.clb
            public final Object call() {
                return this.f9714a.m22253N3(str);
            }
        });
    }

    /* JADX INFO: renamed from: K3 */
    public VisitorFilterSettings m22250K3() {
        return (VisitorFilterSettings) this.f19888R.get();
    }

    /* JADX INFO: renamed from: L3 */
    public boolean m22251L3() {
        if (this.f19889S.i()) {
            return ((VisitorSetting) this.f19889S.e()).visitorPermission;
        }
        return true;
    }

    /* JADX INFO: renamed from: M3 */
    public final /* synthetic */ VisitorSetting m22252M3(Envelope envelope) {
        m22283r4(envelope);
        CoreModule.m1851K().triggerCounterFromMemoryCache(envelope.counters);
        VisitorSetting visitorSetting = envelope.getModuleData(CoreData.class).visitorSetting;
        this.f19889S.onNext(visitorSetting);
        return visitorSetting;
    }

    /* JADX INFO: renamed from: N3 */
    public final /* synthetic */ c m22253N3(final String str) {
        return new la20(new v9j() { // from class: l.olb
            public final Object call() {
                return C0154a.f3483P.auth().q(qlb.m22214A3(str)).f().b();
            }
        }).compose(C0154a.m3182T2()).map(new w9j() { // from class: l.plb
            public final Object call(Object obj) {
                return this.f19186a.m22252M3((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: O3 */
    public final /* synthetic */ j760 m22254O3(Envelope envelope) {
        m22283r4(envelope);
        CoreModule.m1851K().triggerCounterFromMemoryCache(envelope.counters);
        return new j760(envelope.pagination.links, envelope.getModuleData(CommonData.class).visitorInfo);
    }

    /* JADX INFO: renamed from: P3 */
    public final /* synthetic */ c m22255P3(final String str) {
        return new la20(new v9j() { // from class: l.zkb
            public final Object call() {
                return C0154a.f3483P.auth().q(str).f().b();
            }
        }).compose(C0154a.m3182T2()).map(new w9j() { // from class: l.alb
            public final Object call(Object obj) {
                return this.f8317a.m22254O3((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: Q3 */
    public final /* synthetic */ Envelope m22256Q3(Envelope envelope) {
        if (!vwb.J(envelope.getModuleData(CommonData.class).users)) {
            this.f8580Q.m3423x3(envelope, null, false);
        }
        return envelope;
    }

    /* JADX INFO: renamed from: R3 */
    public final /* synthetic */ roj0 m22257R3(boolean z, MyVisitorsShowType myVisitorsShowType, Envelope envelope) {
        m22283r4(envelope);
        VisitorInfo visitorInfo = envelope.getModuleData(CommonData.class).visitorInfo;
        ArrayList arrayList = new ArrayList();
        if (NullChecker.a(visitorInfo) && NullChecker.a(visitorInfo.myVisitors)) {
            if (z) {
                this.f19899c0.clear();
                for (Visitor visitor : visitorInfo.myVisitors.visitors) {
                    if (!this.f19899c0.contains(visitor.userId)) {
                        this.f19899c0.add(visitor.userId);
                        arrayList.add(visitor);
                    }
                }
            } else {
                if (this.f19891U.i()) {
                    arrayList.addAll((Collection) ((j760) this.f19891U.e()).a);
                }
                for (Visitor visitor2 : visitorInfo.myVisitors.visitors) {
                    if (!this.f19899c0.contains(visitor2.userId)) {
                        this.f19899c0.add(visitor2.userId);
                        arrayList.add(visitor2);
                    }
                }
            }
            this.f19891U.onNext(j760.a(arrayList, envelope.pagination.links.next));
            this.f19894X = myVisitorsShowType;
        }
        return roj0.a;
    }

    /* JADX INFO: renamed from: S3 */
    public final /* synthetic */ c m22258S3(final StringBuilder sb, final boolean z, final MyVisitorsShowType myVisitorsShowType) {
        return ia20.m16571e(new v9j() { // from class: l.klb
            public final Object call() {
                return C0154a.f3483P.auth().q(C0154a.m3296w2(sb.toString())).b();
            }
        }).map(new w9j() { // from class: l.llb
            public final Object call(Object obj) {
                return this.f16510a.m22256Q3((Envelope) obj);
            }
        }).observeOn(jo0.a()).map(new w9j() { // from class: l.mlb
            public final Object call(Object obj) {
                return this.f17026a.m22257R3(z, myVisitorsShowType, (Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: T3 */
    public final /* synthetic */ VisitorSetting m22259T3(Envelope envelope) {
        m22283r4(envelope);
        CoreModule.m1851K().triggerCounterFromMemoryCache(envelope.counters);
        VisitorSetting visitorSetting = envelope.getModuleData(CoreData.class).visitorSetting;
        this.f19889S.onNext(visitorSetting);
        return visitorSetting;
    }

    /* JADX INFO: renamed from: U3 */
    public final /* synthetic */ c m22260U3(String str, final JSONObject jSONObject) {
        final String strM22214A3 = m22214A3(str);
        return new la20(new v9j() { // from class: l.dlb
            public final Object call() {
                return C0154a.f3483P.auth().l(utc0.create(Network.JSON, jSONObject.toString())).q(strM22214A3 + "?method=patch").b();
            }
        }).compose(C0154a.m3182T2()).map(new w9j() { // from class: l.elb
            public final Object call(Object obj) {
                return this.f11238a.m22259T3((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: V3 */
    public final /* synthetic */ roj0 m22261V3(boolean z, String str, Envelope envelope) {
        if (z) {
            CoreModule.f1534c.f3544C0.m27423x4();
        }
        m22280o4(str, z);
        m22271f4(str, z);
        return roj0.a;
    }

    /* JADX INFO: renamed from: W3 */
    public final /* synthetic */ c m22262W3(final StringBuilder sb, final boolean z, final String str) {
        return ia20.m16567a(new v9j() { // from class: l.glb
            public final Object call() {
                return C0154a.f3483P.auth().q(C0154a.m3296w2(sb.toString())).l(utc0.create(Network.JSON, "")).b();
            }
        }).map(new w9j() { // from class: l.hlb
            public final Object call(Object obj) {
                return this.f13934a.m22261V3(z, str, (Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: X3 */
    public final /* synthetic */ j760 m22263X3(Envelope envelope) {
        m22283r4(envelope);
        return new j760(envelope.pagination.links, envelope.getModuleData(CommonData.class).visitorInfo);
    }

    /* JADX INFO: renamed from: Y3 */
    public final /* synthetic */ c m22264Y3(final String str, final boolean z) {
        return ia20.m16567a(new v9j() { // from class: l.xkb
            public final Object call() {
                return C0154a.f3483P.auth().q(qlb.m22215B3(str, z)).f().b();
            }
        }).map(new w9j() { // from class: l.ykb
            public final Object call(Object obj) {
                return this.f28264a.m22263X3((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: Z3 */
    public c<j760<Links, VisitorInfo>> m22265Z3(String str, final String str2) {
        return scheduled(str, 0, new v9j() { // from class: l.skb
            public final Object call() {
                return this.f21392a.m22255P3(str2);
            }
        });
    }

    /* JADX INFO: renamed from: a4 */
    public c<j760<Links, VisitorInfo>> m22266a4(String str, String str2, String str3, boolean z) {
        if (TextUtils.isEmpty(str3)) {
            str3 = "limit=20";
        }
        return m22265Z3("/moments/visitor/prev" + str, m22241z3(str, str3, str2, z));
    }

    /* JADX INFO: renamed from: b4 */
    public c<j760<Links, VisitorInfo>> m22267b4(String str, Links links, String str2, boolean z) {
        return m22265Z3("/moments/visitor/next" + str, m22241z3(str, links.next, str2, z));
    }

    /* JADX INFO: renamed from: c4 */
    public c<j760<String, Boolean>> m22268c4() {
        return this.f19892V.asObservable();
    }

    /* JADX INFO: renamed from: d4 */
    public void m22269d4(final MyVisitorsShowType myVisitorsShowType, final boolean z, String str) {
        String strUserId = CoreModule.m1850H().userId();
        final StringBuilder sb = new StringBuilder("/");
        sb.append(strUserId);
        sb.append("/my-visitors?");
        if (TextUtils.isEmpty(str)) {
            if (TEnum.equals(myVisitorsShowType, "hidden")) {
                sb.append("data=hidden");
            } else if (TEnum.equals(myVisitorsShowType, "visitTime")) {
                sb.append("sort=visitTime");
            } else {
                sb.append("sort=visitTimes");
            }
            sb.append("&limit=40");
        } else {
            sb.append(str);
        }
        scheduled("my_visitors_list_" + strUserId, 0, new v9j() { // from class: l.rkb
            public final Object call() {
                return this.f20588a.m22258S3(sb, z, myVisitorsShowType);
            }
        });
    }

    /* JADX INFO: renamed from: e4 */
    public c<j760<List<Visitor>, String>> m22270e4() {
        return this.f19891U.asObservable();
    }

    /* JADX INFO: renamed from: f4 */
    public void m22271f4(String str, boolean z) {
        this.f19892V.onNext(j760.a(str, Boolean.valueOf(z)));
    }

    /* JADX INFO: renamed from: g4 */
    public void m22272g4(boolean z) {
        this.f19893W.onNext(Boolean.valueOf(z));
    }

    /* JADX INFO: renamed from: h4 */
    public c<VisitorSetting> m22273h4(final String str, boolean z) {
        final JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("key", "visitorPermission");
            jSONObject.put("value", z ? "true" : "false");
        } catch (JSONException e) {
            CrashHelper.c(e);
        }
        return scheduled("user/moment/visitor/setting/patch", -1, new v9j() { // from class: l.blb
            public final Object call() {
                return this.f8969a.m22260U3(str, jSONObject);
            }
        });
    }

    /* JADX INFO: renamed from: i4 */
    public void m22274i4(@NonNull VisitorFilterSettings visitorFilterSettings) {
        this.f19888R.put(visitorFilterSettings);
    }

    /* JADX INFO: renamed from: j4 */
    public boolean m22275j4() {
        return ((Boolean) this.f19896Z.get()).booleanValue();
    }

    /* JADX INFO: renamed from: k4 */
    public void m22276k4(boolean z) {
        this.f19896Z.put(Boolean.valueOf(z));
    }

    /* JADX INFO: renamed from: l4 */
    public void m22277l4() {
        if (((Boolean) this.f19896Z.get()).booleanValue()) {
            this.f19895Y.put(Boolean.TRUE);
        }
    }

    /* JADX INFO: renamed from: m4 */
    public c<roj0> m22278m4(final String str, final boolean z) {
        final StringBuilder sb = new StringBuilder("/");
        sb.append(CoreModule.m1850H().userId());
        sb.append("/visitor/hidden?otherUserId=");
        sb.append(str);
        if (z) {
            sb.append("&op=add");
        } else {
            sb.append("&op=remove");
        }
        return scheduled("visitors_set_hidden_state_" + str, -1, new v9j() { // from class: l.flb
            public final Object call() {
                return this.f12762a.m22262W3(sb, z, str);
            }
        });
    }

    /* JADX INFO: renamed from: n4 */
    public boolean m22279n4() {
        return (((Boolean) this.f19895Y.get()).booleanValue() && ((Boolean) this.f19896Z.get()).booleanValue()) ? false : true;
    }

    /* JADX INFO: renamed from: o4 */
    public void m22280o4(String str, boolean z) {
        if (this.f19891U.i()) {
            j760 j760Var = (j760) this.f19891U.e();
            if (vwb.J((Collection) j760Var.a)) {
                return;
            }
            for (Visitor visitor : (List) j760Var.a) {
                if (TextUtils.equals(visitor.userId, str) && visitor.hidden != z) {
                    visitor.hidden = z;
                    this.f19891U.onNext(j760Var);
                    return;
                }
            }
        }
    }

    /* JADX INFO: renamed from: p4 */
    public c<j760<Links, VisitorInfo>> m22281p4(final String str, final boolean z) {
        return scheduled("un_privilege_visitor_" + str, 0, new v9j() { // from class: l.nlb
            public final Object call() {
                return this.f17740a.m22264Y3(str, z);
            }
        });
    }

    /* JADX INFO: renamed from: q4 */
    public c<j760<Links, VisitorInfo>> m22282q4(boolean z) {
        return m22281p4("", z);
    }

    /* JADX INFO: renamed from: r4 */
    public void m22283r4(Envelope envelope) {
        if (!NullChecker.b(envelope.getModuleData(CommonData.class).users) || envelope.getModuleData(CommonData.class).users.size() <= 0) {
            return;
        }
        for (int i = 0; i < envelope.getModuleData(CommonData.class).users.size(); i++) {
            User user = (User) envelope.getModuleData(CommonData.class).users.get(i);
            if (this.f19890T.get(((DbObject) user).id) != null && NullChecker.a(this.f19890T.get(((DbObject) user).id))) {
                user.mergeData(this.f19890T.get(((DbObject) user).id));
            }
            this.f19890T.put(((DbObject) user).id, user);
        }
    }

    /* JADX INFO: renamed from: s4 */
    public c<Boolean> m22284s4() {
        return this.f19893W.asObservable();
    }
}
