package p153l;

import android.text.Layout;
import androidx.annotation.Nullable;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.clevertap.android.sdk.Constants;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.google.android.gms.internal.ads.zzakn;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.p051p1.mobile.putong.data.OMSFontStyle;
import com.p051p1.mobile.putong.data.OMSSwipeMoment;
import com.p051p1.mobile.putong.live.base.data.BLiveGiftBubblePopupTitlePosition;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
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
public final class hqr0 implements xor0 {

    /* JADX INFO: renamed from: b */
    public static final Pattern f111165b = Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");

    /* JADX INFO: renamed from: c */
    public static final Pattern f111166c = Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");

    /* JADX INFO: renamed from: d */
    public static final Pattern f111167d = Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");

    /* JADX INFO: renamed from: e */
    public static final Pattern f111168e = Pattern.compile("^([-+]?\\d+\\.?\\d*?)%$");

    /* JADX INFO: renamed from: f */
    public static final Pattern f111169f = Pattern.compile("^(\\d+\\.?\\d*?)% (\\d+\\.?\\d*?)%$");

    /* JADX INFO: renamed from: g */
    public static final Pattern f111170g = Pattern.compile("^(\\d+\\.?\\d*?)px (\\d+\\.?\\d*?)px$");

    /* JADX INFO: renamed from: h */
    public static final Pattern f111171h = Pattern.compile("^(\\d+) (\\d+)$");

    /* JADX INFO: renamed from: i */
    public static final fqr0 f111172i = new fqr0(30.0f, 1, 1);

    /* JADX INFO: renamed from: a */
    public final XmlPullParserFactory f111173a;

    public hqr0() {
        try {
            XmlPullParserFactory xmlPullParserFactoryNewInstance = XmlPullParserFactory.newInstance();
            this.f111173a = xmlPullParserFactoryNewInstance;
            xmlPullParserFactoryNewInstance.setNamespaceAware(true);
        } catch (XmlPullParserException e) {
            vtq0.m202761a("Couldn't create XmlPullParserFactory instance", e);
            throw null;
        }
    }

    /* JADX INFO: renamed from: c */
    public static long m136687c(String str, fqr0 fqr0Var) throws zzakn {
        double d;
        double d2;
        Matcher matcher = f111165b.matcher(str);
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
            double d8 = strGroup5 != null ? Long.parseLong(strGroup5) / fqr0Var.f100334a : 0.0d;
            double d9 = d7 + d6;
            String strGroup6 = matcher.group(6);
            if (strGroup6 != null) {
                d5 = (Long.parseLong(strGroup6) / ((double) fqr0Var.f100335b)) / ((double) fqr0Var.f100334a);
            }
            return (long) ((d9 + d8 + d5) * 1000000.0d);
        }
        Matcher matcher2 = f111166c.matcher(str);
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
                            strGroup8.equals(BLiveStormDanmakuGiftResourceType.f45294s);
                        } else if (iHashCode == 116 && strGroup8.equals(Constants.KEY_T)) {
                            d = fqr0Var.f100336c;
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
            d = fqr0Var.f100334a;
            d10 /= d;
        }
        return (long) (d10 * 1000000.0d);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Nullable
    /* JADX INFO: renamed from: d */
    public static Layout.Alignment m136688d(String str) {
        String strM207228a = wnw0.m207228a(str);
        switch (strM207228a.hashCode()) {
            case -1364013995:
                if (strM207228a.equals("center")) {
                    return Layout.Alignment.ALIGN_CENTER;
                }
                return null;
            case 100571:
                if (!strM207228a.equals("end")) {
                    return null;
                }
                break;
            case 3317767:
                if (!strM207228a.equals(BLiveGiftBubblePopupTitlePosition.left)) {
                    return null;
                }
                return Layout.Alignment.ALIGN_NORMAL;
            case 108511772:
                if (!strM207228a.equals("right")) {
                    return null;
                }
                break;
            case 109757538:
                if (!strM207228a.equals("start")) {
                    return null;
                }
                return Layout.Alignment.ALIGN_NORMAL;
            default:
                return null;
        }
        return Layout.Alignment.ALIGN_OPPOSITE;
    }

    /* JADX INFO: renamed from: e */
    public static kqr0 m136689e(@Nullable kqr0 kqr0Var) {
        return kqr0Var == null ? new kqr0() : kqr0Var;
    }

    /* JADX WARN: Code duplicated, block: B:119:0x0270  */
    /* JADX WARN: Code duplicated, block: B:128:0x02a4  */
    /* JADX WARN: Code duplicated, block: B:180:0x0129 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:64:0x0120 A[Catch: zzakn -> 0x017b, TryCatch #1 {zzakn -> 0x017b, blocks: (B:34:0x00b3, B:36:0x00c3, B:39:0x00d9, B:42:0x00e1, B:44:0x00e7, B:53:0x00ff, B:62:0x011a, B:64:0x0120, B:65:0x0129, B:66:0x012a, B:67:0x0143, B:57:0x010b, B:61:0x0117, B:68:0x0144, B:69:0x0145, B:70:0x015e, B:38:0x00cc, B:71:0x015f, B:72:0x017a), top: B:167:0x00b3 }] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: f */
    public static kqr0 m136690f(XmlPullParser xmlPullParser, kqr0 kqr0Var) {
        Matcher matcher;
        String strGroup;
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            String attributeValue = xmlPullParser.getAttributeValue(i);
            String attributeName = xmlPullParser.getAttributeName(i);
            switch (attributeName.hashCode()) {
                case -1550943582:
                    if (attributeName.equals("fontStyle")) {
                        kqr0Var = m136689e(kqr0Var);
                        kqr0Var.m150929D(OMSFontStyle.italic.equalsIgnoreCase(attributeValue));
                    }
                    break;
                case -1224696685:
                    if (attributeName.equals("fontFamily")) {
                        kqr0Var = m136689e(kqr0Var);
                        kqr0Var.m150961z(attributeValue);
                    }
                    break;
                case -1065511464:
                    if (attributeName.equals("textAlign")) {
                        kqr0Var = m136689e(kqr0Var);
                        kqr0Var.m150935J(m136688d(attributeValue));
                    }
                    break;
                case -879295043:
                    if (!attributeName.equals("textDecoration")) {
                        break;
                    } else {
                        String strM207228a = wnw0.m207228a(attributeValue);
                        switch (strM207228a.hashCode()) {
                            case -1461280213:
                                if (strM207228a.equals("nounderline")) {
                                    kqr0Var = m136689e(kqr0Var);
                                    kqr0Var.m150938c(false);
                                }
                                break;
                            case -1026963764:
                                if (strM207228a.equals("underline")) {
                                    kqr0Var = m136689e(kqr0Var);
                                    kqr0Var.m150938c(true);
                                }
                                break;
                            case 913457136:
                                if (strM207228a.equals("nolinethrough")) {
                                    kqr0Var = m136689e(kqr0Var);
                                    kqr0Var.m150930E(false);
                                }
                                break;
                            case 1679736913:
                                if (strM207228a.equals("linethrough")) {
                                    kqr0Var = m136689e(kqr0Var);
                                    kqr0Var.m150930E(true);
                                }
                                break;
                        }
                    }
                    break;
                case -734428249:
                    if (attributeName.equals("fontWeight")) {
                        kqr0Var = m136689e(kqr0Var);
                        kqr0Var.m150959x(OMSFontStyle.bold.equalsIgnoreCase(attributeValue));
                    }
                    break;
                case 3355:
                    if (attributeName.equals("id") && "style".equals(xmlPullParser.getName())) {
                        kqr0Var = m136689e(kqr0Var);
                        kqr0Var.m150928C(attributeValue);
                    }
                    break;
                case 3511770:
                    if (!attributeName.equals("ruby")) {
                        break;
                    } else {
                        String strM207228a2 = wnw0.m207228a(attributeValue);
                        switch (strM207228a2.hashCode()) {
                            case -618561360:
                                if (strM207228a2.equals("baseContainer")) {
                                    kqr0Var = m136689e(kqr0Var);
                                    kqr0Var.m150933H(2);
                                }
                                break;
                            case -410956671:
                                if (strM207228a2.equals("container")) {
                                    kqr0Var = m136689e(kqr0Var);
                                    kqr0Var.m150933H(1);
                                }
                                break;
                            case -250518009:
                                if (strM207228a2.equals(RequestParameters.DELIMITER)) {
                                    kqr0Var = m136689e(kqr0Var);
                                    kqr0Var.m150933H(4);
                                }
                                break;
                            case -136074796:
                                if (strM207228a2.equals("textContainer")) {
                                    kqr0Var = m136689e(kqr0Var);
                                    kqr0Var.m150933H(3);
                                }
                                break;
                            case 3016401:
                                if (strM207228a2.equals("base")) {
                                    kqr0Var = m136689e(kqr0Var);
                                    kqr0Var.m150933H(2);
                                }
                                break;
                            case 3556653:
                                if (strM207228a2.equals("text")) {
                                    kqr0Var = m136689e(kqr0Var);
                                    kqr0Var.m150933H(3);
                                }
                                break;
                        }
                    }
                    break;
                case 94842723:
                    if (attributeName.equals("color")) {
                        kqr0Var = m136689e(kqr0Var);
                        try {
                            kqr0Var.m150960y(aiv0.m98158b(attributeValue));
                        } catch (IllegalArgumentException unused) {
                            y4w0.m214278f("TtmlParser", "Failed parsing color value: ".concat(String.valueOf(attributeValue)));
                        }
                    }
                    break;
                case 109403361:
                    if (attributeName.equals("shear")) {
                        kqr0Var = m136689e(kqr0Var);
                        Matcher matcher2 = f111168e.matcher(attributeValue);
                        float fMin = Float.MAX_VALUE;
                        if (matcher2.matches()) {
                            try {
                                String strGroup2 = matcher2.group(1);
                                if (strGroup2 == null) {
                                    throw null;
                                }
                                fMin = Math.min(100.0f, Math.max(-100.0f, Float.parseFloat(strGroup2)));
                            } catch (NumberFormatException e) {
                                y4w0.m214279g("TtmlParser", "Failed to parse shear: ".concat(String.valueOf(attributeValue)), e);
                            }
                        } else {
                            y4w0.m214278f("TtmlParser", "Invalid value for shear: ".concat(String.valueOf(attributeValue)));
                        }
                        kqr0Var.m150934I(fMin);
                    } else {
                        continue;
                    }
                    break;
                case 110138194:
                    if (attributeName.equals("textCombine")) {
                        String strM207228a3 = wnw0.m207228a(attributeValue);
                        int iHashCode = strM207228a3.hashCode();
                        if (iHashCode != 96673) {
                            if (iHashCode == 3387192 && strM207228a3.equals("none")) {
                                kqr0Var = m136689e(kqr0Var);
                                kqr0Var.m150936a(false);
                            }
                        } else if (strM207228a3.equals("all")) {
                            kqr0Var = m136689e(kqr0Var);
                            kqr0Var.m150936a(true);
                        }
                    }
                    break;
                case 365601008:
                    if (attributeName.equals("fontSize")) {
                        try {
                            kqr0Var = m136689e(kqr0Var);
                            int i2 = mpw0.f137957a;
                            String[] strArrSplit = attributeValue.split("\\s+", -1);
                            int length = strArrSplit.length;
                            if (length == 1) {
                                matcher = f111167d.matcher(attributeValue);
                            } else {
                                if (length != 2) {
                                    throw new zzakn("Invalid number of entries for fontSize: " + length + ".");
                                }
                                matcher = f111167d.matcher(strArrSplit[1]);
                                y4w0.m214278f("TtmlParser", "Multiple values in fontSize attribute. Picking the second value for vertical font size and ignoring the first.");
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
                                kqr0Var.m150927B(3);
                                strGroup = matcher.group(1);
                                if (strGroup == null) {
                                    throw null;
                                }
                                kqr0Var.m150926A(Float.parseFloat(strGroup));
                            } else if (iHashCode2 == 3240) {
                                if (!strGroup3.equals("em")) {
                                    throw new zzakn("Invalid unit for fontSize: '" + strGroup3 + "'.");
                                }
                                kqr0Var.m150927B(2);
                                strGroup = matcher.group(1);
                                if (strGroup == null) {
                                    throw null;
                                }
                                kqr0Var.m150926A(Float.parseFloat(strGroup));
                            } else {
                                if (iHashCode2 != 3592 || !strGroup3.equals("px")) {
                                    throw new zzakn("Invalid unit for fontSize: '" + strGroup3 + "'.");
                                }
                                kqr0Var.m150927B(1);
                                strGroup = matcher.group(1);
                                if (strGroup == null) {
                                    throw null;
                                }
                                kqr0Var.m150926A(Float.parseFloat(strGroup));
                            }
                        } catch (zzakn unused2) {
                            y4w0.m214278f("TtmlParser", "Failed parsing fontSize value: ".concat(String.valueOf(attributeValue)));
                        }
                    } else {
                        continue;
                    }
                    break;
                case 921125321:
                    if (attributeName.equals("textEmphasis")) {
                        kqr0Var = m136689e(kqr0Var);
                        kqr0Var.m150937b(dqr0.m117567a(attributeValue));
                    }
                    break;
                case 1115953443:
                    if (attributeName.equals("rubyPosition")) {
                        String strM207228a4 = wnw0.m207228a(attributeValue);
                        int iHashCode3 = strM207228a4.hashCode();
                        if (iHashCode3 != -1392885889) {
                            if (iHashCode3 == 92734940 && strM207228a4.equals(OMSSwipeMoment.after)) {
                                kqr0Var = m136689e(kqr0Var);
                                kqr0Var.m150932G(2);
                            }
                        } else if (strM207228a4.equals(OMSSwipeMoment.before)) {
                            kqr0Var = m136689e(kqr0Var);
                            kqr0Var.m150932G(1);
                        }
                    }
                    break;
                case 1287124693:
                    if (attributeName.equals("backgroundColor")) {
                        kqr0Var = m136689e(kqr0Var);
                        try {
                            kqr0Var.m150958w(aiv0.m98158b(attributeValue));
                        } catch (IllegalArgumentException unused3) {
                            y4w0.m214278f("TtmlParser", "Failed parsing background value: ".concat(String.valueOf(attributeValue)));
                        }
                    }
                    break;
                case 1754920356:
                    if (attributeName.equals("multiRowAlign")) {
                        kqr0Var = m136689e(kqr0Var);
                        kqr0Var.m150931F(m136688d(attributeValue));
                    }
                    break;
            }
        }
        return kqr0Var;
    }

    /* JADX INFO: renamed from: g */
    public static String[] m136691g(String str) {
        String strTrim = str.trim();
        if (strTrim.isEmpty()) {
            return new String[0];
        }
        int i = mpw0.f137957a;
        return strTrim.split("\\s+", -1);
    }

    @Override // p153l.xor0
    /* JADX INFO: renamed from: a */
    public final void mo105973a(byte[] bArr, int i, int i2, wor0 wor0Var, hkv0 hkv0Var) {
        sor0.m187275a(m136692b(bArr, i, i2), wor0Var, hkv0Var);
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
    /* JADX WARN: Type inference failed for: r0v85, types: [java.lang.Object, l.iqr0] */
    /* JADX WARN: Type inference failed for: r0v86 */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v13 */
    /* JADX WARN: Type inference failed for: r14v14 */
    /* JADX WARN: Type inference failed for: r14v15 */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v22, types: [l.gqr0] */
    /* JADX WARN: Type inference failed for: r14v23 */
    /* JADX WARN: Type inference failed for: r14v24 */
    /* JADX WARN: Type inference failed for: r14v25 */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v2, types: [l.tor0] */
    /* JADX WARN: Type inference failed for: r16v3 */
    /* JADX WARN: Type inference failed for: r16v7, types: [java.lang.Throwable, l.kqr0] */
    /* JADX WARN: Type inference failed for: r16v8 */
    /* JADX INFO: renamed from: b */
    public final tor0 m136692b(byte[] bArr, int i, int i2) {
        ?? r16;
        String str;
        String str2;
        HashMap map;
        HashMap map2;
        ArrayDeque arrayDeque;
        fqr0 fqr0Var;
        lqr0 lqr0Var;
        int i3;
        float f;
        eqr0 eqr0Var;
        fqr0 fqr0Var2;
        int i4;
        boolean z;
        String strM99558a;
        Matcher matcher;
        String strGroup;
        int i5;
        String strGroup2;
        ?? gqr0Var;
        fqr0 fqr0Var3;
        HashMap map3;
        HashMap map4;
        fqr0 fqr0Var4;
        eqr0 eqr0Var2;
        eqr0 eqr0Var3;
        long j;
        String str3;
        String str4;
        float f2;
        float f3;
        String strM99558a2;
        Matcher matcher2;
        Matcher matcher3;
        String strGroup3;
        int i6;
        String strGroup4;
        float f4;
        float f5;
        float f6;
        String strM99558a3;
        int i7;
        float f7;
        String strM99558a4;
        int i8;
        ?? iqr0Var;
        String strM207228a;
        int iHashCode;
        String strM207228a2;
        int iHashCode2;
        String strGroup5;
        float f8;
        String strGroup6;
        String strM99558a5;
        String str5 = "";
        String str6 = "http://www.w3.org/ns/ttml#parameter";
        Object obj = null;
        try {
            try {
                try {
                    XmlPullParser xmlPullParserNewPullParser = this.f111173a.newPullParser();
                    HashMap map5 = new HashMap();
                    HashMap map6 = new HashMap();
                    HashMap map7 = new HashMap();
                    map6.put("", new iqr0("", -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, -3.4028235E38f, Integer.MIN_VALUE));
                    xmlPullParserNewPullParser.setInput(new ByteArrayInputStream(bArr, i, i2), null);
                    ArrayDeque arrayDeque2 = new ArrayDeque();
                    int eventType = xmlPullParserNewPullParser.getEventType();
                    fqr0 fqr0Var5 = f111172i;
                    lqr0 lqr0Var2 = null;
                    ?? r14 = 0;
                    int i9 = 0;
                    int i10 = 15;
                    while (eventType != 1) {
                        eqr0 eqr0Var4 = (eqr0) arrayDeque2.peek();
                        ?? r17 = obj;
                        if (i9 == 0) {
                            String name = xmlPullParserNewPullParser.getName();
                            str = str5;
                            if (eventType == 2) {
                                fqr0 fqr0Var6 = fqr0Var5;
                                if ("tt".equals(name)) {
                                    try {
                                        String attributeValue = xmlPullParserNewPullParser.getAttributeValue(str6, "frameRate");
                                        int i11 = attributeValue != null ? Integer.parseInt(attributeValue) : 30;
                                        String attributeValue2 = xmlPullParserNewPullParser.getAttributeValue(str6, "frameRateMultiplier");
                                        if (attributeValue2 != null) {
                                            int i12 = mpw0.f137957a;
                                            String[] strArrSplit = attributeValue2.split(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR, -1);
                                            lev0.m153957e(strArrSplit.length == 2, "frameRateMultiplier doesn't have 2 parts");
                                            f = Integer.parseInt(strArrSplit[0]) / Integer.parseInt(strArrSplit[1]);
                                        } else {
                                            f = 1.0f;
                                        }
                                        fqr0 fqr0Var7 = f111172i;
                                        float f9 = f;
                                        int i13 = fqr0Var7.f100335b;
                                        String attributeValue3 = xmlPullParserNewPullParser.getAttributeValue(str6, "subFrameRate");
                                        int i14 = attributeValue3 != null ? Integer.parseInt(attributeValue3) : i13;
                                        int i15 = fqr0Var7.f100336c;
                                        String attributeValue4 = xmlPullParserNewPullParser.getAttributeValue(str6, "tickRate");
                                        if (attributeValue4 != null) {
                                            i15 = Integer.parseInt(attributeValue4);
                                        }
                                        fqr0 fqr0Var8 = new fqr0(i11 * f9, i14, i15);
                                        String attributeValue5 = xmlPullParserNewPullParser.getAttributeValue(str6, "cellResolution");
                                        if (attributeValue5 == null) {
                                            str2 = str6;
                                        } else {
                                            Matcher matcher4 = f111171h.matcher(attributeValue5);
                                            str2 = str6;
                                            if (matcher4.matches()) {
                                                try {
                                                    String strGroup7 = matcher4.group(1);
                                                    if (strGroup7 == null) {
                                                        throw r17;
                                                    }
                                                    int i16 = Integer.parseInt(strGroup7);
                                                    fqr0Var2 = fqr0Var8;
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
                                                            eqr0Var = eqr0Var4;
                                                            try {
                                                                sb.append("Invalid cell resolution ");
                                                                sb.append(i16);
                                                                sb.append(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
                                                                sb.append(i4);
                                                                lev0.m153957e(z, sb.toString());
                                                                i10 = i4;
                                                            } catch (NumberFormatException unused) {
                                                                y4w0.m214278f("TtmlParser", "Ignoring malformed cell resolution: ".concat(attributeValue5));
                                                                i10 = 15;
                                                            }
                                                        } catch (NumberFormatException unused2) {
                                                            eqr0Var = eqr0Var4;
                                                        }
                                                    } catch (NumberFormatException unused3) {
                                                        arrayDeque2 = arrayDeque2;
                                                    }
                                                    eqr0Var = eqr0Var4;
                                                } catch (NumberFormatException unused4) {
                                                    arrayDeque2 = arrayDeque2;
                                                    eqr0Var = eqr0Var4;
                                                    fqr0Var2 = fqr0Var8;
                                                }
                                                y4w0.m214278f("TtmlParser", "Ignoring malformed cell resolution: ".concat(attributeValue5));
                                                i10 = 15;
                                            } else {
                                                y4w0.m214278f("TtmlParser", "Ignoring malformed cell resolution: ".concat(attributeValue5));
                                            }
                                            strM99558a = aqw0.m99558a(xmlPullParserNewPullParser, "extent");
                                            if (strM99558a == null) {
                                                gqr0Var = r17;
                                            } else {
                                                matcher = f111170g.matcher(strM99558a);
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
                                                        gqr0Var = new gqr0(i5, Integer.parseInt(strGroup2));
                                                    } catch (NumberFormatException unused5) {
                                                        y4w0.m214278f("TtmlParser", "Ignoring malformed tts extent: ".concat(strM99558a));
                                                        gqr0Var = r17;
                                                    }
                                                } else {
                                                    y4w0.m214278f("TtmlParser", "Ignoring non-pixel tts extent: ".concat(strM99558a));
                                                }
                                                gqr0Var = r17;
                                            }
                                            fqr0Var3 = fqr0Var2;
                                            r14 = gqr0Var;
                                        }
                                        arrayDeque2 = arrayDeque2;
                                        eqr0Var = eqr0Var4;
                                        fqr0Var2 = fqr0Var8;
                                        i10 = 15;
                                        strM99558a = aqw0.m99558a(xmlPullParserNewPullParser, "extent");
                                        if (strM99558a == null) {
                                            gqr0Var = r17;
                                        } else {
                                            matcher = f111170g.matcher(strM99558a);
                                            if (matcher.matches()) {
                                                y4w0.m214278f("TtmlParser", "Ignoring non-pixel tts extent: ".concat(strM99558a));
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
                                                gqr0Var = new gqr0(i5, Integer.parseInt(strGroup2));
                                            }
                                            gqr0Var = r17;
                                        }
                                        fqr0Var3 = fqr0Var2;
                                        r14 = gqr0Var;
                                    } catch (XmlPullParserException e) {
                                        e = e;
                                        r16 = r17;
                                        yzv.m218057a("Unable to decode source", e);
                                        return r16;
                                    }
                                } else {
                                    str2 = str6;
                                    arrayDeque2 = arrayDeque2;
                                    eqr0Var = eqr0Var4;
                                    lqr0Var2 = lqr0Var2;
                                    fqr0Var3 = fqr0Var6;
                                    r14 = r14;
                                }
                                String str7 = "image";
                                String str8 = "metadata";
                                String str9 = "style";
                                if (name.equals("tt") || name.equals("head") || name.equals("body") || name.equals("div") || name.equals("p") || name.equals("span") || name.equals("br") || name.equals("style") || name.equals("styling") || name.equals("layout") || name.equals("region") || name.equals("metadata") || name.equals("image") || name.equals("data") || name.equals("information")) {
                                    if ("head".equals(name)) {
                                        while (true) {
                                            xmlPullParserNewPullParser.next();
                                            if (aqw0.m99560c(xmlPullParserNewPullParser, str9)) {
                                                String strM99558a6 = aqw0.m99558a(xmlPullParserNewPullParser, str9);
                                                kqr0 kqr0VarM136690f = m136690f(xmlPullParserNewPullParser, new kqr0());
                                                if (strM99558a6 != null) {
                                                    String[] strArrM136691g = m136691g(strM99558a6);
                                                    int i18 = 0;
                                                    for (int length = strArrM136691g.length; i18 < length; length = length) {
                                                        kqr0VarM136690f.m150957v((kqr0) map5.get(strArrM136691g[i18]));
                                                        i18++;
                                                    }
                                                }
                                                String strM150940e = kqr0VarM136690f.m150940e();
                                                if (strM150940e != null) {
                                                    map5.put(strM150940e, kqr0VarM136690f);
                                                }
                                            } else {
                                                fqr0Var3 = fqr0Var3;
                                                str9 = str9;
                                                if (aqw0.m99560c(xmlPullParserNewPullParser, "region")) {
                                                    String strM99558a7 = aqw0.m99558a(xmlPullParserNewPullParser, "id");
                                                    if (strM99558a7 == null) {
                                                        str3 = str7;
                                                        map3 = map5;
                                                        map4 = map7;
                                                        str4 = str8;
                                                    } else {
                                                        String strM99558a8 = aqw0.m99558a(xmlPullParserNewPullParser, "origin");
                                                        if (strM99558a8 != null) {
                                                            Pattern pattern = f111169f;
                                                            Matcher matcher5 = pattern.matcher(strM99558a8);
                                                            Pattern pattern2 = f111170g;
                                                            str3 = str7;
                                                            Matcher matcher6 = pattern2.matcher(strM99558a8);
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
                                                                    strM99558a2 = aqw0.m99558a(xmlPullParserNewPullParser, "extent");
                                                                    if (strM99558a2 != null) {
                                                                        matcher2 = pattern.matcher(strM99558a2);
                                                                        matcher3 = pattern2.matcher(strM99558a2);
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
                                                                                strM99558a3 = aqw0.m99558a(xmlPullParserNewPullParser, "displayAlign");
                                                                                if (strM99558a3 != null) {
                                                                                    strM207228a2 = wnw0.m207228a(strM99558a3);
                                                                                    iHashCode2 = strM207228a2.hashCode();
                                                                                    if (iHashCode2 != -1364013995) {
                                                                                        if (iHashCode2 != 92734940 && strM207228a2.equals(OMSSwipeMoment.after)) {
                                                                                            f7 = f2 + f6;
                                                                                            i7 = 2;
                                                                                        } else {
                                                                                            i7 = 0;
                                                                                            f7 = f2;
                                                                                        }
                                                                                    } else if (strM207228a2.equals("center")) {
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
                                                                                strM99558a4 = aqw0.m99558a(xmlPullParserNewPullParser, "writingMode");
                                                                                if (strM99558a4 != null) {
                                                                                    strM207228a = wnw0.m207228a(strM99558a4);
                                                                                    iHashCode = strM207228a.hashCode();
                                                                                    if (iHashCode != 3694) {
                                                                                        if (iHashCode != 3553396) {
                                                                                            if (iHashCode == 3553576 && strM207228a.equals("tbrl")) {
                                                                                                i8 = 1;
                                                                                            }
                                                                                        } else if (strM207228a.equals("tblr")) {
                                                                                            i8 = 2;
                                                                                        }
                                                                                        i8 = Integer.MIN_VALUE;
                                                                                    } else if (strM207228a.equals("tb")) {
                                                                                        i8 = 2;
                                                                                    } else {
                                                                                        i8 = Integer.MIN_VALUE;
                                                                                    }
                                                                                } else {
                                                                                    i8 = Integer.MIN_VALUE;
                                                                                }
                                                                                iqr0Var = new iqr0(strM99558a7, f3, f7, 0, i7, f5, f6, 1, f10, i8);
                                                                            } catch (NumberFormatException unused6) {
                                                                                y4w0.m214278f("TtmlParser", "Ignoring region with malformed extent: ".concat(strM99558a8));
                                                                                iqr0Var = r17;
                                                                            }
                                                                        } else if (matcher3.matches()) {
                                                                            y4w0.m214278f("TtmlParser", "Ignoring region with unsupported extent: ".concat(strM99558a8));
                                                                        } else if (r14 == 0) {
                                                                            y4w0.m214278f("TtmlParser", "Ignoring region with missing tts:extent: ".concat(strM99558a8));
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
                                                                                float f11 = i6 / r14.f105723a;
                                                                                f4 = i19 / r14.f105724b;
                                                                                f5 = f11;
                                                                                f6 = f4;
                                                                                strM99558a3 = aqw0.m99558a(xmlPullParserNewPullParser, "displayAlign");
                                                                                if (strM99558a3 != null) {
                                                                                    strM207228a2 = wnw0.m207228a(strM99558a3);
                                                                                    iHashCode2 = strM207228a2.hashCode();
                                                                                    if (iHashCode2 != -1364013995) {
                                                                                        if (iHashCode2 != 92734940) {
                                                                                            i7 = 0;
                                                                                            f7 = f2;
                                                                                        } else {
                                                                                            f7 = f2 + f6;
                                                                                            i7 = 2;
                                                                                        }
                                                                                    } else if (strM207228a2.equals("center")) {
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
                                                                                strM99558a4 = aqw0.m99558a(xmlPullParserNewPullParser, "writingMode");
                                                                                if (strM99558a4 != null) {
                                                                                    strM207228a = wnw0.m207228a(strM99558a4);
                                                                                    iHashCode = strM207228a.hashCode();
                                                                                    if (iHashCode != 3694) {
                                                                                        if (iHashCode != 3553396) {
                                                                                            if (iHashCode == 3553576) {
                                                                                                i8 = 1;
                                                                                            }
                                                                                        } else if (strM207228a.equals("tblr")) {
                                                                                            i8 = 2;
                                                                                        }
                                                                                        i8 = Integer.MIN_VALUE;
                                                                                    } else if (strM207228a.equals("tb")) {
                                                                                        i8 = 2;
                                                                                    } else {
                                                                                        i8 = Integer.MIN_VALUE;
                                                                                    }
                                                                                } else {
                                                                                    i8 = Integer.MIN_VALUE;
                                                                                }
                                                                                iqr0Var = new iqr0(strM99558a7, f3, f7, 0, i7, f5, f6, 1, f12, i8);
                                                                            } catch (NumberFormatException unused7) {
                                                                                y4w0.m214278f("TtmlParser", "Ignoring region with malformed extent: ".concat(strM99558a8));
                                                                                iqr0Var = r17;
                                                                            }
                                                                        }
                                                                        if (iqr0Var != 0) {
                                                                            map6.put(iqr0Var.f116450a, iqr0Var);
                                                                        }
                                                                    } else {
                                                                        y4w0.m214278f("TtmlParser", "Ignoring region without an extent");
                                                                    }
                                                                } catch (NumberFormatException unused8) {
                                                                    y4w0.m214278f("TtmlParser", "Ignoring region with malformed origin: ".concat(strM99558a8));
                                                                }
                                                            } else {
                                                                map4 = map7;
                                                                if (!matcher6.matches()) {
                                                                    y4w0.m214278f("TtmlParser", "Ignoring region with unsupported origin: ".concat(strM99558a8));
                                                                } else if (r14 == 0) {
                                                                    y4w0.m214278f("TtmlParser", "Ignoring region with missing tts:extent: ".concat(strM99558a8));
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
                                                                        float f13 = i20 / r14.f105723a;
                                                                        f2 = i21 / r14.f105724b;
                                                                        f3 = f13;
                                                                        strM99558a2 = aqw0.m99558a(xmlPullParserNewPullParser, "extent");
                                                                        if (strM99558a2 != null) {
                                                                            matcher2 = pattern.matcher(strM99558a2);
                                                                            matcher3 = pattern2.matcher(strM99558a2);
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
                                                                                strM99558a3 = aqw0.m99558a(xmlPullParserNewPullParser, "displayAlign");
                                                                                if (strM99558a3 != null) {
                                                                                    strM207228a2 = wnw0.m207228a(strM99558a3);
                                                                                    iHashCode2 = strM207228a2.hashCode();
                                                                                    if (iHashCode2 != -1364013995) {
                                                                                        if (iHashCode2 != 92734940) {
                                                                                            i7 = 0;
                                                                                            f7 = f2;
                                                                                        } else {
                                                                                            f7 = f2 + f6;
                                                                                            i7 = 2;
                                                                                        }
                                                                                    } else if (strM207228a2.equals("center")) {
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
                                                                                strM99558a4 = aqw0.m99558a(xmlPullParserNewPullParser, "writingMode");
                                                                                if (strM99558a4 != null) {
                                                                                    strM207228a = wnw0.m207228a(strM99558a4);
                                                                                    iHashCode = strM207228a.hashCode();
                                                                                    if (iHashCode != 3694) {
                                                                                        if (iHashCode != 3553396) {
                                                                                            if (iHashCode == 3553576) {
                                                                                                i8 = 1;
                                                                                            }
                                                                                        } else if (strM207228a.equals("tblr")) {
                                                                                            i8 = 2;
                                                                                        }
                                                                                        i8 = Integer.MIN_VALUE;
                                                                                    } else if (strM207228a.equals("tb")) {
                                                                                        i8 = 2;
                                                                                    } else {
                                                                                        i8 = Integer.MIN_VALUE;
                                                                                    }
                                                                                } else {
                                                                                    i8 = Integer.MIN_VALUE;
                                                                                }
                                                                                iqr0Var = new iqr0(strM99558a7, f3, f7, 0, i7, f5, f6, 1, f14, i8);
                                                                            } else if (matcher3.matches()) {
                                                                                y4w0.m214278f("TtmlParser", "Ignoring region with unsupported extent: ".concat(strM99558a8));
                                                                            } else if (r14 == 0) {
                                                                                y4w0.m214278f("TtmlParser", "Ignoring region with missing tts:extent: ".concat(strM99558a8));
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
                                                                                float f15 = i6 / r14.f105723a;
                                                                                f4 = i110 / r14.f105724b;
                                                                                f5 = f15;
                                                                                f6 = f4;
                                                                                strM99558a3 = aqw0.m99558a(xmlPullParserNewPullParser, "displayAlign");
                                                                                if (strM99558a3 != null) {
                                                                                    strM207228a2 = wnw0.m207228a(strM99558a3);
                                                                                    iHashCode2 = strM207228a2.hashCode();
                                                                                    if (iHashCode2 != -1364013995) {
                                                                                        if (iHashCode2 != 92734940) {
                                                                                            i7 = 0;
                                                                                            f7 = f2;
                                                                                        } else {
                                                                                            f7 = f2 + f6;
                                                                                            i7 = 2;
                                                                                        }
                                                                                    } else if (strM207228a2.equals("center")) {
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
                                                                                strM99558a4 = aqw0.m99558a(xmlPullParserNewPullParser, "writingMode");
                                                                                if (strM99558a4 != null) {
                                                                                    strM207228a = wnw0.m207228a(strM99558a4);
                                                                                    iHashCode = strM207228a.hashCode();
                                                                                    if (iHashCode != 3694) {
                                                                                        if (iHashCode != 3553396) {
                                                                                            if (iHashCode == 3553576) {
                                                                                                i8 = 1;
                                                                                            }
                                                                                        } else if (strM207228a.equals("tblr")) {
                                                                                            i8 = 2;
                                                                                        }
                                                                                        i8 = Integer.MIN_VALUE;
                                                                                    } else if (strM207228a.equals("tb")) {
                                                                                        i8 = 2;
                                                                                    } else {
                                                                                        i8 = Integer.MIN_VALUE;
                                                                                    }
                                                                                } else {
                                                                                    i8 = Integer.MIN_VALUE;
                                                                                }
                                                                                iqr0Var = new iqr0(strM99558a7, f3, f7, 0, i7, f5, f6, 1, f16, i8);
                                                                            }
                                                                            if (iqr0Var != 0) {
                                                                                map6.put(iqr0Var.f116450a, iqr0Var);
                                                                            }
                                                                        } else {
                                                                            y4w0.m214278f("TtmlParser", "Ignoring region without an extent");
                                                                        }
                                                                    } catch (NumberFormatException unused9) {
                                                                        y4w0.m214278f("TtmlParser", "Ignoring region with malformed origin: ".concat(strM99558a8));
                                                                    }
                                                                }
                                                            }
                                                        } else {
                                                            str3 = str7;
                                                            map3 = map5;
                                                            map4 = map7;
                                                            str4 = str8;
                                                            y4w0.m214278f("TtmlParser", "Ignoring region without an origin");
                                                        }
                                                    }
                                                    iqr0Var = r17;
                                                    if (iqr0Var != 0) {
                                                        map6.put(iqr0Var.f116450a, iqr0Var);
                                                    }
                                                } else if (aqw0.m99560c(xmlPullParserNewPullParser, str8)) {
                                                    do {
                                                        xmlPullParserNewPullParser.next();
                                                        if (aqw0.m99560c(xmlPullParserNewPullParser, str7) && (strM99558a5 = aqw0.m99558a(xmlPullParserNewPullParser, "id")) != null) {
                                                            map7.put(strM99558a5, xmlPullParserNewPullParser.nextText());
                                                        }
                                                    } while (!aqw0.m99559b(xmlPullParserNewPullParser, str8));
                                                }
                                                if (aqw0.m99559b(xmlPullParserNewPullParser, "head")) {
                                                    fqr0Var4 = fqr0Var3;
                                                    arrayDeque = arrayDeque2;
                                                } else {
                                                    str9 = str9;
                                                    fqr0Var3 = fqr0Var3;
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
                                            if (aqw0.m99559b(xmlPullParserNewPullParser, "head")) {
                                                fqr0Var4 = fqr0Var3;
                                                arrayDeque = arrayDeque2;
                                            } else {
                                                str9 = str9;
                                                fqr0Var3 = fqr0Var3;
                                                str7 = str3;
                                                str8 = str4;
                                                map5 = map3;
                                                map7 = map4;
                                            }
                                        }
                                    } else {
                                        fqr0 fqr0Var9 = fqr0Var3;
                                        map3 = map5;
                                        map4 = map7;
                                        Object obj2 = "style";
                                        try {
                                            int attributeCount = xmlPullParserNewPullParser.getAttributeCount();
                                            kqr0 kqr0VarM136690f2 = m136690f(xmlPullParserNewPullParser, r17);
                                            int i22 = 0;
                                            String str10 = str;
                                            long jM136687c = -9223372036854775807L;
                                            long jM136687c2 = -9223372036854775807L;
                                            long jM136687c3 = -9223372036854775807L;
                                            String[] strArr = null;
                                            String strSubstring = null;
                                            while (i22 < attributeCount) {
                                                String attributeName = xmlPullParserNewPullParser.getAttributeName(i22);
                                                String attributeValue6 = xmlPullParserNewPullParser.getAttributeValue(i22);
                                                switch (attributeName.hashCode()) {
                                                    case -934795532:
                                                        fqr0Var4 = fqr0Var9;
                                                        if (attributeName.equals("region") && map6.containsKey(attributeValue6)) {
                                                            str10 = attributeValue6;
                                                        }
                                                        try {
                                                            i22++;
                                                            fqr0Var9 = fqr0Var4;
                                                        } catch (zzakn e2) {
                                                            e = e2;
                                                            arrayDeque = arrayDeque2;
                                                            y4w0.m214279g("TtmlParser", "Suppressing parser error", e);
                                                            fqr0Var5 = fqr0Var4;
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
                                                        fqr0Var4 = fqr0Var9;
                                                        if (attributeName.equals("dur")) {
                                                            jM136687c3 = m136687c(attributeValue6, fqr0Var4);
                                                        }
                                                        i22++;
                                                        fqr0Var9 = fqr0Var4;
                                                        break;
                                                    case 100571:
                                                        fqr0Var4 = fqr0Var9;
                                                        if (attributeName.equals("end")) {
                                                            jM136687c = m136687c(attributeValue6, fqr0Var4);
                                                        }
                                                        i22++;
                                                        fqr0Var9 = fqr0Var4;
                                                        break;
                                                    case 93616297:
                                                        Object obj3 = obj2;
                                                        if (attributeName.equals("begin")) {
                                                            fqr0Var4 = fqr0Var9;
                                                            jM136687c2 = m136687c(attributeValue6, fqr0Var4);
                                                        } else {
                                                            fqr0Var4 = fqr0Var9;
                                                        }
                                                        obj2 = obj3;
                                                        i22++;
                                                        fqr0Var9 = fqr0Var4;
                                                        break;
                                                    case 109780401:
                                                        Object obj4 = obj2;
                                                        if (attributeName.equals(obj4)) {
                                                            String[] strArrM136691g2 = m136691g(attributeValue6);
                                                            if (strArrM136691g2.length > 0) {
                                                                obj2 = obj4;
                                                                strArr = strArrM136691g2;
                                                            } else {
                                                                obj2 = obj4;
                                                            }
                                                        } else {
                                                            obj2 = obj4;
                                                        }
                                                        fqr0Var4 = fqr0Var9;
                                                        i22++;
                                                        fqr0Var9 = fqr0Var4;
                                                        break;
                                                    case 1292595405:
                                                        if (attributeName.equals("backgroundImage")) {
                                                            try {
                                                                if (attributeValue6.startsWith("#")) {
                                                                    strSubstring = attributeValue6.substring(1);
                                                                }
                                                            } catch (zzakn e3) {
                                                                e = e3;
                                                                fqr0Var4 = fqr0Var9;
                                                                arrayDeque = arrayDeque2;
                                                                y4w0.m214279g("TtmlParser", "Suppressing parser error", e);
                                                                fqr0Var5 = fqr0Var4;
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
                                                        fqr0Var4 = fqr0Var9;
                                                        i22++;
                                                        fqr0Var9 = fqr0Var4;
                                                        break;
                                                    default:
                                                        fqr0Var4 = fqr0Var9;
                                                        i22++;
                                                        fqr0Var9 = fqr0Var4;
                                                        break;
                                                }
                                            }
                                            fqr0Var4 = fqr0Var9;
                                            if (eqr0Var != null) {
                                                eqr0Var2 = eqr0Var;
                                                long j2 = eqr0Var2.f95379d;
                                                if (j2 == -9223372036854775807L) {
                                                    eqr0Var3 = eqr0Var2;
                                                } else {
                                                    jM136687c2 = jM136687c2 != -9223372036854775807L ? jM136687c2 + j2 : -9223372036854775807L;
                                                    if (jM136687c != -9223372036854775807L) {
                                                        jM136687c += j2;
                                                        eqr0Var3 = eqr0Var2;
                                                    } else {
                                                        eqr0Var3 = eqr0Var2;
                                                        jM136687c = -9223372036854775807L;
                                                    }
                                                }
                                            } else {
                                                eqr0Var2 = eqr0Var;
                                                eqr0Var3 = null;
                                            }
                                            if (jM136687c != -9223372036854775807L) {
                                                j = jM136687c;
                                            } else {
                                                if (jM136687c3 != -9223372036854775807L) {
                                                    jM136687c = jM136687c2 + jM136687c3;
                                                } else {
                                                    if (eqr0Var3 != null) {
                                                        jM136687c = eqr0Var3.f95380e;
                                                        if (jM136687c != -9223372036854775807L) {
                                                        }
                                                    }
                                                    j = -9223372036854775807L;
                                                }
                                                j = jM136687c;
                                            }
                                            eqr0 eqr0VarM122051b = eqr0.m122051b(xmlPullParserNewPullParser.getName(), jM136687c2, j, kqr0VarM136690f2, strArr, str10, strSubstring, eqr0Var3);
                                            arrayDeque = arrayDeque2;
                                            try {
                                                arrayDeque.push(eqr0VarM122051b);
                                                if (eqr0Var2 != null) {
                                                    eqr0Var2.m122057f(eqr0VarM122051b);
                                                }
                                            } catch (zzakn e4) {
                                                e = e4;
                                                y4w0.m214279g("TtmlParser", "Suppressing parser error", e);
                                                fqr0Var5 = fqr0Var4;
                                                map = map3;
                                                map2 = map4;
                                                i9 = 1;
                                            }
                                        } catch (zzakn e5) {
                                            e = e5;
                                        }
                                    }
                                    fqr0Var5 = fqr0Var4;
                                    lqr0Var2 = lqr0Var2;
                                    i9 = i9;
                                    map = map3;
                                    map2 = map4;
                                } else {
                                    y4w0.m214277e("TtmlParser", "Ignoring unsupported tag: " + xmlPullParserNewPullParser.getName());
                                    fqr0Var5 = fqr0Var3;
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
                                fqr0Var = fqr0Var5;
                                lqr0Var = lqr0Var2;
                                i3 = i9;
                                if (eventType != 4) {
                                    if (eventType == 3) {
                                        if (xmlPullParserNewPullParser.getName().equals("tt")) {
                                            eqr0 eqr0Var5 = (eqr0) arrayDeque.peek();
                                            if (eqr0Var5 == null) {
                                                throw null;
                                            }
                                            map = map8;
                                            map2 = map9;
                                            lqr0Var2 = new lqr0(eqr0Var5, map, map6, map2);
                                        } else {
                                            map = map8;
                                            map2 = map9;
                                            lqr0Var2 = lqr0Var;
                                        }
                                        arrayDeque.pop();
                                        fqr0Var5 = fqr0Var;
                                    }
                                    i9 = i3;
                                } else {
                                    if (eqr0Var4 == null) {
                                        throw null;
                                    }
                                    eqr0Var4.m122057f(eqr0.m122052c(xmlPullParserNewPullParser.getText()));
                                }
                                map = map8;
                                map2 = map9;
                                fqr0Var5 = fqr0Var;
                                lqr0Var2 = lqr0Var;
                                i9 = i3;
                            }
                        } else {
                            str = str5;
                            str2 = str6;
                            map = map5;
                            map2 = map7;
                            arrayDeque = arrayDeque2;
                            fqr0Var = fqr0Var5;
                            lqr0Var = lqr0Var2;
                            i3 = i9;
                            if (eventType == 2) {
                                i9 = i3 + 1;
                            } else {
                                if (eventType == 3) {
                                    i9 = i3 - 1;
                                }
                                fqr0Var5 = fqr0Var;
                                lqr0Var2 = lqr0Var;
                                i9 = i3;
                            }
                            fqr0Var5 = fqr0Var;
                            lqr0Var2 = lqr0Var;
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
                    lqr0 lqr0Var3 = lqr0Var2;
                    if (lqr0Var3 != null) {
                        return lqr0Var3;
                    }
                    throw null;
                } catch (XmlPullParserException e6) {
                    e = e6;
                    r16 = 0;
                }
            } catch (IOException e7) {
                yzv.m218057a("Unexpected error when reading input.", e7);
                return null;
            }
        } catch (XmlPullParserException e8) {
            e = e8;
            r16 = 0;
        }
    }
}
