package org.spongycastle.crypto.p011io;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import l.mll;
import l.rhg0;
import org.spongycastle.crypto.BufferedBlockCipher;
import org.spongycastle.crypto.InvalidCipherTextException;
import org.spongycastle.crypto.SkippingCipher;
import org.spongycastle.crypto.StreamCipher;
import org.spongycastle.crypto.modes.AEADBlockCipher;
import org.spongycastle.util.Arrays;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class CipherInputStream extends FilterInputStream {
    private static final int INPUT_BUF_SIZE = 2048;
    private AEADBlockCipher aeadBlockCipher;
    private byte[] buf;
    private int bufOff;
    private BufferedBlockCipher bufferedBlockCipher;
    private boolean finalized;
    private byte[] inBuf;
    private byte[] markBuf;
    private int markBufOff;
    private long markPosition;
    private int maxBuf;
    private SkippingCipher skippingCipher;
    private StreamCipher streamCipher;

    /* JADX WARN: Multi-variable type inference failed */
    public CipherInputStream(InputStream inputStream, BufferedBlockCipher bufferedBlockCipher, int i) {
        super(inputStream);
        this.bufferedBlockCipher = bufferedBlockCipher;
        this.inBuf = new byte[i];
        this.skippingCipher = bufferedBlockCipher instanceof SkippingCipher ? (SkippingCipher) bufferedBlockCipher : null;
    }

    private void ensureCapacity(int i, boolean z) {
        BufferedBlockCipher bufferedBlockCipher = this.bufferedBlockCipher;
        if (z) {
            if (bufferedBlockCipher != null) {
                i = bufferedBlockCipher.getOutputSize(i);
            } else {
                AEADBlockCipher aEADBlockCipher = this.aeadBlockCipher;
                if (aEADBlockCipher != null) {
                    i = aEADBlockCipher.getOutputSize(i);
                }
            }
        } else if (bufferedBlockCipher != null) {
            i = bufferedBlockCipher.getUpdateOutputSize(i);
        } else {
            AEADBlockCipher aEADBlockCipher2 = this.aeadBlockCipher;
            if (aEADBlockCipher2 != null) {
                i = aEADBlockCipher2.getUpdateOutputSize(i);
            }
        }
        byte[] bArr = this.buf;
        if (bArr == null || bArr.length < i) {
            this.buf = new byte[i];
        }
    }

    private void finaliseCipher() throws IOException {
        try {
            this.finalized = true;
            ensureCapacity(0, true);
            BufferedBlockCipher bufferedBlockCipher = this.bufferedBlockCipher;
            if (bufferedBlockCipher != null) {
                this.maxBuf = bufferedBlockCipher.doFinal(this.buf, 0);
                return;
            }
            AEADBlockCipher aEADBlockCipher = this.aeadBlockCipher;
            if (aEADBlockCipher != null) {
                this.maxBuf = aEADBlockCipher.doFinal(this.buf, 0);
            } else {
                this.maxBuf = 0;
            }
        } catch (InvalidCipherTextException e) {
            throw new InvalidCipherTextIOException("Error finalising cipher", e);
        } catch (Exception e2) {
            mll.a("Error finalising cipher ", e2);
        }
    }

    private int nextChunk() throws IOException {
        if (this.finalized) {
            return -1;
        }
        this.bufOff = 0;
        this.maxBuf = 0;
        while (true) {
            int i = this.maxBuf;
            if (i != 0) {
                return i;
            }
            int i2 = ((FilterInputStream) this).in.read(this.inBuf);
            if (i2 == -1) {
                finaliseCipher();
                int i3 = this.maxBuf;
                if (i3 == 0) {
                    return -1;
                }
                return i3;
            }
            try {
                ensureCapacity(i2, false);
                BufferedBlockCipher bufferedBlockCipher = this.bufferedBlockCipher;
                if (bufferedBlockCipher != null) {
                    this.maxBuf = bufferedBlockCipher.processBytes(this.inBuf, 0, i2, this.buf, 0);
                } else {
                    AEADBlockCipher aEADBlockCipher = this.aeadBlockCipher;
                    if (aEADBlockCipher != null) {
                        this.maxBuf = aEADBlockCipher.processBytes(this.inBuf, 0, i2, this.buf, 0);
                    } else {
                        this.streamCipher.processBytes(this.inBuf, 0, i2, this.buf, 0);
                        this.maxBuf = i2;
                    }
                }
            } catch (Exception e) {
                throw new CipherIOException("Error processing stream ", e);
            }
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int available() throws IOException {
        return this.maxBuf - this.bufOff;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        try {
            ((FilterInputStream) this).in.close();
            if (!this.finalized) {
                finaliseCipher();
            }
            this.bufOff = 0;
            this.maxBuf = 0;
            this.markBufOff = 0;
            this.markPosition = 0L;
            byte[] bArr = this.markBuf;
            if (bArr != null) {
                Arrays.fill(bArr, (byte) 0);
                this.markBuf = null;
            }
            byte[] bArr2 = this.buf;
            if (bArr2 != null) {
                Arrays.fill(bArr2, (byte) 0);
                this.buf = null;
            }
            Arrays.fill(this.inBuf, (byte) 0);
        } catch (Throwable th) {
            if (!this.finalized) {
                finaliseCipher();
            }
            throw th;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void mark(int i) {
        ((FilterInputStream) this).in.mark(i);
        SkippingCipher skippingCipher = this.skippingCipher;
        if (skippingCipher != null) {
            this.markPosition = skippingCipher.getPosition();
        }
        byte[] bArr = this.buf;
        if (bArr != null) {
            byte[] bArr2 = new byte[bArr.length];
            this.markBuf = bArr2;
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        }
        this.markBufOff = this.bufOff;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        if (this.skippingCipher != null) {
            return ((FilterInputStream) this).in.markSupported();
        }
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        if (this.bufOff >= this.maxBuf && nextChunk() < 0) {
            return -1;
        }
        int iMin = Math.min(i2, available());
        System.arraycopy(this.buf, this.bufOff, bArr, i, iMin);
        this.bufOff += iMin;
        return iMin;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void reset() throws IOException {
        if (this.skippingCipher == null) {
            rhg0.a("cipher must implement SkippingCipher to be used with reset()");
            return;
        }
        ((FilterInputStream) this).in.reset();
        this.skippingCipher.seekTo(this.markPosition);
        byte[] bArr = this.markBuf;
        if (bArr != null) {
            this.buf = bArr;
        }
        this.bufOff = this.markBufOff;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j) throws IOException {
        if (j <= 0) {
            return 0L;
        }
        if (this.skippingCipher == null) {
            int iMin = (int) Math.min(j, available());
            this.bufOff += iMin;
            return iMin;
        }
        long jAvailable = available();
        if (j <= jAvailable) {
            this.bufOff = (int) (((long) this.bufOff) + j);
            return j;
        }
        this.bufOff = this.maxBuf;
        long jSkip = ((FilterInputStream) this).in.skip(j - jAvailable);
        if (jSkip == this.skippingCipher.skip(jSkip)) {
            return jSkip + jAvailable;
        }
        throw new IOException("Unable to skip cipher " + jSkip + " bytes.");
    }

    public CipherInputStream(InputStream inputStream, StreamCipher streamCipher) {
        this(inputStream, streamCipher, 2048);
    }

    public CipherInputStream(InputStream inputStream, AEADBlockCipher aEADBlockCipher) {
        this(inputStream, aEADBlockCipher, 2048);
    }

    public CipherInputStream(InputStream inputStream, BufferedBlockCipher bufferedBlockCipher) {
        this(inputStream, bufferedBlockCipher, 2048);
    }

    public CipherInputStream(InputStream inputStream, StreamCipher streamCipher, int i) {
        super(inputStream);
        this.streamCipher = streamCipher;
        this.inBuf = new byte[i];
        this.skippingCipher = streamCipher instanceof SkippingCipher ? (SkippingCipher) streamCipher : null;
    }

    public CipherInputStream(InputStream inputStream, AEADBlockCipher aEADBlockCipher, int i) {
        super(inputStream);
        this.aeadBlockCipher = aEADBlockCipher;
        this.inBuf = new byte[i];
        this.skippingCipher = aEADBlockCipher instanceof SkippingCipher ? (SkippingCipher) aEADBlockCipher : null;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        if (this.bufOff >= this.maxBuf && nextChunk() < 0) {
            return -1;
        }
        byte[] bArr = this.buf;
        int i = this.bufOff;
        this.bufOff = i + 1;
        return bArr[i] & 255;
    }
}
