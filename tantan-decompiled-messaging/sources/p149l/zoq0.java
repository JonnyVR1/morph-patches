package p149l;

/* JADX INFO: loaded from: classes2.dex */
public class zoq0 implements cyv {

    /* JADX INFO: renamed from: a */
    private cyv f204153a;

    /* JADX INFO: renamed from: b */
    private cyv f204154b;

    public zoq0(cyv cyvVar, cyv cyvVar2) {
        this.f204153a = cyvVar;
        this.f204154b = cyvVar2;
    }

    @Override // p149l.cyv
    public void log(String str) {
        cyv cyvVar = this.f204153a;
        if (cyvVar != null) {
            cyvVar.log(str);
        }
        cyv cyvVar2 = this.f204154b;
        if (cyvVar2 != null) {
            cyvVar2.log(str);
        }
    }

    @Override // p149l.cyv
    public void log(String str, Throwable th) {
        cyv cyvVar = this.f204153a;
        if (cyvVar != null) {
            cyvVar.log(str, th);
        }
        cyv cyvVar2 = this.f204154b;
        if (cyvVar2 != null) {
            cyvVar2.log(str, th);
        }
    }
}
