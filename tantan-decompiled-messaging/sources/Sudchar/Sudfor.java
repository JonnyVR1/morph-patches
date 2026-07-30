package Sudchar;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class Sudfor extends IOException {

    /* JADX INFO: renamed from: Suddo, reason: collision with root package name */
    public static final Sudfor f210105Suddo = new Sudfor();

    public Sudfor() {
        super("Interrupted");
    }

    @Override // java.lang.Throwable
    public final void printStackTrace() {
        throw new IllegalAccessError("Stack is ignored for signal");
    }
}
