package p153l;

import android.graphics.Color;
import android.graphics.PointF;
import android.text.TextUtils;
import androidx.annotation.ColorInt;
import androidx.annotation.Nullable;
import com.clevertap.android.sdk.Constants;
import com.google.common.primitives.Ints;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class z0g0 {

    /* JADX INFO: renamed from: a */
    public final String f202309a;

    /* JADX INFO: renamed from: b */
    public final int f202310b;

    /* JADX INFO: renamed from: c */
    @Nullable
    @ColorInt
    public final Integer f202311c;

    /* JADX INFO: renamed from: d */
    @Nullable
    @ColorInt
    public final Integer f202312d;

    /* JADX INFO: renamed from: e */
    public final float f202313e;

    /* JADX INFO: renamed from: f */
    public final boolean f202314f;

    /* JADX INFO: renamed from: g */
    public final boolean f202315g;

    /* JADX INFO: renamed from: h */
    public final boolean f202316h;

    /* JADX INFO: renamed from: i */
    public final boolean f202317i;

    /* JADX INFO: renamed from: j */
    public final int f202318j;

    /* JADX INFO: renamed from: l.z0g0$a */
    public static final class C21728a {

        /* JADX INFO: renamed from: a */
        public final int f202319a;

        /* JADX INFO: renamed from: b */
        public final int f202320b;

        /* JADX INFO: renamed from: c */
        public final int f202321c;

        /* JADX INFO: renamed from: d */
        public final int f202322d;

        /* JADX INFO: renamed from: e */
        public final int f202323e;

        /* JADX INFO: renamed from: f */
        public final int f202324f;

        /* JADX INFO: renamed from: g */
        public final int f202325g;

        /* JADX INFO: renamed from: h */
        public final int f202326h;

        /* JADX INFO: renamed from: i */
        public final int f202327i;

        /* JADX INFO: renamed from: j */
        public final int f202328j;

        /* JADX INFO: renamed from: k */
        public final int f202329k;

        public C21728a(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11) {
            this.f202319a = i;
            this.f202320b = i2;
            this.f202321c = i3;
            this.f202322d = i4;
            this.f202323e = i5;
            this.f202324f = i6;
            this.f202325g = i7;
            this.f202326h = i8;
            this.f202327i = i9;
            this.f202328j = i10;
            this.f202329k = i11;
        }

        @Nullable
        /* JADX INFO: renamed from: a */
        public static C21728a m218120a(String str) {
            String[] strArrSplit = TextUtils.split(str.substring(7), Constants.SEPARATOR_COMMA);
            int i = -1;
            int i2 = -1;
            int i3 = -1;
            int i4 = -1;
            int i5 = -1;
            int i6 = -1;
            int i7 = -1;
            int i8 = -1;
            int i9 = -1;
            int i10 = -1;
            for (int i11 = 0; i11 < strArrSplit.length; i11++) {
                String strM138051e = i11.m138051e(strArrSplit[i11].trim());
                strM138051e.getClass();
                switch (strM138051e) {
                    case "italic":
                        i7 = i11;
                        break;
                    case "underline":
                        i8 = i11;
                        break;
                    case "strikeout":
                        i9 = i11;
                        break;
                    case "primarycolour":
                        i3 = i11;
                        break;
                    case "bold":
                        i6 = i11;
                        break;
                    case "name":
                        i = i11;
                        break;
                    case "fontsize":
                        i5 = i11;
                        break;
                    case "borderstyle":
                        i10 = i11;
                        break;
                    case "alignment":
                        i2 = i11;
                        break;
                    case "outlinecolour":
                        i4 = i11;
                        break;
                }
            }
            if (i != -1) {
                return new C21728a(i, i2, i3, i4, i5, i6, i7, i8, i9, i10, strArrSplit.length);
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: l.z0g0$b */
    public static final class C21729b {

        /* JADX INFO: renamed from: c */
        public static final Pattern f202330c = Pattern.compile("\\{([^}]*)\\}");

        /* JADX INFO: renamed from: d */
        public static final Pattern f202331d = Pattern.compile(bmk0.m105071D("\\\\pos\\((%1$s),(%1$s)\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));

        /* JADX INFO: renamed from: e */
        public static final Pattern f202332e = Pattern.compile(bmk0.m105071D("\\\\move\\(%1$s,%1$s,(%1$s),(%1$s)(?:,%1$s,%1$s)?\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));

        /* JADX INFO: renamed from: f */
        public static final Pattern f202333f = Pattern.compile("\\\\an(\\d+)");

        /* JADX INFO: renamed from: a */
        public final int f202334a;

        /* JADX INFO: renamed from: b */
        @Nullable
        public final PointF f202335b;

        public C21729b(int i, @Nullable PointF pointF) {
            this.f202334a = i;
            this.f202335b = pointF;
        }

        /* JADX INFO: renamed from: a */
        public static int m218121a(String str) {
            Matcher matcher = f202333f.matcher(str);
            if (matcher.find()) {
                return z0g0.m218115e((String) w11.m204369e(matcher.group(1)));
            }
            return -1;
        }

        /* JADX INFO: renamed from: b */
        public static C21729b m218122b(String str) {
            Matcher matcher = f202330c.matcher(str);
            PointF pointF = null;
            int i = -1;
            while (matcher.find()) {
                String str2 = (String) w11.m204369e(matcher.group(1));
                try {
                    PointF pointFM218123c = m218123c(str2);
                    if (pointFM218123c != null) {
                        pointF = pointFM218123c;
                    }
                } catch (RuntimeException unused) {
                }
                try {
                    int iM218121a = m218121a(str2);
                    if (iM218121a != -1) {
                        i = iM218121a;
                    }
                } catch (RuntimeException unused2) {
                }
            }
            return new C21729b(i, pointF);
        }

        @Nullable
        /* JADX INFO: renamed from: c */
        public static PointF m218123c(String str) {
            String strGroup;
            String strGroup2;
            Matcher matcher = f202331d.matcher(str);
            Matcher matcher2 = f202332e.matcher(str);
            boolean zFind = matcher.find();
            boolean zFind2 = matcher2.find();
            if (zFind) {
                if (zFind2) {
                    kyv.m152148f("SsaStyle.Overrides", "Override has both \\pos(x,y) and \\move(x1,y1,x2,y2); using \\pos values. override='" + str + "'");
                }
                strGroup = matcher.group(1);
                strGroup2 = matcher.group(2);
            } else {
                if (!zFind2) {
                    return null;
                }
                strGroup = matcher2.group(1);
                strGroup2 = matcher2.group(2);
            }
            return new PointF(Float.parseFloat(((String) w11.m204369e(strGroup)).trim()), Float.parseFloat(((String) w11.m204369e(strGroup2)).trim()));
        }

        /* JADX INFO: renamed from: d */
        public static String m218124d(String str) {
            return f202330c.matcher(str).replaceAll("");
        }
    }

    public z0g0(String str, int i, @Nullable @ColorInt Integer num, @Nullable @ColorInt Integer num2, float f, boolean z, boolean z2, boolean z3, boolean z4, int i2) {
        this.f202309a = str;
        this.f202310b = i;
        this.f202311c = num;
        this.f202312d = num2;
        this.f202313e = f;
        this.f202314f = z;
        this.f202315g = z2;
        this.f202316h = z3;
        this.f202317i = z4;
        this.f202318j = i2;
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public static z0g0 m218112b(String str, C21728a c21728a) {
        w11.m204365a(str.startsWith("Style:"));
        String[] strArrSplit = TextUtils.split(str.substring(6), Constants.SEPARATOR_COMMA);
        int length = strArrSplit.length;
        int i = c21728a.f202329k;
        if (length != i) {
            kyv.m152151i("SsaStyle", bmk0.m105071D("Skipping malformed 'Style:' line (expected %s values, found %s): '%s'", Integer.valueOf(i), Integer.valueOf(strArrSplit.length), str));
            return null;
        }
        try {
            String strTrim = strArrSplit[c21728a.f202319a].trim();
            int i2 = c21728a.f202320b;
            int iM218115e = i2 != -1 ? m218115e(strArrSplit[i2].trim()) : -1;
            int i3 = c21728a.f202321c;
            Integer numM218118h = i3 != -1 ? m218118h(strArrSplit[i3].trim()) : null;
            int i4 = c21728a.f202322d;
            Integer numM218118h2 = i4 != -1 ? m218118h(strArrSplit[i4].trim()) : null;
            int i5 = c21728a.f202323e;
            float fM218119i = i5 != -1 ? m218119i(strArrSplit[i5].trim()) : -3.4028235E38f;
            int i6 = c21728a.f202324f;
            boolean z = false;
            boolean z2 = true;
            if (i6 != -1 && m218116f(strArrSplit[i6].trim())) {
                z = true;
            }
            int i7 = c21728a.f202325g;
            if (i7 == -1 || !m218116f(strArrSplit[i7].trim())) {
                z2 = false;
            }
            int i8 = c21728a.f202326h;
            if (i8 == -1 || !m218116f(strArrSplit[i8].trim())) {
                z2 = false;
            }
            int i9 = c21728a.f202327i;
            boolean z3 = i9 != -1 && m218116f(strArrSplit[i9].trim());
            int i10 = c21728a.f202328j;
            return new z0g0(strTrim, iM218115e, numM218118h, numM218118h2, fM218119i, z, z2, z2, z3, i10 != -1 ? m218117g(strArrSplit[i10].trim()) : -1);
        } catch (RuntimeException e) {
            kyv.m152152j("SsaStyle", "Skipping malformed 'Style:' line: '" + str + "'", e);
            return null;
        }
    }

    /* JADX INFO: renamed from: c */
    public static boolean m218113c(int i) {
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
                return true;
            default:
                return false;
        }
    }

    /* JADX INFO: renamed from: d */
    public static boolean m218114d(int i) {
        return i == 1 || i == 3;
    }

    /* JADX INFO: renamed from: e */
    public static int m218115e(String str) {
        try {
            int i = Integer.parseInt(str.trim());
            if (m218113c(i)) {
                return i;
            }
        } catch (NumberFormatException unused) {
        }
        kyv.m152151i("SsaStyle", "Ignoring unknown alignment: " + str);
        return -1;
    }

    /* JADX INFO: renamed from: f */
    public static boolean m218116f(String str) {
        try {
            int i = Integer.parseInt(str);
            return i == 1 || i == -1;
        } catch (NumberFormatException e) {
            kyv.m152152j("SsaStyle", "Failed to parse boolean value: '" + str + "'", e);
            return false;
        }
    }

    /* JADX INFO: renamed from: g */
    public static int m218117g(String str) {
        try {
            int i = Integer.parseInt(str.trim());
            if (m218114d(i)) {
                return i;
            }
        } catch (NumberFormatException unused) {
        }
        kyv.m152151i("SsaStyle", "Ignoring unknown BorderStyle: " + str);
        return -1;
    }

    @Nullable
    @ColorInt
    /* JADX INFO: renamed from: h */
    public static Integer m218118h(String str) {
        try {
            long j = str.startsWith("&H") ? Long.parseLong(str.substring(2), 16) : Long.parseLong(str);
            w11.m204365a(j <= 4294967295L);
            return Integer.valueOf(Color.argb(Ints.m16514d(((j >> 24) & 255) ^ 255), Ints.m16514d(j & 255), Ints.m16514d((j >> 8) & 255), Ints.m16514d((j >> 16) & 255)));
        } catch (IllegalArgumentException e) {
            kyv.m152152j("SsaStyle", "Failed to parse color expression: '" + str + "'", e);
            return null;
        }
    }

    /* JADX INFO: renamed from: i */
    public static float m218119i(String str) {
        try {
            return Float.parseFloat(str);
        } catch (NumberFormatException e) {
            kyv.m152152j("SsaStyle", "Failed to parse font size: '" + str + "'", e);
            return -3.4028235E38f;
        }
    }
}
