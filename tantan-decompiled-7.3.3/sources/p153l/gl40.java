package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;

/* JADX INFO: loaded from: classes10.dex */
public class gl40 {
    /* JADX INFO: renamed from: a */
    public static void m130616a(fl40 fl40Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        fl40Var.f99590a = (HorizontalScrollView) viewGroup.getChildAt(0);
        fl40Var.f99591b = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        fl40Var.f99592c = (FrameLayout) viewGroup.getChildAt(1);
    }
}
