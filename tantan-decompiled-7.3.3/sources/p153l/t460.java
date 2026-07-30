package p153l;

import p137rx.C22421c;

/* JADX INFO: loaded from: classes3.dex */
public final class t460<T> implements C22421c.c<T, T> {

    /* JADX INFO: renamed from: a */
    public final qcj<? super T, Boolean> f172015a;

    /* JADX INFO: renamed from: l.t460$a */
    public class C20231a implements vk90 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C20232b f172016a;

        public C20231a(C20232b c20232b) {
            this.f172016a = c20232b;
        }

        @Override // p153l.vk90
        public void request(long j) {
            this.f172016a.m189191g(j);
        }
    }

    /* JADX INFO: renamed from: l.t460$b */
    public final class C20232b extends gcg0<T> {

        /* JADX INFO: renamed from: e */
        public final gcg0<? super T> f172018e;

        /* JADX INFO: renamed from: f */
        public boolean f172019f;

        public C20232b(gcg0<? super T> gcg0Var) {
            this.f172018e = gcg0Var;
        }

        /* JADX INFO: renamed from: g */
        public void m189191g(long j) {
            m129868e(j);
        }

        @Override // p153l.bb50
        public void onCompleted() {
            if (this.f172019f) {
                return;
            }
            this.f172018e.onCompleted();
        }

        @Override // p153l.bb50
        public void onError(Throwable th) {
            if (this.f172019f) {
                return;
            }
            this.f172018e.onError(th);
        }

        @Override // p153l.bb50
        public void onNext(T t) {
            this.f172018e.onNext(t);
            try {
                if (t460.this.f172015a.call(t).booleanValue()) {
                    this.f172019f = true;
                    this.f172018e.onCompleted();
                    unsubscribe();
                }
            } catch (Throwable th) {
                this.f172019f = true;
                j6f.m143665g(th, this.f172018e, t);
                unsubscribe();
            }
        }
    }

    public t460(qcj<? super T, Boolean> qcjVar) {
        this.f172015a = qcjVar;
    }

    @Override // p153l.qcj
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public gcg0<? super T> call(gcg0<? super T> gcg0Var) {
        C20232b c20232b = new C20232b(gcg0Var);
        gcg0Var.m129866b(c20232b);
        gcg0Var.mo95773f(new C20231a(c20232b));
        return c20232b;
    }
}
