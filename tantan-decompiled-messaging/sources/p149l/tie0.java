package p149l;

import p133rx.exceptions.OnErrorThrowable;
import p133rx.internal.operators.NotificationLite;

/* JADX INFO: loaded from: classes3.dex */
public class tie0<T> implements m250<T> {

    /* JADX INFO: renamed from: a */
    public final m250<? super T> f170568a;

    /* JADX INFO: renamed from: b */
    public boolean f170569b;

    /* JADX INFO: renamed from: c */
    public volatile boolean f170570c;

    /* JADX INFO: renamed from: d */
    public C20180a f170571d;

    /* JADX INFO: renamed from: e */
    public final NotificationLite<T> f170572e = NotificationLite.m221335f();

    /* JADX INFO: renamed from: l.tie0$a */
    public static final class C20180a {

        /* JADX INFO: renamed from: a */
        public Object[] f170573a;

        /* JADX INFO: renamed from: b */
        public int f170574b;

        /* JADX INFO: renamed from: a */
        public void m189182a(Object obj) {
            int i = this.f170574b;
            Object[] objArr = this.f170573a;
            if (objArr == null) {
                objArr = new Object[16];
                this.f170573a = objArr;
            } else if (i == objArr.length) {
                Object[] objArr2 = new Object[(i >> 2) + i];
                System.arraycopy(objArr, 0, objArr2, 0, i);
                this.f170573a = objArr2;
                objArr = objArr2;
            }
            objArr[i] = obj;
            this.f170574b = i + 1;
        }
    }

    public tie0(m250<? super T> m250Var) {
        this.f170568a = m250Var;
    }

    @Override // p149l.m250
    public void onCompleted() {
        if (this.f170570c) {
            return;
        }
        synchronized (this) {
            try {
                if (this.f170570c) {
                    return;
                }
                this.f170570c = true;
                if (!this.f170569b) {
                    this.f170569b = true;
                    this.f170568a.onCompleted();
                    return;
                }
                C20180a c20180a = this.f170571d;
                if (c20180a == null) {
                    c20180a = new C20180a();
                    this.f170571d = c20180a;
                }
                c20180a.m189182a(this.f170572e.m221337b());
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p149l.m250
    public void onError(Throwable th) {
        f5f.m119491e(th);
        if (this.f170570c) {
            return;
        }
        synchronized (this) {
            try {
                if (this.f170570c) {
                    return;
                }
                this.f170570c = true;
                if (!this.f170569b) {
                    this.f170569b = true;
                    this.f170568a.onError(th);
                    return;
                }
                C20180a c20180a = this.f170571d;
                if (c20180a == null) {
                    c20180a = new C20180a();
                    this.f170571d = c20180a;
                }
                c20180a.m189182a(this.f170572e.m221338c(th));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // p149l.m250
    public void onNext(T t) {
        if (this.f170570c) {
            return;
        }
        synchronized (this) {
            try {
                if (this.f170570c) {
                    return;
                }
                if (this.f170569b) {
                    C20180a c20180a = this.f170571d;
                    if (c20180a == null) {
                        c20180a = new C20180a();
                        this.f170571d = c20180a;
                    }
                    c20180a.m189182a(this.f170572e.m221344j(t));
                    return;
                }
                this.f170569b = true;
                try {
                    this.f170568a.onNext(t);
                    while (true) {
                        synchronized (this) {
                            try {
                                C20180a c20180a2 = this.f170571d;
                                if (c20180a2 == null) {
                                    this.f170569b = false;
                                    return;
                                }
                                this.f170571d = null;
                                for (Object obj : c20180a2.f170573a) {
                                    if (obj == null) {
                                        break;
                                    }
                                    try {
                                        if (this.f170572e.m221336a(this.f170568a, obj)) {
                                            this.f170570c = true;
                                            return;
                                        }
                                    } catch (Throwable th) {
                                        this.f170570c = true;
                                        f5f.m119491e(th);
                                        this.f170568a.onError(OnErrorThrowable.addValueAsLastCause(th, t));
                                        return;
                                    }
                                }
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                    }
                } catch (Throwable th3) {
                    this.f170570c = true;
                    f5f.m119493g(th3, this.f170568a, t);
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }
}
