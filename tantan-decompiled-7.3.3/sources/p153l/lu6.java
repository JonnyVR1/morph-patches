package p153l;

import com.p051p1.mobile.android.R$string;
import com.p051p1.mobile.android.app.App;

/* JADX INFO: loaded from: classes8.dex */
public class lu6 {
    /* JADX INFO: renamed from: a */
    public static String m155845a(String str) {
        if (!Character.isLetter(str.charAt(str.length() - 1))) {
            return str;
        }
        return str + App.f16088e.getResources().getString(R$string.f15883l7);
    }

    /* JADX INFO: renamed from: b */
    public static String m155846b(int i, int i2) {
        return m155845a(k3d0.m148007c(i)) + App.f16088e.getString(R$string.f15893m7) + m155845a(k3d0.m148007c(i2));
    }

    /* JADX INFO: renamed from: c */
    public static String m155847c(String str) {
        if (str == null) {
            return null;
        }
        String string = App.f16088e.getResources().getString(R$string.f15883l7);
        return str.endsWith(string) ? str.substring(0, str.length() - string.length()) : str;
    }

    /* JADX INFO: renamed from: d */
    public static String m155848d(String str) {
        if (str.length() <= 0) {
            return str;
        }
        return str.substring(0, 1).toLowerCase() + str.substring(1);
    }
}
