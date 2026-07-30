package p153l;

import com.google.common.base.C2678b;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes7.dex */
public final class r8g0 {
    /* JADX INFO: renamed from: a */
    public static String m180202a(String str) {
        return C2678b.m15494b(str);
    }

    /* JADX INFO: renamed from: b */
    public static boolean m180203b(String str) {
        return C2678b.m15499g(str);
    }

    /* JADX INFO: renamed from: c */
    public static String m180204c(String str, Object... objArr) {
        int iIndexOf;
        String strValueOf = String.valueOf(str);
        int i = 0;
        if (objArr == null) {
            objArr = new Object[]{"(Object[])null"};
        } else {
            for (int i2 = 0; i2 < objArr.length; i2++) {
                objArr[i2] = m180205d(objArr[i2]);
            }
        }
        StringBuilder sb = new StringBuilder(strValueOf.length() + (objArr.length * 16));
        int i3 = 0;
        while (i < objArr.length && (iIndexOf = strValueOf.indexOf("%s", i3)) != -1) {
            sb.append((CharSequence) strValueOf, i3, iIndexOf);
            sb.append(objArr[i]);
            i3 = iIndexOf + 2;
            i++;
        }
        sb.append((CharSequence) strValueOf, i3, strValueOf.length());
        if (i < objArr.length) {
            sb.append(" [");
            sb.append(objArr[i]);
            for (int i4 = i + 1; i4 < objArr.length; i4++) {
                sb.append(", ");
                sb.append(objArr[i4]);
            }
            sb.append(']');
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: d */
    public static String m180205d(Object obj) {
        if (obj == null) {
            return "null";
        }
        try {
            return obj.toString();
        } catch (Exception e) {
            String name = obj.getClass().getName();
            String hexString = Integer.toHexString(System.identityHashCode(obj));
            StringBuilder sb = new StringBuilder(name.length() + 1 + String.valueOf(hexString).length());
            sb.append(name);
            sb.append('@');
            sb.append(hexString);
            String string = sb.toString();
            Logger.getLogger("com.google.common.base.Strings").log(Level.WARNING, string.length() != 0 ? "Exception during lenientFormat for ".concat(string) : new String("Exception during lenientFormat for "), (Throwable) e);
            String name2 = e.getClass().getName();
            StringBuilder sb2 = new StringBuilder(string.length() + 9 + name2.length());
            sb2.append("<");
            sb2.append(string);
            sb2.append(" threw ");
            sb2.append(name2);
            sb2.append(">");
            return sb2.toString();
        }
    }

    /* JADX INFO: renamed from: e */
    public static String m180206e(String str) {
        return C2678b.m15497e(str);
    }
}
