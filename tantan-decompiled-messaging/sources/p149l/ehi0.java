package p149l;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes7.dex */
public class ehi0 extends udk {

    /* JADX INFO: renamed from: a */
    private boolean f91329a;

    /* JADX INFO: renamed from: b */
    private short f91330b;

    @Override // p149l.udk
    /* JADX INFO: renamed from: a */
    public ByteBuffer mo98138a() {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(1);
        byteBufferAllocate.put((byte) (this.f91329a ? 128 : 0));
        byteBufferAllocate.rewind();
        return byteBufferAllocate;
    }

    @Override // p149l.udk
    /* JADX INFO: renamed from: b */
    public String mo98139b() {
        return "tele";
    }

    @Override // p149l.udk
    /* JADX INFO: renamed from: c */
    public void mo98140c(ByteBuffer byteBuffer) {
        this.f91329a = (byteBuffer.get() & 128) == 128;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ehi0 ehi0Var = (ehi0) obj;
        return this.f91329a == ehi0Var.f91329a && this.f91330b == ehi0Var.f91330b;
    }

    public int hashCode() {
        return ((this.f91329a ? 1 : 0) * 31) + this.f91330b;
    }

    public String toString() {
        return "TemporalLevelEntry{levelIndependentlyDecodable=" + this.f91329a + '}';
    }
}
