package p149l;

import androidx.annotation.Nullable;
import com.tencent.youtu.sdkkitframework.common.YtVideoEncoder;
import org.eclipse.jetty.http.HttpTokens;
import org.fourthline.cling.support.model.dlna.DLNAProfiles;

/* JADX INFO: loaded from: classes6.dex */
public final class iqd {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Nullable
    /* JADX INFO: renamed from: a */
    public xhd0 m137733a(whd0 whd0Var) {
        String str = (String) p11.m167011e(whd0Var.f186385c.f7748l);
        str.getClass();
        byte b = -1;
        switch (str.hashCode()) {
            case -1664118616:
                if (str.equals(DLNAProfiles.DLNAMimeTypes.MIME_VIDEO_3GP)) {
                    b = 0;
                }
                break;
            case -1662541442:
                if (str.equals("video/hevc")) {
                    b = 1;
                }
                break;
            case -1606874997:
                if (str.equals("audio/amr-wb")) {
                    b = 2;
                }
                break;
            case -53558318:
                if (str.equals("audio/mp4a-latm")) {
                    b = 3;
                }
                break;
            case 187078296:
                if (str.equals("audio/ac3")) {
                    b = 4;
                }
                break;
            case 187094639:
                if (str.equals("audio/raw")) {
                    b = 5;
                }
                break;
            case 1187890754:
                if (str.equals("video/mp4v-es")) {
                    b = 6;
                }
                break;
            case 1331836730:
                if (str.equals(YtVideoEncoder.MIME_TYPE)) {
                    b = 7;
                }
                break;
            case 1503095341:
                if (str.equals(DLNAProfiles.DLNAMimeTypes.MIME_AUDIO_3GP)) {
                    b = 8;
                }
                break;
            case 1504891608:
                if (str.equals("audio/opus")) {
                    b = 9;
                }
                break;
            case 1599127256:
                if (str.equals("video/x-vnd.on2.vp8")) {
                    b = 10;
                }
                break;
            case 1599127257:
                if (str.equals("video/x-vnd.on2.vp9")) {
                    b = 11;
                }
                break;
            case 1903231877:
                if (str.equals("audio/g711-alaw")) {
                    b = 12;
                }
                break;
            case 1903589369:
                if (str.equals("audio/g711-mlaw")) {
                    b = HttpTokens.CARRIAGE_RETURN;
                }
                break;
        }
        switch (b) {
            case 0:
                return new nhd0(whd0Var);
            case 1:
                return new phd0(whd0Var);
            case 2:
            case 8:
                return new khd0(whd0Var);
            case 3:
                return whd0Var.f186387e.equals("MP4A-LATM") ? new qhd0(whd0Var) : new ihd0(whd0Var);
            case 4:
                return new jhd0(whd0Var);
            case 5:
            case 12:
            case 13:
                return new yhd0(whd0Var);
            case 6:
                return new rhd0(whd0Var);
            case 7:
                return new ohd0(whd0Var);
            case 9:
                return new shd0(whd0Var);
            case 10:
                return new bid0(whd0Var);
            case 11:
                return new cid0(whd0Var);
            default:
                return null;
        }
    }
}
