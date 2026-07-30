package p149l;

import org.junit.runner.Describable;
import org.junit.runner.Description;

/* JADX INFO: loaded from: classes2.dex */
public class djq implements mhi0, Describable {

    /* JADX INFO: renamed from: a */
    private final Description f86565a;

    public djq(Description description) {
        this.f86565a = description;
    }

    @Override // p149l.mhi0
    /* JADX INFO: renamed from: a */
    public void mo112097a(thi0 thi0Var) {
        throw new RuntimeException("This test stub created only for informational purposes.");
    }

    @Override // p149l.mhi0
    /* JADX INFO: renamed from: b */
    public int mo112098b() {
        return 1;
    }

    @Override // org.junit.runner.Describable
    public Description getDescription() {
        return this.f86565a;
    }

    public String toString() {
        return getDescription().toString();
    }
}
