package p153l;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.clevertap.android.sdk.Constants;
import com.google.android.exoplayer2.C1894k;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.source.rtsp.C2004e;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.tencent.youtu.sdkkitframework.common.YtVideoEncoder;
import org.eclipse.jetty.http.HttpHeaders;
import org.fourthline.cling.support.model.dlna.DLNAProfiles;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class lqd0 {

    /* JADX INFO: renamed from: a */
    public final zpd0 f133191a;

    /* JADX INFO: renamed from: b */
    public final Uri f133192b;

    public lqd0(C2004e c2004e, ksx ksxVar, Uri uri) {
        w11.m204366b(ksxVar.f128622i.containsKey("control"), "missing attribute control");
        this.f133191a = m155482b(ksxVar);
        this.f133192b = m155481a(c2004e, uri, (String) bmk0.m105144j(ksxVar.f128622i.get("control")));
    }

    /* JADX INFO: renamed from: a */
    public static Uri m155481a(C2004e c2004e, Uri uri, String str) {
        Uri uri2 = Uri.parse(str);
        if (uri2.isAbsolute()) {
            return uri2;
        }
        if (!TextUtils.isEmpty(c2004e.m11613d("Content-Base"))) {
            uri = Uri.parse(c2004e.m11613d("Content-Base"));
        } else if (!TextUtils.isEmpty(c2004e.m11613d(HttpHeaders.CONTENT_LOCATION))) {
            uri = Uri.parse(c2004e.m11613d(HttpHeaders.CONTENT_LOCATION));
        }
        return str.equals("*") ? uri : uri.buildUpon().appendEncodedPath(str).build();
    }

    /* JADX WARN: Code duplicated, block: B:65:0x0163 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:66:0x0165  */
    /* JADX WARN: Code duplicated, block: B:67:0x0167  */
    @VisibleForTesting
    /* JADX INFO: renamed from: b */
    public static zpd0 m155482b(ksx ksxVar) {
        int iM155484d;
        String str;
        boolean z;
        C1894k.b bVar = new C1894k.b();
        int i = ksxVar.f128618e;
        if (i > 0) {
            bVar.m10376I(i);
        }
        ksx.C18254c c18254c = ksxVar.f128623j;
        int i2 = c18254c.f128633a;
        String str2 = c18254c.f128634b;
        String strM220831a = zpd0.m220831a(str2);
        bVar.m10400g0(strM220831a);
        int i3 = ksxVar.f128623j.f128635c;
        if ("audio".equals(ksxVar.f128614a)) {
            iM155484d = m155484d(ksxVar.f128623j.f128636d, strM220831a);
            bVar.m10401h0(i3).m10377J(iM155484d);
        } else {
            iM155484d = -1;
        }
        ImmutableMap<String, String> immutableMapM151293a = ksxVar.m151293a();
        switch (strM220831a.hashCode()) {
            case -1664118616:
                if (strM220831a.equals(DLNAProfiles.DLNAMimeTypes.MIME_VIDEO_3GP)) {
                    bVar.m10407n0(352).m10386S(288);
                }
                break;
            case -1662541442:
                if (strM220831a.equals("video/hevc")) {
                    w11.m204366b(!immutableMapM151293a.isEmpty(), "missing attribute fmtp");
                    m155488h(bVar, immutableMapM151293a);
                }
                break;
            case -1606874997:
                if (strM220831a.equals("audio/amr-wb")) {
                    if (iM155484d == 1) {
                        z = true;
                    } else {
                        z = false;
                    }
                    w11.m204366b(z, "Multi channel AMR is not currently supported.");
                    w11.m204366b(!immutableMapM151293a.isEmpty(), "fmtp parameters must include octet-align.");
                    w11.m204366b(immutableMapM151293a.containsKey("octet-align"), "Only octet aligned mode is currently supported.");
                    w11.m204366b(!immutableMapM151293a.containsKey("interleaving"), "Interleaving mode is not currently supported.");
                }
                break;
            case -53558318:
                if (strM220831a.equals("audio/mp4a-latm")) {
                    w11.m204365a(iM155484d != -1);
                    w11.m204366b(!immutableMapM151293a.isEmpty(), "missing attribute fmtp");
                    if (str2.equals("MP4A-LATM")) {
                        w11.m204366b(immutableMapM151293a.containsKey("cpresent") && immutableMapM151293a.get("cpresent").equals("0"), "Only supports cpresent=0 in AAC audio.");
                        String str3 = immutableMapM151293a.get(Constants.KEY_CONFIG);
                        w11.m204370f(str3, "AAC audio stream must include config fmtp parameter");
                        w11.m204366b(str3.length() % 2 == 0, "Malformat MPEG4 config: ".concat(str3));
                        C21738z1.b bVarM155485e = m155485e(str3);
                        bVar.m10401h0(bVarM155485e.f202473a).m10377J(bVarM155485e.f202474b).m10378K(bVarM155485e.f202475c);
                    }
                    m155486f(bVar, immutableMapM151293a, str2, iM155484d, i3);
                }
                break;
            case 187078296:
                str = "audio/ac3";
                strM220831a.equals(str);
                break;
            case 187094639:
                if (strM220831a.equals("audio/raw")) {
                    bVar.m10394a0(zpd0.m220832b(str2));
                }
                break;
            case 1187890754:
                if (strM220831a.equals("video/mp4v-es")) {
                    w11.m204365a(!immutableMapM151293a.isEmpty());
                    m155489i(bVar, immutableMapM151293a);
                }
                break;
            case 1331836730:
                if (strM220831a.equals(YtVideoEncoder.MIME_TYPE)) {
                    w11.m204366b(!immutableMapM151293a.isEmpty(), "missing attribute fmtp");
                    m155487g(bVar, immutableMapM151293a);
                }
                break;
            case 1503095341:
                if (strM220831a.equals(DLNAProfiles.DLNAMimeTypes.MIME_AUDIO_3GP)) {
                    if (iM155484d == 1) {
                        z = true;
                    } else {
                        z = false;
                    }
                    w11.m204366b(z, "Multi channel AMR is not currently supported.");
                    w11.m204366b(!immutableMapM151293a.isEmpty(), "fmtp parameters must include octet-align.");
                    w11.m204366b(immutableMapM151293a.containsKey("octet-align"), "Only octet aligned mode is currently supported.");
                    w11.m204366b(!immutableMapM151293a.containsKey("interleaving"), "Interleaving mode is not currently supported.");
                }
                break;
            case 1504891608:
                if (strM220831a.equals("audio/opus")) {
                    w11.m204365a(iM155484d != -1);
                    w11.m204366b(i3 == 48000, "Invalid OPUS clock rate.");
                }
                break;
            case 1599127256:
                if (strM220831a.equals("video/x-vnd.on2.vp8")) {
                    bVar.m10407n0(320).m10386S(240);
                }
                break;
            case 1599127257:
                if (strM220831a.equals("video/x-vnd.on2.vp9")) {
                    bVar.m10407n0(320).m10386S(240);
                }
                break;
            case 1903231877:
                str = "audio/g711-alaw";
                strM220831a.equals(str);
                break;
            case 1903589369:
                str = "audio/g711-mlaw";
                strM220831a.equals(str);
                break;
        }
        w11.m204365a(i3 > 0);
        return new zpd0(bVar.m10374G(), i2, i3, immutableMapM151293a, str2);
    }

    /* JADX INFO: renamed from: c */
    public static byte[] m155483c(String str) {
        byte[] bArrDecode = Base64.decode(str, 0);
        int length = bArrDecode.length;
        byte[] bArr = jb20.f119084a;
        byte[] bArr2 = new byte[length + bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        System.arraycopy(bArrDecode, 0, bArr2, bArr.length, bArrDecode.length);
        return bArr2;
    }

    /* JADX INFO: renamed from: d */
    public static int m155484d(int i, String str) {
        if (i != -1) {
            return i;
        }
        return str.equals("audio/ac3") ? 6 : 1;
    }

    /* JADX INFO: renamed from: e */
    public static C21738z1.b m155485e(String str) {
        hg60 hg60Var = new hg60(bmk0.m105085K(str));
        w11.m204366b(hg60Var.m134905h(1) == 0, "Only supports audio mux version 0.");
        w11.m204366b(hg60Var.m134905h(1) == 1, "Only supports allStreamsSameTimeFraming.");
        hg60Var.m134915r(6);
        w11.m204366b(hg60Var.m134905h(4) == 0, "Only supports one program.");
        w11.m204366b(hg60Var.m134905h(3) == 0, "Only supports one numLayer.");
        try {
            return C21738z1.m218270e(hg60Var, false);
        } catch (ParserException e) {
            tg3.m191013a(e);
            return null;
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m155486f(C1894k.b bVar, ImmutableMap<String, String> immutableMap, String str, int i, int i2) {
        String str2 = immutableMap.get("profile-level-id");
        if (str2 == null && str.equals("MP4A-LATM")) {
            str2 = "30";
        }
        w11.m204366b((str2 == null || str2.isEmpty()) ? false : true, "missing profile-level-id param");
        bVar.m10378K("mp4a.40." + str2);
        bVar.m10389V(ImmutableList.m15740of(C21738z1.m218266a(i2, i)));
    }

    /* JADX INFO: renamed from: g */
    public static void m155487g(C1894k.b bVar, ImmutableMap<String, String> immutableMap) {
        w11.m204366b(immutableMap.containsKey("sprop-parameter-sets"), "missing sprop parameter");
        String[] strArrM105119a1 = bmk0.m105119a1((String) w11.m204369e(immutableMap.get("sprop-parameter-sets")), Constants.SEPARATOR_COMMA);
        w11.m204366b(strArrM105119a1.length == 2, "empty sprop value");
        ImmutableList immutableListM15741of = ImmutableList.m15741of(m155483c(strArrM105119a1[0]), m155483c(strArrM105119a1[1]));
        bVar.m10389V(immutableListM15741of);
        byte[] bArr = immutableListM15741of.get(0);
        jb20.C17914c c17914cM144194l = jb20.m144194l(bArr, jb20.f119084a.length, bArr.length);
        bVar.m10396c0(c17914cM144194l.f119114h);
        bVar.m10386S(c17914cM144194l.f119113g);
        bVar.m10407n0(c17914cM144194l.f119112f);
        String str = immutableMap.get("profile-level-id");
        if (str != null) {
            bVar.m10378K("avc1.".concat(str));
        } else {
            bVar.m10378K(lc5.m153621a(c17914cM144194l.f119107a, c17914cM144194l.f119108b, c17914cM144194l.f119109c));
        }
    }

    /* JADX INFO: renamed from: h */
    public static void m155488h(C1894k.b bVar, ImmutableMap<String, String> immutableMap) {
        if (immutableMap.containsKey("sprop-max-don-diff")) {
            int i = Integer.parseInt((String) w11.m204369e(immutableMap.get("sprop-max-don-diff")));
            w11.m204366b(i == 0, "non-zero sprop-max-don-diff " + i + " is not supported");
        }
        w11.m204366b(immutableMap.containsKey("sprop-vps"), "missing sprop-vps parameter");
        String str = (String) w11.m204369e(immutableMap.get("sprop-vps"));
        w11.m204366b(immutableMap.containsKey("sprop-sps"), "missing sprop-sps parameter");
        String str2 = (String) w11.m204369e(immutableMap.get("sprop-sps"));
        w11.m204366b(immutableMap.containsKey("sprop-pps"), "missing sprop-pps parameter");
        ImmutableList immutableListM15742of = ImmutableList.m15742of(m155483c(str), m155483c(str2), m155483c((String) w11.m204369e(immutableMap.get("sprop-pps"))));
        bVar.m10389V(immutableListM15742of);
        byte[] bArr = immutableListM15742of.get(1);
        jb20.C17912a c17912aM144190h = jb20.m144190h(bArr, jb20.f119084a.length, bArr.length);
        bVar.m10396c0(c17912aM144190h.f119100m);
        bVar.m10386S(c17912aM144190h.f119099l).m10407n0(c17912aM144190h.f119098k);
        bVar.m10378K(lc5.m153623c(c17912aM144190h.f119088a, c17912aM144190h.f119089b, c17912aM144190h.f119090c, c17912aM144190h.f119091d, c17912aM144190h.f119095h, c17912aM144190h.f119096i));
    }

    /* JADX INFO: renamed from: i */
    public static void m155489i(C1894k.b bVar, ImmutableMap<String, String> immutableMap) {
        String str = immutableMap.get(Constants.KEY_CONFIG);
        if (str != null) {
            byte[] bArrM105085K = bmk0.m105085K(str);
            bVar.m10389V(ImmutableList.m15740of(bArrM105085K));
            Pair<Integer, Integer> pairM153626f = lc5.m153626f(bArrM105085K);
            bVar.m10407n0(((Integer) pairM153626f.first).intValue()).m10386S(((Integer) pairM153626f.second).intValue());
        } else {
            bVar.m10407n0(352).m10386S(288);
        }
        String str2 = immutableMap.get("profile-level-id");
        if (str2 == null) {
            str2 = "1";
        }
        bVar.m10378K("mp4v.".concat(str2));
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && lqd0.class == obj.getClass()) {
            lqd0 lqd0Var = (lqd0) obj;
            if (this.f133191a.equals(lqd0Var.f133191a) && this.f133192b.equals(lqd0Var.f133192b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((217 + this.f133191a.hashCode()) * 31) + this.f133192b.hashCode();
    }
}
