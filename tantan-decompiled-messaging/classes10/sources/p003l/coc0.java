package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.p1.mobile.putong.core.ui.roundcorners.view.RoundConstraintLayout;
import l.boc0;
import l.f6c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class coc0 {
    /* JADX INFO: renamed from: a */
    public static void m5985a(boc0 boc0Var, View view) {
        boc0Var.c = (RoundConstraintLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        boc0Var.d = viewGroup.getChildAt(0);
        boc0Var.e = viewGroup.getChildAt(1);
        boc0Var.f = (ImageView) viewGroup.getChildAt(2);
        boc0Var.g = viewGroup.getChildAt(3);
        boc0Var.h = viewGroup.getChildAt(4);
        boc0Var.i = viewGroup.getChildAt(5);
        boc0Var.j = viewGroup.getChildAt(6);
    }

    /* JADX INFO: renamed from: b */
    public static View m5986b(boc0 boc0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.G5, viewGroup, false);
        m5985a(boc0Var, viewInflate);
        return viewInflate;
    }
}
