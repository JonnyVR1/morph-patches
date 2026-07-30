package p003l;

import androidx.annotation.NonNull;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import l.mkd0;
import p014rx.C1099c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class fqb {

    /* JADX INFO: renamed from: a */
    public c4g0 f3671a;

    /* JADX INFO: renamed from: l.fqb$a */
    public class C0294a implements m250<Long> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ epl f3672a;

        public C0294a(epl eplVar) {
            this.f3672a = eplVar;
        }

        @Override // p003l.m250
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onNext(Long l2) {
            this.f3672a.mo3728b(l2);
        }

        @Override // p003l.m250
        public void onCompleted() {
            this.f3672a.mo3727a();
        }

        @Override // p003l.m250
        public void onError(Throwable th) {
            this.f3672a.onError();
        }
    }

    /* JADX INFO: renamed from: b */
    public void m4392b(int i, @NonNull final epl eplVar) {
        C1099c c1099cCompose = C1099c.interval(0L, 1L, TimeUnit.SECONDS).take(i).map(new w9j() { // from class: l.dqb
            @Override // p003l.w9j
            public final Object call(Object obj) {
                return Long.valueOf(((Long) obj).longValue() + 1);
            }
        }).onBackpressureLatest().compose(mkd0.C());
        Objects.requireNonNull(eplVar);
        this.f3671a = c1099cCompose.doOnSubscribe(new d30() { // from class: l.eqb
            @Override // p003l.d30
            public final void call() {
                eplVar.onStart();
            }
        }).subscribe((m250) mkd0.L(new C0294a(eplVar)));
    }

    /* JADX INFO: renamed from: c */
    public void m4393c() {
        mkd0.z(this.f3671a);
    }
}
