package p149l;

import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.data.Counter;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.net.URLEncoder;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public class gkp0 {
    /* JADX INFO: renamed from: a */
    public static String m126666a(String str) {
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
    public static String m126667b() {
        User userMe_ = e51.m114739D() ? qib0.f154714c0.me_() : qib0.f154714c0.queryMe();
        String str = (!NullChecker.m81304b(userMe_) || userMe_.pictures.size() <= 0) ? "" : userMe_.m60124fp().profileSmall().base;
        Counter counterCounter_ = qib0.f154714c0.counter_();
        boolean z = NullChecker.m81303a(counterCounter_) && counterCounter_.likersLimit.remaining > 0;
        StringBuilder sb = new StringBuilder("?avatarURL=");
        sb.append(URLEncoder.encode(str));
        sb.append("&isSee=");
        sb.append(z ? "1" : "0");
        return xh5.m208769q(sb.toString());
    }

    /* JADX INFO: renamed from: c */
    public static void m126668c(Act act, boolean z) {
        PutongAct.setLightStatusBar(act.getWindow(), z, act.getWindow().getDecorView().getSystemUiVisibility());
    }

    /* JADX INFO: renamed from: d */
    public static Map<String, String> m126669d(String str) {
        e01 e01Var = new e01();
        String strM126666a = m126666a(str);
        if (strM126666a != null) {
            for (String str2 : strM126666a.split("[&]")) {
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
