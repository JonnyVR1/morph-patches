package p149l;

import android.content.res.Configuration;
import android.content.res.Resources;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.clevertap.android.sdk.Constants;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.internal.ads.AbstractC2116c3;

/* JADX INFO: loaded from: classes6.dex */
public final class uuy0 extends bwy0 implements Comparable {

    /* JADX INFO: renamed from: e */
    public final int f178470e;

    /* JADX INFO: renamed from: f */
    public final boolean f178471f;

    /* JADX INFO: renamed from: g */
    @Nullable
    public final String f178472g;

    /* JADX INFO: renamed from: h */
    public final bvy0 f178473h;

    /* JADX INFO: renamed from: i */
    public final boolean f178474i;

    /* JADX INFO: renamed from: j */
    public final int f178475j;

    /* JADX INFO: renamed from: k */
    public final int f178476k;

    /* JADX INFO: renamed from: l */
    public final int f178477l;

    /* JADX INFO: renamed from: m */
    public final boolean f178478m;

    /* JADX INFO: renamed from: n */
    public final int f178479n;

    /* JADX INFO: renamed from: o */
    public final int f178480o;

    /* JADX INFO: renamed from: p */
    public final boolean f178481p;

    /* JADX INFO: renamed from: q */
    public final int f178482q;

    /* JADX INFO: renamed from: r */
    public final int f178483r;

    /* JADX INFO: renamed from: s */
    public final int f178484s;

    /* JADX INFO: renamed from: t */
    public final int f178485t;

    /* JADX INFO: renamed from: u */
    public final boolean f178486u;

    /* JADX INFO: renamed from: v */
    public final boolean f178487v;

    /* JADX WARN: Multi-variable type inference failed */
    public uuy0(int i, ntt0 ntt0Var, int i2, bvy0 bvy0Var, int i3, boolean z, ofw0 ofw0Var, int i4) {
        int i5;
        int iM123579l;
        int iM123579l2;
        boolean z2;
        super(i, ntt0Var, i2);
        this.f178473h = bvy0Var;
        int i6 = 1;
        int i7 = true != bvy0Var.f77536t0 ? 16 : 24;
        this.f178472g = fwy0.m123582p(this.f77721d.f133883c);
        this.f178474i = fwy0.m123585t(i3, false);
        int i8 = 0;
        while (true) {
            int size = bvy0Var.f131172n.size();
            i5 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
            if (i8 >= size) {
                iM123579l = 0;
                i8 = Integer.MAX_VALUE;
                break;
            } else {
                iM123579l = fwy0.m123579l(this.f77721d, (String) bvy0Var.f131172n.get(i8), false);
                if (iM123579l > 0) {
                    break;
                } else {
                    i8++;
                }
            }
        }
        this.f178476k = i8;
        this.f178475j = iM123579l;
        this.f178477l = fwy0.m123578k(this.f77721d.f133885e, 0);
        mhr0 mhr0Var = this.f77721d;
        int i9 = mhr0Var.f133885e;
        this.f178478m = i9 == 0 || (i9 & 1) != 0;
        this.f178481p = 1 == (mhr0Var.f133884d & 1);
        this.f178482q = mhr0Var.f133905y;
        this.f178483r = mhr0Var.f133906z;
        this.f178484s = mhr0Var.f133888h;
        this.f178471f = ofw0Var.zza(mhr0Var);
        Configuration configuration = Resources.getSystem().getConfiguration();
        String[] strArrSplit = ggw0.f102568a >= 24 ? configuration.getLocales().toLanguageTags().split(Constants.SEPARATOR_COMMA, -1) : new String[]{configuration.locale.toLanguageTag()};
        for (int i10 = 0; i10 < strArrSplit.length; i10++) {
            strArrSplit[i10] = ggw0.m126061c(strArrSplit[i10]);
        }
        int i11 = 0;
        while (true) {
            if (i11 >= strArrSplit.length) {
                iM123579l2 = 0;
                i11 = Integer.MAX_VALUE;
                break;
            } else {
                iM123579l2 = fwy0.m123579l(this.f77721d, strArrSplit[i11], false);
                if (iM123579l2 > 0) {
                    break;
                } else {
                    i11++;
                }
            }
        }
        this.f178479n = i11;
        this.f178480o = iM123579l2;
        for (int i12 = 0; i12 < bvy0Var.f131176r.size(); i12++) {
            String str = this.f77721d.f133892l;
            if (str != null && str.equals(bvy0Var.f131176r.get(i12))) {
                i5 = i12;
                break;
            }
        }
        this.f178485t = i5;
        this.f178486u = (i3 & 384) == 128;
        this.f178487v = (i3 & 64) == 64;
        bvy0 bvy0Var2 = this.f178473h;
        if (!fwy0.m123585t(i3, bvy0Var2.f77538v0) || (!(z2 = this.f178471f) && !bvy0Var2.f77531o0)) {
            i6 = 0;
        } else if (fwy0.m123585t(i3, false) && z2 && this.f77721d.f133888h != -1 && ((bvy0Var2.f77540x0 || !z) && (i7 & i3) != 0)) {
            i6 = 2;
        }
        this.f178470e = i6;
    }

    @Override // p149l.bwy0
    /* JADX INFO: renamed from: a */
    public final int mo104256a() {
        return this.f178470e;
    }

    @Override // p149l.bwy0
    /* JADX INFO: renamed from: b */
    public final /* bridge */ /* synthetic */ boolean mo104257b(bwy0 bwy0Var) {
        String str;
        uuy0 uuy0Var = (uuy0) bwy0Var;
        boolean z = this.f178473h.f77534r0;
        mhr0 mhr0Var = this.f77721d;
        int i = mhr0Var.f133905y;
        if (i == -1) {
            return false;
        }
        mhr0 mhr0Var2 = uuy0Var.f77721d;
        if (i != mhr0Var2.f133905y || (str = mhr0Var.f133892l) == null || !TextUtils.equals(str, mhr0Var2.f133892l)) {
            return false;
        }
        boolean z2 = this.f178473h.f77533q0;
        int i2 = this.f77721d.f133906z;
        return i2 != -1 && i2 == uuy0Var.f77721d.f133906z && this.f178486u == uuy0Var.f178486u && this.f178487v == uuy0Var.f178487v;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public final int compareTo(uuy0 uuy0Var) {
        AbstractC2116c3 abstractC2116c3Zza = (this.f178471f && this.f178474i) ? fwy0.f99706k : fwy0.f99706k.zza();
        ahw0 ahw0VarMo96746d = ahw0.m96742j().mo96747e(this.f178474i, uuy0Var.f178474i).mo96746d(Integer.valueOf(this.f178476k), Integer.valueOf(uuy0Var.f178476k), AbstractC2116c3.zzc().zza()).mo96744b(this.f178475j, uuy0Var.f178475j).mo96744b(this.f178477l, uuy0Var.f178477l).mo96747e(this.f178481p, uuy0Var.f178481p).mo96747e(this.f178478m, uuy0Var.f178478m).mo96746d(Integer.valueOf(this.f178479n), Integer.valueOf(uuy0Var.f178479n), AbstractC2116c3.zzc().zza()).mo96744b(this.f178480o, uuy0Var.f178480o).mo96747e(this.f178471f, uuy0Var.f178471f).mo96746d(Integer.valueOf(this.f178485t), Integer.valueOf(uuy0Var.f178485t), AbstractC2116c3.zzc().zza());
        Integer numValueOf = Integer.valueOf(this.f178484s);
        Integer numValueOf2 = Integer.valueOf(uuy0Var.f178484s);
        boolean z = this.f178473h.f131183y;
        ahw0 ahw0VarMo96746d2 = ahw0VarMo96746d.mo96746d(numValueOf, numValueOf2, fwy0.f99707l).mo96747e(this.f178486u, uuy0Var.f178486u).mo96747e(this.f178487v, uuy0Var.f178487v).mo96746d(Integer.valueOf(this.f178482q), Integer.valueOf(uuy0Var.f178482q), abstractC2116c3Zza).mo96746d(Integer.valueOf(this.f178483r), Integer.valueOf(uuy0Var.f178483r), abstractC2116c3Zza);
        Integer numValueOf3 = Integer.valueOf(this.f178484s);
        Integer numValueOf4 = Integer.valueOf(uuy0Var.f178484s);
        if (!ggw0.m126064f(this.f178472g, uuy0Var.f178472g)) {
            abstractC2116c3Zza = fwy0.f99707l;
        }
        return ahw0VarMo96746d2.mo96746d(numValueOf3, numValueOf4, abstractC2116c3Zza).mo96743a();
    }
}
