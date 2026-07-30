package com.xiaomi.push;

import java.io.PrintStream;
import java.io.PrintWriter;
import p149l.dtq0;

/* JADX INFO: renamed from: com.xiaomi.push.fi */
/* JADX INFO: loaded from: classes2.dex */
public class C14737fi extends Exception {

    /* JADX INFO: renamed from: a */
    private C14786k f61767a;

    /* JADX INFO: renamed from: a */
    private Throwable f61768a;

    /* JADX INFO: renamed from: a */
    private dtq0 f61769a;

    public C14737fi() {
        this.f61769a = null;
        this.f61767a = null;
        this.f61768a = null;
    }

    /* JADX INFO: renamed from: a */
    public Throwable m85574a() {
        return this.f61768a;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        dtq0 dtq0Var;
        C14786k c14786k;
        String message = super.getMessage();
        if (message != null || (c14786k = this.f61767a) == null) {
            return (message != null || (dtq0Var = this.f61769a) == null) ? message : dtq0Var.toString();
        }
        return c14786k.toString();
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintStream printStream) {
        super.printStackTrace(printStream);
        if (this.f61768a != null) {
            printStream.println("Nested Exception: ");
            this.f61768a.printStackTrace(printStream);
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
        C14786k c14786k = this.f61767a;
        if (c14786k != null) {
            sb.append(c14786k);
        }
        dtq0 dtq0Var = this.f61769a;
        if (dtq0Var != null) {
            sb.append(dtq0Var);
        }
        if (this.f61768a != null) {
            sb.append("\n  -- caused by: ");
            sb.append(this.f61768a);
        }
        return sb.toString();
    }

    public C14737fi(String str) {
        super(str);
        this.f61769a = null;
        this.f61767a = null;
        this.f61768a = null;
    }

    public C14737fi(Throwable th) {
        this.f61769a = null;
        this.f61767a = null;
        this.f61768a = th;
    }

    @Override // java.lang.Throwable
    public void printStackTrace() {
        printStackTrace(System.err);
    }

    public C14737fi(dtq0 dtq0Var) {
        this.f61767a = null;
        this.f61768a = null;
        this.f61769a = dtq0Var;
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintWriter printWriter) {
        super.printStackTrace(printWriter);
        if (this.f61768a != null) {
            printWriter.println("Nested Exception: ");
            this.f61768a.printStackTrace(printWriter);
        }
    }

    public C14737fi(String str, Throwable th) {
        super(str);
        this.f61769a = null;
        this.f61767a = null;
        this.f61768a = th;
    }
}
