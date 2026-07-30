package p149l;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes6.dex */
public final class olr0 implements plr0 {

    /* JADX INFO: renamed from: a */
    public final ByteBuffer f144554a;

    public olr0(ByteBuffer byteBuffer) {
        this.f144554a = byteBuffer.slice();
    }

    @Override // p149l.plr0
    /* JADX INFO: renamed from: a */
    public final void mo97685a(MessageDigest[] messageDigestArr, long j, int i) throws IOException {
        ByteBuffer byteBufferSlice;
        synchronized (this.f144554a) {
            int i2 = (int) j;
            this.f144554a.position(i2);
            this.f144554a.limit(i2 + i);
            byteBufferSlice = this.f144554a.slice();
        }
        for (MessageDigest messageDigest : messageDigestArr) {
            byteBufferSlice.position(0);
            messageDigest.update(byteBufferSlice);
        }
    }

    @Override // p149l.plr0
    public final long zza() {
        return this.f144554a.capacity();
    }
}
