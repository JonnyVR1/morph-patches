package org.brotli.dec;

import java.io.IOException;
import java.io.InputStream;
import p153l.dpq0;
import p153l.wg3;
import p153l.za50;

/* JADX INFO: loaded from: classes2.dex */
public class BrotliInputStream extends InputStream {
    public static final int DEFAULT_INTERNAL_BUFFER_SIZE = 16384;
    private byte[] buffer;
    private int bufferOffset;
    private int remainingBufferBytes;
    private final State state;

    public BrotliInputStream(InputStream inputStream, int i, byte[] bArr) throws IOException {
        State state = new State();
        this.state = state;
        if (i <= 0) {
            za50.m219101a("Bad buffer size:", i);
            throw null;
        }
        if (inputStream == null) {
            wg3.m206174a("source is null");
            throw null;
        }
        this.buffer = new byte[i];
        this.remainingBufferBytes = 0;
        this.bufferOffset = 0;
        try {
            State.setInput(state, inputStream);
            if (bArr != null) {
                Decode.setCustomDictionary(state, bArr);
            }
        } catch (BrotliRuntimeException e) {
            throw new IOException("Brotli decoder initialization failed", e);
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        State.close(this.state);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        if (i < 0) {
            za50.m219101a("Bad offset: ", i);
            return 0;
        }
        if (i2 < 0) {
            za50.m219101a("Bad length: ", i2);
            return 0;
        }
        int i3 = i + i2;
        if (i3 > bArr.length) {
            dpq0.m117417a("Buffer overflow: ", i3, " > ", bArr.length);
            return 0;
        }
        if (i2 == 0) {
            return 0;
        }
        int iMax = Math.max(this.remainingBufferBytes - this.bufferOffset, 0);
        if (iMax != 0) {
            iMax = Math.min(iMax, i2);
            System.arraycopy(this.buffer, this.bufferOffset, bArr, i, iMax);
            this.bufferOffset += iMax;
            i += iMax;
            i2 -= iMax;
            if (i2 == 0) {
                return iMax;
            }
        }
        try {
            State state = this.state;
            state.output = bArr;
            state.outputOffset = i;
            state.outputLength = i2;
            state.outputUsed = 0;
            Decode.decompress(state);
            int i4 = this.state.outputUsed;
            if (i4 == 0) {
                return -1;
            }
            return i4 + iMax;
        } catch (BrotliRuntimeException e) {
            throw new IOException("Brotli stream decoding failed", e);
        }
    }

    public BrotliInputStream(InputStream inputStream, int i) throws IOException {
        this(inputStream, i, null);
    }

    public BrotliInputStream(InputStream inputStream) throws IOException {
        this(inputStream, 16384, null);
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        if (this.bufferOffset >= this.remainingBufferBytes) {
            byte[] bArr = this.buffer;
            int i = read(bArr, 0, bArr.length);
            this.remainingBufferBytes = i;
            this.bufferOffset = 0;
            if (i == -1) {
                return -1;
            }
        }
        byte[] bArr2 = this.buffer;
        int i2 = this.bufferOffset;
        this.bufferOffset = i2 + 1;
        return bArr2[i2] & 255;
    }
}
