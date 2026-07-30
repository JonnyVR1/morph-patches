package com.p000p1.mobile.putong.p004ui.webview.p007mk;

import android.net.Uri;
import android.text.TextUtils;
import com.tantanapp.common.utils.CrashHelper;
import java.util.ArrayList;
import java.util.List;
import l.e30;
import l.xdl0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class CommonH5Builder {

    /* JADX INFO: renamed from: a */
    public boolean f8371a;

    /* JADX INFO: renamed from: c */
    public boolean f8373c;

    /* JADX INFO: renamed from: d */
    public BgType f8374d;

    /* JADX INFO: renamed from: e */
    public int f8375e;

    /* JADX INFO: renamed from: f */
    public int f8376f;

    /* JADX INFO: renamed from: g */
    public int f8377g;

    /* JADX INFO: renamed from: i */
    public boolean f8379i;

    /* JADX INFO: renamed from: k */
    public e30<String> f8381k;

    /* JADX INFO: renamed from: b */
    public String f8372b = "";

    /* JADX INFO: renamed from: h */
    public int f8378h = 0;

    /* JADX INFO: renamed from: j */
    public boolean f8380j = false;

    public enum BgType {
        DEFAULT_BG,
        TRAN_GRAY_BG,
        TRAN_BG
    }

    public CommonH5Builder(String str) {
        m10539j();
        m10536g(str);
    }

    /* JADX INFO: renamed from: a */
    public static int m10530a(Uri uri, String str, String str2) {
        String queryParameter;
        try {
            queryParameter = uri.getQueryParameter(str);
        } catch (Exception e) {
            CrashHelper.c(e);
            queryParameter = null;
        }
        if (queryParameter != null) {
            str2 = queryParameter;
        }
        try {
            return Integer.parseInt(str2);
        } catch (NumberFormatException unused) {
            return Integer.parseInt("24");
        }
    }

    /* JADX INFO: renamed from: b */
    public static int m10531b() {
        if (!m10534e()) {
            return xdl0.y0();
        }
        if (xdl0.y0() / 2 > 1080) {
            return xdl0.y0() / 2;
        }
        return 1080;
    }

    /* JADX INFO: renamed from: c */
    public static String m10532c(Uri uri, String str, String str2) {
        String queryParameter;
        try {
            queryParameter = uri.getQueryParameter(str);
        } catch (Exception e) {
            CrashHelper.c(e);
            queryParameter = null;
        }
        return queryParameter == null ? str2 : queryParameter;
    }

    /* JADX INFO: renamed from: d */
    public static List<Double> m10533d(Uri uri, String str, String str2) {
        String strM10532c = m10532c(uri, "widthRatio", str);
        String strM10532c2 = m10532c(uri, "heightRatio", str2);
        ArrayList arrayList = new ArrayList();
        arrayList.add(Double.valueOf(Double.parseDouble(strM10532c)));
        arrayList.add(Double.valueOf(Double.parseDouble(strM10532c2)));
        return arrayList;
    }

    /* JADX INFO: renamed from: e */
    public static boolean m10534e() {
        return xdl0.y0() > 1080 && (((float) xdl0.y0()) * 1.0f) / ((float) xdl0.w0()) > 0.7f;
    }

    /* JADX INFO: renamed from: f */
    public static int m10535f(String str) {
        try {
            return Integer.parseInt(str);
        } catch (Exception e) {
            CrashHelper.c(e);
            return 0;
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m10536g(String str) {
        Uri uri = Uri.parse(str);
        m10544o(str);
        m10541l(m10532c(uri, "needCloseBtn", "1"));
        m10537h(TextUtils.equals(m10532c(uri, "transparent", "0"), "1") ? BgType.TRAN_BG : BgType.DEFAULT_BG);
        m10538i(m10530a(uri, "cornerRadius", "24"));
        String strM10532c = m10532c(uri, "gravity", "0");
        List<Double> listM10533d = TextUtils.equals(strM10532c, "1") ? m10533d(uri, "1.0", "0.75") : m10533d(uri, "0.86", "0.75");
        m10543n(listM10533d.get(0).doubleValue(), listM10533d.get(1).doubleValue());
        m10540k(strM10532c);
        m10542m(m10532c(uri, "needFullScreenMarginTop", "0"));
    }

    /* JADX INFO: renamed from: h */
    public CommonH5Builder m10537h(BgType bgType) {
        this.f8374d = bgType;
        return this;
    }

    /* JADX INFO: renamed from: i */
    public CommonH5Builder m10538i(int i) {
        this.f8378h = i;
        return this;
    }

    /* JADX INFO: renamed from: j */
    public final void m10539j() {
        this.f8376f = (int) (m10531b() * 0.86f);
        this.f8377g = (int) (xdl0.w0() * 0.75f);
        this.f8375e = 17;
        this.f8374d = BgType.DEFAULT_BG;
    }

    /* JADX INFO: renamed from: k */
    public CommonH5Builder m10540k(String str) {
        int i = TextUtils.equals(str, "1") ? 80 : 17;
        this.f8375e = i;
        if (i == 80 && (this.f8376f == 0 || this.f8377g == 0)) {
            this.f8376f = m10531b();
            this.f8377g = (int) (xdl0.w0() * 0.75f);
        }
        return this;
    }

    /* JADX INFO: renamed from: l */
    public CommonH5Builder m10541l(String str) {
        this.f8373c = m10535f(str) == 1;
        return this;
    }

    /* JADX INFO: renamed from: m */
    public CommonH5Builder m10542m(String str) {
        this.f8371a = TextUtils.equals("1", str);
        return this;
    }

    /* JADX INFO: renamed from: n */
    public CommonH5Builder m10543n(double d, double d2) {
        this.f8376f = (int) Math.round(((double) m10531b()) * d);
        this.f8377g = (int) Math.round(((double) (xdl0.w0() + xdl0.F0())) * d2);
        this.f8380j = d2 == 1.0d;
        return this;
    }

    /* JADX INFO: renamed from: o */
    public CommonH5Builder m10544o(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.f8372b = str;
        }
        return this;
    }
}
