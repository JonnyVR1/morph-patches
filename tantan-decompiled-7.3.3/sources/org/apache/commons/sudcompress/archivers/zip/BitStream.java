package org.apache.commons.sudcompress.archivers.zip;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteOrder;
import p153l.C20990w1;
import p153l.drg0;

/* JADX INFO: loaded from: classes2.dex */
class BitStream extends drg0 {
    public BitStream(InputStream inputStream) {
        super(inputStream, ByteOrder.LITTLE_ENDIAN);
    }

    public int nextBit() {
        return (int) readBits(1);
    }

    public long nextBits(int i) throws IOException {
        if (i >= 0 && i <= 8) {
            return readBits(i);
        }
        C20990w1.m204364a("Trying to read ", i, " bits, at most 8 are allowed");
        return 0L;
    }

    public int nextByte() {
        return (int) readBits(8);
    }
}
