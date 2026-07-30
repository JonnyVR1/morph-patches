package p014rx.subjects;

import java.lang.reflect.Array;
import java.util.ArrayList;
import p003l.e30;
import p003l.f5f;
import p003l.p3g0;
import p014rx.C1099c;
import p014rx.internal.operators.NotificationLite;

/* JADX INFO: renamed from: rx.subjects.a */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public final class C1185a<T> extends p3g0<T, T> {

    /* JADX INFO: renamed from: c */
    public static final Object[] f11121c = new Object[0];

    /* JADX INFO: renamed from: a */
    public final SubjectSubscriptionManager<T> f11122a;

    /* JADX INFO: renamed from: b */
    public final NotificationLite<T> f11123b;

    /* JADX INFO: renamed from: rx.subjects.a$a */
    public static class a implements e30<SubjectSubscriptionManager.C1184c<T>> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ SubjectSubscriptionManager f11124a;

        public a(SubjectSubscriptionManager subjectSubscriptionManager) {
            this.f11124a = subjectSubscriptionManager;
        }

        @Override // p003l.e30
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(SubjectSubscriptionManager.C1184c<T> c1184c) {
            c1184c.m9963b(this.f11124a.getLatest(), this.f11124a.f11106nl);
        }
    }

    public C1185a(C1099c.a<T> aVar, SubjectSubscriptionManager<T> subjectSubscriptionManager) {
        super(aVar);
        this.f11123b = NotificationLite.m9792f();
        this.f11122a = subjectSubscriptionManager;
    }

    /* JADX INFO: renamed from: b */
    public static <T> C1185a<T> m9969b() {
        return m9971d(null, false);
    }

    /* JADX INFO: renamed from: c */
    public static <T> C1185a<T> m9970c(T t) {
        return m9971d(t, true);
    }

    /* JADX INFO: renamed from: d */
    public static <T> C1185a<T> m9971d(T t, boolean z) {
        SubjectSubscriptionManager subjectSubscriptionManager = new SubjectSubscriptionManager();
        if (z) {
            subjectSubscriptionManager.setLatest(NotificationLite.m9792f().m9801j(t));
        }
        a aVar = new a(subjectSubscriptionManager);
        subjectSubscriptionManager.onAdded = aVar;
        subjectSubscriptionManager.onTerminated = aVar;
        return new C1185a<>(subjectSubscriptionManager, subjectSubscriptionManager);
    }

    /* JADX INFO: renamed from: e */
    public T m9972e() {
        Object latest = this.f11122a.getLatest();
        if (this.f11123b.m9800i(latest)) {
            return this.f11123b.m9797e(latest);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: f */
    public Object[] m9973f() {
        Object[] objArr = f11121c;
        Object[] objArrM9974g = m9974g(objArr);
        return objArrM9974g == objArr ? new Object[0] : objArrM9974g;
    }

    /* JADX INFO: renamed from: g */
    public T[] m9974g(T[] tArr) {
        Object latest = this.f11122a.getLatest();
        if (!this.f11123b.m9800i(latest)) {
            if (tArr.length > 0) {
                tArr[0] = null;
            }
            return tArr;
        }
        if (tArr.length == 0) {
            tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), 1));
        }
        tArr[0] = this.f11123b.m9797e(latest);
        if (tArr.length > 1) {
            tArr[1] = null;
        }
        return tArr;
    }

    /* JADX INFO: renamed from: h */
    public boolean m9975h() {
        return this.f11122a.observers().length > 0;
    }

    /* JADX INFO: renamed from: i */
    public boolean m9976i() {
        return this.f11123b.m9800i(this.f11122a.getLatest());
    }

    @Override // p003l.m250
    public void onCompleted() {
        if (this.f11122a.getLatest() == null || this.f11122a.active) {
            Object objM9794b = this.f11123b.m9794b();
            for (SubjectSubscriptionManager.C1184c<T> c1184c : this.f11122a.terminate(objM9794b)) {
                c1184c.m9965d(objM9794b, this.f11122a.f11106nl);
            }
        }
    }

    @Override // p003l.m250
    public void onError(Throwable th) {
        if (this.f11122a.getLatest() == null || this.f11122a.active) {
            Object objM9795c = this.f11123b.m9795c(th);
            ArrayList arrayList = null;
            for (SubjectSubscriptionManager.C1184c<T> c1184c : this.f11122a.terminate(objM9795c)) {
                try {
                    c1184c.m9965d(objM9795c, this.f11122a.f11106nl);
                } catch (Throwable th2) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(th2);
                }
            }
            f5f.m3963d(arrayList);
        }
    }

    @Override // p003l.m250
    public void onNext(T t) {
        if (this.f11122a.getLatest() == null || this.f11122a.active) {
            Object objM9801j = this.f11123b.m9801j(t);
            for (SubjectSubscriptionManager.C1184c<T> c1184c : this.f11122a.next(objM9801j)) {
                c1184c.m9965d(objM9801j, this.f11122a.f11106nl);
            }
        }
    }
}
