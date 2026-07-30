package p153l;

import p137rx.exceptions.OnErrorThrowable;
import p137rx.internal.operators.NotificationLite;

/* JADX INFO: loaded from: classes3.dex */
public class yqe0<T> implements bb50<T> {

    /* JADX INFO: renamed from: a */
    public final bb50<? super T> f201170a;

    /* JADX INFO: renamed from: b */
    public boolean f201171b;

    /* JADX INFO: renamed from: c */
    public volatile boolean f201172c;

    /* JADX INFO: renamed from: d */
    public C21666a f201173d;

    /* JADX INFO: renamed from: e */
    public final NotificationLite<T> f201174e = NotificationLite.m222581f();

    /* JADX INFO: renamed from: l.yqe0$a */
    public static final class C21666a {

        /* JADX INFO: renamed from: a */
        public Object[] f201175a;

        /* JADX INFO: renamed from: b */
        public int f201176b;

        /* JADX INFO: renamed from: a */
        public void m217085a(Object obj) {
            int i = this.f201176b;
            Object[] objArr = this.f201175a;
            if (objArr == null) {
                objArr = new Object[16];
                this.f201175a = objArr;
            } else if (i == objArr.length) {
                Object[] objArr2 = new Object[(i >> 2) + i];
                System.arraycopy(objArr, 0, objArr2, 0, i);
                this.f201175a = objArr2;
                objArr = objArr2;
            }
            objArr[i] = obj;
            this.f201176b = i + 1;
        }
    }

    public yqe0(bb50<? super T> bb50Var) {
        this.f201170a = bb50Var;
    }

    @Override // p153l.bb50
    public void onCompleted() {
        if (this.f201172c) {
            return;
        }
        synchronized (this) {
            try {
                if (this.f201172c) {
                    return;
                }
                this.f201172c = true;
                if (!this.f201171b) {
                    this.f201171b = true;
                    this.f201170a.onCompleted();
                    return;
                }
                C21666a c21666a = this.f201173d;
                if (c21666a == null) {
                    c21666a = new C21666a();
                    this.f201173d = c21666a;
                }
                c21666a.m217085a(this.f201174e.m222583b());
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p153l.bb50
    public void onError(Throwable th) {
        j6f.m143663e(th);
        if (this.f201172c) {
            return;
        }
        synchronized (this) {
            try {
                if (this.f201172c) {
                    return;
                }
                this.f201172c = true;
                if (!this.f201171b) {
                    this.f201171b = true;
                    this.f201170a.onError(th);
                    return;
                }
                C21666a c21666a = this.f201173d;
                if (c21666a == null) {
                    c21666a = new C21666a();
                    this.f201173d = c21666a;
                }
                c21666a.m217085a(this.f201174e.m222584c(th));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // p153l.bb50
    public void onNext(T t) {
        if (this.f201172c) {
            return;
        }
        synchronized (this) {
            try {
                if (this.f201172c) {
                    return;
                }
                if (this.f201171b) {
                    C21666a c21666a = this.f201173d;
                    if (c21666a == null) {
                        c21666a = new C21666a();
                        this.f201173d = c21666a;
                    }
                    c21666a.m217085a(this.f201174e.m222590j(t));
                    return;
                }
                this.f201171b = true;
                try {
                    this.f201170a.onNext(t);
                    while (true) {
                        synchronized (this) {
                            try {
                                C21666a c21666a2 = this.f201173d;
                                if (c21666a2 == null) {
                                    this.f201171b = false;
                                    return;
                                }
                                this.f201173d = null;
                                for (Object obj : c21666a2.f201175a) {
                                    if (obj == null) {
                                        break;
                                    }
                                    try {
                                        if (this.f201174e.m222582a(this.f201170a, obj)) {
                                            this.f201172c = true;
                                            return;
                                        }
                                    } catch (Throwable th) {
                                        this.f201172c = true;
                                        j6f.m143663e(th);
                                        this.f201170a.onError(OnErrorThrowable.addValueAsLastCause(th, t));
                                        return;
                                    }
                                }
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                    }
                } catch (Throwable th3) {
                    this.f201172c = true;
                    j6f.m143665g(th3, this.f201170a, t);
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }
}
