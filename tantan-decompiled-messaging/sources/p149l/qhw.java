package p149l;

/* JADX INFO: loaded from: classes2.dex */
public class qhw {

    /* JADX INFO: renamed from: b */
    private static qhw f154525b;

    /* JADX INFO: renamed from: a */
    private zsl f154526a;

    private qhw() {
    }

    /* JADX INFO: renamed from: a */
    public static qhw m174602a() {
        if (f154525b == null) {
            f154525b = new qhw();
        }
        return f154525b;
    }

    /* JADX INFO: renamed from: b */
    public void m174603b(zsl zslVar) {
        this.f154526a = zslVar;
    }

    /* JADX INFO: renamed from: c */
    public void m174604c(String str, sgm sgmVar) {
        zsl zslVar = this.f154526a;
        if (zslVar == null) {
            return;
        }
        zslVar.mo150762a(str, sgmVar);
    }
}
