package p153l;

import android.app.Activity;
import android.text.TextUtils;
import com.p051p1.mobile.putong.api.api.AccountTempApi;
import com.p051p1.mobile.putong.api.api.Network;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.C4879a;
import com.p051p1.mobile.putong.core.api.C4883c;
import com.p051p1.mobile.putong.core.data.AdTrackInfoEnvelope;
import com.p051p1.mobile.putong.core.data.MigrateDlgConfigEnvelope;
import com.p051p1.mobile.putong.core.data.TTCMigrateGuideConfig;
import com.p051p1.mobile.putong.data.AccountErrorResponse;
import com.p051p1.mobile.putong.data.CommonData;
import com.p051p1.mobile.putong.data.Envelope;
import com.p051p1.mobile.putong.data.ForgetPasswordData;
import com.p051p1.mobile.putong.data.RememberUserInfo;
import com.p051p1.mobile.putong.data.SignOutParams;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.p054ab.IntlCountryCodeController;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashSet;
import org.json.JSONException;
import org.json.JSONObject;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes9.dex */
public class sw6 extends dy6 {

    /* JADX INFO: renamed from: R */
    public xyd0 f170919R;

    /* JADX INFO: renamed from: S */
    public byd0 f170920S;

    /* JADX INFO: renamed from: T */
    public vxd0 f170921T;

    /* JADX INFO: renamed from: U */
    public jxd0 f170922U;

    /* JADX INFO: renamed from: V */
    public wyd0 f170923V;

    public sw6(C4883c c4883c) {
        super(c4883c);
        this.f170919R = new xyd0("account_firebaseid_post_set_v2", new HashSet());
        this.f170920S = new byd0("next_show_migrate_guide_pop_time" + CoreModule.m30929H().userId(), 0L);
        this.f170921T = new vxd0("current_show_migrate_guide_pop_type" + CoreModule.m30929H().userId(), 0);
        this.f170922U = new jxd0("is_show_bind_phone_number_red_dot" + CoreModule.m30929H().userId(), Boolean.FALSE);
        this.f170923V = new wyd0("migration_dlg_config" + CoreModule.m30929H().userId(), MigrateDlgConfigEnvelope.new_().toJson());
    }

    /* JADX INFO: renamed from: A3 */
    public static C22421c<uxj0> m188240A3(final String str, final Class<? extends Activity> cls) {
        return uqb0.m197277m0(new pcj() { // from class: l.pw6
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return CoreModule.f18264c.f20369a0.m188260D3(str).compose(C4879a.m32255T2()).flatMap(new qcj() { // from class: l.iw6
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return uqb0.m197263b1(cls, false, AccountTempApi.InactiveType.Pause, false);
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: g3 */
    public static /* synthetic */ C22421c m188247g3(String str, AccountErrorResponse accountErrorResponse) {
        SignOutParams signOutParams = new SignOutParams(false, AccountTempApi.InactiveType.DeleteImmediately, accountErrorResponse.hasContract, false);
        signOutParams.setInactiveCategory(str);
        return uqb0.m197261a1(CoreModule.m30929H().mo29173uk(), signOutParams);
    }

    /* JADX INFO: renamed from: l3 */
    public static /* synthetic */ CommonData m188252l3(Envelope envelope) {
        return (CommonData) envelope.getModuleData(CommonData.class);
    }

    /* JADX INFO: renamed from: o3 */
    public static void m188255o3() {
        User userMe_;
        if (TextUtils.isEmpty(CoreModule.m30929H().userId()) || (userMe_ = CoreModule.m30930K().me_()) == null) {
            return;
        }
        RememberUserInfo rememberUserInfoMo107143b = uqb0.f180380L.f17863b.mo107143b();
        RememberUserInfo rememberUserInfoMo107143b2 = uqb0.f180380L.f17864c.mo107143b();
        if (rememberUserInfoMo107143b == null || CoreModule.f18264c.f20369a0.m188270x3(rememberUserInfoMo107143b)) {
            uqb0.f180380L.f17863b.m217964p(userMe_.m61308fp().url, CoreModule.m30929H().getAuthData().mo107143b(), userMe_.name);
            uqb0.f180380L.m30515b(userMe_.m61308fp().url, CoreModule.m30929H().getAuthData().mo107143b(), userMe_.name);
        } else if (rememberUserInfoMo107143b2 == null) {
            if (gta.m132210e().m132214d().mo34920rt()) {
                uqb0.f180380L.f17864c.m217964p(userMe_.m61308fp().url, CoreModule.m30929H().getAuthData().mo107143b(), userMe_.name);
                uqb0.f180380L.m30515b(userMe_.m61308fp().url, CoreModule.m30929H().getAuthData().mo107143b(), userMe_.name);
            } else {
                uqb0.f180380L.f17863b.m217964p(userMe_.m61308fp().url, CoreModule.m30929H().getAuthData().mo107143b(), userMe_.name);
                uqb0.f180380L.m30515b(userMe_.m61308fp().url, CoreModule.m30929H().getAuthData().mo107143b(), userMe_.name);
            }
        } else if (CoreModule.f18264c.f20369a0.m188270x3(rememberUserInfoMo107143b2)) {
            uqb0.f180380L.f17864c.m217964p(userMe_.m61308fp().url, CoreModule.m30929H().getAuthData().mo107143b(), userMe_.name);
            uqb0.f180380L.m30515b(userMe_.m61308fp().url, CoreModule.m30929H().getAuthData().mo107143b(), userMe_.name);
        } else {
            uqb0.f180380L.f17863b.m123194i();
            uqb0.f180380L.f17864c.m123194i();
        }
        gta.m132210e().m132214d().mo34674Db(false);
    }

    /* JADX INFO: renamed from: s3 */
    public static C22421c<uxj0> m188256s3(final String str) {
        return uqb0.m197277m0(new pcj() { // from class: l.fw6
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return CoreModule.f18264c.f20369a0.m188258B3(str).compose(C4879a.m32255T2()).flatMap(new qcj() { // from class: l.gw6
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        AccountErrorResponse accountErrorResponse = (AccountErrorResponse) obj;
                        return uqb0.m197261a1((IntlCountryCodeController.m29112i() && accountErrorResponse.code == 200) ? CoreModule.m30929H().getSignOutJumpAct() : gta.m132210e().m132214d().mo34953xr(), new SignOutParams(false, AccountTempApi.InactiveType.DeleteImmediately, accountErrorResponse.hasContract, false));
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: t3 */
    public static C22421c<uxj0> m188257t3(final String str, final String str2, final String str3) {
        return uqb0.m197277m0(new pcj() { // from class: l.rw6
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                String str4 = str;
                return CoreModule.f18264c.f20369a0.m188259C3(str4, str2, str3).compose(C4879a.m32255T2()).flatMap(new qcj() { // from class: l.hw6
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return sw6.m188247g3(str4, (AccountErrorResponse) obj);
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: B3 */
    public C22421c<AccountErrorResponse> m188258B3(String str) {
        vw6 vw6Var = CoreModule.f18264c.f20372b0;
        String str2 = "";
        if (uqb0.f180400f0 != 0) {
            str2 = uqb0.f180400f0 + "";
        }
        return vw6Var.m203070d3(null, str, null, str2);
    }

    /* JADX INFO: renamed from: C3 */
    public C22421c<AccountErrorResponse> m188259C3(String str, String str2, String str3) {
        vw6 vw6Var = CoreModule.f18264c.f20372b0;
        String str4 = "";
        if (uqb0.f180400f0 != 0) {
            str4 = uqb0.f180400f0 + "";
        }
        return vw6Var.m203070d3(str, str2, str3, str4);
    }

    /* JADX INFO: renamed from: D3 */
    public C22421c<uxj0> m188260D3(String str) {
        return CoreModule.f18264c.f20372b0.m203069c3(str);
    }

    /* JADX INFO: renamed from: E3 */
    public final void m188261E3() {
        HashSet<String> hashSet = this.f170919R.get();
        if (!NullChecker.m82486a(hashSet)) {
            hashSet = new HashSet<>();
        }
        if (hashSet.contains(CoreModule.m30929H().userId())) {
            return;
        }
        hashSet.add(CoreModule.m30929H().userId());
        this.f170919R.put(hashSet);
    }

    /* JADX INFO: renamed from: F3 */
    public boolean m188262F3(TTCMigrateGuideConfig tTCMigrateGuideConfig) {
        int i;
        return tTCMigrateGuideConfig != null && (i = tTCMigrateGuideConfig.dlgType) >= 1 && i <= 3 && (i != this.f170921T.get().intValue() || pzi0.m174454o() >= this.f170920S.get().longValue());
    }

    /* JADX INFO: renamed from: G3 */
    public C22421c<Boolean> m188263G3(String str) {
        return CoreModule.f18264c.f20372b0.m203071e3(str).compose(C4879a.m32255T2());
    }

    /* JADX INFO: renamed from: p3 */
    public C22421c<uxj0> m188264p3(ForgetPasswordData forgetPasswordData) {
        return now(CoreModule.m30929H().mo29159Pd(forgetPasswordData).compose(C4879a.m32255T2()));
    }

    /* JADX INFO: renamed from: q3 */
    public void m188265q3() {
        i4g0.m138495D("e_intl_firebaseid_upload", "p_suggest_users_home_view", pf60.m172085a("firebaseid_upload_state", "before_upload"), pf60.m172085a("filter_by", ""), pf60.m172085a("error", ""));
        HashSet<String> hashSet = this.f170919R.get();
        if (NullChecker.m82486a(hashSet) && hashSet.contains(CoreModule.m30929H().userId())) {
            i4g0.m138495D("e_intl_firebaseid_upload", "p_suggest_users_home_view", pf60.m172085a("firebaseid_upload_state", "is_filtered"), pf60.m172085a("filter_by", "local_hasUpload"), pf60.m172085a("error", ""));
        } else {
            CoreModule.m30929H().mo29175y7().flatMap(new qcj() { // from class: l.jw6
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return this.f122882a.m188271y3((String) obj);
                }
            }).subscribe(psd0.m173600K(new y20() { // from class: l.kw6
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f129033a.m188272z3((AdTrackInfoEnvelope) obj);
                }
            }, new y20() { // from class: l.lw6
                @Override // p153l.y20
                public final void call(Object obj) {
                    Throwable th = (Throwable) obj;
                    i4g0.m138495D("e_intl_firebaseid_upload", "p_suggest_users_home_view", pf60.m172085a("firebaseid_upload_state", "upload_failed"), pf60.m172085a("filter_by", ""), pf60.m172085a("error", NullChecker.m82486a(th) ? th.getMessage() : "unknown"));
                }
            }, false));
        }
    }

    /* JADX INFO: renamed from: r3 */
    public C22421c<CommonData> m188266r3() {
        final JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("clientId", "100032");
        } catch (JSONException unused) {
        }
        return scheduled("getBindAccountStatus", -1, new pcj() { // from class: l.ew6
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return qi20.m176654a(new pcj() { // from class: l.mw6
                    @Override // p153l.pcj, java.util.concurrent.Callable
                    public final Object call() {
                        return C4879a.f20236P.auth().m209043q(C4879a.m32278a("/account/info")).m209038l(z1d0.create(Network.JSON, jSONObject.toString())).m209028b();
                    }
                }).map(new qcj() { // from class: l.nw6
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return sw6.m188252l3((Envelope) obj);
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: u3 */
    public boolean m188267u3(User user) {
        return NullChecker.m82486a(user.settings) && !TextUtils.isEmpty(user.settings.email);
    }

    /* JADX INFO: renamed from: v3 */
    public boolean m188268v3(User user) {
        if (!NullChecker.m82486a(user.settings)) {
            return false;
        }
        if (m188269w3(user)) {
            return true;
        }
        return NullChecker.m82486a(user.settings.linkedPhoneNumber) && !TextUtils.isEmpty(user.settings.linkedPhoneNumber.number);
    }

    /* JADX INFO: renamed from: w3 */
    public boolean m188269w3(User user) {
        return NullChecker.m82486a(user.settings) && NullChecker.m82486a(user.settings.phoneNumber) && !TextUtils.isEmpty(user.settings.phoneNumber.number);
    }

    /* JADX INFO: renamed from: x3 */
    public boolean m188270x3(RememberUserInfo rememberUserInfo) {
        if (rememberUserInfo == null) {
            return false;
        }
        return rememberUserInfo.auth.userId.equals(CoreModule.m30929H().userId());
    }

    /* JADX INFO: renamed from: y3 */
    public final /* synthetic */ C22421c m188271y3(String str) {
        final JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("firebaseId", str);
        } catch (JSONException e) {
            CrashHelper.m82479c(e);
            e.printStackTrace();
        }
        return scheduled("account/firebaseid/post", -1, new pcj() { // from class: l.ow6
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return qi20.m176656c(new pcj() { // from class: l.qw6
                    @Override // p153l.pcj, java.util.concurrent.Callable
                    public final Object call() {
                        return C4879a.f20236P.auth().m209043q(C4879a.m32203G("/users/me/ad-track")).m209038l(z1d0.create(Network.JSON, jSONObject.toString())).m209028b();
                    }
                }, AdTrackInfoEnvelope.JSON_ADAPTER);
            }
        });
    }

    /* JADX INFO: renamed from: z3 */
    public final /* synthetic */ void m188272z3(AdTrackInfoEnvelope adTrackInfoEnvelope) {
        if (TextUtils.isEmpty(adTrackInfoEnvelope.data.adTrackInfo.firebaseId)) {
            i4g0.m138495D("e_intl_firebaseid_upload", "p_suggest_users_home_view", pf60.m172085a("firebaseid_upload_state", "upload_failed"), pf60.m172085a("filter_by", ""), pf60.m172085a("error", "adTrackInfo is empty"));
        } else {
            m188261E3();
            i4g0.m138495D("e_intl_firebaseid_upload", "p_suggest_users_home_view", pf60.m172085a("firebaseid_upload_state", "upload_success"), pf60.m172085a("filter_by", ""), pf60.m172085a("error", ""));
        }
    }
}
