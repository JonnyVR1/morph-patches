package org.junit.internal.runners.statements;

import java.util.Iterator;
import java.util.List;
import org.junit.runners.model.FrameworkMethod;
import org.junit.runners.model.Statement;

/* JADX INFO: loaded from: classes3.dex */
public class RunBefores extends Statement {
    private final List<FrameworkMethod> befores;
    private final Statement next;
    private final Object target;

    public RunBefores(Statement statement, List<FrameworkMethod> list, Object obj) {
        this.next = statement;
        this.befores = list;
        this.target = obj;
    }

    @Override // org.junit.runners.model.Statement
    public void evaluate() throws Throwable {
        Iterator<FrameworkMethod> it = this.befores.iterator();
        while (it.hasNext()) {
            it.next().invokeExplosively(this.target, new Object[0]);
        }
        this.next.evaluate();
    }
}
