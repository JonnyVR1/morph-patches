package p153l;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import junit.framework.AssertionFailedError;

/* JADX INFO: loaded from: classes2.dex */
public class tqi0 {

    /* JADX INFO: renamed from: a */
    protected List<pqi0> f175742a = new ArrayList();

    /* JADX INFO: renamed from: b */
    protected List<pqi0> f175743b = new ArrayList();

    /* JADX INFO: renamed from: c */
    protected List<sqi0> f175744c = new ArrayList();

    /* JADX INFO: renamed from: d */
    protected int f175745d = 0;

    /* JADX INFO: renamed from: e */
    private boolean f175746e = false;

    /* JADX INFO: renamed from: l.tqi0$a */
    public class C20378a implements b7b0 {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ nqi0 f175747a;

        public C20378a(nqi0 nqi0Var) throws Throwable {
            this.f175747a = nqi0Var;
        }

        @Override // p153l.b7b0
        /* JADX INFO: renamed from: a */
        public void mo102823a() throws Throwable {
            this.f175747a.m164315h();
        }
    }

    /* JADX INFO: renamed from: d */
    private synchronized List<sqi0> m192307d() {
        ArrayList arrayList;
        arrayList = new ArrayList();
        arrayList.addAll(this.f175744c);
        return arrayList;
    }

    /* JADX INFO: renamed from: a */
    public synchronized void m192308a(mqi0 mqi0Var, Throwable th) {
        this.f175743b.add(new pqi0(mqi0Var, th));
        Iterator<sqi0> it = m192307d().iterator();
        while (it.hasNext()) {
            it.next().addError(mqi0Var, th);
        }
    }

    /* JADX INFO: renamed from: b */
    public synchronized void m192309b(mqi0 mqi0Var, AssertionFailedError assertionFailedError) {
        this.f175742a.add(new pqi0(mqi0Var, assertionFailedError));
        Iterator<sqi0> it = m192307d().iterator();
        while (it.hasNext()) {
            it.next().addFailure(mqi0Var, assertionFailedError);
        }
    }

    /* JADX INFO: renamed from: c */
    public synchronized void m192310c(sqi0 sqi0Var) {
        this.f175744c.add(sqi0Var);
    }

    /* JADX INFO: renamed from: e */
    public void m192311e(mqi0 mqi0Var) {
        Iterator<sqi0> it = m192307d().iterator();
        while (it.hasNext()) {
            it.next().endTest(mqi0Var);
        }
    }

    /* JADX INFO: renamed from: f */
    public void m192312f(nqi0 nqi0Var) {
        m192315i(nqi0Var);
        m192313g(nqi0Var, new C20378a(nqi0Var));
        m192311e(nqi0Var);
    }

    /* JADX INFO: renamed from: g */
    public void m192313g(mqi0 mqi0Var, b7b0 b7b0Var) {
        try {
            b7b0Var.mo102823a();
        } catch (ThreadDeath e) {
            throw e;
        } catch (AssertionFailedError e2) {
            m192309b(mqi0Var, e2);
        } catch (Throwable th) {
            m192308a(mqi0Var, th);
        }
    }

    /* JADX INFO: renamed from: h */
    public synchronized boolean m192314h() {
        return this.f175746e;
    }

    /* JADX INFO: renamed from: i */
    public void m192315i(mqi0 mqi0Var) {
        int iMo110697b = mqi0Var.mo110697b();
        synchronized (this) {
            this.f175745d += iMo110697b;
        }
        Iterator<sqi0> it = m192307d().iterator();
        while (it.hasNext()) {
            it.next().startTest(mqi0Var);
        }
    }
}
