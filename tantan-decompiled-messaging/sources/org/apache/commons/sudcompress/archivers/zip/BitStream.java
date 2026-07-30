package org.apache.commons.sudcompress.archivers.zip;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteOrder;
import p149l.C20783w1;
import p149l.vig0;

/* JADX INFO: loaded from: classes2.dex */
class BitStream extends vig0 {
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
        C20783w1.m200910a("Trying to read ", i, " bits, at most 8 are allowed");
        return 0L;
    }

    public int nextByte() {
        return (int) readBits(8);
    }
}
