package p149l;

import java.util.Objects;

/* JADX INFO: loaded from: classes6.dex */
public final class ptw0 extends apw0 {

    /* JADX INFO: renamed from: a */
    public final String f151228a;

    /* JADX INFO: renamed from: b */
    public final ntw0 f151229b;

    /* JADX INFO: renamed from: c */
    public final apw0 f151230c;

    public /* synthetic */ ptw0(String str, ntw0 ntw0Var, apw0 apw0Var, otw0 otw0Var) {
        this.f151228a = str;
        this.f151229b = ntw0Var;
        this.f151230c = apw0Var;
    }

    @Override // p149l.fow0
    /* JADX INFO: renamed from: a */
    public final boolean mo104696a() {
        return false;
    }

    /* JADX INFO: renamed from: b */
    public final apw0 m171386b() {
        return this.f151230c;
    }

    /* JADX INFO: renamed from: c */
    public final String m171387c() {
        return this.f151228a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ptw0)) {
            return false;
        }
        ptw0 ptw0Var = (ptw0) obj;
        return ptw0Var.f151229b.equals(this.f151229b) && ptw0Var.f151230c.equals(this.f151230c) && ptw0Var.f151228a.equals(this.f151228a);
    }

    public final int hashCode() {
        return Objects.hash(ptw0.class, this.f151228a, this.f151229b, this.f151230c);
    }

    public final String toString() {
        apw0 apw0Var = this.f151230c;
        return "LegacyKmsEnvelopeAead Parameters (kekUri: " + this.f151228a + ", dekParsingStrategy: " + String.valueOf(this.f151229b) + ", dekParametersForNewKeys: " + String.valueOf(apw0Var) + ")";
    }
}
