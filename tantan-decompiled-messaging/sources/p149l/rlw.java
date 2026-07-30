package p149l;

/* JADX INFO: loaded from: classes7.dex */
public class rlw {

    /* JADX INFO: renamed from: a */
    private tif0 f160011a;

    /* JADX INFO: renamed from: b */
    private tif0 f160012b;

    /* JADX INFO: renamed from: c */
    private tif0 f160013c;

    /* JADX INFO: renamed from: d */
    private int f160014d;

    /* JADX INFO: renamed from: e */
    private int f160015e;

    /* JADX INFO: renamed from: f */
    private int f160016f;

    /* JADX INFO: renamed from: g */
    private int f160017g;

    /* JADX INFO: renamed from: h */
    private int f160018h;

    /* JADX INFO: renamed from: i */
    private int f160019i;

    /* JADX INFO: renamed from: j */
    private int f160020j;

    /* JADX INFO: renamed from: k */
    private int f160021k;

    /* JADX INFO: renamed from: m */
    private int f160023m;

    /* JADX INFO: renamed from: n */
    private float f160024n;

    /* JADX INFO: renamed from: o */
    private boolean f160025o;

    /* JADX INFO: renamed from: p */
    private int f160026p;

    /* JADX INFO: renamed from: q */
    private int f160027q;

    /* JADX INFO: renamed from: r */
    private int f160028r;

    /* JADX INFO: renamed from: l */
    private boolean f160022l = true;

    /* JADX INFO: renamed from: s */
    private int f160029s = 2;

    /* JADX INFO: renamed from: t */
    private boolean f160030t = false;

    /* JADX INFO: renamed from: u */
    private boolean f160031u = false;

    /* JADX INFO: renamed from: v */
    private boolean f160032v = false;

    /* JADX INFO: renamed from: w */
    private int f160033w = 0;

    /* JADX INFO: renamed from: x */
    private boolean f160034x = false;

    /* JADX INFO: renamed from: y */
    private boolean f160035y = false;

    /* JADX INFO: renamed from: z */
    private boolean f160036z = true;

    /* JADX INFO: renamed from: A */
    private boolean f160010A = true;

    private rlw() {
    }

    /* JADX INFO: renamed from: A */
    public static rlw m179885A() {
        rlw rlwVar = new rlw();
        rlwVar.m179902R(new tif0(640, 480));
        rlwVar.m179908X(new tif0(640, 480));
        rlwVar.m179890F(new tif0(352, 640));
        rlwVar.m179906V(20);
        rlwVar.m179907W(0);
        rlwVar.m179905U(2000000);
        rlwVar.m179889E(0);
        rlwVar.m179903S(20);
        rlwVar.m179898N(5);
        rlwVar.m179892H(1);
        rlwVar.m179891G(2);
        rlwVar.m179900P(0);
        rlwVar.m179901Q(1.7777778f);
        rlwVar.m179904T(false);
        rlwVar.m179887C(2);
        rlwVar.m179888D(44100);
        rlwVar.m179886B(1024);
        rlwVar.m179899O(2);
        rlwVar.m179894J(false);
        rlwVar.m179897M(false);
        rlwVar.m179896L(0);
        rlwVar.m179893I(false);
        return rlwVar;
    }

    /* JADX INFO: renamed from: B */
    public void m179886B(int i) {
        this.f160027q = i;
    }

    /* JADX INFO: renamed from: C */
    public void m179887C(int i) {
        this.f160026p = i;
    }

    /* JADX INFO: renamed from: D */
    public void m179888D(int i) {
        this.f160028r = i;
    }

    /* JADX INFO: renamed from: E */
    public void m179889E(int i) {
        this.f160016f = i;
    }

    /* JADX INFO: renamed from: F */
    public void m179890F(tif0 tif0Var) {
        if (this.f160022l) {
            this.f160013c = new tif0((tif0Var.m189184b() >> 4) << 4, (tif0Var.m189183a() >> 4) << 4);
        } else {
            this.f160013c = new tif0(tif0Var.m189184b(), tif0Var.m189183a());
        }
    }

    /* JADX INFO: renamed from: G */
    public void m179891G(int i) {
        this.f160021k = i;
    }

    /* JADX INFO: renamed from: H */
    public void m179892H(int i) {
        this.f160020j = i;
    }

    /* JADX INFO: renamed from: I */
    public void m179893I(boolean z) {
        this.f160034x = z;
    }

    /* JADX INFO: renamed from: J */
    public void m179894J(boolean z) {
        this.f160031u = z;
    }

    /* JADX INFO: renamed from: K */
    public void m179895K(boolean z) {
        this.f160030t = z;
    }

    /* JADX INFO: renamed from: L */
    public void m179896L(int i) {
        this.f160033w = i;
    }

    /* JADX INFO: renamed from: M */
    public void m179897M(boolean z) {
        this.f160032v = z;
    }

    /* JADX INFO: renamed from: N */
    public void m179898N(int i) {
        this.f160018h = i;
    }

    /* JADX INFO: renamed from: O */
    public void m179899O(int i) {
        if (i != 2) {
            m179895K(true);
        }
        this.f160029s = i;
    }

    /* JADX INFO: renamed from: P */
    public void m179900P(int i) {
        this.f160023m = i;
    }

    /* JADX INFO: renamed from: Q */
    public void m179901Q(float f) {
        this.f160024n = f;
    }

    /* JADX INFO: renamed from: R */
    public void m179902R(tif0 tif0Var) {
        this.f160011a = tif0Var;
    }

    /* JADX INFO: renamed from: S */
    public void m179903S(int i) {
        this.f160019i = i;
    }

    /* JADX INFO: renamed from: T */
    public void m179904T(boolean z) {
        this.f160025o = z;
    }

    /* JADX INFO: renamed from: U */
    public void m179905U(int i) {
        this.f160014d = i;
    }

    /* JADX INFO: renamed from: V */
    public void m179906V(int i) {
        this.f160017g = i;
    }

    /* JADX INFO: renamed from: W */
    public void m179907W(int i) {
        this.f160015e = i;
    }

    /* JADX INFO: renamed from: X */
    public void m179908X(tif0 tif0Var) {
        this.f160012b = tif0Var;
    }

    /* JADX INFO: renamed from: a */
    public int m179909a() {
        return this.f160027q;
    }

    /* JADX INFO: renamed from: b */
    public int m179910b() {
        return this.f160026p;
    }

    /* JADX INFO: renamed from: c */
    public int m179911c() {
        return this.f160028r;
    }

    /* JADX INFO: renamed from: d */
    public int m179912d() {
        return this.f160016f;
    }

    /* JADX INFO: renamed from: e */
    public tif0 m179913e() {
        return this.f160013c;
    }

    /* JADX INFO: renamed from: f */
    public int m179914f() {
        return this.f160021k;
    }

    /* JADX INFO: renamed from: g */
    public int m179915g() {
        return this.f160020j;
    }

    /* JADX INFO: renamed from: h */
    public boolean m179916h() {
        return this.f160034x;
    }

    /* JADX INFO: renamed from: i */
    public boolean m179917i() {
        return this.f160031u;
    }

    /* JADX INFO: renamed from: j */
    public boolean m179918j() {
        return this.f160030t;
    }

    /* JADX INFO: renamed from: k */
    public int m179919k() {
        return this.f160033w;
    }

    /* JADX INFO: renamed from: l */
    public boolean m179920l() {
        return this.f160032v;
    }

    /* JADX INFO: renamed from: m */
    public int m179921m() {
        return this.f160018h;
    }

    /* JADX INFO: renamed from: n */
    public int m179922n() {
        return this.f160029s;
    }

    /* JADX INFO: renamed from: o */
    public int m179923o() {
        return this.f160023m;
    }

    /* JADX INFO: renamed from: p */
    public float m179924p() {
        return this.f160024n;
    }

    /* JADX INFO: renamed from: q */
    public tif0 m179925q() {
        return this.f160011a;
    }

    /* JADX INFO: renamed from: r */
    public int m179926r() {
        return this.f160019i;
    }

    /* JADX INFO: renamed from: s */
    public boolean m179927s() {
        return this.f160025o;
    }

    /* JADX INFO: renamed from: t */
    public int m179928t() {
        return this.f160014d;
    }

    /* JADX INFO: renamed from: u */
    public int m179929u() {
        return this.f160017g;
    }

    /* JADX INFO: renamed from: v */
    public int m179930v() {
        return this.f160015e;
    }

    /* JADX INFO: renamed from: w */
    public tif0 m179931w() {
        return this.f160012b;
    }

    /* JADX INFO: renamed from: x */
    public boolean m179932x() {
        return this.f160035y;
    }

    /* JADX INFO: renamed from: y */
    public boolean m179933y() {
        return this.f160010A;
    }

    /* JADX INFO: renamed from: z */
    public boolean m179934z() {
        return this.f160036z;
    }
}
