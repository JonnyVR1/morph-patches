package p153l;

import android.content.res.Configuration;
import android.content.res.Resources;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.clevertap.android.sdk.Constants;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.internal.ads.AbstractC2139c3;

/* JADX INFO: loaded from: classes6.dex */
public final class a4z0 extends h5z0 implements Comparable {

    /* JADX INFO: renamed from: e */
    public final int f68463e;

    /* JADX INFO: renamed from: f */
    public final boolean f68464f;

    /* JADX INFO: renamed from: g */
    @Nullable
    public final String f68465g;

    /* JADX INFO: renamed from: h */
    public final h4z0 f68466h;

    /* JADX INFO: renamed from: i */
    public final boolean f68467i;

    /* JADX INFO: renamed from: j */
    public final int f68468j;

    /* JADX INFO: renamed from: k */
    public final int f68469k;

    /* JADX INFO: renamed from: l */
    public final int f68470l;

    /* JADX INFO: renamed from: m */
    public final boolean f68471m;

    /* JADX INFO: renamed from: n */
    public final int f68472n;

    /* JADX INFO: renamed from: o */
    public final int f68473o;

    /* JADX INFO: renamed from: p */
    public final boolean f68474p;

    /* JADX INFO: renamed from: q */
    public final int f68475q;

    /* JADX INFO: renamed from: r */
    public final int f68476r;

    /* JADX INFO: renamed from: s */
    public final int f68477s;

    /* JADX INFO: renamed from: t */
    public final int f68478t;

    /* JADX INFO: renamed from: u */
    public final boolean f68479u;

    /* JADX INFO: renamed from: v */
    public final boolean f68480v;

    /* JADX WARN: Multi-variable type inference failed */
    public a4z0(int i, t2u0 t2u0Var, int i2, h4z0 h4z0Var, int i3, boolean z, uow0 uow0Var, int i4) {
        int i5;
        int iM153028l;
        int iM153028l2;
        boolean z2;
        super(i, t2u0Var, i2);
        this.f68466h = h4z0Var;
        int i6 = 1;
        int i7 = true != h4z0Var.f107871t0 ? 16 : 24;
        this.f68465g = l5z0.m153031p(this.f107992d.f170242c);
        this.f68467i = l5z0.m153034t(i3, false);
        int i8 = 0;
        while (true) {
            int size = h4z0Var.f167333n.size();
            i5 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
            if (i8 >= size) {
                iM153028l = 0;
                i8 = Integer.MAX_VALUE;
                break;
            } else {
                iM153028l = l5z0.m153028l(this.f107992d, (String) h4z0Var.f167333n.get(i8), false);
                if (iM153028l > 0) {
                    break;
                } else {
                    i8++;
                }
            }
        }
        this.f68469k = i8;
        this.f68468j = iM153028l;
        this.f68470l = l5z0.m153027k(this.f107992d.f170244e, 0);
        sqr0 sqr0Var = this.f107992d;
        int i9 = sqr0Var.f170244e;
        this.f68471m = i9 == 0 || (i9 & 1) != 0;
        this.f68474p = 1 == (sqr0Var.f170243d & 1);
        this.f68475q = sqr0Var.f170264y;
        this.f68476r = sqr0Var.f170265z;
        this.f68477s = sqr0Var.f170247h;
        this.f68464f = uow0Var.zza(sqr0Var);
        Configuration configuration = Resources.getSystem().getConfiguration();
        String[] strArrSplit = mpw0.f137957a >= 24 ? configuration.getLocales().toLanguageTags().split(Constants.SEPARATOR_COMMA, -1) : new String[]{configuration.locale.toLanguageTag()};
        for (int i10 = 0; i10 < strArrSplit.length; i10++) {
            strArrSplit[i10] = mpw0.m159405c(strArrSplit[i10]);
        }
        int i11 = 0;
        while (true) {
            if (i11 >= strArrSplit.length) {
                iM153028l2 = 0;
                i11 = Integer.MAX_VALUE;
                break;
            } else {
                iM153028l2 = l5z0.m153028l(this.f107992d, strArrSplit[i11], false);
                if (iM153028l2 > 0) {
                    break;
                } else {
                    i11++;
                }
            }
        }
        this.f68472n = i11;
        this.f68473o = iM153028l2;
        for (int i12 = 0; i12 < h4z0Var.f167337r.size(); i12++) {
            String str = this.f107992d.f170251l;
            if (str != null && str.equals(h4z0Var.f167337r.get(i12))) {
                i5 = i12;
                break;
            }
        }
        this.f68478t = i5;
        this.f68479u = (i3 & 384) == 128;
        this.f68480v = (i3 & 64) == 64;
        h4z0 h4z0Var2 = this.f68466h;
        if (!l5z0.m153034t(i3, h4z0Var2.f107873v0) || (!(z2 = this.f68464f) && !h4z0Var2.f107866o0)) {
            i6 = 0;
        } else if (l5z0.m153034t(i3, false) && z2 && this.f107992d.f170247h != -1 && ((h4z0Var2.f107875x0 || !z) && (i7 & i3) != 0)) {
            i6 = 2;
        }
        this.f68463e = i6;
    }

    @Override // p153l.h5z0
    /* JADX INFO: renamed from: a */
    public final int mo96008a() {
        return this.f68463e;
    }

    @Override // p153l.h5z0
    /* JADX INFO: renamed from: b */
    public final /* bridge */ /* synthetic */ boolean mo96009b(h5z0 h5z0Var) {
        String str;
        a4z0 a4z0Var = (a4z0) h5z0Var;
        boolean z = this.f68466h.f107869r0;
        sqr0 sqr0Var = this.f107992d;
        int i = sqr0Var.f170264y;
        if (i == -1) {
            return false;
        }
        sqr0 sqr0Var2 = a4z0Var.f107992d;
        if (i != sqr0Var2.f170264y || (str = sqr0Var.f170251l) == null || !TextUtils.equals(str, sqr0Var2.f170251l)) {
            return false;
        }
        boolean z2 = this.f68466h.f107868q0;
        int i2 = this.f107992d.f170265z;
        return i2 != -1 && i2 == a4z0Var.f107992d.f170265z && this.f68479u == a4z0Var.f68479u && this.f68480v == a4z0Var.f68480v;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public final int compareTo(a4z0 a4z0Var) {
        AbstractC2139c3 abstractC2139c3Zza = (this.f68464f && this.f68467i) ? l5z0.f130209k : l5z0.f130209k.zza();
        gqw0 gqw0VarMo117580d = gqw0.m131503j().mo117581e(this.f68467i, a4z0Var.f68467i).mo117580d(Integer.valueOf(this.f68469k), Integer.valueOf(a4z0Var.f68469k), AbstractC2139c3.zzc().zza()).mo117578b(this.f68468j, a4z0Var.f68468j).mo117578b(this.f68470l, a4z0Var.f68470l).mo117581e(this.f68474p, a4z0Var.f68474p).mo117581e(this.f68471m, a4z0Var.f68471m).mo117580d(Integer.valueOf(this.f68472n), Integer.valueOf(a4z0Var.f68472n), AbstractC2139c3.zzc().zza()).mo117578b(this.f68473o, a4z0Var.f68473o).mo117581e(this.f68464f, a4z0Var.f68464f).mo117580d(Integer.valueOf(this.f68478t), Integer.valueOf(a4z0Var.f68478t), AbstractC2139c3.zzc().zza());
        Integer numValueOf = Integer.valueOf(this.f68477s);
        Integer numValueOf2 = Integer.valueOf(a4z0Var.f68477s);
        boolean z = this.f68466h.f167344y;
        gqw0 gqw0VarMo117580d2 = gqw0VarMo117580d.mo117580d(numValueOf, numValueOf2, l5z0.f130210l).mo117581e(this.f68479u, a4z0Var.f68479u).mo117581e(this.f68480v, a4z0Var.f68480v).mo117580d(Integer.valueOf(this.f68475q), Integer.valueOf(a4z0Var.f68475q), abstractC2139c3Zza).mo117580d(Integer.valueOf(this.f68476r), Integer.valueOf(a4z0Var.f68476r), abstractC2139c3Zza);
        Integer numValueOf3 = Integer.valueOf(this.f68477s);
        Integer numValueOf4 = Integer.valueOf(a4z0Var.f68477s);
        if (!mpw0.m159408f(this.f68465g, a4z0Var.f68465g)) {
            abstractC2139c3Zza = l5z0.f130210l;
        }
        return gqw0VarMo117580d2.mo117580d(numValueOf3, numValueOf4, abstractC2139c3Zza).mo117577a();
    }
}
