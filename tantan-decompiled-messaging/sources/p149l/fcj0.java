package p149l;

import android.text.Layout;
import androidx.annotation.Nullable;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.google.android.exoplayer2.text.SubtitleDecoderException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.p046p1.mobile.putong.data.OMSFontStyle;
import com.p046p1.mobile.putong.data.OMSSwipeMoment;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.eclipse.jetty.http.HttpTokens;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class fcj0 extends phf0 {

    /* JADX INFO: renamed from: p */
    public static final Pattern f96816p = Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");

    /* JADX INFO: renamed from: q */
    public static final Pattern f96817q = Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");

    /* JADX INFO: renamed from: r */
    public static final Pattern f96818r = Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");

    /* JADX INFO: renamed from: s */
    public static final Pattern f96819s = Pattern.compile("^([-+]?\\d+\\.?\\d*?)%$");

    /* JADX INFO: renamed from: t */
    public static final Pattern f96820t = Pattern.compile("^(\\d+\\.?\\d*?)% (\\d+\\.?\\d*?)%$");

    /* JADX INFO: renamed from: u */
    public static final Pattern f96821u = Pattern.compile("^(\\d+\\.?\\d*?)px (\\d+\\.?\\d*?)px$");

    /* JADX INFO: renamed from: v */
    public static final Pattern f96822v = Pattern.compile("^(\\d+) (\\d+)$");

    /* JADX INFO: renamed from: w */
    public static final C16798b f96823w = new C16798b(30.0f, 1, 1);

    /* JADX INFO: renamed from: x */
    public static final C16797a f96824x = new C16797a(32, 15);

    /* JADX INFO: renamed from: o */
    public final XmlPullParserFactory f96825o;

    /* JADX INFO: renamed from: l.fcj0$a */
    public static final class C16797a {

        /* JADX INFO: renamed from: a */
        public final int f96826a;

        /* JADX INFO: renamed from: b */
        public final int f96827b;

        public C16797a(int i, int i2) {
            this.f96826a = i;
            this.f96827b = i2;
        }
    }

    /* JADX INFO: renamed from: l.fcj0$b */
    public static final class C16798b {

        /* JADX INFO: renamed from: a */
        public final float f96828a;

        /* JADX INFO: renamed from: b */
        public final int f96829b;

        /* JADX INFO: renamed from: c */
        public final int f96830c;

        public C16798b(float f, int i, int i2) {
            this.f96828a = f;
            this.f96829b = i;
            this.f96830c = i2;
        }
    }

    /* JADX INFO: renamed from: l.fcj0$c */
    public static final class C16799c {

        /* JADX INFO: renamed from: a */
        public final int f96831a;

        /* JADX INFO: renamed from: b */
        public final int f96832b;

        public C16799c(int i, int i2) {
            this.f96831a = i;
            this.f96832b = i2;
        }
    }

    public fcj0() {
        super("TtmlDecoder");
        try {
            XmlPullParserFactory xmlPullParserFactoryNewInstance = XmlPullParserFactory.newInstance();
            this.f96825o = xmlPullParserFactoryNewInstance;
            xmlPullParserFactoryNewInstance.setNamespaceAware(true);
        } catch (XmlPullParserException e) {
            pkq0.m170054a("Couldn't create XmlPullParserFactory instance", e);
            throw null;
        }
    }

    /* JADX INFO: renamed from: B */
    public static jcj0 m120436B(@Nullable jcj0 jcj0Var) {
        return jcj0Var == null ? new jcj0() : jcj0Var;
    }

    /* JADX INFO: renamed from: C */
    public static boolean m120437C(String str) {
        return str.equals("tt") || str.equals("head") || str.equals("body") || str.equals("div") || str.equals("p") || str.equals("span") || str.equals("br") || str.equals("style") || str.equals("styling") || str.equals("layout") || str.equals("region") || str.equals("metadata") || str.equals("image") || str.equals("data") || str.equals("information");
    }

    @Nullable
    /* JADX INFO: renamed from: D */
    public static Layout.Alignment m120438D(String str) {
        String strM99804e = b11.m99804e(str);
        strM99804e.getClass();
        switch (strM99804e) {
            case "center":
                return Layout.Alignment.ALIGN_CENTER;
            case "end":
            case "right":
                return Layout.Alignment.ALIGN_OPPOSITE;
            case "left":
            case "start":
                return Layout.Alignment.ALIGN_NORMAL;
            default:
                return null;
        }
    }

    /* JADX INFO: renamed from: E */
    public static C16797a m120439E(XmlPullParser xmlPullParser, C16797a c16797a) throws SubtitleDecoderException {
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "cellResolution");
        if (attributeValue == null) {
            return c16797a;
        }
        Matcher matcher = f96822v.matcher(attributeValue);
        if (!matcher.matches()) {
            jwv.m143689i("TtmlDecoder", "Ignoring malformed cell resolution: ".concat(attributeValue));
            return c16797a;
        }
        try {
            int i = Integer.parseInt((String) p11.m167011e(matcher.group(1)));
            int i2 = Integer.parseInt((String) p11.m167011e(matcher.group(2)));
            if (i != 0 && i2 != 0) {
                return new C16797a(i, i2);
            }
            throw new SubtitleDecoderException("Invalid cell resolution " + i + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + i2);
        } catch (NumberFormatException unused) {
            jwv.m143689i("TtmlDecoder", "Ignoring malformed cell resolution: ".concat(attributeValue));
            return c16797a;
        }
    }

    /* JADX INFO: renamed from: F */
    public static void m120440F(String str, jcj0 jcj0Var) throws SubtitleDecoderException {
        Matcher matcher;
        String[] strArrM197841a1 = vck0.m197841a1(str, "\\s+");
        if (strArrM197841a1.length == 1) {
            matcher = f96818r.matcher(str);
        } else {
            if (strArrM197841a1.length != 2) {
                throw new SubtitleDecoderException("Invalid number of entries for fontSize: " + strArrM197841a1.length + ".");
            }
            matcher = f96818r.matcher(strArrM197841a1[1]);
            jwv.m143689i("TtmlDecoder", "Multiple values in fontSize attribute. Picking the second value for vertical font size and ignoring the first.");
        }
        if (!matcher.matches()) {
            throw new SubtitleDecoderException("Invalid expression for fontSize: '" + str + "'.");
        }
        String str2 = (String) p11.m167011e(matcher.group(3));
        str2.getClass();
        switch (str2) {
            case "%":
                jcj0Var.m140979z(3);
                break;
            case "em":
                jcj0Var.m140979z(2);
                break;
            case "px":
                jcj0Var.m140979z(1);
                break;
            default:
                throw new SubtitleDecoderException("Invalid unit for fontSize: '" + str2 + "'.");
        }
        jcj0Var.m140978y(Float.parseFloat((String) p11.m167011e(matcher.group(1))));
    }

    /* JADX INFO: renamed from: G */
    public static C16798b m120441G(XmlPullParser xmlPullParser) throws SubtitleDecoderException {
        float f;
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRate");
        int i = attributeValue != null ? Integer.parseInt(attributeValue) : 30;
        String attributeValue2 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRateMultiplier");
        if (attributeValue2 != null) {
            String[] strArrM197841a1 = vck0.m197841a1(attributeValue2, MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
            if (strArrM197841a1.length != 2) {
                throw new SubtitleDecoderException("frameRateMultiplier doesn't have 2 parts");
            }
            f = Integer.parseInt(strArrM197841a1[0]) / Integer.parseInt(strArrM197841a1[1]);
        } else {
            f = 1.0f;
        }
        C16798b c16798b = f96823w;
        int i2 = c16798b.f96829b;
        String attributeValue3 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "subFrameRate");
        if (attributeValue3 != null) {
            i2 = Integer.parseInt(attributeValue3);
        }
        int i3 = c16798b.f96830c;
        String attributeValue4 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "tickRate");
        if (attributeValue4 != null) {
            i3 = Integer.parseInt(attributeValue4);
        }
        return new C16798b(i * f, i2, i3);
    }

    /* JADX INFO: renamed from: H */
    public static Map<String, jcj0> m120442H(XmlPullParser xmlPullParser, Map<String, jcj0> map, C16797a c16797a, @Nullable C16799c c16799c, Map<String, hcj0> map2, Map<String, String> map3) throws XmlPullParserException, IOException {
        do {
            xmlPullParser.next();
            if (gdq0.m125588f(xmlPullParser, "style")) {
                String strM125583a = gdq0.m125583a(xmlPullParser, "style");
                jcj0 jcj0VarM120447M = m120447M(xmlPullParser, new jcj0());
                if (strM125583a != null) {
                    for (String str : m120448N(strM125583a)) {
                        jcj0VarM120447M.m140954a(map.get(str));
                    }
                }
                String strM140960g = jcj0VarM120447M.m140960g();
                if (strM140960g != null) {
                    map.put(strM140960g, jcj0VarM120447M);
                }
            } else if (gdq0.m125588f(xmlPullParser, "region")) {
                hcj0 hcj0VarM120445K = m120445K(xmlPullParser, c16797a, c16799c);
                if (hcj0VarM120445K != null) {
                    map2.put(hcj0VarM120445K.f107052a, hcj0VarM120445K);
                }
            } else if (gdq0.m125588f(xmlPullParser, "metadata")) {
                m120443I(xmlPullParser, map3);
            }
        } while (!gdq0.m125586d(xmlPullParser, "head"));
        return map;
    }

    /* JADX INFO: renamed from: I */
    public static void m120443I(XmlPullParser xmlPullParser, Map<String, String> map) throws XmlPullParserException, IOException {
        String strM125583a;
        do {
            xmlPullParser.next();
            if (gdq0.m125588f(xmlPullParser, "image") && (strM125583a = gdq0.m125583a(xmlPullParser, "id")) != null) {
                map.put(strM125583a, xmlPullParser.nextText());
            }
        } while (!gdq0.m125586d(xmlPullParser, "metadata"));
    }

    /* JADX INFO: renamed from: J */
    public static gcj0 m120444J(XmlPullParser xmlPullParser, @Nullable gcj0 gcj0Var, Map<String, hcj0> map, C16798b c16798b) throws SubtitleDecoderException {
        XmlPullParser xmlPullParser2 = xmlPullParser;
        int attributeCount = xmlPullParser2.getAttributeCount();
        String strSubstring = null;
        jcj0 jcj0VarM120447M = m120447M(xmlPullParser2, null);
        long jM120449O = -9223372036854775807L;
        long jM120449O2 = -9223372036854775807L;
        long jM120449O3 = -9223372036854775807L;
        String[] strArr = null;
        String str = "";
        int i = 0;
        while (i < attributeCount) {
            String attributeName = xmlPullParser2.getAttributeName(i);
            int i2 = attributeCount;
            String attributeValue = xmlPullParser2.getAttributeValue(i);
            attributeName.getClass();
            switch (attributeName) {
                case "region":
                    if (map.containsKey(attributeValue)) {
                        str = attributeValue;
                        continue;
                    }
                    i++;
                    xmlPullParser2 = xmlPullParser;
                    attributeCount = i2;
                    break;
                case "dur":
                    jM120449O3 = m120449O(attributeValue, c16798b);
                    break;
                case "end":
                    jM120449O2 = m120449O(attributeValue, c16798b);
                    break;
                case "begin":
                    jM120449O = m120449O(attributeValue, c16798b);
                    break;
                case "style":
                    String[] strArrM120448N = m120448N(attributeValue);
                    if (strArrM120448N.length > 0) {
                        strArr = strArrM120448N;
                        break;
                    }
                    break;
                case "backgroundImage":
                    if (attributeValue.startsWith("#")) {
                        strSubstring = attributeValue.substring(1);
                        break;
                    }
                    break;
            }
            i++;
            xmlPullParser2 = xmlPullParser;
            attributeCount = i2;
        }
        if (gcj0Var != null) {
            long j = gcj0Var.f102029d;
            if (j != -9223372036854775807L) {
                if (jM120449O != -9223372036854775807L) {
                    jM120449O += j;
                }
                if (jM120449O2 != -9223372036854775807L) {
                    jM120449O2 += j;
                }
            }
        }
        long j2 = jM120449O;
        if (jM120449O2 == -9223372036854775807L) {
            if (jM120449O3 != -9223372036854775807L) {
                jM120449O2 = j2 + jM120449O3;
            } else if (gcj0Var != null) {
                long j3 = gcj0Var.f102030e;
                if (j3 != -9223372036854775807L) {
                    jM120449O2 = j3;
                }
            }
        }
        return gcj0.m125501c(xmlPullParser.getName(), j2, jM120449O2, jcj0VarM120447M, strArr, str, strSubstring, gcj0Var);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:45:0x013e  */
    /* JADX WARN: Code duplicated, block: B:66:0x0189  */
    @Nullable
    /* JADX INFO: renamed from: K */
    public static hcj0 m120445K(XmlPullParser xmlPullParser, C16797a c16797a, @Nullable C16799c c16799c) {
        float f;
        float f2;
        float f3;
        float f4;
        int i;
        float f5;
        int i2;
        String strM125583a = gdq0.m125583a(xmlPullParser, "id");
        if (strM125583a == null) {
            return null;
        }
        String strM125583a2 = gdq0.m125583a(xmlPullParser, "origin");
        if (strM125583a2 == null) {
            jwv.m143689i("TtmlDecoder", "Ignoring region without an origin");
            return null;
        }
        Pattern pattern = f96820t;
        Matcher matcher = pattern.matcher(strM125583a2);
        Pattern pattern2 = f96821u;
        Matcher matcher2 = pattern2.matcher(strM125583a2);
        int i3 = 2;
        if (matcher.matches()) {
            try {
                f = Float.parseFloat((String) p11.m167011e(matcher.group(1))) / 100.0f;
                f2 = Float.parseFloat((String) p11.m167011e(matcher.group(2))) / 100.0f;
            } catch (NumberFormatException unused) {
                jwv.m143689i("TtmlDecoder", "Ignoring region with malformed origin: ".concat(strM125583a2));
                return null;
            }
        } else {
            if (!matcher2.matches()) {
                jwv.m143689i("TtmlDecoder", "Ignoring region with unsupported origin: ".concat(strM125583a2));
                return null;
            }
            if (c16799c == null) {
                jwv.m143689i("TtmlDecoder", "Ignoring region with missing tts:extent: ".concat(strM125583a2));
                return null;
            }
            try {
                int i4 = Integer.parseInt((String) p11.m167011e(matcher2.group(1)));
                int i5 = Integer.parseInt((String) p11.m167011e(matcher2.group(2)));
                float f6 = i4 / c16799c.f96831a;
                float f7 = i5 / c16799c.f96832b;
                f = f6;
                f2 = f7;
            } catch (NumberFormatException unused2) {
                jwv.m143689i("TtmlDecoder", "Ignoring region with malformed origin: ".concat(strM125583a2));
                return null;
            }
        }
        String strM125583a3 = gdq0.m125583a(xmlPullParser, "extent");
        if (strM125583a3 == null) {
            jwv.m143689i("TtmlDecoder", "Ignoring region without an extent");
            return null;
        }
        Matcher matcher3 = pattern.matcher(strM125583a3);
        Matcher matcher4 = pattern2.matcher(strM125583a3);
        if (matcher3.matches()) {
            try {
                f3 = Float.parseFloat((String) p11.m167011e(matcher3.group(1))) / 100.0f;
                f4 = Float.parseFloat((String) p11.m167011e(matcher3.group(2))) / 100.0f;
            } catch (NumberFormatException unused3) {
                jwv.m143689i("TtmlDecoder", "Ignoring region with malformed extent: ".concat(strM125583a2));
                return null;
            }
        } else {
            if (!matcher4.matches()) {
                jwv.m143689i("TtmlDecoder", "Ignoring region with unsupported extent: ".concat(strM125583a2));
                return null;
            }
            if (c16799c == null) {
                jwv.m143689i("TtmlDecoder", "Ignoring region with missing tts:extent: ".concat(strM125583a2));
                return null;
            }
            try {
                int i6 = Integer.parseInt((String) p11.m167011e(matcher4.group(1)));
                int i7 = Integer.parseInt((String) p11.m167011e(matcher4.group(2)));
                float f8 = i6 / c16799c.f96831a;
                f4 = i7 / c16799c.f96832b;
                f3 = f8;
            } catch (NumberFormatException unused4) {
                jwv.m143689i("TtmlDecoder", "Ignoring region with malformed extent: ".concat(strM125583a2));
                return null;
            }
        }
        float f9 = f4;
        String strM125583a4 = gdq0.m125583a(xmlPullParser, "displayAlign");
        if (strM125583a4 != null) {
            String strM99804e = b11.m99804e(strM125583a4);
            strM99804e.getClass();
            if (strM99804e.equals("center")) {
                f5 = f2 + (f9 / 2.0f);
                i = 1;
            } else if (strM99804e.equals(OMSSwipeMoment.after)) {
                f5 = f2 + f9;
                i = 2;
            } else {
                i = 0;
                f5 = f2;
            }
        } else {
            i = 0;
            f5 = f2;
        }
        float f10 = 1.0f / c16797a.f96827b;
        String strM125583a5 = gdq0.m125583a(xmlPullParser, "writingMode");
        if (strM125583a5 != null) {
            String strM99804e2 = b11.m99804e(strM125583a5);
            strM99804e2.getClass();
            switch (strM99804e2) {
                case "tb":
                case "tblr":
                    i2 = i3;
                    break;
                case "tbrl":
                    i2 = 1;
                    break;
                default:
                    i3 = Integer.MIN_VALUE;
                    i2 = i3;
                    break;
            }
        } else {
            i3 = Integer.MIN_VALUE;
            i2 = i3;
        }
        return new hcj0(strM125583a, f, f5, 0, i, f3, f9, 1, f10, i2);
    }

    /* JADX INFO: renamed from: L */
    public static float m120446L(String str) {
        Matcher matcher = f96819s.matcher(str);
        if (!matcher.matches()) {
            jwv.m143689i("TtmlDecoder", "Invalid value for shear: " + str);
            return Float.MAX_VALUE;
        }
        try {
            return Math.min(100.0f, Math.max(-100.0f, Float.parseFloat((String) p11.m167011e(matcher.group(1)))));
        } catch (NumberFormatException e) {
            jwv.m143690j("TtmlDecoder", "Failed to parse shear: " + str, e);
            return Float.MAX_VALUE;
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: M */
    public static jcj0 m120447M(XmlPullParser xmlPullParser, jcj0 jcj0Var) {
        byte b;
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            String attributeValue = xmlPullParser.getAttributeValue(i);
            String attributeName = xmlPullParser.getAttributeName(i);
            attributeName.getClass();
            switch (attributeName.hashCode()) {
                case -1550943582:
                    b = attributeName.equals("fontStyle") ? (byte) 0 : (byte) -1;
                    break;
                case -1224696685:
                    b = attributeName.equals("fontFamily") ? (byte) 1 : (byte) -1;
                    break;
                case -1065511464:
                    b = attributeName.equals("textAlign") ? (byte) 2 : (byte) -1;
                    break;
                case -879295043:
                    b = attributeName.equals("textDecoration") ? (byte) 3 : (byte) -1;
                    break;
                case -734428249:
                    b = attributeName.equals("fontWeight") ? (byte) 4 : (byte) -1;
                    break;
                case 3355:
                    b = attributeName.equals("id") ? (byte) 5 : (byte) -1;
                    break;
                case 3511770:
                    b = attributeName.equals("ruby") ? (byte) 6 : (byte) -1;
                    break;
                case 94842723:
                    b = attributeName.equals("color") ? (byte) 7 : (byte) -1;
                    break;
                case 109403361:
                    b = attributeName.equals("shear") ? (byte) 8 : (byte) -1;
                    break;
                case 110138194:
                    b = attributeName.equals("textCombine") ? (byte) 9 : (byte) -1;
                    break;
                case 365601008:
                    b = attributeName.equals("fontSize") ? (byte) 10 : (byte) -1;
                    break;
                case 921125321:
                    b = attributeName.equals("textEmphasis") ? (byte) 11 : (byte) -1;
                    break;
                case 1115953443:
                    b = attributeName.equals("rubyPosition") ? (byte) 12 : (byte) -1;
                    break;
                case 1287124693:
                    b = attributeName.equals("backgroundColor") ? HttpTokens.CARRIAGE_RETURN : (byte) -1;
                    break;
                case 1754920356:
                    b = attributeName.equals("multiRowAlign") ? (byte) 14 : (byte) -1;
                    break;
                default:
                    b = -1;
                    break;
            }
            switch (b) {
                case 0:
                    jcj0Var = m120436B(jcj0Var).m140944B(OMSFontStyle.italic.equalsIgnoreCase(attributeValue));
                    break;
                case 1:
                    jcj0Var = m120436B(jcj0Var).m140977x(attributeValue);
                    break;
                case 2:
                    jcj0Var = m120436B(jcj0Var).m140950H(m120438D(attributeValue));
                    break;
                case 3:
                    String strM99804e = b11.m99804e(attributeValue);
                    strM99804e.getClass();
                    switch (strM99804e) {
                        case "nounderline":
                            jcj0Var = m120436B(jcj0Var).m140953K(false);
                            break;
                        case "underline":
                            jcj0Var = m120436B(jcj0Var).m140953K(true);
                            break;
                        case "nolinethrough":
                            jcj0Var = m120436B(jcj0Var).m140945C(false);
                            break;
                        case "linethrough":
                            jcj0Var = m120436B(jcj0Var).m140945C(true);
                            break;
                    }
                    break;
                case 4:
                    jcj0Var = m120436B(jcj0Var).m140975v(OMSFontStyle.bold.equalsIgnoreCase(attributeValue));
                    break;
                case 5:
                    if ("style".equals(xmlPullParser.getName())) {
                        jcj0Var = m120436B(jcj0Var).m140943A(attributeValue);
                    }
                    break;
                case 6:
                    String strM99804e2 = b11.m99804e(attributeValue);
                    strM99804e2.getClass();
                    switch (strM99804e2) {
                        case "baseContainer":
                        case "base":
                            jcj0Var = m120436B(jcj0Var).m140948F(2);
                            break;
                        case "container":
                            jcj0Var = m120436B(jcj0Var).m140948F(1);
                            break;
                        case "delimiter":
                            jcj0Var = m120436B(jcj0Var).m140948F(4);
                            break;
                        case "textContainer":
                        case "text":
                            jcj0Var = m120436B(jcj0Var).m140948F(3);
                            break;
                    }
                    break;
                case 7:
                    jcj0Var = m120436B(jcj0Var);
                    try {
                        jcj0Var.m140976w(ee5.m115848c(attributeValue));
                    } catch (IllegalArgumentException unused) {
                        jwv.m143689i("TtmlDecoder", "Failed parsing color value: " + attributeValue);
                    }
                    break;
                case 8:
                    jcj0Var = m120436B(jcj0Var).m140949G(m120446L(attributeValue));
                    break;
                case 9:
                    String strM99804e3 = b11.m99804e(attributeValue);
                    strM99804e3.getClass();
                    if (strM99804e3.equals("all")) {
                        jcj0Var = m120436B(jcj0Var).m140951I(true);
                    } else if (strM99804e3.equals("none")) {
                        jcj0Var = m120436B(jcj0Var).m140951I(false);
                    }
                    break;
                case 10:
                    try {
                        jcj0Var = m120436B(jcj0Var);
                        m120440F(attributeValue, jcj0Var);
                    } catch (SubtitleDecoderException unused2) {
                        jwv.m143689i("TtmlDecoder", "Failed parsing fontSize value: " + attributeValue);
                    }
                    break;
                case 11:
                    jcj0Var = m120436B(jcj0Var).m140952J(qii0.m174896a(attributeValue));
                    break;
                case 12:
                    String strM99804e4 = b11.m99804e(attributeValue);
                    strM99804e4.getClass();
                    if (strM99804e4.equals(OMSSwipeMoment.before)) {
                        jcj0Var = m120436B(jcj0Var).m140947E(1);
                    } else if (strM99804e4.equals(OMSSwipeMoment.after)) {
                        jcj0Var = m120436B(jcj0Var).m140947E(2);
                    }
                    break;
                case 13:
                    jcj0Var = m120436B(jcj0Var);
                    try {
                        jcj0Var.m140974u(ee5.m115848c(attributeValue));
                    } catch (IllegalArgumentException unused3) {
                        jwv.m143689i("TtmlDecoder", "Failed parsing background value: " + attributeValue);
                    }
                    break;
                case 14:
                    jcj0Var = m120436B(jcj0Var).m140946D(m120438D(attributeValue));
                    break;
            }
        }
        return jcj0Var;
    }

    /* JADX INFO: renamed from: N */
    public static String[] m120448N(String str) {
        String strTrim = str.trim();
        return strTrim.isEmpty() ? new String[0] : vck0.m197841a1(strTrim, "\\s+");
    }

    /* JADX INFO: renamed from: O */
    public static long m120449O(String str, C16798b c16798b) throws SubtitleDecoderException {
        double d;
        double d2;
        Matcher matcher = f96816p.matcher(str);
        if (matcher.matches()) {
            double d3 = (Long.parseLong((String) p11.m167011e(matcher.group(1))) * 3600) + (Long.parseLong((String) p11.m167011e(matcher.group(2))) * 60) + Long.parseLong((String) p11.m167011e(matcher.group(3)));
            String strGroup = matcher.group(4);
            double d4 = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
            double d5 = d3 + (strGroup != null ? Double.parseDouble(strGroup) : 0.0d);
            String strGroup2 = matcher.group(5);
            double d6 = d5 + (strGroup2 != null ? Long.parseLong(strGroup2) / c16798b.f96828a : 0.0d);
            String strGroup3 = matcher.group(6);
            if (strGroup3 != null) {
                d4 = (Long.parseLong(strGroup3) / ((double) c16798b.f96829b)) / ((double) c16798b.f96828a);
            }
            return (long) ((d6 + d4) * 1000000.0d);
        }
        Matcher matcher2 = f96817q.matcher(str);
        if (!matcher2.matches()) {
            throw new SubtitleDecoderException("Malformed time expression: " + str);
        }
        double d7 = Double.parseDouble((String) p11.m167011e(matcher2.group(1)));
        String str2 = (String) p11.m167011e(matcher2.group(2));
        str2.getClass();
        switch (str2) {
            case "f":
                d = c16798b.f96828a;
                d7 /= d;
                return (long) (d7 * 1000000.0d);
            case "h":
                d2 = 3600.0d;
                break;
            case "m":
                d2 = 60.0d;
                break;
            case "t":
                d = c16798b.f96830c;
                d7 /= d;
                return (long) (d7 * 1000000.0d);
            case "ms":
                d = 1000.0d;
                d7 /= d;
                return (long) (d7 * 1000000.0d);
            default:
                return (long) (d7 * 1000000.0d);
        }
        d7 *= d2;
        return (long) (d7 * 1000000.0d);
    }

    @Nullable
    /* JADX INFO: renamed from: P */
    public static C16799c m120450P(XmlPullParser xmlPullParser) {
        String strM125583a = gdq0.m125583a(xmlPullParser, "extent");
        if (strM125583a == null) {
            return null;
        }
        Matcher matcher = f96821u.matcher(strM125583a);
        if (!matcher.matches()) {
            jwv.m143689i("TtmlDecoder", "Ignoring non-pixel tts extent: ".concat(strM125583a));
            return null;
        }
        try {
            return new C16799c(Integer.parseInt((String) p11.m167011e(matcher.group(1))), Integer.parseInt((String) p11.m167011e(matcher.group(2))));
        } catch (NumberFormatException unused) {
            jwv.m143689i("TtmlDecoder", "Ignoring malformed tts extent: ".concat(strM125583a));
            return null;
        }
    }

    @Override // p149l.phf0
    /* JADX INFO: renamed from: A */
    public e5g0 mo97681A(byte[] bArr, int i, boolean z) throws SubtitleDecoderException {
        e5g0 e5g0Var;
        e5g0 e5g0Var2 = null;
        try {
            try {
                XmlPullParser xmlPullParserNewPullParser = this.f96825o.newPullParser();
                HashMap map = new HashMap();
                HashMap map2 = new HashMap();
                HashMap map3 = new HashMap();
                map2.put("", new hcj0(""));
                int i2 = 0;
                xmlPullParserNewPullParser.setInput(new ByteArrayInputStream(bArr, 0, i), null);
                ArrayDeque arrayDeque = new ArrayDeque();
                int eventType = xmlPullParserNewPullParser.getEventType();
                C16798b c16798bM120441G = f96823w;
                C16797a c16797aM120439E = f96824x;
                kcj0 kcj0Var = null;
                C16799c c16799cM120450P = null;
                while (eventType != 1) {
                    gcj0 gcj0Var = (gcj0) arrayDeque.peek();
                    if (i2 == 0) {
                        String name = xmlPullParserNewPullParser.getName();
                        e5g0Var = e5g0Var2;
                        if (eventType == 2) {
                            try {
                                if ("tt".equals(name)) {
                                    c16798bM120441G = m120441G(xmlPullParserNewPullParser);
                                    c16797aM120439E = m120439E(xmlPullParserNewPullParser, f96824x);
                                    c16799cM120450P = m120450P(xmlPullParserNewPullParser);
                                }
                                C16798b c16798b = c16798bM120441G;
                                C16797a c16797a = c16797aM120439E;
                                C16799c c16799c = c16799cM120450P;
                                if (m120437C(name)) {
                                    if ("head".equals(name)) {
                                        m120442H(xmlPullParserNewPullParser, map, c16797a, c16799c, map2, map3);
                                    } else {
                                        try {
                                            gcj0 gcj0VarM120444J = m120444J(xmlPullParserNewPullParser, gcj0Var, map2, c16798b);
                                            arrayDeque.push(gcj0VarM120444J);
                                            if (gcj0Var != null) {
                                                gcj0Var.m125505a(gcj0VarM120444J);
                                            }
                                        } catch (SubtitleDecoderException e) {
                                            jwv.m143690j("TtmlDecoder", "Suppressing parser error", e);
                                            i2++;
                                        }
                                    }
                                    c16799cM120450P = c16799c;
                                    c16797aM120439E = c16797a;
                                    c16798bM120441G = c16798b;
                                } else {
                                    jwv.m143686f("TtmlDecoder", "Ignoring unsupported tag: " + xmlPullParserNewPullParser.getName());
                                }
                                i2++;
                                c16799cM120450P = c16799c;
                                c16797aM120439E = c16797a;
                                c16798bM120441G = c16798b;
                            } catch (IOException e2) {
                                e = e2;
                                byv.m104511a("Unexpected error when reading input.", e);
                                return e5g0Var;
                            }
                        } else if (eventType == 4) {
                            ((gcj0) p11.m167011e(gcj0Var)).m125505a(gcj0.m125502d(xmlPullParserNewPullParser.getText()));
                        } else if (eventType == 3) {
                            if (xmlPullParserNewPullParser.getName().equals("tt")) {
                                kcj0Var = new kcj0((gcj0) p11.m167011e((gcj0) arrayDeque.peek()), map, map2, map3);
                            }
                            arrayDeque.pop();
                        }
                    } else {
                        e5g0Var = e5g0Var2;
                        if (eventType == 2) {
                            i2++;
                        } else if (eventType == 3) {
                            i2--;
                        }
                    }
                    xmlPullParserNewPullParser.next();
                    eventType = xmlPullParserNewPullParser.getEventType();
                    e5g0Var2 = e5g0Var;
                }
                e5g0Var = e5g0Var2;
                if (kcj0Var != null) {
                    return kcj0Var;
                }
                throw new SubtitleDecoderException("No TTML subtitles found");
            } catch (XmlPullParserException e3) {
                throw new SubtitleDecoderException("Unable to decode source", e3);
            }
        } catch (IOException e4) {
            e = e4;
            e5g0Var = e5g0Var2;
        }
    }
}
