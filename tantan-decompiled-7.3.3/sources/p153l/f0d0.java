package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import p151v.VButton;
import p151v.VImage;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class f0d0 {
    /* JADX INFO: renamed from: a */
    public static void m123479a(e0d0 e0d0Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        e0d0Var.f91432a = (VImage) viewGroup.getChildAt(0);
        e0d0Var.f91433b = (VImage) viewGroup.getChildAt(1);
        e0d0Var.f91434c = (LinearLayout) viewGroup.getChildAt(2);
        e0d0Var.f91435d = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        e0d0Var.f91436e = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(0);
        e0d0Var.f91437f = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(1);
        e0d0Var.f91438g = (VText) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        e0d0Var.f91439h = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2);
        e0d0Var.f91440i = (TextView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(3);
        e0d0Var.f91441j = (VText) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(4);
        e0d0Var.f91442k = (VText) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
        e0d0Var.f91443l = (RelativeLayout) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(2);
        e0d0Var.f91444m = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(2)).getChildAt(0);
        e0d0Var.f91445n = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(2)).getChildAt(1);
        e0d0Var.f91446o = (ImageView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(2)).getChildAt(2);
        e0d0Var.f91447p = (VButton) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(3);
    }

    /* JADX INFO: renamed from: b */
    public static View m123480b(e0d0 e0d0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(rec0.f162515Y1, viewGroup, false);
        m123479a(e0d0Var, viewInflate);
        return viewInflate;
    }
}
