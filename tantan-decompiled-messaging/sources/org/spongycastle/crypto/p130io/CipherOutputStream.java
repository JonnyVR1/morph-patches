package org.spongycastle.crypto.p130io;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import org.spongycastle.crypto.BufferedBlockCipher;
import org.spongycastle.crypto.InvalidCipherTextException;
import org.spongycastle.crypto.StreamCipher;
import org.spongycastle.crypto.modes.AEADBlockCipher;

/* JADX INFO: loaded from: classes3.dex */
public class CipherOutputStream extends FilterOutputStream {
    private AEADBlockCipher aeadBlockCipher;
    private byte[] buf;
    private BufferedBlockCipher bufferedBlockCipher;
    private final byte[] oneByte;
    private StreamCipher streamCipher;

    public CipherOutputStream(OutputStream outputStream, BufferedBlockCipher bufferedBlockCipher) {
        super(outputStream);
        this.oneByte = new byte[1];
        this.bufferedBlockCipher = bufferedBlockCipher;
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

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        IOException cipherIOException;
        IOException iOException;
        ensureCapacity(0, true);
        try {
            BufferedBlockCipher bufferedBlockCipher = this.bufferedBlockCipher;
            if (bufferedBlockCipher != null) {
                int iDoFinal = bufferedBlockCipher.doFinal(this.buf, 0);
                if (iDoFinal != 0) {
                    ((FilterOutputStream) this).out.write(this.buf, 0, iDoFinal);
                }
            } else {
                AEADBlockCipher aEADBlockCipher = this.aeadBlockCipher;
                if (aEADBlockCipher != null) {
                    int iDoFinal2 = aEADBlockCipher.doFinal(this.buf, 0);
                    if (iDoFinal2 != 0) {
                        ((FilterOutputStream) this).out.write(this.buf, 0, iDoFinal2);
                    }
                } else {
                    StreamCipher streamCipher = this.streamCipher;
                    if (streamCipher != null) {
                        streamCipher.reset();
                    }
                }
            }
            iOException = null;
        } catch (InvalidCipherTextException e) {
            cipherIOException = new InvalidCipherTextIOException("Error finalising cipher data", e);
            iOException = cipherIOException;
        } catch (Exception e2) {
            cipherIOException = new CipherIOException("Error closing stream: ", e2);
            iOException = cipherIOException;
        }
        try {
            flush();
            ((FilterOutputStream) this).out.close();
        } catch (IOException e3) {
            if (iOException == null) {
                iOException = e3;
            }
        }
        if (iOException != null) {
            throw iOException;
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
        ((FilterOutputStream) this).out.flush();
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) throws IOException {
        ensureCapacity(i2, false);
        BufferedBlockCipher bufferedBlockCipher = this.bufferedBlockCipher;
        if (bufferedBlockCipher != null) {
            int iProcessBytes = bufferedBlockCipher.processBytes(bArr, i, i2, this.buf, 0);
            if (iProcessBytes != 0) {
                ((FilterOutputStream) this).out.write(this.buf, 0, iProcessBytes);
                return;
            }
            return;
        }
        AEADBlockCipher aEADBlockCipher = this.aeadBlockCipher;
        if (aEADBlockCipher == null) {
            this.streamCipher.processBytes(bArr, i, i2, this.buf, 0);
            ((FilterOutputStream) this).out.write(this.buf, 0, i2);
        } else {
            int iProcessBytes2 = aEADBlockCipher.processBytes(bArr, i, i2, this.buf, 0);
            if (iProcessBytes2 != 0) {
                ((FilterOutputStream) this).out.write(this.buf, 0, iProcessBytes2);
            }
        }
    }

    public CipherOutputStream(OutputStream outputStream, StreamCipher streamCipher) {
        super(outputStream);
        this.oneByte = new byte[1];
        this.streamCipher = streamCipher;
    }

    public CipherOutputStream(OutputStream outputStream, AEADBlockCipher aEADBlockCipher) {
        super(outputStream);
        this.oneByte = new byte[1];
        this.aeadBlockCipher = aEADBlockCipher;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(int i) throws IOException {
        byte[] bArr = this.oneByte;
        byte b = (byte) i;
        bArr[0] = b;
        StreamCipher streamCipher = this.streamCipher;
        if (streamCipher != null) {
            ((FilterOutputStream) this).out.write(streamCipher.returnByte(b));
        } else {
            write(bArr, 0, 1);
        }
    }
}
