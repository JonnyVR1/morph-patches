package p153l;

/* JADX INFO: loaded from: classes4.dex */
public abstract class fk2 implements xsl {

    /* JADX INFO: renamed from: a */
    public final int f99447a;

    /* JADX INFO: renamed from: b */
    public final int f99448b;

    public fk2(gk2 gk2Var) {
        this.f99447a = gk2Var.f104701a;
        this.f99448b = gk2Var.f104702b;
    }

    /* JADX INFO: renamed from: a */
    public int mo125930a() {
        return this.f99447a;
    }

    @Override // p153l.xsl
    public int getAction() {
        return this.f99448b;
    }

    public fk2() {
        this.f99447a = 0;
        this.f99448b = 0;
    }
}
