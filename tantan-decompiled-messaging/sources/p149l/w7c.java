package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import p147v.VDraweeView;
import p147v.VIcon;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class w7c {
    /* JADX INFO: renamed from: a */
    public static void m202013a(v7c v7cVar, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        v7cVar.f180322f = viewGroup.getChildAt(0);
        v7cVar.f180323g = (ConstraintLayout) viewGroup.getChildAt(1);
        v7cVar.f180324h = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        v7cVar.f180325i = (VIcon) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        v7cVar.f180326j = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        v7cVar.f180327k = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3);
        v7cVar.f180328l = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4);
    }

    /* JADX INFO: renamed from: b */
    public static View m202014b(v7c v7cVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.f95787g2, viewGroup, false);
        m202013a(v7cVar, viewInflate);
        return viewInflate;
    }
}
