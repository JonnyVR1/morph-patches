package p153l;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes7.dex */
public class vjm0 extends kgk {

    /* JADX INFO: renamed from: a */
    private boolean f184428a;

    /* JADX INFO: renamed from: b */
    private short f184429b;

    @Override // p153l.kgk
    /* JADX INFO: renamed from: a */
    public ByteBuffer mo117528a() {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(1);
        byteBufferAllocate.put((byte) ((this.f184429b & 127) | (this.f184428a ? 128 : 0)));
        byteBufferAllocate.rewind();
        return byteBufferAllocate;
    }

    @Override // p153l.kgk
    /* JADX INFO: renamed from: b */
    public String mo117529b() {
        return "rap ";
    }

    @Override // p153l.kgk
    /* JADX INFO: renamed from: c */
    public void mo117530c(ByteBuffer byteBuffer) {
        byte b = byteBuffer.get();
        this.f184428a = (b & 128) == 128;
        this.f184429b = (short) (b & 127);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        vjm0 vjm0Var = (vjm0) obj;
        return this.f184429b == vjm0Var.f184429b && this.f184428a == vjm0Var.f184428a;
    }

    public int hashCode() {
        return ((this.f184428a ? 1 : 0) * 31) + this.f184429b;
    }

    public String toString() {
        return "VisualRandomAccessEntry{numLeadingSamplesKnown=" + this.f184428a + ", numLeadingSamples=" + ((int) this.f184429b) + '}';
    }
}
