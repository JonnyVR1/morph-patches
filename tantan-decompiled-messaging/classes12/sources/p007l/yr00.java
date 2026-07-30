package p007l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class yr00 {
    /* JADX INFO: renamed from: a */
    public static void m17192a(xr00 xr00Var, View view) {
        xr00Var.f15074a = (FrameLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        xr00Var.f15075b = viewGroup.getChildAt(0);
        xr00Var.f15076c = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        xr00Var.f15077d = (FrameLayout) viewGroup.getChildAt(1);
        xr00Var.f15078e = (LinearLayout) viewGroup.getChildAt(2);
        xr00Var.f15079f = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        xr00Var.f15080g = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        xr00Var.f15081h = (ImageView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1)).getChildAt(0)).getChildAt(0);
        xr00Var.f15082i = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2)).getChildAt(0);
        xr00Var.f15083j = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2)).getChildAt(0)).getChildAt(0);
    }

    /* JADX INFO: renamed from: b */
    public static View m17193b(xr00 xr00Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(o6c0.f11032C4, viewGroup, false);
        m17192a(xr00Var, viewInflate);
        return viewInflate;
    }
}
