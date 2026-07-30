package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import p151v.VButton_FakeShadow;
import p151v.VMaterialEdit;

/* JADX INFO: loaded from: classes10.dex */
public class hue0 {
    /* JADX INFO: renamed from: a */
    public static void m137169a(gue0 gue0Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        gue0Var.f106488a = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        gue0Var.f106489b = (VMaterialEdit) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(0);
        gue0Var.f106490c = (ImageView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(1);
        gue0Var.f106491d = (VButton_FakeShadow) viewGroup.getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m137170b(gue0 gue0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(qec0.f156922P5, viewGroup, false);
        m137169a(gue0Var, viewInflate);
        return viewInflate;
    }
}
