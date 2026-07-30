package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import p151v.VIcon;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class qd5 {
    /* JADX INFO: renamed from: a */
    public static void m176154a(pd5 pd5Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        pd5Var.f151706a = (VText) viewGroup.getChildAt(1);
        pd5Var.f151707b = (VText) viewGroup.getChildAt(2);
        pd5Var.f151708c = (LinearLayout) viewGroup.getChildAt(3);
        pd5Var.f151709d = (VIcon) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
        pd5Var.f151710e = (VText) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1);
    }
}
