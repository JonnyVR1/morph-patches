package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import p151v.VFrame;
import p151v.VImage;
import p151v.VLinear;
import p151v.VPullUpRecyclerView;
import p151v.VText;
import p151v.VText_NoTopPadding;

/* JADX INFO: loaded from: classes10.dex */
public class hrn {
    /* JADX INFO: renamed from: a */
    public static void m136904a(grn grnVar, View view) {
        grnVar.f106083a = (VLinear) view;
        ViewGroup viewGroup = (ViewGroup) view;
        grnVar.f106084b = (FrameLayout) viewGroup.getChildAt(0);
        grnVar.f106085c = (VFrame) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        grnVar.f106086d = (LinearLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0);
        grnVar.f106087e = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(0);
        grnVar.f106088f = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(1);
        grnVar.f106089g = (VPullUpRecyclerView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        grnVar.f106090h = (VText_NoTopPadding) viewGroup.getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m136905b(grn grnVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(pec0.f152017n, viewGroup, false);
        m136904a(grnVar, viewInflate);
        return viewInflate;
    }
}
