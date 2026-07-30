package p149l;

/* JADX INFO: loaded from: classes2.dex */
public class ze3 extends AbstractC20803w5 {

    /* JADX INFO: renamed from: b */
    private boolean f202769b;

    /* JADX INFO: renamed from: c */
    private String f202770c;

    /* JADX INFO: renamed from: d */
    private String f202771d;

    /* JADX INFO: renamed from: e */
    private String f202772e;

    /* JADX INFO: renamed from: f */
    private String f202773f;

    private ze3(AbstractC20803w5.a aVar, boolean z, String str, String str2, String str3, String str4) {
        super(aVar);
        this.f202769b = z;
        this.f202770c = str;
        this.f202771d = str2;
        this.f202772e = str3;
        this.f202773f = str4;
    }

    /* JADX INFO: renamed from: j */
    public static ze3 m218269j(String str, String str2, String str3, String str4, String str5) {
        return new ze3(new AbstractC20803w5.a(str, "log"), false, str2, str3, str4, str5);
    }

    /* JADX INFO: renamed from: k */
    public static ze3 m218270k(String str, String str2, String str3, String str4) {
        return new ze3(new AbstractC20803w5.a(str, "log"), false, "response", str2, str3, str4);
    }

    /* JADX INFO: renamed from: l */
    public static ze3 m218271l(String str, String str2, String str3) {
        AbstractC20803w5.a aVar = new AbstractC20803w5.a(str, "ERR_2.4");
        aVar.f184632e = str2;
        return new ze3(aVar, true, str3);
    }

    @Override // p149l.AbstractC20803w5
    /* JADX INFO: renamed from: a */
    public String mo117516a() {
        if (this.f202769b) {
            return super.mo117516a();
        }
        StringBuilder sbMo201596a = this.f184627a.mo201596a();
        sbMo201596a.append("[MB]BridgeCall&&&");
        sbMo201596a.append(this.f202770c);
        sbMo201596a.append("&&&");
        sbMo201596a.append(this.f202771d);
        sbMo201596a.append("&&&");
        sbMo201596a.append(this.f202772e);
        sbMo201596a.append("&&&");
        sbMo201596a.append(this.f202773f);
        return sbMo201596a.toString();
    }

    @Override // p149l.AbstractC20803w5
    /* JADX INFO: renamed from: b */
    public boolean mo117517b() {
        return this.f202769b || mei.m154203i();
    }

    @Override // p149l.AbstractC20803w5
    /* JADX INFO: renamed from: e */
    public String mo96873e() {
        return "[MB]";
    }

    @Override // p149l.AbstractC20803w5
    /* JADX INFO: renamed from: i */
    public boolean mo96874i() {
        return this.f202769b;
    }

    private ze3(AbstractC20803w5.a aVar, boolean z, String str) {
        super(aVar);
        this.f202769b = z;
        this.f202773f = str;
    }
}
