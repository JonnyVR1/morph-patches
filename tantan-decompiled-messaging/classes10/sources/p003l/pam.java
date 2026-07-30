package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import l.oam;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class pam {
    /* JADX INFO: renamed from: a */
    public static void m8721a(oam oamVar, View view) {
        oamVar.a = (ConstraintLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        oamVar.b = viewGroup.getChildAt(0);
        oamVar.c = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        oamVar.d = viewGroup.getChildAt(1);
        oamVar.e = (LinearLayout) viewGroup.getChildAt(2);
        oamVar.f = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        oamVar.g = (RelativeLayout) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        oamVar.h = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1)).getChildAt(1);
        oamVar.i = (RelativeLayout) viewGroup.getChildAt(3);
        oamVar.j = ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1);
        oamVar.k = ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(0);
        oamVar.l = ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m8722b(oam oamVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(l6c0.f5807G0, viewGroup, false);
        m8721a(oamVar, viewInflate);
        return viewInflate;
    }
}
