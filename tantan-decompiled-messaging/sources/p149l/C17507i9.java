package p149l;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C1871k;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.momo.momortc.MMConstants;
import com.sina.weibo.sdk.constant.WBConstants;
import com.tencent.liteav.audio.TXEAudioDef;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: l.i9 */
/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class C17507i9 {

    /* JADX INFO: renamed from: a */
    public static final int[] f112086a = {2002, 2000, WBConstants.SDK_NEW_PAY_VERSION, MMConstants.ERR_VCM_ENCODER_INIT_ERROR, MMConstants.ERR_VCM_UNKNOWN_ERROR, 1001, 1000, TXEAudioDef.TXE_OPUS_SAMPLE_NUM, 800, 800, 480, 400, 400, 2048};

    /* JADX INFO: renamed from: l.i9$b */
    public static final class b {

        /* JADX INFO: renamed from: a */
        public final int f112087a;

        /* JADX INFO: renamed from: b */
        public final int f112088b;

        /* JADX INFO: renamed from: c */
        public final int f112089c;

        /* JADX INFO: renamed from: d */
        public final int f112090d;

        /* JADX INFO: renamed from: e */
        public final int f112091e;

        public b(int i, int i2, int i3, int i4, int i5) {
            this.f112087a = i;
            this.f112089c = i2;
            this.f112088b = i3;
            this.f112090d = i4;
            this.f112091e = i5;
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m134993a(int i, d860 d860Var) {
        d860Var.m110288Q(7);
        byte[] bArrM110299e = d860Var.m110299e();
        bArrM110299e[0] = -84;
        bArrM110299e[1] = 64;
        bArrM110299e[2] = -1;
        bArrM110299e[3] = -1;
        bArrM110299e[4] = (byte) ((i >> 16) & 255);
        bArrM110299e[5] = (byte) ((i >> 8) & 255);
        bArrM110299e[6] = (byte) (i & 255);
    }

    /* JADX INFO: renamed from: b */
    public static C1871k m134994b(d860 d860Var, String str, String str2, @Nullable DrmInitData drmInitData) {
        d860Var.m110293V(1);
        return new C1871k.b().m10334U(str).m10346g0("audio/ac4").m10323J(2).m10347h0(((d860Var.m110279H() & 32) >> 5) == 1 ? 48000 : 44100).m10328O(drmInitData).m10337X(str2).m10320G();
    }

    /* JADX INFO: renamed from: c */
    public static int m134995c(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[16];
        int iPosition = byteBuffer.position();
        byteBuffer.get(bArr);
        byteBuffer.position(iPosition);
        return m134996d(new c860(bArr)).f112091e;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x0084  */
    /* JADX WARN: Code duplicated, block: B:44:0x008c  */
    /* JADX WARN: Code duplicated, block: B:47:0x0091  */
    /* JADX WARN: Code duplicated, block: B:48:0x0093  */
    /* JADX INFO: renamed from: d */
    public static b m134996d(c860 c860Var) {
        int i;
        int i2;
        int i3;
        int iM105664h = c860Var.m105664h(16);
        int iM105664h2 = c860Var.m105664h(16);
        if (iM105664h2 == 65535) {
            iM105664h2 = c860Var.m105664h(24);
            i = 7;
        } else {
            i = 4;
        }
        int i4 = iM105664h2 + i;
        if (iM105664h == 44097) {
            i4 += 2;
        }
        int i5 = i4;
        int iM105664h3 = c860Var.m105664h(2);
        if (iM105664h3 == 3) {
            iM105664h3 += m134998f(c860Var, 2);
        }
        int i6 = iM105664h3;
        int iM105664h4 = c860Var.m105664h(10);
        if (c860Var.m105663g() && c860Var.m105664h(3) > 0) {
            c860Var.m105674r(2);
        }
        int i7 = 48000;
        if (!c860Var.m105663g()) {
            i7 = 44100;
        }
        int iM105664h5 = c860Var.m105664h(4);
        if (i7 != 44100 || iM105664h5 != 13) {
            if (i7 == 48000) {
                int[] iArr = f112086a;
                if (iM105664h5 < iArr.length) {
                    int i8 = iArr[iM105664h5];
                    int i9 = iM105664h4 % 5;
                    if (i9 == 1) {
                        if (iM105664h5 != 3 || iM105664h5 == 8) {
                            i2 = i8 + 1;
                        } else {
                            i3 = i8;
                        }
                    } else if (i9 != 2) {
                        if (i9 == 3) {
                            if (iM105664h5 != 3) {
                            }
                            i2 = i8 + 1;
                        } else if (i9 == 4 && (iM105664h5 == 3 || iM105664h5 == 8 || iM105664h5 == 11)) {
                            i2 = i8 + 1;
                        } else {
                            i3 = i8;
                        }
                    } else if (iM105664h5 == 8 || iM105664h5 == 11) {
                        i2 = i8 + 1;
                    } else {
                        i3 = i8;
                    }
                } else {
                    i2 = 0;
                }
            } else {
                i2 = 0;
            }
            return new b(i6, 2, i7, i5, i3);
        }
        i2 = f112086a[iM105664h5];
        i3 = i2;
        return new b(i6, 2, i7, i5, i3);
    }

    /* JADX INFO: renamed from: e */
    public static int m134997e(byte[] bArr, int i) {
        int i2 = 7;
        if (bArr.length < 7) {
            return -1;
        }
        int i3 = ((bArr[2] & 255) << 8) | (bArr[3] & 255);
        if (i3 == 65535) {
            i3 = ((bArr[4] & 255) << 16) | ((bArr[5] & 255) << 8) | (bArr[6] & 255);
        } else {
            i2 = 4;
        }
        if (i == 44097) {
            i2 += 2;
        }
        return i3 + i2;
    }

    /* JADX INFO: renamed from: f */
    public static int m134998f(c860 c860Var, int i) {
        int i2 = 0;
        while (true) {
            int iM105664h = i2 + c860Var.m105664h(i);
            if (!c860Var.m105663g()) {
                return iM105664h;
            }
            i2 = (iM105664h + 1) << i;
        }
    }
}
