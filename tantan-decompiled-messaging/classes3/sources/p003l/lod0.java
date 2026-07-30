package p003l;

import java.util.Arrays;
import p014rx.exceptions.CompositeException;
import p014rx.exceptions.OnCompletedFailedException;
import p014rx.exceptions.OnErrorFailedException;
import p014rx.exceptions.OnErrorNotImplementedException;
import p014rx.exceptions.UnsubscribeFailedException;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class lod0<T> extends z3g0<T> {

    /* JADX INFO: renamed from: e */
    public final z3g0<? super T> f5374e;

    /* JADX INFO: renamed from: f */
    public boolean f5375f;

    public lod0(z3g0<? super T> z3g0Var) {
        super(z3g0Var);
        this.f5374e = z3g0Var;
    }

    /* JADX INFO: renamed from: g */
    public void m6138g(Throwable th) {
        ejd0.m3864j(th);
        try {
            this.f5374e.onError(th);
            try {
                unsubscribe();
            } catch (Throwable th2) {
                ejd0.m3864j(th2);
                throw new OnErrorFailedException(th2);
            }
        } catch (OnErrorNotImplementedException e) {
            try {
                unsubscribe();
                throw e;
            } catch (Throwable th3) {
                ejd0.m3864j(th3);
                throw new OnErrorNotImplementedException("Observer.onError not implemented and error while unsubscribing.", new CompositeException(Arrays.asList(th, th3)));
            }
        } catch (Throwable th4) {
            ejd0.m3864j(th4);
            try {
                unsubscribe();
                throw new OnErrorFailedException("Error occurred when trying to propagate error to Observer.onError", new CompositeException(Arrays.asList(th, th4)));
            } catch (Throwable th5) {
                ejd0.m3864j(th5);
                throw new OnErrorFailedException("Error occurred when trying to propagate error to Observer.onError and during unsubscription.", new CompositeException(Arrays.asList(th, th4, th5)));
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public z3g0<? super T> m6139h() {
        return this.f5374e;
    }

    @Override // p003l.m250
    public void onCompleted() {
        if (this.f5375f) {
            return;
        }
        this.f5375f = true;
        try {
            this.f5374e.onCompleted();
            try {
                unsubscribe();
            } catch (Throwable th) {
                ejd0.m3864j(th);
                throw new UnsubscribeFailedException(th.getMessage(), th);
            }
        } catch (Throwable th2) {
            try {
                f5f.m3964e(th2);
                ejd0.m3864j(th2);
                throw new OnCompletedFailedException(th2.getMessage(), th2);
            } catch (Throwable th3) {
                try {
                    unsubscribe();
                    throw th3;
                } catch (Throwable th4) {
                    ejd0.m3864j(th4);
                    throw new UnsubscribeFailedException(th4.getMessage(), th4);
                }
            }
        }
    }

    @Override // p003l.m250
    public void onError(Throwable th) {
        f5f.m3964e(th);
        if (this.f5375f) {
            return;
        }
        this.f5375f = true;
        m6138g(th);
    }

    @Override // p003l.m250
    public void onNext(T t) {
        try {
            if (this.f5375f) {
                return;
            }
            this.f5374e.onNext(t);
        } catch (Throwable th) {
            f5f.m3965f(th, this);
        }
    }
}
