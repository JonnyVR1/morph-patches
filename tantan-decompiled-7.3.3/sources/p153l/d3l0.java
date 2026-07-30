package p153l;

import android.text.TextUtils;
import com.tantanapp.common.utils.CrashHelper;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class d3l0 {
    /* JADX INFO: renamed from: a */
    public static void m113844a(String str, String str2, String str3, String str4) {
        List<sfj0.C20032a> listM113847d = m113847d(str2, str, str3, str4);
        sfj0.m185607n("e_verification_scanface_finish", "p_profile_picture_verification_pageShow", (sfj0.C20032a[]) listM113847d.toArray(new sfj0.C20032a[listM113847d.size()]));
    }

    /* JADX INFO: renamed from: b */
    public static void m113845b(String str, String str2) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(sfj0.C20032a.m185615h("verification_type", str2));
        if (TextUtils.equals(str, "fakeBatch") || TextUtils.equals(str, "fromPicVerificationDlg") || TextUtils.equals(str, "fromNameVerificationDlg")) {
            arrayList.add(sfj0.C20032a.m185615h("verification_function", x5l0.m209393f(str)));
            arrayList.add(sfj0.C20032a.m185615h("verification_scene", x5l0.m209394g(str)));
        }
        sfj0.m185607n("e_verification_scanface_request", "p_profile_picture_verification_pageShow", (sfj0.C20032a[]) arrayList.toArray(new sfj0.C20032a[arrayList.size()]));
    }

    /* JADX INFO: renamed from: c */
    public static void m113846c(String str, String str2, String str3, String str4) {
        List<sfj0.C20032a> listM113847d = m113847d(str2, str, str3, str4);
        sfj0.m185607n("e_verification_scanface_finish", "p_profile_picture_verification_pageShow", (sfj0.C20032a[]) listM113847d.toArray(new sfj0.C20032a[listM113847d.size()]));
    }

    /* JADX INFO: renamed from: d */
    public static List<sfj0.C20032a> m113847d(String str, String str2, String str3, String str4) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(sfj0.C20032a.m185615h("sdk_name", str));
        arrayList.add(sfj0.C20032a.m185615h("verification_result_code", str2));
        arrayList.add(sfj0.C20032a.m185615h("verification_type", str3));
        if (!TextUtils.equals(str4, "fakeBatch") && !TextUtils.equals(str4, "fromPicVerificationDlg") && !TextUtils.equals(str4, "fromNameVerificationDlg")) {
            return arrayList;
        }
        arrayList.add(sfj0.C20032a.m185615h("verification_function", x5l0.m209393f(str4)));
        arrayList.add(sfj0.C20032a.m185615h("verification_scene", x5l0.m209394g(str4)));
        return arrayList;
    }

    /* JADX INFO: renamed from: e */
    public static void m113848e(String str, String str2, String str3) {
        sfj0.m185596c("e_profile_picture_verification_page_sc", "p_profile_picture_verification_pageShow", sfj0.C20032a.m185615h("result_code", str), sfj0.C20032a.m185615h("sdk_name", str2), sfj0.C20032a.m185615h("verification_type", str3));
    }

    /* JADX INFO: renamed from: f */
    public static void m113849f(String str, String str2, String str3) {
        sfj0.m185596c("e_profile_picture_verification_page_sc", "p_profile_picture_verification_pageShow", sfj0.C20032a.m185615h("id_verification_result_code", str), sfj0.C20032a.m185615h("result_code", str), sfj0.C20032a.m185615h("sdk_name", str2), sfj0.C20032a.m185615h("verification_type", str3));
    }

    /* JADX INFO: renamed from: g */
    public static void m113850g(String str, String str2, String str3, String str4) {
        List<sfj0.C20032a> listM113847d = m113847d(str2, str, str3, str4);
        sfj0.m185607n("e_verification_scanface_finish", "p_profile_picture_verification_pageShow", (sfj0.C20032a[]) listM113847d.toArray(new sfj0.C20032a[listM113847d.size()]));
    }

    /* JADX INFO: renamed from: h */
    public static void m113851h(String str, String str2, String str3, String str4) {
        List<sfj0.C20032a> listM113847d = m113847d(str, "0", str2, str4);
        sfj0.m185607n("e_verification_scanface_finish", "p_profile_picture_verification_pageShow", (sfj0.C20032a[]) listM113847d.toArray(new sfj0.C20032a[listM113847d.size()]));
        g4g0.m128880c("e_avatar_verification_upload_review", "sdk_name", str, "verification_type", str3);
    }

    /* JADX INFO: renamed from: i */
    public static void m113852i(String str, String str2, String str3) {
        List<sfj0.C20032a> listM113847d = m113847d(str, "0", str2, str3);
        sfj0.m185607n("e_verification_scanface_submit", "p_profile_picture_verification_pageShow", (sfj0.C20032a[]) listM113847d.toArray(new sfj0.C20032a[listM113847d.size()]));
    }

    /* JADX INFO: renamed from: j */
    public static void m113853j(String str, String str2, String str3, String str4) {
        List<sfj0.C20032a> listM113847d = m113847d(str, str2, str3, str4);
        sfj0.m185607n("e_verification_scanface_submit", "p_profile_picture_verification_pageShow", (sfj0.C20032a[]) listM113847d.toArray(new sfj0.C20032a[listM113847d.size()]));
    }

    /* JADX INFO: renamed from: k */
    public static void m113854k(String str, String str2, String str3, String str4) {
        List<sfj0.C20032a> listM113847d = m113847d(str, str2, str3, str4);
        sfj0.m185607n("e_verification_scanface_token", "p_profile_picture_verification_pageShow", (sfj0.C20032a[]) listM113847d.toArray(new sfj0.C20032a[listM113847d.size()]));
    }

    /* JADX INFO: renamed from: l */
    public static void m113855l(String str, String str2, String str3) {
        List<sfj0.C20032a> listM113847d = m113847d(str, "0", str2, str3);
        sfj0.m185607n("e_verification_scanface_token", "p_profile_picture_verification_pageShow", (sfj0.C20032a[]) listM113847d.toArray(new sfj0.C20032a[listM113847d.size()]));
    }

    /* JADX INFO: renamed from: m */
    public static void m113856m(String str, String str2, String str3, String str4) {
        List<sfj0.C20032a> listM113847d = m113847d(str, "0", str2, str3);
        sfj0.m185607n("e_verification_scanface_sdk", "p_profile_picture_verification_pageShow", (sfj0.C20032a[]) listM113847d.toArray(new sfj0.C20032a[listM113847d.size()]));
        i4g0.m138492A("e_profile_picture_verification_pageShow_on", "p_profile_picture_verification_pageShow", jyb.m147494Y("sdk_name", str), jyb.m147494Y("show_from", str3), jyb.m147494Y("verification_type", str4));
    }

    /* JADX INFO: renamed from: n */
    public static void m113857n(String str, String str2, String str3, String str4) {
        List<sfj0.C20032a> listM113847d = m113847d(str, str2, str3, str4);
        sfj0.m185607n("e_verification_scanface_sdk", "p_profile_picture_verification_pageShow", (sfj0.C20032a[]) listM113847d.toArray(new sfj0.C20032a[listM113847d.size()]));
    }

    /* JADX INFO: renamed from: o */
    public static void m113858o(String str, String str2, String str3) {
        sfj0.m185596c("e_profile_picture_verification_page_sc", "p_profile_picture_verification_pageShow", sfj0.C20032a.m185615h("id_verification_result_code", str), sfj0.C20032a.m185615h("result_code", str), sfj0.C20032a.m185615h("sdk_name", str2), sfj0.C20032a.m185615h("verification_type", str3));
    }

    /* JADX INFO: renamed from: p */
    public static void m113859p(String str, String str2, String str3) {
        sfj0.m185596c("e_profile_picture_verification_page_sc", "p_profile_picture_verification_pageShow", sfj0.C20032a.m185615h("result_code", str), sfj0.C20032a.m185615h("sdk_name", str2), sfj0.C20032a.m185615h("verification_type", str3));
    }

    /* JADX INFO: renamed from: q */
    public static void m113860q(String str, String str2) {
        sfj0.m185607n("e_verification_scanface_sdk", "p_profile_picture_verification_pageShow", sfj0.C20032a.m185615h("sdk_name", str), sfj0.C20032a.m185615h("verification_result_code", "0"), sfj0.C20032a.m185615h("verification_type", str2));
    }

    /* JADX INFO: renamed from: r */
    public static void m113861r(String str, String str2, String str3, String str4) {
        List<sfj0.C20032a> listM113847d = m113847d(str2, str, str3, str4);
        sfj0.m185607n("e_verification_scanface_finish", "p_profile_picture_verification_pageShow", (sfj0.C20032a[]) listM113847d.toArray(new sfj0.C20032a[listM113847d.size()]));
    }

    /* JADX INFO: renamed from: s */
    public static void m113862s(String str, String str2, String str3, String str4) {
        List<sfj0.C20032a> listM113847d = m113847d(str, "0", str2, str4);
        sfj0.m185607n("e_verification_scanface_finish", "p_profile_picture_verification_pageShow", (sfj0.C20032a[]) listM113847d.toArray(new sfj0.C20032a[listM113847d.size()]));
        g4g0.m128880c("e_avatar_verification_upload_review", "sdk_name", str, "verification_type", str3);
    }

    /* JADX INFO: renamed from: t */
    public static void m113863t(String str, String str2, String str3) {
        List<sfj0.C20032a> listM113847d = m113847d(str, "0", str2, str3);
        sfj0.m185607n("e_verification_scanface_submit", "p_profile_picture_verification_pageShow", (sfj0.C20032a[]) listM113847d.toArray(new sfj0.C20032a[listM113847d.size()]));
    }

    /* JADX INFO: renamed from: u */
    public static void m113864u(String str, String str2, String str3, String str4) {
        List<sfj0.C20032a> listM113847d = m113847d(str2, str, str3, str4);
        sfj0.m185607n("e_verification_scanface_submit", "p_profile_picture_verification_pageShow", (sfj0.C20032a[]) listM113847d.toArray(new sfj0.C20032a[listM113847d.size()]));
    }

    /* JADX INFO: renamed from: v */
    public static void m113865v(String str, String str2, String str3) {
        List<sfj0.C20032a> listM113847d = m113847d(str, "0", str2, str3);
        sfj0.m185607n("e_verification_scanface_submit", "p_profile_picture_verification_pageShow", (sfj0.C20032a[]) listM113847d.toArray(new sfj0.C20032a[listM113847d.size()]));
    }

    /* JADX INFO: renamed from: w */
    public static void m113866w(String str, String str2, String str3, String str4) {
        List<sfj0.C20032a> listM113847d = m113847d(str, str2, str3, str4);
        sfj0.m185607n("e_verification_scanface_submit", "p_profile_picture_verification_pageShow", (sfj0.C20032a[]) listM113847d.toArray(new sfj0.C20032a[listM113847d.size()]));
    }

    /* JADX INFO: renamed from: x */
    public static void m113867x(String str, String str2, String str3, String str4) {
        List<sfj0.C20032a> listM113847d = m113847d(str2, str, str3, str4);
        sfj0.m185607n("e_verification_scanface_finish", "p_profile_picture_verification_pageShow", (sfj0.C20032a[]) listM113847d.toArray(new sfj0.C20032a[listM113847d.size()]));
    }

    /* JADX INFO: renamed from: y */
    public static void m113868y(String str, String str2, String str3) {
        List<sfj0.C20032a> listM113847d = m113847d(str, "0", str2, str3);
        sfj0.m185607n("e_verification_scanface_finish", "p_profile_picture_verification_pageShow", (sfj0.C20032a[]) listM113847d.toArray(new sfj0.C20032a[listM113847d.size()]));
    }

    /* JADX INFO: renamed from: z */
    public static void m113869z(String str, Throwable th) {
        CrashHelper.m82480d(th == null ? new Exception(str) : new Exception(str, th), 50);
    }
}
