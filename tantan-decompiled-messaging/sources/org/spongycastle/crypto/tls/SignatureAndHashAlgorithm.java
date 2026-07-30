package org.spongycastle.crypto.tls;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import p149l.ig3;

/* JADX INFO: loaded from: classes3.dex */
public class SignatureAndHashAlgorithm {
    protected short hash;
    protected short signature;

    public SignatureAndHashAlgorithm(short s, short s2) {
        if (!TlsUtils.isValidUint8(s)) {
            ig3.m135964a("'hash' should be a uint8");
            throw null;
        }
        if (!TlsUtils.isValidUint8(s2)) {
            ig3.m135964a("'signature' should be a uint8");
            throw null;
        }
        if (s2 == 0) {
            ig3.m135964a("'signature' MUST NOT be \"anonymous\"");
            throw null;
        }
        this.hash = s;
        this.signature = s2;
    }

    public static SignatureAndHashAlgorithm parse(InputStream inputStream) throws IOException {
        return new SignatureAndHashAlgorithm(TlsUtils.readUint8(inputStream), TlsUtils.readUint8(inputStream));
    }

    public void encode(OutputStream outputStream) throws IOException {
        TlsUtils.writeUint8(getHash(), outputStream);
        TlsUtils.writeUint8(getSignature(), outputStream);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof SignatureAndHashAlgorithm)) {
            return false;
        }
        SignatureAndHashAlgorithm signatureAndHashAlgorithm = (SignatureAndHashAlgorithm) obj;
        return signatureAndHashAlgorithm.getHash() == getHash() && signatureAndHashAlgorithm.getSignature() == getSignature();
    }

    public short getHash() {
        return this.hash;
    }

    public short getSignature() {
        return this.signature;
    }

    public int hashCode() {
        return getSignature() | (getHash() << 16);
    }
}
