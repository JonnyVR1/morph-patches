package p153l;

import org.junit.runner.Describable;
import org.junit.runner.Description;

/* JADX INFO: loaded from: classes2.dex */
public class clq implements mqi0, Describable {

    /* JADX INFO: renamed from: a */
    private final Description f82418a;

    public clq(Description description) {
        this.f82418a = description;
    }

    @Override // p153l.mqi0
    /* JADX INFO: renamed from: a */
    public void mo110696a(tqi0 tqi0Var) {
        throw new RuntimeException("This test stub created only for informational purposes.");
    }

    @Override // p153l.mqi0
    /* JADX INFO: renamed from: b */
    public int mo110697b() {
        return 1;
    }

    @Override // org.junit.runner.Describable
    public Description getDescription() {
        return this.f82418a;
    }

    public String toString() {
        return getDescription().toString();
    }
}
