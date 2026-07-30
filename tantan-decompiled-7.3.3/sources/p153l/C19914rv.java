package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p151v.VButton;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VLinear;
import p151v.VRelative;
import p151v.VText;
import p151v.navigationbar.VNavigationBar;

/* JADX INFO: renamed from: l.rv */
/* JADX INFO: loaded from: classes10.dex */
public class C19914rv {
    /* JADX INFO: renamed from: a */
    public static void m183233a(C19679qv c19679qv, View view) {
        c19679qv.f159659a = (VRelative) view;
        ViewGroup viewGroup = (ViewGroup) view;
        c19679qv.f159660b = (VNavigationBar) viewGroup.getChildAt(0);
        c19679qv.f159661c = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0);
        c19679qv.f159662d = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1);
        c19679qv.f159663e = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(2);
        c19679qv.f159664f = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(3);
        c19679qv.f159665g = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(4);
        c19679qv.f159666h = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(5);
        c19679qv.f159667i = (VRelative) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(6)).getChildAt(0);
        c19679qv.f159668j = (VDraweeView) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(6)).getChildAt(0)).getChildAt(0);
        c19679qv.f159669k = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(6)).getChildAt(0)).getChildAt(2);
        c19679qv.f159670l = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(6)).getChildAt(0)).getChildAt(3);
        c19679qv.f159671m = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(6)).getChildAt(0)).getChildAt(4);
        c19679qv.f159672n = (VRelative) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(6)).getChildAt(1);
        c19679qv.f159673o = (VDraweeView) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(6)).getChildAt(1)).getChildAt(0);
        c19679qv.f159674p = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(6)).getChildAt(1)).getChildAt(2);
        c19679qv.f159675q = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(6)).getChildAt(1)).getChildAt(3);
        c19679qv.f159676r = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(6)).getChildAt(1)).getChildAt(4);
        c19679qv.f159677s = (VLinear) viewGroup.getChildAt(2);
        c19679qv.f159678t = (VButton) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        c19679qv.f159679u = (VText) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m183234b(C19679qv c19679qv, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(sec0.f167578m, viewGroup, false);
        m183233a(c19679qv, viewInflate);
        return viewInflate;
    }
}
