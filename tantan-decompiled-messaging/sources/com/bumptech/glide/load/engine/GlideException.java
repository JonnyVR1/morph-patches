package com.bumptech.glide.load.engine;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.load.DataSource;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p149l.aag0;
import p149l.kxq;

/* JADX INFO: loaded from: classes.dex */
public final class GlideException extends Exception {
    private static final StackTraceElement[] EMPTY_ELEMENTS = new StackTraceElement[0];
    private static final long serialVersionUID = 1;
    private final List<Throwable> causes;
    private Class<?> dataClass;
    private DataSource dataSource;
    private String detailMessage;

    @Nullable
    private Exception exception;
    private kxq key;

    public GlideException(String str, List<Throwable> list) {
        this.detailMessage = str;
        setStackTrace(EMPTY_ELEMENTS);
        this.causes = list;
    }

    private void addRootCauses(Throwable th, List<Throwable> list) {
        if (!(th instanceof GlideException)) {
            list.add(th);
            return;
        }
        Iterator<Throwable> it = ((GlideException) th).getCauses().iterator();
        while (it.hasNext()) {
            addRootCauses(it.next(), list);
        }
    }

    private static void appendCauses(List<Throwable> list, Appendable appendable) {
        try {
            appendCausesWrapped(list, appendable);
        } catch (IOException e) {
            aag0.m95543a(e);
        }
    }

    private static void appendCausesWrapped(List<Throwable> list, Appendable appendable) throws IOException {
        int size = list.size();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            appendable.append("Cause (").append(String.valueOf(i2)).append(" of ").append(String.valueOf(size)).append("): ");
            Throwable th = list.get(i);
            if (th instanceof GlideException) {
                ((GlideException) th).printStackTrace(appendable);
            } else {
                appendExceptionMessage(th, appendable);
            }
            i = i2;
        }
    }

    private static void appendExceptionMessage(Throwable th, Appendable appendable) {
        try {
            appendable.append(th.getClass().toString()).append(": ").append(th.getMessage()).append('\n');
        } catch (IOException unused) {
            aag0.m95543a(th);
        }
    }

    private void printStackTrace(Appendable appendable) {
        appendExceptionMessage(this, appendable);
        appendCauses(getCauses(), new C1063a(appendable));
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        return this;
    }

    public List<Throwable> getCauses() {
        return this.causes;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        StringBuilder sb = new StringBuilder(71);
        sb.append(this.detailMessage);
        sb.append(this.dataClass != null ? ", " + this.dataClass : "");
        sb.append(this.dataSource != null ? ", " + this.dataSource : "");
        sb.append(this.key != null ? ", " + this.key : "");
        List<Throwable> rootCauses = getRootCauses();
        if (rootCauses.isEmpty()) {
            return sb.toString();
        }
        if (rootCauses.size() == 1) {
            sb.append("\nThere was 1 cause:");
        } else {
            sb.append("\nThere were ");
            sb.append(rootCauses.size());
            sb.append(" causes:");
        }
        for (Throwable th : rootCauses) {
            sb.append('\n');
            sb.append(th.getClass().getName());
            sb.append('(');
            sb.append(th.getMessage());
            sb.append(')');
        }
        sb.append("\n call GlideException#logRootCauses(String) for more detail");
        return sb.toString();
    }

    @Nullable
    public Exception getOrigin() {
        return this.exception;
    }

    public List<Throwable> getRootCauses() {
        ArrayList arrayList = new ArrayList();
        addRootCauses(this, arrayList);
        return arrayList;
    }

    public void logRootCauses(String str) {
        List<Throwable> rootCauses = getRootCauses();
        int size = rootCauses.size();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            rootCauses.get(i);
            i = i2;
        }
    }

    public void setLoggingDetails(kxq kxqVar, DataSource dataSource, Class<?> cls) {
        this.key = kxqVar;
        this.dataSource = dataSource;
        this.dataClass = cls;
    }

    public void setOrigin(@Nullable Exception exc) {
        this.exception = exc;
    }

    public void setLoggingDetails(kxq kxqVar, DataSource dataSource) {
        setLoggingDetails(kxqVar, dataSource, null);
    }

    public GlideException(String str, Throwable th) {
        this(str, (List<Throwable>) Collections.singletonList(th));
    }

    public GlideException(String str) {
        this(str, (List<Throwable>) Collections.EMPTY_LIST);
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintStream printStream) {
        printStackTrace((Appendable) printStream);
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintWriter printWriter) {
        printStackTrace((Appendable) printWriter);
    }

    @Override // java.lang.Throwable
    public void printStackTrace() {
        printStackTrace(System.err);
    }

    /* JADX INFO: renamed from: com.bumptech.glide.load.engine.GlideException$a */
    public static final class C1063a implements Appendable {

        /* JADX INFO: renamed from: a */
        private final Appendable f4418a;

        /* JADX INFO: renamed from: b */
        private boolean f4419b = true;

        public C1063a(Appendable appendable) {
            this.f4418a = appendable;
        }

        @NonNull
        /* JADX INFO: renamed from: a */
        private CharSequence m5397a(@Nullable CharSequence charSequence) {
            return charSequence == null ? "" : charSequence;
        }

        @Override // java.lang.Appendable
        public Appendable append(@Nullable CharSequence charSequence, int i, int i2) throws IOException {
            CharSequence charSequenceM5397a = m5397a(charSequence);
            boolean z = false;
            if (this.f4419b) {
                this.f4419b = false;
                this.f4418a.append("  ");
            }
            if (charSequenceM5397a.length() > 0 && charSequenceM5397a.charAt(i2 - 1) == '\n') {
                z = true;
            }
            this.f4419b = z;
            this.f4418a.append(charSequenceM5397a, i, i2);
            return this;
        }

        @Override // java.lang.Appendable
        public Appendable append(@Nullable CharSequence charSequence) throws IOException {
            CharSequence charSequenceM5397a = m5397a(charSequence);
            return append(charSequenceM5397a, 0, charSequenceM5397a.length());
        }

        @Override // java.lang.Appendable
        public Appendable append(char c) throws IOException {
            if (this.f4419b) {
                this.f4419b = false;
                this.f4418a.append("  ");
            }
            this.f4419b = c == '\n';
            this.f4418a.append(c);
            return this;
        }
    }
}
