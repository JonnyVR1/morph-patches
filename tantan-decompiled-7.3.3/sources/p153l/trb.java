package p153l;

import androidx.annotation.NonNull;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes3.dex */
public class trb {

    /* JADX INFO: renamed from: a */
    public kcg0 f175857a;

    /* JADX INFO: renamed from: l.trb$a */
    public class C20383a implements bb50<Long> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ qrl f175858a;

        public C20383a(qrl qrlVar) {
            this.f175858a = qrlVar;
        }

        @Override // p153l.bb50
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onNext(Long l2) {
            this.f175858a.mo101224b(l2);
        }

        @Override // p153l.bb50
        public void onCompleted() {
            this.f175858a.mo101223a();
        }

        @Override // p153l.bb50
        public void onError(Throwable th) {
            this.f175858a.onError();
        }
    }

    /* JADX INFO: renamed from: b */
    public void m192466b(int i, @NonNull final qrl qrlVar) {
        C22421c c22421cCompose = C22421c.interval(0L, 1L, TimeUnit.SECONDS).take(i).map(new qcj() { // from class: l.rrb
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Long.valueOf(((Long) obj).longValue() + 1);
            }
        }).onBackpressureLatest().compose(psd0.m173592C());
        Objects.requireNonNull(qrlVar);
        this.f175857a = c22421cCompose.doOnSubscribe(new x20() { // from class: l.srb
            @Override // p153l.x20
            public final void call() {
                qrlVar.onStart();
            }
        }).subscribe(psd0.m173601L(new C20383a(qrlVar)));
    }

    /* JADX INFO: renamed from: c */
    public void m192467c() {
        psd0.m173633z(this.f175857a);
    }
}
