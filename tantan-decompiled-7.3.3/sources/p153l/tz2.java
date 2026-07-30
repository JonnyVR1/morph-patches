package p153l;

import android.text.TextUtils;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.p058ui.account.view.AccountSecureFunItem;
import com.p051p1.mobile.putong.data.CommonData;
import com.p051p1.mobile.putong.data.Settings;
import com.p051p1.mobile.putong.data.ThirdParty;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import org.slf4j.Marker;

/* JADX INFO: loaded from: classes9.dex */
public abstract class tz2 {

    /* JADX INFO: renamed from: a */
    public String f176736a = "";

    /* JADX INFO: renamed from: a */
    public abstract void mo114641a(AccountSecureFunItem accountSecureFunItem, CommonData commonData);

    /* JADX INFO: renamed from: b */
    public String m193635b() {
        User userM116593na = CoreModule.f18264c.f20381e0.m116593na();
        Settings settings = userM116593na.settings;
        if (settings == null || TextUtils.isEmpty(settings.linkedPhoneNumber.number)) {
            return "";
        }
        return Marker.ANY_NON_NULL_MARKER + userM116593na.settings.linkedPhoneNumber.countryCode + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + C18296ky.m151902a(userM116593na.settings.linkedPhoneNumber.number);
    }

    /* JADX INFO: renamed from: c */
    public String m193636c(CommonData commonData) {
        if (!NullChecker.m82486a(commonData.mobile) || TextUtils.isEmpty(commonData.mobile.mobileNumber)) {
            return "";
        }
        return Marker.ANY_NON_NULL_MARKER + commonData.mobile.countryCode + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + C18296ky.m151902a(commonData.mobile.mobileNumber);
    }

    /* JADX INFO: renamed from: d */
    public boolean m193637d(CommonData commonData) {
        return !TextUtils.isEmpty(commonData.email);
    }

    /* JADX INFO: renamed from: e */
    public boolean m193638e(CommonData commonData) {
        return NullChecker.m82486a(commonData.mobile) && NullChecker.m82486a(commonData.thirdparty) && commonData.thirdparty.facebook;
    }

    /* JADX INFO: renamed from: f */
    public boolean m193639f(CommonData commonData) {
        return NullChecker.m82486a(commonData.mobile) && NullChecker.m82486a(commonData.thirdparty) && commonData.thirdparty.google;
    }

    /* JADX INFO: renamed from: g */
    public boolean m193640g(CommonData commonData) {
        return NullChecker.m82486a(commonData.mobile) && !TextUtils.isEmpty(commonData.mobile.mobileNumber);
    }

    /* JADX INFO: renamed from: h */
    public boolean m193641h(CommonData commonData, boolean z) {
        if (!NullChecker.m82486a(commonData.mobile) || !NullChecker.m82486a(commonData.thirdparty)) {
            return false;
        }
        ThirdParty thirdParty = commonData.thirdparty;
        if (thirdParty.wechat || thirdParty.google) {
            return true;
        }
        return z && thirdParty.facebook;
    }
}
