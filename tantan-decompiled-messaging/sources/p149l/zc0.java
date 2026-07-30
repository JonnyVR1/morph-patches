package p149l;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import p133rx.C22306c;
import p133rx.subjects.C22392a;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m87231d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\r¨\u0006\u000f"}, m87232d2 = {"Ll/zc0;", "", "<init>", "()V", "Lrx/c;", "", "a", "()Lrx/c;", "isChecked", "", "b", "(Z)V", "Lrx/subjects/a;", "Lrx/subjects/a;", "agreementCheckedStatus", "pay_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class zc0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final C22392a<Boolean> agreementCheckedStatus;

    public zc0() {
        C22392a<Boolean> c22392aM221512b = C22392a.m221512b();
        c22392aM221512b.getClass();
        this.agreementCheckedStatus = c22392aM221512b;
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public C22306c<Boolean> m218007a() {
        C22306c<Boolean> c22306cAsObservable = this.agreementCheckedStatus.asObservable();
        c22306cAsObservable.getClass();
        return c22306cAsObservable;
    }

    /* JADX INFO: renamed from: b */
    public void m218008b(boolean isChecked) {
        this.agreementCheckedStatus.onNext(Boolean.valueOf(isChecked));
    }
}
