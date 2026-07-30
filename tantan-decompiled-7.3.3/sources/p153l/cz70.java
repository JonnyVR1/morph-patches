package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class cz70 {
    /* JADX INFO: renamed from: a */
    public static void m113269a(bz70 bz70Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        bz70Var.f79098i = viewGroup.getChildAt(0);
        bz70Var.f79099j = (VDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0);
        bz70Var.f79100k = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0);
        bz70Var.f79101l = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(1);
        bz70Var.f79102m = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(2);
        bz70Var.f79103n = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        bz70Var.f79104o = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3);
        bz70Var.f79105p = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4)).getChildAt(0);
        bz70Var.f79106q = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4)).getChildAt(1);
        bz70Var.f79107r = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(5)).getChildAt(0);
        bz70Var.f79108s = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(5)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m113270b(bz70 bz70Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(yec0.f198960W4, viewGroup, false);
        m113269a(bz70Var, viewInflate);
        return viewInflate;
    }
}
