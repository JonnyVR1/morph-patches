package p137rx.subjects;

import java.lang.reflect.Array;
import java.util.ArrayList;
import p137rx.C22421c;
import p137rx.internal.operators.NotificationLite;
import p153l.j6f;
import p153l.wbg0;
import p153l.y20;

/* JADX INFO: renamed from: rx.subjects.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C22507a<T> extends wbg0<T, T> {

    /* JADX INFO: renamed from: c */
    public static final Object[] f208418c = new Object[0];

    /* JADX INFO: renamed from: a */
    public final SubjectSubscriptionManager<T> f208419a;

    /* JADX INFO: renamed from: b */
    public final NotificationLite<T> f208420b;

    /* JADX INFO: renamed from: rx.subjects.a$a */
    public static class a implements y20<SubjectSubscriptionManager.C22506c<T>> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ SubjectSubscriptionManager f208421a;

        public a(SubjectSubscriptionManager subjectSubscriptionManager) {
            this.f208421a = subjectSubscriptionManager;
        }

        @Override // p153l.y20
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(SubjectSubscriptionManager.C22506c<T> c22506c) {
            c22506c.m222752b(this.f208421a.getLatest(), this.f208421a.f208403nl);
        }
    }

    public C22507a(C22421c.a<T> aVar, SubjectSubscriptionManager<T> subjectSubscriptionManager) {
        super(aVar);
        this.f208420b = NotificationLite.m222581f();
        this.f208419a = subjectSubscriptionManager;
    }

    /* JADX INFO: renamed from: b */
    public static <T> C22507a<T> m222758b() {
        return m222760d(null, false);
    }

    /* JADX INFO: renamed from: c */
    public static <T> C22507a<T> m222759c(T t) {
        return m222760d(t, true);
    }

    /* JADX INFO: renamed from: d */
    public static <T> C22507a<T> m222760d(T t, boolean z) {
        SubjectSubscriptionManager subjectSubscriptionManager = new SubjectSubscriptionManager();
        if (z) {
            subjectSubscriptionManager.setLatest(NotificationLite.m222581f().m222590j(t));
        }
        a aVar = new a(subjectSubscriptionManager);
        subjectSubscriptionManager.onAdded = aVar;
        subjectSubscriptionManager.onTerminated = aVar;
        return new C22507a<>(subjectSubscriptionManager, subjectSubscriptionManager);
    }

    /* JADX INFO: renamed from: e */
    public T m222761e() {
        Object latest = this.f208419a.getLatest();
        if (this.f208420b.m222589i(latest)) {
            return this.f208420b.m222586e(latest);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: f */
    public Object[] m222762f() {
        Object[] objArr = f208418c;
        Object[] objArrM222763g = m222763g(objArr);
        return objArrM222763g == objArr ? new Object[0] : objArrM222763g;
    }

    /* JADX INFO: renamed from: g */
    public T[] m222763g(T[] tArr) {
        Object latest = this.f208419a.getLatest();
        if (!this.f208420b.m222589i(latest)) {
            if (tArr.length > 0) {
                tArr[0] = null;
            }
            return tArr;
        }
        if (tArr.length == 0) {
            tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), 1));
        }
        tArr[0] = this.f208420b.m222586e(latest);
        if (tArr.length > 1) {
            tArr[1] = null;
        }
        return tArr;
    }

    /* JADX INFO: renamed from: h */
    public boolean m222764h() {
        return this.f208419a.observers().length > 0;
    }

    /* JADX INFO: renamed from: i */
    public boolean m222765i() {
        return this.f208420b.m222589i(this.f208419a.getLatest());
    }

    @Override // p153l.bb50
    public void onCompleted() {
        if (this.f208419a.getLatest() == null || this.f208419a.active) {
            Object objM222583b = this.f208420b.m222583b();
            for (SubjectSubscriptionManager.C22506c<T> c22506c : this.f208419a.terminate(objM222583b)) {
                c22506c.m222754d(objM222583b, this.f208419a.f208403nl);
            }
        }
    }

    @Override // p153l.bb50
    public void onError(Throwable th) {
        if (this.f208419a.getLatest() == null || this.f208419a.active) {
            Object objM222584c = this.f208420b.m222584c(th);
            ArrayList arrayList = null;
            for (SubjectSubscriptionManager.C22506c<T> c22506c : this.f208419a.terminate(objM222584c)) {
                try {
                    c22506c.m222754d(objM222584c, this.f208419a.f208403nl);
                } catch (Throwable th2) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(th2);
                }
            }
            j6f.m143662d(arrayList);
        }
    }

    @Override // p153l.bb50
    public void onNext(T t) {
        if (this.f208419a.getLatest() == null || this.f208419a.active) {
            Object objM222590j = this.f208420b.m222590j(t);
            for (SubjectSubscriptionManager.C22506c<T> c22506c : this.f208419a.next(objM222590j)) {
                c22506c.m222754d(objM222590j, this.f208419a.f208403nl);
            }
        }
    }
}
