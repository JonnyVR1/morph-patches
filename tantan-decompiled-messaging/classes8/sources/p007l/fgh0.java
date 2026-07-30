package p007l;

import java.nio.ByteBuffer;
import l.bzp;
import l.udk;
import l.yyp;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public class fgh0 extends udk {

    /* JADX INFO: renamed from: a */
    int f2685a;

    /* JADX INFO: renamed from: b */
    int f2686b;

    /* JADX INFO: renamed from: a */
    public ByteBuffer m9123a() {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(1);
        bzp.j(byteBufferAllocate, this.f2686b + (this.f2685a << 6));
        return (ByteBuffer) byteBufferAllocate.rewind();
    }

    /* JADX INFO: renamed from: b */
    public String m9124b() {
        return "sync";
    }

    /* JADX INFO: renamed from: c */
    public void m9125c(ByteBuffer byteBuffer) {
        int iN = yyp.n(byteBuffer);
        this.f2685a = (iN & 192) >> 6;
        this.f2686b = iN & 63;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        fgh0 fgh0Var = (fgh0) obj;
        return this.f2686b == fgh0Var.f2686b && this.f2685a == fgh0Var.f2685a;
    }

    public int hashCode() {
        return (this.f2685a * 31) + this.f2686b;
    }

    public String toString() {
        return "SyncSampleEntry{reserved=" + this.f2685a + ", nalUnitType=" + this.f2686b + '}';
    }
}
