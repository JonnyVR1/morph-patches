package p153l;

import android.view.View;
import android.view.ViewGroup;
import p151v.VImage;
import p151v.VLinear;
import p151v.VRecyclerView;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class y2p0 {
    /* JADX INFO: renamed from: a */
    public static void m214091a(x2p0 x2p0Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        x2p0Var.f192166k = viewGroup.getChildAt(0);
        x2p0Var.f192167l = (VImage) viewGroup.getChildAt(2);
        x2p0Var.f192168m = (VLinear) viewGroup.getChildAt(3);
        x2p0Var.f192169n = (VText) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1);
        x2p0Var.f192170o = (VText) viewGroup.getChildAt(4);
        x2p0Var.f192171p = (VRecyclerView) viewGroup.getChildAt(5);
        x2p0Var.f192172q = (VText) viewGroup.getChildAt(6);
    }
}
