package p133rx.subjects;

import java.lang.reflect.Array;
import java.util.ArrayList;
import p133rx.C22306c;
import p133rx.internal.operators.NotificationLite;
import p149l.e30;
import p149l.f5f;
import p149l.p3g0;

/* JADX INFO: renamed from: rx.subjects.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C22392a<T> extends p3g0<T, T> {

    /* JADX INFO: renamed from: c */
    public static final Object[] f207496c = new Object[0];

    /* JADX INFO: renamed from: a */
    public final SubjectSubscriptionManager<T> f207497a;

    /* JADX INFO: renamed from: b */
    public final NotificationLite<T> f207498b;

    /* JADX INFO: renamed from: rx.subjects.a$a */
    public static class a implements e30<SubjectSubscriptionManager.C22391c<T>> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ SubjectSubscriptionManager f207499a;

        public a(SubjectSubscriptionManager subjectSubscriptionManager) {
            this.f207499a = subjectSubscriptionManager;
        }

        @Override // p149l.e30
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(SubjectSubscriptionManager.C22391c<T> c22391c) {
            c22391c.m221506b(this.f207499a.getLatest(), this.f207499a.f207481nl);
        }
    }

    public C22392a(C22306c.a<T> aVar, SubjectSubscriptionManager<T> subjectSubscriptionManager) {
        super(aVar);
        this.f207498b = NotificationLite.m221335f();
        this.f207497a = subjectSubscriptionManager;
    }

    /* JADX INFO: renamed from: b */
    public static <T> C22392a<T> m221512b() {
        return m221514d(null, false);
    }

    /* JADX INFO: renamed from: c */
    public static <T> C22392a<T> m221513c(T t) {
        return m221514d(t, true);
    }

    /* JADX INFO: renamed from: d */
    public static <T> C22392a<T> m221514d(T t, boolean z) {
        SubjectSubscriptionManager subjectSubscriptionManager = new SubjectSubscriptionManager();
        if (z) {
            subjectSubscriptionManager.setLatest(NotificationLite.m221335f().m221344j(t));
        }
        a aVar = new a(subjectSubscriptionManager);
        subjectSubscriptionManager.onAdded = aVar;
        subjectSubscriptionManager.onTerminated = aVar;
        return new C22392a<>(subjectSubscriptionManager, subjectSubscriptionManager);
    }

    /* JADX INFO: renamed from: e */
    public T m221515e() {
        Object latest = this.f207497a.getLatest();
        if (this.f207498b.m221343i(latest)) {
            return this.f207498b.m221340e(latest);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: f */
    public Object[] m221516f() {
        Object[] objArr = f207496c;
        Object[] objArrM221517g = m221517g(objArr);
        return objArrM221517g == objArr ? new Object[0] : objArrM221517g;
    }

    /* JADX INFO: renamed from: g */
    public T[] m221517g(T[] tArr) {
        Object latest = this.f207497a.getLatest();
        if (!this.f207498b.m221343i(latest)) {
            if (tArr.length > 0) {
                tArr[0] = null;
            }
            return tArr;
        }
        if (tArr.length == 0) {
            tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), 1));
        }
        tArr[0] = this.f207498b.m221340e(latest);
        if (tArr.length > 1) {
            tArr[1] = null;
        }
        return tArr;
    }

    /* JADX INFO: renamed from: h */
    public boolean m221518h() {
        return this.f207497a.observers().length > 0;
    }

    /* JADX INFO: renamed from: i */
    public boolean m221519i() {
        return this.f207498b.m221343i(this.f207497a.getLatest());
    }

    @Override // p149l.m250
    public void onCompleted() {
        if (this.f207497a.getLatest() == null || this.f207497a.active) {
            Object objM221337b = this.f207498b.m221337b();
            for (SubjectSubscriptionManager.C22391c<T> c22391c : this.f207497a.terminate(objM221337b)) {
                c22391c.m221508d(objM221337b, this.f207497a.f207481nl);
            }
        }
    }

    @Override // p149l.m250
    public void onError(Throwable th) {
        if (this.f207497a.getLatest() == null || this.f207497a.active) {
            Object objM221338c = this.f207498b.m221338c(th);
            ArrayList arrayList = null;
            for (SubjectSubscriptionManager.C22391c<T> c22391c : this.f207497a.terminate(objM221338c)) {
                try {
                    c22391c.m221508d(objM221338c, this.f207497a.f207481nl);
                } catch (Throwable th2) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(th2);
                }
            }
            f5f.m119490d(arrayList);
        }
    }

    @Override // p149l.m250
    public void onNext(T t) {
        if (this.f207497a.getLatest() == null || this.f207497a.active) {
            Object objM221344j = this.f207498b.m221344j(t);
            for (SubjectSubscriptionManager.C22391c<T> c22391c : this.f207497a.next(objM221344j)) {
                c22391c.m221508d(objM221344j, this.f207497a.f207481nl);
            }
        }
    }
}
