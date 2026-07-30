package p153l;

import android.util.Pair;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public class syi0<T> implements wk90<T> {

    /* JADX INFO: renamed from: a */
    public final wk90<T> f171259a;

    /* JADX INFO: renamed from: b */
    public final int f171260b;

    /* JADX INFO: renamed from: e */
    public final Executor f171263e;

    /* JADX INFO: renamed from: d */
    public final ConcurrentLinkedQueue<Pair<z06<T>, yk90>> f171262d = new ConcurrentLinkedQueue<>();

    /* JADX INFO: renamed from: c */
    public int f171261c = 0;

    /* JADX INFO: renamed from: l.syi0$a */
    public class C20187a extends pud<T, T> {

        /* JADX INFO: renamed from: l.syi0$a$a */
        public class a implements Runnable {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ Pair f171265a;

            public a(Pair pair) {
                this.f171265a = pair;
            }

            @Override // java.lang.Runnable
            public void run() {
                syi0 syi0Var = syi0.this;
                Pair pair = this.f171265a;
                syi0Var.m188570g((z06) pair.first, (yk90) pair.second);
            }
        }

        public C20187a(z06<T> z06Var) {
            super(z06Var);
        }

        @Override // p153l.pud, p153l.ji2
        /* JADX INFO: renamed from: f */
        public void mo8575f() {
            m173861o().mo144953a();
            m188571p();
        }

        @Override // p153l.pud, p153l.ji2
        /* JADX INFO: renamed from: g */
        public void mo8576g(Throwable th) {
            m173861o().onFailure(th);
            m188571p();
        }

        @Override // p153l.ji2
        /* JADX INFO: renamed from: h */
        public void mo8577h(T t, int i) {
            m173861o().mo144954b(t, i);
            if (ji2.m144947d(i)) {
                m188571p();
            }
        }

        /* JADX INFO: renamed from: p */
        public final void m188571p() {
            Pair pair;
            synchronized (syi0.this) {
                try {
                    pair = (Pair) syi0.this.f171262d.poll();
                    if (pair == null) {
                        syi0.this.f171261c--;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (pair != null) {
                syi0.this.f171263e.execute(new a(pair));
            }
        }
    }

    public syi0(int i, Executor executor, wk90<T> wk90Var) {
        this.f171260b = i;
        this.f171263e = (Executor) wn80.m207182g(executor);
        this.f171259a = (wk90) wn80.m207182g(wk90Var);
    }

    @Override // p153l.wk90
    /* JADX INFO: renamed from: b */
    public void mo8539b(z06<T> z06Var, yk90 yk90Var) {
        boolean z;
        yk90Var.mo117675n().mo110444d(yk90Var, "ThrottlingProducer");
        synchronized (this) {
            try {
                int i = this.f171261c;
                z = true;
                if (i >= this.f171260b) {
                    this.f171262d.add(Pair.create(z06Var, yk90Var));
                } else {
                    this.f171261c = i + 1;
                    z = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z) {
            return;
        }
        m188570g(z06Var, yk90Var);
    }

    /* JADX INFO: renamed from: g */
    public void m188570g(z06<T> z06Var, yk90 yk90Var) {
        yk90Var.mo117675n().mo110446f(yk90Var, "ThrottlingProducer", null);
        this.f171259a.mo8539b(new C20187a(z06Var), yk90Var);
    }
}
