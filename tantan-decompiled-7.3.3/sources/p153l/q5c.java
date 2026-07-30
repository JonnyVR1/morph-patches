package p153l;

/* JADX INFO: loaded from: classes7.dex */
public class q5c {

    /* JADX INFO: renamed from: a */
    public final int f155701a;

    /* JADX INFO: renamed from: b */
    public final int f155702b;

    public q5c(int i, int i2) {
        this.f155701a = i;
        this.f155702b = i2;
    }

    /* JADX INFO: renamed from: a */
    public final int m175347a() {
        return this.f155702b;
    }

    /* JADX INFO: renamed from: b */
    public final int m175348b() {
        return this.f155701a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof q5c)) {
            return false;
        }
        q5c q5cVar = (q5c) obj;
        return this.f155701a == q5cVar.f155701a && this.f155702b == q5cVar.f155702b;
    }

    public final int hashCode() {
        return this.f155702b ^ this.f155701a;
    }

    public final String toString() {
        return this.f155701a + "(" + this.f155702b + ')';
    }
}
