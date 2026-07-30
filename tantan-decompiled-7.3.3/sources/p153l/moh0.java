package p153l;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes8.dex */
public class moh0 extends kgk {

    /* JADX INFO: renamed from: a */
    int f137827a;

    /* JADX INFO: renamed from: b */
    int f137828b;

    @Override // p153l.kgk
    /* JADX INFO: renamed from: a */
    public ByteBuffer mo117528a() {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(1);
        b1q.m101498j(byteBufferAllocate, this.f137828b + (this.f137827a << 6));
        return (ByteBuffer) byteBufferAllocate.rewind();
    }

    @Override // p153l.kgk
    /* JADX INFO: renamed from: b */
    public String mo117529b() {
        return "sync";
    }

    @Override // p153l.kgk
    /* JADX INFO: renamed from: c */
    public void mo117530c(ByteBuffer byteBuffer) {
        int iM213898n = y0q.m213898n(byteBuffer);
        this.f137827a = (iM213898n & 192) >> 6;
        this.f137828b = iM213898n & 63;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        moh0 moh0Var = (moh0) obj;
        return this.f137828b == moh0Var.f137828b && this.f137827a == moh0Var.f137827a;
    }

    public int hashCode() {
        return (this.f137827a * 31) + this.f137828b;
    }

    public String toString() {
        return "SyncSampleEntry{reserved=" + this.f137827a + ", nalUnitType=" + this.f137828b + '}';
    }
}
