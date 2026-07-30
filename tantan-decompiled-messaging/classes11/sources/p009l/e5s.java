package p009l;

import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class e5s {

    /* JADX INFO: renamed from: a */
    public int f12378a;

    /* JADX INFO: renamed from: b */
    public int f12379b;

    /* JADX INFO: renamed from: c */
    public List<String> f12380c;

    /* JADX INFO: renamed from: d */
    public int f12381d;

    /* JADX INFO: renamed from: e */
    public int f12382e;

    /* JADX INFO: renamed from: f */
    public int f12383f;

    /* JADX INFO: renamed from: g */
    public int f12384g;

    /* JADX INFO: renamed from: h */
    public int f12385h;

    /* JADX INFO: renamed from: a */
    public boolean m13743a() {
        return this.f12384g > 0;
    }

    /* JADX INFO: renamed from: b */
    public boolean m13744b() {
        List<String> list = this.f12380c;
        return list != null && list.size() > 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            e5s e5sVar = (e5s) obj;
            if (this.f12378a == e5sVar.f12378a && this.f12379b == e5sVar.f12379b && this.f12381d == e5sVar.f12381d && this.f12382e == e5sVar.f12382e && this.f12383f == e5sVar.f12383f && this.f12384g == e5sVar.f12384g && this.f12385h == e5sVar.f12385h && Objects.equals(this.f12380c, e5sVar.f12380c)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.f12378a), Integer.valueOf(this.f12379b), this.f12380c, Integer.valueOf(this.f12381d), Integer.valueOf(this.f12382e), Integer.valueOf(this.f12383f), Integer.valueOf(this.f12384g), Integer.valueOf(this.f12385h));
    }
}
