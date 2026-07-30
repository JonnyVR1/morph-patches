package p153l;

import androidx.annotation.Nullable;
import com.effectsar.labcv.effectsdk.EffectsSDKEffectConstants;
import com.google.android.gms.internal.ads.zzae;
import com.sina.weibo.sdk.constant.WBConstants;
import com.tencent.ugc.TXRecordCommon;
import java.util.Arrays;

/* JADX INFO: loaded from: classes6.dex */
public final class mer0 {

    /* JADX INFO: renamed from: a */
    public static final int[] f136560a = {1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 7, 8, 8};

    /* JADX INFO: renamed from: b */
    public static final int[] f136561b = {-1, TXRecordCommon.AUDIO_SAMPLERATE_8000, 16000, 32000, -1, -1, 11025, 22050, 44100, -1, -1, 12000, 24000, 48000, -1, -1};

    /* JADX INFO: renamed from: c */
    public static final int[] f136562c = {64, 112, 128, 192, 224, 256, 384, 448, 512, 640, 768, 896, 1024, 1152, EffectsSDKEffectConstants.FaceSegmentConfig.BEFF_MOBILE_FACE_REST_MASK, 1536, WBConstants.SDK_NEW_PAY_VERSION, 2048, EffectsSDKEffectConstants.FaceExtraModel.BEF_MOBILE_FACE_280_DETECT, 2560, 2688, 2816, 2823, 2944, 3072, 3840, 4096, 6144, 7680};

    /* JADX INFO: renamed from: a */
    public static sqr0 m158076a(byte[] bArr, @Nullable String str, @Nullable String str2, @Nullable zzae zzaeVar) {
        dfw0 dfw0Var;
        if (bArr[0] == 127) {
            dfw0Var = new dfw0(bArr, bArr.length);
        } else {
            byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
            byte b = bArrCopyOf[0];
            if (b == -2 || b == -1) {
                for (int i = 0; i < bArrCopyOf.length - 1; i += 2) {
                    byte b2 = bArrCopyOf[i];
                    int i2 = i + 1;
                    bArrCopyOf[i] = bArrCopyOf[i2];
                    bArrCopyOf[i2] = b2;
                }
            }
            int length = bArrCopyOf.length;
            dfw0Var = new dfw0(bArrCopyOf, length);
            if (bArrCopyOf[0] == 31) {
                dfw0 dfw0Var2 = new dfw0(bArrCopyOf, length);
                while (dfw0Var2.m115549a() >= 16) {
                    dfw0Var2.m115561m(2);
                    dfw0Var.m115554f(dfw0Var2.m115552d(14), 14);
                }
            }
            dfw0Var.m115558j(bArrCopyOf, bArrCopyOf.length);
        }
        dfw0Var.m115561m(60);
        int i3 = f136560a[dfw0Var.m115552d(6)];
        int i4 = f136561b[dfw0Var.m115552d(4)];
        int iM115552d = dfw0Var.m115552d(5);
        int i5 = iM115552d < 29 ? (f136562c[iM115552d] * 1000) / 2 : -1;
        dfw0Var.m115561m(10);
        int i6 = i3 + (dfw0Var.m115552d(2) > 0 ? 1 : 0);
        znr0 znr0Var = new znr0();
        znr0Var.m220658k(str);
        znr0Var.m220672w("audio/vnd.dts");
        znr0Var.m220657j0(i5);
        znr0Var.m220659k0(i6);
        znr0Var.m220673x(i4);
        znr0Var.m220650e(null);
        znr0Var.m220663n(str2);
        return znr0Var.m220645D();
    }
}
