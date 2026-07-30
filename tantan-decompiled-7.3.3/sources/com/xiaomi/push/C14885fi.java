package com.xiaomi.push;

import java.io.PrintStream;
import java.io.PrintWriter;
import p153l.j2r0;

/* JADX INFO: renamed from: com.xiaomi.push.fi */
/* JADX INFO: loaded from: classes2.dex */
public class C14885fi extends Exception {

    /* JADX INFO: renamed from: a */
    private C14934k f62614a;

    /* JADX INFO: renamed from: a */
    private Throwable f62615a;

    /* JADX INFO: renamed from: a */
    private j2r0 f62616a;

    public C14885fi() {
        this.f62616a = null;
        this.f62614a = null;
        this.f62615a = null;
    }

    /* JADX INFO: renamed from: a */
    public Throwable m86745a() {
        return this.f62615a;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        j2r0 j2r0Var;
        C14934k c14934k;
        String message = super.getMessage();
        if (message != null || (c14934k = this.f62614a) == null) {
            return (message != null || (j2r0Var = this.f62616a) == null) ? message : j2r0Var.toString();
        }
        return c14934k.toString();
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintStream printStream) {
        super.printStackTrace(printStream);
        if (this.f62615a != null) {
            printStream.println("Nested Exception: ");
            this.f62615a.printStackTrace(printStream);
        }
    }

    @Override // java.lang.Throwable
    public String toString() {
        StringBuilder sb = new StringBuilder();
        String message = super.getMessage();
        if (message != null) {
            sb.append(message);
            sb.append(": ");
        }
        C14934k c14934k = this.f62614a;
        if (c14934k != null) {
            sb.append(c14934k);
        }
        j2r0 j2r0Var = this.f62616a;
        if (j2r0Var != null) {
            sb.append(j2r0Var);
        }
        if (this.f62615a != null) {
            sb.append("\n  -- caused by: ");
            sb.append(this.f62615a);
        }
        return sb.toString();
    }

    public C14885fi(String str) {
        super(str);
        this.f62616a = null;
        this.f62614a = null;
        this.f62615a = null;
    }

    public C14885fi(Throwable th) {
        this.f62616a = null;
        this.f62614a = null;
        this.f62615a = th;
    }

    @Override // java.lang.Throwable
    public void printStackTrace() {
        printStackTrace(System.err);
    }

    public C14885fi(j2r0 j2r0Var) {
        this.f62614a = null;
        this.f62615a = null;
        this.f62616a = j2r0Var;
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintWriter printWriter) {
        super.printStackTrace(printWriter);
        if (this.f62615a != null) {
            printWriter.println("Nested Exception: ");
            this.f62615a.printStackTrace(printWriter);
        }
    }

    public C14885fi(String str, Throwable th) {
        super(str);
        this.f62616a = null;
        this.f62614a = null;
        this.f62615a = th;
    }
}
