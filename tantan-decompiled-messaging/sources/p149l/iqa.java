package p149l;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.api.api.Network;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.C4728a;
import com.p046p1.mobile.putong.core.api.C4732c;
import com.p046p1.mobile.putong.core.data.CoreData;
import com.p046p1.mobile.putong.core.data.Reason;
import com.p046p1.mobile.putong.core.data.SelectionUser;
import com.p046p1.mobile.putong.core.data.SelectionUserInfo;
import com.p046p1.mobile.putong.core.data.UserAudits;
import com.p046p1.mobile.putong.data.Envelope;
import com.p046p1.mobile.putong.data.OMSTemplateModeType;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p133rx.C22306c;
import p133rx.subjects.C22392a;

/* JADX INFO: loaded from: classes9.dex */
public class iqa extends ax6 {

    /* JADX INFO: renamed from: R */
    public tpd0 f114437R;

    /* JADX INFO: renamed from: S */
    public zpd0 f114438S;

    /* JADX INFO: renamed from: T */
    public hpd0 f114439T;

    /* JADX INFO: renamed from: U */
    public tpd0 f114440U;

    /* JADX INFO: renamed from: V */
    public zpd0 f114441V;

    /* JADX INFO: renamed from: W */
    public zpd0 f114442W;

    /* JADX INFO: renamed from: X */
    public hpd0 f114443X;

    /* JADX INFO: renamed from: Y */
    public zpd0 f114444Y;

    /* JADX INFO: renamed from: Z */
    public String f114445Z;

    /* JADX INFO: renamed from: a0 */
    public uqd0 f114446a0;

    /* JADX INFO: renamed from: b0 */
    public Reason f114447b0;

    /* JADX INFO: renamed from: c0 */
    public String f114448c0;

    /* JADX INFO: renamed from: d0 */
    public boolean f114449d0;

    /* JADX INFO: renamed from: e0 */
    public C22392a<Long> f114450e0;

    public iqa(C4732c c4732c) {
        super(c4732c);
        this.f114437R = new tpd0("update_message_enter_num" + CoreModule.m29931H().userId(), 0);
        this.f114438S = new zpd0("last_update_message_enter_time" + CoreModule.m29931H().userId(), 0L);
        String str = "is_enter_daily_selection" + CoreModule.m29931H().userId();
        Boolean bool = Boolean.FALSE;
        this.f114439T = new hpd0(str, bool);
        this.f114440U = new tpd0("inserted_daily_selection_ad_card_count" + CoreModule.m29931H().userId(), 0);
        this.f114441V = new zpd0("inserted_daily_selection_ad_card_time" + CoreModule.m29931H().userId(), 0L);
        this.f114442W = new zpd0("profile_featured_pic_guide_sp" + CoreModule.m29931H().userId(), 0L);
        this.f114443X = new hpd0("has_ever_has_picks_entry" + CoreModule.m29931H().userId(), bool);
        this.f114444Y = new zpd0("profile_featured_suggest_time" + CoreModule.m29931H().userId(), 0L);
        this.f114445Z = "";
        this.f114446a0 = new uqd0("user_audits_type" + CoreModule.m29931H().userId(), "");
        this.f114448c0 = "";
        this.f114449d0 = false;
        this.f114450e0 = C22392a.m221512b();
    }

    /* JADX INFO: renamed from: q3 */
    public static boolean m137707q3() {
        return xma.m210043F3() || xma.m210049N3();
    }

    /* JADX INFO: renamed from: n3 */
    public String m137708n3() {
        User userM169520na = CoreModule.f17545c.f19639e0.m169520na();
        return (NullChecker.m81303a(this.f114447b0) && TextUtils.equals("40006", this.f114447b0.f20488id) && !TextUtils.isEmpty(userM169520na.description) && TextUtils.equals(userM169520na.description, this.f114448c0) && !TextUtils.isEmpty(CoreModule.f17545c.f19677q2.f114447b0.value)) ? CoreModule.f17545c.f19677q2.f114447b0.value : "";
    }

    /* JADX INFO: renamed from: o3 */
    public void m137709o3(final boolean z) {
        this.f72126Q.scheduled("selection-users", 0, new v9j() { // from class: l.vpa
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f182461a.m137713t3(z);
            }
        });
    }

    @Nullable
    /* JADX INFO: renamed from: p3 */
    public C22306c<roj0> m137710p3() {
        if (!ura.m195053e().m195057d().mo33716Lc()) {
            return C22306c.just(roj0.f160388a);
        }
        final User userM169520na = CoreModule.f17545c.f19639e0.m169520na();
        return this.f72126Q.scheduled("getUserAudits", 0, new v9j() { // from class: l.dqa
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f87399a.m137715v3(userM169520na);
            }
        }, false);
    }

    /* JADX INFO: renamed from: r3 */
    public final /* synthetic */ List m137711r3(boolean z, Envelope envelope) {
        List<SelectionUser> list = ((CoreData) envelope.getModuleData(CoreData.class)).selectionUsers;
        SelectionUserInfo selectionUserInfo = ((CoreData) envelope.getModuleData(CoreData.class)).selectionUserInfo;
        if (!vwb.m200296J(list)) {
            this.f114445Z = String.valueOf(list.get(0).f20499id);
        }
        if (NullChecker.m81303a(selectionUserInfo)) {
            this.f114444Y.put(Long.valueOf((long) selectionUserInfo.updateTime));
            this.f114450e0.m132487l(Long.valueOf((long) selectionUserInfo.updateTime));
            this.f114446a0.put(selectionUserInfo.auditStatus);
            if (z) {
                this.f72126Q.m31492w3(envelope, null);
                boolean zIsEmpty = TextUtils.isEmpty(this.f114445Z);
                C4732c c4732c = this.f72126Q;
                if (!zIsEmpty) {
                    c4732c.f19642f0.m33024kq(this.f114445Z, mqi0.m155944o());
                    return list;
                }
                c4732c.f19609U.m109085a(new d30() { // from class: l.eqa
                    @Override // p149l.d30
                    public final void call() {
                        CoreModule.f17545c.f19642f0.m32628Ef("fake_conversation_profile_featured");
                    }
                });
            }
        }
        return list;
    }

    /* JADX INFO: renamed from: s3 */
    public final /* synthetic */ void m137712s3(List list) {
        if (this.f114443X.get().booleanValue()) {
            return;
        }
        this.f114443X.put(Boolean.valueOf(!vwb.m200296J(list)));
        if (vwb.m200296J(list)) {
            return;
        }
        CoreModule.m29934N().mo60381p6(true);
    }

    /* JADX INFO: renamed from: t3 */
    public final /* synthetic */ C22306c m137713t3(final boolean z) {
        return ia20.m135121e(new v9j() { // from class: l.aqa
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4728a.f19494P.auth().m185898q(C4728a.m31200G("/selection-users?limit=1")).m185887f().m185883b();
            }
        }).map(new w9j() { // from class: l.bqa
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f76762a.m137711r3(z, (Envelope) obj);
            }
        }).compose(mkd0.m154951C()).doOnNext(new e30() { // from class: l.cqa
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f82049a.m137712s3((List) obj);
            }
        });
    }

    /* JADX INFO: renamed from: u3 */
    public final /* synthetic */ roj0 m137714u3(User user, Envelope envelope) {
        List<UserAudits> list = ((CoreData) envelope.getModuleData(CoreData.class)).userAudits;
        boolean zM200296J = vwb.m200296J(list);
        uqd0 uqd0Var = this.f114446a0;
        if (zM200296J) {
            uqd0Var.put("");
            this.f114447b0 = null;
            this.f114448c0 = "";
        } else {
            uqd0Var.put(list.get(0).audit);
            this.f114447b0 = list.get(0).reason;
            this.f114448c0 = user.description;
        }
        return roj0.f160388a;
    }

    /* JADX INFO: renamed from: v3 */
    public final /* synthetic */ C22306c m137715v3(final User user) {
        return ia20.m135121e(new v9j() { // from class: l.gqa
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4728a.f19494P.auth().m185898q(C4728a.m31200G("/user-audits/" + user.f56011id)).m185887f().m185883b();
            }
        }).observeOn(jo0.m142408a()).map(new w9j() { // from class: l.hqa
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f109049a.m137714u3(user, (Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: w3 */
    public C22306c<roj0> m137716w3(final String str) {
        return this.f72126Q.scheduled("selection-user-profile" + str, 0, new v9j() { // from class: l.wpa
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return ia20.m135117a(new v9j() { // from class: l.xpa
                    @Override // p149l.v9j, java.util.concurrent.Callable
                    public final Object call() {
                        return C4728a.f19494P.auth().m185898q(C4728a.m31200G("/selection-user-profile?type=" + str)).m185887f().m185883b();
                    }
                }).map(new w9j() { // from class: l.ypa
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return roj0.f160388a;
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: x3 */
    public void m137717x3(JSONArray jSONArray, String str) {
        final JSONObject jSONObject = new JSONObject();
        try {
            if (NullChecker.m81303a(jSONArray)) {
                jSONObject.put("ids", jSONArray);
                jSONObject.put(OMSTemplateModeType.page, str);
            }
        } catch (JSONException e) {
            CrashHelper.m81296c(e);
        }
        this.f72126Q.scheduled("selectionUserViews:" + jSONObject.toString(), -1, new v9j() { // from class: l.zpa
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return ia20.m135121e(new v9j() { // from class: l.fqa
                    @Override // p149l.v9j, java.util.concurrent.Callable
                    public final Object call() {
                        return C4728a.f19494P.auth().m185898q(C4728a.m31200G("/selection-user-views")).m185893l(utc0.create(Network.JSON, jSONObject.toString())).m185883b();
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: y3 */
    public void m137718y3() {
        if (ura.m195053e().m195057d().mo33716Lc()) {
            this.f114449d0 = m137707q3();
            m137710p3();
            m137709o3(false);
        } else if (CoreModule.m29932K().mo30742a().mo165308h()) {
            m137709o3(false);
        }
    }
}
