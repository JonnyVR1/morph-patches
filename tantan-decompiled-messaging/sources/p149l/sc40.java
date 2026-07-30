package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;

/* JADX INFO: loaded from: classes10.dex */
public class sc40 {
    /* JADX INFO: renamed from: a */
    public static void m183373a(rc40 rc40Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        rc40Var.f158715a = (HorizontalScrollView) viewGroup.getChildAt(0);
        rc40Var.f158716b = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        rc40Var.f158717c = (FrameLayout) viewGroup.getChildAt(1);
    }
}
