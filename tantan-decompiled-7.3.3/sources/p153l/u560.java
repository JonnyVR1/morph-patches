package p153l;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes.dex */
public final class u560 implements kzq {

    /* JADX INFO: renamed from: b */
    private final l01<q560<?>, Object> f177580b = new jy3();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: f */
    private static <T> void m194541f(@NonNull q560<T> q560Var, @NonNull Object obj, @NonNull MessageDigest messageDigest) {
        q560Var.m175299g(obj, messageDigest);
    }

    @Override // p153l.kzq
    /* JADX INFO: renamed from: a */
    public void mo5434a(@NonNull MessageDigest messageDigest) {
        for (int i = 0; i < this.f177580b.size(); i++) {
            m194541f(this.f177580b.m168582i(i), this.f177580b.m168583m(i), messageDigest);
        }
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public <T> T m194542c(@NonNull q560<T> q560Var) {
        return this.f177580b.containsKey(q560Var) ? (T) this.f177580b.get(q560Var) : q560Var.m175298c();
    }

    /* JADX INFO: renamed from: d */
    public void m194543d(@NonNull u560 u560Var) {
        this.f177580b.mo147462j(u560Var.f177580b);
    }

    @NonNull
    /* JADX INFO: renamed from: e */
    public <T> u560 m194544e(@NonNull q560<T> q560Var, @NonNull T t) {
        this.f177580b.put(q560Var, t);
        return this;
    }

    @Override // p153l.kzq
    public boolean equals(Object obj) {
        if (obj instanceof u560) {
            return this.f177580b.equals(((u560) obj).f177580b);
        }
        return false;
    }

    @Override // p153l.kzq
    public int hashCode() {
        return this.f177580b.hashCode();
    }

    public String toString() {
        return "Options{values=" + this.f177580b + '}';
    }
}
