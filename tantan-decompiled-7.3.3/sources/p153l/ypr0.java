package p153l;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.clevertap.android.sdk.Constants;
import com.facebook.AuthenticationTokenClaims;
import com.p051p1.mobile.putong.data.OMSFontStyle;

/* JADX INFO: loaded from: classes6.dex */
public final class ypr0 {

    /* JADX INFO: renamed from: a */
    public final int f201085a;

    /* JADX INFO: renamed from: b */
    public final int f201086b;

    /* JADX INFO: renamed from: c */
    public final int f201087c;

    /* JADX INFO: renamed from: d */
    public final int f201088d;

    /* JADX INFO: renamed from: e */
    public final int f201089e;

    /* JADX INFO: renamed from: f */
    public final int f201090f;

    /* JADX INFO: renamed from: g */
    public final int f201091g;

    /* JADX INFO: renamed from: h */
    public final int f201092h;

    /* JADX INFO: renamed from: i */
    public final int f201093i;

    /* JADX INFO: renamed from: j */
    public final int f201094j;

    /* JADX INFO: renamed from: k */
    public final int f201095k;

    public ypr0(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11) {
        this.f201085a = i;
        this.f201086b = i2;
        this.f201087c = i3;
        this.f201088d = i4;
        this.f201089e = i5;
        this.f201090f = i6;
        this.f201091g = i7;
        this.f201092h = i8;
        this.f201093i = i9;
        this.f201094j = i10;
        this.f201095k = i11;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Nullable
    /* JADX INFO: renamed from: a */
    public static ypr0 m217032a(String str) {
        String[] strArrSplit = TextUtils.split(str.substring(7), Constants.SEPARATOR_COMMA);
        int i = 0;
        int i2 = -1;
        int i3 = -1;
        int i4 = -1;
        int i5 = -1;
        int i6 = -1;
        int i7 = -1;
        int i8 = -1;
        int i9 = -1;
        int i10 = -1;
        int i11 = -1;
        while (true) {
            int length = strArrSplit.length;
            if (i >= length) {
                if (i2 != -1) {
                    return new ypr0(i2, i3, i4, i5, i6, i7, i8, i9, i10, i11, length);
                }
                return null;
            }
            String strM207228a = wnw0.m207228a(strArrSplit[i].trim());
            switch (strM207228a.hashCode()) {
                case -1178781136:
                    if (strM207228a.equals(OMSFontStyle.italic)) {
                        i8 = i;
                    }
                    break;
                case -1026963764:
                    if (strM207228a.equals("underline")) {
                        i9 = i;
                    }
                    break;
                case -192095652:
                    if (strM207228a.equals("strikeout")) {
                        i10 = i;
                    }
                    break;
                case -70925746:
                    if (strM207228a.equals("primarycolour")) {
                        i4 = i;
                    }
                    break;
                case 3029637:
                    if (strM207228a.equals(OMSFontStyle.bold)) {
                        i7 = i;
                    }
                    break;
                case 3373707:
                    if (strM207228a.equals(AuthenticationTokenClaims.JSON_KEY_NAME)) {
                        i2 = i;
                    }
                    break;
                case 366554320:
                    if (strM207228a.equals("fontsize")) {
                        i6 = i;
                    }
                    break;
                case 767321349:
                    if (strM207228a.equals("borderstyle")) {
                        i11 = i;
                    }
                    break;
                case 1767875043:
                    if (strM207228a.equals("alignment")) {
                        i3 = i;
                    }
                    break;
                case 1988365454:
                    if (strM207228a.equals("outlinecolour")) {
                        i5 = i;
                    }
                    break;
            }
            i++;
        }
    }
}
