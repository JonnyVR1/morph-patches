package p149l;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
public final class z6t0 {

    /* JADX INFO: renamed from: a */
    public long f201958a;

    /* JADX INFO: renamed from: a */
    public final long m217420a(ByteBuffer byteBuffer) {
        cpr0 cpr0Var;
        bpr0 bpr0Var;
        long j = this.f201958a;
        if (j > 0) {
            return j;
        }
        try {
            ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
            byteBufferDuplicate.flip();
            Iterator it = new xor0(new y6t0(byteBufferDuplicate), b7t0.f74017c).m198299m().iterator();
            while (true) {
                cpr0Var = null;
                if (!it.hasNext()) {
                    bpr0Var = null;
                    break;
                }
                zor0 zor0Var = (zor0) it.next();
                if (zor0Var instanceof bpr0) {
                    bpr0Var = (bpr0) zor0Var;
                    break;
                }
            }
            for (zor0 zor0Var2 : bpr0Var.m198299m()) {
                if (zor0Var2 instanceof cpr0) {
                    cpr0Var = (cpr0) zor0Var2;
                    break;
                }
            }
            long jM108174h = (cpr0Var.m108174h() * 1000) / cpr0Var.m108175i();
            this.f201958a = jM108174h;
            return jM108174h;
        } catch (IOException | RuntimeException unused) {
            return 0L;
        }
    }
}
