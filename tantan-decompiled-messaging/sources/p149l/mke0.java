package p149l;

import android.net.Uri;
import com.clevertap.android.sdk.Constants;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.source.rtsp.C1984h;
import com.immomo.momomediaext.sei.BaseSei;
import com.p046p1.mobile.putong.data.ResourceDirection;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.spongycastle.asn1.eac.EACTags;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class mke0 {

    /* JADX INFO: renamed from: a */
    public static final Pattern f134322a = Pattern.compile("([a-z])=\\s?(.+)");

    /* JADX INFO: renamed from: b */
    public static final Pattern f134323b = Pattern.compile("([\\x21\\x23-\\x27\\x2a\\x2b\\x2d\\x2e\\x30-\\x39\\x41-\\x5a\\x5e-\\x7e]+)(?::(.*))?");

    /* JADX INFO: renamed from: c */
    public static final Pattern f134324c = Pattern.compile("(\\S+)\\s(\\S+)\\s(\\S+)\\s(\\S+)");

    /* JADX INFO: renamed from: a */
    public static void m155000a(lke0.C18241b c18241b, njx.C18720b c18720b) throws ParserException {
        try {
            c18241b.m150206n(c18720b.m159809j());
        } catch (IllegalArgumentException | IllegalStateException e) {
            throw ParserException.createForMalformedManifest(null, e);
        }
    }

    /* JADX INFO: renamed from: b */
    public static lke0 m155001b(String str) throws ParserException {
        String str2;
        lke0.C18241b c18241b = new lke0.C18241b();
        njx.C18720b c18720bM155002c = null;
        for (String str3 : C1984h.m11667s(str)) {
            if (!"".equals(str3)) {
                Matcher matcher = f134322a.matcher(str3);
                if (!matcher.matches()) {
                    throw ParserException.createForMalformedManifest("Malformed SDP line: " + str3, null);
                }
                String str4 = (String) p11.m167011e(matcher.group(1));
                String str5 = (String) p11.m167011e(matcher.group(2));
                switch (str4.hashCode()) {
                    case EACTags.APPLICATION_TEMPLATE /* 97 */:
                        if (str4.equals("a")) {
                            Matcher matcher2 = f134323b.matcher(str5);
                            if (!matcher2.matches()) {
                                throw ParserException.createForMalformedManifest("Malformed Attribute line: " + str3, null);
                            }
                            String str6 = (String) p11.m167011e(matcher2.group(1));
                            String strM144051e = k0g0.m144051e(matcher2.group(2));
                            if (c18720bM155002c == null) {
                                c18241b.m150205m(str6, strM144051e);
                            } else {
                                c18720bM155002c.m159808i(str6, strM144051e);
                            }
                        } else {
                            continue;
                        }
                        break;
                    case EACTags.FCP_TEMPLATE /* 98 */:
                        if (str4.equals("b")) {
                            String[] strArrM197841a1 = vck0.m197841a1(str5, ":\\s?");
                            p11.m167007a(strArrM197841a1.length == 2);
                            int i = Integer.parseInt(strArrM197841a1[1]);
                            if (c18720bM155002c == null) {
                                c18241b.m150208p(i * 1000);
                            } else {
                                c18720bM155002c.m159810m(i * 1000);
                            }
                        } else {
                            continue;
                        }
                        break;
                    case 99:
                        if (!str4.equals("c")) {
                            continue;
                        } else if (c18720bM155002c == null) {
                            c18241b.m150209q(str5);
                        } else {
                            c18720bM155002c.m159811n(str5);
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
                            c18241b.m150210r(str5);
                        } else {
                            continue;
                        }
                        break;
                    case 105:
                        if (!str4.equals(RXScreenCaptureService.KEY_INDEX)) {
                            continue;
                        } else if (c18720bM155002c == null) {
                            c18241b.m150214v(str5);
                        } else {
                            c18720bM155002c.m159813p(str5);
                        }
                        break;
                    case 107:
                        if (!str4.equals("k")) {
                            continue;
                        } else if (c18720bM155002c == null) {
                            c18241b.m150211s(str5);
                        } else {
                            c18720bM155002c.m159812o(str5);
                        }
                        break;
                    case 109:
                        if (str4.equals("m")) {
                            if (c18720bM155002c != null) {
                                m155000a(c18241b, c18720bM155002c);
                            }
                            c18720bM155002c = m155002c(str5);
                        } else {
                            continue;
                        }
                        break;
                    case 111:
                        if (str4.equals("o")) {
                            c18241b.m150212t(str5);
                        } else {
                            continue;
                        }
                        break;
                    case 112:
                        if (str4.equals("p")) {
                            c18241b.m150213u(str5);
                        } else {
                            continue;
                        }
                        break;
                    case 114:
                        str2 = "r";
                        break;
                    case 115:
                        if (str4.equals(BLiveStormDanmakuGiftResourceType.f44446s)) {
                            c18241b.m150215w(str5);
                        } else {
                            continue;
                        }
                        break;
                    case 116:
                        if (str4.equals(Constants.KEY_T)) {
                            c18241b.m150216x(str5);
                        } else {
                            continue;
                        }
                        break;
                    case 117:
                        if (str4.equals("u")) {
                            c18241b.m150217y(Uri.parse(str5));
                        } else {
                            continue;
                        }
                        break;
                    case 118:
                        if (str4.equals(ResourceDirection.f38808v)) {
                            if (!"0".equals(str5)) {
                                throw ParserException.createForMalformedManifest(String.format("SDP version %s is not supported.", str5), null);
                            }
                        } else {
                            continue;
                        }
                        break;
                    case 122:
                        str2 = BaseSei.f13932Z;
                        break;
                }
                str4.equals(str2);
            }
        }
        if (c18720bM155002c != null) {
            m155000a(c18241b, c18720bM155002c);
        }
        try {
            return c18241b.m150207o();
        } catch (IllegalArgumentException | IllegalStateException e) {
            throw ParserException.createForMalformedManifest(null, e);
        }
    }

    /* JADX INFO: renamed from: c */
    public static njx.C18720b m155002c(String str) throws ParserException {
        Matcher matcher = f134324c.matcher(str);
        if (!matcher.matches()) {
            throw ParserException.createForMalformedManifest("Malformed SDP media description line: " + str, null);
        }
        try {
            return new njx.C18720b((String) p11.m167011e(matcher.group(1)), Integer.parseInt((String) p11.m167011e(matcher.group(2))), (String) p11.m167011e(matcher.group(3)), Integer.parseInt((String) p11.m167011e(matcher.group(4))));
        } catch (NumberFormatException e) {
            throw ParserException.createForMalformedManifest("Malformed SDP media description line: " + str, e);
        }
    }
}
