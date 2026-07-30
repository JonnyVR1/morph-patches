package p149l;

import android.util.SparseBooleanArray;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public final class uar0 {

    /* JADX INFO: renamed from: a */
    public final SparseBooleanArray f175630a;

    /* JADX INFO: renamed from: a */
    public final int m192797a(int i) {
        f5v0.m119530a(i, 0, this.f175630a.size());
        return this.f175630a.keyAt(i);
    }

    /* JADX INFO: renamed from: b */
    public final int m192798b() {
        return this.f175630a.size();
    }

    /* JADX INFO: renamed from: c */
    public final boolean m192799c(int i) {
        return this.f175630a.get(i);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uar0)) {
            return false;
        }
        uar0 uar0Var = (uar0) obj;
        int i = ggw0.f102568a;
        SparseBooleanArray sparseBooleanArray = this.f175630a;
        if (i >= 24) {
            return sparseBooleanArray.equals(uar0Var.f175630a);
        }
        if (sparseBooleanArray.size() != uar0Var.f175630a.size()) {
            return false;
        }
        for (int i2 = 0; i2 < this.f175630a.size(); i2++) {
            if (m192797a(i2) != uar0Var.m192797a(i2)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = ggw0.f102568a;
        SparseBooleanArray sparseBooleanArray = this.f175630a;
        if (i >= 24) {
            return sparseBooleanArray.hashCode();
        }
        int size = sparseBooleanArray.size();
        for (int i2 = 0; i2 < this.f175630a.size(); i2++) {
            size = (size * 31) + m192797a(i2);
        }
        return size;
    }
}
