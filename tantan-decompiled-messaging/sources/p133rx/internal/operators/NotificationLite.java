package p133rx.internal.operators;

import java.io.Serializable;
import p149l.ig3;
import p149l.m250;

/* JADX INFO: loaded from: classes3.dex */
public final class NotificationLite<T> {
    private static final NotificationLite INSTANCE = new NotificationLite();

    /* JADX INFO: renamed from: a */
    public static final Object f207139a = new Serializable() { // from class: rx.internal.operators.NotificationLite.1
        private static final long serialVersionUID = 1;

        public String toString() {
            return "Notification=>Completed";
        }
    };

    /* JADX INFO: renamed from: b */
    public static final Object f207140b = new Serializable() { // from class: rx.internal.operators.NotificationLite.2
        private static final long serialVersionUID = 2;

        public String toString() {
            return "Notification=>NULL";
        }
    };

    public static final class OnErrorSentinel implements Serializable {
        private static final long serialVersionUID = 3;

        /* JADX INFO: renamed from: e */
        final Throwable f207141e;

        public OnErrorSentinel(Throwable th) {
            this.f207141e = th;
        }

        public String toString() {
            return "Notification=>Error:" + this.f207141e;
        }
    }

    /* JADX INFO: renamed from: f */
    public static <T> NotificationLite<T> m221335f() {
        return INSTANCE;
    }

    /* JADX INFO: renamed from: a */
    public boolean m221336a(m250<? super T> m250Var, Object obj) {
        if (obj == f207139a) {
            m250Var.onCompleted();
            return true;
        }
        if (obj == f207140b) {
            m250Var.onNext(null);
            return false;
        }
        if (obj == null) {
            ig3.m135964a("The lite notification can not be null");
            return false;
        }
        if (obj.getClass() == OnErrorSentinel.class) {
            m250Var.onError(((OnErrorSentinel) obj).f207141e);
            return true;
        }
        m250Var.onNext(obj);
        return false;
    }

    /* JADX INFO: renamed from: b */
    public Object m221337b() {
        return f207139a;
    }

    /* JADX INFO: renamed from: c */
    public Object m221338c(Throwable th) {
        return new OnErrorSentinel(th);
    }

    /* JADX INFO: renamed from: d */
    public Throwable m221339d(Object obj) {
        return ((OnErrorSentinel) obj).f207141e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: e */
    public T m221340e(Object obj) {
        if (obj == f207140b) {
            return null;
        }
        return obj;
    }

    /* JADX INFO: renamed from: g */
    public boolean m221341g(Object obj) {
        return obj == f207139a;
    }

    /* JADX INFO: renamed from: h */
    public boolean m221342h(Object obj) {
        return obj instanceof OnErrorSentinel;
    }

    /* JADX INFO: renamed from: i */
    public boolean m221343i(Object obj) {
        return (obj == null || m221342h(obj) || m221341g(obj)) ? false : true;
    }

    /* JADX INFO: renamed from: j */
    public Object m221344j(T t) {
        return t == null ? f207140b : t;
    }
}
