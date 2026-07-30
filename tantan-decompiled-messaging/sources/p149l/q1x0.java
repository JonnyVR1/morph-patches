package p149l;

import java.util.Objects;

/* JADX INFO: loaded from: classes6.dex */
public final class q1x0 {

    /* JADX INFO: renamed from: a */
    public final tnw0 f152173a;

    /* JADX INFO: renamed from: b */
    public final int f152174b;

    /* JADX INFO: renamed from: c */
    public final String f152175c;

    /* JADX INFO: renamed from: d */
    public final String f152176d;

    public /* synthetic */ q1x0(tnw0 tnw0Var, int i, String str, String str2, p1x0 p1x0Var) {
        this.f152173a = tnw0Var;
        this.f152174b = i;
        this.f152175c = str;
        this.f152176d = str2;
    }

    /* JADX INFO: renamed from: a */
    public final int m172418a() {
        return this.f152174b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof q1x0)) {
            return false;
        }
        q1x0 q1x0Var = (q1x0) obj;
        return this.f152173a == q1x0Var.f152173a && this.f152174b == q1x0Var.f152174b && this.f152175c.equals(q1x0Var.f152175c) && this.f152176d.equals(q1x0Var.f152176d);
    }

    public final int hashCode() {
        return Objects.hash(this.f152173a, Integer.valueOf(this.f152174b), this.f152175c, this.f152176d);
    }

    public final String toString() {
        return String.format("(status=%s, keyId=%s, keyType='%s', keyPrefix='%s')", this.f152173a, Integer.valueOf(this.f152174b), this.f152175c, this.f152176d);
    }
}
