package p153l;

import android.util.SparseBooleanArray;

/* JADX INFO: loaded from: classes6.dex */
public final class yhr0 {

    /* JADX INFO: renamed from: a */
    public final SparseBooleanArray f199982a = new SparseBooleanArray();

    /* JADX INFO: renamed from: b */
    public boolean f199983b;

    /* JADX INFO: renamed from: a */
    public final yhr0 m215992a(int i) {
        lev0.m153958f(!this.f199983b);
        this.f199982a.append(i, true);
        return this;
    }

    /* JADX INFO: renamed from: b */
    public final akr0 m215993b() {
        lev0.m153958f(!this.f199983b);
        this.f199983b = true;
        return new akr0(this.f199982a, null);
    }
}
