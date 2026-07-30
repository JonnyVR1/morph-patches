package p153l;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes7.dex */
public class ndd0 extends kgk {

    /* JADX INFO: renamed from: a */
    private short f141479a;

    @Override // p153l.kgk
    /* JADX INFO: renamed from: a */
    public ByteBuffer mo117528a() {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(2);
        byteBufferAllocate.putShort(this.f141479a);
        byteBufferAllocate.rewind();
        return byteBufferAllocate;
    }

    @Override // p153l.kgk
    /* JADX INFO: renamed from: b */
    public String mo117529b() {
        return "roll";
    }

    @Override // p153l.kgk
    /* JADX INFO: renamed from: c */
    public void mo117530c(ByteBuffer byteBuffer) {
        this.f141479a = byteBuffer.getShort();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.f141479a == ((ndd0) obj).f141479a;
    }

    public int hashCode() {
        return this.f141479a;
    }
}
