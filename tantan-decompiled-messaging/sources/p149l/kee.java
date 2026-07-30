package p149l;

import androidx.annotation.Nullable;
import com.effectsar.labcv.effectsdk.EffectsSDKEffectConstants;
import com.google.android.exoplayer2.C1871k;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.sina.weibo.sdk.constant.WBConstants;
import com.tencent.ugc.TXRecordCommon;
import com.tencent.wcdb.FileUtils;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class kee {

    /* JADX INFO: renamed from: a */
    public static final int[] f122696a = {1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 7, 8, 8};

    /* JADX INFO: renamed from: b */
    public static final int[] f122697b = {-1, TXRecordCommon.AUDIO_SAMPLERATE_8000, 16000, 32000, -1, -1, 11025, 22050, 44100, -1, -1, 12000, 24000, 48000, -1, -1};

    /* JADX INFO: renamed from: c */
    public static final int[] f122698c = {64, 112, 128, 192, 224, 256, 384, FileUtils.S_IRWXU, 512, 640, 768, 896, 1024, 1152, EffectsSDKEffectConstants.FaceSegmentConfig.BEFF_MOBILE_FACE_REST_MASK, 1536, WBConstants.SDK_NEW_PAY_VERSION, 2048, EffectsSDKEffectConstants.FaceExtraModel.BEF_MOBILE_FACE_280_DETECT, 2560, 2688, 2816, 2823, 2944, 3072, 3840, 4096, 6144, 7680};

    /* JADX WARN: Code duplicated, block: B:15:0x0060  */
    /* JADX WARN: Code duplicated, block: B:17:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: a */
    public static int m145762a(byte[] bArr) {
        int i;
        byte b;
        int i2;
        int i3;
        byte b2;
        boolean z = false;
        byte b3 = bArr[0];
        if (b3 != -2) {
            if (b3 == -1) {
                i3 = ((bArr[7] & 3) << 12) | ((bArr[6] & 255) << 4);
                b2 = bArr[9];
            } else if (b3 != 31) {
                i = ((bArr[5] & 3) << 12) | ((bArr[6] & 255) << 4);
                b = bArr[7];
            } else {
                i3 = ((bArr[6] & 3) << 12) | ((bArr[7] & 255) << 4);
                b2 = bArr[8];
            }
            i2 = (((b2 & 60) >> 2) | i3) + 1;
            z = true;
            if (z) {
                return (i2 * 16) / 14;
            }
            return i2;
        }
        i = ((bArr[4] & 3) << 12) | ((bArr[7] & 255) << 4);
        b = bArr[6];
        i2 = (((b & 240) >> 4) | i) + 1;
        if (z) {
            return (i2 * 16) / 14;
        }
        return i2;
    }

    /* JADX INFO: renamed from: b */
    public static c860 m145763b(byte[] bArr) {
        if (bArr[0] == 127) {
            return new c860(bArr);
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        if (m145764c(bArrCopyOf)) {
            for (int i = 0; i < bArrCopyOf.length - 1; i += 2) {
                byte b = bArrCopyOf[i];
                int i2 = i + 1;
                bArrCopyOf[i] = bArrCopyOf[i2];
                bArrCopyOf[i2] = b;
            }
        }
        c860 c860Var = new c860(bArrCopyOf);
        if (bArrCopyOf[0] == 31) {
            c860 c860Var2 = new c860(bArrCopyOf);
            while (c860Var2.m105658b() >= 16) {
                c860Var2.m105674r(2);
                c860Var.m105662f(c860Var2.m105664h(14), 14);
            }
        }
        c860Var.m105670n(bArrCopyOf);
        return c860Var;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m145764c(byte[] bArr) {
        byte b = bArr[0];
        return b == -2 || b == -1;
    }

    /* JADX INFO: renamed from: d */
    public static boolean m145765d(int i) {
        return i == 2147385345 || i == -25230976 || i == 536864768 || i == -14745368;
    }

    /* JADX INFO: renamed from: e */
    public static int m145766e(ByteBuffer byteBuffer) {
        int i;
        byte b;
        int i2;
        byte b2;
        if (byteBuffer.getInt(0) == -233094848 || byteBuffer.getInt(0) == -398277519) {
            return 1024;
        }
        if (byteBuffer.getInt(0) == 622876772) {
            return 4096;
        }
        int iPosition = byteBuffer.position();
        byte b3 = byteBuffer.get(iPosition);
        if (b3 != -2) {
            if (b3 == -1) {
                i = (byteBuffer.get(iPosition + 4) & 7) << 4;
                b2 = byteBuffer.get(iPosition + 7);
            } else if (b3 != 31) {
                i = (byteBuffer.get(iPosition + 4) & 1) << 6;
                b = byteBuffer.get(iPosition + 5);
            } else {
                i = (byteBuffer.get(iPosition + 5) & 7) << 4;
                b2 = byteBuffer.get(iPosition + 6);
            }
            i2 = b2 & 60;
            return (((i2 >> 2) | i) + 1) * 32;
        }
        i = (byteBuffer.get(iPosition + 5) & 1) << 6;
        b = byteBuffer.get(iPosition + 4);
        i2 = b & 252;
        return (((i2 >> 2) | i) + 1) * 32;
    }

    /* JADX INFO: renamed from: f */
    public static int m145767f(byte[] bArr) {
        int i;
        byte b;
        int i2;
        byte b2;
        byte b3 = bArr[0];
        if (b3 != -2) {
            if (b3 == -1) {
                i = (bArr[4] & 7) << 4;
                b2 = bArr[7];
            } else if (b3 != 31) {
                i = (bArr[4] & 1) << 6;
                b = bArr[5];
            } else {
                i = (bArr[5] & 7) << 4;
                b2 = bArr[6];
            }
            i2 = b2 & 60;
            return (((i2 >> 2) | i) + 1) * 32;
        }
        i = (bArr[5] & 1) << 6;
        b = bArr[4];
        i2 = b & 252;
        return (((i2 >> 2) | i) + 1) * 32;
    }

    /* JADX INFO: renamed from: g */
    public static C1871k m145768g(byte[] bArr, @Nullable String str, @Nullable String str2, @Nullable DrmInitData drmInitData) {
        c860 c860VarM145763b = m145763b(bArr);
        c860VarM145763b.m105674r(60);
        int i = f122696a[c860VarM145763b.m105664h(6)];
        int i2 = f122697b[c860VarM145763b.m105664h(4)];
        int iM105664h = c860VarM145763b.m105664h(5);
        int[] iArr = f122698c;
        int i3 = iM105664h >= iArr.length ? -1 : (iArr[iM105664h] * 1000) / 2;
        c860VarM145763b.m105674r(10);
        return new C1871k.b().m10334U(str).m10346g0("audio/vnd.dts").m10322I(i3).m10323J(i + (c860VarM145763b.m105664h(2) > 0 ? 1 : 0)).m10347h0(i2).m10328O(drmInitData).m10337X(str2).m10320G();
    }
}
