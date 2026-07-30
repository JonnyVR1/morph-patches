package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import p151v.VImage;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class t1b0 {
    /* JADX INFO: renamed from: a */
    public static void m188895a(s1b0 s1b0Var, View view) {
        s1b0Var.f165765v = (RelativeLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        s1b0Var.f165766w = (VImage) viewGroup.getChildAt(0);
        s1b0Var.f165767x = (VImage) viewGroup.getChildAt(1);
        s1b0Var.f165768y = (VText) viewGroup.getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m188896b(s1b0 s1b0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(kec0.f126086ua, viewGroup, false);
        m188895a(s1b0Var, viewInflate);
        return viewInflate;
    }
}
