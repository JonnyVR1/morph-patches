package androidx.recyclerview.widget;

import android.view.View;

/* JADX INFO: renamed from: androidx.recyclerview.widget.m */
/* JADX INFO: loaded from: classes.dex */
public class C0609m {

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
    public boolean m3809a(RecyclerView.C0561a0 c0561a0) {
        int i = this.f2901c;
        return i >= 0 && i < c0561a0.m3361c();
    }

    /* JADX INFO: renamed from: b */
    public View m3810b(RecyclerView.C0586v c0586v) {
        View viewM3475o = c0586v.m3475o(this.f2901c);
        this.f2901c += this.f2902d;
        return viewM3475o;
    }

    public String toString() {
        return "LayoutState{mAvailable=" + this.f2900b + ", mCurrentPosition=" + this.f2901c + ", mItemDirection=" + this.f2902d + ", mLayoutDirection=" + this.f2903e + ", mStartLine=" + this.f2904f + ", mEndLine=" + this.f2905g + '}';
    }
}
