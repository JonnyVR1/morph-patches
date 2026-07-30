package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.data.VerificationTokenRequestParam;
import com.tantanapp.common.utils.NullChecker;
import org.jetbrains.annotations.TestOnly;

/* JADX INFO: loaded from: classes9.dex */
public class swk0 {

    /* JADX INFO: renamed from: a */
    public static boolean f166701a = false;

    /* JADX INFO: renamed from: b */
    public static String f166702b = "";

    /* JADX INFO: renamed from: a */
    public static VerificationTokenRequestParam m186325a(String str, String str2, String str3) {
        return VerificationTokenRequestParam.builder().useCountryAccountBackTemplate(str, false, "", str2, str3).build();
    }

    /* JADX INFO: renamed from: b */
    public static VerificationTokenRequestParam m186326b(String str, String str2) {
        String str3 = (!NullChecker.m81303a(CoreModule.f17545c.f19639e0.f149199J3) || TextUtils.isEmpty(CoreModule.f17545c.f19639e0.f149199J3.get())) ? "" : CoreModule.f17545c.f19639e0.f149199J3.get();
        f166702b = str3;
        return VerificationTokenRequestParam.builder().useCountryTemplate(str2, str, str3).build();
    }

    /* JADX INFO: renamed from: c */
    public static String m186327c() {
        return f166702b;
    }

    /* JADX INFO: renamed from: d */
    public static VerificationTokenRequestParam m186328d(String str, String str2, String str3, boolean z, String str4) {
        String str5 = (!NullChecker.m81303a(CoreModule.f17545c.f19639e0.f149199J3) || TextUtils.isEmpty(CoreModule.f17545c.f19639e0.f149199J3.get())) ? "" : CoreModule.f17545c.f19639e0.f149199J3.get();
        f166702b = str5;
        return VerificationTokenRequestParam.builder().setIdName(str).setIdNumber(str2).useServerTemplate(str3, z, str5, str4).build();
    }

    /* JADX INFO: renamed from: e */
    public static VerificationTokenRequestParam m186329e(String str) {
        return m186330f(null, str);
    }

    /* JADX INFO: renamed from: f */
    public static VerificationTokenRequestParam m186330f(String str, String str2) {
        String str3 = (!NullChecker.m81303a(CoreModule.f17545c.f19639e0.f149199J3) || TextUtils.isEmpty(CoreModule.f17545c.f19639e0.f149199J3.get())) ? "" : CoreModule.f17545c.f19639e0.f149199J3.get();
        f166702b = str3;
        return VerificationTokenRequestParam.builder().useCoreTemplate(str2, str, str3).build();
    }

    @TestOnly
    /* JADX INFO: renamed from: g */
    public static void m186331g() {
        f166701a = !f166701a;
    }
}
