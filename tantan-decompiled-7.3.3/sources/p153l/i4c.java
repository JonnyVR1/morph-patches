package p153l;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;
import android.util.Xml;
import androidx.annotation.Nullable;
import com.clevertap.android.sdk.Constants;
import com.google.android.exoplayer2.C1894k;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.metadata.emsg.EventMessage;
import com.google.android.exoplayer2.upstream.C2073d;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.immomo.momomediaext.sei.BaseSei;
import com.mp4parser.iso23001.part7.ProtectionSystemSpecificHeaderBox;
import com.p051p1.mobile.putong.core.data.Target;
import com.p051p1.mobile.putong.live.base.data.BLiveOperationTitleShowType;
import com.p051p1.mobile.putong.live.external.internal.virtualVoice.entry.LiveVoiceInternalEntryBean;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.aspectj.lang.JoinPoint;
import org.fourthline.cling.support.model.dlna.DLNAProfiles;
import org.xml.sax.helpers.DefaultHandler;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import org.xmlpull.v1.XmlSerializer;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public class i4c extends DefaultHandler implements C2073d.a<h4c> {

    /* JADX INFO: renamed from: b */
    public static final Pattern f112872b = Pattern.compile("(\\d+)(?:/(\\d+))?");

    /* JADX INFO: renamed from: c */
    public static final Pattern f112873c = Pattern.compile("CC([1-4])=.*");

    /* JADX INFO: renamed from: d */
    public static final Pattern f112874d = Pattern.compile("([1-9]|[1-5][0-9]|6[0-3])=.*");

    /* JADX INFO: renamed from: e */
    public static final int[] f112875e = {-1, 1, 2, 3, 4, 5, 6, 8, 2, 3, 4, 7, 8, 24, 8, 12, 10, 12, 14, 12, 14};

    /* JADX INFO: renamed from: a */
    public final XmlPullParserFactory f112876a;

    /* JADX INFO: renamed from: l.i4c$a */
    public static final class C17640a {

        /* JADX INFO: renamed from: a */
        public final C1894k f112877a;

        /* JADX INFO: renamed from: b */
        public final ImmutableList<fs2> f112878b;

        /* JADX INFO: renamed from: c */
        public final ske0 f112879c;

        /* JADX INFO: renamed from: d */
        @Nullable
        public final String f112880d;

        /* JADX INFO: renamed from: e */
        public final ArrayList<DrmInitData.SchemeData> f112881e;

        /* JADX INFO: renamed from: f */
        public final ArrayList<tvd> f112882f;

        /* JADX INFO: renamed from: g */
        public final long f112883g;

        /* JADX INFO: renamed from: h */
        public final List<tvd> f112884h;

        /* JADX INFO: renamed from: i */
        public final List<tvd> f112885i;

        public C17640a(C1894k c1894k, List<fs2> list, ske0 ske0Var, @Nullable String str, ArrayList<DrmInitData.SchemeData> arrayList, ArrayList<tvd> arrayList2, List<tvd> list2, List<tvd> list3, long j) {
            this.f112877a = c1894k;
            this.f112878b = ImmutableList.copyOf((Collection) list);
            this.f112879c = ske0Var;
            this.f112880d = str;
            this.f112881e = arrayList;
            this.f112882f = arrayList2;
            this.f112884h = list2;
            this.f112885i = list3;
            this.f112883g = j;
        }
    }

    public i4c() {
        try {
            this.f112876a = XmlPullParserFactory.newInstance();
        } catch (XmlPullParserException e) {
            vtq0.m202761a("Couldn't create XmlPullParserFactory instance", e);
            throw null;
        }
    }

    /* JADX INFO: renamed from: D */
    public static int m138414D(List<tvd> list) {
        String str;
        for (int i = 0; i < list.size(); i++) {
            tvd tvdVar = list.get(i);
            if ("urn:scte:dash:cc:cea-608:2015".equals(tvdVar.f176257a) && (str = tvdVar.f176258b) != null) {
                Matcher matcher = f112873c.matcher(str);
                if (matcher.matches()) {
                    return Integer.parseInt(matcher.group(1));
                }
                kyv.m152151i("MpdParser", "Unable to parse CEA-608 channel number from: " + tvdVar.f176258b);
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: E */
    public static int m138415E(List<tvd> list) {
        String str;
        for (int i = 0; i < list.size(); i++) {
            tvd tvdVar = list.get(i);
            if ("urn:scte:dash:cc:cea-708:2015".equals(tvdVar.f176257a) && (str = tvdVar.f176258b) != null) {
                Matcher matcher = f112874d.matcher(str);
                if (matcher.matches()) {
                    return Integer.parseInt(matcher.group(1));
                }
                kyv.m152151i("MpdParser", "Unable to parse CEA-708 service block number from: " + tvdVar.f176258b);
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: H */
    public static long m138416H(XmlPullParser xmlPullParser, String str, long j) throws ParserException {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? j : bmk0.m105098Q0(attributeValue);
    }

    /* JADX INFO: renamed from: I */
    public static tvd m138417I(XmlPullParser xmlPullParser, String str) throws XmlPullParserException, IOException {
        String strM138432r0 = m138432r0(xmlPullParser, "schemeIdUri", "");
        String strM138432r1 = m138432r0(xmlPullParser, "value", null);
        String strM138432r2 = m138432r0(xmlPullParser, "id", null);
        do {
            xmlPullParser.next();
        } while (!lmq0.m154885d(xmlPullParser, str));
        return new tvd(strM138432r0, strM138432r1, strM138432r2);
    }

    /* JADX INFO: renamed from: J */
    public static int m138418J(XmlPullParser xmlPullParser) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "value");
        if (attributeValue == null) {
            return -1;
        }
        String strM138051e = i11.m138051e(attributeValue);
        strM138051e.getClass();
        switch (strM138051e) {
            case "4000":
                return 1;
            case "a000":
                return 2;
            case "f801":
                return 6;
            case "fa01":
                return 8;
            default:
                return -1;
        }
    }

    /* JADX INFO: renamed from: K */
    public static int m138419K(XmlPullParser xmlPullParser) {
        int iM138425U = m138425U(xmlPullParser, "value", -1);
        if (iM138425U <= 0 || iM138425U >= 33) {
            return -1;
        }
        return iM138425U;
    }

    /* JADX INFO: renamed from: L */
    public static int m138420L(XmlPullParser xmlPullParser) {
        int iBitCount;
        String attributeValue = xmlPullParser.getAttributeValue(null, "value");
        if (attributeValue == null || (iBitCount = Integer.bitCount(Integer.parseInt(attributeValue, 16))) == 0) {
            return -1;
        }
        return iBitCount;
    }

    /* JADX INFO: renamed from: M */
    public static long m138421M(XmlPullParser xmlPullParser, String str, long j) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? j : bmk0.m105100R0(attributeValue);
    }

    /* JADX INFO: renamed from: N */
    public static String m138422N(List<tvd> list) {
        for (int i = 0; i < list.size(); i++) {
            tvd tvdVar = list.get(i);
            String str = tvdVar.f176257a;
            if ("tag:dolby.com,2018:dash:EC3_ExtensionType:2018".equals(str) && "JOC".equals(tvdVar.f176258b)) {
                return "audio/eac3-joc";
            }
            if ("tag:dolby.com,2014:dash:DolbyDigitalPlusExtensionType:2014".equals(str) && "ec+3".equals(tvdVar.f176258b)) {
                return "audio/eac3-joc";
            }
        }
        return "audio/eac3";
    }

    /* JADX INFO: renamed from: R */
    public static float m138423R(XmlPullParser xmlPullParser, String str, float f) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? f : Float.parseFloat(attributeValue);
    }

    /* JADX INFO: renamed from: S */
    public static float m138424S(XmlPullParser xmlPullParser, float f) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "frameRate");
        if (attributeValue != null) {
            Matcher matcher = f112872b.matcher(attributeValue);
            if (matcher.matches()) {
                int i = Integer.parseInt(matcher.group(1));
                String strGroup = matcher.group(2);
                return !TextUtils.isEmpty(strGroup) ? i / Integer.parseInt(strGroup) : i;
            }
        }
        return f;
    }

    /* JADX INFO: renamed from: U */
    public static int m138425U(XmlPullParser xmlPullParser, String str, int i) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? i : Integer.parseInt(attributeValue);
    }

    /* JADX INFO: renamed from: W */
    public static long m138426W(List<tvd> list) {
        for (int i = 0; i < list.size(); i++) {
            tvd tvdVar = list.get(i);
            if (i11.m138047a("http://dashif.org/guidelines/last-segment-number", tvdVar.f176257a)) {
                return Long.parseLong(tvdVar.f176258b);
            }
        }
        return -1L;
    }

    /* JADX INFO: renamed from: X */
    public static long m138427X(XmlPullParser xmlPullParser, String str, long j) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? j : Long.parseLong(attributeValue);
    }

    /* JADX INFO: renamed from: Z */
    public static int m138428Z(XmlPullParser xmlPullParser) {
        int iM138425U = m138425U(xmlPullParser, "value", -1);
        if (iM138425U >= 0) {
            int[] iArr = f112875e;
            if (iM138425U < iArr.length) {
                return iArr[iM138425U];
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: p */
    public static int m138429p(int i, int i2) {
        if (i == -1) {
            return i2;
        }
        if (i2 == -1) {
            return i;
        }
        w11.m204371g(i == i2);
        return i;
    }

    @Nullable
    /* JADX INFO: renamed from: q */
    public static String m138430q(@Nullable String str, @Nullable String str2) {
        if (str == null) {
            return str2;
        }
        if (str2 == null) {
            return str;
        }
        w11.m204371g(str.equals(str2));
        return str;
    }

    /* JADX INFO: renamed from: r */
    public static void m138431r(ArrayList<DrmInitData.SchemeData> arrayList) {
        String str;
        int i = 0;
        while (true) {
            if (i >= arrayList.size()) {
                str = null;
                break;
            }
            DrmInitData.SchemeData schemeData = arrayList.get(i);
            if (zr3.f205731c.equals(schemeData.uuid) && (str = schemeData.licenseServerUrl) != null) {
                arrayList.remove(i);
                break;
            }
            i++;
        }
        if (str == null) {
            return;
        }
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            DrmInitData.SchemeData schemeData2 = arrayList.get(i2);
            if (zr3.f205730b.equals(schemeData2.uuid) && schemeData2.licenseServerUrl == null) {
                arrayList.set(i2, new DrmInitData.SchemeData(zr3.f205731c, str, schemeData2.mimeType, schemeData2.data));
            }
        }
    }

    /* JADX INFO: renamed from: r0 */
    public static String m138432r0(XmlPullParser xmlPullParser, String str, String str2) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? str2 : attributeValue;
    }

    /* JADX INFO: renamed from: s */
    public static void m138433s(ArrayList<DrmInitData.SchemeData> arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            DrmInitData.SchemeData schemeData = arrayList.get(size);
            if (!schemeData.m9957c()) {
                for (int i = 0; i < arrayList.size(); i++) {
                    if (arrayList.get(i).m9955a(schemeData)) {
                        arrayList.remove(size);
                        break;
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: s0 */
    public static String m138434s0(XmlPullParser xmlPullParser, String str) throws XmlPullParserException, IOException {
        String text = "";
        do {
            xmlPullParser.next();
            if (xmlPullParser.getEventType() == 4) {
                text = xmlPullParser.getText();
            } else {
                m138437w(xmlPullParser);
            }
        } while (!lmq0.m154885d(xmlPullParser, str));
        return text;
    }

    /* JADX INFO: renamed from: t */
    public static long m138435t(long j, long j2) {
        if (j2 != -9223372036854775807L) {
            j = j2;
        }
        if (j == Long.MAX_VALUE) {
            return -9223372036854775807L;
        }
        return j;
    }

    @Nullable
    /* JADX INFO: renamed from: u */
    public static String m138436u(@Nullable String str, @Nullable String str2) {
        if (kb00.m149014o(str)) {
            return kb00.m149002c(str2);
        }
        if (kb00.m149018s(str)) {
            return kb00.m149013n(str2);
        }
        if (kb00.m149017r(str) || kb00.m149015p(str)) {
            return str;
        }
        if (!"application/mp4".equals(str)) {
            return null;
        }
        String strM149006g = kb00.m149006g(str2);
        return "text/vtt".equals(strM149006g) ? "application/x-mp4-vtt" : strM149006g;
    }

    /* JADX INFO: renamed from: w */
    public static void m138437w(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        if (lmq0.m154886e(xmlPullParser)) {
            int i = 1;
            while (i != 0) {
                xmlPullParser.next();
                if (lmq0.m154886e(xmlPullParser)) {
                    i++;
                } else if (lmq0.m154884c(xmlPullParser)) {
                    i--;
                }
            }
        }
    }

    /* JADX INFO: renamed from: A */
    public int m138438A(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        String strM138432r0 = m138432r0(xmlPullParser, "schemeIdUri", null);
        strM138432r0.getClass();
        int iM138419K = -1;
        switch (strM138432r0) {
            case "urn:dts:dash:audio_channel_configuration:2012":
            case "tag:dts.com,2014:dash:audio_channel_configuration:2012":
                iM138419K = m138419K(xmlPullParser);
                break;
            case "urn:mpeg:dash:23003:3:audio_channel_configuration:2011":
                iM138419K = m138425U(xmlPullParser, "value", -1);
                break;
            case "tag:dolby.com,2014:dash:audio_channel_configuration:2011":
            case "urn:dolby:dash:audio_channel_configuration:2011":
                iM138419K = m138418J(xmlPullParser);
                break;
            case "urn:mpeg:mpegB:cicp:ChannelConfiguration":
                iM138419K = m138428Z(xmlPullParser);
                break;
            case "tag:dts.com,2018:uhd:audio_channel_configuration":
                iM138419K = m138420L(xmlPullParser);
                break;
        }
        do {
            xmlPullParser.next();
        } while (!lmq0.m154885d(xmlPullParser, "AudioChannelConfiguration"));
        return iM138419K;
    }

    /* JADX INFO: renamed from: B */
    public long m138439B(XmlPullParser xmlPullParser, long j) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "availabilityTimeOffset");
        if (attributeValue == null) {
            return j;
        }
        if ("INF".equals(attributeValue)) {
            return Long.MAX_VALUE;
        }
        return (long) (Float.parseFloat(attributeValue) * 1000000.0f);
    }

    /* JADX INFO: renamed from: C */
    public List<fs2> m138440C(XmlPullParser xmlPullParser, List<fs2> list, boolean z) throws XmlPullParserException, IOException {
        String attributeValue = xmlPullParser.getAttributeValue(null, "dvb:priority");
        int i = attributeValue != null ? Integer.parseInt(attributeValue) : z ? 1 : Integer.MIN_VALUE;
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "dvb:weight");
        int i2 = attributeValue2 != null ? Integer.parseInt(attributeValue2) : 1;
        String attributeValue3 = xmlPullParser.getAttributeValue(null, "serviceLocation");
        String strM138434s0 = m138434s0(xmlPullParser, "BaseURL");
        if (h4k0.m133579b(strM138434s0)) {
            if (attributeValue3 == null) {
                attributeValue3 = strM138434s0;
            }
            return Lists.m15980m(new fs2(strM138434s0, attributeValue3, i, i2));
        }
        ArrayList arrayList = new ArrayList();
        for (int i3 = 0; i3 < list.size(); i3++) {
            fs2 fs2Var = list.get(i3);
            String strM133581d = h4k0.m133581d(fs2Var.f100517a, strM138434s0);
            String str = attributeValue3 == null ? strM133581d : attributeValue3;
            if (z) {
                i = fs2Var.f100519c;
                i2 = fs2Var.f100520d;
                str = fs2Var.f100518b;
            }
            arrayList.add(new fs2(strM133581d, str, i, i2));
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x0092  */
    /* JADX WARN: Code duplicated, block: B:67:0x010d  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v25 */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r3v27 */
    /* JADX WARN: Type inference failed for: r3v28 */
    /* JADX WARN: Type inference failed for: r3v29 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v30 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX INFO: renamed from: F */
    public Pair<String, DrmInitData.SchemeData> m138441F(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        String attributeValue;
        UUID uuid;
        UUID uuid2;
        ?? attributeValue2;
        ?? M189555b;
        String attributeValue3 = xmlPullParser.getAttributeValue(null, "schemeIdUri");
        if (attributeValue3 != null) {
            String strM138051e = i11.m138051e(attributeValue3);
            strM138051e.getClass();
            switch (strM138051e) {
                case "urn:uuid:e2719d58-a985-b3c9-781a-b030af78d30e":
                    uuid = zr3.f205731c;
                    attributeValue = null;
                    uuid2 = null;
                    attributeValue2 = uuid2;
                    M189555b = uuid2;
                    break;
                case "urn:uuid:9a04f079-9840-4286-ab92-e65be0885f95":
                    uuid = zr3.f205733e;
                    attributeValue = null;
                    uuid2 = null;
                    attributeValue2 = uuid2;
                    M189555b = uuid2;
                    break;
                case "urn:uuid:edef8ba9-79d6-4ace-a3c8-27dcd51d21ed":
                    uuid = zr3.f205732d;
                    attributeValue = null;
                    uuid2 = null;
                    attributeValue2 = uuid2;
                    M189555b = uuid2;
                    break;
                case "urn:mpeg:dash:mp4protection:2011":
                    attributeValue = xmlPullParser.getAttributeValue(null, "value");
                    String strM154883b = lmq0.m154883b(xmlPullParser, "default_KID");
                    if (!TextUtils.isEmpty(strM154883b) && !"00000000-0000-0000-0000-000000000000".equals(strM154883b)) {
                        String[] strArrSplit = strM154883b.split("\\s+");
                        UUID[] uuidArr = new UUID[strArrSplit.length];
                        for (int i = 0; i < strArrSplit.length; i++) {
                            uuidArr[i] = UUID.fromString(strArrSplit[i]);
                        }
                        uuid = zr3.f205730b;
                        attributeValue2 = 0;
                        M189555b = t7b0.m189555b(uuid, uuidArr, null);
                        break;
                    } else {
                        uuid = null;
                        uuid2 = uuid;
                        attributeValue2 = uuid2;
                        M189555b = uuid2;
                        break;
                    }
                    break;
                default:
                    attributeValue = null;
                    uuid = null;
                    uuid2 = uuid;
                    attributeValue2 = uuid2;
                    M189555b = uuid2;
                    break;
            }
        } else {
            attributeValue = null;
            uuid = null;
            uuid2 = uuid;
            attributeValue2 = uuid2;
            M189555b = uuid2;
        }
        do {
            xmlPullParser.next();
            if (lmq0.m154887f(xmlPullParser, "clearkey:Laurl") && xmlPullParser.next() == 4) {
                M189555b = M189555b;
                attributeValue2 = xmlPullParser.getText();
            } else if (lmq0.m154887f(xmlPullParser, "ms:laurl")) {
                M189555b = M189555b;
                attributeValue2 = xmlPullParser.getAttributeValue(null, "licenseUrl");
            } else if (M189555b == 0 && lmq0.m154888g(xmlPullParser, ProtectionSystemSpecificHeaderBox.TYPE) && xmlPullParser.next() == 4) {
                byte[] bArrDecode = Base64.decode(xmlPullParser.getText(), 0);
                UUID uuidM189559f = t7b0.m189559f(bArrDecode);
                if (uuidM189559f == null) {
                    kyv.m152151i("MpdParser", "Skipping malformed cenc:pssh data");
                    uuid = uuidM189559f;
                    M189555b = 0;
                    attributeValue2 = attributeValue2;
                } else {
                    M189555b = bArrDecode;
                    uuid = uuidM189559f;
                    attributeValue2 = attributeValue2;
                }
            } else if (M189555b == 0) {
                UUID uuid3 = zr3.f205733e;
                if (uuid3.equals(uuid) && lmq0.m154887f(xmlPullParser, "mspr:pro") && xmlPullParser.next() == 4) {
                    M189555b = t7b0.m189554a(uuid3, Base64.decode(xmlPullParser.getText(), 0));
                    attributeValue2 = attributeValue2;
                } else {
                    m138437w(xmlPullParser);
                    M189555b = M189555b;
                    attributeValue2 = attributeValue2;
                }
            } else {
                m138437w(xmlPullParser);
                M189555b = M189555b;
                attributeValue2 = attributeValue2;
            }
        } while (!lmq0.m154885d(xmlPullParser, "ContentProtection"));
        return Pair.create(attributeValue, uuid != null ? new DrmInitData.SchemeData(uuid, attributeValue2, DLNAProfiles.DLNAMimeTypes.MIME_VIDEO_MPEG_4, M189555b) : null);
    }

    /* JADX INFO: renamed from: G */
    public int m138442G(XmlPullParser xmlPullParser) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "contentType");
        if (TextUtils.isEmpty(attributeValue)) {
            return -1;
        }
        if ("audio".equals(attributeValue)) {
            return 1;
        }
        if ("video".equals(attributeValue)) {
            return 2;
        }
        if ("text".equals(attributeValue)) {
            return 3;
        }
        return "image".equals(attributeValue) ? 4 : -1;
    }

    /* JADX INFO: renamed from: O */
    public Pair<Long, EventMessage> m138443O(XmlPullParser xmlPullParser, String str, String str2, long j, long j2, ByteArrayOutputStream byteArrayOutputStream) throws XmlPullParserException, IOException {
        long jM138427X = m138427X(xmlPullParser, "id", 0L);
        long jM138427X2 = m138427X(xmlPullParser, BLiveOperationTitleShowType.duration, -9223372036854775807L);
        long jM138427X3 = m138427X(xmlPullParser, "presentationTime", 0L);
        long jM105110W0 = bmk0.m105110W0(jM138427X2, 1000L, j);
        long jM105110W1 = bmk0.m105110W0(jM138427X3 - j2, 1000000L, j);
        String strM138432r0 = m138432r0(xmlPullParser, "messageData", null);
        byte[] bArrM138444P = m138444P(xmlPullParser, byteArrayOutputStream);
        Long lValueOf = Long.valueOf(jM105110W1);
        if (strM138432r0 != null) {
            bArrM138444P = bmk0.m105165r0(strM138432r0);
        }
        return Pair.create(lValueOf, m138454d(str, str2, jM138427X, jM105110W0, bArrM138444P));
    }

    /* JADX INFO: renamed from: P */
    public byte[] m138444P(XmlPullParser xmlPullParser, ByteArrayOutputStream byteArrayOutputStream) throws XmlPullParserException, IOException {
        byteArrayOutputStream.reset();
        XmlSerializer xmlSerializerNewSerializer = Xml.newSerializer();
        xmlSerializerNewSerializer.setOutput(byteArrayOutputStream, et4.f95689c.name());
        xmlPullParser.nextToken();
        while (!lmq0.m154885d(xmlPullParser, "Event")) {
            switch (xmlPullParser.getEventType()) {
                case 0:
                    xmlSerializerNewSerializer.startDocument(null, Boolean.FALSE);
                    break;
                case 1:
                    xmlSerializerNewSerializer.endDocument();
                    break;
                case 2:
                    xmlSerializerNewSerializer.startTag(xmlPullParser.getNamespace(), xmlPullParser.getName());
                    for (int i = 0; i < xmlPullParser.getAttributeCount(); i++) {
                        xmlSerializerNewSerializer.attribute(xmlPullParser.getAttributeNamespace(i), xmlPullParser.getAttributeName(i), xmlPullParser.getAttributeValue(i));
                    }
                    break;
                case 3:
                    xmlSerializerNewSerializer.endTag(xmlPullParser.getNamespace(), xmlPullParser.getName());
                    break;
                case 4:
                    xmlSerializerNewSerializer.text(xmlPullParser.getText());
                    break;
                case 5:
                    xmlSerializerNewSerializer.cdsect(xmlPullParser.getText());
                    break;
                case 6:
                    xmlSerializerNewSerializer.entityRef(xmlPullParser.getText());
                    break;
                case 7:
                    xmlSerializerNewSerializer.ignorableWhitespace(xmlPullParser.getText());
                    break;
                case 8:
                    xmlSerializerNewSerializer.processingInstruction(xmlPullParser.getText());
                    break;
                case 9:
                    xmlSerializerNewSerializer.comment(xmlPullParser.getText());
                    break;
                case 10:
                    xmlSerializerNewSerializer.docdecl(xmlPullParser.getText());
                    break;
            }
            xmlPullParser.nextToken();
        }
        xmlSerializerNewSerializer.flush();
        return byteArrayOutputStream.toByteArray();
    }

    /* JADX INFO: renamed from: Q */
    public a6f m138445Q(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        i4c i4cVar;
        long j;
        String str;
        String str2;
        XmlPullParser xmlPullParser2;
        String strM138432r0 = m138432r0(xmlPullParser, "schemeIdUri", "");
        String strM138432r1 = m138432r0(xmlPullParser, "value", "");
        long jM138427X = m138427X(xmlPullParser, "timescale", 1L);
        long jM138427X2 = m138427X(xmlPullParser, "presentationTimeOffset", 0L);
        ArrayList arrayList = new ArrayList();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
        while (true) {
            xmlPullParser.next();
            if (lmq0.m154887f(xmlPullParser, "Event")) {
                i4cVar = this;
                j = jM138427X;
                str = strM138432r1;
                str2 = strM138432r0;
                xmlPullParser2 = xmlPullParser;
                arrayList.add(i4cVar.m138443O(xmlPullParser2, str2, str, j, jM138427X2, byteArrayOutputStream));
            } else {
                i4cVar = this;
                j = jM138427X;
                str = strM138432r1;
                str2 = strM138432r0;
                xmlPullParser2 = xmlPullParser;
                m138437w(xmlPullParser2);
            }
            if (lmq0.m154885d(xmlPullParser2, "EventStream")) {
                break;
            }
            this = i4cVar;
            xmlPullParser = xmlPullParser2;
            strM138432r0 = str2;
            strM138432r1 = str;
            jM138427X = j;
        }
        long[] jArr = new long[arrayList.size()];
        EventMessage[] eventMessageArr = new EventMessage[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            Pair pair = (Pair) arrayList.get(i);
            jArr[i] = ((Long) pair.first).longValue();
            eventMessageArr[i] = (EventMessage) pair.second;
        }
        return i4cVar.m138456e(str2, str, j, jArr, eventMessageArr);
    }

    /* JADX INFO: renamed from: T */
    public mkc0 m138446T(XmlPullParser xmlPullParser) {
        return m138455d0(xmlPullParser, "sourceURL", "range");
    }

    /* JADX INFO: renamed from: V */
    public String m138447V(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        return m138434s0(xmlPullParser, "Label");
    }

    /* JADX WARN: Code duplicated, block: B:67:0x019d  */
    /* JADX WARN: Code duplicated, block: B:69:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:70:0x01a4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:71:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:72:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:77:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:79:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:81:0x01dd A[LOOP:0: B:24:0x00a5->B:81:0x01dd, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:82:0x0199 A[SYNTHETIC] */
    /* JADX INFO: renamed from: Y */
    public h4c m138448Y(XmlPullParser xmlPullParser, Uri uri) throws XmlPullParserException, IOException {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        long j;
        ArrayList arrayList5;
        long j2;
        Throwable th;
        long j3;
        i4c i4cVar = this;
        boolean zM138482v = i4cVar.m138482v(i4cVar.m138451b0(xmlPullParser, "profiles", new String[0]));
        long jM138416H = m138416H(xmlPullParser, "availabilityStartTime", -9223372036854775807L);
        long jM138421M = m138421M(xmlPullParser, "mediaPresentationDuration", -9223372036854775807L);
        long jM138421M2 = m138421M(xmlPullParser, "minBufferTime", -9223372036854775807L);
        boolean zEquals = LiveVoiceInternalEntryBean.TYPE_IMAGE_STYLE_DYNAMIC.equals(xmlPullParser.getAttributeValue(null, "type"));
        long jM138421M3 = zEquals ? m138421M(xmlPullParser, "minimumUpdatePeriod", -9223372036854775807L) : -9223372036854775807L;
        long jM138421M4 = zEquals ? m138421M(xmlPullParser, "timeShiftBufferDepth", -9223372036854775807L) : -9223372036854775807L;
        long jM138421M5 = zEquals ? m138421M(xmlPullParser, "suggestedPresentationDelay", -9223372036854775807L) : -9223372036854775807L;
        long jM138416H2 = m138416H(xmlPullParser, "publishTime", -9223372036854775807L);
        long j4 = zEquals ? 0L : -9223372036854775807L;
        ArrayList arrayListM15980m = Lists.m15980m(new fs2(uri.toString(), uri.toString(), zM138482v ? 1 : Integer.MIN_VALUE, 1));
        ArrayList arrayList6 = new ArrayList();
        ArrayList arrayList7 = new ArrayList();
        long j5 = zEquals ? -9223372036854775807L : 0L;
        ArrayList arrayList8 = arrayListM15980m;
        long jM138439B = j4;
        boolean z = false;
        boolean z2 = false;
        m4b0 m4b0VarM138453c0 = null;
        llk0 llk0VarM138484w0 = null;
        Uri uriM133582e = null;
        mre0 mre0VarM138479q0 = null;
        while (true) {
            xmlPullParser.next();
            if (lmq0.m154887f(xmlPullParser, "BaseURL")) {
                if (!z2) {
                    jM138439B = i4cVar.m138439B(xmlPullParser, jM138439B);
                    z2 = true;
                }
                arrayList = arrayList8;
                arrayList2 = arrayList6;
                arrayList7.addAll(i4cVar.m138440C(xmlPullParser, arrayList, zM138482v));
            } else {
                arrayList = arrayList8;
                arrayList2 = arrayList6;
                if (lmq0.m154887f(xmlPullParser, "ProgramInformation")) {
                    m4b0VarM138453c0 = m138453c0(xmlPullParser);
                } else if (lmq0.m154887f(xmlPullParser, "UTCTiming")) {
                    llk0VarM138484w0 = m138484w0(xmlPullParser);
                } else if (lmq0.m154887f(xmlPullParser, "Location")) {
                    uriM133582e = h4k0.m133582e(uri.toString(), xmlPullParser.nextText());
                } else {
                    if (lmq0.m154887f(xmlPullParser, "ServiceDescription")) {
                        mre0VarM138479q0 = m138479q0(xmlPullParser);
                    } else if (!lmq0.m154887f(xmlPullParser, "Period") || z) {
                        arrayList3 = arrayList7;
                        arrayList8 = arrayList;
                        long j6 = j5;
                        long j7 = jM138439B;
                        arrayList4 = arrayList2;
                        m138437w(xmlPullParser);
                        j5 = j6;
                        j = j7;
                    } else {
                        if (arrayList7.isEmpty()) {
                            arrayList3 = arrayList7;
                            arrayList5 = arrayList;
                            arrayList4 = arrayList2;
                            arrayList8 = arrayList5;
                        } else {
                            arrayList5 = arrayList7;
                            arrayList3 = arrayList5;
                            arrayList8 = arrayList;
                            arrayList4 = arrayList2;
                        }
                        Pair<mr60, Long> pairM138449a0 = m138449a0(xmlPullParser, arrayList5, j5, jM138439B, jM138416H, jM138421M4, zM138482v);
                        mr60 mr60Var = (mr60) pairM138449a0.first;
                        if (mr60Var.f138301b != -9223372036854775807L) {
                            long jLongValue = ((Long) pairM138449a0.second).longValue();
                            j2 = jLongValue == -9223372036854775807L ? -9223372036854775807L : mr60Var.f138301b + jLongValue;
                            arrayList4.add(mr60Var);
                        } else {
                            if (!zEquals) {
                                throw ParserException.createForMalformedManifest("Unable to determine start of period " + arrayList4.size(), null);
                            }
                            j2 = j5;
                            z = true;
                        }
                        j = jM138439B;
                        j5 = j2;
                    }
                    if (lmq0.m154885d(xmlPullParser, "MPD")) {
                        if (jM138421M != -9223372036854775807L) {
                            th = null;
                            j3 = jM138421M;
                        } else if (j5 != -9223372036854775807L) {
                            j3 = j5;
                            th = null;
                        } else {
                            if (!zEquals) {
                                throw ParserException.createForMalformedManifest("Unable to determine duration of static manifest.", null);
                            }
                            th = null;
                            j3 = jM138421M;
                        }
                        if (arrayList4.isEmpty()) {
                            throw ParserException.createForMalformedManifest("No periods found.", th);
                        }
                        return m138460g(jM138416H, j3, jM138421M2, zEquals, jM138421M3, jM138421M4, jM138421M5, jM138416H2, m4b0VarM138453c0, llk0VarM138484w0, mre0VarM138479q0, uriM133582e, arrayList4);
                    }
                    long j8 = jM138421M4;
                    long j9 = jM138421M2;
                    ArrayList arrayList9 = arrayList4;
                    i4cVar = this;
                    zEquals = zEquals;
                    jM138421M3 = jM138421M3;
                    jM138439B = j;
                    arrayList6 = arrayList9;
                    arrayList7 = arrayList3;
                    jM138421M2 = j9;
                    jM138421M4 = j8;
                    jM138421M = jM138421M;
                }
            }
            arrayList3 = arrayList7;
            j = jM138439B;
            arrayList4 = arrayList2;
            arrayList8 = arrayList;
            if (lmq0.m154885d(xmlPullParser, "MPD")) {
                if (jM138421M != -9223372036854775807L) {
                    th = null;
                    j3 = jM138421M;
                } else if (j5 != -9223372036854775807L) {
                    j3 = j5;
                    th = null;
                } else {
                    if (!zEquals) {
                        throw ParserException.createForMalformedManifest("Unable to determine duration of static manifest.", null);
                    }
                    th = null;
                    j3 = jM138421M;
                }
                if (arrayList4.isEmpty()) {
                    return m138460g(jM138416H, j3, jM138421M2, zEquals, jM138421M3, jM138421M4, jM138421M5, jM138416H2, m4b0VarM138453c0, llk0VarM138484w0, mre0VarM138479q0, uriM133582e, arrayList4);
                }
                throw ParserException.createForMalformedManifest("No periods found.", th);
            }
            long j10 = jM138421M4;
            long j11 = jM138421M2;
            ArrayList arrayList10 = arrayList4;
            i4cVar = this;
            zEquals = zEquals;
            jM138421M3 = jM138421M3;
            jM138439B = j;
            arrayList6 = arrayList10;
            arrayList7 = arrayList3;
            jM138421M2 = j11;
            jM138421M4 = j10;
            jM138421M = jM138421M;
        }
    }

    /* JADX INFO: renamed from: a0 */
    public Pair<mr60, Long> m138449a0(XmlPullParser xmlPullParser, List<fs2> list, long j, long j2, long j3, long j4, boolean z) throws XmlPullParserException, IOException {
        long jM138439B;
        ArrayList arrayList;
        ArrayList arrayList2;
        long j5;
        Object obj;
        long j6;
        ske0 ske0VarM138471l0;
        long j7;
        long j8;
        ske0 ske0Var;
        ArrayList arrayList3;
        boolean z2;
        long j9;
        ArrayList arrayList4;
        ArrayList arrayList5;
        ArrayList arrayList6;
        List list2;
        ArrayList arrayList7;
        XmlPullParser xmlPullParser2 = xmlPullParser;
        String attributeValue = xmlPullParser2.getAttributeValue(null, "id");
        long jM138421M = m138421M(xmlPullParser2, "start", j);
        long j10 = j3 != -9223372036854775807L ? j3 + jM138421M : -9223372036854775807L;
        long jM138421M2 = m138421M(xmlPullParser2, BLiveOperationTitleShowType.duration, -9223372036854775807L);
        ArrayList arrayList8 = new ArrayList();
        long j11 = -9223372036854775807L;
        ArrayList arrayList9 = new ArrayList();
        boolean z3 = false;
        tvd tvdVarM138417I = null;
        long jM138439B2 = j2;
        ArrayList arrayList10 = arrayList8;
        ske0 ske0Var2 = null;
        long j12 = -9223372036854775807L;
        ArrayList arrayList11 = new ArrayList();
        while (true) {
            xmlPullParser2.next();
            if (lmq0.m154887f(xmlPullParser2, "BaseURL")) {
                if (!z3) {
                    jM138439B2 = m138439B(xmlPullParser2, jM138439B2);
                    z3 = true;
                }
                arrayList11.addAll(m138440C(xmlPullParser2, list, z));
                arrayList2 = arrayList10;
                j7 = jM138439B2;
                arrayList = arrayList9;
                z2 = z3;
                j5 = j11;
                obj = null;
                jM138421M2 = jM138421M2;
                arrayList7 = arrayList11;
                tvdVarM138417I = tvdVarM138417I;
                xmlPullParser2 = xmlPullParser2;
                ske0Var = ske0Var2;
                j9 = j12;
                j10 = j10;
            } else {
                ArrayList arrayList12 = arrayList10;
                if (lmq0.m154887f(xmlPullParser2, "AdaptationSet")) {
                    if (arrayList11.isEmpty()) {
                        arrayList6 = arrayList11;
                        list2 = list;
                    } else {
                        ArrayList arrayList13 = arrayList11;
                        arrayList6 = arrayList13;
                        list2 = arrayList13;
                    }
                    ArrayList arrayList14 = arrayList9;
                    long j13 = jM138439B2;
                    long j14 = j10;
                    long j15 = jM138421M2;
                    y70 y70VarM138486y = m138486y(xmlPullParser2, list2, ske0Var2, j15, j13, j12, j14, j4, z);
                    j10 = j14;
                    jM138439B = j12;
                    arrayList12.add(y70VarM138486y);
                    jM138421M2 = j15;
                    arrayList = arrayList14;
                    obj = null;
                    j6 = j13;
                    arrayList2 = arrayList12;
                    j5 = -9223372036854775807L;
                    arrayList5 = arrayList6;
                } else {
                    ArrayList arrayList15 = arrayList11;
                    ArrayList arrayList16 = arrayList9;
                    long j16 = jM138439B2;
                    jM138439B = j12;
                    if (lmq0.m154887f(xmlPullParser2, "EventStream")) {
                        arrayList16.add(m138445Q(xmlPullParser));
                        jM138421M2 = jM138421M2;
                        arrayList = arrayList16;
                        arrayList2 = arrayList12;
                        j5 = -9223372036854775807L;
                        obj = null;
                        j6 = j16;
                        arrayList5 = arrayList15;
                    } else {
                        if (lmq0.m154887f(xmlPullParser2, "SegmentBase")) {
                            ske0VarM138471l0 = m138467j0(xmlPullParser2, null);
                            j7 = j16;
                            obj = null;
                            arrayList = arrayList16;
                            arrayList2 = arrayList12;
                            j5 = -9223372036854775807L;
                        } else if (lmq0.m154887f(xmlPullParser2, "SegmentList")) {
                            long j17 = j10;
                            long j18 = jM138421M2;
                            long jM138439B3 = m138439B(xmlPullParser2, -9223372036854775807L);
                            arrayList = arrayList16;
                            arrayList2 = arrayList12;
                            j5 = -9223372036854775807L;
                            ske0.C20084b c20084bM138469k0 = m138469k0(xmlPullParser2, null, j17, j18, j16, jM138439B3, j4);
                            j7 = j16;
                            obj = null;
                            j10 = j17;
                            jM138421M2 = j18;
                            tvdVarM138417I = tvdVarM138417I;
                            xmlPullParser2 = xmlPullParser2;
                            j8 = jM138439B3;
                            ske0Var = c20084bM138469k0;
                            arrayList3 = arrayList15;
                        } else {
                            ske0Var2 = ske0Var2;
                            arrayList = arrayList16;
                            arrayList2 = arrayList12;
                            j5 = -9223372036854775807L;
                            if (lmq0.m154887f(xmlPullParser2, "SegmentTemplate")) {
                                jM138439B = m138439B(xmlPullParser2, -9223372036854775807L);
                                obj = null;
                                ske0VarM138471l0 = m138471l0(xmlPullParser2, null, ImmutableList.m15739of(), j10, jM138421M2, j16, jM138439B, j4);
                                j7 = j16;
                            } else {
                                obj = null;
                                jM138421M2 = jM138421M2;
                                xmlPullParser2 = xmlPullParser2;
                                j6 = j16;
                                j10 = j10;
                                if (lmq0.m154887f(xmlPullParser2, "AssetIdentifier")) {
                                    tvdVarM138417I = m138417I(xmlPullParser2, "AssetIdentifier");
                                    arrayList4 = arrayList15;
                                } else {
                                    m138437w(xmlPullParser2);
                                    arrayList4 = arrayList15;
                                }
                                j7 = j6;
                                tvdVarM138417I = tvdVarM138417I;
                                j8 = jM138439B;
                                ske0Var = ske0Var2;
                                arrayList3 = arrayList4;
                            }
                        }
                        j8 = jM138439B;
                        ske0Var = ske0VarM138471l0;
                        arrayList3 = arrayList15;
                    }
                    z2 = z3;
                    j9 = j8;
                    arrayList7 = arrayList3;
                }
                j10 = j10;
                arrayList4 = arrayList5;
                j7 = j6;
                tvdVarM138417I = tvdVarM138417I;
                j8 = jM138439B;
                ske0Var = ske0Var2;
                arrayList3 = arrayList4;
                z2 = z3;
                j9 = j8;
                arrayList7 = arrayList3;
            }
            if (lmq0.m154885d(xmlPullParser2, "Period")) {
                return Pair.create(m138462h(attributeValue, jM138421M, arrayList2, arrayList, tvdVarM138417I), Long.valueOf(jM138421M2));
            }
            xmlPullParser2 = xmlPullParser2;
            j10 = j10;
            ske0Var2 = ske0Var;
            j12 = j9;
            arrayList11 = arrayList7;
            arrayList10 = arrayList2;
            tvdVarM138417I = tvdVarM138417I;
            z3 = z2;
            jM138421M2 = jM138421M2;
            j11 = j5;
            jM138439B2 = j7;
            arrayList9 = arrayList;
        }
    }

    /* JADX INFO: renamed from: b */
    public final long m138450b(List<ske0.C20086d> list, long j, long j2, int i, long j3) {
        int iM105153m = i >= 0 ? i + 1 : (int) bmk0.m105153m(j3 - j, j2);
        for (int i2 = 0; i2 < iM105153m; i2++) {
            list.add(m138472m(j, j2));
            j += j2;
        }
        return j;
    }

    /* JADX INFO: renamed from: b0 */
    public String[] m138451b0(XmlPullParser xmlPullParser, String str, String[] strArr) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? strArr : attributeValue.split(Constants.SEPARATOR_COMMA);
    }

    /* JADX INFO: renamed from: c */
    public y70 m138452c(long j, int i, List<t1d0> list, List<tvd> list2, List<tvd> list3, List<tvd> list4) {
        return new y70(j, i, list, list2, list3, list4);
    }

    /* JADX INFO: renamed from: c0 */
    public m4b0 m138453c0(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        String strNextText = null;
        String strM138432r0 = m138432r0(xmlPullParser, "moreInformationURL", null);
        String strM138432r1 = m138432r0(xmlPullParser, "lang", null);
        String strNextText2 = null;
        String strNextText3 = null;
        while (true) {
            xmlPullParser.next();
            if (lmq0.m154887f(xmlPullParser, "Title")) {
                strNextText = xmlPullParser.nextText();
            } else if (lmq0.m154887f(xmlPullParser, "Source")) {
                strNextText2 = xmlPullParser.nextText();
            } else if (lmq0.m154887f(xmlPullParser, p7f.TAG_COPYRIGHT)) {
                strNextText3 = xmlPullParser.nextText();
            } else {
                m138437w(xmlPullParser);
            }
            String str = strNextText2;
            String str2 = strNextText;
            String str3 = strNextText3;
            if (lmq0.m154885d(xmlPullParser, "ProgramInformation")) {
                return new m4b0(str2, str, str3, strM138432r0, strM138432r1);
            }
            strNextText = str2;
            strNextText2 = str;
            strNextText3 = str3;
        }
    }

    /* JADX INFO: renamed from: d */
    public EventMessage m138454d(String str, String str2, long j, long j2, byte[] bArr) {
        return new EventMessage(str, str2, j2, j, bArr);
    }

    /* JADX INFO: renamed from: d0 */
    public mkc0 m138455d0(XmlPullParser xmlPullParser, String str, String str2) {
        long j;
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        String attributeValue2 = xmlPullParser.getAttributeValue(null, str2);
        long j2 = -1;
        if (attributeValue2 != null) {
            String[] strArrSplit = attributeValue2.split("-");
            j = Long.parseLong(strArrSplit[0]);
            if (strArrSplit.length == 2) {
                j2 = (Long.parseLong(strArrSplit[1]) - j) + 1;
            }
        } else {
            j = 0;
        }
        return m138464i(attributeValue, j, j2);
    }

    /* JADX INFO: renamed from: e */
    public a6f m138456e(String str, String str2, long j, long[] jArr, EventMessage[] eventMessageArr) {
        return new a6f(str, str2, j, jArr, eventMessageArr);
    }

    /* JADX WARN: Code duplicated, block: B:55:0x0216 A[LOOP:0: B:3:0x006c->B:55:0x0216, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:56:0x01c7 A[EDGE_INSN: B:56:0x01c7->B:45:0x01c7 BREAK  A[LOOP:0: B:3:0x006c->B:55:0x0216], SYNTHETIC] */
    /* JADX INFO: renamed from: e0 */
    public C17640a m138457e0(XmlPullParser xmlPullParser, List<fs2> list, @Nullable String str, @Nullable String str2, int i, int i2, float f, int i3, int i4, @Nullable String str3, List<tvd> list2, List<tvd> list3, List<tvd> list4, List<tvd> list5, @Nullable ske0 ske0Var, long j, long j2, long j3, long j4, long j5, boolean z) throws XmlPullParserException, IOException {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        int iM138438A;
        ske0 ske0VarM138467j0;
        long j6;
        ske0 ske0VarM138471l0;
        ArrayList arrayList4;
        ArrayList arrayList5;
        ArrayList arrayList6;
        XmlPullParser xmlPullParser2 = xmlPullParser;
        String attributeValue = xmlPullParser2.getAttributeValue(null, "id");
        int iM138425U = m138425U(xmlPullParser2, "bandwidth", -1);
        String strM138432r0 = m138432r0(xmlPullParser2, "mimeType", str);
        String strM138432r1 = m138432r0(xmlPullParser2, "codecs", str2);
        int iM138425U2 = m138425U(xmlPullParser2, "width", i);
        int iM138425U3 = m138425U(xmlPullParser2, "height", i2);
        float fM138424S = m138424S(xmlPullParser2, f);
        int iM138425U4 = m138425U(xmlPullParser2, "audioSamplingRate", i4);
        ArrayList arrayList7 = new ArrayList();
        ArrayList arrayList8 = new ArrayList();
        ArrayList arrayList9 = new ArrayList(list4);
        ArrayList arrayList10 = new ArrayList(list5);
        int i5 = i3;
        long j7 = j4;
        String str4 = null;
        boolean z2 = false;
        ske0 ske0Var2 = ske0Var;
        long jM138439B = j3;
        ArrayList arrayList11 = new ArrayList();
        while (true) {
            xmlPullParser2.next();
            if (lmq0.m154887f(xmlPullParser2, "BaseURL")) {
                if (!z2) {
                    jM138439B = m138439B(xmlPullParser2, jM138439B);
                    z2 = true;
                }
                arrayList11.addAll(m138440C(xmlPullParser2, list, z));
                xmlPullParser2 = xmlPullParser2;
                arrayList6 = arrayList11;
                j7 = j7;
                iM138425U = iM138425U;
                iM138438A = i5;
                str4 = str4;
                z2 = z2;
                arrayList = arrayList8;
                ske0VarM138467j0 = ske0Var2;
                j6 = jM138439B;
            } else {
                arrayList = arrayList8;
                if (lmq0.m154887f(xmlPullParser2, "AudioChannelConfiguration")) {
                    ske0VarM138467j0 = ske0Var2;
                    iM138438A = m138438A(xmlPullParser);
                } else {
                    if (lmq0.m154887f(xmlPullParser2, "SegmentBase")) {
                        iM138438A = i5;
                        ske0VarM138467j0 = m138467j0(xmlPullParser2, (ske0.C20087e) ske0Var2);
                    } else {
                        if (lmq0.m154887f(xmlPullParser2, "SegmentList")) {
                            long jM138439B2 = m138439B(xmlPullParser2, j7);
                            arrayList4 = arrayList11;
                            arrayList2 = arrayList10;
                            iM138425U = iM138425U;
                            arrayList = arrayList;
                            ske0VarM138471l0 = m138469k0(xmlPullParser2, (ske0.C20084b) ske0Var2, j, j2, jM138439B, jM138439B2, j5);
                            arrayList3 = arrayList9;
                            j7 = jM138439B2;
                        } else {
                            ArrayList arrayList12 = arrayList11;
                            arrayList2 = arrayList10;
                            iM138425U = iM138425U;
                            arrayList = arrayList;
                            ArrayList arrayList13 = arrayList9;
                            if (lmq0.m154887f(xmlPullParser2, "SegmentTemplate")) {
                                long jM138439B3 = m138439B(xmlPullParser2, j7);
                                long j8 = jM138439B;
                                ske0VarM138471l0 = m138471l0(xmlPullParser2, (ske0.C20085c) ske0Var2, list5, j, j2, j8, jM138439B3, j5);
                                jM138439B = j8;
                                arrayList3 = arrayList13;
                                j7 = jM138439B3;
                                arrayList4 = arrayList12;
                            } else {
                                xmlPullParser2 = xmlPullParser2;
                                arrayList7 = arrayList7;
                                if (lmq0.m154887f(xmlPullParser2, "ContentProtection")) {
                                    Pair<String, DrmInitData.SchemeData> pairM138441F = m138441F(xmlPullParser);
                                    Object obj = pairM138441F.first;
                                    if (obj != null) {
                                        str4 = (String) obj;
                                    }
                                    Object obj2 = pairM138441F.second;
                                    if (obj2 != null) {
                                        arrayList7.add((DrmInitData.SchemeData) obj2);
                                    }
                                } else {
                                    if (lmq0.m154887f(xmlPullParser2, "InbandEventStream")) {
                                        arrayList.add(m138417I(xmlPullParser2, "InbandEventStream"));
                                    } else if (lmq0.m154887f(xmlPullParser2, "EssentialProperty")) {
                                        arrayList3 = arrayList13;
                                        arrayList3.add(m138417I(xmlPullParser2, "EssentialProperty"));
                                        arrayList10 = arrayList2;
                                    } else {
                                        arrayList3 = arrayList13;
                                        if (lmq0.m154887f(xmlPullParser2, "SupplementalProperty")) {
                                            arrayList10 = arrayList2;
                                            arrayList10.add(m138417I(xmlPullParser2, "SupplementalProperty"));
                                        } else {
                                            arrayList10 = arrayList2;
                                            m138437w(xmlPullParser2);
                                        }
                                    }
                                    j7 = j7;
                                    iM138438A = i5;
                                    str4 = str4;
                                    z2 = z2;
                                    ske0VarM138467j0 = ske0Var2;
                                    j6 = jM138439B;
                                    arrayList5 = arrayList12;
                                }
                                arrayList10 = arrayList2;
                                arrayList3 = arrayList13;
                                j7 = j7;
                                iM138438A = i5;
                                str4 = str4;
                                z2 = z2;
                                ske0VarM138467j0 = ske0Var2;
                                j6 = jM138439B;
                                arrayList5 = arrayList12;
                            }
                        }
                        iM138438A = i5;
                        str4 = str4;
                        z2 = z2;
                        ske0VarM138467j0 = ske0VarM138471l0;
                        j6 = jM138439B;
                        arrayList10 = arrayList2;
                        arrayList5 = arrayList4;
                    }
                    if (lmq0.m154885d(xmlPullParser2, "Representation")) {
                        break;
                    }
                    ArrayList arrayList14 = arrayList10;
                    arrayList9 = arrayList3;
                    arrayList7 = arrayList7;
                    arrayList8 = arrayList;
                    ske0Var2 = ske0VarM138467j0;
                    jM138439B = j6;
                    iM138425U = iM138425U;
                    j7 = j7;
                    z2 = z2;
                    str4 = str4;
                    arrayList10 = arrayList14;
                    i5 = iM138438A;
                    arrayList11 = arrayList5;
                    xmlPullParser2 = xmlPullParser;
                }
                j6 = jM138439B;
                arrayList6 = arrayList11;
            }
            arrayList7 = arrayList7;
            arrayList3 = arrayList9;
            arrayList5 = arrayList6;
            if (lmq0.m154885d(xmlPullParser2, "Representation")) {
                break;
                break;
            }
            ArrayList arrayList15 = arrayList10;
            arrayList9 = arrayList3;
            arrayList7 = arrayList7;
            arrayList8 = arrayList;
            ske0Var2 = ske0VarM138467j0;
            jM138439B = j6;
            iM138425U = iM138425U;
            j7 = j7;
            z2 = z2;
            str4 = str4;
            arrayList10 = arrayList15;
            i5 = iM138438A;
            arrayList11 = arrayList5;
            xmlPullParser2 = xmlPullParser;
        }
        ArrayList arrayList16 = arrayList7;
        List<tvd> list6 = arrayList10;
        C1894k c1894kM138458f = m138458f(attributeValue, strM138432r0, iM138425U2, iM138425U3, fM138424S, iM138438A, iM138425U4, iM138425U, str3, list2, list3, strM138432r1, arrayList3, list6);
        if (ske0VarM138467j0 == null) {
            ske0VarM138467j0 = new ske0.C20087e();
        }
        boolean zIsEmpty = arrayList5.isEmpty();
        List list7 = arrayList5;
        if (zIsEmpty) {
            list7 = list;
        }
        return new C17640a(c1894kM138458f, list7, ske0VarM138467j0, str4, arrayList16, arrayList, arrayList3, list6, -1L);
    }

    /* JADX INFO: renamed from: f */
    public C1894k m138458f(@Nullable String str, @Nullable String str2, int i, int i2, float f, int i3, int i4, int i5, @Nullable String str3, List<tvd> list, List<tvd> list2, @Nullable String str4, List<tvd> list3, List<tvd> list4) {
        String str5 = str4;
        String strM138436u = m138436u(str2, str5);
        if ("audio/eac3".equals(strM138436u)) {
            strM138436u = m138422N(list4);
            if ("audio/eac3-joc".equals(strM138436u)) {
                str5 = "ec+3";
            }
        }
        int iM138478p0 = m138478p0(list);
        int iM138465i0 = m138465i0(list) | m138459f0(list2) | m138463h0(list3) | m138463h0(list4);
        Pair<Integer, Integer> pairM138480t0 = m138480t0(list3);
        C1894k.b bVarM10391X = new C1894k.b().m10388U(str).m10380M(str2).m10400g0(strM138436u).m10378K(str5).m10395b0(i5).m10402i0(iM138478p0).m10398e0(iM138465i0).m10391X(str3);
        int iM138415E = -1;
        C1894k.b bVarM10406m0 = bVarM10391X.m10405l0(pairM138480t0 != null ? ((Integer) pairM138480t0.first).intValue() : -1).m10406m0(pairM138480t0 != null ? ((Integer) pairM138480t0.second).intValue() : -1);
        if (kb00.m149018s(strM138436u)) {
            bVarM10406m0.m10407n0(i).m10386S(i2).m10385R(f);
        } else if (kb00.m149014o(strM138436u)) {
            bVarM10406m0.m10377J(i3).m10401h0(i4);
        } else if (kb00.m149017r(strM138436u)) {
            if ("application/cea-608".equals(strM138436u)) {
                iM138415E = m138414D(list2);
            } else if ("application/cea-708".equals(strM138436u)) {
                iM138415E = m138415E(list2);
            }
            bVarM10406m0.m10375H(iM138415E);
        } else if (kb00.m149015p(strM138436u)) {
            bVarM10406m0.m10407n0(i).m10386S(i2);
        }
        return bVarM10406m0.m10374G();
    }

    /* JADX INFO: renamed from: f0 */
    public int m138459f0(List<tvd> list) {
        int iM138481u0;
        int i = 0;
        for (int i2 = 0; i2 < list.size(); i2++) {
            tvd tvdVar = list.get(i2);
            if (i11.m138047a("urn:mpeg:dash:role:2011", tvdVar.f176257a)) {
                iM138481u0 = m138461g0(tvdVar.f176258b);
            } else {
                if (i11.m138047a("urn:tva:metadata:cs:AudioPurposeCS:2007", tvdVar.f176257a)) {
                    iM138481u0 = m138481u0(tvdVar.f176258b);
                }
            }
            i |= iM138481u0;
        }
        return i;
    }

    /* JADX INFO: renamed from: g */
    public h4c m138460g(long j, long j2, long j3, boolean z, long j4, long j5, long j6, long j7, @Nullable m4b0 m4b0Var, @Nullable llk0 llk0Var, @Nullable mre0 mre0Var, @Nullable Uri uri, List<mr60> list) {
        return new h4c(j, j2, j3, z, j4, j5, j6, j7, m4b0Var, llk0Var, mre0Var, uri, list);
    }

    /* JADX INFO: renamed from: g0 */
    public int m138461g0(@Nullable String str) {
        if (str == null) {
            return 0;
        }
        switch (str) {
            case "subtitle":
            case "forced_subtitle":
            case "forced-subtitle":
                return 128;
            case "description":
                return 512;
            case "enhanced-audio-intelligibility":
                return 2048;
            case "alternate":
                return 2;
            case "dub":
                return 16;
            case "main":
                return 1;
            case "sign":
                return 256;
            case "caption":
                return 64;
            case "commentary":
                return 8;
            case "emergency":
                return 32;
            case "supplementary":
                return 4;
            default:
                return 0;
        }
    }

    /* JADX INFO: renamed from: h */
    public mr60 m138462h(@Nullable String str, long j, List<y70> list, List<a6f> list2, @Nullable tvd tvdVar) {
        return new mr60(str, j, list, list2, tvdVar);
    }

    /* JADX INFO: renamed from: h0 */
    public int m138463h0(List<tvd> list) {
        int i = 0;
        for (int i2 = 0; i2 < list.size(); i2++) {
            if (i11.m138047a("http://dashif.org/guidelines/trickmode", list.get(i2).f176257a)) {
                i = 16384;
            }
        }
        return i;
    }

    /* JADX INFO: renamed from: i */
    public mkc0 m138464i(String str, long j, long j2) {
        return new mkc0(str, j, j2);
    }

    /* JADX INFO: renamed from: i0 */
    public int m138465i0(List<tvd> list) {
        int iM138461g0 = 0;
        for (int i = 0; i < list.size(); i++) {
            tvd tvdVar = list.get(i);
            if (i11.m138047a("urn:mpeg:dash:role:2011", tvdVar.f176257a)) {
                iM138461g0 |= m138461g0(tvdVar.f176258b);
            }
        }
        return iM138461g0;
    }

    /* JADX INFO: renamed from: j */
    public t1d0 m138466j(C17640a c17640a, @Nullable String str, @Nullable String str2, ArrayList<DrmInitData.SchemeData> arrayList, ArrayList<tvd> arrayList2) {
        C1894k.b bVarM10336b = c17640a.f112877a.m10336b();
        if (str != null) {
            bVarM10336b.m10390W(str);
        }
        String str3 = c17640a.f112880d;
        if (str3 != null) {
            str2 = str3;
        }
        ArrayList<DrmInitData.SchemeData> arrayList3 = c17640a.f112881e;
        arrayList3.addAll(arrayList);
        if (!arrayList3.isEmpty()) {
            m138431r(arrayList3);
            m138433s(arrayList3);
            bVarM10336b.m10382O(new DrmInitData(str2, arrayList3));
        }
        ArrayList<tvd> arrayList4 = c17640a.f112882f;
        arrayList4.addAll(arrayList2);
        return t1d0.m188898o(c17640a.f112883g, bVarM10336b.m10374G(), c17640a.f112878b, c17640a.f112879c, arrayList4, c17640a.f112884h, c17640a.f112885i, null);
    }

    /* JADX INFO: renamed from: j0 */
    public ske0.C20087e m138467j0(XmlPullParser xmlPullParser, @Nullable ske0.C20087e c20087e) throws XmlPullParserException, IOException {
        long jM138427X = m138427X(xmlPullParser, "timescale", c20087e != null ? c20087e.f169252b : 1L);
        long jM138427X2 = m138427X(xmlPullParser, "presentationTimeOffset", c20087e != null ? c20087e.f169253c : 0L);
        long j = c20087e != null ? c20087e.f169266d : 0L;
        long j2 = c20087e != null ? c20087e.f169267e : 0L;
        String attributeValue = xmlPullParser.getAttributeValue(null, "indexRange");
        if (attributeValue != null) {
            String[] strArrSplit = attributeValue.split("-");
            j = Long.parseLong(strArrSplit[0]);
            j2 = (Long.parseLong(strArrSplit[1]) - j) + 1;
        }
        long j3 = j2;
        mkc0 mkc0VarM138446T = c20087e != null ? c20087e.f169251a : null;
        while (true) {
            xmlPullParser.next();
            if (lmq0.m154887f(xmlPullParser, "Initialization")) {
                mkc0VarM138446T = m138446T(xmlPullParser);
            } else {
                m138437w(xmlPullParser);
            }
            mkc0 mkc0Var = mkc0VarM138446T;
            if (lmq0.m154885d(xmlPullParser, "SegmentBase")) {
                return m138474n(mkc0Var, jM138427X, jM138427X2, j, j3);
            }
            mkc0VarM138446T = mkc0Var;
        }
    }

    /* JADX INFO: renamed from: k */
    public ske0.C20084b m138468k(mkc0 mkc0Var, long j, long j2, long j3, long j4, @Nullable List<ske0.C20086d> list, long j5, @Nullable List<mkc0> list2, long j6, long j7) {
        return new ske0.C20084b(mkc0Var, j, j2, j3, j4, list, j5, list2, bmk0.m105084J0(j6), bmk0.m105084J0(j7));
    }

    /* JADX INFO: renamed from: k0 */
    public ske0.C20084b m138469k0(XmlPullParser xmlPullParser, @Nullable ske0.C20084b c20084b, long j, long j2, long j3, long j4, long j5) throws XmlPullParserException, IOException {
        long j6;
        long jM138427X = m138427X(xmlPullParser, "timescale", c20084b != null ? c20084b.f169252b : 1L);
        long jM138427X2 = m138427X(xmlPullParser, "presentationTimeOffset", c20084b != null ? c20084b.f169253c : 0L);
        long jM138427X3 = m138427X(xmlPullParser, BLiveOperationTitleShowType.duration, c20084b != null ? c20084b.f169255e : -9223372036854775807L);
        long jM138427X4 = m138427X(xmlPullParser, "startNumber", c20084b != null ? c20084b.f169254d : 1L);
        long jM138435t = m138435t(j3, j4);
        List<mkc0> arrayList = null;
        mkc0 mkc0VarM138446T = null;
        List<ske0.C20086d> listM138473m0 = null;
        while (true) {
            xmlPullParser.next();
            if (lmq0.m154887f(xmlPullParser, "Initialization")) {
                mkc0VarM138446T = m138446T(xmlPullParser);
                j6 = jM138427X;
            } else if (lmq0.m154887f(xmlPullParser, "SegmentTimeline")) {
                j6 = jM138427X;
                listM138473m0 = m138473m0(xmlPullParser, j6, j2);
            } else {
                j6 = jM138427X;
                if (lmq0.m154887f(xmlPullParser, "SegmentURL")) {
                    if (arrayList == null) {
                        arrayList = new ArrayList<>();
                    }
                    arrayList.add(m138475n0(xmlPullParser));
                } else {
                    m138437w(xmlPullParser);
                }
            }
            if (lmq0.m154885d(xmlPullParser, "SegmentList")) {
                break;
            }
            jM138427X = j6;
        }
        if (c20084b != null) {
            if (mkc0VarM138446T == null) {
                mkc0VarM138446T = c20084b.f169251a;
            }
            if (listM138473m0 == null) {
                listM138473m0 = c20084b.f169256f;
            }
            if (arrayList == null) {
                arrayList = c20084b.f169260j;
            }
        }
        return m138468k(mkc0VarM138446T, j6, jM138427X2, jM138427X4, jM138427X3, listM138473m0, jM138435t, arrayList, j5, j);
    }

    /* JADX INFO: renamed from: l */
    public ske0.C20085c m138470l(mkc0 mkc0Var, long j, long j2, long j3, long j4, long j5, List<ske0.C20086d> list, long j6, @Nullable y5k0 y5k0Var, @Nullable y5k0 y5k0Var2, long j7, long j8) {
        return new ske0.C20085c(mkc0Var, j, j2, j3, j4, j5, list, j6, y5k0Var, y5k0Var2, bmk0.m105084J0(j7), bmk0.m105084J0(j8));
    }

    /* JADX INFO: renamed from: l0 */
    public ske0.C20085c m138471l0(XmlPullParser xmlPullParser, @Nullable ske0.C20085c c20085c, List<tvd> list, long j, long j2, long j3, long j4, long j5) throws XmlPullParserException, IOException {
        long j6;
        i4c i4cVar = this;
        long jM138427X = m138427X(xmlPullParser, "timescale", c20085c != null ? c20085c.f169252b : 1L);
        long jM138427X2 = m138427X(xmlPullParser, "presentationTimeOffset", c20085c != null ? c20085c.f169253c : 0L);
        long jM138427X3 = m138427X(xmlPullParser, BLiveOperationTitleShowType.duration, c20085c != null ? c20085c.f169255e : -9223372036854775807L);
        long jM138427X4 = m138427X(xmlPullParser, "startNumber", c20085c != null ? c20085c.f169254d : 1L);
        long jM138426W = m138426W(list);
        long jM138435t = m138435t(j3, j4);
        y5k0 y5k0VarM138483v0 = i4cVar.m138483v0(xmlPullParser, "media", c20085c != null ? c20085c.f169262k : null);
        y5k0 y5k0VarM138483v1 = i4cVar.m138483v0(xmlPullParser, JoinPoint.INITIALIZATION, c20085c != null ? c20085c.f169261j : null);
        mkc0 mkc0VarM138446T = null;
        List<ske0.C20086d> listM138473m0 = null;
        while (true) {
            xmlPullParser.next();
            if (lmq0.m154887f(xmlPullParser, "Initialization")) {
                mkc0VarM138446T = m138446T(xmlPullParser);
                j6 = jM138427X;
            } else if (lmq0.m154887f(xmlPullParser, "SegmentTimeline")) {
                j6 = jM138427X;
                listM138473m0 = i4cVar.m138473m0(xmlPullParser, j6, j2);
            } else {
                j6 = jM138427X;
                m138437w(xmlPullParser);
            }
            if (lmq0.m154885d(xmlPullParser, "SegmentTemplate")) {
                break;
            }
            i4cVar = this;
            jM138435t = jM138435t;
            jM138426W = jM138426W;
            jM138427X4 = jM138427X4;
            jM138427X2 = jM138427X2;
            jM138427X = j6;
        }
        if (c20085c != null) {
            if (mkc0VarM138446T == null) {
                mkc0VarM138446T = c20085c.f169251a;
            }
            if (listM138473m0 == null) {
                listM138473m0 = c20085c.f169256f;
            }
        }
        return m138470l(mkc0VarM138446T, j6, jM138427X2, jM138427X4, jM138426W, jM138427X3, listM138473m0, jM138435t, y5k0VarM138483v1, y5k0VarM138483v0, j5, j);
    }

    /* JADX INFO: renamed from: m */
    public ske0.C20086d m138472m(long j, long j2) {
        return new ske0.C20086d(j, j2);
    }

    /* JADX INFO: renamed from: m0 */
    public List<ske0.C20086d> m138473m0(XmlPullParser xmlPullParser, long j, long j2) throws XmlPullParserException, IOException {
        ArrayList arrayList = new ArrayList();
        long jM138450b = 0;
        long jM138427X = -9223372036854775807L;
        boolean z = false;
        int iM138425U = 0;
        do {
            xmlPullParser.next();
            if (lmq0.m154887f(xmlPullParser, p7f.LATITUDE_SOUTH)) {
                long jM138427X2 = m138427X(xmlPullParser, Constants.KEY_T, -9223372036854775807L);
                if (z) {
                    ArrayList arrayList2 = arrayList;
                    jM138450b = m138450b(arrayList2, jM138450b, jM138427X, iM138425U, jM138427X2);
                    arrayList = arrayList2;
                }
                if (jM138427X2 != -9223372036854775807L) {
                    jM138450b = jM138427X2;
                }
                jM138427X = m138427X(xmlPullParser, Constants.INAPP_DATA_TAG, -9223372036854775807L);
                iM138425U = m138425U(xmlPullParser, "r", 0);
                z = true;
            } else {
                m138437w(xmlPullParser);
            }
        } while (!lmq0.m154885d(xmlPullParser, "SegmentTimeline"));
        if (z) {
            m138450b(arrayList, jM138450b, jM138427X, iM138425U, bmk0.m105110W0(j2, j, 1000L));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: n */
    public ske0.C20087e m138474n(mkc0 mkc0Var, long j, long j2, long j3, long j4) {
        return new ske0.C20087e(mkc0Var, j, j2, j3, j4);
    }

    /* JADX INFO: renamed from: n0 */
    public mkc0 m138475n0(XmlPullParser xmlPullParser) {
        return m138455d0(xmlPullParser, "media", "mediaRange");
    }

    /* JADX INFO: renamed from: o */
    public llk0 m138476o(String str, String str2) {
        return new llk0(str, str2);
    }

    /* JADX INFO: renamed from: o0 */
    public int m138477o0(@Nullable String str) {
        if (str == null) {
            return 0;
        }
        return (str.equals("forced_subtitle") || str.equals("forced-subtitle")) ? 2 : 0;
    }

    /* JADX INFO: renamed from: p0 */
    public int m138478p0(List<tvd> list) {
        int iM138477o0 = 0;
        for (int i = 0; i < list.size(); i++) {
            tvd tvdVar = list.get(i);
            if (i11.m138047a("urn:mpeg:dash:role:2011", tvdVar.f176257a)) {
                iM138477o0 |= m138477o0(tvdVar.f176258b);
            }
        }
        return iM138477o0;
    }

    /* JADX INFO: renamed from: q0 */
    public mre0 m138479q0(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        long jM138427X = -9223372036854775807L;
        long jM138427X2 = -9223372036854775807L;
        long jM138427X3 = -9223372036854775807L;
        float fM138423R = -3.4028235E38f;
        float fM138423R2 = -3.4028235E38f;
        while (true) {
            xmlPullParser.next();
            if (lmq0.m154887f(xmlPullParser, "Latency")) {
                jM138427X = m138427X(xmlPullParser, Target.TYPE, -9223372036854775807L);
                jM138427X2 = m138427X(xmlPullParser, "min", -9223372036854775807L);
                jM138427X3 = m138427X(xmlPullParser, Constants.PRIORITY_MAX, -9223372036854775807L);
            } else if (lmq0.m154887f(xmlPullParser, "PlaybackRate")) {
                fM138423R = m138423R(xmlPullParser, "min", -3.4028235E38f);
                fM138423R2 = m138423R(xmlPullParser, Constants.PRIORITY_MAX, -3.4028235E38f);
            }
            long j = jM138427X;
            long j2 = jM138427X2;
            long j3 = jM138427X3;
            float f = fM138423R;
            float f2 = fM138423R2;
            if (lmq0.m154885d(xmlPullParser, "ServiceDescription")) {
                return new mre0(j, j2, j3, f, f2);
            }
            jM138427X = j;
            jM138427X2 = j2;
            jM138427X3 = j3;
            fM138423R = f;
            fM138423R2 = f2;
        }
    }

    @Nullable
    /* JADX INFO: renamed from: t0 */
    public Pair<Integer, Integer> m138480t0(List<tvd> list) {
        String str;
        char c = 0;
        for (int i = 0; i < list.size(); i++) {
            tvd tvdVar = list.get(i);
            if ((i11.m138047a("http://dashif.org/thumbnail_tile", tvdVar.f176257a) || i11.m138047a("http://dashif.org/guidelines/thumbnail_tile", tvdVar.f176257a)) && (str = tvdVar.f176258b) != null) {
                String[] strArrM105119a1 = bmk0.m105119a1(str, BaseSei.f14624X);
                if (strArrM105119a1.length != 2) {
                    continue;
                } else {
                    try {
                        return Pair.create(Integer.valueOf(Integer.parseInt(strArrM105119a1[c])), Integer.valueOf(Integer.parseInt(strArrM105119a1[1])));
                    } catch (NumberFormatException unused) {
                        continue;
                    }
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: u0 */
    public int m138481u0(@Nullable String str) {
        if (str == null) {
            return 0;
        }
        byte b = -1;
        switch (str.hashCode()) {
            case 49:
                if (str.equals("1")) {
                    b = 0;
                }
                break;
            case 50:
                if (str.equals("2")) {
                    b = 1;
                }
                break;
            case 51:
                if (str.equals("3")) {
                    b = 2;
                }
                break;
            case 52:
                if (str.equals("4")) {
                    b = 3;
                }
                break;
            case 54:
                if (str.equals(com.tencent.connect.common.Constants.VIA_SHARE_TYPE_INFO)) {
                    b = 4;
                }
                break;
        }
        switch (b) {
            case 0:
                return 512;
            case 1:
                return 2048;
            case 2:
                return 4;
            case 3:
                return 8;
            case 4:
                return 1;
            default:
                return 0;
        }
    }

    /* JADX INFO: renamed from: v */
    public final boolean m138482v(String[] strArr) {
        for (String str : strArr) {
            if (str.startsWith("urn:dvb:dash:profile:dvb-dash:")) {
                return true;
            }
        }
        return false;
    }

    @Nullable
    /* JADX INFO: renamed from: v0 */
    public y5k0 m138483v0(XmlPullParser xmlPullParser, String str, @Nullable y5k0 y5k0Var) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue != null ? y5k0.m214304b(attributeValue) : y5k0Var;
    }

    /* JADX INFO: renamed from: w0 */
    public llk0 m138484w0(XmlPullParser xmlPullParser) {
        return m138476o(xmlPullParser.getAttributeValue(null, "schemeIdUri"), xmlPullParser.getAttributeValue(null, "value"));
    }

    @Override // com.google.android.exoplayer2.upstream.C2073d.a
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public h4c mo11073a(Uri uri, InputStream inputStream) throws IOException {
        try {
            XmlPullParser xmlPullParserNewPullParser = this.f112876a.newPullParser();
            xmlPullParserNewPullParser.setInput(inputStream, null);
            if (xmlPullParserNewPullParser.next() == 2 && "MPD".equals(xmlPullParserNewPullParser.getName())) {
                return m138448Y(xmlPullParserNewPullParser, uri);
            }
            throw ParserException.createForMalformedManifest("inputStream does not contain a valid media presentation description", null);
        } catch (XmlPullParserException e) {
            throw ParserException.createForMalformedManifest(null, e);
        }
    }

    /* JADX INFO: renamed from: y */
    public y70 m138486y(XmlPullParser xmlPullParser, List<fs2> list, @Nullable ske0 ske0Var, long j, long j2, long j3, long j4, long j5, boolean z) throws XmlPullParserException, IOException {
        int iM138429p;
        String str;
        long j6;
        float f;
        ArrayList arrayList;
        int i;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        long j7;
        int i2;
        ArrayList arrayList5;
        int i3;
        long j8;
        XmlPullParser xmlPullParser2 = xmlPullParser;
        long jM138427X = m138427X(xmlPullParser2, "id", -1L);
        int iM138442G = m138442G(xmlPullParser);
        String attributeValue = xmlPullParser2.getAttributeValue(null, "mimeType");
        String attributeValue2 = xmlPullParser2.getAttributeValue(null, "codecs");
        int iM138425U = m138425U(xmlPullParser2, "width", -1);
        int iM138425U2 = m138425U(xmlPullParser2, "height", -1);
        float fM138424S = m138424S(xmlPullParser2, -1.0f);
        int iM138425U3 = m138425U(xmlPullParser2, "audioSamplingRate", -1);
        String str2 = "lang";
        String attributeValue3 = xmlPullParser2.getAttributeValue(null, "lang");
        String attributeValue4 = xmlPullParser2.getAttributeValue(null, com.google.firebase.messaging.Constants.ScionAnalytics.PARAM_LABEL);
        ArrayList<DrmInitData.SchemeData> arrayList6 = new ArrayList<>();
        ArrayList<tvd> arrayList7 = new ArrayList<>();
        ArrayList arrayList8 = new ArrayList();
        ArrayList arrayList9 = new ArrayList();
        ArrayList arrayList10 = new ArrayList();
        ArrayList<tvd> arrayList11 = arrayList7;
        ArrayList arrayList12 = new ArrayList();
        ArrayList arrayList13 = new ArrayList();
        ArrayList arrayList14 = new ArrayList();
        String str3 = attributeValue2;
        int iM138429p2 = iM138442G;
        long j9 = j3;
        ArrayList arrayList15 = arrayList13;
        int i4 = iM138425U;
        int i5 = iM138425U2;
        float f2 = fM138424S;
        String strM138447V = attributeValue4;
        String str4 = attributeValue3;
        boolean z2 = false;
        int iM138438A = -1;
        String str5 = null;
        ske0 ske0VarM138469k0 = ske0Var;
        String str6 = attributeValue;
        long jM138439B = j2;
        while (true) {
            xmlPullParser2.next();
            float f3 = f2;
            if (lmq0.m154887f(xmlPullParser2, "BaseURL")) {
                if (!z2) {
                    jM138439B = m138439B(xmlPullParser2, jM138439B);
                    z2 = true;
                }
                long j10 = jM138439B;
                arrayList14.addAll(m138440C(xmlPullParser2, list, z));
                arrayList14 = arrayList14;
                str2 = str2;
                arrayList6 = arrayList6;
                arrayList12 = arrayList12;
                ske0VarM138469k0 = ske0VarM138469k0;
                arrayList15 = arrayList15;
                arrayList11 = arrayList11;
                f = f3;
                arrayList = arrayList10;
                i2 = iM138425U3;
                arrayList5 = arrayList9;
                arrayList2 = arrayList8;
                j7 = j10;
            } else {
                long j11 = jM138439B;
                if (lmq0.m154887f(xmlPullParser2, "ContentProtection")) {
                    Pair<String, DrmInitData.SchemeData> pairM138441F = m138441F(xmlPullParser);
                    Object obj = pairM138441F.first;
                    if (obj != null) {
                        str5 = (String) obj;
                    }
                    Object obj2 = pairM138441F.second;
                    if (obj2 != null) {
                        arrayList6.add((DrmInitData.SchemeData) obj2);
                    }
                    arrayList14 = arrayList14;
                } else if (lmq0.m154887f(xmlPullParser2, "ContentComponent")) {
                    String strM138430q = m138430q(str4, xmlPullParser2.getAttributeValue(null, str2));
                    iM138429p2 = m138429p(iM138429p2, m138442G(xmlPullParser));
                    str4 = strM138430q;
                } else {
                    if (lmq0.m154887f(xmlPullParser2, "Role")) {
                        arrayList9.add(m138417I(xmlPullParser2, "Role"));
                    } else if (lmq0.m154887f(xmlPullParser2, "AudioChannelConfiguration")) {
                        iM138438A = m138438A(xmlPullParser);
                    } else if (lmq0.m154887f(xmlPullParser2, "Accessibility")) {
                        arrayList8.add(m138417I(xmlPullParser2, "Accessibility"));
                    } else if (lmq0.m154887f(xmlPullParser2, "EssentialProperty")) {
                        arrayList10.add(m138417I(xmlPullParser2, "EssentialProperty"));
                    } else if (lmq0.m154887f(xmlPullParser2, "SupplementalProperty")) {
                        arrayList12.add(m138417I(xmlPullParser2, "SupplementalProperty"));
                    } else {
                        if (lmq0.m154887f(xmlPullParser2, "Representation")) {
                            arrayList14 = arrayList14;
                            int i6 = iM138429p2;
                            str2 = str2;
                            String str7 = str3;
                            String str8 = str4;
                            int i7 = i4;
                            C17640a c17640aM138457e0 = m138457e0(xmlPullParser2, !arrayList14.isEmpty() ? arrayList14 : list, str6, str7, i7, i5, f3, iM138438A, iM138425U3, str8, arrayList9, arrayList8, arrayList10, arrayList12, ske0VarM138469k0, j4, j, j11, j9, j5, z);
                            str6 = str6;
                            i5 = i5;
                            str = str8;
                            arrayList5 = arrayList9;
                            arrayList = arrayList10;
                            ske0VarM138469k0 = ske0VarM138469k0;
                            f = f3;
                            arrayList2 = arrayList8;
                            arrayList3 = arrayList12;
                            j7 = j11;
                            str3 = str7;
                            i4 = i7;
                            i2 = iM138425U3;
                            j6 = j9;
                            i = iM138438A;
                            iM138429p = m138429p(i6, kb00.m149010k(c17640aM138457e0.f112877a.f7785l));
                            arrayList4 = arrayList15;
                            arrayList4.add(c17640aM138457e0);
                            xmlPullParser2 = xmlPullParser2;
                        } else {
                            arrayList14 = arrayList14;
                            iM138429p = iM138429p2;
                            str = str4;
                            str2 = str2;
                            arrayList6 = arrayList6;
                            ske0VarM138469k0 = ske0VarM138469k0;
                            arrayList11 = arrayList11;
                            j6 = j9;
                            f = f3;
                            XmlPullParser xmlPullParser3 = xmlPullParser2;
                            arrayList = arrayList10;
                            i = iM138438A;
                            arrayList2 = arrayList8;
                            arrayList3 = arrayList12;
                            arrayList4 = arrayList15;
                            j7 = j11;
                            i2 = iM138425U3;
                            arrayList5 = arrayList9;
                            if (lmq0.m154887f(xmlPullParser3, "SegmentBase")) {
                                xmlPullParser2 = xmlPullParser3;
                                ske0VarM138469k0 = m138467j0(xmlPullParser3, (ske0.C20087e) ske0VarM138469k0);
                            } else if (lmq0.m154887f(xmlPullParser3, "SegmentList")) {
                                long jM138439B2 = m138439B(xmlPullParser3, j6);
                                arrayList15 = arrayList4;
                                xmlPullParser2 = xmlPullParser;
                                ske0VarM138469k0 = m138469k0(xmlPullParser2, (ske0.C20084b) ske0VarM138469k0, j4, j, j7, jM138439B2, j5);
                                arrayList12 = arrayList3;
                                str4 = str;
                                iM138429p2 = iM138429p;
                                arrayList11 = arrayList11;
                                j8 = jM138439B2;
                                iM138438A = i;
                                j9 = j8;
                            } else {
                                i3 = iM138429p;
                                xmlPullParser2 = xmlPullParser3;
                                arrayList15 = arrayList4;
                                if (lmq0.m154887f(xmlPullParser2, "SegmentTemplate")) {
                                    long jM138439B3 = m138439B(xmlPullParser2, j6);
                                    arrayList12 = arrayList3;
                                    ske0 ske0VarM138471l0 = m138471l0(xmlPullParser2, (ske0.C20085c) ske0VarM138469k0, arrayList12, j4, j, j7, jM138439B3, j5);
                                    j7 = j7;
                                    ske0VarM138469k0 = ske0VarM138471l0;
                                    str4 = str;
                                    iM138438A = i;
                                    iM138429p2 = i3;
                                    arrayList11 = arrayList11;
                                    j9 = jM138439B3;
                                } else {
                                    arrayList12 = arrayList3;
                                    if (lmq0.m154887f(xmlPullParser2, "InbandEventStream")) {
                                        arrayList11 = arrayList11;
                                        arrayList11.add(m138417I(xmlPullParser2, "InbandEventStream"));
                                    } else {
                                        arrayList11 = arrayList11;
                                        if (lmq0.m154887f(xmlPullParser2, "Label")) {
                                            strM138447V = m138447V(xmlPullParser);
                                        } else if (lmq0.m154886e(xmlPullParser2)) {
                                            m138487z(xmlPullParser);
                                        }
                                    }
                                    iM138438A = i;
                                    j8 = j6;
                                    str4 = str;
                                    iM138429p2 = i3;
                                    j9 = j8;
                                }
                            }
                        }
                        arrayList15 = arrayList4;
                        arrayList12 = arrayList3;
                        iM138438A = i;
                        arrayList11 = arrayList11;
                        j9 = j6;
                        str4 = str;
                        iM138429p2 = iM138429p;
                    }
                    arrayList14 = arrayList14;
                    str = str4;
                    str2 = str2;
                    arrayList6 = arrayList6;
                    arrayList12 = arrayList12;
                    ske0VarM138469k0 = ske0VarM138469k0;
                    arrayList15 = arrayList15;
                    arrayList11 = arrayList11;
                    f = f3;
                    arrayList = arrayList10;
                    i2 = iM138425U3;
                    arrayList5 = arrayList9;
                    arrayList2 = arrayList8;
                    j7 = j11;
                    long j12 = j9;
                    i3 = iM138429p2;
                    i = iM138438A;
                    j6 = j12;
                    iM138438A = i;
                    j8 = j6;
                    str4 = str;
                    iM138429p2 = i3;
                    j9 = j8;
                }
                f = f3;
                arrayList = arrayList10;
                i2 = iM138425U3;
                arrayList5 = arrayList9;
                arrayList2 = arrayList8;
                j7 = j11;
            }
            if (lmq0.m154885d(xmlPullParser2, "AdaptationSet")) {
                break;
            }
            iM138425U3 = i2;
            arrayList8 = arrayList2;
            arrayList9 = arrayList5;
            str2 = str2;
            arrayList15 = arrayList15;
            arrayList12 = arrayList12;
            ske0VarM138469k0 = ske0VarM138469k0;
            jM138439B = j7;
            f2 = f;
            arrayList10 = arrayList;
            arrayList6 = arrayList6;
            arrayList11 = arrayList11;
            arrayList14 = arrayList14;
        }
        List<t1d0> arrayList16 = new ArrayList<>(arrayList15.size());
        int i8 = 0;
        while (i8 < arrayList15.size()) {
            ArrayList<tvd> arrayList17 = arrayList11;
            arrayList16.add(m138466j((C17640a) arrayList15.get(i8), strM138447V, str5, arrayList6, arrayList17));
            i8++;
            arrayList11 = arrayList17;
        }
        return m138452c(jM138427X, iM138429p2, arrayList16, arrayList2, arrayList, arrayList12);
    }

    /* JADX INFO: renamed from: z */
    public void m138487z(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        m138437w(xmlPullParser);
    }
}
