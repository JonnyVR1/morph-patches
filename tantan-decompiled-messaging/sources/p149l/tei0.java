package p149l;

/* JADX INFO: loaded from: classes.dex */
public class tei0<TResult> {

    /* JADX INFO: renamed from: a */
    private final iei0<TResult> f169843a = new iei0<>();

    /* JADX INFO: renamed from: a */
    public iei0<TResult> m188501a() {
        return this.f169843a;
    }

    /* JADX INFO: renamed from: b */
    public void m188502b() {
        if (m188505e()) {
            return;
        }
        qkq0.m175383a("Cannot cancel a completed task.");
    }

    /* JADX INFO: renamed from: c */
    public void m188503c(Exception exc) {
        if (m188506f(exc)) {
            return;
        }
        qkq0.m175383a("Cannot set the error on a completed task.");
    }

    /* JADX INFO: renamed from: d */
    public void m188504d(TResult tresult) {
        if (m188507g(tresult)) {
            return;
        }
        qkq0.m175383a("Cannot set the result of a completed task.");
    }

    /* JADX INFO: renamed from: e */
    public boolean m188505e() {
        return this.f169843a.m135704p();
    }

    /* JADX INFO: renamed from: f */
    public boolean m188506f(Exception exc) {
        return this.f169843a.m135705q(exc);
    }

    /* JADX INFO: renamed from: g */
    public boolean m188507g(TResult tresult) {
        return this.f169843a.m135706r(tresult);
    }
}
