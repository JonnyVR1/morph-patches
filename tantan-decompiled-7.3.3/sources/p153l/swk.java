package p153l;

import android.net.Uri;
import android.text.TextUtils;
import com.p051p1.mobile.putong.p070ui.webview.p073mk.CommonH5Builder;
import com.tencent.connect.common.Constants;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class swk extends o2e0<zit> {
    /* JADX INFO: renamed from: b */
    public static px50 m188326b(String str) {
        Uri uri = Uri.parse(str);
        String strM188328d = m188328d(uri, "gravity", "0");
        String strM188328d2 = m188328d(uri, "needCloseBtn", "1");
        String strM188328d3 = m188328d(uri, "transparent", "0");
        int iM188327c = m188327c(uri, "cornerRadius", Constants.VIA_REPORT_TYPE_CHAT_AIO);
        List<Double> listM188329e = TextUtils.equals(strM188328d, "1") ? m188329e(uri, "1.0", "0.75") : m188329e(uri, "0.86", "0.75");
        px50.C19461a c19461aM174146t = px50.m174112c(200).m174141B(str).m174142p(TextUtils.equals(strM188328d3, "1") ? CommonH5Builder.BgType.TRAN_BG : CommonH5Builder.BgType.DEFAULT_BG).m174147u(aro.m99761a(str)).m174152z(listM188329e.get(0).doubleValue(), listM188329e.get(1).doubleValue()).m174145s(iM188327c).m174146t(TextUtils.equals(strM188328d, "1") ? 80 : 17);
        if (Integer.parseInt(strM188328d2) == 1) {
            c19461aM174146t.m174150x();
        }
        return c19461aM174146t.m174143q();
    }

    /* JADX INFO: renamed from: c */
    public static int m188327c(Uri uri, String str, String str2) {
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
    public static String m188328d(Uri uri, String str, String str2) {
        String queryParameter = uri.getQueryParameter(str);
        return queryParameter == null ? str2 : queryParameter;
    }

    /* JADX INFO: renamed from: e */
    public static List<Double> m188329e(Uri uri, String str, String str2) {
        String strM188328d = m188328d(uri, "widthRatio", str);
        String strM188328d2 = m188328d(uri, "heightRatio", str2);
        ArrayList arrayList = new ArrayList();
        arrayList.add(Double.valueOf(Double.parseDouble(strM188328d)));
        arrayList.add(Double.valueOf(Double.parseDouble(strM188328d2)));
        return arrayList;
    }

    @Override // p153l.o2e0
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public void mo97254a(zit zitVar, gae0 gae0Var, bae0.C15954b c15954b) {
        String strM219937g = zitVar.m219937g("h5Url");
        if (TextUtils.isEmpty(strM219937g)) {
            return;
        }
        gae0Var.m213811F2().OpenH5Event.open().mo199273j(m188326b(strM219937g));
        gae0Var.m213811F2().GiftWallDialogEvent.closeLocalGiftWallDialog().m199277p();
    }
}
