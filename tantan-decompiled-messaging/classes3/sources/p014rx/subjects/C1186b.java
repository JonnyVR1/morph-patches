package p014rx.subjects;

import java.util.ArrayList;
import p003l.e30;
import p003l.f5f;
import p003l.p3g0;
import p014rx.C1099c;
import p014rx.internal.operators.NotificationLite;

/* JADX INFO: renamed from: rx.subjects.b */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public final class C1186b<T> extends p3g0<T, T> {

    /* JADX INFO: renamed from: a */
    public final SubjectSubscriptionManager<T> f11125a;

    /* JADX INFO: renamed from: b */
    public final NotificationLite<T> f11126b;

    /* JADX INFO: renamed from: rx.subjects.b$a */
    public static class a implements e30<SubjectSubscriptionManager.C1184c<T>> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ SubjectSubscriptionManager f11127a;

        public a(SubjectSubscriptionManager subjectSubscriptionManager) {
            this.f11127a = subjectSubscriptionManager;
        }

        @Override // p003l.e30
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(SubjectSubscriptionManager.C1184c<T> c1184c) {
            c1184c.m9963b(this.f11127a.getLatest(), this.f11127a.f11106nl);
        }
    }

    public C1186b(C1099c.a<T> aVar, SubjectSubscriptionManager<T> subjectSubscriptionManager) {
        super(aVar);
        this.f11126b = NotificationLite.m9792f();
        this.f11125a = subjectSubscriptionManager;
    }

    /* JADX INFO: renamed from: b */
    public static <T> C1186b<T> m9978b() {
        SubjectSubscriptionManager subjectSubscriptionManager = new SubjectSubscriptionManager();
        subjectSubscriptionManager.onTerminated = new a(subjectSubscriptionManager);
        return new C1186b<>(subjectSubscriptionManager, subjectSubscriptionManager);
    }

    @Override // p003l.m250
    public void onCompleted() {
        if (this.f11125a.active) {
            Object objM9794b = this.f11126b.m9794b();
            for (SubjectSubscriptionManager.C1184c<T> c1184c : this.f11125a.terminate(objM9794b)) {
                c1184c.m9965d(objM9794b, this.f11125a.f11106nl);
            }
        }
    }

    @Override // p003l.m250
    public void onError(Throwable th) {
        if (this.f11125a.active) {
            Object objM9795c = this.f11126b.m9795c(th);
            ArrayList arrayList = null;
            for (SubjectSubscriptionManager.C1184c<T> c1184c : this.f11125a.terminate(objM9795c)) {
                try {
                    c1184c.m9965d(objM9795c, this.f11125a.f11106nl);
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
        for (SubjectSubscriptionManager.C1184c<T> c1184c : this.f11125a.observers()) {
            c1184c.onNext(t);
        }
    }
}
