package org.spongycastle.pqc.crypto.ntru;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;
import org.spongycastle.crypto.Digest;
import org.spongycastle.crypto.digests.SHA256Digest;
import org.spongycastle.crypto.digests.SHA512Digest;

/* JADX INFO: loaded from: classes3.dex */
public class NTRUEncryptionParameters implements Cloneable {

    /* JADX INFO: renamed from: N */
    public int f206952N;
    public int bufferLenBits;
    int bufferLenTrits;

    /* JADX INFO: renamed from: c */
    public int f206953c;

    /* JADX INFO: renamed from: db */
    public int f206954db;

    /* JADX INFO: renamed from: df */
    public int f206955df;
    public int df1;
    public int df2;
    public int df3;

    /* JADX INFO: renamed from: dg */
    public int f206956dg;
    public int dm0;

    /* JADX INFO: renamed from: dr */
    public int f206957dr;
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
    public int f206958q;
    public boolean sparse;

    public NTRUEncryptionParameters(InputStream inputStream) throws IOException {
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        this.f206952N = dataInputStream.readInt();
        this.f206958q = dataInputStream.readInt();
        this.f206955df = dataInputStream.readInt();
        this.df1 = dataInputStream.readInt();
        this.df2 = dataInputStream.readInt();
        this.df3 = dataInputStream.readInt();
        this.f206954db = dataInputStream.readInt();
        this.dm0 = dataInputStream.readInt();
        this.f206953c = dataInputStream.readInt();
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
        this.f206957dr = this.f206955df;
        this.dr1 = this.df1;
        this.dr2 = this.df2;
        this.dr3 = this.df3;
        int i = this.f206952N;
        this.f206956dg = i / 3;
        this.llen = 1;
        int i2 = this.f206954db;
        this.maxMsgLenBytes = (((((i * 3) / 2) / 8) - 1) - (i2 / 8)) - 1;
        this.bufferLenBits = (((((i * 3) / 2) + 7) / 8) * 8) + 1;
        this.bufferLenTrits = i - 1;
        this.pkLen = i2;
    }

    public NTRUEncryptionParameters clone() {
        int i = this.polyType;
        int i2 = this.f206952N;
        return i == 0 ? new NTRUEncryptionParameters(i2, this.f206958q, this.f206955df, this.dm0, this.f206954db, this.f206953c, this.minCallsR, this.minCallsMask, this.hashSeed, this.oid, this.sparse, this.fastFp, this.hashAlg) : new NTRUEncryptionParameters(i2, this.f206958q, this.df1, this.df2, this.df3, this.dm0, this.f206954db, this.f206953c, this.minCallsR, this.minCallsMask, this.hashSeed, this.oid, this.sparse, this.fastFp, this.hashAlg);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        NTRUEncryptionParameters nTRUEncryptionParameters = (NTRUEncryptionParameters) obj;
        if (this.f206952N != nTRUEncryptionParameters.f206952N || this.bufferLenBits != nTRUEncryptionParameters.bufferLenBits || this.bufferLenTrits != nTRUEncryptionParameters.bufferLenTrits || this.f206953c != nTRUEncryptionParameters.f206953c || this.f206954db != nTRUEncryptionParameters.f206954db || this.f206955df != nTRUEncryptionParameters.f206955df || this.df1 != nTRUEncryptionParameters.df1 || this.df2 != nTRUEncryptionParameters.df2 || this.df3 != nTRUEncryptionParameters.df3 || this.f206956dg != nTRUEncryptionParameters.f206956dg || this.dm0 != nTRUEncryptionParameters.dm0 || this.f206957dr != nTRUEncryptionParameters.f206957dr || this.dr1 != nTRUEncryptionParameters.dr1 || this.dr2 != nTRUEncryptionParameters.dr2 || this.dr3 != nTRUEncryptionParameters.dr3 || this.fastFp != nTRUEncryptionParameters.fastFp) {
            return false;
        }
        Digest digest = this.hashAlg;
        if (digest == null) {
            if (nTRUEncryptionParameters.hashAlg != null) {
                return false;
            }
        } else if (!digest.getAlgorithmName().equals(nTRUEncryptionParameters.hashAlg.getAlgorithmName())) {
            return false;
        }
        return this.hashSeed == nTRUEncryptionParameters.hashSeed && this.llen == nTRUEncryptionParameters.llen && this.maxMsgLenBytes == nTRUEncryptionParameters.maxMsgLenBytes && this.minCallsMask == nTRUEncryptionParameters.minCallsMask && this.minCallsR == nTRUEncryptionParameters.minCallsR && Arrays.equals(this.oid, nTRUEncryptionParameters.oid) && this.pkLen == nTRUEncryptionParameters.pkLen && this.polyType == nTRUEncryptionParameters.polyType && this.f206958q == nTRUEncryptionParameters.f206958q && this.sparse == nTRUEncryptionParameters.sparse;
    }

    public int getMaxMessageLength() {
        return this.maxMsgLenBytes;
    }

    public int hashCode() {
        int i = (((((((((((((((((((((((((((((((this.f206952N + 31) * 31) + this.bufferLenBits) * 31) + this.bufferLenTrits) * 31) + this.f206953c) * 31) + this.f206954db) * 31) + this.f206955df) * 31) + this.df1) * 31) + this.df2) * 31) + this.df3) * 31) + this.f206956dg) * 31) + this.dm0) * 31) + this.f206957dr) * 31) + this.dr1) * 31) + this.dr2) * 31) + this.dr3) * 31) + (this.fastFp ? 1231 : 1237)) * 31;
        Digest digest = this.hashAlg;
        return ((((((((((((((((((((i + (digest == null ? 0 : digest.getAlgorithmName().hashCode())) * 31) + (this.hashSeed ? 1231 : 1237)) * 31) + this.llen) * 31) + this.maxMsgLenBytes) * 31) + this.minCallsMask) * 31) + this.minCallsR) * 31) + Arrays.hashCode(this.oid)) * 31) + this.pkLen) * 31) + this.polyType) * 31) + this.f206958q) * 31) + (this.sparse ? 1231 : 1237);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("EncryptionParameters(N=" + this.f206952N + " q=" + this.f206958q);
        if (this.polyType == 0) {
            sb.append(" polyType=SIMPLE df=" + this.f206955df);
        } else {
            sb.append(" polyType=PRODUCT df1=" + this.df1 + " df2=" + this.df2 + " df3=" + this.df3);
        }
        sb.append(" dm0=" + this.dm0 + " db=" + this.f206954db + " c=" + this.f206953c + " minCallsR=" + this.minCallsR + " minCallsMask=" + this.minCallsMask + " hashSeed=" + this.hashSeed + " hashAlg=" + this.hashAlg + " oid=" + Arrays.toString(this.oid) + " sparse=" + this.sparse + ")");
        return sb.toString();
    }

    public void writeTo(OutputStream outputStream) throws IOException {
        DataOutputStream dataOutputStream = new DataOutputStream(outputStream);
        dataOutputStream.writeInt(this.f206952N);
        dataOutputStream.writeInt(this.f206958q);
        dataOutputStream.writeInt(this.f206955df);
        dataOutputStream.writeInt(this.df1);
        dataOutputStream.writeInt(this.df2);
        dataOutputStream.writeInt(this.df3);
        dataOutputStream.writeInt(this.f206954db);
        dataOutputStream.writeInt(this.dm0);
        dataOutputStream.writeInt(this.f206953c);
        dataOutputStream.writeInt(this.minCallsR);
        dataOutputStream.writeInt(this.minCallsMask);
        dataOutputStream.writeBoolean(this.hashSeed);
        dataOutputStream.write(this.oid);
        dataOutputStream.writeBoolean(this.sparse);
        dataOutputStream.writeBoolean(this.fastFp);
        dataOutputStream.write(this.polyType);
        dataOutputStream.writeUTF(this.hashAlg.getAlgorithmName());
    }

    public NTRUEncryptionParameters(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, boolean z, byte[] bArr, boolean z2, boolean z3, Digest digest) {
        this.f206952N = i;
        this.f206958q = i2;
        this.df1 = i3;
        this.df2 = i4;
        this.df3 = i5;
        this.f206954db = i7;
        this.dm0 = i6;
        this.f206953c = i8;
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

    public NTRUEncryptionParameters(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z, byte[] bArr, boolean z2, boolean z3, Digest digest) {
        this.f206952N = i;
        this.f206958q = i2;
        this.f206955df = i3;
        this.f206954db = i5;
        this.dm0 = i4;
        this.f206953c = i6;
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
