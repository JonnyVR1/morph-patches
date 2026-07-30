package org.junit.rules;

import java.util.ArrayList;
import java.util.List;
import org.junit.internal.AssumptionViolatedException;
import org.junit.runner.Description;
import org.junit.runners.model.MultipleFailureException;
import org.junit.runners.model.Statement;

/* JADX INFO: loaded from: classes3.dex */
public abstract class TestWatcher implements TestRule {
    /* JADX INFO: Access modifiers changed from: private */
    public void failedQuietly(Throwable th, Description description, List<Throwable> list) {
        try {
            failed(th, description);
        } catch (Throwable th2) {
            list.add(th2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void finishedQuietly(Description description, List<Throwable> list) {
        try {
            finished(description);
        } catch (Throwable th) {
            list.add(th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void skippedQuietly(AssumptionViolatedException assumptionViolatedException, Description description, List<Throwable> list) {
        try {
            if (assumptionViolatedException instanceof org.junit.AssumptionViolatedException) {
                skipped((org.junit.AssumptionViolatedException) assumptionViolatedException, description);
            } else {
                skipped(assumptionViolatedException, description);
            }
        } catch (Throwable th) {
            list.add(th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startingQuietly(Description description, List<Throwable> list) {
        try {
            starting(description);
        } catch (Throwable th) {
            list.add(th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void succeededQuietly(Description description, List<Throwable> list) {
        try {
            succeeded(description);
        } catch (Throwable th) {
            list.add(th);
        }
    }

    @Override // org.junit.rules.TestRule
    public Statement apply(final Statement statement, final Description description) {
        return new Statement() { // from class: org.junit.rules.TestWatcher.1
            @Override // org.junit.runners.model.Statement
            public void evaluate() throws Exception {
                ArrayList arrayList = new ArrayList();
                TestWatcher.this.startingQuietly(description, arrayList);
                try {
                    try {
                        statement.evaluate();
                        TestWatcher.this.succeededQuietly(description, arrayList);
                    } catch (Throwable th) {
                        TestWatcher.this.finishedQuietly(description, arrayList);
                        throw th;
                    }
                } catch (AssumptionViolatedException e) {
                    arrayList.add(e);
                    TestWatcher.this.skippedQuietly(e, description, arrayList);
                } catch (Throwable th2) {
                    arrayList.add(th2);
                    TestWatcher.this.failedQuietly(th2, description, arrayList);
                }
                TestWatcher.this.finishedQuietly(description, arrayList);
                MultipleFailureException.assertEmpty(arrayList);
            }
        };
    }

    public void failed(Throwable th, Description description) {
    }

    public void finished(Description description) {
    }

    public void skipped(org.junit.AssumptionViolatedException assumptionViolatedException, Description description) {
        skipped((AssumptionViolatedException) assumptionViolatedException, description);
    }

    public void starting(Description description) {
    }

    public void succeeded(Description description) {
    }

    @Deprecated
    public void skipped(AssumptionViolatedException assumptionViolatedException, Description description) {
    }
}
