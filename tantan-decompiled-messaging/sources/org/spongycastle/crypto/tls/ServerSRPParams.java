package org.spongycastle.crypto.tls;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.math.BigInteger;
import org.spongycastle.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public class ServerSRPParams {

    /* JADX INFO: renamed from: B */
    protected BigInteger f206765B;

    /* JADX INFO: renamed from: N */
    protected BigInteger f206766N;

    /* JADX INFO: renamed from: g */
    protected BigInteger f206767g;

    /* JADX INFO: renamed from: s */
    protected byte[] f206768s;

    public ServerSRPParams(BigInteger bigInteger, BigInteger bigInteger2, byte[] bArr, BigInteger bigInteger3) {
        this.f206766N = bigInteger;
        this.f206767g = bigInteger2;
        this.f206768s = Arrays.clone(bArr);
        this.f206765B = bigInteger3;
    }

    public static ServerSRPParams parse(InputStream inputStream) throws IOException {
        return new ServerSRPParams(TlsSRPUtils.readSRPParameter(inputStream), TlsSRPUtils.readSRPParameter(inputStream), TlsUtils.readOpaque8(inputStream), TlsSRPUtils.readSRPParameter(inputStream));
    }

    public void encode(OutputStream outputStream) throws IOException {
        TlsSRPUtils.writeSRPParameter(this.f206766N, outputStream);
        TlsSRPUtils.writeSRPParameter(this.f206767g, outputStream);
        TlsUtils.writeOpaque8(this.f206768s, outputStream);
        TlsSRPUtils.writeSRPParameter(this.f206765B, outputStream);
    }

    public BigInteger getB() {
        return this.f206765B;
    }

    public BigInteger getG() {
        return this.f206767g;
    }

    public BigInteger getN() {
        return this.f206766N;
    }

    public byte[] getS() {
        return this.f206768s;
    }
}
