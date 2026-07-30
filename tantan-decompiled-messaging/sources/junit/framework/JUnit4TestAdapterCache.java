package junit.framework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.junit.runner.Description;
import org.junit.runner.notification.Failure;
import org.junit.runner.notification.RunListener;
import org.junit.runner.notification.RunNotifier;
import p149l.cjq;
import p149l.djq;
import p149l.mhi0;
import p149l.thi0;
import p149l.uhi0;

/* JADX INFO: loaded from: classes2.dex */
public class JUnit4TestAdapterCache extends HashMap<Description, mhi0> {
    private static final JUnit4TestAdapterCache fInstance = new JUnit4TestAdapterCache();
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: junit.framework.JUnit4TestAdapterCache$a */
    public class C15106a extends RunListener {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ thi0 f63376a;

        public C15106a(thi0 thi0Var) {
            this.f63376a = thi0Var;
        }

        @Override // org.junit.runner.notification.RunListener
        public void testFailure(Failure failure) throws Exception {
            this.f63376a.m188913a(JUnit4TestAdapterCache.this.asTest(failure.getDescription()), failure.getException());
        }

        @Override // org.junit.runner.notification.RunListener
        public void testFinished(Description description) throws Exception {
            this.f63376a.m188916e(JUnit4TestAdapterCache.this.asTest(description));
        }

        @Override // org.junit.runner.notification.RunListener
        public void testStarted(Description description) throws Exception {
            this.f63376a.m188920i(JUnit4TestAdapterCache.this.asTest(description));
        }
    }

    public static JUnit4TestAdapterCache getDefault() {
        return fInstance;
    }

    public mhi0 asTest(Description description) {
        if (description.isSuite()) {
            return createTest(description);
        }
        if (!containsKey(description)) {
            put(description, createTest(description));
        }
        return get(description);
    }

    public List<mhi0> asTestList(Description description) {
        if (description.isTest()) {
            return Arrays.asList(asTest(description));
        }
        ArrayList arrayList = new ArrayList();
        Iterator<Description> it = description.getChildren().iterator();
        while (it.hasNext()) {
            arrayList.add(asTest(it.next()));
        }
        return arrayList;
    }

    public mhi0 createTest(Description description) {
        if (description.isTest()) {
            return new djq(description);
        }
        uhi0 uhi0Var = new uhi0(description.getDisplayName());
        Iterator<Description> it = description.getChildren().iterator();
        while (it.hasNext()) {
            uhi0Var.m193733c(asTest(it.next()));
        }
        return uhi0Var;
    }

    public RunNotifier getNotifier(thi0 thi0Var, cjq cjqVar) {
        RunNotifier runNotifier = new RunNotifier();
        runNotifier.addListener(new C15106a(thi0Var));
        return runNotifier;
    }
}
