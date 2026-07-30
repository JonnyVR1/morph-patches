package androidx.recyclerview.widget;

import android.view.View;

/* JADX INFO: renamed from: androidx.recyclerview.widget.u */
/* JADX INFO: loaded from: classes.dex */
public class C0617u {
    /* JADX INFO: renamed from: a */
    public static int m3855a(RecyclerView.C0561a0 c0561a0, AbstractC0614r abstractC0614r, View view, View view2, RecyclerView.AbstractC0579o abstractC0579o, boolean z) {
        if (abstractC0579o.getChildCount() == 0 || c0561a0.m3361c() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return Math.abs(abstractC0579o.getPosition(view) - abstractC0579o.getPosition(view2)) + 1;
        }
        return Math.min(abstractC0614r.mo3839n(), abstractC0614r.mo3829d(view2) - abstractC0614r.mo3832g(view));
    }

    /* JADX INFO: renamed from: b */
    public static int m3856b(RecyclerView.C0561a0 c0561a0, AbstractC0614r abstractC0614r, View view, View view2, RecyclerView.AbstractC0579o abstractC0579o, boolean z, boolean z2) {
        if (abstractC0579o.getChildCount() == 0 || c0561a0.m3361c() == 0 || view == null || view2 == null) {
            return 0;
        }
        int iMax = z2 ? Math.max(0, (c0561a0.m3361c() - Math.max(abstractC0579o.getPosition(view), abstractC0579o.getPosition(view2))) - 1) : Math.max(0, Math.min(abstractC0579o.getPosition(view), abstractC0579o.getPosition(view2)));
        if (z) {
            return Math.round((iMax * (Math.abs(abstractC0614r.mo3829d(view2) - abstractC0614r.mo3832g(view)) / (Math.abs(abstractC0579o.getPosition(view) - abstractC0579o.getPosition(view2)) + 1))) + (abstractC0614r.mo3838m() - abstractC0614r.mo3832g(view)));
        }
        return iMax;
    }

    /* JADX INFO: renamed from: c */
    public static int m3857c(RecyclerView.C0561a0 c0561a0, AbstractC0614r abstractC0614r, View view, View view2, RecyclerView.AbstractC0579o abstractC0579o, boolean z) {
        if (abstractC0579o.getChildCount() == 0 || c0561a0.m3361c() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return c0561a0.m3361c();
        }
        return (int) (((abstractC0614r.mo3829d(view2) - abstractC0614r.mo3832g(view)) / (Math.abs(abstractC0579o.getPosition(view) - abstractC0579o.getPosition(view2)) + 1)) * c0561a0.m3361c());
    }
}
