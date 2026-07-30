package p153l;

import p137rx.C22421c;

/* JADX INFO: loaded from: classes3.dex */
public final class k460<T> implements C22421c.c<T, T> {

    /* JADX INFO: renamed from: a */
    public final rcj<? super T, Integer, Boolean> f123855a;

    /* JADX INFO: renamed from: l.k460$a */
    public class C18091a extends gcg0<T> {

        /* JADX INFO: renamed from: e */
        public boolean f123856e;

        /* JADX INFO: renamed from: f */
        public int f123857f;

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ gcg0 f123858g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C18091a(gcg0 gcg0Var, gcg0 gcg0Var2) {
            super(gcg0Var);
            this.f123858g = gcg0Var2;
            this.f123856e = true;
        }

        @Override // p153l.bb50
        public void onCompleted() {
            this.f123858g.onCompleted();
        }

        @Override // p153l.bb50
        public void onError(Throwable th) {
            this.f123858g.onError(th);
        }

        @Override // p153l.bb50
        public void onNext(T t) {
            if (!this.f123856e) {
                this.f123858g.onNext(t);
                return;
            }
            try {
                rcj<? super T, Integer, Boolean> rcjVar = k460.this.f123855a;
                int i = this.f123857f;
                this.f123857f = i + 1;
                if (rcjVar.call(t, Integer.valueOf(i)).booleanValue()) {
                    m129868e(1L);
                } else {
                    this.f123856e = false;
                    this.f123858g.onNext(t);
                }
            } catch (Throwable th) {
                j6f.m143665g(th, this.f123858g, t);
            }
        }
    }

    /* JADX INFO: renamed from: l.k460$b */
    public static class C18092b implements rcj<T, Integer, Boolean> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ qcj f123860a;

        public C18092b(qcj qcjVar) {
            this.f123860a = qcjVar;
        }

        @Override // p153l.rcj
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean call(T t, Integer num) {
            return (Boolean) this.f123860a.call(t);
        }
    }

    public k460(rcj<? super T, Integer, Boolean> rcjVar) {
        this.f123855a = rcjVar;
    }

    /* JADX INFO: renamed from: b */
    public static <T> rcj<T, Integer, Boolean> m148237b(qcj<? super T, Boolean> qcjVar) {
        return new C18092b(qcjVar);
    }

    @Override // p153l.qcj
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public gcg0<? super T> call(gcg0<? super T> gcg0Var) {
        return new C18091a(gcg0Var, gcg0Var);
    }
}
