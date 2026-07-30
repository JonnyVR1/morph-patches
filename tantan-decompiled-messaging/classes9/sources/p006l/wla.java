package p006l;

import android.text.TextUtils;
import com.p000p1.mobile.putong.api.api.Network;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.api.C0154a;
import com.p000p1.mobile.putong.core.api.C0158c;
import com.p000p1.mobile.putong.p001ab.IntlCountryCodeController;
import com.p1.mobile.android.app.App;
import com.p1.mobile.putong.core.data.CoreData;
import com.p1.mobile.putong.core.data.PrivacyMembershipSetting;
import com.p1.mobile.putong.core.data.VipSetting;
import com.p1.mobile.putong.data.Envelope;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.UserPrivacySettings;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.data.DbObject;
import java.util.List;
import l.e30;
import l.hpd0;
import l.mkd0;
import l.roj0;
import l.utc0;
import l.v9j;
import l.vwb;
import l.w9j;
import org.json.JSONException;
import org.json.JSONObject;
import rx.c;
import rx.subjects.a;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class wla extends ax6 {

    /* JADX INFO: renamed from: R */
    public final hpd0 f25220R;

    /* JADX INFO: renamed from: S */
    public final a<PrivacyMembershipSetting> f25221S;

    /* JADX INFO: renamed from: T */
    public final a<VipSetting> f25222T;

    public wla(C0158c c0158c) {
        super(c0158c);
        this.f25220R = new hpd0("female_vip_guide_dialog_shown_" + CoreModule.m1850H().userId(), Boolean.FALSE);
        this.f25221S = a.b();
        this.f25222T = a.b();
    }

    /* JADX INFO: renamed from: A3 */
    public boolean m26463A3(User user) {
        if (user.isMe()) {
            return false;
        }
        return user.isHideIconFromSVip() || user.gpHideVip();
    }

    /* JADX INFO: renamed from: B3 */
    public boolean m26464B3(User user) {
        return (TextUtils.isEmpty(user.location.region.city) && TextUtils.isEmpty(user.location.region.district) && TextUtils.isEmpty(user.location.region.country) && user.location.distance == 0) || user.isHideLocationFromSVip();
    }

    /* JADX INFO: renamed from: C3 */
    public boolean m26465C3() {
        return ((Boolean) this.f25220R.get()).booleanValue();
    }

    /* JADX INFO: renamed from: D3 */
    public final /* synthetic */ Envelope m26466D3(Envelope envelope) {
        this.f8580Q.m3422w3(envelope, null);
        return envelope;
    }

    /* JADX INFO: renamed from: E3 */
    public final /* synthetic */ roj0 m26467E3(Envelope envelope) {
        m26487Y3();
        return roj0.a;
    }

    /* JADX INFO: renamed from: F3 */
    public final /* synthetic */ c m26468F3(final VipSetting vipSetting) {
        return new la20(new v9j() { // from class: l.hla
            public final Object call() {
                return C0154a.f3483P.auth().q(C0154a.m3143J0("/vip-settings?method=patch")).l(utc0.create(Network.JSON, vipSetting.toJson())).b();
            }
        }).map(new w9j() { // from class: l.ila
            public final Object call(Object obj) {
                return this.f14546a.m26466D3((Envelope) obj);
            }
        }).compose(mkd0.C()).map(new w9j() { // from class: l.jla
            public final Object call(Object obj) {
                return this.f15254a.m26467E3((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: G3 */
    public final /* synthetic */ Envelope m26469G3(Envelope envelope) {
        this.f8580Q.m3422w3(envelope, null);
        return envelope;
    }

    /* JADX INFO: renamed from: H3 */
    public final /* synthetic */ roj0 m26470H3(Envelope envelope) {
        List list = envelope.getModuleData(CoreData.class).privacySettings;
        if (!vwb.J(list)) {
            this.f25221S.onNext((PrivacyMembershipSetting) list.get(0));
            if (ura.m25555e().m25559d().m5692U9() && ((PrivacyMembershipSetting) list.get(0)).hideIcon.booleanValue()) {
                m26490u3();
            }
        }
        return roj0.a;
    }

    /* JADX INFO: renamed from: I3 */
    public final /* synthetic */ c m26471I3(final String str) {
        return new la20(new v9j() { // from class: l.sla
            public final Object call() {
                return C0154a.f3483P.auth().q(C0154a.m3143J0("/privacy-settings?method=patch")).l(utc0.create(Network.JSON, str)).b();
            }
        }).map(new w9j() { // from class: l.tla
            public final Object call(Object obj) {
                return this.f22174a.m26469G3((Envelope) obj);
            }
        }).compose(mkd0.C()).map(new w9j() { // from class: l.ula
            public final Object call(Object obj) {
                return this.f23601a.m26470H3((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: J3 */
    public final /* synthetic */ Envelope m26472J3(Envelope envelope) {
        this.f8580Q.m3422w3(envelope, null);
        return envelope;
    }

    /* JADX INFO: renamed from: K3 */
    public final /* synthetic */ VipSetting m26473K3(Envelope envelope) {
        VipSetting vipSetting = envelope.getModuleData(CoreData.class).vipSettings;
        this.f25222T.onNext(vipSetting);
        return vipSetting;
    }

    /* JADX INFO: renamed from: L3 */
    public final /* synthetic */ void m26474L3(Throwable th) {
        this.f25222T.onNext((Object) null);
    }

    /* JADX INFO: renamed from: M3 */
    public final /* synthetic */ c m26475M3() {
        return new la20(new v9j() { // from class: l.dla
            public final Object call() {
                return C0154a.f3483P.auth().q(C0154a.m3143J0("/vip-settings")).b();
            }
        }).map(new w9j() { // from class: l.ela
            public final Object call(Object obj) {
                return this.f11237a.m26472J3((Envelope) obj);
            }
        }).compose(mkd0.C()).map(new w9j() { // from class: l.fla
            public final Object call(Object obj) {
                return this.f12761a.m26473K3((Envelope) obj);
            }
        }).doOnError(new e30() { // from class: l.gla
            public final void call(Object obj) {
                this.f13359a.m26474L3((Throwable) obj);
            }
        });
    }

    /* JADX INFO: renamed from: N3 */
    public final /* synthetic */ Envelope m26476N3(Envelope envelope) {
        this.f8580Q.m3422w3(envelope, null);
        return envelope;
    }

    /* JADX INFO: renamed from: O3 */
    public final /* synthetic */ PrivacyMembershipSetting m26477O3(Envelope envelope) {
        List list = envelope.getModuleData(CoreData.class).privacySettings;
        if (vwb.J(list)) {
            return null;
        }
        this.f25221S.onNext((PrivacyMembershipSetting) list.get(0));
        return (PrivacyMembershipSetting) list.get(0);
    }

    /* JADX INFO: renamed from: P3 */
    public final /* synthetic */ c m26478P3() {
        return new la20(new v9j() { // from class: l.nla
            public final Object call() {
                return C0154a.f3483P.auth().q(C0154a.m3143J0("/privacy-settings")).b();
            }
        }).map(new w9j() { // from class: l.ola
            public final Object call(Object obj) {
                return this.f18272a.m26476N3((Envelope) obj);
            }
        }).compose(mkd0.C()).map(new w9j() { // from class: l.pla
            public final Object call(Object obj) {
                return this.f19185a.m26477O3((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: Q3 */
    public c<Boolean> m26479Q3(final boolean z) {
        final JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("isOpenMystery", z);
        } catch (JSONException e) {
            App.d.k(e);
        }
        return this.f8580Q.scheduled("open_mystery_in_supreme_partner", -1, new v9j() { // from class: l.kla
            public final Object call() {
                return ia20.m16567a(new v9j() { // from class: l.lla
                    public final Object call() {
                        return C0154a.f3483P.auth().q(C0154a.m3143J0("/spvip-settings")).l(utc0.create(Network.JSON, jSONObject.toString())).b();
                    }
                }).map(new w9j() { // from class: l.mla
                    public final Object call(Object obj) {
                        return Boolean.valueOf(z);
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: R3 */
    public c<roj0> m26480R3(PrivacyMembershipSetting privacyMembershipSetting) {
        PrivacyMembershipSetting privacyMembershipSetting2 = (PrivacyMembershipSetting) this.f25221S.e();
        if (privacyMembershipSetting2 != null) {
            privacyMembershipSetting = privacyMembershipSetting.subtract(privacyMembershipSetting2);
        }
        if (privacyMembershipSetting == null) {
            return c.just(roj0.a);
        }
        Boolean bool = privacyMembershipSetting.frozenActivity;
        if (bool != null && !bool.booleanValue()) {
            UserPrivacySettings userPrivacySettings = new UserPrivacySettings();
            userPrivacySettings.hideActivityTime = Boolean.FALSE;
            CoreModule.f1534c.f3628e0.m21526y9(userPrivacySettings);
        }
        return m26486X3(privacyMembershipSetting.toJson());
    }

    /* JADX INFO: renamed from: S3 */
    public void m26481S3() {
        VipSetting vipSettingNew_ = VipSetting.new_();
        vipSettingNew_.suggestReal = true;
        vipSettingNew_.suggestSecure = true;
        vipSettingNew_.blockSensitiveWord = true;
        vipSettingNew_.blockAds = true;
        m26482T3(vipSettingNew_);
    }

    /* JADX INFO: renamed from: T3 */
    public c<roj0> m26482T3(final VipSetting vipSetting) {
        return this.f8580Q.scheduled("privacy_female_settings_" + vipSetting.toJson(), -1, new v9j() { // from class: l.rla
            public final Object call() {
                return this.f20605a.m26468F3(vipSetting);
            }
        });
    }

    /* JADX INFO: renamed from: U3 */
    public c<VipSetting> m26483U3() {
        return this.f25222T;
    }

    /* JADX INFO: renamed from: V3 */
    public c<PrivacyMembershipSetting> m26484V3() {
        return this.f25221S;
    }

    /* JADX INFO: renamed from: W3 */
    public PrivacyMembershipSetting m26485W3() {
        return (PrivacyMembershipSetting) this.f25221S.e();
    }

    /* JADX INFO: renamed from: X3 */
    public final c<roj0> m26486X3(final String str) {
        return this.f8580Q.scheduled("privacy_membership_settings_" + str, -1, new v9j() { // from class: l.qla
            public final Object call() {
                return this.f19886a.m26471I3(str);
            }
        });
    }

    /* JADX INFO: renamed from: Y3 */
    public c<VipSetting> m26487Y3() {
        return this.f8580Q.scheduled("privacy_female_settings", 0, new v9j() { // from class: l.vla
            public final Object call() {
                return this.f24373a.m26475M3();
            }
        });
    }

    /* JADX INFO: renamed from: Z3 */
    public c<PrivacyMembershipSetting> m26488Z3() {
        return this.f8580Q.scheduled("privacy_membership", 0, new v9j() { // from class: l.cla
            public final Object call() {
                return this.f9713a.m26478P3();
            }
        });
    }

    /* JADX INFO: renamed from: a4 */
    public void m26489a4() {
        this.f25220R.put(Boolean.TRUE);
    }

    /* JADX INFO: renamed from: u3 */
    public final void m26490u3() {
        User userM21490p9 = CoreModule.f1534c.f3628e0.m21490p9();
        if (userM21490p9 != null && userM21490p9.isSupremePartnerOpenMystery()) {
            CoreModule.f1534c.f3628e0.m21417W9(((DbObject) userM21490p9).id);
        }
    }

    /* JADX INFO: renamed from: v3 */
    public void m26491v3() {
        this.f25220R.put(Boolean.FALSE);
    }

    /* JADX INFO: renamed from: w3 */
    public boolean m26492w3(User user) {
        return user.location.updatedTime == 0.0d || user.isHideActiveFromSVip();
    }

    /* JADX INFO: renamed from: x3 */
    public boolean m26493x3(User user) {
        return m26494y3(user) || user.gpHideActiveTime() || m26492w3(user);
    }

    /* JADX INFO: renamed from: y3 */
    public boolean m26494y3(User user) {
        return IntlCountryCodeController.m11l() && TEnum.equals(user.gender, "female");
    }

    /* JADX INFO: renamed from: z3 */
    public boolean m26495z3(User user) {
        return user.age.intValue() == 0 || user.isHideAgeFromSVipWithOutMe();
    }
}
