package p153l;

import android.net.Uri;
import com.clevertap.android.sdk.Constants;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.source.rtsp.C2007h;
import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.putong.data.ResourceDirection;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.spongycastle.asn1.eac.EACTags;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class rse0 {

    /* JADX INFO: renamed from: a */
    public static final Pattern f164654a = Pattern.compile("([a-z])=\\s?(.+)");

    /* JADX INFO: renamed from: b */
    public static final Pattern f164655b = Pattern.compile("([\\x21\\x23-\\x27\\x2a\\x2b\\x2d\\x2e\\x30-\\x39\\x41-\\x5a\\x5e-\\x7e]+)(?::(.*))?");

    /* JADX INFO: renamed from: c */
    public static final Pattern f164656c = Pattern.compile("(\\S+)\\s(\\S+)\\s(\\S+)\\s(\\S+)");

    /* JADX INFO: renamed from: a */
    public static void m182952a(qse0.C19646b c19646b, ksx.C18253b c18253b) throws ParserException {
        try {
            c19646b.m177782n(c18253b.m151305j());
        } catch (IllegalArgumentException | IllegalStateException e) {
            throw ParserException.createForMalformedManifest(null, e);
        }
    }

    /* JADX INFO: renamed from: b */
    public static qse0 m182953b(String str) throws ParserException {
        String str2;
        qse0.C19646b c19646b = new qse0.C19646b();
        ksx.C18253b c18253bM182954c = null;
        for (String str3 : C2007h.m11721s(str)) {
            if (!"".equals(str3)) {
                Matcher matcher = f164654a.matcher(str3);
                if (!matcher.matches()) {
                    throw ParserException.createForMalformedManifest("Malformed SDP line: " + str3, null);
                }
                String str4 = (String) w11.m204369e(matcher.group(1));
                String str5 = (String) w11.m204369e(matcher.group(2));
                switch (str4.hashCode()) {
                    case EACTags.APPLICATION_TEMPLATE /* 97 */:
                        if (str4.equals("a")) {
                            Matcher matcher2 = f164655b.matcher(str5);
                            if (!matcher2.matches()) {
                                throw ParserException.createForMalformedManifest("Malformed Attribute line: " + str3, null);
                            }
                            String str6 = (String) w11.m204369e(matcher2.group(1));
                            String strM180206e = r8g0.m180206e(matcher2.group(2));
                            if (c18253bM182954c == null) {
                                c19646b.m177781m(str6, strM180206e);
                            } else {
                                c18253bM182954c.m151304i(str6, strM180206e);
                            }
                        } else {
                            continue;
                        }
                        break;
                    case EACTags.FCP_TEMPLATE /* 98 */:
                        if (str4.equals("b")) {
                            String[] strArrM105119a1 = bmk0.m105119a1(str5, ":\\s?");
                            w11.m204365a(strArrM105119a1.length == 2);
                            int i = Integer.parseInt(strArrM105119a1[1]);
                            if (c18253bM182954c == null) {
                                c19646b.m177784p(i * 1000);
                            } else {
                                c18253bM182954c.m151306m(i * 1000);
                            }
                        } else {
                            continue;
                        }
                        break;
                    case 99:
                        if (!str4.equals("c")) {
                            continue;
                        } else if (c18253bM182954c == null) {
                            c19646b.m177785q(str5);
                        } else {
                            c18253bM182954c.m151307n(str5);
                        }
                        break;
                    case 100:
                    case 102:
                    case 103:
                    case 104:
                    case 106:
                    case 108:
                    case 110:
                    case 113:
                    case 119:
                    case 120:
                    case 121:
                    default:
                        continue;
                    case 101:
                        if (str4.equals("e")) {
                            c19646b.m177786r(str5);
                        } else {
                            continue;
                        }
                        break;
                    case 105:
                        if (!str4.equals(RXScreenCaptureService.KEY_INDEX)) {
                            continue;
                        } else if (c18253bM182954c == null) {
                            c19646b.m177790v(str5);
                        } else {
                            c18253bM182954c.m151309p(str5);
                        }
                        break;
                    case 107:
                        if (!str4.equals("k")) {
                            continue;
                        } else if (c18253bM182954c == null) {
                            c19646b.m177787s(str5);
                        } else {
                            c18253bM182954c.m151308o(str5);
                        }
                        break;
                    case 109:
                        if (str4.equals("m")) {
                            if (c18253bM182954c != null) {
                                m182952a(c19646b, c18253bM182954c);
                            }
                            c18253bM182954c = m182954c(str5);
                        } else {
                            continue;
                        }
                        break;
                    case 111:
                        if (str4.equals("o")) {
                            c19646b.m177788t(str5);
                        } else {
                            continue;
                        }
                        break;
                    case 112:
                        if (str4.equals("p")) {
                            c19646b.m177789u(str5);
                        } else {
                            continue;
                        }
                        break;
                    case 114:
                        str2 = "r";
                        break;
                    case 115:
                        if (str4.equals(BLiveStormDanmakuGiftResourceType.f45294s)) {
                            c19646b.m177791w(str5);
                        } else {
                            continue;
                        }
                        break;
                    case 116:
                        if (str4.equals(Constants.KEY_T)) {
                            c19646b.m177792x(str5);
                        } else {
                            continue;
                        }
                        break;
                    case 117:
                        if (str4.equals("u")) {
                            c19646b.m177793y(Uri.parse(str5));
                        } else {
                            continue;
                        }
                        break;
                    case 118:
                        if (str4.equals(ResourceDirection.f39656v)) {
                            if (!"0".equals(str5)) {
                                throw ParserException.createForMalformedManifest(String.format("SDP version %s is not supported.", str5), null);
                            }
                        } else {
                            continue;
                        }
                        break;
                    case 122:
                        str2 = BaseSei.f14626Z;
                        break;
                }
                str4.equals(str2);
            }
        }
        if (c18253bM182954c != null) {
            m182952a(c19646b, c18253bM182954c);
        }
        try {
            return c19646b.m177783o();
        } catch (IllegalArgumentException | IllegalStateException e) {
            throw ParserException.createForMalformedManifest(null, e);
        }
    }

    /* JADX INFO: renamed from: c */
    public static ksx.C18253b m182954c(String str) throws ParserException {
        Matcher matcher = f164656c.matcher(str);
        if (!matcher.matches()) {
            throw ParserException.createForMalformedManifest("Malformed SDP media description line: " + str, null);
        }
        try {
            return new ksx.C18253b((String) w11.m204369e(matcher.group(1)), Integer.parseInt((String) w11.m204369e(matcher.group(2))), (String) w11.m204369e(matcher.group(3)), Integer.parseInt((String) w11.m204369e(matcher.group(4))));
        } catch (NumberFormatException e) {
            throw ParserException.createForMalformedManifest("Malformed SDP media description line: " + str, e);
        }
    }
}
