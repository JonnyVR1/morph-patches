package p149l;

import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.zzby;
import java.io.EOFException;
import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public final class n6r0 {

    /* JADX INFO: renamed from: a */
    public final v6w0 f137440a = new v6w0(10);

    @Nullable
    /* JADX INFO: renamed from: a */
    public final zzby m158067a(k5r0 k5r0Var, @Nullable mar0 mar0Var) throws IOException {
        zzby zzbyVarM163364a = null;
        int i = 0;
        while (true) {
            try {
                ((z4r0) k5r0Var).mo140051c(this.f137440a.m197264m(), 0, 10, false);
                this.f137440a.m197262k(0);
                if (this.f137440a.m197240D() != 4801587) {
                    break;
                }
                this.f137440a.m197263l(3);
                int iM197237A = this.f137440a.m197237A();
                int i2 = iM197237A + 10;
                if (zzbyVarM163364a == null) {
                    byte[] bArr = new byte[i2];
                    System.arraycopy(this.f137440a.m197264m(), 0, bArr, 0, 10);
                    ((z4r0) k5r0Var).mo140051c(bArr, 10, iM197237A, false);
                    zzbyVarM163364a = oar0.m163364a(bArr, i2, mar0Var, new o9r0());
                } else {
                    ((z4r0) k5r0Var).m217118j(iM197237A, false);
                }
                i += i2;
            } catch (EOFException unused) {
            }
        }
        k5r0Var.zzj();
        ((z4r0) k5r0Var).m217118j(i, false);
        return zzbyVarM163364a;
    }
}
