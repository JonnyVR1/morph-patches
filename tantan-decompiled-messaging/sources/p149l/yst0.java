package p149l;

import com.google.android.gms.common.util.Clock;

/* JADX INFO: loaded from: classes6.dex */
public final class yst0 implements b4u0, ezt0 {

    /* JADX INFO: renamed from: a */
    public final Clock f199826a;

    /* JADX INFO: renamed from: b */
    public final att0 f199827b;

    /* JADX INFO: renamed from: c */
    public final iyv0 f199828c;

    /* JADX INFO: renamed from: d */
    public final String f199829d;

    public yst0(Clock clock, att0 att0Var, iyv0 iyv0Var, String str) {
        this.f199826a = clock;
        this.f199827b = att0Var;
        this.f199828c = iyv0Var;
        this.f199829d = str;
    }

    @Override // p149l.b4u0
    public final void zza() {
        this.f199827b.m98883e(this.f199829d, this.f199826a.elapsedRealtime());
    }

    @Override // p149l.ezt0
    public final void zzr() {
        iyv0 iyv0Var = this.f199828c;
        this.f199827b.m98882d(iyv0Var.f115496f, this.f199829d, this.f199826a.elapsedRealtime());
    }
}
