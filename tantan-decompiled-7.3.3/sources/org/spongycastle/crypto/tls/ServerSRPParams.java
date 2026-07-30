package org.spongycastle.crypto.tls;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.math.BigInteger;
import org.spongycastle.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public class ServerSRPParams {

    /* JADX INFO: renamed from: B */
    protected BigInteger f207687B;

    /* JADX INFO: renamed from: N */
    protected BigInteger f207688N;

    /* JADX INFO: renamed from: g */
    protected BigInteger f207689g;

    /* JADX INFO: renamed from: s */
    protected byte[] f207690s;

    public ServerSRPParams(BigInteger bigInteger, BigInteger bigInteger2, byte[] bArr, BigInteger bigInteger3) {
        this.f207688N = bigInteger;
        this.f207689g = bigInteger2;
        this.f207690s = Arrays.clone(bArr);
        this.f207687B = bigInteger3;
    }

    public static ServerSRPParams parse(InputStream inputStream) throws IOException {
        return new ServerSRPParams(TlsSRPUtils.readSRPParameter(inputStream), TlsSRPUtils.readSRPParameter(inputStream), TlsUtils.readOpaque8(inputStream), TlsSRPUtils.readSRPParameter(inputStream));
    }

    public void encode(OutputStream outputStream) throws IOException {
        TlsSRPUtils.writeSRPParameter(this.f207688N, outputStream);
        TlsSRPUtils.writeSRPParameter(this.f207689g, outputStream);
        TlsUtils.writeOpaque8(this.f207690s, outputStream);
        TlsSRPUtils.writeSRPParameter(this.f207687B, outputStream);
    }

    public BigInteger getB() {
        return this.f207687B;
    }

    public BigInteger getG() {
        return this.f207689g;
    }

    public BigInteger getN() {
        return this.f207688N;
    }

    public byte[] getS() {
        return this.f207690s;
    }
}
