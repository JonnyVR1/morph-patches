package p153l;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.internal.ads.AbstractC2139c3;

/* JADX INFO: loaded from: classes6.dex */
public final class k5z0 extends h5z0 {

    /* JADX INFO: renamed from: e */
    public final boolean f124134e;

    /* JADX INFO: renamed from: f */
    public final h4z0 f124135f;

    /* JADX INFO: renamed from: g */
    public final boolean f124136g;

    /* JADX INFO: renamed from: h */
    public final boolean f124137h;

    /* JADX INFO: renamed from: i */
    public final int f124138i;

    /* JADX INFO: renamed from: j */
    public final int f124139j;

    /* JADX INFO: renamed from: k */
    public final int f124140k;

    /* JADX INFO: renamed from: l */
    public final int f124141l;

    /* JADX INFO: renamed from: m */
    public final boolean f124142m;

    /* JADX INFO: renamed from: n */
    public final int f124143n;

    /* JADX INFO: renamed from: o */
    public final boolean f124144o;

    /* JADX INFO: renamed from: p */
    public final boolean f124145p;

    /* JADX INFO: renamed from: q */
    public final int f124146q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Code duplicated, block: B:13:0x0025  */
    /* JADX WARN: Code duplicated, block: B:21:0x0036  */
    public k5z0(int i, t2u0 t2u0Var, int i2, h4z0 h4z0Var, int i3, int i4, boolean z) {
        boolean z2;
        boolean z3;
        int i5;
        boolean z4;
        sqr0 sqr0Var;
        int i6;
        int i7;
        int i8;
        super(i, t2u0Var, 0);
        int i9 = 0;
        this.f124135f = h4z0Var;
        int i10 = true != h4z0Var.f107864m0 ? 16 : 24;
        if (z) {
            sqr0 sqr0Var2 = this.f107992d;
            int i11 = sqr0Var2.f170256q;
            float f = sqr0Var2.f170258s;
            if (f == -1.0f || f <= 2.1474836E9f) {
                z2 = true;
            } else {
                z2 = false;
            }
        } else {
            z2 = false;
        }
        this.f124134e = z2;
        if (!z || (((i6 = (sqr0Var = this.f107992d).f170256q) != -1 && i6 < 0) || ((i7 = sqr0Var.f170257r) != -1 && i7 < 0))) {
            z3 = false;
        } else {
            float f2 = sqr0Var.f170258s;
            if ((f2 == -1.0f || f2 >= 0.0f) && ((i8 = sqr0Var.f170247h) == -1 || i8 >= 0)) {
                z3 = true;
            } else {
                z3 = false;
            }
        }
        this.f124136g = z3;
        this.f124137h = l5z0.m153034t(i3, false);
        sqr0 sqr0Var3 = this.f107992d;
        this.f124138i = sqr0Var3.f170247h;
        this.f124139j = sqr0Var3.m187558a();
        this.f124141l = l5z0.m153027k(this.f107992d.f170244e, 0);
        int i12 = this.f107992d.f170244e;
        this.f124142m = i12 == 0 || (i12 & 1) != 0;
        int i13 = 0;
        while (true) {
            if (i13 >= h4z0Var.f167331l.size()) {
                i13 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
                break;
            }
            String str = this.f107992d.f170251l;
            if (str != null && str.equals(h4z0Var.f167331l.get(i13))) {
                break;
            } else {
                i13++;
            }
        }
        this.f124140k = i13;
        this.f124144o = (i3 & 384) == 128;
        this.f124145p = (i3 & 64) == 64;
        sqr0 sqr0Var4 = this.f107992d;
        String str2 = sqr0Var4.f170251l;
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
        this.f124146q = i5;
        if ((sqr0Var4.f170244e & 16384) == 0) {
            h4z0 h4z0Var2 = this.f124135f;
            if (l5z0.m153034t(i3, h4z0Var2.f107873v0) && ((z4 = this.f124134e) || h4z0Var2.f107862k0)) {
                i9 = (l5z0.m153034t(i3, false) && this.f124136g && z4 && sqr0Var4.f170247h != -1 && (i10 & i3) != 0) ? 2 : 1;
            }
        }
        this.f124143n = i9;
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ int m148508f(k5z0 k5z0Var, k5z0 k5z0Var2) {
        AbstractC2139c3 abstractC2139c3Zza = (k5z0Var.f124134e && k5z0Var.f124137h) ? l5z0.f130209k : l5z0.f130209k.zza();
        gqw0 gqw0VarM131503j = gqw0.m131503j();
        Integer numValueOf = Integer.valueOf(k5z0Var.f124138i);
        Integer numValueOf2 = Integer.valueOf(k5z0Var2.f124138i);
        boolean z = k5z0Var.f124135f.f167344y;
        return gqw0VarM131503j.mo117580d(numValueOf, numValueOf2, l5z0.f130210l).mo117580d(Integer.valueOf(k5z0Var.f124139j), Integer.valueOf(k5z0Var2.f124139j), abstractC2139c3Zza).mo117580d(Integer.valueOf(k5z0Var.f124138i), Integer.valueOf(k5z0Var2.f124138i), abstractC2139c3Zza).mo117577a();
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ int m148509g(k5z0 k5z0Var, k5z0 k5z0Var2) {
        gqw0 gqw0VarMo117580d = gqw0.m131503j().mo117581e(k5z0Var.f124137h, k5z0Var2.f124137h).mo117578b(k5z0Var.f124141l, k5z0Var2.f124141l).mo117581e(k5z0Var.f124142m, k5z0Var2.f124142m).mo117581e(k5z0Var.f124134e, k5z0Var2.f124134e).mo117581e(k5z0Var.f124136g, k5z0Var2.f124136g).mo117580d(Integer.valueOf(k5z0Var.f124140k), Integer.valueOf(k5z0Var2.f124140k), AbstractC2139c3.zzc().zza());
        boolean z = k5z0Var.f124144o;
        gqw0 gqw0VarMo117581e = gqw0VarMo117580d.mo117581e(z, k5z0Var2.f124144o);
        boolean z2 = k5z0Var.f124145p;
        gqw0 gqw0VarMo117581e2 = gqw0VarMo117581e.mo117581e(z2, k5z0Var2.f124145p);
        if (z && z2) {
            gqw0VarMo117581e2 = gqw0VarMo117581e2.mo117578b(k5z0Var.f124146q, k5z0Var2.f124146q);
        }
        return gqw0VarMo117581e2.mo117577a();
    }

    @Override // p153l.h5z0
    /* JADX INFO: renamed from: a */
    public final int mo96008a() {
        return this.f124143n;
    }

    @Override // p153l.h5z0
    /* JADX INFO: renamed from: b */
    public final /* bridge */ /* synthetic */ boolean mo96009b(h5z0 h5z0Var) {
        k5z0 k5z0Var = (k5z0) h5z0Var;
        if (!mpw0.m159408f(this.f107992d.f170251l, k5z0Var.f107992d.f170251l)) {
            return false;
        }
        boolean z = this.f124135f.f107865n0;
        return this.f124144o == k5z0Var.f124144o && this.f124145p == k5z0Var.f124145p;
    }
}
