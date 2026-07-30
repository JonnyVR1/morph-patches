package org.spongycastle.crypto.tls;

import java.io.IOException;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
interface DTLSHandshakeRetransmit {
    void receivedHandshakeRecord(int i, byte[] bArr, int i2, int i3) throws IOException;
}
