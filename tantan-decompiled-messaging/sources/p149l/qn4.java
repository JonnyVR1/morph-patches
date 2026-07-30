package p149l;

import java.nio.ByteBuffer;
import java.util.UUID;

/* JADX INFO: loaded from: classes7.dex */
public class qn4 extends udk {

    /* JADX INFO: renamed from: a */
    private boolean f155379a;

    /* JADX INFO: renamed from: b */
    private byte f155380b;

    /* JADX INFO: renamed from: c */
    private UUID f155381c;

    @Override // p149l.udk
    /* JADX INFO: renamed from: a */
    public ByteBuffer mo98138a() {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(20);
        bzp.m104634f(byteBufferAllocate, this.f155379a ? 1 : 0);
        if (this.f155379a) {
            bzp.m104638j(byteBufferAllocate, this.f155380b);
            byteBufferAllocate.put(ihj0.m136207b(this.f155381c));
        } else {
            byteBufferAllocate.put(new byte[17]);
        }
        byteBufferAllocate.rewind();
        return byteBufferAllocate;
    }

    @Override // p149l.udk
    /* JADX INFO: renamed from: b */
    public String mo98139b() {
        return "seig";
    }

    @Override // p149l.udk
    /* JADX INFO: renamed from: c */
    public void mo98140c(ByteBuffer byteBuffer) {
        this.f155379a = yyp.m216557j(byteBuffer) == 1;
        this.f155380b = (byte) yyp.m216561n(byteBuffer);
        byte[] bArr = new byte[16];
        byteBuffer.get(bArr);
        this.f155381c = ihj0.m136206a(bArr);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        qn4 qn4Var = (qn4) obj;
        if (this.f155379a != qn4Var.f155379a || this.f155380b != qn4Var.f155380b) {
            return false;
        }
        UUID uuid = this.f155381c;
        UUID uuid2 = qn4Var.f155381c;
        return uuid == null ? uuid2 == null : uuid.equals(uuid2);
    }

    public int hashCode() {
        int i = (((this.f155379a ? 7 : 19) * 31) + this.f155380b) * 31;
        UUID uuid = this.f155381c;
        return i + (uuid != null ? uuid.hashCode() : 0);
    }

    public String toString() {
        return "CencSampleEncryptionInformationGroupEntry{isEncrypted=" + this.f155379a + ", ivSize=" + ((int) this.f155380b) + ", kid=" + this.f155381c + '}';
    }
}
