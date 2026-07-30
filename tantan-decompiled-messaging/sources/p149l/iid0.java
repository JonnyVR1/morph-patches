package p149l;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.clevertap.android.sdk.Constants;
import com.google.android.exoplayer2.C1871k;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.source.rtsp.C1981e;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.tencent.youtu.sdkkitframework.common.YtVideoEncoder;
import org.eclipse.jetty.http.HttpHeaders;
import org.fourthline.cling.support.model.dlna.DLNAProfiles;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class iid0 {

    /* JADX INFO: renamed from: a */
    public final whd0 f113397a;

    /* JADX INFO: renamed from: b */
    public final Uri f113398b;

    public iid0(C1981e c1981e, njx njxVar, Uri uri) {
        p11.m167008b(njxVar.f139347i.containsKey("control"), "missing attribute control");
        this.f113397a = m136382b(njxVar);
        this.f113398b = m136381a(c1981e, uri, (String) vck0.m197866j(njxVar.f139347i.get("control")));
    }

    /* JADX INFO: renamed from: a */
    public static Uri m136381a(C1981e c1981e, Uri uri, String str) {
        Uri uri2 = Uri.parse(str);
        if (uri2.isAbsolute()) {
            return uri2;
        }
        if (!TextUtils.isEmpty(c1981e.m11559d("Content-Base"))) {
            uri = Uri.parse(c1981e.m11559d("Content-Base"));
        } else if (!TextUtils.isEmpty(c1981e.m11559d(HttpHeaders.CONTENT_LOCATION))) {
            uri = Uri.parse(c1981e.m11559d(HttpHeaders.CONTENT_LOCATION));
        }
        return str.equals("*") ? uri : uri.buildUpon().appendEncodedPath(str).build();
    }

    /* JADX WARN: Code duplicated, block: B:65:0x0163 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:66:0x0165  */
    /* JADX WARN: Code duplicated, block: B:67:0x0167  */
    @VisibleForTesting
    /* JADX INFO: renamed from: b */
    public static whd0 m136382b(njx njxVar) {
        int iM136384d;
        String str;
        boolean z;
        C1871k.b bVar = new C1871k.b();
        int i = njxVar.f139343e;
        if (i > 0) {
            bVar.m10322I(i);
        }
        njx.C18721c c18721c = njxVar.f139348j;
        int i2 = c18721c.f139358a;
        String str2 = c18721c.f139359b;
        String strM203122a = whd0.m203122a(str2);
        bVar.m10346g0(strM203122a);
        int i3 = njxVar.f139348j.f139360c;
        if ("audio".equals(njxVar.f139339a)) {
            iM136384d = m136384d(njxVar.f139348j.f139361d, strM203122a);
            bVar.m10347h0(i3).m10323J(iM136384d);
        } else {
            iM136384d = -1;
        }
        ImmutableMap<String, String> immutableMapM159797a = njxVar.m159797a();
        switch (strM203122a.hashCode()) {
            case -1664118616:
                if (strM203122a.equals(DLNAProfiles.DLNAMimeTypes.MIME_VIDEO_3GP)) {
                    bVar.m10353n0(352).m10332S(288);
                }
                break;
            case -1662541442:
                if (strM203122a.equals("video/hevc")) {
                    p11.m167008b(!immutableMapM159797a.isEmpty(), "missing attribute fmtp");
                    m136388h(bVar, immutableMapM159797a);
                }
                break;
            case -1606874997:
                if (strM203122a.equals("audio/amr-wb")) {
                    if (iM136384d == 1) {
                        z = true;
                    } else {
                        z = false;
                    }
                    p11.m167008b(z, "Multi channel AMR is not currently supported.");
                    p11.m167008b(!immutableMapM159797a.isEmpty(), "fmtp parameters must include octet-align.");
                    p11.m167008b(immutableMapM159797a.containsKey("octet-align"), "Only octet aligned mode is currently supported.");
                    p11.m167008b(!immutableMapM159797a.containsKey("interleaving"), "Interleaving mode is not currently supported.");
                }
                break;
            case -53558318:
                if (strM203122a.equals("audio/mp4a-latm")) {
                    p11.m167007a(iM136384d != -1);
                    p11.m167008b(!immutableMapM159797a.isEmpty(), "missing attribute fmtp");
                    if (str2.equals("MP4A-LATM")) {
                        p11.m167008b(immutableMapM159797a.containsKey("cpresent") && immutableMapM159797a.get("cpresent").equals("0"), "Only supports cpresent=0 in AAC audio.");
                        String str3 = immutableMapM159797a.get(Constants.KEY_CONFIG);
                        p11.m167012f(str3, "AAC audio stream must include config fmtp parameter");
                        p11.m167008b(str3.length() % 2 == 0, "Malformat MPEG4 config: ".concat(str3));
                        C21594z1.b bVarM136385e = m136385e(str3);
                        bVar.m10347h0(bVarM136385e.f201034a).m10323J(bVarM136385e.f201035b).m10324K(bVarM136385e.f201036c);
                    }
                    m136386f(bVar, immutableMapM159797a, str2, iM136384d, i3);
                }
                break;
            case 187078296:
                str = "audio/ac3";
                strM203122a.equals(str);
                break;
            case 187094639:
                if (strM203122a.equals("audio/raw")) {
                    bVar.m10340a0(whd0.m203123b(str2));
                }
                break;
            case 1187890754:
                if (strM203122a.equals("video/mp4v-es")) {
                    p11.m167007a(!immutableMapM159797a.isEmpty());
                    m136389i(bVar, immutableMapM159797a);
                }
                break;
            case 1331836730:
                if (strM203122a.equals(YtVideoEncoder.MIME_TYPE)) {
                    p11.m167008b(!immutableMapM159797a.isEmpty(), "missing attribute fmtp");
                    m136387g(bVar, immutableMapM159797a);
                }
                break;
            case 1503095341:
                if (strM203122a.equals(DLNAProfiles.DLNAMimeTypes.MIME_AUDIO_3GP)) {
                    if (iM136384d == 1) {
                        z = true;
                    } else {
                        z = false;
                    }
                    p11.m167008b(z, "Multi channel AMR is not currently supported.");
                    p11.m167008b(!immutableMapM159797a.isEmpty(), "fmtp parameters must include octet-align.");
                    p11.m167008b(immutableMapM159797a.containsKey("octet-align"), "Only octet aligned mode is currently supported.");
                    p11.m167008b(!immutableMapM159797a.containsKey("interleaving"), "Interleaving mode is not currently supported.");
                }
                break;
            case 1504891608:
                if (strM203122a.equals("audio/opus")) {
                    p11.m167007a(iM136384d != -1);
                    p11.m167008b(i3 == 48000, "Invalid OPUS clock rate.");
                }
                break;
            case 1599127256:
                if (strM203122a.equals("video/x-vnd.on2.vp8")) {
                    bVar.m10353n0(320).m10332S(240);
                }
                break;
            case 1599127257:
                if (strM203122a.equals("video/x-vnd.on2.vp9")) {
                    bVar.m10353n0(320).m10332S(240);
                }
                break;
            case 1903231877:
                str = "audio/g711-alaw";
                strM203122a.equals(str);
                break;
            case 1903589369:
                str = "audio/g711-mlaw";
                strM203122a.equals(str);
                break;
        }
        p11.m167007a(i3 > 0);
        return new whd0(bVar.m10320G(), i2, i3, immutableMapM159797a, str2);
    }

    /* JADX INFO: renamed from: c */
    public static byte[] m136383c(String str) {
        byte[] bArrDecode = Base64.decode(str, 0);
        int length = bArrDecode.length;
        byte[] bArr = b320.f72762a;
        byte[] bArr2 = new byte[length + bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        System.arraycopy(bArrDecode, 0, bArr2, bArr.length, bArrDecode.length);
        return bArr2;
    }

    /* JADX INFO: renamed from: d */
    public static int m136384d(int i, String str) {
        if (i != -1) {
            return i;
        }
        return str.equals("audio/ac3") ? 6 : 1;
    }

    /* JADX INFO: renamed from: e */
    public static C21594z1.b m136385e(String str) {
        c860 c860Var = new c860(vck0.m197807K(str));
        p11.m167008b(c860Var.m105664h(1) == 0, "Only supports audio mux version 0.");
        p11.m167008b(c860Var.m105664h(1) == 1, "Only supports allStreamsSameTimeFraming.");
        c860Var.m105674r(6);
        p11.m167008b(c860Var.m105664h(4) == 0, "Only supports one program.");
        p11.m167008b(c860Var.m105664h(3) == 0, "Only supports one numLayer.");
        try {
            return C21594z1.m216777e(c860Var, false);
        } catch (ParserException e) {
            fg3.m121203a(e);
            return null;
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m136386f(C1871k.b bVar, ImmutableMap<String, String> immutableMap, String str, int i, int i2) {
        String str2 = immutableMap.get("profile-level-id");
        if (str2 == null && str.equals("MP4A-LATM")) {
            str2 = "30";
        }
        p11.m167008b((str2 == null || str2.isEmpty()) ? false : true, "missing profile-level-id param");
        bVar.m10324K("mp4a.40." + str2);
        bVar.m10335V(ImmutableList.m15686of(C21594z1.m216773a(i2, i)));
    }

    /* JADX INFO: renamed from: g */
    public static void m136387g(C1871k.b bVar, ImmutableMap<String, String> immutableMap) {
        p11.m167008b(immutableMap.containsKey("sprop-parameter-sets"), "missing sprop parameter");
        String[] strArrM197841a1 = vck0.m197841a1((String) p11.m167011e(immutableMap.get("sprop-parameter-sets")), Constants.SEPARATOR_COMMA);
        p11.m167008b(strArrM197841a1.length == 2, "empty sprop value");
        ImmutableList immutableListM15687of = ImmutableList.m15687of(m136383c(strArrM197841a1[0]), m136383c(strArrM197841a1[1]));
        bVar.m10335V(immutableListM15687of);
        byte[] bArr = immutableListM15687of.get(0);
        b320.C15785c c15785cM100049l = b320.m100049l(bArr, b320.f72762a.length, bArr.length);
        bVar.m10342c0(c15785cM100049l.f72792h);
        bVar.m10332S(c15785cM100049l.f72791g);
        bVar.m10353n0(c15785cM100049l.f72790f);
        String str = immutableMap.get("profile-level-id");
        if (str != null) {
            bVar.m10324K("avc1.".concat(str));
        } else {
            bVar.m10324K(lb5.m149199a(c15785cM100049l.f72785a, c15785cM100049l.f72786b, c15785cM100049l.f72787c));
        }
    }

    /* JADX INFO: renamed from: h */
    public static void m136388h(C1871k.b bVar, ImmutableMap<String, String> immutableMap) {
        if (immutableMap.containsKey("sprop-max-don-diff")) {
            int i = Integer.parseInt((String) p11.m167011e(immutableMap.get("sprop-max-don-diff")));
            p11.m167008b(i == 0, "non-zero sprop-max-don-diff " + i + " is not supported");
        }
        p11.m167008b(immutableMap.containsKey("sprop-vps"), "missing sprop-vps parameter");
        String str = (String) p11.m167011e(immutableMap.get("sprop-vps"));
        p11.m167008b(immutableMap.containsKey("sprop-sps"), "missing sprop-sps parameter");
        String str2 = (String) p11.m167011e(immutableMap.get("sprop-sps"));
        p11.m167008b(immutableMap.containsKey("sprop-pps"), "missing sprop-pps parameter");
        ImmutableList immutableListM15688of = ImmutableList.m15688of(m136383c(str), m136383c(str2), m136383c((String) p11.m167011e(immutableMap.get("sprop-pps"))));
        bVar.m10335V(immutableListM15688of);
        byte[] bArr = immutableListM15688of.get(1);
        b320.C15783a c15783aM100045h = b320.m100045h(bArr, b320.f72762a.length, bArr.length);
        bVar.m10342c0(c15783aM100045h.f72778m);
        bVar.m10332S(c15783aM100045h.f72777l).m10353n0(c15783aM100045h.f72776k);
        bVar.m10324K(lb5.m149201c(c15783aM100045h.f72766a, c15783aM100045h.f72767b, c15783aM100045h.f72768c, c15783aM100045h.f72769d, c15783aM100045h.f72773h, c15783aM100045h.f72774i));
    }

    /* JADX INFO: renamed from: i */
    public static void m136389i(C1871k.b bVar, ImmutableMap<String, String> immutableMap) {
        String str = immutableMap.get(Constants.KEY_CONFIG);
        if (str != null) {
            byte[] bArrM197807K = vck0.m197807K(str);
            bVar.m10335V(ImmutableList.m15686of(bArrM197807K));
            Pair<Integer, Integer> pairM149204f = lb5.m149204f(bArrM197807K);
            bVar.m10353n0(((Integer) pairM149204f.first).intValue()).m10332S(((Integer) pairM149204f.second).intValue());
        } else {
            bVar.m10353n0(352).m10332S(288);
        }
        String str2 = immutableMap.get("profile-level-id");
        if (str2 == null) {
            str2 = "1";
        }
        bVar.m10324K("mp4v.".concat(str2));
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && iid0.class == obj.getClass()) {
            iid0 iid0Var = (iid0) obj;
            if (this.f113397a.equals(iid0Var.f113397a) && this.f113398b.equals(iid0Var.f113398b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((217 + this.f113397a.hashCode()) * 31) + this.f113398b.hashCode();
    }
}
