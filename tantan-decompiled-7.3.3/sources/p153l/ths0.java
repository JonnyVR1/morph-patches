package p153l;

import java.util.Arrays;
import java.util.Comparator;

/* JADX INFO: loaded from: classes6.dex */
public final class ths0 implements Comparator<ewr0> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ mpr0 f174413a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ gix0 f174414b;

    public ths0(mpr0 mpr0Var, gix0 gix0Var) {
        this.f174413a = mpr0Var;
        this.f174414b = gix0Var;
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(ewr0 ewr0Var, ewr0 ewr0Var2) {
        ewr0 ewr0Var3 = ewr0Var;
        ewr0 ewr0Var4 = ewr0Var2;
        mpr0 mpr0Var = this.f174413a;
        gix0 gix0Var = this.f174414b;
        if (ewr0Var3 instanceof w4s0) {
            return !(ewr0Var4 instanceof w4s0) ? 1 : 0;
        }
        if (ewr0Var4 instanceof w4s0) {
            return -1;
        }
        return mpr0Var == null ? ewr0Var3.zzf().compareTo(ewr0Var4.zzf()) : (int) tqw0.m192367a(mpr0Var.mo107102d(gix0Var, Arrays.asList(ewr0Var3, ewr0Var4)).zze().doubleValue());
    }
}
