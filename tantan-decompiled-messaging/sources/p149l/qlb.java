package p149l;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.clevertap.android.sdk.Constants;
import com.google.common.base.Optional;
import com.p046p1.mobile.putong.api.api.Network;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.C4728a;
import com.p046p1.mobile.putong.core.api.C4732c;
import com.p046p1.mobile.putong.core.data.CoreData;
import com.p046p1.mobile.putong.core.data.MyVisitorsShowType;
import com.p046p1.mobile.putong.core.data.VisitorFilterSettings;
import com.p046p1.mobile.putong.core.data.VisitorFilterType;
import com.p046p1.mobile.putong.core.data.VisitorSetting;
import com.p046p1.mobile.putong.core.data.VisitorSortType;
import com.p046p1.mobile.putong.core.data.VisitorsFilterSavedSettings;
import com.p046p1.mobile.putong.data.CommonData;
import com.p046p1.mobile.putong.data.Envelope;
import com.p046p1.mobile.putong.data.Links;
import com.p046p1.mobile.putong.data.ODiamondVisitorInfo;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.Visitor;
import com.p046p1.mobile.putong.data.VisitorInfo;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;
import p133rx.C22306c;
import p133rx.subjects.C22392a;

/* JADX INFO: loaded from: classes9.dex */
public class qlb extends ax6 {

    /* JADX INFO: renamed from: R */
    public final VisitorsFilterSavedSettings f155204R;

    /* JADX INFO: renamed from: S */
    public C22392a<VisitorSetting> f155205S;

    /* JADX INFO: renamed from: T */
    public final Map<String, User> f155206T;

    /* JADX INFO: renamed from: U */
    public C22392a<j760<List<Visitor>, String>> f155207U;

    /* JADX INFO: renamed from: V */
    public C22392a<j760<String, Boolean>> f155208V;

    /* JADX INFO: renamed from: W */
    public C22392a<Boolean> f155209W;

    /* JADX INFO: renamed from: X */
    public MyVisitorsShowType f155210X;

    /* JADX INFO: renamed from: Y */
    public final hpd0 f155211Y;

    /* JADX INFO: renamed from: Z */
    public final hpd0 f155212Z;

    /* JADX INFO: renamed from: a0 */
    public zpd0 f155213a0;

    /* JADX INFO: renamed from: b0 */
    public tpd0 f155214b0;

    /* JADX INFO: renamed from: c0 */
    public final Set<String> f155215c0;

    public qlb(C4732c c4732c) {
        super(c4732c);
        this.f155204R = new VisitorsFilterSavedSettings("visitors_filter_settings_" + CoreModule.m29931H().userId(), true, "putongPref");
        this.f155205S = C22392a.m221512b();
        this.f155206T = new HashMap();
        this.f155207U = C22392a.m221512b();
        this.f155208V = C22392a.m221512b();
        this.f155209W = C22392a.m221512b();
        this.f155210X = MyVisitorsShowType.get("unknown_");
        String str = "my_visitor_recover_visitor_footprint_dialog_shown_" + CoreModule.m29931H().userId();
        Boolean bool = Boolean.FALSE;
        this.f155211Y = new hpd0(str, bool);
        this.f155212Z = new hpd0("my_visitor_recover_visitor_footprint_dialog_shown_checkbox_state_" + CoreModule.m29931H().userId(), bool);
        this.f155213a0 = new zpd0("my_visitor_message_hide_footprint_show_time_" + CoreModule.m29931H().userId(), 0L);
        this.f155214b0 = new tpd0("my_visitor_message_hide_footprint_show_count_" + CoreModule.m29931H().userId(), 0);
        this.f155215c0 = new HashSet();
    }

    /* JADX INFO: renamed from: A3 */
    public static String m175398A3(String str) {
        return C4728a.m31366w2("/" + str + "/moment-settings");
    }

    /* JADX INFO: renamed from: B3 */
    public static String m175399B3(String str, boolean z) {
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
        return C4728a.m31213J0("/unprivileged-visitors" + ((Object) sb));
    }

    /* JADX INFO: renamed from: l3 */
    public static /* synthetic */ Optional m175411l3(Envelope envelope) {
        VisitorInfo visitorInfo = ((CommonData) envelope.getModuleData(CommonData.class)).visitorInfo;
        if (NullChecker.m81303a(visitorInfo) && NullChecker.m81303a(visitorInfo.myVisitors)) {
            List<Visitor> list = visitorInfo.myVisitors.visitors;
            if (!vwb.m200296J(list)) {
                return Optional.m15413of(list.get(0));
            }
        }
        return Optional.absent();
    }

    /* JADX INFO: renamed from: z3 */
    public static String m175425z3(String str, String str2, String str3, boolean z) {
        StringBuilder sb = new StringBuilder();
        if (!TextUtils.isEmpty(str2)) {
            sb.append("&");
            sb.append(str2);
        }
        sb.append("&updateLastVisitTime=");
        sb.append(z);
        return C4728a.m31366w2("/" + str + "/moment-visitors?scene=" + str3 + "&with=" + C4728a.f19519y + ((Object) sb));
    }

    /* JADX INFO: renamed from: C3 */
    public void m175426C3(String str) {
        this.f72126Q.clearRequests("/moments/visitor/next" + str, 0);
    }

    /* JADX INFO: renamed from: D3 */
    public String m175427D3(@NonNull VisitorFilterSettings visitorFilterSettings) {
        StringBuilder sb = new StringBuilder();
        sb.append("limit=40&");
        if (visitorFilterSettings.distance >= w5m0.m201649c() && visitorFilterSettings.distance <= w5m0.m201648b()) {
            sb.append("filterDistance=");
            sb.append(visitorFilterSettings.distance);
            sb.append("&");
        }
        if (visitorFilterSettings.minAge >= w5m0.m201651e() && visitorFilterSettings.minAge <= w5m0.m201650d()) {
            sb.append("filterAgeMin=");
            sb.append(visitorFilterSettings.minAge);
            sb.append("&");
        }
        if (visitorFilterSettings.maxAge >= w5m0.m201651e() && visitorFilterSettings.maxAge <= w5m0.m201650d()) {
            int i = visitorFilterSettings.maxAge;
            if (i >= w5m0.m201650d()) {
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
        if (visitorFilterSettings.filter == VisitorFilterType.get("match") || visitorFilterSettings.filter == VisitorFilterType.get(VisitorFilterType.likeMe)) {
            sb.append("filter=");
            sb.append(visitorFilterSettings.filter.toString());
            sb.append("&");
        }
        return !TextUtils.isEmpty(sb) ? sb.substring(0, sb.length() - 1) : "";
    }

    /* JADX INFO: renamed from: E3 */
    public void m175428E3() {
        this.f155212Z.put(Boolean.TRUE);
        this.f155211Y.put(Boolean.FALSE);
    }

    /* JADX INFO: renamed from: F3 */
    public MyVisitorsShowType m175429F3() {
        return this.f155210X;
    }

    /* JADX INFO: renamed from: G3 */
    public C22306c<ODiamondVisitorInfo> m175430G3(String str) {
        final String str2 = "/me/visitor-odiamond/" + str;
        return scheduled("o_diamond_visitors_message_info_" + str, 0, new v9j() { // from class: l.jlb
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return ia20.m135117a(new v9j() { // from class: l.vkb
                    @Override // p149l.v9j, java.util.concurrent.Callable
                    public final Object call() {
                        return C4728a.f19494P.auth().m185898q(C4728a.m31366w2(str)).m185883b();
                    }
                }).map(new w9j() { // from class: l.wkb
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return ((CommonData) ((Envelope) obj).getModuleData(CommonData.class)).visitorInfo.oDiamondVisitor;
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: H3 */
    public C22306c<Optional<Visitor>> m175431H3(String str) {
        final String str2 = "/" + CoreModule.m29931H().userId() + "/my-visitors/other-info?otherUserId=" + str + "&scenes=chat";
        return scheduled("visitors_message_info_" + str, 0, new v9j() { // from class: l.ilb
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return ia20.m135117a(new v9j() { // from class: l.tkb
                    @Override // p149l.v9j, java.util.concurrent.Callable
                    public final Object call() {
                        return C4728a.f19494P.auth().m185898q(C4728a.m31366w2(str)).m185883b();
                    }
                }).map(new w9j() { // from class: l.ukb
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return qlb.m175411l3((Envelope) obj);
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: I3 */
    public User m175432I3(String str) {
        User userM169430Pa = this.f155206T.get(str);
        if (userM169430Pa == null) {
            userM169430Pa = CoreModule.f17545c.f19639e0.m169430Pa(str);
        }
        this.f155206T.put(str, userM169430Pa);
        return userM169430Pa;
    }

    /* JADX INFO: renamed from: J3 */
    public C22306c<VisitorSetting> m175433J3(final String str) {
        return scheduled("/moments/visitor/setting" + str, 0, new v9j() { // from class: l.clb
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f81380a.m175437N3(str);
            }
        });
    }

    /* JADX INFO: renamed from: K3 */
    public VisitorFilterSettings m175434K3() {
        return this.f155204R.get();
    }

    /* JADX INFO: renamed from: L3 */
    public boolean m175435L3() {
        if (this.f155205S.m221519i()) {
            return this.f155205S.m221515e().visitorPermission;
        }
        return true;
    }

    /* JADX INFO: renamed from: M3 */
    public final /* synthetic */ VisitorSetting m175436M3(Envelope envelope) {
        m175467r4(envelope);
        CoreModule.m29932K().triggerCounterFromMemoryCache(envelope.counters);
        VisitorSetting visitorSetting = ((CoreData) envelope.getModuleData(CoreData.class)).visitorSetting;
        this.f155205S.m132487l(visitorSetting);
        return visitorSetting;
    }

    /* JADX INFO: renamed from: N3 */
    public final /* synthetic */ C22306c m175437N3(final String str) {
        return new la20(new v9j() { // from class: l.olb
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4728a.f19494P.auth().m185898q(qlb.m175398A3(str)).m185887f().m185883b();
            }
        }).compose(C4728a.m31252T2()).map(new w9j() { // from class: l.plb
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f150087a.m175436M3((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: O3 */
    public final /* synthetic */ j760 m175438O3(Envelope envelope) {
        m175467r4(envelope);
        CoreModule.m29932K().triggerCounterFromMemoryCache(envelope.counters);
        return new j760(envelope.pagination.links, ((CommonData) envelope.getModuleData(CommonData.class)).visitorInfo);
    }

    /* JADX INFO: renamed from: P3 */
    public final /* synthetic */ C22306c m175439P3(final String str) {
        return new la20(new v9j() { // from class: l.zkb
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4728a.f19494P.auth().m185898q(str).m185887f().m185883b();
            }
        }).compose(C4728a.m31252T2()).map(new w9j() { // from class: l.alb
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f70422a.m175438O3((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: Q3 */
    public final /* synthetic */ Envelope m175440Q3(Envelope envelope) {
        if (!vwb.m200296J(((CommonData) envelope.getModuleData(CommonData.class)).users)) {
            this.f72126Q.m31493x3(envelope, null, false);
        }
        return envelope;
    }

    /* JADX INFO: renamed from: R3 */
    public final /* synthetic */ roj0 m175441R3(boolean z, MyVisitorsShowType myVisitorsShowType, Envelope envelope) {
        m175467r4(envelope);
        VisitorInfo visitorInfo = ((CommonData) envelope.getModuleData(CommonData.class)).visitorInfo;
        ArrayList arrayList = new ArrayList();
        if (NullChecker.m81303a(visitorInfo) && NullChecker.m81303a(visitorInfo.myVisitors)) {
            if (z) {
                this.f155215c0.clear();
                for (Visitor visitor : visitorInfo.myVisitors.visitors) {
                    if (!this.f155215c0.contains(visitor.userId)) {
                        this.f155215c0.add(visitor.userId);
                        arrayList.add(visitor);
                    }
                }
            } else {
                if (this.f155207U.m221519i()) {
                    arrayList.addAll(this.f155207U.m221515e().f116564a);
                }
                for (Visitor visitor2 : visitorInfo.myVisitors.visitors) {
                    if (!this.f155215c0.contains(visitor2.userId)) {
                        this.f155215c0.add(visitor2.userId);
                        arrayList.add(visitor2);
                    }
                }
            }
            this.f155207U.m132487l(j760.m140076a(arrayList, envelope.pagination.links.next));
            this.f155210X = myVisitorsShowType;
        }
        return roj0.f160388a;
    }

    /* JADX INFO: renamed from: S3 */
    public final /* synthetic */ C22306c m175442S3(final StringBuilder sb, final boolean z, final MyVisitorsShowType myVisitorsShowType) {
        return ia20.m135121e(new v9j() { // from class: l.klb
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4728a.f19494P.auth().m185898q(C4728a.m31366w2(sb.toString())).m185883b();
            }
        }).map(new w9j() { // from class: l.llb
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f128685a.m175440Q3((Envelope) obj);
            }
        }).observeOn(jo0.m142408a()).map(new w9j() { // from class: l.mlb
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f134416a.m175441R3(z, myVisitorsShowType, (Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: T3 */
    public final /* synthetic */ VisitorSetting m175443T3(Envelope envelope) {
        m175467r4(envelope);
        CoreModule.m29932K().triggerCounterFromMemoryCache(envelope.counters);
        VisitorSetting visitorSetting = ((CoreData) envelope.getModuleData(CoreData.class)).visitorSetting;
        this.f155205S.m132487l(visitorSetting);
        return visitorSetting;
    }

    /* JADX INFO: renamed from: U3 */
    public final /* synthetic */ C22306c m175444U3(String str, final JSONObject jSONObject) {
        final String strM175398A3 = m175398A3(str);
        return new la20(new v9j() { // from class: l.dlb
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4728a.f19494P.auth().m185893l(utc0.create(Network.JSON, jSONObject.toString())).m185898q(strM175398A3 + "?method=patch").m185883b();
            }
        }).compose(C4728a.m31252T2()).map(new w9j() { // from class: l.elb
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f92087a.m175443T3((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: V3 */
    public final /* synthetic */ roj0 m175445V3(boolean z, String str, Envelope envelope) {
        if (z) {
            CoreModule.f17545c.f19555C0.m210115x4();
        }
        m175464o4(str, z);
        m175455f4(str, z);
        return roj0.f160388a;
    }

    /* JADX INFO: renamed from: W3 */
    public final /* synthetic */ C22306c m175446W3(final StringBuilder sb, final boolean z, final String str) {
        return ia20.m135117a(new v9j() { // from class: l.glb
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4728a.f19494P.auth().m185898q(C4728a.m31366w2(sb.toString())).m185893l(utc0.create(Network.JSON, "")).m185883b();
            }
        }).map(new w9j() { // from class: l.hlb
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f108334a.m175445V3(z, str, (Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: X3 */
    public final /* synthetic */ j760 m175447X3(Envelope envelope) {
        m175467r4(envelope);
        return new j760(envelope.pagination.links, ((CommonData) envelope.getModuleData(CommonData.class)).visitorInfo);
    }

    /* JADX INFO: renamed from: Y3 */
    public final /* synthetic */ C22306c m175448Y3(final String str, final boolean z) {
        return ia20.m135117a(new v9j() { // from class: l.xkb
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4728a.f19494P.auth().m185898q(qlb.m175399B3(str, z)).m185887f().m185883b();
            }
        }).map(new w9j() { // from class: l.ykb
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f198742a.m175447X3((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: Z3 */
    public C22306c<j760<Links, VisitorInfo>> m175449Z3(String str, final String str2) {
        return scheduled(str, 0, new v9j() { // from class: l.skb
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f164945a.m175439P3(str2);
            }
        });
    }

    /* JADX INFO: renamed from: a4 */
    public C22306c<j760<Links, VisitorInfo>> m175450a4(String str, String str2, String str3, boolean z) {
        if (TextUtils.isEmpty(str3)) {
            str3 = "limit=20";
        }
        return m175449Z3("/moments/visitor/prev" + str, m175425z3(str, str3, str2, z));
    }

    /* JADX INFO: renamed from: b4 */
    public C22306c<j760<Links, VisitorInfo>> m175451b4(String str, Links links, String str2, boolean z) {
        return m175449Z3("/moments/visitor/next" + str, m175425z3(str, links.next, str2, z));
    }

    /* JADX INFO: renamed from: c4 */
    public C22306c<j760<String, Boolean>> m175452c4() {
        return this.f155208V.asObservable();
    }

    /* JADX INFO: renamed from: d4 */
    public void m175453d4(final MyVisitorsShowType myVisitorsShowType, final boolean z, String str) {
        String strUserId = CoreModule.m29931H().userId();
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
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f159801a.m175442S3(sb, z, myVisitorsShowType);
            }
        });
    }

    /* JADX INFO: renamed from: e4 */
    public C22306c<j760<List<Visitor>, String>> m175454e4() {
        return this.f155207U.asObservable();
    }

    /* JADX INFO: renamed from: f4 */
    public void m175455f4(String str, boolean z) {
        this.f155208V.m132487l(j760.m140076a(str, Boolean.valueOf(z)));
    }

    /* JADX INFO: renamed from: g4 */
    public void m175456g4(boolean z) {
        this.f155209W.m132487l(Boolean.valueOf(z));
    }

    /* JADX INFO: renamed from: h4 */
    public C22306c<VisitorSetting> m175457h4(final String str, boolean z) {
        final JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(Constants.KEY_KEY, "visitorPermission");
            jSONObject.put("value", z ? "true" : "false");
        } catch (JSONException e) {
            CrashHelper.m81296c(e);
        }
        return scheduled("user/moment/visitor/setting/patch", -1, new v9j() { // from class: l.blb
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f76173a.m175444U3(str, jSONObject);
            }
        });
    }

    /* JADX INFO: renamed from: i4 */
    public void m175458i4(@NonNull VisitorFilterSettings visitorFilterSettings) {
        this.f155204R.put(visitorFilterSettings);
    }

    /* JADX INFO: renamed from: j4 */
    public boolean m175459j4() {
        return this.f155212Z.get().booleanValue();
    }

    /* JADX INFO: renamed from: k4 */
    public void m175460k4(boolean z) {
        this.f155212Z.put(Boolean.valueOf(z));
    }

    /* JADX INFO: renamed from: l4 */
    public void m175461l4() {
        if (this.f155212Z.get().booleanValue()) {
            this.f155211Y.put(Boolean.TRUE);
        }
    }

    /* JADX INFO: renamed from: m4 */
    public C22306c<roj0> m175462m4(final String str, final boolean z) {
        final StringBuilder sb = new StringBuilder("/");
        sb.append(CoreModule.m29931H().userId());
        sb.append("/visitor/hidden?otherUserId=");
        sb.append(str);
        if (z) {
            sb.append("&op=add");
        } else {
            sb.append("&op=remove");
        }
        return scheduled("visitors_set_hidden_state_" + str, -1, new v9j() { // from class: l.flb
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f98141a.m175446W3(sb, z, str);
            }
        });
    }

    /* JADX INFO: renamed from: n4 */
    public boolean m175463n4() {
        return (this.f155211Y.get().booleanValue() && this.f155212Z.get().booleanValue()) ? false : true;
    }

    /* JADX INFO: renamed from: o4 */
    public void m175464o4(String str, boolean z) {
        if (this.f155207U.m221519i()) {
            j760<List<Visitor>, String> j760VarM221515e = this.f155207U.m221515e();
            if (vwb.m200296J(j760VarM221515e.f116564a)) {
                return;
            }
            for (Visitor visitor : j760VarM221515e.f116564a) {
                if (TextUtils.equals(visitor.userId, str) && visitor.hidden != z) {
                    visitor.hidden = z;
                    this.f155207U.m132487l(j760VarM221515e);
                    return;
                }
            }
        }
    }

    /* JADX INFO: renamed from: p4 */
    public C22306c<j760<Links, VisitorInfo>> m175465p4(final String str, final boolean z) {
        return scheduled("un_privilege_visitor_" + str, 0, new v9j() { // from class: l.nlb
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f139514a.m175448Y3(str, z);
            }
        });
    }

    /* JADX INFO: renamed from: q4 */
    public C22306c<j760<Links, VisitorInfo>> m175466q4(boolean z) {
        return m175465p4("", z);
    }

    /* JADX INFO: renamed from: r4 */
    public void m175467r4(Envelope envelope) {
        if (!NullChecker.m81304b(((CommonData) envelope.getModuleData(CommonData.class)).users) || ((CommonData) envelope.getModuleData(CommonData.class)).users.size() <= 0) {
            return;
        }
        for (int i = 0; i < ((CommonData) envelope.getModuleData(CommonData.class)).users.size(); i++) {
            User user = ((CommonData) envelope.getModuleData(CommonData.class)).users.get(i);
            if (this.f155206T.get(user.f56011id) != null && NullChecker.m81303a(this.f155206T.get(user.f56011id))) {
                user.mergeData(this.f155206T.get(user.f56011id));
            }
            this.f155206T.put(user.f56011id, user);
        }
    }

    /* JADX INFO: renamed from: s4 */
    public C22306c<Boolean> m175468s4() {
        return this.f155209W.asObservable();
    }
}
