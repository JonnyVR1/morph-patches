package p149l;

import android.util.SparseBooleanArray;

/* JADX INFO: loaded from: classes6.dex */
public final class s8r0 {

    /* JADX INFO: renamed from: a */
    public final SparseBooleanArray f163102a = new SparseBooleanArray();

    /* JADX INFO: renamed from: b */
    public boolean f163103b;

    /* JADX INFO: renamed from: a */
    public final s8r0 m182663a(int i) {
        f5v0.m119535f(!this.f163103b);
        this.f163102a.append(i, true);
        return this;
    }

    /* JADX INFO: renamed from: b */
    public final uar0 m182664b() {
        f5v0.m119535f(!this.f163103b);
        this.f163103b = true;
        return new uar0(this.f163102a, null);
    }
}
