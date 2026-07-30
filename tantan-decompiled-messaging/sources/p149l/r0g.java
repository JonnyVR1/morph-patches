package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import p147v.VButton_FakeShadow;
import p147v.VImage;
import p147v.VLinear;
import p147v.VProgressBar;
import p147v.VRecyclerView;
import p147v.VText;
import p147v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes10.dex */
public class r0g {
    /* JADX INFO: renamed from: a */
    public static void m177397a(l0g l0gVar, View view) {
        l0gVar.f125513c = (VLinear) view;
        ViewGroup viewGroup = (ViewGroup) view;
        l0gVar.f125514d = (VNavigationBar) viewGroup.getChildAt(0);
        l0gVar.f125515e = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        l0gVar.f125516f = (LinearLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0);
        l0gVar.f125517g = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(0);
        l0gVar.f125518h = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(1);
        l0gVar.f125519i = (VProgressBar) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1);
        l0gVar.f125520j = (VRecyclerView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        l0gVar.f125521k = (VButton_FakeShadow) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        l0gVar.f125522l = (VButton_FakeShadow) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3);
        l0gVar.f125523m = (ConstraintLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4);
        l0gVar.f125524n = (Guideline) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4)).getChildAt(0);
        l0gVar.f125525o = (Guideline) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4)).getChildAt(1);
        l0gVar.f125526p = (Guideline) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4)).getChildAt(2);
        l0gVar.f125527q = (ImageView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4)).getChildAt(3);
        l0gVar.f125528r = (ImageView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4)).getChildAt(4);
    }

    /* JADX INFO: renamed from: b */
    public static View m177398b(l0g l0gVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(k6c0.f121385h, viewGroup, false);
        m177397a(l0gVar, viewInflate);
        return viewInflate;
    }
}
