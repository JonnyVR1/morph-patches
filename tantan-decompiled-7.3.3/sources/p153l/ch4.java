package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import p151v.VEditText;
import p151v.VText;

/* JADX INFO: loaded from: classes13.dex */
public class ch4 {
    /* JADX INFO: renamed from: a */
    public static void m109766a(bh4 bh4Var, View view) {
        bh4Var.f76713a = (LinearLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        bh4Var.f76714b = (VEditText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        bh4Var.f76715c = (VText) viewGroup.getChildAt(1);
        bh4Var.f76716d = (LinearLayout) viewGroup.getChildAt(2);
        bh4Var.f76717e = (RecyclerView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        bh4Var.f76718f = (VText) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        bh4Var.f76719g = (VText) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(3);
    }

    /* JADX INFO: renamed from: b */
    public static View m109767b(bh4 bh4Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(tec0.f173689j4, viewGroup, false);
        m109766a(bh4Var, viewInflate);
        return viewInflate;
    }
}
