package p137rx;

/* JADX INFO: loaded from: classes3.dex */
public final class Notification<T> {

    /* JADX INFO: renamed from: d */
    public static final Notification<Void> f208015d = new Notification<>(Kind.OnCompleted, null, null);

    /* JADX INFO: renamed from: a */
    public final Kind f208016a;

    /* JADX INFO: renamed from: b */
    public final Throwable f208017b;

    /* JADX INFO: renamed from: c */
    public final T f208018c;

    public enum Kind {
        OnNext,
        OnError,
        OnCompleted
    }

    public Notification(Kind kind, T t, Throwable th) {
        this.f208018c = t;
        this.f208017b = th;
        this.f208016a = kind;
    }

    /* JADX INFO: renamed from: a */
    public static <T> Notification<T> m222536a() {
        return (Notification<T>) f208015d;
    }

    /* JADX INFO: renamed from: b */
    public static <T> Notification<T> m222537b(Throwable th) {
        return new Notification<>(Kind.OnError, null, th);
    }

    /* JADX INFO: renamed from: c */
    public static <T> Notification<T> m222538c(T t) {
        return new Notification<>(Kind.OnNext, t, null);
    }

    /* JADX INFO: renamed from: d */
    public Kind m222539d() {
        return this.f208016a;
    }

    /* JADX INFO: renamed from: e */
    public Throwable m222540e() {
        return this.f208017b;
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
        if (notification.m222539d() != m222539d()) {
            return false;
        }
        T t = this.f208018c;
        T t2 = notification.f208018c;
        if (t != t2 && (t == null || !t.equals(t2))) {
            return false;
        }
        Throwable th = this.f208017b;
        Throwable th2 = notification.f208017b;
        return th == th2 || (th != null && th.equals(th2));
    }

    /* JADX INFO: renamed from: f */
    public T m222541f() {
        return this.f208018c;
    }

    /* JADX INFO: renamed from: g */
    public boolean m222542g() {
        return m222545j() && this.f208017b != null;
    }

    /* JADX INFO: renamed from: h */
    public boolean m222543h() {
        return m222546k() && this.f208018c != null;
    }

    public int hashCode() {
        int iHashCode = m222539d().hashCode();
        if (m222543h()) {
            iHashCode = (iHashCode * 31) + m222541f().hashCode();
        }
        return m222542g() ? (iHashCode * 31) + m222540e().hashCode() : iHashCode;
    }

    /* JADX INFO: renamed from: i */
    public boolean m222544i() {
        return m222539d() == Kind.OnCompleted;
    }

    /* JADX INFO: renamed from: j */
    public boolean m222545j() {
        return m222539d() == Kind.OnError;
    }

    /* JADX INFO: renamed from: k */
    public boolean m222546k() {
        return m222539d() == Kind.OnNext;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(64);
        sb.append('[');
        sb.append(super.toString());
        sb.append(' ');
        sb.append(m222539d());
        if (m222543h()) {
            sb.append(' ');
            sb.append(m222541f());
        }
        if (m222542g()) {
            sb.append(' ');
            sb.append(m222540e().getMessage());
        }
        sb.append(']');
        return sb.toString();
    }
}
