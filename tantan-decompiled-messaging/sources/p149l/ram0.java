package p149l;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes7.dex */
public class ram0 extends udk {

    /* JADX INFO: renamed from: a */
    private boolean f158530a;

    /* JADX INFO: renamed from: b */
    private short f158531b;

    @Override // p149l.udk
    /* JADX INFO: renamed from: a */
    public ByteBuffer mo98138a() {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(1);
        byteBufferAllocate.put((byte) ((this.f158531b & 127) | (this.f158530a ? 128 : 0)));
        byteBufferAllocate.rewind();
        return byteBufferAllocate;
    }

    @Override // p149l.udk
    /* JADX INFO: renamed from: b */
    public String mo98139b() {
        return "rap ";
    }

    @Override // p149l.udk
    /* JADX INFO: renamed from: c */
    public void mo98140c(ByteBuffer byteBuffer) {
        byte b = byteBuffer.get();
        this.f158530a = (b & 128) == 128;
        this.f158531b = (short) (b & 127);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ram0 ram0Var = (ram0) obj;
        return this.f158531b == ram0Var.f158531b && this.f158530a == ram0Var.f158530a;
    }

    public int hashCode() {
        return ((this.f158530a ? 1 : 0) * 31) + this.f158531b;
    }

    public String toString() {
        return "VisualRandomAccessEntry{numLeadingSamplesKnown=" + this.f158530a + ", numLeadingSamples=" + ((int) this.f158531b) + '}';
    }
}
