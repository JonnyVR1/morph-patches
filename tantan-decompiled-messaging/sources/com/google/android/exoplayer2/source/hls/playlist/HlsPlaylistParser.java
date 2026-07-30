package com.google.android.exoplayer2.source.hls.playlist;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import androidx.annotation.Nullable;
import com.clevertap.android.sdk.Constants;
import com.google.android.exoplayer2.C1871k;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.source.hls.HlsTrackMetadataEntry;
import com.google.android.exoplayer2.upstream.C2050d;
import com.immomo.momomediaext.sei.BaseSei;
import com.p046p1.mobile.putong.data.RelationshipStatus;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;
import org.eclipse.jetty.util.security.Constraint;
import org.fourthline.cling.support.model.dlna.DLNAProfiles;
import p149l.aiq;
import p149l.ar3;
import p149l.evj0;
import p149l.jwv;
import p149l.lmr;
import p149l.n200;
import p149l.p11;
import p149l.pza0;
import p149l.vck0;
import p149l.w2l;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class HlsPlaylistParser implements C2050d.a<w2l> {

    /* JADX INFO: renamed from: a */
    public final C1964c f8551a;

    /* JADX INFO: renamed from: b */
    @Nullable
    public final C1963b f8552b;

    /* JADX INFO: renamed from: c */
    public static final Pattern f8527c = Pattern.compile("AVERAGE-BANDWIDTH=(\\d+)\\b");

    /* JADX INFO: renamed from: d */
    public static final Pattern f8528d = Pattern.compile("VIDEO=\"(.+?)\"");

    /* JADX INFO: renamed from: e */
    public static final Pattern f8529e = Pattern.compile("AUDIO=\"(.+?)\"");

    /* JADX INFO: renamed from: f */
    public static final Pattern f8530f = Pattern.compile("SUBTITLES=\"(.+?)\"");

    /* JADX INFO: renamed from: g */
    public static final Pattern f8531g = Pattern.compile("CLOSED-CAPTIONS=\"(.+?)\"");

    /* JADX INFO: renamed from: h */
    public static final Pattern f8532h = Pattern.compile("[^-]BANDWIDTH=(\\d+)\\b");

    /* JADX INFO: renamed from: i */
    public static final Pattern f8533i = Pattern.compile("CHANNELS=\"(.+?)\"");

    /* JADX INFO: renamed from: j */
    public static final Pattern f8534j = Pattern.compile("CODECS=\"(.+?)\"");

    /* JADX INFO: renamed from: k */
    public static final Pattern f8535k = Pattern.compile("RESOLUTION=(\\d+x\\d+)");

    /* JADX INFO: renamed from: l */
    public static final Pattern f8536l = Pattern.compile("FRAME-RATE=([\\d\\.]+)\\b");

    /* JADX INFO: renamed from: m */
    public static final Pattern f8537m = Pattern.compile("#EXT-X-TARGETDURATION:(\\d+)\\b");

    /* JADX INFO: renamed from: n */
    public static final Pattern f8538n = Pattern.compile("DURATION=([\\d\\.]+)\\b");

    /* JADX INFO: renamed from: o */
    public static final Pattern f8539o = Pattern.compile("PART-TARGET=([\\d\\.]+)\\b");

    /* JADX INFO: renamed from: p */
    public static final Pattern f8540p = Pattern.compile("#EXT-X-VERSION:(\\d+)\\b");

    /* JADX INFO: renamed from: q */
    public static final Pattern f8541q = Pattern.compile("#EXT-X-PLAYLIST-TYPE:(.+)\\b");

    /* JADX INFO: renamed from: r */
    public static final Pattern f8542r = Pattern.compile("CAN-SKIP-UNTIL=([\\d\\.]+)\\b");

    /* JADX INFO: renamed from: s */
    public static final Pattern f8543s = m11163c("CAN-SKIP-DATERANGES");

    /* JADX INFO: renamed from: t */
    public static final Pattern f8544t = Pattern.compile("SKIPPED-SEGMENTS=(\\d+)\\b");

    /* JADX INFO: renamed from: u */
    public static final Pattern f8545u = Pattern.compile("[:|,]HOLD-BACK=([\\d\\.]+)\\b");

    /* JADX INFO: renamed from: v */
    public static final Pattern f8546v = Pattern.compile("PART-HOLD-BACK=([\\d\\.]+)\\b");

    /* JADX INFO: renamed from: w */
    public static final Pattern f8547w = m11163c("CAN-BLOCK-RELOAD");

    /* JADX INFO: renamed from: x */
    public static final Pattern f8548x = Pattern.compile("#EXT-X-MEDIA-SEQUENCE:(\\d+)\\b");

    /* JADX INFO: renamed from: y */
    public static final Pattern f8549y = Pattern.compile("#EXTINF:([\\d\\.]+)\\b");

    /* JADX INFO: renamed from: z */
    public static final Pattern f8550z = Pattern.compile("#EXTINF:[\\d\\.]+\\b,(.+)");

    /* JADX INFO: renamed from: A */
    public static final Pattern f8499A = Pattern.compile("LAST-MSN=(\\d+)\\b");

    /* JADX INFO: renamed from: B */
    public static final Pattern f8500B = Pattern.compile("LAST-PART=(\\d+)\\b");

    /* JADX INFO: renamed from: C */
    public static final Pattern f8501C = Pattern.compile("TIME-OFFSET=(-?[\\d\\.]+)\\b");

    /* JADX INFO: renamed from: D */
    public static final Pattern f8502D = Pattern.compile("#EXT-X-BYTERANGE:(\\d+(?:@\\d+)?)\\b");

    /* JADX INFO: renamed from: E */
    public static final Pattern f8503E = Pattern.compile("BYTERANGE=\"(\\d+(?:@\\d+)?)\\b\"");

    /* JADX INFO: renamed from: F */
    public static final Pattern f8504F = Pattern.compile("BYTERANGE-START=(\\d+)\\b");

    /* JADX INFO: renamed from: G */
    public static final Pattern f8505G = Pattern.compile("BYTERANGE-LENGTH=(\\d+)\\b");

    /* JADX INFO: renamed from: H */
    public static final Pattern f8506H = Pattern.compile("METHOD=(NONE|AES-128|SAMPLE-AES|SAMPLE-AES-CENC|SAMPLE-AES-CTR)\\s*(?:,|$)");

    /* JADX INFO: renamed from: I */
    public static final Pattern f8507I = Pattern.compile("KEYFORMAT=\"(.+?)\"");

    /* JADX INFO: renamed from: J */
    public static final Pattern f8508J = Pattern.compile("KEYFORMATVERSIONS=\"(.+?)\"");

    /* JADX INFO: renamed from: K */
    public static final Pattern f8509K = Pattern.compile("URI=\"(.+?)\"");

    /* JADX INFO: renamed from: L */
    public static final Pattern f8510L = Pattern.compile("IV=([^,.*]+)");

    /* JADX INFO: renamed from: M */
    public static final Pattern f8511M = Pattern.compile("TYPE=(AUDIO|VIDEO|SUBTITLES|CLOSED-CAPTIONS)");

    /* JADX INFO: renamed from: N */
    public static final Pattern f8512N = Pattern.compile("TYPE=(PART|MAP)");

    /* JADX INFO: renamed from: O */
    public static final Pattern f8513O = Pattern.compile("LANGUAGE=\"(.+?)\"");

    /* JADX INFO: renamed from: P */
    public static final Pattern f8514P = Pattern.compile("NAME=\"(.+?)\"");

    /* JADX INFO: renamed from: Q */
    public static final Pattern f8515Q = Pattern.compile("GROUP-ID=\"(.+?)\"");

    /* JADX INFO: renamed from: R */
    public static final Pattern f8516R = Pattern.compile("CHARACTERISTICS=\"(.+?)\"");

    /* JADX INFO: renamed from: S */
    public static final Pattern f8517S = Pattern.compile("INSTREAM-ID=\"((?:CC|SERVICE)\\d+)\"");

    /* JADX INFO: renamed from: T */
    public static final Pattern f8518T = m11163c("AUTOSELECT");

    /* JADX INFO: renamed from: U */
    public static final Pattern f8519U = m11163c(RelationshipStatus.DEFAULT);

    /* JADX INFO: renamed from: V */
    public static final Pattern f8520V = m11163c("FORCED");

    /* JADX INFO: renamed from: W */
    public static final Pattern f8521W = m11163c("INDEPENDENT");

    /* JADX INFO: renamed from: X */
    public static final Pattern f8522X = m11163c("GAP");

    /* JADX INFO: renamed from: Y */
    public static final Pattern f8523Y = m11163c("PRECISE");

    /* JADX INFO: renamed from: Z */
    public static final Pattern f8524Z = Pattern.compile("VALUE=\"(.+?)\"");

    /* JADX INFO: renamed from: a0 */
    public static final Pattern f8525a0 = Pattern.compile("IMPORT=\"(.+?)\"");

    /* JADX INFO: renamed from: b0 */
    public static final Pattern f8526b0 = Pattern.compile("\\{\\$([a-zA-Z0-9\\-_]+)\\}");

    public static final class DeltaUpdateException extends IOException {
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistParser$a */
    public static class C1958a {

        /* JADX INFO: renamed from: a */
        public final BufferedReader f8553a;

        /* JADX INFO: renamed from: b */
        public final Queue<String> f8554b;

        /* JADX INFO: renamed from: c */
        @Nullable
        public String f8555c;

        public C1958a(Queue<String> queue, BufferedReader bufferedReader) {
            this.f8554b = queue;
            this.f8553a = bufferedReader;
        }

        @EnsuresNonNullIf(expression = {"next"}, result = true)
        /* JADX INFO: renamed from: a */
        public boolean m11187a() throws IOException {
            String strTrim;
            if (this.f8555c != null) {
                return true;
            }
            if (!this.f8554b.isEmpty()) {
                this.f8555c = (String) p11.m167011e(this.f8554b.poll());
                return true;
            }
            do {
                String line = this.f8553a.readLine();
                this.f8555c = line;
                if (line == null) {
                    return false;
                }
                strTrim = line.trim();
                this.f8555c = strTrim;
            } while (strTrim.isEmpty());
            return true;
        }

        /* JADX INFO: renamed from: b */
        public String m11188b() throws IOException {
            if (!m11187a()) {
                lmr.m150601a();
                return null;
            }
            String str = this.f8555c;
            this.f8555c = null;
            return str;
        }
    }

    public HlsPlaylistParser(C1964c c1964c, @Nullable C1963b c1963b) {
        this.f8551a = c1964c;
        this.f8552b = c1963b;
    }

    /* JADX INFO: renamed from: A */
    public static long m11159A(String str, Pattern pattern) throws ParserException {
        return new BigDecimal(m11185z(str, pattern, Collections.EMPTY_MAP)).multiply(new BigDecimal(1000000L)).longValue();
    }

    /* JADX INFO: renamed from: B */
    public static String m11160B(String str, Map<String, String> map) {
        Matcher matcher = f8526b0.matcher(str);
        StringBuffer stringBuffer = new StringBuffer();
        while (matcher.find()) {
            String strGroup = matcher.group(1);
            if (map.containsKey(strGroup)) {
                matcher.appendReplacement(stringBuffer, Matcher.quoteReplacement(map.get(strGroup)));
            }
        }
        matcher.appendTail(stringBuffer);
        return stringBuffer.toString();
    }

    /* JADX INFO: renamed from: C */
    public static int m11161C(BufferedReader bufferedReader, boolean z, int i) throws IOException {
        while (i != -1 && Character.isWhitespace(i) && (z || !vck0.m197794D0(i))) {
            i = bufferedReader.read();
        }
        return i;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m11162b(BufferedReader bufferedReader) throws IOException {
        int i = bufferedReader.read();
        if (i == 239) {
            if (bufferedReader.read() != 187 || bufferedReader.read() != 191) {
                return false;
            }
            i = bufferedReader.read();
        }
        int iM11161C = m11161C(bufferedReader, true, i);
        for (int i2 = 0; i2 < 7; i2++) {
            if (iM11161C != "#EXTM3U".charAt(i2)) {
                return false;
            }
            iM11161C = bufferedReader.read();
        }
        return vck0.m197794D0(m11161C(bufferedReader, false, iM11161C));
    }

    /* JADX INFO: renamed from: c */
    public static Pattern m11163c(String str) {
        return Pattern.compile(str + "=(NO|YES)");
    }

    /* JADX INFO: renamed from: d */
    public static DrmInitData m11164d(@Nullable String str, DrmInitData.SchemeData[] schemeDataArr) {
        DrmInitData.SchemeData[] schemeDataArr2 = new DrmInitData.SchemeData[schemeDataArr.length];
        for (int i = 0; i < schemeDataArr.length; i++) {
            schemeDataArr2[i] = schemeDataArr[i].m9902b(null);
        }
        return new DrmInitData(str, schemeDataArr2);
    }

    @Nullable
    /* JADX INFO: renamed from: e */
    public static String m11165e(long j, @Nullable String str, @Nullable String str2) {
        if (str == null) {
            return null;
        }
        return str2 != null ? str2 : Long.toHexString(j);
    }

    @Nullable
    /* JADX INFO: renamed from: f */
    public static C1964c.b m11166f(ArrayList<C1964c.b> arrayList, String str) {
        for (int i = 0; i < arrayList.size(); i++) {
            C1964c.b bVar = arrayList.get(i);
            if (str.equals(bVar.f8644d)) {
                return bVar;
            }
        }
        return null;
    }

    @Nullable
    /* JADX INFO: renamed from: g */
    public static C1964c.b m11167g(ArrayList<C1964c.b> arrayList, String str) {
        for (int i = 0; i < arrayList.size(); i++) {
            C1964c.b bVar = arrayList.get(i);
            if (str.equals(bVar.f8645e)) {
                return bVar;
            }
        }
        return null;
    }

    @Nullable
    /* JADX INFO: renamed from: h */
    public static C1964c.b m11168h(ArrayList<C1964c.b> arrayList, String str) {
        for (int i = 0; i < arrayList.size(); i++) {
            C1964c.b bVar = arrayList.get(i);
            if (str.equals(bVar.f8643c)) {
                return bVar;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: j */
    public static double m11169j(String str, Pattern pattern) throws ParserException {
        return Double.parseDouble(m11185z(str, pattern, Collections.EMPTY_MAP));
    }

    @Nullable
    /* JADX INFO: renamed from: k */
    public static DrmInitData.SchemeData m11170k(String str, String str2, Map<String, String> map) throws ParserException {
        String strM11180u = m11180u(str, f8508J, "1", map);
        if ("urn:uuid:edef8ba9-79d6-4ace-a3c8-27dcd51d21ed".equals(str2)) {
            String strM11185z = m11185z(str, f8509K, map);
            return new DrmInitData.SchemeData(ar3.f71231d, DLNAProfiles.DLNAMimeTypes.MIME_VIDEO_MPEG_4, Base64.decode(strM11185z.substring(strM11185z.indexOf(44)), 0));
        }
        if ("com.widevine".equals(str2)) {
            return new DrmInitData.SchemeData(ar3.f71231d, "hls", vck0.m197887r0(str));
        }
        if (!"com.microsoft.playready".equals(str2) || !"1".equals(strM11180u)) {
            return null;
        }
        String strM11185z2 = m11185z(str, f8509K, map);
        byte[] bArrDecode = Base64.decode(strM11185z2.substring(strM11185z2.indexOf(44)), 0);
        UUID uuid = ar3.f71232e;
        return new DrmInitData.SchemeData(uuid, DLNAProfiles.DLNAMimeTypes.MIME_VIDEO_MPEG_4, pza0.m172215a(uuid, bArrDecode));
    }

    /* JADX INFO: renamed from: l */
    public static String m11171l(String str) {
        return ("SAMPLE-AES-CENC".equals(str) || "SAMPLE-AES-CTR".equals(str)) ? "cenc" : "cbcs";
    }

    /* JADX INFO: renamed from: m */
    public static int m11172m(String str, Pattern pattern) throws ParserException {
        return Integer.parseInt(m11185z(str, pattern, Collections.EMPTY_MAP));
    }

    /* JADX INFO: renamed from: n */
    public static long m11173n(String str, Pattern pattern) throws ParserException {
        return Long.parseLong(m11185z(str, pattern, Collections.EMPTY_MAP));
    }

    /* JADX WARN: Code duplicated, block: B:114:0x0322 A[PHI: r13
      0x0322: PHI (r13v7 java.lang.String) = (r13v5 java.lang.String), (r13v2 java.lang.String) binds: [B:118:0x0331, B:112:0x0315] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:228:0x0624  */
    /* JADX WARN: Code duplicated, block: B:230:0x0631  */
    /* JADX WARN: Code duplicated, block: B:233:0x0647  */
    /* JADX INFO: renamed from: o */
    public static C1963b m11174o(C1964c c1964c, @Nullable C1963b c1963b, C1958a c1958a, String str) throws IOException {
        String str2;
        C1963b.d dVar;
        int i;
        long j;
        long j2;
        long j3;
        C1963b.d dVar2;
        long j4;
        boolean z;
        DrmInitData drmInitData;
        DrmInitData drmInitDataM11164d;
        C1963b.d dVar3;
        c1964c = c1964c;
        C1963b c1963b2 = c1963b;
        boolean z2 = c1964c.f184250c;
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        C1963b.f fVar = new C1963b.f(-9223372036854775807L, false, -9223372036854775807L, -9223372036854775807L, false);
        TreeMap treeMap = new TreeMap();
        boolean z3 = z2;
        long j5 = -9223372036854775807L;
        long jM11169j = -9223372036854775807L;
        long j6 = 0;
        long j7 = 0;
        long jM197806J0 = 0;
        long j8 = 0;
        long jM11173n = 0;
        long jM11159A = 0;
        long j9 = 0;
        String strM11180u = "";
        String str3 = strM11180u;
        boolean zM11176q = false;
        String strM11171l = null;
        DrmInitData drmInitData2 = null;
        C1963b.b bVar = null;
        int i2 = 0;
        boolean z4 = false;
        DrmInitData drmInitDataM11164d2 = null;
        String str4 = null;
        long j10 = -1;
        boolean z5 = false;
        boolean z6 = false;
        int i3 = 0;
        C1963b.d dVar4 = null;
        int i4 = 0;
        String strM11185z = null;
        long j11 = -1;
        boolean z7 = false;
        long jM11172m = -9223372036854775807L;
        long j12 = 0;
        int iM11172m = 1;
        while (c1958a.m11187a()) {
            String strM11188b = c1958a.m11188b();
            if (strM11188b.startsWith("#EXT")) {
                arrayList4.add(strM11188b);
            }
            if (strM11188b.startsWith("#EXT-X-PLAYLIST-TYPE")) {
                String strM11185z2 = m11185z(strM11188b, f8541q, map);
                if ("VOD".equals(strM11185z2)) {
                    i2 = 1;
                } else if ("EVENT".equals(strM11185z2)) {
                    i2 = 2;
                }
            } else if (strM11188b.equals("#EXT-X-I-FRAMES-ONLY")) {
                z7 = true;
            } else {
                if (strM11188b.startsWith("#EXT-X-START")) {
                    ArrayList arrayList5 = arrayList4;
                    fVar = fVar;
                    long jM11169j2 = (long) (m11169j(strM11188b, f8501C) * 1000000.0d);
                    zM11176q = m11176q(strM11188b, f8523Y, false);
                    arrayList4 = arrayList5;
                    j5 = jM11169j2;
                } else {
                    ArrayList arrayList6 = arrayList4;
                    fVar = fVar;
                    if (strM11188b.startsWith("#EXT-X-SERVER-CONTROL")) {
                        fVar = m11184y(strM11188b);
                        arrayList4 = arrayList6;
                    } else if (strM11188b.startsWith("#EXT-X-PART-INF")) {
                        jM11169j = (long) (m11169j(strM11188b, f8539o) * 1000000.0d);
                        arrayList4 = arrayList6;
                    } else if (strM11188b.startsWith("#EXT-X-MAP")) {
                        String strM11185z3 = m11185z(strM11188b, f8509K, map);
                        boolean z8 = zM11176q;
                        String strM11181v = m11181v(strM11188b, f8503E, map);
                        if (strM11181v != null) {
                            String[] strArrM197841a1 = vck0.m197841a1(strM11181v, "@");
                            j10 = Long.parseLong(strArrM197841a1[0]);
                            if (strArrM197841a1.length > 1) {
                                j6 = Long.parseLong(strArrM197841a1[1]);
                            }
                        }
                        long j13 = j10;
                        long j14 = j13 == j11 ? 0L : j6;
                        if (strM11185z != null && str4 == null) {
                            throw ParserException.createForMalformedManifest("The encryption IV attribute must be present when an initialization segment is encrypted with METHOD=AES-128.", null);
                        }
                        C1963b.d dVar5 = new C1963b.d(strM11185z3, j14, j13, strM11185z, str4);
                        String str5 = str4;
                        if (j13 != j11) {
                            j14 += j13;
                        }
                        str4 = str5;
                        arrayList4 = arrayList6;
                        dVar4 = dVar5;
                        j6 = j14;
                        j10 = j11;
                        fVar = fVar;
                        zM11176q = z8;
                    } else {
                        zM11176q = zM11176q;
                        arrayList4 = arrayList6;
                        str4 = str4;
                        strM11185z = strM11185z;
                        if (strM11188b.startsWith("#EXT-X-TARGETDURATION")) {
                            jM11172m = 1000000 * ((long) m11172m(strM11188b, f8537m));
                        } else if (strM11188b.startsWith("#EXT-X-MEDIA-SEQUENCE")) {
                            jM11173n = m11173n(strM11188b, f8548x);
                            j12 = jM11173n;
                            fVar = fVar;
                            zM11176q = zM11176q;
                            arrayList4 = arrayList4;
                        } else if (strM11188b.startsWith("#EXT-X-VERSION")) {
                            iM11172m = m11172m(strM11188b, f8540p);
                        } else {
                            if (strM11188b.startsWith("#EXT-X-DEFINE")) {
                                String strM11181v2 = m11181v(strM11188b, f8525a0, map);
                                if (strM11181v2 != null) {
                                    String str6 = c1964c.f8635l.get(strM11181v2);
                                    if (str6 != null) {
                                        map.put(strM11181v2, str6);
                                    }
                                } else {
                                    map.put(m11185z(strM11188b, f8514P, map), m11185z(strM11188b, f8524Z, map));
                                }
                                treeMap = treeMap;
                                str2 = str3;
                            } else if (strM11188b.startsWith("#EXTINF")) {
                                jM11159A = m11159A(strM11188b, f8549y);
                                strM11180u = m11180u(strM11188b, f8550z, str3, map);
                            } else {
                                String str7 = str3;
                                if (strM11188b.startsWith("#EXT-X-SKIP")) {
                                    int iM11172m2 = m11172m(strM11188b, f8544t);
                                    p11.m167013g(c1963b2 != null && arrayList.isEmpty());
                                    str2 = str7;
                                    int i5 = (int) (j12 - ((C1963b) vck0.m197866j(c1963b2)).f8591k);
                                    int i6 = iM11172m2 + i5;
                                    if (i5 < 0 || i6 > c1963b2.f8598r.size()) {
                                        throw new DeltaUpdateException();
                                    }
                                    strM11185z = strM11185z;
                                    str4 = str4;
                                    long j15 = j7;
                                    while (i5 < i6) {
                                        C1963b.d dVarM11260b = c1963b2.f8598r.get(i5);
                                        int i7 = i5;
                                        if (j12 != c1963b2.f8591k) {
                                            dVarM11260b = dVarM11260b.m11260b(j15, (c1963b2.f8590j - i3) + dVarM11260b.f8613d);
                                        }
                                        arrayList.add(dVarM11260b);
                                        j8 = j15 + dVarM11260b.f8612c;
                                        long j16 = dVarM11260b.f8619j;
                                        if (j16 != j11) {
                                            j6 = dVarM11260b.f8618i + j16;
                                        }
                                        int i8 = dVarM11260b.f8613d;
                                        C1963b.d dVar6 = dVarM11260b.f8611b;
                                        drmInitData2 = dVarM11260b.f8615f;
                                        String str8 = dVarM11260b.f8616g;
                                        String str9 = dVarM11260b.f8617h;
                                        int i9 = i6;
                                        if (str9 == null || !str9.equals(Long.toHexString(jM11173n))) {
                                            str4 = dVarM11260b.f8617h;
                                        }
                                        jM11173n++;
                                        i4 = i8;
                                        dVar4 = dVar6;
                                        strM11185z = str8;
                                        j15 = j8;
                                        i5 = i7 + 1;
                                        i6 = i9;
                                    }
                                    j7 = j15;
                                } else {
                                    str2 = str7;
                                    if (strM11188b.startsWith("#EXT-X-KEY")) {
                                        String strM11185z4 = m11185z(strM11188b, f8506H, map);
                                        String strM11180u2 = m11180u(strM11188b, f8507I, "identity", map);
                                        if (Constraint.NONE.equals(strM11185z4)) {
                                            treeMap.clear();
                                            drmInitData2 = null;
                                            str4 = null;
                                            strM11185z = null;
                                        } else {
                                            String strM11181v3 = m11181v(strM11188b, f8510L, map);
                                            if (!"identity".equals(strM11180u2)) {
                                                if (strM11171l == null) {
                                                    strM11171l = m11171l(strM11185z4);
                                                }
                                                DrmInitData.SchemeData schemeDataM11170k = m11170k(strM11188b, strM11180u2, map);
                                                if (schemeDataM11170k != null) {
                                                    treeMap.put(strM11180u2, schemeDataM11170k);
                                                    str4 = strM11181v3;
                                                    drmInitData2 = null;
                                                    strM11185z = null;
                                                } else {
                                                    str4 = strM11181v3;
                                                    strM11185z = null;
                                                }
                                            } else if ("AES-128".equals(strM11185z4)) {
                                                strM11185z = m11185z(strM11188b, f8509K, map);
                                                str4 = strM11181v3;
                                            } else {
                                                str4 = strM11181v3;
                                                strM11185z = null;
                                            }
                                        }
                                    } else {
                                        if (strM11188b.startsWith("#EXT-X-BYTERANGE")) {
                                            String[] strArrM197841a2 = vck0.m197841a1(m11185z(strM11188b, f8502D, map), "@");
                                            j10 = Long.parseLong(strArrM197841a2[0]);
                                            if (strArrM197841a2.length > 1) {
                                                j6 = Long.parseLong(strArrM197841a2[1]);
                                            }
                                        } else if (strM11188b.startsWith("#EXT-X-DISCONTINUITY-SEQUENCE")) {
                                            i3 = Integer.parseInt(strM11188b.substring(strM11188b.indexOf(58) + 1));
                                            c1964c = c1964c;
                                            strM11185z = strM11185z;
                                            str4 = str4;
                                            fVar = fVar;
                                            zM11176q = zM11176q;
                                            arrayList4 = arrayList4;
                                            str3 = str2;
                                            z6 = true;
                                        } else if (strM11188b.equals("#EXT-X-DISCONTINUITY")) {
                                            i4++;
                                        } else if (strM11188b.startsWith("#EXT-X-PROGRAM-DATE-TIME")) {
                                            if (jM197806J0 == 0) {
                                                jM197806J0 = vck0.m197806J0(vck0.m197820Q0(strM11188b.substring(strM11188b.indexOf(58) + 1))) - j7;
                                            } else {
                                                treeMap = treeMap;
                                            }
                                        } else if (strM11188b.equals("#EXT-X-GAP")) {
                                            c1964c = c1964c;
                                            strM11185z = strM11185z;
                                            str4 = str4;
                                            fVar = fVar;
                                            zM11176q = zM11176q;
                                            arrayList4 = arrayList4;
                                            str3 = str2;
                                            z5 = true;
                                        } else if (strM11188b.equals("#EXT-X-INDEPENDENT-SEGMENTS")) {
                                            c1964c = c1964c;
                                            strM11185z = strM11185z;
                                            str4 = str4;
                                            fVar = fVar;
                                            zM11176q = zM11176q;
                                            arrayList4 = arrayList4;
                                            str3 = str2;
                                            z3 = true;
                                        } else if (strM11188b.equals("#EXT-X-ENDLIST")) {
                                            c1964c = c1964c;
                                            strM11185z = strM11185z;
                                            str4 = str4;
                                            fVar = fVar;
                                            zM11176q = zM11176q;
                                            arrayList4 = arrayList4;
                                            str3 = str2;
                                            z4 = true;
                                        } else if (strM11188b.startsWith("#EXT-X-RENDITION-REPORT")) {
                                            treeMap = treeMap;
                                            arrayList3.add(new C1963b.c(Uri.parse(evj0.m118283d(str, m11185z(strM11188b, f8509K, map))), m11179t(strM11188b, f8499A, j11), m11178s(strM11188b, f8500B, -1)));
                                        } else {
                                            treeMap = treeMap;
                                            if (!strM11188b.startsWith("#EXT-X-PRELOAD-HINT")) {
                                                j = jM11173n;
                                                if (strM11188b.startsWith("#EXT-X-PART")) {
                                                    String strM11165e = m11165e(j, strM11185z, str4);
                                                    String strM11185z5 = m11185z(strM11188b, f8509K, map);
                                                    long jM11169j3 = (long) (m11169j(strM11188b, f8538n) * 1000000.0d);
                                                    boolean zM11176q2 = m11176q(strM11188b, f8521W, false) | (z3 && arrayList2.isEmpty());
                                                    boolean zM11176q3 = m11176q(strM11188b, f8522X, false);
                                                    String strM11181v4 = m11181v(strM11188b, f8503E, map);
                                                    if (strM11181v4 != null) {
                                                        String[] strArrM197841a3 = vck0.m197841a1(strM11181v4, "@");
                                                        long j17 = Long.parseLong(strArrM197841a3[0]);
                                                        if (strArrM197841a3.length > 1) {
                                                            j9 = Long.parseLong(strArrM197841a3[1]);
                                                        }
                                                        j2 = j17;
                                                    } else {
                                                        j2 = -1;
                                                    }
                                                    long j18 = j2 == -1 ? 0L : j9;
                                                    if (drmInitData2 == null && !treeMap.isEmpty()) {
                                                        DrmInitData.SchemeData[] schemeDataArr = (DrmInitData.SchemeData[]) treeMap.values().toArray(new DrmInitData.SchemeData[0]);
                                                        drmInitData2 = new DrmInitData(strM11171l, schemeDataArr);
                                                        if (drmInitDataM11164d2 == null) {
                                                            drmInitDataM11164d2 = m11164d(strM11171l, schemeDataArr);
                                                        }
                                                    }
                                                    DrmInitData drmInitData3 = drmInitData2;
                                                    C1963b.d dVar7 = dVar4;
                                                    int i10 = i4;
                                                    arrayList2.add(new C1963b.b(strM11185z5, dVar4, jM11169j3, i4, j8, drmInitData3, strM11185z, strM11165e, j18, j2, zM11176q3, zM11176q2, false));
                                                    j8 += jM11169j3;
                                                    if (j2 != -1) {
                                                        j18 += j2;
                                                    }
                                                    j9 = j18;
                                                    dVar4 = dVar7;
                                                    strM11185z = strM11185z;
                                                    jM11173n = j;
                                                    i4 = i10;
                                                    drmInitData2 = drmInitData3;
                                                    str3 = str2;
                                                } else {
                                                    dVar = dVar4;
                                                    i = i4;
                                                    if (strM11188b.startsWith("#")) {
                                                        j7 = j7;
                                                        c1964c = c1964c;
                                                        dVar4 = dVar;
                                                        strM11185z = strM11185z;
                                                        str4 = str4;
                                                        jM11173n = j;
                                                        strM11180u = strM11180u;
                                                        jM11159A = jM11159A;
                                                        j7 = j7;
                                                        j6 = j6;
                                                        fVar = fVar;
                                                        zM11176q = zM11176q;
                                                        arrayList4 = arrayList4;
                                                        str3 = str2;
                                                        treeMap = treeMap;
                                                        j11 = -1;
                                                        c1963b2 = c1963b;
                                                        i4 = i;
                                                    } else {
                                                        long j19 = j7;
                                                        String strM11165e2 = m11165e(j, strM11185z, str4);
                                                        jM11173n = j + 1;
                                                        String strM11160B = m11160B(strM11188b, map);
                                                        C1963b.d dVar8 = (C1963b.d) map2.get(strM11160B);
                                                        if (j10 == -1) {
                                                            dVar2 = dVar8;
                                                            j4 = 0;
                                                        } else {
                                                            if (z7 && dVar == null && dVar8 == null) {
                                                                j3 = j6;
                                                                dVar8 = new C1963b.d(strM11160B, 0L, j3, null, null);
                                                                map2.put(strM11160B, dVar8);
                                                            } else {
                                                                j3 = j6;
                                                            }
                                                            dVar2 = dVar8;
                                                            j4 = j3;
                                                        }
                                                        if (drmInitData2 != null || treeMap.isEmpty()) {
                                                            z = false;
                                                        } else {
                                                            z = false;
                                                            DrmInitData.SchemeData[] schemeDataArr2 = (DrmInitData.SchemeData[]) treeMap.values().toArray(new DrmInitData.SchemeData[0]);
                                                            drmInitData2 = new DrmInitData(strM11171l, schemeDataArr2);
                                                            if (drmInitDataM11164d2 == null) {
                                                                drmInitDataM11164d = m11164d(strM11171l, schemeDataArr2);
                                                                drmInitData = drmInitData2;
                                                            }
                                                            if (dVar != null) {
                                                                dVar3 = dVar;
                                                            } else {
                                                                dVar3 = dVar2;
                                                            }
                                                            long j20 = jM11159A;
                                                            arrayList.add(new C1963b.d(strM11160B, dVar3, strM11180u, j20, i, j19, drmInitData, strM11185z, strM11165e2, j4, j10, z5, arrayList2));
                                                            j8 = j19 + j20;
                                                            arrayList2 = new ArrayList();
                                                            if (j10 != -1) {
                                                                j4 += j10;
                                                            }
                                                            j6 = j4;
                                                            dVar4 = dVar;
                                                            strM11185z = strM11185z;
                                                            drmInitDataM11164d2 = drmInitDataM11164d;
                                                            z5 = z;
                                                            i4 = i;
                                                            drmInitData2 = drmInitData;
                                                            j7 = j8;
                                                            jM11159A = 0;
                                                            strM11180u = str2;
                                                            str3 = strM11180u;
                                                            j10 = -1;
                                                        }
                                                        drmInitData = drmInitData2;
                                                        drmInitDataM11164d = drmInitDataM11164d2;
                                                        if (dVar != null) {
                                                            dVar3 = dVar;
                                                        } else {
                                                            dVar3 = dVar2;
                                                        }
                                                        long j21 = jM11159A;
                                                        arrayList.add(new C1963b.d(strM11160B, dVar3, strM11180u, j21, i, j19, drmInitData, strM11185z, strM11165e2, j4, j10, z5, arrayList2));
                                                        j8 = j19 + j21;
                                                        arrayList2 = new ArrayList();
                                                        if (j10 != -1) {
                                                            j4 += j10;
                                                        }
                                                        j6 = j4;
                                                        dVar4 = dVar;
                                                        strM11185z = strM11185z;
                                                        drmInitDataM11164d2 = drmInitDataM11164d;
                                                        z5 = z;
                                                        i4 = i;
                                                        drmInitData2 = drmInitData;
                                                        j7 = j8;
                                                        jM11159A = 0;
                                                        strM11180u = str2;
                                                        str3 = strM11180u;
                                                        j10 = -1;
                                                    }
                                                }
                                                j11 = -1;
                                                c1963b2 = c1963b;
                                            } else if (bVar == null && "PART".equals(m11185z(strM11188b, f8512N, map))) {
                                                String strM11185z6 = m11185z(strM11188b, f8509K, map);
                                                long jM11179t = m11179t(strM11188b, f8504F, -1L);
                                                long jM11179t2 = m11179t(strM11188b, f8505G, -1L);
                                                long j22 = jM11173n;
                                                String strM11165e3 = m11165e(j22, strM11185z, str4);
                                                if (drmInitData2 == null && !treeMap.isEmpty()) {
                                                    DrmInitData.SchemeData[] schemeDataArr3 = (DrmInitData.SchemeData[]) treeMap.values().toArray(new DrmInitData.SchemeData[0]);
                                                    drmInitData2 = new DrmInitData(strM11171l, schemeDataArr3);
                                                    if (drmInitDataM11164d2 == null) {
                                                        drmInitDataM11164d2 = m11164d(strM11171l, schemeDataArr3);
                                                    }
                                                }
                                                DrmInitData drmInitData4 = drmInitData2;
                                                if (jM11179t == -1 || jM11179t2 != -1) {
                                                    bVar = new C1963b.b(strM11185z6, dVar4, 0L, i4, j8, drmInitData4, strM11185z, strM11165e3, jM11179t != -1 ? jM11179t : 0L, jM11179t2, false, false, true);
                                                }
                                                c1964c = c1964c;
                                                c1963b2 = c1963b;
                                                strM11185z = strM11185z;
                                                str4 = str4;
                                                jM11173n = j22;
                                                drmInitData2 = drmInitData4;
                                                fVar = fVar;
                                                zM11176q = zM11176q;
                                                arrayList4 = arrayList4;
                                                str3 = str2;
                                                treeMap = treeMap;
                                                j11 = -1;
                                            }
                                        }
                                        strM11185z = strM11185z;
                                        str4 = str4;
                                    }
                                }
                                fVar = fVar;
                                zM11176q = zM11176q;
                                arrayList4 = arrayList4;
                                str3 = str2;
                            }
                            dVar = dVar4;
                            i = i4;
                            j = jM11173n;
                            c1964c = c1964c;
                            dVar4 = dVar;
                            strM11185z = strM11185z;
                            str4 = str4;
                            jM11173n = j;
                            strM11180u = strM11180u;
                            jM11159A = jM11159A;
                            j7 = j7;
                            j6 = j6;
                            fVar = fVar;
                            zM11176q = zM11176q;
                            arrayList4 = arrayList4;
                            str3 = str2;
                            treeMap = treeMap;
                            j11 = -1;
                            c1963b2 = c1963b;
                            i4 = i;
                        }
                        fVar = fVar;
                        zM11176q = zM11176q;
                        arrayList4 = arrayList4;
                    }
                }
                fVar = fVar;
            }
        }
        boolean z9 = zM11176q;
        ArrayList arrayList7 = arrayList4;
        C1963b.f fVar2 = fVar;
        HashMap map3 = new HashMap();
        for (int i11 = 0; i11 < arrayList3.size(); i11++) {
            C1963b.c cVar = (C1963b.c) arrayList3.get(i11);
            long size = cVar.f8606b;
            if (size == -1) {
                size = (j12 + ((long) arrayList.size())) - (arrayList2.isEmpty() ? 1L : 0L);
            }
            int size2 = cVar.f8607c;
            if (size2 == -1 && jM11169j != -9223372036854775807L) {
                size2 = (arrayList2.isEmpty() ? ((C1963b.d) aiq.m96881g(arrayList)).f8609m : arrayList2).size() - 1;
            }
            Uri uri = cVar.f8605a;
            map3.put(uri, new C1963b.c(uri, size, size2));
        }
        if (bVar != null) {
            arrayList2.add(bVar);
        }
        return new C1963b(i2, str, arrayList7, j5, z9, jM197806J0, z6, i3, j12, iM11172m, jM11172m, jM11169j, z3, z4, jM197806J0 != 0, drmInitDataM11164d2, arrayList, arrayList2, fVar2, map3);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:82:0x02fc  */
    /* JADX WARN: Failed to find 'out' block for switch in B:99:0x032a. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: p */
    public static C1964c m11175p(C1958a c1958a, String str) throws IOException {
        ArrayList arrayList;
        String strM157525g;
        ArrayList arrayList2;
        int i;
        String str2;
        ArrayList arrayList3;
        String strM157525g2;
        int i2;
        int i3;
        Uri uriM118284e;
        int i4;
        String str3 = str;
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        ArrayList arrayList7 = new ArrayList();
        ArrayList arrayList8 = new ArrayList();
        ArrayList arrayList9 = new ArrayList();
        ArrayList arrayList10 = new ArrayList();
        ArrayList arrayList11 = new ArrayList();
        boolean z = false;
        boolean z2 = false;
        while (true) {
            int i5 = 1;
            if (!c1958a.m11187a()) {
                ArrayList arrayList12 = arrayList6;
                ArrayList arrayList13 = arrayList7;
                ArrayList arrayList14 = arrayList8;
                ArrayList arrayList15 = arrayList11;
                boolean z3 = z;
                ArrayList arrayList16 = arrayList10;
                boolean z4 = z2;
                ArrayList arrayList17 = new ArrayList();
                HashSet hashSet = new HashSet();
                int i6 = 0;
                while (i6 < arrayList4.size()) {
                    C1964c.b bVar = (C1964c.b) arrayList4.get(i6);
                    if (hashSet.add(bVar.f8641a)) {
                        p11.m167013g(bVar.f8642b.f7746j == null ? i5 : 0);
                        Metadata.Entry[] entryArr = new Metadata.Entry[i5];
                        entryArr[0] = new HlsTrackMetadataEntry(null, null, (List) p11.m167011e((ArrayList) map.get(bVar.f8641a)));
                        arrayList17.add(bVar.m11268a(bVar.f8642b.m10282b().m10339Z(new Metadata(entryArr)).m10320G()));
                    }
                    i6++;
                    i5 = 1;
                }
                int i7 = 0;
                ArrayList arrayList18 = null;
                C1871k c1871kM10320G = null;
                while (i7 < arrayList9.size()) {
                    String str4 = (String) arrayList9.get(i7);
                    String strM11185z = m11185z(str4, f8515Q, map2);
                    String strM11185z2 = m11185z(str4, f8514P, map2);
                    C1871k.b bVar2 = new C1871k.b();
                    StringBuilder sb = new StringBuilder();
                    sb.append(strM11185z);
                    ArrayList arrayList19 = arrayList18;
                    sb.append(":");
                    sb.append(strM11185z2);
                    C1871k.b bVarM10337X = bVar2.m10334U(sb.toString()).m10336W(strM11185z2).m10326M("application/x-mpegURL").m10348i0(m11183x(str4)).m10344e0(m11182w(str4, map2)).m10337X(m11181v(str4, f8513O, map2));
                    String strM11181v = m11181v(str4, f8509K, map2);
                    Uri uriM118284e2 = strM11181v == null ? null : evj0.m118284e(str3, strM11181v);
                    ArrayList arrayList20 = arrayList9;
                    Metadata metadata = new Metadata(new HlsTrackMetadataEntry(strM11185z, strM11185z2, Collections.EMPTY_LIST));
                    String strM11185z3 = m11185z(str4, f8511M, map2);
                    strM11185z3.getClass();
                    switch (strM11185z3) {
                        case "SUBTITLES":
                            arrayList = arrayList12;
                            C1964c.b bVarM11167g = m11167g(arrayList4, strM11185z);
                            if (bVarM11167g != null) {
                                String strM197811M = vck0.m197811M(bVarM11167g.f8642b.f7745i, 3);
                                bVarM10337X.m10324K(strM197811M);
                                strM157525g = n200.m157525g(strM197811M);
                            } else {
                                strM157525g = null;
                            }
                            if (strM157525g == null) {
                                strM157525g = "text/vtt";
                            }
                            bVarM10337X.m10346g0(strM157525g).m10339Z(metadata);
                            if (uriM118284e2 != null) {
                                C1964c.a aVar = new C1964c.a(uriM118284e2, bVarM10337X.m10320G(), strM11185z, strM11185z2);
                                arrayList2 = arrayList13;
                                arrayList2.add(aVar);
                            } else {
                                arrayList2 = arrayList13;
                                jwv.m143689i("HlsPlaylistParser", "EXT-X-MEDIA tag with missing mandatory URI attribute: skipping");
                            }
                            arrayList3 = arrayList19;
                            break;
                        case "CLOSED-CAPTIONS":
                            arrayList = arrayList12;
                            String strM11185z4 = m11185z(str4, f8517S, map2);
                            if (strM11185z4.startsWith("CC")) {
                                i = Integer.parseInt(strM11185z4.substring(2));
                                str2 = "application/cea-608";
                            } else {
                                i = Integer.parseInt(strM11185z4.substring(7));
                                str2 = "application/cea-708";
                            }
                            arrayList3 = arrayList19 == null ? new ArrayList() : arrayList19;
                            bVarM10337X.m10346g0(str2).m10321H(i);
                            arrayList3.add(bVarM10337X.m10320G());
                            arrayList2 = arrayList13;
                            break;
                        case "AUDIO":
                            C1964c.b bVarM11166f = m11166f(arrayList4, strM11185z);
                            if (bVarM11166f != null) {
                                String strM197811M2 = vck0.m197811M(bVarM11166f.f8642b.f7745i, 1);
                                bVarM10337X.m10324K(strM197811M2);
                                strM157525g2 = n200.m157525g(strM197811M2);
                            } else {
                                strM157525g2 = null;
                            }
                            String strM11181v2 = m11181v(str4, f8533i, map2);
                            if (strM11181v2 != null) {
                                bVarM10337X.m10323J(Integer.parseInt(vck0.m197844b1(strM11181v2, "/")[0]));
                                if ("audio/eac3".equals(strM157525g2) && strM11181v2.endsWith("/JOC")) {
                                    bVarM10337X.m10324K("ec+3");
                                    strM157525g2 = "audio/eac3-joc";
                                }
                            }
                            bVarM10337X.m10346g0(strM157525g2);
                            if (uriM118284e2 == null) {
                                arrayList = arrayList12;
                                if (bVarM11166f != null) {
                                    arrayList3 = arrayList19;
                                    c1871kM10320G = bVarM10337X.m10320G();
                                    arrayList2 = arrayList13;
                                }
                                break;
                            } else {
                                bVarM10337X.m10339Z(metadata);
                                arrayList = arrayList12;
                                arrayList.add(new C1964c.a(uriM118284e2, bVarM10337X.m10320G(), strM11185z, strM11185z2));
                            }
                            arrayList2 = arrayList13;
                            arrayList3 = arrayList19;
                            break;
                        case "VIDEO":
                            C1964c.b bVarM11168h = m11168h(arrayList4, strM11185z);
                            if (bVarM11168h != null) {
                                C1871k c1871k = bVarM11168h.f8642b;
                                String strM197811M3 = vck0.m197811M(c1871k.f7745i, 2);
                                bVarM10337X.m10324K(strM197811M3).m10346g0(n200.m157525g(strM197811M3)).m10353n0(c1871k.f7753q).m10332S(c1871k.f7754r).m10331R(c1871k.f7755s);
                            }
                            if (uriM118284e2 != null) {
                                bVarM10337X.m10339Z(metadata);
                                arrayList5.add(new C1964c.a(uriM118284e2, bVarM10337X.m10320G(), strM11185z, strM11185z2));
                                break;
                            }
                        default:
                            arrayList2 = arrayList13;
                            arrayList = arrayList12;
                            arrayList3 = arrayList19;
                            break;
                    }
                    i7++;
                    str3 = str;
                    arrayList13 = arrayList2;
                    arrayList12 = arrayList;
                    arrayList18 = arrayList3;
                    arrayList9 = arrayList20;
                }
                return new C1964c(str, arrayList15, arrayList17, arrayList5, arrayList12, arrayList13, arrayList14, c1871kM10320G, z3 ? Collections.EMPTY_LIST : arrayList18, z4, map2, arrayList16);
            }
            String strM11188b = c1958a.m11188b();
            if (strM11188b.startsWith("#EXT")) {
                arrayList11.add(strM11188b);
            }
            boolean zStartsWith = strM11188b.startsWith("#EXT-X-I-FRAME-STREAM-INF");
            ArrayList arrayList21 = arrayList8;
            if (strM11188b.startsWith("#EXT-X-DEFINE")) {
                map2.put(m11185z(strM11188b, f8514P, map2), m11185z(strM11188b, f8524Z, map2));
            } else {
                if (strM11188b.equals("#EXT-X-INDEPENDENT-SEGMENTS")) {
                    z2 = true;
                } else if (strM11188b.startsWith("#EXT-X-MEDIA")) {
                    arrayList9.add(strM11188b);
                } else if (strM11188b.startsWith("#EXT-X-SESSION-KEY")) {
                    DrmInitData.SchemeData schemeDataM11170k = m11170k(strM11188b, m11180u(strM11188b, f8507I, "identity", map2), map2);
                    if (schemeDataM11170k != null) {
                        arrayList10.add(new DrmInitData(m11171l(m11185z(strM11188b, f8506H, map2)), schemeDataM11170k));
                    }
                } else if (strM11188b.startsWith("#EXT-X-STREAM-INF") || zStartsWith) {
                    boolean zContains = z | strM11188b.contains("CLOSED-CAPTIONS=NONE");
                    int i8 = zStartsWith ? 16384 : 0;
                    int iM11172m = m11172m(strM11188b, f8532h);
                    int iM11178s = m11178s(strM11188b, f8527c, -1);
                    String strM11181v3 = m11181v(strM11188b, f8534j, map2);
                    String strM11181v4 = m11181v(strM11188b, f8535k, map2);
                    if (strM11181v4 != null) {
                        String[] strArrM197841a1 = vck0.m197841a1(strM11181v4, BaseSei.f13930X);
                        int i9 = Integer.parseInt(strArrM197841a1[0]);
                        int i10 = Integer.parseInt(strArrM197841a1[1]);
                        if (i9 <= 0 || i10 <= 0) {
                            i10 = -1;
                            i4 = -1;
                        } else {
                            i4 = i9;
                        }
                        i3 = i10;
                        i2 = i4;
                    } else {
                        i2 = -1;
                        i3 = -1;
                    }
                    String strM11181v5 = m11181v(strM11188b, f8536l, map2);
                    float f = strM11181v5 != null ? Float.parseFloat(strM11181v5) : -1.0f;
                    String strM11181v6 = m11181v(strM11188b, f8528d, map2);
                    String strM11181v7 = m11181v(strM11188b, f8529e, map2);
                    String strM11181v8 = m11181v(strM11188b, f8530f, map2);
                    String strM11181v9 = m11181v(strM11188b, f8531g, map2);
                    if (zStartsWith) {
                        uriM118284e = evj0.m118284e(str3, m11185z(strM11188b, f8509K, map2));
                    } else {
                        if (!c1958a.m11187a()) {
                            throw ParserException.createForMalformedManifest("#EXT-X-STREAM-INF must be followed by another line", null);
                        }
                        uriM118284e = evj0.m118284e(str3, m11160B(c1958a.m11188b(), map2));
                    }
                    Uri uri = uriM118284e;
                    arrayList4.add(new C1964c.b(uri, new C1871k.b().m10333T(arrayList4.size()).m10326M("application/x-mpegURL").m10324K(strM11181v3).m10322I(iM11178s).m10341b0(iM11172m).m10353n0(i2).m10332S(i3).m10331R(f).m10344e0(i8).m10320G(), strM11181v6, strM11181v7, strM11181v8, strM11181v9));
                    ArrayList arrayList22 = (ArrayList) map.get(uri);
                    if (arrayList22 == null) {
                        arrayList22 = new ArrayList();
                        map.put(uri, arrayList22);
                    }
                    arrayList22.add(new HlsTrackMetadataEntry.VariantInfo(iM11178s, iM11172m, strM11181v6, strM11181v7, strM11181v8, strM11181v9));
                    z = zContains;
                    z2 = z2;
                }
                arrayList8 = arrayList21;
                arrayList11 = arrayList11;
                arrayList10 = arrayList10;
                arrayList7 = arrayList7;
                arrayList6 = arrayList6;
            }
            arrayList8 = arrayList21;
            arrayList11 = arrayList11;
            arrayList10 = arrayList10;
            arrayList7 = arrayList7;
            arrayList6 = arrayList6;
        }
    }

    /* JADX INFO: renamed from: q */
    public static boolean m11176q(String str, Pattern pattern, boolean z) {
        Matcher matcher = pattern.matcher(str);
        return matcher.find() ? "YES".equals(matcher.group(1)) : z;
    }

    /* JADX INFO: renamed from: r */
    public static double m11177r(String str, Pattern pattern, double d) {
        Matcher matcher = pattern.matcher(str);
        return matcher.find() ? Double.parseDouble((String) p11.m167011e(matcher.group(1))) : d;
    }

    /* JADX INFO: renamed from: s */
    public static int m11178s(String str, Pattern pattern, int i) {
        Matcher matcher = pattern.matcher(str);
        return matcher.find() ? Integer.parseInt((String) p11.m167011e(matcher.group(1))) : i;
    }

    /* JADX INFO: renamed from: t */
    public static long m11179t(String str, Pattern pattern, long j) {
        Matcher matcher = pattern.matcher(str);
        return matcher.find() ? Long.parseLong((String) p11.m167011e(matcher.group(1))) : j;
    }

    /* JADX INFO: renamed from: u */
    public static String m11180u(String str, Pattern pattern, String str2, Map<String, String> map) {
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            str2 = (String) p11.m167011e(matcher.group(1));
        }
        return (map.isEmpty() || str2 == null) ? str2 : m11160B(str2, map);
    }

    @Nullable
    /* JADX INFO: renamed from: v */
    public static String m11181v(String str, Pattern pattern, Map<String, String> map) {
        return m11180u(str, pattern, null, map);
    }

    /* JADX INFO: renamed from: w */
    public static int m11182w(String str, Map<String, String> map) {
        String strM11181v = m11181v(str, f8516R, map);
        if (TextUtils.isEmpty(strM11181v)) {
            return 0;
        }
        String[] strArrM197841a1 = vck0.m197841a1(strM11181v, Constants.SEPARATOR_COMMA);
        int i = vck0.m197888s(strArrM197841a1, "public.accessibility.describes-video") ? 512 : 0;
        if (vck0.m197888s(strArrM197841a1, "public.accessibility.transcribes-spoken-dialog")) {
            i |= 4096;
        }
        if (vck0.m197888s(strArrM197841a1, "public.accessibility.describes-music-and-sound")) {
            i |= 1024;
        }
        return vck0.m197888s(strArrM197841a1, "public.easy-to-read") ? i | 8192 : i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [int] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX INFO: renamed from: x */
    public static int m11183x(String str) {
        boolean zM11176q = m11176q(str, f8519U, false);
        ?? r0 = zM11176q;
        if (m11176q(str, f8520V, false)) {
            r0 = (zM11176q ? 1 : 0) | 2;
        }
        return m11176q(str, f8518T, false) ? r0 | 4 : r0;
    }

    /* JADX INFO: renamed from: y */
    public static C1963b.f m11184y(String str) {
        double dM11177r = m11177r(str, f8542r, -9.223372036854776E18d);
        long j = dM11177r == -9.223372036854776E18d ? -9223372036854775807L : (long) (dM11177r * 1000000.0d);
        boolean zM11176q = m11176q(str, f8543s, false);
        double dM11177r2 = m11177r(str, f8545u, -9.223372036854776E18d);
        long j2 = dM11177r2 == -9.223372036854776E18d ? -9223372036854775807L : (long) (dM11177r2 * 1000000.0d);
        double dM11177r3 = m11177r(str, f8546v, -9.223372036854776E18d);
        return new C1963b.f(j, zM11176q, j2, dM11177r3 != -9.223372036854776E18d ? (long) (dM11177r3 * 1000000.0d) : -9223372036854775807L, m11176q(str, f8547w, false));
    }

    /* JADX INFO: renamed from: z */
    public static String m11185z(String str, Pattern pattern, Map<String, String> map) throws ParserException {
        String strM11181v = m11181v(str, pattern, map);
        if (strM11181v != null) {
            return strM11181v;
        }
        throw ParserException.createForMalformedManifest("Couldn't match " + pattern.pattern() + " in " + str, null);
    }

    @Override // com.google.android.exoplayer2.upstream.C2050d.a
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public w2l mo11019a(Uri uri, InputStream inputStream) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        ArrayDeque arrayDeque = new ArrayDeque();
        try {
            if (!m11162b(bufferedReader)) {
                throw ParserException.createForMalformedManifest("Input does not start with the #EXTM3U header.", null);
            }
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    vck0.m197878n(bufferedReader);
                    throw ParserException.createForMalformedManifest("Failed to parse the playlist, could not identify any tags.", null);
                }
                String strTrim = line.trim();
                if (!strTrim.isEmpty()) {
                    if (strTrim.startsWith("#EXT-X-STREAM-INF")) {
                        arrayDeque.add(strTrim);
                        C1964c c1964cM11175p = m11175p(new C1958a(arrayDeque, bufferedReader), uri.toString());
                        vck0.m197878n(bufferedReader);
                        return c1964cM11175p;
                    }
                    if (!strTrim.startsWith("#EXT-X-TARGETDURATION") && !strTrim.startsWith("#EXT-X-MEDIA-SEQUENCE") && !strTrim.startsWith("#EXTINF") && !strTrim.startsWith("#EXT-X-KEY") && !strTrim.startsWith("#EXT-X-BYTERANGE") && !strTrim.equals("#EXT-X-DISCONTINUITY") && !strTrim.equals("#EXT-X-DISCONTINUITY-SEQUENCE") && !strTrim.equals("#EXT-X-ENDLIST")) {
                        arrayDeque.add(strTrim);
                    }
                    arrayDeque.add(strTrim);
                    C1963b c1963bM11174o = m11174o(this.f8551a, this.f8552b, new C1958a(arrayDeque, bufferedReader), uri.toString());
                    vck0.m197878n(bufferedReader);
                    return c1963bM11174o;
                }
            }
        } catch (Throwable th) {
            vck0.m197878n(bufferedReader);
            throw th;
        }
    }

    public HlsPlaylistParser() {
        this(C1964c.f8626n, null);
    }
}
