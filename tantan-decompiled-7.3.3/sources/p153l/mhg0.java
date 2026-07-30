package p153l;

/* JADX INFO: loaded from: classes.dex */
public final class mhg0 {

    /* JADX INFO: renamed from: a */
    public volatile String f136848a;

    public mhg0(String str) {
        this.f136848a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mhg0)) {
            return false;
        }
        if (this.f136848a == null) {
            return ((mhg0) obj).f136848a == null;
        }
        return this.f136848a.equals(((mhg0) obj).f136848a);
    }

    public final int hashCode() {
        if (this.f136848a == null) {
            return 0;
        }
        return this.f136848a.hashCode();
    }

    public mhg0() {
    }
}
