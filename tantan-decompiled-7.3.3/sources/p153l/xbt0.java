package p153l;

import com.google.android.gms.internal.measurement.zzcn;
import com.google.android.gms.internal.measurement.zzco;

/* JADX INFO: loaded from: classes6.dex */
public final class xbt0 extends bmt0 {

    /* JADX INFO: renamed from: c */
    public final String f193216c;

    /* JADX INFO: renamed from: d */
    public final boolean f193217d;

    /* JADX INFO: renamed from: e */
    public final zzco f193218e;

    /* JADX INFO: renamed from: f */
    public final zzcn f193219f;

    public xbt0(String str, boolean z, zzco zzcoVar, h9t0 h9t0Var, d8t0 d8t0Var, zzcn zzcnVar) {
        this.f193216c = str;
        this.f193217d = z;
        this.f193218e = zzcoVar;
        this.f193219f = zzcnVar;
    }

    @Override // p153l.bmt0
    /* JADX INFO: renamed from: a */
    public final h9t0 mo105262a() {
        return null;
    }

    @Override // p153l.bmt0
    /* JADX INFO: renamed from: b */
    public final d8t0 mo105263b() {
        return null;
    }

    @Override // p153l.bmt0
    /* JADX INFO: renamed from: c */
    public final zzco mo105264c() {
        return this.f193218e;
    }

    @Override // p153l.bmt0
    /* JADX INFO: renamed from: d */
    public final zzcn mo105265d() {
        return this.f193219f;
    }

    @Override // p153l.bmt0
    /* JADX INFO: renamed from: e */
    public final String mo105266e() {
        return this.f193216c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bmt0) {
            bmt0 bmt0Var = (bmt0) obj;
            if (this.f193216c.equals(bmt0Var.mo105266e()) && this.f193217d == bmt0Var.mo105267f() && this.f193218e.equals(bmt0Var.mo105264c())) {
                bmt0Var.mo105262a();
                bmt0Var.mo105263b();
                if (this.f193219f.equals(bmt0Var.mo105265d())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // p153l.bmt0
    /* JADX INFO: renamed from: f */
    public final boolean mo105267f() {
        return this.f193217d;
    }

    public final int hashCode() {
        return this.f193219f.hashCode() ^ ((((((this.f193216c.hashCode() ^ 1000003) * 1000003) ^ (this.f193217d ? 1231 : 1237)) * 1000003) ^ this.f193218e.hashCode()) * 583896283);
    }

    public final String toString() {
        return "FileComplianceOptions{fileOwner=" + this.f193216c + ", hasDifferentDmaOwner=" + this.f193217d + ", fileChecks=" + String.valueOf(this.f193218e) + ", dataForwardingNotAllowedResolver=null, multipleProductIdGroupsResolver=null, filePurpose=" + String.valueOf(this.f193219f) + "}";
    }
}
