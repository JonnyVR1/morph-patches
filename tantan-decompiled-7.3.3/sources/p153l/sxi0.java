package p153l;

/* JADX INFO: loaded from: classes11.dex */
public class sxi0 {

    /* JADX INFO: renamed from: a */
    public String f171140a;

    /* JADX INFO: renamed from: b */
    public long f171141b;

    /* JADX INFO: renamed from: c */
    public boolean f171142c;

    /* JADX INFO: renamed from: d */
    public String f171143d;

    /* JADX INFO: renamed from: e */
    public long f171144e;

    public boolean equals(Object obj) {
        return (obj instanceof sxi0) && this.f171141b == ((sxi0) obj).f171141b;
    }

    public int hashCode() {
        return (int) this.f171141b;
    }

    public String toString() {
        return String.format("%s %s %s %s %s", this.f171140a, Long.valueOf(this.f171141b), this.f171143d, Long.valueOf(this.f171144e), Boolean.valueOf(this.f171142c));
    }
}
