package p153l;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import p137rx.C22421c;
import p137rx.subjects.C22507a;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m88120d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\r¨\u0006\u000f"}, m88121d2 = {"Ll/vc0;", "", "<init>", "()V", "Lrx/c;", "", "a", "()Lrx/c;", "isChecked", "", "b", "(Z)V", "Lrx/subjects/a;", "Lrx/subjects/a;", "agreementCheckedStatus", "pay_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class vc0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final C22507a<Boolean> agreementCheckedStatus;

    public vc0() {
        C22507a<Boolean> c22507aM222758b = C22507a.m222758b();
        c22507aM222758b.getClass();
        this.agreementCheckedStatus = c22507aM222758b;
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public C22421c<Boolean> m200750a() {
        C22421c<Boolean> c22421cAsObservable = this.agreementCheckedStatus.asObservable();
        c22421cAsObservable.getClass();
        return c22421cAsObservable;
    }

    /* JADX INFO: renamed from: b */
    public void m200751b(boolean isChecked) {
        this.agreementCheckedStatus.onNext(Boolean.valueOf(isChecked));
    }
}
