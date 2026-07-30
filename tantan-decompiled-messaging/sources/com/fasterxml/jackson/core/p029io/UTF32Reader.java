package com.fasterxml.jackson.core.p029io;

import com.clevertap.android.sdk.Constants;
import com.fasterxml.jackson.core.base.GeneratorBase;
import java.io.CharConversionException;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;

/* JADX INFO: loaded from: classes6.dex */
public class UTF32Reader extends Reader {
    protected static final int LAST_VALID_UNICODE_CHAR = 1114111;

    /* JADX INFO: renamed from: NC */
    protected static final char f6877NC = 0;
    protected final boolean _bigEndian;
    protected byte[] _buffer;
    protected final IOContext _context;
    protected InputStream _in;
    protected int _length;
    protected final boolean _managedBuffers;
    protected int _ptr;
    protected char _surrogate = 0;
    protected int _charCount = 0;
    protected int _byteCount = 0;
    protected char[] _tmpBuf = null;

    public UTF32Reader(IOContext iOContext, InputStream inputStream, byte[] bArr, int i, int i2, boolean z) {
        this._context = iOContext;
        this._in = inputStream;
        this._buffer = bArr;
        this._ptr = i;
        this._length = i2;
        this._bigEndian = z;
        this._managedBuffers = inputStream != null;
    }

    private void freeBuffers() {
        byte[] bArr = this._buffer;
        if (bArr != null) {
            this._buffer = null;
            this._context.releaseReadIOBuffer(bArr);
        }
    }

    private boolean loadMore(int i) throws IOException {
        int i2;
        this._byteCount += this._length - i;
        if (i > 0) {
            int i3 = this._ptr;
            if (i3 > 0) {
                byte[] bArr = this._buffer;
                System.arraycopy(bArr, i3, bArr, 0, i);
                this._ptr = 0;
            }
            this._length = i;
        } else {
            this._ptr = 0;
            InputStream inputStream = this._in;
            int i4 = inputStream == null ? -1 : inputStream.read(this._buffer);
            if (i4 < 1) {
                this._length = 0;
                if (i4 < 0) {
                    if (this._managedBuffers) {
                        freeBuffers();
                    }
                    return false;
                }
                reportStrangeStream();
            }
            this._length = i4;
        }
        while (true) {
            int i5 = this._length;
            if (i5 >= 4) {
                return true;
            }
            InputStream inputStream2 = this._in;
            if (inputStream2 == null) {
                i2 = -1;
            } else {
                byte[] bArr2 = this._buffer;
                i2 = inputStream2.read(bArr2, i5, bArr2.length - i5);
            }
            if (i2 < 1) {
                if (i2 < 0) {
                    if (this._managedBuffers) {
                        freeBuffers();
                    }
                    reportUnexpectedEOF(this._length, 4);
                }
                reportStrangeStream();
            }
            this._length += i2;
        }
    }

    private void reportBounds(char[] cArr, int i, int i2) throws IOException {
        throw new ArrayIndexOutOfBoundsException("read(buf," + i + Constants.SEPARATOR_COMMA + i2 + "), cbuf[" + cArr.length + Constants.AES_SUFFIX);
    }

    private void reportInvalid(int i, int i2, String str) throws IOException {
        int i3 = (this._byteCount + this._ptr) - 1;
        throw new CharConversionException("Invalid UTF-32 character 0x" + Integer.toHexString(i) + str + " at char #" + (this._charCount + i2) + ", byte #" + i3 + ")");
    }

    private void reportStrangeStream() throws IOException {
        throw new IOException("Strange I/O stream, returned 0 bytes on read");
    }

    private void reportUnexpectedEOF(int i, int i2) throws IOException {
        int i3 = this._byteCount + i;
        throw new CharConversionException("Unexpected EOF in the middle of a 4-byte UTF-32 char: got " + i + ", needed " + i2 + ", at char #" + this._charCount + ", byte #" + i3 + ")");
    }

    @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        InputStream inputStream = this._in;
        if (inputStream != null) {
            this._in = null;
            freeBuffers();
            inputStream.close();
        }
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00c8 A[LOOP:0: B:21:0x0031->B:40:0x00c8, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:44:0x00b9 A[SYNTHETIC] */
    @Override // java.io.Reader
    public int read(char[] cArr, int i, int i2) throws IOException {
        int i3;
        int i4;
        int i5;
        int i6;
        if (this._buffer == null) {
            return -1;
        }
        if (i2 < 1) {
            return i2;
        }
        if (i < 0 || i + i2 > cArr.length) {
            reportBounds(cArr, i, i2);
        }
        int i7 = i2 + i;
        char c = this._surrogate;
        if (c != 0) {
            i3 = i + 1;
            cArr[i] = c;
            this._surrogate = (char) 0;
        } else {
            int i8 = this._length - this._ptr;
            if (i8 < 4 && !loadMore(i8)) {
                return -1;
            }
            i3 = i;
        }
        while (i3 < i7) {
            int i9 = this._ptr;
            boolean z = this._bigEndian;
            byte[] bArr = this._buffer;
            if (z) {
                i4 = (bArr[i9] << 24) | ((bArr[i9 + 1] & 255) << 16) | ((bArr[i9 + 2] & 255) << 8);
                i5 = bArr[i9 + 3] & 255;
            } else {
                i4 = (bArr[i9] & 255) | ((bArr[i9 + 1] & 255) << 8) | ((bArr[i9 + 2] & 255) << 16);
                i5 = bArr[i9 + 3] << 24;
            }
            int i10 = i4 | i5;
            this._ptr = i9 + 4;
            if (i10 <= 65535) {
                i6 = i3 + 1;
                cArr[i3] = (char) i10;
                if (this._ptr >= this._length) {
                    i3 = i6;
                }
            } else {
                if (i10 > LAST_VALID_UNICODE_CHAR) {
                    reportInvalid(i10, i3 - i, "(above " + Integer.toHexString(LAST_VALID_UNICODE_CHAR) + ") ");
                }
                int i11 = i10 - 65536;
                i6 = i3 + 1;
                cArr[i3] = (char) ((i11 >> 10) + GeneratorBase.SURR1_FIRST);
                i10 = 56320 | (i11 & 1023);
                if (i6 >= i7) {
                    this._surrogate = (char) i10;
                } else {
                    i3 = i6;
                    i6 = i3 + 1;
                    cArr[i3] = (char) i10;
                    if (this._ptr >= this._length) {
                        i3 = i6;
                    }
                }
            }
            i3 = i6;
            break;
        }
        int i12 = i3 - i;
        this._charCount += i12;
        return i12;
    }

    @Override // java.io.Reader
    public int read() throws IOException {
        if (this._tmpBuf == null) {
            this._tmpBuf = new char[1];
        }
        if (read(this._tmpBuf, 0, 1) < 1) {
            return -1;
        }
        return this._tmpBuf[0];
    }
}
