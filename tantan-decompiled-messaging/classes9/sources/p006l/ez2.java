package p006l;

import android.text.TextUtils;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.p004ui.account.view.AccountSecureFunItem;
import com.p1.mobile.putong.data.CommonData;
import com.p1.mobile.putong.data.Settings;
import com.p1.mobile.putong.data.ThirdParty;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public abstract class ez2 {

    /* JADX INFO: renamed from: a */
    public String f11524a = "";

    /* JADX INFO: renamed from: a */
    public abstract void mo12347a(AccountSecureFunItem accountSecureFunItem, CommonData commonData);

    /* JADX INFO: renamed from: b */
    public String m14928b() {
        User userM21483na = CoreModule.f1534c.f3628e0.m21483na();
        Settings settings = userM21483na.settings;
        if (settings == null || TextUtils.isEmpty(settings.linkedPhoneNumber.number)) {
            return "";
        }
        return "+" + userM21483na.settings.linkedPhoneNumber.countryCode + " " + C1193qy.m22513a(userM21483na.settings.linkedPhoneNumber.number);
    }

    /* JADX INFO: renamed from: c */
    public String m14929c(CommonData commonData) {
        if (!NullChecker.a(commonData.mobile) || TextUtils.isEmpty(commonData.mobile.mobileNumber)) {
            return "";
        }
        return "+" + commonData.mobile.countryCode + " " + C1193qy.m22513a(commonData.mobile.mobileNumber);
    }

    /* JADX INFO: renamed from: d */
    public boolean m14930d(CommonData commonData) {
        return !TextUtils.isEmpty(commonData.email);
    }

    /* JADX INFO: renamed from: e */
    public boolean m14931e(CommonData commonData) {
        return NullChecker.a(commonData.mobile) && NullChecker.a(commonData.thirdparty) && commonData.thirdparty.facebook;
    }

    /* JADX INFO: renamed from: f */
    public boolean m14932f(CommonData commonData) {
        return NullChecker.a(commonData.mobile) && NullChecker.a(commonData.thirdparty) && commonData.thirdparty.google;
    }

    /* JADX INFO: renamed from: g */
    public boolean m14933g(CommonData commonData) {
        return NullChecker.a(commonData.mobile) && !TextUtils.isEmpty(commonData.mobile.mobileNumber);
    }

    /* JADX INFO: renamed from: h */
    public boolean m14934h(CommonData commonData, boolean z) {
        if (!NullChecker.a(commonData.mobile) || !NullChecker.a(commonData.thirdparty)) {
            return false;
        }
        ThirdParty thirdParty = commonData.thirdparty;
        if (thirdParty.wechat || thirdParty.google) {
            return true;
        }
        return z && thirdParty.facebook;
    }
}
