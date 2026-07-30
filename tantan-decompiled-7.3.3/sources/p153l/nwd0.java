package p153l;

import java.util.Arrays;
import p137rx.exceptions.CompositeException;
import p137rx.exceptions.OnCompletedFailedException;
import p137rx.exceptions.OnErrorFailedException;
import p137rx.exceptions.OnErrorNotImplementedException;
import p137rx.exceptions.UnsubscribeFailedException;

/* JADX INFO: loaded from: classes3.dex */
public class nwd0<T> extends gcg0<T> {

    /* JADX INFO: renamed from: e */
    public final gcg0<? super T> f143953e;

    /* JADX INFO: renamed from: f */
    public boolean f143954f;

    public nwd0(gcg0<? super T> gcg0Var) {
        super(gcg0Var);
        this.f143953e = gcg0Var;
    }

    /* JADX INFO: renamed from: g */
    public void m164985g(Throwable th) {
        hrd0.m136792j(th);
        try {
            this.f143953e.onError(th);
            try {
                unsubscribe();
            } catch (Throwable th2) {
                hrd0.m136792j(th2);
                throw new OnErrorFailedException(th2);
            }
        } catch (OnErrorNotImplementedException e) {
            try {
                unsubscribe();
                throw e;
            } catch (Throwable th3) {
                hrd0.m136792j(th3);
                throw new OnErrorNotImplementedException("Observer.onError not implemented and error while unsubscribing.", new CompositeException(Arrays.asList(th, th3)));
            }
        } catch (Throwable th4) {
            hrd0.m136792j(th4);
            try {
                unsubscribe();
                throw new OnErrorFailedException("Error occurred when trying to propagate error to Observer.onError", new CompositeException(Arrays.asList(th, th4)));
            } catch (Throwable th5) {
                hrd0.m136792j(th5);
                throw new OnErrorFailedException("Error occurred when trying to propagate error to Observer.onError and during unsubscription.", new CompositeException(Arrays.asList(th, th4, th5)));
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public gcg0<? super T> m164986h() {
        return this.f143953e;
    }

    @Override // p153l.bb50
    public void onCompleted() {
        if (this.f143954f) {
            return;
        }
        this.f143954f = true;
        try {
            this.f143953e.onCompleted();
            try {
                unsubscribe();
            } catch (Throwable th) {
                hrd0.m136792j(th);
                throw new UnsubscribeFailedException(th.getMessage(), th);
            }
        } catch (Throwable th2) {
            try {
                j6f.m143663e(th2);
                hrd0.m136792j(th2);
                throw new OnCompletedFailedException(th2.getMessage(), th2);
            } catch (Throwable th3) {
                try {
                    unsubscribe();
                    throw th3;
                } catch (Throwable th4) {
                    hrd0.m136792j(th4);
                    throw new UnsubscribeFailedException(th4.getMessage(), th4);
                }
            }
        }
    }

    @Override // p153l.bb50
    public void onError(Throwable th) {
        j6f.m143663e(th);
        if (this.f143954f) {
            return;
        }
        this.f143954f = true;
        m164985g(th);
    }

    @Override // p153l.bb50
    public void onNext(T t) {
        try {
            if (this.f143954f) {
                return;
            }
            this.f143953e.onNext(t);
        } catch (Throwable th) {
            j6f.m143664f(th, this);
        }
    }
}
