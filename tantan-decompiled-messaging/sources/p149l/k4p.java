package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import p147v.VDraweeView;
import p147v.VIcon;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class k4p {
    /* JADX INFO: renamed from: a */
    public static void m144499a(j4p j4pVar, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        j4pVar.f116214f = viewGroup.getChildAt(0);
        j4pVar.f116215g = (ConstraintLayout) viewGroup.getChildAt(1);
        j4pVar.f116216h = (VIcon) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        j4pVar.f116217i = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        j4pVar.f116218j = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        j4pVar.f116219k = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3);
        j4pVar.f116220l = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4);
        j4pVar.f116221m = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(5);
        j4pVar.f116222n = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(6);
    }

    /* JADX INFO: renamed from: b */
    public static View m144500b(j4p j4pVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.f95495O4, viewGroup, false);
        m144499a(j4pVar, viewInflate);
        return viewInflate;
    }
}
