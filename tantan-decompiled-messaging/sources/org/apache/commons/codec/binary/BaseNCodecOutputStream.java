package org.apache.commons.codec.binary;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import p149l.zkl;

/* JADX INFO: loaded from: classes2.dex */
public class BaseNCodecOutputStream extends FilterOutputStream {
    private final BaseNCodec baseNCodec;
    private final boolean doEncode;
    private final byte[] singleByte;

    public BaseNCodecOutputStream(OutputStream outputStream, BaseNCodec baseNCodec, boolean z) {
        super(outputStream);
        this.singleByte = new byte[1];
        this.baseNCodec = baseNCodec;
        this.doEncode = z;
    }

    private void flush(boolean z) throws IOException {
        byte[] bArr;
        int results;
        int iAvailable = this.baseNCodec.available();
        if (iAvailable > 0 && (results = this.baseNCodec.readResults((bArr = new byte[iAvailable]), 0, iAvailable)) > 0) {
            ((FilterOutputStream) this).out.write(bArr, 0, results);
        }
        if (z) {
            ((FilterOutputStream) this).out.flush();
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        boolean z = this.doEncode;
        BaseNCodec baseNCodec = this.baseNCodec;
        if (z) {
            baseNCodec.encode(this.singleByte, 0, -1);
        } else {
            baseNCodec.decode(this.singleByte, 0, -1);
        }
        flush();
        ((FilterOutputStream) this).out.close();
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) throws IOException {
        bArr.getClass();
        if (i < 0 || i2 < 0) {
            zkl.m219192a();
            return;
        }
        if (i > bArr.length || i + i2 > bArr.length) {
            zkl.m219192a();
            return;
        }
        if (i2 > 0) {
            boolean z = this.doEncode;
            BaseNCodec baseNCodec = this.baseNCodec;
            if (z) {
                baseNCodec.encode(bArr, i, i2);
            } else {
                baseNCodec.decode(bArr, i, i2);
            }
            flush(false);
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
        flush(true);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(int i) throws IOException {
        byte[] bArr = this.singleByte;
        bArr[0] = (byte) i;
        write(bArr, 0, 1);
    }
}
