package org.spongycastle.crypto.tls;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.math.BigInteger;
import org.spongycastle.util.Arrays;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class ServerSRPParams {

    /* JADX INFO: renamed from: B */
    protected BigInteger f10390B;

    /* JADX INFO: renamed from: N */
    protected BigInteger f10391N;

    /* JADX INFO: renamed from: g */
    protected BigInteger f10392g;

    /* JADX INFO: renamed from: s */
    protected byte[] f10393s;

    public ServerSRPParams(BigInteger bigInteger, BigInteger bigInteger2, byte[] bArr, BigInteger bigInteger3) {
        this.f10391N = bigInteger;
        this.f10392g = bigInteger2;
        this.f10393s = Arrays.clone(bArr);
        this.f10390B = bigInteger3;
    }

    public static ServerSRPParams parse(InputStream inputStream) throws IOException {
        return new ServerSRPParams(TlsSRPUtils.readSRPParameter(inputStream), TlsSRPUtils.readSRPParameter(inputStream), TlsUtils.readOpaque8(inputStream), TlsSRPUtils.readSRPParameter(inputStream));
    }

    public void encode(OutputStream outputStream) throws IOException {
        TlsSRPUtils.writeSRPParameter(this.f10391N, outputStream);
        TlsSRPUtils.writeSRPParameter(this.f10392g, outputStream);
        TlsUtils.writeOpaque8(this.f10393s, outputStream);
        TlsSRPUtils.writeSRPParameter(this.f10390B, outputStream);
    }

    public BigInteger getB() {
        return this.f10390B;
    }

    public BigInteger getG() {
        return this.f10392g;
    }

    public BigInteger getN() {
        return this.f10391N;
    }

    public byte[] getS() {
        return this.f10393s;
    }
}
