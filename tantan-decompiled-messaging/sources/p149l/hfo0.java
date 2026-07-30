package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.p046p1.mobile.putong.live.base.view.MaximumScroll;
import org.apmem.tools.layouts.FlowLayout;
import p147v.VEditText;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class hfo0 {
    /* JADX INFO: renamed from: a */
    public static void m130776a(gfo0 gfo0Var, View view) {
        gfo0Var.f102408a = (LinearLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        gfo0Var.f102409b = viewGroup.getChildAt(0);
        gfo0Var.f102410c = (RelativeLayout) viewGroup.getChildAt(1);
        gfo0Var.f102411d = (ImageView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        gfo0Var.f102412e = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        gfo0Var.f102413f = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        gfo0Var.f102414g = (VEditText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2)).getChildAt(0);
        gfo0Var.f102415h = (MaximumScroll) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3);
        gfo0Var.f102416i = (FlowLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3)).getChildAt(0);
        gfo0Var.f102417j = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4);
        gfo0Var.f102418k = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(5);
    }

    /* JADX INFO: renamed from: b */
    public static View m130777b(gfo0 gfo0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(t6c0.f168333e9, viewGroup, false);
        m130776a(gfo0Var, viewInflate);
        return viewInflate;
    }
}
