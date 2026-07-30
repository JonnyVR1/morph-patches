package p153l;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C1894k;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.momo.momortc.MMConstants;
import com.sina.weibo.sdk.constant.WBConstants;
import com.tencent.liteav.audio.TXEAudioDef;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: l.d9 */
/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class C16484d9 {

    /* JADX INFO: renamed from: a */
    public static final int[] f85694a = {2002, 2000, WBConstants.SDK_NEW_PAY_VERSION, MMConstants.ERR_VCM_ENCODER_INIT_ERROR, MMConstants.ERR_VCM_UNKNOWN_ERROR, 1001, 1000, TXEAudioDef.TXE_OPUS_SAMPLE_NUM, 800, 800, 480, 400, 400, 2048};

    /* JADX INFO: renamed from: l.d9$b */
    public static final class b {

        /* JADX INFO: renamed from: a */
        public final int f85695a;

        /* JADX INFO: renamed from: b */
        public final int f85696b;

        /* JADX INFO: renamed from: c */
        public final int f85697c;

        /* JADX INFO: renamed from: d */
        public final int f85698d;

        /* JADX INFO: renamed from: e */
        public final int f85699e;

        public b(int i, int i2, int i3, int i4, int i5) {
            this.f85695a = i;
            this.f85697c = i2;
            this.f85696b = i3;
            this.f85698d = i4;
            this.f85699e = i5;
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m114988a(int i, ig60 ig60Var) {
        ig60Var.m139804Q(7);
        byte[] bArrM139815e = ig60Var.m139815e();
        bArrM139815e[0] = -84;
        bArrM139815e[1] = 64;
        bArrM139815e[2] = -1;
        bArrM139815e[3] = -1;
        bArrM139815e[4] = (byte) ((i >> 16) & 255);
        bArrM139815e[5] = (byte) ((i >> 8) & 255);
        bArrM139815e[6] = (byte) (i & 255);
    }

    /* JADX INFO: renamed from: b */
    public static C1894k m114989b(ig60 ig60Var, String str, String str2, @Nullable DrmInitData drmInitData) {
        ig60Var.m139809V(1);
        return new C1894k.b().m10388U(str).m10400g0("audio/ac4").m10377J(2).m10401h0(((ig60Var.m139795H() & 32) >> 5) == 1 ? 48000 : 44100).m10382O(drmInitData).m10391X(str2).m10374G();
    }

    /* JADX INFO: renamed from: c */
    public static int m114990c(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[16];
        int iPosition = byteBuffer.position();
        byteBuffer.get(bArr);
        byteBuffer.position(iPosition);
        return m114991d(new hg60(bArr)).f85699e;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x0084  */
    /* JADX WARN: Code duplicated, block: B:44:0x008c  */
    /* JADX WARN: Code duplicated, block: B:47:0x0091  */
    /* JADX WARN: Code duplicated, block: B:48:0x0093  */
    /* JADX INFO: renamed from: d */
    public static b m114991d(hg60 hg60Var) {
        int i;
        int i2;
        int i3;
        int iM134905h = hg60Var.m134905h(16);
        int iM134905h2 = hg60Var.m134905h(16);
        if (iM134905h2 == 65535) {
            iM134905h2 = hg60Var.m134905h(24);
            i = 7;
        } else {
            i = 4;
        }
        int i4 = iM134905h2 + i;
        if (iM134905h == 44097) {
            i4 += 2;
        }
        int i5 = i4;
        int iM134905h3 = hg60Var.m134905h(2);
        if (iM134905h3 == 3) {
            iM134905h3 += m114993f(hg60Var, 2);
        }
        int i6 = iM134905h3;
        int iM134905h4 = hg60Var.m134905h(10);
        if (hg60Var.m134904g() && hg60Var.m134905h(3) > 0) {
            hg60Var.m134915r(2);
        }
        int i7 = 48000;
        if (!hg60Var.m134904g()) {
            i7 = 44100;
        }
        int iM134905h5 = hg60Var.m134905h(4);
        if (i7 != 44100 || iM134905h5 != 13) {
            if (i7 == 48000) {
                int[] iArr = f85694a;
                if (iM134905h5 < iArr.length) {
                    int i8 = iArr[iM134905h5];
                    int i9 = iM134905h4 % 5;
                    if (i9 == 1) {
                        if (iM134905h5 != 3 || iM134905h5 == 8) {
                            i2 = i8 + 1;
                        } else {
                            i3 = i8;
                        }
                    } else if (i9 != 2) {
                        if (i9 == 3) {
                            if (iM134905h5 != 3) {
                            }
                            i2 = i8 + 1;
                        } else if (i9 == 4 && (iM134905h5 == 3 || iM134905h5 == 8 || iM134905h5 == 11)) {
                            i2 = i8 + 1;
                        } else {
                            i3 = i8;
                        }
                    } else if (iM134905h5 == 8 || iM134905h5 == 11) {
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
        i2 = f85694a[iM134905h5];
        i3 = i2;
        return new b(i6, 2, i7, i5, i3);
    }

    /* JADX INFO: renamed from: e */
    public static int m114992e(byte[] bArr, int i) {
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
    public static int m114993f(hg60 hg60Var, int i) {
        int i2 = 0;
        while (true) {
            int iM134905h = i2 + hg60Var.m134905h(i);
            if (!hg60Var.m134904g()) {
                return iM134905h;
            }
            i2 = (iM134905h + 1) << i;
        }
    }
}
