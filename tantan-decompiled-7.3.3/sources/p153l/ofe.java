package p153l;

import androidx.annotation.Nullable;
import com.effectsar.labcv.effectsdk.EffectsSDKEffectConstants;
import com.google.android.exoplayer2.C1894k;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.sina.weibo.sdk.constant.WBConstants;
import com.tencent.ugc.TXRecordCommon;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class ofe {

    /* JADX INFO: renamed from: a */
    public static final int[] f147067a = {1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 7, 8, 8};

    /* JADX INFO: renamed from: b */
    public static final int[] f147068b = {-1, TXRecordCommon.AUDIO_SAMPLERATE_8000, 16000, 32000, -1, -1, 11025, 22050, 44100, -1, -1, 12000, 24000, 48000, -1, -1};

    /* JADX INFO: renamed from: c */
    public static final int[] f147069c = {64, 112, 128, 192, 224, 256, 384, 448, 512, 640, 768, 896, 1024, 1152, EffectsSDKEffectConstants.FaceSegmentConfig.BEFF_MOBILE_FACE_REST_MASK, 1536, WBConstants.SDK_NEW_PAY_VERSION, 2048, EffectsSDKEffectConstants.FaceExtraModel.BEF_MOBILE_FACE_280_DETECT, 2560, 2688, 2816, 2823, 2944, 3072, 3840, 4096, 6144, 7680};

    /* JADX WARN: Code duplicated, block: B:15:0x0060  */
    /* JADX WARN: Code duplicated, block: B:17:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: a */
    public static int m167441a(byte[] bArr) {
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
    public static hg60 m167442b(byte[] bArr) {
        if (bArr[0] == 127) {
            return new hg60(bArr);
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        if (m167443c(bArrCopyOf)) {
            for (int i = 0; i < bArrCopyOf.length - 1; i += 2) {
                byte b = bArrCopyOf[i];
                int i2 = i + 1;
                bArrCopyOf[i] = bArrCopyOf[i2];
                bArrCopyOf[i2] = b;
            }
        }
        hg60 hg60Var = new hg60(bArrCopyOf);
        if (bArrCopyOf[0] == 31) {
            hg60 hg60Var2 = new hg60(bArrCopyOf);
            while (hg60Var2.m134899b() >= 16) {
                hg60Var2.m134915r(2);
                hg60Var.m134903f(hg60Var2.m134905h(14), 14);
            }
        }
        hg60Var.m134911n(bArrCopyOf);
        return hg60Var;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m167443c(byte[] bArr) {
        byte b = bArr[0];
        return b == -2 || b == -1;
    }

    /* JADX INFO: renamed from: d */
    public static boolean m167444d(int i) {
        return i == 2147385345 || i == -25230976 || i == 536864768 || i == -14745368;
    }

    /* JADX INFO: renamed from: e */
    public static int m167445e(ByteBuffer byteBuffer) {
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
    public static int m167446f(byte[] bArr) {
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
    public static C1894k m167447g(byte[] bArr, @Nullable String str, @Nullable String str2, @Nullable DrmInitData drmInitData) {
        hg60 hg60VarM167442b = m167442b(bArr);
        hg60VarM167442b.m134915r(60);
        int i = f147067a[hg60VarM167442b.m134905h(6)];
        int i2 = f147068b[hg60VarM167442b.m134905h(4)];
        int iM134905h = hg60VarM167442b.m134905h(5);
        int[] iArr = f147069c;
        int i3 = iM134905h >= iArr.length ? -1 : (iArr[iM134905h] * 1000) / 2;
        hg60VarM167442b.m134915r(10);
        return new C1894k.b().m10388U(str).m10400g0("audio/vnd.dts").m10376I(i3).m10377J(i + (hg60VarM167442b.m134905h(2) > 0 ? 1 : 0)).m10401h0(i2).m10382O(drmInitData).m10391X(str2).m10374G();
    }
}
