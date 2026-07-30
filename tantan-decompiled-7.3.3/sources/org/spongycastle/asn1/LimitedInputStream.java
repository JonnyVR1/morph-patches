package org.spongycastle.asn1;

import java.io.InputStream;

/* JADX INFO: loaded from: classes3.dex */
abstract class LimitedInputStream extends InputStream {
    protected final InputStream _in;
    private int _limit;

    public LimitedInputStream(InputStream inputStream, int i) {
        this._in = inputStream;
        this._limit = i;
    }

    public int getRemaining() {
        return this._limit;
    }

    public void setParentEofDetect(boolean z) {
        InputStream inputStream = this._in;
        if (inputStream instanceof IndefiniteLengthInputStream) {
            ((IndefiniteLengthInputStream) inputStream).setEofOn00(z);
        }
    }
}
