package p149l;

import com.p046p1.mobile.android.R$string;
import com.p046p1.mobile.android.app.App;

/* JADX INFO: loaded from: classes8.dex */
public class it6 {
    /* JADX INFO: renamed from: a */
    public static String m138180a(String str) {
        if (!Character.isLetter(str.charAt(str.length() - 1))) {
            return str;
        }
        return str + App.f15369e.getResources().getString(R$string.f15164l7);
    }

    /* JADX INFO: renamed from: b */
    public static String m138181b(int i, int i2) {
        return m138180a(hvc0.m133156c(i)) + App.f15369e.getString(R$string.f15174m7) + m138180a(hvc0.m133156c(i2));
    }

    /* JADX INFO: renamed from: c */
    public static String m138182c(String str) {
        if (str == null) {
            return null;
        }
        String string = App.f15369e.getResources().getString(R$string.f15164l7);
        return str.endsWith(string) ? str.substring(0, str.length() - string.length()) : str;
    }

    /* JADX INFO: renamed from: d */
    public static String m138183d(String str) {
        if (str.length() <= 0) {
            return str;
        }
        return str.substring(0, 1).toLowerCase() + str.substring(1);
    }
}
