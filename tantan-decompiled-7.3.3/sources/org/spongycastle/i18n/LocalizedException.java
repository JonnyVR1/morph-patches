package org.spongycastle.i18n;

import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public class LocalizedException extends Exception {
    private Throwable cause;
    protected ErrorBundle message;

    public LocalizedException(ErrorBundle errorBundle, Throwable th) {
        super(errorBundle.getText(Locale.getDefault()));
        this.message = errorBundle;
        this.cause = th;
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.cause;
    }

    public ErrorBundle getErrorMessage() {
        return this.message;
    }

    public LocalizedException(ErrorBundle errorBundle) {
        super(errorBundle.getText(Locale.getDefault()));
        this.message = errorBundle;
    }
}
