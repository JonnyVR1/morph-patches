package p006l;

import android.text.TextUtils;
import com.tantanapp.common.utils.CrashHelper;
import java.util.ArrayList;
import java.util.List;
import l.j760;
import l.o6j0;
import l.vwb;
import l.xvf0;
import l.zvf0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class xtk0 {
    /* JADX INFO: renamed from: a */
    public static void m27606a(String str, String str2, String str3, String str4) {
        List<o6j0.a> listM27609d = m27609d(str2, str, str3, str4);
        o6j0.n("e_verification_scanface_finish", "p_profile_picture_verification_pageShow", (o6j0.a[]) listM27609d.toArray(new o6j0.a[listM27609d.size()]));
    }

    /* JADX INFO: renamed from: b */
    public static void m27607b(String str, String str2) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(o6j0.a.h("verification_type", str2));
        if (TextUtils.equals(str, "fakeBatch") || TextUtils.equals(str, "fromPicVerificationDlg") || TextUtils.equals(str, "fromNameVerificationDlg")) {
            arrayList.add(o6j0.a.h("verification_function", rwk0.m23347f(str)));
            arrayList.add(o6j0.a.h("verification_scene", rwk0.m23348g(str)));
        }
        o6j0.n("e_verification_scanface_request", "p_profile_picture_verification_pageShow", (o6j0.a[]) arrayList.toArray(new o6j0.a[arrayList.size()]));
    }

    /* JADX INFO: renamed from: c */
    public static void m27608c(String str, String str2, String str3, String str4) {
        List<o6j0.a> listM27609d = m27609d(str2, str, str3, str4);
        o6j0.n("e_verification_scanface_finish", "p_profile_picture_verification_pageShow", (o6j0.a[]) listM27609d.toArray(new o6j0.a[listM27609d.size()]));
    }

    /* JADX INFO: renamed from: d */
    public static List<o6j0.a> m27609d(String str, String str2, String str3, String str4) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(o6j0.a.h("sdk_name", str));
        arrayList.add(o6j0.a.h("verification_result_code", str2));
        arrayList.add(o6j0.a.h("verification_type", str3));
        if (!TextUtils.equals(str4, "fakeBatch") && !TextUtils.equals(str4, "fromPicVerificationDlg") && !TextUtils.equals(str4, "fromNameVerificationDlg")) {
            return arrayList;
        }
        arrayList.add(o6j0.a.h("verification_function", rwk0.m23347f(str4)));
        arrayList.add(o6j0.a.h("verification_scene", rwk0.m23348g(str4)));
        return arrayList;
    }

    /* JADX INFO: renamed from: e */
    public static void m27610e(String str, String str2, String str3) {
        o6j0.c("e_profile_picture_verification_page_sc", "p_profile_picture_verification_pageShow", new o6j0.a[]{o6j0.a.h("result_code", str), o6j0.a.h("sdk_name", str2), o6j0.a.h("verification_type", str3)});
    }

    /* JADX INFO: renamed from: f */
    public static void m27611f(String str, String str2, String str3) {
        o6j0.c("e_profile_picture_verification_page_sc", "p_profile_picture_verification_pageShow", new o6j0.a[]{o6j0.a.h("id_verification_result_code", str), o6j0.a.h("result_code", str), o6j0.a.h("sdk_name", str2), o6j0.a.h("verification_type", str3)});
    }

    /* JADX INFO: renamed from: g */
    public static void m27612g(String str, String str2, String str3, String str4) {
        List<o6j0.a> listM27609d = m27609d(str2, str, str3, str4);
        o6j0.n("e_verification_scanface_finish", "p_profile_picture_verification_pageShow", (o6j0.a[]) listM27609d.toArray(new o6j0.a[listM27609d.size()]));
    }

    /* JADX INFO: renamed from: h */
    public static void m27613h(String str, String str2, String str3, String str4) {
        List<o6j0.a> listM27609d = m27609d(str, "0", str2, str4);
        o6j0.n("e_verification_scanface_finish", "p_profile_picture_verification_pageShow", (o6j0.a[]) listM27609d.toArray(new o6j0.a[listM27609d.size()]));
        xvf0.c("e_avatar_verification_upload_review", new Object[]{"sdk_name", str, "verification_type", str3});
    }

    /* JADX INFO: renamed from: i */
    public static void m27614i(String str, String str2, String str3) {
        List<o6j0.a> listM27609d = m27609d(str, "0", str2, str3);
        o6j0.n("e_verification_scanface_submit", "p_profile_picture_verification_pageShow", (o6j0.a[]) listM27609d.toArray(new o6j0.a[listM27609d.size()]));
    }

    /* JADX INFO: renamed from: j */
    public static void m27615j(String str, String str2, String str3, String str4) {
        List<o6j0.a> listM27609d = m27609d(str, str2, str3, str4);
        o6j0.n("e_verification_scanface_submit", "p_profile_picture_verification_pageShow", (o6j0.a[]) listM27609d.toArray(new o6j0.a[listM27609d.size()]));
    }

    /* JADX INFO: renamed from: k */
    public static void m27616k(String str, String str2, String str3, String str4) {
        List<o6j0.a> listM27609d = m27609d(str, str2, str3, str4);
        o6j0.n("e_verification_scanface_token", "p_profile_picture_verification_pageShow", (o6j0.a[]) listM27609d.toArray(new o6j0.a[listM27609d.size()]));
    }

    /* JADX INFO: renamed from: l */
    public static void m27617l(String str, String str2, String str3) {
        List<o6j0.a> listM27609d = m27609d(str, "0", str2, str3);
        o6j0.n("e_verification_scanface_token", "p_profile_picture_verification_pageShow", (o6j0.a[]) listM27609d.toArray(new o6j0.a[listM27609d.size()]));
    }

    /* JADX INFO: renamed from: m */
    public static void m27618m(String str, String str2, String str3, String str4) {
        List<o6j0.a> listM27609d = m27609d(str, "0", str2, str3);
        o6j0.n("e_verification_scanface_sdk", "p_profile_picture_verification_pageShow", (o6j0.a[]) listM27609d.toArray(new o6j0.a[listM27609d.size()]));
        zvf0.A("e_profile_picture_verification_pageShow_on", "p_profile_picture_verification_pageShow", new j760[]{vwb.Y("sdk_name", str), vwb.Y("show_from", str3), vwb.Y("verification_type", str4)});
    }

    /* JADX INFO: renamed from: n */
    public static void m27619n(String str, String str2, String str3, String str4) {
        List<o6j0.a> listM27609d = m27609d(str, str2, str3, str4);
        o6j0.n("e_verification_scanface_sdk", "p_profile_picture_verification_pageShow", (o6j0.a[]) listM27609d.toArray(new o6j0.a[listM27609d.size()]));
    }

    /* JADX INFO: renamed from: o */
    public static void m27620o(String str, String str2, String str3) {
        o6j0.c("e_profile_picture_verification_page_sc", "p_profile_picture_verification_pageShow", new o6j0.a[]{o6j0.a.h("id_verification_result_code", str), o6j0.a.h("result_code", str), o6j0.a.h("sdk_name", str2), o6j0.a.h("verification_type", str3)});
    }

    /* JADX INFO: renamed from: p */
    public static void m27621p(String str, String str2, String str3) {
        o6j0.c("e_profile_picture_verification_page_sc", "p_profile_picture_verification_pageShow", new o6j0.a[]{o6j0.a.h("result_code", str), o6j0.a.h("sdk_name", str2), o6j0.a.h("verification_type", str3)});
    }

    /* JADX INFO: renamed from: q */
    public static void m27622q(String str, String str2) {
        o6j0.n("e_verification_scanface_sdk", "p_profile_picture_verification_pageShow", new o6j0.a[]{o6j0.a.h("sdk_name", str), o6j0.a.h("verification_result_code", "0"), o6j0.a.h("verification_type", str2)});
    }

    /* JADX INFO: renamed from: r */
    public static void m27623r(String str, String str2, String str3, String str4) {
        List<o6j0.a> listM27609d = m27609d(str2, str, str3, str4);
        o6j0.n("e_verification_scanface_finish", "p_profile_picture_verification_pageShow", (o6j0.a[]) listM27609d.toArray(new o6j0.a[listM27609d.size()]));
    }

    /* JADX INFO: renamed from: s */
    public static void m27624s(String str, String str2, String str3, String str4) {
        List<o6j0.a> listM27609d = m27609d(str, "0", str2, str4);
        o6j0.n("e_verification_scanface_finish", "p_profile_picture_verification_pageShow", (o6j0.a[]) listM27609d.toArray(new o6j0.a[listM27609d.size()]));
        xvf0.c("e_avatar_verification_upload_review", new Object[]{"sdk_name", str, "verification_type", str3});
    }

    /* JADX INFO: renamed from: t */
    public static void m27625t(String str, String str2, String str3) {
        List<o6j0.a> listM27609d = m27609d(str, "0", str2, str3);
        o6j0.n("e_verification_scanface_submit", "p_profile_picture_verification_pageShow", (o6j0.a[]) listM27609d.toArray(new o6j0.a[listM27609d.size()]));
    }

    /* JADX INFO: renamed from: u */
    public static void m27626u(String str, String str2, String str3, String str4) {
        List<o6j0.a> listM27609d = m27609d(str2, str, str3, str4);
        o6j0.n("e_verification_scanface_submit", "p_profile_picture_verification_pageShow", (o6j0.a[]) listM27609d.toArray(new o6j0.a[listM27609d.size()]));
    }

    /* JADX INFO: renamed from: v */
    public static void m27627v(String str, String str2, String str3) {
        List<o6j0.a> listM27609d = m27609d(str, "0", str2, str3);
        o6j0.n("e_verification_scanface_submit", "p_profile_picture_verification_pageShow", (o6j0.a[]) listM27609d.toArray(new o6j0.a[listM27609d.size()]));
    }

    /* JADX INFO: renamed from: w */
    public static void m27628w(String str, String str2, String str3, String str4) {
        List<o6j0.a> listM27609d = m27609d(str, str2, str3, str4);
        o6j0.n("e_verification_scanface_submit", "p_profile_picture_verification_pageShow", (o6j0.a[]) listM27609d.toArray(new o6j0.a[listM27609d.size()]));
    }

    /* JADX INFO: renamed from: x */
    public static void m27629x(String str, String str2, String str3, String str4) {
        List<o6j0.a> listM27609d = m27609d(str2, str, str3, str4);
        o6j0.n("e_verification_scanface_finish", "p_profile_picture_verification_pageShow", (o6j0.a[]) listM27609d.toArray(new o6j0.a[listM27609d.size()]));
    }

    /* JADX INFO: renamed from: y */
    public static void m27630y(String str, String str2, String str3) {
        List<o6j0.a> listM27609d = m27609d(str, "0", str2, str3);
        o6j0.n("e_verification_scanface_finish", "p_profile_picture_verification_pageShow", (o6j0.a[]) listM27609d.toArray(new o6j0.a[listM27609d.size()]));
    }

    /* JADX INFO: renamed from: z */
    public static void m27631z(String str, Throwable th) {
        CrashHelper.d(th == null ? new Exception(str) : new Exception(str, th), 50);
    }
}
