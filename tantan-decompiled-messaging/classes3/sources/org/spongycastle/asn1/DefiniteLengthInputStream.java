package org.spongycastle.asn1;

import java.io.IOException;
import java.io.InputStream;
import l.ig3;
import org.spongycastle.util.p013io.Streams;
import p003l.nsd;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
class DefiniteLengthInputStream extends LimitedInputStream {
    private static final byte[] EMPTY_BYTES = new byte[0];
    private final int _originalLength;
    private int _remaining;

    public DefiniteLengthInputStream(InputStream inputStream, int i) {
        super(inputStream, i);
        if (i < 0) {
            ig3.a("negative lengths not allowed");
            throw null;
        }
        this._originalLength = i;
        this._remaining = i;
        if (i == 0) {
            setParentEofDetect(true);
        }
    }

    @Override // org.spongycastle.asn1.LimitedInputStream
    public int getRemaining() {
        return this._remaining;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this._remaining;
        if (i3 == 0) {
            return -1;
        }
        int i4 = this._in.read(bArr, i, Math.min(i2, i3));
        if (i4 < 0) {
            nsd.m6561a(this._originalLength, this._remaining);
            return 0;
        }
        int i5 = this._remaining - i4;
        this._remaining = i5;
        if (i5 == 0) {
            setParentEofDetect(true);
        }
        return i4;
    }

    public byte[] toByteArray() throws IOException {
        int i = this._remaining;
        if (i == 0) {
            return EMPTY_BYTES;
        }
        byte[] bArr = new byte[i];
        int fully = i - Streams.readFully(this._in, bArr);
        this._remaining = fully;
        if (fully == 0) {
            setParentEofDetect(true);
            return bArr;
        }
        nsd.m6561a(this._originalLength, this._remaining);
        return null;
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        if (this._remaining == 0) {
            return -1;
        }
        int i = this._in.read();
        if (i >= 0) {
            int i2 = this._remaining - 1;
            this._remaining = i2;
            if (i2 == 0) {
                setParentEofDetect(true);
            }
            return i;
        }
        nsd.m6561a(this._originalLength, this._remaining);
        return 0;
    }
}
