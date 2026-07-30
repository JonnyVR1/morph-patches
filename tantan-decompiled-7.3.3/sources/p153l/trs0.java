package p153l;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public final class trs0 {

    /* JADX INFO: renamed from: i */
    public static final trs0 f175930i = new lxr0().m156237c();

    /* JADX INFO: renamed from: j */
    public static final String f175931j = Integer.toString(0, 36);

    /* JADX INFO: renamed from: k */
    public static final String f175932k = Integer.toString(1, 36);

    /* JADX INFO: renamed from: l */
    public static final String f175933l = Integer.toString(2, 36);

    /* JADX INFO: renamed from: m */
    public static final String f175934m = Integer.toString(3, 36);

    /* JADX INFO: renamed from: n */
    public static final String f175935n = Integer.toString(4, 36);

    /* JADX INFO: renamed from: o */
    public static final String f175936o = Integer.toString(5, 36);

    /* JADX INFO: renamed from: p */
    @Deprecated
    public static final mhy0 f175937p = new mhy0() { // from class: l.otr0
    };

    /* JADX INFO: renamed from: a */
    public final String f175938a;

    /* JADX INFO: renamed from: b */
    @Nullable
    public final zis0 f175939b;

    /* JADX INFO: renamed from: c */
    @Nullable
    @Deprecated
    public final zis0 f175940c;

    /* JADX INFO: renamed from: d */
    public final jfs0 f175941d;

    /* JADX INFO: renamed from: e */
    public final rzs0 f175942e;

    /* JADX INFO: renamed from: f */
    public final e2s0 f175943f;

    /* JADX INFO: renamed from: g */
    @Deprecated
    public final t4s0 f175944g;

    /* JADX INFO: renamed from: h */
    public final xms0 f175945h;

    public /* synthetic */ trs0(String str, t4s0 t4s0Var, zis0 zis0Var, jfs0 jfs0Var, rzs0 rzs0Var, xms0 xms0Var, wqs0 wqs0Var) {
        this.f175938a = str;
        this.f175939b = zis0Var;
        this.f175940c = zis0Var;
        this.f175941d = jfs0Var;
        this.f175942e = rzs0Var;
        this.f175943f = t4s0Var;
        this.f175944g = t4s0Var;
        this.f175945h = xms0Var;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof trs0)) {
            return false;
        }
        trs0 trs0Var = (trs0) obj;
        return mpw0.m159408f(this.f175938a, trs0Var.f175938a) && this.f175943f.equals(trs0Var.f175943f) && mpw0.m159408f(this.f175939b, trs0Var.f175939b) && mpw0.m159408f(this.f175941d, trs0Var.f175941d) && mpw0.m159408f(this.f175942e, trs0Var.f175942e) && mpw0.m159408f(this.f175945h, trs0Var.f175945h);
    }

    public final int hashCode() {
        int iHashCode = this.f175938a.hashCode() * 31;
        zis0 zis0Var = this.f175939b;
        return (((((((iHashCode + (zis0Var != null ? zis0Var.hashCode() : 0)) * 31) + this.f175941d.hashCode()) * 31) + this.f175943f.hashCode()) * 31) + this.f175942e.hashCode()) * 31;
    }
}
