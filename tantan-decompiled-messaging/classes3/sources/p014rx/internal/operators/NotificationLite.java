package p014rx.internal.operators;

import java.io.Serializable;
import l.ig3;
import p003l.m250;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public final class NotificationLite<T> {
    private static final NotificationLite INSTANCE = new NotificationLite();

    /* JADX INFO: renamed from: a */
    public static final Object f10764a = new Serializable() { // from class: rx.internal.operators.NotificationLite.1
        private static final long serialVersionUID = 1;

        public String toString() {
            return "Notification=>Completed";
        }
    };

    /* JADX INFO: renamed from: b */
    public static final Object f10765b = new Serializable() { // from class: rx.internal.operators.NotificationLite.2
        private static final long serialVersionUID = 2;

        public String toString() {
            return "Notification=>NULL";
        }
    };

    public static final class OnErrorSentinel implements Serializable {
        private static final long serialVersionUID = 3;

        /* JADX INFO: renamed from: e */
        final Throwable f10766e;

        public OnErrorSentinel(Throwable th) {
            this.f10766e = th;
        }

        public String toString() {
            return "Notification=>Error:" + this.f10766e;
        }
    }

    /* JADX INFO: renamed from: f */
    public static <T> NotificationLite<T> m9792f() {
        return INSTANCE;
    }

    /* JADX INFO: renamed from: a */
    public boolean m9793a(m250<? super T> m250Var, Object obj) {
        if (obj == f10764a) {
            m250Var.onCompleted();
            return true;
        }
        if (obj == f10765b) {
            m250Var.onNext(null);
            return false;
        }
        if (obj == null) {
            ig3.a("The lite notification can not be null");
            return false;
        }
        if (obj.getClass() == OnErrorSentinel.class) {
            m250Var.onError(((OnErrorSentinel) obj).f10766e);
            return true;
        }
        m250Var.onNext(obj);
        return false;
    }

    /* JADX INFO: renamed from: b */
    public Object m9794b() {
        return f10764a;
    }

    /* JADX INFO: renamed from: c */
    public Object m9795c(Throwable th) {
        return new OnErrorSentinel(th);
    }

    /* JADX INFO: renamed from: d */
    public Throwable m9796d(Object obj) {
        return ((OnErrorSentinel) obj).f10766e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: e */
    public T m9797e(Object obj) {
        if (obj == f10765b) {
            return null;
        }
        return obj;
    }

    /* JADX INFO: renamed from: g */
    public boolean m9798g(Object obj) {
        return obj == f10764a;
    }

    /* JADX INFO: renamed from: h */
    public boolean m9799h(Object obj) {
        return obj instanceof OnErrorSentinel;
    }

    /* JADX INFO: renamed from: i */
    public boolean m9800i(Object obj) {
        return (obj == null || m9799h(obj) || m9798g(obj)) ? false : true;
    }

    /* JADX INFO: renamed from: j */
    public Object m9801j(T t) {
        return t == null ? f10765b : t;
    }
}
