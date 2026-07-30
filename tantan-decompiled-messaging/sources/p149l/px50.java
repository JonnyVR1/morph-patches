package p149l;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes.dex */
public final class px50 implements kxq {

    /* JADX INFO: renamed from: b */
    private final e01<kx50<?>, Object> f151641b = new kx3();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: f */
    private static <T> void m171821f(@NonNull kx50<T> kx50Var, @NonNull Object obj, @NonNull MessageDigest messageDigest) {
        kx50Var.m147680g(obj, messageDigest);
    }

    @Override // p149l.kxq
    /* JADX INFO: renamed from: a */
    public void mo5409a(@NonNull MessageDigest messageDigest) {
        for (int i = 0; i < this.f151641b.size(); i++) {
            m171821f(this.f151641b.m130823i(i), this.f151641b.m130827m(i), messageDigest);
        }
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public <T> T m171822c(@NonNull kx50<T> kx50Var) {
        return this.f151641b.containsKey(kx50Var) ? (T) this.f151641b.get(kx50Var) : kx50Var.m147679c();
    }

    /* JADX INFO: renamed from: d */
    public void m171823d(@NonNull px50 px50Var) {
        this.f151641b.mo130824j(px50Var.f151641b);
    }

    @NonNull
    /* JADX INFO: renamed from: e */
    public <T> px50 m171824e(@NonNull kx50<T> kx50Var, @NonNull T t) {
        this.f151641b.put(kx50Var, t);
        return this;
    }

    @Override // p149l.kxq
    public boolean equals(Object obj) {
        if (obj instanceof px50) {
            return this.f151641b.equals(((px50) obj).f151641b);
        }
        return false;
    }

    @Override // p149l.kxq
    public int hashCode() {
        return this.f151641b.hashCode();
    }

    public String toString() {
        return "Options{values=" + this.f151641b + '}';
    }
}
