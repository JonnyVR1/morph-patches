package p149l;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import junit.framework.AssertionFailedError;

/* JADX INFO: loaded from: classes2.dex */
public class thi0 {

    /* JADX INFO: renamed from: a */
    protected List<phi0> f170252a = new ArrayList();

    /* JADX INFO: renamed from: b */
    protected List<phi0> f170253b = new ArrayList();

    /* JADX INFO: renamed from: c */
    protected List<shi0> f170254c = new ArrayList();

    /* JADX INFO: renamed from: d */
    protected int f170255d = 0;

    /* JADX INFO: renamed from: e */
    private boolean f170256e = false;

    /* JADX INFO: renamed from: l.thi0$a */
    public class C20177a implements xya0 {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ nhi0 f170257a;

        public C20177a(nhi0 nhi0Var) throws Throwable {
            this.f170257a = nhi0Var;
        }

        @Override // p149l.xya0
        /* JADX INFO: renamed from: a */
        public void mo188921a() throws Throwable {
            this.f170257a.m159411h();
        }
    }

    /* JADX INFO: renamed from: d */
    private synchronized List<shi0> m188912d() {
        ArrayList arrayList;
        arrayList = new ArrayList();
        arrayList.addAll(this.f170254c);
        return arrayList;
    }

    /* JADX INFO: renamed from: a */
    public synchronized void m188913a(mhi0 mhi0Var, Throwable th) {
        this.f170253b.add(new phi0(mhi0Var, th));
        Iterator<shi0> it = m188912d().iterator();
        while (it.hasNext()) {
            it.next().addError(mhi0Var, th);
        }
    }

    /* JADX INFO: renamed from: b */
    public synchronized void m188914b(mhi0 mhi0Var, AssertionFailedError assertionFailedError) {
        this.f170252a.add(new phi0(mhi0Var, assertionFailedError));
        Iterator<shi0> it = m188912d().iterator();
        while (it.hasNext()) {
            it.next().addFailure(mhi0Var, assertionFailedError);
        }
    }

    /* JADX INFO: renamed from: c */
    public synchronized void m188915c(shi0 shi0Var) {
        this.f170254c.add(shi0Var);
    }

    /* JADX INFO: renamed from: e */
    public void m188916e(mhi0 mhi0Var) {
        Iterator<shi0> it = m188912d().iterator();
        while (it.hasNext()) {
            it.next().endTest(mhi0Var);
        }
    }

    /* JADX INFO: renamed from: f */
    public void m188917f(nhi0 nhi0Var) {
        m188920i(nhi0Var);
        m188918g(nhi0Var, new C20177a(nhi0Var));
        m188916e(nhi0Var);
    }

    /* JADX INFO: renamed from: g */
    public void m188918g(mhi0 mhi0Var, xya0 xya0Var) {
        try {
            xya0Var.mo188921a();
        } catch (ThreadDeath e) {
            throw e;
        } catch (AssertionFailedError e2) {
            m188914b(mhi0Var, e2);
        } catch (Throwable th) {
            m188913a(mhi0Var, th);
        }
    }

    /* JADX INFO: renamed from: h */
    public synchronized boolean m188919h() {
        return this.f170256e;
    }

    /* JADX INFO: renamed from: i */
    public void m188920i(mhi0 mhi0Var) {
        int iMo112098b = mhi0Var.mo112098b();
        synchronized (this) {
            this.f170255d += iMo112098b;
        }
        Iterator<shi0> it = m188912d().iterator();
        while (it.hasNext()) {
            it.next().startTest(mhi0Var);
        }
    }
}
