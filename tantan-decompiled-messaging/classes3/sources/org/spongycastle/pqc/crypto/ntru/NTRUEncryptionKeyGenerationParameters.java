package org.spongycastle.pqc.crypto.ntru;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.SecureRandom;
import java.util.Arrays;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import org.spongycastle.asn1.eac.EACTags;
import org.spongycastle.crypto.Digest;
import org.spongycastle.crypto.KeyGenerationParameters;
import org.spongycastle.crypto.digests.SHA256Digest;
import org.spongycastle.crypto.digests.SHA512Digest;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class NTRUEncryptionKeyGenerationParameters extends KeyGenerationParameters implements Cloneable {

    /* JADX INFO: renamed from: N */
    public int f10570N;
    public int bufferLenBits;
    int bufferLenTrits;

    /* JADX INFO: renamed from: c */
    public int f10571c;

    /* JADX INFO: renamed from: db */
    public int f10572db;

    /* JADX INFO: renamed from: df */
    public int f10573df;
    public int df1;
    public int df2;
    public int df3;

    /* JADX INFO: renamed from: dg */
    public int f10574dg;
    public int dm0;

    /* JADX INFO: renamed from: dr */
    public int f10575dr;
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
    public int f10576q;
    public boolean sparse;
    public static final NTRUEncryptionKeyGenerationParameters EES1087EP2 = new NTRUEncryptionKeyGenerationParameters(1087, PKIFailureInfo.wrongIntegrity, EACTags.COMPATIBLE_TAG_ALLOCATION_AUTHORITY, EACTags.COMPATIBLE_TAG_ALLOCATION_AUTHORITY, 256, 13, 25, 14, true, new byte[]{0, 6, 3}, true, false, new SHA512Digest());
    public static final NTRUEncryptionKeyGenerationParameters EES1171EP1 = new NTRUEncryptionKeyGenerationParameters(1171, PKIFailureInfo.wrongIntegrity, 106, 106, 256, 13, 20, 15, true, new byte[]{0, 6, 4}, true, false, new SHA512Digest());
    public static final NTRUEncryptionKeyGenerationParameters EES1499EP1 = new NTRUEncryptionKeyGenerationParameters(1499, PKIFailureInfo.wrongIntegrity, 79, 79, 256, 13, 17, 19, true, new byte[]{0, 6, 5}, true, false, new SHA512Digest());
    public static final NTRUEncryptionKeyGenerationParameters APR2011_439 = new NTRUEncryptionKeyGenerationParameters(439, PKIFailureInfo.wrongIntegrity, CipherSuite.TLS_RSA_PSK_WITH_RC4_128_SHA, 130, 128, 9, 32, 9, true, new byte[]{0, 7, 101}, true, false, new SHA256Digest());
    public static final NTRUEncryptionKeyGenerationParameters APR2011_439_FAST = new NTRUEncryptionKeyGenerationParameters(439, PKIFailureInfo.wrongIntegrity, 9, 8, 5, 130, 128, 9, 32, 9, true, new byte[]{0, 7, 101}, true, true, new SHA256Digest());
    public static final NTRUEncryptionKeyGenerationParameters APR2011_743 = new NTRUEncryptionKeyGenerationParameters(743, PKIFailureInfo.wrongIntegrity, 248, 220, 256, 10, 27, 14, true, new byte[]{0, 7, 105}, false, false, new SHA512Digest());
    public static final NTRUEncryptionKeyGenerationParameters APR2011_743_FAST = new NTRUEncryptionKeyGenerationParameters(743, PKIFailureInfo.wrongIntegrity, 11, 11, 15, 220, 256, 10, 27, 14, true, new byte[]{0, 7, 105}, false, true, new SHA512Digest());

    public NTRUEncryptionKeyGenerationParameters(InputStream inputStream) throws IOException {
        super(new SecureRandom(), -1);
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        this.f10570N = dataInputStream.readInt();
        this.f10576q = dataInputStream.readInt();
        this.f10573df = dataInputStream.readInt();
        this.df1 = dataInputStream.readInt();
        this.df2 = dataInputStream.readInt();
        this.df3 = dataInputStream.readInt();
        this.f10572db = dataInputStream.readInt();
        this.dm0 = dataInputStream.readInt();
        this.f10571c = dataInputStream.readInt();
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
        this.f10575dr = this.f10573df;
        this.dr1 = this.df1;
        this.dr2 = this.df2;
        this.dr3 = this.df3;
        int i = this.f10570N;
        this.f10574dg = i / 3;
        this.llen = 1;
        int i2 = this.f10572db;
        this.maxMsgLenBytes = (((((i * 3) / 2) / 8) - 1) - (i2 / 8)) - 1;
        this.bufferLenBits = (((((i * 3) / 2) + 7) / 8) * 8) + 1;
        this.bufferLenTrits = i - 1;
        this.pkLen = i2;
    }

    public NTRUEncryptionKeyGenerationParameters clone() {
        int i = this.polyType;
        int i2 = this.f10570N;
        return i == 0 ? new NTRUEncryptionKeyGenerationParameters(i2, this.f10576q, this.f10573df, this.dm0, this.f10572db, this.f10571c, this.minCallsR, this.minCallsMask, this.hashSeed, this.oid, this.sparse, this.fastFp, this.hashAlg) : new NTRUEncryptionKeyGenerationParameters(i2, this.f10576q, this.df1, this.df2, this.df3, this.dm0, this.f10572db, this.f10571c, this.minCallsR, this.minCallsMask, this.hashSeed, this.oid, this.sparse, this.fastFp, this.hashAlg);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        NTRUEncryptionKeyGenerationParameters nTRUEncryptionKeyGenerationParameters = (NTRUEncryptionKeyGenerationParameters) obj;
        if (this.f10570N != nTRUEncryptionKeyGenerationParameters.f10570N || this.bufferLenBits != nTRUEncryptionKeyGenerationParameters.bufferLenBits || this.bufferLenTrits != nTRUEncryptionKeyGenerationParameters.bufferLenTrits || this.f10571c != nTRUEncryptionKeyGenerationParameters.f10571c || this.f10572db != nTRUEncryptionKeyGenerationParameters.f10572db || this.f10573df != nTRUEncryptionKeyGenerationParameters.f10573df || this.df1 != nTRUEncryptionKeyGenerationParameters.df1 || this.df2 != nTRUEncryptionKeyGenerationParameters.df2 || this.df3 != nTRUEncryptionKeyGenerationParameters.df3 || this.f10574dg != nTRUEncryptionKeyGenerationParameters.f10574dg || this.dm0 != nTRUEncryptionKeyGenerationParameters.dm0 || this.f10575dr != nTRUEncryptionKeyGenerationParameters.f10575dr || this.dr1 != nTRUEncryptionKeyGenerationParameters.dr1 || this.dr2 != nTRUEncryptionKeyGenerationParameters.dr2 || this.dr3 != nTRUEncryptionKeyGenerationParameters.dr3 || this.fastFp != nTRUEncryptionKeyGenerationParameters.fastFp) {
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
        return this.hashSeed == nTRUEncryptionKeyGenerationParameters.hashSeed && this.llen == nTRUEncryptionKeyGenerationParameters.llen && this.maxMsgLenBytes == nTRUEncryptionKeyGenerationParameters.maxMsgLenBytes && this.minCallsMask == nTRUEncryptionKeyGenerationParameters.minCallsMask && this.minCallsR == nTRUEncryptionKeyGenerationParameters.minCallsR && Arrays.equals(this.oid, nTRUEncryptionKeyGenerationParameters.oid) && this.pkLen == nTRUEncryptionKeyGenerationParameters.pkLen && this.polyType == nTRUEncryptionKeyGenerationParameters.polyType && this.f10576q == nTRUEncryptionKeyGenerationParameters.f10576q && this.sparse == nTRUEncryptionKeyGenerationParameters.sparse;
    }

    public NTRUEncryptionParameters getEncryptionParameters() {
        int i = this.polyType;
        int i2 = this.f10570N;
        return i == 0 ? new NTRUEncryptionParameters(i2, this.f10576q, this.f10573df, this.dm0, this.f10572db, this.f10571c, this.minCallsR, this.minCallsMask, this.hashSeed, this.oid, this.sparse, this.fastFp, this.hashAlg) : new NTRUEncryptionParameters(i2, this.f10576q, this.df1, this.df2, this.df3, this.dm0, this.f10572db, this.f10571c, this.minCallsR, this.minCallsMask, this.hashSeed, this.oid, this.sparse, this.fastFp, this.hashAlg);
    }

    public int getMaxMessageLength() {
        return this.maxMsgLenBytes;
    }

    public int hashCode() {
        int i = (((((((((((((((((((((((((((((((this.f10570N + 31) * 31) + this.bufferLenBits) * 31) + this.bufferLenTrits) * 31) + this.f10571c) * 31) + this.f10572db) * 31) + this.f10573df) * 31) + this.df1) * 31) + this.df2) * 31) + this.df3) * 31) + this.f10574dg) * 31) + this.dm0) * 31) + this.f10575dr) * 31) + this.dr1) * 31) + this.dr2) * 31) + this.dr3) * 31) + (this.fastFp ? 1231 : 1237)) * 31;
        Digest digest = this.hashAlg;
        return ((((((((((((((((((((i + (digest == null ? 0 : digest.getAlgorithmName().hashCode())) * 31) + (this.hashSeed ? 1231 : 1237)) * 31) + this.llen) * 31) + this.maxMsgLenBytes) * 31) + this.minCallsMask) * 31) + this.minCallsR) * 31) + Arrays.hashCode(this.oid)) * 31) + this.pkLen) * 31) + this.polyType) * 31) + this.f10576q) * 31) + (this.sparse ? 1231 : 1237);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("EncryptionParameters(N=" + this.f10570N + " q=" + this.f10576q);
        if (this.polyType == 0) {
            sb.append(" polyType=SIMPLE df=" + this.f10573df);
        } else {
            sb.append(" polyType=PRODUCT df1=" + this.df1 + " df2=" + this.df2 + " df3=" + this.df3);
        }
        sb.append(" dm0=" + this.dm0 + " db=" + this.f10572db + " c=" + this.f10571c + " minCallsR=" + this.minCallsR + " minCallsMask=" + this.minCallsMask + " hashSeed=" + this.hashSeed + " hashAlg=" + this.hashAlg + " oid=" + Arrays.toString(this.oid) + " sparse=" + this.sparse + ")");
        return sb.toString();
    }

    public void writeTo(OutputStream outputStream) throws IOException {
        DataOutputStream dataOutputStream = new DataOutputStream(outputStream);
        dataOutputStream.writeInt(this.f10570N);
        dataOutputStream.writeInt(this.f10576q);
        dataOutputStream.writeInt(this.f10573df);
        dataOutputStream.writeInt(this.df1);
        dataOutputStream.writeInt(this.df2);
        dataOutputStream.writeInt(this.df3);
        dataOutputStream.writeInt(this.f10572db);
        dataOutputStream.writeInt(this.dm0);
        dataOutputStream.writeInt(this.f10571c);
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
        this.f10570N = i;
        this.f10576q = i2;
        this.df1 = i3;
        this.df2 = i4;
        this.df3 = i5;
        this.f10572db = i7;
        this.dm0 = i6;
        this.f10571c = i8;
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
        this.f10570N = i;
        this.f10576q = i2;
        this.f10573df = i3;
        this.f10572db = i5;
        this.dm0 = i4;
        this.f10571c = i6;
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
