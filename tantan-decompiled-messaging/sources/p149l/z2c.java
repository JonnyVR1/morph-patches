package p149l;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;
import android.util.Xml;
import androidx.annotation.Nullable;
import com.clevertap.android.sdk.Constants;
import com.google.android.exoplayer2.C1871k;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.metadata.emsg.EventMessage;
import com.google.android.exoplayer2.upstream.C2050d;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.immomo.momomediaext.sei.BaseSei;
import com.mp4parser.iso23001.part7.ProtectionSystemSpecificHeaderBox;
import com.p046p1.mobile.putong.core.data.Target;
import com.p046p1.mobile.putong.live.base.data.BLiveOperationTitleShowType;
import com.p046p1.mobile.putong.live.external.internal.virtualVoice.entry.LiveVoiceInternalEntryBean;
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
public class z2c extends DefaultHandler implements C2050d.a<y2c> {

    /* JADX INFO: renamed from: b */
    public static final Pattern f201175b = Pattern.compile("(\\d+)(?:/(\\d+))?");

    /* JADX INFO: renamed from: c */
    public static final Pattern f201176c = Pattern.compile("CC([1-4])=.*");

    /* JADX INFO: renamed from: d */
    public static final Pattern f201177d = Pattern.compile("([1-9]|[1-5][0-9]|6[0-3])=.*");

    /* JADX INFO: renamed from: e */
    public static final int[] f201178e = {-1, 1, 2, 3, 4, 5, 6, 8, 2, 3, 4, 7, 8, 24, 8, 12, 10, 12, 14, 12, 14};

    /* JADX INFO: renamed from: a */
    public final XmlPullParserFactory f201179a;

    /* JADX INFO: renamed from: l.z2c$a */
    public static final class C21605a {

        /* JADX INFO: renamed from: a */
        public final C1871k f201180a;

        /* JADX INFO: renamed from: b */
        public final ImmutableList<pr2> f201181b;

        /* JADX INFO: renamed from: c */
        public final nce0 f201182c;

        /* JADX INFO: renamed from: d */
        @Nullable
        public final String f201183d;

        /* JADX INFO: renamed from: e */
        public final ArrayList<DrmInitData.SchemeData> f201184e;

        /* JADX INFO: renamed from: f */
        public final ArrayList<fud> f201185f;

        /* JADX INFO: renamed from: g */
        public final long f201186g;

        /* JADX INFO: renamed from: h */
        public final List<fud> f201187h;

        /* JADX INFO: renamed from: i */
        public final List<fud> f201188i;

        public C21605a(C1871k c1871k, List<pr2> list, nce0 nce0Var, @Nullable String str, ArrayList<DrmInitData.SchemeData> arrayList, ArrayList<fud> arrayList2, List<fud> list2, List<fud> list3, long j) {
            this.f201180a = c1871k;
            this.f201181b = ImmutableList.copyOf((Collection) list);
            this.f201182c = nce0Var;
            this.f201183d = str;
            this.f201184e = arrayList;
            this.f201185f = arrayList2;
            this.f201187h = list2;
            this.f201188i = list3;
            this.f201186g = j;
        }
    }

    public z2c() {
        try {
            this.f201179a = XmlPullParserFactory.newInstance();
        } catch (XmlPullParserException e) {
            pkq0.m170054a("Couldn't create XmlPullParserFactory instance", e);
            throw null;
        }
    }

    /* JADX INFO: renamed from: D */
    public static int m216879D(List<fud> list) {
        String str;
        for (int i = 0; i < list.size(); i++) {
            fud fudVar = list.get(i);
            if ("urn:scte:dash:cc:cea-608:2015".equals(fudVar.f99334a) && (str = fudVar.f99335b) != null) {
                Matcher matcher = f201176c.matcher(str);
                if (matcher.matches()) {
                    return Integer.parseInt(matcher.group(1));
                }
                jwv.m143689i("MpdParser", "Unable to parse CEA-608 channel number from: " + fudVar.f99335b);
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: E */
    public static int m216880E(List<fud> list) {
        String str;
        for (int i = 0; i < list.size(); i++) {
            fud fudVar = list.get(i);
            if ("urn:scte:dash:cc:cea-708:2015".equals(fudVar.f99334a) && (str = fudVar.f99335b) != null) {
                Matcher matcher = f201177d.matcher(str);
                if (matcher.matches()) {
                    return Integer.parseInt(matcher.group(1));
                }
                jwv.m143689i("MpdParser", "Unable to parse CEA-708 service block number from: " + fudVar.f99335b);
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: H */
    public static long m216881H(XmlPullParser xmlPullParser, String str, long j) throws ParserException {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? j : vck0.m197820Q0(attributeValue);
    }

    /* JADX INFO: renamed from: I */
    public static fud m216882I(XmlPullParser xmlPullParser, String str) throws XmlPullParserException, IOException {
        String strM216897r0 = m216897r0(xmlPullParser, "schemeIdUri", "");
        String strM216897r1 = m216897r0(xmlPullParser, "value", null);
        String strM216897r2 = m216897r0(xmlPullParser, "id", null);
        do {
            xmlPullParser.next();
        } while (!gdq0.m125586d(xmlPullParser, str));
        return new fud(strM216897r0, strM216897r1, strM216897r2);
    }

    /* JADX INFO: renamed from: J */
    public static int m216883J(XmlPullParser xmlPullParser) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "value");
        if (attributeValue == null) {
            return -1;
        }
        String strM99804e = b11.m99804e(attributeValue);
        strM99804e.getClass();
        switch (strM99804e) {
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
    public static int m216884K(XmlPullParser xmlPullParser) {
        int iM216890U = m216890U(xmlPullParser, "value", -1);
        if (iM216890U <= 0 || iM216890U >= 33) {
            return -1;
        }
        return iM216890U;
    }

    /* JADX INFO: renamed from: L */
    public static int m216885L(XmlPullParser xmlPullParser) {
        int iBitCount;
        String attributeValue = xmlPullParser.getAttributeValue(null, "value");
        if (attributeValue == null || (iBitCount = Integer.bitCount(Integer.parseInt(attributeValue, 16))) == 0) {
            return -1;
        }
        return iBitCount;
    }

    /* JADX INFO: renamed from: M */
    public static long m216886M(XmlPullParser xmlPullParser, String str, long j) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? j : vck0.m197822R0(attributeValue);
    }

    /* JADX INFO: renamed from: N */
    public static String m216887N(List<fud> list) {
        for (int i = 0; i < list.size(); i++) {
            fud fudVar = list.get(i);
            String str = fudVar.f99334a;
            if ("tag:dolby.com,2018:dash:EC3_ExtensionType:2018".equals(str) && "JOC".equals(fudVar.f99335b)) {
                return "audio/eac3-joc";
            }
            if ("tag:dolby.com,2014:dash:DolbyDigitalPlusExtensionType:2014".equals(str) && "ec+3".equals(fudVar.f99335b)) {
                return "audio/eac3-joc";
            }
        }
        return "audio/eac3";
    }

    /* JADX INFO: renamed from: R */
    public static float m216888R(XmlPullParser xmlPullParser, String str, float f) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? f : Float.parseFloat(attributeValue);
    }

    /* JADX INFO: renamed from: S */
    public static float m216889S(XmlPullParser xmlPullParser, float f) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "frameRate");
        if (attributeValue != null) {
            Matcher matcher = f201175b.matcher(attributeValue);
            if (matcher.matches()) {
                int i = Integer.parseInt(matcher.group(1));
                String strGroup = matcher.group(2);
                return !TextUtils.isEmpty(strGroup) ? i / Integer.parseInt(strGroup) : i;
            }
        }
        return f;
    }

    /* JADX INFO: renamed from: U */
    public static int m216890U(XmlPullParser xmlPullParser, String str, int i) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? i : Integer.parseInt(attributeValue);
    }

    /* JADX INFO: renamed from: W */
    public static long m216891W(List<fud> list) {
        for (int i = 0; i < list.size(); i++) {
            fud fudVar = list.get(i);
            if (b11.m99800a("http://dashif.org/guidelines/last-segment-number", fudVar.f99334a)) {
                return Long.parseLong(fudVar.f99335b);
            }
        }
        return -1L;
    }

    /* JADX INFO: renamed from: X */
    public static long m216892X(XmlPullParser xmlPullParser, String str, long j) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? j : Long.parseLong(attributeValue);
    }

    /* JADX INFO: renamed from: Z */
    public static int m216893Z(XmlPullParser xmlPullParser) {
        int iM216890U = m216890U(xmlPullParser, "value", -1);
        if (iM216890U >= 0) {
            int[] iArr = f201178e;
            if (iM216890U < iArr.length) {
                return iArr[iM216890U];
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: p */
    public static int m216894p(int i, int i2) {
        if (i == -1) {
            return i2;
        }
        if (i2 == -1) {
            return i;
        }
        p11.m167013g(i == i2);
        return i;
    }

    @Nullable
    /* JADX INFO: renamed from: q */
    public static String m216895q(@Nullable String str, @Nullable String str2) {
        if (str == null) {
            return str2;
        }
        if (str2 == null) {
            return str;
        }
        p11.m167013g(str.equals(str2));
        return str;
    }

    /* JADX INFO: renamed from: r */
    public static void m216896r(ArrayList<DrmInitData.SchemeData> arrayList) {
        String str;
        int i = 0;
        while (true) {
            if (i >= arrayList.size()) {
                str = null;
                break;
            }
            DrmInitData.SchemeData schemeData = arrayList.get(i);
            if (ar3.f71230c.equals(schemeData.uuid) && (str = schemeData.licenseServerUrl) != null) {
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
            if (ar3.f71229b.equals(schemeData2.uuid) && schemeData2.licenseServerUrl == null) {
                arrayList.set(i2, new DrmInitData.SchemeData(ar3.f71230c, str, schemeData2.mimeType, schemeData2.data));
            }
        }
    }

    /* JADX INFO: renamed from: r0 */
    public static String m216897r0(XmlPullParser xmlPullParser, String str, String str2) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? str2 : attributeValue;
    }

    /* JADX INFO: renamed from: s */
    public static void m216898s(ArrayList<DrmInitData.SchemeData> arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            DrmInitData.SchemeData schemeData = arrayList.get(size);
            if (!schemeData.m9903c()) {
                for (int i = 0; i < arrayList.size(); i++) {
                    if (arrayList.get(i).m9901a(schemeData)) {
                        arrayList.remove(size);
                        break;
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: s0 */
    public static String m216899s0(XmlPullParser xmlPullParser, String str) throws XmlPullParserException, IOException {
        String text = "";
        do {
            xmlPullParser.next();
            if (xmlPullParser.getEventType() == 4) {
                text = xmlPullParser.getText();
            } else {
                m216902w(xmlPullParser);
            }
        } while (!gdq0.m125586d(xmlPullParser, str));
        return text;
    }

    /* JADX INFO: renamed from: t */
    public static long m216900t(long j, long j2) {
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
    public static String m216901u(@Nullable String str, @Nullable String str2) {
        if (n200.m157533o(str)) {
            return n200.m157521c(str2);
        }
        if (n200.m157537s(str)) {
            return n200.m157532n(str2);
        }
        if (n200.m157536r(str) || n200.m157534p(str)) {
            return str;
        }
        if (!"application/mp4".equals(str)) {
            return null;
        }
        String strM157525g = n200.m157525g(str2);
        return "text/vtt".equals(strM157525g) ? "application/x-mp4-vtt" : strM157525g;
    }

    /* JADX INFO: renamed from: w */
    public static void m216902w(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        if (gdq0.m125587e(xmlPullParser)) {
            int i = 1;
            while (i != 0) {
                xmlPullParser.next();
                if (gdq0.m125587e(xmlPullParser)) {
                    i++;
                } else if (gdq0.m125585c(xmlPullParser)) {
                    i--;
                }
            }
        }
    }

    /* JADX INFO: renamed from: A */
    public int m216903A(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        String strM216897r0 = m216897r0(xmlPullParser, "schemeIdUri", null);
        strM216897r0.getClass();
        int iM216884K = -1;
        switch (strM216897r0) {
            case "urn:dts:dash:audio_channel_configuration:2012":
            case "tag:dts.com,2014:dash:audio_channel_configuration:2012":
                iM216884K = m216884K(xmlPullParser);
                break;
            case "urn:mpeg:dash:23003:3:audio_channel_configuration:2011":
                iM216884K = m216890U(xmlPullParser, "value", -1);
                break;
            case "tag:dolby.com,2014:dash:audio_channel_configuration:2011":
            case "urn:dolby:dash:audio_channel_configuration:2011":
                iM216884K = m216883J(xmlPullParser);
                break;
            case "urn:mpeg:mpegB:cicp:ChannelConfiguration":
                iM216884K = m216893Z(xmlPullParser);
                break;
            case "tag:dts.com,2018:uhd:audio_channel_configuration":
                iM216884K = m216885L(xmlPullParser);
                break;
        }
        do {
            xmlPullParser.next();
        } while (!gdq0.m125586d(xmlPullParser, "AudioChannelConfiguration"));
        return iM216884K;
    }

    /* JADX INFO: renamed from: B */
    public long m216904B(XmlPullParser xmlPullParser, long j) {
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
    public List<pr2> m216905C(XmlPullParser xmlPullParser, List<pr2> list, boolean z) throws XmlPullParserException, IOException {
        String attributeValue = xmlPullParser.getAttributeValue(null, "dvb:priority");
        int i = attributeValue != null ? Integer.parseInt(attributeValue) : z ? 1 : Integer.MIN_VALUE;
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "dvb:weight");
        int i2 = attributeValue2 != null ? Integer.parseInt(attributeValue2) : 1;
        String attributeValue3 = xmlPullParser.getAttributeValue(null, "serviceLocation");
        String strM216899s0 = m216899s0(xmlPullParser, "BaseURL");
        if (evj0.m118281b(strM216899s0)) {
            if (attributeValue3 == null) {
                attributeValue3 = strM216899s0;
            }
            return Lists.m15926m(new pr2(strM216899s0, attributeValue3, i, i2));
        }
        ArrayList arrayList = new ArrayList();
        for (int i3 = 0; i3 < list.size(); i3++) {
            pr2 pr2Var = list.get(i3);
            String strM118283d = evj0.m118283d(pr2Var.f150850a, strM216899s0);
            String str = attributeValue3 == null ? strM118283d : attributeValue3;
            if (z) {
                i = pr2Var.f150852c;
                i2 = pr2Var.f150853d;
                str = pr2Var.f150851b;
            }
            arrayList.add(new pr2(strM118283d, str, i, i2));
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
    public Pair<String, DrmInitData.SchemeData> m216906F(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        String attributeValue;
        UUID uuid;
        UUID uuid2;
        ?? attributeValue2;
        ?? M172216b;
        String attributeValue3 = xmlPullParser.getAttributeValue(null, "schemeIdUri");
        if (attributeValue3 != null) {
            String strM99804e = b11.m99804e(attributeValue3);
            strM99804e.getClass();
            switch (strM99804e) {
                case "urn:uuid:e2719d58-a985-b3c9-781a-b030af78d30e":
                    uuid = ar3.f71230c;
                    attributeValue = null;
                    uuid2 = null;
                    attributeValue2 = uuid2;
                    M172216b = uuid2;
                    break;
                case "urn:uuid:9a04f079-9840-4286-ab92-e65be0885f95":
                    uuid = ar3.f71232e;
                    attributeValue = null;
                    uuid2 = null;
                    attributeValue2 = uuid2;
                    M172216b = uuid2;
                    break;
                case "urn:uuid:edef8ba9-79d6-4ace-a3c8-27dcd51d21ed":
                    uuid = ar3.f71231d;
                    attributeValue = null;
                    uuid2 = null;
                    attributeValue2 = uuid2;
                    M172216b = uuid2;
                    break;
                case "urn:mpeg:dash:mp4protection:2011":
                    attributeValue = xmlPullParser.getAttributeValue(null, "value");
                    String strM125584b = gdq0.m125584b(xmlPullParser, "default_KID");
                    if (!TextUtils.isEmpty(strM125584b) && !"00000000-0000-0000-0000-000000000000".equals(strM125584b)) {
                        String[] strArrSplit = strM125584b.split("\\s+");
                        UUID[] uuidArr = new UUID[strArrSplit.length];
                        for (int i = 0; i < strArrSplit.length; i++) {
                            uuidArr[i] = UUID.fromString(strArrSplit[i]);
                        }
                        uuid = ar3.f71229b;
                        attributeValue2 = 0;
                        M172216b = pza0.m172216b(uuid, uuidArr, null);
                        break;
                    } else {
                        uuid = null;
                        uuid2 = uuid;
                        attributeValue2 = uuid2;
                        M172216b = uuid2;
                        break;
                    }
                    break;
                default:
                    attributeValue = null;
                    uuid = null;
                    uuid2 = uuid;
                    attributeValue2 = uuid2;
                    M172216b = uuid2;
                    break;
            }
        } else {
            attributeValue = null;
            uuid = null;
            uuid2 = uuid;
            attributeValue2 = uuid2;
            M172216b = uuid2;
        }
        do {
            xmlPullParser.next();
            if (gdq0.m125588f(xmlPullParser, "clearkey:Laurl") && xmlPullParser.next() == 4) {
                M172216b = M172216b;
                attributeValue2 = xmlPullParser.getText();
            } else if (gdq0.m125588f(xmlPullParser, "ms:laurl")) {
                M172216b = M172216b;
                attributeValue2 = xmlPullParser.getAttributeValue(null, "licenseUrl");
            } else if (M172216b == 0 && gdq0.m125589g(xmlPullParser, ProtectionSystemSpecificHeaderBox.TYPE) && xmlPullParser.next() == 4) {
                byte[] bArrDecode = Base64.decode(xmlPullParser.getText(), 0);
                UUID uuidM172220f = pza0.m172220f(bArrDecode);
                if (uuidM172220f == null) {
                    jwv.m143689i("MpdParser", "Skipping malformed cenc:pssh data");
                    uuid = uuidM172220f;
                    M172216b = 0;
                    attributeValue2 = attributeValue2;
                } else {
                    M172216b = bArrDecode;
                    uuid = uuidM172220f;
                    attributeValue2 = attributeValue2;
                }
            } else if (M172216b == 0) {
                UUID uuid3 = ar3.f71232e;
                if (uuid3.equals(uuid) && gdq0.m125588f(xmlPullParser, "mspr:pro") && xmlPullParser.next() == 4) {
                    M172216b = pza0.m172215a(uuid3, Base64.decode(xmlPullParser.getText(), 0));
                    attributeValue2 = attributeValue2;
                } else {
                    m216902w(xmlPullParser);
                    M172216b = M172216b;
                    attributeValue2 = attributeValue2;
                }
            } else {
                m216902w(xmlPullParser);
                M172216b = M172216b;
                attributeValue2 = attributeValue2;
            }
        } while (!gdq0.m125586d(xmlPullParser, "ContentProtection"));
        return Pair.create(attributeValue, uuid != null ? new DrmInitData.SchemeData(uuid, attributeValue2, DLNAProfiles.DLNAMimeTypes.MIME_VIDEO_MPEG_4, M172216b) : null);
    }

    /* JADX INFO: renamed from: G */
    public int m216907G(XmlPullParser xmlPullParser) {
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
    public Pair<Long, EventMessage> m216908O(XmlPullParser xmlPullParser, String str, String str2, long j, long j2, ByteArrayOutputStream byteArrayOutputStream) throws XmlPullParserException, IOException {
        long jM216892X = m216892X(xmlPullParser, "id", 0L);
        long jM216892X2 = m216892X(xmlPullParser, BLiveOperationTitleShowType.duration, -9223372036854775807L);
        long jM216892X3 = m216892X(xmlPullParser, "presentationTime", 0L);
        long jM197832W0 = vck0.m197832W0(jM216892X2, 1000L, j);
        long jM197832W1 = vck0.m197832W0(jM216892X3 - j2, 1000000L, j);
        String strM216897r0 = m216897r0(xmlPullParser, "messageData", null);
        byte[] bArrM216909P = m216909P(xmlPullParser, byteArrayOutputStream);
        Long lValueOf = Long.valueOf(jM197832W1);
        if (strM216897r0 != null) {
            bArrM216909P = vck0.m197887r0(strM216897r0);
        }
        return Pair.create(lValueOf, m216919d(str, str2, jM216892X, jM197832W0, bArrM216909P));
    }

    /* JADX INFO: renamed from: P */
    public byte[] m216909P(XmlPullParser xmlPullParser, ByteArrayOutputStream byteArrayOutputStream) throws XmlPullParserException, IOException {
        byteArrayOutputStream.reset();
        XmlSerializer xmlSerializerNewSerializer = Xml.newSerializer();
        xmlSerializerNewSerializer.setOutput(byteArrayOutputStream, fs4.f99036c.name());
        xmlPullParser.nextToken();
        while (!gdq0.m125586d(xmlPullParser, "Event")) {
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
    public w4f m216910Q(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        z2c z2cVar;
        long j;
        String str;
        String str2;
        XmlPullParser xmlPullParser2;
        String strM216897r0 = m216897r0(xmlPullParser, "schemeIdUri", "");
        String strM216897r1 = m216897r0(xmlPullParser, "value", "");
        long jM216892X = m216892X(xmlPullParser, "timescale", 1L);
        long jM216892X2 = m216892X(xmlPullParser, "presentationTimeOffset", 0L);
        ArrayList arrayList = new ArrayList();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
        while (true) {
            xmlPullParser.next();
            if (gdq0.m125588f(xmlPullParser, "Event")) {
                z2cVar = this;
                j = jM216892X;
                str = strM216897r1;
                str2 = strM216897r0;
                xmlPullParser2 = xmlPullParser;
                arrayList.add(z2cVar.m216908O(xmlPullParser2, str2, str, j, jM216892X2, byteArrayOutputStream));
            } else {
                z2cVar = this;
                j = jM216892X;
                str = strM216897r1;
                str2 = strM216897r0;
                xmlPullParser2 = xmlPullParser;
                m216902w(xmlPullParser2);
            }
            if (gdq0.m125586d(xmlPullParser2, "EventStream")) {
                break;
            }
            this = z2cVar;
            xmlPullParser = xmlPullParser2;
            strM216897r0 = str2;
            strM216897r1 = str;
            jM216892X = j;
        }
        long[] jArr = new long[arrayList.size()];
        EventMessage[] eventMessageArr = new EventMessage[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            Pair pair = (Pair) arrayList.get(i);
            jArr[i] = ((Long) pair.first).longValue();
            eventMessageArr[i] = (EventMessage) pair.second;
        }
        return z2cVar.m216921e(str2, str, j, jArr, eventMessageArr);
    }

    /* JADX INFO: renamed from: T */
    public fcc0 m216911T(XmlPullParser xmlPullParser) {
        return m216920d0(xmlPullParser, "sourceURL", "range");
    }

    /* JADX INFO: renamed from: V */
    public String m216912V(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        return m216899s0(xmlPullParser, "Label");
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
    public y2c m216913Y(XmlPullParser xmlPullParser, Uri uri) throws XmlPullParserException, IOException {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        long j;
        ArrayList arrayList5;
        long j2;
        Throwable th;
        long j3;
        z2c z2cVar = this;
        boolean zM216947v = z2cVar.m216947v(z2cVar.m216916b0(xmlPullParser, "profiles", new String[0]));
        long jM216881H = m216881H(xmlPullParser, "availabilityStartTime", -9223372036854775807L);
        long jM216886M = m216886M(xmlPullParser, "mediaPresentationDuration", -9223372036854775807L);
        long jM216886M2 = m216886M(xmlPullParser, "minBufferTime", -9223372036854775807L);
        boolean zEquals = LiveVoiceInternalEntryBean.TYPE_IMAGE_STYLE_DYNAMIC.equals(xmlPullParser.getAttributeValue(null, "type"));
        long jM216886M3 = zEquals ? m216886M(xmlPullParser, "minimumUpdatePeriod", -9223372036854775807L) : -9223372036854775807L;
        long jM216886M4 = zEquals ? m216886M(xmlPullParser, "timeShiftBufferDepth", -9223372036854775807L) : -9223372036854775807L;
        long jM216886M5 = zEquals ? m216886M(xmlPullParser, "suggestedPresentationDelay", -9223372036854775807L) : -9223372036854775807L;
        long jM216881H2 = m216881H(xmlPullParser, "publishTime", -9223372036854775807L);
        long j4 = zEquals ? 0L : -9223372036854775807L;
        ArrayList arrayListM15926m = Lists.m15926m(new pr2(uri.toString(), uri.toString(), zM216947v ? 1 : Integer.MIN_VALUE, 1));
        ArrayList arrayList6 = new ArrayList();
        ArrayList arrayList7 = new ArrayList();
        long j5 = zEquals ? -9223372036854775807L : 0L;
        ArrayList arrayList8 = arrayListM15926m;
        long jM216904B = j4;
        boolean z = false;
        boolean z2 = false;
        iwa0 iwa0VarM216918c0 = null;
        fck0 fck0VarM216949w0 = null;
        Uri uriM118284e = null;
        hje0 hje0VarM216944q0 = null;
        while (true) {
            xmlPullParser.next();
            if (gdq0.m125588f(xmlPullParser, "BaseURL")) {
                if (!z2) {
                    jM216904B = z2cVar.m216904B(xmlPullParser, jM216904B);
                    z2 = true;
                }
                arrayList = arrayList8;
                arrayList2 = arrayList6;
                arrayList7.addAll(z2cVar.m216905C(xmlPullParser, arrayList, zM216947v));
            } else {
                arrayList = arrayList8;
                arrayList2 = arrayList6;
                if (gdq0.m125588f(xmlPullParser, "ProgramInformation")) {
                    iwa0VarM216918c0 = m216918c0(xmlPullParser);
                } else if (gdq0.m125588f(xmlPullParser, "UTCTiming")) {
                    fck0VarM216949w0 = m216949w0(xmlPullParser);
                } else if (gdq0.m125588f(xmlPullParser, "Location")) {
                    uriM118284e = evj0.m118284e(uri.toString(), xmlPullParser.nextText());
                } else {
                    if (gdq0.m125588f(xmlPullParser, "ServiceDescription")) {
                        hje0VarM216944q0 = m216944q0(xmlPullParser);
                    } else if (!gdq0.m125588f(xmlPullParser, "Period") || z) {
                        arrayList3 = arrayList7;
                        arrayList8 = arrayList;
                        long j6 = j5;
                        long j7 = jM216904B;
                        arrayList4 = arrayList2;
                        m216902w(xmlPullParser);
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
                        Pair<hj60, Long> pairM216914a0 = m216914a0(xmlPullParser, arrayList5, j5, jM216904B, jM216881H, jM216886M4, zM216947v);
                        hj60 hj60Var = (hj60) pairM216914a0.first;
                        if (hj60Var.f108037b != -9223372036854775807L) {
                            long jLongValue = ((Long) pairM216914a0.second).longValue();
                            j2 = jLongValue == -9223372036854775807L ? -9223372036854775807L : hj60Var.f108037b + jLongValue;
                            arrayList4.add(hj60Var);
                        } else {
                            if (!zEquals) {
                                throw ParserException.createForMalformedManifest("Unable to determine start of period " + arrayList4.size(), null);
                            }
                            j2 = j5;
                            z = true;
                        }
                        j = jM216904B;
                        j5 = j2;
                    }
                    if (gdq0.m125586d(xmlPullParser, "MPD")) {
                        if (jM216886M != -9223372036854775807L) {
                            th = null;
                            j3 = jM216886M;
                        } else if (j5 != -9223372036854775807L) {
                            j3 = j5;
                            th = null;
                        } else {
                            if (!zEquals) {
                                throw ParserException.createForMalformedManifest("Unable to determine duration of static manifest.", null);
                            }
                            th = null;
                            j3 = jM216886M;
                        }
                        if (arrayList4.isEmpty()) {
                            throw ParserException.createForMalformedManifest("No periods found.", th);
                        }
                        return m216925g(jM216881H, j3, jM216886M2, zEquals, jM216886M3, jM216886M4, jM216886M5, jM216881H2, iwa0VarM216918c0, fck0VarM216949w0, hje0VarM216944q0, uriM118284e, arrayList4);
                    }
                    long j8 = jM216886M4;
                    long j9 = jM216886M2;
                    ArrayList arrayList9 = arrayList4;
                    z2cVar = this;
                    zEquals = zEquals;
                    jM216886M3 = jM216886M3;
                    jM216904B = j;
                    arrayList6 = arrayList9;
                    arrayList7 = arrayList3;
                    jM216886M2 = j9;
                    jM216886M4 = j8;
                    jM216886M = jM216886M;
                }
            }
            arrayList3 = arrayList7;
            j = jM216904B;
            arrayList4 = arrayList2;
            arrayList8 = arrayList;
            if (gdq0.m125586d(xmlPullParser, "MPD")) {
                if (jM216886M != -9223372036854775807L) {
                    th = null;
                    j3 = jM216886M;
                } else if (j5 != -9223372036854775807L) {
                    j3 = j5;
                    th = null;
                } else {
                    if (!zEquals) {
                        throw ParserException.createForMalformedManifest("Unable to determine duration of static manifest.", null);
                    }
                    th = null;
                    j3 = jM216886M;
                }
                if (arrayList4.isEmpty()) {
                    return m216925g(jM216881H, j3, jM216886M2, zEquals, jM216886M3, jM216886M4, jM216886M5, jM216881H2, iwa0VarM216918c0, fck0VarM216949w0, hje0VarM216944q0, uriM118284e, arrayList4);
                }
                throw ParserException.createForMalformedManifest("No periods found.", th);
            }
            long j10 = jM216886M4;
            long j11 = jM216886M2;
            ArrayList arrayList10 = arrayList4;
            z2cVar = this;
            zEquals = zEquals;
            jM216886M3 = jM216886M3;
            jM216904B = j;
            arrayList6 = arrayList10;
            arrayList7 = arrayList3;
            jM216886M2 = j11;
            jM216886M4 = j10;
            jM216886M = jM216886M;
        }
    }

    /* JADX INFO: renamed from: a0 */
    public Pair<hj60, Long> m216914a0(XmlPullParser xmlPullParser, List<pr2> list, long j, long j2, long j3, long j4, boolean z) throws XmlPullParserException, IOException {
        long jM216904B;
        ArrayList arrayList;
        ArrayList arrayList2;
        long j5;
        Object obj;
        long j6;
        nce0 nce0VarM216936l0;
        long j7;
        long j8;
        nce0 nce0Var;
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
        long jM216886M = m216886M(xmlPullParser2, "start", j);
        long j10 = j3 != -9223372036854775807L ? j3 + jM216886M : -9223372036854775807L;
        long jM216886M2 = m216886M(xmlPullParser2, BLiveOperationTitleShowType.duration, -9223372036854775807L);
        ArrayList arrayList8 = new ArrayList();
        long j11 = -9223372036854775807L;
        ArrayList arrayList9 = new ArrayList();
        boolean z3 = false;
        fud fudVarM216882I = null;
        long jM216904B2 = j2;
        ArrayList arrayList10 = arrayList8;
        nce0 nce0Var2 = null;
        long j12 = -9223372036854775807L;
        ArrayList arrayList11 = new ArrayList();
        while (true) {
            xmlPullParser2.next();
            if (gdq0.m125588f(xmlPullParser2, "BaseURL")) {
                if (!z3) {
                    jM216904B2 = m216904B(xmlPullParser2, jM216904B2);
                    z3 = true;
                }
                arrayList11.addAll(m216905C(xmlPullParser2, list, z));
                arrayList2 = arrayList10;
                j7 = jM216904B2;
                arrayList = arrayList9;
                z2 = z3;
                j5 = j11;
                obj = null;
                jM216886M2 = jM216886M2;
                arrayList7 = arrayList11;
                fudVarM216882I = fudVarM216882I;
                xmlPullParser2 = xmlPullParser2;
                nce0Var = nce0Var2;
                j9 = j12;
                j10 = j10;
            } else {
                ArrayList arrayList12 = arrayList10;
                if (gdq0.m125588f(xmlPullParser2, "AdaptationSet")) {
                    if (arrayList11.isEmpty()) {
                        arrayList6 = arrayList11;
                        list2 = list;
                    } else {
                        ArrayList arrayList13 = arrayList11;
                        arrayList6 = arrayList13;
                        list2 = arrayList13;
                    }
                    ArrayList arrayList14 = arrayList9;
                    long j13 = jM216904B2;
                    long j14 = j10;
                    long j15 = jM216886M2;
                    c80 c80VarM216951y = m216951y(xmlPullParser2, list2, nce0Var2, j15, j13, j12, j14, j4, z);
                    j10 = j14;
                    jM216904B = j12;
                    arrayList12.add(c80VarM216951y);
                    jM216886M2 = j15;
                    arrayList = arrayList14;
                    obj = null;
                    j6 = j13;
                    arrayList2 = arrayList12;
                    j5 = -9223372036854775807L;
                    arrayList5 = arrayList6;
                } else {
                    ArrayList arrayList15 = arrayList11;
                    ArrayList arrayList16 = arrayList9;
                    long j16 = jM216904B2;
                    jM216904B = j12;
                    if (gdq0.m125588f(xmlPullParser2, "EventStream")) {
                        arrayList16.add(m216910Q(xmlPullParser));
                        jM216886M2 = jM216886M2;
                        arrayList = arrayList16;
                        arrayList2 = arrayList12;
                        j5 = -9223372036854775807L;
                        obj = null;
                        j6 = j16;
                        arrayList5 = arrayList15;
                    } else {
                        if (gdq0.m125588f(xmlPullParser2, "SegmentBase")) {
                            nce0VarM216936l0 = m216932j0(xmlPullParser2, null);
                            j7 = j16;
                            obj = null;
                            arrayList = arrayList16;
                            arrayList2 = arrayList12;
                            j5 = -9223372036854775807L;
                        } else if (gdq0.m125588f(xmlPullParser2, "SegmentList")) {
                            long j17 = j10;
                            long j18 = jM216886M2;
                            long jM216904B3 = m216904B(xmlPullParser2, -9223372036854775807L);
                            arrayList = arrayList16;
                            arrayList2 = arrayList12;
                            j5 = -9223372036854775807L;
                            nce0.C18673b c18673bM216934k0 = m216934k0(xmlPullParser2, null, j17, j18, j16, jM216904B3, j4);
                            j7 = j16;
                            obj = null;
                            j10 = j17;
                            jM216886M2 = j18;
                            fudVarM216882I = fudVarM216882I;
                            xmlPullParser2 = xmlPullParser2;
                            j8 = jM216904B3;
                            nce0Var = c18673bM216934k0;
                            arrayList3 = arrayList15;
                        } else {
                            nce0Var2 = nce0Var2;
                            arrayList = arrayList16;
                            arrayList2 = arrayList12;
                            j5 = -9223372036854775807L;
                            if (gdq0.m125588f(xmlPullParser2, "SegmentTemplate")) {
                                jM216904B = m216904B(xmlPullParser2, -9223372036854775807L);
                                obj = null;
                                nce0VarM216936l0 = m216936l0(xmlPullParser2, null, ImmutableList.m15685of(), j10, jM216886M2, j16, jM216904B, j4);
                                j7 = j16;
                            } else {
                                obj = null;
                                jM216886M2 = jM216886M2;
                                xmlPullParser2 = xmlPullParser2;
                                j6 = j16;
                                j10 = j10;
                                if (gdq0.m125588f(xmlPullParser2, "AssetIdentifier")) {
                                    fudVarM216882I = m216882I(xmlPullParser2, "AssetIdentifier");
                                    arrayList4 = arrayList15;
                                } else {
                                    m216902w(xmlPullParser2);
                                    arrayList4 = arrayList15;
                                }
                                j7 = j6;
                                fudVarM216882I = fudVarM216882I;
                                j8 = jM216904B;
                                nce0Var = nce0Var2;
                                arrayList3 = arrayList4;
                            }
                        }
                        j8 = jM216904B;
                        nce0Var = nce0VarM216936l0;
                        arrayList3 = arrayList15;
                    }
                    z2 = z3;
                    j9 = j8;
                    arrayList7 = arrayList3;
                }
                j10 = j10;
                arrayList4 = arrayList5;
                j7 = j6;
                fudVarM216882I = fudVarM216882I;
                j8 = jM216904B;
                nce0Var = nce0Var2;
                arrayList3 = arrayList4;
                z2 = z3;
                j9 = j8;
                arrayList7 = arrayList3;
            }
            if (gdq0.m125586d(xmlPullParser2, "Period")) {
                return Pair.create(m216927h(attributeValue, jM216886M, arrayList2, arrayList, fudVarM216882I), Long.valueOf(jM216886M2));
            }
            xmlPullParser2 = xmlPullParser2;
            j10 = j10;
            nce0Var2 = nce0Var;
            j12 = j9;
            arrayList11 = arrayList7;
            arrayList10 = arrayList2;
            fudVarM216882I = fudVarM216882I;
            z3 = z2;
            jM216886M2 = jM216886M2;
            j11 = j5;
            jM216904B2 = j7;
            arrayList9 = arrayList;
        }
    }

    /* JADX INFO: renamed from: b */
    public final long m216915b(List<nce0.C18675d> list, long j, long j2, int i, long j3) {
        int iM197875m = i >= 0 ? i + 1 : (int) vck0.m197875m(j3 - j, j2);
        for (int i2 = 0; i2 < iM197875m; i2++) {
            list.add(m216937m(j, j2));
            j += j2;
        }
        return j;
    }

    /* JADX INFO: renamed from: b0 */
    public String[] m216916b0(XmlPullParser xmlPullParser, String str, String[] strArr) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? strArr : attributeValue.split(Constants.SEPARATOR_COMMA);
    }

    /* JADX INFO: renamed from: c */
    public c80 m216917c(long j, int i, List<otc0> list, List<fud> list2, List<fud> list3, List<fud> list4) {
        return new c80(j, i, list, list2, list3, list4);
    }

    /* JADX INFO: renamed from: c0 */
    public iwa0 m216918c0(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        String strNextText = null;
        String strM216897r0 = m216897r0(xmlPullParser, "moreInformationURL", null);
        String strM216897r1 = m216897r0(xmlPullParser, "lang", null);
        String strNextText2 = null;
        String strNextText3 = null;
        while (true) {
            xmlPullParser.next();
            if (gdq0.m125588f(xmlPullParser, "Title")) {
                strNextText = xmlPullParser.nextText();
            } else if (gdq0.m125588f(xmlPullParser, "Source")) {
                strNextText2 = xmlPullParser.nextText();
            } else if (gdq0.m125588f(xmlPullParser, j6f.TAG_COPYRIGHT)) {
                strNextText3 = xmlPullParser.nextText();
            } else {
                m216902w(xmlPullParser);
            }
            String str = strNextText2;
            String str2 = strNextText;
            String str3 = strNextText3;
            if (gdq0.m125586d(xmlPullParser, "ProgramInformation")) {
                return new iwa0(str2, str, str3, strM216897r0, strM216897r1);
            }
            strNextText = str2;
            strNextText2 = str;
            strNextText3 = str3;
        }
    }

    /* JADX INFO: renamed from: d */
    public EventMessage m216919d(String str, String str2, long j, long j2, byte[] bArr) {
        return new EventMessage(str, str2, j2, j, bArr);
    }

    /* JADX INFO: renamed from: d0 */
    public fcc0 m216920d0(XmlPullParser xmlPullParser, String str, String str2) {
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
        return m216929i(attributeValue, j, j2);
    }

    /* JADX INFO: renamed from: e */
    public w4f m216921e(String str, String str2, long j, long[] jArr, EventMessage[] eventMessageArr) {
        return new w4f(str, str2, j, jArr, eventMessageArr);
    }

    /* JADX WARN: Code duplicated, block: B:55:0x0216 A[LOOP:0: B:3:0x006c->B:55:0x0216, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:56:0x01c7 A[EDGE_INSN: B:56:0x01c7->B:45:0x01c7 BREAK  A[LOOP:0: B:3:0x006c->B:55:0x0216], SYNTHETIC] */
    /* JADX INFO: renamed from: e0 */
    public C21605a m216922e0(XmlPullParser xmlPullParser, List<pr2> list, @Nullable String str, @Nullable String str2, int i, int i2, float f, int i3, int i4, @Nullable String str3, List<fud> list2, List<fud> list3, List<fud> list4, List<fud> list5, @Nullable nce0 nce0Var, long j, long j2, long j3, long j4, long j5, boolean z) throws XmlPullParserException, IOException {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        int iM216903A;
        nce0 nce0VarM216932j0;
        long j6;
        nce0 nce0VarM216936l0;
        ArrayList arrayList4;
        ArrayList arrayList5;
        ArrayList arrayList6;
        XmlPullParser xmlPullParser2 = xmlPullParser;
        String attributeValue = xmlPullParser2.getAttributeValue(null, "id");
        int iM216890U = m216890U(xmlPullParser2, "bandwidth", -1);
        String strM216897r0 = m216897r0(xmlPullParser2, "mimeType", str);
        String strM216897r1 = m216897r0(xmlPullParser2, "codecs", str2);
        int iM216890U2 = m216890U(xmlPullParser2, "width", i);
        int iM216890U3 = m216890U(xmlPullParser2, "height", i2);
        float fM216889S = m216889S(xmlPullParser2, f);
        int iM216890U4 = m216890U(xmlPullParser2, "audioSamplingRate", i4);
        ArrayList arrayList7 = new ArrayList();
        ArrayList arrayList8 = new ArrayList();
        ArrayList arrayList9 = new ArrayList(list4);
        ArrayList arrayList10 = new ArrayList(list5);
        int i5 = i3;
        long j7 = j4;
        String str4 = null;
        boolean z2 = false;
        nce0 nce0Var2 = nce0Var;
        long jM216904B = j3;
        ArrayList arrayList11 = new ArrayList();
        while (true) {
            xmlPullParser2.next();
            if (gdq0.m125588f(xmlPullParser2, "BaseURL")) {
                if (!z2) {
                    jM216904B = m216904B(xmlPullParser2, jM216904B);
                    z2 = true;
                }
                arrayList11.addAll(m216905C(xmlPullParser2, list, z));
                xmlPullParser2 = xmlPullParser2;
                arrayList6 = arrayList11;
                j7 = j7;
                iM216890U = iM216890U;
                iM216903A = i5;
                str4 = str4;
                z2 = z2;
                arrayList = arrayList8;
                nce0VarM216932j0 = nce0Var2;
                j6 = jM216904B;
            } else {
                arrayList = arrayList8;
                if (gdq0.m125588f(xmlPullParser2, "AudioChannelConfiguration")) {
                    nce0VarM216932j0 = nce0Var2;
                    iM216903A = m216903A(xmlPullParser);
                } else {
                    if (gdq0.m125588f(xmlPullParser2, "SegmentBase")) {
                        iM216903A = i5;
                        nce0VarM216932j0 = m216932j0(xmlPullParser2, (nce0.C18676e) nce0Var2);
                    } else {
                        if (gdq0.m125588f(xmlPullParser2, "SegmentList")) {
                            long jM216904B2 = m216904B(xmlPullParser2, j7);
                            arrayList4 = arrayList11;
                            arrayList2 = arrayList10;
                            iM216890U = iM216890U;
                            arrayList = arrayList;
                            nce0VarM216936l0 = m216934k0(xmlPullParser2, (nce0.C18673b) nce0Var2, j, j2, jM216904B, jM216904B2, j5);
                            arrayList3 = arrayList9;
                            j7 = jM216904B2;
                        } else {
                            ArrayList arrayList12 = arrayList11;
                            arrayList2 = arrayList10;
                            iM216890U = iM216890U;
                            arrayList = arrayList;
                            ArrayList arrayList13 = arrayList9;
                            if (gdq0.m125588f(xmlPullParser2, "SegmentTemplate")) {
                                long jM216904B3 = m216904B(xmlPullParser2, j7);
                                long j8 = jM216904B;
                                nce0VarM216936l0 = m216936l0(xmlPullParser2, (nce0.C18674c) nce0Var2, list5, j, j2, j8, jM216904B3, j5);
                                jM216904B = j8;
                                arrayList3 = arrayList13;
                                j7 = jM216904B3;
                                arrayList4 = arrayList12;
                            } else {
                                xmlPullParser2 = xmlPullParser2;
                                arrayList7 = arrayList7;
                                if (gdq0.m125588f(xmlPullParser2, "ContentProtection")) {
                                    Pair<String, DrmInitData.SchemeData> pairM216906F = m216906F(xmlPullParser);
                                    Object obj = pairM216906F.first;
                                    if (obj != null) {
                                        str4 = (String) obj;
                                    }
                                    Object obj2 = pairM216906F.second;
                                    if (obj2 != null) {
                                        arrayList7.add((DrmInitData.SchemeData) obj2);
                                    }
                                } else {
                                    if (gdq0.m125588f(xmlPullParser2, "InbandEventStream")) {
                                        arrayList.add(m216882I(xmlPullParser2, "InbandEventStream"));
                                    } else if (gdq0.m125588f(xmlPullParser2, "EssentialProperty")) {
                                        arrayList3 = arrayList13;
                                        arrayList3.add(m216882I(xmlPullParser2, "EssentialProperty"));
                                        arrayList10 = arrayList2;
                                    } else {
                                        arrayList3 = arrayList13;
                                        if (gdq0.m125588f(xmlPullParser2, "SupplementalProperty")) {
                                            arrayList10 = arrayList2;
                                            arrayList10.add(m216882I(xmlPullParser2, "SupplementalProperty"));
                                        } else {
                                            arrayList10 = arrayList2;
                                            m216902w(xmlPullParser2);
                                        }
                                    }
                                    j7 = j7;
                                    iM216903A = i5;
                                    str4 = str4;
                                    z2 = z2;
                                    nce0VarM216932j0 = nce0Var2;
                                    j6 = jM216904B;
                                    arrayList5 = arrayList12;
                                }
                                arrayList10 = arrayList2;
                                arrayList3 = arrayList13;
                                j7 = j7;
                                iM216903A = i5;
                                str4 = str4;
                                z2 = z2;
                                nce0VarM216932j0 = nce0Var2;
                                j6 = jM216904B;
                                arrayList5 = arrayList12;
                            }
                        }
                        iM216903A = i5;
                        str4 = str4;
                        z2 = z2;
                        nce0VarM216932j0 = nce0VarM216936l0;
                        j6 = jM216904B;
                        arrayList10 = arrayList2;
                        arrayList5 = arrayList4;
                    }
                    if (gdq0.m125586d(xmlPullParser2, "Representation")) {
                        break;
                    }
                    ArrayList arrayList14 = arrayList10;
                    arrayList9 = arrayList3;
                    arrayList7 = arrayList7;
                    arrayList8 = arrayList;
                    nce0Var2 = nce0VarM216932j0;
                    jM216904B = j6;
                    iM216890U = iM216890U;
                    j7 = j7;
                    z2 = z2;
                    str4 = str4;
                    arrayList10 = arrayList14;
                    i5 = iM216903A;
                    arrayList11 = arrayList5;
                    xmlPullParser2 = xmlPullParser;
                }
                j6 = jM216904B;
                arrayList6 = arrayList11;
            }
            arrayList7 = arrayList7;
            arrayList3 = arrayList9;
            arrayList5 = arrayList6;
            if (gdq0.m125586d(xmlPullParser2, "Representation")) {
                break;
                break;
            }
            ArrayList arrayList15 = arrayList10;
            arrayList9 = arrayList3;
            arrayList7 = arrayList7;
            arrayList8 = arrayList;
            nce0Var2 = nce0VarM216932j0;
            jM216904B = j6;
            iM216890U = iM216890U;
            j7 = j7;
            z2 = z2;
            str4 = str4;
            arrayList10 = arrayList15;
            i5 = iM216903A;
            arrayList11 = arrayList5;
            xmlPullParser2 = xmlPullParser;
        }
        ArrayList arrayList16 = arrayList7;
        List<fud> list6 = arrayList10;
        C1871k c1871kM216923f = m216923f(attributeValue, strM216897r0, iM216890U2, iM216890U3, fM216889S, iM216903A, iM216890U4, iM216890U, str3, list2, list3, strM216897r1, arrayList3, list6);
        if (nce0VarM216932j0 == null) {
            nce0VarM216932j0 = new nce0.C18676e();
        }
        boolean zIsEmpty = arrayList5.isEmpty();
        List list7 = arrayList5;
        if (zIsEmpty) {
            list7 = list;
        }
        return new C21605a(c1871kM216923f, list7, nce0VarM216932j0, str4, arrayList16, arrayList, arrayList3, list6, -1L);
    }

    /* JADX INFO: renamed from: f */
    public C1871k m216923f(@Nullable String str, @Nullable String str2, int i, int i2, float f, int i3, int i4, int i5, @Nullable String str3, List<fud> list, List<fud> list2, @Nullable String str4, List<fud> list3, List<fud> list4) {
        String str5 = str4;
        String strM216901u = m216901u(str2, str5);
        if ("audio/eac3".equals(strM216901u)) {
            strM216901u = m216887N(list4);
            if ("audio/eac3-joc".equals(strM216901u)) {
                str5 = "ec+3";
            }
        }
        int iM216943p0 = m216943p0(list);
        int iM216930i0 = m216930i0(list) | m216924f0(list2) | m216928h0(list3) | m216928h0(list4);
        Pair<Integer, Integer> pairM216945t0 = m216945t0(list3);
        C1871k.b bVarM10337X = new C1871k.b().m10334U(str).m10326M(str2).m10346g0(strM216901u).m10324K(str5).m10341b0(i5).m10348i0(iM216943p0).m10344e0(iM216930i0).m10337X(str3);
        int iM216880E = -1;
        C1871k.b bVarM10352m0 = bVarM10337X.m10351l0(pairM216945t0 != null ? ((Integer) pairM216945t0.first).intValue() : -1).m10352m0(pairM216945t0 != null ? ((Integer) pairM216945t0.second).intValue() : -1);
        if (n200.m157537s(strM216901u)) {
            bVarM10352m0.m10353n0(i).m10332S(i2).m10331R(f);
        } else if (n200.m157533o(strM216901u)) {
            bVarM10352m0.m10323J(i3).m10347h0(i4);
        } else if (n200.m157536r(strM216901u)) {
            if ("application/cea-608".equals(strM216901u)) {
                iM216880E = m216879D(list2);
            } else if ("application/cea-708".equals(strM216901u)) {
                iM216880E = m216880E(list2);
            }
            bVarM10352m0.m10321H(iM216880E);
        } else if (n200.m157534p(strM216901u)) {
            bVarM10352m0.m10353n0(i).m10332S(i2);
        }
        return bVarM10352m0.m10320G();
    }

    /* JADX INFO: renamed from: f0 */
    public int m216924f0(List<fud> list) {
        int iM216946u0;
        int i = 0;
        for (int i2 = 0; i2 < list.size(); i2++) {
            fud fudVar = list.get(i2);
            if (b11.m99800a("urn:mpeg:dash:role:2011", fudVar.f99334a)) {
                iM216946u0 = m216926g0(fudVar.f99335b);
            } else {
                if (b11.m99800a("urn:tva:metadata:cs:AudioPurposeCS:2007", fudVar.f99334a)) {
                    iM216946u0 = m216946u0(fudVar.f99335b);
                }
            }
            i |= iM216946u0;
        }
        return i;
    }

    /* JADX INFO: renamed from: g */
    public y2c m216925g(long j, long j2, long j3, boolean z, long j4, long j5, long j6, long j7, @Nullable iwa0 iwa0Var, @Nullable fck0 fck0Var, @Nullable hje0 hje0Var, @Nullable Uri uri, List<hj60> list) {
        return new y2c(j, j2, j3, z, j4, j5, j6, j7, iwa0Var, fck0Var, hje0Var, uri, list);
    }

    /* JADX INFO: renamed from: g0 */
    public int m216926g0(@Nullable String str) {
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
    public hj60 m216927h(@Nullable String str, long j, List<c80> list, List<w4f> list2, @Nullable fud fudVar) {
        return new hj60(str, j, list, list2, fudVar);
    }

    /* JADX INFO: renamed from: h0 */
    public int m216928h0(List<fud> list) {
        int i = 0;
        for (int i2 = 0; i2 < list.size(); i2++) {
            if (b11.m99800a("http://dashif.org/guidelines/trickmode", list.get(i2).f99334a)) {
                i = 16384;
            }
        }
        return i;
    }

    /* JADX INFO: renamed from: i */
    public fcc0 m216929i(String str, long j, long j2) {
        return new fcc0(str, j, j2);
    }

    /* JADX INFO: renamed from: i0 */
    public int m216930i0(List<fud> list) {
        int iM216926g0 = 0;
        for (int i = 0; i < list.size(); i++) {
            fud fudVar = list.get(i);
            if (b11.m99800a("urn:mpeg:dash:role:2011", fudVar.f99334a)) {
                iM216926g0 |= m216926g0(fudVar.f99335b);
            }
        }
        return iM216926g0;
    }

    /* JADX INFO: renamed from: j */
    public otc0 m216931j(C21605a c21605a, @Nullable String str, @Nullable String str2, ArrayList<DrmInitData.SchemeData> arrayList, ArrayList<fud> arrayList2) {
        C1871k.b bVarM10282b = c21605a.f201180a.m10282b();
        if (str != null) {
            bVarM10282b.m10336W(str);
        }
        String str3 = c21605a.f201183d;
        if (str3 != null) {
            str2 = str3;
        }
        ArrayList<DrmInitData.SchemeData> arrayList3 = c21605a.f201184e;
        arrayList3.addAll(arrayList);
        if (!arrayList3.isEmpty()) {
            m216896r(arrayList3);
            m216898s(arrayList3);
            bVarM10282b.m10328O(new DrmInitData(str2, arrayList3));
        }
        ArrayList<fud> arrayList4 = c21605a.f201185f;
        arrayList4.addAll(arrayList2);
        return otc0.m165935o(c21605a.f201186g, bVarM10282b.m10320G(), c21605a.f201181b, c21605a.f201182c, arrayList4, c21605a.f201187h, c21605a.f201188i, null);
    }

    /* JADX INFO: renamed from: j0 */
    public nce0.C18676e m216932j0(XmlPullParser xmlPullParser, @Nullable nce0.C18676e c18676e) throws XmlPullParserException, IOException {
        long jM216892X = m216892X(xmlPullParser, "timescale", c18676e != null ? c18676e.f138150b : 1L);
        long jM216892X2 = m216892X(xmlPullParser, "presentationTimeOffset", c18676e != null ? c18676e.f138151c : 0L);
        long j = c18676e != null ? c18676e.f138164d : 0L;
        long j2 = c18676e != null ? c18676e.f138165e : 0L;
        String attributeValue = xmlPullParser.getAttributeValue(null, "indexRange");
        if (attributeValue != null) {
            String[] strArrSplit = attributeValue.split("-");
            j = Long.parseLong(strArrSplit[0]);
            j2 = (Long.parseLong(strArrSplit[1]) - j) + 1;
        }
        long j3 = j2;
        fcc0 fcc0VarM216911T = c18676e != null ? c18676e.f138149a : null;
        while (true) {
            xmlPullParser.next();
            if (gdq0.m125588f(xmlPullParser, "Initialization")) {
                fcc0VarM216911T = m216911T(xmlPullParser);
            } else {
                m216902w(xmlPullParser);
            }
            fcc0 fcc0Var = fcc0VarM216911T;
            if (gdq0.m125586d(xmlPullParser, "SegmentBase")) {
                return m216939n(fcc0Var, jM216892X, jM216892X2, j, j3);
            }
            fcc0VarM216911T = fcc0Var;
        }
    }

    /* JADX INFO: renamed from: k */
    public nce0.C18673b m216933k(fcc0 fcc0Var, long j, long j2, long j3, long j4, @Nullable List<nce0.C18675d> list, long j5, @Nullable List<fcc0> list2, long j6, long j7) {
        return new nce0.C18673b(fcc0Var, j, j2, j3, j4, list, j5, list2, vck0.m197806J0(j6), vck0.m197806J0(j7));
    }

    /* JADX INFO: renamed from: k0 */
    public nce0.C18673b m216934k0(XmlPullParser xmlPullParser, @Nullable nce0.C18673b c18673b, long j, long j2, long j3, long j4, long j5) throws XmlPullParserException, IOException {
        long j6;
        long jM216892X = m216892X(xmlPullParser, "timescale", c18673b != null ? c18673b.f138150b : 1L);
        long jM216892X2 = m216892X(xmlPullParser, "presentationTimeOffset", c18673b != null ? c18673b.f138151c : 0L);
        long jM216892X3 = m216892X(xmlPullParser, BLiveOperationTitleShowType.duration, c18673b != null ? c18673b.f138153e : -9223372036854775807L);
        long jM216892X4 = m216892X(xmlPullParser, "startNumber", c18673b != null ? c18673b.f138152d : 1L);
        long jM216900t = m216900t(j3, j4);
        List<fcc0> arrayList = null;
        fcc0 fcc0VarM216911T = null;
        List<nce0.C18675d> listM216938m0 = null;
        while (true) {
            xmlPullParser.next();
            if (gdq0.m125588f(xmlPullParser, "Initialization")) {
                fcc0VarM216911T = m216911T(xmlPullParser);
                j6 = jM216892X;
            } else if (gdq0.m125588f(xmlPullParser, "SegmentTimeline")) {
                j6 = jM216892X;
                listM216938m0 = m216938m0(xmlPullParser, j6, j2);
            } else {
                j6 = jM216892X;
                if (gdq0.m125588f(xmlPullParser, "SegmentURL")) {
                    if (arrayList == null) {
                        arrayList = new ArrayList<>();
                    }
                    arrayList.add(m216940n0(xmlPullParser));
                } else {
                    m216902w(xmlPullParser);
                }
            }
            if (gdq0.m125586d(xmlPullParser, "SegmentList")) {
                break;
            }
            jM216892X = j6;
        }
        if (c18673b != null) {
            if (fcc0VarM216911T == null) {
                fcc0VarM216911T = c18673b.f138149a;
            }
            if (listM216938m0 == null) {
                listM216938m0 = c18673b.f138154f;
            }
            if (arrayList == null) {
                arrayList = c18673b.f138158j;
            }
        }
        return m216933k(fcc0VarM216911T, j6, jM216892X2, jM216892X4, jM216892X3, listM216938m0, jM216900t, arrayList, j5, j);
    }

    /* JADX INFO: renamed from: l */
    public nce0.C18674c m216935l(fcc0 fcc0Var, long j, long j2, long j3, long j4, long j5, List<nce0.C18675d> list, long j6, @Nullable uwj0 uwj0Var, @Nullable uwj0 uwj0Var2, long j7, long j8) {
        return new nce0.C18674c(fcc0Var, j, j2, j3, j4, j5, list, j6, uwj0Var, uwj0Var2, vck0.m197806J0(j7), vck0.m197806J0(j8));
    }

    /* JADX INFO: renamed from: l0 */
    public nce0.C18674c m216936l0(XmlPullParser xmlPullParser, @Nullable nce0.C18674c c18674c, List<fud> list, long j, long j2, long j3, long j4, long j5) throws XmlPullParserException, IOException {
        long j6;
        z2c z2cVar = this;
        long jM216892X = m216892X(xmlPullParser, "timescale", c18674c != null ? c18674c.f138150b : 1L);
        long jM216892X2 = m216892X(xmlPullParser, "presentationTimeOffset", c18674c != null ? c18674c.f138151c : 0L);
        long jM216892X3 = m216892X(xmlPullParser, BLiveOperationTitleShowType.duration, c18674c != null ? c18674c.f138153e : -9223372036854775807L);
        long jM216892X4 = m216892X(xmlPullParser, "startNumber", c18674c != null ? c18674c.f138152d : 1L);
        long jM216891W = m216891W(list);
        long jM216900t = m216900t(j3, j4);
        uwj0 uwj0VarM216948v0 = z2cVar.m216948v0(xmlPullParser, "media", c18674c != null ? c18674c.f138160k : null);
        uwj0 uwj0VarM216948v1 = z2cVar.m216948v0(xmlPullParser, JoinPoint.INITIALIZATION, c18674c != null ? c18674c.f138159j : null);
        fcc0 fcc0VarM216911T = null;
        List<nce0.C18675d> listM216938m0 = null;
        while (true) {
            xmlPullParser.next();
            if (gdq0.m125588f(xmlPullParser, "Initialization")) {
                fcc0VarM216911T = m216911T(xmlPullParser);
                j6 = jM216892X;
            } else if (gdq0.m125588f(xmlPullParser, "SegmentTimeline")) {
                j6 = jM216892X;
                listM216938m0 = z2cVar.m216938m0(xmlPullParser, j6, j2);
            } else {
                j6 = jM216892X;
                m216902w(xmlPullParser);
            }
            if (gdq0.m125586d(xmlPullParser, "SegmentTemplate")) {
                break;
            }
            z2cVar = this;
            jM216900t = jM216900t;
            jM216891W = jM216891W;
            jM216892X4 = jM216892X4;
            jM216892X2 = jM216892X2;
            jM216892X = j6;
        }
        if (c18674c != null) {
            if (fcc0VarM216911T == null) {
                fcc0VarM216911T = c18674c.f138149a;
            }
            if (listM216938m0 == null) {
                listM216938m0 = c18674c.f138154f;
            }
        }
        return m216935l(fcc0VarM216911T, j6, jM216892X2, jM216892X4, jM216891W, jM216892X3, listM216938m0, jM216900t, uwj0VarM216948v1, uwj0VarM216948v0, j5, j);
    }

    /* JADX INFO: renamed from: m */
    public nce0.C18675d m216937m(long j, long j2) {
        return new nce0.C18675d(j, j2);
    }

    /* JADX INFO: renamed from: m0 */
    public List<nce0.C18675d> m216938m0(XmlPullParser xmlPullParser, long j, long j2) throws XmlPullParserException, IOException {
        ArrayList arrayList = new ArrayList();
        long jM216915b = 0;
        long jM216892X = -9223372036854775807L;
        boolean z = false;
        int iM216890U = 0;
        do {
            xmlPullParser.next();
            if (gdq0.m125588f(xmlPullParser, j6f.LATITUDE_SOUTH)) {
                long jM216892X2 = m216892X(xmlPullParser, Constants.KEY_T, -9223372036854775807L);
                if (z) {
                    ArrayList arrayList2 = arrayList;
                    jM216915b = m216915b(arrayList2, jM216915b, jM216892X, iM216890U, jM216892X2);
                    arrayList = arrayList2;
                }
                if (jM216892X2 != -9223372036854775807L) {
                    jM216915b = jM216892X2;
                }
                jM216892X = m216892X(xmlPullParser, Constants.INAPP_DATA_TAG, -9223372036854775807L);
                iM216890U = m216890U(xmlPullParser, "r", 0);
                z = true;
            } else {
                m216902w(xmlPullParser);
            }
        } while (!gdq0.m125586d(xmlPullParser, "SegmentTimeline"));
        if (z) {
            m216915b(arrayList, jM216915b, jM216892X, iM216890U, vck0.m197832W0(j2, j, 1000L));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: n */
    public nce0.C18676e m216939n(fcc0 fcc0Var, long j, long j2, long j3, long j4) {
        return new nce0.C18676e(fcc0Var, j, j2, j3, j4);
    }

    /* JADX INFO: renamed from: n0 */
    public fcc0 m216940n0(XmlPullParser xmlPullParser) {
        return m216920d0(xmlPullParser, "media", "mediaRange");
    }

    /* JADX INFO: renamed from: o */
    public fck0 m216941o(String str, String str2) {
        return new fck0(str, str2);
    }

    /* JADX INFO: renamed from: o0 */
    public int m216942o0(@Nullable String str) {
        if (str == null) {
            return 0;
        }
        return (str.equals("forced_subtitle") || str.equals("forced-subtitle")) ? 2 : 0;
    }

    /* JADX INFO: renamed from: p0 */
    public int m216943p0(List<fud> list) {
        int iM216942o0 = 0;
        for (int i = 0; i < list.size(); i++) {
            fud fudVar = list.get(i);
            if (b11.m99800a("urn:mpeg:dash:role:2011", fudVar.f99334a)) {
                iM216942o0 |= m216942o0(fudVar.f99335b);
            }
        }
        return iM216942o0;
    }

    /* JADX INFO: renamed from: q0 */
    public hje0 m216944q0(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        long jM216892X = -9223372036854775807L;
        long jM216892X2 = -9223372036854775807L;
        long jM216892X3 = -9223372036854775807L;
        float fM216888R = -3.4028235E38f;
        float fM216888R2 = -3.4028235E38f;
        while (true) {
            xmlPullParser.next();
            if (gdq0.m125588f(xmlPullParser, "Latency")) {
                jM216892X = m216892X(xmlPullParser, Target.TYPE, -9223372036854775807L);
                jM216892X2 = m216892X(xmlPullParser, "min", -9223372036854775807L);
                jM216892X3 = m216892X(xmlPullParser, Constants.PRIORITY_MAX, -9223372036854775807L);
            } else if (gdq0.m125588f(xmlPullParser, "PlaybackRate")) {
                fM216888R = m216888R(xmlPullParser, "min", -3.4028235E38f);
                fM216888R2 = m216888R(xmlPullParser, Constants.PRIORITY_MAX, -3.4028235E38f);
            }
            long j = jM216892X;
            long j2 = jM216892X2;
            long j3 = jM216892X3;
            float f = fM216888R;
            float f2 = fM216888R2;
            if (gdq0.m125586d(xmlPullParser, "ServiceDescription")) {
                return new hje0(j, j2, j3, f, f2);
            }
            jM216892X = j;
            jM216892X2 = j2;
            jM216892X3 = j3;
            fM216888R = f;
            fM216888R2 = f2;
        }
    }

    @Nullable
    /* JADX INFO: renamed from: t0 */
    public Pair<Integer, Integer> m216945t0(List<fud> list) {
        String str;
        char c = 0;
        for (int i = 0; i < list.size(); i++) {
            fud fudVar = list.get(i);
            if ((b11.m99800a("http://dashif.org/thumbnail_tile", fudVar.f99334a) || b11.m99800a("http://dashif.org/guidelines/thumbnail_tile", fudVar.f99334a)) && (str = fudVar.f99335b) != null) {
                String[] strArrM197841a1 = vck0.m197841a1(str, BaseSei.f13930X);
                if (strArrM197841a1.length != 2) {
                    continue;
                } else {
                    try {
                        return Pair.create(Integer.valueOf(Integer.parseInt(strArrM197841a1[c])), Integer.valueOf(Integer.parseInt(strArrM197841a1[1])));
                    } catch (NumberFormatException unused) {
                        continue;
                    }
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: u0 */
    public int m216946u0(@Nullable String str) {
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
    public final boolean m216947v(String[] strArr) {
        for (String str : strArr) {
            if (str.startsWith("urn:dvb:dash:profile:dvb-dash:")) {
                return true;
            }
        }
        return false;
    }

    @Nullable
    /* JADX INFO: renamed from: v0 */
    public uwj0 m216948v0(XmlPullParser xmlPullParser, String str, @Nullable uwj0 uwj0Var) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue != null ? uwj0.m196130b(attributeValue) : uwj0Var;
    }

    /* JADX INFO: renamed from: w0 */
    public fck0 m216949w0(XmlPullParser xmlPullParser) {
        return m216941o(xmlPullParser.getAttributeValue(null, "schemeIdUri"), xmlPullParser.getAttributeValue(null, "value"));
    }

    @Override // com.google.android.exoplayer2.upstream.C2050d.a
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public y2c mo11019a(Uri uri, InputStream inputStream) throws IOException {
        try {
            XmlPullParser xmlPullParserNewPullParser = this.f201179a.newPullParser();
            xmlPullParserNewPullParser.setInput(inputStream, null);
            if (xmlPullParserNewPullParser.next() == 2 && "MPD".equals(xmlPullParserNewPullParser.getName())) {
                return m216913Y(xmlPullParserNewPullParser, uri);
            }
            throw ParserException.createForMalformedManifest("inputStream does not contain a valid media presentation description", null);
        } catch (XmlPullParserException e) {
            throw ParserException.createForMalformedManifest(null, e);
        }
    }

    /* JADX INFO: renamed from: y */
    public c80 m216951y(XmlPullParser xmlPullParser, List<pr2> list, @Nullable nce0 nce0Var, long j, long j2, long j3, long j4, long j5, boolean z) throws XmlPullParserException, IOException {
        int iM216894p;
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
        long jM216892X = m216892X(xmlPullParser2, "id", -1L);
        int iM216907G = m216907G(xmlPullParser);
        String attributeValue = xmlPullParser2.getAttributeValue(null, "mimeType");
        String attributeValue2 = xmlPullParser2.getAttributeValue(null, "codecs");
        int iM216890U = m216890U(xmlPullParser2, "width", -1);
        int iM216890U2 = m216890U(xmlPullParser2, "height", -1);
        float fM216889S = m216889S(xmlPullParser2, -1.0f);
        int iM216890U3 = m216890U(xmlPullParser2, "audioSamplingRate", -1);
        String str2 = "lang";
        String attributeValue3 = xmlPullParser2.getAttributeValue(null, "lang");
        String attributeValue4 = xmlPullParser2.getAttributeValue(null, com.google.firebase.messaging.Constants.ScionAnalytics.PARAM_LABEL);
        ArrayList<DrmInitData.SchemeData> arrayList6 = new ArrayList<>();
        ArrayList<fud> arrayList7 = new ArrayList<>();
        ArrayList arrayList8 = new ArrayList();
        ArrayList arrayList9 = new ArrayList();
        ArrayList arrayList10 = new ArrayList();
        ArrayList<fud> arrayList11 = arrayList7;
        ArrayList arrayList12 = new ArrayList();
        ArrayList arrayList13 = new ArrayList();
        ArrayList arrayList14 = new ArrayList();
        String str3 = attributeValue2;
        int iM216894p2 = iM216907G;
        long j9 = j3;
        ArrayList arrayList15 = arrayList13;
        int i4 = iM216890U;
        int i5 = iM216890U2;
        float f2 = fM216889S;
        String strM216912V = attributeValue4;
        String str4 = attributeValue3;
        boolean z2 = false;
        int iM216903A = -1;
        String str5 = null;
        nce0 nce0VarM216934k0 = nce0Var;
        String str6 = attributeValue;
        long jM216904B = j2;
        while (true) {
            xmlPullParser2.next();
            float f3 = f2;
            if (gdq0.m125588f(xmlPullParser2, "BaseURL")) {
                if (!z2) {
                    jM216904B = m216904B(xmlPullParser2, jM216904B);
                    z2 = true;
                }
                long j10 = jM216904B;
                arrayList14.addAll(m216905C(xmlPullParser2, list, z));
                arrayList14 = arrayList14;
                str2 = str2;
                arrayList6 = arrayList6;
                arrayList12 = arrayList12;
                nce0VarM216934k0 = nce0VarM216934k0;
                arrayList15 = arrayList15;
                arrayList11 = arrayList11;
                f = f3;
                arrayList = arrayList10;
                i2 = iM216890U3;
                arrayList5 = arrayList9;
                arrayList2 = arrayList8;
                j7 = j10;
            } else {
                long j11 = jM216904B;
                if (gdq0.m125588f(xmlPullParser2, "ContentProtection")) {
                    Pair<String, DrmInitData.SchemeData> pairM216906F = m216906F(xmlPullParser);
                    Object obj = pairM216906F.first;
                    if (obj != null) {
                        str5 = (String) obj;
                    }
                    Object obj2 = pairM216906F.second;
                    if (obj2 != null) {
                        arrayList6.add((DrmInitData.SchemeData) obj2);
                    }
                    arrayList14 = arrayList14;
                } else if (gdq0.m125588f(xmlPullParser2, "ContentComponent")) {
                    String strM216895q = m216895q(str4, xmlPullParser2.getAttributeValue(null, str2));
                    iM216894p2 = m216894p(iM216894p2, m216907G(xmlPullParser));
                    str4 = strM216895q;
                } else {
                    if (gdq0.m125588f(xmlPullParser2, "Role")) {
                        arrayList9.add(m216882I(xmlPullParser2, "Role"));
                    } else if (gdq0.m125588f(xmlPullParser2, "AudioChannelConfiguration")) {
                        iM216903A = m216903A(xmlPullParser);
                    } else if (gdq0.m125588f(xmlPullParser2, "Accessibility")) {
                        arrayList8.add(m216882I(xmlPullParser2, "Accessibility"));
                    } else if (gdq0.m125588f(xmlPullParser2, "EssentialProperty")) {
                        arrayList10.add(m216882I(xmlPullParser2, "EssentialProperty"));
                    } else if (gdq0.m125588f(xmlPullParser2, "SupplementalProperty")) {
                        arrayList12.add(m216882I(xmlPullParser2, "SupplementalProperty"));
                    } else {
                        if (gdq0.m125588f(xmlPullParser2, "Representation")) {
                            arrayList14 = arrayList14;
                            int i6 = iM216894p2;
                            str2 = str2;
                            String str7 = str3;
                            String str8 = str4;
                            int i7 = i4;
                            C21605a c21605aM216922e0 = m216922e0(xmlPullParser2, !arrayList14.isEmpty() ? arrayList14 : list, str6, str7, i7, i5, f3, iM216903A, iM216890U3, str8, arrayList9, arrayList8, arrayList10, arrayList12, nce0VarM216934k0, j4, j, j11, j9, j5, z);
                            str6 = str6;
                            i5 = i5;
                            str = str8;
                            arrayList5 = arrayList9;
                            arrayList = arrayList10;
                            nce0VarM216934k0 = nce0VarM216934k0;
                            f = f3;
                            arrayList2 = arrayList8;
                            arrayList3 = arrayList12;
                            j7 = j11;
                            str3 = str7;
                            i4 = i7;
                            i2 = iM216890U3;
                            j6 = j9;
                            i = iM216903A;
                            iM216894p = m216894p(i6, n200.m157529k(c21605aM216922e0.f201180a.f7748l));
                            arrayList4 = arrayList15;
                            arrayList4.add(c21605aM216922e0);
                            xmlPullParser2 = xmlPullParser2;
                        } else {
                            arrayList14 = arrayList14;
                            iM216894p = iM216894p2;
                            str = str4;
                            str2 = str2;
                            arrayList6 = arrayList6;
                            nce0VarM216934k0 = nce0VarM216934k0;
                            arrayList11 = arrayList11;
                            j6 = j9;
                            f = f3;
                            XmlPullParser xmlPullParser3 = xmlPullParser2;
                            arrayList = arrayList10;
                            i = iM216903A;
                            arrayList2 = arrayList8;
                            arrayList3 = arrayList12;
                            arrayList4 = arrayList15;
                            j7 = j11;
                            i2 = iM216890U3;
                            arrayList5 = arrayList9;
                            if (gdq0.m125588f(xmlPullParser3, "SegmentBase")) {
                                xmlPullParser2 = xmlPullParser3;
                                nce0VarM216934k0 = m216932j0(xmlPullParser3, (nce0.C18676e) nce0VarM216934k0);
                            } else if (gdq0.m125588f(xmlPullParser3, "SegmentList")) {
                                long jM216904B2 = m216904B(xmlPullParser3, j6);
                                arrayList15 = arrayList4;
                                xmlPullParser2 = xmlPullParser;
                                nce0VarM216934k0 = m216934k0(xmlPullParser2, (nce0.C18673b) nce0VarM216934k0, j4, j, j7, jM216904B2, j5);
                                arrayList12 = arrayList3;
                                str4 = str;
                                iM216894p2 = iM216894p;
                                arrayList11 = arrayList11;
                                j8 = jM216904B2;
                                iM216903A = i;
                                j9 = j8;
                            } else {
                                i3 = iM216894p;
                                xmlPullParser2 = xmlPullParser3;
                                arrayList15 = arrayList4;
                                if (gdq0.m125588f(xmlPullParser2, "SegmentTemplate")) {
                                    long jM216904B3 = m216904B(xmlPullParser2, j6);
                                    arrayList12 = arrayList3;
                                    nce0 nce0VarM216936l0 = m216936l0(xmlPullParser2, (nce0.C18674c) nce0VarM216934k0, arrayList12, j4, j, j7, jM216904B3, j5);
                                    j7 = j7;
                                    nce0VarM216934k0 = nce0VarM216936l0;
                                    str4 = str;
                                    iM216903A = i;
                                    iM216894p2 = i3;
                                    arrayList11 = arrayList11;
                                    j9 = jM216904B3;
                                } else {
                                    arrayList12 = arrayList3;
                                    if (gdq0.m125588f(xmlPullParser2, "InbandEventStream")) {
                                        arrayList11 = arrayList11;
                                        arrayList11.add(m216882I(xmlPullParser2, "InbandEventStream"));
                                    } else {
                                        arrayList11 = arrayList11;
                                        if (gdq0.m125588f(xmlPullParser2, "Label")) {
                                            strM216912V = m216912V(xmlPullParser);
                                        } else if (gdq0.m125587e(xmlPullParser2)) {
                                            m216952z(xmlPullParser);
                                        }
                                    }
                                    iM216903A = i;
                                    j8 = j6;
                                    str4 = str;
                                    iM216894p2 = i3;
                                    j9 = j8;
                                }
                            }
                        }
                        arrayList15 = arrayList4;
                        arrayList12 = arrayList3;
                        iM216903A = i;
                        arrayList11 = arrayList11;
                        j9 = j6;
                        str4 = str;
                        iM216894p2 = iM216894p;
                    }
                    arrayList14 = arrayList14;
                    str = str4;
                    str2 = str2;
                    arrayList6 = arrayList6;
                    arrayList12 = arrayList12;
                    nce0VarM216934k0 = nce0VarM216934k0;
                    arrayList15 = arrayList15;
                    arrayList11 = arrayList11;
                    f = f3;
                    arrayList = arrayList10;
                    i2 = iM216890U3;
                    arrayList5 = arrayList9;
                    arrayList2 = arrayList8;
                    j7 = j11;
                    long j12 = j9;
                    i3 = iM216894p2;
                    i = iM216903A;
                    j6 = j12;
                    iM216903A = i;
                    j8 = j6;
                    str4 = str;
                    iM216894p2 = i3;
                    j9 = j8;
                }
                f = f3;
                arrayList = arrayList10;
                i2 = iM216890U3;
                arrayList5 = arrayList9;
                arrayList2 = arrayList8;
                j7 = j11;
            }
            if (gdq0.m125586d(xmlPullParser2, "AdaptationSet")) {
                break;
            }
            iM216890U3 = i2;
            arrayList8 = arrayList2;
            arrayList9 = arrayList5;
            str2 = str2;
            arrayList15 = arrayList15;
            arrayList12 = arrayList12;
            nce0VarM216934k0 = nce0VarM216934k0;
            jM216904B = j7;
            f2 = f;
            arrayList10 = arrayList;
            arrayList6 = arrayList6;
            arrayList11 = arrayList11;
            arrayList14 = arrayList14;
        }
        List<otc0> arrayList16 = new ArrayList<>(arrayList15.size());
        int i8 = 0;
        while (i8 < arrayList15.size()) {
            ArrayList<fud> arrayList17 = arrayList11;
            arrayList16.add(m216931j((C21605a) arrayList15.get(i8), strM216912V, str5, arrayList6, arrayList17));
            i8++;
            arrayList11 = arrayList17;
        }
        return m216917c(jM216892X, iM216894p2, arrayList16, arrayList2, arrayList, arrayList12);
    }

    /* JADX INFO: renamed from: z */
    public void m216952z(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        m216902w(xmlPullParser);
    }
}
