package p133rx.subjects;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import p133rx.C22306c;
import p133rx.internal.operators.NotificationLite;
import p149l.d30;
import p149l.e30;
import p149l.h4g0;
import p149l.i40;
import p149l.m250;
import p149l.z3g0;

/* JADX INFO: loaded from: classes3.dex */
final class SubjectSubscriptionManager<T> extends AtomicReference<C22390b<T>> implements C22306c.a<T> {
    private static final long serialVersionUID = 6035251036011671568L;
    boolean active;
    volatile Object latest;

    /* JADX INFO: renamed from: nl */
    public final NotificationLite<T> f207481nl;
    e30<C22391c<T>> onAdded;
    e30<C22391c<T>> onStart;
    e30<C22391c<T>> onTerminated;

    /* JADX INFO: renamed from: rx.subjects.SubjectSubscriptionManager$a */
    public class C22389a implements d30 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C22391c f207482a;

        public C22389a(C22391c c22391c) {
            this.f207482a = c22391c;
        }

        @Override // p149l.d30
        public void call() {
            SubjectSubscriptionManager.this.remove(this.f207482a);
        }
    }

    /* JADX INFO: renamed from: rx.subjects.SubjectSubscriptionManager$b */
    public static final class C22390b<T> {

        /* JADX INFO: renamed from: c */
        public static final C22391c[] f207484c;

        /* JADX INFO: renamed from: d */
        public static final C22390b f207485d;

        /* JADX INFO: renamed from: e */
        public static final C22390b f207486e;

        /* JADX INFO: renamed from: a */
        public final boolean f207487a;

        /* JADX INFO: renamed from: b */
        public final C22391c[] f207488b;

        static {
            C22391c[] c22391cArr = new C22391c[0];
            f207484c = c22391cArr;
            f207485d = new C22390b(true, c22391cArr);
            f207486e = new C22390b(false, c22391cArr);
        }

        public C22390b(boolean z, C22391c[] c22391cArr) {
            this.f207487a = z;
            this.f207488b = c22391cArr;
        }

        /* JADX INFO: renamed from: a */
        public C22390b m221503a(C22391c c22391c) {
            C22391c[] c22391cArr = this.f207488b;
            int length = c22391cArr.length;
            C22391c[] c22391cArr2 = new C22391c[length + 1];
            System.arraycopy(c22391cArr, 0, c22391cArr2, 0, length);
            c22391cArr2[length] = c22391c;
            return new C22390b(this.f207487a, c22391cArr2);
        }

        /* JADX INFO: renamed from: b */
        public C22390b m221504b(C22391c c22391c) {
            C22391c[] c22391cArr = this.f207488b;
            int length = c22391cArr.length;
            if (length == 1 && c22391cArr[0] == c22391c) {
                return f207486e;
            }
            if (length != 0) {
                int i = length - 1;
                C22391c[] c22391cArr2 = new C22391c[i];
                int i2 = 0;
                for (C22391c c22391c2 : c22391cArr) {
                    if (c22391c2 != c22391c) {
                        if (i2 != i) {
                            c22391cArr2[i2] = c22391c2;
                            i2++;
                        }
                    }
                }
                if (i2 == 0) {
                    return f207486e;
                }
                if (i2 < i) {
                    C22391c[] c22391cArr3 = new C22391c[i2];
                    System.arraycopy(c22391cArr2, 0, c22391cArr3, 0, i2);
                    c22391cArr2 = c22391cArr3;
                }
                return new C22390b(this.f207487a, c22391cArr2);
            }
            return this;
        }
    }

    /* JADX INFO: renamed from: rx.subjects.SubjectSubscriptionManager$c */
    public static final class C22391c<T> implements m250<T> {

        /* JADX INFO: renamed from: a */
        public final z3g0<? super T> f207489a;

        /* JADX INFO: renamed from: b */
        public boolean f207490b = true;

        /* JADX INFO: renamed from: c */
        public boolean f207491c;

        /* JADX INFO: renamed from: d */
        public List<Object> f207492d;

        /* JADX INFO: renamed from: e */
        public boolean f207493e;

        public C22391c(z3g0<? super T> z3g0Var) {
            this.f207489a = z3g0Var;
        }

        /* JADX INFO: renamed from: a */
        public void m221505a(Object obj, NotificationLite<T> notificationLite) {
            if (obj != null) {
                notificationLite.m221336a(this.f207489a, obj);
            }
        }

        /* JADX INFO: renamed from: b */
        public void m221506b(Object obj, NotificationLite<T> notificationLite) {
            synchronized (this) {
                if (this.f207490b && !this.f207491c) {
                    this.f207490b = false;
                    this.f207491c = obj != null;
                    if (obj != null) {
                        m221507c(null, obj, notificationLite);
                    }
                }
            }
        }

        /* JADX WARN: Code duplicated, block: B:29:0x0038  */
        /* JADX WARN: Code duplicated, block: B:42:0x0039 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX INFO: renamed from: c */
        public void m221507c(List<Object> list, Object obj, NotificationLite<T> notificationLite) throws Throwable {
            boolean z = true;
            boolean z2 = true;
            while (true) {
                if (list != null) {
                    try {
                        Iterator<Object> it = list.iterator();
                        while (it.hasNext()) {
                            m221505a(it.next(), notificationLite);
                        }
                    } catch (Throwable th) {
                        th = th;
                        z = false;
                        if (!z) {
                            synchronized (this) {
                                this.f207491c = false;
                            }
                        }
                        throw th;
                    }
                }
                if (z2) {
                    m221505a(obj, notificationLite);
                    z2 = false;
                }
                try {
                    synchronized (this) {
                        try {
                            list = this.f207492d;
                            this.f207492d = null;
                            if (list == null) {
                                this.f207491c = false;
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
                            this.f207491c = false;
                        }
                    }
                    throw th;
                }
            }
        }

        /* JADX INFO: renamed from: d */
        public void m221508d(Object obj, NotificationLite<T> notificationLite) {
            if (!this.f207493e) {
                synchronized (this) {
                    try {
                        this.f207490b = false;
                        if (this.f207491c) {
                            if (this.f207492d == null) {
                                this.f207492d = new ArrayList();
                            }
                            this.f207492d.add(obj);
                            return;
                        }
                        this.f207493e = true;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            notificationLite.m221336a(this.f207489a, obj);
        }

        @Override // p149l.m250
        public void onCompleted() {
            this.f207489a.onCompleted();
        }

        @Override // p149l.m250
        public void onError(Throwable th) {
            this.f207489a.onError(th);
        }

        @Override // p149l.m250
        public void onNext(T t) {
            this.f207489a.onNext(t);
        }
    }

    public SubjectSubscriptionManager() {
        super(C22390b.f207486e);
        this.active = true;
        this.onStart = i40.m134309a();
        this.onAdded = i40.m134309a();
        this.onTerminated = i40.m134309a();
        this.f207481nl = NotificationLite.m221335f();
    }

    public boolean add(C22391c<T> c22391c) {
        C22390b<T> c22390b;
        do {
            c22390b = get();
            if (c22390b.f207487a) {
                this.onTerminated.call(c22391c);
                return false;
            }
        } while (!compareAndSet(c22390b, c22390b.m221503a(c22391c)));
        this.onAdded.call(c22391c);
        return true;
    }

    public void addUnsubscriber(z3g0<? super T> z3g0Var, C22391c<T> c22391c) {
        z3g0Var.m217046b(h4g0.m129240a(new C22389a(c22391c)));
    }

    @Override // p149l.e30
    public void call(z3g0<? super T> z3g0Var) {
        C22391c<T> c22391c = new C22391c<>(z3g0Var);
        addUnsubscriber(z3g0Var, c22391c);
        this.onStart.call(c22391c);
        if (!z3g0Var.isUnsubscribed() && add(c22391c) && z3g0Var.isUnsubscribed()) {
            remove(c22391c);
        }
    }

    public Object getLatest() {
        return this.latest;
    }

    public C22391c<T>[] next(Object obj) {
        setLatest(obj);
        return get().f207488b;
    }

    public C22391c<T>[] observers() {
        return get().f207488b;
    }

    public void remove(C22391c<T> c22391c) {
        C22390b<T> c22390b;
        C22390b<T> c22390bM221504b;
        do {
            c22390b = get();
            if (c22390b.f207487a || (c22390bM221504b = c22390b.m221504b(c22391c)) == c22390b) {
                return;
            }
        } while (!compareAndSet(c22390b, c22390bM221504b));
    }

    public void setLatest(Object obj) {
        this.latest = obj;
    }

    public C22391c<T>[] terminate(Object obj) {
        setLatest(obj);
        this.active = false;
        return get().f207487a ? C22390b.f207484c : getAndSet(C22390b.f207485d).f207488b;
    }
}
