package p149l;

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
public final class n200 {

    /* JADX INFO: renamed from: a */
    public static final ArrayList<C18605a> f136748a = new ArrayList<>();

    /* JADX INFO: renamed from: b */
    public static final Pattern f136749b = Pattern.compile("^mp4a\\.([a-zA-Z0-9]{2})(?:\\.([0-9]{1,2}))?$");

    /* JADX INFO: renamed from: l.n200$a */
    public static final class C18605a {

        /* JADX INFO: renamed from: a */
        public final String f136750a;

        /* JADX INFO: renamed from: b */
        public final String f136751b;

        /* JADX INFO: renamed from: c */
        public final int f136752c;
    }

    /* JADX INFO: renamed from: l.n200$b */
    @VisibleForTesting
    public static final class C18606b {

        /* JADX INFO: renamed from: a */
        public final int f136753a;

        /* JADX INFO: renamed from: b */
        public final int f136754b;

        public C18606b(int i, int i2) {
            this.f136753a = i;
            this.f136754b = i2;
        }

        /* JADX INFO: renamed from: a */
        public int m157539a() {
            int i = this.f136754b;
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
    public static boolean m157519a(@Nullable String str, @Nullable String str2) {
        C18606b c18606bM157527i;
        int iM157539a;
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
                return (str2 == null || (c18606bM157527i = m157527i(str2)) == null || (iM157539a = c18606bM157527i.m157539a()) == 0 || iM157539a == 16) ? false : true;
            default:
                return false;
        }
    }

    /* JADX INFO: renamed from: b */
    public static boolean m157520b(@Nullable String str, String str2) {
        return m157522d(str, str2) != null;
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public static String m157521c(@Nullable String str) {
        if (str == null) {
            return null;
        }
        for (String str2 : vck0.m197847c1(str)) {
            String strM157525g = m157525g(str2);
            if (strM157525g != null && m157533o(strM157525g)) {
                return strM157525g;
            }
        }
        return null;
    }

    @Nullable
    /* JADX INFO: renamed from: d */
    public static String m157522d(@Nullable String str, @Nullable String str2) {
        if (str != null && str2 != null) {
            String[] strArrM197847c1 = vck0.m197847c1(str);
            StringBuilder sb = new StringBuilder();
            for (String str3 : strArrM197847c1) {
                if (str2.equals(m157525g(str3))) {
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
    public static String m157523e(String str) {
        int size = f136748a.size();
        for (int i = 0; i < size; i++) {
            C18605a c18605a = f136748a.get(i);
            if (str.startsWith(c18605a.f136751b)) {
                return c18605a.f136750a;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: f */
    public static int m157524f(String str, @Nullable String str2) {
        C18606b c18606bM157527i;
        str.getClass();
        switch (str) {
            case "audio/eac3-joc":
                return 18;
            case "audio/vnd.dts.hd;profile=lbr":
                return 8;
            case "audio/vnd.dts":
                return 7;
            case "audio/mp4a-latm":
                if (str2 == null || (c18606bM157527i = m157527i(str2)) == null) {
                    return 0;
                }
                return c18606bM157527i.m157539a();
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
    public static String m157525g(@Nullable String str) {
        C18606b c18606bM157527i;
        String strM157526h = null;
        if (str == null) {
            return null;
        }
        String strM99804e = b11.m99804e(str.trim());
        if (strM99804e.startsWith(VisualSampleEntry.TYPE3) || strM99804e.startsWith(VisualSampleEntry.TYPE4)) {
            return YtVideoEncoder.MIME_TYPE;
        }
        if (strM99804e.startsWith(VisualSampleEntry.TYPE7) || strM99804e.startsWith(VisualSampleEntry.TYPE6)) {
            return "video/hevc";
        }
        if (strM99804e.startsWith("dvav") || strM99804e.startsWith("dva1") || strM99804e.startsWith("dvhe") || strM99804e.startsWith("dvh1")) {
            return "video/dolby-vision";
        }
        if (strM99804e.startsWith("av01")) {
            return "video/av01";
        }
        if (strM99804e.startsWith("vp9") || strM99804e.startsWith("vp09")) {
            return "video/x-vnd.on2.vp9";
        }
        if (strM99804e.startsWith("vp8") || strM99804e.startsWith("vp08")) {
            return "video/x-vnd.on2.vp8";
        }
        if (strM99804e.startsWith(AudioSampleEntry.TYPE3)) {
            if (strM99804e.startsWith("mp4a.") && (c18606bM157527i = m157527i(strM99804e)) != null) {
                strM157526h = m157526h(c18606bM157527i.f136753a);
            }
            return strM157526h == null ? "audio/mp4a-latm" : strM157526h;
        }
        if (strM99804e.startsWith("mha1")) {
            return "audio/mha1";
        }
        if (strM99804e.startsWith("mhm1")) {
            return "audio/mhm1";
        }
        if (strM99804e.startsWith(AudioSampleEntry.TYPE8) || strM99804e.startsWith(AC3SpecificBox.TYPE)) {
            return "audio/ac3";
        }
        if (strM99804e.startsWith(AudioSampleEntry.TYPE9) || strM99804e.startsWith(EC3SpecificBox.TYPE)) {
            return "audio/eac3";
        }
        if (strM99804e.startsWith("ec+3")) {
            return "audio/eac3-joc";
        }
        if (strM99804e.startsWith("ac-4") || strM99804e.startsWith("dac4")) {
            return "audio/ac4";
        }
        if (strM99804e.startsWith("dtsc")) {
            return "audio/vnd.dts";
        }
        if (strM99804e.startsWith(AudioSampleEntry.TYPE13)) {
            return "audio/vnd.dts.hd;profile=lbr";
        }
        if (strM99804e.startsWith(AudioSampleEntry.TYPE12) || strM99804e.startsWith(AudioSampleEntry.TYPE11)) {
            return "audio/vnd.dts.hd";
        }
        if (strM99804e.startsWith("dtsx")) {
            return "audio/vnd.dts.uhd;profile=p2";
        }
        if (strM99804e.startsWith("opus")) {
            return "audio/opus";
        }
        if (strM99804e.startsWith("vorbis")) {
            return "audio/vorbis";
        }
        if (strM99804e.startsWith("flac")) {
            return "audio/flac";
        }
        if (strM99804e.startsWith(XMLSubtitleSampleEntry.TYPE)) {
            return "application/ttml+xml";
        }
        if (strM99804e.startsWith(WebVTTSampleEntry.TYPE)) {
            return "text/vtt";
        }
        if (strM99804e.contains("cea708")) {
            return "application/cea-708";
        }
        return (strM99804e.contains("eia608") || strM99804e.contains("cea608")) ? "application/cea-608" : m157523e(strM99804e);
    }

    @Nullable
    /* JADX INFO: renamed from: h */
    public static String m157526h(int i) {
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
    public static C18606b m157527i(String str) {
        Matcher matcher = f136749b.matcher(str);
        if (!matcher.matches()) {
            return null;
        }
        String str2 = (String) p11.m167011e(matcher.group(1));
        String strGroup = matcher.group(2);
        try {
            return new C18606b(Integer.parseInt(str2, 16), strGroup != null ? Integer.parseInt(strGroup) : 0);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    @Nullable
    /* JADX INFO: renamed from: j */
    public static String m157528j(@Nullable String str) {
        int iIndexOf;
        if (str == null || (iIndexOf = str.indexOf(47)) == -1) {
            return null;
        }
        return str.substring(0, iIndexOf);
    }

    /* JADX INFO: renamed from: k */
    public static int m157529k(@Nullable String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        if (m157533o(str)) {
            return 1;
        }
        if (m157537s(str)) {
            return 2;
        }
        if (m157536r(str)) {
            return 3;
        }
        if (m157534p(str)) {
            return 4;
        }
        if ("application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str)) {
            return 5;
        }
        if ("application/x-camera-motion".equals(str)) {
            return 6;
        }
        return m157530l(str);
    }

    /* JADX INFO: renamed from: l */
    public static int m157530l(String str) {
        int size = f136748a.size();
        for (int i = 0; i < size; i++) {
            C18605a c18605a = f136748a.get(i);
            if (str.equals(c18605a.f136750a)) {
                return c18605a.f136752c;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: m */
    public static int m157531m(String str) {
        return m157529k(m157525g(str));
    }

    @Nullable
    /* JADX INFO: renamed from: n */
    public static String m157532n(@Nullable String str) {
        if (str == null) {
            return null;
        }
        for (String str2 : vck0.m197847c1(str)) {
            String strM157525g = m157525g(str2);
            if (strM157525g != null && m157537s(strM157525g)) {
                return strM157525g;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: o */
    public static boolean m157533o(@Nullable String str) {
        return "audio".equals(m157528j(str));
    }

    /* JADX INFO: renamed from: p */
    public static boolean m157534p(@Nullable String str) {
        return "image".equals(m157528j(str));
    }

    /* JADX INFO: renamed from: q */
    public static boolean m157535q(@Nullable String str) {
        if (str == null) {
            return false;
        }
        return str.startsWith("video/webm") || str.startsWith("audio/webm") || str.startsWith("application/webm") || str.startsWith(DLNAProfiles.DLNAMimeTypes.MIME_VIDEO_MATROSKA) || str.startsWith("audio/x-matroska") || str.startsWith("application/x-matroska");
    }

    /* JADX INFO: renamed from: r */
    public static boolean m157536r(@Nullable String str) {
        return "text".equals(m157528j(str)) || "application/cea-608".equals(str) || "application/cea-708".equals(str) || "application/x-mp4-cea-608".equals(str) || "application/x-subrip".equals(str) || "application/ttml+xml".equals(str) || "application/x-quicktime-tx3g".equals(str) || "application/x-mp4-vtt".equals(str) || "application/x-rawcc".equals(str) || "application/vobsub".equals(str) || "application/pgs".equals(str) || "application/dvbsubs".equals(str);
    }

    /* JADX INFO: renamed from: s */
    public static boolean m157537s(@Nullable String str) {
        return "video".equals(m157528j(str));
    }

    /* JADX INFO: renamed from: t */
    public static String m157538t(String str) {
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
