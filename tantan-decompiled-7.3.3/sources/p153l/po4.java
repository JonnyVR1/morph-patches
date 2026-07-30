package p153l;

import java.nio.ByteBuffer;
import java.util.UUID;

/* JADX INFO: loaded from: classes7.dex */
public class po4 extends kgk {

    /* JADX INFO: renamed from: a */
    private boolean f153364a;

    /* JADX INFO: renamed from: b */
    private byte f153365b;

    /* JADX INFO: renamed from: c */
    private UUID f153366c;

    @Override // p153l.kgk
    /* JADX INFO: renamed from: a */
    public ByteBuffer mo117528a() {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(20);
        b1q.m101494f(byteBufferAllocate, this.f153364a ? 1 : 0);
        if (this.f153364a) {
            b1q.m101498j(byteBufferAllocate, this.f153365b);
            byteBufferAllocate.put(lqj0.m155494b(this.f153366c));
        } else {
            byteBufferAllocate.put(new byte[17]);
        }
        byteBufferAllocate.rewind();
        return byteBufferAllocate;
    }

    @Override // p153l.kgk
    /* JADX INFO: renamed from: b */
    public String mo117529b() {
        return "seig";
    }

    @Override // p153l.kgk
    /* JADX INFO: renamed from: c */
    public void mo117530c(ByteBuffer byteBuffer) {
        this.f153364a = y0q.m213894j(byteBuffer) == 1;
        this.f153365b = (byte) y0q.m213898n(byteBuffer);
        byte[] bArr = new byte[16];
        byteBuffer.get(bArr);
        this.f153366c = lqj0.m155493a(bArr);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        po4 po4Var = (po4) obj;
        if (this.f153364a != po4Var.f153364a || this.f153365b != po4Var.f153365b) {
            return false;
        }
        UUID uuid = this.f153366c;
        UUID uuid2 = po4Var.f153366c;
        return uuid == null ? uuid2 == null : uuid.equals(uuid2);
    }

    public int hashCode() {
        int i = (((this.f153364a ? 7 : 19) * 31) + this.f153365b) * 31;
        UUID uuid = this.f153366c;
        return i + (uuid != null ? uuid.hashCode() : 0);
    }

    public String toString() {
        return "CencSampleEncryptionInformationGroupEntry{isEncrypted=" + this.f153364a + ", ivSize=" + ((int) this.f153365b) + ", kid=" + this.f153366c + '}';
    }
}
