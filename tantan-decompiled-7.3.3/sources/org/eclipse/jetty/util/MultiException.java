package org.eclipse.jetty.util;

import com.tencent.youtu.sdkkitframework.common.WeJson;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.List;
import p153l.iig0;

/* JADX INFO: loaded from: classes2.dex */
public class MultiException extends Exception {
    private Object nested;

    public MultiException() {
        super("Multiple exceptions");
    }

    public void add(Throwable th) {
        if (!(th instanceof MultiException)) {
            this.nested = LazyList.add(this.nested, th);
            return;
        }
        MultiException multiException = (MultiException) th;
        for (int i = 0; i < LazyList.size(multiException.nested); i++) {
            this.nested = LazyList.add(this.nested, LazyList.get(multiException.nested, i));
        }
    }

    public Throwable getThrowable(int i) {
        return (Throwable) LazyList.get(this.nested, i);
    }

    public List<Throwable> getThrowables() {
        return LazyList.getList(this.nested);
    }

    public void ifExceptionThrow() throws Exception {
        int size = LazyList.size(this.nested);
        if (size != 0) {
            if (size != 1) {
                throw this;
            }
            Throwable th = (Throwable) LazyList.get(this.nested, 0);
            if (th instanceof Error) {
                throw ((Error) th);
            }
            if (!(th instanceof Exception)) {
                throw this;
            }
            throw ((Exception) th);
        }
    }

    public void ifExceptionThrowMulti() throws MultiException {
        if (LazyList.size(this.nested) > 0) {
            throw this;
        }
    }

    public void ifExceptionThrowRuntime() throws Error {
        int size = LazyList.size(this.nested);
        if (size != 0) {
            if (size != 1) {
                iig0.m140070a(this);
                return;
            }
            Throwable th = (Throwable) LazyList.get(this.nested, 0);
            if (th instanceof Error) {
                throw ((Error) th);
            }
            if (th instanceof RuntimeException) {
                throw ((RuntimeException) th);
            }
            iig0.m140070a(th);
        }
    }

    @Override // java.lang.Throwable
    public void printStackTrace() {
        super.printStackTrace();
        for (int i = 0; i < LazyList.size(this.nested); i++) {
            ((Throwable) LazyList.get(this.nested, i)).printStackTrace();
        }
    }

    public int size() {
        return LazyList.size(this.nested);
    }

    @Override // java.lang.Throwable
    public String toString() {
        if (LazyList.size(this.nested) <= 0) {
            return MultiException.class.getSimpleName().concat(WeJson.EMPTY_ARR);
        }
        return MultiException.class.getSimpleName() + LazyList.getList(this.nested);
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintStream printStream) {
        super.printStackTrace(printStream);
        for (int i = 0; i < LazyList.size(this.nested); i++) {
            ((Throwable) LazyList.get(this.nested, i)).printStackTrace(printStream);
        }
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintWriter printWriter) {
        super.printStackTrace(printWriter);
        for (int i = 0; i < LazyList.size(this.nested); i++) {
            ((Throwable) LazyList.get(this.nested, i)).printStackTrace(printWriter);
        }
    }
}
