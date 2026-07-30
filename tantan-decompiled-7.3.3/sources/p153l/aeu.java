package p153l;

import android.view.View;
import android.view.ViewGroup;
import androidx.cardview.widget.CardView;
import p151v.VDraweeView;
import p151v.VFrame;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class aeu {
    /* JADX INFO: renamed from: a */
    public static void m97262a(xdu xduVar, View view) {
        xduVar.f193638k = (VFrame) view;
        ViewGroup viewGroup = (ViewGroup) view;
        xduVar.f193639l = (CardView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        xduVar.f193640m = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(0);
        xduVar.f193641n = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(1);
        xduVar.f193642o = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(2);
        xduVar.f193643p = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(3);
        xduVar.f193644q = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
    }
}
