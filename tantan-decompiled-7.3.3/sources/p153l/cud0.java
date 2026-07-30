package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import p151v.VImage;
import p151v.VRecyclerView;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class cud0 {
    /* JADX INFO: renamed from: a */
    public static void m112666a(bud0 bud0Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        bud0Var.f78482a = (VImage) viewGroup.getChildAt(0);
        bud0Var.f78483b = (VText) viewGroup.getChildAt(1);
        bud0Var.f78484c = (VRecyclerView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        bud0Var.f78485d = (TextView) viewGroup.getChildAt(4);
        bud0Var.f78486e = (VText) viewGroup.getChildAt(5);
    }

    /* JADX INFO: renamed from: b */
    public static View m112667b(bud0 bud0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(pec0.f151916J1, viewGroup, false);
        m112666a(bud0Var, viewInflate);
        return viewInflate;
    }
}
