package p149l;

/* JADX INFO: loaded from: classes7.dex */
public class i4c {

    /* JADX INFO: renamed from: a */
    public final int f111421a;

    /* JADX INFO: renamed from: b */
    public final int f111422b;

    public i4c(int i, int i2) {
        this.f111421a = i;
        this.f111422b = i2;
    }

    /* JADX INFO: renamed from: a */
    public final int m134323a() {
        return this.f111422b;
    }

    /* JADX INFO: renamed from: b */
    public final int m134324b() {
        return this.f111421a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof i4c)) {
            return false;
        }
        i4c i4cVar = (i4c) obj;
        return this.f111421a == i4cVar.f111421a && this.f111422b == i4cVar.f111422b;
    }

    public final int hashCode() {
        return this.f111422b ^ this.f111421a;
    }

    public final String toString() {
        return this.f111421a + "(" + this.f111422b + ')';
    }
}
