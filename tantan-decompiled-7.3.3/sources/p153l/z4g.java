package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import p151v.VLinear;
import p151v.VText;
import p151v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes10.dex */
public class z4g {
    /* JADX INFO: renamed from: a */
    public static void m218588a(y4g y4gVar, View view) {
        y4gVar.f197453a = (RelativeLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        y4gVar.f197454b = (VNavigationBar) viewGroup.getChildAt(0);
        y4gVar.f197455c = (VText) viewGroup.getChildAt(1);
        y4gVar.f197456d = (VLinear) viewGroup.getChildAt(2);
        y4gVar.f197457e = (VText) viewGroup.getChildAt(3);
        y4gVar.f197458f = (VText) viewGroup.getChildAt(4);
    }

    /* JADX INFO: renamed from: b */
    public static View m218589b(y4g y4gVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(kec0.f125892j3, viewGroup, false);
        m218588a(y4gVar, viewInflate);
        return viewInflate;
    }
}
