package p153l;

import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.data.Counter;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.net.URLEncoder;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class ktp0 {
    /* JADX INFO: renamed from: a */
    public static String m151390a(String str) {
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
    public static String m151391b() {
        User userMe_ = l51.m152884D() ? uqb0.f180397c0.me_() : uqb0.f180397c0.queryMe();
        String str = (!NullChecker.m82487b(userMe_) || userMe_.pictures.size() <= 0) ? "" : userMe_.m61308fp().profileSmall().base;
        Counter counterCounter_ = uqb0.f180397c0.counter_();
        boolean z = NullChecker.m82486a(counterCounter_) && counterCounter_.likersLimit.remaining > 0;
        StringBuilder sb = new StringBuilder("?avatarURL=");
        sb.append(URLEncoder.encode(str));
        sb.append("&isSee=");
        sb.append(z ? "1" : "0");
        return xi5.m211115q(sb.toString());
    }

    /* JADX INFO: renamed from: c */
    public static void m151392c(Act act, boolean z) {
        PutongAct.setLightStatusBar(act.getWindow(), z, act.getWindow().getDecorView().getSystemUiVisibility());
    }

    /* JADX INFO: renamed from: d */
    public static Map<String, String> m151393d(String str) {
        l01 l01Var = new l01();
        String strM151390a = m151390a(str);
        if (strM151390a != null) {
            for (String str2 : strM151390a.split("[&]")) {
                String[] strArrSplit = str2.split("[=]");
                if (strArrSplit.length > 1) {
                    l01Var.put(strArrSplit[0], strArrSplit[1]);
                } else {
                    String str3 = strArrSplit[0];
                    if (str3 != "") {
                        l01Var.put(str3, "");
                    }
                }
            }
        }
        return l01Var;
    }
}
