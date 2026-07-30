package com.cosmos.photon.push.image;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import p149l.hg3;
import p149l.ig3;
import p149l.y9g0;

/* JADX INFO: loaded from: classes.dex */
class StrictLineReader implements Closeable {

    /* JADX INFO: renamed from: CR */
    private static final byte f5805CR = 13;

    /* JADX INFO: renamed from: LF */
    private static final byte f5806LF = 10;
    private byte[] buf;
    private final Charset charset;
    private int end;

    /* JADX INFO: renamed from: in */
    private final InputStream f5807in;
    private int pos;

    public StrictLineReader(InputStream inputStream, int i, Charset charset) {
        if (inputStream == null || charset == null) {
            throw null;
        }
        if (i < 0) {
            ig3.m135964a("capacity <= 0");
            throw null;
        }
        if (!charset.equals(Util.US_ASCII)) {
            ig3.m135964a("Unsupported encoding");
            throw null;
        }
        this.f5807in = inputStream;
        this.charset = charset;
        this.buf = new byte[i];
    }

    private void fillBuf() throws IOException {
        InputStream inputStream = this.f5807in;
        byte[] bArr = this.buf;
        int i = inputStream.read(bArr, 0, bArr.length);
        if (i == -1) {
            hg3.m130807a();
        } else {
            this.pos = 0;
            this.end = i;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        synchronized (this.f5807in) {
            try {
                if (this.buf != null) {
                    this.buf = null;
                    this.f5807in.close();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean hasUnterminatedLine() {
        return this.end == -1;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x002f  */
    public String readLine() throws IOException {
        int i;
        byte[] bArr;
        int i2;
        synchronized (this.f5807in) {
            try {
                if (this.buf == null) {
                    throw new IOException("LineReader is closed");
                }
                if (this.pos >= this.end) {
                    fillBuf();
                }
                for (int i3 = this.pos; i3 != this.end; i3++) {
                    byte[] bArr2 = this.buf;
                    if (bArr2[i3] == 10) {
                        int i4 = this.pos;
                        if (i3 != i4) {
                            i2 = i3 - 1;
                            if (bArr2[i2] != 13) {
                                i2 = i3;
                            }
                        } else {
                            i2 = i3;
                        }
                        String str = new String(bArr2, i4, i2 - i4, this.charset.name());
                        this.pos = i3 + 1;
                        return str;
                    }
                }
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream((this.end - this.pos) + 80) { // from class: com.cosmos.photon.push.image.StrictLineReader.1
                    @Override // java.io.ByteArrayOutputStream
                    public String toString() {
                        int i5 = ((ByteArrayOutputStream) this).count;
                        if (i5 > 0 && ((ByteArrayOutputStream) this).buf[i5 - 1] == 13) {
                            i5--;
                        }
                        try {
                            return new String(((ByteArrayOutputStream) this).buf, 0, i5, StrictLineReader.this.charset.name());
                        } catch (UnsupportedEncodingException e) {
                            y9g0.m213537a(e);
                            return null;
                        }
                    }
                };
                loop1: while (true) {
                    byte[] bArr3 = this.buf;
                    int i5 = this.pos;
                    byteArrayOutputStream.write(bArr3, i5, this.end - i5);
                    this.end = -1;
                    fillBuf();
                    i = this.pos;
                    while (i != this.end) {
                        bArr = this.buf;
                        if (bArr[i] == 10) {
                            break loop1;
                        }
                        i++;
                    }
                }
                int i6 = this.pos;
                if (i != i6) {
                    byteArrayOutputStream.write(bArr, i6, i - i6);
                }
                this.pos = i + 1;
                return byteArrayOutputStream.toString();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public StrictLineReader(InputStream inputStream, Charset charset) {
        this(inputStream, 8192, charset);
    }
}
