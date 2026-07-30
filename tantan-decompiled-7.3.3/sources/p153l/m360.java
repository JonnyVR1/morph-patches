package p153l;

import java.util.Arrays;
import p137rx.C22421c;
import p137rx.exceptions.CompositeException;

/* JADX INFO: loaded from: classes3.dex */
public class m360<T> implements C22421c.c<T, T> {

    /* JADX INFO: renamed from: a */
    public final bb50<? super T> f134642a;

    /* JADX INFO: renamed from: l.m360$a */
    public class C18533a extends gcg0<T> {

        /* JADX INFO: renamed from: e */
        public boolean f134643e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ gcg0 f134644f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C18533a(gcg0 gcg0Var, gcg0 gcg0Var2) {
            super(gcg0Var);
            this.f134644f = gcg0Var2;
        }

        @Override // p153l.bb50
        public void onCompleted() {
            if (this.f134643e) {
                return;
            }
            try {
                m360.this.f134642a.onCompleted();
                this.f134643e = true;
                this.f134644f.onCompleted();
            } catch (Throwable th) {
                j6f.m143664f(th, this);
            }
        }

        @Override // p153l.bb50
        public void onError(Throwable th) {
            j6f.m143663e(th);
            if (this.f134643e) {
                return;
            }
            this.f134643e = true;
            try {
                m360.this.f134642a.onError(th);
                this.f134644f.onError(th);
            } catch (Throwable th2) {
                j6f.m143663e(th2);
                this.f134644f.onError(new CompositeException(Arrays.asList(th, th2)));
            }
        }

        @Override // p153l.bb50
        public void onNext(T t) {
            if (this.f134643e) {
                return;
            }
            try {
                m360.this.f134642a.onNext(t);
                this.f134644f.onNext(t);
            } catch (Throwable th) {
                j6f.m143665g(th, this, t);
            }
        }
    }

    public m360(bb50<? super T> bb50Var) {
        this.f134642a = bb50Var;
    }

    @Override // p153l.qcj
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public gcg0<? super T> call(gcg0<? super T> gcg0Var) {
        return new C18533a(gcg0Var, gcg0Var);
    }
}
