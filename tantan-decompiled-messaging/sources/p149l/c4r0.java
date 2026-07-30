package p149l;

import com.momo.momortc.MMConstants;
import com.sina.weibo.sdk.constant.WBConstants;
import com.tencent.liteav.audio.TXEAudioDef;

/* JADX INFO: loaded from: classes6.dex */
public final class c4r0 {

    /* JADX INFO: renamed from: a */
    public static final int[] f79291a = {2002, 2000, WBConstants.SDK_NEW_PAY_VERSION, MMConstants.ERR_VCM_ENCODER_INIT_ERROR, MMConstants.ERR_VCM_UNKNOWN_ERROR, 1001, 1000, TXEAudioDef.TXE_OPUS_SAMPLE_NUM, 800, 800, 480, 400, 400, 2048};

    /* JADX WARN: Code duplicated, block: B:45:0x0093  */
    /* JADX WARN: Code duplicated, block: B:49:0x009b  */
    /* JADX INFO: renamed from: a */
    public static b4r0 m105239a(x5w0 x5w0Var) {
        int i;
        int iM207150d;
        int iM207150d2 = x5w0Var.m207150d(16);
        int iM207150d3 = x5w0Var.m207150d(16);
        if (iM207150d3 == 65535) {
            iM207150d3 = x5w0Var.m207150d(24);
            i = 7;
        } else {
            i = 4;
        }
        int i2 = iM207150d3 + i;
        if (iM207150d2 == 44097) {
            i2 += 2;
        }
        int i3 = i2;
        int iM207150d4 = x5w0Var.m207150d(2);
        int i4 = 0;
        if (iM207150d4 == 3) {
            int i5 = 0;
            while (true) {
                iM207150d = i5 + x5w0Var.m207150d(2);
                if (!x5w0Var.m207161o()) {
                    break;
                }
                i5 = (iM207150d + 1) << 2;
            }
            iM207150d4 = iM207150d + 3;
        }
        int i6 = iM207150d4;
        int iM207150d5 = x5w0Var.m207150d(10);
        if (x5w0Var.m207161o() && x5w0Var.m207150d(3) > 0) {
            x5w0Var.m207159m(2);
        }
        int i7 = 48000;
        if (true != x5w0Var.m207161o()) {
            i7 = 44100;
        }
        int iM207150d6 = x5w0Var.m207150d(4);
        if (i7 == 44100 && iM207150d6 == 13) {
            i4 = f79291a[13];
        } else if (i7 == 48000 && iM207150d6 < 14) {
            i4 = f79291a[iM207150d6];
            int i8 = iM207150d5 % 5;
            if (i8 == 1) {
                if (iM207150d6 != 3 || iM207150d6 == 8) {
                    i4++;
                }
            } else if (i8 != 2) {
                if (i8 != 3) {
                    if (i8 == 4 && (iM207150d6 == 3 || iM207150d6 == 8 || iM207150d6 == 11)) {
                        i4++;
                    }
                } else if (iM207150d6 != 3) {
                    i4++;
                } else {
                    i4++;
                }
            } else if (iM207150d6 == 8 || iM207150d6 == 11) {
                i4++;
            }
        }
        return new b4r0(i6, 2, i7, i3, i4, null);
    }

    /* JADX INFO: renamed from: b */
    public static void m105240b(int i, v6w0 v6w0Var) {
        v6w0Var.m197259h(7);
        byte[] bArrM197264m = v6w0Var.m197264m();
        bArrM197264m[0] = -84;
        bArrM197264m[1] = 64;
        bArrM197264m[2] = -1;
        bArrM197264m[3] = -1;
        bArrM197264m[4] = (byte) ((i >> 16) & 255);
        bArrM197264m[5] = (byte) ((i >> 8) & 255);
        bArrM197264m[6] = (byte) (i & 255);
    }
}
