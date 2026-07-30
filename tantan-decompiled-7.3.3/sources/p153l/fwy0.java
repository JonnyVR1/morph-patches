package p153l;

import android.media.MediaCodecInfo;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import com.effectsar.labcv.effectsdk.EffectsSDKEffectConstants;
import com.tencent.youtu.sdkkitframework.common.YtVideoEncoder;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
@RequiresApi(29)
public final class fwy0 {
    @DoNotInline
    /* JADX INFO: renamed from: a */
    public static int m127927a(MediaCodecInfo.VideoCapabilities videoCapabilities, String str, int i, int i2, double d) {
        List supportedPerformancePoints = videoCapabilities.getSupportedPerformancePoints();
        if (supportedPerformancePoints == null || supportedPerformancePoints.isEmpty()) {
            return 0;
        }
        int iM127928b = m127928b(supportedPerformancePoints, hrx.m136934a(i, i2, (int) d));
        if (iM127928b == 1 && str.equals(YtVideoEncoder.MIME_TYPE)) {
            irx.m141851a();
            if (m127928b(supportedPerformancePoints, hrx.m136934a(EffectsSDKEffectConstants.FaceSegmentConfig.BEFF_MOBILE_FACE_REST_MASK, 720, 60)) != 2) {
                return 0;
            }
        }
        return iM127928b;
    }

    /* JADX INFO: renamed from: b */
    public static int m127928b(List list, MediaCodecInfo.VideoCapabilities.PerformancePoint performancePoint) {
        for (int i = 0; i < list.size(); i++) {
            if (krx.m151127a(list.get(i)).covers(performancePoint)) {
                return 2;
            }
        }
        return 1;
    }
}
