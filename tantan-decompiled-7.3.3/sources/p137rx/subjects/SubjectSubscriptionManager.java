package p137rx.subjects;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import p137rx.C22421c;
import p137rx.internal.operators.NotificationLite;
import p153l.bb50;
import p153l.c40;
import p153l.gcg0;
import p153l.pcg0;
import p153l.x20;
import p153l.y20;

/* JADX INFO: loaded from: classes3.dex */
final class SubjectSubscriptionManager<T> extends AtomicReference<C22505b<T>> implements C22421c.a<T> {
    private static final long serialVersionUID = 6035251036011671568L;
    boolean active;
    volatile Object latest;

    /* JADX INFO: renamed from: nl */
    public final NotificationLite<T> f208403nl;
    y20<C22506c<T>> onAdded;
    y20<C22506c<T>> onStart;
    y20<C22506c<T>> onTerminated;

    /* JADX INFO: renamed from: rx.subjects.SubjectSubscriptionManager$a */
    public class C22504a implements x20 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C22506c f208404a;

        public C22504a(C22506c c22506c) {
            this.f208404a = c22506c;
        }

        @Override // p153l.x20
        public void call() {
            SubjectSubscriptionManager.this.remove(this.f208404a);
        }
    }

    /* JADX INFO: renamed from: rx.subjects.SubjectSubscriptionManager$b */
    public static final class C22505b<T> {

        /* JADX INFO: renamed from: c */
        public static final C22506c[] f208406c;

        /* JADX INFO: renamed from: d */
        public static final C22505b f208407d;

        /* JADX INFO: renamed from: e */
        public static final C22505b f208408e;

        /* JADX INFO: renamed from: a */
        public final boolean f208409a;

        /* JADX INFO: renamed from: b */
        public final C22506c[] f208410b;

        static {
            C22506c[] c22506cArr = new C22506c[0];
            f208406c = c22506cArr;
            f208407d = new C22505b(true, c22506cArr);
            f208408e = new C22505b(false, c22506cArr);
        }

        public C22505b(boolean z, C22506c[] c22506cArr) {
            this.f208409a = z;
            this.f208410b = c22506cArr;
        }

        /* JADX INFO: renamed from: a */
        public C22505b m222749a(C22506c c22506c) {
            C22506c[] c22506cArr = this.f208410b;
            int length = c22506cArr.length;
            C22506c[] c22506cArr2 = new C22506c[length + 1];
            System.arraycopy(c22506cArr, 0, c22506cArr2, 0, length);
            c22506cArr2[length] = c22506c;
            return new C22505b(this.f208409a, c22506cArr2);
        }

        /* JADX INFO: renamed from: b */
        public C22505b m222750b(C22506c c22506c) {
            C22506c[] c22506cArr = this.f208410b;
            int length = c22506cArr.length;
            if (length == 1 && c22506cArr[0] == c22506c) {
                return f208408e;
            }
            if (length != 0) {
                int i = length - 1;
                C22506c[] c22506cArr2 = new C22506c[i];
                int i2 = 0;
                for (C22506c c22506c2 : c22506cArr) {
                    if (c22506c2 != c22506c) {
                        if (i2 != i) {
                            c22506cArr2[i2] = c22506c2;
                            i2++;
                        }
                    }
                }
                if (i2 == 0) {
                    return f208408e;
                }
                if (i2 < i) {
                    C22506c[] c22506cArr3 = new C22506c[i2];
                    System.arraycopy(c22506cArr2, 0, c22506cArr3, 0, i2);
                    c22506cArr2 = c22506cArr3;
                }
                return new C22505b(this.f208409a, c22506cArr2);
            }
            return this;
        }
    }

    /* JADX INFO: renamed from: rx.subjects.SubjectSubscriptionManager$c */
    public static final class C22506c<T> implements bb50<T> {

        /* JADX INFO: renamed from: a */
        public final gcg0<? super T> f208411a;

        /* JADX INFO: renamed from: b */
        public boolean f208412b = true;

        /* JADX INFO: renamed from: c */
        public boolean f208413c;

        /* JADX INFO: renamed from: d */
        public List<Object> f208414d;

        /* JADX INFO: renamed from: e */
        public boolean f208415e;

        public C22506c(gcg0<? super T> gcg0Var) {
            this.f208411a = gcg0Var;
        }

        /* JADX INFO: renamed from: a */
        public void m222751a(Object obj, NotificationLite<T> notificationLite) {
            if (obj != null) {
                notificationLite.m222582a(this.f208411a, obj);
            }
        }

        /* JADX INFO: renamed from: b */
        public void m222752b(Object obj, NotificationLite<T> notificationLite) {
            synchronized (this) {
                if (this.f208412b && !this.f208413c) {
                    this.f208412b = false;
                    this.f208413c = obj != null;
                    if (obj != null) {
                        m222753c(null, obj, notificationLite);
                    }
                }
            }
        }

        /* JADX WARN: Code duplicated, block: B:29:0x0038  */
        /* JADX WARN: Code duplicated, block: B:42:0x0039 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX INFO: renamed from: c */
        public void m222753c(List<Object> list, Object obj, NotificationLite<T> notificationLite) throws Throwable {
            boolean z = true;
            boolean z2 = true;
            while (true) {
                if (list != null) {
                    try {
                        Iterator<Object> it = list.iterator();
                        while (it.hasNext()) {
                            m222751a(it.next(), notificationLite);
                        }
                    } catch (Throwable th) {
                        th = th;
                        z = false;
                        if (!z) {
                            synchronized (this) {
                                this.f208413c = false;
                            }
                        }
                        throw th;
                    }
                }
                if (z2) {
                    m222751a(obj, notificationLite);
                    z2 = false;
                }
                try {
                    synchronized (this) {
                        try {
                            list = this.f208414d;
                            this.f208414d = null;
                            if (list == null) {
                                this.f208413c = false;
                                return;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            z = false;
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
                try {
                    throw th;
                } catch (Throwable th4) {
                    th = th4;
                    if (!z) {
                        synchronized (this) {
                            this.f208413c = false;
                        }
                    }
                    throw th;
                }
            }
        }

        /* JADX INFO: renamed from: d */
        public void m222754d(Object obj, NotificationLite<T> notificationLite) {
            if (!this.f208415e) {
                synchronized (this) {
                    try {
                        this.f208412b = false;
                        if (this.f208413c) {
                            if (this.f208414d == null) {
                                this.f208414d = new ArrayList();
                            }
                            this.f208414d.add(obj);
                            return;
                        }
                        this.f208415e = true;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            notificationLite.m222582a(this.f208411a, obj);
        }

        @Override // p153l.bb50
        public void onCompleted() {
            this.f208411a.onCompleted();
        }

        @Override // p153l.bb50
        public void onError(Throwable th) {
            this.f208411a.onError(th);
        }

        @Override // p153l.bb50
        public void onNext(T t) {
            this.f208411a.onNext(t);
        }
    }

    public SubjectSubscriptionManager() {
        super(C22505b.f208408e);
        this.active = true;
        this.onStart = c40.m107815a();
        this.onAdded = c40.m107815a();
        this.onTerminated = c40.m107815a();
        this.f208403nl = NotificationLite.m222581f();
    }

    public boolean add(C22506c<T> c22506c) {
        C22505b<T> c22505b;
        do {
            c22505b = get();
            if (c22505b.f208409a) {
                this.onTerminated.call(c22506c);
                return false;
            }
        } while (!compareAndSet(c22505b, c22505b.m222749a(c22506c)));
        this.onAdded.call(c22506c);
        return true;
    }

    public void addUnsubscriber(gcg0<? super T> gcg0Var, C22506c<T> c22506c) {
        gcg0Var.m129866b(pcg0.m171648a(new C22504a(c22506c)));
    }

    @Override // p153l.y20
    public void call(gcg0<? super T> gcg0Var) {
        C22506c<T> c22506c = new C22506c<>(gcg0Var);
        addUnsubscriber(gcg0Var, c22506c);
        this.onStart.call(c22506c);
        if (!gcg0Var.isUnsubscribed() && add(c22506c) && gcg0Var.isUnsubscribed()) {
            remove(c22506c);
        }
    }

    public Object getLatest() {
        return this.latest;
    }

    public C22506c<T>[] next(Object obj) {
        setLatest(obj);
        return get().f208410b;
    }

    public C22506c<T>[] observers() {
        return get().f208410b;
    }

    public void remove(C22506c<T> c22506c) {
        C22505b<T> c22505b;
        C22505b<T> c22505bM222750b;
        do {
            c22505b = get();
            if (c22505b.f208409a || (c22505bM222750b = c22505b.m222750b(c22506c)) == c22505b) {
                return;
            }
        } while (!compareAndSet(c22505b, c22505bM222750b));
    }

    public void setLatest(Object obj) {
        this.latest = obj;
    }

    public C22506c<T>[] terminate(Object obj) {
        setLatest(obj);
        this.active = false;
        return get().f208409a ? C22505b.f208406c : getAndSet(C22505b.f208407d).f208410b;
    }
}
