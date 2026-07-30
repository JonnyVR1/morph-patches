package p137rx.subjects;

import java.util.ArrayList;
import p137rx.C22421c;
import p137rx.internal.operators.NotificationLite;
import p153l.j6f;
import p153l.wbg0;
import p153l.y20;

/* JADX INFO: renamed from: rx.subjects.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C22508b<T> extends wbg0<T, T> {

    /* JADX INFO: renamed from: a */
    public final SubjectSubscriptionManager<T> f208422a;

    /* JADX INFO: renamed from: b */
    public final NotificationLite<T> f208423b;

    /* JADX INFO: renamed from: rx.subjects.b$a */
    public static class a implements y20<SubjectSubscriptionManager.C22506c<T>> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ SubjectSubscriptionManager f208424a;

        public a(SubjectSubscriptionManager subjectSubscriptionManager) {
            this.f208424a = subjectSubscriptionManager;
        }

        @Override // p153l.y20
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(SubjectSubscriptionManager.C22506c<T> c22506c) {
            c22506c.m222752b(this.f208424a.getLatest(), this.f208424a.f208403nl);
        }
    }

    public C22508b(C22421c.a<T> aVar, SubjectSubscriptionManager<T> subjectSubscriptionManager) {
        super(aVar);
        this.f208423b = NotificationLite.m222581f();
        this.f208422a = subjectSubscriptionManager;
    }

    /* JADX INFO: renamed from: b */
    public static <T> C22508b<T> m222767b() {
        SubjectSubscriptionManager subjectSubscriptionManager = new SubjectSubscriptionManager();
        subjectSubscriptionManager.onTerminated = new a(subjectSubscriptionManager);
        return new C22508b<>(subjectSubscriptionManager, subjectSubscriptionManager);
    }

    @Override // p153l.bb50
    public void onCompleted() {
        if (this.f208422a.active) {
            Object objM222583b = this.f208423b.m222583b();
            for (SubjectSubscriptionManager.C22506c<T> c22506c : this.f208422a.terminate(objM222583b)) {
                c22506c.m222754d(objM222583b, this.f208422a.f208403nl);
            }
        }
    }

    @Override // p153l.bb50
    public void onError(Throwable th) {
        if (this.f208422a.active) {
            Object objM222584c = this.f208423b.m222584c(th);
            ArrayList arrayList = null;
            for (SubjectSubscriptionManager.C22506c<T> c22506c : this.f208422a.terminate(objM222584c)) {
                try {
                    c22506c.m222754d(objM222584c, this.f208422a.f208403nl);
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
        for (SubjectSubscriptionManager.C22506c<T> c22506c : this.f208422a.observers()) {
            c22506c.onNext(t);
        }
    }
}
