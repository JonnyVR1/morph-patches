package p153l;

import p137rx.subjects.C22507a;

/* JADX INFO: loaded from: classes8.dex */
public class qk80 implements Comparable<qk80> {

    /* JADX INFO: renamed from: a */
    public String f158105a;

    /* JADX INFO: renamed from: b */
    public e3m f158106b;

    /* JADX INFO: renamed from: e */
    public d3m f158109e;

    /* JADX INFO: renamed from: f */
    public l4g0 f158110f;

    /* JADX INFO: renamed from: c */
    public int f158107c = 30000;

    /* JADX INFO: renamed from: d */
    public long f158108d = 0;

    /* JADX INFO: renamed from: g */
    public boolean f158111g = false;

    /* JADX INFO: renamed from: l.qk80$a */
    public class C19592a extends ur2 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f158112a;

        public C19592a(String str) {
            this.f158112a = str;
        }

        @Override // p153l.e6m
        public String pageId() {
            return this.f158112a;
        }
    }

    public qk80(String str, e3m e3mVar, d3m d3mVar) {
        this.f158105a = str;
        this.f158106b = e3mVar;
        this.f158109e = d3mVar;
    }

    /* JADX INFO: renamed from: a */
    public void m176927a(boolean z) {
        this.f158109e.mo21871n(z);
    }

    /* JADX INFO: renamed from: b */
    public boolean m176928b() {
        return this.f158109e.mo21859a();
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public int compareTo(qk80 qk80Var) {
        return qk80Var.m176931h() - m176931h();
    }

    /* JADX INFO: renamed from: g */
    public long m176930g() {
        return this.f158108d;
    }

    /* JADX INFO: renamed from: h */
    public int m176931h() {
        return this.f158107c;
    }

    /* JADX INFO: renamed from: i */
    public String m176932i() {
        return this.f158106b.getPopLifeName();
    }

    /* JADX INFO: renamed from: j */
    public String m176933j() {
        return this.f158105a;
    }

    /* JADX INFO: renamed from: m */
    public C22507a<vk80> m176934m() {
        return this.f158106b.popLifeObs();
    }

    /* JADX INFO: renamed from: n */
    public d3m m176935n() {
        return this.f158109e;
    }

    /* JADX INFO: renamed from: o */
    public void m176936o(boolean z) {
        this.f158109e.mo21864f(z);
    }

    /* JADX INFO: renamed from: p */
    public void m176937p() {
        l4g0 l4g0Var = this.f158110f;
        if (l4g0Var == null || !this.f158111g) {
            return;
        }
        l4g0Var.m152776k();
        this.f158110f.m152775j();
    }

    /* JADX INFO: renamed from: q */
    public void m176938q(String str) {
        if (this.f158110f == null && this.f158111g) {
            l4g0 l4g0Var = new l4g0(new C19592a(str), qk80.class.getName());
            this.f158110f = l4g0Var;
            l4g0Var.m152781p(pf60.m172085a("popup_id", this.f158105a), pf60.m172085a("popup_priority", Integer.valueOf(m176931h())));
            this.f158110f.m152768c();
            this.f158110f.m152783r();
        }
    }

    /* JADX INFO: renamed from: r */
    public void m176939r(boolean z) {
        this.f158111g = z;
    }

    /* JADX INFO: renamed from: s */
    public void m176940s(int i) {
        this.f158107c = i;
    }

    /* JADX INFO: renamed from: t */
    public void m176941t(long j) {
        this.f158108d = j;
    }
}
