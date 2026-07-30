package p149l;

import com.google.android.gms.internal.measurement.zzcn;
import com.google.android.gms.internal.measurement.zzco;

/* JADX INFO: loaded from: classes6.dex */
public final class j1t0 extends mbt0 {

    /* JADX INFO: renamed from: a */
    public String f115841a;

    /* JADX INFO: renamed from: b */
    public zzco f115842b;

    /* JADX INFO: renamed from: c */
    public zzcn f115843c;

    /* JADX INFO: renamed from: d */
    public byte f115844d;

    @Override // p149l.mbt0
    /* JADX INFO: renamed from: a */
    public final mbt0 mo139389a(zzcn zzcnVar) {
        if (zzcnVar != null) {
            this.f115843c = zzcnVar;
            return this;
        }
        jfd0.m141176a("Null filePurpose");
        return null;
    }

    @Override // p149l.mbt0
    /* JADX INFO: renamed from: b */
    public final mbt0 mo139390b(zzco zzcoVar) {
        if (zzcoVar != null) {
            this.f115842b = zzcoVar;
            return this;
        }
        jfd0.m141176a("Null fileChecks");
        return null;
    }

    @Override // p149l.mbt0
    /* JADX INFO: renamed from: c */
    public final mbt0 mo139391c(boolean z) {
        this.f115844d = (byte) (this.f115844d | 1);
        return this;
    }

    @Override // p149l.mbt0
    /* JADX INFO: renamed from: d */
    public final vct0 mo139392d() {
        if (this.f115844d == 1 && this.f115841a != null && this.f115842b != null && this.f115843c != null) {
            return new r2t0(this.f115841a, this.f115842b, this.f115843c);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f115841a == null) {
            sb.append(" fileOwner");
        }
        if ((1 & this.f115844d) == 0) {
            sb.append(" hasDifferentDmaOwner");
        }
        if (this.f115842b == null) {
            sb.append(" fileChecks");
        }
        if (this.f115843c == null) {
            sb.append(" filePurpose");
        }
        qkq0.m175383a("Missing required properties:".concat(String.valueOf(sb)));
        return null;
    }

    /* JADX INFO: renamed from: e */
    public final mbt0 m139393e(String str) {
        this.f115841a = str;
        return this;
    }
}
