package org.spongycastle.crypto.tls;

import p149l.ig3;

/* JADX INFO: loaded from: classes3.dex */
class DTLSEpoch {
    private final TlsCipher cipher;
    private final int epoch;
    private final DTLSReplayWindow replayWindow = new DTLSReplayWindow();
    private long sequenceNumber = 0;

    public DTLSEpoch(int i, TlsCipher tlsCipher) {
        if (i < 0) {
            ig3.m135964a("'epoch' must be >= 0");
            throw null;
        }
        if (tlsCipher == null) {
            ig3.m135964a("'cipher' cannot be null");
            throw null;
        }
        this.epoch = i;
        this.cipher = tlsCipher;
    }

    public long allocateSequenceNumber() {
        long j = this.sequenceNumber;
        this.sequenceNumber = 1 + j;
        return j;
    }

    public TlsCipher getCipher() {
        return this.cipher;
    }

    public int getEpoch() {
        return this.epoch;
    }

    public DTLSReplayWindow getReplayWindow() {
        return this.replayWindow;
    }

    public long getSequenceNumber() {
        return this.sequenceNumber;
    }
}
