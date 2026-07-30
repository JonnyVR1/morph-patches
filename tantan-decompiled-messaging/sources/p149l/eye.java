package p149l;

import androidx.recyclerview.widget.GridLayoutManager;

/* JADX INFO: loaded from: classes9.dex */
public class eye extends GridLayoutManager.AbstractC0553c {

    /* JADX INFO: renamed from: a */
    public ywe f93740a;

    /* JADX INFO: renamed from: b */
    public GridLayoutManager f93741b;

    public eye(ywe yweVar, GridLayoutManager gridLayoutManager) {
        this.f93740a = yweVar;
        this.f93741b = gridLayoutManager;
    }

    @Override // androidx.recyclerview.widget.GridLayoutManager.AbstractC0553c
    /* JADX INFO: renamed from: f */
    public int mo3329f(int i) {
        if (this.f93740a.m216377L(i)) {
            return this.f93741b.m3317m();
        }
        return 1;
    }
}
