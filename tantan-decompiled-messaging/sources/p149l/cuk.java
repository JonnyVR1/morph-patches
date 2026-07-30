package p149l;

import android.net.Uri;
import android.text.TextUtils;
import com.p046p1.mobile.putong.p065ui.webview.p068mk.CommonH5Builder;
import com.tencent.connect.common.Constants;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class cuk extends kud0<ygt> {
    /* JADX INFO: renamed from: b */
    public static jp50 m108784b(String str) {
        Uri uri = Uri.parse(str);
        String strM108786d = m108786d(uri, "gravity", "0");
        String strM108786d2 = m108786d(uri, "needCloseBtn", "1");
        String strM108786d3 = m108786d(uri, "transparent", "0");
        int iM108785c = m108785c(uri, "cornerRadius", Constants.VIA_REPORT_TYPE_CHAT_AIO);
        List<Double> listM108787e = TextUtils.equals(strM108786d, "1") ? m108787e(uri, "1.0", "0.75") : m108787e(uri, "0.86", "0.75");
        jp50.C17834a c17834aM142603t = jp50.m142568c(200).m142598B(str).m142599p(TextUtils.equals(strM108786d3, "1") ? CommonH5Builder.BgType.TRAN_BG : CommonH5Builder.BgType.DEFAULT_BG).m142604u(apo.m98164a(str)).m142609z(listM108787e.get(0).doubleValue(), listM108787e.get(1).doubleValue()).m142602s(iM108785c).m142603t(TextUtils.equals(strM108786d, "1") ? 80 : 17);
        if (Integer.parseInt(strM108786d2) == 1) {
            c17834aM142603t.m142607x();
        }
        return c17834aM142603t.m142600q();
    }

    /* JADX INFO: renamed from: c */
    public static int m108785c(Uri uri, String str, String str2) {
        String queryParameter = uri.getQueryParameter(str);
        if (queryParameter != null) {
            str2 = queryParameter;
        }
        try {
            return Integer.parseInt(str2);
        } catch (NumberFormatException unused) {
            return Integer.parseInt(Constants.VIA_REPORT_TYPE_CHAT_AIO);
        }
    }

    /* JADX INFO: renamed from: d */
    public static String m108786d(Uri uri, String str, String str2) {
        String queryParameter = uri.getQueryParameter(str);
        return queryParameter == null ? str2 : queryParameter;
    }

    /* JADX INFO: renamed from: e */
    public static List<Double> m108787e(Uri uri, String str, String str2) {
        String strM108786d = m108786d(uri, "widthRatio", str);
        String strM108786d2 = m108786d(uri, "heightRatio", str2);
        ArrayList arrayList = new ArrayList();
        arrayList.add(Double.valueOf(Double.parseDouble(strM108786d)));
        arrayList.add(Double.valueOf(Double.parseDouble(strM108786d2)));
        return arrayList;
    }

    @Override // p149l.kud0
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public void mo95830a(ygt ygtVar, c2e0 c2e0Var, x1e0.C21019b c21019b) {
        String strM214763g = ygtVar.m214763g("h5Url");
        if (TextUtils.isEmpty(strM214763g)) {
            return;
        }
        c2e0Var.m206028F2().OpenH5Event.open().mo172463j(m108784b(strM214763g));
        c2e0Var.m206028F2().GiftWallDialogEvent.closeLocalGiftWallDialog().m172467p();
    }
}
