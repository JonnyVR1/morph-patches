package p149l;

import com.clevertap.android.sdk.Constants;
import com.immomo.momomediaext.sei.BaseSei;
import java.util.Locale;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class uwj0 {

    /* JADX INFO: renamed from: a */
    public final String[] f178651a;

    /* JADX INFO: renamed from: b */
    public final int[] f178652b;

    /* JADX INFO: renamed from: c */
    public final String[] f178653c;

    /* JADX INFO: renamed from: d */
    public final int f178654d;

    public uwj0(String[] strArr, int[] iArr, String[] strArr2, int i) {
        this.f178651a = strArr;
        this.f178652b = iArr;
        this.f178653c = strArr2;
        this.f178654d = i;
    }

    /* JADX INFO: renamed from: b */
    public static uwj0 m196130b(String str) {
        String[] strArr = new String[5];
        int[] iArr = new int[4];
        String[] strArr2 = new String[4];
        return new uwj0(strArr, iArr, strArr2, m196131c(str, strArr, iArr, strArr2));
    }

    /* JADX INFO: renamed from: c */
    public static int m196131c(String str, String[] strArr, int[] iArr, String[] strArr2) {
        String strSubstring;
        strArr[0] = "";
        int length = 0;
        int i = 0;
        while (length < str.length()) {
            int iIndexOf = str.indexOf("$", length);
            if (iIndexOf == -1) {
                strArr[i] = strArr[i] + str.substring(length);
                length = str.length();
            } else if (iIndexOf != length) {
                strArr[i] = strArr[i] + str.substring(length, iIndexOf);
                length = iIndexOf;
            } else if (str.startsWith("$$", length)) {
                strArr[i] = strArr[i] + "$";
                length += 2;
            } else {
                int i2 = length + 1;
                int iIndexOf2 = str.indexOf("$", i2);
                String strSubstring2 = str.substring(i2, iIndexOf2);
                if (strSubstring2.equals("RepresentationID")) {
                    iArr[i] = 1;
                } else {
                    int iIndexOf3 = strSubstring2.indexOf("%0");
                    if (iIndexOf3 != -1) {
                        strSubstring = strSubstring2.substring(iIndexOf3);
                        if (!strSubstring.endsWith(Constants.INAPP_DATA_TAG) && !strSubstring.endsWith(BaseSei.f13930X) && !strSubstring.endsWith("X")) {
                            strSubstring = strSubstring.concat(Constants.INAPP_DATA_TAG);
                        }
                        strSubstring2 = strSubstring2.substring(0, iIndexOf3);
                    } else {
                        strSubstring = "%01d";
                    }
                    switch (strSubstring2) {
                        case "Number":
                            iArr[i] = 2;
                            break;
                        case "Time":
                            iArr[i] = 4;
                            break;
                        case "Bandwidth":
                            iArr[i] = 3;
                            break;
                        default:
                            ig3.m135964a("Invalid template: ".concat(str));
                            return 0;
                    }
                    strArr2[i] = strSubstring;
                }
                i++;
                strArr[i] = "";
                length = iIndexOf2 + 1;
            }
        }
        return i;
    }

    /* JADX INFO: renamed from: a */
    public String m196132a(String str, long j, int i, long j2) {
        StringBuilder sb = new StringBuilder();
        int i2 = 0;
        while (true) {
            int i3 = this.f178654d;
            String[] strArr = this.f178651a;
            if (i2 >= i3) {
                sb.append(strArr[i3]);
                return sb.toString();
            }
            sb.append(strArr[i2]);
            int i4 = this.f178652b[i2];
            if (i4 == 1) {
                sb.append(str);
            } else if (i4 == 2) {
                sb.append(String.format(Locale.US, this.f178653c[i2], Long.valueOf(j)));
            } else if (i4 == 3) {
                sb.append(String.format(Locale.US, this.f178653c[i2], Integer.valueOf(i)));
            } else if (i4 == 4) {
                sb.append(String.format(Locale.US, this.f178653c[i2], Long.valueOf(j2)));
            }
            i2++;
        }
    }
}
