package p149l;

import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class rcr0 extends tcr0 {

    /* JADX INFO: renamed from: b */
    public final long f158813b;

    /* JADX INFO: renamed from: c */
    public final List f158814c;

    /* JADX INFO: renamed from: d */
    public final List f158815d;

    public rcr0(int i, long j) {
        super(i);
        this.f158813b = j;
        this.f158814c = new ArrayList();
        this.f158815d = new ArrayList();
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public final rcr0 m178811c(int i) {
        int size = this.f158815d.size();
        for (int i2 = 0; i2 < size; i2++) {
            rcr0 rcr0Var = (rcr0) this.f158815d.get(i2);
            if (rcr0Var.f169472a == i) {
                return rcr0Var;
            }
        }
        return null;
    }

    @Nullable
    /* JADX INFO: renamed from: d */
    public final scr0 m178812d(int i) {
        int size = this.f158814c.size();
        for (int i2 = 0; i2 < size; i2++) {
            scr0 scr0Var = (scr0) this.f158814c.get(i2);
            if (scr0Var.f169472a == i) {
                return scr0Var;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: e */
    public final void m178813e(rcr0 rcr0Var) {
        this.f158815d.add(rcr0Var);
    }

    /* JADX INFO: renamed from: f */
    public final void m178814f(scr0 scr0Var) {
        this.f158814c.add(scr0Var);
    }

    @Override // p149l.tcr0
    public final String toString() {
        List list = this.f158814c;
        return tcr0.m188058b(this.f169472a) + " leaves: " + Arrays.toString(list.toArray()) + " containers: " + Arrays.toString(this.f158815d.toArray());
    }
}
