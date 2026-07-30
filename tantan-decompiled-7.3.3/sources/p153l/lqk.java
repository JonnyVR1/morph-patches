package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import p151v.VImage;
import p151v.VRecyclerView;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class lqk {
    /* JADX INFO: renamed from: a */
    public static void m155495a(kqk kqkVar, View view) {
        kqkVar.f128231a = (FrameLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        kqkVar.f128232b = (FrameLayout) viewGroup.getChildAt(0);
        kqkVar.f128233c = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        kqkVar.f128234d = (EditText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        kqkVar.f128235e = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1);
        kqkVar.f128236f = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        kqkVar.f128237g = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0);
        kqkVar.f128238h = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(1);
        kqkVar.f128239i = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(2);
        kqkVar.f128240j = (VRecyclerView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        kqkVar.f128241k = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        kqkVar.f128242l = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3)).getChildAt(0);
        kqkVar.f128243m = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m155496b(kqk kqkVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(qec0.f157002c0, viewGroup, false);
        m155495a(kqkVar, viewInflate);
        return viewInflate;
    }
}
