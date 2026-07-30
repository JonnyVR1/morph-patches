package p014rx.subjects;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import p003l.d30;
import p003l.e30;
import p003l.h4g0;
import p003l.i40;
import p003l.m250;
import p003l.z3g0;
import p014rx.C1099c;
import p014rx.internal.operators.NotificationLite;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
final class SubjectSubscriptionManager<T> extends AtomicReference<C1183b<T>> implements C1099c.a<T> {
    private static final long serialVersionUID = 6035251036011671568L;
    boolean active;
    volatile Object latest;

    /* JADX INFO: renamed from: nl */
    public final NotificationLite<T> f11106nl;
    e30<C1184c<T>> onAdded;
    e30<C1184c<T>> onStart;
    e30<C1184c<T>> onTerminated;

    /* JADX INFO: renamed from: rx.subjects.SubjectSubscriptionManager$a */
    public class C1182a implements d30 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C1184c f11107a;

        public C1182a(C1184c c1184c) {
            this.f11107a = c1184c;
        }

        @Override // p003l.d30
        public void call() {
            SubjectSubscriptionManager.this.remove(this.f11107a);
        }
    }

    /* JADX INFO: renamed from: rx.subjects.SubjectSubscriptionManager$b */
    public static final class C1183b<T> {

        /* JADX INFO: renamed from: c */
        public static final C1184c[] f11109c;

        /* JADX INFO: renamed from: d */
        public static final C1183b f11110d;

        /* JADX INFO: renamed from: e */
        public static final C1183b f11111e;

        /* JADX INFO: renamed from: a */
        public final boolean f11112a;

        /* JADX INFO: renamed from: b */
        public final C1184c[] f11113b;

        static {
            C1184c[] c1184cArr = new C1184c[0];
            f11109c = c1184cArr;
            f11110d = new C1183b(true, c1184cArr);
            f11111e = new C1183b(false, c1184cArr);
        }

        public C1183b(boolean z, C1184c[] c1184cArr) {
            this.f11112a = z;
            this.f11113b = c1184cArr;
        }

        /* JADX INFO: renamed from: a */
        public C1183b m9960a(C1184c c1184c) {
            C1184c[] c1184cArr = this.f11113b;
            int length = c1184cArr.length;
            C1184c[] c1184cArr2 = new C1184c[length + 1];
            System.arraycopy(c1184cArr, 0, c1184cArr2, 0, length);
            c1184cArr2[length] = c1184c;
            return new C1183b(this.f11112a, c1184cArr2);
        }

        /* JADX INFO: renamed from: b */
        public C1183b m9961b(C1184c c1184c) {
            C1184c[] c1184cArr = this.f11113b;
            int length = c1184cArr.length;
            if (length == 1 && c1184cArr[0] == c1184c) {
                return f11111e;
            }
            if (length != 0) {
                int i = length - 1;
                C1184c[] c1184cArr2 = new C1184c[i];
                int i2 = 0;
                for (C1184c c1184c2 : c1184cArr) {
                    if (c1184c2 != c1184c) {
                        if (i2 != i) {
                            c1184cArr2[i2] = c1184c2;
                            i2++;
                        }
                    }
                }
                if (i2 == 0) {
                    return f11111e;
                }
                if (i2 < i) {
                    C1184c[] c1184cArr3 = new C1184c[i2];
                    System.arraycopy(c1184cArr2, 0, c1184cArr3, 0, i2);
                    c1184cArr2 = c1184cArr3;
                }
                return new C1183b(this.f11112a, c1184cArr2);
            }
            return this;
        }
    }

    /* JADX INFO: renamed from: rx.subjects.SubjectSubscriptionManager$c */
    public static final class C1184c<T> implements m250<T> {

        /* JADX INFO: renamed from: a */
        public final z3g0<? super T> f11114a;

        /* JADX INFO: renamed from: b */
        public boolean f11115b = true;

        /* JADX INFO: renamed from: c */
        public boolean f11116c;

        /* JADX INFO: renamed from: d */
        public List<Object> f11117d;

        /* JADX INFO: renamed from: e */
        public boolean f11118e;

        public C1184c(z3g0<? super T> z3g0Var) {
            this.f11114a = z3g0Var;
        }

        /* JADX INFO: renamed from: a */
        public void m9962a(Object obj, NotificationLite<T> notificationLite) {
            if (obj != null) {
                notificationLite.m9793a(this.f11114a, obj);
            }
        }

        /* JADX INFO: renamed from: b */
        public void m9963b(Object obj, NotificationLite<T> notificationLite) {
            synchronized (this) {
                if (this.f11115b && !this.f11116c) {
                    this.f11115b = false;
                    this.f11116c = obj != null;
                    if (obj != null) {
                        m9964c(null, obj, notificationLite);
                    }
                }
            }
        }

        /* JADX WARN: Code duplicated, block: B:29:0x0038  */
        /* JADX WARN: Code duplicated, block: B:42:0x0039 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX INFO: renamed from: c */
        public void m9964c(List<Object> list, Object obj, NotificationLite<T> notificationLite) throws Throwable {
            boolean z = true;
            boolean z2 = true;
            while (true) {
                if (list != null) {
                    try {
                        Iterator<Object> it = list.iterator();
                        while (it.hasNext()) {
                            m9962a(it.next(), notificationLite);
                        }
                    } catch (Throwable th) {
                        th = th;
                        z = false;
                        if (!z) {
                            synchronized (this) {
                                this.f11116c = false;
                            }
                        }
                        throw th;
                    }
                }
                if (z2) {
                    m9962a(obj, notificationLite);
                    z2 = false;
                }
                try {
                    synchronized (this) {
                        try {
                            list = this.f11117d;
                            this.f11117d = null;
                            if (list == null) {
                                this.f11116c = false;
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
                            this.f11116c = false;
                        }
                    }
                    throw th;
                }
            }
        }

        /* JADX INFO: renamed from: d */
        public void m9965d(Object obj, NotificationLite<T> notificationLite) {
            if (!this.f11118e) {
                synchronized (this) {
                    try {
                        this.f11115b = false;
                        if (this.f11116c) {
                            if (this.f11117d == null) {
                                this.f11117d = new ArrayList();
                            }
                            this.f11117d.add(obj);
                            return;
                        }
                        this.f11118e = true;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            notificationLite.m9793a(this.f11114a, obj);
        }

        @Override // p003l.m250
        public void onCompleted() {
            this.f11114a.onCompleted();
        }

        @Override // p003l.m250
        public void onError(Throwable th) {
            this.f11114a.onError(th);
        }

        @Override // p003l.m250
        public void onNext(T t) {
            this.f11114a.onNext(t);
        }
    }

    public SubjectSubscriptionManager() {
        super(C1183b.f11111e);
        this.active = true;
        this.onStart = i40.m5029a();
        this.onAdded = i40.m5029a();
        this.onTerminated = i40.m5029a();
        this.f11106nl = NotificationLite.m9792f();
    }

    public boolean add(C1184c<T> c1184c) {
        C1183b<T> c1183b;
        do {
            c1183b = get();
            if (c1183b.f11112a) {
                this.onTerminated.call(c1184c);
                return false;
            }
        } while (!compareAndSet(c1183b, c1183b.m9960a(c1184c)));
        this.onAdded.call(c1184c);
        return true;
    }

    public void addUnsubscriber(z3g0<? super T> z3g0Var, C1184c<T> c1184c) {
        z3g0Var.m9240b(h4g0.m4914a(new C1182a(c1184c)));
    }

    @Override // p003l.e30
    public void call(z3g0<? super T> z3g0Var) {
        C1184c<T> c1184c = new C1184c<>(z3g0Var);
        addUnsubscriber(z3g0Var, c1184c);
        this.onStart.call(c1184c);
        if (!z3g0Var.isUnsubscribed() && add(c1184c) && z3g0Var.isUnsubscribed()) {
            remove(c1184c);
        }
    }

    public Object getLatest() {
        return this.latest;
    }

    public C1184c<T>[] next(Object obj) {
        setLatest(obj);
        return get().f11113b;
    }

    public C1184c<T>[] observers() {
        return get().f11113b;
    }

    public void remove(C1184c<T> c1184c) {
        C1183b<T> c1183b;
        C1183b<T> c1183bM9961b;
        do {
            c1183b = get();
            if (c1183b.f11112a || (c1183bM9961b = c1183b.m9961b(c1184c)) == c1183b) {
                return;
            }
        } while (!compareAndSet(c1183b, c1183bM9961b));
    }

    public void setLatest(Object obj) {
        this.latest = obj;
    }

    public C1184c<T>[] terminate(Object obj) {
        setLatest(obj);
        this.active = false;
        return get().f11112a ? C1183b.f11109c : getAndSet(C1183b.f11110d).f11113b;
    }
}
