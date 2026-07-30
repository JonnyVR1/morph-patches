package p149l;

import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes6.dex */
public final class y6t0 implements wfx0 {

    /* JADX INFO: renamed from: a */
    public final ByteBuffer f196641a;

    public y6t0(ByteBuffer byteBuffer) {
        this.f196641a = byteBuffer.duplicate();
    }

    @Override // p149l.wfx0
    /* JADX INFO: renamed from: c */
    public final ByteBuffer mo202995c(long j, long j2) throws IOException {
        ByteBuffer byteBuffer = this.f196641a;
        int iPosition = byteBuffer.position();
        byteBuffer.position((int) j);
        ByteBuffer byteBufferSlice = this.f196641a.slice();
        byteBufferSlice.limit((int) j2);
        this.f196641a.position(iPosition);
        return byteBufferSlice;
    }

    @Override // p149l.wfx0
    /* JADX INFO: renamed from: e0 */
    public final int mo202996e0(ByteBuffer byteBuffer) throws IOException {
        if (this.f196641a.remaining() == 0 && byteBuffer.remaining() > 0) {
            return -1;
        }
        int iMin = Math.min(byteBuffer.remaining(), this.f196641a.remaining());
        byte[] bArr = new byte[iMin];
        this.f196641a.get(bArr);
        byteBuffer.put(bArr);
        return iMin;
    }

    @Override // p149l.wfx0
    /* JADX INFO: renamed from: l */
    public final void mo202997l(long j) throws IOException {
        this.f196641a.position((int) j);
    }

    @Override // p149l.wfx0
    public final long zzb() throws IOException {
        return this.f196641a.position();
    }

    @Override // p149l.wfx0
    public final long zzc() throws IOException {
        return this.f196641a.limit();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
    }
}
