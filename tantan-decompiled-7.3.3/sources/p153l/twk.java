package p153l;

import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.p070ui.webview.p073mk.CommonH5Builder;
import com.tencent.connect.common.Constants;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class twk extends p2e0<zit> {
    /* JADX INFO: renamed from: b */
    public static ypu m193349b(String str) {
        Uri uri = Uri.parse(str);
        String strM193351d = m193351d(uri, "gravity", "0");
        String strM193351d2 = m193351d(uri, "needCloseBtn", "1");
        String strM193351d3 = m193351d(uri, "transparent", "0");
        int iM193350c = m193350c(uri, "cornerRadius", Constants.VIA_REPORT_TYPE_CHAT_AIO);
        List<Double> listM193352e = TextUtils.equals(strM193351d, "1") ? m193352e(uri, "1.0", "0.75") : m193352e(uri, "0.86", "0.75");
        ypu.C21662a c21662aM217062r = ypu.m217033c(200).m217065u(str).m217058n(TextUtils.equals(strM193351d3, "1") ? CommonH5Builder.BgType.TRAN_BG : CommonH5Builder.BgType.DEFAULT_BG).m217064t(listM193352e.get(0).doubleValue(), listM193352e.get(1).doubleValue()).m217061q(iM193350c).m217062r(TextUtils.equals(strM193351d, "1") ? 80 : 17);
        if (Integer.parseInt(strM193351d2) == 1) {
            c21662aM217062r.m217063s();
        }
        return c21662aM217062r.m217059o();
    }

    /* JADX INFO: renamed from: c */
    public static int m193350c(Uri uri, String str, String str2) {
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
    public static String m193351d(Uri uri, String str, String str2) {
        String queryParameter = uri.getQueryParameter(str);
        return queryParameter == null ? str2 : queryParameter;
    }

    /* JADX INFO: renamed from: e */
    public static List<Double> m193352e(Uri uri, String str, String str2) {
        String strM193351d = m193351d(uri, "widthRatio", str);
        String strM193351d2 = m193351d(uri, "heightRatio", str2);
        ArrayList arrayList = new ArrayList();
        arrayList.add(Double.valueOf(Double.parseDouble(strM193351d)));
        arrayList.add(Double.valueOf(Double.parseDouble(strM193351d2)));
        return arrayList;
    }

    @Override // p153l.p2e0
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public void mo131279a(zit zitVar, zsu zsuVar, @Nullable aae0.C15677b c15677b) {
        String strM219937g = zitVar.m219937g("h5Url");
        if (TextUtils.isEmpty(strM219937g)) {
            return;
        }
        zsuVar.m97928K2().LiveVChatOpenH5Event.m70373b().mo199273j(m193349b(strM219937g));
    }
}
