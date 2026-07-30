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

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class NTRUEncryptionParameters implements Cloneable {

    /* JADX INFO: renamed from: N */
    public int f10577N;
    public int bufferLenBits;
    int bufferLenTrits;

    /* JADX INFO: renamed from: c */
    public int f10578c;

    /* JADX INFO: renamed from: db */
    public int f10579db;

    /* JADX INFO: renamed from: df */
    public int f10580df;
    public int df1;
    public int df2;
    public int df3;

    /* JADX INFO: renamed from: dg */
    public int f10581dg;
    public int dm0;

    /* JADX INFO: renamed from: dr */
    public int f10582dr;
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
    public int f10583q;
    public boolean sparse;

    public NTRUEncryptionParameters(InputStream inputStream) throws IOException {
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        this.f10577N = dataInputStream.readInt();
        this.f10583q = dataInputStream.readInt();
        this.f10580df = dataInputStream.readInt();
        this.df1 = dataInputStream.readInt();
        this.df2 = dataInputStream.readInt();
        this.df3 = dataInputStream.readInt();
        this.f10579db = dataInputStream.readInt();
        this.dm0 = dataInputStream.readInt();
        this.f10578c = dataInputStream.readInt();
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
        this.f10582dr = this.f10580df;
        this.dr1 = this.df1;
        this.dr2 = this.df2;
        this.dr3 = this.df3;
        int i = this.f10577N;
        this.f10581dg = i / 3;
        this.llen = 1;
        int i2 = this.f10579db;
        this.maxMsgLenBytes = (((((i * 3) / 2) / 8) - 1) - (i2 / 8)) - 1;
        this.bufferLenBits = (((((i * 3) / 2) + 7) / 8) * 8) + 1;
        this.bufferLenTrits = i - 1;
        this.pkLen = i2;
    }

    public NTRUEncryptionParameters clone() {
        int i = this.polyType;
        int i2 = this.f10577N;
        return i == 0 ? new NTRUEncryptionParameters(i2, this.f10583q, this.f10580df, this.dm0, this.f10579db, this.f10578c, this.minCallsR, this.minCallsMask, this.hashSeed, this.oid, this.sparse, this.fastFp, this.hashAlg) : new NTRUEncryptionParameters(i2, this.f10583q, this.df1, this.df2, this.df3, this.dm0, this.f10579db, this.f10578c, this.minCallsR, this.minCallsMask, this.hashSeed, this.oid, this.sparse, this.fastFp, this.hashAlg);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        NTRUEncryptionParameters nTRUEncryptionParameters = (NTRUEncryptionParameters) obj;
        if (this.f10577N != nTRUEncryptionParameters.f10577N || this.bufferLenBits != nTRUEncryptionParameters.bufferLenBits || this.bufferLenTrits != nTRUEncryptionParameters.bufferLenTrits || this.f10578c != nTRUEncryptionParameters.f10578c || this.f10579db != nTRUEncryptionParameters.f10579db || this.f10580df != nTRUEncryptionParameters.f10580df || this.df1 != nTRUEncryptionParameters.df1 || this.df2 != nTRUEncryptionParameters.df2 || this.df3 != nTRUEncryptionParameters.df3 || this.f10581dg != nTRUEncryptionParameters.f10581dg || this.dm0 != nTRUEncryptionParameters.dm0 || this.f10582dr != nTRUEncryptionParameters.f10582dr || this.dr1 != nTRUEncryptionParameters.dr1 || this.dr2 != nTRUEncryptionParameters.dr2 || this.dr3 != nTRUEncryptionParameters.dr3 || this.fastFp != nTRUEncryptionParameters.fastFp) {
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
        return this.hashSeed == nTRUEncryptionParameters.hashSeed && this.llen == nTRUEncryptionParameters.llen && this.maxMsgLenBytes == nTRUEncryptionParameters.maxMsgLenBytes && this.minCallsMask == nTRUEncryptionParameters.minCallsMask && this.minCallsR == nTRUEncryptionParameters.minCallsR && Arrays.equals(this.oid, nTRUEncryptionParameters.oid) && this.pkLen == nTRUEncryptionParameters.pkLen && this.polyType == nTRUEncryptionParameters.polyType && this.f10583q == nTRUEncryptionParameters.f10583q && this.sparse == nTRUEncryptionParameters.sparse;
    }

    public int getMaxMessageLength() {
        return this.maxMsgLenBytes;
    }

    public int hashCode() {
        int i = (((((((((((((((((((((((((((((((this.f10577N + 31) * 31) + this.bufferLenBits) * 31) + this.bufferLenTrits) * 31) + this.f10578c) * 31) + this.f10579db) * 31) + this.f10580df) * 31) + this.df1) * 31) + this.df2) * 31) + this.df3) * 31) + this.f10581dg) * 31) + this.dm0) * 31) + this.f10582dr) * 31) + this.dr1) * 31) + this.dr2) * 31) + this.dr3) * 31) + (this.fastFp ? 1231 : 1237)) * 31;
        Digest digest = this.hashAlg;
        return ((((((((((((((((((((i + (digest == null ? 0 : digest.getAlgorithmName().hashCode())) * 31) + (this.hashSeed ? 1231 : 1237)) * 31) + this.llen) * 31) + this.maxMsgLenBytes) * 31) + this.minCallsMask) * 31) + this.minCallsR) * 31) + Arrays.hashCode(this.oid)) * 31) + this.pkLen) * 31) + this.polyType) * 31) + this.f10583q) * 31) + (this.sparse ? 1231 : 1237);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("EncryptionParameters(N=" + this.f10577N + " q=" + this.f10583q);
        if (this.polyType == 0) {
            sb.append(" polyType=SIMPLE df=" + this.f10580df);
        } else {
            sb.append(" polyType=PRODUCT df1=" + this.df1 + " df2=" + this.df2 + " df3=" + this.df3);
        }
        sb.append(" dm0=" + this.dm0 + " db=" + this.f10579db + " c=" + this.f10578c + " minCallsR=" + this.minCallsR + " minCallsMask=" + this.minCallsMask + " hashSeed=" + this.hashSeed + " hashAlg=" + this.hashAlg + " oid=" + Arrays.toString(this.oid) + " sparse=" + this.sparse + ")");
        return sb.toString();
    }

    public void writeTo(OutputStream outputStream) throws IOException {
        DataOutputStream dataOutputStream = new DataOutputStream(outputStream);
        dataOutputStream.writeInt(this.f10577N);
        dataOutputStream.writeInt(this.f10583q);
        dataOutputStream.writeInt(this.f10580df);
        dataOutputStream.writeInt(this.df1);
        dataOutputStream.writeInt(this.df2);
        dataOutputStream.writeInt(this.df3);
        dataOutputStream.writeInt(this.f10579db);
        dataOutputStream.writeInt(this.dm0);
        dataOutputStream.writeInt(this.f10578c);
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
        this.f10577N = i;
        this.f10583q = i2;
        this.df1 = i3;
        this.df2 = i4;
        this.df3 = i5;
        this.f10579db = i7;
        this.dm0 = i6;
        this.f10578c = i8;
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
        this.f10577N = i;
        this.f10583q = i2;
        this.f10580df = i3;
        this.f10579db = i5;
        this.dm0 = i4;
        this.f10578c = i6;
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
