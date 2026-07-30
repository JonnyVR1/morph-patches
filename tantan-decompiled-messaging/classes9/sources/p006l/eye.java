package p006l;

import androidx.recyclerview.widget.GridLayoutManager;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class eye extends GridLayoutManager.c {

    /* JADX INFO: renamed from: a */
    public ywe f11507a;

    /* JADX INFO: renamed from: b */
    public GridLayoutManager f11508b;

    public eye(ywe yweVar, GridLayoutManager gridLayoutManager) {
        this.f11507a = yweVar;
        this.f11508b = gridLayoutManager;
    }

    /* JADX INFO: renamed from: f */
    public int m14927f(int i) {
        if (this.f11507a.m28433L(i)) {
            return this.f11508b.m();
        }
        return 1;
    }
}
