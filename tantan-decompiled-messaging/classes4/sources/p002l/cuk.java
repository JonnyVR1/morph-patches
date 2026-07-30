package p002l;

import android.net.Uri;
import android.text.TextUtils;
import com.p1.mobile.putong.ui.webview.mk.CommonH5Builder;
import java.util.ArrayList;
import java.util.List;
import l.ygt;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class cuk extends kud0<ygt> {
    /* JADX INFO: renamed from: b */
    public static jp50 m11379b(String str) {
        Uri uri = Uri.parse(str);
        String strM11381d = m11381d(uri, "gravity", "0");
        String strM11381d2 = m11381d(uri, "needCloseBtn", "1");
        String strM11381d3 = m11381d(uri, "transparent", "0");
        int iM11380c = m11380c(uri, "cornerRadius", "24");
        List<Double> listM11382e = TextUtils.equals(strM11381d, "1") ? m11382e(uri, "1.0", "0.75") : m11382e(uri, "0.86", "0.75");
        jp50.C0638a c0638aM16099t = jp50.m16064c(200).m16094B(str).m16095p(TextUtils.equals(strM11381d3, "1") ? CommonH5Builder.BgType.TRAN_BG : CommonH5Builder.BgType.DEFAULT_BG).m16100u(apo.m9994a(str)).m16105z(listM11382e.get(0).doubleValue(), listM11382e.get(1).doubleValue()).m16098s(iM11380c).m16099t(TextUtils.equals(strM11381d, "1") ? 80 : 17);
        if (Integer.parseInt(strM11381d2) == 1) {
            c0638aM16099t.m16103x();
        }
        return c0638aM16099t.m16096q();
    }

    /* JADX INFO: renamed from: c */
    public static int m11380c(Uri uri, String str, String str2) {
        String queryParameter = uri.getQueryParameter(str);
        if (queryParameter != null) {
            str2 = queryParameter;
        }
        try {
            return Integer.parseInt(str2);
        } catch (NumberFormatException unused) {
            return Integer.parseInt("24");
        }
    }

    /* JADX INFO: renamed from: d */
    public static String m11381d(Uri uri, String str, String str2) {
        String queryParameter = uri.getQueryParameter(str);
        return queryParameter == null ? str2 : queryParameter;
    }

    /* JADX INFO: renamed from: e */
    public static List<Double> m11382e(Uri uri, String str, String str2) {
        String strM11381d = m11381d(uri, "widthRatio", str);
        String strM11381d2 = m11381d(uri, "heightRatio", str2);
        ArrayList arrayList = new ArrayList();
        arrayList.add(Double.valueOf(Double.parseDouble(strM11381d)));
        arrayList.add(Double.valueOf(Double.parseDouble(strM11381d2)));
        return arrayList;
    }

    @Override // p002l.kud0
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public void mo9496a(ygt ygtVar, c2e0 c2e0Var, x1e0.C0892b c0892b) {
        String strG = ygtVar.g("h5Url");
        if (TextUtils.isEmpty(strG)) {
            return;
        }
        c2e0Var.m25548F2().OpenH5Event.open().j(m11379b(strG));
        c2e0Var.m25548F2().GiftWallDialogEvent.closeLocalGiftWallDialog().p();
    }
}
