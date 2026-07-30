package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.drawee.view.SimpleDraweeView;
import com.p046p1.mobile.putong.core.p053ui.VText_Default_Bold;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class ceq0 {
    /* JADX INFO: renamed from: a */
    public static void m106345a(beq0 beq0Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        beq0Var.f75191a = (SimpleDraweeView) viewGroup.getChildAt(0);
        beq0Var.f75192b = (VText) viewGroup.getChildAt(2);
        beq0Var.f75193c = (VText_Default_Bold) viewGroup.getChildAt(4);
        beq0Var.f75194d = (VText) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m106346b(beq0 beq0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.f95631Wc, viewGroup, false);
        m106345a(beq0Var, viewInflate);
        return viewInflate;
    }
}
