package p153l;

import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.zzby;
import java.io.EOFException;
import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public final class tfr0 {

    /* JADX INFO: renamed from: a */
    public final bgw0 f173989a = new bgw0(10);

    @Nullable
    /* JADX INFO: renamed from: a */
    public final zzby m190959a(qer0 qer0Var, @Nullable sjr0 sjr0Var) throws IOException {
        zzby zzbyVarM196447a = null;
        int i = 0;
        while (true) {
            try {
                ((fer0) qer0Var).mo125313c(this.f173989a.m104271m(), 0, 10, false);
                this.f173989a.m104269k(0);
                if (this.f173989a.m104247D() != 4801587) {
                    break;
                }
                this.f173989a.m104270l(3);
                int iM104244A = this.f173989a.m104244A();
                int i2 = iM104244A + 10;
                if (zzbyVarM196447a == null) {
                    byte[] bArr = new byte[i2];
                    System.arraycopy(this.f173989a.m104271m(), 0, bArr, 0, 10);
                    ((fer0) qer0Var).mo125313c(bArr, 10, iM104244A, false);
                    zzbyVarM196447a = ujr0.m196447a(bArr, i2, sjr0Var, new uir0());
                } else {
                    ((fer0) qer0Var).m125318j(iM104244A, false);
                }
                i += i2;
            } catch (EOFException unused) {
            }
        }
        qer0Var.zzj();
        ((fer0) qer0Var).m125318j(i, false);
        return zzbyVarM196447a;
    }
}
