package p003l;

import p014rx.exceptions.OnErrorThrowable;
import p014rx.internal.operators.NotificationLite;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class tie0<T> implements m250<T> {

    /* JADX INFO: renamed from: a */
    public final m250<? super T> f7495a;

    /* JADX INFO: renamed from: b */
    public boolean f7496b;

    /* JADX INFO: renamed from: c */
    public volatile boolean f7497c;

    /* JADX INFO: renamed from: d */
    public C0550a f7498d;

    /* JADX INFO: renamed from: e */
    public final NotificationLite<T> f7499e = NotificationLite.m9792f();

    /* JADX INFO: renamed from: l.tie0$a */
    public static final class C0550a {

        /* JADX INFO: renamed from: a */
        public Object[] f7500a;

        /* JADX INFO: renamed from: b */
        public int f7501b;

        /* JADX INFO: renamed from: a */
        public void m7753a(Object obj) {
            int i = this.f7501b;
            Object[] objArr = this.f7500a;
            if (objArr == null) {
                objArr = new Object[16];
                this.f7500a = objArr;
            } else if (i == objArr.length) {
                Object[] objArr2 = new Object[(i >> 2) + i];
                System.arraycopy(objArr, 0, objArr2, 0, i);
                this.f7500a = objArr2;
                objArr = objArr2;
            }
            objArr[i] = obj;
            this.f7501b = i + 1;
        }
    }

    public tie0(m250<? super T> m250Var) {
        this.f7495a = m250Var;
    }

    @Override // p003l.m250
    public void onCompleted() {
        if (this.f7497c) {
            return;
        }
        synchronized (this) {
            try {
                if (this.f7497c) {
                    return;
                }
                this.f7497c = true;
                if (!this.f7496b) {
                    this.f7496b = true;
                    this.f7495a.onCompleted();
                    return;
                }
                C0550a c0550a = this.f7498d;
                if (c0550a == null) {
                    c0550a = new C0550a();
                    this.f7498d = c0550a;
                }
                c0550a.m7753a(this.f7499e.m9794b());
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p003l.m250
    public void onError(Throwable th) {
        f5f.m3964e(th);
        if (this.f7497c) {
            return;
        }
        synchronized (this) {
            try {
                if (this.f7497c) {
                    return;
                }
                this.f7497c = true;
                if (!this.f7496b) {
                    this.f7496b = true;
                    this.f7495a.onError(th);
                    return;
                }
                C0550a c0550a = this.f7498d;
                if (c0550a == null) {
                    c0550a = new C0550a();
                    this.f7498d = c0550a;
                }
                c0550a.m7753a(this.f7499e.m9795c(th));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // p003l.m250
    public void onNext(T t) {
        if (this.f7497c) {
            return;
        }
        synchronized (this) {
            try {
                if (this.f7497c) {
                    return;
                }
                if (this.f7496b) {
                    C0550a c0550a = this.f7498d;
                    if (c0550a == null) {
                        c0550a = new C0550a();
                        this.f7498d = c0550a;
                    }
                    c0550a.m7753a(this.f7499e.m9801j(t));
                    return;
                }
                this.f7496b = true;
                try {
                    this.f7495a.onNext(t);
                    while (true) {
                        synchronized (this) {
                            try {
                                C0550a c0550a2 = this.f7498d;
                                if (c0550a2 == null) {
                                    this.f7496b = false;
                                    return;
                                }
                                this.f7498d = null;
                                for (Object obj : c0550a2.f7500a) {
                                    if (obj == null) {
                                        break;
                                    }
                                    try {
                                        if (this.f7499e.m9793a(this.f7495a, obj)) {
                                            this.f7497c = true;
                                            return;
                                        }
                                    } catch (Throwable th) {
                                        this.f7497c = true;
                                        f5f.m3964e(th);
                                        this.f7495a.onError(OnErrorThrowable.addValueAsLastCause(th, t));
                                        return;
                                    }
                                }
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                    }
                } catch (Throwable th3) {
                    this.f7497c = true;
                    f5f.m3966g(th3, this.f7495a, t);
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }
}
