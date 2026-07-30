package p149l;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes7.dex */
public class apj0 extends udk {

    /* JADX INFO: renamed from: a */
    private ByteBuffer f71056a;

    /* JADX INFO: renamed from: b */
    private String f71057b;

    public apj0(String str) {
        this.f71057b = str;
    }

    @Override // p149l.udk
    /* JADX INFO: renamed from: a */
    public ByteBuffer mo98138a() {
        return this.f71056a.duplicate();
    }

    @Override // p149l.udk
    /* JADX INFO: renamed from: b */
    public String mo98139b() {
        return this.f71057b;
    }

    @Override // p149l.udk
    /* JADX INFO: renamed from: c */
    public void mo98140c(ByteBuffer byteBuffer) {
        this.f71056a = (ByteBuffer) byteBuffer.duplicate().rewind();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ByteBuffer byteBuffer = this.f71056a;
        ByteBuffer byteBuffer2 = ((apj0) obj).f71056a;
        return byteBuffer == null ? byteBuffer2 == null : byteBuffer.equals(byteBuffer2);
    }

    public int hashCode() {
        ByteBuffer byteBuffer = this.f71056a;
        if (byteBuffer != null) {
            return byteBuffer.hashCode();
        }
        return 0;
    }

    public String toString() {
        ByteBuffer byteBufferDuplicate = this.f71056a.duplicate();
        byteBufferDuplicate.rewind();
        byte[] bArr = new byte[byteBufferDuplicate.limit()];
        byteBufferDuplicate.get(bArr);
        return "UnknownEntry{content=" + qzk.m177232a(bArr) + '}';
    }
}
