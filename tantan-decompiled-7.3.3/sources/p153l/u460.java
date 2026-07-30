package p153l;

import p137rx.C22421c;

/* JADX INFO: loaded from: classes3.dex */
public final class u460<T> implements C22421c.c<T, T> {

    /* JADX INFO: renamed from: a */
    public final rcj<? super T, ? super Integer, Boolean> f177433a;

    /* JADX INFO: renamed from: l.u460$a */
    public class C20483a implements rcj<T, Integer, Boolean> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ qcj f177434a;

        public C20483a(qcj qcjVar) {
            this.f177434a = qcjVar;
        }

        @Override // p153l.rcj
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean call(T t, Integer num) {
            return (Boolean) this.f177434a.call(t);
        }
    }

    /* JADX INFO: renamed from: l.u460$b */
    public class C20484b extends gcg0<T> {

        /* JADX INFO: renamed from: e */
        public int f177435e;

        /* JADX INFO: renamed from: f */
        public boolean f177436f;

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ gcg0 f177437g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C20484b(gcg0 gcg0Var, boolean z, gcg0 gcg0Var2) {
            super(gcg0Var, z);
            this.f177437g = gcg0Var2;
        }

        @Override // p153l.bb50
        public void onCompleted() {
            if (this.f177436f) {
                return;
            }
            this.f177437g.onCompleted();
        }

        @Override // p153l.bb50
        public void onError(Throwable th) {
            if (this.f177436f) {
                return;
            }
            this.f177437g.onError(th);
        }

        @Override // p153l.bb50
        public void onNext(T t) {
            try {
                rcj<? super T, ? super Integer, Boolean> rcjVar = u460.this.f177433a;
                int i = this.f177435e;
                this.f177435e = i + 1;
                if (rcjVar.call(t, Integer.valueOf(i)).booleanValue()) {
                    this.f177437g.onNext(t);
                    return;
                }
                this.f177436f = true;
                this.f177437g.onCompleted();
                unsubscribe();
            } catch (Throwable th) {
                this.f177436f = true;
                j6f.m143665g(th, this.f177437g, t);
                unsubscribe();
            }
        }
    }

    public u460(qcj<? super T, Boolean> qcjVar) {
        this(new C20483a(qcjVar));
    }

    @Override // p153l.qcj
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public gcg0<? super T> call(gcg0<? super T> gcg0Var) {
        C20484b c20484b = new C20484b(gcg0Var, false, gcg0Var);
        gcg0Var.m129866b(c20484b);
        return c20484b;
    }

    public u460(rcj<? super T, ? super Integer, Boolean> rcjVar) {
        this.f177433a = rcjVar;
    }
}
