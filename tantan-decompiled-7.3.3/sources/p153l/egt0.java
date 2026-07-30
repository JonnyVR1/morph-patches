package p153l;

import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes6.dex */
public final class egt0 implements cpx0 {

    /* JADX INFO: renamed from: a */
    public final ByteBuffer f93975a;

    public egt0(ByteBuffer byteBuffer) {
        this.f93975a = byteBuffer.duplicate();
    }

    @Override // p153l.cpx0
    /* JADX INFO: renamed from: c */
    public final ByteBuffer mo111833c(long j, long j2) throws IOException {
        ByteBuffer byteBuffer = this.f93975a;
        int iPosition = byteBuffer.position();
        byteBuffer.position((int) j);
        ByteBuffer byteBufferSlice = this.f93975a.slice();
        byteBufferSlice.limit((int) j2);
        this.f93975a.position(iPosition);
        return byteBufferSlice;
    }

    @Override // p153l.cpx0
    /* JADX INFO: renamed from: f0 */
    public final int mo111834f0(ByteBuffer byteBuffer) throws IOException {
        if (this.f93975a.remaining() == 0 && byteBuffer.remaining() > 0) {
            return -1;
        }
        int iMin = Math.min(byteBuffer.remaining(), this.f93975a.remaining());
        byte[] bArr = new byte[iMin];
        this.f93975a.get(bArr);
        byteBuffer.put(bArr);
        return iMin;
    }

    @Override // p153l.cpx0
    /* JADX INFO: renamed from: l */
    public final void mo111835l(long j) throws IOException {
        this.f93975a.position((int) j);
    }

    @Override // p153l.cpx0
    public final long zzb() throws IOException {
        return this.f93975a.position();
    }

    @Override // p153l.cpx0
    public final long zzc() throws IOException {
        return this.f93975a.limit();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
    }
}
