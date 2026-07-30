package org.apache.commons.sudcompress.compressors.lzw;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteOrder;
import p149l.ctq0;
import p149l.ig3;
import p149l.rhg0;
import p149l.vig0;
import p149l.yag0;

/* JADX INFO: loaded from: classes2.dex */
public abstract class Suddo extends yag0 {
    protected static final int DEFAULT_CODE_SIZE = 9;
    protected static final int UNUSED_PREFIX = -1;
    private byte[] characters;
    private int clearCode;
    private int codeSize;

    /* JADX INFO: renamed from: in */
    protected final vig0 f205875in;
    private final byte[] oneByte;
    private byte[] outputStack;
    private int outputStackLocation;
    private int[] prefixes;
    private int previousCode;
    private byte previousCodeFirstChar;
    private int tableSize;

    public Suddo(InputStream inputStream) {
        ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
        this.oneByte = new byte[1];
        this.clearCode = -1;
        this.codeSize = 9;
        this.previousCode = -1;
        this.f205875in = new vig0(inputStream, byteOrder);
    }

    public abstract int addEntry(int i, byte b);

    public int addEntry(int i, byte b, int i2) {
        int i3 = this.tableSize;
        if (i3 >= i2) {
            return -1;
        }
        this.prefixes[i3] = i;
        this.characters[i3] = b;
        this.tableSize = i3 + 1;
        return i3;
    }

    public int addRepeatOfPreviousCode() throws IOException {
        int i = this.previousCode;
        if (i != -1) {
            return addEntry(i, this.previousCodeFirstChar);
        }
        rhg0.m179353a("The first code can't be a reference to its preceding code");
        return 0;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f205875in.close();
    }

    public abstract int decompressNextSymbol();

    public int expandCodeToOutputStack(int i, boolean z) {
        int i2 = i;
        while (i2 >= 0) {
            byte[] bArr = this.outputStack;
            int i3 = this.outputStackLocation - 1;
            this.outputStackLocation = i3;
            bArr[i3] = this.characters[i2];
            i2 = this.prefixes[i2];
        }
        int i4 = this.previousCode;
        if (i4 != -1 && !z) {
            addEntry(i4, this.outputStack[this.outputStackLocation]);
        }
        this.previousCode = i;
        byte[] bArr2 = this.outputStack;
        int i5 = this.outputStackLocation;
        this.previousCodeFirstChar = bArr2[i5];
        return i5;
    }

    public int getClearCode() {
        return this.clearCode;
    }

    public int getCodeSize() {
        return this.codeSize;
    }

    public long getCompressedCount() {
        return this.f205875in.getBytesRead();
    }

    public int getPrefix(int i) {
        return this.prefixes[i];
    }

    public int getPrefixesLength() {
        return this.prefixes.length;
    }

    public int getTableSize() {
        return this.tableSize;
    }

    public void incrementCodeSize() {
        this.codeSize++;
    }

    public void initializeTables(int i) {
        if (i <= 0) {
            ctq0.m108694a("maxCodeSize is ", i, ", must be bigger than 0");
            return;
        }
        int i2 = 1 << i;
        this.prefixes = new int[i2];
        this.characters = new byte[i2];
        this.outputStack = new byte[i2];
        this.outputStackLocation = i2;
        for (int i3 = 0; i3 < 256; i3++) {
            this.prefixes[i3] = -1;
            this.characters[i3] = (byte) i3;
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) {
        int iMin;
        int iMin2;
        if (i2 == 0) {
            return 0;
        }
        int length = this.outputStack.length - this.outputStackLocation;
        if (length > 0) {
            iMin = Math.min(length, i2);
            System.arraycopy(this.outputStack, this.outputStackLocation, bArr, i, iMin);
            this.outputStackLocation += iMin;
        } else {
            iMin = 0;
        }
        while (true) {
            int i3 = i2 - iMin;
            if (i3 <= 0) {
                count(iMin);
                return iMin;
            }
            int iDecompressNextSymbol = decompressNextSymbol();
            if (iDecompressNextSymbol < 0) {
                if (iMin <= 0) {
                    return iDecompressNextSymbol;
                }
                count(iMin);
                return iMin;
            }
            int i4 = i + iMin;
            int length2 = this.outputStack.length - this.outputStackLocation;
            if (length2 > 0) {
                iMin2 = Math.min(length2, i3);
                System.arraycopy(this.outputStack, this.outputStackLocation, bArr, i4, iMin2);
                this.outputStackLocation += iMin2;
            } else {
                iMin2 = 0;
            }
            iMin += iMin2;
        }
    }

    public int readNextCode() {
        int i = this.codeSize;
        if (i <= 31) {
            return (int) this.f205875in.readBits(i);
        }
        ig3.m135964a("Code size must not be bigger than 31");
        return 0;
    }

    public void resetCodeSize() {
        setCodeSize(9);
    }

    public void resetPreviousCode() {
        this.previousCode = -1;
    }

    public void setClearCode(int i) {
        this.clearCode = 1 << (i - 1);
    }

    public void setCodeSize(int i) {
        this.codeSize = i;
    }

    public void setPrefix(int i, int i2) {
        this.prefixes[i] = i2;
    }

    public void setTableSize(int i) {
        this.tableSize = i;
    }

    public void initializeTables(int i, int i2) throws Sudbreak.Suddo {
        if (i > 0) {
            if (i2 > -1) {
                long j = (((long) (1 << i)) * 6) >> 10;
                if (j > i2) {
                    throw new Sudbreak.Suddo(i2, j);
                }
            }
            initializeTables(i);
            return;
        }
        ctq0.m108694a("maxCodeSize is ", i, ", must be bigger than 0");
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        int i = read(this.oneByte);
        return i < 0 ? i : this.oneByte[0] & 255;
    }
}
