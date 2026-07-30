package p149l;

import com.google.android.gms.common.internal.Objects;

/* JADX INFO: loaded from: classes6.dex */
public final class wvs0 extends yvs0 {

    /* JADX INFO: renamed from: a */
    public final String f188283a;

    /* JADX INFO: renamed from: b */
    public final int f188284b;

    public wvs0(String str, int i) {
        this.f188283a = str;
        this.f188284b = i;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof wvs0)) {
            wvs0 wvs0Var = (wvs0) obj;
            if (Objects.equal(this.f188283a, wvs0Var.f188283a)) {
                if (Objects.equal(Integer.valueOf(this.f188284b), Integer.valueOf(wvs0Var.f188284b))) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // p149l.zvs0
    public final int zzb() {
        return this.f188284b;
    }

    @Override // p149l.zvs0
    public final String zzc() {
        return this.f188283a;
    }
}
