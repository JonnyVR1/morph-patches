package p153l;

/* JADX INFO: loaded from: classes7.dex */
public class xjw {

    /* JADX INFO: renamed from: b */
    private static xjw f194652b;

    /* JADX INFO: renamed from: a */
    private lxl f194653a;

    private xjw() {
    }

    /* JADX INFO: renamed from: a */
    public static xjw m211265a() {
        if (f194652b == null) {
            f194652b = new xjw();
        }
        return f194652b;
    }

    /* JADX INFO: renamed from: b */
    public String m211266b(String str) {
        lxl lxlVar = this.f194653a;
        return lxlVar != null ? lxlVar.mo97339c(str) : "";
    }

    /* JADX INFO: renamed from: c */
    public String[] m211267c(String str, boolean z) {
        lxl lxlVar = this.f194653a;
        return lxlVar != null ? lxlVar.mo97338b(str, z) : new String[0];
    }

    /* JADX INFO: renamed from: d */
    public void m211268d(lxl lxlVar) {
        this.f194653a = lxlVar;
    }

    /* JADX INFO: renamed from: e */
    public boolean m211269e(String str) {
        lxl lxlVar = this.f194653a;
        if (lxlVar != null) {
            return lxlVar.mo97337a(str);
        }
        return false;
    }
}
