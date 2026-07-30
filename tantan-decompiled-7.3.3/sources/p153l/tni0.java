package p153l;

/* JADX INFO: loaded from: classes.dex */
public class tni0<TResult> {

    /* JADX INFO: renamed from: a */
    private final ini0<TResult> f175276a = new ini0<>();

    /* JADX INFO: renamed from: a */
    public ini0<TResult> m191905a() {
        return this.f175276a;
    }

    /* JADX INFO: renamed from: b */
    public void m191906b() {
        if (m191909e()) {
            return;
        }
        wtq0.m207906a("Cannot cancel a completed task.");
    }

    /* JADX INFO: renamed from: c */
    public void m191907c(Exception exc) {
        if (m191910f(exc)) {
            return;
        }
        wtq0.m207906a("Cannot set the error on a completed task.");
    }

    /* JADX INFO: renamed from: d */
    public void m191908d(TResult tresult) {
        if (m191911g(tresult)) {
            return;
        }
        wtq0.m207906a("Cannot set the result of a completed task.");
    }

    /* JADX INFO: renamed from: e */
    public boolean m191909e() {
        return this.f175276a.m141146p();
    }

    /* JADX INFO: renamed from: f */
    public boolean m191910f(Exception exc) {
        return this.f175276a.m141147q(exc);
    }

    /* JADX INFO: renamed from: g */
    public boolean m191911g(TResult tresult) {
        return this.f175276a.m141148r(tresult);
    }
}
