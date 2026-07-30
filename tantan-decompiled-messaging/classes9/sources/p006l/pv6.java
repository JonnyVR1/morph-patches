package p006l;

import android.app.Activity;
import android.text.TextUtils;
import com.p000p1.mobile.putong.api.api.AccountTempApi;
import com.p000p1.mobile.putong.api.api.Network;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.api.C0154a;
import com.p000p1.mobile.putong.core.api.C0158c;
import com.p000p1.mobile.putong.p001ab.IntlCountryCodeController;
import com.p1.mobile.putong.core.data.AdTrackInfoEnvelope;
import com.p1.mobile.putong.core.data.MigrateDlgConfigEnvelope;
import com.p1.mobile.putong.core.data.TTCMigrateGuideConfig;
import com.p1.mobile.putong.data.AccountErrorResponse;
import com.p1.mobile.putong.data.AuthData;
import com.p1.mobile.putong.data.CommonData;
import com.p1.mobile.putong.data.Envelope;
import com.p1.mobile.putong.data.ForgetPasswordData;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.RememberUserInfo;
import com.p1.mobile.putong.data.SignOutParams;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashSet;
import l.e30;
import l.hpd0;
import l.j760;
import l.mkd0;
import l.mqi0;
import l.roj0;
import l.tpd0;
import l.uqd0;
import l.utc0;
import l.v9j;
import l.vqd0;
import l.w9j;
import l.zpd0;
import l.zvf0;
import org.json.JSONException;
import org.json.JSONObject;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class pv6 extends ax6 {

    /* JADX INFO: renamed from: R */
    public vqd0 f19366R;

    /* JADX INFO: renamed from: S */
    public zpd0 f19367S;

    /* JADX INFO: renamed from: T */
    public tpd0 f19368T;

    /* JADX INFO: renamed from: U */
    public hpd0 f19369U;

    /* JADX INFO: renamed from: V */
    public uqd0 f19370V;

    public pv6(C0158c c0158c) {
        super(c0158c);
        this.f19366R = new vqd0("account_firebaseid_post_set_v2", new HashSet());
        this.f19367S = new zpd0("next_show_migrate_guide_pop_time" + CoreModule.m1850H().userId(), 0L);
        this.f19368T = new tpd0("current_show_migrate_guide_pop_type" + CoreModule.m1850H().userId(), 0);
        this.f19369U = new hpd0("is_show_bind_phone_number_red_dot" + CoreModule.m1850H().userId(), Boolean.FALSE);
        this.f19370V = new uqd0("migration_dlg_config" + CoreModule.m1850H().userId(), MigrateDlgConfigEnvelope.new_().toJson());
    }

    /* JADX INFO: renamed from: A3 */
    public static c<roj0> m21736A3(final String str, final Class<? extends Activity> cls) {
        return qib0.m22167m0(new v9j() { // from class: l.mv6
            public final Object call() {
                return CoreModule.f1534c.f3616a0.m21756D3(str).compose(C0154a.m3182T2()).flatMap(new w9j() { // from class: l.fv6
                    public final Object call(Object obj) {
                        return qib0.m22153b1(cls, false, AccountTempApi.InactiveType.Pause, false);
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: g3 */
    public static /* synthetic */ c m21743g3(String str, AccountErrorResponse accountErrorResponse) {
        SignOutParams signOutParams = new SignOutParams(false, AccountTempApi.InactiveType.DeleteImmediately, accountErrorResponse.hasContract, false);
        signOutParams.setInactiveCategory(str);
        return qib0.m22151a1(CoreModule.m1850H().mo69uk(), signOutParams);
    }

    /* JADX INFO: renamed from: o3 */
    public static void m21751o3() {
        User userMe_;
        if (TextUtils.isEmpty(CoreModule.m1850H().userId()) || (userMe_ = CoreModule.m1851K().me_()) == null) {
            return;
        }
        RememberUserInfo rememberUserInfo = (RememberUserInfo) qib0.f19788L.f1133b.b();
        RememberUserInfo rememberUserInfo2 = (RememberUserInfo) qib0.f19788L.f1134c.b();
        if (rememberUserInfo == null || CoreModule.f1534c.f3616a0.m21766x3(rememberUserInfo)) {
            qib0.f19788L.f1133b.p(((Media) userMe_.fp()).url, (AuthData) CoreModule.m1850H().getAuthData().b(), userMe_.name);
            qib0.f19788L.m1423b(((Media) userMe_.fp()).url, (AuthData) CoreModule.m1850H().getAuthData().b(), userMe_.name);
        } else if (rememberUserInfo2 == null) {
            if (ura.m25555e().m25559d().m5854rt()) {
                qib0.f19788L.f1134c.p(((Media) userMe_.fp()).url, (AuthData) CoreModule.m1850H().getAuthData().b(), userMe_.name);
                qib0.f19788L.m1423b(((Media) userMe_.fp()).url, (AuthData) CoreModule.m1850H().getAuthData().b(), userMe_.name);
            } else {
                qib0.f19788L.f1133b.p(((Media) userMe_.fp()).url, (AuthData) CoreModule.m1850H().getAuthData().b(), userMe_.name);
                qib0.f19788L.m1423b(((Media) userMe_.fp()).url, (AuthData) CoreModule.m1850H().getAuthData().b(), userMe_.name);
            }
        } else if (CoreModule.f1534c.f3616a0.m21766x3(rememberUserInfo2)) {
            qib0.f19788L.f1134c.p(((Media) userMe_.fp()).url, (AuthData) CoreModule.m1850H().getAuthData().b(), userMe_.name);
            qib0.f19788L.m1423b(((Media) userMe_.fp()).url, (AuthData) CoreModule.m1850H().getAuthData().b(), userMe_.name);
        } else {
            qib0.f19788L.f1133b.i();
            qib0.f19788L.f1134c.i();
        }
        ura.m25555e().m25559d().m5608Db(false);
    }

    /* JADX INFO: renamed from: s3 */
    public static c<roj0> m21752s3(final String str) {
        return qib0.m22167m0(new v9j() { // from class: l.cv6
            public final Object call() {
                return CoreModule.f1534c.f3616a0.m21754B3(str).compose(C0154a.m3182T2()).flatMap(new w9j() { // from class: l.dv6
                    public final Object call(Object obj) {
                        AccountErrorResponse accountErrorResponse = (AccountErrorResponse) obj;
                        return qib0.m22151a1((IntlCountryCodeController.m8i() && accountErrorResponse.code == 200) ? CoreModule.m1850H().getSignOutJumpAct() : ura.m25555e().m25559d().m5887xr(), new SignOutParams(false, AccountTempApi.InactiveType.DeleteImmediately, accountErrorResponse.hasContract, false));
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: t3 */
    public static c<roj0> m21753t3(final String str, final String str2, final String str3) {
        return qib0.m22167m0(new v9j() { // from class: l.ov6
            public final Object call() {
                String str4 = str;
                return CoreModule.f1534c.f3616a0.m21755C3(str4, str2, str3).compose(C0154a.m3182T2()).flatMap(new w9j() { // from class: l.ev6
                    public final Object call(Object obj) {
                        return pv6.m21743g3(str4, (AccountErrorResponse) obj);
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: B3 */
    public c<AccountErrorResponse> m21754B3(String str) {
        sv6 sv6Var = CoreModule.f1534c.f3619b0;
        String str2 = "";
        if (qib0.f19808f0 != 0) {
            str2 = qib0.f19808f0 + "";
        }
        return sv6Var.m24211d3(null, str, null, str2);
    }

    /* JADX INFO: renamed from: C3 */
    public c<AccountErrorResponse> m21755C3(String str, String str2, String str3) {
        sv6 sv6Var = CoreModule.f1534c.f3619b0;
        String str4 = "";
        if (qib0.f19808f0 != 0) {
            str4 = qib0.f19808f0 + "";
        }
        return sv6Var.m24211d3(str, str2, str3, str4);
    }

    /* JADX INFO: renamed from: D3 */
    public c<roj0> m21756D3(String str) {
        return CoreModule.f1534c.f3619b0.m24210c3(str);
    }

    /* JADX INFO: renamed from: E3 */
    public final void m21757E3() {
        HashSet hashSet = (HashSet) this.f19366R.get();
        if (!NullChecker.a(hashSet)) {
            hashSet = new HashSet();
        }
        if (hashSet.contains(CoreModule.m1850H().userId())) {
            return;
        }
        hashSet.add(CoreModule.m1850H().userId());
        this.f19366R.put(hashSet);
    }

    /* JADX INFO: renamed from: F3 */
    public boolean m21758F3(TTCMigrateGuideConfig tTCMigrateGuideConfig) {
        int i;
        return tTCMigrateGuideConfig != null && (i = tTCMigrateGuideConfig.dlgType) >= 1 && i <= 3 && (i != ((Integer) this.f19368T.get()).intValue() || mqi0.o() >= ((Long) this.f19367S.get()).longValue());
    }

    /* JADX INFO: renamed from: G3 */
    public c<Boolean> m21759G3(String str) {
        return CoreModule.f1534c.f3619b0.m24212e3(str).compose(C0154a.m3182T2());
    }

    /* JADX INFO: renamed from: p3 */
    public c<roj0> m21760p3(ForgetPasswordData forgetPasswordData) {
        return now(CoreModule.m1850H().mo55Pd(forgetPasswordData).compose(C0154a.m3182T2()));
    }

    /* JADX INFO: renamed from: q3 */
    public void m21761q3() {
        zvf0.D("e_intl_firebaseid_upload", "p_suggest_users_home_view", new j760[]{j760.a("firebaseid_upload_state", "before_upload"), j760.a("filter_by", ""), j760.a("error", "")});
        HashSet hashSet = (HashSet) this.f19366R.get();
        if (NullChecker.a(hashSet) && hashSet.contains(CoreModule.m1850H().userId())) {
            zvf0.D("e_intl_firebaseid_upload", "p_suggest_users_home_view", new j760[]{j760.a("firebaseid_upload_state", "is_filtered"), j760.a("filter_by", "local_hasUpload"), j760.a("error", "")});
        } else {
            CoreModule.m1850H().mo71y7().flatMap(new w9j() { // from class: l.gv6
                public final Object call(Object obj) {
                    return this.f13518a.m21767y3((String) obj);
                }
            }).subscribe(mkd0.K(new e30() { // from class: l.hv6
                public final void call(Object obj) {
                    this.f14092a.m21768z3((AdTrackInfoEnvelope) obj);
                }
            }, new e30() { // from class: l.iv6
                public final void call(Object obj) {
                    Throwable th = (Throwable) obj;
                    zvf0.D("e_intl_firebaseid_upload", "p_suggest_users_home_view", new j760[]{j760.a("firebaseid_upload_state", "upload_failed"), j760.a("filter_by", ""), j760.a("error", NullChecker.a(th) ? th.getMessage() : "unknown")});
                }
            }, false));
        }
    }

    /* JADX INFO: renamed from: r3 */
    public c<CommonData> m21762r3() {
        final JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("clientId", "100032");
        } catch (JSONException unused) {
        }
        return scheduled("getBindAccountStatus", -1, new v9j() { // from class: l.bv6
            public final Object call() {
                return ia20.m16567a(new v9j() { // from class: l.jv6
                    public final Object call() {
                        return C0154a.f3483P.auth().q(C0154a.m3205a("/account/info")).l(utc0.create(Network.JSON, jSONObject.toString())).b();
                    }
                }).map(new w9j() { // from class: l.kv6
                    public final Object call(Object obj) {
                        return ((Envelope) obj).getModuleData(CommonData.class);
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: u3 */
    public boolean m21763u3(User user) {
        return NullChecker.a(user.settings) && !TextUtils.isEmpty(user.settings.email);
    }

    /* JADX INFO: renamed from: v3 */
    public boolean m21764v3(User user) {
        if (!NullChecker.a(user.settings)) {
            return false;
        }
        if (m21765w3(user)) {
            return true;
        }
        return NullChecker.a(user.settings.linkedPhoneNumber) && !TextUtils.isEmpty(user.settings.linkedPhoneNumber.number);
    }

    /* JADX INFO: renamed from: w3 */
    public boolean m21765w3(User user) {
        return NullChecker.a(user.settings) && NullChecker.a(user.settings.phoneNumber) && !TextUtils.isEmpty(user.settings.phoneNumber.number);
    }

    /* JADX INFO: renamed from: x3 */
    public boolean m21766x3(RememberUserInfo rememberUserInfo) {
        if (rememberUserInfo == null) {
            return false;
        }
        return rememberUserInfo.auth.userId.equals(CoreModule.m1850H().userId());
    }

    /* JADX INFO: renamed from: y3 */
    public final /* synthetic */ c m21767y3(String str) {
        final JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("firebaseId", str);
        } catch (JSONException e) {
            CrashHelper.c(e);
            e.printStackTrace();
        }
        return scheduled("account/firebaseid/post", -1, new v9j() { // from class: l.lv6
            public final Object call() {
                return ia20.m16569c(new v9j() { // from class: l.nv6
                    public final Object call() {
                        return C0154a.f3483P.auth().q(C0154a.m3130G("/users/me/ad-track")).l(utc0.create(Network.JSON, jSONObject.toString())).b();
                    }
                }, AdTrackInfoEnvelope.JSON_ADAPTER);
            }
        });
    }

    /* JADX INFO: renamed from: z3 */
    public final /* synthetic */ void m21768z3(AdTrackInfoEnvelope adTrackInfoEnvelope) {
        if (TextUtils.isEmpty(adTrackInfoEnvelope.data.adTrackInfo.firebaseId)) {
            zvf0.D("e_intl_firebaseid_upload", "p_suggest_users_home_view", new j760[]{j760.a("firebaseid_upload_state", "upload_failed"), j760.a("filter_by", ""), j760.a("error", "adTrackInfo is empty")});
        } else {
            m21757E3();
            zvf0.D("e_intl_firebaseid_upload", "p_suggest_users_home_view", new j760[]{j760.a("firebaseid_upload_state", "upload_success"), j760.a("filter_by", ""), j760.a("error", "")});
        }
    }
}
