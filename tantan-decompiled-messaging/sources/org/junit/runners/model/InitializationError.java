package org.junit.runners.model;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class InitializationError extends Exception {
    private static final long serialVersionUID = 1;
    private final List<Throwable> fErrors;

    public InitializationError(Throwable th) {
        this((List<Throwable>) Arrays.asList(th));
    }

    public List<Throwable> getCauses() {
        return this.fErrors;
    }

    public InitializationError(List<Throwable> list) {
        this.fErrors = list;
    }

    public InitializationError(String str) {
        this(new Exception(str));
    }
}
