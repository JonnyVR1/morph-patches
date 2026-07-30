package p153l;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import com.google.android.gms.ads.internal.client.zzq;
import com.immomo.momomediaext.sei.BaseSei;

/* JADX INFO: loaded from: classes6.dex */
public final class unv0 implements wuv0 {

    /* JADX INFO: renamed from: a */
    public final wuv0 f179987a;

    /* JADX INFO: renamed from: b */
    public final o7w0 f179988b;

    /* JADX INFO: renamed from: c */
    public final Context f179989c;

    /* JADX INFO: renamed from: d */
    public final ebt0 f179990d;

    public unv0(ypv0 ypv0Var, o7w0 o7w0Var, Context context, ebt0 ebt0Var) {
        this.f179987a = ypv0Var;
        this.f179988b = o7w0Var;
        this.f179989c = context;
        this.f179990d = ebt0Var;
    }

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ vnv0 m196956a(bvv0 bvv0Var) {
        String str;
        boolean z;
        String strZzm;
        int i;
        float f;
        float f2;
        int i2;
        DisplayMetrics displayMetrics;
        zzq zzqVar = this.f179988b.f145319e;
        zzq[] zzqVarArr = zzqVar.zzg;
        if (zzqVarArr == null) {
            str = zzqVar.zza;
            z = zzqVar.zzi;
        } else {
            String str2 = null;
            boolean z2 = false;
            boolean z3 = false;
            boolean z4 = false;
            for (zzq zzqVar2 : zzqVarArr) {
                boolean z5 = zzqVar2.zzi;
                if (!z5 && !z3) {
                    str2 = zzqVar2.zza;
                    z3 = true;
                }
                if (z5) {
                    if (!z4) {
                        z2 = true;
                    }
                    z4 = true;
                }
                if (z3 && z4) {
                    break;
                }
            }
            str = str2;
            z = z2;
        }
        Resources resources = this.f179989c.getResources();
        if (resources == null || (displayMetrics = resources.getDisplayMetrics()) == null) {
            strZzm = null;
            i = 0;
            f = 0.0f;
            f2 = 0.0f;
            i2 = 0;
        } else {
            ebt0 ebt0Var = this.f179990d;
            float f3 = displayMetrics.density;
            int i3 = displayMetrics.widthPixels;
            int i4 = displayMetrics.heightPixels;
            strZzm = ebt0Var.m120264i().zzm();
            f = 0.0f;
            i2 = i3;
            i = i4;
            f2 = f3;
        }
        StringBuilder sb = new StringBuilder();
        zzq[] zzqVarArr2 = zzqVar.zzg;
        if (zzqVarArr2 != null) {
            int i5 = 0;
            boolean z6 = false;
            while (true) {
                float f4 = f;
                if (i5 >= zzqVarArr2.length) {
                    break;
                }
                zzq zzqVar3 = zzqVarArr2[i5];
                if (zzqVar3.zzi) {
                    z6 = true;
                } else {
                    if (sb.length() != 0) {
                        sb.append("|");
                    }
                    int i6 = zzqVar3.zze;
                    if (i6 == -1) {
                        i6 = f2 != f4 ? (int) (zzqVar3.zzf / f2) : -1;
                    }
                    sb.append(i6);
                    sb.append(BaseSei.f14624X);
                    int i7 = zzqVar3.zzb;
                    if (i7 == -2) {
                        i7 = f2 != f4 ? (int) (zzqVar3.zzc / f2) : -2;
                    }
                    sb.append(i7);
                }
                i5++;
                f = f4;
            }
            if (z6) {
                if (sb.length() != 0) {
                    sb.insert(0, "|");
                }
                sb.insert(0, "320x50");
            }
        }
        return new vnv0(zzqVar, str, z, sb.toString(), f2, i2, i, strZzm, this.f179988b.f145330p);
    }

    @Override // p153l.wuv0
    public final int zza() {
        return 7;
    }

    @Override // p153l.wuv0
    public final hpr zzb() {
        return pvw0.m173986m(this.f179987a.zzb(), new eow0() { // from class: l.tnv0
            @Override // p153l.eow0
            public final Object apply(Object obj) {
                return this.f175321a.m196956a((bvv0) obj);
            }
        }, oct0.f146738f);
    }
}
