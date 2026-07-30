package org.spongycastle.asn1;

import java.io.IOException;
import java.io.InputStream;
import p149l.hg3;

/* JADX INFO: loaded from: classes3.dex */
class IndefiniteLengthInputStream extends LimitedInputStream {
    private int _b1;
    private int _b2;
    private boolean _eofOn00;
    private boolean _eofReached;

    public IndefiniteLengthInputStream(InputStream inputStream, int i) throws IOException {
        super(inputStream, i);
        this._eofReached = false;
        this._eofOn00 = true;
        this._b1 = inputStream.read();
        int i2 = inputStream.read();
        this._b2 = i2;
        if (i2 >= 0) {
            checkForEof();
        } else {
            hg3.m130807a();
            throw null;
        }
    }

    private boolean checkForEof() {
        if (!this._eofReached && this._eofOn00 && this._b1 == 0 && this._b2 == 0) {
            this._eofReached = true;
            setParentEofDetect(true);
        }
        return this._eofReached;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        if (this._eofOn00 || i2 < 3) {
            return super.read(bArr, i, i2);
        }
        if (this._eofReached) {
            return -1;
        }
        int i3 = this._in.read(bArr, i + 2, i2 - 2);
        if (i3 < 0) {
            hg3.m130807a();
            return 0;
        }
        bArr[i] = (byte) this._b1;
        bArr[i + 1] = (byte) this._b2;
        this._b1 = this._in.read();
        int i4 = this._in.read();
        this._b2 = i4;
        if (i4 >= 0) {
            return i3 + 2;
        }
        hg3.m130807a();
        return 0;
    }

    public void setEofOn00(boolean z) {
        this._eofOn00 = z;
        checkForEof();
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        if (checkForEof()) {
            return -1;
        }
        int i = this._in.read();
        if (i >= 0) {
            int i2 = this._b1;
            this._b1 = this._b2;
            this._b2 = i;
            return i2;
        }
        hg3.m130807a();
        return 0;
    }
}
