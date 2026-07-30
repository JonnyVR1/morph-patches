package p149l;

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
public final class qsf0 {

    /* JADX INFO: renamed from: a */
    public final String f156162a;

    /* JADX INFO: renamed from: b */
    public final int f156163b;

    /* JADX INFO: renamed from: c */
    @Nullable
    @ColorInt
    public final Integer f156164c;

    /* JADX INFO: renamed from: d */
    @Nullable
    @ColorInt
    public final Integer f156165d;

    /* JADX INFO: renamed from: e */
    public final float f156166e;

    /* JADX INFO: renamed from: f */
    public final boolean f156167f;

    /* JADX INFO: renamed from: g */
    public final boolean f156168g;

    /* JADX INFO: renamed from: h */
    public final boolean f156169h;

    /* JADX INFO: renamed from: i */
    public final boolean f156170i;

    /* JADX INFO: renamed from: j */
    public final int f156171j;

    /* JADX INFO: renamed from: l.qsf0$a */
    public static final class C19566a {

        /* JADX INFO: renamed from: a */
        public final int f156172a;

        /* JADX INFO: renamed from: b */
        public final int f156173b;

        /* JADX INFO: renamed from: c */
        public final int f156174c;

        /* JADX INFO: renamed from: d */
        public final int f156175d;

        /* JADX INFO: renamed from: e */
        public final int f156176e;

        /* JADX INFO: renamed from: f */
        public final int f156177f;

        /* JADX INFO: renamed from: g */
        public final int f156178g;

        /* JADX INFO: renamed from: h */
        public final int f156179h;

        /* JADX INFO: renamed from: i */
        public final int f156180i;

        /* JADX INFO: renamed from: j */
        public final int f156181j;

        /* JADX INFO: renamed from: k */
        public final int f156182k;

        public C19566a(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11) {
            this.f156172a = i;
            this.f156173b = i2;
            this.f156174c = i3;
            this.f156175d = i4;
            this.f156176e = i5;
            this.f156177f = i6;
            this.f156178g = i7;
            this.f156179h = i8;
            this.f156180i = i9;
            this.f156181j = i10;
            this.f156182k = i11;
        }

        @Nullable
        /* JADX INFO: renamed from: a */
        public static C19566a m176253a(String str) {
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
                String strM99804e = b11.m99804e(strArrSplit[i11].trim());
                strM99804e.getClass();
                switch (strM99804e) {
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
                return new C19566a(i, i2, i3, i4, i5, i6, i7, i8, i9, i10, strArrSplit.length);
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: l.qsf0$b */
    public static final class C19567b {

        /* JADX INFO: renamed from: c */
        public static final Pattern f156183c = Pattern.compile("\\{([^}]*)\\}");

        /* JADX INFO: renamed from: d */
        public static final Pattern f156184d = Pattern.compile(vck0.m197793D("\\\\pos\\((%1$s),(%1$s)\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));

        /* JADX INFO: renamed from: e */
        public static final Pattern f156185e = Pattern.compile(vck0.m197793D("\\\\move\\(%1$s,%1$s,(%1$s),(%1$s)(?:,%1$s,%1$s)?\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));

        /* JADX INFO: renamed from: f */
        public static final Pattern f156186f = Pattern.compile("\\\\an(\\d+)");

        /* JADX INFO: renamed from: a */
        public final int f156187a;

        /* JADX INFO: renamed from: b */
        @Nullable
        public final PointF f156188b;

        public C19567b(int i, @Nullable PointF pointF) {
            this.f156187a = i;
            this.f156188b = pointF;
        }

        /* JADX INFO: renamed from: a */
        public static int m176254a(String str) {
            Matcher matcher = f156186f.matcher(str);
            if (matcher.find()) {
                return qsf0.m176248e((String) p11.m167011e(matcher.group(1)));
            }
            return -1;
        }

        /* JADX INFO: renamed from: b */
        public static C19567b m176255b(String str) {
            Matcher matcher = f156183c.matcher(str);
            PointF pointF = null;
            int i = -1;
            while (matcher.find()) {
                String str2 = (String) p11.m167011e(matcher.group(1));
                try {
                    PointF pointFM176256c = m176256c(str2);
                    if (pointFM176256c != null) {
                        pointF = pointFM176256c;
                    }
                } catch (RuntimeException unused) {
                }
                try {
                    int iM176254a = m176254a(str2);
                    if (iM176254a != -1) {
                        i = iM176254a;
                    }
                } catch (RuntimeException unused2) {
                }
            }
            return new C19567b(i, pointF);
        }

        @Nullable
        /* JADX INFO: renamed from: c */
        public static PointF m176256c(String str) {
            String strGroup;
            String strGroup2;
            Matcher matcher = f156184d.matcher(str);
            Matcher matcher2 = f156185e.matcher(str);
            boolean zFind = matcher.find();
            boolean zFind2 = matcher2.find();
            if (zFind) {
                if (zFind2) {
                    jwv.m143686f("SsaStyle.Overrides", "Override has both \\pos(x,y) and \\move(x1,y1,x2,y2); using \\pos values. override='" + str + "'");
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
            return new PointF(Float.parseFloat(((String) p11.m167011e(strGroup)).trim()), Float.parseFloat(((String) p11.m167011e(strGroup2)).trim()));
        }

        /* JADX INFO: renamed from: d */
        public static String m176257d(String str) {
            return f156183c.matcher(str).replaceAll("");
        }
    }

    public qsf0(String str, int i, @Nullable @ColorInt Integer num, @Nullable @ColorInt Integer num2, float f, boolean z, boolean z2, boolean z3, boolean z4, int i2) {
        this.f156162a = str;
        this.f156163b = i;
        this.f156164c = num;
        this.f156165d = num2;
        this.f156166e = f;
        this.f156167f = z;
        this.f156168g = z2;
        this.f156169h = z3;
        this.f156170i = z4;
        this.f156171j = i2;
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public static qsf0 m176245b(String str, C19566a c19566a) {
        p11.m167007a(str.startsWith("Style:"));
        String[] strArrSplit = TextUtils.split(str.substring(6), Constants.SEPARATOR_COMMA);
        int length = strArrSplit.length;
        int i = c19566a.f156182k;
        if (length != i) {
            jwv.m143689i("SsaStyle", vck0.m197793D("Skipping malformed 'Style:' line (expected %s values, found %s): '%s'", Integer.valueOf(i), Integer.valueOf(strArrSplit.length), str));
            return null;
        }
        try {
            String strTrim = strArrSplit[c19566a.f156172a].trim();
            int i2 = c19566a.f156173b;
            int iM176248e = i2 != -1 ? m176248e(strArrSplit[i2].trim()) : -1;
            int i3 = c19566a.f156174c;
            Integer numM176251h = i3 != -1 ? m176251h(strArrSplit[i3].trim()) : null;
            int i4 = c19566a.f156175d;
            Integer numM176251h2 = i4 != -1 ? m176251h(strArrSplit[i4].trim()) : null;
            int i5 = c19566a.f156176e;
            float fM176252i = i5 != -1 ? m176252i(strArrSplit[i5].trim()) : -3.4028235E38f;
            int i6 = c19566a.f156177f;
            boolean z = false;
            boolean z2 = true;
            if (i6 != -1 && m176249f(strArrSplit[i6].trim())) {
                z = true;
            }
            int i7 = c19566a.f156178g;
            if (i7 == -1 || !m176249f(strArrSplit[i7].trim())) {
                z2 = false;
            }
            int i8 = c19566a.f156179h;
            if (i8 == -1 || !m176249f(strArrSplit[i8].trim())) {
                z2 = false;
            }
            int i9 = c19566a.f156180i;
            boolean z3 = i9 != -1 && m176249f(strArrSplit[i9].trim());
            int i10 = c19566a.f156181j;
            return new qsf0(strTrim, iM176248e, numM176251h, numM176251h2, fM176252i, z, z2, z2, z3, i10 != -1 ? m176250g(strArrSplit[i10].trim()) : -1);
        } catch (RuntimeException e) {
            jwv.m143690j("SsaStyle", "Skipping malformed 'Style:' line: '" + str + "'", e);
            return null;
        }
    }

    /* JADX INFO: renamed from: c */
    public static boolean m176246c(int i) {
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
    public static boolean m176247d(int i) {
        return i == 1 || i == 3;
    }

    /* JADX INFO: renamed from: e */
    public static int m176248e(String str) {
        try {
            int i = Integer.parseInt(str.trim());
            if (m176246c(i)) {
                return i;
            }
        } catch (NumberFormatException unused) {
        }
        jwv.m143689i("SsaStyle", "Ignoring unknown alignment: " + str);
        return -1;
    }

    /* JADX INFO: renamed from: f */
    public static boolean m176249f(String str) {
        try {
            int i = Integer.parseInt(str);
            return i == 1 || i == -1;
        } catch (NumberFormatException e) {
            jwv.m143690j("SsaStyle", "Failed to parse boolean value: '" + str + "'", e);
            return false;
        }
    }

    /* JADX INFO: renamed from: g */
    public static int m176250g(String str) {
        try {
            int i = Integer.parseInt(str.trim());
            if (m176247d(i)) {
                return i;
            }
        } catch (NumberFormatException unused) {
        }
        jwv.m143689i("SsaStyle", "Ignoring unknown BorderStyle: " + str);
        return -1;
    }

    @Nullable
    @ColorInt
    /* JADX INFO: renamed from: h */
    public static Integer m176251h(String str) {
        try {
            long j = str.startsWith("&H") ? Long.parseLong(str.substring(2), 16) : Long.parseLong(str);
            p11.m167007a(j <= 4294967295L);
            return Integer.valueOf(Color.argb(Ints.m16459d(((j >> 24) & 255) ^ 255), Ints.m16459d(j & 255), Ints.m16459d((j >> 8) & 255), Ints.m16459d((j >> 16) & 255)));
        } catch (IllegalArgumentException e) {
            jwv.m143690j("SsaStyle", "Failed to parse color expression: '" + str + "'", e);
            return null;
        }
    }

    /* JADX INFO: renamed from: i */
    public static float m176252i(String str) {
        try {
            return Float.parseFloat(str);
        } catch (NumberFormatException e) {
            jwv.m143690j("SsaStyle", "Failed to parse font size: '" + str + "'", e);
            return -3.4028235E38f;
        }
    }
}
