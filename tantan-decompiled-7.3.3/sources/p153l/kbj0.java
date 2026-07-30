package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView;
import p151v.VLinear;
import p151v.VText;

/* JADX INFO: loaded from: classes13.dex */
public class kbj0 {
    /* JADX INFO: renamed from: a */
    public static void m149061a(jbj0 jbj0Var, View view) {
        jbj0Var.f119939a = (VLinear) view;
        ViewGroup viewGroup = (ViewGroup) view;
        jbj0Var.f119940b = (ImageView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1);
        jbj0Var.f119941c = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        jbj0Var.f119942d = (RecyclerView) viewGroup.getChildAt(1);
        jbj0Var.f119943e = (RelativeLayout) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        jbj0Var.f119944f = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(0);
        jbj0Var.f119945g = (ImageView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(1);
        jbj0Var.f119946h = viewGroup.getChildAt(3);
    }

    /* JADX INFO: renamed from: b */
    public static View m149062b(jbj0 jbj0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(tec0.f173517I3, viewGroup, false);
        m149061a(jbj0Var, viewInflate);
        return viewInflate;
    }
}
