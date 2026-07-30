package p153l;

import android.text.TextUtils;
import android.util.Pair;
import com.p051p1.mobile.putong.api.api.Network;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.C4879a;
import com.p051p1.mobile.putong.core.api.C4883c;
import com.p051p1.mobile.putong.core.data.CoreData;
import com.p051p1.mobile.putong.core.data.Dimensions;
import com.p051p1.mobile.putong.core.data.IdealTypes;
import com.p051p1.mobile.putong.core.data.PrivateCustomCard;
import com.p051p1.mobile.putong.core.data.PrivateCustomResult;
import com.p051p1.mobile.putong.core.data.PrivateCustomSetting;
import com.p051p1.mobile.putong.data.CommonData;
import com.p051p1.mobile.putong.data.Envelope;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.remote_config.RemoteConfig;
import com.tantanapp.common.utils.ConnectivityReceiver;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p137rx.C22421c;
import p137rx.subjects.C22507a;
import p137rx.subjects.C22508b;

/* JADX INFO: loaded from: classes9.dex */
public class yna extends dy6 {

    /* JADX INFO: renamed from: R */
    public final byd0 f200803R;

    /* JADX INFO: renamed from: S */
    public final jxd0 f200804S;

    /* JADX INFO: renamed from: T */
    public final vxd0 f200805T;

    /* JADX INFO: renamed from: U */
    public final byd0 f200806U;

    /* JADX INFO: renamed from: V */
    public final byd0 f200807V;

    /* JADX INFO: renamed from: W */
    public boolean f200808W;

    /* JADX INFO: renamed from: X */
    public final C22507a<PrivateCustomSetting> f200809X;

    /* JADX INFO: renamed from: Y */
    public final C22508b<Boolean> f200810Y;

    /* JADX INFO: renamed from: Z */
    public final C22507a<Pair<List<C21645a>, Boolean>> f200811Z;

    /* JADX INFO: renamed from: a0 */
    public final C22508b<Throwable> f200812a0;

    /* JADX INFO: renamed from: b0 */
    public final HashSet<String> f200813b0;

    /* JADX INFO: renamed from: c0 */
    public final C22508b<uxj0> f200814c0;

    /* JADX INFO: renamed from: d0 */
    public PrivateCustomSetting f200815d0;

    /* JADX INFO: renamed from: l.yna$a */
    public static class C21645a {

        /* JADX INFO: renamed from: a */
        public User f200816a;

        /* JADX INFO: renamed from: b */
        public ArrayList<String> f200817b;
    }

    public yna(C4883c c4883c) {
        super(c4883c);
        this.f200808W = false;
        this.f200809X = C22507a.m222758b();
        this.f200810Y = C22508b.m222767b();
        this.f200811Z = C22507a.m222758b();
        this.f200812a0 = C22508b.m222767b();
        this.f200813b0 = new HashSet<>();
        this.f200814c0 = C22508b.m222767b();
        this.f200803R = new byd0("private_custom_tab_show_red_dot_time_" + CoreModule.m30929H().userId(), 0L);
        this.f200804S = new jxd0("private_custom_guide_dialog_shown_" + CoreModule.m30929H().userId(), Boolean.FALSE);
        this.f200805T = new vxd0("private_custom_tab_guide_tips_shown_count_" + CoreModule.m30929H().userId(), 0);
        this.f200806U = new byd0("private_custom_tab_first_auto_enter_custom_time_" + CoreModule.m30929H().userId(), 0L);
        this.f200807V = new byd0("has_private_custom_privilege_auto_enter_custom_time_" + CoreModule.m30929H().userId(), 0L);
    }

    /* JADX INFO: renamed from: A3 */
    public final int m216795A3() {
        try {
            String strM80485F = RemoteConfig.m80481x().m80485F("private_custom_config");
            if (TextUtils.isEmpty(strM80485F)) {
                return 3;
            }
            return new JSONObject(strM80485F).optInt("home_tab_bubble_times", 3);
        } catch (Exception unused) {
            return 3;
        }
    }

    /* JADX INFO: renamed from: B3 */
    public C22508b<uxj0> m216796B3() {
        return this.f200814c0;
    }

    /* JADX INFO: renamed from: C3 */
    public void m216797C3() {
        this.f200805T.put(Integer.valueOf(this.f200805T.get().intValue() + 1));
    }

    /* JADX INFO: renamed from: D3 */
    public final boolean m216798D3() {
        return this.f200804S.get().booleanValue();
    }

    /* JADX INFO: renamed from: E3 */
    public boolean m216799E3() {
        return this.f200808W;
    }

    /* JADX INFO: renamed from: F3 */
    public final /* synthetic */ PrivateCustomSetting m216800F3(Envelope envelope) {
        PrivateCustomSetting privateCustomSetting = ((CoreData) envelope.getModuleData(CoreData.class)).privateCustomSetting;
        boolean zM82486a = NullChecker.m82486a(privateCustomSetting);
        C22507a<PrivateCustomSetting> c22507a = this.f200809X;
        if (zM82486a) {
            c22507a.m137019l(privateCustomSetting);
            return privateCustomSetting;
        }
        if (c22507a.m222761e() == null) {
            this.f200809X.m137019l(PrivateCustomSetting.new_());
        }
        return privateCustomSetting;
    }

    /* JADX INFO: renamed from: G3 */
    public final /* synthetic */ void m216801G3(Throwable th) {
        if (this.f200809X.m222761e() == null) {
            this.f200809X.m137019l(PrivateCustomSetting.new_());
        }
    }

    /* JADX INFO: renamed from: H3 */
    public final /* synthetic */ C22421c m216802H3() {
        return qi20.m176654a(new pcj() { // from class: l.qna
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4879a.f20236P.auth().m209043q(C4879a.m32203G("/private-custom-setting")).m209032f().m209028b();
            }
        }).map(new qcj() { // from class: l.rna
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f163960a.m216800F3((Envelope) obj);
            }
        }).doOnError(new y20() { // from class: l.sna
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f169670a.m216801G3((Throwable) obj);
            }
        });
    }

    /* JADX INFO: renamed from: I3 */
    public final /* synthetic */ void m216803I3(HashMap map, List list, User user) {
        if (this.f200813b0.contains(user.f56859id)) {
            return;
        }
        this.f200813b0.add(user.f56859id);
        C21645a c21645a = new C21645a();
        c21645a.f200816a = user;
        c21645a.f200817b = (ArrayList) map.get(user.f56859id);
        list.add(c21645a);
    }

    /* JADX INFO: renamed from: J3 */
    public final /* synthetic */ uxj0 m216804J3(Envelope envelope) {
        int size;
        final ArrayList arrayList = new ArrayList();
        this.f200813b0.clear();
        final HashMap map = new HashMap();
        PrivateCustomResult privateCustomResult = ((CoreData) envelope.getModuleData(CoreData.class)).privateCustomResult;
        if (NullChecker.m82486a(privateCustomResult)) {
            jyb.m147537z(privateCustomResult.cards, new y20() { // from class: l.mna
                @Override // p153l.y20
                public final void call(Object obj) {
                    PrivateCustomCard privateCustomCard = (PrivateCustomCard) obj;
                    map.put(privateCustomCard.userId, new ArrayList(privateCustomCard.tags));
                }
            });
            size = privateCustomResult.mock ? privateCustomResult.cards.size() : privateCustomResult.total;
        } else {
            size = -1;
        }
        jyb.m147537z(((CommonData) envelope.getModuleData(CommonData.class)).users, new y20() { // from class: l.nna
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f142769a.m216803I3(map, arrayList, (User) obj);
            }
        });
        if (ConnectivityReceiver.m82469i()) {
            jyb.m147537z(jyb.m147474E(((CommonData) envelope.getModuleData(CommonData.class)).users), new y20() { // from class: l.ona
                @Override // p153l.y20
                public final void call(Object obj) {
                    uqb0.f180374G.m127162z0(((User) obj).m61308fp().profileMiddle());
                }
            });
        }
        if (jyb.m147479J(((CommonData) envelope.getModuleData(CommonData.class)).users)) {
            C22507a<Pair<List<C21645a>, Boolean>> c22507a = this.f200811Z;
            if (size > 0) {
                c22507a.m137019l(new Pair<>(arrayList, Boolean.TRUE));
            } else {
                c22507a.m137019l(new Pair<>(arrayList, Boolean.FALSE));
            }
        } else {
            this.f200811Z.m137019l(new Pair<>(arrayList, Boolean.FALSE));
        }
        return uxj0.f181467a;
    }

    /* JADX INFO: renamed from: K3 */
    public final /* synthetic */ C22421c m216805K3() {
        return new ti20(new pcj() { // from class: l.una
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4879a.f20236P.auth().m209043q(C4879a.m32203G("/private-custom-result")).m209028b();
            }
        }).map(new qcj() { // from class: l.vna
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f184846a.m216806L3((Envelope) obj);
            }
        }).compose(psd0.m173592C()).doOnError(new y20() { // from class: l.wna
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f189881a.m216807M3((Throwable) obj);
            }
        }).map(new qcj() { // from class: l.xna
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f195374a.m216804J3((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: L3 */
    public final /* synthetic */ Envelope m216806L3(Envelope envelope) {
        this.f91137Q.m32496x3(envelope, null, true);
        return envelope;
    }

    /* JADX INFO: renamed from: M3 */
    public final /* synthetic */ void m216807M3(Throwable th) {
        this.f200812a0.m137019l(th);
    }

    /* JADX INFO: renamed from: N3 */
    public final /* synthetic */ Envelope m216808N3(Envelope envelope) {
        m216825s3();
        this.f200810Y.m137019l(Boolean.TRUE);
        return envelope;
    }

    /* JADX INFO: renamed from: O3 */
    public final /* synthetic */ C22421c m216809O3(List list, List list2) {
        final JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        JSONObject jSONObject2 = new JSONObject();
        try {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Dimensions dimensions = (Dimensions) it.next();
                jSONObject2.put(dimensions.key, dimensions.value);
            }
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                jSONArray.put((String) it2.next());
            }
            jSONObject.put("idealTypes", jSONArray);
            jSONObject.put("dimension", jSONObject2);
        } catch (JSONException unused) {
        }
        return qi20.m176654a(new pcj() { // from class: l.kna
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4879a.f20236P.auth().m209043q(C4879a.m32203G("/private-custom-setting")).m209038l(z1d0.create(Network.JSON, jSONObject.toString())).m209028b();
            }
        }).map(new qcj() { // from class: l.lna
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f132750a.m216808N3((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: P3 */
    public C22421c<PrivateCustomSetting> m216810P3() {
        return this.f91137Q.scheduled("loadCustomSetting", 0, new pcj() { // from class: l.jna
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f121761a.m216802H3();
            }
        });
    }

    /* JADX INFO: renamed from: Q3 */
    public C22421c<uxj0> m216811Q3() {
        return this.f91137Q.scheduled("loadCustomizedResultDatas", 0, new pcj() { // from class: l.pna
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f153279a.m216805K3();
            }
        });
    }

    /* JADX INFO: renamed from: R3 */
    public boolean m216812R3() {
        return this.f200806U.get().longValue() == 0;
    }

    /* JADX INFO: renamed from: S3 */
    public boolean m216813S3() {
        return this.f200807V.get().longValue() == 0;
    }

    /* JADX INFO: renamed from: T3 */
    public boolean m216814T3() {
        return (m216824r3() || pzi0.m174439D(this.f200803R.get().longValue()) || !pzi0.m174465z(12, 0, 0)) ? false : true;
    }

    /* JADX INFO: renamed from: U3 */
    public void m216815U3() {
        this.f200814c0.m137019l(uxj0.f181467a);
    }

    /* JADX INFO: renamed from: V3 */
    public C22421c<Envelope> m216816V3(final List<String> list, final List<Dimensions> list2) {
        return this.f91137Q.scheduled("privateCustom/setting", -1, new pcj() { // from class: l.tna
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f175233a.m216809O3(list2, list);
            }
        });
    }

    /* JADX INFO: renamed from: W3 */
    public void m216817W3(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        Pair<List<C21645a>, Boolean> pairM222761e = this.f200811Z.m222761e();
        if (NullChecker.m82486a(pairM222761e)) {
            int size = ((List) pairM222761e.first).size();
            Iterator it = ((List) pairM222761e.first).iterator();
            while (it.hasNext()) {
                if (str.equals(((C21645a) it.next()).f200816a.f56859id)) {
                    it.remove();
                    this.f200811Z.m137019l(new Pair<>((List) pairM222761e.first, Boolean.valueOf(size + (-1) == 0)));
                    return;
                }
            }
        }
    }

    /* JADX INFO: renamed from: X3 */
    public void m216818X3() {
        this.f200804S.put(Boolean.TRUE);
    }

    /* JADX INFO: renamed from: Y3 */
    public void m216819Y3() {
        this.f200806U.put(Long.valueOf(pzi0.m174454o()));
    }

    /* JADX INFO: renamed from: Z3 */
    public void m216820Z3() {
        this.f200807V.put(Long.valueOf(pzi0.m174454o()));
    }

    /* JADX INFO: renamed from: a4 */
    public void m216821a4() {
        this.f200803R.put(Long.valueOf(pzi0.m174454o()));
    }

    /* JADX INFO: renamed from: p3 */
    public void m216822p3(List<IdealTypes> list, List<Dimensions> list2) {
        PrivateCustomSetting privateCustomSettingNew_ = PrivateCustomSetting.new_();
        this.f200815d0 = privateCustomSettingNew_;
        privateCustomSettingNew_.idealTypes = list;
        privateCustomSettingNew_.dimensions = list2;
    }

    /* JADX INFO: renamed from: q3 */
    public boolean m216823q3() {
        return joa.m146357G3() && !m216798D3();
    }

    /* JADX INFO: renamed from: r3 */
    public boolean m216824r3() {
        PrivateCustomSetting privateCustomSettingM216831y3 = m216831y3();
        if (this.f200805T.get().intValue() < m216795A3()) {
            return privateCustomSettingM216831y3 == null || !privateCustomSettingM216831y3.hasIdealTypesSelected();
        }
        return false;
    }

    /* JADX INFO: renamed from: s3 */
    public void m216825s3() {
        this.f200815d0 = null;
    }

    /* JADX INFO: renamed from: t3 */
    public C22421c<Pair<List<C21645a>, Boolean>> m216826t3() {
        return this.f200811Z;
    }

    /* JADX INFO: renamed from: u3 */
    public C22421c<Throwable> m216827u3() {
        return this.f200812a0;
    }

    /* JADX INFO: renamed from: v3 */
    public void m216828v3() {
        this.f200804S.put(Boolean.FALSE);
    }

    /* JADX INFO: renamed from: w3 */
    public PrivateCustomSetting m216829w3() {
        return this.f200815d0;
    }

    /* JADX INFO: renamed from: x3 */
    public C22421c<PrivateCustomSetting> m216830x3() {
        return this.f200809X.asObservable();
    }

    /* JADX INFO: renamed from: y3 */
    public PrivateCustomSetting m216831y3() {
        return this.f200809X.m222761e();
    }

    /* JADX INFO: renamed from: z3 */
    public C22421c<Boolean> m216832z3() {
        return this.f200810Y.asObservable();
    }
}
