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
import p153l.blq;
import p153l.clq;
import p153l.mqi0;
import p153l.tqi0;
import p153l.uqi0;

/* JADX INFO: loaded from: classes2.dex */
public class JUnit4TestAdapterCache extends HashMap<Description, mqi0> {
    private static final JUnit4TestAdapterCache fInstance = new JUnit4TestAdapterCache();
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: junit.framework.JUnit4TestAdapterCache$a */
    public class C15213a extends RunListener {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ tqi0 f64050a;

        public C15213a(tqi0 tqi0Var) {
            this.f64050a = tqi0Var;
        }

        @Override // org.junit.runner.notification.RunListener
        public void testFailure(Failure failure) throws Exception {
            this.f64050a.m192308a(JUnit4TestAdapterCache.this.asTest(failure.getDescription()), failure.getException());
        }

        @Override // org.junit.runner.notification.RunListener
        public void testFinished(Description description) throws Exception {
            this.f64050a.m192311e(JUnit4TestAdapterCache.this.asTest(description));
        }

        @Override // org.junit.runner.notification.RunListener
        public void testStarted(Description description) throws Exception {
            this.f64050a.m192315i(JUnit4TestAdapterCache.this.asTest(description));
        }
    }

    public static JUnit4TestAdapterCache getDefault() {
        return fInstance;
    }

    public mqi0 asTest(Description description) {
        if (description.isSuite()) {
            return createTest(description);
        }
        if (!containsKey(description)) {
            put(description, createTest(description));
        }
        return get(description);
    }

    public List<mqi0> asTestList(Description description) {
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

    public mqi0 createTest(Description description) {
        if (description.isTest()) {
            return new clq(description);
        }
        uqi0 uqi0Var = new uqi0(description.getDisplayName());
        Iterator<Description> it = description.getChildren().iterator();
        while (it.hasNext()) {
            uqi0Var.m197356c(asTest(it.next()));
        }
        return uqi0Var;
    }

    public RunNotifier getNotifier(tqi0 tqi0Var, blq blqVar) {
        RunNotifier runNotifier = new RunNotifier();
        runNotifier.addListener(new C15213a(tqi0Var));
        return runNotifier;
    }
}
