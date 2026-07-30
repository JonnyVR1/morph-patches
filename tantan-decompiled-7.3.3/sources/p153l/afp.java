package p153l;

import android.text.TextUtils;
import com.tencent.connect.common.Constants;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class afp extends o2e0<zit> {
    /* JADX INFO: renamed from: b */
    public static mkj m97542b(zit zitVar, bae0.C15954b c15954b) {
        String strM219937g = zitVar.m219937g("mgId");
        String strM97544d = m97544d(zitVar, "gravity", "0");
        String strM97544d2 = m97544d(zitVar, "transparent", "0");
        int iM97543c = m97543c(zitVar, "cornerRadius", Constants.VIA_REPORT_TYPE_CHAT_AIO);
        List<Double> listM97545e = TextUtils.equals(strM97544d, "1") ? m97545e(zitVar, "1.0", "1.5") : m97545e(zitVar, "0.86", "1.5");
        return mkj.C18643a.m158804j().m158809m(strM219937g).m158810n(TextUtils.equals(strM97544d2, "1")).m158808l(listM97545e.get(0).doubleValue(), listM97545e.get(1).doubleValue()).m158806i(iM97543c).m158807k(TextUtils.equals(strM97544d, "1") ? 80 : 17).m158805h();
    }

    /* JADX INFO: renamed from: c */
    public static int m97543c(zit zitVar, String str, String str2) {
        String strM219937g = zitVar.m219937g(str);
        if (!TextUtils.isEmpty(strM219937g)) {
            str2 = strM219937g;
        }
        try {
            return Integer.parseInt(str2);
        } catch (NumberFormatException unused) {
            return Integer.parseInt(Constants.VIA_REPORT_TYPE_CHAT_AIO);
        }
    }

    /* JADX INFO: renamed from: d */
    public static String m97544d(zit zitVar, String str, String str2) {
        String strM219937g = zitVar.m219937g(str);
        return TextUtils.isEmpty(strM219937g) ? str2 : strM219937g;
    }

    /* JADX INFO: renamed from: e */
    public static List<Double> m97545e(zit zitVar, String str, String str2) {
        String strM97544d = m97544d(zitVar, "widthRatio", str);
        String strM97544d2 = m97544d(zitVar, "heightRatio", str2);
        ArrayList arrayList = new ArrayList();
        arrayList.add(Double.valueOf(Double.parseDouble(strM97544d)));
        arrayList.add(Double.valueOf(Double.parseDouble(strM97544d2)));
        return arrayList;
    }

    @Override // p153l.o2e0
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public void mo97254a(zit zitVar, gae0 gae0Var, bae0.C15954b c15954b) {
        if (TextUtils.isEmpty(zitVar.m219937g("mgId"))) {
            return;
        }
        gae0Var.m213811F2().IntlSudGameEvent.show().mo199273j(m97542b(zitVar, c15954b));
    }
}
