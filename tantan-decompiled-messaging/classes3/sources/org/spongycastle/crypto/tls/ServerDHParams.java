package org.spongycastle.crypto.tls;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.math.BigInteger;
import l.ig3;
import org.spongycastle.crypto.params.DHParameters;
import org.spongycastle.crypto.params.DHPublicKeyParameters;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class ServerDHParams {
    protected DHPublicKeyParameters publicKey;

    public ServerDHParams(DHPublicKeyParameters dHPublicKeyParameters) {
        if (dHPublicKeyParameters != null) {
            this.publicKey = dHPublicKeyParameters;
        } else {
            ig3.a("'publicKey' cannot be null");
            throw null;
        }
    }

    public static ServerDHParams parse(InputStream inputStream) throws IOException {
        return new ServerDHParams(TlsDHUtils.validateDHPublicKey(new DHPublicKeyParameters(TlsDHUtils.readDHParameter(inputStream), new DHParameters(TlsDHUtils.readDHParameter(inputStream), TlsDHUtils.readDHParameter(inputStream)))));
    }

    public void encode(OutputStream outputStream) throws IOException {
        DHParameters parameters = this.publicKey.getParameters();
        BigInteger y = this.publicKey.getY();
        TlsDHUtils.writeDHParameter(parameters.getP(), outputStream);
        TlsDHUtils.writeDHParameter(parameters.getG(), outputStream);
        TlsDHUtils.writeDHParameter(y, outputStream);
    }

    public DHPublicKeyParameters getPublicKey() {
        return this.publicKey;
    }
}
