package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import p151v.VDraweeView;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class dtm0 {
    /* JADX INFO: renamed from: a */
    public static void m117885a(ctm0 ctm0Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        ctm0Var.f83716a = (VDraweeView) viewGroup.getChildAt(0);
        ctm0Var.f83717b = (VText) viewGroup.getChildAt(1);
        ctm0Var.f83718c = (TextView) viewGroup.getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m117886b(ctm0 ctm0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(yec0.f198843M7, viewGroup, false);
        m117885a(ctm0Var, viewInflate);
        return viewInflate;
    }
}
