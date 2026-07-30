package p153l;

import java.util.HashSet;
import java.util.Set;
import p137rx.C22421c;
import p137rx.internal.util.UtilityFunctions;

/* JADX INFO: loaded from: classes3.dex */
public final class j360<T, U> implements C22421c.c<T, T> {

    /* JADX INFO: renamed from: a */
    public final qcj<? super T, ? extends U> f118155a;

    /* JADX INFO: renamed from: l.j360$a */
    public class C17863a extends gcg0<T> {

        /* JADX INFO: renamed from: e */
        public Set<U> f118156e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ gcg0 f118157f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C17863a(gcg0 gcg0Var, gcg0 gcg0Var2) {
            super(gcg0Var);
            this.f118157f = gcg0Var2;
            this.f118156e = new HashSet();
        }

        @Override // p153l.bb50
        public void onCompleted() {
            this.f118156e = null;
            this.f118157f.onCompleted();
        }

        @Override // p153l.bb50
        public void onError(Throwable th) {
            this.f118156e = null;
            this.f118157f.onError(th);
        }

        @Override // p153l.bb50
        public void onNext(T t) {
            if (this.f118156e.add(j360.this.f118155a.call(t))) {
                this.f118157f.onNext(t);
            } else {
                m129868e(1L);
            }
        }
    }

    /* JADX INFO: renamed from: l.j360$b */
    public static final class C17864b {
        static final j360<?, ?> INSTANCE = new j360<>(UtilityFunctions.m222733b());
    }

    public j360(qcj<? super T, ? extends U> qcjVar) {
        this.f118155a = qcjVar;
    }

    /* JADX INFO: renamed from: b */
    public static <T> j360<T, T> m143338b() {
        return (j360<T, T>) C17864b.INSTANCE;
    }

    @Override // p153l.qcj
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public gcg0<? super T> call(gcg0<? super T> gcg0Var) {
        return new C17863a(gcg0Var, gcg0Var);
    }
}
