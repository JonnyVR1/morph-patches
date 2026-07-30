package p153l;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C1894k;
import com.google.common.collect.ImmutableMap;
import com.tencent.youtu.sdkkitframework.common.YtVideoEncoder;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.Map;
import org.eclipse.jetty.http.HttpTokens;
import org.fourthline.cling.support.model.dlna.DLNAProfiles;
import org.spongycastle.math.p135ec.Tnaf;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class zpd0 {

    /* JADX INFO: renamed from: a */
    public final int f205453a;

    /* JADX INFO: renamed from: b */
    public final int f205454b;

    /* JADX INFO: renamed from: c */
    public final C1894k f205455c;

    /* JADX INFO: renamed from: d */
    public final ImmutableMap<String, String> f205456d;

    /* JADX INFO: renamed from: e */
    public final String f205457e;

    public zpd0(C1894k c1894k, int i, int i2, Map<String, String> map, String str) {
        this.f205453a = i;
        this.f205454b = i2;
        this.f205455c = c1894k;
        this.f205456d = ImmutableMap.copyOf((Map) map);
        this.f205457e = str;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: a */
    public static String m220831a(String str) {
        String strM138053g = i11.m138053g(str);
        strM138053g.getClass();
        byte b = -1;
        switch (strM138053g.hashCode()) {
            case -1922091719:
                if (strM138053g.equals("MPEG4-GENERIC")) {
                    b = 0;
                }
                break;
            case 2412:
                if (strM138053g.equals("L8")) {
                    b = 1;
                }
                break;
            case 64593:
                if (strM138053g.equals("AC3")) {
                    b = 2;
                }
                break;
            case 64934:
                if (strM138053g.equals("AMR")) {
                    b = 3;
                }
                break;
            case 74609:
                if (strM138053g.equals("L16")) {
                    b = 4;
                }
                break;
            case 85182:
                if (strM138053g.equals("VP8")) {
                    b = 5;
                }
                break;
            case 85183:
                if (strM138053g.equals("VP9")) {
                    b = 6;
                }
                break;
            case 2194728:
                if (strM138053g.equals("H264")) {
                    b = 7;
                }
                break;
            case 2194729:
                if (strM138053g.equals("H265")) {
                    b = 8;
                }
                break;
            case 2433087:
                if (strM138053g.equals("OPUS")) {
                    b = 9;
                }
                break;
            case 2450119:
                if (strM138053g.equals("PCMA")) {
                    b = 10;
                }
                break;
            case 2450139:
                if (strM138053g.equals("PCMU")) {
                    b = 11;
                }
                break;
            case 1061166827:
                if (strM138053g.equals("MP4A-LATM")) {
                    b = 12;
                }
                break;
            case 1934494802:
                if (strM138053g.equals("AMR-WB")) {
                    b = HttpTokens.CARRIAGE_RETURN;
                }
                break;
            case 1959269366:
                if (strM138053g.equals("MP4V-ES")) {
                    b = 14;
                }
                break;
            case 2137188397:
                if (strM138053g.equals("H263-1998")) {
                    b = 15;
                }
                break;
            case 2137209252:
                if (strM138053g.equals("H263-2000")) {
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
                wg3.m206174a(str);
                return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public static int m220832b(String str) {
        w11.m204365a(str.equals("L8") || str.equals("L16"));
        if (str.equals("L8")) {
            return 3;
        }
        return SQLiteDatabase.CREATE_IF_NECESSARY;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: c */
    public static boolean m220833c(ksx ksxVar) {
        String strM138053g = i11.m138053g(ksxVar.f128623j.f128634b);
        strM138053g.getClass();
        byte b = -1;
        switch (strM138053g.hashCode()) {
            case -1922091719:
                if (strM138053g.equals("MPEG4-GENERIC")) {
                    b = 0;
                }
                break;
            case 2412:
                if (strM138053g.equals("L8")) {
                    b = 1;
                }
                break;
            case 64593:
                if (strM138053g.equals("AC3")) {
                    b = 2;
                }
                break;
            case 64934:
                if (strM138053g.equals("AMR")) {
                    b = 3;
                }
                break;
            case 74609:
                if (strM138053g.equals("L16")) {
                    b = 4;
                }
                break;
            case 85182:
                if (strM138053g.equals("VP8")) {
                    b = 5;
                }
                break;
            case 85183:
                if (strM138053g.equals("VP9")) {
                    b = 6;
                }
                break;
            case 2194728:
                if (strM138053g.equals("H264")) {
                    b = 7;
                }
                break;
            case 2194729:
                if (strM138053g.equals("H265")) {
                    b = 8;
                }
                break;
            case 2433087:
                if (strM138053g.equals("OPUS")) {
                    b = 9;
                }
                break;
            case 2450119:
                if (strM138053g.equals("PCMA")) {
                    b = 10;
                }
                break;
            case 2450139:
                if (strM138053g.equals("PCMU")) {
                    b = 11;
                }
                break;
            case 1061166827:
                if (strM138053g.equals("MP4A-LATM")) {
                    b = 12;
                }
                break;
            case 1934494802:
                if (strM138053g.equals("AMR-WB")) {
                    b = HttpTokens.CARRIAGE_RETURN;
                }
                break;
            case 1959269366:
                if (strM138053g.equals("MP4V-ES")) {
                    b = 14;
                }
                break;
            case 2137188397:
                if (strM138053g.equals("H263-1998")) {
                    b = 15;
                }
                break;
            case 2137209252:
                if (strM138053g.equals("H263-2000")) {
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
        if (obj != null && zpd0.class == obj.getClass()) {
            zpd0 zpd0Var = (zpd0) obj;
            if (this.f205453a == zpd0Var.f205453a && this.f205454b == zpd0Var.f205454b && this.f205455c.equals(zpd0Var.f205455c) && this.f205456d.equals(zpd0Var.f205456d) && this.f205457e.equals(zpd0Var.f205457e)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((((((217 + this.f205453a) * 31) + this.f205454b) * 31) + this.f205455c.hashCode()) * 31) + this.f205456d.hashCode()) * 31) + this.f205457e.hashCode();
    }
}
