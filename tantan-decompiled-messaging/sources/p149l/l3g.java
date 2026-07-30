package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import p147v.VLinear;
import p147v.VText;
import p147v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes10.dex */
public class l3g {
    /* JADX INFO: renamed from: a */
    public static void m148394a(k3g k3gVar, View view) {
        k3gVar.f120821a = (RelativeLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        k3gVar.f120822b = (VNavigationBar) viewGroup.getChildAt(0);
        k3gVar.f120823c = (VText) viewGroup.getChildAt(1);
        k3gVar.f120824d = (VLinear) viewGroup.getChildAt(2);
        k3gVar.f120825e = (VText) viewGroup.getChildAt(3);
        k3gVar.f120826f = (VText) viewGroup.getChildAt(4);
    }

    /* JADX INFO: renamed from: b */
    public static View m148395b(k3g k3gVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.f95838j3, viewGroup, false);
        m148394a(k3gVar, viewInflate);
        return viewInflate;
    }
}
