package p153l;

import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class h4k0 {
    /* JADX INFO: renamed from: a */
    public static int[] m133578a(String str) {
        int iIndexOf;
        int[] iArr = new int[4];
        if (TextUtils.isEmpty(str)) {
            iArr[0] = -1;
            return iArr;
        }
        int length = str.length();
        int iIndexOf2 = str.indexOf(35);
        if (iIndexOf2 != -1) {
            length = iIndexOf2;
        }
        int iIndexOf3 = str.indexOf(63);
        if (iIndexOf3 == -1 || iIndexOf3 > length) {
            iIndexOf3 = length;
        }
        int iIndexOf4 = str.indexOf(47);
        if (iIndexOf4 == -1 || iIndexOf4 > iIndexOf3) {
            iIndexOf4 = iIndexOf3;
        }
        int iIndexOf5 = str.indexOf(58);
        if (iIndexOf5 > iIndexOf4) {
            iIndexOf5 = -1;
        }
        int i = iIndexOf5 + 2;
        if (i < iIndexOf3 && str.charAt(iIndexOf5 + 1) == '/' && str.charAt(i) == '/') {
            iIndexOf = str.indexOf(47, iIndexOf5 + 3);
            if (iIndexOf == -1 || iIndexOf > iIndexOf3) {
                iIndexOf = iIndexOf3;
            }
        } else {
            iIndexOf = iIndexOf5 + 1;
        }
        iArr[0] = iIndexOf5;
        iArr[1] = iIndexOf;
        iArr[2] = iIndexOf3;
        iArr[3] = length;
        return iArr;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m133579b(@Nullable String str) {
        return (str == null || m133578a(str)[0] == -1) ? false : true;
    }

    /* JADX INFO: renamed from: c */
    public static String m133580c(StringBuilder sb, int i, int i2) {
        int i3;
        int iLastIndexOf;
        if (i >= i2) {
            return sb.toString();
        }
        if (sb.charAt(i) == '/') {
            i++;
        }
        int i4 = i;
        int i5 = i4;
        while (i4 <= i2) {
            if (i4 == i2) {
                i3 = i4;
            } else if (sb.charAt(i4) == '/') {
                i3 = i4 + 1;
            } else {
                i4++;
            }
            int i6 = i5 + 1;
            if (i4 == i6 && sb.charAt(i5) == '.') {
                sb.delete(i5, i3);
                i2 -= i3 - i5;
            } else {
                if (i4 == i5 + 2 && sb.charAt(i5) == '.' && sb.charAt(i6) == '.') {
                    iLastIndexOf = sb.lastIndexOf("/", i5 - 2) + 1;
                    int i7 = iLastIndexOf > i ? iLastIndexOf : i;
                    sb.delete(i7, i3);
                    i2 -= i3 - i7;
                } else {
                    iLastIndexOf = i4 + 1;
                }
                i5 = iLastIndexOf;
            }
            i4 = i5;
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: d */
    public static String m133581d(@Nullable String str, @Nullable String str2) {
        StringBuilder sb = new StringBuilder();
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "";
        }
        int[] iArrM133578a = m133578a(str2);
        if (iArrM133578a[0] != -1) {
            sb.append(str2);
            m133580c(sb, iArrM133578a[1], iArrM133578a[2]);
            return sb.toString();
        }
        int[] iArrM133578a2 = m133578a(str);
        if (iArrM133578a[3] == 0) {
            sb.append((CharSequence) str, 0, iArrM133578a2[3]);
            sb.append(str2);
            return sb.toString();
        }
        if (iArrM133578a[2] == 0) {
            sb.append((CharSequence) str, 0, iArrM133578a2[2]);
            sb.append(str2);
            return sb.toString();
        }
        int i = iArrM133578a[1];
        if (i != 0) {
            int i2 = iArrM133578a2[0] + 1;
            sb.append((CharSequence) str, 0, i2);
            sb.append(str2);
            return m133580c(sb, iArrM133578a[1] + i2, i2 + iArrM133578a[2]);
        }
        if (str2.charAt(i) == '/') {
            sb.append((CharSequence) str, 0, iArrM133578a2[1]);
            sb.append(str2);
            int i3 = iArrM133578a2[1];
            return m133580c(sb, i3, iArrM133578a[2] + i3);
        }
        int i4 = iArrM133578a2[0] + 2;
        int i5 = iArrM133578a2[1];
        if (i4 >= i5 || i5 != iArrM133578a2[2]) {
            int iLastIndexOf = str.lastIndexOf(47, iArrM133578a2[2] - 1);
            int i6 = iLastIndexOf == -1 ? iArrM133578a2[1] : iLastIndexOf + 1;
            sb.append((CharSequence) str, 0, i6);
            sb.append(str2);
            return m133580c(sb, iArrM133578a2[1], i6 + iArrM133578a[2]);
        }
        sb.append((CharSequence) str, 0, i5);
        sb.append('/');
        sb.append(str2);
        int i7 = iArrM133578a2[1];
        return m133580c(sb, i7, iArrM133578a[2] + i7 + 1);
    }

    /* JADX INFO: renamed from: e */
    public static Uri m133582e(@Nullable String str, @Nullable String str2) {
        return Uri.parse(m133581d(str, str2));
    }
}
