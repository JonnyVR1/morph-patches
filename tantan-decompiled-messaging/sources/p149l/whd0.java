package p149l;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C1871k;
import com.google.common.collect.ImmutableMap;
import com.tencent.youtu.sdkkitframework.common.YtVideoEncoder;
import java.util.Map;
import org.eclipse.jetty.http.HttpTokens;
import org.fourthline.cling.support.model.dlna.DLNAProfiles;
import org.spongycastle.math.p131ec.Tnaf;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class whd0 {

    /* JADX INFO: renamed from: a */
    public final int f186383a;

    /* JADX INFO: renamed from: b */
    public final int f186384b;

    /* JADX INFO: renamed from: c */
    public final C1871k f186385c;

    /* JADX INFO: renamed from: d */
    public final ImmutableMap<String, String> f186386d;

    /* JADX INFO: renamed from: e */
    public final String f186387e;

    public whd0(C1871k c1871k, int i, int i2, Map<String, String> map, String str) {
        this.f186383a = i;
        this.f186384b = i2;
        this.f186385c = c1871k;
        this.f186386d = ImmutableMap.copyOf((Map) map);
        this.f186387e = str;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: a */
    public static String m203122a(String str) {
        String strM99806g = b11.m99806g(str);
        strM99806g.getClass();
        byte b = -1;
        switch (strM99806g.hashCode()) {
            case -1922091719:
                if (strM99806g.equals("MPEG4-GENERIC")) {
                    b = 0;
                }
                break;
            case 2412:
                if (strM99806g.equals("L8")) {
                    b = 1;
                }
                break;
            case 64593:
                if (strM99806g.equals("AC3")) {
                    b = 2;
                }
                break;
            case 64934:
                if (strM99806g.equals("AMR")) {
                    b = 3;
                }
                break;
            case 74609:
                if (strM99806g.equals("L16")) {
                    b = 4;
                }
                break;
            case 85182:
                if (strM99806g.equals("VP8")) {
                    b = 5;
                }
                break;
            case 85183:
                if (strM99806g.equals("VP9")) {
                    b = 6;
                }
                break;
            case 2194728:
                if (strM99806g.equals("H264")) {
                    b = 7;
                }
                break;
            case 2194729:
                if (strM99806g.equals("H265")) {
                    b = 8;
                }
                break;
            case 2433087:
                if (strM99806g.equals("OPUS")) {
                    b = 9;
                }
                break;
            case 2450119:
                if (strM99806g.equals("PCMA")) {
                    b = 10;
                }
                break;
            case 2450139:
                if (strM99806g.equals("PCMU")) {
                    b = 11;
                }
                break;
            case 1061166827:
                if (strM99806g.equals("MP4A-LATM")) {
                    b = 12;
                }
                break;
            case 1934494802:
                if (strM99806g.equals("AMR-WB")) {
                    b = HttpTokens.CARRIAGE_RETURN;
                }
                break;
            case 1959269366:
                if (strM99806g.equals("MP4V-ES")) {
                    b = 14;
                }
                break;
            case 2137188397:
                if (strM99806g.equals("H263-1998")) {
                    b = 15;
                }
                break;
            case 2137209252:
                if (strM99806g.equals("H263-2000")) {
                    b = Tnaf.POW_2_WIDTH;
                }
                break;
        }
        switch (b) {
            case 0:
            case 12:
                return "audio/mp4a-latm";
            case 1:
            case 4:
                return "audio/raw";
            case 2:
                return "audio/ac3";
            case 3:
                return DLNAProfiles.DLNAMimeTypes.MIME_AUDIO_3GP;
            case 5:
                return "video/x-vnd.on2.vp8";
            case 6:
                return "video/x-vnd.on2.vp9";
            case 7:
                return YtVideoEncoder.MIME_TYPE;
            case 8:
                return "video/hevc";
            case 9:
                return "audio/opus";
            case 10:
                return "audio/g711-alaw";
            case 11:
                return "audio/g711-mlaw";
            case 13:
                return "audio/amr-wb";
            case 14:
                return "video/mp4v-es";
            case 15:
            case 16:
                return DLNAProfiles.DLNAMimeTypes.MIME_VIDEO_3GP;
            default:
                ig3.m135964a(str);
                return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public static int m203123b(String str) {
        p11.m167007a(str.equals("L8") || str.equals("L16"));
        return str.equals("L8") ? 3 : 268435456;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: c */
    public static boolean m203124c(njx njxVar) {
        String strM99806g = b11.m99806g(njxVar.f139348j.f139359b);
        strM99806g.getClass();
        byte b = -1;
        switch (strM99806g.hashCode()) {
            case -1922091719:
                if (strM99806g.equals("MPEG4-GENERIC")) {
                    b = 0;
                }
                break;
            case 2412:
                if (strM99806g.equals("L8")) {
                    b = 1;
                }
                break;
            case 64593:
                if (strM99806g.equals("AC3")) {
                    b = 2;
                }
                break;
            case 64934:
                if (strM99806g.equals("AMR")) {
                    b = 3;
                }
                break;
            case 74609:
                if (strM99806g.equals("L16")) {
                    b = 4;
                }
                break;
            case 85182:
                if (strM99806g.equals("VP8")) {
                    b = 5;
                }
                break;
            case 85183:
                if (strM99806g.equals("VP9")) {
                    b = 6;
                }
                break;
            case 2194728:
                if (strM99806g.equals("H264")) {
                    b = 7;
                }
                break;
            case 2194729:
                if (strM99806g.equals("H265")) {
                    b = 8;
                }
                break;
            case 2433087:
                if (strM99806g.equals("OPUS")) {
                    b = 9;
                }
                break;
            case 2450119:
                if (strM99806g.equals("PCMA")) {
                    b = 10;
                }
                break;
            case 2450139:
                if (strM99806g.equals("PCMU")) {
                    b = 11;
                }
                break;
            case 1061166827:
                if (strM99806g.equals("MP4A-LATM")) {
                    b = 12;
                }
                break;
            case 1934494802:
                if (strM99806g.equals("AMR-WB")) {
                    b = HttpTokens.CARRIAGE_RETURN;
                }
                break;
            case 1959269366:
                if (strM99806g.equals("MP4V-ES")) {
                    b = 14;
                }
                break;
            case 2137188397:
                if (strM99806g.equals("H263-1998")) {
                    b = 15;
                }
                break;
            case 2137209252:
                if (strM99806g.equals("H263-2000")) {
                    b = Tnaf.POW_2_WIDTH;
                }
                break;
        }
        switch (b) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
                return true;
            default:
                return false;
        }
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && whd0.class == obj.getClass()) {
            whd0 whd0Var = (whd0) obj;
            if (this.f186383a == whd0Var.f186383a && this.f186384b == whd0Var.f186384b && this.f186385c.equals(whd0Var.f186385c) && this.f186386d.equals(whd0Var.f186386d) && this.f186387e.equals(whd0Var.f186387e)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((((((217 + this.f186383a) * 31) + this.f186384b) * 31) + this.f186385c.hashCode()) * 31) + this.f186386d.hashCode()) * 31) + this.f186387e.hashCode();
    }
}
