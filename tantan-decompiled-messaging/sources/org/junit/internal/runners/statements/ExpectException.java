package org.junit.internal.runners.statements;

import org.junit.internal.AssumptionViolatedException;
import org.junit.runners.model.Statement;
import p149l.y9g0;

/* JADX INFO: loaded from: classes3.dex */
public class ExpectException extends Statement {
    private final Class<? extends Throwable> expected;
    private final Statement next;

    public ExpectException(Statement statement, Class<? extends Throwable> cls) {
        this.next = statement;
        this.expected = cls;
    }

    @Override // org.junit.runners.model.Statement
    public void evaluate() throws Exception {
        try {
            this.next.evaluate();
            y9g0.m213537a("Expected exception: ".concat(this.expected.getName()));
        } catch (AssumptionViolatedException e) {
            throw e;
        } catch (Throwable th) {
            if (this.expected.isAssignableFrom(th.getClass())) {
                return;
            }
            throw new Exception("Unexpected exception, expected<" + this.expected.getName() + "> but was<" + th.getClass().getName() + ">", th);
        }
    }
}
