package org.eclipse.jetty.p004io;

import java.io.IOException;
import java.io.OutputStream;
import java.io.Writer;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class WriterOutputStream extends OutputStream {
    private final byte[] _buf;
    protected final String _encoding;
    protected final Writer _writer;

    public WriterOutputStream(Writer writer) {
        this._buf = new byte[1];
        this._writer = writer;
        this._encoding = null;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this._writer.close();
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
        this._writer.flush();
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) throws IOException {
        String str = this._encoding;
        Writer writer = this._writer;
        if (str == null) {
            writer.write(new String(bArr));
        } else {
            writer.write(new String(bArr, str));
        }
    }

    public WriterOutputStream(Writer writer, String str) {
        this._buf = new byte[1];
        this._writer = writer;
        this._encoding = str;
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) throws IOException {
        String str = this._encoding;
        Writer writer = this._writer;
        if (str == null) {
            writer.write(new String(bArr, i, i2));
        } else {
            writer.write(new String(bArr, i, i2, str));
        }
    }

    @Override // java.io.OutputStream
    public synchronized void write(int i) throws IOException {
        byte[] bArr = this._buf;
        bArr[0] = (byte) i;
        write(bArr);
    }
}
