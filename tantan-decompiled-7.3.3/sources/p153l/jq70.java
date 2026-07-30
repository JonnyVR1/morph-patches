package p153l;

import com.alibaba.sdk.android.oss.signer.SignParameters;
import com.effectsar.labcv.effectsdk.EffectsSDKEffectConstants;
import com.google.android.exoplayer2.PlaybackException;
import com.tencent.liteav.audio.TXEAudioDef;

/* JADX INFO: loaded from: classes8.dex */
public class jq70 {
    /* JADX INFO: renamed from: a */
    public static uow m146555a(uow uowVar, int i) {
        t9c.m189743a("jzheng", "resolutionLevel " + i);
        if (i == 0) {
            uowVar.f175506s = 352;
            uowVar.f175508t = 640;
            uowVar.f175510u = 352;
            uowVar.f175511v = 640;
            uowVar.f175512w = 640;
            uowVar.f175513x = 480;
            uowVar.f175494m = 352;
            uowVar.f175496n = 640;
            uowVar.f175515z = 352;
            uowVar.f175444A = 640;
            uowVar.f175445B = 352;
            uowVar.f175446C = 640;
            uowVar.f175451H = 500000;
        } else if (i == 1) {
            uowVar.f175506s = 352;
            uowVar.f175508t = 640;
            uowVar.f175510u = 352;
            uowVar.f175511v = 640;
            uowVar.f175512w = 640;
            uowVar.f175513x = 480;
            uowVar.f175494m = 352;
            uowVar.f175496n = 640;
            uowVar.f175515z = 352;
            uowVar.f175444A = 640;
            uowVar.f175445B = 352;
            uowVar.f175446C = 640;
            uowVar.f175451H = 750000;
        } else if (i == 2 || i == 3) {
            uowVar.f175506s = 528;
            uowVar.f175508t = TXEAudioDef.TXE_OPUS_SAMPLE_NUM;
            uowVar.f175510u = 528;
            uowVar.f175511v = TXEAudioDef.TXE_OPUS_SAMPLE_NUM;
            uowVar.f175512w = EffectsSDKEffectConstants.FaceSegmentConfig.BEFF_MOBILE_FACE_REST_MASK;
            uowVar.f175513x = 720;
            uowVar.f175494m = 528;
            uowVar.f175496n = TXEAudioDef.TXE_OPUS_SAMPLE_NUM;
            uowVar.f175515z = 528;
            uowVar.f175444A = TXEAudioDef.TXE_OPUS_SAMPLE_NUM;
            uowVar.f175445B = 528;
            uowVar.f175446C = TXEAudioDef.TXE_OPUS_SAMPLE_NUM;
            uowVar.f175451H = PlaybackException.CUSTOM_ERROR_CODE_BASE;
        } else {
            uowVar.f175506s = 352;
            uowVar.f175508t = 640;
            uowVar.f175510u = 352;
            uowVar.f175511v = 640;
            uowVar.f175512w = 640;
            uowVar.f175513x = 480;
            uowVar.f175494m = 352;
            uowVar.f175496n = 640;
            uowVar.f175515z = 352;
            uowVar.f175444A = 640;
            uowVar.f175445B = 352;
            uowVar.f175446C = 640;
            uowVar.f175451H = 500000;
        }
        m146559e(uowVar);
        return uowVar;
    }

    /* JADX INFO: renamed from: b */
    public static uow m146556b(uow uowVar, int i, int i2) {
        if (!csx.m112235R().m112276N0()) {
            for (csx.C16354b c16354b : csx.m112235R().m112353k()) {
                t9c.m189743a("configdata", c16354b.toString());
                if (i <= c16354b.m112406b().intValue()) {
                    uowVar.f175494m = c16354b.m112408g();
                    uowVar.f175496n = c16354b.m112407f();
                }
            }
        } else if (i > 800000) {
            uowVar.f175494m = 528;
            uowVar.f175496n = TXEAudioDef.TXE_OPUS_SAMPLE_NUM;
        } else {
            uowVar.f175494m = 352;
            uowVar.f175496n = 640;
        }
        uowVar.f175451H = i;
        uowVar.f175449F = i2;
        t9c.m189743a("newBitrate", "getResolutionLevel_2 encode w/h: " + uowVar.f175494m + " / " + uowVar.f175496n + " / " + i + " / " + i2);
        return uowVar;
    }

    /* JADX INFO: renamed from: c */
    public static uow m146557c(uow uowVar, int i) {
        uowVar.f175451H = i;
        return uowVar;
    }

    /* JADX INFO: renamed from: d */
    public static String m146558d() {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        StringBuilder sb = new StringBuilder();
        sb.append("\nStack info, thread:" + Thread.currentThread().getName() + SignParameters.NEW_LINE);
        if (stackTrace != null) {
            for (StackTraceElement stackTraceElement : stackTrace) {
                sb.append(stackTraceElement.getClassName());
                sb.append("(");
                sb.append(stackTraceElement.getFileName());
                sb.append(":");
                sb.append(stackTraceElement.getLineNumber());
                sb.append(")\n");
            }
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: e */
    private static void m146559e(uow uowVar) {
        t9c.m189743a("newBitrate", "videoWidth:" + uowVar.f175506s + ",videoHeight:" + uowVar.f175508t + ",visualWidth:" + uowVar.f175510u + ",visualHeight:" + uowVar.f175511v + ",targetWidth:" + uowVar.f175512w + ",targetHeight:" + uowVar.f175513x + ",encodeWidth:" + uowVar.f175494m + ",encodeHeight:" + uowVar.f175496n + ",cameraRenderWidth:" + uowVar.f175515z + ",cameraRenderHeight:" + uowVar.f175444A + ",videoBitrate:" + uowVar.f175451H + ",audioBitrate:" + uowVar.f175462S + ",videoFPS:" + uowVar.f175449F + ",mergeCanvaWidth " + uowVar.f175490k + ",mergeCanvaHeight " + uowVar.f175492l + "enhanceMode " + uowVar.f175514y);
    }
}
