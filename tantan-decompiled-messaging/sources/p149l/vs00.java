package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VText;

/* JADX INFO: loaded from: classes12.dex */
public class vs00 {
    /* JADX INFO: renamed from: a */
    public static void m199805a(ts00 ts00Var, View view) {
        ts00Var.f171889d = (FrameLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        ts00Var.f171890e = (VImage) viewGroup.getChildAt(0);
        ts00Var.f171891f = (VText) viewGroup.getChildAt(1);
        ts00Var.f171892g = (LinearLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(0);
        ts00Var.f171893h = (VDraweeView) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(0);
        ts00Var.f171894i = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(1);
        ts00Var.f171895j = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(0)).getChildAt(1);
        ts00Var.f171896k = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m199806b(ts00 ts00Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(o6c0.f141999A4, viewGroup, false);
        m199805a(ts00Var, viewInflate);
        return viewInflate;
    }
}
