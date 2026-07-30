package p153l;

import java.util.Iterator;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes3.dex */
public final class m560<T1, T2, R> implements C22421c.c<R, T1> {

    /* JADX INFO: renamed from: a */
    public final Iterable<? extends T2> f134868a;

    /* JADX INFO: renamed from: b */
    public final rcj<? super T1, ? super T2, ? extends R> f134869b;

    /* JADX INFO: renamed from: l.m560$a */
    public class C18549a extends gcg0<T1> {

        /* JADX INFO: renamed from: e */
        public boolean f134870e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ gcg0 f134871f;

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ Iterator f134872g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C18549a(gcg0 gcg0Var, gcg0 gcg0Var2, Iterator it) {
            super(gcg0Var);
            this.f134871f = gcg0Var2;
            this.f134872g = it;
        }

        @Override // p153l.bb50
        public void onCompleted() {
            if (this.f134870e) {
                return;
            }
            this.f134870e = true;
            this.f134871f.onCompleted();
        }

        @Override // p153l.bb50
        public void onError(Throwable th) {
            if (this.f134870e) {
                j6f.m143663e(th);
            } else {
                this.f134870e = true;
                this.f134871f.onError(th);
            }
        }

        @Override // p153l.bb50
        public void onNext(T1 t1) {
            if (this.f134870e) {
                return;
            }
            try {
                this.f134871f.onNext(m560.this.f134869b.call(t1, (Object) this.f134872g.next()));
                if (this.f134872g.hasNext()) {
                    return;
                }
                onCompleted();
            } catch (Throwable th) {
                j6f.m143664f(th, this);
            }
        }
    }

    public m560(Iterable<? extends T2> iterable, rcj<? super T1, ? super T2, ? extends R> rcjVar) {
        this.f134868a = iterable;
        this.f134869b = rcjVar;
    }

    @Override // p153l.qcj
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public gcg0<? super T1> call(gcg0<? super R> gcg0Var) {
        Iterator<? extends T2> it = this.f134868a.iterator();
        try {
            if (it.hasNext()) {
                return new C18549a(gcg0Var, gcg0Var, it);
            }
            gcg0Var.onCompleted();
            return icg0.m139434a();
        } catch (Throwable th) {
            j6f.m143664f(th, gcg0Var);
            return icg0.m139434a();
        }
    }
}
