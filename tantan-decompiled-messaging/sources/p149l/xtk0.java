package p149l;

import android.text.TextUtils;
import com.tantanapp.common.utils.CrashHelper;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class xtk0 {
    /* JADX INFO: renamed from: a */
    public static void m210978a(String str, String str2, String str3, String str4) {
        List<o6j0.C18854a> listM210981d = m210981d(str2, str, str3, str4);
        o6j0.m162870n("e_verification_scanface_finish", "p_profile_picture_verification_pageShow", (o6j0.C18854a[]) listM210981d.toArray(new o6j0.C18854a[listM210981d.size()]));
    }

    /* JADX INFO: renamed from: b */
    public static void m210979b(String str, String str2) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(o6j0.C18854a.m162878h("verification_type", str2));
        if (TextUtils.equals(str, "fakeBatch") || TextUtils.equals(str, "fromPicVerificationDlg") || TextUtils.equals(str, "fromNameVerificationDlg")) {
            arrayList.add(o6j0.C18854a.m162878h("verification_function", rwk0.m181423f(str)));
            arrayList.add(o6j0.C18854a.m162878h("verification_scene", rwk0.m181424g(str)));
        }
        o6j0.m162870n("e_verification_scanface_request", "p_profile_picture_verification_pageShow", (o6j0.C18854a[]) arrayList.toArray(new o6j0.C18854a[arrayList.size()]));
    }

    /* JADX INFO: renamed from: c */
    public static void m210980c(String str, String str2, String str3, String str4) {
        List<o6j0.C18854a> listM210981d = m210981d(str2, str, str3, str4);
        o6j0.m162870n("e_verification_scanface_finish", "p_profile_picture_verification_pageShow", (o6j0.C18854a[]) listM210981d.toArray(new o6j0.C18854a[listM210981d.size()]));
    }

    /* JADX INFO: renamed from: d */
    public static List<o6j0.C18854a> m210981d(String str, String str2, String str3, String str4) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(o6j0.C18854a.m162878h("sdk_name", str));
        arrayList.add(o6j0.C18854a.m162878h("verification_result_code", str2));
        arrayList.add(o6j0.C18854a.m162878h("verification_type", str3));
        if (!TextUtils.equals(str4, "fakeBatch") && !TextUtils.equals(str4, "fromPicVerificationDlg") && !TextUtils.equals(str4, "fromNameVerificationDlg")) {
            return arrayList;
        }
        arrayList.add(o6j0.C18854a.m162878h("verification_function", rwk0.m181423f(str4)));
        arrayList.add(o6j0.C18854a.m162878h("verification_scene", rwk0.m181424g(str4)));
        return arrayList;
    }

    /* JADX INFO: renamed from: e */
    public static void m210982e(String str, String str2, String str3) {
        o6j0.m162859c("e_profile_picture_verification_page_sc", "p_profile_picture_verification_pageShow", o6j0.C18854a.m162878h("result_code", str), o6j0.C18854a.m162878h("sdk_name", str2), o6j0.C18854a.m162878h("verification_type", str3));
    }

    /* JADX INFO: renamed from: f */
    public static void m210983f(String str, String str2, String str3) {
        o6j0.m162859c("e_profile_picture_verification_page_sc", "p_profile_picture_verification_pageShow", o6j0.C18854a.m162878h("id_verification_result_code", str), o6j0.C18854a.m162878h("result_code", str), o6j0.C18854a.m162878h("sdk_name", str2), o6j0.C18854a.m162878h("verification_type", str3));
    }

    /* JADX INFO: renamed from: g */
    public static void m210984g(String str, String str2, String str3, String str4) {
        List<o6j0.C18854a> listM210981d = m210981d(str2, str, str3, str4);
        o6j0.m162870n("e_verification_scanface_finish", "p_profile_picture_verification_pageShow", (o6j0.C18854a[]) listM210981d.toArray(new o6j0.C18854a[listM210981d.size()]));
    }

    /* JADX INFO: renamed from: h */
    public static void m210985h(String str, String str2, String str3, String str4) {
        List<o6j0.C18854a> listM210981d = m210981d(str, "0", str2, str4);
        o6j0.m162870n("e_verification_scanface_finish", "p_profile_picture_verification_pageShow", (o6j0.C18854a[]) listM210981d.toArray(new o6j0.C18854a[listM210981d.size()]));
        xvf0.m211281c("e_avatar_verification_upload_review", "sdk_name", str, "verification_type", str3);
    }

    /* JADX INFO: renamed from: i */
    public static void m210986i(String str, String str2, String str3) {
        List<o6j0.C18854a> listM210981d = m210981d(str, "0", str2, str3);
        o6j0.m162870n("e_verification_scanface_submit", "p_profile_picture_verification_pageShow", (o6j0.C18854a[]) listM210981d.toArray(new o6j0.C18854a[listM210981d.size()]));
    }

    /* JADX INFO: renamed from: j */
    public static void m210987j(String str, String str2, String str3, String str4) {
        List<o6j0.C18854a> listM210981d = m210981d(str, str2, str3, str4);
        o6j0.m162870n("e_verification_scanface_submit", "p_profile_picture_verification_pageShow", (o6j0.C18854a[]) listM210981d.toArray(new o6j0.C18854a[listM210981d.size()]));
    }

    /* JADX INFO: renamed from: k */
    public static void m210988k(String str, String str2, String str3, String str4) {
        List<o6j0.C18854a> listM210981d = m210981d(str, str2, str3, str4);
        o6j0.m162870n("e_verification_scanface_token", "p_profile_picture_verification_pageShow", (o6j0.C18854a[]) listM210981d.toArray(new o6j0.C18854a[listM210981d.size()]));
    }

    /* JADX INFO: renamed from: l */
    public static void m210989l(String str, String str2, String str3) {
        List<o6j0.C18854a> listM210981d = m210981d(str, "0", str2, str3);
        o6j0.m162870n("e_verification_scanface_token", "p_profile_picture_verification_pageShow", (o6j0.C18854a[]) listM210981d.toArray(new o6j0.C18854a[listM210981d.size()]));
    }

    /* JADX INFO: renamed from: m */
    public static void m210990m(String str, String str2, String str3, String str4) {
        List<o6j0.C18854a> listM210981d = m210981d(str, "0", str2, str3);
        o6j0.m162870n("e_verification_scanface_sdk", "p_profile_picture_verification_pageShow", (o6j0.C18854a[]) listM210981d.toArray(new o6j0.C18854a[listM210981d.size()]));
        zvf0.m220368A("e_profile_picture_verification_pageShow_on", "p_profile_picture_verification_pageShow", vwb.m200311Y("sdk_name", str), vwb.m200311Y("show_from", str3), vwb.m200311Y("verification_type", str4));
    }

    /* JADX INFO: renamed from: n */
    public static void m210991n(String str, String str2, String str3, String str4) {
        List<o6j0.C18854a> listM210981d = m210981d(str, str2, str3, str4);
        o6j0.m162870n("e_verification_scanface_sdk", "p_profile_picture_verification_pageShow", (o6j0.C18854a[]) listM210981d.toArray(new o6j0.C18854a[listM210981d.size()]));
    }

    /* JADX INFO: renamed from: o */
    public static void m210992o(String str, String str2, String str3) {
        o6j0.m162859c("e_profile_picture_verification_page_sc", "p_profile_picture_verification_pageShow", o6j0.C18854a.m162878h("id_verification_result_code", str), o6j0.C18854a.m162878h("result_code", str), o6j0.C18854a.m162878h("sdk_name", str2), o6j0.C18854a.m162878h("verification_type", str3));
    }

    /* JADX INFO: renamed from: p */
    public static void m210993p(String str, String str2, String str3) {
        o6j0.m162859c("e_profile_picture_verification_page_sc", "p_profile_picture_verification_pageShow", o6j0.C18854a.m162878h("result_code", str), o6j0.C18854a.m162878h("sdk_name", str2), o6j0.C18854a.m162878h("verification_type", str3));
    }

    /* JADX INFO: renamed from: q */
    public static void m210994q(String str, String str2) {
        o6j0.m162870n("e_verification_scanface_sdk", "p_profile_picture_verification_pageShow", o6j0.C18854a.m162878h("sdk_name", str), o6j0.C18854a.m162878h("verification_result_code", "0"), o6j0.C18854a.m162878h("verification_type", str2));
    }

    /* JADX INFO: renamed from: r */
    public static void m210995r(String str, String str2, String str3, String str4) {
        List<o6j0.C18854a> listM210981d = m210981d(str2, str, str3, str4);
        o6j0.m162870n("e_verification_scanface_finish", "p_profile_picture_verification_pageShow", (o6j0.C18854a[]) listM210981d.toArray(new o6j0.C18854a[listM210981d.size()]));
    }

    /* JADX INFO: renamed from: s */
    public static void m210996s(String str, String str2, String str3, String str4) {
        List<o6j0.C18854a> listM210981d = m210981d(str, "0", str2, str4);
        o6j0.m162870n("e_verification_scanface_finish", "p_profile_picture_verification_pageShow", (o6j0.C18854a[]) listM210981d.toArray(new o6j0.C18854a[listM210981d.size()]));
        xvf0.m211281c("e_avatar_verification_upload_review", "sdk_name", str, "verification_type", str3);
    }

    /* JADX INFO: renamed from: t */
    public static void m210997t(String str, String str2, String str3) {
        List<o6j0.C18854a> listM210981d = m210981d(str, "0", str2, str3);
        o6j0.m162870n("e_verification_scanface_submit", "p_profile_picture_verification_pageShow", (o6j0.C18854a[]) listM210981d.toArray(new o6j0.C18854a[listM210981d.size()]));
    }

    /* JADX INFO: renamed from: u */
    public static void m210998u(String str, String str2, String str3, String str4) {
        List<o6j0.C18854a> listM210981d = m210981d(str2, str, str3, str4);
        o6j0.m162870n("e_verification_scanface_submit", "p_profile_picture_verification_pageShow", (o6j0.C18854a[]) listM210981d.toArray(new o6j0.C18854a[listM210981d.size()]));
    }

    /* JADX INFO: renamed from: v */
    public static void m210999v(String str, String str2, String str3) {
        List<o6j0.C18854a> listM210981d = m210981d(str, "0", str2, str3);
        o6j0.m162870n("e_verification_scanface_submit", "p_profile_picture_verification_pageShow", (o6j0.C18854a[]) listM210981d.toArray(new o6j0.C18854a[listM210981d.size()]));
    }

    /* JADX INFO: renamed from: w */
    public static void m211000w(String str, String str2, String str3, String str4) {
        List<o6j0.C18854a> listM210981d = m210981d(str, str2, str3, str4);
        o6j0.m162870n("e_verification_scanface_submit", "p_profile_picture_verification_pageShow", (o6j0.C18854a[]) listM210981d.toArray(new o6j0.C18854a[listM210981d.size()]));
    }

    /* JADX INFO: renamed from: x */
    public static void m211001x(String str, String str2, String str3, String str4) {
        List<o6j0.C18854a> listM210981d = m210981d(str2, str, str3, str4);
        o6j0.m162870n("e_verification_scanface_finish", "p_profile_picture_verification_pageShow", (o6j0.C18854a[]) listM210981d.toArray(new o6j0.C18854a[listM210981d.size()]));
    }

    /* JADX INFO: renamed from: y */
    public static void m211002y(String str, String str2, String str3) {
        List<o6j0.C18854a> listM210981d = m210981d(str, "0", str2, str3);
        o6j0.m162870n("e_verification_scanface_finish", "p_profile_picture_verification_pageShow", (o6j0.C18854a[]) listM210981d.toArray(new o6j0.C18854a[listM210981d.size()]));
    }

    /* JADX INFO: renamed from: z */
    public static void m211003z(String str, Throwable th) {
        CrashHelper.m81297d(th == null ? new Exception(str) : new Exception(str, th), 50);
    }
}
