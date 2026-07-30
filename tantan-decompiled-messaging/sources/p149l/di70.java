package p149l;

import com.alibaba.sdk.android.oss.signer.SignParameters;
import com.effectsar.labcv.effectsdk.EffectsSDKEffectConstants;
import com.google.android.exoplayer2.PlaybackException;
import com.tencent.liteav.audio.TXEAudioDef;

/* JADX INFO: loaded from: classes7.dex */
public class di70 {
    /* JADX INFO: renamed from: a */
    public static vlw m111864a(vlw vlwVar, int i) {
        n8c.m158483a("jzheng", "resolutionLevel " + i);
        if (i == 0) {
            vlwVar.f177164s = 352;
            vlwVar.f177166t = 640;
            vlwVar.f177168u = 352;
            vlwVar.f177169v = 640;
            vlwVar.f177170w = 640;
            vlwVar.f177171x = 480;
            vlwVar.f177152m = 352;
            vlwVar.f177154n = 640;
            vlwVar.f177173z = 352;
            vlwVar.f177102A = 640;
            vlwVar.f177103B = 352;
            vlwVar.f177104C = 640;
            vlwVar.f177109H = 500000;
        } else if (i == 1) {
            vlwVar.f177164s = 352;
            vlwVar.f177166t = 640;
            vlwVar.f177168u = 352;
            vlwVar.f177169v = 640;
            vlwVar.f177170w = 640;
            vlwVar.f177171x = 480;
            vlwVar.f177152m = 352;
            vlwVar.f177154n = 640;
            vlwVar.f177173z = 352;
            vlwVar.f177102A = 640;
            vlwVar.f177103B = 352;
            vlwVar.f177104C = 640;
            vlwVar.f177109H = 750000;
        } else if (i == 2 || i == 3) {
            vlwVar.f177164s = 528;
            vlwVar.f177166t = TXEAudioDef.TXE_OPUS_SAMPLE_NUM;
            vlwVar.f177168u = 528;
            vlwVar.f177169v = TXEAudioDef.TXE_OPUS_SAMPLE_NUM;
            vlwVar.f177170w = EffectsSDKEffectConstants.FaceSegmentConfig.BEFF_MOBILE_FACE_REST_MASK;
            vlwVar.f177171x = 720;
            vlwVar.f177152m = 528;
            vlwVar.f177154n = TXEAudioDef.TXE_OPUS_SAMPLE_NUM;
            vlwVar.f177173z = 528;
            vlwVar.f177102A = TXEAudioDef.TXE_OPUS_SAMPLE_NUM;
            vlwVar.f177103B = 528;
            vlwVar.f177104C = TXEAudioDef.TXE_OPUS_SAMPLE_NUM;
            vlwVar.f177109H = PlaybackException.CUSTOM_ERROR_CODE_BASE;
        } else {
            vlwVar.f177164s = 352;
            vlwVar.f177166t = 640;
            vlwVar.f177168u = 352;
            vlwVar.f177169v = 640;
            vlwVar.f177170w = 640;
            vlwVar.f177171x = 480;
            vlwVar.f177152m = 352;
            vlwVar.f177154n = 640;
            vlwVar.f177173z = 352;
            vlwVar.f177102A = 640;
            vlwVar.f177103B = 352;
            vlwVar.f177104C = 640;
            vlwVar.f177109H = 500000;
        }
        m111868e(vlwVar);
        return vlwVar;
    }

    /* JADX INFO: renamed from: b */
    public static vlw m111865b(vlw vlwVar, int i, int i2) {
        if (!fjx.m121638R().m121679N0()) {
            for (fjx.C16863b c16863b : fjx.m121638R().m121756k()) {
                n8c.m158483a("configdata", c16863b.toString());
                if (i <= c16863b.m121809b().intValue()) {
                    vlwVar.f177152m = c16863b.m121811g();
                    vlwVar.f177154n = c16863b.m121810f();
                }
            }
        } else if (i > 800000) {
            vlwVar.f177152m = 528;
            vlwVar.f177154n = TXEAudioDef.TXE_OPUS_SAMPLE_NUM;
        } else {
            vlwVar.f177152m = 352;
            vlwVar.f177154n = 640;
        }
        vlwVar.f177109H = i;
        vlwVar.f177107F = i2;
        n8c.m158483a("newBitrate", "getResolutionLevel_2 encode w/h: " + vlwVar.f177152m + " / " + vlwVar.f177154n + " / " + i + " / " + i2);
        return vlwVar;
    }

    /* JADX INFO: renamed from: c */
    public static vlw m111866c(vlw vlwVar, int i) {
        vlwVar.f177109H = i;
        return vlwVar;
    }

    /* JADX INFO: renamed from: d */
    public static String m111867d() {
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
    private static void m111868e(vlw vlwVar) {
        n8c.m158483a("newBitrate", "videoWidth:" + vlwVar.f177164s + ",videoHeight:" + vlwVar.f177166t + ",visualWidth:" + vlwVar.f177168u + ",visualHeight:" + vlwVar.f177169v + ",targetWidth:" + vlwVar.f177170w + ",targetHeight:" + vlwVar.f177171x + ",encodeWidth:" + vlwVar.f177152m + ",encodeHeight:" + vlwVar.f177154n + ",cameraRenderWidth:" + vlwVar.f177173z + ",cameraRenderHeight:" + vlwVar.f177102A + ",videoBitrate:" + vlwVar.f177109H + ",audioBitrate:" + vlwVar.f177120S + ",videoFPS:" + vlwVar.f177107F + ",mergeCanvaWidth " + vlwVar.f177148k + ",mergeCanvaHeight " + vlwVar.f177150l + "enhanceMode " + vlwVar.f177172y);
    }
}
