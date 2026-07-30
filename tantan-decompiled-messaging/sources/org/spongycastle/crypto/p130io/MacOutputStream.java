package org.spongycastle.crypto.p130io;

import java.io.IOException;
import java.io.OutputStream;
import org.spongycastle.crypto.Mac;

/* JADX INFO: loaded from: classes3.dex */
public class MacOutputStream extends OutputStream {
    protected Mac mac;

    public MacOutputStream(Mac mac) {
        this.mac = mac;
    }

    public byte[] getMac() {
        byte[] bArr = new byte[this.mac.getMacSize()];
        this.mac.doFinal(bArr, 0);
        return bArr;
    }

    @Override // java.io.OutputStream
    public void write(int i) throws IOException {
        this.mac.update((byte) i);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) throws IOException {
        this.mac.update(bArr, i, i2);
    }
}
