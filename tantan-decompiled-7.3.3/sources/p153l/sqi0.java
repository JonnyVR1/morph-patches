package p153l;

import junit.framework.AssertionFailedError;

/* JADX INFO: loaded from: classes2.dex */
public interface sqi0 {
    void addError(mqi0 mqi0Var, Throwable th);

    void addFailure(mqi0 mqi0Var, AssertionFailedError assertionFailedError);

    void endTest(mqi0 mqi0Var);

    void startTest(mqi0 mqi0Var);
}
