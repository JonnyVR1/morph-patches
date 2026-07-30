package p149l;

import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.zip.Inflater;

/* JADX INFO: loaded from: classes6.dex */
public final class pgr0 implements rfr0 {

    /* JADX INFO: renamed from: a */
    public final v6w0 f148803a = new v6w0();

    /* JADX INFO: renamed from: b */
    public final v6w0 f148804b = new v6w0();

    /* JADX INFO: renamed from: c */
    public final ogr0 f148805c = new ogr0();

    /* JADX INFO: renamed from: d */
    @Nullable
    public Inflater f148806d;

    @Override // p149l.rfr0
    /* JADX INFO: renamed from: a */
    public final void mo101921a(byte[] bArr, int i, int i2, qfr0 qfr0Var, bbv0 bbv0Var) {
        this.f148803a.m197260i(bArr, i2 + i);
        this.f148803a.m197262k(i);
        v6w0 v6w0Var = this.f148803a;
        if (v6w0Var.m197268q() > 0 && v6w0Var.m197272u() == 120) {
            if (this.f148806d == null) {
                this.f148806d = new Inflater();
            }
            if (ggw0.m126065g(v6w0Var, this.f148804b, this.f148806d)) {
                v6w0 v6w0Var2 = this.f148804b;
                v6w0Var.m197260i(v6w0Var2.m197264m(), v6w0Var2.m197271t());
            }
        }
        this.f148805c.m164278e();
        ArrayList arrayList = new ArrayList();
        while (true) {
            v6w0 v6w0Var3 = this.f148803a;
            if (v6w0Var3.m197268q() < 3) {
                bbv0Var.zza(new kfr0(arrayList, -9223372036854775807L, -9223372036854775807L));
                return;
            }
            ogr0 ogr0Var = this.f148805c;
            int iM197271t = v6w0Var3.m197271t();
            int iM197238B = v6w0Var3.m197238B();
            int iM197242F = v6w0Var3.m197242F();
            int iM197270s = v6w0Var3.m197270s() + iM197242F;
            ovu0 ovu0VarM164277a = null;
            if (iM197270s > iM197271t) {
                v6w0Var3.m197262k(iM197271t);
            } else {
                if (iM197238B != 128) {
                    switch (iM197238B) {
                        case 20:
                            ogr0.m164276d(ogr0Var, v6w0Var3, iM197242F);
                            break;
                        case 21:
                            ogr0.m164274b(ogr0Var, v6w0Var3, iM197242F);
                            break;
                        case 22:
                            ogr0.m164275c(ogr0Var, v6w0Var3, iM197242F);
                            break;
                    }
                } else {
                    ovu0VarM164277a = ogr0Var.m164277a();
                    ogr0Var.m164278e();
                }
                v6w0Var3.m197262k(iM197270s);
            }
            if (ovu0VarM164277a != null) {
                arrayList.add(ovu0VarM164277a);
            }
        }
    }
}
