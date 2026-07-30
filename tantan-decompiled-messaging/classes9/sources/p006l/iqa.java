package p006l;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.api.api.Network;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.api.C0154a;
import com.p000p1.mobile.putong.core.api.C0158c;
import com.p1.mobile.putong.core.data.CoreData;
import com.p1.mobile.putong.core.data.Reason;
import com.p1.mobile.putong.core.data.SelectionUser;
import com.p1.mobile.putong.core.data.SelectionUserInfo;
import com.p1.mobile.putong.core.data.UserAudits;
import com.p1.mobile.putong.data.Envelope;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import l.d30;
import l.e30;
import l.hpd0;
import l.jo0;
import l.mkd0;
import l.mqi0;
import l.roj0;
import l.tpd0;
import l.uqd0;
import l.utc0;
import l.v9j;
import l.vwb;
import l.w9j;
import l.zpd0;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import rx.c;
import rx.subjects.a;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class iqa extends ax6 {

    /* JADX INFO: renamed from: R */
    public tpd0 f14687R;

    /* JADX INFO: renamed from: S */
    public zpd0 f14688S;

    /* JADX INFO: renamed from: T */
    public hpd0 f14689T;

    /* JADX INFO: renamed from: U */
    public tpd0 f14690U;

    /* JADX INFO: renamed from: V */
    public zpd0 f14691V;

    /* JADX INFO: renamed from: W */
    public zpd0 f14692W;

    /* JADX INFO: renamed from: X */
    public hpd0 f14693X;

    /* JADX INFO: renamed from: Y */
    public zpd0 f14694Y;

    /* JADX INFO: renamed from: Z */
    public String f14695Z;

    /* JADX INFO: renamed from: a0 */
    public uqd0 f14696a0;

    /* JADX INFO: renamed from: b0 */
    public Reason f14697b0;

    /* JADX INFO: renamed from: c0 */
    public String f14698c0;

    /* JADX INFO: renamed from: d0 */
    public boolean f14699d0;

    /* JADX INFO: renamed from: e0 */
    public a<Long> f14700e0;

    public iqa(C0158c c0158c) {
        super(c0158c);
        this.f14687R = new tpd0("update_message_enter_num" + CoreModule.m1850H().userId(), 0);
        this.f14688S = new zpd0("last_update_message_enter_time" + CoreModule.m1850H().userId(), 0L);
        String str = "is_enter_daily_selection" + CoreModule.m1850H().userId();
        Boolean bool = Boolean.FALSE;
        this.f14689T = new hpd0(str, bool);
        this.f14690U = new tpd0("inserted_daily_selection_ad_card_count" + CoreModule.m1850H().userId(), 0);
        this.f14691V = new zpd0("inserted_daily_selection_ad_card_time" + CoreModule.m1850H().userId(), 0L);
        this.f14692W = new zpd0("profile_featured_pic_guide_sp" + CoreModule.m1850H().userId(), 0L);
        this.f14693X = new hpd0("has_ever_has_picks_entry" + CoreModule.m1850H().userId(), bool);
        this.f14694Y = new zpd0("profile_featured_suggest_time" + CoreModule.m1850H().userId(), 0L);
        this.f14695Z = "";
        this.f14696a0 = new uqd0("user_audits_type" + CoreModule.m1850H().userId(), "");
        this.f14698c0 = "";
        this.f14699d0 = false;
        this.f14700e0 = a.b();
    }

    /* JADX INFO: renamed from: q3 */
    public static boolean m16894q3() {
        return xma.m27351F3() || xma.m27357N3();
    }

    /* JADX INFO: renamed from: n3 */
    public String m16895n3() {
        User userM21483na = CoreModule.f1534c.f3628e0.m21483na();
        return (NullChecker.a(this.f14697b0) && TextUtils.equals("40006", this.f14697b0.id) && !TextUtils.isEmpty(userM21483na.description) && TextUtils.equals(userM21483na.description, this.f14698c0) && !TextUtils.isEmpty(CoreModule.f1534c.f3666q2.f14697b0.value)) ? CoreModule.f1534c.f3666q2.f14697b0.value : "";
    }

    /* JADX INFO: renamed from: o3 */
    public void m16896o3(final boolean z) {
        this.f8580Q.scheduled("selection-users", 0, new v9j() { // from class: l.vpa
            public final Object call() {
                return this.f24410a.m16900t3(z);
            }
        });
    }

    @Nullable
    /* JADX INFO: renamed from: p3 */
    public c<roj0> m16897p3() {
        if (!ura.m25555e().m25559d().m5653Lc()) {
            return c.just(roj0.a);
        }
        final User userM21483na = CoreModule.f1534c.f3628e0.m21483na();
        return this.f8580Q.scheduled("getUserAudits", 0, new v9j() { // from class: l.dqa
            public final Object call() {
                return this.f10525a.m16902v3(userM21483na);
            }
        }, false);
    }

    /* JADX INFO: renamed from: r3 */
    public final /* synthetic */ List m16898r3(boolean z, Envelope envelope) {
        List list = envelope.getModuleData(CoreData.class).selectionUsers;
        SelectionUserInfo selectionUserInfo = envelope.getModuleData(CoreData.class).selectionUserInfo;
        if (!vwb.J(list)) {
            this.f14695Z = String.valueOf(((SelectionUser) list.get(0)).id);
        }
        if (NullChecker.a(selectionUserInfo)) {
            this.f14694Y.put(Long.valueOf((long) selectionUserInfo.updateTime));
            this.f14700e0.onNext(Long.valueOf((long) selectionUserInfo.updateTime));
            this.f14696a0.put(selectionUserInfo.auditStatus);
            if (z) {
                this.f8580Q.m3422w3(envelope, null);
                boolean zIsEmpty = TextUtils.isEmpty(this.f14695Z);
                C0158c c0158c = this.f8580Q;
                if (!zIsEmpty) {
                    c0158c.f3631f0.m4954kq(this.f14695Z, mqi0.o());
                    return list;
                }
                c0158c.f3598U.m13685a(new d30() { // from class: l.eqa
                    public final void call() {
                        CoreModule.f1534c.f3631f0.m4558Ef("fake_conversation_profile_featured");
                    }
                });
            }
        }
        return list;
    }

    /* JADX INFO: renamed from: s3 */
    public final /* synthetic */ void m16899s3(List list) {
        if (((Boolean) this.f14693X.get()).booleanValue()) {
            return;
        }
        this.f14693X.put(Boolean.valueOf(!vwb.J(list)));
        if (vwb.J(list)) {
            return;
        }
        CoreModule.m1853N().p6(true);
    }

    /* JADX INFO: renamed from: t3 */
    public final /* synthetic */ c m16900t3(final boolean z) {
        return ia20.m16571e(new v9j() { // from class: l.aqa
            public final Object call() {
                return C0154a.f3483P.auth().q(C0154a.m3130G("/selection-users?limit=1")).f().b();
            }
        }).map(new w9j() { // from class: l.bqa
            public final Object call(Object obj) {
                return this.f9033a.m16898r3(z, (Envelope) obj);
            }
        }).compose(mkd0.C()).doOnNext(new e30() { // from class: l.cqa
            public final void call(Object obj) {
                this.f9791a.m16899s3((List) obj);
            }
        });
    }

    /* JADX INFO: renamed from: u3 */
    public final /* synthetic */ roj0 m16901u3(User user, Envelope envelope) {
        List list = envelope.getModuleData(CoreData.class).userAudits;
        boolean zJ = vwb.J(list);
        uqd0 uqd0Var = this.f14696a0;
        if (zJ) {
            uqd0Var.put("");
            this.f14697b0 = null;
            this.f14698c0 = "";
        } else {
            uqd0Var.put(((UserAudits) list.get(0)).audit);
            this.f14697b0 = ((UserAudits) list.get(0)).reason;
            this.f14698c0 = user.description;
        }
        return roj0.a;
    }

    /* JADX INFO: renamed from: v3 */
    public final /* synthetic */ c m16902v3(final User user) {
        return ia20.m16571e(new v9j() { // from class: l.gqa
            public final Object call() {
                return C0154a.f3483P.auth().q(C0154a.m3130G("/user-audits/" + ((DbObject) user).id)).f().b();
            }
        }).observeOn(jo0.a()).map(new w9j() { // from class: l.hqa
            public final Object call(Object obj) {
                return this.f14018a.m16901u3(user, (Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: w3 */
    public c<roj0> m16903w3(final String str) {
        return this.f8580Q.scheduled("selection-user-profile" + str, 0, new v9j() { // from class: l.wpa
            public final Object call() {
                return ia20.m16567a(new v9j() { // from class: l.xpa
                    public final Object call() {
                        return C0154a.f3483P.auth().q(C0154a.m3130G("/selection-user-profile?type=" + str)).f().b();
                    }
                }).map(new w9j() { // from class: l.ypa
                    public final Object call(Object obj) {
                        return roj0.a;
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: x3 */
    public void m16904x3(JSONArray jSONArray, String str) {
        final JSONObject jSONObject = new JSONObject();
        try {
            if (NullChecker.a(jSONArray)) {
                jSONObject.put("ids", jSONArray);
                jSONObject.put("page", str);
            }
        } catch (JSONException e) {
            CrashHelper.c(e);
        }
        this.f8580Q.scheduled("selectionUserViews:" + jSONObject.toString(), -1, new v9j() { // from class: l.zpa
            public final Object call() {
                return ia20.m16571e(new v9j() { // from class: l.fqa
                    public final Object call() {
                        return C0154a.f3483P.auth().q(C0154a.m3130G("/selection-user-views")).l(utc0.create(Network.JSON, jSONObject.toString())).b();
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: y3 */
    public void m16905y3() {
        if (ura.m25555e().m25559d().m5653Lc()) {
            this.f14699d0 = m16894q3();
            m16897p3();
            m16896o3(false);
        } else if (CoreModule.m1851K().a().h()) {
            m16896o3(false);
        }
    }
}
