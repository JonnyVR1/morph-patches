package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import l.rc40;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class sc40 {
    /* JADX INFO: renamed from: a */
    public static void m9307a(rc40 rc40Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        rc40Var.a = (HorizontalScrollView) viewGroup.getChildAt(0);
        rc40Var.b = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        rc40Var.c = (FrameLayout) viewGroup.getChildAt(1);
    }
}
