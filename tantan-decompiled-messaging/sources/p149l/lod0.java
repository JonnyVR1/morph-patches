package p149l;

import java.util.Arrays;
import p133rx.exceptions.CompositeException;
import p133rx.exceptions.OnCompletedFailedException;
import p133rx.exceptions.OnErrorFailedException;
import p133rx.exceptions.OnErrorNotImplementedException;
import p133rx.exceptions.UnsubscribeFailedException;

/* JADX INFO: loaded from: classes3.dex */
public class lod0<T> extends z3g0<T> {

    /* JADX INFO: renamed from: e */
    public final z3g0<? super T> f129086e;

    /* JADX INFO: renamed from: f */
    public boolean f129087f;

    public lod0(z3g0<? super T> z3g0Var) {
        super(z3g0Var);
        this.f129086e = z3g0Var;
    }

    /* JADX INFO: renamed from: g */
    public void m150763g(Throwable th) {
        ejd0.m116793j(th);
        try {
            this.f129086e.onError(th);
            try {
                unsubscribe();
            } catch (Throwable th2) {
                ejd0.m116793j(th2);
                throw new OnErrorFailedException(th2);
            }
        } catch (OnErrorNotImplementedException e) {
            try {
                unsubscribe();
                throw e;
            } catch (Throwable th3) {
                ejd0.m116793j(th3);
                throw new OnErrorNotImplementedException("Observer.onError not implemented and error while unsubscribing.", new CompositeException(Arrays.asList(th, th3)));
            }
        } catch (Throwable th4) {
            ejd0.m116793j(th4);
            try {
                unsubscribe();
                throw new OnErrorFailedException("Error occurred when trying to propagate error to Observer.onError", new CompositeException(Arrays.asList(th, th4)));
            } catch (Throwable th5) {
                ejd0.m116793j(th5);
                throw new OnErrorFailedException("Error occurred when trying to propagate error to Observer.onError and during unsubscription.", new CompositeException(Arrays.asList(th, th4, th5)));
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public z3g0<? super T> m150764h() {
        return this.f129086e;
    }

    @Override // p149l.m250
    public void onCompleted() {
        if (this.f129087f) {
            return;
        }
        this.f129087f = true;
        try {
            this.f129086e.onCompleted();
            try {
                unsubscribe();
            } catch (Throwable th) {
                ejd0.m116793j(th);
                throw new UnsubscribeFailedException(th.getMessage(), th);
            }
        } catch (Throwable th2) {
            try {
                f5f.m119491e(th2);
                ejd0.m116793j(th2);
                throw new OnCompletedFailedException(th2.getMessage(), th2);
            } catch (Throwable th3) {
                try {
                    unsubscribe();
                    throw th3;
                } catch (Throwable th4) {
                    ejd0.m116793j(th4);
                    throw new UnsubscribeFailedException(th4.getMessage(), th4);
                }
            }
        }
    }

    @Override // p149l.m250
    public void onError(Throwable th) {
        f5f.m119491e(th);
        if (this.f129087f) {
            return;
        }
        this.f129087f = true;
        m150763g(th);
    }

    @Override // p149l.m250
    public void onNext(T t) {
        try {
            if (this.f129087f) {
                return;
            }
            this.f129086e.onNext(t);
        } catch (Throwable th) {
            f5f.m119492f(th, this);
        }
    }
}
