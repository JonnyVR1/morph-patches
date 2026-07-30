package org.spongycastle.crypto.parsers;

import java.io.IOException;
import java.io.InputStream;
import l.hj10;
import l.rhg0;
import org.spongycastle.crypto.KeyParser;
import org.spongycastle.crypto.params.AsymmetricKeyParameter;
import org.spongycastle.crypto.params.ECDomainParameters;
import org.spongycastle.crypto.params.ECPublicKeyParameters;
import org.spongycastle.util.p013io.Streams;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class ECIESPublicKeyParser implements KeyParser {
    private ECDomainParameters ecParams;

    public ECIESPublicKeyParser(ECDomainParameters eCDomainParameters) {
        this.ecParams = eCDomainParameters;
    }

    @Override // org.spongycastle.crypto.KeyParser
    public AsymmetricKeyParameter readKey(InputStream inputStream) throws IOException {
        byte[] bArr;
        int i = inputStream.read();
        if (i == 0) {
            rhg0.a("Sender's public key invalid.");
            return null;
        }
        if (i == 2 || i == 3) {
            bArr = new byte[((this.ecParams.getCurve().getFieldSize() + 7) / 8) + 1];
        } else {
            if (i != 4 && i != 6 && i != 7) {
                hj10.a("Sender's public key has invalid point encoding 0x", Integer.toString(i, 16));
                return null;
            }
            bArr = new byte[(((this.ecParams.getCurve().getFieldSize() + 7) / 8) * 2) + 1];
        }
        bArr[0] = (byte) i;
        Streams.readFully(inputStream, bArr, 1, bArr.length - 1);
        return new ECPublicKeyParameters(this.ecParams.getCurve().decodePoint(bArr), this.ecParams);
    }
}
