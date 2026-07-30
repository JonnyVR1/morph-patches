package androidx.recyclerview.widget;

import android.view.View;

/* JADX INFO: renamed from: androidx.recyclerview.widget.m */
/* JADX INFO: loaded from: classes.dex */
public class C0607m {

    /* JADX INFO: renamed from: b */
    public int f2900b;

    /* JADX INFO: renamed from: c */
    public int f2901c;

    /* JADX INFO: renamed from: d */
    public int f2902d;

    /* JADX INFO: renamed from: e */
    public int f2903e;

    /* JADX INFO: renamed from: h */
    public boolean f2906h;

    /* JADX INFO: renamed from: i */
    public boolean f2907i;

    /* JADX INFO: renamed from: a */
    public boolean f2899a = true;

    /* JADX INFO: renamed from: f */
    public int f2904f = 0;

    /* JADX INFO: renamed from: g */
    public int f2905g = 0;

    /* JADX INFO: renamed from: a */
    public boolean m3808a(RecyclerView.C0588z c0588z) {
        int i = this.f2901c;
        return i >= 0 && i < c0588z.m3487c();
    }

    /* JADX INFO: renamed from: b */
    public View m3809b(RecyclerView.C0584v c0584v) {
        View viewM3466o = c0584v.m3466o(this.f2901c);
        this.f2901c += this.f2902d;
        return viewM3466o;
    }

    public String toString() {
        return "LayoutState{mAvailable=" + this.f2900b + ", mCurrentPosition=" + this.f2901c + ", mItemDirection=" + this.f2902d + ", mLayoutDirection=" + this.f2903e + ", mStartLine=" + this.f2904f + ", mEndLine=" + this.f2905g + '}';
    }
}
