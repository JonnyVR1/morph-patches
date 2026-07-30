package org.spongycastle.crypto.parsers;

import java.io.IOException;
import java.io.InputStream;
import java.math.BigInteger;
import org.spongycastle.crypto.KeyParser;
import org.spongycastle.crypto.params.AsymmetricKeyParameter;
import org.spongycastle.crypto.params.DHParameters;
import org.spongycastle.crypto.params.DHPublicKeyParameters;
import org.spongycastle.util.p136io.Streams;

/* JADX INFO: loaded from: classes3.dex */
public class DHIESPublicKeyParser implements KeyParser {
    private DHParameters dhParams;

    public DHIESPublicKeyParser(DHParameters dHParameters) {
        this.dhParams = dHParameters;
    }

    @Override // org.spongycastle.crypto.KeyParser
    public AsymmetricKeyParameter readKey(InputStream inputStream) throws IOException {
        int iBitLength = (this.dhParams.getP().bitLength() + 7) / 8;
        byte[] bArr = new byte[iBitLength];
        Streams.readFully(inputStream, bArr, 0, iBitLength);
        return new DHPublicKeyParameters(new BigInteger(1, bArr), this.dhParams);
    }
}
