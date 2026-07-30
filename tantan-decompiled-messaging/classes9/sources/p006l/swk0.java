package p006l;

import android.text.TextUtils;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.data.VerificationTokenRequestParam;
import com.tantanapp.common.utils.NullChecker;
import org.jetbrains.annotations.TestOnly;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class swk0 {

    /* JADX INFO: renamed from: a */
    public static boolean f21732a = false;

    /* JADX INFO: renamed from: b */
    public static String f21733b = "";

    /* JADX INFO: renamed from: a */
    public static VerificationTokenRequestParam m24375a(String str, String str2, String str3) {
        return VerificationTokenRequestParam.builder().useCountryAccountBackTemplate(str, false, "", str2, str3).build();
    }

    /* JADX INFO: renamed from: b */
    public static VerificationTokenRequestParam m24376b(String str, String str2) {
        String str3 = (!NullChecker.a(CoreModule.f1534c.f3628e0.f18811J3) || TextUtils.isEmpty((CharSequence) CoreModule.f1534c.f3628e0.f18811J3.get())) ? "" : (String) CoreModule.f1534c.f3628e0.f18811J3.get();
        f21733b = str3;
        return VerificationTokenRequestParam.builder().useCountryTemplate(str2, str, str3).build();
    }

    /* JADX INFO: renamed from: c */
    public static String m24377c() {
        return f21733b;
    }

    /* JADX INFO: renamed from: d */
    public static VerificationTokenRequestParam m24378d(String str, String str2, String str3, boolean z, String str4) {
        String str5 = (!NullChecker.a(CoreModule.f1534c.f3628e0.f18811J3) || TextUtils.isEmpty((CharSequence) CoreModule.f1534c.f3628e0.f18811J3.get())) ? "" : (String) CoreModule.f1534c.f3628e0.f18811J3.get();
        f21733b = str5;
        return VerificationTokenRequestParam.builder().setIdName(str).setIdNumber(str2).useServerTemplate(str3, z, str5, str4).build();
    }

    /* JADX INFO: renamed from: e */
    public static VerificationTokenRequestParam m24379e(String str) {
        return m24380f(null, str);
    }

    /* JADX INFO: renamed from: f */
    public static VerificationTokenRequestParam m24380f(String str, String str2) {
        String str3 = (!NullChecker.a(CoreModule.f1534c.f3628e0.f18811J3) || TextUtils.isEmpty((CharSequence) CoreModule.f1534c.f3628e0.f18811J3.get())) ? "" : (String) CoreModule.f1534c.f3628e0.f18811J3.get();
        f21733b = str3;
        return VerificationTokenRequestParam.builder().useCoreTemplate(str2, str, str3).build();
    }

    @TestOnly
    /* JADX INFO: renamed from: g */
    public static void m24381g() {
        f21732a = !f21732a;
    }
}
