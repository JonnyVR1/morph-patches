package p149l;

import android.text.TextUtils;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.p053ui.account.view.AccountSecureFunItem;
import com.p046p1.mobile.putong.data.CommonData;
import com.p046p1.mobile.putong.data.Settings;
import com.p046p1.mobile.putong.data.ThirdParty;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import org.slf4j.Marker;

/* JADX INFO: loaded from: classes9.dex */
public abstract class ez2 {

    /* JADX INFO: renamed from: a */
    public String f93839a = "";

    /* JADX INFO: renamed from: a */
    public abstract void mo99615a(AccountSecureFunItem accountSecureFunItem, CommonData commonData);

    /* JADX INFO: renamed from: b */
    public String m118819b() {
        User userM169520na = CoreModule.f17545c.f19639e0.m169520na();
        Settings settings = userM169520na.settings;
        if (settings == null || TextUtils.isEmpty(settings.linkedPhoneNumber.number)) {
            return "";
        }
        return Marker.ANY_NON_NULL_MARKER + userM169520na.settings.linkedPhoneNumber.countryCode + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + C19604qy.m177017a(userM169520na.settings.linkedPhoneNumber.number);
    }

    /* JADX INFO: renamed from: c */
    public String m118820c(CommonData commonData) {
        if (!NullChecker.m81303a(commonData.mobile) || TextUtils.isEmpty(commonData.mobile.mobileNumber)) {
            return "";
        }
        return Marker.ANY_NON_NULL_MARKER + commonData.mobile.countryCode + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + C19604qy.m177017a(commonData.mobile.mobileNumber);
    }

    /* JADX INFO: renamed from: d */
    public boolean m118821d(CommonData commonData) {
        return !TextUtils.isEmpty(commonData.email);
    }

    /* JADX INFO: renamed from: e */
    public boolean m118822e(CommonData commonData) {
        return NullChecker.m81303a(commonData.mobile) && NullChecker.m81303a(commonData.thirdparty) && commonData.thirdparty.facebook;
    }

    /* JADX INFO: renamed from: f */
    public boolean m118823f(CommonData commonData) {
        return NullChecker.m81303a(commonData.mobile) && NullChecker.m81303a(commonData.thirdparty) && commonData.thirdparty.google;
    }

    /* JADX INFO: renamed from: g */
    public boolean m118824g(CommonData commonData) {
        return NullChecker.m81303a(commonData.mobile) && !TextUtils.isEmpty(commonData.mobile.mobileNumber);
    }

    /* JADX INFO: renamed from: h */
    public boolean m118825h(CommonData commonData, boolean z) {
        if (!NullChecker.m81303a(commonData.mobile) || !NullChecker.m81303a(commonData.thirdparty)) {
            return false;
        }
        ThirdParty thirdParty = commonData.thirdparty;
        if (thirdParty.wechat || thirdParty.google) {
            return true;
        }
        return z && thirdParty.facebook;
    }
}
