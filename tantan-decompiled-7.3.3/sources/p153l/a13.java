package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import cn.qqtheme.framework.wheelview.WheelView;

/* JADX INFO: loaded from: classes10.dex */
public class a13 {
    /* JADX INFO: renamed from: a */
    public static void m95439a(z03 z03Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        z03Var.f202275a = (LinearLayout) viewGroup.getChildAt(0);
        z03Var.f202276b = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        z03Var.f202277c = (WheelView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3)).getChildAt(0);
        z03Var.f202278d = (WheelView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3)).getChildAt(2);
        z03Var.f202279e = (WheelView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3)).getChildAt(4);
        z03Var.f202280f = (TextView) viewGroup.getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m95440b(z03 z03Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(kec0.f125787d, viewGroup, false);
        m95439a(z03Var, viewInflate);
        return viewInflate;
    }
}
