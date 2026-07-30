package org.spongycastle.crypto.tls;

import java.io.IOException;
import org.spongycastle.crypto.Mac;
import org.spongycastle.crypto.engines.ChaChaEngine;
import org.spongycastle.crypto.generators.Poly1305KeyGenerator;
import org.spongycastle.crypto.macs.Poly1305;
import org.spongycastle.crypto.params.KeyParameter;
import org.spongycastle.crypto.params.ParametersWithIV;
import org.spongycastle.util.Arrays;
import org.spongycastle.util.Pack;
import p153l.f1j0;

/* JADX INFO: loaded from: classes3.dex */
public class Chacha20Poly1305 implements TlsCipher {
    protected TlsContext context;
    protected ChaChaEngine decryptCipher;
    protected ChaChaEngine encryptCipher;

    public Chacha20Poly1305(TlsContext tlsContext) throws IOException {
        if (!TlsUtils.isTLSv12(tlsContext)) {
            f1j0.m123577a(80);
            throw null;
        }
        this.context = tlsContext;
        byte[] bArrCalculateKeyBlock = TlsUtils.calculateKeyBlock(tlsContext, 64);
        KeyParameter keyParameter = new KeyParameter(bArrCalculateKeyBlock, 0, 32);
        KeyParameter keyParameter2 = new KeyParameter(bArrCalculateKeyBlock, 32, 32);
        this.encryptCipher = new ChaChaEngine(20);
        this.decryptCipher = new ChaChaEngine(20);
        if (tlsContext.isServer()) {
            keyParameter2 = keyParameter;
            keyParameter = keyParameter2;
        }
        byte[] bArr = new byte[8];
        this.encryptCipher.init(true, new ParametersWithIV(keyParameter, bArr));
        this.decryptCipher.init(false, new ParametersWithIV(keyParameter2, bArr));
    }

    public byte[] calculateRecordMAC(KeyParameter keyParameter, byte[] bArr, byte[] bArr2, int i, int i2) {
        Poly1305 poly1305 = new Poly1305();
        poly1305.init(keyParameter);
        updateRecordMAC(poly1305, bArr, 0, bArr.length);
        updateRecordMAC(poly1305, bArr2, i, i2);
        byte[] bArr3 = new byte[poly1305.getMacSize()];
        poly1305.doFinal(bArr3, 0);
        return bArr3;
    }

    @Override // org.spongycastle.crypto.tls.TlsCipher
    public byte[] decodeCiphertext(long j, short s, byte[] bArr, int i, int i2) throws IOException {
        if (getPlaintextLimit(i2) < 0) {
            f1j0.m123577a(50);
            return null;
        }
        int i3 = i2 - 16;
        if (!Arrays.constantTimeAreEqual(calculateRecordMAC(initRecordMAC(this.decryptCipher, false, j), getAdditionalData(j, s, i3), bArr, i, i3), Arrays.copyOfRange(bArr, i + i3, i2 + i))) {
            f1j0.m123577a(20);
            return null;
        }
        byte[] bArr2 = new byte[i3];
        this.decryptCipher.processBytes(bArr, i, i3, bArr2, 0);
        return bArr2;
    }

    @Override // org.spongycastle.crypto.tls.TlsCipher
    public byte[] encodePlaintext(long j, short s, byte[] bArr, int i, int i2) throws IOException {
        KeyParameter keyParameterInitRecordMAC = initRecordMAC(this.encryptCipher, true, j);
        byte[] bArr2 = new byte[i2 + 16];
        this.encryptCipher.processBytes(bArr, i, i2, bArr2, 0);
        byte[] bArrCalculateRecordMAC = calculateRecordMAC(keyParameterInitRecordMAC, getAdditionalData(j, s, i2), bArr2, 0, i2);
        System.arraycopy(bArrCalculateRecordMAC, 0, bArr2, i2, bArrCalculateRecordMAC.length);
        return bArr2;
    }

    public byte[] getAdditionalData(long j, short s, int i) throws IOException {
        byte[] bArr = new byte[13];
        TlsUtils.writeUint64(j, bArr, 0);
        TlsUtils.writeUint8(s, bArr, 8);
        TlsUtils.writeVersion(this.context.getServerVersion(), bArr, 9);
        TlsUtils.writeUint16(i, bArr, 11);
        return bArr;
    }

    @Override // org.spongycastle.crypto.tls.TlsCipher
    public int getPlaintextLimit(int i) {
        return i - 16;
    }

    public KeyParameter initRecordMAC(ChaChaEngine chaChaEngine, boolean z, long j) {
        byte[] bArr = new byte[8];
        TlsUtils.writeUint64(j, bArr, 0);
        chaChaEngine.init(z, new ParametersWithIV(null, bArr));
        byte[] bArr2 = new byte[64];
        chaChaEngine.processBytes(bArr2, 0, 64, bArr2, 0);
        System.arraycopy(bArr2, 0, bArr2, 32, 16);
        KeyParameter keyParameter = new KeyParameter(bArr2, 16, 32);
        Poly1305KeyGenerator.clamp(keyParameter.getKey());
        return keyParameter;
    }

    public void updateRecordMAC(Mac mac, byte[] bArr, int i, int i2) {
        mac.update(bArr, i, i2);
        byte[] bArrLongToLittleEndian = Pack.longToLittleEndian(((long) i2) & 4294967295L);
        mac.update(bArrLongToLittleEndian, 0, bArrLongToLittleEndian.length);
    }
}
