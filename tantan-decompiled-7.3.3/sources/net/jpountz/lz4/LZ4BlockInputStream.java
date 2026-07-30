package net.jpountz.lz4;

import java.io.EOFException;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.Checksum;
import net.jpountz.util.SafeUtils;
import p153l.aqg0;
import p153l.emq0;
import p153l.zpg0;

/* JADX INFO: loaded from: classes2.dex */
public class LZ4BlockInputStream extends FilterInputStream {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private byte[] buffer;
    private final Checksum checksum;
    private byte[] compressedBuffer;
    private final LZ4FastDecompressor decompressor;
    private boolean finished;

    /* JADX INFO: renamed from: o */
    private int f206763o;
    private int originalLen;
    private final boolean stopOnEmptyBlock;

    public LZ4BlockInputStream(InputStream inputStream, LZ4FastDecompressor lZ4FastDecompressor, Checksum checksum, boolean z) {
        super(inputStream);
        this.decompressor = lZ4FastDecompressor;
        this.checksum = checksum;
        this.stopOnEmptyBlock = z;
        this.buffer = new byte[0];
        this.compressedBuffer = new byte[LZ4BlockOutputStream.HEADER_LENGTH];
        this.originalLen = 0;
        this.f206763o = 0;
        this.finished = false;
    }

    private void readFully(byte[] bArr, int i) throws IOException {
        if (!tryReadFully(bArr, i)) {
            throw new EOFException("Stream ended prematurely");
        }
    }

    private void refill() throws IOException {
        if (!tryReadFully(this.compressedBuffer, LZ4BlockOutputStream.HEADER_LENGTH)) {
            if (this.stopOnEmptyBlock) {
                throw new EOFException("Stream ended prematurely");
            }
            this.finished = true;
            return;
        }
        int i = 0;
        while (true) {
            int i2 = LZ4BlockOutputStream.MAGIC_LENGTH;
            byte[] bArr = this.compressedBuffer;
            if (i >= i2) {
                byte b = bArr[i2];
                int i3 = b & 240;
                int i4 = (b & 15) + 10;
                if (i3 != 16 && i3 != 32) {
                    zpg0.m220844a("Stream is corrupted");
                    return;
                }
                int intLE = SafeUtils.readIntLE(bArr, i2 + 1);
                this.originalLen = SafeUtils.readIntLE(this.compressedBuffer, i2 + 5);
                int intLE2 = SafeUtils.readIntLE(this.compressedBuffer, i2 + 9);
                int i5 = this.originalLen;
                if (i5 > (1 << i4) || i5 < 0 || intLE < 0 || ((i5 == 0 && intLE != 0) || ((i5 != 0 && intLE == 0) || (i3 == 16 && i5 != intLE)))) {
                    zpg0.m220844a("Stream is corrupted");
                    return;
                }
                if (i5 == 0 && intLE == 0) {
                    if (intLE2 != 0) {
                        zpg0.m220844a("Stream is corrupted");
                        return;
                    } else if (this.stopOnEmptyBlock) {
                        this.finished = true;
                        return;
                    } else {
                        refill();
                        return;
                    }
                }
                byte[] bArr2 = this.buffer;
                if (bArr2.length < i5) {
                    this.buffer = new byte[Math.max(i5, (bArr2.length * 3) / 2)];
                }
                if (i3 == 16) {
                    readFully(this.buffer, this.originalLen);
                } else {
                    if (i3 != 32) {
                        aqg0.m99478a();
                        return;
                    }
                    byte[] bArr3 = this.compressedBuffer;
                    if (bArr3.length < intLE) {
                        this.compressedBuffer = new byte[Math.max(intLE, (bArr3.length * 3) / 2)];
                    }
                    readFully(this.compressedBuffer, intLE);
                    try {
                        if (intLE != this.decompressor.decompress(this.compressedBuffer, 0, this.buffer, 0, this.originalLen)) {
                            throw new IOException("Stream is corrupted");
                        }
                    } catch (LZ4Exception e) {
                        throw new IOException("Stream is corrupted", e);
                    }
                }
                this.checksum.reset();
                this.checksum.update(this.buffer, 0, this.originalLen);
                if (((int) this.checksum.getValue()) == intLE2) {
                    this.f206763o = 0;
                    return;
                } else {
                    zpg0.m220844a("Stream is corrupted");
                    return;
                }
            }
            if (bArr[i] != LZ4BlockOutputStream.MAGIC[i]) {
                zpg0.m220844a("Stream is corrupted");
                return;
            }
            i++;
        }
    }

    private boolean tryReadFully(byte[] bArr, int i) throws IOException {
        int i2 = 0;
        while (i2 < i) {
            int i3 = ((FilterInputStream) this).in.read(bArr, i2, i - i2);
            if (i3 < 0) {
                return false;
            }
            i2 += i3;
        }
        return true;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int available() throws IOException {
        return this.originalLen - this.f206763o;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void mark(int i) {
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        SafeUtils.checkRange(bArr, i, i2);
        if (this.finished) {
            return -1;
        }
        if (this.f206763o == this.originalLen) {
            refill();
        }
        if (this.finished) {
            return -1;
        }
        int iMin = Math.min(i2, this.originalLen - this.f206763o);
        System.arraycopy(this.buffer, this.f206763o, bArr, i, iMin);
        this.f206763o += iMin;
        return iMin;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void reset() throws IOException {
        throw new IOException("mark/reset not supported");
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j) throws IOException {
        if (j <= 0 || this.finished) {
            return 0L;
        }
        if (this.f206763o == this.originalLen) {
            refill();
        }
        if (this.finished) {
            return 0L;
        }
        int iMin = (int) Math.min(j, this.originalLen - this.f206763o);
        this.f206763o += iMin;
        return iMin;
    }

    public String toString() {
        return getClass().getSimpleName() + "(in=" + ((FilterInputStream) this).in + ", decompressor=" + this.decompressor + ", checksum=" + this.checksum + ")";
    }

    public LZ4BlockInputStream(InputStream inputStream, LZ4FastDecompressor lZ4FastDecompressor, Checksum checksum) {
        this(inputStream, lZ4FastDecompressor, checksum, true);
    }

    public LZ4BlockInputStream(InputStream inputStream, LZ4FastDecompressor lZ4FastDecompressor) {
        emq0.m121374b().m121381g(-1756908916);
        throw null;
    }

    public LZ4BlockInputStream(InputStream inputStream, boolean z) {
        LZ4Factory.fastestInstance().fastDecompressor();
        emq0.m121374b().m121381g(-1756908916);
        throw null;
    }

    public LZ4BlockInputStream(InputStream inputStream) {
        this(inputStream, LZ4Factory.fastestInstance().fastDecompressor());
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        if (this.finished) {
            return -1;
        }
        if (this.f206763o == this.originalLen) {
            refill();
        }
        if (this.finished) {
            return -1;
        }
        byte[] bArr = this.buffer;
        int i = this.f206763o;
        this.f206763o = i + 1;
        return bArr[i] & 255;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }
}
