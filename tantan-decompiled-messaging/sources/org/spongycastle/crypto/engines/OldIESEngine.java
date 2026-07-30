package org.spongycastle.crypto.engines;

import org.spongycastle.crypto.BasicAgreement;
import org.spongycastle.crypto.BufferedBlockCipher;
import org.spongycastle.crypto.DerivationFunction;
import org.spongycastle.crypto.Mac;
import org.spongycastle.util.Pack;

/* JADX INFO: loaded from: classes3.dex */
public class OldIESEngine extends IESEngine {
    public OldIESEngine(BasicAgreement basicAgreement, DerivationFunction derivationFunction, Mac mac) {
        super(basicAgreement, derivationFunction, mac);
    }

    @Override // org.spongycastle.crypto.engines.IESEngine
    public byte[] getLengthTag(byte[] bArr) {
        byte[] bArr2 = new byte[4];
        if (bArr != null) {
            Pack.intToBigEndian(bArr.length * 8, bArr2, 0);
        }
        return bArr2;
    }

    public OldIESEngine(BasicAgreement basicAgreement, DerivationFunction derivationFunction, Mac mac, BufferedBlockCipher bufferedBlockCipher) {
        super(basicAgreement, derivationFunction, mac, bufferedBlockCipher);
    }
}
