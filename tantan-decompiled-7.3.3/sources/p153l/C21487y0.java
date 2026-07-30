package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p151v.VLinear;
import p151v.VText;
import p151v.navigationbar.VNavigationBar;

/* JADX INFO: renamed from: l.y0 */
/* JADX INFO: loaded from: classes10.dex */
public class C21487y0 {
    /* JADX INFO: renamed from: a */
    public static void m213824a(C21220x0 c21220x0, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        c21220x0._navigation_bar = (VNavigationBar) viewGroup.getChildAt(0);
        c21220x0._al_translate = (VLinear) viewGroup.getChildAt(1);
        c21220x0._al_translate_text = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m213825b(C21220x0 c21220x0, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(kec0.f125349C, viewGroup, false);
        m213824a(c21220x0, viewInflate);
        return viewInflate;
    }
}
