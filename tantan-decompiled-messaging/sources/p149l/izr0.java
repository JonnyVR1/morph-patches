package p149l;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public final class izr0 {

    /* JADX INFO: renamed from: a */
    public final long f115595a;

    /* JADX INFO: renamed from: b */
    public final String f115596b;

    /* JADX INFO: renamed from: c */
    public final int f115597c;

    public izr0(long j, String str, int i) {
        this.f115595a = j;
        this.f115596b = str;
        this.f115597c = i;
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj != null && (obj instanceof izr0)) {
            izr0 izr0Var = (izr0) obj;
            if (izr0Var.f115595a == this.f115595a && izr0Var.f115597c == this.f115597c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (int) this.f115595a;
    }
}
