package p009l;

import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.app.PutongAct;
import com.p1.mobile.putong.data.Counter;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.net.URLEncoder;
import java.util.Map;
import l.e01;
import l.e51;
import l.qib0;
import l.xh5;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class gkp0 {
    /* JADX INFO: renamed from: a */
    public static String m15104a(String str) {
        String strTrim = str.trim();
        String[] strArrSplit = strTrim.split("[?]");
        String str2 = null;
        if (strTrim.length() > 1 && strArrSplit.length > 1) {
            for (int i = 1; i < strArrSplit.length; i++) {
                str2 = strArrSplit[i];
            }
        }
        return str2;
    }

    /* JADX INFO: renamed from: b */
    public static String m15105b() {
        User userMe_ = e51.D() ? qib0.c0.me_() : qib0.c0.queryMe();
        String str = (!NullChecker.b(userMe_) || userMe_.pictures.size() <= 0) ? "" : userMe_.fp().profileSmall().base;
        Counter counterCounter_ = qib0.c0.counter_();
        boolean z = NullChecker.a(counterCounter_) && counterCounter_.likersLimit.remaining > 0;
        StringBuilder sb = new StringBuilder("?avatarURL=");
        sb.append(URLEncoder.encode(str));
        sb.append("&isSee=");
        sb.append(z ? "1" : "0");
        return xh5.q(sb.toString());
    }

    /* JADX INFO: renamed from: c */
    public static void m15106c(Act act, boolean z) {
        PutongAct.setLightStatusBar(act.getWindow(), z, act.getWindow().getDecorView().getSystemUiVisibility());
    }

    /* JADX INFO: renamed from: d */
    public static Map<String, String> m15107d(String str) {
        e01 e01Var = new e01();
        String strM15104a = m15104a(str);
        if (strM15104a != null) {
            for (String str2 : strM15104a.split("[&]")) {
                String[] strArrSplit = str2.split("[=]");
                if (strArrSplit.length > 1) {
                    e01Var.put(strArrSplit[0], strArrSplit[1]);
                } else {
                    String str3 = strArrSplit[0];
                    if (str3 != "") {
                        e01Var.put(str3, "");
                    }
                }
            }
        }
        return e01Var;
    }
}
