package org.junit.rules;

import org.junit.runner.Description;
import org.junit.runners.model.Statement;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ExternalResource implements TestRule {
    private Statement statement(final Statement statement) {
        return new Statement() { // from class: org.junit.rules.ExternalResource.1
            @Override // org.junit.runners.model.Statement
            public void evaluate() throws Throwable {
                ExternalResource.this.before();
                try {
                    statement.evaluate();
                } finally {
                    ExternalResource.this.after();
                }
            }
        };
    }

    public void after() {
    }

    @Override // org.junit.rules.TestRule
    public Statement apply(Statement statement, Description description) {
        return statement(statement);
    }

    public void before() throws Throwable {
    }
}
