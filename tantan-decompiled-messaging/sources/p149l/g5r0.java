package p149l;

import androidx.annotation.Nullable;
import com.effectsar.labcv.effectsdk.EffectsSDKEffectConstants;
import com.google.android.gms.internal.ads.zzae;
import com.sina.weibo.sdk.constant.WBConstants;
import com.tencent.ugc.TXRecordCommon;
import com.tencent.wcdb.FileUtils;
import java.util.Arrays;

/* JADX INFO: loaded from: classes6.dex */
public final class g5r0 {

    /* JADX INFO: renamed from: a */
    public static final int[] f101187a = {1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 7, 8, 8};

    /* JADX INFO: renamed from: b */
    public static final int[] f101188b = {-1, TXRecordCommon.AUDIO_SAMPLERATE_8000, 16000, 32000, -1, -1, 11025, 22050, 44100, -1, -1, 12000, 24000, 48000, -1, -1};

    /* JADX INFO: renamed from: c */
    public static final int[] f101189c = {64, 112, 128, 192, 224, 256, 384, FileUtils.S_IRWXU, 512, 640, 768, 896, 1024, 1152, EffectsSDKEffectConstants.FaceSegmentConfig.BEFF_MOBILE_FACE_REST_MASK, 1536, WBConstants.SDK_NEW_PAY_VERSION, 2048, EffectsSDKEffectConstants.FaceExtraModel.BEF_MOBILE_FACE_280_DETECT, 2560, 2688, 2816, 2823, 2944, 3072, 3840, 4096, 6144, 7680};

    /* JADX INFO: renamed from: a */
    public static mhr0 m124533a(byte[] bArr, @Nullable String str, @Nullable String str2, @Nullable zzae zzaeVar) {
        x5w0 x5w0Var;
        if (bArr[0] == 127) {
            x5w0Var = new x5w0(bArr, bArr.length);
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
            x5w0Var = new x5w0(bArrCopyOf, length);
            if (bArrCopyOf[0] == 31) {
                x5w0 x5w0Var2 = new x5w0(bArrCopyOf, length);
                while (x5w0Var2.m207147a() >= 16) {
                    x5w0Var2.m207159m(2);
                    x5w0Var.m207152f(x5w0Var2.m207150d(14), 14);
                }
            }
            x5w0Var.m207156j(bArrCopyOf, bArrCopyOf.length);
        }
        x5w0Var.m207159m(60);
        int i3 = f101187a[x5w0Var.m207150d(6)];
        int i4 = f101188b[x5w0Var.m207150d(4)];
        int iM207150d = x5w0Var.m207150d(5);
        int i5 = iM207150d < 29 ? (f101189c[iM207150d] * 1000) / 2 : -1;
        x5w0Var.m207159m(10);
        int i6 = i3 + (x5w0Var.m207150d(2) > 0 ? 1 : 0);
        ter0 ter0Var = new ter0();
        ter0Var.m188604k(str);
        ter0Var.m188618w("audio/vnd.dts");
        ter0Var.m188603j0(i5);
        ter0Var.m188605k0(i6);
        ter0Var.m188619x(i4);
        ter0Var.m188596e(null);
        ter0Var.m188609n(str2);
        return ter0Var.m188591D();
    }
}
