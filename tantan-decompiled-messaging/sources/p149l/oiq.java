package p149l;

/* JADX INFO: loaded from: classes2.dex */
public class oiq extends AbstractC20803w5 {

    /* JADX INFO: renamed from: b */
    private boolean f144147b;

    /* JADX INFO: renamed from: c */
    private boolean f144148c;

    private oiq(AbstractC20803w5.a aVar, boolean z, boolean z2) {
        super(aVar);
        this.f144147b = z;
        this.f144148c = z2;
    }

    /* JADX INFO: renamed from: j */
    public static oiq m164543j(String str, boolean z, String str2, String str3) {
        AbstractC20803w5.a aVar = new AbstractC20803w5.a(str, "js", str2);
        aVar.f184632e = str3;
        return new oiq(aVar, true, z);
    }

    /* JADX INFO: renamed from: k */
    public static oiq m164544k(String str, String str2) {
        AbstractC20803w5.a aVar = new AbstractC20803w5.a(str, "js", "log");
        aVar.f184632e = str2;
        return new oiq(aVar, false, false);
    }

    @Override // p149l.AbstractC20803w5
    /* JADX INFO: renamed from: b */
    public boolean mo117517b() {
        return this.f144147b || mei.m154203i();
    }

    @Override // p149l.AbstractC20803w5
    /* JADX INFO: renamed from: e */
    public String mo96873e() {
        if (this.f144147b) {
            return this.f144148c ? "[WE]window.onerror&&&" : "[JE]console.onerror&&&";
        }
        return "[JL]";
    }

    @Override // p149l.AbstractC20803w5
    /* JADX INFO: renamed from: i */
    public boolean mo96874i() {
        return this.f144147b;
    }
}
