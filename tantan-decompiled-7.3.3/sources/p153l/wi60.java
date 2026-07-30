package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p151v.VButton_FakeShadow;
import p151v.VMaterialEdit;
import p151v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes10.dex */
public class wi60 {
    /* JADX INFO: renamed from: a */
    public static void m206554a(vi60 vi60Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        vi60Var.f184217a = (VNavigationBar) viewGroup.getChildAt(0);
        vi60Var.f184218b = (VMaterialEdit) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(0);
        vi60Var.f184219c = (VButton_FakeShadow) viewGroup.getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m206555b(vi60 vi60Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(sec0.f167572j, viewGroup, false);
        m206554a(vi60Var, viewInflate);
        return viewInflate;
    }
}
