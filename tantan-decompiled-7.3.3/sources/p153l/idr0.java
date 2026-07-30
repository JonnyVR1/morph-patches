package p153l;

import com.momo.momortc.MMConstants;
import com.sina.weibo.sdk.constant.WBConstants;
import com.tencent.liteav.audio.TXEAudioDef;

/* JADX INFO: loaded from: classes6.dex */
public final class idr0 {

    /* JADX INFO: renamed from: a */
    public static final int[] f114520a = {2002, 2000, WBConstants.SDK_NEW_PAY_VERSION, MMConstants.ERR_VCM_ENCODER_INIT_ERROR, MMConstants.ERR_VCM_UNKNOWN_ERROR, 1001, 1000, TXEAudioDef.TXE_OPUS_SAMPLE_NUM, 800, 800, 480, 400, 400, 2048};

    /* JADX WARN: Code duplicated, block: B:45:0x0093  */
    /* JADX WARN: Code duplicated, block: B:49:0x009b  */
    /* JADX INFO: renamed from: a */
    public static hdr0 m139541a(dfw0 dfw0Var) {
        int i;
        int iM115552d;
        int iM115552d2 = dfw0Var.m115552d(16);
        int iM115552d3 = dfw0Var.m115552d(16);
        if (iM115552d3 == 65535) {
            iM115552d3 = dfw0Var.m115552d(24);
            i = 7;
        } else {
            i = 4;
        }
        int i2 = iM115552d3 + i;
        if (iM115552d2 == 44097) {
            i2 += 2;
        }
        int i3 = i2;
        int iM115552d4 = dfw0Var.m115552d(2);
        int i4 = 0;
        if (iM115552d4 == 3) {
            int i5 = 0;
            while (true) {
                iM115552d = i5 + dfw0Var.m115552d(2);
                if (!dfw0Var.m115563o()) {
                    break;
                }
                i5 = (iM115552d + 1) << 2;
            }
            iM115552d4 = iM115552d + 3;
        }
        int i6 = iM115552d4;
        int iM115552d5 = dfw0Var.m115552d(10);
        if (dfw0Var.m115563o() && dfw0Var.m115552d(3) > 0) {
            dfw0Var.m115561m(2);
        }
        int i7 = 48000;
        if (true != dfw0Var.m115563o()) {
            i7 = 44100;
        }
        int iM115552d6 = dfw0Var.m115552d(4);
        if (i7 == 44100 && iM115552d6 == 13) {
            i4 = f114520a[13];
        } else if (i7 == 48000 && iM115552d6 < 14) {
            i4 = f114520a[iM115552d6];
            int i8 = iM115552d5 % 5;
            if (i8 == 1) {
                if (iM115552d6 != 3 || iM115552d6 == 8) {
                    i4++;
                }
            } else if (i8 != 2) {
                if (i8 != 3) {
                    if (i8 == 4 && (iM115552d6 == 3 || iM115552d6 == 8 || iM115552d6 == 11)) {
                        i4++;
                    }
                } else if (iM115552d6 != 3) {
                    i4++;
                } else {
                    i4++;
                }
            } else if (iM115552d6 == 8 || iM115552d6 == 11) {
                i4++;
            }
        }
        return new hdr0(i6, 2, i7, i3, i4, null);
    }

    /* JADX INFO: renamed from: b */
    public static void m139542b(int i, bgw0 bgw0Var) {
        bgw0Var.m104266h(7);
        byte[] bArrM104271m = bgw0Var.m104271m();
        bArrM104271m[0] = -84;
        bArrM104271m[1] = 64;
        bArrM104271m[2] = -1;
        bArrM104271m[3] = -1;
        bArrM104271m[4] = (byte) ((i >> 16) & 255);
        bArrM104271m[5] = (byte) ((i >> 8) & 255);
        bArrM104271m[6] = (byte) (i & 255);
    }
}
