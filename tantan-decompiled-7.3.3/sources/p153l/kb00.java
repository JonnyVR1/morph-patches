package p153l;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.alibaba.fastjson.asm.Opcodes;
import com.clevertap.android.sdk.Constants;
import com.coremedia.iso.boxes.sampleentry.AudioSampleEntry;
import com.coremedia.iso.boxes.sampleentry.VisualSampleEntry;
import com.googlecode.mp4parser.boxes.AC3SpecificBox;
import com.googlecode.mp4parser.boxes.EC3SpecificBox;
import com.mp4parser.iso14496.part30.WebVTTSampleEntry;
import com.mp4parser.iso14496.part30.XMLSubtitleSampleEntry;
import com.tencent.youtu.sdkkitframework.common.YtVideoEncoder;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.fourthline.cling.support.model.dlna.DLNAProfiles;
import org.spongycastle.asn1.eac.EACTags;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class kb00 {

    /* JADX INFO: renamed from: a */
    public static final ArrayList<C18128a> f124735a = new ArrayList<>();

    /* JADX INFO: renamed from: b */
    public static final Pattern f124736b = Pattern.compile("^mp4a\\.([a-zA-Z0-9]{2})(?:\\.([0-9]{1,2}))?$");

    /* JADX INFO: renamed from: l.kb00$a */
    public static final class C18128a {

        /* JADX INFO: renamed from: a */
        public final String f124737a;

        /* JADX INFO: renamed from: b */
        public final String f124738b;

        /* JADX INFO: renamed from: c */
        public final int f124739c;
    }

    /* JADX INFO: renamed from: l.kb00$b */
    @VisibleForTesting
    public static final class C18129b {

        /* JADX INFO: renamed from: a */
        public final int f124740a;

        /* JADX INFO: renamed from: b */
        public final int f124741b;

        public C18129b(int i, int i2) {
            this.f124740a = i;
            this.f124741b = i2;
        }

        /* JADX INFO: renamed from: a */
        public int m149020a() {
            int i = this.f124741b;
            if (i == 2) {
                return 10;
            }
            if (i == 5) {
                return 11;
            }
            if (i == 29) {
                return 12;
            }
            if (i == 42) {
                return 16;
            }
            if (i != 22) {
                return i != 23 ? 0 : 15;
            }
            return 1073741824;
        }
    }

    /* JADX INFO: renamed from: a */
    public static boolean m149000a(@Nullable String str, @Nullable String str2) {
        C18129b c18129bM149008i;
        int iM149020a;
        if (str == null) {
            return false;
        }
        switch (str) {
            case "audio/eac3-joc":
            case "audio/mpeg-L1":
            case "audio/mpeg-L2":
            case "audio/ac3":
            case "audio/raw":
            case "audio/eac3":
            case "audio/flac":
            case "audio/mpeg":
            case "audio/g711-alaw":
            case "audio/g711-mlaw":
                return true;
            case "audio/mp4a-latm":
                return (str2 == null || (c18129bM149008i = m149008i(str2)) == null || (iM149020a = c18129bM149008i.m149020a()) == 0 || iM149020a == 16) ? false : true;
            default:
                return false;
        }
    }

    /* JADX INFO: renamed from: b */
    public static boolean m149001b(@Nullable String str, String str2) {
        return m149003d(str, str2) != null;
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public static String m149002c(@Nullable String str) {
        if (str == null) {
            return null;
        }
        for (String str2 : bmk0.m105125c1(str)) {
            String strM149006g = m149006g(str2);
            if (strM149006g != null && m149014o(strM149006g)) {
                return strM149006g;
            }
        }
        return null;
    }

    @Nullable
    /* JADX INFO: renamed from: d */
    public static String m149003d(@Nullable String str, @Nullable String str2) {
        if (str != null && str2 != null) {
            String[] strArrM105125c1 = bmk0.m105125c1(str);
            StringBuilder sb = new StringBuilder();
            for (String str3 : strArrM105125c1) {
                if (str2.equals(m149006g(str3))) {
                    if (sb.length() > 0) {
                        sb.append(Constants.SEPARATOR_COMMA);
                    }
                    sb.append(str3);
                }
            }
            if (sb.length() > 0) {
                return sb.toString();
            }
        }
        return null;
    }

    @Nullable
    /* JADX INFO: renamed from: e */
    public static String m149004e(String str) {
        int size = f124735a.size();
        for (int i = 0; i < size; i++) {
            C18128a c18128a = f124735a.get(i);
            if (str.startsWith(c18128a.f124738b)) {
                return c18128a.f124737a;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: f */
    public static int m149005f(String str, @Nullable String str2) {
        C18129b c18129bM149008i;
        str.getClass();
        switch (str) {
            case "audio/eac3-joc":
                return 18;
            case "audio/vnd.dts.hd;profile=lbr":
                return 8;
            case "audio/vnd.dts":
                return 7;
            case "audio/mp4a-latm":
                if (str2 == null || (c18129bM149008i = m149008i(str2)) == null) {
                    return 0;
                }
                return c18129bM149008i.m149020a();
            case "audio/ac3":
                return 5;
            case "audio/ac4":
                return 17;
            case "audio/vnd.dts.uhd;profile=p2":
                return 30;
            case "audio/eac3":
                return 6;
            case "audio/mpeg":
                return 9;
            case "audio/opus":
                return 20;
            case "audio/vnd.dts.hd":
                return 8;
            case "audio/true-hd":
                return 14;
            default:
                return 0;
        }
    }

    @Nullable
    /* JADX INFO: renamed from: g */
    public static String m149006g(@Nullable String str) {
        C18129b c18129bM149008i;
        String strM149007h = null;
        if (str == null) {
            return null;
        }
        String strM138051e = i11.m138051e(str.trim());
        if (strM138051e.startsWith(VisualSampleEntry.TYPE3) || strM138051e.startsWith(VisualSampleEntry.TYPE4)) {
            return YtVideoEncoder.MIME_TYPE;
        }
        if (strM138051e.startsWith(VisualSampleEntry.TYPE7) || strM138051e.startsWith(VisualSampleEntry.TYPE6)) {
            return "video/hevc";
        }
        if (strM138051e.startsWith("dvav") || strM138051e.startsWith("dva1") || strM138051e.startsWith("dvhe") || strM138051e.startsWith("dvh1")) {
            return "video/dolby-vision";
        }
        if (strM138051e.startsWith("av01")) {
            return "video/av01";
        }
        if (strM138051e.startsWith("vp9") || strM138051e.startsWith("vp09")) {
            return "video/x-vnd.on2.vp9";
        }
        if (strM138051e.startsWith("vp8") || strM138051e.startsWith("vp08")) {
            return "video/x-vnd.on2.vp8";
        }
        if (strM138051e.startsWith(AudioSampleEntry.TYPE3)) {
            if (strM138051e.startsWith("mp4a.") && (c18129bM149008i = m149008i(strM138051e)) != null) {
                strM149007h = m149007h(c18129bM149008i.f124740a);
            }
            return strM149007h == null ? "audio/mp4a-latm" : strM149007h;
        }
        if (strM138051e.startsWith("mha1")) {
            return "audio/mha1";
        }
        if (strM138051e.startsWith("mhm1")) {
            return "audio/mhm1";
        }
        if (strM138051e.startsWith(AudioSampleEntry.TYPE8) || strM138051e.startsWith(AC3SpecificBox.TYPE)) {
            return "audio/ac3";
        }
        if (strM138051e.startsWith(AudioSampleEntry.TYPE9) || strM138051e.startsWith(EC3SpecificBox.TYPE)) {
            return "audio/eac3";
        }
        if (strM138051e.startsWith("ec+3")) {
            return "audio/eac3-joc";
        }
        if (strM138051e.startsWith("ac-4") || strM138051e.startsWith("dac4")) {
            return "audio/ac4";
        }
        if (strM138051e.startsWith("dtsc")) {
            return "audio/vnd.dts";
        }
        if (strM138051e.startsWith(AudioSampleEntry.TYPE13)) {
            return "audio/vnd.dts.hd;profile=lbr";
        }
        if (strM138051e.startsWith(AudioSampleEntry.TYPE12) || strM138051e.startsWith(AudioSampleEntry.TYPE11)) {
            return "audio/vnd.dts.hd";
        }
        if (strM138051e.startsWith("dtsx")) {
            return "audio/vnd.dts.uhd;profile=p2";
        }
        if (strM138051e.startsWith("opus")) {
            return "audio/opus";
        }
        if (strM138051e.startsWith("vorbis")) {
            return "audio/vorbis";
        }
        if (strM138051e.startsWith("flac")) {
            return "audio/flac";
        }
        if (strM138051e.startsWith(XMLSubtitleSampleEntry.TYPE)) {
            return "application/ttml+xml";
        }
        if (strM138051e.startsWith(WebVTTSampleEntry.TYPE)) {
            return "text/vtt";
        }
        if (strM138051e.contains("cea708")) {
            return "application/cea-708";
        }
        return (strM138051e.contains("eia608") || strM138051e.contains("cea608")) ? "application/cea-608" : m149004e(strM138051e);
    }

    @Nullable
    /* JADX INFO: renamed from: h */
    public static String m149007h(int i) {
        if (i == 32) {
            return "video/mp4v-es";
        }
        if (i == 33) {
            return YtVideoEncoder.MIME_TYPE;
        }
        if (i == 35) {
            return "video/hevc";
        }
        if (i == 64) {
            return "audio/mp4a-latm";
        }
        if (i == 163) {
            return "video/wvc1";
        }
        if (i == 177) {
            return "video/x-vnd.on2.vp9";
        }
        if (i == 165) {
            return "audio/ac3";
        }
        if (i == 166) {
            return "audio/eac3";
        }
        switch (i) {
            case Opcodes.IADD /* 96 */:
            case EACTags.APPLICATION_TEMPLATE /* 97 */:
            case EACTags.FCP_TEMPLATE /* 98 */:
            case 99:
            case 100:
            case 101:
                return "video/mpeg2";
            case 102:
            case 103:
            case 104:
                return "audio/mp4a-latm";
            case 105:
            case 107:
                return DLNAProfiles.DLNAMimeTypes.MIME_AUDIO_MPEG;
            case 106:
                return DLNAProfiles.DLNAMimeTypes.MIME_VIDEO_MPEG;
            default:
                switch (i) {
                    case 169:
                    case CipherSuite.TLS_RSA_PSK_WITH_AES_128_GCM_SHA256 /* 172 */:
                        return "audio/vnd.dts";
                    case CipherSuite.TLS_DHE_PSK_WITH_AES_128_GCM_SHA256 /* 170 */:
                    case CipherSuite.TLS_DHE_PSK_WITH_AES_256_GCM_SHA384 /* 171 */:
                        return "audio/vnd.dts.hd";
                    case CipherSuite.TLS_RSA_PSK_WITH_AES_256_GCM_SHA384 /* 173 */:
                        return "audio/opus";
                    case CipherSuite.TLS_PSK_WITH_AES_128_CBC_SHA256 /* 174 */:
                        return "audio/ac4";
                    default:
                        return null;
                }
        }
    }

    @Nullable
    @VisibleForTesting
    /* JADX INFO: renamed from: i */
    public static C18129b m149008i(String str) {
        Matcher matcher = f124736b.matcher(str);
        if (!matcher.matches()) {
            return null;
        }
        String str2 = (String) w11.m204369e(matcher.group(1));
        String strGroup = matcher.group(2);
        try {
            return new C18129b(Integer.parseInt(str2, 16), strGroup != null ? Integer.parseInt(strGroup) : 0);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    @Nullable
    /* JADX INFO: renamed from: j */
    public static String m149009j(@Nullable String str) {
        int iIndexOf;
        if (str == null || (iIndexOf = str.indexOf(47)) == -1) {
            return null;
        }
        return str.substring(0, iIndexOf);
    }

    /* JADX INFO: renamed from: k */
    public static int m149010k(@Nullable String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        if (m149014o(str)) {
            return 1;
        }
        if (m149018s(str)) {
            return 2;
        }
        if (m149017r(str)) {
            return 3;
        }
        if (m149015p(str)) {
            return 4;
        }
        if ("application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str)) {
            return 5;
        }
        if ("application/x-camera-motion".equals(str)) {
            return 6;
        }
        return m149011l(str);
    }

    /* JADX INFO: renamed from: l */
    public static int m149011l(String str) {
        int size = f124735a.size();
        for (int i = 0; i < size; i++) {
            C18128a c18128a = f124735a.get(i);
            if (str.equals(c18128a.f124737a)) {
                return c18128a.f124739c;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: m */
    public static int m149012m(String str) {
        return m149010k(m149006g(str));
    }

    @Nullable
    /* JADX INFO: renamed from: n */
    public static String m149013n(@Nullable String str) {
        if (str == null) {
            return null;
        }
        for (String str2 : bmk0.m105125c1(str)) {
            String strM149006g = m149006g(str2);
            if (strM149006g != null && m149018s(strM149006g)) {
                return strM149006g;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: o */
    public static boolean m149014o(@Nullable String str) {
        return "audio".equals(m149009j(str));
    }

    /* JADX INFO: renamed from: p */
    public static boolean m149015p(@Nullable String str) {
        return "image".equals(m149009j(str));
    }

    /* JADX INFO: renamed from: q */
    public static boolean m149016q(@Nullable String str) {
        if (str == null) {
            return false;
        }
        return str.startsWith("video/webm") || str.startsWith("audio/webm") || str.startsWith("application/webm") || str.startsWith(DLNAProfiles.DLNAMimeTypes.MIME_VIDEO_MATROSKA) || str.startsWith("audio/x-matroska") || str.startsWith("application/x-matroska");
    }

    /* JADX INFO: renamed from: r */
    public static boolean m149017r(@Nullable String str) {
        return "text".equals(m149009j(str)) || "application/cea-608".equals(str) || "application/cea-708".equals(str) || "application/x-mp4-cea-608".equals(str) || "application/x-subrip".equals(str) || "application/ttml+xml".equals(str) || "application/x-quicktime-tx3g".equals(str) || "application/x-mp4-vtt".equals(str) || "application/x-rawcc".equals(str) || "application/vobsub".equals(str) || "application/pgs".equals(str) || "application/dvbsubs".equals(str);
    }

    /* JADX INFO: renamed from: s */
    public static boolean m149018s(@Nullable String str) {
        return "video".equals(m149009j(str));
    }

    /* JADX INFO: renamed from: t */
    public static String m149019t(String str) {
        str.getClass();
        switch (str) {
            case "audio/x-flac":
                return "audio/flac";
            case "audio/x-wav":
                return "audio/wav";
            case "audio/mp3":
                return DLNAProfiles.DLNAMimeTypes.MIME_AUDIO_MPEG;
            default:
                return str;
        }
    }
}
