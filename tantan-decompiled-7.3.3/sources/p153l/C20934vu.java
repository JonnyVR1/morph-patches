package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import p151v.VButton;
import p151v.VCheckBox;
import p151v.VLinear;
import p151v.VRecyclerView;
import p151v.VRelative;
import p151v.VText;
import p151v.navigationbar.VNavigationBar;

/* JADX INFO: renamed from: l.vu */
/* JADX INFO: loaded from: classes10.dex */
public class C20934vu {
    /* JADX INFO: renamed from: a */
    public static void m202768a(C20674uu c20674uu, View view) {
        c20674uu.f181011a = (VRelative) view;
        ViewGroup viewGroup = (ViewGroup) view;
        c20674uu.f181012b = (VNavigationBar) viewGroup.getChildAt(0);
        c20674uu.f181013c = (VText) viewGroup.getChildAt(1);
        c20674uu.f181014d = (VRecyclerView) viewGroup.getChildAt(2);
        c20674uu.f181015e = (VLinear) viewGroup.getChildAt(3);
        c20674uu.f181016f = (VLinear) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
        c20674uu.f181017g = (VCheckBox) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0)).getChildAt(0);
        c20674uu.f181018h = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0)).getChildAt(1);
        c20674uu.f181019i = (VButton) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1);
        c20674uu.f181020j = (VText) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m202769b(C20674uu c20674uu, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(sec0.f167574k, viewGroup, false);
        m202768a(c20674uu, viewInflate);
        return viewInflate;
    }
}
