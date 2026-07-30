package p153l;

/* JADX INFO: loaded from: classes7.dex */
public class qow {

    /* JADX INFO: renamed from: a */
    private crf0 f158764a;

    /* JADX INFO: renamed from: b */
    private crf0 f158765b;

    /* JADX INFO: renamed from: c */
    private crf0 f158766c;

    /* JADX INFO: renamed from: d */
    private int f158767d;

    /* JADX INFO: renamed from: e */
    private int f158768e;

    /* JADX INFO: renamed from: f */
    private int f158769f;

    /* JADX INFO: renamed from: g */
    private int f158770g;

    /* JADX INFO: renamed from: h */
    private int f158771h;

    /* JADX INFO: renamed from: i */
    private int f158772i;

    /* JADX INFO: renamed from: j */
    private int f158773j;

    /* JADX INFO: renamed from: k */
    private int f158774k;

    /* JADX INFO: renamed from: m */
    private int f158776m;

    /* JADX INFO: renamed from: n */
    private float f158777n;

    /* JADX INFO: renamed from: o */
    private boolean f158778o;

    /* JADX INFO: renamed from: p */
    private int f158779p;

    /* JADX INFO: renamed from: q */
    private int f158780q;

    /* JADX INFO: renamed from: r */
    private int f158781r;

    /* JADX INFO: renamed from: l */
    private boolean f158775l = true;

    /* JADX INFO: renamed from: s */
    private int f158782s = 2;

    /* JADX INFO: renamed from: t */
    private boolean f158783t = false;

    /* JADX INFO: renamed from: u */
    private boolean f158784u = false;

    /* JADX INFO: renamed from: v */
    private boolean f158785v = false;

    /* JADX INFO: renamed from: w */
    private int f158786w = 0;

    /* JADX INFO: renamed from: x */
    private boolean f158787x = false;

    /* JADX INFO: renamed from: y */
    private boolean f158788y = false;

    /* JADX INFO: renamed from: z */
    private boolean f158789z = true;

    /* JADX INFO: renamed from: A */
    private boolean f158763A = true;

    private qow() {
    }

    /* JADX INFO: renamed from: A */
    public static qow m177325A() {
        qow qowVar = new qow();
        qowVar.m177342R(new crf0(640, 480));
        qowVar.m177348X(new crf0(640, 480));
        qowVar.m177330F(new crf0(352, 640));
        qowVar.m177346V(20);
        qowVar.m177347W(0);
        qowVar.m177345U(2000000);
        qowVar.m177329E(0);
        qowVar.m177343S(20);
        qowVar.m177338N(5);
        qowVar.m177332H(1);
        qowVar.m177331G(2);
        qowVar.m177340P(0);
        qowVar.m177341Q(1.7777778f);
        qowVar.m177344T(false);
        qowVar.m177327C(2);
        qowVar.m177328D(44100);
        qowVar.m177326B(1024);
        qowVar.m177339O(2);
        qowVar.m177334J(false);
        qowVar.m177337M(false);
        qowVar.m177336L(0);
        qowVar.m177333I(false);
        return qowVar;
    }

    /* JADX INFO: renamed from: B */
    public void m177326B(int i) {
        this.f158780q = i;
    }

    /* JADX INFO: renamed from: C */
    public void m177327C(int i) {
        this.f158779p = i;
    }

    /* JADX INFO: renamed from: D */
    public void m177328D(int i) {
        this.f158781r = i;
    }

    /* JADX INFO: renamed from: E */
    public void m177329E(int i) {
        this.f158769f = i;
    }

    /* JADX INFO: renamed from: F */
    public void m177330F(crf0 crf0Var) {
        if (this.f158775l) {
            this.f158766c = new crf0((crf0Var.m112050b() >> 4) << 4, (crf0Var.m112049a() >> 4) << 4);
        } else {
            this.f158766c = new crf0(crf0Var.m112050b(), crf0Var.m112049a());
        }
    }

    /* JADX INFO: renamed from: G */
    public void m177331G(int i) {
        this.f158774k = i;
    }

    /* JADX INFO: renamed from: H */
    public void m177332H(int i) {
        this.f158773j = i;
    }

    /* JADX INFO: renamed from: I */
    public void m177333I(boolean z) {
        this.f158787x = z;
    }

    /* JADX INFO: renamed from: J */
    public void m177334J(boolean z) {
        this.f158784u = z;
    }

    /* JADX INFO: renamed from: K */
    public void m177335K(boolean z) {
        this.f158783t = z;
    }

    /* JADX INFO: renamed from: L */
    public void m177336L(int i) {
        this.f158786w = i;
    }

    /* JADX INFO: renamed from: M */
    public void m177337M(boolean z) {
        this.f158785v = z;
    }

    /* JADX INFO: renamed from: N */
    public void m177338N(int i) {
        this.f158771h = i;
    }

    /* JADX INFO: renamed from: O */
    public void m177339O(int i) {
        if (i != 2) {
            m177335K(true);
        }
        this.f158782s = i;
    }

    /* JADX INFO: renamed from: P */
    public void m177340P(int i) {
        this.f158776m = i;
    }

    /* JADX INFO: renamed from: Q */
    public void m177341Q(float f) {
        this.f158777n = f;
    }

    /* JADX INFO: renamed from: R */
    public void m177342R(crf0 crf0Var) {
        this.f158764a = crf0Var;
    }

    /* JADX INFO: renamed from: S */
    public void m177343S(int i) {
        this.f158772i = i;
    }

    /* JADX INFO: renamed from: T */
    public void m177344T(boolean z) {
        this.f158778o = z;
    }

    /* JADX INFO: renamed from: U */
    public void m177345U(int i) {
        this.f158767d = i;
    }

    /* JADX INFO: renamed from: V */
    public void m177346V(int i) {
        this.f158770g = i;
    }

    /* JADX INFO: renamed from: W */
    public void m177347W(int i) {
        this.f158768e = i;
    }

    /* JADX INFO: renamed from: X */
    public void m177348X(crf0 crf0Var) {
        this.f158765b = crf0Var;
    }

    /* JADX INFO: renamed from: a */
    public int m177349a() {
        return this.f158780q;
    }

    /* JADX INFO: renamed from: b */
    public int m177350b() {
        return this.f158779p;
    }

    /* JADX INFO: renamed from: c */
    public int m177351c() {
        return this.f158781r;
    }

    /* JADX INFO: renamed from: d */
    public int m177352d() {
        return this.f158769f;
    }

    /* JADX INFO: renamed from: e */
    public crf0 m177353e() {
        return this.f158766c;
    }

    /* JADX INFO: renamed from: f */
    public int m177354f() {
        return this.f158774k;
    }

    /* JADX INFO: renamed from: g */
    public int m177355g() {
        return this.f158773j;
    }

    /* JADX INFO: renamed from: h */
    public boolean m177356h() {
        return this.f158787x;
    }

    /* JADX INFO: renamed from: i */
    public boolean m177357i() {
        return this.f158784u;
    }

    /* JADX INFO: renamed from: j */
    public boolean m177358j() {
        return this.f158783t;
    }

    /* JADX INFO: renamed from: k */
    public int m177359k() {
        return this.f158786w;
    }

    /* JADX INFO: renamed from: l */
    public boolean m177360l() {
        return this.f158785v;
    }

    /* JADX INFO: renamed from: m */
    public int m177361m() {
        return this.f158771h;
    }

    /* JADX INFO: renamed from: n */
    public int m177362n() {
        return this.f158782s;
    }

    /* JADX INFO: renamed from: o */
    public int m177363o() {
        return this.f158776m;
    }

    /* JADX INFO: renamed from: p */
    public float m177364p() {
        return this.f158777n;
    }

    /* JADX INFO: renamed from: q */
    public crf0 m177365q() {
        return this.f158764a;
    }

    /* JADX INFO: renamed from: r */
    public int m177366r() {
        return this.f158772i;
    }

    /* JADX INFO: renamed from: s */
    public boolean m177367s() {
        return this.f158778o;
    }

    /* JADX INFO: renamed from: t */
    public int m177368t() {
        return this.f158767d;
    }

    /* JADX INFO: renamed from: u */
    public int m177369u() {
        return this.f158770g;
    }

    /* JADX INFO: renamed from: v */
    public int m177370v() {
        return this.f158768e;
    }

    /* JADX INFO: renamed from: w */
    public crf0 m177371w() {
        return this.f158765b;
    }

    /* JADX INFO: renamed from: x */
    public boolean m177372x() {
        return this.f158788y;
    }

    /* JADX INFO: renamed from: y */
    public boolean m177373y() {
        return this.f158763A;
    }

    /* JADX INFO: renamed from: z */
    public boolean m177374z() {
        return this.f158789z;
    }
}
