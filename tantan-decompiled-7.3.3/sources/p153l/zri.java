package p153l;

import android.util.SparseBooleanArray;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class zri {

    /* JADX INFO: renamed from: a */
    public final SparseBooleanArray f205762a;

    /* JADX INFO: renamed from: l.zri$b */
    public static final class C21871b {

        /* JADX INFO: renamed from: a */
        public final SparseBooleanArray f205763a = new SparseBooleanArray();

        /* JADX INFO: renamed from: b */
        public boolean f205764b;

        /* JADX INFO: renamed from: a */
        public C21871b m221160a(int i) {
            w11.m204371g(!this.f205764b);
            this.f205763a.append(i, true);
            return this;
        }

        /* JADX INFO: renamed from: b */
        public C21871b m221161b(zri zriVar) {
            for (int i = 0; i < zriVar.m221159d(); i++) {
                m221160a(zriVar.m221158c(i));
            }
            return this;
        }

        /* JADX INFO: renamed from: c */
        public C21871b m221162c(int... iArr) {
            for (int i : iArr) {
                m221160a(i);
            }
            return this;
        }

        /* JADX INFO: renamed from: d */
        public C21871b m221163d(int i, boolean z) {
            return z ? m221160a(i) : this;
        }

        /* JADX INFO: renamed from: e */
        public zri m221164e() {
            w11.m204371g(!this.f205764b);
            this.f205764b = true;
            return new zri(this.f205763a);
        }
    }

    public zri(SparseBooleanArray sparseBooleanArray) {
        this.f205762a = sparseBooleanArray;
    }

    /* JADX INFO: renamed from: a */
    public boolean m221156a(int i) {
        return this.f205762a.get(i);
    }

    /* JADX INFO: renamed from: b */
    public boolean m221157b(int... iArr) {
        for (int i : iArr) {
            if (m221156a(i)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: c */
    public int m221158c(int i) {
        w11.m204367c(i, 0, m221159d());
        return this.f205762a.keyAt(i);
    }

    /* JADX INFO: renamed from: d */
    public int m221159d() {
        return this.f205762a.size();
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zri)) {
            return false;
        }
        zri zriVar = (zri) obj;
        if (bmk0.f77313a >= 24) {
            return this.f205762a.equals(zriVar.f205762a);
        }
        if (m221159d() != zriVar.m221159d()) {
            return false;
        }
        for (int i = 0; i < m221159d(); i++) {
            if (m221158c(i) != zriVar.m221158c(i)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        if (bmk0.f77313a >= 24) {
            return this.f205762a.hashCode();
        }
        int iM221159d = m221159d();
        for (int i = 0; i < m221159d(); i++) {
            iM221159d = (iM221159d * 31) + m221158c(i);
        }
        return iM221159d;
    }
}
