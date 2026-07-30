package p149l;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes8.dex */
public class fgh0 extends udk {

    /* JADX INFO: renamed from: a */
    int f97370a;

    /* JADX INFO: renamed from: b */
    int f97371b;

    @Override // p149l.udk
    /* JADX INFO: renamed from: a */
    public ByteBuffer mo98138a() {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(1);
        bzp.m104638j(byteBufferAllocate, this.f97371b + (this.f97370a << 6));
        return (ByteBuffer) byteBufferAllocate.rewind();
    }

    @Override // p149l.udk
    /* JADX INFO: renamed from: b */
    public String mo98139b() {
        return "sync";
    }

    @Override // p149l.udk
    /* JADX INFO: renamed from: c */
    public void mo98140c(ByteBuffer byteBuffer) {
        int iM216561n = yyp.m216561n(byteBuffer);
        this.f97370a = (iM216561n & 192) >> 6;
        this.f97371b = iM216561n & 63;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        fgh0 fgh0Var = (fgh0) obj;
        return this.f97371b == fgh0Var.f97371b && this.f97370a == fgh0Var.f97370a;
    }

    public int hashCode() {
        return (this.f97370a * 31) + this.f97371b;
    }

    public String toString() {
        return "SyncSampleEntry{reserved=" + this.f97370a + ", nalUnitType=" + this.f97371b + '}';
    }
}
