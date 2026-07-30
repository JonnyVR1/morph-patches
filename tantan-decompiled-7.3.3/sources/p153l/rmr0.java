package p153l;

import java.util.Iterator;
import java.util.List;
import org.fourthline.cling.model.meta.QueryStateVariableAction;

/* JADX INFO: loaded from: classes6.dex */
public final class rmr0 implements ewr0 {

    /* JADX INFO: renamed from: a */
    public final ewr0 f163922a;

    /* JADX INFO: renamed from: b */
    public final String f163923b;

    public rmr0() {
        this.f163922a = ewr0.f96187w0;
        this.f163923b = QueryStateVariableAction.OUTPUT_ARG_RETURN;
    }

    /* JADX INFO: renamed from: a */
    public final ewr0 m182105a() {
        return this.f163922a;
    }

    /* JADX INFO: renamed from: b */
    public final String m182106b() {
        return this.f163923b;
    }

    @Override // p153l.ewr0
    /* JADX INFO: renamed from: c */
    public final ewr0 mo100514c(String str, gix0 gix0Var, List<ewr0> list) {
        throw new IllegalStateException("Control does not have functions");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof rmr0)) {
            return false;
        }
        rmr0 rmr0Var = (rmr0) obj;
        return this.f163923b.equals(rmr0Var.f163923b) && this.f163922a.equals(rmr0Var.f163922a);
    }

    public final int hashCode() {
        return (this.f163923b.hashCode() * 31) + this.f163922a.hashCode();
    }

    @Override // p153l.ewr0
    public final ewr0 zzc() {
        return new rmr0(this.f163923b, this.f163922a.zzc());
    }

    @Override // p153l.ewr0
    public final Boolean zzd() {
        throw new IllegalStateException("Control is not a boolean");
    }

    @Override // p153l.ewr0
    public final Double zze() {
        throw new IllegalStateException("Control is not a double");
    }

    @Override // p153l.ewr0
    public final String zzf() {
        throw new IllegalStateException("Control is not a String");
    }

    @Override // p153l.ewr0
    public final Iterator<ewr0> zzh() {
        return null;
    }

    public rmr0(String str) {
        this.f163922a = ewr0.f96187w0;
        this.f163923b = str;
    }

    public rmr0(String str, ewr0 ewr0Var) {
        this.f163922a = ewr0Var;
        this.f163923b = str;
    }
}
