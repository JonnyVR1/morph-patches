package org.junit.runners.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.junit.internal.Throwables;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class MultipleFailureException extends Exception {
    private static final long serialVersionUID = 1;
    private final List<Throwable> fErrors;

    public MultipleFailureException(List<Throwable> list) {
        this.fErrors = new ArrayList(list);
    }

    public static void assertEmpty(List<Throwable> list) throws Exception {
        if (list.isEmpty()) {
            return;
        }
        if (list.size() != 1) {
            throw new org.junit.internal.runners.model.MultipleFailureException(list);
        }
        throw Throwables.rethrowAsException(list.get(0));
    }

    public List<Throwable> getFailures() {
        return Collections.unmodifiableList(this.fErrors);
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        StringBuilder sb = new StringBuilder(String.format("There were %d errors:", Integer.valueOf(this.fErrors.size())));
        for (Throwable th : this.fErrors) {
            sb.append(String.format("\n  %s(%s)", th.getClass().getName(), th.getMessage()));
        }
        return sb.toString();
    }
}
