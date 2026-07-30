package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import p147v.VButton;
import p147v.VFrame;
import p147v.VImage;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class pam {
    /* JADX INFO: renamed from: a */
    public static void m168095a(oam oamVar, View view) {
        oamVar.f142815a = (ConstraintLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        oamVar.f142816b = (VFrame) viewGroup.getChildAt(0);
        oamVar.f142817c = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        oamVar.f142818d = (VText) viewGroup.getChildAt(1);
        oamVar.f142819e = (LinearLayout) viewGroup.getChildAt(2);
        oamVar.f142820f = (RecyclerView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        oamVar.f142821g = (RelativeLayout) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        oamVar.f142822h = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1)).getChildAt(1);
        oamVar.f142823i = (RelativeLayout) viewGroup.getChildAt(3);
        oamVar.f142824j = (VText) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1);
        oamVar.f142825k = (RecyclerView) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(0);
        oamVar.f142826l = (VButton) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m168096b(oam oamVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(l6c0.f126298G0, viewGroup, false);
        m168095a(oamVar, viewInflate);
        return viewInflate;
    }
}
