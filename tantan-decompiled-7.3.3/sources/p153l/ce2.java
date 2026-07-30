package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p151v.VDraweeView;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class ce2 {
    /* JADX INFO: renamed from: a */
    public static void m109341a(be2 be2Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        be2Var.f76325l = (VDraweeView) viewGroup.getChildAt(0);
        be2Var.f76326m = (VText) viewGroup.getChildAt(1);
        be2Var.f76327n = (VText) viewGroup.getChildAt(2);
        be2Var.f76328o = (VText) viewGroup.getChildAt(3);
        be2Var.f76329p = (VText) viewGroup.getChildAt(4);
    }

    /* JADX INFO: renamed from: b */
    public static View m109342b(be2 be2Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(kec0.f125624T, viewGroup, false);
        m109341a(be2Var, viewInflate);
        return viewInflate;
    }
}
