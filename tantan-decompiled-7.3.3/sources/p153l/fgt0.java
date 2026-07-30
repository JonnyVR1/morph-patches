package p153l;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
public final class fgt0 {

    /* JADX INFO: renamed from: a */
    public long f98975a;

    /* JADX INFO: renamed from: a */
    public final long m125532a(ByteBuffer byteBuffer) {
        iyr0 iyr0Var;
        hyr0 hyr0Var;
        long j = this.f98975a;
        if (j > 0) {
            return j;
        }
        try {
            ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
            byteBufferDuplicate.flip();
            Iterator it = new dyr0(new egt0(byteBufferDuplicate), hgt0.f109440c).m105856m().iterator();
            while (true) {
                iyr0Var = null;
                if (!it.hasNext()) {
                    hyr0Var = null;
                    break;
                }
                fyr0 fyr0Var = (fyr0) it.next();
                if (fyr0Var instanceof hyr0) {
                    hyr0Var = (hyr0) fyr0Var;
                    break;
                }
            }
            for (fyr0 fyr0Var2 : hyr0Var.m105856m()) {
                if (fyr0Var2 instanceof iyr0) {
                    iyr0Var = (iyr0) fyr0Var2;
                    break;
                }
            }
            long jM142719h = (iyr0Var.m142719h() * 1000) / iyr0Var.m142720i();
            this.f98975a = jM142719h;
            return jM142719h;
        } catch (IOException | RuntimeException unused) {
            return 0L;
        }
    }
}
