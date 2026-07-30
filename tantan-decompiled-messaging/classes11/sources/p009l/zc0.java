package p009l;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import rx.c;
import rx.subjects.a;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\r¨\u0006\u000f"}, d2 = {"Ll/zc0;", "", "<init>", "()V", "Lrx/c;", "", "a", "()Lrx/c;", "isChecked", "", "b", "(Z)V", "Lrx/subjects/a;", "Lrx/subjects/a;", "agreementCheckedStatus", "pay_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class zc0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final a<Boolean> agreementCheckedStatus;

    public zc0() {
        a<Boolean> aVarB = a.b();
        aVarB.getClass();
        this.agreementCheckedStatus = aVarB;
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public c<Boolean> m25652a() {
        c<Boolean> cVarAsObservable = this.agreementCheckedStatus.asObservable();
        cVarAsObservable.getClass();
        return cVarAsObservable;
    }

    /* JADX INFO: renamed from: b */
    public void m25653b(boolean isChecked) {
        this.agreementCheckedStatus.onNext(Boolean.valueOf(isChecked));
    }
}
