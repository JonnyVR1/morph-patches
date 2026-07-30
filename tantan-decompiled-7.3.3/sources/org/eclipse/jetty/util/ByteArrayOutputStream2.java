package org.eclipse.jetty.util;

import java.io.ByteArrayOutputStream;

/* JADX INFO: loaded from: classes2.dex */
public class ByteArrayOutputStream2 extends ByteArrayOutputStream {
    public ByteArrayOutputStream2() {
    }

    public byte[] getBuf() {
        return ((ByteArrayOutputStream) this).buf;
    }

    public int getCount() {
        return ((ByteArrayOutputStream) this).count;
    }

    public void reset(int i) {
        reset();
        if (((ByteArrayOutputStream) this).buf.length < i) {
            ((ByteArrayOutputStream) this).buf = new byte[i];
        }
    }

    public void setCount(int i) {
        ((ByteArrayOutputStream) this).count = i;
    }

    public void writeUnchecked(int i) {
        byte[] bArr = ((ByteArrayOutputStream) this).buf;
        int i2 = ((ByteArrayOutputStream) this).count;
        ((ByteArrayOutputStream) this).count = i2 + 1;
        bArr[i2] = (byte) i;
    }

    public ByteArrayOutputStream2(int i) {
        super(i);
    }
}
