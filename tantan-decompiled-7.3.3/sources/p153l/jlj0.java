package p153l;

import android.text.Layout;
import androidx.annotation.Nullable;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.google.android.exoplayer2.text.SubtitleDecoderException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.p051p1.mobile.putong.data.OMSFontStyle;
import com.p051p1.mobile.putong.data.OMSSwipeMoment;
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
public final class jlj0 extends xpf0 {

    /* JADX INFO: renamed from: p */
    public static final Pattern f121560p = Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");

    /* JADX INFO: renamed from: q */
    public static final Pattern f121561q = Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");

    /* JADX INFO: renamed from: r */
    public static final Pattern f121562r = Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");

    /* JADX INFO: renamed from: s */
    public static final Pattern f121563s = Pattern.compile("^([-+]?\\d+\\.?\\d*?)%$");

    /* JADX INFO: renamed from: t */
    public static final Pattern f121564t = Pattern.compile("^(\\d+\\.?\\d*?)% (\\d+\\.?\\d*?)%$");

    /* JADX INFO: renamed from: u */
    public static final Pattern f121565u = Pattern.compile("^(\\d+\\.?\\d*?)px (\\d+\\.?\\d*?)px$");

    /* JADX INFO: renamed from: v */
    public static final Pattern f121566v = Pattern.compile("^(\\d+) (\\d+)$");

    /* JADX INFO: renamed from: w */
    public static final C17973b f121567w = new C17973b(30.0f, 1, 1);

    /* JADX INFO: renamed from: x */
    public static final C17972a f121568x = new C17972a(32, 15);

    /* JADX INFO: renamed from: o */
    public final XmlPullParserFactory f121569o;

    /* JADX INFO: renamed from: l.jlj0$a */
    public static final class C17972a {

        /* JADX INFO: renamed from: a */
        public final int f121570a;

        /* JADX INFO: renamed from: b */
        public final int f121571b;

        public C17972a(int i, int i2) {
            this.f121570a = i;
            this.f121571b = i2;
        }
    }

    /* JADX INFO: renamed from: l.jlj0$b */
    public static final class C17973b {

        /* JADX INFO: renamed from: a */
        public final float f121572a;

        /* JADX INFO: renamed from: b */
        public final int f121573b;

        /* JADX INFO: renamed from: c */
        public final int f121574c;

        public C17973b(float f, int i, int i2) {
            this.f121572a = f;
            this.f121573b = i;
            this.f121574c = i2;
        }
    }

    /* JADX INFO: renamed from: l.jlj0$c */
    public static final class C17974c {

        /* JADX INFO: renamed from: a */
        public final int f121575a;

        /* JADX INFO: renamed from: b */
        public final int f121576b;

        public C17974c(int i, int i2) {
            this.f121575a = i;
            this.f121576b = i2;
        }
    }

    public jlj0() {
        super("TtmlDecoder");
        try {
            XmlPullParserFactory xmlPullParserFactoryNewInstance = XmlPullParserFactory.newInstance();
            this.f121569o = xmlPullParserFactoryNewInstance;
            xmlPullParserFactoryNewInstance.setNamespaceAware(true);
        } catch (XmlPullParserException e) {
            vtq0.m202761a("Couldn't create XmlPullParserFactory instance", e);
            throw null;
        }
    }

    /* JADX INFO: renamed from: B */
    public static nlj0 m146064B(@Nullable nlj0 nlj0Var) {
        return nlj0Var == null ? new nlj0() : nlj0Var;
    }

    /* JADX INFO: renamed from: C */
    public static boolean m146065C(String str) {
        return str.equals("tt") || str.equals("head") || str.equals("body") || str.equals("div") || str.equals("p") || str.equals("span") || str.equals("br") || str.equals("style") || str.equals("styling") || str.equals("layout") || str.equals("region") || str.equals("metadata") || str.equals("image") || str.equals("data") || str.equals("information");
    }

    @Nullable
    /* JADX INFO: renamed from: D */
    public static Layout.Alignment m146066D(String str) {
        String strM138051e = i11.m138051e(str);
        strM138051e.getClass();
        switch (strM138051e) {
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
    public static C17972a m146067E(XmlPullParser xmlPullParser, C17972a c17972a) throws SubtitleDecoderException {
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "cellResolution");
        if (attributeValue == null) {
            return c17972a;
        }
        Matcher matcher = f121566v.matcher(attributeValue);
        if (!matcher.matches()) {
            kyv.m152151i("TtmlDecoder", "Ignoring malformed cell resolution: ".concat(attributeValue));
            return c17972a;
        }
        try {
            int i = Integer.parseInt((String) w11.m204369e(matcher.group(1)));
            int i2 = Integer.parseInt((String) w11.m204369e(matcher.group(2)));
            if (i != 0 && i2 != 0) {
                return new C17972a(i, i2);
            }
            throw new SubtitleDecoderException("Invalid cell resolution " + i + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + i2);
        } catch (NumberFormatException unused) {
            kyv.m152151i("TtmlDecoder", "Ignoring malformed cell resolution: ".concat(attributeValue));
            return c17972a;
        }
    }

    /* JADX INFO: renamed from: F */
    public static void m146068F(String str, nlj0 nlj0Var) throws SubtitleDecoderException {
        Matcher matcher;
        String[] strArrM105119a1 = bmk0.m105119a1(str, "\\s+");
        if (strArrM105119a1.length == 1) {
            matcher = f121562r.matcher(str);
        } else {
            if (strArrM105119a1.length != 2) {
                throw new SubtitleDecoderException("Invalid number of entries for fontSize: " + strArrM105119a1.length + ".");
            }
            matcher = f121562r.matcher(strArrM105119a1[1]);
            kyv.m152151i("TtmlDecoder", "Multiple values in fontSize attribute. Picking the second value for vertical font size and ignoring the first.");
        }
        if (!matcher.matches()) {
            throw new SubtitleDecoderException("Invalid expression for fontSize: '" + str + "'.");
        }
        String str2 = (String) w11.m204369e(matcher.group(3));
        str2.getClass();
        switch (str2) {
            case "%":
                nlj0Var.m163725z(3);
                break;
            case "em":
                nlj0Var.m163725z(2);
                break;
            case "px":
                nlj0Var.m163725z(1);
                break;
            default:
                throw new SubtitleDecoderException("Invalid unit for fontSize: '" + str2 + "'.");
        }
        nlj0Var.m163724y(Float.parseFloat((String) w11.m204369e(matcher.group(1))));
    }

    /* JADX INFO: renamed from: G */
    public static C17973b m146069G(XmlPullParser xmlPullParser) throws SubtitleDecoderException {
        float f;
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRate");
        int i = attributeValue != null ? Integer.parseInt(attributeValue) : 30;
        String attributeValue2 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRateMultiplier");
        if (attributeValue2 != null) {
            String[] strArrM105119a1 = bmk0.m105119a1(attributeValue2, MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
            if (strArrM105119a1.length != 2) {
                throw new SubtitleDecoderException("frameRateMultiplier doesn't have 2 parts");
            }
            f = Integer.parseInt(strArrM105119a1[0]) / Integer.parseInt(strArrM105119a1[1]);
        } else {
            f = 1.0f;
        }
        C17973b c17973b = f121567w;
        int i2 = c17973b.f121573b;
        String attributeValue3 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "subFrameRate");
        if (attributeValue3 != null) {
            i2 = Integer.parseInt(attributeValue3);
        }
        int i3 = c17973b.f121574c;
        String attributeValue4 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "tickRate");
        if (attributeValue4 != null) {
            i3 = Integer.parseInt(attributeValue4);
        }
        return new C17973b(i * f, i2, i3);
    }

    /* JADX INFO: renamed from: H */
    public static Map<String, nlj0> m146070H(XmlPullParser xmlPullParser, Map<String, nlj0> map, C17972a c17972a, @Nullable C17974c c17974c, Map<String, llj0> map2, Map<String, String> map3) throws XmlPullParserException, IOException {
        do {
            xmlPullParser.next();
            if (lmq0.m154887f(xmlPullParser, "style")) {
                String strM154882a = lmq0.m154882a(xmlPullParser, "style");
                nlj0 nlj0VarM146075M = m146075M(xmlPullParser, new nlj0());
                if (strM154882a != null) {
                    for (String str : m146076N(strM154882a)) {
                        nlj0VarM146075M.m163700a(map.get(str));
                    }
                }
                String strM163706g = nlj0VarM146075M.m163706g();
                if (strM163706g != null) {
                    map.put(strM163706g, nlj0VarM146075M);
                }
            } else if (lmq0.m154887f(xmlPullParser, "region")) {
                llj0 llj0VarM146073K = m146073K(xmlPullParser, c17972a, c17974c);
                if (llj0VarM146073K != null) {
                    map2.put(llj0VarM146073K.f132556a, llj0VarM146073K);
                }
            } else if (lmq0.m154887f(xmlPullParser, "metadata")) {
                m146071I(xmlPullParser, map3);
            }
        } while (!lmq0.m154885d(xmlPullParser, "head"));
        return map;
    }

    /* JADX INFO: renamed from: I */
    public static void m146071I(XmlPullParser xmlPullParser, Map<String, String> map) throws XmlPullParserException, IOException {
        String strM154882a;
        do {
            xmlPullParser.next();
            if (lmq0.m154887f(xmlPullParser, "image") && (strM154882a = lmq0.m154882a(xmlPullParser, "id")) != null) {
                map.put(strM154882a, xmlPullParser.nextText());
            }
        } while (!lmq0.m154885d(xmlPullParser, "metadata"));
    }

    /* JADX INFO: renamed from: J */
    public static klj0 m146072J(XmlPullParser xmlPullParser, @Nullable klj0 klj0Var, Map<String, llj0> map, C17973b c17973b) throws SubtitleDecoderException {
        XmlPullParser xmlPullParser2 = xmlPullParser;
        int attributeCount = xmlPullParser2.getAttributeCount();
        String strSubstring = null;
        nlj0 nlj0VarM146075M = m146075M(xmlPullParser2, null);
        long jM146077O = -9223372036854775807L;
        long jM146077O2 = -9223372036854775807L;
        long jM146077O3 = -9223372036854775807L;
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
                    jM146077O3 = m146077O(attributeValue, c17973b);
                    break;
                case "end":
                    jM146077O2 = m146077O(attributeValue, c17973b);
                    break;
                case "begin":
                    jM146077O = m146077O(attributeValue, c17973b);
                    break;
                case "style":
                    String[] strArrM146076N = m146076N(attributeValue);
                    if (strArrM146076N.length > 0) {
                        strArr = strArrM146076N;
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
        if (klj0Var != null) {
            long j = klj0Var.f127379d;
            if (j != -9223372036854775807L) {
                if (jM146077O != -9223372036854775807L) {
                    jM146077O += j;
                }
                if (jM146077O2 != -9223372036854775807L) {
                    jM146077O2 += j;
                }
            }
        }
        long j2 = jM146077O;
        if (jM146077O2 == -9223372036854775807L) {
            if (jM146077O3 != -9223372036854775807L) {
                jM146077O2 = j2 + jM146077O3;
            } else if (klj0Var != null) {
                long j3 = klj0Var.f127380e;
                if (j3 != -9223372036854775807L) {
                    jM146077O2 = j3;
                }
            }
        }
        return klj0.m150370c(xmlPullParser.getName(), j2, jM146077O2, nlj0VarM146075M, strArr, str, strSubstring, klj0Var);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:45:0x013e  */
    /* JADX WARN: Code duplicated, block: B:66:0x0189  */
    @Nullable
    /* JADX INFO: renamed from: K */
    public static llj0 m146073K(XmlPullParser xmlPullParser, C17972a c17972a, @Nullable C17974c c17974c) {
        float f;
        float f2;
        float f3;
        float f4;
        int i;
        float f5;
        int i2;
        String strM154882a = lmq0.m154882a(xmlPullParser, "id");
        if (strM154882a == null) {
            return null;
        }
        String strM154882a2 = lmq0.m154882a(xmlPullParser, "origin");
        if (strM154882a2 == null) {
            kyv.m152151i("TtmlDecoder", "Ignoring region without an origin");
            return null;
        }
        Pattern pattern = f121564t;
        Matcher matcher = pattern.matcher(strM154882a2);
        Pattern pattern2 = f121565u;
        Matcher matcher2 = pattern2.matcher(strM154882a2);
        int i3 = 2;
        if (matcher.matches()) {
            try {
                f = Float.parseFloat((String) w11.m204369e(matcher.group(1))) / 100.0f;
                f2 = Float.parseFloat((String) w11.m204369e(matcher.group(2))) / 100.0f;
            } catch (NumberFormatException unused) {
                kyv.m152151i("TtmlDecoder", "Ignoring region with malformed origin: ".concat(strM154882a2));
                return null;
            }
        } else {
            if (!matcher2.matches()) {
                kyv.m152151i("TtmlDecoder", "Ignoring region with unsupported origin: ".concat(strM154882a2));
                return null;
            }
            if (c17974c == null) {
                kyv.m152151i("TtmlDecoder", "Ignoring region with missing tts:extent: ".concat(strM154882a2));
                return null;
            }
            try {
                int i4 = Integer.parseInt((String) w11.m204369e(matcher2.group(1)));
                int i5 = Integer.parseInt((String) w11.m204369e(matcher2.group(2)));
                float f6 = i4 / c17974c.f121575a;
                float f7 = i5 / c17974c.f121576b;
                f = f6;
                f2 = f7;
            } catch (NumberFormatException unused2) {
                kyv.m152151i("TtmlDecoder", "Ignoring region with malformed origin: ".concat(strM154882a2));
                return null;
            }
        }
        String strM154882a3 = lmq0.m154882a(xmlPullParser, "extent");
        if (strM154882a3 == null) {
            kyv.m152151i("TtmlDecoder", "Ignoring region without an extent");
            return null;
        }
        Matcher matcher3 = pattern.matcher(strM154882a3);
        Matcher matcher4 = pattern2.matcher(strM154882a3);
        if (matcher3.matches()) {
            try {
                f3 = Float.parseFloat((String) w11.m204369e(matcher3.group(1))) / 100.0f;
                f4 = Float.parseFloat((String) w11.m204369e(matcher3.group(2))) / 100.0f;
            } catch (NumberFormatException unused3) {
                kyv.m152151i("TtmlDecoder", "Ignoring region with malformed extent: ".concat(strM154882a2));
                return null;
            }
        } else {
            if (!matcher4.matches()) {
                kyv.m152151i("TtmlDecoder", "Ignoring region with unsupported extent: ".concat(strM154882a2));
                return null;
            }
            if (c17974c == null) {
                kyv.m152151i("TtmlDecoder", "Ignoring region with missing tts:extent: ".concat(strM154882a2));
                return null;
            }
            try {
                int i6 = Integer.parseInt((String) w11.m204369e(matcher4.group(1)));
                int i7 = Integer.parseInt((String) w11.m204369e(matcher4.group(2)));
                float f8 = i6 / c17974c.f121575a;
                f4 = i7 / c17974c.f121576b;
                f3 = f8;
            } catch (NumberFormatException unused4) {
                kyv.m152151i("TtmlDecoder", "Ignoring region with malformed extent: ".concat(strM154882a2));
                return null;
            }
        }
        float f9 = f4;
        String strM154882a4 = lmq0.m154882a(xmlPullParser, "displayAlign");
        if (strM154882a4 != null) {
            String strM138051e = i11.m138051e(strM154882a4);
            strM138051e.getClass();
            if (strM138051e.equals("center")) {
                f5 = f2 + (f9 / 2.0f);
                i = 1;
            } else if (strM138051e.equals(OMSSwipeMoment.after)) {
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
        float f10 = 1.0f / c17972a.f121571b;
        String strM154882a5 = lmq0.m154882a(xmlPullParser, "writingMode");
        if (strM154882a5 != null) {
            String strM138051e2 = i11.m138051e(strM154882a5);
            strM138051e2.getClass();
            switch (strM138051e2) {
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
        return new llj0(strM154882a, f, f5, 0, i, f3, f9, 1, f10, i2);
    }

    /* JADX INFO: renamed from: L */
    public static float m146074L(String str) {
        Matcher matcher = f121563s.matcher(str);
        if (!matcher.matches()) {
            kyv.m152151i("TtmlDecoder", "Invalid value for shear: " + str);
            return Float.MAX_VALUE;
        }
        try {
            return Math.min(100.0f, Math.max(-100.0f, Float.parseFloat((String) w11.m204369e(matcher.group(1)))));
        } catch (NumberFormatException e) {
            kyv.m152152j("TtmlDecoder", "Failed to parse shear: " + str, e);
            return Float.MAX_VALUE;
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: M */
    public static nlj0 m146075M(XmlPullParser xmlPullParser, nlj0 nlj0Var) {
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
                    nlj0Var = m146064B(nlj0Var).m163690B(OMSFontStyle.italic.equalsIgnoreCase(attributeValue));
                    break;
                case 1:
                    nlj0Var = m146064B(nlj0Var).m163723x(attributeValue);
                    break;
                case 2:
                    nlj0Var = m146064B(nlj0Var).m163696H(m146066D(attributeValue));
                    break;
                case 3:
                    String strM138051e = i11.m138051e(attributeValue);
                    strM138051e.getClass();
                    switch (strM138051e) {
                        case "nounderline":
                            nlj0Var = m146064B(nlj0Var).m163699K(false);
                            break;
                        case "underline":
                            nlj0Var = m146064B(nlj0Var).m163699K(true);
                            break;
                        case "nolinethrough":
                            nlj0Var = m146064B(nlj0Var).m163691C(false);
                            break;
                        case "linethrough":
                            nlj0Var = m146064B(nlj0Var).m163691C(true);
                            break;
                    }
                    break;
                case 4:
                    nlj0Var = m146064B(nlj0Var).m163721v(OMSFontStyle.bold.equalsIgnoreCase(attributeValue));
                    break;
                case 5:
                    if ("style".equals(xmlPullParser.getName())) {
                        nlj0Var = m146064B(nlj0Var).m163689A(attributeValue);
                    }
                    break;
                case 6:
                    String strM138051e2 = i11.m138051e(attributeValue);
                    strM138051e2.getClass();
                    switch (strM138051e2) {
                        case "baseContainer":
                        case "base":
                            nlj0Var = m146064B(nlj0Var).m163694F(2);
                            break;
                        case "container":
                            nlj0Var = m146064B(nlj0Var).m163694F(1);
                            break;
                        case "delimiter":
                            nlj0Var = m146064B(nlj0Var).m163694F(4);
                            break;
                        case "textContainer":
                        case "text":
                            nlj0Var = m146064B(nlj0Var).m163694F(3);
                            break;
                    }
                    break;
                case 7:
                    nlj0Var = m146064B(nlj0Var);
                    try {
                        nlj0Var.m163722w(ef5.m120587c(attributeValue));
                    } catch (IllegalArgumentException unused) {
                        kyv.m152151i("TtmlDecoder", "Failed parsing color value: " + attributeValue);
                    }
                    break;
                case 8:
                    nlj0Var = m146064B(nlj0Var).m163695G(m146074L(attributeValue));
                    break;
                case 9:
                    String strM138051e3 = i11.m138051e(attributeValue);
                    strM138051e3.getClass();
                    if (strM138051e3.equals("all")) {
                        nlj0Var = m146064B(nlj0Var).m163697I(true);
                    } else if (strM138051e3.equals("none")) {
                        nlj0Var = m146064B(nlj0Var).m163697I(false);
                    }
                    break;
                case 10:
                    try {
                        nlj0Var = m146064B(nlj0Var);
                        m146068F(attributeValue, nlj0Var);
                    } catch (SubtitleDecoderException unused2) {
                        kyv.m152151i("TtmlDecoder", "Failed parsing fontSize value: " + attributeValue);
                    }
                    break;
                case 11:
                    nlj0Var = m146064B(nlj0Var).m163698J(qri0.m177562a(attributeValue));
                    break;
                case 12:
                    String strM138051e4 = i11.m138051e(attributeValue);
                    strM138051e4.getClass();
                    if (strM138051e4.equals(OMSSwipeMoment.before)) {
                        nlj0Var = m146064B(nlj0Var).m163693E(1);
                    } else if (strM138051e4.equals(OMSSwipeMoment.after)) {
                        nlj0Var = m146064B(nlj0Var).m163693E(2);
                    }
                    break;
                case 13:
                    nlj0Var = m146064B(nlj0Var);
                    try {
                        nlj0Var.m163720u(ef5.m120587c(attributeValue));
                    } catch (IllegalArgumentException unused3) {
                        kyv.m152151i("TtmlDecoder", "Failed parsing background value: " + attributeValue);
                    }
                    break;
                case 14:
                    nlj0Var = m146064B(nlj0Var).m163692D(m146066D(attributeValue));
                    break;
            }
        }
        return nlj0Var;
    }

    /* JADX INFO: renamed from: N */
    public static String[] m146076N(String str) {
        String strTrim = str.trim();
        return strTrim.isEmpty() ? new String[0] : bmk0.m105119a1(strTrim, "\\s+");
    }

    /* JADX INFO: renamed from: O */
    public static long m146077O(String str, C17973b c17973b) throws SubtitleDecoderException {
        double d;
        double d2;
        Matcher matcher = f121560p.matcher(str);
        if (matcher.matches()) {
            double d3 = (Long.parseLong((String) w11.m204369e(matcher.group(1))) * 3600) + (Long.parseLong((String) w11.m204369e(matcher.group(2))) * 60) + Long.parseLong((String) w11.m204369e(matcher.group(3)));
            String strGroup = matcher.group(4);
            double d4 = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
            double d5 = d3 + (strGroup != null ? Double.parseDouble(strGroup) : 0.0d);
            String strGroup2 = matcher.group(5);
            double d6 = d5 + (strGroup2 != null ? Long.parseLong(strGroup2) / c17973b.f121572a : 0.0d);
            String strGroup3 = matcher.group(6);
            if (strGroup3 != null) {
                d4 = (Long.parseLong(strGroup3) / ((double) c17973b.f121573b)) / ((double) c17973b.f121572a);
            }
            return (long) ((d6 + d4) * 1000000.0d);
        }
        Matcher matcher2 = f121561q.matcher(str);
        if (!matcher2.matches()) {
            throw new SubtitleDecoderException("Malformed time expression: " + str);
        }
        double d7 = Double.parseDouble((String) w11.m204369e(matcher2.group(1)));
        String str2 = (String) w11.m204369e(matcher2.group(2));
        str2.getClass();
        switch (str2) {
            case "f":
                d = c17973b.f121572a;
                d7 /= d;
                return (long) (d7 * 1000000.0d);
            case "h":
                d2 = 3600.0d;
                break;
            case "m":
                d2 = 60.0d;
                break;
            case "t":
                d = c17973b.f121574c;
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
    public static C17974c m146078P(XmlPullParser xmlPullParser) {
        String strM154882a = lmq0.m154882a(xmlPullParser, "extent");
        if (strM154882a == null) {
            return null;
        }
        Matcher matcher = f121565u.matcher(strM154882a);
        if (!matcher.matches()) {
            kyv.m152151i("TtmlDecoder", "Ignoring non-pixel tts extent: ".concat(strM154882a));
            return null;
        }
        try {
            return new C17974c(Integer.parseInt((String) w11.m204369e(matcher.group(1))), Integer.parseInt((String) w11.m204369e(matcher.group(2))));
        } catch (NumberFormatException unused) {
            kyv.m152151i("TtmlDecoder", "Ignoring malformed tts extent: ".concat(strM154882a));
            return null;
        }
    }

    @Override // p153l.xpf0
    /* JADX INFO: renamed from: A */
    public mdg0 mo122811A(byte[] bArr, int i, boolean z) throws SubtitleDecoderException {
        mdg0 mdg0Var;
        mdg0 mdg0Var2 = null;
        try {
            try {
                XmlPullParser xmlPullParserNewPullParser = this.f121569o.newPullParser();
                HashMap map = new HashMap();
                HashMap map2 = new HashMap();
                HashMap map3 = new HashMap();
                map2.put("", new llj0(""));
                int i2 = 0;
                xmlPullParserNewPullParser.setInput(new ByteArrayInputStream(bArr, 0, i), null);
                ArrayDeque arrayDeque = new ArrayDeque();
                int eventType = xmlPullParserNewPullParser.getEventType();
                C17973b c17973bM146069G = f121567w;
                C17972a c17972aM146067E = f121568x;
                olj0 olj0Var = null;
                C17974c c17974cM146078P = null;
                while (eventType != 1) {
                    klj0 klj0Var = (klj0) arrayDeque.peek();
                    if (i2 == 0) {
                        String name = xmlPullParserNewPullParser.getName();
                        mdg0Var = mdg0Var2;
                        if (eventType == 2) {
                            try {
                                if ("tt".equals(name)) {
                                    c17973bM146069G = m146069G(xmlPullParserNewPullParser);
                                    c17972aM146067E = m146067E(xmlPullParserNewPullParser, f121568x);
                                    c17974cM146078P = m146078P(xmlPullParserNewPullParser);
                                }
                                C17973b c17973b = c17973bM146069G;
                                C17972a c17972a = c17972aM146067E;
                                C17974c c17974c = c17974cM146078P;
                                if (m146065C(name)) {
                                    if ("head".equals(name)) {
                                        m146070H(xmlPullParserNewPullParser, map, c17972a, c17974c, map2, map3);
                                    } else {
                                        try {
                                            klj0 klj0VarM146072J = m146072J(xmlPullParserNewPullParser, klj0Var, map2, c17973b);
                                            arrayDeque.push(klj0VarM146072J);
                                            if (klj0Var != null) {
                                                klj0Var.m150374a(klj0VarM146072J);
                                            }
                                        } catch (SubtitleDecoderException e) {
                                            kyv.m152152j("TtmlDecoder", "Suppressing parser error", e);
                                            i2++;
                                        }
                                    }
                                    c17974cM146078P = c17974c;
                                    c17972aM146067E = c17972a;
                                    c17973bM146069G = c17973b;
                                } else {
                                    kyv.m152148f("TtmlDecoder", "Ignoring unsupported tag: " + xmlPullParserNewPullParser.getName());
                                }
                                i2++;
                                c17974cM146078P = c17974c;
                                c17972aM146067E = c17972a;
                                c17973bM146069G = c17973b;
                            } catch (IOException e2) {
                                e = e2;
                                yzv.m218057a("Unexpected error when reading input.", e);
                                return mdg0Var;
                            }
                        } else if (eventType == 4) {
                            ((klj0) w11.m204369e(klj0Var)).m150374a(klj0.m150371d(xmlPullParserNewPullParser.getText()));
                        } else if (eventType == 3) {
                            if (xmlPullParserNewPullParser.getName().equals("tt")) {
                                olj0Var = new olj0((klj0) w11.m204369e((klj0) arrayDeque.peek()), map, map2, map3);
                            }
                            arrayDeque.pop();
                        }
                    } else {
                        mdg0Var = mdg0Var2;
                        if (eventType == 2) {
                            i2++;
                        } else if (eventType == 3) {
                            i2--;
                        }
                    }
                    xmlPullParserNewPullParser.next();
                    eventType = xmlPullParserNewPullParser.getEventType();
                    mdg0Var2 = mdg0Var;
                }
                mdg0Var = mdg0Var2;
                if (olj0Var != null) {
                    return olj0Var;
                }
                throw new SubtitleDecoderException("No TTML subtitles found");
            } catch (XmlPullParserException e3) {
                throw new SubtitleDecoderException("Unable to decode source", e3);
            }
        } catch (IOException e4) {
            e = e4;
            mdg0Var = mdg0Var2;
        }
    }
}
