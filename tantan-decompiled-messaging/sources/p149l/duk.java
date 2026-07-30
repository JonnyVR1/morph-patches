package p149l;

import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.p065ui.webview.p068mk.CommonH5Builder;
import com.tencent.connect.common.Constants;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class duk extends lud0<ygt> {
    /* JADX INFO: renamed from: b */
    public static xnu m113724b(String str) {
        Uri uri = Uri.parse(str);
        String strM113726d = m113726d(uri, "gravity", "0");
        String strM113726d2 = m113726d(uri, "needCloseBtn", "1");
        String strM113726d3 = m113726d(uri, "transparent", "0");
        int iM113725c = m113725c(uri, "cornerRadius", Constants.VIA_REPORT_TYPE_CHAT_AIO);
        List<Double> listM113727e = TextUtils.equals(strM113726d, "1") ? m113727e(uri, "1.0", "0.75") : m113727e(uri, "0.86", "0.75");
        xnu.C21187a c21187aM210240r = xnu.m210211c(200).m210243u(str).m210236n(TextUtils.equals(strM113726d3, "1") ? CommonH5Builder.BgType.TRAN_BG : CommonH5Builder.BgType.DEFAULT_BG).m210242t(listM113727e.get(0).doubleValue(), listM113727e.get(1).doubleValue()).m210239q(iM113725c).m210240r(TextUtils.equals(strM113726d, "1") ? 80 : 17);
        if (Integer.parseInt(strM113726d2) == 1) {
            c21187aM210240r.m210241s();
        }
        return c21187aM210240r.m210237o();
    }

    /* JADX INFO: renamed from: c */
    public static int m113725c(Uri uri, String str, String str2) {
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
    public static String m113726d(Uri uri, String str, String str2) {
        String queryParameter = uri.getQueryParameter(str);
        return queryParameter == null ? str2 : queryParameter;
    }

    /* JADX INFO: renamed from: e */
    public static List<Double> m113727e(Uri uri, String str, String str2) {
        String strM113726d = m113726d(uri, "widthRatio", str);
        String strM113726d2 = m113726d(uri, "heightRatio", str2);
        ArrayList arrayList = new ArrayList();
        arrayList.add(Double.valueOf(Double.parseDouble(strM113726d)));
        arrayList.add(Double.valueOf(Double.parseDouble(strM113726d2)));
        return arrayList;
    }

    @Override // p149l.lud0
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public void mo113728a(ygt ygtVar, yqu yquVar, @Nullable w1e0.C20785b c20785b) {
        String strM214763g = ygtVar.m214763g("h5Url");
        if (TextUtils.isEmpty(strM214763g)) {
            return;
        }
        yquVar.m218411K2().LiveVChatOpenH5Event.m69190b().mo172463j(m113724b(strM214763g));
    }
}
