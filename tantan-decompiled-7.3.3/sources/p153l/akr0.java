package p153l;

import android.util.SparseBooleanArray;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public final class akr0 {

    /* JADX INFO: renamed from: a */
    public final SparseBooleanArray f72035a;

    /* JADX INFO: renamed from: a */
    public final int m98613a(int i) {
        lev0.m153953a(i, 0, this.f72035a.size());
        return this.f72035a.keyAt(i);
    }

    /* JADX INFO: renamed from: b */
    public final int m98614b() {
        return this.f72035a.size();
    }

    /* JADX INFO: renamed from: c */
    public final boolean m98615c(int i) {
        return this.f72035a.get(i);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof akr0)) {
            return false;
        }
        akr0 akr0Var = (akr0) obj;
        int i = mpw0.f137957a;
        SparseBooleanArray sparseBooleanArray = this.f72035a;
        if (i >= 24) {
            return sparseBooleanArray.equals(akr0Var.f72035a);
        }
        if (sparseBooleanArray.size() != akr0Var.f72035a.size()) {
            return false;
        }
        for (int i2 = 0; i2 < this.f72035a.size(); i2++) {
            if (m98613a(i2) != akr0Var.m98613a(i2)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = mpw0.f137957a;
        SparseBooleanArray sparseBooleanArray = this.f72035a;
        if (i >= 24) {
            return sparseBooleanArray.hashCode();
        }
        int size = sparseBooleanArray.size();
        for (int i2 = 0; i2 < this.f72035a.size(); i2++) {
            size = (size * 31) + m98613a(i2);
        }
        return size;
    }
}
