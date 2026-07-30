package p014rx.exceptions;

import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public final class CompositeException extends RuntimeException {
    private static final long serialVersionUID = 3026362227162912146L;
    private Throwable cause;
    private final List<Throwable> exceptions;
    private final String message;

    public static final class CompositeExceptionCausalChain extends RuntimeException {
        static final String MESSAGE = "Chain of Causes for CompositeException In Order Received =>";
        private static final long serialVersionUID = 3875212506787802066L;

        @Override // java.lang.Throwable
        public String getMessage() {
            return MESSAGE;
        }
    }

    /* JADX INFO: renamed from: rx.exceptions.CompositeException$a */
    public static abstract class AbstractC1101a {
        /* JADX INFO: renamed from: a */
        public abstract Object mo9780a();

        /* JADX INFO: renamed from: b */
        public abstract void mo9781b(Object obj);
    }

    /* JADX INFO: renamed from: rx.exceptions.CompositeException$b */
    public static final class C1102b extends AbstractC1101a {

        /* JADX INFO: renamed from: a */
        public final PrintStream f10745a;

        public C1102b(PrintStream printStream) {
            this.f10745a = printStream;
        }

        @Override // p014rx.exceptions.CompositeException.AbstractC1101a
        /* JADX INFO: renamed from: a */
        public Object mo9780a() {
            return this.f10745a;
        }

        @Override // p014rx.exceptions.CompositeException.AbstractC1101a
        /* JADX INFO: renamed from: b */
        public void mo9781b(Object obj) {
            this.f10745a.println(obj);
        }
    }

    /* JADX INFO: renamed from: rx.exceptions.CompositeException$c */
    public static final class C1103c extends AbstractC1101a {

        /* JADX INFO: renamed from: a */
        public final PrintWriter f10746a;

        public C1103c(PrintWriter printWriter) {
            this.f10746a = printWriter;
        }

        @Override // p014rx.exceptions.CompositeException.AbstractC1101a
        /* JADX INFO: renamed from: a */
        public Object mo9780a() {
            return this.f10746a;
        }

        @Override // p014rx.exceptions.CompositeException.AbstractC1101a
        /* JADX INFO: renamed from: b */
        public void mo9781b(Object obj) {
            this.f10746a.println(obj);
        }
    }

    @Deprecated
    public CompositeException(String str, Collection<? extends Throwable> collection) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        ArrayList arrayList = new ArrayList();
        if (collection != null) {
            for (Throwable th : collection) {
                if (th instanceof CompositeException) {
                    linkedHashSet.addAll(((CompositeException) th).getExceptions());
                } else if (th != null) {
                    linkedHashSet.add(th);
                } else {
                    linkedHashSet.add(new NullPointerException());
                }
            }
        } else {
            linkedHashSet.add(new NullPointerException());
        }
        arrayList.addAll(linkedHashSet);
        List<Throwable> listUnmodifiableList = Collections.unmodifiableList(arrayList);
        this.exceptions = listUnmodifiableList;
        this.message = listUnmodifiableList.size() + " exceptions occurred. ";
    }

    private void appendStackTrace(StringBuilder sb, Throwable th, String str) {
        sb.append(str);
        sb.append(th);
        sb.append('\n');
        for (StackTraceElement stackTraceElement : th.getStackTrace()) {
            sb.append("\t\tat ");
            sb.append(stackTraceElement);
            sb.append('\n');
        }
        if (th.getCause() != null) {
            sb.append("\tCaused by: ");
            appendStackTrace(sb, th.getCause(), "");
        }
    }

    private List<Throwable> getListOfCauses(Throwable th) {
        ArrayList arrayList = new ArrayList();
        Throwable cause = th.getCause();
        if (cause != null && cause != th) {
            while (true) {
                arrayList.add(cause);
                Throwable cause2 = cause.getCause();
                if (cause2 == null || cause2 == cause) {
                    break;
                }
                cause = cause.getCause();
            }
        }
        return arrayList;
    }

    private Throwable getRootCause(Throwable th) {
        Throwable cause = th.getCause();
        if (cause == null || cause == th) {
            return th;
        }
        while (true) {
            Throwable cause2 = cause.getCause();
            if (cause2 == null || cause2 == cause) {
                break;
            }
            cause = cause.getCause();
        }
        return cause;
    }

    private void printStackTrace(AbstractC1101a abstractC1101a) {
        StringBuilder sb = new StringBuilder(128);
        sb.append(this);
        sb.append('\n');
        for (StackTraceElement stackTraceElement : getStackTrace()) {
            sb.append("\tat ");
            sb.append(stackTraceElement);
            sb.append('\n');
        }
        int i = 1;
        for (Throwable th : this.exceptions) {
            sb.append("  ComposedException ");
            sb.append(i);
            sb.append(" :\n");
            appendStackTrace(sb, th, "\t");
            i++;
        }
        synchronized (abstractC1101a.mo9780a()) {
            abstractC1101a.mo9781b(sb.toString());
        }
    }

    @Override // java.lang.Throwable
    public synchronized Throwable getCause() {
        try {
            if (this.cause == null) {
                CompositeExceptionCausalChain compositeExceptionCausalChain = new CompositeExceptionCausalChain();
                HashSet hashSet = new HashSet();
                Iterator<Throwable> it = this.exceptions.iterator();
                Throwable rootCause = compositeExceptionCausalChain;
                while (it.hasNext()) {
                    Throwable next = it.next();
                    if (!hashSet.contains(next)) {
                        hashSet.add(next);
                        for (Throwable th : getListOfCauses(next)) {
                            if (hashSet.contains(th)) {
                                next = new RuntimeException("Duplicate found in causal chain so cropping to prevent loop ...");
                            } else {
                                hashSet.add(th);
                            }
                        }
                        try {
                            rootCause.initCause(next);
                        } catch (Throwable unused) {
                        }
                        rootCause = getRootCause(rootCause);
                    }
                }
                this.cause = compositeExceptionCausalChain;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.cause;
    }

    public List<Throwable> getExceptions() {
        return this.exceptions;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.message;
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintStream printStream) {
        printStackTrace(new C1102b(printStream));
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintWriter printWriter) {
        printStackTrace(new C1103c(printWriter));
    }

    @Override // java.lang.Throwable
    public void printStackTrace() {
        printStackTrace(System.err);
    }

    public CompositeException(Collection<? extends Throwable> collection) {
        this(null, collection);
    }

    public CompositeException(Throwable... thArr) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        ArrayList arrayList = new ArrayList();
        if (thArr != null) {
            for (Throwable th : thArr) {
                if (th instanceof CompositeException) {
                    linkedHashSet.addAll(((CompositeException) th).getExceptions());
                } else if (th != null) {
                    linkedHashSet.add(th);
                } else {
                    linkedHashSet.add(new NullPointerException());
                }
            }
        } else {
            linkedHashSet.add(new NullPointerException());
        }
        arrayList.addAll(linkedHashSet);
        List<Throwable> listUnmodifiableList = Collections.unmodifiableList(arrayList);
        this.exceptions = listUnmodifiableList;
        this.message = listUnmodifiableList.size() + " exceptions occurred. ";
    }
}
