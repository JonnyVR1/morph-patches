package org.junit.rules;

import org.junit.internal.AssumptionViolatedException;
import org.junit.runners.model.FrameworkMethod;
import org.junit.runners.model.Statement;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public class TestWatchman implements MethodRule {
    @Override // org.junit.rules.MethodRule
    public Statement apply(final Statement statement, final FrameworkMethod frameworkMethod, Object obj) {
        return new Statement() { // from class: org.junit.rules.TestWatchman.1
            @Override // org.junit.runners.model.Statement
            public void evaluate() throws Throwable {
                TestWatchman.this.starting(frameworkMethod);
                try {
                    try {
                        try {
                            statement.evaluate();
                            TestWatchman.this.succeeded(frameworkMethod);
                            TestWatchman.this.finished(frameworkMethod);
                        } catch (AssumptionViolatedException e) {
                            throw e;
                        }
                    } catch (Throwable th) {
                        TestWatchman.this.failed(th, frameworkMethod);
                        throw th;
                    }
                } catch (Throwable th2) {
                    TestWatchman.this.finished(frameworkMethod);
                    throw th2;
                }
            }
        };
    }

    public void failed(Throwable th, FrameworkMethod frameworkMethod) {
    }

    public void finished(FrameworkMethod frameworkMethod) {
    }

    public void starting(FrameworkMethod frameworkMethod) {
    }

    public void succeeded(FrameworkMethod frameworkMethod) {
    }
}
