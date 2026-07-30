package p149l;

import android.util.Pair;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public class ppi0<T> implements sc90<T> {

    /* JADX INFO: renamed from: a */
    public final sc90<T> f150651a;

    /* JADX INFO: renamed from: b */
    public final int f150652b;

    /* JADX INFO: renamed from: e */
    public final Executor f150655e;

    /* JADX INFO: renamed from: d */
    public final ConcurrentLinkedQueue<Pair<uz5<T>, uc90>> f150654d = new ConcurrentLinkedQueue<>();

    /* JADX INFO: renamed from: c */
    public int f150653c = 0;

    /* JADX INFO: renamed from: l.ppi0$a */
    public class C19309a extends btd<T, T> {

        /* JADX INFO: renamed from: l.ppi0$a$a */
        public class a implements Runnable {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ Pair f150657a;

            public a(Pair pair) {
                this.f150657a = pair;
            }

            @Override // java.lang.Runnable
            public void run() {
                ppi0 ppi0Var = ppi0.this;
                Pair pair = this.f150657a;
                ppi0Var.m170732g((uz5) pair.first, (uc90) pair.second);
            }
        }

        public C19309a(uz5<T> uz5Var) {
            super(uz5Var);
        }

        @Override // p149l.btd, p149l.ci2
        /* JADX INFO: renamed from: f */
        public void mo8521f() {
            m103812o().mo107034a();
            m170733p();
        }

        @Override // p149l.btd, p149l.ci2
        /* JADX INFO: renamed from: g */
        public void mo8522g(Throwable th) {
            m103812o().onFailure(th);
            m170733p();
        }

        @Override // p149l.ci2
        /* JADX INFO: renamed from: h */
        public void mo8523h(T t, int i) {
            m103812o().mo107035b(t, i);
            if (ci2.m107028d(i)) {
                m170733p();
            }
        }

        /* JADX INFO: renamed from: p */
        public final void m170733p() {
            Pair pair;
            synchronized (ppi0.this) {
                try {
                    pair = (Pair) ppi0.this.f150654d.poll();
                    if (pair == null) {
                        ppi0.this.f150653c--;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (pair != null) {
                ppi0.this.f150655e.execute(new a(pair));
            }
        }
    }

    public ppi0(int i, Executor executor, sc90<T> sc90Var) {
        this.f150652b = i;
        this.f150655e = (Executor) rf80.m179116g(executor);
        this.f150651a = (sc90) rf80.m179116g(sc90Var);
    }

    @Override // p149l.sc90
    /* JADX INFO: renamed from: b */
    public void mo8485b(uz5<T> uz5Var, uc90 uc90Var) {
        boolean z;
        uc90Var.mo155870n().mo104754d(uc90Var, "ThrottlingProducer");
        synchronized (this) {
            try {
                int i = this.f150653c;
                z = true;
                if (i >= this.f150652b) {
                    this.f150654d.add(Pair.create(uz5Var, uc90Var));
                } else {
                    this.f150653c = i + 1;
                    z = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z) {
            return;
        }
        m170732g(uz5Var, uc90Var);
    }

    /* JADX INFO: renamed from: g */
    public void m170732g(uz5<T> uz5Var, uc90 uc90Var) {
        uc90Var.mo155870n().mo104756f(uc90Var, "ThrottlingProducer", null);
        this.f150651a.mo8485b(new C19309a(uz5Var), uc90Var);
    }
}
