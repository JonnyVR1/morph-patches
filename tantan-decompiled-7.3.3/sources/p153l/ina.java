package p153l;

import android.text.TextUtils;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.p051p1.mobile.android.app.App;
import com.p051p1.mobile.putong.api.api.Network;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.C4879a;
import com.p051p1.mobile.putong.core.api.C4883c;
import com.p051p1.mobile.putong.core.data.CoreData;
import com.p051p1.mobile.putong.core.data.PrivacyMembershipSetting;
import com.p051p1.mobile.putong.core.data.VipSetting;
import com.p051p1.mobile.putong.data.Envelope;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.UserPrivacySettings;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.p054ab.IntlCountryCodeController;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import p137rx.C22421c;
import p137rx.subjects.C22507a;

/* JADX INFO: loaded from: classes9.dex */
public class ina extends dy6 {

    /* JADX INFO: renamed from: R */
    public final jxd0 f115880R;

    /* JADX INFO: renamed from: S */
    public final C22507a<PrivacyMembershipSetting> f115881S;

    /* JADX INFO: renamed from: T */
    public final C22507a<VipSetting> f115882T;

    public ina(C4883c c4883c) {
        super(c4883c);
        this.f115880R = new jxd0("female_vip_guide_dialog_shown_" + CoreModule.m30929H().userId(), Boolean.FALSE);
        this.f115881S = C22507a.m222758b();
        this.f115882T = C22507a.m222758b();
    }

    /* JADX INFO: renamed from: A3 */
    public boolean m141059A3(User user) {
        if (user.isMe()) {
            return false;
        }
        return user.isHideIconFromSVip() || user.gpHideVip();
    }

    /* JADX INFO: renamed from: B3 */
    public boolean m141060B3(User user) {
        return (TextUtils.isEmpty(user.location.region.city) && TextUtils.isEmpty(user.location.region.district) && TextUtils.isEmpty(user.location.region.country) && user.location.distance == 0) || user.isHideLocationFromSVip();
    }

    /* JADX INFO: renamed from: C3 */
    public boolean m141061C3() {
        return this.f115880R.get().booleanValue();
    }

    /* JADX INFO: renamed from: D3 */
    public final /* synthetic */ Envelope m141062D3(Envelope envelope) {
        this.f91137Q.m32495w3(envelope, null);
        return envelope;
    }

    /* JADX INFO: renamed from: E3 */
    public final /* synthetic */ uxj0 m141063E3(Envelope envelope) {
        m141083Y3();
        return uxj0.f181467a;
    }

    /* JADX INFO: renamed from: F3 */
    public final /* synthetic */ C22421c m141064F3(final VipSetting vipSetting) {
        return new ti20(new pcj() { // from class: l.tma
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4879a.f20236P.auth().m209043q(C4879a.m32216J0("/vip-settings?method=patch")).m209038l(z1d0.create(Network.JSON, vipSetting.toJson())).m209028b();
            }
        }).map(new qcj() { // from class: l.uma
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f179611a.m141062D3((Envelope) obj);
            }
        }).compose(psd0.m173592C()).map(new qcj() { // from class: l.vma
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f184681a.m141063E3((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: G3 */
    public final /* synthetic */ Envelope m141065G3(Envelope envelope) {
        this.f91137Q.m32495w3(envelope, null);
        return envelope;
    }

    /* JADX INFO: renamed from: H3 */
    public final /* synthetic */ uxj0 m141066H3(Envelope envelope) {
        List<PrivacyMembershipSetting> list = ((CoreData) envelope.getModuleData(CoreData.class)).privacySettings;
        if (!jyb.m147479J(list)) {
            this.f115881S.m137019l(list.get(0));
            if (gta.m132210e().m132214d().mo34758U9() && list.get(0).hideIcon.booleanValue()) {
                m141086u3();
            }
        }
        return uxj0.f181467a;
    }

    /* JADX INFO: renamed from: I3 */
    public final /* synthetic */ C22421c m141067I3(final String str) {
        return new ti20(new pcj() { // from class: l.ena
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4879a.f20236P.auth().m209043q(C4879a.m32216J0("/privacy-settings?method=patch")).m209038l(z1d0.create(Network.JSON, str)).m209028b();
            }
        }).map(new qcj() { // from class: l.fna
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f99881a.m141065G3((Envelope) obj);
            }
        }).compose(psd0.m173592C()).map(new qcj() { // from class: l.gna
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f105071a.m141066H3((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: J3 */
    public final /* synthetic */ Envelope m141068J3(Envelope envelope) {
        this.f91137Q.m32495w3(envelope, null);
        return envelope;
    }

    /* JADX INFO: renamed from: K3 */
    public final /* synthetic */ VipSetting m141069K3(Envelope envelope) {
        VipSetting vipSetting = ((CoreData) envelope.getModuleData(CoreData.class)).vipSettings;
        this.f115882T.m137019l(vipSetting);
        return vipSetting;
    }

    /* JADX INFO: renamed from: L3 */
    public final /* synthetic */ void m141070L3(Throwable th) {
        this.f115882T.m137019l(null);
    }

    /* JADX INFO: renamed from: M3 */
    public final /* synthetic */ C22421c m141071M3() {
        return new ti20(new pcj() { // from class: l.pma
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4879a.f20236P.auth().m209043q(C4879a.m32216J0("/vip-settings")).m209028b();
            }
        }).map(new qcj() { // from class: l.qma
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f158307a.m141068J3((Envelope) obj);
            }
        }).compose(psd0.m173592C()).map(new qcj() { // from class: l.rma
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f163837a.m141069K3((Envelope) obj);
            }
        }).doOnError(new y20() { // from class: l.sma
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f169532a.m141070L3((Throwable) obj);
            }
        });
    }

    /* JADX INFO: renamed from: N3 */
    public final /* synthetic */ Envelope m141072N3(Envelope envelope) {
        this.f91137Q.m32495w3(envelope, null);
        return envelope;
    }

    /* JADX INFO: renamed from: O3 */
    public final /* synthetic */ PrivacyMembershipSetting m141073O3(Envelope envelope) {
        List<PrivacyMembershipSetting> list = ((CoreData) envelope.getModuleData(CoreData.class)).privacySettings;
        if (jyb.m147479J(list)) {
            return null;
        }
        this.f115881S.m137019l(list.get(0));
        return list.get(0);
    }

    /* JADX INFO: renamed from: P3 */
    public final /* synthetic */ C22421c m141074P3() {
        return new ti20(new pcj() { // from class: l.zma
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4879a.f20236P.auth().m209043q(C4879a.m32216J0("/privacy-settings")).m209028b();
            }
        }).map(new qcj() { // from class: l.ana
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f72331a.m141072N3((Envelope) obj);
            }
        }).compose(psd0.m173592C()).map(new qcj() { // from class: l.bna
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f77443a.m141073O3((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: Q3 */
    public C22421c<Boolean> m141075Q3(final boolean z) {
        final JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("isOpenMystery", z);
        } catch (JSONException e) {
            App.f16087d.m21432k(e);
        }
        return this.f91137Q.scheduled("open_mystery_in_supreme_partner", -1, new pcj() { // from class: l.wma
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return qi20.m176654a(new pcj() { // from class: l.xma
                    @Override // p153l.pcj, java.util.concurrent.Callable
                    public final Object call() {
                        return C4879a.f20236P.auth().m209043q(C4879a.m32216J0("/spvip-settings")).m209038l(z1d0.create(Network.JSON, jSONObject.toString())).m209028b();
                    }
                }).map(new qcj() { // from class: l.yma
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return Boolean.valueOf(z);
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: R3 */
    public C22421c<uxj0> m141076R3(PrivacyMembershipSetting privacyMembershipSetting) {
        PrivacyMembershipSetting privacyMembershipSettingM222761e = this.f115881S.m222761e();
        if (privacyMembershipSettingM222761e != null) {
            privacyMembershipSetting = privacyMembershipSetting.subtract(privacyMembershipSettingM222761e);
        }
        if (privacyMembershipSetting == null) {
            return C22421c.just(uxj0.f181467a);
        }
        Boolean bool = privacyMembershipSetting.frozenActivity;
        if (bool != null && !bool.booleanValue()) {
            UserPrivacySettings userPrivacySettings = new UserPrivacySettings();
            userPrivacySettings.hideActivityTime = Boolean.FALSE;
            CoreModule.f18264c.f20381e0.m116636y9(userPrivacySettings);
        }
        return m141082X3(privacyMembershipSetting.toJson());
    }

    /* JADX INFO: renamed from: S3 */
    public void m141077S3() {
        VipSetting vipSettingNew_ = VipSetting.new_();
        vipSettingNew_.suggestReal = true;
        vipSettingNew_.suggestSecure = true;
        vipSettingNew_.blockSensitiveWord = true;
        vipSettingNew_.blockAds = true;
        m141078T3(vipSettingNew_);
    }

    /* JADX INFO: renamed from: T3 */
    public C22421c<uxj0> m141078T3(final VipSetting vipSetting) {
        return this.f91137Q.scheduled("privacy_female_settings_" + vipSetting.toJson(), -1, new pcj() { // from class: l.dna
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f89776a.m141064F3(vipSetting);
            }
        });
    }

    /* JADX INFO: renamed from: U3 */
    public C22421c<VipSetting> m141079U3() {
        return this.f115882T;
    }

    /* JADX INFO: renamed from: V3 */
    public C22421c<PrivacyMembershipSetting> m141080V3() {
        return this.f115881S;
    }

    /* JADX INFO: renamed from: W3 */
    public PrivacyMembershipSetting m141081W3() {
        return this.f115881S.m222761e();
    }

    /* JADX INFO: renamed from: X3 */
    public final C22421c<uxj0> m141082X3(final String str) {
        return this.f91137Q.scheduled("privacy_membership_settings_" + str, -1, new pcj() { // from class: l.cna
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f82704a.m141067I3(str);
            }
        });
    }

    /* JADX INFO: renamed from: Y3 */
    public C22421c<VipSetting> m141083Y3() {
        return this.f91137Q.scheduled("privacy_female_settings", 0, new pcj() { // from class: l.hna
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f110714a.m141071M3();
            }
        });
    }

    /* JADX INFO: renamed from: Z3 */
    public C22421c<PrivacyMembershipSetting> m141084Z3() {
        return this.f91137Q.scheduled("privacy_membership", 0, new pcj() { // from class: l.oma
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f147910a.m141074P3();
            }
        });
    }

    /* JADX INFO: renamed from: a4 */
    public void m141085a4() {
        this.f115880R.put(Boolean.TRUE);
    }

    /* JADX INFO: renamed from: u3 */
    public final void m141086u3() {
        User userM116600p9 = CoreModule.f18264c.f20381e0.m116600p9();
        if (userM116600p9 != null && userM116600p9.isSupremePartnerOpenMystery()) {
            CoreModule.f18264c.f20381e0.m116527W9(userM116600p9.f56859id);
        }
    }

    /* JADX INFO: renamed from: v3 */
    public void m141087v3() {
        this.f115880R.put(Boolean.FALSE);
    }

    /* JADX INFO: renamed from: w3 */
    public boolean m141088w3(User user) {
        return user.location.updatedTime == FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE || user.isHideActiveFromSVip();
    }

    /* JADX INFO: renamed from: x3 */
    public boolean m141089x3(User user) {
        return m141090y3(user) || user.gpHideActiveTime() || m141088w3(user);
    }

    /* JADX INFO: renamed from: y3 */
    public boolean m141090y3(User user) {
        return IntlCountryCodeController.m29115l() && TEnum.equals(user.gender, "female");
    }

    /* JADX INFO: renamed from: z3 */
    public boolean m141091z3(User user) {
        return user.age.intValue() == 0 || user.isHideAgeFromSVipWithOutMe();
    }
}
