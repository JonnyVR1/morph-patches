package p137rx.internal.operators;

import java.io.Serializable;
import p153l.bb50;
import p153l.wg3;

/* JADX INFO: loaded from: classes3.dex */
public final class NotificationLite<T> {
    private static final NotificationLite INSTANCE = new NotificationLite();

    /* JADX INFO: renamed from: a */
    public static final Object f208061a = new Serializable() { // from class: rx.internal.operators.NotificationLite.1
        private static final long serialVersionUID = 1;

        public String toString() {
            return "Notification=>Completed";
        }
    };

    /* JADX INFO: renamed from: b */
    public static final Object f208062b = new Serializable() { // from class: rx.internal.operators.NotificationLite.2
        private static final long serialVersionUID = 2;

        public String toString() {
            return "Notification=>NULL";
        }
    };

    public static final class OnErrorSentinel implements Serializable {
        private static final long serialVersionUID = 3;

        /* JADX INFO: renamed from: e */
        final Throwable f208063e;

        public OnErrorSentinel(Throwable th) {
            this.f208063e = th;
        }

        public String toString() {
            return "Notification=>Error:" + this.f208063e;
        }
    }

    /* JADX INFO: renamed from: f */
    public static <T> NotificationLite<T> m222581f() {
        return INSTANCE;
    }

    /* JADX INFO: renamed from: a */
    public boolean m222582a(bb50<? super T> bb50Var, Object obj) {
        if (obj == f208061a) {
            bb50Var.onCompleted();
            return true;
        }
        if (obj == f208062b) {
            bb50Var.onNext(null);
            return false;
        }
        if (obj == null) {
            wg3.m206174a("The lite notification can not be null");
            return false;
        }
        if (obj.getClass() == OnErrorSentinel.class) {
            bb50Var.onError(((OnErrorSentinel) obj).f208063e);
            return true;
        }
        bb50Var.onNext(obj);
        return false;
    }

    /* JADX INFO: renamed from: b */
    public Object m222583b() {
        return f208061a;
    }

    /* JADX INFO: renamed from: c */
    public Object m222584c(Throwable th) {
        return new OnErrorSentinel(th);
    }

    /* JADX INFO: renamed from: d */
    public Throwable m222585d(Object obj) {
        return ((OnErrorSentinel) obj).f208063e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: e */
    public T m222586e(Object obj) {
        if (obj == f208062b) {
            return null;
        }
        return obj;
    }

    /* JADX INFO: renamed from: g */
    public boolean m222587g(Object obj) {
        return obj == f208061a;
    }

    /* JADX INFO: renamed from: h */
    public boolean m222588h(Object obj) {
        return obj instanceof OnErrorSentinel;
    }

    /* JADX INFO: renamed from: i */
    public boolean m222589i(Object obj) {
        return (obj == null || m222588h(obj) || m222587g(obj)) ? false : true;
    }

    /* JADX INFO: renamed from: j */
    public Object m222590j(T t) {
        return t == null ? f208062b : t;
    }
}
