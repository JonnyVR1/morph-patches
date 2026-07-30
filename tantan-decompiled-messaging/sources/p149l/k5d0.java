package p149l;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes7.dex */
public class k5d0 extends udk {

    /* JADX INFO: renamed from: a */
    private short f121201a;

    @Override // p149l.udk
    /* JADX INFO: renamed from: a */
    public ByteBuffer mo98138a() {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(2);
        byteBufferAllocate.putShort(this.f121201a);
        byteBufferAllocate.rewind();
        return byteBufferAllocate;
    }

    @Override // p149l.udk
    /* JADX INFO: renamed from: b */
    public String mo98139b() {
        return "roll";
    }

    @Override // p149l.udk
    /* JADX INFO: renamed from: c */
    public void mo98140c(ByteBuffer byteBuffer) {
        this.f121201a = byteBuffer.getShort();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.f121201a == ((k5d0) obj).f121201a;
    }

    public int hashCode() {
        return this.f121201a;
    }
}
