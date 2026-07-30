package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p151v.VButton;
import p151v.VImage;
import p151v.VText;
import p151v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes10.dex */
public class q2x {
    /* JADX INFO: renamed from: a */
    public static void m175097a(p2x p2xVar, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        p2xVar.f150316a = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0);
        p2xVar.f150317b = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1);
        p2xVar.f150318c = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(3)).getChildAt(1)).getChildAt(0);
        p2xVar.f150319d = (VButton) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(3)).getChildAt(2);
        p2xVar.f150320e = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(4)).getChildAt(0)).getChildAt(1)).getChildAt(0);
        p2xVar.f150321f = (VButton) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(4)).getChildAt(0)).getChildAt(2);
        p2xVar.f150322g = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(4)).getChildAt(1);
        p2xVar.f150323h = (VButton) viewGroup.getChildAt(2);
        p2xVar.f150324i = (VNavigationBar) viewGroup.getChildAt(3);
    }

    /* JADX INFO: renamed from: b */
    public static View m175098b(p2x p2xVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(kec0.f125551O6, viewGroup, false);
        m175097a(p2xVar, viewInflate);
        return viewInflate;
    }
}
