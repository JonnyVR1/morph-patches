package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import p151v.VFrame_FlipContainer;
import p151v.VFrame_Shadow;
import p151v.VImage;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class np90 {
    /* JADX INFO: renamed from: a */
    public static void m164216a(mp90 mp90Var, View view) {
        mp90Var.f137887a = (RelativeLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        mp90Var.f137888b = (VFrame_Shadow) viewGroup.getChildAt(0);
        mp90Var.f137889c = (RelativeLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        mp90Var.f137890d = (VText) viewGroup.getChildAt(1);
        mp90Var.f137891e = (VFrame_Shadow) viewGroup.getChildAt(2);
        mp90Var.f137892f = (VFrame_FlipContainer) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        mp90Var.f137893g = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(0);
        mp90Var.f137894h = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(1);
        mp90Var.f137895i = (VFrame_Shadow) viewGroup.getChildAt(3);
        mp90Var.f137896j = (RelativeLayout) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
    }
}
