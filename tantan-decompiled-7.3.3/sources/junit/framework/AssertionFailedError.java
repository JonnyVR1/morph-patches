package junit.framework;

/* JADX INFO: loaded from: classes2.dex */
public class AssertionFailedError extends AssertionError {
    private static final long serialVersionUID = 1;

    public AssertionFailedError(String str) {
        super(defaultString(str));
    }

    private static String defaultString(String str) {
        return str == null ? "" : str;
    }

    public AssertionFailedError() {
    }
}
