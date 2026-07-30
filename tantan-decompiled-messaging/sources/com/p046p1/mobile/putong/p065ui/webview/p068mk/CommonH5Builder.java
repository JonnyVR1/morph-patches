package com.p046p1.mobile.putong.p065ui.webview.p068mk;

import android.net.Uri;
import android.text.TextUtils;
import com.tantanapp.common.utils.CrashHelper;
import com.tencent.connect.common.Constants;
import java.util.ArrayList;
import java.util.List;
import p149l.e30;
import p149l.xdl0;

/* JADX INFO: loaded from: classes11.dex */
public class CommonH5Builder {

    /* JADX INFO: renamed from: a */
    public boolean f54765a;

    /* JADX INFO: renamed from: c */
    public boolean f54767c;

    /* JADX INFO: renamed from: d */
    public BgType f54768d;

    /* JADX INFO: renamed from: e */
    public int f54769e;

    /* JADX INFO: renamed from: f */
    public int f54770f;

    /* JADX INFO: renamed from: g */
    public int f54771g;

    /* JADX INFO: renamed from: i */
    public boolean f54773i;

    /* JADX INFO: renamed from: k */
    public e30<String> f54775k;

    /* JADX INFO: renamed from: b */
    public String f54766b = "";

    /* JADX INFO: renamed from: h */
    public int f54772h = 0;

    /* JADX INFO: renamed from: j */
    public boolean f54774j = false;

    public enum BgType {
        DEFAULT_BG,
        TRAN_GRAY_BG,
        TRAN_BG
    }

    public CommonH5Builder(String str) {
        m80201j();
        m80198g(str);
    }

    /* JADX INFO: renamed from: a */
    public static int m80192a(Uri uri, String str, String str2) {
        String queryParameter;
        try {
            queryParameter = uri.getQueryParameter(str);
        } catch (Exception e) {
            CrashHelper.m81296c(e);
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
    public static int m80193b() {
        if (!m80196e()) {
            return xdl0.m208412y0();
        }
        if (xdl0.m208412y0() / 2 > 1080) {
            return xdl0.m208412y0() / 2;
        }
        return 1080;
    }

    /* JADX INFO: renamed from: c */
    public static String m80194c(Uri uri, String str, String str2) {
        String queryParameter;
        try {
            queryParameter = uri.getQueryParameter(str);
        } catch (Exception e) {
            CrashHelper.m81296c(e);
            queryParameter = null;
        }
        return queryParameter == null ? str2 : queryParameter;
    }

    /* JADX INFO: renamed from: d */
    public static List<Double> m80195d(Uri uri, String str, String str2) {
        String strM80194c = m80194c(uri, "widthRatio", str);
        String strM80194c2 = m80194c(uri, "heightRatio", str2);
        ArrayList arrayList = new ArrayList();
        arrayList.add(Double.valueOf(Double.parseDouble(strM80194c)));
        arrayList.add(Double.valueOf(Double.parseDouble(strM80194c2)));
        return arrayList;
    }

    /* JADX INFO: renamed from: e */
    public static boolean m80196e() {
        return xdl0.m208412y0() > 1080 && (((float) xdl0.m208412y0()) * 1.0f) / ((float) xdl0.m208408w0()) > 0.7f;
    }

    /* JADX INFO: renamed from: f */
    public static int m80197f(String str) {
        try {
            return Integer.parseInt(str);
        } catch (Exception e) {
            CrashHelper.m81296c(e);
            return 0;
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m80198g(String str) {
        Uri uri = Uri.parse(str);
        m80206o(str);
        m80203l(m80194c(uri, "needCloseBtn", "1"));
        m80199h(TextUtils.equals(m80194c(uri, "transparent", "0"), "1") ? BgType.TRAN_BG : BgType.DEFAULT_BG);
        m80200i(m80192a(uri, "cornerRadius", Constants.VIA_REPORT_TYPE_CHAT_AIO));
        String strM80194c = m80194c(uri, "gravity", "0");
        List<Double> listM80195d = TextUtils.equals(strM80194c, "1") ? m80195d(uri, "1.0", "0.75") : m80195d(uri, "0.86", "0.75");
        m80205n(listM80195d.get(0).doubleValue(), listM80195d.get(1).doubleValue());
        m80202k(strM80194c);
        m80204m(m80194c(uri, "needFullScreenMarginTop", "0"));
    }

    /* JADX INFO: renamed from: h */
    public CommonH5Builder m80199h(BgType bgType) {
        this.f54768d = bgType;
        return this;
    }

    /* JADX INFO: renamed from: i */
    public CommonH5Builder m80200i(int i) {
        this.f54772h = i;
        return this;
    }

    /* JADX INFO: renamed from: j */
    public final void m80201j() {
        this.f54770f = (int) (m80193b() * 0.86f);
        this.f54771g = (int) (xdl0.m208408w0() * 0.75f);
        this.f54769e = 17;
        this.f54768d = BgType.DEFAULT_BG;
    }

    /* JADX INFO: renamed from: k */
    public CommonH5Builder m80202k(String str) {
        int i = TextUtils.equals(str, "1") ? 80 : 17;
        this.f54769e = i;
        if (i == 80 && (this.f54770f == 0 || this.f54771g == 0)) {
            this.f54770f = m80193b();
            this.f54771g = (int) (xdl0.m208408w0() * 0.75f);
        }
        return this;
    }

    /* JADX INFO: renamed from: l */
    public CommonH5Builder m80203l(String str) {
        this.f54767c = m80197f(str) == 1;
        return this;
    }

    /* JADX INFO: renamed from: m */
    public CommonH5Builder m80204m(String str) {
        this.f54765a = TextUtils.equals("1", str);
        return this;
    }

    /* JADX INFO: renamed from: n */
    public CommonH5Builder m80205n(double d, double d2) {
        this.f54770f = (int) Math.round(((double) m80193b()) * d);
        this.f54771g = (int) Math.round(((double) (xdl0.m208408w0() + xdl0.m208331F0())) * d2);
        this.f54774j = d2 == 1.0d;
        return this;
    }

    /* JADX INFO: renamed from: o */
    public CommonH5Builder m80206o(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.f54766b = str;
        }
        return this;
    }
}
