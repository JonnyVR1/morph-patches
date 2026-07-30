package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p151v.VFrame;
import p151v.VImage;
import p151v.VLinear;
import p151v.VRelative;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class twf0 {
    /* JADX INFO: renamed from: a */
    public static void m193345a(swf0 swf0Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        swf0Var.f170942a = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        swf0Var.f170943b = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        swf0Var.f170944c = (VLinear) viewGroup.getChildAt(1);
        swf0Var.f170945d = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        swf0Var.f170946e = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        swf0Var.f170947f = (VRelative) viewGroup.getChildAt(2);
        swf0Var.f170948g = (VText) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        swf0Var.f170949h = (VText) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        swf0Var.f170950i = (VFrame) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2);
        swf0Var.f170951j = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2)).getChildAt(1);
        swf0Var.f170952k = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2)).getChildAt(2);
        swf0Var.f170953l = (VText) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(3);
        swf0Var.f170954m = (VImage) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(4);
    }

    /* JADX INFO: renamed from: b */
    public static View m193346b(swf0 swf0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(kec0.f125444Hb, viewGroup, false);
        m193345a(swf0Var, viewInflate);
        return viewInflate;
    }
}
