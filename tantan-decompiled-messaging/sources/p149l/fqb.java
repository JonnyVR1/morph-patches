package p149l;

import androidx.annotation.NonNull;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes3.dex */
public class fqb {

    /* JADX INFO: renamed from: a */
    public c4g0 f98781a;

    /* JADX INFO: renamed from: l.fqb$a */
    public class C16907a implements m250<Long> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ epl f98782a;

        public C16907a(epl eplVar) {
            this.f98782a = eplVar;
        }

        @Override // p149l.m250
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onNext(Long l2) {
            this.f98782a.mo113245b(l2);
        }

        @Override // p149l.m250
        public void onCompleted() {
            this.f98782a.mo113244a();
        }

        @Override // p149l.m250
        public void onError(Throwable th) {
            this.f98782a.onError();
        }
    }

    /* JADX INFO: renamed from: b */
    public void m122691b(int i, @NonNull final epl eplVar) {
        C22306c c22306cCompose = C22306c.interval(0L, 1L, TimeUnit.SECONDS).take(i).map(new w9j() { // from class: l.dqb
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Long.valueOf(((Long) obj).longValue() + 1);
            }
        }).onBackpressureLatest().compose(mkd0.m154951C());
        Objects.requireNonNull(eplVar);
        this.f98781a = c22306cCompose.doOnSubscribe(new d30() { // from class: l.eqb
            @Override // p149l.d30
            public final void call() {
                eplVar.onStart();
            }
        }).subscribe(mkd0.m154960L(new C16907a(eplVar)));
    }

    /* JADX INFO: renamed from: c */
    public void m122692c() {
        mkd0.m154992z(this.f98781a);
    }
}
