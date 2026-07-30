package p133rx;

/* JADX INFO: loaded from: classes3.dex */
public final class Notification<T> {

    /* JADX INFO: renamed from: d */
    public static final Notification<Void> f207093d = new Notification<>(Kind.OnCompleted, null, null);

    /* JADX INFO: renamed from: a */
    public final Kind f207094a;

    /* JADX INFO: renamed from: b */
    public final Throwable f207095b;

    /* JADX INFO: renamed from: c */
    public final T f207096c;

    public enum Kind {
        OnNext,
        OnError,
        OnCompleted
    }

    public Notification(Kind kind, T t, Throwable th) {
        this.f207096c = t;
        this.f207095b = th;
        this.f207094a = kind;
    }

    /* JADX INFO: renamed from: a */
    public static <T> Notification<T> m221290a() {
        return (Notification<T>) f207093d;
    }

    /* JADX INFO: renamed from: b */
    public static <T> Notification<T> m221291b(Throwable th) {
        return new Notification<>(Kind.OnError, null, th);
    }

    /* JADX INFO: renamed from: c */
    public static <T> Notification<T> m221292c(T t) {
        return new Notification<>(Kind.OnNext, t, null);
    }

    /* JADX INFO: renamed from: d */
    public Kind m221293d() {
        return this.f207094a;
    }

    /* JADX INFO: renamed from: e */
    public Throwable m221294e() {
        return this.f207095b;
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
        if (notification.m221293d() != m221293d()) {
            return false;
        }
        T t = this.f207096c;
        T t2 = notification.f207096c;
        if (t != t2 && (t == null || !t.equals(t2))) {
            return false;
        }
        Throwable th = this.f207095b;
        Throwable th2 = notification.f207095b;
        return th == th2 || (th != null && th.equals(th2));
    }

    /* JADX INFO: renamed from: f */
    public T m221295f() {
        return this.f207096c;
    }

    /* JADX INFO: renamed from: g */
    public boolean m221296g() {
        return m221299j() && this.f207095b != null;
    }

    /* JADX INFO: renamed from: h */
    public boolean m221297h() {
        return m221300k() && this.f207096c != null;
    }

    public int hashCode() {
        int iHashCode = m221293d().hashCode();
        if (m221297h()) {
            iHashCode = (iHashCode * 31) + m221295f().hashCode();
        }
        return m221296g() ? (iHashCode * 31) + m221294e().hashCode() : iHashCode;
    }

    /* JADX INFO: renamed from: i */
    public boolean m221298i() {
        return m221293d() == Kind.OnCompleted;
    }

    /* JADX INFO: renamed from: j */
    public boolean m221299j() {
        return m221293d() == Kind.OnError;
    }

    /* JADX INFO: renamed from: k */
    public boolean m221300k() {
        return m221293d() == Kind.OnNext;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(64);
        sb.append('[');
        sb.append(super.toString());
        sb.append(' ');
        sb.append(m221293d());
        if (m221297h()) {
            sb.append(' ');
            sb.append(m221295f());
        }
        if (m221296g()) {
            sb.append(' ');
            sb.append(m221294e().getMessage());
        }
        sb.append(']');
        return sb.toString();
    }
}
