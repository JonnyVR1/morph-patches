package p149l;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import com.google.android.gms.ads.internal.client.zzq;
import com.immomo.momomediaext.sei.BaseSei;

/* JADX INFO: loaded from: classes6.dex */
public final class oev0 implements qlv0 {

    /* JADX INFO: renamed from: a */
    public final qlv0 f143584a;

    /* JADX INFO: renamed from: b */
    public final iyv0 f143585b;

    /* JADX INFO: renamed from: c */
    public final Context f143586c;

    /* JADX INFO: renamed from: d */
    public final y1t0 f143587d;

    public oev0(sgv0 sgv0Var, iyv0 iyv0Var, Context context, y1t0 y1t0Var) {
        this.f143584a = sgv0Var;
        this.f143585b = iyv0Var;
        this.f143586c = context;
        this.f143587d = y1t0Var;
    }

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ pev0 m164028a(vlv0 vlv0Var) {
        String str;
        boolean z;
        String strZzm;
        int i;
        float f;
        float f2;
        int i2;
        DisplayMetrics displayMetrics;
        zzq zzqVar = this.f143585b.f115495e;
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
        Resources resources = this.f143586c.getResources();
        if (resources == null || (displayMetrics = resources.getDisplayMetrics()) == null) {
            strZzm = null;
            i = 0;
            f = 0.0f;
            f2 = 0.0f;
            i2 = 0;
        } else {
            y1t0 y1t0Var = this.f143587d;
            float f3 = displayMetrics.density;
            int i3 = displayMetrics.widthPixels;
            int i4 = displayMetrics.heightPixels;
            strZzm = y1t0Var.m212279i().zzm();
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
                    sb.append(BaseSei.f13930X);
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
        return new pev0(zzqVar, str, z, sb.toString(), f2, i2, i, strZzm, this.f143585b.f115506p);
    }

    @Override // p149l.qlv0
    public final int zza() {
        return 7;
    }

    @Override // p149l.qlv0
    public final gnr zzb() {
        return jmw0.m142240m(this.f143584a.zzb(), new yew0() { // from class: l.nev0
            @Override // p149l.yew0
            public final Object apply(Object obj) {
                return this.f138657a.m164028a((vlv0) obj);
            }
        }, i3t0.f111377f);
    }
}
