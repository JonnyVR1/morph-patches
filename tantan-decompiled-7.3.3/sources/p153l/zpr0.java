package p153l;

import android.graphics.PointF;
import androidx.annotation.Nullable;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes6.dex */
public final class zpr0 {

    /* JADX INFO: renamed from: c */
    public static final Pattern f205523c = Pattern.compile("\\{([^}]*)\\}");

    /* JADX INFO: renamed from: d */
    public static final Pattern f205524d;

    /* JADX INFO: renamed from: e */
    public static final Pattern f205525e;

    /* JADX INFO: renamed from: f */
    public static final Pattern f205526f;

    /* JADX INFO: renamed from: a */
    public final int f205527a;

    /* JADX INFO: renamed from: b */
    @Nullable
    public final PointF f205528b;

    static {
        Locale locale = Locale.US;
        f205524d = Pattern.compile(String.format(locale, "\\\\pos\\((%1$s),(%1$s)\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));
        f205525e = Pattern.compile(String.format(locale, "\\\\move\\(%1$s,%1$s,(%1$s),(%1$s)(?:,%1$s,%1$s)?\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));
        f205526f = Pattern.compile("\\\\an(\\d+)");
    }

    public zpr0(int i, @Nullable PointF pointF) {
        this.f205527a = i;
        this.f205528b = pointF;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0081  */
    /* JADX WARN: Code duplicated, block: B:25:0x008e A[Catch: RuntimeException -> 0x000a, TryCatch #1 {RuntimeException -> 0x000a, blocks: (B:23:0x0082, B:25:0x008e, B:27:0x0094, B:28:0x0099), top: B:37:0x0082 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x0099 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:43:0x009d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:44:0x009a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:45:0x0094 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:48:0x000a A[SYNTHETIC] */
    /* JADX INFO: renamed from: a */
    public static zpr0 m220928a(String str) {
        Matcher matcher;
        int iM99552d;
        String strGroup;
        PointF pointF;
        String strGroup2;
        String strGroup3;
        Matcher matcher2 = f205523c.matcher(str);
        PointF pointF2 = null;
        int i = -1;
        while (matcher2.find()) {
            String strGroup4 = matcher2.group(1);
            strGroup4.getClass();
            try {
                Matcher matcher3 = f205524d.matcher(strGroup4);
                Matcher matcher4 = f205525e.matcher(strGroup4);
                boolean zFind = matcher3.find();
                boolean zFind2 = matcher4.find();
                if (zFind) {
                    if (zFind2) {
                        y4w0.m214277e("SsaStyle.Overrides", "Override has both \\pos(x,y) and \\move(x1,y1,x2,y2); using \\pos values. override='" + strGroup4 + "'");
                    }
                    strGroup2 = matcher3.group(1);
                    strGroup3 = matcher3.group(2);
                } else {
                    if (zFind2) {
                        String strGroup5 = matcher4.group(1);
                        String strGroup6 = matcher4.group(2);
                        strGroup2 = strGroup5;
                        strGroup3 = strGroup6;
                    } else {
                        pointF = null;
                    }
                    if (pointF != null) {
                        pointF2 = pointF;
                    }
                    try {
                        matcher = f205526f.matcher(strGroup4);
                        if (matcher.find()) {
                            strGroup = matcher.group(1);
                            if (strGroup != null) {
                                throw null;
                            }
                            iM99552d = aqr0.m99552d(strGroup);
                        } else {
                            iM99552d = -1;
                        }
                        if (iM99552d != -1) {
                            i = iM99552d;
                        }
                    } catch (RuntimeException unused) {
                    }
                }
                if (strGroup2 == null) {
                    throw null;
                }
                float f = Float.parseFloat(strGroup2.trim());
                if (strGroup3 == null) {
                    throw null;
                }
                pointF = new PointF(f, Float.parseFloat(strGroup3.trim()));
                if (pointF != null) {
                    pointF2 = pointF;
                }
                matcher = f205526f.matcher(strGroup4);
                if (matcher.find()) {
                    strGroup = matcher.group(1);
                    if (strGroup != null) {
                        throw null;
                    }
                    iM99552d = aqr0.m99552d(strGroup);
                } else {
                    iM99552d = -1;
                }
                if (iM99552d != -1) {
                    i = iM99552d;
                }
            } catch (RuntimeException unused2) {
            }
        }
        return new zpr0(i, pointF2);
    }

    /* JADX INFO: renamed from: b */
    public static String m220929b(String str) {
        return f205523c.matcher(str).replaceAll("");
    }
}
