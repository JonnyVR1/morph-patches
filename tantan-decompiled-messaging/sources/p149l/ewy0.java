package p149l;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.internal.ads.AbstractC2116c3;

/* JADX INFO: loaded from: classes6.dex */
public final class ewy0 extends bwy0 {

    /* JADX INFO: renamed from: e */
    public final boolean f93547e;

    /* JADX INFO: renamed from: f */
    public final bvy0 f93548f;

    /* JADX INFO: renamed from: g */
    public final boolean f93549g;

    /* JADX INFO: renamed from: h */
    public final boolean f93550h;

    /* JADX INFO: renamed from: i */
    public final int f93551i;

    /* JADX INFO: renamed from: j */
    public final int f93552j;

    /* JADX INFO: renamed from: k */
    public final int f93553k;

    /* JADX INFO: renamed from: l */
    public final int f93554l;

    /* JADX INFO: renamed from: m */
    public final boolean f93555m;

    /* JADX INFO: renamed from: n */
    public final int f93556n;

    /* JADX INFO: renamed from: o */
    public final boolean f93557o;

    /* JADX INFO: renamed from: p */
    public final boolean f93558p;

    /* JADX INFO: renamed from: q */
    public final int f93559q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Code duplicated, block: B:13:0x0025  */
    /* JADX WARN: Code duplicated, block: B:21:0x0036  */
    public ewy0(int i, ntt0 ntt0Var, int i2, bvy0 bvy0Var, int i3, int i4, boolean z) {
        boolean z2;
        boolean z3;
        int i5;
        boolean z4;
        mhr0 mhr0Var;
        int i6;
        int i7;
        int i8;
        super(i, ntt0Var, 0);
        int i9 = 0;
        this.f93548f = bvy0Var;
        int i10 = true != bvy0Var.f77529m0 ? 16 : 24;
        if (z) {
            mhr0 mhr0Var2 = this.f77721d;
            int i11 = mhr0Var2.f133897q;
            float f = mhr0Var2.f133899s;
            if (f == -1.0f || f <= 2.1474836E9f) {
                z2 = true;
            } else {
                z2 = false;
            }
        } else {
            z2 = false;
        }
        this.f93547e = z2;
        if (!z || (((i6 = (mhr0Var = this.f77721d).f133897q) != -1 && i6 < 0) || ((i7 = mhr0Var.f133898r) != -1 && i7 < 0))) {
            z3 = false;
        } else {
            float f2 = mhr0Var.f133899s;
            if ((f2 == -1.0f || f2 >= 0.0f) && ((i8 = mhr0Var.f133888h) == -1 || i8 >= 0)) {
                z3 = true;
            } else {
                z3 = false;
            }
        }
        this.f93549g = z3;
        this.f93550h = fwy0.m123585t(i3, false);
        mhr0 mhr0Var3 = this.f77721d;
        this.f93551i = mhr0Var3.f133888h;
        this.f93552j = mhr0Var3.m154633a();
        this.f93554l = fwy0.m123578k(this.f77721d.f133885e, 0);
        int i12 = this.f77721d.f133885e;
        this.f93555m = i12 == 0 || (i12 & 1) != 0;
        int i13 = 0;
        while (true) {
            if (i13 >= bvy0Var.f131170l.size()) {
                i13 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
                break;
            }
            String str = this.f77721d.f133892l;
            if (str != null && str.equals(bvy0Var.f131170l.get(i13))) {
                break;
            } else {
                i13++;
            }
        }
        this.f93553k = i13;
        this.f93557o = (i3 & 384) == 128;
        this.f93558p = (i3 & 64) == 64;
        mhr0 mhr0Var4 = this.f77721d;
        String str2 = mhr0Var4.f133892l;
        if (str2 != null) {
            switch (str2) {
                case "video/dolby-vision":
                    i5 = 5;
                    break;
                case "video/av01":
                    i5 = 4;
                    break;
                case "video/hevc":
                    i5 = 3;
                    break;
                case "video/avc":
                    i5 = 1;
                    break;
                case "video/x-vnd.on2.vp9":
                    i5 = 2;
                    break;
                default:
                    i5 = 0;
                    break;
            }
        } else {
            i5 = 0;
        }
        this.f93559q = i5;
        if ((mhr0Var4.f133885e & 16384) == 0) {
            bvy0 bvy0Var2 = this.f93548f;
            if (fwy0.m123585t(i3, bvy0Var2.f77538v0) && ((z4 = this.f93547e) || bvy0Var2.f77527k0)) {
                i9 = (fwy0.m123585t(i3, false) && this.f93549g && z4 && mhr0Var4.f133888h != -1 && (i10 & i3) != 0) ? 2 : 1;
            }
        }
        this.f93556n = i9;
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ int m118527f(ewy0 ewy0Var, ewy0 ewy0Var2) {
        AbstractC2116c3 abstractC2116c3Zza = (ewy0Var.f93547e && ewy0Var.f93550h) ? fwy0.f99706k : fwy0.f99706k.zza();
        ahw0 ahw0VarM96742j = ahw0.m96742j();
        Integer numValueOf = Integer.valueOf(ewy0Var.f93551i);
        Integer numValueOf2 = Integer.valueOf(ewy0Var2.f93551i);
        boolean z = ewy0Var.f93548f.f131183y;
        return ahw0VarM96742j.mo96746d(numValueOf, numValueOf2, fwy0.f99707l).mo96746d(Integer.valueOf(ewy0Var.f93552j), Integer.valueOf(ewy0Var2.f93552j), abstractC2116c3Zza).mo96746d(Integer.valueOf(ewy0Var.f93551i), Integer.valueOf(ewy0Var2.f93551i), abstractC2116c3Zza).mo96743a();
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ int m118528g(ewy0 ewy0Var, ewy0 ewy0Var2) {
        ahw0 ahw0VarMo96746d = ahw0.m96742j().mo96747e(ewy0Var.f93550h, ewy0Var2.f93550h).mo96744b(ewy0Var.f93554l, ewy0Var2.f93554l).mo96747e(ewy0Var.f93555m, ewy0Var2.f93555m).mo96747e(ewy0Var.f93547e, ewy0Var2.f93547e).mo96747e(ewy0Var.f93549g, ewy0Var2.f93549g).mo96746d(Integer.valueOf(ewy0Var.f93553k), Integer.valueOf(ewy0Var2.f93553k), AbstractC2116c3.zzc().zza());
        boolean z = ewy0Var.f93557o;
        ahw0 ahw0VarMo96747e = ahw0VarMo96746d.mo96747e(z, ewy0Var2.f93557o);
        boolean z2 = ewy0Var.f93558p;
        ahw0 ahw0VarMo96747e2 = ahw0VarMo96747e.mo96747e(z2, ewy0Var2.f93558p);
        if (z && z2) {
            ahw0VarMo96747e2 = ahw0VarMo96747e2.mo96744b(ewy0Var.f93559q, ewy0Var2.f93559q);
        }
        return ahw0VarMo96747e2.mo96743a();
    }

    @Override // p149l.bwy0
    /* JADX INFO: renamed from: a */
    public final int mo104256a() {
        return this.f93556n;
    }

    @Override // p149l.bwy0
    /* JADX INFO: renamed from: b */
    public final /* bridge */ /* synthetic */ boolean mo104257b(bwy0 bwy0Var) {
        ewy0 ewy0Var = (ewy0) bwy0Var;
        if (!ggw0.m126064f(this.f77721d.f133892l, ewy0Var.f77721d.f133892l)) {
            return false;
        }
        boolean z = this.f93548f.f77530n0;
        return this.f93557o == ewy0Var.f93557o && this.f93558p == ewy0Var.f93558p;
    }
}
