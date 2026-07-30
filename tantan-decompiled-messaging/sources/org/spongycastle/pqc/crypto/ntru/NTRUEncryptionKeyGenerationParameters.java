package org.spongycastle.pqc.crypto.ntru;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.SecureRandom;
import java.util.Arrays;
import org.spongycastle.crypto.Digest;
import org.spongycastle.crypto.KeyGenerationParameters;
import org.spongycastle.crypto.digests.SHA256Digest;
import org.spongycastle.crypto.digests.SHA512Digest;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: loaded from: classes3.dex */
public class NTRUEncryptionKeyGenerationParameters extends KeyGenerationParameters implements Cloneable {

    /* JADX INFO: renamed from: N */
    public int f206945N;
    public int bufferLenBits;
    int bufferLenTrits;

    /* JADX INFO: renamed from: c */
    public int f206946c;

    /* JADX INFO: renamed from: db */
    public int f206947db;

    /* JADX INFO: renamed from: df */
    public int f206948df;
    public int df1;
    public int df2;
    public int df3;

    /* JADX INFO: renamed from: dg */
    public int f206949dg;
    public int dm0;

    /* JADX INFO: renamed from: dr */
    public int f206950dr;
    public int dr1;
    public int dr2;
    public int dr3;
    public boolean fastFp;
    public Digest hashAlg;
    public boolean hashSeed;
    int llen;
    public int maxMsgLenBytes;
    public int minCallsMask;
    public int minCallsR;
    public byte[] oid;
    public int pkLen;
    public int polyType;

    /* JADX INFO: renamed from: q */
    public int f206951q;
    public boolean sparse;
    public static final NTRUEncryptionKeyGenerationParameters EES1087EP2 = new NTRUEncryptionKeyGenerationParameters(1087, 2048, 120, 120, 256, 13, 25, 14, true, new byte[]{0, 6, 3}, true, false, new SHA512Digest());
    public static final NTRUEncryptionKeyGenerationParameters EES1171EP1 = new NTRUEncryptionKeyGenerationParameters(1171, 2048, 106, 106, 256, 13, 20, 15, true, new byte[]{0, 6, 4}, true, false, new SHA512Digest());
    public static final NTRUEncryptionKeyGenerationParameters EES1499EP1 = new NTRUEncryptionKeyGenerationParameters(1499, 2048, 79, 79, 256, 13, 17, 19, true, new byte[]{0, 6, 5}, true, false, new SHA512Digest());
    public static final NTRUEncryptionKeyGenerationParameters APR2011_439 = new NTRUEncryptionKeyGenerationParameters(439, 2048, CipherSuite.TLS_RSA_PSK_WITH_RC4_128_SHA, 130, 128, 9, 32, 9, true, new byte[]{0, 7, 101}, true, false, new SHA256Digest());
    public static final NTRUEncryptionKeyGenerationParameters APR2011_439_FAST = new NTRUEncryptionKeyGenerationParameters(439, 2048, 9, 8, 5, 130, 128, 9, 32, 9, true, new byte[]{0, 7, 101}, true, true, new SHA256Digest());
    public static final NTRUEncryptionKeyGenerationParameters APR2011_743 = new NTRUEncryptionKeyGenerationParameters(743, 2048, 248, 220, 256, 10, 27, 14, true, new byte[]{0, 7, 105}, false, false, new SHA512Digest());
    public static final NTRUEncryptionKeyGenerationParameters APR2011_743_FAST = new NTRUEncryptionKeyGenerationParameters(743, 2048, 11, 11, 15, 220, 256, 10, 27, 14, true, new byte[]{0, 7, 105}, false, true, new SHA512Digest());

    public NTRUEncryptionKeyGenerationParameters(InputStream inputStream) throws IOException {
        super(new SecureRandom(), -1);
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        this.f206945N = dataInputStream.readInt();
        this.f206951q = dataInputStream.readInt();
        this.f206948df = dataInputStream.readInt();
        this.df1 = dataInputStream.readInt();
        this.df2 = dataInputStream.readInt();
        this.df3 = dataInputStream.readInt();
        this.f206947db = dataInputStream.readInt();
        this.dm0 = dataInputStream.readInt();
        this.f206946c = dataInputStream.readInt();
        this.minCallsR = dataInputStream.readInt();
        this.minCallsMask = dataInputStream.readInt();
        this.hashSeed = dataInputStream.readBoolean();
        byte[] bArr = new byte[3];
        this.oid = bArr;
        dataInputStream.read(bArr);
        this.sparse = dataInputStream.readBoolean();
        this.fastFp = dataInputStream.readBoolean();
        this.polyType = dataInputStream.read();
        String utf = dataInputStream.readUTF();
        if ("SHA-512".equals(utf)) {
            this.hashAlg = new SHA512Digest();
        } else if ("SHA-256".equals(utf)) {
            this.hashAlg = new SHA256Digest();
        }
        init();
    }

    private void init() {
        this.f206950dr = this.f206948df;
        this.dr1 = this.df1;
        this.dr2 = this.df2;
        this.dr3 = this.df3;
        int i = this.f206945N;
        this.f206949dg = i / 3;
        this.llen = 1;
        int i2 = this.f206947db;
        this.maxMsgLenBytes = (((((i * 3) / 2) / 8) - 1) - (i2 / 8)) - 1;
        this.bufferLenBits = (((((i * 3) / 2) + 7) / 8) * 8) + 1;
        this.bufferLenTrits = i - 1;
        this.pkLen = i2;
    }

    public NTRUEncryptionKeyGenerationParameters clone() {
        int i = this.polyType;
        int i2 = this.f206945N;
        return i == 0 ? new NTRUEncryptionKeyGenerationParameters(i2, this.f206951q, this.f206948df, this.dm0, this.f206947db, this.f206946c, this.minCallsR, this.minCallsMask, this.hashSeed, this.oid, this.sparse, this.fastFp, this.hashAlg) : new NTRUEncryptionKeyGenerationParameters(i2, this.f206951q, this.df1, this.df2, this.df3, this.dm0, this.f206947db, this.f206946c, this.minCallsR, this.minCallsMask, this.hashSeed, this.oid, this.sparse, this.fastFp, this.hashAlg);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        NTRUEncryptionKeyGenerationParameters nTRUEncryptionKeyGenerationParameters = (NTRUEncryptionKeyGenerationParameters) obj;
        if (this.f206945N != nTRUEncryptionKeyGenerationParameters.f206945N || this.bufferLenBits != nTRUEncryptionKeyGenerationParameters.bufferLenBits || this.bufferLenTrits != nTRUEncryptionKeyGenerationParameters.bufferLenTrits || this.f206946c != nTRUEncryptionKeyGenerationParameters.f206946c || this.f206947db != nTRUEncryptionKeyGenerationParameters.f206947db || this.f206948df != nTRUEncryptionKeyGenerationParameters.f206948df || this.df1 != nTRUEncryptionKeyGenerationParameters.df1 || this.df2 != nTRUEncryptionKeyGenerationParameters.df2 || this.df3 != nTRUEncryptionKeyGenerationParameters.df3 || this.f206949dg != nTRUEncryptionKeyGenerationParameters.f206949dg || this.dm0 != nTRUEncryptionKeyGenerationParameters.dm0 || this.f206950dr != nTRUEncryptionKeyGenerationParameters.f206950dr || this.dr1 != nTRUEncryptionKeyGenerationParameters.dr1 || this.dr2 != nTRUEncryptionKeyGenerationParameters.dr2 || this.dr3 != nTRUEncryptionKeyGenerationParameters.dr3 || this.fastFp != nTRUEncryptionKeyGenerationParameters.fastFp) {
            return false;
        }
        Digest digest = this.hashAlg;
        if (digest == null) {
            if (nTRUEncryptionKeyGenerationParameters.hashAlg != null) {
                return false;
            }
        } else if (!digest.getAlgorithmName().equals(nTRUEncryptionKeyGenerationParameters.hashAlg.getAlgorithmName())) {
            return false;
        }
        return this.hashSeed == nTRUEncryptionKeyGenerationParameters.hashSeed && this.llen == nTRUEncryptionKeyGenerationParameters.llen && this.maxMsgLenBytes == nTRUEncryptionKeyGenerationParameters.maxMsgLenBytes && this.minCallsMask == nTRUEncryptionKeyGenerationParameters.minCallsMask && this.minCallsR == nTRUEncryptionKeyGenerationParameters.minCallsR && Arrays.equals(this.oid, nTRUEncryptionKeyGenerationParameters.oid) && this.pkLen == nTRUEncryptionKeyGenerationParameters.pkLen && this.polyType == nTRUEncryptionKeyGenerationParameters.polyType && this.f206951q == nTRUEncryptionKeyGenerationParameters.f206951q && this.sparse == nTRUEncryptionKeyGenerationParameters.sparse;
    }

    public NTRUEncryptionParameters getEncryptionParameters() {
        int i = this.polyType;
        int i2 = this.f206945N;
        return i == 0 ? new NTRUEncryptionParameters(i2, this.f206951q, this.f206948df, this.dm0, this.f206947db, this.f206946c, this.minCallsR, this.minCallsMask, this.hashSeed, this.oid, this.sparse, this.fastFp, this.hashAlg) : new NTRUEncryptionParameters(i2, this.f206951q, this.df1, this.df2, this.df3, this.dm0, this.f206947db, this.f206946c, this.minCallsR, this.minCallsMask, this.hashSeed, this.oid, this.sparse, this.fastFp, this.hashAlg);
    }

    public int getMaxMessageLength() {
        return this.maxMsgLenBytes;
    }

    public int hashCode() {
        int i = (((((((((((((((((((((((((((((((this.f206945N + 31) * 31) + this.bufferLenBits) * 31) + this.bufferLenTrits) * 31) + this.f206946c) * 31) + this.f206947db) * 31) + this.f206948df) * 31) + this.df1) * 31) + this.df2) * 31) + this.df3) * 31) + this.f206949dg) * 31) + this.dm0) * 31) + this.f206950dr) * 31) + this.dr1) * 31) + this.dr2) * 31) + this.dr3) * 31) + (this.fastFp ? 1231 : 1237)) * 31;
        Digest digest = this.hashAlg;
        return ((((((((((((((((((((i + (digest == null ? 0 : digest.getAlgorithmName().hashCode())) * 31) + (this.hashSeed ? 1231 : 1237)) * 31) + this.llen) * 31) + this.maxMsgLenBytes) * 31) + this.minCallsMask) * 31) + this.minCallsR) * 31) + Arrays.hashCode(this.oid)) * 31) + this.pkLen) * 31) + this.polyType) * 31) + this.f206951q) * 31) + (this.sparse ? 1231 : 1237);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("EncryptionParameters(N=" + this.f206945N + " q=" + this.f206951q);
        if (this.polyType == 0) {
            sb.append(" polyType=SIMPLE df=" + this.f206948df);
        } else {
            sb.append(" polyType=PRODUCT df1=" + this.df1 + " df2=" + this.df2 + " df3=" + this.df3);
        }
        sb.append(" dm0=" + this.dm0 + " db=" + this.f206947db + " c=" + this.f206946c + " minCallsR=" + this.minCallsR + " minCallsMask=" + this.minCallsMask + " hashSeed=" + this.hashSeed + " hashAlg=" + this.hashAlg + " oid=" + Arrays.toString(this.oid) + " sparse=" + this.sparse + ")");
        return sb.toString();
    }

    public void writeTo(OutputStream outputStream) throws IOException {
        DataOutputStream dataOutputStream = new DataOutputStream(outputStream);
        dataOutputStream.writeInt(this.f206945N);
        dataOutputStream.writeInt(this.f206951q);
        dataOutputStream.writeInt(this.f206948df);
        dataOutputStream.writeInt(this.df1);
        dataOutputStream.writeInt(this.df2);
        dataOutputStream.writeInt(this.df3);
        dataOutputStream.writeInt(this.f206947db);
        dataOutputStream.writeInt(this.dm0);
        dataOutputStream.writeInt(this.f206946c);
        dataOutputStream.writeInt(this.minCallsR);
        dataOutputStream.writeInt(this.minCallsMask);
        dataOutputStream.writeBoolean(this.hashSeed);
        dataOutputStream.write(this.oid);
        dataOutputStream.writeBoolean(this.sparse);
        dataOutputStream.writeBoolean(this.fastFp);
        dataOutputStream.write(this.polyType);
        dataOutputStream.writeUTF(this.hashAlg.getAlgorithmName());
    }

    public NTRUEncryptionKeyGenerationParameters(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, boolean z, byte[] bArr, boolean z2, boolean z3, Digest digest) {
        super(new SecureRandom(), i7);
        this.f206945N = i;
        this.f206951q = i2;
        this.df1 = i3;
        this.df2 = i4;
        this.df3 = i5;
        this.f206947db = i7;
        this.dm0 = i6;
        this.f206946c = i8;
        this.minCallsR = i9;
        this.minCallsMask = i10;
        this.hashSeed = z;
        this.oid = bArr;
        this.sparse = z2;
        this.fastFp = z3;
        this.polyType = 1;
        this.hashAlg = digest;
        init();
    }

    public NTRUEncryptionKeyGenerationParameters(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z, byte[] bArr, boolean z2, boolean z3, Digest digest) {
        super(new SecureRandom(), i5);
        this.f206945N = i;
        this.f206951q = i2;
        this.f206948df = i3;
        this.f206947db = i5;
        this.dm0 = i4;
        this.f206946c = i6;
        this.minCallsR = i7;
        this.minCallsMask = i8;
        this.hashSeed = z;
        this.oid = bArr;
        this.sparse = z2;
        this.fastFp = z3;
        this.polyType = 0;
        this.hashAlg = digest;
        init();
    }
}
