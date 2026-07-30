package p149l;

/* JADX INFO: loaded from: classes.dex */
public final class e9g0 {

    /* JADX INFO: renamed from: a */
    public volatile String f90099a;

    public e9g0(String str) {
        this.f90099a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e9g0)) {
            return false;
        }
        if (this.f90099a == null) {
            return ((e9g0) obj).f90099a == null;
        }
        return this.f90099a.equals(((e9g0) obj).f90099a);
    }

    public final int hashCode() {
        if (this.f90099a == null) {
            return 0;
        }
        return this.f90099a.hashCode();
    }

    public e9g0() {
    }
}
