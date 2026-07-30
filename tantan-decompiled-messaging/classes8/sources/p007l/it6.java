package p007l;

import com.p003p1.mobile.android.R$string;
import com.p003p1.mobile.android.app.App;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public class it6 {
    /* JADX INFO: renamed from: a */
    public static String m9422a(String str) {
        if (!Character.isLetter(str.charAt(str.length() - 1))) {
            return str;
        }
        return str + App.f1068e.getResources().getString(R$string.f863l7);
    }

    /* JADX INFO: renamed from: b */
    public static String m9423b(int i, int i2) {
        return m9422a(hvc0.m9353c(i)) + App.f1068e.getString(R$string.f873m7) + m9422a(hvc0.m9353c(i2));
    }

    /* JADX INFO: renamed from: c */
    public static String m9424c(String str) {
        if (str == null) {
            return null;
        }
        String string = App.f1068e.getResources().getString(R$string.f863l7);
        return str.endsWith(string) ? str.substring(0, str.length() - string.length()) : str;
    }

    /* JADX INFO: renamed from: d */
    public static String m9425d(String str) {
        if (str.length() <= 0) {
            return str;
        }
        return str.substring(0, 1).toLowerCase() + str.substring(1);
    }
}
