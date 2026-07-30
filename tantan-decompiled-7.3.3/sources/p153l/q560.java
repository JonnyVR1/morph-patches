package p153l;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes.dex */
public final class q560<T> {

    /* JADX INFO: renamed from: e */
    private static final InterfaceC19524b<Object> f155664e = new C19523a();

    /* JADX INFO: renamed from: a */
    private final T f155665a;

    /* JADX INFO: renamed from: b */
    private final InterfaceC19524b<T> f155666b;

    /* JADX INFO: renamed from: c */
    private final String f155667c;

    /* JADX INFO: renamed from: d */
    private volatile byte[] f155668d;

    /* JADX INFO: renamed from: l.q560$b */
    public interface InterfaceC19524b<T> {
        /* JADX INFO: renamed from: a */
        void mo5555a(@NonNull byte[] bArr, @NonNull T t, @NonNull MessageDigest messageDigest);
    }

    private q560(@NonNull String str, @Nullable T t, @NonNull InterfaceC19524b<T> interfaceC19524b) {
        this.f155667c = vn80.m201942b(str);
        this.f155665a = t;
        this.f155666b = (InterfaceC19524b) vn80.m201944d(interfaceC19524b);
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    public static <T> q560<T> m175293a(@NonNull String str, @Nullable T t, @NonNull InterfaceC19524b<T> interfaceC19524b) {
        return new q560<>(str, t, interfaceC19524b);
    }

    @NonNull
    /* JADX INFO: renamed from: b */
    private static <T> InterfaceC19524b<T> m175294b() {
        return (InterfaceC19524b<T>) f155664e;
    }

    @NonNull
    /* JADX INFO: renamed from: d */
    private byte[] m175295d() {
        if (this.f155668d == null) {
            this.f155668d = this.f155667c.getBytes(kzq.f129442a);
        }
        return this.f155668d;
    }

    @NonNull
    /* JADX INFO: renamed from: e */
    public static <T> q560<T> m175296e(@NonNull String str) {
        return new q560<>(str, null, m175294b());
    }

    @NonNull
    /* JADX INFO: renamed from: f */
    public static <T> q560<T> m175297f(@NonNull String str, @NonNull T t) {
        return new q560<>(str, t, m175294b());
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public T m175298c() {
        return this.f155665a;
    }

    public boolean equals(Object obj) {
        if (obj instanceof q560) {
            return this.f155667c.equals(((q560) obj).f155667c);
        }
        return false;
    }

    /* JADX INFO: renamed from: g */
    public void m175299g(@NonNull T t, @NonNull MessageDigest messageDigest) {
        this.f155666b.mo5555a(m175295d(), t, messageDigest);
    }

    public int hashCode() {
        return this.f155667c.hashCode();
    }

    public String toString() {
        return "Option{key='" + this.f155667c + "'}";
    }

    /* JADX INFO: renamed from: l.q560$a */
    public class C19523a implements InterfaceC19524b<Object> {
        @Override // p153l.q560.InterfaceC19524b
        /* JADX INFO: renamed from: a */
        public void mo5555a(@NonNull byte[] bArr, @NonNull Object obj, @NonNull MessageDigest messageDigest) {
        }
    }
}
