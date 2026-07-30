package p153l;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.clevertap.android.sdk.Constants;
import com.google.common.base.Optional;
import com.p051p1.mobile.putong.api.api.Network;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.C4879a;
import com.p051p1.mobile.putong.core.api.C4883c;
import com.p051p1.mobile.putong.core.data.CoreData;
import com.p051p1.mobile.putong.core.data.MyVisitorsShowType;
import com.p051p1.mobile.putong.core.data.VisitorFilterSettings;
import com.p051p1.mobile.putong.core.data.VisitorFilterType;
import com.p051p1.mobile.putong.core.data.VisitorSetting;
import com.p051p1.mobile.putong.core.data.VisitorSortType;
import com.p051p1.mobile.putong.core.data.VisitorsFilterSavedSettings;
import com.p051p1.mobile.putong.data.CommonData;
import com.p051p1.mobile.putong.data.Envelope;
import com.p051p1.mobile.putong.data.Links;
import com.p051p1.mobile.putong.data.ODiamondVisitorInfo;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.Visitor;
import com.p051p1.mobile.putong.data.VisitorInfo;
import com.p051p1.mobile.putong.data.tenum.TEnum;
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
import p137rx.C22421c;
import p137rx.subjects.C22507a;

/* JADX INFO: loaded from: classes9.dex */
public class enb extends dy6 {

    /* JADX INFO: renamed from: R */
    public final VisitorsFilterSavedSettings f94739R;

    /* JADX INFO: renamed from: S */
    public C22507a<VisitorSetting> f94740S;

    /* JADX INFO: renamed from: T */
    public final Map<String, User> f94741T;

    /* JADX INFO: renamed from: U */
    public C22507a<pf60<List<Visitor>, String>> f94742U;

    /* JADX INFO: renamed from: V */
    public C22507a<pf60<String, Boolean>> f94743V;

    /* JADX INFO: renamed from: W */
    public C22507a<Boolean> f94744W;

    /* JADX INFO: renamed from: X */
    public MyVisitorsShowType f94745X;

    /* JADX INFO: renamed from: Y */
    public final jxd0 f94746Y;

    /* JADX INFO: renamed from: Z */
    public final jxd0 f94747Z;

    /* JADX INFO: renamed from: a0 */
    public byd0 f94748a0;

    /* JADX INFO: renamed from: b0 */
    public vxd0 f94749b0;

    /* JADX INFO: renamed from: c0 */
    public final Set<String> f94750c0;

    public enb(C4883c c4883c) {
        super(c4883c);
        this.f94739R = new VisitorsFilterSavedSettings("visitors_filter_settings_" + CoreModule.m30929H().userId(), true, "putongPref");
        this.f94740S = C22507a.m222758b();
        this.f94741T = new HashMap();
        this.f94742U = C22507a.m222758b();
        this.f94743V = C22507a.m222758b();
        this.f94744W = C22507a.m222758b();
        this.f94745X = MyVisitorsShowType.get("unknown_");
        String str = "my_visitor_recover_visitor_footprint_dialog_shown_" + CoreModule.m30929H().userId();
        Boolean bool = Boolean.FALSE;
        this.f94746Y = new jxd0(str, bool);
        this.f94747Z = new jxd0("my_visitor_recover_visitor_footprint_dialog_shown_checkbox_state_" + CoreModule.m30929H().userId(), bool);
        this.f94748a0 = new byd0("my_visitor_message_hide_footprint_show_time_" + CoreModule.m30929H().userId(), 0L);
        this.f94749b0 = new vxd0("my_visitor_message_hide_footprint_show_count_" + CoreModule.m30929H().userId(), 0);
        this.f94750c0 = new HashSet();
    }

    /* JADX INFO: renamed from: A3 */
    public static String m121429A3(String str) {
        return C4879a.m32369w2("/" + str + "/moment-settings");
    }

    /* JADX INFO: renamed from: B3 */
    public static String m121430B3(String str, boolean z) {
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
        return C4879a.m32216J0("/unprivileged-visitors" + ((Object) sb));
    }

    /* JADX INFO: renamed from: l3 */
    public static /* synthetic */ Optional m121442l3(Envelope envelope) {
        VisitorInfo visitorInfo = ((CommonData) envelope.getModuleData(CommonData.class)).visitorInfo;
        if (NullChecker.m82486a(visitorInfo) && NullChecker.m82486a(visitorInfo.myVisitors)) {
            List<Visitor> list = visitorInfo.myVisitors.visitors;
            if (!jyb.m147479J(list)) {
                return Optional.m15467of(list.get(0));
            }
        }
        return Optional.absent();
    }

    /* JADX INFO: renamed from: z3 */
    public static String m121456z3(String str, String str2, String str3, boolean z) {
        StringBuilder sb = new StringBuilder();
        if (!TextUtils.isEmpty(str2)) {
            sb.append("&");
            sb.append(str2);
        }
        sb.append("&updateLastVisitTime=");
        sb.append(z);
        return C4879a.m32369w2("/" + str + "/moment-visitors?scene=" + str3 + "&with=" + C4879a.f20261y + ((Object) sb));
    }

    /* JADX INFO: renamed from: C3 */
    public void m121457C3(String str) {
        this.f91137Q.clearRequests("/moments/visitor/next" + str, 0);
    }

    /* JADX INFO: renamed from: D3 */
    public String m121458D3(@NonNull VisitorFilterSettings visitorFilterSettings) {
        StringBuilder sb = new StringBuilder();
        sb.append("limit=40&");
        if (visitorFilterSettings.distance >= afm0.m97512c() && visitorFilterSettings.distance <= afm0.m97511b()) {
            sb.append("filterDistance=");
            sb.append(visitorFilterSettings.distance);
            sb.append("&");
        }
        if (visitorFilterSettings.minAge >= afm0.m97514e() && visitorFilterSettings.minAge <= afm0.m97513d()) {
            sb.append("filterAgeMin=");
            sb.append(visitorFilterSettings.minAge);
            sb.append("&");
        }
        if (visitorFilterSettings.maxAge >= afm0.m97514e() && visitorFilterSettings.maxAge <= afm0.m97513d()) {
            int i = visitorFilterSettings.maxAge;
            if (i >= afm0.m97513d()) {
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
    public void m121459E3() {
        this.f94747Z.put(Boolean.TRUE);
        this.f94746Y.put(Boolean.FALSE);
    }

    /* JADX INFO: renamed from: F3 */
    public MyVisitorsShowType m121460F3() {
        return this.f94745X;
    }

    /* JADX INFO: renamed from: G3 */
    public C22421c<ODiamondVisitorInfo> m121461G3(String str) {
        final String str2 = "/me/visitor-odiamond/" + str;
        return scheduled("o_diamond_visitors_message_info_" + str, 0, new pcj() { // from class: l.xmb
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return qi20.m176654a(new pcj() { // from class: l.jmb
                    @Override // p153l.pcj, java.util.concurrent.Callable
                    public final Object call() {
                        return C4879a.f20236P.auth().m209043q(C4879a.m32369w2(str)).m209028b();
                    }
                }).map(new qcj() { // from class: l.kmb
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return ((CommonData) ((Envelope) obj).getModuleData(CommonData.class)).visitorInfo.oDiamondVisitor;
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: H3 */
    public C22421c<Optional<Visitor>> m121462H3(String str) {
        final String str2 = "/" + CoreModule.m30929H().userId() + "/my-visitors/other-info?otherUserId=" + str + "&scenes=chat";
        return scheduled("visitors_message_info_" + str, 0, new pcj() { // from class: l.wmb
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return qi20.m176654a(new pcj() { // from class: l.hmb
                    @Override // p153l.pcj, java.util.concurrent.Callable
                    public final Object call() {
                        return C4879a.f20236P.auth().m209043q(C4879a.m32369w2(str)).m209028b();
                    }
                }).map(new qcj() { // from class: l.imb
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return enb.m121442l3((Envelope) obj);
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: I3 */
    public User m121463I3(String str) {
        User userM116503Pa = this.f94741T.get(str);
        if (userM116503Pa == null) {
            userM116503Pa = CoreModule.f18264c.f20381e0.m116503Pa(str);
        }
        this.f94741T.put(str, userM116503Pa);
        return userM116503Pa;
    }

    /* JADX INFO: renamed from: J3 */
    public C22421c<VisitorSetting> m121464J3(final String str) {
        return scheduled("/moments/visitor/setting" + str, 0, new pcj() { // from class: l.qmb
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f158309a.m121468N3(str);
            }
        });
    }

    /* JADX INFO: renamed from: K3 */
    public VisitorFilterSettings m121465K3() {
        return this.f94739R.get();
    }

    /* JADX INFO: renamed from: L3 */
    public boolean m121466L3() {
        if (this.f94740S.m222765i()) {
            return this.f94740S.m222761e().visitorPermission;
        }
        return true;
    }

    /* JADX INFO: renamed from: M3 */
    public final /* synthetic */ VisitorSetting m121467M3(Envelope envelope) {
        m121498r4(envelope);
        CoreModule.m30930K().triggerCounterFromMemoryCache(envelope.counters);
        VisitorSetting visitorSetting = ((CoreData) envelope.getModuleData(CoreData.class)).visitorSetting;
        this.f94740S.m137019l(visitorSetting);
        return visitorSetting;
    }

    /* JADX INFO: renamed from: N3 */
    public final /* synthetic */ C22421c m121468N3(final String str) {
        return new ti20(new pcj() { // from class: l.cnb
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4879a.f20236P.auth().m209043q(enb.m121429A3(str)).m209032f().m209028b();
            }
        }).compose(C4879a.m32255T2()).map(new qcj() { // from class: l.dnb
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f89779a.m121467M3((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: O3 */
    public final /* synthetic */ pf60 m121469O3(Envelope envelope) {
        m121498r4(envelope);
        CoreModule.m30930K().triggerCounterFromMemoryCache(envelope.counters);
        return new pf60(envelope.pagination.links, ((CommonData) envelope.getModuleData(CommonData.class)).visitorInfo);
    }

    /* JADX INFO: renamed from: P3 */
    public final /* synthetic */ C22421c m121470P3(final String str) {
        return new ti20(new pcj() { // from class: l.nmb
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4879a.f20236P.auth().m209043q(str).m209032f().m209028b();
            }
        }).compose(C4879a.m32255T2()).map(new qcj() { // from class: l.omb
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f147918a.m121469O3((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: Q3 */
    public final /* synthetic */ Envelope m121471Q3(Envelope envelope) {
        if (!jyb.m147479J(((CommonData) envelope.getModuleData(CommonData.class)).users)) {
            this.f91137Q.m32496x3(envelope, null, false);
        }
        return envelope;
    }

    /* JADX INFO: renamed from: R3 */
    public final /* synthetic */ uxj0 m121472R3(boolean z, MyVisitorsShowType myVisitorsShowType, Envelope envelope) {
        m121498r4(envelope);
        VisitorInfo visitorInfo = ((CommonData) envelope.getModuleData(CommonData.class)).visitorInfo;
        ArrayList arrayList = new ArrayList();
        if (NullChecker.m82486a(visitorInfo) && NullChecker.m82486a(visitorInfo.myVisitors)) {
            if (z) {
                this.f94750c0.clear();
                for (Visitor visitor : visitorInfo.myVisitors.visitors) {
                    if (!this.f94750c0.contains(visitor.userId)) {
                        this.f94750c0.add(visitor.userId);
                        arrayList.add(visitor);
                    }
                }
            } else {
                if (this.f94742U.m222765i()) {
                    arrayList.addAll(this.f94742U.m222761e().f152156a);
                }
                for (Visitor visitor2 : visitorInfo.myVisitors.visitors) {
                    if (!this.f94750c0.contains(visitor2.userId)) {
                        this.f94750c0.add(visitor2.userId);
                        arrayList.add(visitor2);
                    }
                }
            }
            this.f94742U.m137019l(pf60.m172085a(arrayList, envelope.pagination.links.next));
            this.f94745X = myVisitorsShowType;
        }
        return uxj0.f181467a;
    }

    /* JADX INFO: renamed from: S3 */
    public final /* synthetic */ C22421c m121473S3(final StringBuilder sb, final boolean z, final MyVisitorsShowType myVisitorsShowType) {
        return qi20.m176658e(new pcj() { // from class: l.ymb
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4879a.f20236P.auth().m209043q(C4879a.m32369w2(sb.toString())).m209028b();
            }
        }).map(new qcj() { // from class: l.zmb
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f205054a.m121471Q3((Envelope) obj);
            }
        }).observeOn(fo0.m126432a()).map(new qcj() { // from class: l.anb
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f72333a.m121472R3(z, myVisitorsShowType, (Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: T3 */
    public final /* synthetic */ VisitorSetting m121474T3(Envelope envelope) {
        m121498r4(envelope);
        CoreModule.m30930K().triggerCounterFromMemoryCache(envelope.counters);
        VisitorSetting visitorSetting = ((CoreData) envelope.getModuleData(CoreData.class)).visitorSetting;
        this.f94740S.m137019l(visitorSetting);
        return visitorSetting;
    }

    /* JADX INFO: renamed from: U3 */
    public final /* synthetic */ C22421c m121475U3(String str, final JSONObject jSONObject) {
        final String strM121429A3 = m121429A3(str);
        return new ti20(new pcj() { // from class: l.rmb
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4879a.f20236P.auth().m209038l(z1d0.create(Network.JSON, jSONObject.toString())).m209043q(strM121429A3 + "?method=patch").m209028b();
            }
        }).compose(C4879a.m32255T2()).map(new qcj() { // from class: l.smb
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f169534a.m121474T3((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: V3 */
    public final /* synthetic */ uxj0 m121476V3(boolean z, String str, Envelope envelope) {
        if (z) {
            CoreModule.f18264c.f20297C0.m146428y4();
        }
        m121495o4(str, z);
        m121486f4(str, z);
        return uxj0.f181467a;
    }

    /* JADX INFO: renamed from: W3 */
    public final /* synthetic */ C22421c m121477W3(final StringBuilder sb, final boolean z, final String str) {
        return qi20.m176654a(new pcj() { // from class: l.umb
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4879a.f20236P.auth().m209043q(C4879a.m32369w2(sb.toString())).m209038l(z1d0.create(Network.JSON, "")).m209028b();
            }
        }).map(new qcj() { // from class: l.vmb
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f184683a.m121476V3(z, str, (Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: X3 */
    public final /* synthetic */ pf60 m121478X3(Envelope envelope) {
        m121498r4(envelope);
        return new pf60(envelope.pagination.links, ((CommonData) envelope.getModuleData(CommonData.class)).visitorInfo);
    }

    /* JADX INFO: renamed from: Y3 */
    public final /* synthetic */ C22421c m121479Y3(final String str, final boolean z) {
        return qi20.m176654a(new pcj() { // from class: l.lmb
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4879a.f20236P.auth().m209043q(enb.m121430B3(str, z)).m209032f().m209028b();
            }
        }).map(new qcj() { // from class: l.mmb
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f137548a.m121478X3((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: Z3 */
    public C22421c<pf60<Links, VisitorInfo>> m121480Z3(String str, final String str2) {
        return scheduled(str, 0, new pcj() { // from class: l.gmb
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f104962a.m121470P3(str2);
            }
        });
    }

    /* JADX INFO: renamed from: a4 */
    public C22421c<pf60<Links, VisitorInfo>> m121481a4(String str, String str2, String str3, boolean z) {
        if (TextUtils.isEmpty(str3)) {
            str3 = "limit=20";
        }
        return m121480Z3("/moments/visitor/prev" + str, m121456z3(str, str3, str2, z));
    }

    /* JADX INFO: renamed from: b4 */
    public C22421c<pf60<Links, VisitorInfo>> m121482b4(String str, Links links, String str2, boolean z) {
        return m121480Z3("/moments/visitor/next" + str, m121456z3(str, links.next, str2, z));
    }

    /* JADX INFO: renamed from: c4 */
    public C22421c<pf60<String, Boolean>> m121483c4() {
        return this.f94743V.asObservable();
    }

    /* JADX INFO: renamed from: d4 */
    public void m121484d4(final MyVisitorsShowType myVisitorsShowType, final boolean z, String str) {
        String strUserId = CoreModule.m30929H().userId();
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
        scheduled("my_visitors_list_" + strUserId, 0, new pcj() { // from class: l.fmb
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f99756a.m121473S3(sb, z, myVisitorsShowType);
            }
        });
    }

    /* JADX INFO: renamed from: e4 */
    public C22421c<pf60<List<Visitor>, String>> m121485e4() {
        return this.f94742U.asObservable();
    }

    /* JADX INFO: renamed from: f4 */
    public void m121486f4(String str, boolean z) {
        this.f94743V.m137019l(pf60.m172085a(str, Boolean.valueOf(z)));
    }

    /* JADX INFO: renamed from: g4 */
    public void m121487g4(boolean z) {
        this.f94744W.m137019l(Boolean.valueOf(z));
    }

    /* JADX INFO: renamed from: h4 */
    public C22421c<VisitorSetting> m121488h4(final String str, boolean z) {
        final JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(Constants.KEY_KEY, "visitorPermission");
            jSONObject.put("value", z ? "true" : "false");
        } catch (JSONException e) {
            CrashHelper.m82479c(e);
        }
        return scheduled("user/moment/visitor/setting/patch", -1, new pcj() { // from class: l.pmb
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f153130a.m121475U3(str, jSONObject);
            }
        });
    }

    /* JADX INFO: renamed from: i4 */
    public void m121489i4(@NonNull VisitorFilterSettings visitorFilterSettings) {
        this.f94739R.put(visitorFilterSettings);
    }

    /* JADX INFO: renamed from: j4 */
    public boolean m121490j4() {
        return this.f94747Z.get().booleanValue();
    }

    /* JADX INFO: renamed from: k4 */
    public void m121491k4(boolean z) {
        this.f94747Z.put(Boolean.valueOf(z));
    }

    /* JADX INFO: renamed from: l4 */
    public void m121492l4() {
        if (this.f94747Z.get().booleanValue()) {
            this.f94746Y.put(Boolean.TRUE);
        }
    }

    /* JADX INFO: renamed from: m4 */
    public C22421c<uxj0> m121493m4(final String str, final boolean z) {
        final StringBuilder sb = new StringBuilder("/");
        sb.append(CoreModule.m30929H().userId());
        sb.append("/visitor/hidden?otherUserId=");
        sb.append(str);
        if (z) {
            sb.append("&op=add");
        } else {
            sb.append("&op=remove");
        }
        return scheduled("visitors_set_hidden_state_" + str, -1, new pcj() { // from class: l.tmb
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f174904a.m121477W3(sb, z, str);
            }
        });
    }

    /* JADX INFO: renamed from: n4 */
    public boolean m121494n4() {
        return (this.f94746Y.get().booleanValue() && this.f94747Z.get().booleanValue()) ? false : true;
    }

    /* JADX INFO: renamed from: o4 */
    public void m121495o4(String str, boolean z) {
        if (this.f94742U.m222765i()) {
            pf60<List<Visitor>, String> pf60VarM222761e = this.f94742U.m222761e();
            if (jyb.m147479J(pf60VarM222761e.f152156a)) {
                return;
            }
            for (Visitor visitor : pf60VarM222761e.f152156a) {
                if (TextUtils.equals(visitor.userId, str) && visitor.hidden != z) {
                    visitor.hidden = z;
                    this.f94742U.m137019l(pf60VarM222761e);
                    return;
                }
            }
        }
    }

    /* JADX INFO: renamed from: p4 */
    public C22421c<pf60<Links, VisitorInfo>> m121496p4(final String str, final boolean z) {
        return scheduled("un_privilege_visitor_" + str, 0, new pcj() { // from class: l.bnb
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f77444a.m121479Y3(str, z);
            }
        });
    }

    /* JADX INFO: renamed from: q4 */
    public C22421c<pf60<Links, VisitorInfo>> m121497q4(boolean z) {
        return m121496p4("", z);
    }

    /* JADX INFO: renamed from: r4 */
    public void m121498r4(Envelope envelope) {
        if (!NullChecker.m82487b(((CommonData) envelope.getModuleData(CommonData.class)).users) || ((CommonData) envelope.getModuleData(CommonData.class)).users.size() <= 0) {
            return;
        }
        for (int i = 0; i < ((CommonData) envelope.getModuleData(CommonData.class)).users.size(); i++) {
            User user = ((CommonData) envelope.getModuleData(CommonData.class)).users.get(i);
            if (this.f94741T.get(user.f56859id) != null && NullChecker.m82486a(this.f94741T.get(user.f56859id))) {
                user.mergeData(this.f94741T.get(user.f56859id));
            }
            this.f94741T.put(user.f56859id, user);
        }
    }

    /* JADX INFO: renamed from: s4 */
    public C22421c<Boolean> m121499s4() {
        return this.f94744W.asObservable();
    }
}
