package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import p151v.VDraweeView;
import p151v.VFrame;
import p151v.VLinear;
import p151v.VRelative;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class exi {
    /* JADX INFO: renamed from: a */
    public static void m123054a(uwi uwiVar, View view) {
        uwiVar.f181281a = (VLinear) view;
        ViewGroup viewGroup = (ViewGroup) view;
        uwiVar.f181282b = viewGroup.getChildAt(0);
        uwiVar.f181283c = (RelativeLayout) viewGroup.getChildAt(1);
        uwiVar.f181284d = (VFrame) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        uwiVar.f181285e = (VDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0);
        uwiVar.f181286f = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        uwiVar.f181287g = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0);
        uwiVar.f181288h = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(1);
        uwiVar.f181289i = (ImageView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(2);
        uwiVar.f181290j = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        uwiVar.f181291k = (VRelative) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3);
        uwiVar.f181292l = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3)).getChildAt(0);
        uwiVar.f181293m = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3)).getChildAt(1);
        uwiVar.f181294n = (RelativeLayout) viewGroup.getChildAt(2);
        uwiVar.f181295o = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        uwiVar.f181296p = (VText) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        uwiVar.f181297q = (VText) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2);
        uwiVar.f181298r = (VText) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(3);
    }

    /* JADX INFO: renamed from: b */
    public static View m123055b(uwi uwiVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(yec0.f199057e1, viewGroup, false);
        m123054a(uwiVar, viewInflate);
        return viewInflate;
    }
}
