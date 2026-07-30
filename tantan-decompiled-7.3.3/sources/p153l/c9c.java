package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import p151v.VDraweeView;
import p151v.VIcon;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class c9c {
    /* JADX INFO: renamed from: a */
    public static void m108437a(b9c b9cVar, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        b9cVar.f75531f = viewGroup.getChildAt(0);
        b9cVar.f75532g = (ConstraintLayout) viewGroup.getChildAt(1);
        b9cVar.f75533h = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        b9cVar.f75534i = (VIcon) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        b9cVar.f75535j = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        b9cVar.f75536k = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3);
        b9cVar.f75537l = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4);
    }

    /* JADX INFO: renamed from: b */
    public static View m108438b(b9c b9cVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(kec0.f125841g2, viewGroup, false);
        m108437a(b9cVar, viewInflate);
        return viewInflate;
    }
}
