package p149l;

import com.google.android.gms.internal.measurement.zzln;

/* JADX INFO: loaded from: classes6.dex */
public final class y2y0 implements b0y0 {

    /* JADX INFO: renamed from: a */
    public final g0y0 f195722a;

    /* JADX INFO: renamed from: b */
    public final String f195723b;

    /* JADX INFO: renamed from: c */
    public final Object[] f195724c;

    /* JADX INFO: renamed from: d */
    public final int f195725d;

    public y2y0(g0y0 g0y0Var, String str, Object[] objArr) {
        this.f195722a = g0y0Var;
        this.f195723b = str;
        this.f195724c = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.f195725d = cCharAt;
            return;
        }
        int i = cCharAt & 8191;
        int i2 = 13;
        int i3 = 1;
        while (true) {
            int i4 = i3 + 1;
            char cCharAt2 = str.charAt(i3);
            if (cCharAt2 < 55296) {
                this.f195725d = i | (cCharAt2 << i2);
                return;
            } else {
                i |= (cCharAt2 & 8191) << i2;
                i2 += 13;
                i3 = i4;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final String m212754a() {
        return this.f195723b;
    }

    /* JADX INFO: renamed from: b */
    public final Object[] m212755b() {
        return this.f195724c;
    }

    @Override // p149l.b0y0
    public final g0y0 zza() {
        return this.f195722a;
    }

    @Override // p149l.b0y0
    public final zzln zzb() {
        int i = this.f195725d;
        if ((i & 1) != 0) {
            return zzln.PROTO2;
        }
        return (i & 4) == 4 ? zzln.EDITIONS : zzln.PROTO3;
    }

    @Override // p149l.b0y0
    public final boolean zzc() {
        return (this.f195725d & 2) == 2;
    }
}
