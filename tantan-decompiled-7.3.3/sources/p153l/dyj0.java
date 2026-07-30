package p153l;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes7.dex */
public class dyj0 extends kgk {

    /* JADX INFO: renamed from: a */
    private ByteBuffer f91258a;

    /* JADX INFO: renamed from: b */
    private String f91259b;

    public dyj0(String str) {
        this.f91259b = str;
    }

    @Override // p153l.kgk
    /* JADX INFO: renamed from: a */
    public ByteBuffer mo117528a() {
        return this.f91258a.duplicate();
    }

    @Override // p153l.kgk
    /* JADX INFO: renamed from: b */
    public String mo117529b() {
        return this.f91259b;
    }

    @Override // p153l.kgk
    /* JADX INFO: renamed from: c */
    public void mo117530c(ByteBuffer byteBuffer) {
        this.f91258a = (ByteBuffer) byteBuffer.duplicate().rewind();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ByteBuffer byteBuffer = this.f91258a;
        ByteBuffer byteBuffer2 = ((dyj0) obj).f91258a;
        return byteBuffer == null ? byteBuffer2 == null : byteBuffer.equals(byteBuffer2);
    }

    public int hashCode() {
        ByteBuffer byteBuffer = this.f91258a;
        if (byteBuffer != null) {
            return byteBuffer.hashCode();
        }
        return 0;
    }

    public String toString() {
        ByteBuffer byteBufferDuplicate = this.f91258a.duplicate();
        byteBufferDuplicate.rewind();
        byte[] bArr = new byte[byteBufferDuplicate.limit()];
        byteBufferDuplicate.get(bArr);
        return "UnknownEntry{content=" + g2l.m128633a(bArr) + '}';
    }
}
