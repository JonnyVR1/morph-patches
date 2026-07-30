package p149l;

import android.text.TextUtils;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.p046p1.mobile.android.app.App;
import com.p046p1.mobile.putong.api.api.Network;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.C4728a;
import com.p046p1.mobile.putong.core.api.C4732c;
import com.p046p1.mobile.putong.core.data.CoreData;
import com.p046p1.mobile.putong.core.data.PrivacyMembershipSetting;
import com.p046p1.mobile.putong.core.data.VipSetting;
import com.p046p1.mobile.putong.data.Envelope;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.UserPrivacySettings;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.p049ab.IntlCountryCodeController;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import p133rx.C22306c;
import p133rx.subjects.C22392a;

/* JADX INFO: loaded from: classes9.dex */
public class wla extends ax6 {

    /* JADX INFO: renamed from: R */
    public final hpd0 f186884R;

    /* JADX INFO: renamed from: S */
    public final C22392a<PrivacyMembershipSetting> f186885S;

    /* JADX INFO: renamed from: T */
    public final C22392a<VipSetting> f186886T;

    public wla(C4732c c4732c) {
        super(c4732c);
        this.f186884R = new hpd0("female_vip_guide_dialog_shown_" + CoreModule.m29931H().userId(), Boolean.FALSE);
        this.f186885S = C22392a.m221512b();
        this.f186886T = C22392a.m221512b();
    }

    /* JADX INFO: renamed from: A3 */
    public boolean m203771A3(User user) {
        if (user.isMe()) {
            return false;
        }
        return user.isHideIconFromSVip() || user.gpHideVip();
    }

    /* JADX INFO: renamed from: B3 */
    public boolean m203772B3(User user) {
        return (TextUtils.isEmpty(user.location.region.city) && TextUtils.isEmpty(user.location.region.district) && TextUtils.isEmpty(user.location.region.country) && user.location.distance == 0) || user.isHideLocationFromSVip();
    }

    /* JADX INFO: renamed from: C3 */
    public boolean m203773C3() {
        return this.f186884R.get().booleanValue();
    }

    /* JADX INFO: renamed from: D3 */
    public final /* synthetic */ Envelope m203774D3(Envelope envelope) {
        this.f72126Q.m31492w3(envelope, null);
        return envelope;
    }

    /* JADX INFO: renamed from: E3 */
    public final /* synthetic */ roj0 m203775E3(Envelope envelope) {
        m203795Y3();
        return roj0.f160388a;
    }

    /* JADX INFO: renamed from: F3 */
    public final /* synthetic */ C22306c m203776F3(final VipSetting vipSetting) {
        return new la20(new v9j() { // from class: l.hla
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4728a.f19494P.auth().m185898q(C4728a.m31213J0("/vip-settings?method=patch")).m185893l(utc0.create(Network.JSON, vipSetting.toJson())).m185883b();
            }
        }).map(new w9j() { // from class: l.ila
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f113778a.m203774D3((Envelope) obj);
            }
        }).compose(mkd0.m154951C()).map(new w9j() { // from class: l.jla
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f118498a.m203775E3((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: G3 */
    public final /* synthetic */ Envelope m203777G3(Envelope envelope) {
        this.f72126Q.m31492w3(envelope, null);
        return envelope;
    }

    /* JADX INFO: renamed from: H3 */
    public final /* synthetic */ roj0 m203778H3(Envelope envelope) {
        List<PrivacyMembershipSetting> list = ((CoreData) envelope.getModuleData(CoreData.class)).privacySettings;
        if (!vwb.m200296J(list)) {
            this.f186885S.m132487l(list.get(0));
            if (ura.m195053e().m195057d().mo33755U9() && list.get(0).hideIcon.booleanValue()) {
                m203798u3();
            }
        }
        return roj0.f160388a;
    }

    /* JADX INFO: renamed from: I3 */
    public final /* synthetic */ C22306c m203779I3(final String str) {
        return new la20(new v9j() { // from class: l.sla
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4728a.f19494P.auth().m185898q(C4728a.m31213J0("/privacy-settings?method=patch")).m185893l(utc0.create(Network.JSON, str)).m185883b();
            }
        }).map(new w9j() { // from class: l.tla
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f171009a.m203777G3((Envelope) obj);
            }
        }).compose(mkd0.m154951C()).map(new w9j() { // from class: l.ula
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f177025a.m203778H3((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: J3 */
    public final /* synthetic */ Envelope m203780J3(Envelope envelope) {
        this.f72126Q.m31492w3(envelope, null);
        return envelope;
    }

    /* JADX INFO: renamed from: K3 */
    public final /* synthetic */ VipSetting m203781K3(Envelope envelope) {
        VipSetting vipSetting = ((CoreData) envelope.getModuleData(CoreData.class)).vipSettings;
        this.f186886T.m132487l(vipSetting);
        return vipSetting;
    }

    /* JADX INFO: renamed from: L3 */
    public final /* synthetic */ void m203782L3(Throwable th) {
        this.f186886T.m132487l(null);
    }

    /* JADX INFO: renamed from: M3 */
    public final /* synthetic */ C22306c m203783M3() {
        return new la20(new v9j() { // from class: l.dla
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4728a.f19494P.auth().m185898q(C4728a.m31213J0("/vip-settings")).m185883b();
            }
        }).map(new w9j() { // from class: l.ela
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f92086a.m203780J3((Envelope) obj);
            }
        }).compose(mkd0.m154951C()).map(new w9j() { // from class: l.fla
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f98140a.m203781K3((Envelope) obj);
            }
        }).doOnError(new e30() { // from class: l.gla
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f103306a.m203782L3((Throwable) obj);
            }
        });
    }

    /* JADX INFO: renamed from: N3 */
    public final /* synthetic */ Envelope m203784N3(Envelope envelope) {
        this.f72126Q.m31492w3(envelope, null);
        return envelope;
    }

    /* JADX INFO: renamed from: O3 */
    public final /* synthetic */ PrivacyMembershipSetting m203785O3(Envelope envelope) {
        List<PrivacyMembershipSetting> list = ((CoreData) envelope.getModuleData(CoreData.class)).privacySettings;
        if (vwb.m200296J(list)) {
            return null;
        }
        this.f186885S.m132487l(list.get(0));
        return list.get(0);
    }

    /* JADX INFO: renamed from: P3 */
    public final /* synthetic */ C22306c m203786P3() {
        return new la20(new v9j() { // from class: l.nla
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4728a.f19494P.auth().m185898q(C4728a.m31213J0("/privacy-settings")).m185883b();
            }
        }).map(new w9j() { // from class: l.ola
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f144487a.m203784N3((Envelope) obj);
            }
        }).compose(mkd0.m154951C()).map(new w9j() { // from class: l.pla
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f150084a.m203785O3((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: Q3 */
    public C22306c<Boolean> m203787Q3(final boolean z) {
        final JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("isOpenMystery", z);
        } catch (JSONException e) {
            App.f15368d.m20433k(e);
        }
        return this.f72126Q.scheduled("open_mystery_in_supreme_partner", -1, new v9j() { // from class: l.kla
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return ia20.m135117a(new v9j() { // from class: l.lla
                    @Override // p149l.v9j, java.util.concurrent.Callable
                    public final Object call() {
                        return C4728a.f19494P.auth().m185898q(C4728a.m31213J0("/spvip-settings")).m185893l(utc0.create(Network.JSON, jSONObject.toString())).m185883b();
                    }
                }).map(new w9j() { // from class: l.mla
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return Boolean.valueOf(z);
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: R3 */
    public C22306c<roj0> m203788R3(PrivacyMembershipSetting privacyMembershipSetting) {
        PrivacyMembershipSetting privacyMembershipSettingM221515e = this.f186885S.m221515e();
        if (privacyMembershipSettingM221515e != null) {
            privacyMembershipSetting = privacyMembershipSetting.subtract(privacyMembershipSettingM221515e);
        }
        if (privacyMembershipSetting == null) {
            return C22306c.just(roj0.f160388a);
        }
        Boolean bool = privacyMembershipSetting.frozenActivity;
        if (bool != null && !bool.booleanValue()) {
            UserPrivacySettings userPrivacySettings = new UserPrivacySettings();
            userPrivacySettings.hideActivityTime = Boolean.FALSE;
            CoreModule.f17545c.f19639e0.m169563y9(userPrivacySettings);
        }
        return m203794X3(privacyMembershipSetting.toJson());
    }

    /* JADX INFO: renamed from: S3 */
    public void m203789S3() {
        VipSetting vipSettingNew_ = VipSetting.new_();
        vipSettingNew_.suggestReal = true;
        vipSettingNew_.suggestSecure = true;
        vipSettingNew_.blockSensitiveWord = true;
        vipSettingNew_.blockAds = true;
        m203790T3(vipSettingNew_);
    }

    /* JADX INFO: renamed from: T3 */
    public C22306c<roj0> m203790T3(final VipSetting vipSetting) {
        return this.f72126Q.scheduled("privacy_female_settings_" + vipSetting.toJson(), -1, new v9j() { // from class: l.rla
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f159938a.m203776F3(vipSetting);
            }
        });
    }

    /* JADX INFO: renamed from: U3 */
    public C22306c<VipSetting> m203791U3() {
        return this.f186886T;
    }

    /* JADX INFO: renamed from: V3 */
    public C22306c<PrivacyMembershipSetting> m203792V3() {
        return this.f186885S;
    }

    /* JADX INFO: renamed from: W3 */
    public PrivacyMembershipSetting m203793W3() {
        return this.f186885S.m221515e();
    }

    /* JADX INFO: renamed from: X3 */
    public final C22306c<roj0> m203794X3(final String str) {
        return this.f72126Q.scheduled("privacy_membership_settings_" + str, -1, new v9j() { // from class: l.qla
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f155201a.m203779I3(str);
            }
        });
    }

    /* JADX INFO: renamed from: Y3 */
    public C22306c<VipSetting> m203795Y3() {
        return this.f72126Q.scheduled("privacy_female_settings", 0, new v9j() { // from class: l.vla
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f181925a.m203783M3();
            }
        });
    }

    /* JADX INFO: renamed from: Z3 */
    public C22306c<PrivacyMembershipSetting> m203796Z3() {
        return this.f72126Q.scheduled("privacy_membership", 0, new v9j() { // from class: l.cla
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f81378a.m203786P3();
            }
        });
    }

    /* JADX INFO: renamed from: a4 */
    public void m203797a4() {
        this.f186884R.put(Boolean.TRUE);
    }

    /* JADX INFO: renamed from: u3 */
    public final void m203798u3() {
        User userM169527p9 = CoreModule.f17545c.f19639e0.m169527p9();
        if (userM169527p9 != null && userM169527p9.isSupremePartnerOpenMystery()) {
            CoreModule.f17545c.f19639e0.m169454W9(userM169527p9.f56011id);
        }
    }

    /* JADX INFO: renamed from: v3 */
    public void m203799v3() {
        this.f186884R.put(Boolean.FALSE);
    }

    /* JADX INFO: renamed from: w3 */
    public boolean m203800w3(User user) {
        return user.location.updatedTime == FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE || user.isHideActiveFromSVip();
    }

    /* JADX INFO: renamed from: x3 */
    public boolean m203801x3(User user) {
        return m203802y3(user) || user.gpHideActiveTime() || m203800w3(user);
    }

    /* JADX INFO: renamed from: y3 */
    public boolean m203802y3(User user) {
        return IntlCountryCodeController.m28116l() && TEnum.equals(user.gender, "female");
    }

    /* JADX INFO: renamed from: z3 */
    public boolean m203803z3(User user) {
        return user.age.intValue() == 0 || user.isHideAgeFromSVipWithOutMe();
    }
}
