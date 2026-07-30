package p153l;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes7.dex */
public class eqi0 extends kgk {

    /* JADX INFO: renamed from: a */
    private boolean f95345a;

    /* JADX INFO: renamed from: b */
    private short f95346b;

    @Override // p153l.kgk
    /* JADX INFO: renamed from: a */
    public ByteBuffer mo117528a() {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(1);
        byteBufferAllocate.put((byte) (this.f95345a ? 128 : 0));
        byteBufferAllocate.rewind();
        return byteBufferAllocate;
    }

    @Override // p153l.kgk
    /* JADX INFO: renamed from: b */
    public String mo117529b() {
        return "tele";
    }

    @Override // p153l.kgk
    /* JADX INFO: renamed from: c */
    public void mo117530c(ByteBuffer byteBuffer) {
        this.f95345a = (byteBuffer.get() & 128) == 128;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        eqi0 eqi0Var = (eqi0) obj;
        return this.f95345a == eqi0Var.f95345a && this.f95346b == eqi0Var.f95346b;
    }

    public int hashCode() {
        return ((this.f95345a ? 1 : 0) * 31) + this.f95346b;
    }

    public String toString() {
        return "TemporalLevelEntry{levelIndependentlyDecodable=" + this.f95345a + '}';
    }
}
