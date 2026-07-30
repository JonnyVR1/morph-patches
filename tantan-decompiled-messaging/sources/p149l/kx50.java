package p149l;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes.dex */
public final class kx50<T> {

    /* JADX INFO: renamed from: e */
    private static final InterfaceC18107b<Object> f125060e = new C18106a();

    /* JADX INFO: renamed from: a */
    private final T f125061a;

    /* JADX INFO: renamed from: b */
    private final InterfaceC18107b<T> f125062b;

    /* JADX INFO: renamed from: c */
    private final String f125063c;

    /* JADX INFO: renamed from: d */
    private volatile byte[] f125064d;

    /* JADX INFO: renamed from: l.kx50$b */
    public interface InterfaceC18107b<T> {
        /* JADX INFO: renamed from: a */
        void mo147681a(@NonNull byte[] bArr, @NonNull T t, @NonNull MessageDigest messageDigest);
    }

    private kx50(@NonNull String str, @Nullable T t, @NonNull InterfaceC18107b<T> interfaceC18107b) {
        this.f125063c = qf80.m174274b(str);
        this.f125061a = t;
        this.f125062b = (InterfaceC18107b) qf80.m174276d(interfaceC18107b);
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    public static <T> kx50<T> m147674a(@NonNull String str, @Nullable T t, @NonNull InterfaceC18107b<T> interfaceC18107b) {
        return new kx50<>(str, t, interfaceC18107b);
    }

    @NonNull
    /* JADX INFO: renamed from: b */
    private static <T> InterfaceC18107b<T> m147675b() {
        return (InterfaceC18107b<T>) f125060e;
    }

    @NonNull
    /* JADX INFO: renamed from: d */
    private byte[] m147676d() {
        if (this.f125064d == null) {
            this.f125064d = this.f125063c.getBytes(kxq.f125153a);
        }
        return this.f125064d;
    }

    @NonNull
    /* JADX INFO: renamed from: e */
    public static <T> kx50<T> m147677e(@NonNull String str) {
        return new kx50<>(str, null, m147675b());
    }

    @NonNull
    /* JADX INFO: renamed from: f */
    public static <T> kx50<T> m147678f(@NonNull String str, @NonNull T t) {
        return new kx50<>(str, t, m147675b());
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public T m147679c() {
        return this.f125061a;
    }

    public boolean equals(Object obj) {
        if (obj instanceof kx50) {
            return this.f125063c.equals(((kx50) obj).f125063c);
        }
        return false;
    }

    /* JADX INFO: renamed from: g */
    public void m147680g(@NonNull T t, @NonNull MessageDigest messageDigest) {
        this.f125062b.mo147681a(m147676d(), t, messageDigest);
    }

    public int hashCode() {
        return this.f125063c.hashCode();
    }

    public String toString() {
        return "Option{key='" + this.f125063c + "'}";
    }

    /* JADX INFO: renamed from: l.kx50$a */
    public class C18106a implements InterfaceC18107b<Object> {
        @Override // p149l.kx50.InterfaceC18107b
        /* JADX INFO: renamed from: a */
        public void mo147681a(@NonNull byte[] bArr, @NonNull Object obj, @NonNull MessageDigest messageDigest) {
        }
    }
}
