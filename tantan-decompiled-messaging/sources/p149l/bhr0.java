package p149l;

import android.text.Layout;
import androidx.annotation.Nullable;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.clevertap.android.sdk.Constants;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.google.android.gms.internal.ads.zzakn;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.p046p1.mobile.putong.data.OMSFontStyle;
import com.p046p1.mobile.putong.data.OMSSwipeMoment;
import com.p046p1.mobile.putong.live.base.data.BLiveGiftBubblePopupTitlePosition;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* JADX INFO: loaded from: classes6.dex */
public final class bhr0 implements rfr0 {

    /* JADX INFO: renamed from: b */
    public static final Pattern f75649b = Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");

    /* JADX INFO: renamed from: c */
    public static final Pattern f75650c = Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");

    /* JADX INFO: renamed from: d */
    public static final Pattern f75651d = Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");

    /* JADX INFO: renamed from: e */
    public static final Pattern f75652e = Pattern.compile("^([-+]?\\d+\\.?\\d*?)%$");

    /* JADX INFO: renamed from: f */
    public static final Pattern f75653f = Pattern.compile("^(\\d+\\.?\\d*?)% (\\d+\\.?\\d*?)%$");

    /* JADX INFO: renamed from: g */
    public static final Pattern f75654g = Pattern.compile("^(\\d+\\.?\\d*?)px (\\d+\\.?\\d*?)px$");

    /* JADX INFO: renamed from: h */
    public static final Pattern f75655h = Pattern.compile("^(\\d+) (\\d+)$");

    /* JADX INFO: renamed from: i */
    public static final zgr0 f75656i = new zgr0(30.0f, 1, 1);

    /* JADX INFO: renamed from: a */
    public final XmlPullParserFactory f75657a;

    public bhr0() {
        try {
            XmlPullParserFactory xmlPullParserFactoryNewInstance = XmlPullParserFactory.newInstance();
            this.f75657a = xmlPullParserFactoryNewInstance;
            xmlPullParserFactoryNewInstance.setNamespaceAware(true);
        } catch (XmlPullParserException e) {
            pkq0.m170054a("Couldn't create XmlPullParserFactory instance", e);
            throw null;
        }
    }

    /* JADX INFO: renamed from: c */
    public static long m101916c(String str, zgr0 zgr0Var) throws zzakn {
        double d;
        double d2;
        Matcher matcher = f75649b.matcher(str);
        if (matcher.matches()) {
            String strGroup = matcher.group(1);
            strGroup.getClass();
            long j = Long.parseLong(strGroup) * 3600;
            String strGroup2 = matcher.group(2);
            strGroup2.getClass();
            long j2 = Long.parseLong(strGroup2) * 60;
            String strGroup3 = matcher.group(3);
            strGroup3.getClass();
            double d3 = j + j2;
            double d4 = Long.parseLong(strGroup3);
            String strGroup4 = matcher.group(4);
            double d5 = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
            double d6 = strGroup4 != null ? Double.parseDouble(strGroup4) : 0.0d;
            double d7 = d3 + d4;
            String strGroup5 = matcher.group(5);
            double d8 = strGroup5 != null ? Long.parseLong(strGroup5) / zgr0Var.f203079a : 0.0d;
            double d9 = d7 + d6;
            String strGroup6 = matcher.group(6);
            if (strGroup6 != null) {
                d5 = (Long.parseLong(strGroup6) / ((double) zgr0Var.f203080b)) / ((double) zgr0Var.f203079a);
            }
            return (long) ((d9 + d8 + d5) * 1000000.0d);
        }
        Matcher matcher2 = f75650c.matcher(str);
        if (!matcher2.matches()) {
            throw new zzakn("Malformed time expression: ".concat(String.valueOf(str)));
        }
        String strGroup7 = matcher2.group(1);
        strGroup7.getClass();
        double d10 = Double.parseDouble(strGroup7);
        String strGroup8 = matcher2.group(2);
        strGroup8.getClass();
        int iHashCode = strGroup8.hashCode();
        if (iHashCode != 102) {
            if (iHashCode != 104) {
                if (iHashCode != 109) {
                    if (iHashCode != 3494) {
                        if (iHashCode == 115) {
                            strGroup8.equals(BLiveStormDanmakuGiftResourceType.f44446s);
                        } else if (iHashCode == 116 && strGroup8.equals(Constants.KEY_T)) {
                            d = zgr0Var.f203081c;
                            d10 /= d;
                        }
                    } else if (strGroup8.equals("ms")) {
                        d = 1000.0d;
                        d10 /= d;
                    }
                } else if (strGroup8.equals("m")) {
                    d2 = 60.0d;
                    d10 *= d2;
                }
            } else if (strGroup8.equals("h")) {
                d2 = 3600.0d;
                d10 *= d2;
            }
        } else if (strGroup8.equals("f")) {
            d = zgr0Var.f203079a;
            d10 /= d;
        }
        return (long) (d10 * 1000000.0d);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Nullable
    /* JADX INFO: renamed from: d */
    public static Layout.Alignment m101917d(String str) {
        String strM174257a = qew0.m174257a(str);
        switch (strM174257a.hashCode()) {
            case -1364013995:
                if (strM174257a.equals("center")) {
                    return Layout.Alignment.ALIGN_CENTER;
                }
                return null;
            case 100571:
                if (!strM174257a.equals("end")) {
                    return null;
                }
                break;
            case 3317767:
                if (!strM174257a.equals(BLiveGiftBubblePopupTitlePosition.left)) {
                    return null;
                }
                return Layout.Alignment.ALIGN_NORMAL;
            case 108511772:
                if (!strM174257a.equals("right")) {
                    return null;
                }
                break;
            case 109757538:
                if (!strM174257a.equals("start")) {
                    return null;
                }
                return Layout.Alignment.ALIGN_NORMAL;
            default:
                return null;
        }
        return Layout.Alignment.ALIGN_OPPOSITE;
    }

    /* JADX INFO: renamed from: e */
    public static ehr0 m101918e(@Nullable ehr0 ehr0Var) {
        return ehr0Var == null ? new ehr0() : ehr0Var;
    }

    /* JADX WARN: Code duplicated, block: B:119:0x0270  */
    /* JADX WARN: Code duplicated, block: B:128:0x02a4  */
    /* JADX WARN: Code duplicated, block: B:180:0x0129 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:64:0x0120 A[Catch: zzakn -> 0x017b, TryCatch #1 {zzakn -> 0x017b, blocks: (B:34:0x00b3, B:36:0x00c3, B:39:0x00d9, B:42:0x00e1, B:44:0x00e7, B:53:0x00ff, B:62:0x011a, B:64:0x0120, B:65:0x0129, B:66:0x012a, B:67:0x0143, B:57:0x010b, B:61:0x0117, B:68:0x0144, B:69:0x0145, B:70:0x015e, B:38:0x00cc, B:71:0x015f, B:72:0x017a), top: B:167:0x00b3 }] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: f */
    public static ehr0 m101919f(XmlPullParser xmlPullParser, ehr0 ehr0Var) {
        Matcher matcher;
        String strGroup;
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            String attributeValue = xmlPullParser.getAttributeValue(i);
            String attributeName = xmlPullParser.getAttributeName(i);
            switch (attributeName.hashCode()) {
                case -1550943582:
                    if (attributeName.equals("fontStyle")) {
                        ehr0Var = m101918e(ehr0Var);
                        ehr0Var.m116562D(OMSFontStyle.italic.equalsIgnoreCase(attributeValue));
                    }
                    break;
                case -1224696685:
                    if (attributeName.equals("fontFamily")) {
                        ehr0Var = m101918e(ehr0Var);
                        ehr0Var.m116594z(attributeValue);
                    }
                    break;
                case -1065511464:
                    if (attributeName.equals("textAlign")) {
                        ehr0Var = m101918e(ehr0Var);
                        ehr0Var.m116568J(m101917d(attributeValue));
                    }
                    break;
                case -879295043:
                    if (!attributeName.equals("textDecoration")) {
                        break;
                    } else {
                        String strM174257a = qew0.m174257a(attributeValue);
                        switch (strM174257a.hashCode()) {
                            case -1461280213:
                                if (strM174257a.equals("nounderline")) {
                                    ehr0Var = m101918e(ehr0Var);
                                    ehr0Var.m116571c(false);
                                }
                                break;
                            case -1026963764:
                                if (strM174257a.equals("underline")) {
                                    ehr0Var = m101918e(ehr0Var);
                                    ehr0Var.m116571c(true);
                                }
                                break;
                            case 913457136:
                                if (strM174257a.equals("nolinethrough")) {
                                    ehr0Var = m101918e(ehr0Var);
                                    ehr0Var.m116563E(false);
                                }
                                break;
                            case 1679736913:
                                if (strM174257a.equals("linethrough")) {
                                    ehr0Var = m101918e(ehr0Var);
                                    ehr0Var.m116563E(true);
                                }
                                break;
                        }
                    }
                    break;
                case -734428249:
                    if (attributeName.equals("fontWeight")) {
                        ehr0Var = m101918e(ehr0Var);
                        ehr0Var.m116592x(OMSFontStyle.bold.equalsIgnoreCase(attributeValue));
                    }
                    break;
                case 3355:
                    if (attributeName.equals("id") && "style".equals(xmlPullParser.getName())) {
                        ehr0Var = m101918e(ehr0Var);
                        ehr0Var.m116561C(attributeValue);
                    }
                    break;
                case 3511770:
                    if (!attributeName.equals("ruby")) {
                        break;
                    } else {
                        String strM174257a2 = qew0.m174257a(attributeValue);
                        switch (strM174257a2.hashCode()) {
                            case -618561360:
                                if (strM174257a2.equals("baseContainer")) {
                                    ehr0Var = m101918e(ehr0Var);
                                    ehr0Var.m116566H(2);
                                }
                                break;
                            case -410956671:
                                if (strM174257a2.equals("container")) {
                                    ehr0Var = m101918e(ehr0Var);
                                    ehr0Var.m116566H(1);
                                }
                                break;
                            case -250518009:
                                if (strM174257a2.equals(RequestParameters.DELIMITER)) {
                                    ehr0Var = m101918e(ehr0Var);
                                    ehr0Var.m116566H(4);
                                }
                                break;
                            case -136074796:
                                if (strM174257a2.equals("textContainer")) {
                                    ehr0Var = m101918e(ehr0Var);
                                    ehr0Var.m116566H(3);
                                }
                                break;
                            case 3016401:
                                if (strM174257a2.equals("base")) {
                                    ehr0Var = m101918e(ehr0Var);
                                    ehr0Var.m116566H(2);
                                }
                                break;
                            case 3556653:
                                if (strM174257a2.equals("text")) {
                                    ehr0Var = m101918e(ehr0Var);
                                    ehr0Var.m116566H(3);
                                }
                                break;
                        }
                    }
                    break;
                case 94842723:
                    if (attributeName.equals("color")) {
                        ehr0Var = m101918e(ehr0Var);
                        try {
                            ehr0Var.m116593y(u8v0.m192260b(attributeValue));
                        } catch (IllegalArgumentException unused) {
                            svv0.m186111f("TtmlParser", "Failed parsing color value: ".concat(String.valueOf(attributeValue)));
                        }
                    }
                    break;
                case 109403361:
                    if (attributeName.equals("shear")) {
                        ehr0Var = m101918e(ehr0Var);
                        Matcher matcher2 = f75652e.matcher(attributeValue);
                        float fMin = Float.MAX_VALUE;
                        if (matcher2.matches()) {
                            try {
                                String strGroup2 = matcher2.group(1);
                                if (strGroup2 == null) {
                                    throw null;
                                }
                                fMin = Math.min(100.0f, Math.max(-100.0f, Float.parseFloat(strGroup2)));
                            } catch (NumberFormatException e) {
                                svv0.m186112g("TtmlParser", "Failed to parse shear: ".concat(String.valueOf(attributeValue)), e);
                            }
                        } else {
                            svv0.m186111f("TtmlParser", "Invalid value for shear: ".concat(String.valueOf(attributeValue)));
                        }
                        ehr0Var.m116567I(fMin);
                    } else {
                        continue;
                    }
                    break;
                case 110138194:
                    if (attributeName.equals("textCombine")) {
                        String strM174257a3 = qew0.m174257a(attributeValue);
                        int iHashCode = strM174257a3.hashCode();
                        if (iHashCode != 96673) {
                            if (iHashCode == 3387192 && strM174257a3.equals("none")) {
                                ehr0Var = m101918e(ehr0Var);
                                ehr0Var.m116569a(false);
                            }
                        } else if (strM174257a3.equals("all")) {
                            ehr0Var = m101918e(ehr0Var);
                            ehr0Var.m116569a(true);
                        }
                    }
                    break;
                case 365601008:
                    if (attributeName.equals("fontSize")) {
                        try {
                            ehr0Var = m101918e(ehr0Var);
                            int i2 = ggw0.f102568a;
                            String[] strArrSplit = attributeValue.split("\\s+", -1);
                            int length = strArrSplit.length;
                            if (length == 1) {
                                matcher = f75651d.matcher(attributeValue);
                            } else {
                                if (length != 2) {
                                    throw new zzakn("Invalid number of entries for fontSize: " + length + ".");
                                }
                                matcher = f75651d.matcher(strArrSplit[1]);
                                svv0.m186111f("TtmlParser", "Multiple values in fontSize attribute. Picking the second value for vertical font size and ignoring the first.");
                            }
                            if (!matcher.matches()) {
                                throw new zzakn("Invalid expression for fontSize: '" + attributeValue + "'.");
                            }
                            String strGroup3 = matcher.group(3);
                            if (strGroup3 == null) {
                                throw null;
                            }
                            int iHashCode2 = strGroup3.hashCode();
                            if (iHashCode2 == 37) {
                                if (!strGroup3.equals("%")) {
                                    throw new zzakn("Invalid unit for fontSize: '" + strGroup3 + "'.");
                                }
                                ehr0Var.m116560B(3);
                                strGroup = matcher.group(1);
                                if (strGroup == null) {
                                    throw null;
                                }
                                ehr0Var.m116559A(Float.parseFloat(strGroup));
                            } else if (iHashCode2 == 3240) {
                                if (!strGroup3.equals("em")) {
                                    throw new zzakn("Invalid unit for fontSize: '" + strGroup3 + "'.");
                                }
                                ehr0Var.m116560B(2);
                                strGroup = matcher.group(1);
                                if (strGroup == null) {
                                    throw null;
                                }
                                ehr0Var.m116559A(Float.parseFloat(strGroup));
                            } else {
                                if (iHashCode2 != 3592 || !strGroup3.equals("px")) {
                                    throw new zzakn("Invalid unit for fontSize: '" + strGroup3 + "'.");
                                }
                                ehr0Var.m116560B(1);
                                strGroup = matcher.group(1);
                                if (strGroup == null) {
                                    throw null;
                                }
                                ehr0Var.m116559A(Float.parseFloat(strGroup));
                            }
                        } catch (zzakn unused2) {
                            svv0.m186111f("TtmlParser", "Failed parsing fontSize value: ".concat(String.valueOf(attributeValue)));
                        }
                    } else {
                        continue;
                    }
                    break;
                case 921125321:
                    if (attributeName.equals("textEmphasis")) {
                        ehr0Var = m101918e(ehr0Var);
                        ehr0Var.m116570b(xgr0.m208692a(attributeValue));
                    }
                    break;
                case 1115953443:
                    if (attributeName.equals("rubyPosition")) {
                        String strM174257a4 = qew0.m174257a(attributeValue);
                        int iHashCode3 = strM174257a4.hashCode();
                        if (iHashCode3 != -1392885889) {
                            if (iHashCode3 == 92734940 && strM174257a4.equals(OMSSwipeMoment.after)) {
                                ehr0Var = m101918e(ehr0Var);
                                ehr0Var.m116565G(2);
                            }
                        } else if (strM174257a4.equals(OMSSwipeMoment.before)) {
                            ehr0Var = m101918e(ehr0Var);
                            ehr0Var.m116565G(1);
                        }
                    }
                    break;
                case 1287124693:
                    if (attributeName.equals("backgroundColor")) {
                        ehr0Var = m101918e(ehr0Var);
                        try {
                            ehr0Var.m116591w(u8v0.m192260b(attributeValue));
                        } catch (IllegalArgumentException unused3) {
                            svv0.m186111f("TtmlParser", "Failed parsing background value: ".concat(String.valueOf(attributeValue)));
                        }
                    }
                    break;
                case 1754920356:
                    if (attributeName.equals("multiRowAlign")) {
                        ehr0Var = m101918e(ehr0Var);
                        ehr0Var.m116564F(m101917d(attributeValue));
                    }
                    break;
            }
        }
        return ehr0Var;
    }

    /* JADX INFO: renamed from: g */
    public static String[] m101920g(String str) {
        String strTrim = str.trim();
        if (strTrim.isEmpty()) {
            return new String[0];
        }
        int i = ggw0.f102568a;
        return strTrim.split("\\s+", -1);
    }

    @Override // p149l.rfr0
    /* JADX INFO: renamed from: a */
    public final void mo101921a(byte[] bArr, int i, int i2, qfr0 qfr0Var, bbv0 bbv0Var) {
        mfr0.m154408a(m101922b(bArr, i, i2), qfr0Var, bbv0Var);
    }

    /* JADX WARN: Code duplicated, block: B:186:0x039f A[Catch: IOException -> 0x008c, XmlPullParserException -> 0x008f, TRY_LEAVE, TryCatch #3 {XmlPullParserException -> 0x008f, blocks: (B:15:0x007f, B:17:0x0087, B:23:0x0094, B:26:0x009e, B:30:0x00b2, B:32:0x00cb, B:34:0x00db, B:36:0x00e2, B:38:0x00ee, B:39:0x00f2, B:73:0x0193, B:95:0x01fa, B:97:0x0200, B:99:0x0208, B:101:0x0210, B:103:0x0218, B:105:0x0220, B:107:0x0228, B:109:0x022e, B:111:0x0236, B:113:0x023e, B:115:0x0244, B:117:0x024a, B:119:0x0250, B:121:0x0258, B:124:0x0261, B:129:0x0289, B:131:0x0292, B:133:0x02a1, B:135:0x02ae, B:137:0x02c4, B:139:0x02ca, B:262:0x04ea, B:141:0x02d7, B:144:0x02e3, B:146:0x02e9, B:148:0x02f2, B:150:0x02f8, B:151:0x02ff, B:154:0x0306, B:261:0x04e5, B:158:0x0318, B:160:0x0320, B:164:0x0341, B:166:0x0347, B:168:0x0354, B:184:0x0399, B:186:0x039f, B:190:0x03b0, B:192:0x03b6, B:194:0x03c3, B:211:0x040e, B:213:0x0416, B:227:0x0451, B:229:0x045b, B:247:0x0493, B:196:0x03ce, B:197:0x03cf, B:198:0x03d0, B:199:0x03d9, B:202:0x03e1, B:205:0x03eb, B:207:0x03f1, B:209:0x03fc, B:249:0x04a1, B:250:0x04a2, B:251:0x04a3, B:252:0x04ac, B:253:0x04b7, B:169:0x035b, B:170:0x035c, B:171:0x035d, B:172:0x0365, B:175:0x036f, B:178:0x0378, B:180:0x037e, B:182:0x0389, B:255:0x04be, B:256:0x04bf, B:257:0x04c0, B:258:0x04c9, B:259:0x04d4, B:76:0x019c, B:78:0x01a8, B:81:0x01b3, B:83:0x01b9, B:85:0x01c4, B:86:0x01cf, B:87:0x01d0, B:88:0x01d1, B:44:0x010e, B:47:0x011e, B:50:0x0128, B:52:0x012e, B:54:0x0135, B:56:0x013b, B:62:0x0153, B:64:0x015a, B:72:0x018a, B:68:0x017b, B:71:0x0189), top: B:396:0x007f }] */
    /* JADX WARN: Code duplicated, block: B:189:0x03af  */
    /* JADX WARN: Code duplicated, block: B:192:0x03b6 A[Catch: IOException -> 0x008c, XmlPullParserException -> 0x008f, NumberFormatException -> 0x03d0, TryCatch #3 {XmlPullParserException -> 0x008f, blocks: (B:15:0x007f, B:17:0x0087, B:23:0x0094, B:26:0x009e, B:30:0x00b2, B:32:0x00cb, B:34:0x00db, B:36:0x00e2, B:38:0x00ee, B:39:0x00f2, B:73:0x0193, B:95:0x01fa, B:97:0x0200, B:99:0x0208, B:101:0x0210, B:103:0x0218, B:105:0x0220, B:107:0x0228, B:109:0x022e, B:111:0x0236, B:113:0x023e, B:115:0x0244, B:117:0x024a, B:119:0x0250, B:121:0x0258, B:124:0x0261, B:129:0x0289, B:131:0x0292, B:133:0x02a1, B:135:0x02ae, B:137:0x02c4, B:139:0x02ca, B:262:0x04ea, B:141:0x02d7, B:144:0x02e3, B:146:0x02e9, B:148:0x02f2, B:150:0x02f8, B:151:0x02ff, B:154:0x0306, B:261:0x04e5, B:158:0x0318, B:160:0x0320, B:164:0x0341, B:166:0x0347, B:168:0x0354, B:184:0x0399, B:186:0x039f, B:190:0x03b0, B:192:0x03b6, B:194:0x03c3, B:211:0x040e, B:213:0x0416, B:227:0x0451, B:229:0x045b, B:247:0x0493, B:196:0x03ce, B:197:0x03cf, B:198:0x03d0, B:199:0x03d9, B:202:0x03e1, B:205:0x03eb, B:207:0x03f1, B:209:0x03fc, B:249:0x04a1, B:250:0x04a2, B:251:0x04a3, B:252:0x04ac, B:253:0x04b7, B:169:0x035b, B:170:0x035c, B:171:0x035d, B:172:0x0365, B:175:0x036f, B:178:0x0378, B:180:0x037e, B:182:0x0389, B:255:0x04be, B:256:0x04bf, B:257:0x04c0, B:258:0x04c9, B:259:0x04d4, B:76:0x019c, B:78:0x01a8, B:81:0x01b3, B:83:0x01b9, B:85:0x01c4, B:86:0x01cf, B:87:0x01d0, B:88:0x01d1, B:44:0x010e, B:47:0x011e, B:50:0x0128, B:52:0x012e, B:54:0x0135, B:56:0x013b, B:62:0x0153, B:64:0x015a, B:72:0x018a, B:68:0x017b, B:71:0x0189), top: B:396:0x007f }] */
    /* JADX WARN: Code duplicated, block: B:194:0x03c3 A[Catch: IOException -> 0x008c, XmlPullParserException -> 0x008f, NumberFormatException -> 0x03d0, TryCatch #3 {XmlPullParserException -> 0x008f, blocks: (B:15:0x007f, B:17:0x0087, B:23:0x0094, B:26:0x009e, B:30:0x00b2, B:32:0x00cb, B:34:0x00db, B:36:0x00e2, B:38:0x00ee, B:39:0x00f2, B:73:0x0193, B:95:0x01fa, B:97:0x0200, B:99:0x0208, B:101:0x0210, B:103:0x0218, B:105:0x0220, B:107:0x0228, B:109:0x022e, B:111:0x0236, B:113:0x023e, B:115:0x0244, B:117:0x024a, B:119:0x0250, B:121:0x0258, B:124:0x0261, B:129:0x0289, B:131:0x0292, B:133:0x02a1, B:135:0x02ae, B:137:0x02c4, B:139:0x02ca, B:262:0x04ea, B:141:0x02d7, B:144:0x02e3, B:146:0x02e9, B:148:0x02f2, B:150:0x02f8, B:151:0x02ff, B:154:0x0306, B:261:0x04e5, B:158:0x0318, B:160:0x0320, B:164:0x0341, B:166:0x0347, B:168:0x0354, B:184:0x0399, B:186:0x039f, B:190:0x03b0, B:192:0x03b6, B:194:0x03c3, B:211:0x040e, B:213:0x0416, B:227:0x0451, B:229:0x045b, B:247:0x0493, B:196:0x03ce, B:197:0x03cf, B:198:0x03d0, B:199:0x03d9, B:202:0x03e1, B:205:0x03eb, B:207:0x03f1, B:209:0x03fc, B:249:0x04a1, B:250:0x04a2, B:251:0x04a3, B:252:0x04ac, B:253:0x04b7, B:169:0x035b, B:170:0x035c, B:171:0x035d, B:172:0x0365, B:175:0x036f, B:178:0x0378, B:180:0x037e, B:182:0x0389, B:255:0x04be, B:256:0x04bf, B:257:0x04c0, B:258:0x04c9, B:259:0x04d4, B:76:0x019c, B:78:0x01a8, B:81:0x01b3, B:83:0x01b9, B:85:0x01c4, B:86:0x01cf, B:87:0x01d0, B:88:0x01d1, B:44:0x010e, B:47:0x011e, B:50:0x0128, B:52:0x012e, B:54:0x0135, B:56:0x013b, B:62:0x0153, B:64:0x015a, B:72:0x018a, B:68:0x017b, B:71:0x0189), top: B:396:0x007f }] */
    /* JADX WARN: Code duplicated, block: B:199:0x03d9 A[Catch: IOException -> 0x008c, XmlPullParserException -> 0x008f, TryCatch #3 {XmlPullParserException -> 0x008f, blocks: (B:15:0x007f, B:17:0x0087, B:23:0x0094, B:26:0x009e, B:30:0x00b2, B:32:0x00cb, B:34:0x00db, B:36:0x00e2, B:38:0x00ee, B:39:0x00f2, B:73:0x0193, B:95:0x01fa, B:97:0x0200, B:99:0x0208, B:101:0x0210, B:103:0x0218, B:105:0x0220, B:107:0x0228, B:109:0x022e, B:111:0x0236, B:113:0x023e, B:115:0x0244, B:117:0x024a, B:119:0x0250, B:121:0x0258, B:124:0x0261, B:129:0x0289, B:131:0x0292, B:133:0x02a1, B:135:0x02ae, B:137:0x02c4, B:139:0x02ca, B:262:0x04ea, B:141:0x02d7, B:144:0x02e3, B:146:0x02e9, B:148:0x02f2, B:150:0x02f8, B:151:0x02ff, B:154:0x0306, B:261:0x04e5, B:158:0x0318, B:160:0x0320, B:164:0x0341, B:166:0x0347, B:168:0x0354, B:184:0x0399, B:186:0x039f, B:190:0x03b0, B:192:0x03b6, B:194:0x03c3, B:211:0x040e, B:213:0x0416, B:227:0x0451, B:229:0x045b, B:247:0x0493, B:196:0x03ce, B:197:0x03cf, B:198:0x03d0, B:199:0x03d9, B:202:0x03e1, B:205:0x03eb, B:207:0x03f1, B:209:0x03fc, B:249:0x04a1, B:250:0x04a2, B:251:0x04a3, B:252:0x04ac, B:253:0x04b7, B:169:0x035b, B:170:0x035c, B:171:0x035d, B:172:0x0365, B:175:0x036f, B:178:0x0378, B:180:0x037e, B:182:0x0389, B:255:0x04be, B:256:0x04bf, B:257:0x04c0, B:258:0x04c9, B:259:0x04d4, B:76:0x019c, B:78:0x01a8, B:81:0x01b3, B:83:0x01b9, B:85:0x01c4, B:86:0x01cf, B:87:0x01d0, B:88:0x01d1, B:44:0x010e, B:47:0x011e, B:50:0x0128, B:52:0x012e, B:54:0x0135, B:56:0x013b, B:62:0x0153, B:64:0x015a, B:72:0x018a, B:68:0x017b, B:71:0x0189), top: B:396:0x007f }] */
    /* JADX WARN: Code duplicated, block: B:201:0x03df A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:202:0x03e1 A[Catch: IOException -> 0x008c, XmlPullParserException -> 0x008f, TRY_LEAVE, TryCatch #3 {XmlPullParserException -> 0x008f, blocks: (B:15:0x007f, B:17:0x0087, B:23:0x0094, B:26:0x009e, B:30:0x00b2, B:32:0x00cb, B:34:0x00db, B:36:0x00e2, B:38:0x00ee, B:39:0x00f2, B:73:0x0193, B:95:0x01fa, B:97:0x0200, B:99:0x0208, B:101:0x0210, B:103:0x0218, B:105:0x0220, B:107:0x0228, B:109:0x022e, B:111:0x0236, B:113:0x023e, B:115:0x0244, B:117:0x024a, B:119:0x0250, B:121:0x0258, B:124:0x0261, B:129:0x0289, B:131:0x0292, B:133:0x02a1, B:135:0x02ae, B:137:0x02c4, B:139:0x02ca, B:262:0x04ea, B:141:0x02d7, B:144:0x02e3, B:146:0x02e9, B:148:0x02f2, B:150:0x02f8, B:151:0x02ff, B:154:0x0306, B:261:0x04e5, B:158:0x0318, B:160:0x0320, B:164:0x0341, B:166:0x0347, B:168:0x0354, B:184:0x0399, B:186:0x039f, B:190:0x03b0, B:192:0x03b6, B:194:0x03c3, B:211:0x040e, B:213:0x0416, B:227:0x0451, B:229:0x045b, B:247:0x0493, B:196:0x03ce, B:197:0x03cf, B:198:0x03d0, B:199:0x03d9, B:202:0x03e1, B:205:0x03eb, B:207:0x03f1, B:209:0x03fc, B:249:0x04a1, B:250:0x04a2, B:251:0x04a3, B:252:0x04ac, B:253:0x04b7, B:169:0x035b, B:170:0x035c, B:171:0x035d, B:172:0x0365, B:175:0x036f, B:178:0x0378, B:180:0x037e, B:182:0x0389, B:255:0x04be, B:256:0x04bf, B:257:0x04c0, B:258:0x04c9, B:259:0x04d4, B:76:0x019c, B:78:0x01a8, B:81:0x01b3, B:83:0x01b9, B:85:0x01c4, B:86:0x01cf, B:87:0x01d0, B:88:0x01d1, B:44:0x010e, B:47:0x011e, B:50:0x0128, B:52:0x012e, B:54:0x0135, B:56:0x013b, B:62:0x0153, B:64:0x015a, B:72:0x018a, B:68:0x017b, B:71:0x0189), top: B:396:0x007f }] */
    /* JADX WARN: Code duplicated, block: B:204:0x03ea  */
    /* JADX WARN: Code duplicated, block: B:207:0x03f1 A[Catch: IOException -> 0x008c, XmlPullParserException -> 0x008f, NumberFormatException -> 0x04a3, TryCatch #2 {NumberFormatException -> 0x04a3, blocks: (B:205:0x03eb, B:207:0x03f1, B:209:0x03fc, B:249:0x04a1, B:250:0x04a2), top: B:395:0x03eb }] */
    /* JADX WARN: Code duplicated, block: B:209:0x03fc A[Catch: IOException -> 0x008c, XmlPullParserException -> 0x008f, NumberFormatException -> 0x04a3, TRY_LEAVE, TryCatch #2 {NumberFormatException -> 0x04a3, blocks: (B:205:0x03eb, B:207:0x03f1, B:209:0x03fc, B:249:0x04a1, B:250:0x04a2), top: B:395:0x03eb }] */
    /* JADX WARN: Code duplicated, block: B:213:0x0416 A[Catch: IOException -> 0x008c, XmlPullParserException -> 0x008f, TRY_LEAVE, TryCatch #3 {XmlPullParserException -> 0x008f, blocks: (B:15:0x007f, B:17:0x0087, B:23:0x0094, B:26:0x009e, B:30:0x00b2, B:32:0x00cb, B:34:0x00db, B:36:0x00e2, B:38:0x00ee, B:39:0x00f2, B:73:0x0193, B:95:0x01fa, B:97:0x0200, B:99:0x0208, B:101:0x0210, B:103:0x0218, B:105:0x0220, B:107:0x0228, B:109:0x022e, B:111:0x0236, B:113:0x023e, B:115:0x0244, B:117:0x024a, B:119:0x0250, B:121:0x0258, B:124:0x0261, B:129:0x0289, B:131:0x0292, B:133:0x02a1, B:135:0x02ae, B:137:0x02c4, B:139:0x02ca, B:262:0x04ea, B:141:0x02d7, B:144:0x02e3, B:146:0x02e9, B:148:0x02f2, B:150:0x02f8, B:151:0x02ff, B:154:0x0306, B:261:0x04e5, B:158:0x0318, B:160:0x0320, B:164:0x0341, B:166:0x0347, B:168:0x0354, B:184:0x0399, B:186:0x039f, B:190:0x03b0, B:192:0x03b6, B:194:0x03c3, B:211:0x040e, B:213:0x0416, B:227:0x0451, B:229:0x045b, B:247:0x0493, B:196:0x03ce, B:197:0x03cf, B:198:0x03d0, B:199:0x03d9, B:202:0x03e1, B:205:0x03eb, B:207:0x03f1, B:209:0x03fc, B:249:0x04a1, B:250:0x04a2, B:251:0x04a3, B:252:0x04ac, B:253:0x04b7, B:169:0x035b, B:170:0x035c, B:171:0x035d, B:172:0x0365, B:175:0x036f, B:178:0x0378, B:180:0x037e, B:182:0x0389, B:255:0x04be, B:256:0x04bf, B:257:0x04c0, B:258:0x04c9, B:259:0x04d4, B:76:0x019c, B:78:0x01a8, B:81:0x01b3, B:83:0x01b9, B:85:0x01c4, B:86:0x01cf, B:87:0x01d0, B:88:0x01d1, B:44:0x010e, B:47:0x011e, B:50:0x0128, B:52:0x012e, B:54:0x0135, B:56:0x013b, B:62:0x0153, B:64:0x015a, B:72:0x018a, B:68:0x017b, B:71:0x0189), top: B:396:0x007f }] */
    /* JADX WARN: Code duplicated, block: B:216:0x0423  */
    /* JADX WARN: Code duplicated, block: B:219:0x0429  */
    /* JADX WARN: Code duplicated, block: B:222:0x0438  */
    /* JADX WARN: Code duplicated, block: B:224:0x0440  */
    /* JADX WARN: Code duplicated, block: B:225:0x044a  */
    /* JADX WARN: Code duplicated, block: B:229:0x045b A[Catch: IOException -> 0x008c, XmlPullParserException -> 0x008f, TRY_LEAVE, TryCatch #3 {XmlPullParserException -> 0x008f, blocks: (B:15:0x007f, B:17:0x0087, B:23:0x0094, B:26:0x009e, B:30:0x00b2, B:32:0x00cb, B:34:0x00db, B:36:0x00e2, B:38:0x00ee, B:39:0x00f2, B:73:0x0193, B:95:0x01fa, B:97:0x0200, B:99:0x0208, B:101:0x0210, B:103:0x0218, B:105:0x0220, B:107:0x0228, B:109:0x022e, B:111:0x0236, B:113:0x023e, B:115:0x0244, B:117:0x024a, B:119:0x0250, B:121:0x0258, B:124:0x0261, B:129:0x0289, B:131:0x0292, B:133:0x02a1, B:135:0x02ae, B:137:0x02c4, B:139:0x02ca, B:262:0x04ea, B:141:0x02d7, B:144:0x02e3, B:146:0x02e9, B:148:0x02f2, B:150:0x02f8, B:151:0x02ff, B:154:0x0306, B:261:0x04e5, B:158:0x0318, B:160:0x0320, B:164:0x0341, B:166:0x0347, B:168:0x0354, B:184:0x0399, B:186:0x039f, B:190:0x03b0, B:192:0x03b6, B:194:0x03c3, B:211:0x040e, B:213:0x0416, B:227:0x0451, B:229:0x045b, B:247:0x0493, B:196:0x03ce, B:197:0x03cf, B:198:0x03d0, B:199:0x03d9, B:202:0x03e1, B:205:0x03eb, B:207:0x03f1, B:209:0x03fc, B:249:0x04a1, B:250:0x04a2, B:251:0x04a3, B:252:0x04ac, B:253:0x04b7, B:169:0x035b, B:170:0x035c, B:171:0x035d, B:172:0x0365, B:175:0x036f, B:178:0x0378, B:180:0x037e, B:182:0x0389, B:255:0x04be, B:256:0x04bf, B:257:0x04c0, B:258:0x04c9, B:259:0x04d4, B:76:0x019c, B:78:0x01a8, B:81:0x01b3, B:83:0x01b9, B:85:0x01c4, B:86:0x01cf, B:87:0x01d0, B:88:0x01d1, B:44:0x010e, B:47:0x011e, B:50:0x0128, B:52:0x012e, B:54:0x0135, B:56:0x013b, B:62:0x0153, B:64:0x015a, B:72:0x018a, B:68:0x017b, B:71:0x0189), top: B:396:0x007f }] */
    /* JADX WARN: Code duplicated, block: B:232:0x0467  */
    /* JADX WARN: Code duplicated, block: B:234:0x046c  */
    /* JADX WARN: Code duplicated, block: B:237:0x0472  */
    /* JADX WARN: Code duplicated, block: B:240:0x047d  */
    /* JADX WARN: Code duplicated, block: B:243:0x0486  */
    /* JADX WARN: Code duplicated, block: B:245:0x048e  */
    /* JADX WARN: Code duplicated, block: B:246:0x0491  */
    /* JADX WARN: Code duplicated, block: B:252:0x04ac A[Catch: IOException -> 0x008c, XmlPullParserException -> 0x008f, TryCatch #3 {XmlPullParserException -> 0x008f, blocks: (B:15:0x007f, B:17:0x0087, B:23:0x0094, B:26:0x009e, B:30:0x00b2, B:32:0x00cb, B:34:0x00db, B:36:0x00e2, B:38:0x00ee, B:39:0x00f2, B:73:0x0193, B:95:0x01fa, B:97:0x0200, B:99:0x0208, B:101:0x0210, B:103:0x0218, B:105:0x0220, B:107:0x0228, B:109:0x022e, B:111:0x0236, B:113:0x023e, B:115:0x0244, B:117:0x024a, B:119:0x0250, B:121:0x0258, B:124:0x0261, B:129:0x0289, B:131:0x0292, B:133:0x02a1, B:135:0x02ae, B:137:0x02c4, B:139:0x02ca, B:262:0x04ea, B:141:0x02d7, B:144:0x02e3, B:146:0x02e9, B:148:0x02f2, B:150:0x02f8, B:151:0x02ff, B:154:0x0306, B:261:0x04e5, B:158:0x0318, B:160:0x0320, B:164:0x0341, B:166:0x0347, B:168:0x0354, B:184:0x0399, B:186:0x039f, B:190:0x03b0, B:192:0x03b6, B:194:0x03c3, B:211:0x040e, B:213:0x0416, B:227:0x0451, B:229:0x045b, B:247:0x0493, B:196:0x03ce, B:197:0x03cf, B:198:0x03d0, B:199:0x03d9, B:202:0x03e1, B:205:0x03eb, B:207:0x03f1, B:209:0x03fc, B:249:0x04a1, B:250:0x04a2, B:251:0x04a3, B:252:0x04ac, B:253:0x04b7, B:169:0x035b, B:170:0x035c, B:171:0x035d, B:172:0x0365, B:175:0x036f, B:178:0x0378, B:180:0x037e, B:182:0x0389, B:255:0x04be, B:256:0x04bf, B:257:0x04c0, B:258:0x04c9, B:259:0x04d4, B:76:0x019c, B:78:0x01a8, B:81:0x01b3, B:83:0x01b9, B:85:0x01c4, B:86:0x01cf, B:87:0x01d0, B:88:0x01d1, B:44:0x010e, B:47:0x011e, B:50:0x0128, B:52:0x012e, B:54:0x0135, B:56:0x013b, B:62:0x0153, B:64:0x015a, B:72:0x018a, B:68:0x017b, B:71:0x0189), top: B:396:0x007f }] */
    /* JADX WARN: Code duplicated, block: B:253:0x04b7 A[Catch: IOException -> 0x008c, XmlPullParserException -> 0x008f, TRY_LEAVE, TryCatch #3 {XmlPullParserException -> 0x008f, blocks: (B:15:0x007f, B:17:0x0087, B:23:0x0094, B:26:0x009e, B:30:0x00b2, B:32:0x00cb, B:34:0x00db, B:36:0x00e2, B:38:0x00ee, B:39:0x00f2, B:73:0x0193, B:95:0x01fa, B:97:0x0200, B:99:0x0208, B:101:0x0210, B:103:0x0218, B:105:0x0220, B:107:0x0228, B:109:0x022e, B:111:0x0236, B:113:0x023e, B:115:0x0244, B:117:0x024a, B:119:0x0250, B:121:0x0258, B:124:0x0261, B:129:0x0289, B:131:0x0292, B:133:0x02a1, B:135:0x02ae, B:137:0x02c4, B:139:0x02ca, B:262:0x04ea, B:141:0x02d7, B:144:0x02e3, B:146:0x02e9, B:148:0x02f2, B:150:0x02f8, B:151:0x02ff, B:154:0x0306, B:261:0x04e5, B:158:0x0318, B:160:0x0320, B:164:0x0341, B:166:0x0347, B:168:0x0354, B:184:0x0399, B:186:0x039f, B:190:0x03b0, B:192:0x03b6, B:194:0x03c3, B:211:0x040e, B:213:0x0416, B:227:0x0451, B:229:0x045b, B:247:0x0493, B:196:0x03ce, B:197:0x03cf, B:198:0x03d0, B:199:0x03d9, B:202:0x03e1, B:205:0x03eb, B:207:0x03f1, B:209:0x03fc, B:249:0x04a1, B:250:0x04a2, B:251:0x04a3, B:252:0x04ac, B:253:0x04b7, B:169:0x035b, B:170:0x035c, B:171:0x035d, B:172:0x0365, B:175:0x036f, B:178:0x0378, B:180:0x037e, B:182:0x0389, B:255:0x04be, B:256:0x04bf, B:257:0x04c0, B:258:0x04c9, B:259:0x04d4, B:76:0x019c, B:78:0x01a8, B:81:0x01b3, B:83:0x01b9, B:85:0x01c4, B:86:0x01cf, B:87:0x01d0, B:88:0x01d1, B:44:0x010e, B:47:0x011e, B:50:0x0128, B:52:0x012e, B:54:0x0135, B:56:0x013b, B:62:0x0153, B:64:0x015a, B:72:0x018a, B:68:0x017b, B:71:0x0189), top: B:396:0x007f }] */
    /* JADX WARN: Code duplicated, block: B:261:0x04e5 A[Catch: IOException -> 0x008c, XmlPullParserException -> 0x008f, TryCatch #3 {XmlPullParserException -> 0x008f, blocks: (B:15:0x007f, B:17:0x0087, B:23:0x0094, B:26:0x009e, B:30:0x00b2, B:32:0x00cb, B:34:0x00db, B:36:0x00e2, B:38:0x00ee, B:39:0x00f2, B:73:0x0193, B:95:0x01fa, B:97:0x0200, B:99:0x0208, B:101:0x0210, B:103:0x0218, B:105:0x0220, B:107:0x0228, B:109:0x022e, B:111:0x0236, B:113:0x023e, B:115:0x0244, B:117:0x024a, B:119:0x0250, B:121:0x0258, B:124:0x0261, B:129:0x0289, B:131:0x0292, B:133:0x02a1, B:135:0x02ae, B:137:0x02c4, B:139:0x02ca, B:262:0x04ea, B:141:0x02d7, B:144:0x02e3, B:146:0x02e9, B:148:0x02f2, B:150:0x02f8, B:151:0x02ff, B:154:0x0306, B:261:0x04e5, B:158:0x0318, B:160:0x0320, B:164:0x0341, B:166:0x0347, B:168:0x0354, B:184:0x0399, B:186:0x039f, B:190:0x03b0, B:192:0x03b6, B:194:0x03c3, B:211:0x040e, B:213:0x0416, B:227:0x0451, B:229:0x045b, B:247:0x0493, B:196:0x03ce, B:197:0x03cf, B:198:0x03d0, B:199:0x03d9, B:202:0x03e1, B:205:0x03eb, B:207:0x03f1, B:209:0x03fc, B:249:0x04a1, B:250:0x04a2, B:251:0x04a3, B:252:0x04ac, B:253:0x04b7, B:169:0x035b, B:170:0x035c, B:171:0x035d, B:172:0x0365, B:175:0x036f, B:178:0x0378, B:180:0x037e, B:182:0x0389, B:255:0x04be, B:256:0x04bf, B:257:0x04c0, B:258:0x04c9, B:259:0x04d4, B:76:0x019c, B:78:0x01a8, B:81:0x01b3, B:83:0x01b9, B:85:0x01c4, B:86:0x01cf, B:87:0x01d0, B:88:0x01d1, B:44:0x010e, B:47:0x011e, B:50:0x0128, B:52:0x012e, B:54:0x0135, B:56:0x013b, B:62:0x0153, B:64:0x015a, B:72:0x018a, B:68:0x017b, B:71:0x0189), top: B:396:0x007f }] */
    /* JADX WARN: Code duplicated, block: B:265:0x04f6 A[LOOP:1: B:129:0x0289->B:265:0x04f6, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:292:0x0590  */
    /* JADX WARN: Code duplicated, block: B:418:0x01d0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:419:0x01cf A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:424:0x03cf A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:425:0x03ce A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:426:0x04a2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:427:0x04a1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:434:0x04f0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:75:0x0199  */
    /* JADX WARN: Code duplicated, block: B:76:0x019c A[Catch: IOException -> 0x008c, XmlPullParserException -> 0x008f, TryCatch #3 {XmlPullParserException -> 0x008f, blocks: (B:15:0x007f, B:17:0x0087, B:23:0x0094, B:26:0x009e, B:30:0x00b2, B:32:0x00cb, B:34:0x00db, B:36:0x00e2, B:38:0x00ee, B:39:0x00f2, B:73:0x0193, B:95:0x01fa, B:97:0x0200, B:99:0x0208, B:101:0x0210, B:103:0x0218, B:105:0x0220, B:107:0x0228, B:109:0x022e, B:111:0x0236, B:113:0x023e, B:115:0x0244, B:117:0x024a, B:119:0x0250, B:121:0x0258, B:124:0x0261, B:129:0x0289, B:131:0x0292, B:133:0x02a1, B:135:0x02ae, B:137:0x02c4, B:139:0x02ca, B:262:0x04ea, B:141:0x02d7, B:144:0x02e3, B:146:0x02e9, B:148:0x02f2, B:150:0x02f8, B:151:0x02ff, B:154:0x0306, B:261:0x04e5, B:158:0x0318, B:160:0x0320, B:164:0x0341, B:166:0x0347, B:168:0x0354, B:184:0x0399, B:186:0x039f, B:190:0x03b0, B:192:0x03b6, B:194:0x03c3, B:211:0x040e, B:213:0x0416, B:227:0x0451, B:229:0x045b, B:247:0x0493, B:196:0x03ce, B:197:0x03cf, B:198:0x03d0, B:199:0x03d9, B:202:0x03e1, B:205:0x03eb, B:207:0x03f1, B:209:0x03fc, B:249:0x04a1, B:250:0x04a2, B:251:0x04a3, B:252:0x04ac, B:253:0x04b7, B:169:0x035b, B:170:0x035c, B:171:0x035d, B:172:0x0365, B:175:0x036f, B:178:0x0378, B:180:0x037e, B:182:0x0389, B:255:0x04be, B:256:0x04bf, B:257:0x04c0, B:258:0x04c9, B:259:0x04d4, B:76:0x019c, B:78:0x01a8, B:81:0x01b3, B:83:0x01b9, B:85:0x01c4, B:86:0x01cf, B:87:0x01d0, B:88:0x01d1, B:44:0x010e, B:47:0x011e, B:50:0x0128, B:52:0x012e, B:54:0x0135, B:56:0x013b, B:62:0x0153, B:64:0x015a, B:72:0x018a, B:68:0x017b, B:71:0x0189), top: B:396:0x007f }] */
    /* JADX WARN: Code duplicated, block: B:78:0x01a8 A[Catch: IOException -> 0x008c, XmlPullParserException -> 0x008f, TRY_LEAVE, TryCatch #3 {XmlPullParserException -> 0x008f, blocks: (B:15:0x007f, B:17:0x0087, B:23:0x0094, B:26:0x009e, B:30:0x00b2, B:32:0x00cb, B:34:0x00db, B:36:0x00e2, B:38:0x00ee, B:39:0x00f2, B:73:0x0193, B:95:0x01fa, B:97:0x0200, B:99:0x0208, B:101:0x0210, B:103:0x0218, B:105:0x0220, B:107:0x0228, B:109:0x022e, B:111:0x0236, B:113:0x023e, B:115:0x0244, B:117:0x024a, B:119:0x0250, B:121:0x0258, B:124:0x0261, B:129:0x0289, B:131:0x0292, B:133:0x02a1, B:135:0x02ae, B:137:0x02c4, B:139:0x02ca, B:262:0x04ea, B:141:0x02d7, B:144:0x02e3, B:146:0x02e9, B:148:0x02f2, B:150:0x02f8, B:151:0x02ff, B:154:0x0306, B:261:0x04e5, B:158:0x0318, B:160:0x0320, B:164:0x0341, B:166:0x0347, B:168:0x0354, B:184:0x0399, B:186:0x039f, B:190:0x03b0, B:192:0x03b6, B:194:0x03c3, B:211:0x040e, B:213:0x0416, B:227:0x0451, B:229:0x045b, B:247:0x0493, B:196:0x03ce, B:197:0x03cf, B:198:0x03d0, B:199:0x03d9, B:202:0x03e1, B:205:0x03eb, B:207:0x03f1, B:209:0x03fc, B:249:0x04a1, B:250:0x04a2, B:251:0x04a3, B:252:0x04ac, B:253:0x04b7, B:169:0x035b, B:170:0x035c, B:171:0x035d, B:172:0x0365, B:175:0x036f, B:178:0x0378, B:180:0x037e, B:182:0x0389, B:255:0x04be, B:256:0x04bf, B:257:0x04c0, B:258:0x04c9, B:259:0x04d4, B:76:0x019c, B:78:0x01a8, B:81:0x01b3, B:83:0x01b9, B:85:0x01c4, B:86:0x01cf, B:87:0x01d0, B:88:0x01d1, B:44:0x010e, B:47:0x011e, B:50:0x0128, B:52:0x012e, B:54:0x0135, B:56:0x013b, B:62:0x0153, B:64:0x015a, B:72:0x018a, B:68:0x017b, B:71:0x0189), top: B:396:0x007f }] */
    /* JADX WARN: Code duplicated, block: B:80:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:83:0x01b9 A[Catch: IOException -> 0x008c, XmlPullParserException -> 0x008f, NumberFormatException -> 0x01d1, TryCatch #3 {XmlPullParserException -> 0x008f, blocks: (B:15:0x007f, B:17:0x0087, B:23:0x0094, B:26:0x009e, B:30:0x00b2, B:32:0x00cb, B:34:0x00db, B:36:0x00e2, B:38:0x00ee, B:39:0x00f2, B:73:0x0193, B:95:0x01fa, B:97:0x0200, B:99:0x0208, B:101:0x0210, B:103:0x0218, B:105:0x0220, B:107:0x0228, B:109:0x022e, B:111:0x0236, B:113:0x023e, B:115:0x0244, B:117:0x024a, B:119:0x0250, B:121:0x0258, B:124:0x0261, B:129:0x0289, B:131:0x0292, B:133:0x02a1, B:135:0x02ae, B:137:0x02c4, B:139:0x02ca, B:262:0x04ea, B:141:0x02d7, B:144:0x02e3, B:146:0x02e9, B:148:0x02f2, B:150:0x02f8, B:151:0x02ff, B:154:0x0306, B:261:0x04e5, B:158:0x0318, B:160:0x0320, B:164:0x0341, B:166:0x0347, B:168:0x0354, B:184:0x0399, B:186:0x039f, B:190:0x03b0, B:192:0x03b6, B:194:0x03c3, B:211:0x040e, B:213:0x0416, B:227:0x0451, B:229:0x045b, B:247:0x0493, B:196:0x03ce, B:197:0x03cf, B:198:0x03d0, B:199:0x03d9, B:202:0x03e1, B:205:0x03eb, B:207:0x03f1, B:209:0x03fc, B:249:0x04a1, B:250:0x04a2, B:251:0x04a3, B:252:0x04ac, B:253:0x04b7, B:169:0x035b, B:170:0x035c, B:171:0x035d, B:172:0x0365, B:175:0x036f, B:178:0x0378, B:180:0x037e, B:182:0x0389, B:255:0x04be, B:256:0x04bf, B:257:0x04c0, B:258:0x04c9, B:259:0x04d4, B:76:0x019c, B:78:0x01a8, B:81:0x01b3, B:83:0x01b9, B:85:0x01c4, B:86:0x01cf, B:87:0x01d0, B:88:0x01d1, B:44:0x010e, B:47:0x011e, B:50:0x0128, B:52:0x012e, B:54:0x0135, B:56:0x013b, B:62:0x0153, B:64:0x015a, B:72:0x018a, B:68:0x017b, B:71:0x0189), top: B:396:0x007f }] */
    /* JADX WARN: Code duplicated, block: B:85:0x01c4 A[Catch: IOException -> 0x008c, XmlPullParserException -> 0x008f, NumberFormatException -> 0x01d1, TryCatch #3 {XmlPullParserException -> 0x008f, blocks: (B:15:0x007f, B:17:0x0087, B:23:0x0094, B:26:0x009e, B:30:0x00b2, B:32:0x00cb, B:34:0x00db, B:36:0x00e2, B:38:0x00ee, B:39:0x00f2, B:73:0x0193, B:95:0x01fa, B:97:0x0200, B:99:0x0208, B:101:0x0210, B:103:0x0218, B:105:0x0220, B:107:0x0228, B:109:0x022e, B:111:0x0236, B:113:0x023e, B:115:0x0244, B:117:0x024a, B:119:0x0250, B:121:0x0258, B:124:0x0261, B:129:0x0289, B:131:0x0292, B:133:0x02a1, B:135:0x02ae, B:137:0x02c4, B:139:0x02ca, B:262:0x04ea, B:141:0x02d7, B:144:0x02e3, B:146:0x02e9, B:148:0x02f2, B:150:0x02f8, B:151:0x02ff, B:154:0x0306, B:261:0x04e5, B:158:0x0318, B:160:0x0320, B:164:0x0341, B:166:0x0347, B:168:0x0354, B:184:0x0399, B:186:0x039f, B:190:0x03b0, B:192:0x03b6, B:194:0x03c3, B:211:0x040e, B:213:0x0416, B:227:0x0451, B:229:0x045b, B:247:0x0493, B:196:0x03ce, B:197:0x03cf, B:198:0x03d0, B:199:0x03d9, B:202:0x03e1, B:205:0x03eb, B:207:0x03f1, B:209:0x03fc, B:249:0x04a1, B:250:0x04a2, B:251:0x04a3, B:252:0x04ac, B:253:0x04b7, B:169:0x035b, B:170:0x035c, B:171:0x035d, B:172:0x0365, B:175:0x036f, B:178:0x0378, B:180:0x037e, B:182:0x0389, B:255:0x04be, B:256:0x04bf, B:257:0x04c0, B:258:0x04c9, B:259:0x04d4, B:76:0x019c, B:78:0x01a8, B:81:0x01b3, B:83:0x01b9, B:85:0x01c4, B:86:0x01cf, B:87:0x01d0, B:88:0x01d1, B:44:0x010e, B:47:0x011e, B:50:0x0128, B:52:0x012e, B:54:0x0135, B:56:0x013b, B:62:0x0153, B:64:0x015a, B:72:0x018a, B:68:0x017b, B:71:0x0189), top: B:396:0x007f }] */
    /* JADX WARN: Failed to find 'out' block for switch in B:270:0x053b. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v71 */
    /* JADX WARN: Type inference failed for: r0v85, types: [java.lang.Object, l.chr0] */
    /* JADX WARN: Type inference failed for: r0v86 */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v13 */
    /* JADX WARN: Type inference failed for: r14v14 */
    /* JADX WARN: Type inference failed for: r14v15 */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v22, types: [l.ahr0] */
    /* JADX WARN: Type inference failed for: r14v23 */
    /* JADX WARN: Type inference failed for: r14v24 */
    /* JADX WARN: Type inference failed for: r14v25 */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v2, types: [l.nfr0] */
    /* JADX WARN: Type inference failed for: r16v3 */
    /* JADX WARN: Type inference failed for: r16v7, types: [java.lang.Throwable, l.ehr0] */
    /* JADX WARN: Type inference failed for: r16v8 */
    /* JADX INFO: renamed from: b */
    public final nfr0 m101922b(byte[] bArr, int i, int i2) {
        ?? r16;
        String str;
        String str2;
        HashMap map;
        HashMap map2;
        ArrayDeque arrayDeque;
        zgr0 zgr0Var;
        fhr0 fhr0Var;
        int i3;
        float f;
        ygr0 ygr0Var;
        zgr0 zgr0Var2;
        int i4;
        boolean z;
        String strM193586a;
        Matcher matcher;
        String strGroup;
        int i5;
        String strGroup2;
        ?? ahr0Var;
        zgr0 zgr0Var3;
        HashMap map3;
        HashMap map4;
        zgr0 zgr0Var4;
        ygr0 ygr0Var2;
        ygr0 ygr0Var3;
        long j;
        String str3;
        String str4;
        float f2;
        float f3;
        String strM193586a2;
        Matcher matcher2;
        Matcher matcher3;
        String strGroup3;
        int i6;
        String strGroup4;
        float f4;
        float f5;
        float f6;
        String strM193586a3;
        int i7;
        float f7;
        String strM193586a4;
        int i8;
        ?? chr0Var;
        String strM174257a;
        int iHashCode;
        String strM174257a2;
        int iHashCode2;
        String strGroup5;
        float f8;
        String strGroup6;
        String strM193586a5;
        String str5 = "";
        String str6 = "http://www.w3.org/ns/ttml#parameter";
        Object obj = null;
        try {
            try {
                try {
                    XmlPullParser xmlPullParserNewPullParser = this.f75657a.newPullParser();
                    HashMap map5 = new HashMap();
                    HashMap map6 = new HashMap();
                    HashMap map7 = new HashMap();
                    map6.put("", new chr0("", -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, -3.4028235E38f, Integer.MIN_VALUE));
                    xmlPullParserNewPullParser.setInput(new ByteArrayInputStream(bArr, i, i2), null);
                    ArrayDeque arrayDeque2 = new ArrayDeque();
                    int eventType = xmlPullParserNewPullParser.getEventType();
                    zgr0 zgr0Var5 = f75656i;
                    fhr0 fhr0Var2 = null;
                    ?? r14 = 0;
                    int i9 = 0;
                    int i10 = 15;
                    while (eventType != 1) {
                        ygr0 ygr0Var4 = (ygr0) arrayDeque2.peek();
                        ?? r17 = obj;
                        if (i9 == 0) {
                            String name = xmlPullParserNewPullParser.getName();
                            str = str5;
                            if (eventType == 2) {
                                zgr0 zgr0Var6 = zgr0Var5;
                                if ("tt".equals(name)) {
                                    try {
                                        String attributeValue = xmlPullParserNewPullParser.getAttributeValue(str6, "frameRate");
                                        int i11 = attributeValue != null ? Integer.parseInt(attributeValue) : 30;
                                        String attributeValue2 = xmlPullParserNewPullParser.getAttributeValue(str6, "frameRateMultiplier");
                                        if (attributeValue2 != null) {
                                            int i12 = ggw0.f102568a;
                                            String[] strArrSplit = attributeValue2.split(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR, -1);
                                            f5v0.m119534e(strArrSplit.length == 2, "frameRateMultiplier doesn't have 2 parts");
                                            f = Integer.parseInt(strArrSplit[0]) / Integer.parseInt(strArrSplit[1]);
                                        } else {
                                            f = 1.0f;
                                        }
                                        zgr0 zgr0Var7 = f75656i;
                                        float f9 = f;
                                        int i13 = zgr0Var7.f203080b;
                                        String attributeValue3 = xmlPullParserNewPullParser.getAttributeValue(str6, "subFrameRate");
                                        int i14 = attributeValue3 != null ? Integer.parseInt(attributeValue3) : i13;
                                        int i15 = zgr0Var7.f203081c;
                                        String attributeValue4 = xmlPullParserNewPullParser.getAttributeValue(str6, "tickRate");
                                        if (attributeValue4 != null) {
                                            i15 = Integer.parseInt(attributeValue4);
                                        }
                                        zgr0 zgr0Var8 = new zgr0(i11 * f9, i14, i15);
                                        String attributeValue5 = xmlPullParserNewPullParser.getAttributeValue(str6, "cellResolution");
                                        if (attributeValue5 == null) {
                                            str2 = str6;
                                        } else {
                                            Matcher matcher4 = f75655h.matcher(attributeValue5);
                                            str2 = str6;
                                            if (matcher4.matches()) {
                                                try {
                                                    String strGroup7 = matcher4.group(1);
                                                    if (strGroup7 == null) {
                                                        throw r17;
                                                    }
                                                    int i16 = Integer.parseInt(strGroup7);
                                                    zgr0Var2 = zgr0Var8;
                                                    try {
                                                        String strGroup8 = matcher4.group(2);
                                                        if (strGroup8 == null) {
                                                            throw r17;
                                                        }
                                                        int i17 = Integer.parseInt(strGroup8);
                                                        if (i16 == 0) {
                                                            i4 = i17;
                                                            z = false;
                                                        } else if (i17 != 0) {
                                                            i4 = i17;
                                                            z = true;
                                                        } else {
                                                            z = false;
                                                            i4 = 0;
                                                        }
                                                        try {
                                                            StringBuilder sb = new StringBuilder();
                                                            ygr0Var = ygr0Var4;
                                                            try {
                                                                sb.append("Invalid cell resolution ");
                                                                sb.append(i16);
                                                                sb.append(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
                                                                sb.append(i4);
                                                                f5v0.m119534e(z, sb.toString());
                                                                i10 = i4;
                                                            } catch (NumberFormatException unused) {
                                                                svv0.m186111f("TtmlParser", "Ignoring malformed cell resolution: ".concat(attributeValue5));
                                                                i10 = 15;
                                                            }
                                                        } catch (NumberFormatException unused2) {
                                                            ygr0Var = ygr0Var4;
                                                        }
                                                    } catch (NumberFormatException unused3) {
                                                        arrayDeque2 = arrayDeque2;
                                                    }
                                                    ygr0Var = ygr0Var4;
                                                } catch (NumberFormatException unused4) {
                                                    arrayDeque2 = arrayDeque2;
                                                    ygr0Var = ygr0Var4;
                                                    zgr0Var2 = zgr0Var8;
                                                }
                                                svv0.m186111f("TtmlParser", "Ignoring malformed cell resolution: ".concat(attributeValue5));
                                                i10 = 15;
                                            } else {
                                                svv0.m186111f("TtmlParser", "Ignoring malformed cell resolution: ".concat(attributeValue5));
                                            }
                                            strM193586a = ugw0.m193586a(xmlPullParserNewPullParser, "extent");
                                            if (strM193586a == null) {
                                                ahr0Var = r17;
                                            } else {
                                                matcher = f75654g.matcher(strM193586a);
                                                if (matcher.matches()) {
                                                    try {
                                                        strGroup = matcher.group(1);
                                                        if (strGroup != null) {
                                                            throw r17;
                                                        }
                                                        i5 = Integer.parseInt(strGroup);
                                                        strGroup2 = matcher.group(2);
                                                        if (strGroup2 != null) {
                                                            throw r17;
                                                        }
                                                        ahr0Var = new ahr0(i5, Integer.parseInt(strGroup2));
                                                    } catch (NumberFormatException unused5) {
                                                        svv0.m186111f("TtmlParser", "Ignoring malformed tts extent: ".concat(strM193586a));
                                                        ahr0Var = r17;
                                                    }
                                                } else {
                                                    svv0.m186111f("TtmlParser", "Ignoring non-pixel tts extent: ".concat(strM193586a));
                                                }
                                                ahr0Var = r17;
                                            }
                                            zgr0Var3 = zgr0Var2;
                                            r14 = ahr0Var;
                                        }
                                        arrayDeque2 = arrayDeque2;
                                        ygr0Var = ygr0Var4;
                                        zgr0Var2 = zgr0Var8;
                                        i10 = 15;
                                        strM193586a = ugw0.m193586a(xmlPullParserNewPullParser, "extent");
                                        if (strM193586a == null) {
                                            ahr0Var = r17;
                                        } else {
                                            matcher = f75654g.matcher(strM193586a);
                                            if (matcher.matches()) {
                                                svv0.m186111f("TtmlParser", "Ignoring non-pixel tts extent: ".concat(strM193586a));
                                            } else {
                                                strGroup = matcher.group(1);
                                                if (strGroup != null) {
                                                    throw r17;
                                                }
                                                i5 = Integer.parseInt(strGroup);
                                                strGroup2 = matcher.group(2);
                                                if (strGroup2 != null) {
                                                    throw r17;
                                                }
                                                ahr0Var = new ahr0(i5, Integer.parseInt(strGroup2));
                                            }
                                            ahr0Var = r17;
                                        }
                                        zgr0Var3 = zgr0Var2;
                                        r14 = ahr0Var;
                                    } catch (XmlPullParserException e) {
                                        e = e;
                                        r16 = r17;
                                        byv.m104511a("Unable to decode source", e);
                                        return r16;
                                    }
                                } else {
                                    str2 = str6;
                                    arrayDeque2 = arrayDeque2;
                                    ygr0Var = ygr0Var4;
                                    fhr0Var2 = fhr0Var2;
                                    zgr0Var3 = zgr0Var6;
                                    r14 = r14;
                                }
                                String str7 = "image";
                                String str8 = "metadata";
                                String str9 = "style";
                                if (name.equals("tt") || name.equals("head") || name.equals("body") || name.equals("div") || name.equals("p") || name.equals("span") || name.equals("br") || name.equals("style") || name.equals("styling") || name.equals("layout") || name.equals("region") || name.equals("metadata") || name.equals("image") || name.equals("data") || name.equals("information")) {
                                    if ("head".equals(name)) {
                                        while (true) {
                                            xmlPullParserNewPullParser.next();
                                            if (ugw0.m193588c(xmlPullParserNewPullParser, str9)) {
                                                String strM193586a6 = ugw0.m193586a(xmlPullParserNewPullParser, str9);
                                                ehr0 ehr0VarM101919f = m101919f(xmlPullParserNewPullParser, new ehr0());
                                                if (strM193586a6 != null) {
                                                    String[] strArrM101920g = m101920g(strM193586a6);
                                                    int i18 = 0;
                                                    for (int length = strArrM101920g.length; i18 < length; length = length) {
                                                        ehr0VarM101919f.m116590v((ehr0) map5.get(strArrM101920g[i18]));
                                                        i18++;
                                                    }
                                                }
                                                String strM116573e = ehr0VarM101919f.m116573e();
                                                if (strM116573e != null) {
                                                    map5.put(strM116573e, ehr0VarM101919f);
                                                }
                                            } else {
                                                zgr0Var3 = zgr0Var3;
                                                str9 = str9;
                                                if (ugw0.m193588c(xmlPullParserNewPullParser, "region")) {
                                                    String strM193586a7 = ugw0.m193586a(xmlPullParserNewPullParser, "id");
                                                    if (strM193586a7 == null) {
                                                        str3 = str7;
                                                        map3 = map5;
                                                        map4 = map7;
                                                        str4 = str8;
                                                    } else {
                                                        String strM193586a8 = ugw0.m193586a(xmlPullParserNewPullParser, "origin");
                                                        if (strM193586a8 != null) {
                                                            Pattern pattern = f75653f;
                                                            Matcher matcher5 = pattern.matcher(strM193586a8);
                                                            Pattern pattern2 = f75654g;
                                                            str3 = str7;
                                                            Matcher matcher6 = pattern2.matcher(strM193586a8);
                                                            str4 = str8;
                                                            map3 = map5;
                                                            if (matcher5.matches()) {
                                                                map4 = map7;
                                                                try {
                                                                    String strGroup9 = matcher5.group(1);
                                                                    if (strGroup9 == null) {
                                                                        throw r17;
                                                                    }
                                                                    f3 = Float.parseFloat(strGroup9) / 100.0f;
                                                                    String strGroup10 = matcher5.group(2);
                                                                    if (strGroup10 == null) {
                                                                        throw r17;
                                                                    }
                                                                    f2 = Float.parseFloat(strGroup10) / 100.0f;
                                                                    strM193586a2 = ugw0.m193586a(xmlPullParserNewPullParser, "extent");
                                                                    if (strM193586a2 != null) {
                                                                        matcher2 = pattern.matcher(strM193586a2);
                                                                        matcher3 = pattern2.matcher(strM193586a2);
                                                                        if (matcher2.matches()) {
                                                                            try {
                                                                                strGroup5 = matcher2.group(1);
                                                                                if (strGroup5 != null) {
                                                                                    throw r17;
                                                                                }
                                                                                f8 = Float.parseFloat(strGroup5) / 100.0f;
                                                                                strGroup6 = matcher2.group(2);
                                                                                if (strGroup6 != null) {
                                                                                    throw r17;
                                                                                }
                                                                                f4 = Float.parseFloat(strGroup6) / 100.0f;
                                                                                f5 = f8;
                                                                                f6 = f4;
                                                                                strM193586a3 = ugw0.m193586a(xmlPullParserNewPullParser, "displayAlign");
                                                                                if (strM193586a3 != null) {
                                                                                    strM174257a2 = qew0.m174257a(strM193586a3);
                                                                                    iHashCode2 = strM174257a2.hashCode();
                                                                                    if (iHashCode2 != -1364013995) {
                                                                                        if (iHashCode2 != 92734940 && strM174257a2.equals(OMSSwipeMoment.after)) {
                                                                                            f7 = f2 + f6;
                                                                                            i7 = 2;
                                                                                        } else {
                                                                                            i7 = 0;
                                                                                            f7 = f2;
                                                                                        }
                                                                                    } else if (strM174257a2.equals("center")) {
                                                                                        f7 = f2 + (f6 / 2.0f);
                                                                                        i7 = 1;
                                                                                    } else {
                                                                                        i7 = 0;
                                                                                        f7 = f2;
                                                                                    }
                                                                                } else {
                                                                                    i7 = 0;
                                                                                    f7 = f2;
                                                                                }
                                                                                float f10 = 1.0f / i10;
                                                                                strM193586a4 = ugw0.m193586a(xmlPullParserNewPullParser, "writingMode");
                                                                                if (strM193586a4 != null) {
                                                                                    strM174257a = qew0.m174257a(strM193586a4);
                                                                                    iHashCode = strM174257a.hashCode();
                                                                                    if (iHashCode != 3694) {
                                                                                        if (iHashCode != 3553396) {
                                                                                            if (iHashCode == 3553576 && strM174257a.equals("tbrl")) {
                                                                                                i8 = 1;
                                                                                            }
                                                                                        } else if (strM174257a.equals("tblr")) {
                                                                                            i8 = 2;
                                                                                        }
                                                                                        i8 = Integer.MIN_VALUE;
                                                                                    } else if (strM174257a.equals("tb")) {
                                                                                        i8 = 2;
                                                                                    } else {
                                                                                        i8 = Integer.MIN_VALUE;
                                                                                    }
                                                                                } else {
                                                                                    i8 = Integer.MIN_VALUE;
                                                                                }
                                                                                chr0Var = new chr0(strM193586a7, f3, f7, 0, i7, f5, f6, 1, f10, i8);
                                                                            } catch (NumberFormatException unused6) {
                                                                                svv0.m186111f("TtmlParser", "Ignoring region with malformed extent: ".concat(strM193586a8));
                                                                                chr0Var = r17;
                                                                            }
                                                                        } else if (matcher3.matches()) {
                                                                            svv0.m186111f("TtmlParser", "Ignoring region with unsupported extent: ".concat(strM193586a8));
                                                                        } else if (r14 == 0) {
                                                                            svv0.m186111f("TtmlParser", "Ignoring region with missing tts:extent: ".concat(strM193586a8));
                                                                        } else {
                                                                            try {
                                                                                strGroup3 = matcher3.group(1);
                                                                                if (strGroup3 != null) {
                                                                                    throw r17;
                                                                                }
                                                                                i6 = Integer.parseInt(strGroup3);
                                                                                strGroup4 = matcher3.group(2);
                                                                                if (strGroup4 != null) {
                                                                                    throw r17;
                                                                                }
                                                                                int i19 = Integer.parseInt(strGroup4);
                                                                                float f11 = i6 / r14.f69684a;
                                                                                f4 = i19 / r14.f69685b;
                                                                                f5 = f11;
                                                                                f6 = f4;
                                                                                strM193586a3 = ugw0.m193586a(xmlPullParserNewPullParser, "displayAlign");
                                                                                if (strM193586a3 != null) {
                                                                                    strM174257a2 = qew0.m174257a(strM193586a3);
                                                                                    iHashCode2 = strM174257a2.hashCode();
                                                                                    if (iHashCode2 != -1364013995) {
                                                                                        if (iHashCode2 != 92734940) {
                                                                                            i7 = 0;
                                                                                            f7 = f2;
                                                                                        } else {
                                                                                            f7 = f2 + f6;
                                                                                            i7 = 2;
                                                                                        }
                                                                                    } else if (strM174257a2.equals("center")) {
                                                                                        f7 = f2 + (f6 / 2.0f);
                                                                                        i7 = 1;
                                                                                    } else {
                                                                                        i7 = 0;
                                                                                        f7 = f2;
                                                                                    }
                                                                                } else {
                                                                                    i7 = 0;
                                                                                    f7 = f2;
                                                                                }
                                                                                float f12 = 1.0f / i10;
                                                                                strM193586a4 = ugw0.m193586a(xmlPullParserNewPullParser, "writingMode");
                                                                                if (strM193586a4 != null) {
                                                                                    strM174257a = qew0.m174257a(strM193586a4);
                                                                                    iHashCode = strM174257a.hashCode();
                                                                                    if (iHashCode != 3694) {
                                                                                        if (iHashCode != 3553396) {
                                                                                            if (iHashCode == 3553576) {
                                                                                                i8 = 1;
                                                                                            }
                                                                                        } else if (strM174257a.equals("tblr")) {
                                                                                            i8 = 2;
                                                                                        }
                                                                                        i8 = Integer.MIN_VALUE;
                                                                                    } else if (strM174257a.equals("tb")) {
                                                                                        i8 = 2;
                                                                                    } else {
                                                                                        i8 = Integer.MIN_VALUE;
                                                                                    }
                                                                                } else {
                                                                                    i8 = Integer.MIN_VALUE;
                                                                                }
                                                                                chr0Var = new chr0(strM193586a7, f3, f7, 0, i7, f5, f6, 1, f12, i8);
                                                                            } catch (NumberFormatException unused7) {
                                                                                svv0.m186111f("TtmlParser", "Ignoring region with malformed extent: ".concat(strM193586a8));
                                                                                chr0Var = r17;
                                                                            }
                                                                        }
                                                                        if (chr0Var != 0) {
                                                                            map6.put(chr0Var.f80997a, chr0Var);
                                                                        }
                                                                    } else {
                                                                        svv0.m186111f("TtmlParser", "Ignoring region without an extent");
                                                                    }
                                                                } catch (NumberFormatException unused8) {
                                                                    svv0.m186111f("TtmlParser", "Ignoring region with malformed origin: ".concat(strM193586a8));
                                                                }
                                                            } else {
                                                                map4 = map7;
                                                                if (!matcher6.matches()) {
                                                                    svv0.m186111f("TtmlParser", "Ignoring region with unsupported origin: ".concat(strM193586a8));
                                                                } else if (r14 == 0) {
                                                                    svv0.m186111f("TtmlParser", "Ignoring region with missing tts:extent: ".concat(strM193586a8));
                                                                } else {
                                                                    try {
                                                                        String strGroup11 = matcher6.group(1);
                                                                        if (strGroup11 == null) {
                                                                            throw r17;
                                                                        }
                                                                        int i20 = Integer.parseInt(strGroup11);
                                                                        String strGroup12 = matcher6.group(2);
                                                                        if (strGroup12 == null) {
                                                                            throw r17;
                                                                        }
                                                                        int i21 = Integer.parseInt(strGroup12);
                                                                        float f13 = i20 / r14.f69684a;
                                                                        f2 = i21 / r14.f69685b;
                                                                        f3 = f13;
                                                                        strM193586a2 = ugw0.m193586a(xmlPullParserNewPullParser, "extent");
                                                                        if (strM193586a2 != null) {
                                                                            matcher2 = pattern.matcher(strM193586a2);
                                                                            matcher3 = pattern2.matcher(strM193586a2);
                                                                            if (matcher2.matches()) {
                                                                                strGroup5 = matcher2.group(1);
                                                                                if (strGroup5 != null) {
                                                                                    throw r17;
                                                                                }
                                                                                f8 = Float.parseFloat(strGroup5) / 100.0f;
                                                                                strGroup6 = matcher2.group(2);
                                                                                if (strGroup6 != null) {
                                                                                    throw r17;
                                                                                }
                                                                                f4 = Float.parseFloat(strGroup6) / 100.0f;
                                                                                f5 = f8;
                                                                                f6 = f4;
                                                                                strM193586a3 = ugw0.m193586a(xmlPullParserNewPullParser, "displayAlign");
                                                                                if (strM193586a3 != null) {
                                                                                    strM174257a2 = qew0.m174257a(strM193586a3);
                                                                                    iHashCode2 = strM174257a2.hashCode();
                                                                                    if (iHashCode2 != -1364013995) {
                                                                                        if (iHashCode2 != 92734940) {
                                                                                            i7 = 0;
                                                                                            f7 = f2;
                                                                                        } else {
                                                                                            f7 = f2 + f6;
                                                                                            i7 = 2;
                                                                                        }
                                                                                    } else if (strM174257a2.equals("center")) {
                                                                                        f7 = f2 + (f6 / 2.0f);
                                                                                        i7 = 1;
                                                                                    } else {
                                                                                        i7 = 0;
                                                                                        f7 = f2;
                                                                                    }
                                                                                } else {
                                                                                    i7 = 0;
                                                                                    f7 = f2;
                                                                                }
                                                                                float f14 = 1.0f / i10;
                                                                                strM193586a4 = ugw0.m193586a(xmlPullParserNewPullParser, "writingMode");
                                                                                if (strM193586a4 != null) {
                                                                                    strM174257a = qew0.m174257a(strM193586a4);
                                                                                    iHashCode = strM174257a.hashCode();
                                                                                    if (iHashCode != 3694) {
                                                                                        if (iHashCode != 3553396) {
                                                                                            if (iHashCode == 3553576) {
                                                                                                i8 = 1;
                                                                                            }
                                                                                        } else if (strM174257a.equals("tblr")) {
                                                                                            i8 = 2;
                                                                                        }
                                                                                        i8 = Integer.MIN_VALUE;
                                                                                    } else if (strM174257a.equals("tb")) {
                                                                                        i8 = 2;
                                                                                    } else {
                                                                                        i8 = Integer.MIN_VALUE;
                                                                                    }
                                                                                } else {
                                                                                    i8 = Integer.MIN_VALUE;
                                                                                }
                                                                                chr0Var = new chr0(strM193586a7, f3, f7, 0, i7, f5, f6, 1, f14, i8);
                                                                            } else if (matcher3.matches()) {
                                                                                svv0.m186111f("TtmlParser", "Ignoring region with unsupported extent: ".concat(strM193586a8));
                                                                            } else if (r14 == 0) {
                                                                                svv0.m186111f("TtmlParser", "Ignoring region with missing tts:extent: ".concat(strM193586a8));
                                                                            } else {
                                                                                strGroup3 = matcher3.group(1);
                                                                                if (strGroup3 != null) {
                                                                                    throw r17;
                                                                                }
                                                                                i6 = Integer.parseInt(strGroup3);
                                                                                strGroup4 = matcher3.group(2);
                                                                                if (strGroup4 != null) {
                                                                                    throw r17;
                                                                                }
                                                                                int i110 = Integer.parseInt(strGroup4);
                                                                                float f15 = i6 / r14.f69684a;
                                                                                f4 = i110 / r14.f69685b;
                                                                                f5 = f15;
                                                                                f6 = f4;
                                                                                strM193586a3 = ugw0.m193586a(xmlPullParserNewPullParser, "displayAlign");
                                                                                if (strM193586a3 != null) {
                                                                                    strM174257a2 = qew0.m174257a(strM193586a3);
                                                                                    iHashCode2 = strM174257a2.hashCode();
                                                                                    if (iHashCode2 != -1364013995) {
                                                                                        if (iHashCode2 != 92734940) {
                                                                                            i7 = 0;
                                                                                            f7 = f2;
                                                                                        } else {
                                                                                            f7 = f2 + f6;
                                                                                            i7 = 2;
                                                                                        }
                                                                                    } else if (strM174257a2.equals("center")) {
                                                                                        f7 = f2 + (f6 / 2.0f);
                                                                                        i7 = 1;
                                                                                    } else {
                                                                                        i7 = 0;
                                                                                        f7 = f2;
                                                                                    }
                                                                                } else {
                                                                                    i7 = 0;
                                                                                    f7 = f2;
                                                                                }
                                                                                float f16 = 1.0f / i10;
                                                                                strM193586a4 = ugw0.m193586a(xmlPullParserNewPullParser, "writingMode");
                                                                                if (strM193586a4 != null) {
                                                                                    strM174257a = qew0.m174257a(strM193586a4);
                                                                                    iHashCode = strM174257a.hashCode();
                                                                                    if (iHashCode != 3694) {
                                                                                        if (iHashCode != 3553396) {
                                                                                            if (iHashCode == 3553576) {
                                                                                                i8 = 1;
                                                                                            }
                                                                                        } else if (strM174257a.equals("tblr")) {
                                                                                            i8 = 2;
                                                                                        }
                                                                                        i8 = Integer.MIN_VALUE;
                                                                                    } else if (strM174257a.equals("tb")) {
                                                                                        i8 = 2;
                                                                                    } else {
                                                                                        i8 = Integer.MIN_VALUE;
                                                                                    }
                                                                                } else {
                                                                                    i8 = Integer.MIN_VALUE;
                                                                                }
                                                                                chr0Var = new chr0(strM193586a7, f3, f7, 0, i7, f5, f6, 1, f16, i8);
                                                                            }
                                                                            if (chr0Var != 0) {
                                                                                map6.put(chr0Var.f80997a, chr0Var);
                                                                            }
                                                                        } else {
                                                                            svv0.m186111f("TtmlParser", "Ignoring region without an extent");
                                                                        }
                                                                    } catch (NumberFormatException unused9) {
                                                                        svv0.m186111f("TtmlParser", "Ignoring region with malformed origin: ".concat(strM193586a8));
                                                                    }
                                                                }
                                                            }
                                                        } else {
                                                            str3 = str7;
                                                            map3 = map5;
                                                            map4 = map7;
                                                            str4 = str8;
                                                            svv0.m186111f("TtmlParser", "Ignoring region without an origin");
                                                        }
                                                    }
                                                    chr0Var = r17;
                                                    if (chr0Var != 0) {
                                                        map6.put(chr0Var.f80997a, chr0Var);
                                                    }
                                                } else if (ugw0.m193588c(xmlPullParserNewPullParser, str8)) {
                                                    do {
                                                        xmlPullParserNewPullParser.next();
                                                        if (ugw0.m193588c(xmlPullParserNewPullParser, str7) && (strM193586a5 = ugw0.m193586a(xmlPullParserNewPullParser, "id")) != null) {
                                                            map7.put(strM193586a5, xmlPullParserNewPullParser.nextText());
                                                        }
                                                    } while (!ugw0.m193587b(xmlPullParserNewPullParser, str8));
                                                }
                                                if (ugw0.m193587b(xmlPullParserNewPullParser, "head")) {
                                                    zgr0Var4 = zgr0Var3;
                                                    arrayDeque = arrayDeque2;
                                                } else {
                                                    str9 = str9;
                                                    zgr0Var3 = zgr0Var3;
                                                    str7 = str3;
                                                    str8 = str4;
                                                    map5 = map3;
                                                    map7 = map4;
                                                }
                                            }
                                            str3 = str7;
                                            map3 = map5;
                                            map4 = map7;
                                            str4 = str8;
                                            if (ugw0.m193587b(xmlPullParserNewPullParser, "head")) {
                                                zgr0Var4 = zgr0Var3;
                                                arrayDeque = arrayDeque2;
                                            } else {
                                                str9 = str9;
                                                zgr0Var3 = zgr0Var3;
                                                str7 = str3;
                                                str8 = str4;
                                                map5 = map3;
                                                map7 = map4;
                                            }
                                        }
                                    } else {
                                        zgr0 zgr0Var9 = zgr0Var3;
                                        map3 = map5;
                                        map4 = map7;
                                        Object obj2 = "style";
                                        try {
                                            int attributeCount = xmlPullParserNewPullParser.getAttributeCount();
                                            ehr0 ehr0VarM101919f2 = m101919f(xmlPullParserNewPullParser, r17);
                                            int i22 = 0;
                                            String str10 = str;
                                            long jM101916c = -9223372036854775807L;
                                            long jM101916c2 = -9223372036854775807L;
                                            long jM101916c3 = -9223372036854775807L;
                                            String[] strArr = null;
                                            String strSubstring = null;
                                            while (i22 < attributeCount) {
                                                String attributeName = xmlPullParserNewPullParser.getAttributeName(i22);
                                                String attributeValue6 = xmlPullParserNewPullParser.getAttributeValue(i22);
                                                switch (attributeName.hashCode()) {
                                                    case -934795532:
                                                        zgr0Var4 = zgr0Var9;
                                                        if (attributeName.equals("region") && map6.containsKey(attributeValue6)) {
                                                            str10 = attributeValue6;
                                                        }
                                                        try {
                                                            i22++;
                                                            zgr0Var9 = zgr0Var4;
                                                        } catch (zzakn e2) {
                                                            e = e2;
                                                            arrayDeque = arrayDeque2;
                                                            svv0.m186112g("TtmlParser", "Suppressing parser error", e);
                                                            zgr0Var5 = zgr0Var4;
                                                            map = map3;
                                                            map2 = map4;
                                                            i9 = 1;
                                                            xmlPullParserNewPullParser.next();
                                                            eventType = xmlPullParserNewPullParser.getEventType();
                                                            map5 = map;
                                                            map7 = map2;
                                                            arrayDeque2 = arrayDeque;
                                                            str5 = str;
                                                            str6 = str2;
                                                            obj = null;
                                                            r14 = r14;
                                                        }
                                                        break;
                                                    case 99841:
                                                        zgr0Var4 = zgr0Var9;
                                                        if (attributeName.equals("dur")) {
                                                            jM101916c3 = m101916c(attributeValue6, zgr0Var4);
                                                        }
                                                        i22++;
                                                        zgr0Var9 = zgr0Var4;
                                                        break;
                                                    case 100571:
                                                        zgr0Var4 = zgr0Var9;
                                                        if (attributeName.equals("end")) {
                                                            jM101916c = m101916c(attributeValue6, zgr0Var4);
                                                        }
                                                        i22++;
                                                        zgr0Var9 = zgr0Var4;
                                                        break;
                                                    case 93616297:
                                                        Object obj3 = obj2;
                                                        if (attributeName.equals("begin")) {
                                                            zgr0Var4 = zgr0Var9;
                                                            jM101916c2 = m101916c(attributeValue6, zgr0Var4);
                                                        } else {
                                                            zgr0Var4 = zgr0Var9;
                                                        }
                                                        obj2 = obj3;
                                                        i22++;
                                                        zgr0Var9 = zgr0Var4;
                                                        break;
                                                    case 109780401:
                                                        Object obj4 = obj2;
                                                        if (attributeName.equals(obj4)) {
                                                            String[] strArrM101920g2 = m101920g(attributeValue6);
                                                            if (strArrM101920g2.length > 0) {
                                                                obj2 = obj4;
                                                                strArr = strArrM101920g2;
                                                            } else {
                                                                obj2 = obj4;
                                                            }
                                                        } else {
                                                            obj2 = obj4;
                                                        }
                                                        zgr0Var4 = zgr0Var9;
                                                        i22++;
                                                        zgr0Var9 = zgr0Var4;
                                                        break;
                                                    case 1292595405:
                                                        if (attributeName.equals("backgroundImage")) {
                                                            try {
                                                                if (attributeValue6.startsWith("#")) {
                                                                    strSubstring = attributeValue6.substring(1);
                                                                }
                                                            } catch (zzakn e3) {
                                                                e = e3;
                                                                zgr0Var4 = zgr0Var9;
                                                                arrayDeque = arrayDeque2;
                                                                svv0.m186112g("TtmlParser", "Suppressing parser error", e);
                                                                zgr0Var5 = zgr0Var4;
                                                                map = map3;
                                                                map2 = map4;
                                                                i9 = 1;
                                                                xmlPullParserNewPullParser.next();
                                                                eventType = xmlPullParserNewPullParser.getEventType();
                                                                map5 = map;
                                                                map7 = map2;
                                                                arrayDeque2 = arrayDeque;
                                                                str5 = str;
                                                                str6 = str2;
                                                                obj = null;
                                                                r14 = r14;
                                                            }
                                                        }
                                                        zgr0Var4 = zgr0Var9;
                                                        i22++;
                                                        zgr0Var9 = zgr0Var4;
                                                        break;
                                                    default:
                                                        zgr0Var4 = zgr0Var9;
                                                        i22++;
                                                        zgr0Var9 = zgr0Var4;
                                                        break;
                                                }
                                            }
                                            zgr0Var4 = zgr0Var9;
                                            if (ygr0Var != null) {
                                                ygr0Var2 = ygr0Var;
                                                long j2 = ygr0Var2.f198227d;
                                                if (j2 == -9223372036854775807L) {
                                                    ygr0Var3 = ygr0Var2;
                                                } else {
                                                    jM101916c2 = jM101916c2 != -9223372036854775807L ? jM101916c2 + j2 : -9223372036854775807L;
                                                    if (jM101916c != -9223372036854775807L) {
                                                        jM101916c += j2;
                                                        ygr0Var3 = ygr0Var2;
                                                    } else {
                                                        ygr0Var3 = ygr0Var2;
                                                        jM101916c = -9223372036854775807L;
                                                    }
                                                }
                                            } else {
                                                ygr0Var2 = ygr0Var;
                                                ygr0Var3 = null;
                                            }
                                            if (jM101916c != -9223372036854775807L) {
                                                j = jM101916c;
                                            } else {
                                                if (jM101916c3 != -9223372036854775807L) {
                                                    jM101916c = jM101916c2 + jM101916c3;
                                                } else {
                                                    if (ygr0Var3 != null) {
                                                        jM101916c = ygr0Var3.f198228e;
                                                        if (jM101916c != -9223372036854775807L) {
                                                        }
                                                    }
                                                    j = -9223372036854775807L;
                                                }
                                                j = jM101916c;
                                            }
                                            ygr0 ygr0VarM214749b = ygr0.m214749b(xmlPullParserNewPullParser.getName(), jM101916c2, j, ehr0VarM101919f2, strArr, str10, strSubstring, ygr0Var3);
                                            arrayDeque = arrayDeque2;
                                            try {
                                                arrayDeque.push(ygr0VarM214749b);
                                                if (ygr0Var2 != null) {
                                                    ygr0Var2.m214755f(ygr0VarM214749b);
                                                }
                                            } catch (zzakn e4) {
                                                e = e4;
                                                svv0.m186112g("TtmlParser", "Suppressing parser error", e);
                                                zgr0Var5 = zgr0Var4;
                                                map = map3;
                                                map2 = map4;
                                                i9 = 1;
                                            }
                                        } catch (zzakn e5) {
                                            e = e5;
                                        }
                                    }
                                    zgr0Var5 = zgr0Var4;
                                    fhr0Var2 = fhr0Var2;
                                    i9 = i9;
                                    map = map3;
                                    map2 = map4;
                                } else {
                                    svv0.m186110e("TtmlParser", "Ignoring unsupported tag: " + xmlPullParserNewPullParser.getName());
                                    zgr0Var5 = zgr0Var3;
                                    map = map5;
                                    map2 = map7;
                                    arrayDeque = arrayDeque2;
                                }
                                i9 = 1;
                            } else {
                                str2 = str6;
                                HashMap map8 = map5;
                                HashMap map9 = map7;
                                arrayDeque = arrayDeque2;
                                zgr0Var = zgr0Var5;
                                fhr0Var = fhr0Var2;
                                i3 = i9;
                                if (eventType != 4) {
                                    if (eventType == 3) {
                                        if (xmlPullParserNewPullParser.getName().equals("tt")) {
                                            ygr0 ygr0Var5 = (ygr0) arrayDeque.peek();
                                            if (ygr0Var5 == null) {
                                                throw null;
                                            }
                                            map = map8;
                                            map2 = map9;
                                            fhr0Var2 = new fhr0(ygr0Var5, map, map6, map2);
                                        } else {
                                            map = map8;
                                            map2 = map9;
                                            fhr0Var2 = fhr0Var;
                                        }
                                        arrayDeque.pop();
                                        zgr0Var5 = zgr0Var;
                                    }
                                    i9 = i3;
                                } else {
                                    if (ygr0Var4 == null) {
                                        throw null;
                                    }
                                    ygr0Var4.m214755f(ygr0.m214750c(xmlPullParserNewPullParser.getText()));
                                }
                                map = map8;
                                map2 = map9;
                                zgr0Var5 = zgr0Var;
                                fhr0Var2 = fhr0Var;
                                i9 = i3;
                            }
                        } else {
                            str = str5;
                            str2 = str6;
                            map = map5;
                            map2 = map7;
                            arrayDeque = arrayDeque2;
                            zgr0Var = zgr0Var5;
                            fhr0Var = fhr0Var2;
                            i3 = i9;
                            if (eventType == 2) {
                                i9 = i3 + 1;
                            } else {
                                if (eventType == 3) {
                                    i9 = i3 - 1;
                                }
                                zgr0Var5 = zgr0Var;
                                fhr0Var2 = fhr0Var;
                                i9 = i3;
                            }
                            zgr0Var5 = zgr0Var;
                            fhr0Var2 = fhr0Var;
                        }
                        xmlPullParserNewPullParser.next();
                        eventType = xmlPullParserNewPullParser.getEventType();
                        map5 = map;
                        map7 = map2;
                        arrayDeque2 = arrayDeque;
                        str5 = str;
                        str6 = str2;
                        obj = null;
                        r14 = r14;
                    }
                    fhr0 fhr0Var3 = fhr0Var2;
                    if (fhr0Var3 != null) {
                        return fhr0Var3;
                    }
                    throw null;
                } catch (XmlPullParserException e6) {
                    e = e6;
                    r16 = 0;
                }
            } catch (IOException e7) {
                byv.m104511a("Unexpected error when reading input.", e7);
                return null;
            }
        } catch (XmlPullParserException e8) {
            e = e8;
            r16 = 0;
        }
    }
}
