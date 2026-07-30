package p153l;

import java.util.Objects;

/* JADX INFO: loaded from: classes13.dex */
public class hyh0 {

    /* JADX INFO: renamed from: a */
    public int f112117a;

    /* JADX INFO: renamed from: b */
    public int f112118b;

    public hyh0(int i, int i2) {
        this.f112117a = i;
        this.f112118b = i2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hyh0)) {
            return false;
        }
        hyh0 hyh0Var = (hyh0) obj;
        return this.f112117a == hyh0Var.f112117a && this.f112118b == hyh0Var.f112118b;
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.f112117a), Integer.valueOf(this.f112118b));
    }
}
