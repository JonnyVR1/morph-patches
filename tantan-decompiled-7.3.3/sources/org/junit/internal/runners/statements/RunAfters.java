package org.junit.internal.runners.statements;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.junit.runners.model.FrameworkMethod;
import org.junit.runners.model.MultipleFailureException;
import org.junit.runners.model.Statement;

/* JADX INFO: loaded from: classes3.dex */
public class RunAfters extends Statement {
    private final List<FrameworkMethod> afters;
    private final Statement next;
    private final Object target;

    public RunAfters(Statement statement, List<FrameworkMethod> list, Object obj) {
        this.next = statement;
        this.afters = list;
        this.target = obj;
    }

    @Override // org.junit.runners.model.Statement
    public void evaluate() throws Exception {
        ArrayList arrayList = new ArrayList();
        try {
            this.next.evaluate();
            Iterator<FrameworkMethod> it = this.afters.iterator();
            while (it.hasNext()) {
                try {
                    it.next().invokeExplosively(this.target, new Object[0]);
                } catch (Throwable th) {
                    arrayList.add(th);
                }
            }
        } catch (Throwable th2) {
            try {
                arrayList.add(th2);
                Iterator<FrameworkMethod> it2 = this.afters.iterator();
                while (it2.hasNext()) {
                    try {
                        it2.next().invokeExplosively(this.target, new Object[0]);
                    } catch (Throwable th3) {
                        arrayList.add(th3);
                    }
                }
            } catch (Throwable th4) {
                Iterator<FrameworkMethod> it3 = this.afters.iterator();
                while (it3.hasNext()) {
                    try {
                        it3.next().invokeExplosively(this.target, new Object[0]);
                    } catch (Throwable th5) {
                        arrayList.add(th5);
                    }
                }
                throw th4;
            }
        }
        MultipleFailureException.assertEmpty(arrayList);
    }
}
