package p149l;

/* JADX INFO: loaded from: classes6.dex */
public final class p6y0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ cjw0 f147463a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ r6y0 f147464b;

    public p6y0(r6y0 r6y0Var, cjw0 cjw0Var) {
        this.f147463a = cjw0Var;
        this.f147464b = r6y0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f147464b) {
            try {
                this.f147464b.f157990a = false;
                if (!this.f147464b.f157992c.m100156a0()) {
                    this.f147464b.f157992c.zzj().m211416E().m123936a("Connected to service");
                    this.f147464b.f157992c.m100141J(this.f147463a);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
