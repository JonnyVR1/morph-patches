package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.data.VerificationTokenRequestParam;
import com.tantanapp.common.utils.NullChecker;
import org.jetbrains.annotations.TestOnly;

/* JADX INFO: loaded from: classes12.dex */
public class y5l0 {

    /* JADX INFO: renamed from: a */
    public static boolean f197570a = false;

    /* JADX INFO: renamed from: b */
    public static String f197571b = "";

    /* JADX INFO: renamed from: a */
    public static VerificationTokenRequestParam m214307a(String str, String str2, String str3) {
        return VerificationTokenRequestParam.builder().useCountryAccountBackTemplate(str, false, "", str2, str3).build();
    }

    /* JADX INFO: renamed from: b */
    public static VerificationTokenRequestParam m214308b(String str, String str2) {
        String str3 = (!NullChecker.m82486a(CoreModule.f18264c.f20381e0.f89056J3) || TextUtils.isEmpty(CoreModule.f18264c.f20381e0.f89056J3.get())) ? "" : CoreModule.f18264c.f20381e0.f89056J3.get();
        f197571b = str3;
        return VerificationTokenRequestParam.builder().useCountryTemplate(str2, str, str3).build();
    }

    /* JADX INFO: renamed from: c */
    public static String m214309c() {
        return f197571b;
    }

    /* JADX INFO: renamed from: d */
    public static VerificationTokenRequestParam m214310d(String str, String str2, String str3, boolean z, String str4) {
        String str5 = (!NullChecker.m82486a(CoreModule.f18264c.f20381e0.f89056J3) || TextUtils.isEmpty(CoreModule.f18264c.f20381e0.f89056J3.get())) ? "" : CoreModule.f18264c.f20381e0.f89056J3.get();
        f197571b = str5;
        return VerificationTokenRequestParam.builder().setIdName(str).setIdNumber(str2).useServerTemplate(str3, z, str5, str4).build();
    }

    /* JADX INFO: renamed from: e */
    public static VerificationTokenRequestParam m214311e(String str) {
        return m214312f(null, str);
    }

    /* JADX INFO: renamed from: f */
    public static VerificationTokenRequestParam m214312f(String str, String str2) {
        String str3 = (!NullChecker.m82486a(CoreModule.f18264c.f20381e0.f89056J3) || TextUtils.isEmpty(CoreModule.f18264c.f20381e0.f89056J3.get())) ? "" : CoreModule.f18264c.f20381e0.f89056J3.get();
        f197571b = str3;
        return VerificationTokenRequestParam.builder().useCoreTemplate(str2, str, str3).build();
    }

    @TestOnly
    /* JADX INFO: renamed from: g */
    public static void m214313g() {
        f197570a = !f197570a;
    }
}
