package p149l;

/* JADX INFO: loaded from: classes13.dex */
public class qoi0 {

    /* JADX INFO: renamed from: a */
    public String f155582a;

    /* JADX INFO: renamed from: b */
    public long f155583b;

    /* JADX INFO: renamed from: c */
    public boolean f155584c;

    /* JADX INFO: renamed from: d */
    public String f155585d;

    /* JADX INFO: renamed from: e */
    public long f155586e;

    public boolean equals(Object obj) {
        return (obj instanceof qoi0) && this.f155583b == ((qoi0) obj).f155583b;
    }

    public int hashCode() {
        return (int) this.f155583b;
    }

    public String toString() {
        return String.format("%s %s %s %s %s", this.f155582a, Long.valueOf(this.f155583b), this.f155585d, Long.valueOf(this.f155586e), Boolean.valueOf(this.f155584c));
    }
}
