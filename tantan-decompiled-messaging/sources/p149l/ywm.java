package p149l;

/* JADX INFO: loaded from: classes2.dex */
public class ywm extends AbstractC20803w5 {
    private ywm(AbstractC20803w5.a aVar) {
        super(aVar);
    }

    /* JADX INFO: renamed from: j */
    public static ywm m216408j(String str, String str2, String str3, boolean z) {
        String str4 = str2 + "&&&" + str3 + "&&&" + (z ? "suc" : "fail");
        AbstractC20803w5.a aVar = new AbstractC20803w5.a(str, "log");
        aVar.f184632e = str4;
        return new ywm(aVar);
    }

    @Override // p149l.AbstractC20803w5
    /* JADX INFO: renamed from: b */
    public boolean mo117517b() {
        return mei.m154203i();
    }

    @Override // p149l.AbstractC20803w5
    /* JADX INFO: renamed from: e */
    public String mo96873e() {
        return "[IL]";
    }
}
