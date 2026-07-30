package com.p051p1.mobile.putong.p070ui.webview.p073mk;

import android.net.Uri;
import android.text.TextUtils;
import com.tantanapp.common.utils.CrashHelper;
import com.tencent.connect.common.Constants;
import java.util.ArrayList;
import java.util.List;
import p153l.bnl0;
import p153l.lhl;
import p153l.y20;

/* JADX INFO: loaded from: classes10.dex */
public class CommonH5Builder {

    /* JADX INFO: renamed from: a */
    public boolean f55613a;

    /* JADX INFO: renamed from: c */
    public boolean f55615c;

    /* JADX INFO: renamed from: d */
    public BgType f55616d;

    /* JADX INFO: renamed from: e */
    public int f55617e;

    /* JADX INFO: renamed from: f */
    public int f55618f;

    /* JADX INFO: renamed from: g */
    public int f55619g;

    /* JADX INFO: renamed from: i */
    public boolean f55621i;

    /* JADX INFO: renamed from: k */
    public y20<String> f55623k;

    /* JADX INFO: renamed from: b */
    public String f55614b = "";

    /* JADX INFO: renamed from: h */
    public int f55620h = 0;

    /* JADX INFO: renamed from: j */
    public boolean f55622j = false;

    public enum BgType {
        DEFAULT_BG,
        TRAN_GRAY_BG,
        TRAN_BG
    }

    public CommonH5Builder(String str) {
        m81384j();
        m81381g(lhl.INSTANCE.m154223p(str));
    }

    /* JADX INFO: renamed from: a */
    public static int m81375a(Uri uri, String str, String str2) {
        String queryParameter;
        try {
            queryParameter = uri.getQueryParameter(str);
        } catch (Exception e) {
            CrashHelper.m82479c(e);
            queryParameter = null;
        }
        if (queryParameter != null) {
            str2 = queryParameter;
        }
        try {
            return Integer.parseInt(str2);
        } catch (NumberFormatException unused) {
            return Integer.parseInt(Constants.VIA_REPORT_TYPE_CHAT_AIO);
        }
    }

    /* JADX INFO: renamed from: b */
    public static int m81376b() {
        if (!m81379e()) {
            return bnl0.m105592y0();
        }
        if (bnl0.m105592y0() / 2 > 1080) {
            return bnl0.m105592y0() / 2;
        }
        return 1080;
    }

    /* JADX INFO: renamed from: c */
    public static String m81377c(Uri uri, String str, String str2) {
        String queryParameter;
        try {
            queryParameter = uri.getQueryParameter(str);
        } catch (Exception e) {
            CrashHelper.m82479c(e);
            queryParameter = null;
        }
        return queryParameter == null ? str2 : queryParameter;
    }

    /* JADX INFO: renamed from: d */
    public static List<Double> m81378d(Uri uri, String str, String str2) {
        String strM81377c = m81377c(uri, "widthRatio", str);
        String strM81377c2 = m81377c(uri, "heightRatio", str2);
        ArrayList arrayList = new ArrayList();
        arrayList.add(Double.valueOf(Double.parseDouble(strM81377c)));
        arrayList.add(Double.valueOf(Double.parseDouble(strM81377c2)));
        return arrayList;
    }

    /* JADX INFO: renamed from: e */
    public static boolean m81379e() {
        return bnl0.m105592y0() > 1080 && (((float) bnl0.m105592y0()) * 1.0f) / ((float) bnl0.m105588w0()) > 0.7f;
    }

    /* JADX INFO: renamed from: f */
    public static int m81380f(String str) {
        try {
            return Integer.parseInt(str);
        } catch (Exception e) {
            CrashHelper.m82479c(e);
            return 0;
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m81381g(String str) {
        Uri uri = Uri.parse(str);
        m81389o(str);
        m81386l(m81377c(uri, "needCloseBtn", "1"));
        m81382h(TextUtils.equals(m81377c(uri, "transparent", "0"), "1") ? BgType.TRAN_BG : BgType.DEFAULT_BG);
        m81383i(m81375a(uri, "cornerRadius", Constants.VIA_REPORT_TYPE_CHAT_AIO));
        String strM81377c = m81377c(uri, "gravity", "0");
        List<Double> listM81378d = TextUtils.equals(strM81377c, "1") ? m81378d(uri, "1.0", "0.75") : m81378d(uri, "0.86", "0.75");
        m81388n(listM81378d.get(0).doubleValue(), listM81378d.get(1).doubleValue());
        m81385k(strM81377c);
        m81387m(m81377c(uri, "needFullScreenMarginTop", "0"));
    }

    /* JADX INFO: renamed from: h */
    public CommonH5Builder m81382h(BgType bgType) {
        this.f55616d = bgType;
        return this;
    }

    /* JADX INFO: renamed from: i */
    public CommonH5Builder m81383i(int i) {
        this.f55620h = i;
        return this;
    }

    /* JADX INFO: renamed from: j */
    public final void m81384j() {
        this.f55618f = (int) (m81376b() * 0.86f);
        this.f55619g = (int) (bnl0.m105588w0() * 0.75f);
        this.f55617e = 17;
        this.f55616d = BgType.DEFAULT_BG;
    }

    /* JADX INFO: renamed from: k */
    public CommonH5Builder m81385k(String str) {
        int i = TextUtils.equals(str, "1") ? 80 : 17;
        this.f55617e = i;
        if (i == 80 && (this.f55618f == 0 || this.f55619g == 0)) {
            this.f55618f = m81376b();
            this.f55619g = (int) (bnl0.m105588w0() * 0.75f);
        }
        return this;
    }

    /* JADX INFO: renamed from: l */
    public CommonH5Builder m81386l(String str) {
        this.f55615c = m81380f(str) == 1;
        return this;
    }

    /* JADX INFO: renamed from: m */
    public CommonH5Builder m81387m(String str) {
        this.f55613a = TextUtils.equals("1", str);
        return this;
    }

    /* JADX INFO: renamed from: n */
    public CommonH5Builder m81388n(double d, double d2) {
        this.f55618f = (int) Math.round(((double) m81376b()) * d);
        this.f55619g = (int) Math.round(((double) (bnl0.m105588w0() + bnl0.m105511F0())) * d2);
        this.f55622j = d2 == 1.0d;
        return this;
    }

    /* JADX INFO: renamed from: o */
    public CommonH5Builder m81389o(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.f55614b = str;
        }
        return this;
    }
}
