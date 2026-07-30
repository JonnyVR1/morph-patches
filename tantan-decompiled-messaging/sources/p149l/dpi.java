package p149l;

import android.util.SparseBooleanArray;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class dpi {

    /* JADX INFO: renamed from: a */
    public final SparseBooleanArray f87280a;

    /* JADX INFO: renamed from: l.dpi$b */
    public static final class C16424b {

        /* JADX INFO: renamed from: a */
        public final SparseBooleanArray f87281a = new SparseBooleanArray();

        /* JADX INFO: renamed from: b */
        public boolean f87282b;

        /* JADX INFO: renamed from: a */
        public C16424b m112907a(int i) {
            p11.m167013g(!this.f87282b);
            this.f87281a.append(i, true);
            return this;
        }

        /* JADX INFO: renamed from: b */
        public C16424b m112908b(dpi dpiVar) {
            for (int i = 0; i < dpiVar.m112906d(); i++) {
                m112907a(dpiVar.m112905c(i));
            }
            return this;
        }

        /* JADX INFO: renamed from: c */
        public C16424b m112909c(int... iArr) {
            for (int i : iArr) {
                m112907a(i);
            }
            return this;
        }

        /* JADX INFO: renamed from: d */
        public C16424b m112910d(int i, boolean z) {
            return z ? m112907a(i) : this;
        }

        /* JADX INFO: renamed from: e */
        public dpi m112911e() {
            p11.m167013g(!this.f87282b);
            this.f87282b = true;
            return new dpi(this.f87281a);
        }
    }

    public dpi(SparseBooleanArray sparseBooleanArray) {
        this.f87280a = sparseBooleanArray;
    }

    /* JADX INFO: renamed from: a */
    public boolean m112903a(int i) {
        return this.f87280a.get(i);
    }

    /* JADX INFO: renamed from: b */
    public boolean m112904b(int... iArr) {
        for (int i : iArr) {
            if (m112903a(i)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: c */
    public int m112905c(int i) {
        p11.m167009c(i, 0, m112906d());
        return this.f87280a.keyAt(i);
    }

    /* JADX INFO: renamed from: d */
    public int m112906d() {
        return this.f87280a.size();
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dpi)) {
            return false;
        }
        dpi dpiVar = (dpi) obj;
        if (vck0.f180948a >= 24) {
            return this.f87280a.equals(dpiVar.f87280a);
        }
        if (m112906d() != dpiVar.m112906d()) {
            return false;
        }
        for (int i = 0; i < m112906d(); i++) {
            if (m112905c(i) != dpiVar.m112905c(i)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        if (vck0.f180948a >= 24) {
            return this.f87280a.hashCode();
        }
        int iM112906d = m112906d();
        for (int i = 0; i < m112906d(); i++) {
            iM112906d = (iM112906d * 31) + m112905c(i);
        }
        return iM112906d;
    }
}
