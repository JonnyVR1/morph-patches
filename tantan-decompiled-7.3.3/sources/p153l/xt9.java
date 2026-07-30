package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p151v.VDraweeView;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class xt9 {
    /* JADX INFO: renamed from: a */
    public static void m213045a(wt9 wt9Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        wt9Var.f190723a = (VDraweeView) viewGroup.getChildAt(1);
        wt9Var.f190724b = viewGroup.getChildAt(2);
        wt9Var.f190725c = (VText) viewGroup.getChildAt(3);
    }

    /* JADX INFO: renamed from: b */
    public static View m213046b(wt9 wt9Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(qec0.f156996b1, viewGroup, false);
        m213045a(wt9Var, viewInflate);
        return viewInflate;
    }
}
