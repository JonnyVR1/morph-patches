package org.junit.internal.runners;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
@Deprecated
public class InitializationError extends Exception {
    private static final long serialVersionUID = 1;
    private final List<Throwable> fErrors;

    public InitializationError(String str) {
        this(new Exception(str));
    }

    public List<Throwable> getCauses() {
        return this.fErrors;
    }

    public InitializationError(Throwable... thArr) {
        this((List<Throwable>) Arrays.asList(thArr));
    }

    public InitializationError(List<Throwable> list) {
        this.fErrors = list;
    }
}
