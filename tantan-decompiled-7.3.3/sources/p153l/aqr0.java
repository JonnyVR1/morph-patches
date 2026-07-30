package p153l;

import android.graphics.Color;
import android.text.TextUtils;
import androidx.annotation.ColorInt;
import androidx.annotation.Nullable;
import com.clevertap.android.sdk.Constants;
import java.util.Locale;

/* JADX INFO: loaded from: classes6.dex */
public final class aqr0 {

    /* JADX INFO: renamed from: a */
    public final String f72838a;

    /* JADX INFO: renamed from: b */
    public final int f72839b;

    /* JADX INFO: renamed from: c */
    @Nullable
    @ColorInt
    public final Integer f72840c;

    /* JADX INFO: renamed from: d */
    @Nullable
    @ColorInt
    public final Integer f72841d;

    /* JADX INFO: renamed from: e */
    public final float f72842e;

    /* JADX INFO: renamed from: f */
    public final boolean f72843f;

    /* JADX INFO: renamed from: g */
    public final boolean f72844g;

    /* JADX INFO: renamed from: h */
    public final boolean f72845h;

    /* JADX INFO: renamed from: i */
    public final boolean f72846i;

    /* JADX INFO: renamed from: j */
    public final int f72847j;

    public aqr0(String str, int i, @Nullable @ColorInt Integer num, @Nullable @ColorInt Integer num2, float f, boolean z, boolean z2, boolean z3, boolean z4, int i2) {
        this.f72838a = str;
        this.f72839b = i;
        this.f72840c = num;
        this.f72841d = num2;
        this.f72842e = f;
        this.f72843f = z;
        this.f72844g = z2;
        this.f72845h = z3;
        this.f72846i = z4;
        this.f72847j = i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    /* JADX INFO: renamed from: b */
    public static aqr0 m99550b(String str, ypr0 ypr0Var) {
        int i;
        lev0.m153956d(str.startsWith("Style:"));
        String[] strArrSplit = TextUtils.split(str.substring(6), Constants.SEPARATOR_COMMA);
        int length = strArrSplit.length;
        int i2 = ypr0Var.f201095k;
        aqr0 aqr0Var = null;
        if (length != i2) {
            y4w0.m214278f("SsaStyle", String.format(Locale.US, "Skipping malformed 'Style:' line (expected %s values, found %s): '%s'", Integer.valueOf(i2), Integer.valueOf(length), str));
            return aqr0Var;
        }
        try {
            String strTrim = strArrSplit[ypr0Var.f201085a].trim();
            int i3 = ypr0Var.f201086b;
            int iM99552d = i3 != -1 ? m99552d(strArrSplit[i3].trim()) : -1;
            int i4 = ypr0Var.f201087c;
            Integer numM99551c = i4 != -1 ? m99551c(strArrSplit[i4].trim()) : aqr0Var;
            int i5 = ypr0Var.f201088d;
            Integer numM99551c2 = i5 != -1 ? m99551c(strArrSplit[i5].trim()) : aqr0Var;
            int i6 = ypr0Var.f201089e;
            float f = -3.4028235E38f;
            if (i6 != -1) {
                String strTrim2 = strArrSplit[i6].trim();
                try {
                    try {
                        f = Float.parseFloat(strTrim2);
                    } catch (NumberFormatException e) {
                        y4w0.m214279g("SsaStyle", "Failed to parse font size: '" + strTrim2 + "'", e);
                    }
                } catch (RuntimeException e2) {
                    e = e2;
                    y4w0.m214279g("SsaStyle", "Skipping malformed 'Style:' line: '" + str + "'", e);
                    return aqr0Var;
                }
            }
            int i7 = ypr0Var.f201090f;
            boolean z = i7 != -1 && m99553e(strArrSplit[i7].trim());
            int i8 = ypr0Var.f201091g;
            boolean z2 = i8 != -1 && m99553e(strArrSplit[i8].trim());
            int i9 = ypr0Var.f201092h;
            boolean z3 = i9 != -1 && m99553e(strArrSplit[i9].trim());
            int i10 = ypr0Var.f201093i;
            boolean z4 = i10 != -1 && m99553e(strArrSplit[i10].trim());
            int i11 = ypr0Var.f201094j;
            if (i11 != -1) {
                String strTrim3 = strArrSplit[i11].trim();
                try {
                    int i12 = Integer.parseInt(strTrim3.trim());
                    if (i12 == 1 || i12 == 3) {
                        i = i12;
                    } else {
                        y4w0.m214278f("SsaStyle", "Ignoring unknown BorderStyle: ".concat(String.valueOf(strTrim3)));
                        i = -1;
                    }
                } catch (NumberFormatException unused) {
                }
            } else {
                i = -1;
            }
            return new aqr0(strTrim, iM99552d, numM99551c, numM99551c2, f, z, z2, z3, z4, i);
        } catch (RuntimeException e3) {
            e = e3;
            aqr0Var = aqr0Var;
        }
    }

    @Nullable
    @ColorInt
    /* JADX INFO: renamed from: c */
    public static Integer m99551c(String str) {
        try {
            long j = str.startsWith("&H") ? Long.parseLong(str.substring(2), 16) : Long.parseLong(str);
            lev0.m153956d(j <= 4294967295L);
            return Integer.valueOf(Color.argb(utw0.m198111a(((j >> 24) & 255) ^ 255), utw0.m198111a(j & 255), utw0.m198111a((j >> 8) & 255), utw0.m198111a((j >> 16) & 255)));
        } catch (IllegalArgumentException e) {
            y4w0.m214279g("SsaStyle", "Failed to parse color expression: '" + str + "'", e);
            return null;
        }
    }

    /* JADX INFO: renamed from: d */
    public static int m99552d(String str) {
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
                    y4w0.m214278f("SsaStyle", "Ignoring unknown alignment: ".concat(String.valueOf(str)));
                    return -1;
            }
        } catch (NumberFormatException unused) {
        }
    }

    /* JADX INFO: renamed from: e */
    public static boolean m99553e(String str) {
        try {
            int i = Integer.parseInt(str);
            return i == 1 || i == -1;
        } catch (NumberFormatException e) {
            y4w0.m214279g("SsaStyle", "Failed to parse boolean value: '" + str + "'", e);
            return false;
        }
    }
}
