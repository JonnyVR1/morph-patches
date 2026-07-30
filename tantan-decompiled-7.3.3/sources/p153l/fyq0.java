package p153l;

/* JADX INFO: loaded from: classes2.dex */
public class fyq0 implements zzv {

    /* JADX INFO: renamed from: a */
    private zzv f101417a;

    /* JADX INFO: renamed from: b */
    private zzv f101418b;

    public fyq0(zzv zzvVar, zzv zzvVar2) {
        this.f101417a = zzvVar;
        this.f101418b = zzvVar2;
    }

    @Override // p153l.zzv
    public void log(String str) {
        zzv zzvVar = this.f101417a;
        if (zzvVar != null) {
            zzvVar.log(str);
        }
        zzv zzvVar2 = this.f101418b;
        if (zzvVar2 != null) {
            zzvVar2.log(str);
        }
    }

    @Override // p153l.zzv
    public void log(String str, Throwable th) {
        zzv zzvVar = this.f101417a;
        if (zzvVar != null) {
            zzvVar.log(str, th);
        }
        zzv zzvVar2 = this.f101418b;
        if (zzvVar2 != null) {
            zzvVar2.log(str, th);
        }
    }
}
