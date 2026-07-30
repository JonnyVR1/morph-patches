package p153l;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class fof {

    /* JADX INFO: renamed from: a */
    public final List<dof> f100052a;

    /* JADX INFO: renamed from: b */
    public final int f100053b;

    /* JADX INFO: renamed from: c */
    public final boolean f100054c;

    public fof(List<dof> list, int i, boolean z) {
        this.f100052a = new ArrayList(list);
        this.f100053b = i;
        this.f100054c = z;
    }

    /* JADX INFO: renamed from: a */
    public List<dof> m126452a() {
        return this.f100052a;
    }

    /* JADX INFO: renamed from: b */
    public int m126453b() {
        return this.f100053b;
    }

    /* JADX INFO: renamed from: c */
    public boolean m126454c(List<dof> list) {
        return this.f100052a.equals(list);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof fof)) {
            return false;
        }
        fof fofVar = (fof) obj;
        return this.f100052a.equals(fofVar.m126452a()) && this.f100054c == fofVar.f100054c;
    }

    public int hashCode() {
        return Boolean.valueOf(this.f100054c).hashCode() ^ this.f100052a.hashCode();
    }

    public String toString() {
        return "{ " + this.f100052a + " }";
    }
}
