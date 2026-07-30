package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import p151v.VFrame;
import p151v.VImage;
import p151v.VLinear;
import p151v.VRecyclerView;

/* JADX INFO: loaded from: classes4.dex */
public class u8k {
    /* JADX INFO: renamed from: a */
    public static void m195063a(t8k t8kVar, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        t8kVar.f172540k = viewGroup.getChildAt(0);
        t8kVar.f172541l = (LinearLayout) viewGroup.getChildAt(1);
        t8kVar.f172542m = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1);
        t8kVar.f172543n = (VFrame) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        t8kVar.f172544o = (VRecyclerView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2)).getChildAt(0);
        t8kVar.f172545p = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2)).getChildAt(1);
        t8kVar.f172546q = (VLinear) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3);
        t8kVar.f172547r = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3)).getChildAt(0);
        t8kVar.f172548s = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m195064b(t8k t8kVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(yec0.f198964W8, viewGroup, false);
        m195063a(t8kVar, viewInflate);
        return viewInflate;
    }
}
