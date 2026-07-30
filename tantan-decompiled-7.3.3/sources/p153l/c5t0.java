package p153l;

import com.google.android.gms.common.internal.Objects;

/* JADX INFO: loaded from: classes6.dex */
public final class c5t0 extends e5t0 {

    /* JADX INFO: renamed from: a */
    public final String f79898a;

    /* JADX INFO: renamed from: b */
    public final int f79899b;

    public c5t0(String str, int i) {
        this.f79898a = str;
        this.f79899b = i;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof c5t0)) {
            c5t0 c5t0Var = (c5t0) obj;
            if (Objects.equal(this.f79898a, c5t0Var.f79898a)) {
                if (Objects.equal(Integer.valueOf(this.f79899b), Integer.valueOf(c5t0Var.f79899b))) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // p153l.f5t0
    public final int zzb() {
        return this.f79899b;
    }

    @Override // p153l.f5t0
    public final String zzc() {
        return this.f79898a;
    }
}
