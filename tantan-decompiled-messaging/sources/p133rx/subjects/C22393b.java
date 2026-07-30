package p133rx.subjects;

import java.util.ArrayList;
import p133rx.C22306c;
import p133rx.internal.operators.NotificationLite;
import p149l.e30;
import p149l.f5f;
import p149l.p3g0;

/* JADX INFO: renamed from: rx.subjects.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C22393b<T> extends p3g0<T, T> {

    /* JADX INFO: renamed from: a */
    public final SubjectSubscriptionManager<T> f207500a;

    /* JADX INFO: renamed from: b */
    public final NotificationLite<T> f207501b;

    /* JADX INFO: renamed from: rx.subjects.b$a */
    public static class a implements e30<SubjectSubscriptionManager.C22391c<T>> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ SubjectSubscriptionManager f207502a;

        public a(SubjectSubscriptionManager subjectSubscriptionManager) {
            this.f207502a = subjectSubscriptionManager;
        }

        @Override // p149l.e30
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(SubjectSubscriptionManager.C22391c<T> c22391c) {
            c22391c.m221506b(this.f207502a.getLatest(), this.f207502a.f207481nl);
        }
    }

    public C22393b(C22306c.a<T> aVar, SubjectSubscriptionManager<T> subjectSubscriptionManager) {
        super(aVar);
        this.f207501b = NotificationLite.m221335f();
        this.f207500a = subjectSubscriptionManager;
    }

    /* JADX INFO: renamed from: b */
    public static <T> C22393b<T> m221521b() {
        SubjectSubscriptionManager subjectSubscriptionManager = new SubjectSubscriptionManager();
        subjectSubscriptionManager.onTerminated = new a(subjectSubscriptionManager);
        return new C22393b<>(subjectSubscriptionManager, subjectSubscriptionManager);
    }

    @Override // p149l.m250
    public void onCompleted() {
        if (this.f207500a.active) {
            Object objM221337b = this.f207501b.m221337b();
            for (SubjectSubscriptionManager.C22391c<T> c22391c : this.f207500a.terminate(objM221337b)) {
                c22391c.m221508d(objM221337b, this.f207500a.f207481nl);
            }
        }
    }

    @Override // p149l.m250
    public void onError(Throwable th) {
        if (this.f207500a.active) {
            Object objM221338c = this.f207501b.m221338c(th);
            ArrayList arrayList = null;
            for (SubjectSubscriptionManager.C22391c<T> c22391c : this.f207500a.terminate(objM221338c)) {
                try {
                    c22391c.m221508d(objM221338c, this.f207500a.f207481nl);
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
        for (SubjectSubscriptionManager.C22391c<T> c22391c : this.f207500a.observers()) {
            c22391c.onNext(t);
        }
    }
}
