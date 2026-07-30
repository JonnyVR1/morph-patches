package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import p151v.VButton_FakeShadow;
import p151v.VImage;
import p151v.VLinear;
import p151v.VProgressBar;
import p151v.VRecyclerView;
import p151v.VText;
import p151v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes10.dex */
public class f2g {
    /* JADX INFO: renamed from: a */
    public static void m123612a(z1g z1gVar, View view) {
        z1gVar.f202529c = (VLinear) view;
        ViewGroup viewGroup = (ViewGroup) view;
        z1gVar.f202530d = (VNavigationBar) viewGroup.getChildAt(0);
        z1gVar.f202531e = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        z1gVar.f202532f = (LinearLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0);
        z1gVar.f202533g = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(0);
        z1gVar.f202534h = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(1);
        z1gVar.f202535i = (VProgressBar) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1);
        z1gVar.f202536j = (VRecyclerView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        z1gVar.f202537k = (VButton_FakeShadow) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        z1gVar.f202538l = (VButton_FakeShadow) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3);
        z1gVar.f202539m = (ConstraintLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4);
        z1gVar.f202540n = (Guideline) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4)).getChildAt(0);
        z1gVar.f202541o = (Guideline) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4)).getChildAt(1);
        z1gVar.f202542p = (Guideline) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4)).getChildAt(2);
        z1gVar.f202543q = (ImageView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4)).getChildAt(3);
        z1gVar.f202544r = (ImageView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4)).getChildAt(4);
    }

    /* JADX INFO: renamed from: b */
    public static View m123613b(z1g z1gVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(pec0.f151993h, viewGroup, false);
        m123612a(z1gVar, viewInflate);
        return viewInflate;
    }
}
