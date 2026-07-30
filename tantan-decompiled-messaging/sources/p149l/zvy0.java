package p149l;

import androidx.annotation.Nullable;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.internal.ads.AbstractC2116c3;
import com.google.android.gms.internal.ads.zzgaa;

/* JADX INFO: loaded from: classes6.dex */
public final class zvy0 extends bwy0 implements Comparable {

    /* JADX INFO: renamed from: e */
    public final int f205075e;

    /* JADX INFO: renamed from: f */
    public final boolean f205076f;

    /* JADX INFO: renamed from: g */
    public final boolean f205077g;

    /* JADX INFO: renamed from: h */
    public final boolean f205078h;

    /* JADX INFO: renamed from: i */
    public final int f205079i;

    /* JADX INFO: renamed from: j */
    public final int f205080j;

    /* JADX INFO: renamed from: k */
    public final int f205081k;

    /* JADX INFO: renamed from: l */
    public final int f205082l;

    /* JADX INFO: renamed from: m */
    public final boolean f205083m;

    /* JADX WARN: Multi-variable type inference failed */
    public zvy0(int i, ntt0 ntt0Var, int i2, bvy0 bvy0Var, int i3, @Nullable String str) {
        int iM123579l;
        super(i, ntt0Var, i2);
        int i4 = 0;
        this.f205076f = fwy0.m123585t(i3, false);
        int i5 = this.f77721d.f133884d;
        int i6 = bvy0Var.f131180v;
        this.f205077g = 1 == (i5 & 1);
        this.f205078h = (i5 & 2) != 0;
        zzgaa zzgaaVarZzm = bvy0Var.f131178t.isEmpty() ? zzgaa.zzm("") : bvy0Var.f131178t;
        int i7 = 0;
        while (true) {
            if (i7 >= zzgaaVarZzm.size()) {
                i7 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
                iM123579l = 0;
                break;
            } else {
                iM123579l = fwy0.m123579l(this.f77721d, (String) zzgaaVarZzm.get(i7), false);
                if (iM123579l > 0) {
                    break;
                } else {
                    i7++;
                }
            }
        }
        this.f205079i = i7;
        this.f205080j = iM123579l;
        int iM123578k = fwy0.m123578k(this.f77721d.f133885e, bvy0Var.f131179u);
        this.f205081k = iM123578k;
        this.f205083m = (this.f77721d.f133885e & 1088) != 0;
        int iM123579l2 = fwy0.m123579l(this.f77721d, str, fwy0.m123582p(str) == null);
        this.f205082l = iM123579l2;
        boolean z = iM123579l > 0 || (bvy0Var.f131178t.isEmpty() && iM123578k > 0) || this.f205077g || (this.f205078h && iM123579l2 > 0);
        if (fwy0.m123585t(i3, bvy0Var.f77538v0) && z) {
            i4 = 1;
        }
        this.f205075e = i4;
    }

    @Override // p149l.bwy0
    /* JADX INFO: renamed from: a */
    public final int mo104256a() {
        return this.f205075e;
    }

    @Override // p149l.bwy0
    /* JADX INFO: renamed from: b */
    public final /* bridge */ /* synthetic */ boolean mo104257b(bwy0 bwy0Var) {
        return false;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public final int compareTo(zvy0 zvy0Var) {
        ahw0 ahw0VarMo96744b = ahw0.m96742j().mo96747e(this.f205076f, zvy0Var.f205076f).mo96746d(Integer.valueOf(this.f205079i), Integer.valueOf(zvy0Var.f205079i), AbstractC2116c3.zzc().zza()).mo96744b(this.f205080j, zvy0Var.f205080j).mo96744b(this.f205081k, zvy0Var.f205081k).mo96747e(this.f205077g, zvy0Var.f205077g).mo96746d(Boolean.valueOf(this.f205078h), Boolean.valueOf(zvy0Var.f205078h), this.f205080j == 0 ? AbstractC2116c3.zzc() : AbstractC2116c3.zzc().zza()).mo96744b(this.f205082l, zvy0Var.f205082l);
        if (this.f205081k == 0) {
            ahw0VarMo96744b = ahw0VarMo96744b.mo96748f(this.f205083m, zvy0Var.f205083m);
        }
        return ahw0VarMo96744b.mo96743a();
    }
}
