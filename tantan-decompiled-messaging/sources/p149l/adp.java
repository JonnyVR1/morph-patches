package p149l;

import android.text.TextUtils;
import com.tencent.connect.common.Constants;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class adp extends kud0<ygt> {
    /* JADX INFO: renamed from: b */
    public static shj m95905b(ygt ygtVar, x1e0.C21019b c21019b) {
        String strM214763g = ygtVar.m214763g("mgId");
        String strM95907d = m95907d(ygtVar, "gravity", "0");
        String strM95907d2 = m95907d(ygtVar, "transparent", "0");
        int iM95906c = m95906c(ygtVar, "cornerRadius", Constants.VIA_REPORT_TYPE_CHAT_AIO);
        List<Double> listM95908e = TextUtils.equals(strM95907d, "1") ? m95908e(ygtVar, "1.0", "1.5") : m95908e(ygtVar, "0.86", "1.5");
        return shj.C19950a.m184205j().m184210m(strM214763g).m184211n(TextUtils.equals(strM95907d2, "1")).m184209l(listM95908e.get(0).doubleValue(), listM95908e.get(1).doubleValue()).m184207i(iM95906c).m184208k(TextUtils.equals(strM95907d, "1") ? 80 : 17).m184206h();
    }

    /* JADX INFO: renamed from: c */
    public static int m95906c(ygt ygtVar, String str, String str2) {
        String strM214763g = ygtVar.m214763g(str);
        if (!TextUtils.isEmpty(strM214763g)) {
            str2 = strM214763g;
        }
        try {
            return Integer.parseInt(str2);
        } catch (NumberFormatException unused) {
            return Integer.parseInt(Constants.VIA_REPORT_TYPE_CHAT_AIO);
        }
    }

    /* JADX INFO: renamed from: d */
    public static String m95907d(ygt ygtVar, String str, String str2) {
        String strM214763g = ygtVar.m214763g(str);
        return TextUtils.isEmpty(strM214763g) ? str2 : strM214763g;
    }

    /* JADX INFO: renamed from: e */
    public static List<Double> m95908e(ygt ygtVar, String str, String str2) {
        String strM95907d = m95907d(ygtVar, "widthRatio", str);
        String strM95907d2 = m95907d(ygtVar, "heightRatio", str2);
        ArrayList arrayList = new ArrayList();
        arrayList.add(Double.valueOf(Double.parseDouble(strM95907d)));
        arrayList.add(Double.valueOf(Double.parseDouble(strM95907d2)));
        return arrayList;
    }

    @Override // p149l.kud0
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public void mo95830a(ygt ygtVar, c2e0 c2e0Var, x1e0.C21019b c21019b) {
        if (TextUtils.isEmpty(ygtVar.m214763g("mgId"))) {
            return;
        }
        c2e0Var.m206028F2().IntlSudGameEvent.show().mo172463j(m95905b(ygtVar, c21019b));
    }
}
