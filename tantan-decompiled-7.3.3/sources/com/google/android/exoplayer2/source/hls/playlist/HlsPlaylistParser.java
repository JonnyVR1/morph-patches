package com.google.android.exoplayer2.source.hls.playlist;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import androidx.annotation.Nullable;
import com.clevertap.android.sdk.Constants;
import com.google.android.exoplayer2.C1894k;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.source.hls.HlsTrackMetadataEntry;
import com.google.android.exoplayer2.upstream.C2073d;
import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.putong.data.RelationshipStatus;
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
import p153l.akq;
import p153l.bmk0;
import p153l.h4k0;
import p153l.kb00;
import p153l.kyv;
import p153l.m5l;
import p153l.mor;
import p153l.t7b0;
import p153l.w11;
import p153l.zr3;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class HlsPlaylistParser implements C2073d.a<m5l> {

    /* JADX INFO: renamed from: a */
    public final C1987c f8588a;

    /* JADX INFO: renamed from: b */
    @Nullable
    public final C1986b f8589b;

    /* JADX INFO: renamed from: c */
    public static final Pattern f8564c = Pattern.compile("AVERAGE-BANDWIDTH=(\\d+)\\b");

    /* JADX INFO: renamed from: d */
    public static final Pattern f8565d = Pattern.compile("VIDEO=\"(.+?)\"");

    /* JADX INFO: renamed from: e */
    public static final Pattern f8566e = Pattern.compile("AUDIO=\"(.+?)\"");

    /* JADX INFO: renamed from: f */
    public static final Pattern f8567f = Pattern.compile("SUBTITLES=\"(.+?)\"");

    /* JADX INFO: renamed from: g */
    public static final Pattern f8568g = Pattern.compile("CLOSED-CAPTIONS=\"(.+?)\"");

    /* JADX INFO: renamed from: h */
    public static final Pattern f8569h = Pattern.compile("[^-]BANDWIDTH=(\\d+)\\b");

    /* JADX INFO: renamed from: i */
    public static final Pattern f8570i = Pattern.compile("CHANNELS=\"(.+?)\"");

    /* JADX INFO: renamed from: j */
    public static final Pattern f8571j = Pattern.compile("CODECS=\"(.+?)\"");

    /* JADX INFO: renamed from: k */
    public static final Pattern f8572k = Pattern.compile("RESOLUTION=(\\d+x\\d+)");

    /* JADX INFO: renamed from: l */
    public static final Pattern f8573l = Pattern.compile("FRAME-RATE=([\\d\\.]+)\\b");

    /* JADX INFO: renamed from: m */
    public static final Pattern f8574m = Pattern.compile("#EXT-X-TARGETDURATION:(\\d+)\\b");

    /* JADX INFO: renamed from: n */
    public static final Pattern f8575n = Pattern.compile("DURATION=([\\d\\.]+)\\b");

    /* JADX INFO: renamed from: o */
    public static final Pattern f8576o = Pattern.compile("PART-TARGET=([\\d\\.]+)\\b");

    /* JADX INFO: renamed from: p */
    public static final Pattern f8577p = Pattern.compile("#EXT-X-VERSION:(\\d+)\\b");

    /* JADX INFO: renamed from: q */
    public static final Pattern f8578q = Pattern.compile("#EXT-X-PLAYLIST-TYPE:(.+)\\b");

    /* JADX INFO: renamed from: r */
    public static final Pattern f8579r = Pattern.compile("CAN-SKIP-UNTIL=([\\d\\.]+)\\b");

    /* JADX INFO: renamed from: s */
    public static final Pattern f8580s = m11217c("CAN-SKIP-DATERANGES");

    /* JADX INFO: renamed from: t */
    public static final Pattern f8581t = Pattern.compile("SKIPPED-SEGMENTS=(\\d+)\\b");

    /* JADX INFO: renamed from: u */
    public static final Pattern f8582u = Pattern.compile("[:|,]HOLD-BACK=([\\d\\.]+)\\b");

    /* JADX INFO: renamed from: v */
    public static final Pattern f8583v = Pattern.compile("PART-HOLD-BACK=([\\d\\.]+)\\b");

    /* JADX INFO: renamed from: w */
    public static final Pattern f8584w = m11217c("CAN-BLOCK-RELOAD");

    /* JADX INFO: renamed from: x */
    public static final Pattern f8585x = Pattern.compile("#EXT-X-MEDIA-SEQUENCE:(\\d+)\\b");

    /* JADX INFO: renamed from: y */
    public static final Pattern f8586y = Pattern.compile("#EXTINF:([\\d\\.]+)\\b");

    /* JADX INFO: renamed from: z */
    public static final Pattern f8587z = Pattern.compile("#EXTINF:[\\d\\.]+\\b,(.+)");

    /* JADX INFO: renamed from: A */
    public static final Pattern f8536A = Pattern.compile("LAST-MSN=(\\d+)\\b");

    /* JADX INFO: renamed from: B */
    public static final Pattern f8537B = Pattern.compile("LAST-PART=(\\d+)\\b");

    /* JADX INFO: renamed from: C */
    public static final Pattern f8538C = Pattern.compile("TIME-OFFSET=(-?[\\d\\.]+)\\b");

    /* JADX INFO: renamed from: D */
    public static final Pattern f8539D = Pattern.compile("#EXT-X-BYTERANGE:(\\d+(?:@\\d+)?)\\b");

    /* JADX INFO: renamed from: E */
    public static final Pattern f8540E = Pattern.compile("BYTERANGE=\"(\\d+(?:@\\d+)?)\\b\"");

    /* JADX INFO: renamed from: F */
    public static final Pattern f8541F = Pattern.compile("BYTERANGE-START=(\\d+)\\b");

    /* JADX INFO: renamed from: G */
    public static final Pattern f8542G = Pattern.compile("BYTERANGE-LENGTH=(\\d+)\\b");

    /* JADX INFO: renamed from: H */
    public static final Pattern f8543H = Pattern.compile("METHOD=(NONE|AES-128|SAMPLE-AES|SAMPLE-AES-CENC|SAMPLE-AES-CTR)\\s*(?:,|$)");

    /* JADX INFO: renamed from: I */
    public static final Pattern f8544I = Pattern.compile("KEYFORMAT=\"(.+?)\"");

    /* JADX INFO: renamed from: J */
    public static final Pattern f8545J = Pattern.compile("KEYFORMATVERSIONS=\"(.+?)\"");

    /* JADX INFO: renamed from: K */
    public static final Pattern f8546K = Pattern.compile("URI=\"(.+?)\"");

    /* JADX INFO: renamed from: L */
    public static final Pattern f8547L = Pattern.compile("IV=([^,.*]+)");

    /* JADX INFO: renamed from: M */
    public static final Pattern f8548M = Pattern.compile("TYPE=(AUDIO|VIDEO|SUBTITLES|CLOSED-CAPTIONS)");

    /* JADX INFO: renamed from: N */
    public static final Pattern f8549N = Pattern.compile("TYPE=(PART|MAP)");

    /* JADX INFO: renamed from: O */
    public static final Pattern f8550O = Pattern.compile("LANGUAGE=\"(.+?)\"");

    /* JADX INFO: renamed from: P */
    public static final Pattern f8551P = Pattern.compile("NAME=\"(.+?)\"");

    /* JADX INFO: renamed from: Q */
    public static final Pattern f8552Q = Pattern.compile("GROUP-ID=\"(.+?)\"");

    /* JADX INFO: renamed from: R */
    public static final Pattern f8553R = Pattern.compile("CHARACTERISTICS=\"(.+?)\"");

    /* JADX INFO: renamed from: S */
    public static final Pattern f8554S = Pattern.compile("INSTREAM-ID=\"((?:CC|SERVICE)\\d+)\"");

    /* JADX INFO: renamed from: T */
    public static final Pattern f8555T = m11217c("AUTOSELECT");

    /* JADX INFO: renamed from: U */
    public static final Pattern f8556U = m11217c(RelationshipStatus.DEFAULT);

    /* JADX INFO: renamed from: V */
    public static final Pattern f8557V = m11217c("FORCED");

    /* JADX INFO: renamed from: W */
    public static final Pattern f8558W = m11217c("INDEPENDENT");

    /* JADX INFO: renamed from: X */
    public static final Pattern f8559X = m11217c("GAP");

    /* JADX INFO: renamed from: Y */
    public static final Pattern f8560Y = m11217c("PRECISE");

    /* JADX INFO: renamed from: Z */
    public static final Pattern f8561Z = Pattern.compile("VALUE=\"(.+?)\"");

    /* JADX INFO: renamed from: a0 */
    public static final Pattern f8562a0 = Pattern.compile("IMPORT=\"(.+?)\"");

    /* JADX INFO: renamed from: b0 */
    public static final Pattern f8563b0 = Pattern.compile("\\{\\$([a-zA-Z0-9\\-_]+)\\}");

    public static final class DeltaUpdateException extends IOException {
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistParser$a */
    public static class C1981a {

        /* JADX INFO: renamed from: a */
        public final BufferedReader f8590a;

        /* JADX INFO: renamed from: b */
        public final Queue<String> f8591b;

        /* JADX INFO: renamed from: c */
        @Nullable
        public String f8592c;

        public C1981a(Queue<String> queue, BufferedReader bufferedReader) {
            this.f8591b = queue;
            this.f8590a = bufferedReader;
        }

        @EnsuresNonNullIf(expression = {"next"}, result = true)
        /* JADX INFO: renamed from: a */
        public boolean m11241a() throws IOException {
            String strTrim;
            if (this.f8592c != null) {
                return true;
            }
            if (!this.f8591b.isEmpty()) {
                this.f8592c = (String) w11.m204369e(this.f8591b.poll());
                return true;
            }
            do {
                String line = this.f8590a.readLine();
                this.f8592c = line;
                if (line == null) {
                    return false;
                }
                strTrim = line.trim();
                this.f8592c = strTrim;
            } while (strTrim.isEmpty());
            return true;
        }

        /* JADX INFO: renamed from: b */
        public String m11242b() throws IOException {
            if (!m11241a()) {
                mor.m159308a();
                return null;
            }
            String str = this.f8592c;
            this.f8592c = null;
            return str;
        }
    }

    public HlsPlaylistParser(C1987c c1987c, @Nullable C1986b c1986b) {
        this.f8588a = c1987c;
        this.f8589b = c1986b;
    }

    /* JADX INFO: renamed from: A */
    public static long m11213A(String str, Pattern pattern) throws ParserException {
        return new BigDecimal(m11239z(str, pattern, Collections.EMPTY_MAP)).multiply(new BigDecimal(1000000L)).longValue();
    }

    /* JADX INFO: renamed from: B */
    public static String m11214B(String str, Map<String, String> map) {
        Matcher matcher = f8563b0.matcher(str);
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
    public static int m11215C(BufferedReader bufferedReader, boolean z, int i) throws IOException {
        while (i != -1 && Character.isWhitespace(i) && (z || !bmk0.m105072D0(i))) {
            i = bufferedReader.read();
        }
        return i;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m11216b(BufferedReader bufferedReader) throws IOException {
        int i = bufferedReader.read();
        if (i == 239) {
            if (bufferedReader.read() != 187 || bufferedReader.read() != 191) {
                return false;
            }
            i = bufferedReader.read();
        }
        int iM11215C = m11215C(bufferedReader, true, i);
        for (int i2 = 0; i2 < 7; i2++) {
            if (iM11215C != "#EXTM3U".charAt(i2)) {
                return false;
            }
            iM11215C = bufferedReader.read();
        }
        return bmk0.m105072D0(m11215C(bufferedReader, false, iM11215C));
    }

    /* JADX INFO: renamed from: c */
    public static Pattern m11217c(String str) {
        return Pattern.compile(str + "=(NO|YES)");
    }

    /* JADX INFO: renamed from: d */
    public static DrmInitData m11218d(@Nullable String str, DrmInitData.SchemeData[] schemeDataArr) {
        DrmInitData.SchemeData[] schemeDataArr2 = new DrmInitData.SchemeData[schemeDataArr.length];
        for (int i = 0; i < schemeDataArr.length; i++) {
            schemeDataArr2[i] = schemeDataArr[i].m9956b(null);
        }
        return new DrmInitData(str, schemeDataArr2);
    }

    @Nullable
    /* JADX INFO: renamed from: e */
    public static String m11219e(long j, @Nullable String str, @Nullable String str2) {
        if (str == null) {
            return null;
        }
        return str2 != null ? str2 : Long.toHexString(j);
    }

    @Nullable
    /* JADX INFO: renamed from: f */
    public static C1987c.b m11220f(ArrayList<C1987c.b> arrayList, String str) {
        for (int i = 0; i < arrayList.size(); i++) {
            C1987c.b bVar = arrayList.get(i);
            if (str.equals(bVar.f8681d)) {
                return bVar;
            }
        }
        return null;
    }

    @Nullable
    /* JADX INFO: renamed from: g */
    public static C1987c.b m11221g(ArrayList<C1987c.b> arrayList, String str) {
        for (int i = 0; i < arrayList.size(); i++) {
            C1987c.b bVar = arrayList.get(i);
            if (str.equals(bVar.f8682e)) {
                return bVar;
            }
        }
        return null;
    }

    @Nullable
    /* JADX INFO: renamed from: h */
    public static C1987c.b m11222h(ArrayList<C1987c.b> arrayList, String str) {
        for (int i = 0; i < arrayList.size(); i++) {
            C1987c.b bVar = arrayList.get(i);
            if (str.equals(bVar.f8680c)) {
                return bVar;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: j */
    public static double m11223j(String str, Pattern pattern) throws ParserException {
        return Double.parseDouble(m11239z(str, pattern, Collections.EMPTY_MAP));
    }

    @Nullable
    /* JADX INFO: renamed from: k */
    public static DrmInitData.SchemeData m11224k(String str, String str2, Map<String, String> map) throws ParserException {
        String strM11234u = m11234u(str, f8545J, "1", map);
        if ("urn:uuid:edef8ba9-79d6-4ace-a3c8-27dcd51d21ed".equals(str2)) {
            String strM11239z = m11239z(str, f8546K, map);
            return new DrmInitData.SchemeData(zr3.f205732d, DLNAProfiles.DLNAMimeTypes.MIME_VIDEO_MPEG_4, Base64.decode(strM11239z.substring(strM11239z.indexOf(44)), 0));
        }
        if ("com.widevine".equals(str2)) {
            return new DrmInitData.SchemeData(zr3.f205732d, "hls", bmk0.m105165r0(str));
        }
        if (!"com.microsoft.playready".equals(str2) || !"1".equals(strM11234u)) {
            return null;
        }
        String strM11239z2 = m11239z(str, f8546K, map);
        byte[] bArrDecode = Base64.decode(strM11239z2.substring(strM11239z2.indexOf(44)), 0);
        UUID uuid = zr3.f205733e;
        return new DrmInitData.SchemeData(uuid, DLNAProfiles.DLNAMimeTypes.MIME_VIDEO_MPEG_4, t7b0.m189554a(uuid, bArrDecode));
    }

    /* JADX INFO: renamed from: l */
    public static String m11225l(String str) {
        return ("SAMPLE-AES-CENC".equals(str) || "SAMPLE-AES-CTR".equals(str)) ? "cenc" : "cbcs";
    }

    /* JADX INFO: renamed from: m */
    public static int m11226m(String str, Pattern pattern) throws ParserException {
        return Integer.parseInt(m11239z(str, pattern, Collections.EMPTY_MAP));
    }

    /* JADX INFO: renamed from: n */
    public static long m11227n(String str, Pattern pattern) throws ParserException {
        return Long.parseLong(m11239z(str, pattern, Collections.EMPTY_MAP));
    }

    /* JADX WARN: Code duplicated, block: B:114:0x0322 A[PHI: r13
      0x0322: PHI (r13v7 java.lang.String) = (r13v5 java.lang.String), (r13v2 java.lang.String) binds: [B:118:0x0331, B:112:0x0315] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:228:0x0624  */
    /* JADX WARN: Code duplicated, block: B:230:0x0631  */
    /* JADX WARN: Code duplicated, block: B:233:0x0647  */
    /* JADX INFO: renamed from: o */
    public static C1986b m11228o(C1987c c1987c, @Nullable C1986b c1986b, C1981a c1981a, String str) throws IOException {
        String str2;
        C1986b.d dVar;
        int i;
        long j;
        long j2;
        long j3;
        C1986b.d dVar2;
        long j4;
        boolean z;
        DrmInitData drmInitData;
        DrmInitData drmInitDataM11218d;
        C1986b.d dVar3;
        c1987c = c1987c;
        C1986b c1986b2 = c1986b;
        boolean z2 = c1987c.f134912c;
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        C1986b.f fVar = new C1986b.f(-9223372036854775807L, false, -9223372036854775807L, -9223372036854775807L, false);
        TreeMap treeMap = new TreeMap();
        boolean z3 = z2;
        long j5 = -9223372036854775807L;
        long jM11223j = -9223372036854775807L;
        long j6 = 0;
        long j7 = 0;
        long jM105084J0 = 0;
        long j8 = 0;
        long jM11227n = 0;
        long jM11213A = 0;
        long j9 = 0;
        String strM11234u = "";
        String str3 = strM11234u;
        boolean zM11230q = false;
        String strM11225l = null;
        DrmInitData drmInitData2 = null;
        C1986b.b bVar = null;
        int i2 = 0;
        boolean z4 = false;
        DrmInitData drmInitDataM11218d2 = null;
        String str4 = null;
        long j10 = -1;
        boolean z5 = false;
        boolean z6 = false;
        int i3 = 0;
        C1986b.d dVar4 = null;
        int i4 = 0;
        String strM11239z = null;
        long j11 = -1;
        boolean z7 = false;
        long jM11226m = -9223372036854775807L;
        long j12 = 0;
        int iM11226m = 1;
        while (c1981a.m11241a()) {
            String strM11242b = c1981a.m11242b();
            if (strM11242b.startsWith("#EXT")) {
                arrayList4.add(strM11242b);
            }
            if (strM11242b.startsWith("#EXT-X-PLAYLIST-TYPE")) {
                String strM11239z2 = m11239z(strM11242b, f8578q, map);
                if ("VOD".equals(strM11239z2)) {
                    i2 = 1;
                } else if ("EVENT".equals(strM11239z2)) {
                    i2 = 2;
                }
            } else if (strM11242b.equals("#EXT-X-I-FRAMES-ONLY")) {
                z7 = true;
            } else {
                if (strM11242b.startsWith("#EXT-X-START")) {
                    ArrayList arrayList5 = arrayList4;
                    fVar = fVar;
                    long jM11223j2 = (long) (m11223j(strM11242b, f8538C) * 1000000.0d);
                    zM11230q = m11230q(strM11242b, f8560Y, false);
                    arrayList4 = arrayList5;
                    j5 = jM11223j2;
                } else {
                    ArrayList arrayList6 = arrayList4;
                    fVar = fVar;
                    if (strM11242b.startsWith("#EXT-X-SERVER-CONTROL")) {
                        fVar = m11238y(strM11242b);
                        arrayList4 = arrayList6;
                    } else if (strM11242b.startsWith("#EXT-X-PART-INF")) {
                        jM11223j = (long) (m11223j(strM11242b, f8576o) * 1000000.0d);
                        arrayList4 = arrayList6;
                    } else if (strM11242b.startsWith("#EXT-X-MAP")) {
                        String strM11239z3 = m11239z(strM11242b, f8546K, map);
                        boolean z8 = zM11230q;
                        String strM11235v = m11235v(strM11242b, f8540E, map);
                        if (strM11235v != null) {
                            String[] strArrM105119a1 = bmk0.m105119a1(strM11235v, "@");
                            j10 = Long.parseLong(strArrM105119a1[0]);
                            if (strArrM105119a1.length > 1) {
                                j6 = Long.parseLong(strArrM105119a1[1]);
                            }
                        }
                        long j13 = j10;
                        long j14 = j13 == j11 ? 0L : j6;
                        if (strM11239z != null && str4 == null) {
                            throw ParserException.createForMalformedManifest("The encryption IV attribute must be present when an initialization segment is encrypted with METHOD=AES-128.", null);
                        }
                        C1986b.d dVar5 = new C1986b.d(strM11239z3, j14, j13, strM11239z, str4);
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
                        zM11230q = z8;
                    } else {
                        zM11230q = zM11230q;
                        arrayList4 = arrayList6;
                        str4 = str4;
                        strM11239z = strM11239z;
                        if (strM11242b.startsWith("#EXT-X-TARGETDURATION")) {
                            jM11226m = 1000000 * ((long) m11226m(strM11242b, f8574m));
                        } else if (strM11242b.startsWith("#EXT-X-MEDIA-SEQUENCE")) {
                            jM11227n = m11227n(strM11242b, f8585x);
                            j12 = jM11227n;
                            fVar = fVar;
                            zM11230q = zM11230q;
                            arrayList4 = arrayList4;
                        } else if (strM11242b.startsWith("#EXT-X-VERSION")) {
                            iM11226m = m11226m(strM11242b, f8577p);
                        } else {
                            if (strM11242b.startsWith("#EXT-X-DEFINE")) {
                                String strM11235v2 = m11235v(strM11242b, f8562a0, map);
                                if (strM11235v2 != null) {
                                    String str6 = c1987c.f8672l.get(strM11235v2);
                                    if (str6 != null) {
                                        map.put(strM11235v2, str6);
                                    }
                                } else {
                                    map.put(m11239z(strM11242b, f8551P, map), m11239z(strM11242b, f8561Z, map));
                                }
                                treeMap = treeMap;
                                str2 = str3;
                            } else if (strM11242b.startsWith("#EXTINF")) {
                                jM11213A = m11213A(strM11242b, f8586y);
                                strM11234u = m11234u(strM11242b, f8587z, str3, map);
                            } else {
                                String str7 = str3;
                                if (strM11242b.startsWith("#EXT-X-SKIP")) {
                                    int iM11226m2 = m11226m(strM11242b, f8581t);
                                    w11.m204371g(c1986b2 != null && arrayList.isEmpty());
                                    str2 = str7;
                                    int i5 = (int) (j12 - ((C1986b) bmk0.m105144j(c1986b2)).f8628k);
                                    int i6 = iM11226m2 + i5;
                                    if (i5 < 0 || i6 > c1986b2.f8635r.size()) {
                                        throw new DeltaUpdateException();
                                    }
                                    strM11239z = strM11239z;
                                    str4 = str4;
                                    long j15 = j7;
                                    while (i5 < i6) {
                                        C1986b.d dVarM11314b = c1986b2.f8635r.get(i5);
                                        int i7 = i5;
                                        if (j12 != c1986b2.f8628k) {
                                            dVarM11314b = dVarM11314b.m11314b(j15, (c1986b2.f8627j - i3) + dVarM11314b.f8650d);
                                        }
                                        arrayList.add(dVarM11314b);
                                        j8 = j15 + dVarM11314b.f8649c;
                                        long j16 = dVarM11314b.f8656j;
                                        if (j16 != j11) {
                                            j6 = dVarM11314b.f8655i + j16;
                                        }
                                        int i8 = dVarM11314b.f8650d;
                                        C1986b.d dVar6 = dVarM11314b.f8648b;
                                        drmInitData2 = dVarM11314b.f8652f;
                                        String str8 = dVarM11314b.f8653g;
                                        String str9 = dVarM11314b.f8654h;
                                        int i9 = i6;
                                        if (str9 == null || !str9.equals(Long.toHexString(jM11227n))) {
                                            str4 = dVarM11314b.f8654h;
                                        }
                                        jM11227n++;
                                        i4 = i8;
                                        dVar4 = dVar6;
                                        strM11239z = str8;
                                        j15 = j8;
                                        i5 = i7 + 1;
                                        i6 = i9;
                                    }
                                    j7 = j15;
                                } else {
                                    str2 = str7;
                                    if (strM11242b.startsWith("#EXT-X-KEY")) {
                                        String strM11239z4 = m11239z(strM11242b, f8543H, map);
                                        String strM11234u2 = m11234u(strM11242b, f8544I, "identity", map);
                                        if (Constraint.NONE.equals(strM11239z4)) {
                                            treeMap.clear();
                                            drmInitData2 = null;
                                            str4 = null;
                                            strM11239z = null;
                                        } else {
                                            String strM11235v3 = m11235v(strM11242b, f8547L, map);
                                            if (!"identity".equals(strM11234u2)) {
                                                if (strM11225l == null) {
                                                    strM11225l = m11225l(strM11239z4);
                                                }
                                                DrmInitData.SchemeData schemeDataM11224k = m11224k(strM11242b, strM11234u2, map);
                                                if (schemeDataM11224k != null) {
                                                    treeMap.put(strM11234u2, schemeDataM11224k);
                                                    str4 = strM11235v3;
                                                    drmInitData2 = null;
                                                    strM11239z = null;
                                                } else {
                                                    str4 = strM11235v3;
                                                    strM11239z = null;
                                                }
                                            } else if ("AES-128".equals(strM11239z4)) {
                                                strM11239z = m11239z(strM11242b, f8546K, map);
                                                str4 = strM11235v3;
                                            } else {
                                                str4 = strM11235v3;
                                                strM11239z = null;
                                            }
                                        }
                                    } else {
                                        if (strM11242b.startsWith("#EXT-X-BYTERANGE")) {
                                            String[] strArrM105119a2 = bmk0.m105119a1(m11239z(strM11242b, f8539D, map), "@");
                                            j10 = Long.parseLong(strArrM105119a2[0]);
                                            if (strArrM105119a2.length > 1) {
                                                j6 = Long.parseLong(strArrM105119a2[1]);
                                            }
                                        } else if (strM11242b.startsWith("#EXT-X-DISCONTINUITY-SEQUENCE")) {
                                            i3 = Integer.parseInt(strM11242b.substring(strM11242b.indexOf(58) + 1));
                                            c1987c = c1987c;
                                            strM11239z = strM11239z;
                                            str4 = str4;
                                            fVar = fVar;
                                            zM11230q = zM11230q;
                                            arrayList4 = arrayList4;
                                            str3 = str2;
                                            z6 = true;
                                        } else if (strM11242b.equals("#EXT-X-DISCONTINUITY")) {
                                            i4++;
                                        } else if (strM11242b.startsWith("#EXT-X-PROGRAM-DATE-TIME")) {
                                            if (jM105084J0 == 0) {
                                                jM105084J0 = bmk0.m105084J0(bmk0.m105098Q0(strM11242b.substring(strM11242b.indexOf(58) + 1))) - j7;
                                            } else {
                                                treeMap = treeMap;
                                            }
                                        } else if (strM11242b.equals("#EXT-X-GAP")) {
                                            c1987c = c1987c;
                                            strM11239z = strM11239z;
                                            str4 = str4;
                                            fVar = fVar;
                                            zM11230q = zM11230q;
                                            arrayList4 = arrayList4;
                                            str3 = str2;
                                            z5 = true;
                                        } else if (strM11242b.equals("#EXT-X-INDEPENDENT-SEGMENTS")) {
                                            c1987c = c1987c;
                                            strM11239z = strM11239z;
                                            str4 = str4;
                                            fVar = fVar;
                                            zM11230q = zM11230q;
                                            arrayList4 = arrayList4;
                                            str3 = str2;
                                            z3 = true;
                                        } else if (strM11242b.equals("#EXT-X-ENDLIST")) {
                                            c1987c = c1987c;
                                            strM11239z = strM11239z;
                                            str4 = str4;
                                            fVar = fVar;
                                            zM11230q = zM11230q;
                                            arrayList4 = arrayList4;
                                            str3 = str2;
                                            z4 = true;
                                        } else if (strM11242b.startsWith("#EXT-X-RENDITION-REPORT")) {
                                            treeMap = treeMap;
                                            arrayList3.add(new C1986b.c(Uri.parse(h4k0.m133581d(str, m11239z(strM11242b, f8546K, map))), m11233t(strM11242b, f8536A, j11), m11232s(strM11242b, f8537B, -1)));
                                        } else {
                                            treeMap = treeMap;
                                            if (!strM11242b.startsWith("#EXT-X-PRELOAD-HINT")) {
                                                j = jM11227n;
                                                if (strM11242b.startsWith("#EXT-X-PART")) {
                                                    String strM11219e = m11219e(j, strM11239z, str4);
                                                    String strM11239z5 = m11239z(strM11242b, f8546K, map);
                                                    long jM11223j3 = (long) (m11223j(strM11242b, f8575n) * 1000000.0d);
                                                    boolean zM11230q2 = m11230q(strM11242b, f8558W, false) | (z3 && arrayList2.isEmpty());
                                                    boolean zM11230q3 = m11230q(strM11242b, f8559X, false);
                                                    String strM11235v4 = m11235v(strM11242b, f8540E, map);
                                                    if (strM11235v4 != null) {
                                                        String[] strArrM105119a3 = bmk0.m105119a1(strM11235v4, "@");
                                                        long j17 = Long.parseLong(strArrM105119a3[0]);
                                                        if (strArrM105119a3.length > 1) {
                                                            j9 = Long.parseLong(strArrM105119a3[1]);
                                                        }
                                                        j2 = j17;
                                                    } else {
                                                        j2 = -1;
                                                    }
                                                    long j18 = j2 == -1 ? 0L : j9;
                                                    if (drmInitData2 == null && !treeMap.isEmpty()) {
                                                        DrmInitData.SchemeData[] schemeDataArr = (DrmInitData.SchemeData[]) treeMap.values().toArray(new DrmInitData.SchemeData[0]);
                                                        drmInitData2 = new DrmInitData(strM11225l, schemeDataArr);
                                                        if (drmInitDataM11218d2 == null) {
                                                            drmInitDataM11218d2 = m11218d(strM11225l, schemeDataArr);
                                                        }
                                                    }
                                                    DrmInitData drmInitData3 = drmInitData2;
                                                    C1986b.d dVar7 = dVar4;
                                                    int i10 = i4;
                                                    arrayList2.add(new C1986b.b(strM11239z5, dVar4, jM11223j3, i4, j8, drmInitData3, strM11239z, strM11219e, j18, j2, zM11230q3, zM11230q2, false));
                                                    j8 += jM11223j3;
                                                    if (j2 != -1) {
                                                        j18 += j2;
                                                    }
                                                    j9 = j18;
                                                    dVar4 = dVar7;
                                                    strM11239z = strM11239z;
                                                    jM11227n = j;
                                                    i4 = i10;
                                                    drmInitData2 = drmInitData3;
                                                    str3 = str2;
                                                } else {
                                                    dVar = dVar4;
                                                    i = i4;
                                                    if (strM11242b.startsWith("#")) {
                                                        j7 = j7;
                                                        c1987c = c1987c;
                                                        dVar4 = dVar;
                                                        strM11239z = strM11239z;
                                                        str4 = str4;
                                                        jM11227n = j;
                                                        strM11234u = strM11234u;
                                                        jM11213A = jM11213A;
                                                        j7 = j7;
                                                        j6 = j6;
                                                        fVar = fVar;
                                                        zM11230q = zM11230q;
                                                        arrayList4 = arrayList4;
                                                        str3 = str2;
                                                        treeMap = treeMap;
                                                        j11 = -1;
                                                        c1986b2 = c1986b;
                                                        i4 = i;
                                                    } else {
                                                        long j19 = j7;
                                                        String strM11219e2 = m11219e(j, strM11239z, str4);
                                                        jM11227n = j + 1;
                                                        String strM11214B = m11214B(strM11242b, map);
                                                        C1986b.d dVar8 = (C1986b.d) map2.get(strM11214B);
                                                        if (j10 == -1) {
                                                            dVar2 = dVar8;
                                                            j4 = 0;
                                                        } else {
                                                            if (z7 && dVar == null && dVar8 == null) {
                                                                j3 = j6;
                                                                dVar8 = new C1986b.d(strM11214B, 0L, j3, null, null);
                                                                map2.put(strM11214B, dVar8);
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
                                                            drmInitData2 = new DrmInitData(strM11225l, schemeDataArr2);
                                                            if (drmInitDataM11218d2 == null) {
                                                                drmInitDataM11218d = m11218d(strM11225l, schemeDataArr2);
                                                                drmInitData = drmInitData2;
                                                            }
                                                            if (dVar != null) {
                                                                dVar3 = dVar;
                                                            } else {
                                                                dVar3 = dVar2;
                                                            }
                                                            long j20 = jM11213A;
                                                            arrayList.add(new C1986b.d(strM11214B, dVar3, strM11234u, j20, i, j19, drmInitData, strM11239z, strM11219e2, j4, j10, z5, arrayList2));
                                                            j8 = j19 + j20;
                                                            arrayList2 = new ArrayList();
                                                            if (j10 != -1) {
                                                                j4 += j10;
                                                            }
                                                            j6 = j4;
                                                            dVar4 = dVar;
                                                            strM11239z = strM11239z;
                                                            drmInitDataM11218d2 = drmInitDataM11218d;
                                                            z5 = z;
                                                            i4 = i;
                                                            drmInitData2 = drmInitData;
                                                            j7 = j8;
                                                            jM11213A = 0;
                                                            strM11234u = str2;
                                                            str3 = strM11234u;
                                                            j10 = -1;
                                                        }
                                                        drmInitData = drmInitData2;
                                                        drmInitDataM11218d = drmInitDataM11218d2;
                                                        if (dVar != null) {
                                                            dVar3 = dVar;
                                                        } else {
                                                            dVar3 = dVar2;
                                                        }
                                                        long j21 = jM11213A;
                                                        arrayList.add(new C1986b.d(strM11214B, dVar3, strM11234u, j21, i, j19, drmInitData, strM11239z, strM11219e2, j4, j10, z5, arrayList2));
                                                        j8 = j19 + j21;
                                                        arrayList2 = new ArrayList();
                                                        if (j10 != -1) {
                                                            j4 += j10;
                                                        }
                                                        j6 = j4;
                                                        dVar4 = dVar;
                                                        strM11239z = strM11239z;
                                                        drmInitDataM11218d2 = drmInitDataM11218d;
                                                        z5 = z;
                                                        i4 = i;
                                                        drmInitData2 = drmInitData;
                                                        j7 = j8;
                                                        jM11213A = 0;
                                                        strM11234u = str2;
                                                        str3 = strM11234u;
                                                        j10 = -1;
                                                    }
                                                }
                                                j11 = -1;
                                                c1986b2 = c1986b;
                                            } else if (bVar == null && "PART".equals(m11239z(strM11242b, f8549N, map))) {
                                                String strM11239z6 = m11239z(strM11242b, f8546K, map);
                                                long jM11233t = m11233t(strM11242b, f8541F, -1L);
                                                long jM11233t2 = m11233t(strM11242b, f8542G, -1L);
                                                long j22 = jM11227n;
                                                String strM11219e3 = m11219e(j22, strM11239z, str4);
                                                if (drmInitData2 == null && !treeMap.isEmpty()) {
                                                    DrmInitData.SchemeData[] schemeDataArr3 = (DrmInitData.SchemeData[]) treeMap.values().toArray(new DrmInitData.SchemeData[0]);
                                                    drmInitData2 = new DrmInitData(strM11225l, schemeDataArr3);
                                                    if (drmInitDataM11218d2 == null) {
                                                        drmInitDataM11218d2 = m11218d(strM11225l, schemeDataArr3);
                                                    }
                                                }
                                                DrmInitData drmInitData4 = drmInitData2;
                                                if (jM11233t == -1 || jM11233t2 != -1) {
                                                    bVar = new C1986b.b(strM11239z6, dVar4, 0L, i4, j8, drmInitData4, strM11239z, strM11219e3, jM11233t != -1 ? jM11233t : 0L, jM11233t2, false, false, true);
                                                }
                                                c1987c = c1987c;
                                                c1986b2 = c1986b;
                                                strM11239z = strM11239z;
                                                str4 = str4;
                                                jM11227n = j22;
                                                drmInitData2 = drmInitData4;
                                                fVar = fVar;
                                                zM11230q = zM11230q;
                                                arrayList4 = arrayList4;
                                                str3 = str2;
                                                treeMap = treeMap;
                                                j11 = -1;
                                            }
                                        }
                                        strM11239z = strM11239z;
                                        str4 = str4;
                                    }
                                }
                                fVar = fVar;
                                zM11230q = zM11230q;
                                arrayList4 = arrayList4;
                                str3 = str2;
                            }
                            dVar = dVar4;
                            i = i4;
                            j = jM11227n;
                            c1987c = c1987c;
                            dVar4 = dVar;
                            strM11239z = strM11239z;
                            str4 = str4;
                            jM11227n = j;
                            strM11234u = strM11234u;
                            jM11213A = jM11213A;
                            j7 = j7;
                            j6 = j6;
                            fVar = fVar;
                            zM11230q = zM11230q;
                            arrayList4 = arrayList4;
                            str3 = str2;
                            treeMap = treeMap;
                            j11 = -1;
                            c1986b2 = c1986b;
                            i4 = i;
                        }
                        fVar = fVar;
                        zM11230q = zM11230q;
                        arrayList4 = arrayList4;
                    }
                }
                fVar = fVar;
            }
        }
        boolean z9 = zM11230q;
        ArrayList arrayList7 = arrayList4;
        C1986b.f fVar2 = fVar;
        HashMap map3 = new HashMap();
        for (int i11 = 0; i11 < arrayList3.size(); i11++) {
            C1986b.c cVar = (C1986b.c) arrayList3.get(i11);
            long size = cVar.f8643b;
            if (size == -1) {
                size = (j12 + ((long) arrayList.size())) - (arrayList2.isEmpty() ? 1L : 0L);
            }
            int size2 = cVar.f8644c;
            if (size2 == -1 && jM11223j != -9223372036854775807L) {
                size2 = (arrayList2.isEmpty() ? ((C1986b.d) akq.m98599g(arrayList)).f8646m : arrayList2).size() - 1;
            }
            Uri uri = cVar.f8642a;
            map3.put(uri, new C1986b.c(uri, size, size2));
        }
        if (bVar != null) {
            arrayList2.add(bVar);
        }
        return new C1986b(i2, str, arrayList7, j5, z9, jM105084J0, z6, i3, j12, iM11226m, jM11226m, jM11223j, z3, z4, jM105084J0 != 0, drmInitDataM11218d2, arrayList, arrayList2, fVar2, map3);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:82:0x02fc  */
    /* JADX WARN: Failed to find 'out' block for switch in B:99:0x032a. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: p */
    public static C1987c m11229p(C1981a c1981a, String str) throws IOException {
        ArrayList arrayList;
        String strM149006g;
        ArrayList arrayList2;
        int i;
        String str2;
        ArrayList arrayList3;
        String strM149006g2;
        int i2;
        int i3;
        Uri uriM133582e;
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
            if (!c1981a.m11241a()) {
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
                    C1987c.b bVar = (C1987c.b) arrayList4.get(i6);
                    if (hashSet.add(bVar.f8678a)) {
                        w11.m204371g(bVar.f8679b.f7783j == null ? i5 : 0);
                        Metadata.Entry[] entryArr = new Metadata.Entry[i5];
                        entryArr[0] = new HlsTrackMetadataEntry(null, null, (List) w11.m204369e((ArrayList) map.get(bVar.f8678a)));
                        arrayList17.add(bVar.m11322a(bVar.f8679b.m10336b().m10393Z(new Metadata(entryArr)).m10374G()));
                    }
                    i6++;
                    i5 = 1;
                }
                int i7 = 0;
                ArrayList arrayList18 = null;
                C1894k c1894kM10374G = null;
                while (i7 < arrayList9.size()) {
                    String str4 = (String) arrayList9.get(i7);
                    String strM11239z = m11239z(str4, f8552Q, map2);
                    String strM11239z2 = m11239z(str4, f8551P, map2);
                    C1894k.b bVar2 = new C1894k.b();
                    StringBuilder sb = new StringBuilder();
                    sb.append(strM11239z);
                    ArrayList arrayList19 = arrayList18;
                    sb.append(":");
                    sb.append(strM11239z2);
                    C1894k.b bVarM10391X = bVar2.m10388U(sb.toString()).m10390W(strM11239z2).m10380M("application/x-mpegURL").m10402i0(m11237x(str4)).m10398e0(m11236w(str4, map2)).m10391X(m11235v(str4, f8550O, map2));
                    String strM11235v = m11235v(str4, f8546K, map2);
                    Uri uriM133582e2 = strM11235v == null ? null : h4k0.m133582e(str3, strM11235v);
                    ArrayList arrayList20 = arrayList9;
                    Metadata metadata = new Metadata(new HlsTrackMetadataEntry(strM11239z, strM11239z2, Collections.EMPTY_LIST));
                    String strM11239z3 = m11239z(str4, f8548M, map2);
                    strM11239z3.getClass();
                    switch (strM11239z3) {
                        case "SUBTITLES":
                            arrayList = arrayList12;
                            C1987c.b bVarM11221g = m11221g(arrayList4, strM11239z);
                            if (bVarM11221g != null) {
                                String strM105089M = bmk0.m105089M(bVarM11221g.f8679b.f7782i, 3);
                                bVarM10391X.m10378K(strM105089M);
                                strM149006g = kb00.m149006g(strM105089M);
                            } else {
                                strM149006g = null;
                            }
                            if (strM149006g == null) {
                                strM149006g = "text/vtt";
                            }
                            bVarM10391X.m10400g0(strM149006g).m10393Z(metadata);
                            if (uriM133582e2 != null) {
                                C1987c.a aVar = new C1987c.a(uriM133582e2, bVarM10391X.m10374G(), strM11239z, strM11239z2);
                                arrayList2 = arrayList13;
                                arrayList2.add(aVar);
                            } else {
                                arrayList2 = arrayList13;
                                kyv.m152151i("HlsPlaylistParser", "EXT-X-MEDIA tag with missing mandatory URI attribute: skipping");
                            }
                            arrayList3 = arrayList19;
                            break;
                        case "CLOSED-CAPTIONS":
                            arrayList = arrayList12;
                            String strM11239z4 = m11239z(str4, f8554S, map2);
                            if (strM11239z4.startsWith("CC")) {
                                i = Integer.parseInt(strM11239z4.substring(2));
                                str2 = "application/cea-608";
                            } else {
                                i = Integer.parseInt(strM11239z4.substring(7));
                                str2 = "application/cea-708";
                            }
                            arrayList3 = arrayList19 == null ? new ArrayList() : arrayList19;
                            bVarM10391X.m10400g0(str2).m10375H(i);
                            arrayList3.add(bVarM10391X.m10374G());
                            arrayList2 = arrayList13;
                            break;
                        case "AUDIO":
                            C1987c.b bVarM11220f = m11220f(arrayList4, strM11239z);
                            if (bVarM11220f != null) {
                                String strM105089M2 = bmk0.m105089M(bVarM11220f.f8679b.f7782i, 1);
                                bVarM10391X.m10378K(strM105089M2);
                                strM149006g2 = kb00.m149006g(strM105089M2);
                            } else {
                                strM149006g2 = null;
                            }
                            String strM11235v2 = m11235v(str4, f8570i, map2);
                            if (strM11235v2 != null) {
                                bVarM10391X.m10377J(Integer.parseInt(bmk0.m105122b1(strM11235v2, "/")[0]));
                                if ("audio/eac3".equals(strM149006g2) && strM11235v2.endsWith("/JOC")) {
                                    bVarM10391X.m10378K("ec+3");
                                    strM149006g2 = "audio/eac3-joc";
                                }
                            }
                            bVarM10391X.m10400g0(strM149006g2);
                            if (uriM133582e2 == null) {
                                arrayList = arrayList12;
                                if (bVarM11220f != null) {
                                    arrayList3 = arrayList19;
                                    c1894kM10374G = bVarM10391X.m10374G();
                                    arrayList2 = arrayList13;
                                }
                                break;
                            } else {
                                bVarM10391X.m10393Z(metadata);
                                arrayList = arrayList12;
                                arrayList.add(new C1987c.a(uriM133582e2, bVarM10391X.m10374G(), strM11239z, strM11239z2));
                            }
                            arrayList2 = arrayList13;
                            arrayList3 = arrayList19;
                            break;
                        case "VIDEO":
                            C1987c.b bVarM11222h = m11222h(arrayList4, strM11239z);
                            if (bVarM11222h != null) {
                                C1894k c1894k = bVarM11222h.f8679b;
                                String strM105089M3 = bmk0.m105089M(c1894k.f7782i, 2);
                                bVarM10391X.m10378K(strM105089M3).m10400g0(kb00.m149006g(strM105089M3)).m10407n0(c1894k.f7790q).m10386S(c1894k.f7791r).m10385R(c1894k.f7792s);
                            }
                            if (uriM133582e2 != null) {
                                bVarM10391X.m10393Z(metadata);
                                arrayList5.add(new C1987c.a(uriM133582e2, bVarM10391X.m10374G(), strM11239z, strM11239z2));
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
                return new C1987c(str, arrayList15, arrayList17, arrayList5, arrayList12, arrayList13, arrayList14, c1894kM10374G, z3 ? Collections.EMPTY_LIST : arrayList18, z4, map2, arrayList16);
            }
            String strM11242b = c1981a.m11242b();
            if (strM11242b.startsWith("#EXT")) {
                arrayList11.add(strM11242b);
            }
            boolean zStartsWith = strM11242b.startsWith("#EXT-X-I-FRAME-STREAM-INF");
            ArrayList arrayList21 = arrayList8;
            if (strM11242b.startsWith("#EXT-X-DEFINE")) {
                map2.put(m11239z(strM11242b, f8551P, map2), m11239z(strM11242b, f8561Z, map2));
            } else {
                if (strM11242b.equals("#EXT-X-INDEPENDENT-SEGMENTS")) {
                    z2 = true;
                } else if (strM11242b.startsWith("#EXT-X-MEDIA")) {
                    arrayList9.add(strM11242b);
                } else if (strM11242b.startsWith("#EXT-X-SESSION-KEY")) {
                    DrmInitData.SchemeData schemeDataM11224k = m11224k(strM11242b, m11234u(strM11242b, f8544I, "identity", map2), map2);
                    if (schemeDataM11224k != null) {
                        arrayList10.add(new DrmInitData(m11225l(m11239z(strM11242b, f8543H, map2)), schemeDataM11224k));
                    }
                } else if (strM11242b.startsWith("#EXT-X-STREAM-INF") || zStartsWith) {
                    boolean zContains = z | strM11242b.contains("CLOSED-CAPTIONS=NONE");
                    int i8 = zStartsWith ? 16384 : 0;
                    int iM11226m = m11226m(strM11242b, f8569h);
                    int iM11232s = m11232s(strM11242b, f8564c, -1);
                    String strM11235v3 = m11235v(strM11242b, f8571j, map2);
                    String strM11235v4 = m11235v(strM11242b, f8572k, map2);
                    if (strM11235v4 != null) {
                        String[] strArrM105119a1 = bmk0.m105119a1(strM11235v4, BaseSei.f14624X);
                        int i9 = Integer.parseInt(strArrM105119a1[0]);
                        int i10 = Integer.parseInt(strArrM105119a1[1]);
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
                    String strM11235v5 = m11235v(strM11242b, f8573l, map2);
                    float f = strM11235v5 != null ? Float.parseFloat(strM11235v5) : -1.0f;
                    String strM11235v6 = m11235v(strM11242b, f8565d, map2);
                    String strM11235v7 = m11235v(strM11242b, f8566e, map2);
                    String strM11235v8 = m11235v(strM11242b, f8567f, map2);
                    String strM11235v9 = m11235v(strM11242b, f8568g, map2);
                    if (zStartsWith) {
                        uriM133582e = h4k0.m133582e(str3, m11239z(strM11242b, f8546K, map2));
                    } else {
                        if (!c1981a.m11241a()) {
                            throw ParserException.createForMalformedManifest("#EXT-X-STREAM-INF must be followed by another line", null);
                        }
                        uriM133582e = h4k0.m133582e(str3, m11214B(c1981a.m11242b(), map2));
                    }
                    Uri uri = uriM133582e;
                    arrayList4.add(new C1987c.b(uri, new C1894k.b().m10387T(arrayList4.size()).m10380M("application/x-mpegURL").m10378K(strM11235v3).m10376I(iM11232s).m10395b0(iM11226m).m10407n0(i2).m10386S(i3).m10385R(f).m10398e0(i8).m10374G(), strM11235v6, strM11235v7, strM11235v8, strM11235v9));
                    ArrayList arrayList22 = (ArrayList) map.get(uri);
                    if (arrayList22 == null) {
                        arrayList22 = new ArrayList();
                        map.put(uri, arrayList22);
                    }
                    arrayList22.add(new HlsTrackMetadataEntry.VariantInfo(iM11232s, iM11226m, strM11235v6, strM11235v7, strM11235v8, strM11235v9));
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
    public static boolean m11230q(String str, Pattern pattern, boolean z) {
        Matcher matcher = pattern.matcher(str);
        return matcher.find() ? "YES".equals(matcher.group(1)) : z;
    }

    /* JADX INFO: renamed from: r */
    public static double m11231r(String str, Pattern pattern, double d) {
        Matcher matcher = pattern.matcher(str);
        return matcher.find() ? Double.parseDouble((String) w11.m204369e(matcher.group(1))) : d;
    }

    /* JADX INFO: renamed from: s */
    public static int m11232s(String str, Pattern pattern, int i) {
        Matcher matcher = pattern.matcher(str);
        return matcher.find() ? Integer.parseInt((String) w11.m204369e(matcher.group(1))) : i;
    }

    /* JADX INFO: renamed from: t */
    public static long m11233t(String str, Pattern pattern, long j) {
        Matcher matcher = pattern.matcher(str);
        return matcher.find() ? Long.parseLong((String) w11.m204369e(matcher.group(1))) : j;
    }

    /* JADX INFO: renamed from: u */
    public static String m11234u(String str, Pattern pattern, String str2, Map<String, String> map) {
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            str2 = (String) w11.m204369e(matcher.group(1));
        }
        return (map.isEmpty() || str2 == null) ? str2 : m11214B(str2, map);
    }

    @Nullable
    /* JADX INFO: renamed from: v */
    public static String m11235v(String str, Pattern pattern, Map<String, String> map) {
        return m11234u(str, pattern, null, map);
    }

    /* JADX INFO: renamed from: w */
    public static int m11236w(String str, Map<String, String> map) {
        String strM11235v = m11235v(str, f8553R, map);
        if (TextUtils.isEmpty(strM11235v)) {
            return 0;
        }
        String[] strArrM105119a1 = bmk0.m105119a1(strM11235v, Constants.SEPARATOR_COMMA);
        int i = bmk0.m105166s(strArrM105119a1, "public.accessibility.describes-video") ? 512 : 0;
        if (bmk0.m105166s(strArrM105119a1, "public.accessibility.transcribes-spoken-dialog")) {
            i |= 4096;
        }
        if (bmk0.m105166s(strArrM105119a1, "public.accessibility.describes-music-and-sound")) {
            i |= 1024;
        }
        return bmk0.m105166s(strArrM105119a1, "public.easy-to-read") ? i | 8192 : i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [int] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX INFO: renamed from: x */
    public static int m11237x(String str) {
        boolean zM11230q = m11230q(str, f8556U, false);
        ?? r0 = zM11230q;
        if (m11230q(str, f8557V, false)) {
            r0 = (zM11230q ? 1 : 0) | 2;
        }
        return m11230q(str, f8555T, false) ? r0 | 4 : r0;
    }

    /* JADX INFO: renamed from: y */
    public static C1986b.f m11238y(String str) {
        double dM11231r = m11231r(str, f8579r, -9.223372036854776E18d);
        long j = dM11231r == -9.223372036854776E18d ? -9223372036854775807L : (long) (dM11231r * 1000000.0d);
        boolean zM11230q = m11230q(str, f8580s, false);
        double dM11231r2 = m11231r(str, f8582u, -9.223372036854776E18d);
        long j2 = dM11231r2 == -9.223372036854776E18d ? -9223372036854775807L : (long) (dM11231r2 * 1000000.0d);
        double dM11231r3 = m11231r(str, f8583v, -9.223372036854776E18d);
        return new C1986b.f(j, zM11230q, j2, dM11231r3 != -9.223372036854776E18d ? (long) (dM11231r3 * 1000000.0d) : -9223372036854775807L, m11230q(str, f8584w, false));
    }

    /* JADX INFO: renamed from: z */
    public static String m11239z(String str, Pattern pattern, Map<String, String> map) throws ParserException {
        String strM11235v = m11235v(str, pattern, map);
        if (strM11235v != null) {
            return strM11235v;
        }
        throw ParserException.createForMalformedManifest("Couldn't match " + pattern.pattern() + " in " + str, null);
    }

    @Override // com.google.android.exoplayer2.upstream.C2073d.a
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public m5l mo11073a(Uri uri, InputStream inputStream) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        ArrayDeque arrayDeque = new ArrayDeque();
        try {
            if (!m11216b(bufferedReader)) {
                throw ParserException.createForMalformedManifest("Input does not start with the #EXTM3U header.", null);
            }
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    bmk0.m105156n(bufferedReader);
                    throw ParserException.createForMalformedManifest("Failed to parse the playlist, could not identify any tags.", null);
                }
                String strTrim = line.trim();
                if (!strTrim.isEmpty()) {
                    if (strTrim.startsWith("#EXT-X-STREAM-INF")) {
                        arrayDeque.add(strTrim);
                        C1987c c1987cM11229p = m11229p(new C1981a(arrayDeque, bufferedReader), uri.toString());
                        bmk0.m105156n(bufferedReader);
                        return c1987cM11229p;
                    }
                    if (!strTrim.startsWith("#EXT-X-TARGETDURATION") && !strTrim.startsWith("#EXT-X-MEDIA-SEQUENCE") && !strTrim.startsWith("#EXTINF") && !strTrim.startsWith("#EXT-X-KEY") && !strTrim.startsWith("#EXT-X-BYTERANGE") && !strTrim.equals("#EXT-X-DISCONTINUITY") && !strTrim.equals("#EXT-X-DISCONTINUITY-SEQUENCE") && !strTrim.equals("#EXT-X-ENDLIST")) {
                        arrayDeque.add(strTrim);
                    }
                    arrayDeque.add(strTrim);
                    C1986b c1986bM11228o = m11228o(this.f8588a, this.f8589b, new C1981a(arrayDeque, bufferedReader), uri.toString());
                    bmk0.m105156n(bufferedReader);
                    return c1986bM11228o;
                }
            }
        } catch (Throwable th) {
            bmk0.m105156n(bufferedReader);
            throw th;
        }
    }

    public HlsPlaylistParser() {
        this(C1987c.f8663n, null);
    }
}
