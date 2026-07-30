package p149l;

import android.app.Activity;
import android.text.TextUtils;
import com.p046p1.mobile.putong.api.api.AccountTempApi;
import com.p046p1.mobile.putong.api.api.Network;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.C4728a;
import com.p046p1.mobile.putong.core.api.C4732c;
import com.p046p1.mobile.putong.core.data.AdTrackInfoEnvelope;
import com.p046p1.mobile.putong.core.data.MigrateDlgConfigEnvelope;
import com.p046p1.mobile.putong.core.data.TTCMigrateGuideConfig;
import com.p046p1.mobile.putong.data.AccountErrorResponse;
import com.p046p1.mobile.putong.data.CommonData;
import com.p046p1.mobile.putong.data.Envelope;
import com.p046p1.mobile.putong.data.ForgetPasswordData;
import com.p046p1.mobile.putong.data.RememberUserInfo;
import com.p046p1.mobile.putong.data.SignOutParams;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.p049ab.IntlCountryCodeController;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashSet;
import org.json.JSONException;
import org.json.JSONObject;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes9.dex */
public class pv6 extends ax6 {

    /* JADX INFO: renamed from: R */
    public vqd0 f151417R;

    /* JADX INFO: renamed from: S */
    public zpd0 f151418S;

    /* JADX INFO: renamed from: T */
    public tpd0 f151419T;

    /* JADX INFO: renamed from: U */
    public hpd0 f151420U;

    /* JADX INFO: renamed from: V */
    public uqd0 f151421V;

    public pv6(C4732c c4732c) {
        super(c4732c);
        this.f151417R = new vqd0("account_firebaseid_post_set_v2", new HashSet());
        this.f151418S = new zpd0("next_show_migrate_guide_pop_time" + CoreModule.m29931H().userId(), 0L);
        this.f151419T = new tpd0("current_show_migrate_guide_pop_type" + CoreModule.m29931H().userId(), 0);
        this.f151420U = new hpd0("is_show_bind_phone_number_red_dot" + CoreModule.m29931H().userId(), Boolean.FALSE);
        this.f151421V = new uqd0("migration_dlg_config" + CoreModule.m29931H().userId(), MigrateDlgConfigEnvelope.new_().toJson());
    }

    /* JADX INFO: renamed from: A3 */
    public static C22306c<roj0> m171544A3(final String str, final Class<? extends Activity> cls) {
        return qib0.m174823m0(new v9j() { // from class: l.mv6
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return CoreModule.f17545c.f19627a0.m171564D3(str).compose(C4728a.m31252T2()).flatMap(new w9j() { // from class: l.fv6
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return qib0.m174809b1(cls, false, AccountTempApi.InactiveType.Pause, false);
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: g3 */
    public static /* synthetic */ C22306c m171551g3(String str, AccountErrorResponse accountErrorResponse) {
        SignOutParams signOutParams = new SignOutParams(false, AccountTempApi.InactiveType.DeleteImmediately, accountErrorResponse.hasContract, false);
        signOutParams.setInactiveCategory(str);
        return qib0.m174807a1(CoreModule.m29931H().mo28174uk(), signOutParams);
    }

    /* JADX INFO: renamed from: l3 */
    public static /* synthetic */ CommonData m171556l3(Envelope envelope) {
        return (CommonData) envelope.getModuleData(CommonData.class);
    }

    /* JADX INFO: renamed from: o3 */
    public static void m171559o3() {
        User userMe_;
        if (TextUtils.isEmpty(CoreModule.m29931H().userId()) || (userMe_ = CoreModule.m29932K().me_()) == null) {
            return;
        }
        RememberUserInfo rememberUserInfoMo108248b = qib0.f154697L.f17144b.mo108248b();
        RememberUserInfo rememberUserInfoMo108248b2 = qib0.f154697L.f17145c.mo108248b();
        if (rememberUserInfoMo108248b == null || CoreModule.f17545c.f19627a0.m171574x3(rememberUserInfoMo108248b)) {
            qib0.f154697L.f17144b.m205063p(userMe_.m60124fp().url, CoreModule.m29931H().getAuthData().mo108248b(), userMe_.name);
            qib0.f154697L.m29517b(userMe_.m60124fp().url, CoreModule.m29931H().getAuthData().mo108248b(), userMe_.name);
        } else if (rememberUserInfoMo108248b2 == null) {
            if (ura.m195053e().m195057d().mo33917rt()) {
                qib0.f154697L.f17145c.m205063p(userMe_.m60124fp().url, CoreModule.m29931H().getAuthData().mo108248b(), userMe_.name);
                qib0.f154697L.m29517b(userMe_.m60124fp().url, CoreModule.m29931H().getAuthData().mo108248b(), userMe_.name);
            } else {
                qib0.f154697L.f17144b.m205063p(userMe_.m60124fp().url, CoreModule.m29931H().getAuthData().mo108248b(), userMe_.name);
                qib0.f154697L.m29517b(userMe_.m60124fp().url, CoreModule.m29931H().getAuthData().mo108248b(), userMe_.name);
            }
        } else if (CoreModule.f17545c.f19627a0.m171574x3(rememberUserInfoMo108248b2)) {
            qib0.f154697L.f17145c.m205063p(userMe_.m60124fp().url, CoreModule.m29931H().getAuthData().mo108248b(), userMe_.name);
            qib0.f154697L.m29517b(userMe_.m60124fp().url, CoreModule.m29931H().getAuthData().mo108248b(), userMe_.name);
        } else {
            qib0.f154697L.f17144b.m108250i();
            qib0.f154697L.f17145c.m108250i();
        }
        ura.m195053e().m195057d().mo33671Db(false);
    }

    /* JADX INFO: renamed from: s3 */
    public static C22306c<roj0> m171560s3(final String str) {
        return qib0.m174823m0(new v9j() { // from class: l.cv6
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return CoreModule.f17545c.f19627a0.m171562B3(str).compose(C4728a.m31252T2()).flatMap(new w9j() { // from class: l.dv6
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        AccountErrorResponse accountErrorResponse = (AccountErrorResponse) obj;
                        return qib0.m174807a1((IntlCountryCodeController.m28113i() && accountErrorResponse.code == 200) ? CoreModule.m29931H().getSignOutJumpAct() : ura.m195053e().m195057d().mo33950xr(), new SignOutParams(false, AccountTempApi.InactiveType.DeleteImmediately, accountErrorResponse.hasContract, false));
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: t3 */
    public static C22306c<roj0> m171561t3(final String str, final String str2, final String str3) {
        return qib0.m174823m0(new v9j() { // from class: l.ov6
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                String str4 = str;
                return CoreModule.f17545c.f19627a0.m171563C3(str4, str2, str3).compose(C4728a.m31252T2()).flatMap(new w9j() { // from class: l.ev6
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return pv6.m171551g3(str4, (AccountErrorResponse) obj);
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: B3 */
    public C22306c<AccountErrorResponse> m171562B3(String str) {
        sv6 sv6Var = CoreModule.f17545c.f19630b0;
        String str2 = "";
        if (qib0.f154717f0 != 0) {
            str2 = qib0.f154717f0 + "";
        }
        return sv6Var.m186048d3(null, str, null, str2);
    }

    /* JADX INFO: renamed from: C3 */
    public C22306c<AccountErrorResponse> m171563C3(String str, String str2, String str3) {
        sv6 sv6Var = CoreModule.f17545c.f19630b0;
        String str4 = "";
        if (qib0.f154717f0 != 0) {
            str4 = qib0.f154717f0 + "";
        }
        return sv6Var.m186048d3(str, str2, str3, str4);
    }

    /* JADX INFO: renamed from: D3 */
    public C22306c<roj0> m171564D3(String str) {
        return CoreModule.f17545c.f19630b0.m186047c3(str);
    }

    /* JADX INFO: renamed from: E3 */
    public final void m171565E3() {
        HashSet<String> hashSet = this.f151417R.get();
        if (!NullChecker.m81303a(hashSet)) {
            hashSet = new HashSet<>();
        }
        if (hashSet.contains(CoreModule.m29931H().userId())) {
            return;
        }
        hashSet.add(CoreModule.m29931H().userId());
        this.f151417R.put(hashSet);
    }

    /* JADX INFO: renamed from: F3 */
    public boolean m171566F3(TTCMigrateGuideConfig tTCMigrateGuideConfig) {
        int i;
        return tTCMigrateGuideConfig != null && (i = tTCMigrateGuideConfig.dlgType) >= 1 && i <= 3 && (i != this.f151419T.get().intValue() || mqi0.m155944o() >= this.f151418S.get().longValue());
    }

    /* JADX INFO: renamed from: G3 */
    public C22306c<Boolean> m171567G3(String str) {
        return CoreModule.f17545c.f19630b0.m186049e3(str).compose(C4728a.m31252T2());
    }

    /* JADX INFO: renamed from: p3 */
    public C22306c<roj0> m171568p3(ForgetPasswordData forgetPasswordData) {
        return now(CoreModule.m29931H().mo28160Pd(forgetPasswordData).compose(C4728a.m31252T2()));
    }

    /* JADX INFO: renamed from: q3 */
    public void m171569q3() {
        zvf0.m220371D("e_intl_firebaseid_upload", "p_suggest_users_home_view", j760.m140076a("firebaseid_upload_state", "before_upload"), j760.m140076a("filter_by", ""), j760.m140076a("error", ""));
        HashSet<String> hashSet = this.f151417R.get();
        if (NullChecker.m81303a(hashSet) && hashSet.contains(CoreModule.m29931H().userId())) {
            zvf0.m220371D("e_intl_firebaseid_upload", "p_suggest_users_home_view", j760.m140076a("firebaseid_upload_state", "is_filtered"), j760.m140076a("filter_by", "local_hasUpload"), j760.m140076a("error", ""));
        } else {
            CoreModule.m29931H().mo28176y7().flatMap(new w9j() { // from class: l.gv6
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return this.f104534a.m171575y3((String) obj);
                }
            }).subscribe(mkd0.m154959K(new e30() { // from class: l.hv6
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f109623a.m171576z3((AdTrackInfoEnvelope) obj);
                }
            }, new e30() { // from class: l.iv6
                @Override // p149l.e30
                public final void call(Object obj) {
                    Throwable th = (Throwable) obj;
                    zvf0.m220371D("e_intl_firebaseid_upload", "p_suggest_users_home_view", j760.m140076a("firebaseid_upload_state", "upload_failed"), j760.m140076a("filter_by", ""), j760.m140076a("error", NullChecker.m81303a(th) ? th.getMessage() : "unknown"));
                }
            }, false));
        }
    }

    /* JADX INFO: renamed from: r3 */
    public C22306c<CommonData> m171570r3() {
        final JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("clientId", "100032");
        } catch (JSONException unused) {
        }
        return scheduled("getBindAccountStatus", -1, new v9j() { // from class: l.bv6
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return ia20.m135117a(new v9j() { // from class: l.jv6
                    @Override // p149l.v9j, java.util.concurrent.Callable
                    public final Object call() {
                        return C4728a.f19494P.auth().m185898q(C4728a.m31275a("/account/info")).m185893l(utc0.create(Network.JSON, jSONObject.toString())).m185883b();
                    }
                }).map(new w9j() { // from class: l.kv6
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return pv6.m171556l3((Envelope) obj);
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: u3 */
    public boolean m171571u3(User user) {
        return NullChecker.m81303a(user.settings) && !TextUtils.isEmpty(user.settings.email);
    }

    /* JADX INFO: renamed from: v3 */
    public boolean m171572v3(User user) {
        if (!NullChecker.m81303a(user.settings)) {
            return false;
        }
        if (m171573w3(user)) {
            return true;
        }
        return NullChecker.m81303a(user.settings.linkedPhoneNumber) && !TextUtils.isEmpty(user.settings.linkedPhoneNumber.number);
    }

    /* JADX INFO: renamed from: w3 */
    public boolean m171573w3(User user) {
        return NullChecker.m81303a(user.settings) && NullChecker.m81303a(user.settings.phoneNumber) && !TextUtils.isEmpty(user.settings.phoneNumber.number);
    }

    /* JADX INFO: renamed from: x3 */
    public boolean m171574x3(RememberUserInfo rememberUserInfo) {
        if (rememberUserInfo == null) {
            return false;
        }
        return rememberUserInfo.auth.userId.equals(CoreModule.m29931H().userId());
    }

    /* JADX INFO: renamed from: y3 */
    public final /* synthetic */ C22306c m171575y3(String str) {
        final JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("firebaseId", str);
        } catch (JSONException e) {
            CrashHelper.m81296c(e);
            e.printStackTrace();
        }
        return scheduled("account/firebaseid/post", -1, new v9j() { // from class: l.lv6
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return ia20.m135119c(new v9j() { // from class: l.nv6
                    @Override // p149l.v9j, java.util.concurrent.Callable
                    public final Object call() {
                        return C4728a.f19494P.auth().m185898q(C4728a.m31200G("/users/me/ad-track")).m185893l(utc0.create(Network.JSON, jSONObject.toString())).m185883b();
                    }
                }, AdTrackInfoEnvelope.JSON_ADAPTER);
            }
        });
    }

    /* JADX INFO: renamed from: z3 */
    public final /* synthetic */ void m171576z3(AdTrackInfoEnvelope adTrackInfoEnvelope) {
        if (TextUtils.isEmpty(adTrackInfoEnvelope.data.adTrackInfo.firebaseId)) {
            zvf0.m220371D("e_intl_firebaseid_upload", "p_suggest_users_home_view", j760.m140076a("firebaseid_upload_state", "upload_failed"), j760.m140076a("filter_by", ""), j760.m140076a("error", "adTrackInfo is empty"));
        } else {
            m171565E3();
            zvf0.m220371D("e_intl_firebaseid_upload", "p_suggest_users_home_view", j760.m140076a("firebaseid_upload_state", "upload_success"), j760.m140076a("filter_by", ""), j760.m140076a("error", ""));
        }
    }
}
