package p153l;

import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class xlr0 extends zlr0 {

    /* JADX INFO: renamed from: b */
    public final long f195013b;

    /* JADX INFO: renamed from: c */
    public final List f195014c;

    /* JADX INFO: renamed from: d */
    public final List f195015d;

    public xlr0(int i, long j) {
        super(i);
        this.f195013b = j;
        this.f195014c = new ArrayList();
        this.f195015d = new ArrayList();
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public final xlr0 m211669c(int i) {
        int size = this.f195015d.size();
        for (int i2 = 0; i2 < size; i2++) {
            xlr0 xlr0Var = (xlr0) this.f195015d.get(i2);
            if (xlr0Var.f205002a == i) {
                return xlr0Var;
            }
        }
        return null;
    }

    @Nullable
    /* JADX INFO: renamed from: d */
    public final ylr0 m211670d(int i) {
        int size = this.f195014c.size();
        for (int i2 = 0; i2 < size; i2++) {
            ylr0 ylr0Var = (ylr0) this.f195014c.get(i2);
            if (ylr0Var.f205002a == i) {
                return ylr0Var;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: e */
    public final void m211671e(xlr0 xlr0Var) {
        this.f195015d.add(xlr0Var);
    }

    /* JADX INFO: renamed from: f */
    public final void m211672f(ylr0 ylr0Var) {
        this.f195014c.add(ylr0Var);
    }

    @Override // p153l.zlr0
    public final String toString() {
        List list = this.f195014c;
        return zlr0.m220301b(this.f205002a) + " leaves: " + Arrays.toString(list.toArray()) + " containers: " + Arrays.toString(this.f195015d.toArray());
    }
}
