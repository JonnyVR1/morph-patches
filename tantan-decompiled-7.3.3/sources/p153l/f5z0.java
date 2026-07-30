package p153l;

import androidx.annotation.Nullable;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.internal.ads.AbstractC2139c3;
import com.google.android.gms.internal.ads.zzgaa;

/* JADX INFO: loaded from: classes6.dex */
public final class f5z0 extends h5z0 implements Comparable {

    /* JADX INFO: renamed from: e */
    public final int f97356e;

    /* JADX INFO: renamed from: f */
    public final boolean f97357f;

    /* JADX INFO: renamed from: g */
    public final boolean f97358g;

    /* JADX INFO: renamed from: h */
    public final boolean f97359h;

    /* JADX INFO: renamed from: i */
    public final int f97360i;

    /* JADX INFO: renamed from: j */
    public final int f97361j;

    /* JADX INFO: renamed from: k */
    public final int f97362k;

    /* JADX INFO: renamed from: l */
    public final int f97363l;

    /* JADX INFO: renamed from: m */
    public final boolean f97364m;

    /* JADX WARN: Multi-variable type inference failed */
    public f5z0(int i, t2u0 t2u0Var, int i2, h4z0 h4z0Var, int i3, @Nullable String str) {
        int iM153028l;
        super(i, t2u0Var, i2);
        int i4 = 0;
        this.f97357f = l5z0.m153034t(i3, false);
        int i5 = this.f107992d.f170243d;
        int i6 = h4z0Var.f167341v;
        this.f97358g = 1 == (i5 & 1);
        this.f97359h = (i5 & 2) != 0;
        zzgaa zzgaaVarZzm = h4z0Var.f167339t.isEmpty() ? zzgaa.zzm("") : h4z0Var.f167339t;
        int i7 = 0;
        while (true) {
            if (i7 >= zzgaaVarZzm.size()) {
                i7 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
                iM153028l = 0;
                break;
            } else {
                iM153028l = l5z0.m153028l(this.f107992d, (String) zzgaaVarZzm.get(i7), false);
                if (iM153028l > 0) {
                    break;
                } else {
                    i7++;
                }
            }
        }
        this.f97360i = i7;
        this.f97361j = iM153028l;
        int iM153027k = l5z0.m153027k(this.f107992d.f170244e, h4z0Var.f167340u);
        this.f97362k = iM153027k;
        this.f97364m = (this.f107992d.f170244e & 1088) != 0;
        int iM153028l2 = l5z0.m153028l(this.f107992d, str, l5z0.m153031p(str) == null);
        this.f97363l = iM153028l2;
        boolean z = iM153028l > 0 || (h4z0Var.f167339t.isEmpty() && iM153027k > 0) || this.f97358g || (this.f97359h && iM153028l2 > 0);
        if (l5z0.m153034t(i3, h4z0Var.f107873v0) && z) {
            i4 = 1;
        }
        this.f97356e = i4;
    }

    @Override // p153l.h5z0
    /* JADX INFO: renamed from: a */
    public final int mo96008a() {
        return this.f97356e;
    }

    @Override // p153l.h5z0
    /* JADX INFO: renamed from: b */
    public final /* bridge */ /* synthetic */ boolean mo96009b(h5z0 h5z0Var) {
        return false;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public final int compareTo(f5z0 f5z0Var) {
        gqw0 gqw0VarMo117578b = gqw0.m131503j().mo117581e(this.f97357f, f5z0Var.f97357f).mo117580d(Integer.valueOf(this.f97360i), Integer.valueOf(f5z0Var.f97360i), AbstractC2139c3.zzc().zza()).mo117578b(this.f97361j, f5z0Var.f97361j).mo117578b(this.f97362k, f5z0Var.f97362k).mo117581e(this.f97358g, f5z0Var.f97358g).mo117580d(Boolean.valueOf(this.f97359h), Boolean.valueOf(f5z0Var.f97359h), this.f97361j == 0 ? AbstractC2139c3.zzc() : AbstractC2139c3.zzc().zza()).mo117578b(this.f97363l, f5z0Var.f97363l);
        if (this.f97362k == 0) {
            gqw0VarMo117578b = gqw0VarMo117578b.mo117582f(this.f97364m, f5z0Var.f97364m);
        }
        return gqw0VarMo117578b.mo117577a();
    }
}
