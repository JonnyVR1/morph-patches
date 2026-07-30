package org.spongycastle.crypto.engines;

import org.spongycastle.util.Pack;
import p149l.lhi;

/* JADX INFO: loaded from: classes3.dex */
public class XSalsa20Engine extends Salsa20Engine {
    @Override // org.spongycastle.crypto.engines.Salsa20Engine, org.spongycastle.crypto.StreamCipher
    public String getAlgorithmName() {
        return "XSalsa20";
    }

    @Override // org.spongycastle.crypto.engines.Salsa20Engine
    public int getNonceSize() {
        return 24;
    }

    @Override // org.spongycastle.crypto.engines.Salsa20Engine
    public void setKey(byte[] bArr, byte[] bArr2) {
        if (bArr == null) {
            lhi.m149843a(getAlgorithmName(), " doesn't support re-init with null key");
            return;
        }
        if (bArr.length != 32) {
            lhi.m149843a(getAlgorithmName(), " requires a 256 bit key");
            return;
        }
        super.setKey(bArr, bArr2);
        this.engineState[8] = Pack.littleEndianToInt(bArr2, 8);
        this.engineState[9] = Pack.littleEndianToInt(bArr2, 12);
        int[] iArr = this.engineState;
        int[] iArr2 = new int[iArr.length];
        Salsa20Engine.salsaCore(20, iArr, iArr2);
        int[] iArr3 = this.engineState;
        iArr3[1] = iArr2[0] - iArr3[0];
        iArr3[2] = iArr2[5] - iArr3[5];
        iArr3[3] = iArr2[10] - iArr3[10];
        iArr3[4] = iArr2[15] - iArr3[15];
        iArr3[11] = iArr2[6] - iArr3[6];
        iArr3[12] = iArr2[7] - iArr3[7];
        iArr3[13] = iArr2[8] - iArr3[8];
        iArr3[14] = iArr2[9] - iArr3[9];
        iArr3[6] = Pack.littleEndianToInt(bArr2, 16);
        this.engineState[7] = Pack.littleEndianToInt(bArr2, 20);
    }
}
