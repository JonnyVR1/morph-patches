package p149l;

import android.view.View;
import android.view.ViewGroup;
import p147v.VDraweeView;
import p147v.VFrame;
import p147v.VLinear;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class ght {
    /* JADX INFO: renamed from: a */
    public static void m126222a(fht fhtVar, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        fhtVar.f97565a = (VDraweeView) viewGroup.getChildAt(0);
        fhtVar.f97566b = (VLinear) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        fhtVar.f97567c = (VDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0);
        fhtVar.f97568d = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1);
        fhtVar.f97569e = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(2);
        fhtVar.f97570f = (VFrame) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        fhtVar.f97571g = (VDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2)).getChildAt(0);
        fhtVar.f97572h = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2)).getChildAt(1)).getChildAt(0);
        fhtVar.f97573i = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2)).getChildAt(1)).getChildAt(1);
        fhtVar.f97574j = (VFrame) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3);
        fhtVar.f97575k = (VDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3)).getChildAt(0);
        fhtVar.f97576l = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3)).getChildAt(1)).getChildAt(0);
        fhtVar.f97577m = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3)).getChildAt(1)).getChildAt(1);
    }
}
