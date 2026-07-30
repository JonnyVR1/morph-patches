package p149l;

import java.util.Objects;

/* JADX INFO: loaded from: classes13.dex */
public class aqh0 {

    /* JADX INFO: renamed from: a */
    public int f71161a;

    /* JADX INFO: renamed from: b */
    public int f71162b;

    public aqh0(int i, int i2) {
        this.f71161a = i;
        this.f71162b = i2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aqh0)) {
            return false;
        }
        aqh0 aqh0Var = (aqh0) obj;
        return this.f71161a == aqh0Var.f71161a && this.f71162b == aqh0Var.f71162b;
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.f71161a), Integer.valueOf(this.f71162b));
    }
}
