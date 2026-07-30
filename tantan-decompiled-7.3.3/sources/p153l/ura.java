package p153l;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.api.api.Network;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.C4879a;
import com.p051p1.mobile.putong.core.api.C4883c;
import com.p051p1.mobile.putong.core.data.CoreData;
import com.p051p1.mobile.putong.core.data.Reason;
import com.p051p1.mobile.putong.core.data.SelectionUser;
import com.p051p1.mobile.putong.core.data.SelectionUserInfo;
import com.p051p1.mobile.putong.core.data.UserAudits;
import com.p051p1.mobile.putong.data.Envelope;
import com.p051p1.mobile.putong.data.OMSTemplateModeType;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p137rx.C22421c;
import p137rx.subjects.C22507a;

/* JADX INFO: loaded from: classes9.dex */
public class ura extends dy6 {

    /* JADX INFO: renamed from: R */
    public vxd0 f180578R;

    /* JADX INFO: renamed from: S */
    public byd0 f180579S;

    /* JADX INFO: renamed from: T */
    public jxd0 f180580T;

    /* JADX INFO: renamed from: U */
    public vxd0 f180581U;

    /* JADX INFO: renamed from: V */
    public byd0 f180582V;

    /* JADX INFO: renamed from: W */
    public byd0 f180583W;

    /* JADX INFO: renamed from: X */
    public jxd0 f180584X;

    /* JADX INFO: renamed from: Y */
    public byd0 f180585Y;

    /* JADX INFO: renamed from: Z */
    public String f180586Z;

    /* JADX INFO: renamed from: a0 */
    public wyd0 f180587a0;

    /* JADX INFO: renamed from: b0 */
    public Reason f180588b0;

    /* JADX INFO: renamed from: c0 */
    public String f180589c0;

    /* JADX INFO: renamed from: d0 */
    public boolean f180590d0;

    /* JADX INFO: renamed from: e0 */
    public C22507a<Long> f180591e0;

    public ura(C4883c c4883c) {
        super(c4883c);
        this.f180578R = new vxd0("update_message_enter_num" + CoreModule.m30929H().userId(), 0);
        this.f180579S = new byd0("last_update_message_enter_time" + CoreModule.m30929H().userId(), 0L);
        String str = "is_enter_daily_selection" + CoreModule.m30929H().userId();
        Boolean bool = Boolean.FALSE;
        this.f180580T = new jxd0(str, bool);
        this.f180581U = new vxd0("inserted_daily_selection_ad_card_count" + CoreModule.m30929H().userId(), 0);
        this.f180582V = new byd0("inserted_daily_selection_ad_card_time" + CoreModule.m30929H().userId(), 0L);
        this.f180583W = new byd0("profile_featured_pic_guide_sp" + CoreModule.m30929H().userId(), 0L);
        this.f180584X = new jxd0("has_ever_has_picks_entry" + CoreModule.m30929H().userId(), bool);
        this.f180585Y = new byd0("profile_featured_suggest_time" + CoreModule.m30929H().userId(), 0L);
        this.f180586Z = "";
        this.f180587a0 = new wyd0("user_audits_type" + CoreModule.m30929H().userId(), "");
        this.f180589c0 = "";
        this.f180590d0 = false;
        this.f180591e0 = C22507a.m222758b();
    }

    /* JADX INFO: renamed from: q3 */
    public static boolean m197488q3() {
        return joa.m146357G3() || joa.m146363O3();
    }

    /* JADX INFO: renamed from: n3 */
    public String m197489n3() {
        User userM116593na = CoreModule.f18264c.f20381e0.m116593na();
        return (NullChecker.m82486a(this.f180588b0) && TextUtils.equals("40006", this.f180588b0.f21230id) && !TextUtils.isEmpty(userM116593na.description) && TextUtils.equals(userM116593na.description, this.f180589c0) && !TextUtils.isEmpty(CoreModule.f18264c.f20419q2.f180588b0.value)) ? CoreModule.f18264c.f20419q2.f180588b0.value : "";
    }

    /* JADX INFO: renamed from: o3 */
    public void m197490o3(final boolean z) {
        this.f91137Q.scheduled("selection-users", 0, new pcj() { // from class: l.hra
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f111297a.m197494t3(z);
            }
        });
    }

    @Nullable
    /* JADX INFO: renamed from: p3 */
    public C22421c<uxj0> m197491p3() {
        if (!gta.m132210e().m132214d().mo34719Lc()) {
            return C22421c.just(uxj0.f181467a);
        }
        final User userM116593na = CoreModule.f18264c.f20381e0.m116593na();
        return this.f91137Q.scheduled("getUserAudits", 0, new pcj() { // from class: l.pra
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f153739a.m197496v3(userM116593na);
            }
        }, false);
    }

    /* JADX INFO: renamed from: r3 */
    public final /* synthetic */ List m197492r3(boolean z, Envelope envelope) {
        List<SelectionUser> list = ((CoreData) envelope.getModuleData(CoreData.class)).selectionUsers;
        SelectionUserInfo selectionUserInfo = ((CoreData) envelope.getModuleData(CoreData.class)).selectionUserInfo;
        if (!jyb.m147479J(list)) {
            this.f180586Z = String.valueOf(list.get(0).f21241id);
        }
        if (NullChecker.m82486a(selectionUserInfo)) {
            this.f180585Y.put(Long.valueOf((long) selectionUserInfo.updateTime));
            this.f180591e0.m137019l(Long.valueOf((long) selectionUserInfo.updateTime));
            this.f180587a0.put(selectionUserInfo.auditStatus);
            if (z) {
                this.f91137Q.m32495w3(envelope, null);
                boolean zIsEmpty = TextUtils.isEmpty(this.f180586Z);
                C4883c c4883c = this.f91137Q;
                if (!zIsEmpty) {
                    c4883c.f20384f0.m34027kq(this.f180586Z, pzi0.m174454o());
                    return list;
                }
                c4883c.f20351U.m128074a(new x20() { // from class: l.qra
                    @Override // p153l.x20
                    public final void call() {
                        CoreModule.f18264c.f20384f0.m33631Ef("fake_conversation_profile_featured");
                    }
                });
            }
        }
        return list;
    }

    /* JADX INFO: renamed from: s3 */
    public final /* synthetic */ void m197493s3(List list) {
        if (this.f180584X.get().booleanValue()) {
            return;
        }
        this.f180584X.put(Boolean.valueOf(!jyb.m147479J(list)));
        if (jyb.m147479J(list)) {
            return;
        }
        CoreModule.m30932N().mo61565p6(true);
    }

    /* JADX INFO: renamed from: t3 */
    public final /* synthetic */ C22421c m197494t3(final boolean z) {
        return qi20.m176658e(new pcj() { // from class: l.mra
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4879a.f20236P.auth().m209043q(C4879a.m32203G("/selection-users?limit=1")).m209032f().m209028b();
            }
        }).map(new qcj() { // from class: l.nra
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f143392a.m197492r3(z, (Envelope) obj);
            }
        }).compose(psd0.m173592C()).doOnNext(new y20() { // from class: l.ora
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f148682a.m197493s3((List) obj);
            }
        });
    }

    /* JADX INFO: renamed from: u3 */
    public final /* synthetic */ uxj0 m197495u3(User user, Envelope envelope) {
        List<UserAudits> list = ((CoreData) envelope.getModuleData(CoreData.class)).userAudits;
        boolean zM147479J = jyb.m147479J(list);
        wyd0 wyd0Var = this.f180587a0;
        if (zM147479J) {
            wyd0Var.put("");
            this.f180588b0 = null;
            this.f180589c0 = "";
        } else {
            wyd0Var.put(list.get(0).audit);
            this.f180588b0 = list.get(0).reason;
            this.f180589c0 = user.description;
        }
        return uxj0.f181467a;
    }

    /* JADX INFO: renamed from: v3 */
    public final /* synthetic */ C22421c m197496v3(final User user) {
        return qi20.m176658e(new pcj() { // from class: l.sra
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4879a.f20236P.auth().m209043q(C4879a.m32203G("/user-audits/" + user.f56859id)).m209032f().m209028b();
            }
        }).observeOn(fo0.m126432a()).map(new qcj() { // from class: l.tra
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f175834a.m197495u3(user, (Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: w3 */
    public C22421c<uxj0> m197497w3(final String str) {
        return this.f91137Q.scheduled("selection-user-profile" + str, 0, new pcj() { // from class: l.ira
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return qi20.m176654a(new pcj() { // from class: l.jra
                    @Override // p153l.pcj, java.util.concurrent.Callable
                    public final Object call() {
                        return C4879a.f20236P.auth().m209043q(C4879a.m32203G("/selection-user-profile?type=" + str)).m209032f().m209028b();
                    }
                }).map(new qcj() { // from class: l.kra
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return uxj0.f181467a;
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: x3 */
    public void m197498x3(JSONArray jSONArray, String str) {
        final JSONObject jSONObject = new JSONObject();
        try {
            if (NullChecker.m82486a(jSONArray)) {
                jSONObject.put("ids", jSONArray);
                jSONObject.put(OMSTemplateModeType.page, str);
            }
        } catch (JSONException e) {
            CrashHelper.m82479c(e);
        }
        this.f91137Q.scheduled("selectionUserViews:" + jSONObject.toString(), -1, new pcj() { // from class: l.lra
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return qi20.m176658e(new pcj() { // from class: l.rra
                    @Override // p153l.pcj, java.util.concurrent.Callable
                    public final Object call() {
                        return C4879a.f20236P.auth().m209043q(C4879a.m32203G("/selection-user-views")).m209038l(z1d0.create(Network.JSON, jSONObject.toString())).m209028b();
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: y3 */
    public void m197499y3() {
        if (gta.m132210e().m132214d().mo34719Lc()) {
            this.f180590d0 = m197488q3();
            m197491p3();
            m197490o3(false);
        } else if (CoreModule.m30930K().mo31745a().mo192251h()) {
            m197490o3(false);
        }
    }
}
