package p153l;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.alibaba.fastjson.asm.Opcodes;
import com.tencent.youtu.sdkkitframework.common.YtVideoEncoder;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.fourthline.cling.support.model.dlna.DLNAProfiles;
import org.spongycastle.asn1.eac.EACTags;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: loaded from: classes6.dex */
public final class a8t0 {

    /* JADX INFO: renamed from: a */
    public static final ArrayList f68959a = new ArrayList();

    /* JADX INFO: renamed from: b */
    public static final Pattern f68960b = Pattern.compile("^mp4a\\.([a-zA-Z0-9]{2})(?:\\.([0-9]{1,2}))?$");

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:56:0x0095 A[RETURN] */
    /* JADX INFO: renamed from: a */
    public static int m96489a(String str, @Nullable String str2) {
        switch (str) {
            case "audio/eac3-joc":
                return 18;
            case "audio/vnd.dts.hd;profile=lbr":
                return 8;
            case "audio/vnd.dts":
                return 7;
            case "audio/mp4a-latm":
                if (!str.equals("audio/mp4a-latm") || str2 == null || (r3 = m96491c(str2)) == null) {
                    return 0;
                }
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

    /* JADX INFO: renamed from: b */
    public static int m96490b(@Nullable String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        if (m96495g(str)) {
            return 1;
        }
        if (m96496h(str)) {
            return 2;
        }
        if ("text".equals(m96497i(str)) || "application/x-media3-cues".equals(str) || "application/cea-608".equals(str) || "application/cea-708".equals(str) || "application/x-mp4-cea-608".equals(str) || "application/x-subrip".equals(str) || "application/ttml+xml".equals(str) || "application/x-quicktime-tx3g".equals(str) || "application/x-mp4-vtt".equals(str) || "application/x-rawcc".equals(str) || "application/vobsub".equals(str) || "application/pgs".equals(str) || "application/dvbsubs".equals(str)) {
            return 3;
        }
        if ("image".equals(m96497i(str)) || "application/x-image-uri".equals(str)) {
            return 4;
        }
        if ("application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str)) {
            return 5;
        }
        if ("application/x-camera-motion".equals(str)) {
            return 6;
        }
        int size = f68959a.size();
        for (int i = 0; i < size; i++) {
            String str2 = ((e4t0) f68959a.get(i)).f92148a;
            if (str.equals(null)) {
                return 0;
            }
        }
        return -1;
    }

    @Nullable
    @VisibleForTesting
    /* JADX INFO: renamed from: c */
    public static t6t0 m96491c(String str) {
        Matcher matcher = f68960b.matcher(str);
        if (!matcher.matches()) {
            return null;
        }
        String strGroup = matcher.group(1);
        strGroup.getClass();
        String strGroup2 = matcher.group(2);
        try {
            return new t6t0(Integer.parseInt(strGroup, 16), strGroup2 != null ? Integer.parseInt(strGroup2) : 0);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    @Nullable
    /* JADX INFO: renamed from: d */
    public static String m96492d(int i) {
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
        if (i == 221) {
            return "audio/vorbis";
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

    /* JADX INFO: renamed from: e */
    public static String m96493e(String str) {
        if (str == null) {
            return null;
        }
        String strM207228a = wnw0.m207228a(str);
        switch (strM207228a.hashCode()) {
            case -1007807498:
                return strM207228a.equals("audio/x-flac") ? "audio/flac" : strM207228a;
            case -979095690:
                return strM207228a.equals("application/x-mpegurl") ? "application/x-mpegURL" : strM207228a;
            case -586683234:
                return strM207228a.equals("audio/x-wav") ? "audio/wav" : strM207228a;
            case -432836268:
                return strM207228a.equals("audio/mpeg-l1") ? "audio/mpeg-L1" : strM207228a;
            case -432836267:
                return strM207228a.equals("audio/mpeg-l2") ? "audio/mpeg-L2" : strM207228a;
            case 187090231:
                return strM207228a.equals("audio/mp3") ? DLNAProfiles.DLNAMimeTypes.MIME_AUDIO_MPEG : strM207228a;
            default:
                return strM207228a;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:50:0x0087 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:51:0x0088 A[RETURN] */
    /* JADX INFO: renamed from: f */
    public static boolean m96494f(@Nullable String str, @Nullable String str2) {
        t6t0 t6t0VarM96491c;
        int iM189545a;
        if (str == null) {
            return false;
        }
        switch (str.hashCode()) {
            case -2123537834:
                if (str.equals("audio/eac3-joc")) {
                    return true;
                }
                return false;
            case -432837260:
                if (str.equals("audio/mpeg-L1")) {
                    return true;
                }
                return false;
            case -432837259:
                if (str.equals("audio/mpeg-L2")) {
                    return true;
                }
                return false;
            case -53558318:
                return (!str.equals("audio/mp4a-latm") || str2 == null || (t6t0VarM96491c = m96491c(str2)) == null || (iM189545a = t6t0VarM96491c.m189545a()) == 0 || iM189545a == 16) ? false : true;
            case 187078296:
                if (str.equals("audio/ac3")) {
                    return true;
                }
                return false;
            case 187094639:
                if (str.equals("audio/raw")) {
                    return true;
                }
                return false;
            case 1504578661:
                if (str.equals("audio/eac3")) {
                    return true;
                }
                return false;
            case 1504619009:
                if (str.equals("audio/flac")) {
                    return true;
                }
                return false;
            case 1504831518:
                if (str.equals(DLNAProfiles.DLNAMimeTypes.MIME_AUDIO_MPEG)) {
                    return true;
                }
                return false;
            case 1903231877:
                if (str.equals("audio/g711-alaw")) {
                    return true;
                }
                return false;
            case 1903589369:
                if (str.equals("audio/g711-mlaw")) {
                    return true;
                }
                return false;
            default:
                return false;
        }
    }

    /* JADX INFO: renamed from: g */
    public static boolean m96495g(@Nullable String str) {
        return "audio".equals(m96497i(str));
    }

    /* JADX INFO: renamed from: h */
    public static boolean m96496h(@Nullable String str) {
        return "video".equals(m96497i(str));
    }

    @Nullable
    /* JADX INFO: renamed from: i */
    public static String m96497i(@Nullable String str) {
        int iIndexOf;
        if (str == null || (iIndexOf = str.indexOf(47)) == -1) {
            return null;
        }
        return str.substring(0, iIndexOf);
    }
}
