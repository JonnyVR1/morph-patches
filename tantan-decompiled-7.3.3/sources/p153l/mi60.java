package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p151v.VButton_FakeShadow;
import p151v.VMaterialEdit;
import p151v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes10.dex */
public class mi60 {
    /* JADX INFO: renamed from: a */
    public static void m158465a(li60 li60Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        li60Var.f132184a = (VNavigationBar) viewGroup.getChildAt(0);
        li60Var.f132185b = (VMaterialEdit) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(0);
        li60Var.f132186c = (VButton_FakeShadow) viewGroup.getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m158466b(li60 li60Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(sec0.f167570i, viewGroup, false);
        m158465a(li60Var, viewInflate);
        return viewInflate;
    }
}
