package p014rx;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public final class Notification<T> {

    /* JADX INFO: renamed from: d */
    public static final Notification<Void> f10718d = new Notification<>(Kind.OnCompleted, null, null);

    /* JADX INFO: renamed from: a */
    public final Kind f10719a;

    /* JADX INFO: renamed from: b */
    public final Throwable f10720b;

    /* JADX INFO: renamed from: c */
    public final T f10721c;

    public enum Kind {
        OnNext,
        OnError,
        OnCompleted
    }

    public Notification(Kind kind, T t, Throwable th) {
        this.f10721c = t;
        this.f10720b = th;
        this.f10719a = kind;
    }

    /* JADX INFO: renamed from: a */
    public static <T> Notification<T> m9747a() {
        return (Notification<T>) f10718d;
    }

    /* JADX INFO: renamed from: b */
    public static <T> Notification<T> m9748b(Throwable th) {
        return new Notification<>(Kind.OnError, null, th);
    }

    /* JADX INFO: renamed from: c */
    public static <T> Notification<T> m9749c(T t) {
        return new Notification<>(Kind.OnNext, t, null);
    }

    /* JADX INFO: renamed from: d */
    public Kind m9750d() {
        return this.f10719a;
    }

    /* JADX INFO: renamed from: e */
    public Throwable m9751e() {
        return this.f10720b;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj.getClass() != Notification.class) {
            return false;
        }
        Notification notification = (Notification) obj;
        if (notification.m9750d() != m9750d()) {
            return false;
        }
        T t = this.f10721c;
        T t2 = notification.f10721c;
        if (t != t2 && (t == null || !t.equals(t2))) {
            return false;
        }
        Throwable th = this.f10720b;
        Throwable th2 = notification.f10720b;
        return th == th2 || (th != null && th.equals(th2));
    }

    /* JADX INFO: renamed from: f */
    public T m9752f() {
        return this.f10721c;
    }

    /* JADX INFO: renamed from: g */
    public boolean m9753g() {
        return m9756j() && this.f10720b != null;
    }

    /* JADX INFO: renamed from: h */
    public boolean m9754h() {
        return m9757k() && this.f10721c != null;
    }

    public int hashCode() {
        int iHashCode = m9750d().hashCode();
        if (m9754h()) {
            iHashCode = (iHashCode * 31) + m9752f().hashCode();
        }
        return m9753g() ? (iHashCode * 31) + m9751e().hashCode() : iHashCode;
    }

    /* JADX INFO: renamed from: i */
    public boolean m9755i() {
        return m9750d() == Kind.OnCompleted;
    }

    /* JADX INFO: renamed from: j */
    public boolean m9756j() {
        return m9750d() == Kind.OnError;
    }

    /* JADX INFO: renamed from: k */
    public boolean m9757k() {
        return m9750d() == Kind.OnNext;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(64);
        sb.append('[');
        sb.append(super.toString());
        sb.append(' ');
        sb.append(m9750d());
        if (m9754h()) {
            sb.append(' ');
            sb.append(m9752f());
        }
        if (m9753g()) {
            sb.append(' ');
            sb.append(m9751e().getMessage());
        }
        sb.append(']');
        return sb.toString();
    }
}
