package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p151v.VButton_FakeShadow;
import p151v.VMaterialEdit;

/* JADX INFO: loaded from: classes9.dex */
public class ci60 {
    /* JADX INFO: renamed from: a */
    public static void m109852a(bi60 bi60Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        bi60Var.f76840a = (VMaterialEdit) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(0);
        bi60Var.f76841b = (VButton_FakeShadow) viewGroup.getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m109853b(bi60 bi60Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(hec0.f109085M, viewGroup, false);
        m109852a(bi60Var, viewInflate);
        return viewInflate;
    }
}
