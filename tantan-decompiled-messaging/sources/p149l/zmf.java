package p149l;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class zmf {

    /* JADX INFO: renamed from: a */
    public final List<xmf> f203708a;

    /* JADX INFO: renamed from: b */
    public final int f203709b;

    /* JADX INFO: renamed from: c */
    public final boolean f203710c;

    public zmf(List<xmf> list, int i, boolean z) {
        this.f203708a = new ArrayList(list);
        this.f203709b = i;
        this.f203710c = z;
    }

    /* JADX INFO: renamed from: a */
    public List<xmf> m219323a() {
        return this.f203708a;
    }

    /* JADX INFO: renamed from: b */
    public int m219324b() {
        return this.f203709b;
    }

    /* JADX INFO: renamed from: c */
    public boolean m219325c(List<xmf> list) {
        return this.f203708a.equals(list);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof zmf)) {
            return false;
        }
        zmf zmfVar = (zmf) obj;
        return this.f203708a.equals(zmfVar.m219323a()) && this.f203710c == zmfVar.f203710c;
    }

    public int hashCode() {
        return Boolean.valueOf(this.f203710c).hashCode() ^ this.f203708a.hashCode();
    }

    public String toString() {
        return "{ " + this.f203708a + " }";
    }
}
