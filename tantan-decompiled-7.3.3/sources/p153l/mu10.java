package p153l;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class mu10 implements kcg0 {

    /* JADX INFO: renamed from: a */
    public final AtomicReference<C18709a> f138714a = new AtomicReference<>(new C18709a(false, pcg0.m171649b()));

    /* JADX INFO: renamed from: l.mu10$a */
    public static final class C18709a {

        /* JADX INFO: renamed from: a */
        public final boolean f138715a;

        /* JADX INFO: renamed from: b */
        public final kcg0 f138716b;

        public C18709a(boolean z, kcg0 kcg0Var) {
            this.f138715a = z;
            this.f138716b = kcg0Var;
        }

        /* JADX INFO: renamed from: a */
        public C18709a m160065a(kcg0 kcg0Var) {
            return new C18709a(this.f138715a, kcg0Var);
        }

        /* JADX INFO: renamed from: b */
        public C18709a m160066b() {
            return new C18709a(true, this.f138716b);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m160064a(kcg0 kcg0Var) {
        C18709a c18709a;
        if (kcg0Var == null) {
            wg3.m206174a("Subscription can not be null");
            return;
        }
        AtomicReference<C18709a> atomicReference = this.f138714a;
        do {
            c18709a = atomicReference.get();
            if (c18709a.f138715a) {
                kcg0Var.unsubscribe();
                return;
            }
        } while (!m31.m156916a(atomicReference, c18709a, c18709a.m160065a(kcg0Var)));
    }

    @Override // p153l.kcg0
    public boolean isUnsubscribed() {
        return this.f138714a.get().f138715a;
    }

    @Override // p153l.kcg0
    public void unsubscribe() {
        C18709a c18709a;
        AtomicReference<C18709a> atomicReference = this.f138714a;
        do {
            c18709a = atomicReference.get();
            if (c18709a.f138715a) {
                return;
            }
        } while (!m31.m156916a(atomicReference, c18709a, c18709a.m160066b()));
        c18709a.f138716b.unsubscribe();
    }
}
