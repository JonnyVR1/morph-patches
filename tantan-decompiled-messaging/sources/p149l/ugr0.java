package p149l;

import android.graphics.Color;
import android.text.TextUtils;
import androidx.annotation.ColorInt;
import androidx.annotation.Nullable;
import com.clevertap.android.sdk.Constants;
import java.util.Locale;

/* JADX INFO: loaded from: classes6.dex */
public final class ugr0 {

    /* JADX INFO: renamed from: a */
    public final String f176411a;

    /* JADX INFO: renamed from: b */
    public final int f176412b;

    /* JADX INFO: renamed from: c */
    @Nullable
    @ColorInt
    public final Integer f176413c;

    /* JADX INFO: renamed from: d */
    @Nullable
    @ColorInt
    public final Integer f176414d;

    /* JADX INFO: renamed from: e */
    public final float f176415e;

    /* JADX INFO: renamed from: f */
    public final boolean f176416f;

    /* JADX INFO: renamed from: g */
    public final boolean f176417g;

    /* JADX INFO: renamed from: h */
    public final boolean f176418h;

    /* JADX INFO: renamed from: i */
    public final boolean f176419i;

    /* JADX INFO: renamed from: j */
    public final int f176420j;

    public ugr0(String str, int i, @Nullable @ColorInt Integer num, @Nullable @ColorInt Integer num2, float f, boolean z, boolean z2, boolean z3, boolean z4, int i2) {
        this.f176411a = str;
        this.f176412b = i;
        this.f176413c = num;
        this.f176414d = num2;
        this.f176415e = f;
        this.f176416f = z;
        this.f176417g = z2;
        this.f176418h = z3;
        this.f176419i = z4;
        this.f176420j = i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    /* JADX INFO: renamed from: b */
    public static ugr0 m193568b(String str, sgr0 sgr0Var) {
        int i;
        f5v0.m119533d(str.startsWith("Style:"));
        String[] strArrSplit = TextUtils.split(str.substring(6), Constants.SEPARATOR_COMMA);
        int length = strArrSplit.length;
        int i2 = sgr0Var.f164475k;
        ugr0 ugr0Var = null;
        if (length != i2) {
            svv0.m186111f("SsaStyle", String.format(Locale.US, "Skipping malformed 'Style:' line (expected %s values, found %s): '%s'", Integer.valueOf(i2), Integer.valueOf(length), str));
            return ugr0Var;
        }
        try {
            String strTrim = strArrSplit[sgr0Var.f164465a].trim();
            int i3 = sgr0Var.f164466b;
            int iM193570d = i3 != -1 ? m193570d(strArrSplit[i3].trim()) : -1;
            int i4 = sgr0Var.f164467c;
            Integer numM193569c = i4 != -1 ? m193569c(strArrSplit[i4].trim()) : ugr0Var;
            int i5 = sgr0Var.f164468d;
            Integer numM193569c2 = i5 != -1 ? m193569c(strArrSplit[i5].trim()) : ugr0Var;
            int i6 = sgr0Var.f164469e;
            float f = -3.4028235E38f;
            if (i6 != -1) {
                String strTrim2 = strArrSplit[i6].trim();
                try {
                    try {
                        f = Float.parseFloat(strTrim2);
                    } catch (NumberFormatException e) {
                        svv0.m186112g("SsaStyle", "Failed to parse font size: '" + strTrim2 + "'", e);
                    }
                } catch (RuntimeException e2) {
                    e = e2;
                    svv0.m186112g("SsaStyle", "Skipping malformed 'Style:' line: '" + str + "'", e);
                    return ugr0Var;
                }
            }
            int i7 = sgr0Var.f164470f;
            boolean z = i7 != -1 && m193571e(strArrSplit[i7].trim());
            int i8 = sgr0Var.f164471g;
            boolean z2 = i8 != -1 && m193571e(strArrSplit[i8].trim());
            int i9 = sgr0Var.f164472h;
            boolean z3 = i9 != -1 && m193571e(strArrSplit[i9].trim());
            int i10 = sgr0Var.f164473i;
            boolean z4 = i10 != -1 && m193571e(strArrSplit[i10].trim());
            int i11 = sgr0Var.f164474j;
            if (i11 != -1) {
                String strTrim3 = strArrSplit[i11].trim();
                try {
                    int i12 = Integer.parseInt(strTrim3.trim());
                    if (i12 == 1 || i12 == 3) {
                        i = i12;
                    } else {
                        svv0.m186111f("SsaStyle", "Ignoring unknown BorderStyle: ".concat(String.valueOf(strTrim3)));
                        i = -1;
                    }
                } catch (NumberFormatException unused) {
                }
            } else {
                i = -1;
            }
            return new ugr0(strTrim, iM193570d, numM193569c, numM193569c2, f, z, z2, z3, z4, i);
        } catch (RuntimeException e3) {
            e = e3;
            ugr0Var = ugr0Var;
        }
    }

    @Nullable
    @ColorInt
    /* JADX INFO: renamed from: c */
    public static Integer m193569c(String str) {
        try {
            long j = str.startsWith("&H") ? Long.parseLong(str.substring(2), 16) : Long.parseLong(str);
            f5v0.m119533d(j <= 4294967295L);
            return Integer.valueOf(Color.argb(okw0.m164905a(((j >> 24) & 255) ^ 255), okw0.m164905a(j & 255), okw0.m164905a((j >> 8) & 255), okw0.m164905a((j >> 16) & 255)));
        } catch (IllegalArgumentException e) {
            svv0.m186112g("SsaStyle", "Failed to parse color expression: '" + str + "'", e);
            return null;
        }
    }

    /* JADX INFO: renamed from: d */
    public static int m193570d(String str) {
        try {
            int i = Integer.parseInt(str.trim());
            switch (i) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                    return i;
                default:
                    svv0.m186111f("SsaStyle", "Ignoring unknown alignment: ".concat(String.valueOf(str)));
                    return -1;
            }
        } catch (NumberFormatException unused) {
        }
    }

    /* JADX INFO: renamed from: e */
    public static boolean m193571e(String str) {
        try {
            int i = Integer.parseInt(str);
            return i == 1 || i == -1;
        } catch (NumberFormatException e) {
            svv0.m186112g("SsaStyle", "Failed to parse boolean value: '" + str + "'", e);
            return false;
        }
    }
}
