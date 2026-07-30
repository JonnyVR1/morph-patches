package p153l;

/* JADX INFO: loaded from: classes.dex */
public class q1r0 {

    /* JADX INFO: renamed from: b */
    private static final q1r0 f155217b = new C19493a();

    /* JADX INFO: renamed from: a */
    private q1r0 f155218a;

    /* JADX INFO: renamed from: l.q1r0$a */
    public static class C19493a extends q1r0 {

        /* JADX INFO: renamed from: c */
        hwq0 f155219c = null;

        @Override // p153l.q1r0
        /* JADX INFO: renamed from: b */
        public Object mo174928b(String str) {
            if (this.f155219c == null) {
                this.f155219c = hwq0.m137481g(n0r0.m161022i());
            }
            return this.f155219c.m137501s().opt(str);
        }
    }

    public q1r0() {
        this(f155217b);
    }

    /* JADX INFO: renamed from: a */
    public Object mo169541a(String str) {
        q1r0 q1r0Var = this.f155218a;
        if (q1r0Var != null) {
            return q1r0Var.mo169541a(str);
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public Object mo174928b(String str) {
        q1r0 q1r0Var = this.f155218a;
        if (q1r0Var != null) {
            return q1r0Var.mo174928b(str);
        }
        return null;
    }

    public q1r0(q1r0 q1r0Var) {
        this.f155218a = q1r0Var;
    }
}
