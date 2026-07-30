package p149l;

import com.immomo.momomediaext.sei.BaseSei;

/* JADX INFO: loaded from: classes7.dex */
public final class e1e {

    /* JADX INFO: renamed from: a */
    public final int f88814a;

    /* JADX INFO: renamed from: b */
    public final int f88815b;

    /* JADX INFO: renamed from: a */
    public int m114406a() {
        return this.f88815b;
    }

    /* JADX INFO: renamed from: b */
    public int m114407b() {
        return this.f88814a;
    }

    public boolean equals(Object obj) {
        if (obj instanceof e1e) {
            e1e e1eVar = (e1e) obj;
            if (this.f88814a == e1eVar.f88814a && this.f88815b == e1eVar.f88815b) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (this.f88814a * 32713) + this.f88815b;
    }

    public String toString() {
        return this.f88814a + BaseSei.f13930X + this.f88815b;
    }
}
