package p153l;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes6.dex */
public final class uur0 implements vur0 {

    /* JADX INFO: renamed from: a */
    public final ByteBuffer f181089a;

    public uur0(ByteBuffer byteBuffer) {
        this.f181089a = byteBuffer.slice();
    }

    @Override // p153l.vur0
    /* JADX INFO: renamed from: a */
    public final void mo132579a(MessageDigest[] messageDigestArr, long j, int i) throws IOException {
        ByteBuffer byteBufferSlice;
        synchronized (this.f181089a) {
            int i2 = (int) j;
            this.f181089a.position(i2);
            this.f181089a.limit(i2 + i);
            byteBufferSlice = this.f181089a.slice();
        }
        for (MessageDigest messageDigest : messageDigestArr) {
            byteBufferSlice.position(0);
            messageDigest.update(byteBufferSlice);
        }
    }

    @Override // p153l.vur0
    public final long zza() {
        return this.f181089a.capacity();
    }
}
