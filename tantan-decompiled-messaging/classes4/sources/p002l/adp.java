package p002l;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import l.ygt;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class adp extends kud0<ygt> {
    /* JADX INFO: renamed from: b */
    public static shj m9512b(ygt ygtVar, x1e0.C0892b c0892b) {
        String strG = ygtVar.g("mgId");
        String strM9514d = m9514d(ygtVar, "gravity", "0");
        String strM9514d2 = m9514d(ygtVar, "transparent", "0");
        int iM9513c = m9513c(ygtVar, "cornerRadius", "24");
        List<Double> listM9515e = TextUtils.equals(strM9514d, "1") ? m9515e(ygtVar, "1.0", "1.5") : m9515e(ygtVar, "0.86", "1.5");
        return shj.C0817a.m22482j().m22487m(strG).m22488n(TextUtils.equals(strM9514d2, "1")).m22486l(listM9515e.get(0).doubleValue(), listM9515e.get(1).doubleValue()).m22484i(iM9513c).m22485k(TextUtils.equals(strM9514d, "1") ? 80 : 17).m22483h();
    }

    /* JADX INFO: renamed from: c */
    public static int m9513c(ygt ygtVar, String str, String str2) {
        String strG = ygtVar.g(str);
        if (!TextUtils.isEmpty(strG)) {
            str2 = strG;
        }
        try {
            return Integer.parseInt(str2);
        } catch (NumberFormatException unused) {
            return Integer.parseInt("24");
        }
    }

    /* JADX INFO: renamed from: d */
    public static String m9514d(ygt ygtVar, String str, String str2) {
        String strG = ygtVar.g(str);
        return TextUtils.isEmpty(strG) ? str2 : strG;
    }

    /* JADX INFO: renamed from: e */
    public static List<Double> m9515e(ygt ygtVar, String str, String str2) {
        String strM9514d = m9514d(ygtVar, "widthRatio", str);
        String strM9514d2 = m9514d(ygtVar, "heightRatio", str2);
        ArrayList arrayList = new ArrayList();
        arrayList.add(Double.valueOf(Double.parseDouble(strM9514d)));
        arrayList.add(Double.valueOf(Double.parseDouble(strM9514d2)));
        return arrayList;
    }

    @Override // p002l.kud0
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public void mo9496a(ygt ygtVar, c2e0 c2e0Var, x1e0.C0892b c0892b) {
        if (TextUtils.isEmpty(ygtVar.g("mgId"))) {
            return;
        }
        c2e0Var.m25548F2().IntlSudGameEvent.show().j(m9512b(ygtVar, c0892b));
    }
}
