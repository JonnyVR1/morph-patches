package p153l;

import androidx.recyclerview.widget.GridLayoutManager;

/* JADX INFO: loaded from: classes12.dex */
public class ize extends GridLayoutManager.AbstractC0554c {

    /* JADX INFO: renamed from: a */
    public cye f117692a;

    /* JADX INFO: renamed from: b */
    public GridLayoutManager f117693b;

    public ize(cye cyeVar, GridLayoutManager gridLayoutManager) {
        this.f117692a = cyeVar;
        this.f117693b = gridLayoutManager;
    }

    @Override // androidx.recyclerview.widget.GridLayoutManager.AbstractC0554c
    /* JADX INFO: renamed from: f */
    public int mo3330f(int i) {
        if (this.f117692a.m113150L(i)) {
            return this.f117693b.m3318m();
        }
        return 1;
    }
}
