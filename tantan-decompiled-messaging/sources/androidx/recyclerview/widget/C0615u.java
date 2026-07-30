package androidx.recyclerview.widget;

import android.view.View;

/* JADX INFO: renamed from: androidx.recyclerview.widget.u */
/* JADX INFO: loaded from: classes.dex */
public class C0615u {
    /* JADX INFO: renamed from: a */
    public static int m3854a(RecyclerView.C0588z c0588z, AbstractC0612r abstractC0612r, View view, View view2, RecyclerView.AbstractC0577o abstractC0577o, boolean z) {
        if (abstractC0577o.getChildCount() == 0 || c0588z.m3487c() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return Math.abs(abstractC0577o.getPosition(view) - abstractC0577o.getPosition(view2)) + 1;
        }
        return Math.min(abstractC0612r.mo3838n(), abstractC0612r.mo3828d(view2) - abstractC0612r.mo3831g(view));
    }

    /* JADX INFO: renamed from: b */
    public static int m3855b(RecyclerView.C0588z c0588z, AbstractC0612r abstractC0612r, View view, View view2, RecyclerView.AbstractC0577o abstractC0577o, boolean z, boolean z2) {
        if (abstractC0577o.getChildCount() == 0 || c0588z.m3487c() == 0 || view == null || view2 == null) {
            return 0;
        }
        int iMax = z2 ? Math.max(0, (c0588z.m3487c() - Math.max(abstractC0577o.getPosition(view), abstractC0577o.getPosition(view2))) - 1) : Math.max(0, Math.min(abstractC0577o.getPosition(view), abstractC0577o.getPosition(view2)));
        if (z) {
            return Math.round((iMax * (Math.abs(abstractC0612r.mo3828d(view2) - abstractC0612r.mo3831g(view)) / (Math.abs(abstractC0577o.getPosition(view) - abstractC0577o.getPosition(view2)) + 1))) + (abstractC0612r.mo3837m() - abstractC0612r.mo3831g(view)));
        }
        return iMax;
    }

    /* JADX INFO: renamed from: c */
    public static int m3856c(RecyclerView.C0588z c0588z, AbstractC0612r abstractC0612r, View view, View view2, RecyclerView.AbstractC0577o abstractC0577o, boolean z) {
        if (abstractC0577o.getChildCount() == 0 || c0588z.m3487c() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return c0588z.m3487c();
        }
        return (int) (((abstractC0612r.mo3828d(view2) - abstractC0612r.mo3831g(view)) / (Math.abs(abstractC0577o.getPosition(view) - abstractC0577o.getPosition(view2)) + 1)) * c0588z.m3487c());
    }
}
