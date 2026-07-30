package p149l;

import com.google.android.gms.internal.measurement.zzcn;
import com.google.android.gms.internal.measurement.zzco;

/* JADX INFO: loaded from: classes6.dex */
public final class r2t0 extends vct0 {

    /* JADX INFO: renamed from: c */
    public final String f157447c;

    /* JADX INFO: renamed from: d */
    public final boolean f157448d;

    /* JADX INFO: renamed from: e */
    public final zzco f157449e;

    /* JADX INFO: renamed from: f */
    public final zzcn f157450f;

    public r2t0(String str, boolean z, zzco zzcoVar, b0t0 b0t0Var, xys0 xys0Var, zzcn zzcnVar) {
        this.f157447c = str;
        this.f157448d = z;
        this.f157449e = zzcoVar;
        this.f157450f = zzcnVar;
    }

    @Override // p149l.vct0
    /* JADX INFO: renamed from: a */
    public final b0t0 mo177613a() {
        return null;
    }

    @Override // p149l.vct0
    /* JADX INFO: renamed from: b */
    public final xys0 mo177614b() {
        return null;
    }

    @Override // p149l.vct0
    /* JADX INFO: renamed from: c */
    public final zzco mo177615c() {
        return this.f157449e;
    }

    @Override // p149l.vct0
    /* JADX INFO: renamed from: d */
    public final zzcn mo177616d() {
        return this.f157450f;
    }

    @Override // p149l.vct0
    /* JADX INFO: renamed from: e */
    public final String mo177617e() {
        return this.f157447c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof vct0) {
            vct0 vct0Var = (vct0) obj;
            if (this.f157447c.equals(vct0Var.mo177617e()) && this.f157448d == vct0Var.mo177618f() && this.f157449e.equals(vct0Var.mo177615c())) {
                vct0Var.mo177613a();
                vct0Var.mo177614b();
                if (this.f157450f.equals(vct0Var.mo177616d())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // p149l.vct0
    /* JADX INFO: renamed from: f */
    public final boolean mo177618f() {
        return this.f157448d;
    }

    public final int hashCode() {
        return this.f157450f.hashCode() ^ ((((((this.f157447c.hashCode() ^ 1000003) * 1000003) ^ (this.f157448d ? 1231 : 1237)) * 1000003) ^ this.f157449e.hashCode()) * 583896283);
    }

    public final String toString() {
        return "FileComplianceOptions{fileOwner=" + this.f157447c + ", hasDifferentDmaOwner=" + this.f157448d + ", fileChecks=" + String.valueOf(this.f157449e) + ", dataForwardingNotAllowedResolver=null, multipleProductIdGroupsResolver=null, filePurpose=" + String.valueOf(this.f157450f) + "}";
    }
}
