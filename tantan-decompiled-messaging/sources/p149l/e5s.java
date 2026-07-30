package p149l;

import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes11.dex */
public class e5s {

    /* JADX INFO: renamed from: a */
    public int f89462a;

    /* JADX INFO: renamed from: b */
    public int f89463b;

    /* JADX INFO: renamed from: c */
    public List<String> f89464c;

    /* JADX INFO: renamed from: d */
    public int f89465d;

    /* JADX INFO: renamed from: e */
    public int f89466e;

    /* JADX INFO: renamed from: f */
    public int f89467f;

    /* JADX INFO: renamed from: g */
    public int f89468g;

    /* JADX INFO: renamed from: h */
    public int f89469h;

    /* JADX INFO: renamed from: a */
    public boolean m114893a() {
        return this.f89468g > 0;
    }

    /* JADX INFO: renamed from: b */
    public boolean m114894b() {
        List<String> list = this.f89464c;
        return list != null && list.size() > 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            e5s e5sVar = (e5s) obj;
            if (this.f89462a == e5sVar.f89462a && this.f89463b == e5sVar.f89463b && this.f89465d == e5sVar.f89465d && this.f89466e == e5sVar.f89466e && this.f89467f == e5sVar.f89467f && this.f89468g == e5sVar.f89468g && this.f89469h == e5sVar.f89469h && Objects.equals(this.f89464c, e5sVar.f89464c)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.f89462a), Integer.valueOf(this.f89463b), this.f89464c, Integer.valueOf(this.f89465d), Integer.valueOf(this.f89466e), Integer.valueOf(this.f89467f), Integer.valueOf(this.f89468g), Integer.valueOf(this.f89469h));
    }
}
